package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Stories.StoriesController;

public class MessagesStorage extends BaseController {
    public static final String[] DATABASE_TABLES;
    public static final int FORUM_TYPE_BOT = 8;
    public static final int FORUM_TYPE_CHAT = 1;
    public static final int FORUM_TYPE_CHAT_TABS = 2;
    public static final int FORUM_TYPE_DIRECT = 4;
    public static final int LAST_DB_VERSION = 168;
    public static final int SENT_FILE_TYPE_AUDIO = 1;
    public static final int SENT_FILE_TYPE_AUDIO_ENCRYPTED = 4;
    public static final int SENT_FILE_TYPE_PHOTO = 0;
    public static final int SENT_FILE_TYPE_PHOTO_ENCRYPTED = 3;
    public static final int SENT_FILE_TYPE_PHOTO_HIGH_QUALITY = 6;
    public static final int SENT_FILE_TYPE_PHOTO_HIGH_QUALITY_ENCRYPTED = 7;
    public static final int SENT_FILE_TYPE_VIDEO = 2;
    public static final int SENT_FILE_TYPE_VIDEO_ENCRYPTED = 5;
    private int archiveUnreadCount;
    private int[][] bots;
    private File cacheFile;
    private int[][] channels;
    private int[][] contacts;
    private SQLiteDatabase database;
    private boolean databaseCreated;
    private boolean databaseMigrationInProgress;
    private final ArrayList<MessagesController.DialogFilter> dialogFilters;
    private final SparseArray<MessagesController.DialogFilter> dialogFiltersMap;
    private final LongSparseIntArray dialogIsForumTyped;
    private LongSparseArray dialogsWithMentions;
    private LongSparseArray dialogsWithUnread;
    private int[][] groups;
    private int lastDateValue;
    private int lastPtsValue;
    private int lastQtsValue;
    private int lastSavedDate;
    private int lastSavedPts;
    private int lastSavedQts;
    private int lastSavedSeq;
    private int lastSecretVersion;
    private int lastSeqValue;
    private final AtomicLong lastTaskId;
    private int mainUnreadCount;
    private int[] mentionChannels;
    private int[] mentionGroups;
    private int[][] nonContacts;
    private final CountDownLatch openSync;
    private volatile int pendingArchiveUnreadCount;
    private volatile int pendingMainUnreadCount;
    private int secretG;
    private byte[] secretPBytes;
    private File shmCacheFile;
    public boolean showClearDatabaseAlert;
    private DispatchQueue storageQueue;
    private final SparseArray<ArrayList<Runnable>> tasks;
    boolean tryRecover;
    private final LongSparseArray unknownDialogsIds;
    private File walCacheFile;
    private static volatile MessagesStorage[] Instance = new MessagesStorage[4];
    private static final Object[] lockObjects = new Object[4];

    public interface BooleanCallback {
        void run(boolean z);
    }

    public interface IntCallback {
        void run(int i);
    }

    public interface LongCallback {
        void run(long j);
    }

    public interface StringCallback {
        void run(String str);
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
        DATABASE_TABLES = new String[]{"messages_holes", "media_holes_v2", "scheduled_messages_v2", "quick_replies", "messages_v2", "download_queue", "user_contacts_v7", "user_phones_v7", "dialogs", "dialog_filter", "dialog_filter_ep", "dialog_filter_pin_v2", "randoms_v2", "enc_tasks_v4", "messages_seq", "params", "media_v4", "bot_keyboard", "bot_keyboard_topics", "chat_settings_v2", "user_settings", "chat_pinned_v2", "chat_pinned_count", "chat_hints", "botcache", "users_data", "users", "chats", "enc_chats", "channel_users_v2", "channel_admins_v3", "contacts", "dialog_photos", "dialog_settings", "web_recent_v3", "stickers_v2", "stickers_featured", "stickers_dice", "stickersets", "hashtag_recent_v2", "webpage_pending_v2", "sent_files_v2", "search_recent", "media_counts_v2", "keyvalue", "bot_info_v2", "pending_tasks", "requested_holes", "sharing_locations", "shortcut_widget", "emoji_keywords_v2", "emoji_keywords_info_v2", "wallpapers2", "unread_push_messages", "polls_v2", "reactions", "reaction_mentions", "downloading_documents", "animated_emoji", "attach_menu_bots", "premium_promo", "emoji_statuses", "messages_holes_topics", "messages_topics", "saved_dialogs", "media_topics", "media_holes_topics", "topics", "media_counts_topics", "reaction_mentions_topics", "emoji_groups"};
    }

    public static MessagesStorage getInstance(int i) {
        MessagesStorage messagesStorage = Instance[i];
        if (messagesStorage == null) {
            synchronized (lockObjects[i]) {
                try {
                    messagesStorage = Instance[i];
                    if (messagesStorage == null) {
                        MessagesStorage[] messagesStorageArr = Instance;
                        MessagesStorage messagesStorage2 = new MessagesStorage(i);
                        messagesStorageArr[i] = messagesStorage2;
                        messagesStorage = messagesStorage2;
                    }
                } finally {
                }
            }
        }
        return messagesStorage;
    }

    private void ensureOpened() {
        try {
            this.openSync.await();
        } catch (Throwable unused) {
        }
    }

    public int getLastDateValue() {
        ensureOpened();
        return this.lastDateValue;
    }

    public void setLastDateValue(int i) {
        ensureOpened();
        this.lastDateValue = i;
    }

    public int getLastPtsValue() {
        ensureOpened();
        return this.lastPtsValue;
    }

    public int getMainUnreadCount() {
        return this.mainUnreadCount;
    }

    public int getArchiveUnreadCount() {
        return this.archiveUnreadCount;
    }

    public void setLastPtsValue(int i) {
        ensureOpened();
        this.lastPtsValue = i;
    }

    public int getLastQtsValue() {
        ensureOpened();
        return this.lastQtsValue;
    }

    public void setLastQtsValue(int i) {
        ensureOpened();
        this.lastQtsValue = i;
    }

    public int getLastSeqValue() {
        ensureOpened();
        return this.lastSeqValue;
    }

    public void setLastSeqValue(int i) {
        ensureOpened();
        this.lastSeqValue = i;
    }

    public int getLastSecretVersion() {
        ensureOpened();
        return this.lastSecretVersion;
    }

    public void setLastSecretVersion(int i) {
        ensureOpened();
        this.lastSecretVersion = i;
    }

    public byte[] getSecretPBytes() {
        ensureOpened();
        return this.secretPBytes;
    }

    public void setSecretPBytes(byte[] bArr) {
        ensureOpened();
        this.secretPBytes = bArr;
    }

    public int getSecretG() {
        ensureOpened();
        return this.secretG;
    }

    public void setSecretG(int i) {
        ensureOpened();
        this.secretG = i;
    }

    public MessagesStorage(int i) {
        super(i);
        this.lastTaskId = new AtomicLong(System.currentTimeMillis());
        this.tasks = new SparseArray<>();
        this.lastDateValue = 0;
        this.lastPtsValue = 0;
        this.lastQtsValue = 0;
        this.lastSeqValue = 0;
        this.lastSecretVersion = 0;
        this.secretPBytes = null;
        this.secretG = 0;
        this.lastSavedSeq = 0;
        this.lastSavedPts = 0;
        this.lastSavedDate = 0;
        this.lastSavedQts = 0;
        this.dialogFilters = new ArrayList<>();
        this.dialogFiltersMap = new SparseArray<>();
        this.unknownDialogsIds = new LongSparseArray();
        this.openSync = new CountDownLatch(1);
        this.dialogIsForumTyped = new LongSparseIntArray();
        this.contacts = new int[][]{new int[2], new int[2]};
        this.nonContacts = new int[][]{new int[2], new int[2]};
        this.bots = new int[][]{new int[2], new int[2]};
        this.channels = new int[][]{new int[2], new int[2]};
        this.groups = new int[][]{new int[2], new int[2]};
        this.mentionChannels = new int[2];
        this.mentionGroups = new int[2];
        this.dialogsWithMentions = new LongSparseArray();
        this.dialogsWithUnread = new LongSparseArray();
        DispatchQueue dispatchQueue = new DispatchQueue("storageQueue_" + i);
        this.storageQueue = dispatchQueue;
        dispatchQueue.setPriority(8);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$new$0();
            }
        });
    }

    public void lambda$new$0() throws InterruptedException {
        openDatabase(1);
    }

    public SQLiteDatabase getDatabase() {
        return this.database;
    }

    public DispatchQueue getStorageQueue() {
        return this.storageQueue;
    }

    public void bindTaskToGuid(Runnable runnable, int i) {
        ArrayList<Runnable> arrayList = this.tasks.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.tasks.put(i, arrayList);
        }
        arrayList.add(runnable);
    }

    public void cancelTasksForGuid(int i) {
        ArrayList<Runnable> arrayList = this.tasks.get(i);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.storageQueue.cancelRunnable(arrayList.get(i2));
        }
        this.tasks.remove(i);
    }

    public void completeTaskForGuid(Runnable runnable, int i) {
        ArrayList<Runnable> arrayList = this.tasks.get(i);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(runnable);
        if (arrayList.isEmpty()) {
            this.tasks.remove(i);
        }
    }

    public long getDatabaseSize() {
        File file = this.cacheFile;
        long length = file != null ? file.length() : 0L;
        File file2 = this.shmCacheFile;
        return file2 != null ? length + file2.length() : length;
    }

    public void openDatabase(int i) throws InterruptedException {
        if (!NativeLoader.loaded()) {
            int i2 = 0;
            while (!NativeLoader.loaded()) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i2++;
                if (i2 > 5) {
                    break;
                }
            }
        }
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, "account" + this.currentAccount + "/");
            file.mkdirs();
            filesDirFixed = file;
        }
        this.cacheFile = new File(filesDirFixed, "cache4.db");
        this.walCacheFile = new File(filesDirFixed, "cache4.db-wal");
        this.shmCacheFile = new File(filesDirFixed, "cache4.db-shm");
        this.databaseCreated = false;
        boolean zExists = this.cacheFile.exists();
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
            this.database = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            this.database.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
            this.database.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            if (!zExists) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("create new database");
                }
                createTables(this.database);
            } else {
                int iIntValue = this.database.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current db version = " + iIntValue);
                }
                if (iIntValue == 0) {
                    throw new Exception("malformed");
                }
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT seq, pts, date, qts, lsv, sg, pbytes FROM params WHERE id = 1", new Object[0]);
                    if (sQLiteCursorQueryFinalized.next()) {
                        this.lastSeqValue = sQLiteCursorQueryFinalized.intValue(0);
                        this.lastPtsValue = sQLiteCursorQueryFinalized.intValue(1);
                        this.lastDateValue = sQLiteCursorQueryFinalized.intValue(2);
                        this.lastQtsValue = sQLiteCursorQueryFinalized.intValue(3);
                        this.lastSecretVersion = sQLiteCursorQueryFinalized.intValue(4);
                        this.secretG = sQLiteCursorQueryFinalized.intValue(5);
                        if (sQLiteCursorQueryFinalized.isNull(6)) {
                            this.secretPBytes = null;
                        } else {
                            byte[] bArrByteArrayValue = sQLiteCursorQueryFinalized.byteArrayValue(6);
                            this.secretPBytes = bArrByteArrayValue;
                            if (bArrByteArrayValue != null && bArrByteArrayValue.length == 1) {
                                this.secretPBytes = null;
                            }
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                } catch (Exception e2) {
                    FileLog.e(e2);
                    if (e2.getMessage() != null && e2.getMessage().contains("malformed")) {
                        throw new RuntimeException("malformed");
                    }
                    try {
                        this.database.executeFast("CREATE TABLE IF NOT EXISTS params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
                        this.database.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                }
                if (iIntValue < 168) {
                    try {
                        updateDbToLastVersion(iIntValue);
                    } catch (Exception e4) {
                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                            throw e4;
                        }
                        FileLog.e(e4);
                        throw new RuntimeException("malformed");
                    }
                }
            }
            this.databaseCreated = true;
        } catch (Exception e5) {
            FileLog.e(e5);
            if (i < 3 && e5.getMessage() != null && e5.getMessage().contains("malformed")) {
                if (i == 2) {
                    cleanupInternal(true);
                    clearLoadingDialogsOffsets();
                } else {
                    cleanupInternal(false);
                }
                openDatabase(i == 1 ? 2 : 3);
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openDatabase$1();
            }
        });
        loadDialogFilters();
        loadUnreadMessages();
        loadPendingTasks();
        try {
            this.openSync.countDown();
        } catch (Throwable unused) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openDatabase$2();
            }
        });
    }

    public void lambda$openDatabase$1() {
        if (this.databaseMigrationInProgress) {
            this.databaseMigrationInProgress = false;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseMigration, Boolean.FALSE);
        }
    }

    public void lambda$openDatabase$2() {
        this.showClearDatabaseAlert = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseOpened, new Object[0]);
    }

    private void clearLoadingDialogsOffsets() {
        for (int i = 0; i < 2; i++) {
            getUserConfig().setDialogsLoadOffset(i, 0, 0, 0L, 0L, 0L, 0L);
            getUserConfig().setTotalDialogsCount(i, 0);
        }
        getUserConfig().saveConfig(false);
    }

    private boolean recoverDatabase() throws InterruptedException {
        this.database.close();
        boolean zRecoverDatabase = DatabaseMigrationHelper.recoverDatabase(this.cacheFile, this.walCacheFile, this.shmCacheFile, this.currentAccount);
        FileLog.e("Database restored = " + zRecoverDatabase);
        if (zRecoverDatabase) {
            try {
                SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
                this.database = sQLiteDatabase;
                sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
                this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
                this.database.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
                this.database.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            } catch (SQLiteException e) {
                FileLog.e(new Exception(e));
                zRecoverDatabase = false;
            }
        }
        if (!zRecoverDatabase) {
            cleanupInternal(true);
            openDatabase(1);
            zRecoverDatabase = this.databaseCreated;
            FileLog.e("Try create new database = " + zRecoverDatabase);
        }
        if (zRecoverDatabase) {
            reset();
        }
        return zRecoverDatabase;
    }

    public static void createTables(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.executeFast("CREATE TABLE messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes(uid, end);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, uid))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, group_id INTEGER, reply_to_story_id INTEGER, PRIMARY KEY(mid, uid))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE dialogs(did INTEGER PRIMARY KEY, date INTEGER, unread_count INTEGER, last_mid INTEGER, inbox_max INTEGER, outbox_max INTEGER, last_mid_i INTEGER, unread_count_i INTEGER, pts INTEGER, date_i INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, data BLOB, unread_reactions INTEGER, last_mid_group INTEGER, ttl_period INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS date_idx_dialogs ON dialogs(date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON dialogs(last_mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON dialogs(folder_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON dialogs(flags);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT, color INTEGER DEFAULT -1, entities BLOB, noanimate INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER, online INTEGER, inviter INTEGER, links INTEGER, participants_count INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE users_data(uid INTEGER PRIMARY KEY, about TEXT)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE users(uid INTEGER PRIMARY KEY, name TEXT, status INTEGER, data BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE chats(uid INTEGER PRIMARY KEY, name TEXT, data BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE enc_chats(uid INTEGER PRIMARY KEY, user INTEGER, name TEXT, data BLOB, g BLOB, authkey BLOB, ttl INTEGER, layer INTEGER, seq_in INTEGER, seq_out INTEGER, use_count INTEGER, exchange_id INTEGER, key_date INTEGER, fprint INTEGER, fauthkey BLOB, khash BLOB, in_seq_no INTEGER, admin_id INTEGER, mtproto_seq INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE contacts(uid INTEGER PRIMARY KEY, mutual INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, document BLOB, PRIMARY KEY (id, type));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER, emoji INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE sent_files_v2(uid TEXT, type INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, type))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE keyvalue(id TEXT PRIMARY KEY, value TEXT)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE pending_tasks(id INTEGER PRIMARY KEY, data BLOB);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB, proximity INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER, short_name TEXT);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER, date INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, topicId INTEGER, is_reaction INTEGER, PRIMARY KEY(uid, mid))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE reactions(data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE premium_promo(data BLOB, date INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE emoji_statuses(data BLOB, type INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes_topics(uid, topic_id, end);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, reply_to_story_id INTEGER, PRIMARY KEY(mid, topic_id, uid))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, read_outbox INTEGER, pinned INTEGER, total_messages_count INTEGER, hidden INTEGER, edit_date INTEGER, nopaid_messages_exception INTEGER, PRIMARY KEY(did, topic_id));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS did_topics ON topics(did);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE app_config(data BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE effects(data BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, custom_params BLOB, PRIMARY KEY (dialog_id, story_id));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB, type INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE unconfirmed_auth (data BLOB);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER, count INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE business_links(data BLOB, order_value INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT, pos INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER, pos INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);").stepThis().dispose();
        sQLiteDatabase.executeFast("PRAGMA user_version = 168").stepThis().dispose();
    }

    public boolean isDatabaseMigrationInProgress() {
        return this.databaseMigrationInProgress;
    }

    private void updateDbToLastVersion(int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDbToLastVersion$3();
            }
        });
        FileLog.d("MessagesStorage start db migration from " + i + " to 168");
        int iMigrate = DatabaseMigrationHelper.migrate(this, i);
        StringBuilder sb = new StringBuilder();
        sb.append("MessagesStorage db migration finished to varsion ");
        sb.append(iMigrate);
        FileLog.d(sb.toString());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDbToLastVersion$4();
            }
        });
    }

    public void lambda$updateDbToLastVersion$3() {
        this.databaseMigrationInProgress = true;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseMigration, Boolean.TRUE);
    }

    public void lambda$updateDbToLastVersion$4() {
        this.databaseMigrationInProgress = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseMigration, Boolean.FALSE);
    }

    void executeNoException(String str) {
        try {
            this.database.executeFast(str).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void cleanupInternal(boolean z) {
        if (z) {
            reset();
        } else {
            clearDatabaseValues();
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.database = null;
        }
        if (z) {
            File file = this.cacheFile;
            if (file != null) {
                file.delete();
                this.cacheFile = null;
            }
            File file2 = this.walCacheFile;
            if (file2 != null) {
                file2.delete();
                this.walCacheFile = null;
            }
            File file3 = this.shmCacheFile;
            if (file3 != null) {
                file3.delete();
                this.shmCacheFile = null;
            }
        }
    }

    public void clearDatabaseValues() {
        this.lastDateValue = 0;
        this.lastSeqValue = 0;
        this.lastPtsValue = 0;
        this.lastQtsValue = 0;
        this.lastSecretVersion = 0;
        this.mainUnreadCount = 0;
        this.archiveUnreadCount = 0;
        this.pendingMainUnreadCount = 0;
        this.pendingArchiveUnreadCount = 0;
        this.dialogFilters.clear();
        this.dialogFiltersMap.clear();
        this.unknownDialogsIds.clear();
        this.lastSavedSeq = 0;
        this.lastSavedPts = 0;
        this.lastSavedDate = 0;
        this.lastSavedQts = 0;
        this.secretPBytes = null;
        this.secretG = 0;
    }

    public void cleanup(final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$cleanup$6(z);
            }
        });
    }

    public void lambda$cleanup$6(boolean z) throws InterruptedException {
        cleanupInternal(true);
        openDatabase(1);
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$cleanup$5();
                }
            });
        }
    }

    public void lambda$cleanup$5() {
        getMessagesController().getDifference();
    }

    public void saveSecretParams(final int i, final int i2, final byte[] bArr) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$saveSecretParams$7(i, i2, bArr);
            }
        });
    }

    public void lambda$saveSecretParams$7(int i, int i2, byte[] bArr) throws InterruptedException {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
            sQLitePreparedStatementExecuteFast.bindInteger(1, i);
            sQLitePreparedStatementExecuteFast.bindInteger(2, i2);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(bArr != null ? bArr.length : 1);
            if (bArr != null) {
                nativeByteBuffer.writeBytes(bArr);
            }
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
            nativeByteBuffer.reuse();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void checkSQLException(Throwable th) throws InterruptedException {
        checkSQLException(th, true);
    }

    private void checkSQLException(Throwable th, boolean z) throws InterruptedException {
        if ((th instanceof SQLiteException) && th.getMessage() != null && th.getMessage().contains("is malformed") && !this.tryRecover) {
            this.tryRecover = true;
            FileLog.e("disk image malformed detected, try recover");
            if (recoverDatabase()) {
                this.tryRecover = false;
                clearLoadingDialogsOffsets();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkSQLException$8();
                    }
                });
                FileLog.e(new Exception("database restored!!"));
                return;
            }
            FileLog.e(new Exception(th), z);
            return;
        }
        FileLog.e(th, z);
    }

    public void lambda$checkSQLException$8() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseReset, new Object[0]);
    }

    public void fixNotificationSettings() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$fixNotificationSettings$9();
            }
        });
    }

    public void lambda$fixNotificationSettings$9() throws InterruptedException {
        try {
            LongSparseArray longSparseArray = new LongSparseArray();
            Map<String, ?> all = MessagesController.getNotificationsSettings(this.currentAccount).getAll();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("notify2_")) {
                    Integer num = (Integer) entry.getValue();
                    if (num.intValue() == 2 || num.intValue() == 3) {
                        String strReplace = key.replace("notify2_", "");
                        long jIntValue = 1;
                        if (num.intValue() != 2) {
                            if (((Integer) all.get("notifyuntil_" + strReplace)) != null) {
                                jIntValue = 1 | (r4.intValue() << 32);
                            }
                        }
                        try {
                            longSparseArray.put(Long.parseLong(strReplace), Long.valueOf(jIntValue));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            try {
                this.database.beginTransaction();
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                for (int i = 0; i < longSparseArray.size(); i++) {
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindLong(1, longSparseArray.keyAt(i));
                    sQLitePreparedStatementExecuteFast.bindLong(2, ((Long) longSparseArray.valueAt(i)).longValue());
                    sQLitePreparedStatementExecuteFast.step();
                }
                sQLitePreparedStatementExecuteFast.dispose();
                this.database.commitTransaction();
            } catch (Exception e2) {
                checkSQLException(e2);
            }
        } catch (Throwable th) {
            checkSQLException(th);
        }
    }

    public long createPendingTask(final NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return 0L;
        }
        final long andAdd = this.lastTaskId.getAndAdd(1L);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createPendingTask$10(andAdd, nativeByteBuffer);
            }
        });
        return andAdd;
    }

    public void lambda$createPendingTask$10(long j, NativeByteBuffer nativeByteBuffer) {
        try {
            try {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
                sQLitePreparedStatementExecuteFast.bindLong(1, j);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                checkSQLException(e);
            }
        } finally {
            nativeByteBuffer.reuse();
        }
    }

    public void removePendingTask(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$removePendingTask$11(j);
            }
        });
    }

    public void lambda$removePendingTask$11(long j) throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM pending_tasks WHERE id = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    private void loadPendingTasks() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$loadPendingTasks$33();
            }
        });
    }

    public void lambda$loadPendingTasks$33() throws java.lang.InterruptedException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadPendingTasks$33():void");
    }

    public void lambda$loadPendingTasks$12(TLRPC.Chat chat, long j) {
        getMessagesController().loadUnknownChannel(chat, j);
    }

    public void lambda$loadPendingTasks$13(long j, int i, long j2) {
        getMessagesController().getChannelDifference(j, i, j2, null);
    }

    public void lambda$loadPendingTasks$14(TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, long j) {
        getMessagesController().checkLastDialogMessage(dialog, inputPeer, j);
    }

    public void lambda$loadPendingTasks$15(long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        getMessagesController().pinDialog(j, z, inputPeer, j2);
    }

    public void lambda$loadPendingTasks$16(long j, int i, long j2, TLRPC.InputChannel inputChannel) {
        getMessagesController().getChannelDifference(j, i, j2, inputChannel);
    }

    public void lambda$loadPendingTasks$17(long j, int i, long j2, TLRPC.InputChannel inputChannel) {
        getMessagesController().getChannelDifference(j, i, j2, inputChannel);
    }

    public void lambda$loadPendingTasks$18(long j, long j2, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, -j, true, 0, false, j2, tLObject, 0);
    }

    public void lambda$loadPendingTasks$19(long j, long j2, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, j, true, 0, false, j2, tLObject, 0);
    }

    public void lambda$loadPendingTasks$20(long j, long j2, TLObject tLObject, int i) {
        getMessagesController().deleteMessages(null, null, null, j, true, 0, false, j2, tLObject, i);
    }

    public void lambda$loadPendingTasks$21(long j, TLRPC.InputPeer inputPeer, long j2) {
        getMessagesController().markDialogAsUnread(j, inputPeer, j2);
    }

    public void lambda$loadPendingTasks$22(long j, int i, TLRPC.InputChannel inputChannel, int i2, long j2) {
        getMessagesController().markMessageAsRead2(-j, i, inputChannel, i2, j2);
    }

    public void lambda$loadPendingTasks$23(long j, int i, TLRPC.InputChannel inputChannel, int i2, long j2, int i3) {
        getMessagesController().markMessageAsRead2(j, i, inputChannel, i2, j2, i3 == 23);
    }

    public void lambda$loadPendingTasks$24(Theme.OverrideWallpaperInfo overrideWallpaperInfo, boolean z, long j) {
        getMessagesController().saveWallpaperToServer(null, overrideWallpaperInfo, z, j);
    }

    public void lambda$loadPendingTasks$25(long j, boolean z, int i, int i2, boolean z2, TLRPC.InputPeer inputPeer, long j2) {
        getMessagesController().deleteDialog(j, z ? 1 : 0, i, i2, z2, inputPeer, j2);
    }

    public void lambda$loadPendingTasks$26(TLRPC.InputPeer inputPeer, long j) {
        getMessagesController().loadUnknownDialog(inputPeer, j);
    }

    public void lambda$loadPendingTasks$27(int i, ArrayList arrayList, long j) {
        getMessagesController().reorderPinnedDialogs(i, arrayList, j);
    }

    public void lambda$loadPendingTasks$28(int i, ArrayList arrayList, long j) {
        getMessagesController().addDialogToFolder(null, i, -1, arrayList, j);
    }

    public void lambda$loadPendingTasks$29(long j, long j2, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, j, true, 1, false, j2, tLObject, 0);
    }

    public void lambda$loadPendingTasks$30(TLRPC.InputPeer inputPeer, long j) {
        getMessagesController().reloadMentionsCountForChannel(inputPeer, j);
    }

    public void lambda$loadPendingTasks$31(int i, boolean z, long j) {
        getSecretChatHelper().declineSecretChat(i, z, j);
    }

    public void lambda$loadPendingTasks$32(long j, long j2, int i) {
        getMessagesController().lambda$checkDeletingTask$80(j, j2, i);
    }

    public void saveChannelPts(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$saveChannelPts$34(i, j);
            }
        });
    }

    public void lambda$saveChannelPts$34(int i, long j) throws InterruptedException {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
            sQLitePreparedStatementExecuteFast.bindInteger(1, i);
            sQLitePreparedStatementExecuteFast.bindLong(2, -j);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void lambda$saveDiffParams$35(int i, int i2, int i3, int i4) throws InterruptedException {
        try {
            if (this.lastSavedSeq == i && this.lastSavedPts == i2 && this.lastSavedDate == i3 && this.lastQtsValue == i4) {
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE params SET seq = ?, pts = ?, date = ?, qts = ? WHERE id = 1");
            sQLitePreparedStatementExecuteFast.bindInteger(1, i);
            sQLitePreparedStatementExecuteFast.bindInteger(2, i2);
            sQLitePreparedStatementExecuteFast.bindInteger(3, i3);
            sQLitePreparedStatementExecuteFast.bindInteger(4, i4);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
            this.lastSavedSeq = i;
            this.lastSavedPts = i2;
            this.lastSavedDate = i3;
            this.lastSavedQts = i4;
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void saveDiffParams(final int i, final int i2, final int i3, final int i4) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$saveDiffParams$35(i, i2, i3, i4);
            }
        });
    }

    public void lambda$updateMutedDialogsFiltersCounters$36() {
        resetAllUnreadCounters(true);
    }

    public void updateMutedDialogsFiltersCounters() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateMutedDialogsFiltersCounters$36();
            }
        });
    }

    public void setDialogFlags(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$setDialogFlags$37(j, j2);
            }
        });
    }

    public void lambda$setDialogFlags$37(long j, long j2) throws InterruptedException {
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT flags FROM dialog_settings WHERE did = " + j, new Object[0]);
            int iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : 0;
            sQLiteCursorQueryFinalized.dispose();
            if (j2 == iIntValue) {
                return;
            }
            this.database.executeFast(String.format(Locale.US, "REPLACE INTO dialog_settings VALUES(%d, %d)", Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
            resetAllUnreadCounters(true);
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void putStoryPushMessage(final NotificationsController.StoryNotification storyNotification) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$putStoryPushMessage$38(storyNotification);
            }
        });
    }

    public void lambda$putStoryPushMessage$38(NotificationsController.StoryNotification storyNotification) throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM story_pushes WHERE uid = " + storyNotification.dialogId).stepThis().dispose();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
            for (Map.Entry<Integer, Pair<Long, Long>> entry : storyNotification.dateByIds.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                long jLongValue = ((Long) entry.getValue().first).longValue();
                long jLongValue2 = ((Long) entry.getValue().second).longValue();
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, storyNotification.dialogId);
                sQLitePreparedStatementExecuteFast.bindInteger(2, iIntValue);
                sQLitePreparedStatementExecuteFast.bindLong(3, jLongValue);
                if (storyNotification.localName == null) {
                    storyNotification.localName = "";
                }
                sQLitePreparedStatementExecuteFast.bindString(4, storyNotification.localName);
                sQLitePreparedStatementExecuteFast.bindInteger(5, storyNotification.hidden ? 1 : 0);
                sQLitePreparedStatementExecuteFast.bindLong(6, jLongValue2);
                sQLitePreparedStatementExecuteFast.step();
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void deleteStoryPushMessage(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$deleteStoryPushMessage$39(j);
            }
        });
    }

    public void lambda$deleteStoryPushMessage$39(long j) throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void deleteAllStoryPushMessages() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$deleteAllStoryPushMessages$40();
            }
        });
    }

    public void lambda$deleteAllStoryPushMessages$40() throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM story_pushes").stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void deleteAllStoryReactionPushMessages() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$deleteAllStoryReactionPushMessages$41();
            }
        });
    }

    public void lambda$deleteAllStoryReactionPushMessages$41() throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void putPushMessage(final MessageObject messageObject) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$putPushMessage$42(messageObject);
            }
        });
    }

    public void lambda$putPushMessage$42(MessageObject messageObject) throws InterruptedException {
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(nativeByteBuffer);
            int i = messageObject.localType == 2 ? 1 : 0;
            if (messageObject.localChannel) {
                i |= 2;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, messageObject.getDialogId());
            sQLitePreparedStatementExecuteFast.bindInteger(2, messageObject.getId());
            sQLitePreparedStatementExecuteFast.bindLong(3, messageObject.messageOwner.random_id);
            sQLitePreparedStatementExecuteFast.bindInteger(4, messageObject.messageOwner.date);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(5, nativeByteBuffer);
            CharSequence charSequence = messageObject.messageText;
            if (charSequence == null) {
                sQLitePreparedStatementExecuteFast.bindNull(6);
            } else {
                sQLitePreparedStatementExecuteFast.bindString(6, charSequence.toString());
            }
            String str = messageObject.localName;
            if (str == null) {
                sQLitePreparedStatementExecuteFast.bindNull(7);
            } else {
                sQLitePreparedStatementExecuteFast.bindString(7, str);
            }
            String str2 = messageObject.localUserName;
            if (str2 == null) {
                sQLitePreparedStatementExecuteFast.bindNull(8);
            } else {
                sQLitePreparedStatementExecuteFast.bindString(8, str2);
            }
            sQLitePreparedStatementExecuteFast.bindInteger(9, i);
            sQLitePreparedStatementExecuteFast.bindLong(10, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, false));
            sQLitePreparedStatementExecuteFast.bindInteger(11, (messageObject.isReactionPush ? 1 : 0) + (messageObject.isStoryReactionPush ? 1 : 0));
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void clearLocalDatabase() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$clearLocalDatabase$44();
            }
        });
    }

    public void lambda$clearLocalDatabase$44() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$clearLocalDatabase$44():void");
    }

    public void lambda$clearLocalDatabase$43() {
        getMessagesController().getSavedMessagesController().cleanup();
    }

    public void saveTopics(final long j, final List<TLRPC.TL_forumTopic> list, final boolean z, boolean z2, final int i) throws Throwable {
        if (z2) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$saveTopics$45(j, list, z, i);
                }
            });
        } else {
            saveTopicsInternal(j, list, z, false, i);
        }
    }

    public void lambda$saveTopics$45(long j, List list, boolean z, int i) throws Throwable {
        saveTopicsInternal(j, list, z, true, i);
    }

    private void saveTopicsInternal(long r20, java.util.List<org.telegram.tgnet.TLRPC.TL_forumTopic> r22, boolean r23, boolean r24, int r25) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.saveTopicsInternal(long, java.util.List, boolean, boolean, int):void");
    }

    public void updateTopicData(long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        updateTopicData(j, tL_forumTopic, i, getConnectionsManager().getCurrentTime());
    }

    public void updateTopicData(final long j, final TLRPC.TL_forumTopic tL_forumTopic, final int i, final int i2) {
        if (tL_forumTopic == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateTopicData$47(i, tL_forumTopic, j, i2);
            }
        });
    }

    public void lambda$updateTopicData$47(final int r19, final org.telegram.tgnet.TLRPC.TL_forumTopic r20, final long r21, int r23) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateTopicData$47(int, org.telegram.tgnet.TLRPC$TL_forumTopic, long, int):void");
    }

    public void lambda$updateTopicData$46(long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        getMessagesController().getTopicsController().updateTopicInUi(j, tL_forumTopic, i);
    }

    public void loadTopics(final long j, final Consumer<ArrayList<TLRPC.TL_forumTopic>> consumer) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$loadTopics$49(j, consumer);
            }
        });
    }

    public void lambda$loadTopics$49(long r21, java.util.function.Consumer r23) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadTopics$49(long, java.util.function.Consumer):void");
    }

    public void lambda$loadTopics$48(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            getMessagesController().putUsers(arrayList, true);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        getMessagesController().putChats(arrayList2, true);
    }

    public void loadGroupedMessagesForTopicUpdates(ArrayList<TopicsController.TopicUpdate> arrayList) throws InterruptedException {
        if (arrayList == null) {
            return;
        }
        try {
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i = 0; i < arrayList.size(); i++) {
                if (!arrayList.get(i).reloadTopic && !arrayList.get(i).onlyCounters && arrayList.get(i).topMessage != null) {
                    long j = arrayList.get(i).topMessage.grouped_id;
                    if (j != 0) {
                        ArrayList arrayList2 = (ArrayList) longSparseArray.get(j);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            longSparseArray.put(j, arrayList2);
                        }
                        arrayList2.add(arrayList.get(i));
                    }
                }
            }
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                long jKeyAt = longSparseArray.keyAt(i2);
                ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i2);
                SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_v2 WHERE uid = %s AND group_id = %s ORDER BY date DESC", Long.valueOf(((TopicsController.TopicUpdate) arrayList3.get(0)).dialogId), Long.valueOf(jKeyAt)), new Object[0]);
                ArrayList<MessageObject> arrayList4 = null;
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    if (messageTLdeserialize != null) {
                        messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList4.add(new MessageObject(this.currentAccount, messageTLdeserialize, false, false));
                }
                sQLiteCursorQueryFinalized.dispose();
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    ((TopicsController.TopicUpdate) arrayList3.get(i3)).groupedMessages = arrayList4;
                }
            }
        } catch (Throwable th) {
            checkSQLException(th);
        }
    }

    public void loadGroupedMessagesForTopics(long j, ArrayList<TLRPC.TL_forumTopic> arrayList) throws InterruptedException {
        if (arrayList == null) {
            return;
        }
        try {
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).topMessage != null) {
                    long j2 = arrayList.get(i).topMessage.grouped_id;
                    if (j2 != 0) {
                        ArrayList arrayList2 = (ArrayList) longSparseArray.get(j2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            longSparseArray.put(j2, arrayList2);
                        }
                        arrayList2.add(arrayList.get(i));
                    }
                }
            }
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                long jKeyAt = longSparseArray.keyAt(i2);
                ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i2);
                SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_v2 WHERE uid = %s AND group_id = %s ORDER BY date DESC", Long.valueOf(j), Long.valueOf(jKeyAt)), new Object[0]);
                ArrayList<MessageObject> arrayList4 = null;
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    if (messageTLdeserialize != null) {
                        messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList4.add(new MessageObject(this.currentAccount, messageTLdeserialize, false, false));
                }
                sQLiteCursorQueryFinalized.dispose();
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    ((TLRPC.TL_forumTopic) arrayList3.get(i3)).groupedMessages = arrayList4;
                }
            }
        } catch (Throwable th) {
            checkSQLException(th);
        }
    }

    public void getSavedDialogMaxMessageId(final long j, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getSavedDialogMaxMessageId$51(j, intCallback);
            }
        });
    }

    public void lambda$getSavedDialogMaxMessageId$51(long j, final IntCallback intCallback) {
        final int[] iArr = new int[1];
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT MAX(mid) FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(getUserConfig().getClientUserId()), Long.valueOf(j));
                if (sQLiteCursorQueryFinalized.next()) {
                    iArr[0] = sQLiteCursorQueryFinalized.intValue(0);
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.lambda$getSavedDialogMaxMessageId$50(intCallback, iArr);
                }
            });
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public static void lambda$getSavedDialogMaxMessageId$50(IntCallback intCallback, int[] iArr) {
        intCallback.run(iArr[0]);
    }

    public void deleteSavedDialog(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$deleteSavedDialog$53(j);
            }
        });
    }

    public void lambda$deleteSavedDialog$53(long j) throws Throwable {
        final long clientUserId;
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                clientUserId = getUserConfig().getClientUserId();
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", Long.valueOf(clientUserId), Long.valueOf(j));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            final ArrayList<Integer> arrayList = new ArrayList<>();
            while (sQLiteCursorQueryFinalized.next()) {
                arrayList.add(Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0)));
            }
            sQLiteCursorQueryFinalized.dispose();
            sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(clientUserId));
            while (sQLiteCursorQueryFinalized.next()) {
                int iIntValue = sQLiteCursorQueryFinalized.intValue(0);
                if (!arrayList.contains(Integer.valueOf(iIntValue))) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(1);
                    if (MessageObject.getSavedDialogId(clientUserId, TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false)) == j) {
                        arrayList.add(Integer.valueOf(iIntValue));
                    }
                    nativeByteBufferByteBufferValue.reuse();
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            if (arrayList.isEmpty()) {
                return;
            }
            lambda$markMessagesAsDeleted$213(clientUserId, arrayList, true, 0, 0);
            updateDialogsWithDeletedMessages(clientUserId, -clientUserId, arrayList, null, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteSavedDialog$52(clientUserId, arrayList);
                }
            });
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$deleteSavedDialog$52(long j, ArrayList arrayList) {
        getMessagesController().markDialogMessageAsDeleted(j, arrayList);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
    }

    public void removeTopic(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$removeTopic$54(j, j2);
            }
        });
    }

    public void lambda$removeTopic$54(long j, long j2) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM topics WHERE did = %d AND topic_id = %d", Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
            this.database.executeFast(String.format(locale, "DELETE FROM messages_v2 WHERE uid = %d AND mid IN (SELECT mid FROM messages_topics WHERE uid = %d AND topic_id = %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
            this.database.executeFast(String.format(locale, "DELETE FROM messages_topics WHERE uid = %d AND topic_id = %d", Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    public void removeTopics(final long j, final ArrayList<Long> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$removeTopics$55(arrayList, j);
            }
        });
    }

    public void lambda$removeTopics$55(ArrayList arrayList, long j) {
        try {
            String strJoin = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM topics WHERE did = %d AND topic_id IN (%s)", Long.valueOf(j), strJoin)).stepThis().dispose();
            try {
                this.database.executeFast(String.format(locale, "DELETE FROM messages_v2 WHERE uid = %d AND mid IN (SELECT mid FROM messages_topics WHERE uid = %d AND topic_id IN (%s))", Long.valueOf(j), Long.valueOf(j), strJoin)).stepThis().dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            this.database.executeFast(String.format(Locale.US, "DELETE FROM messages_topics WHERE uid = %d AND topic_id IN (%s)", Long.valueOf(j), strJoin)).stepThis().dispose();
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
    }

    public void updateTopicsWithReadMessages(final HashMap<TopicKey, Integer> map) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$updateTopicsWithReadMessages$56(map);
            }
        });
    }

    public void lambda$updateTopicsWithReadMessages$56(HashMap map) throws InterruptedException {
        for (TopicKey topicKey : map.keySet()) {
            Integer num = (Integer) map.get(topicKey);
            num.intValue();
            try {
                this.database.executeFast(String.format(Locale.US, "UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = %d AND topic_id = %d), %d) WHERE did = %d AND topic_id = %d", Long.valueOf(topicKey.dialogId), Long.valueOf(topicKey.topicId), num, Long.valueOf(topicKey.dialogId), Long.valueOf(topicKey.topicId))).stepThis().dispose();
            } catch (SQLiteException e) {
                checkSQLException(e);
            }
        }
    }

    public void setDialogTtl(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$setDialogTtl$57(i, j);
            }
        });
    }

    public void lambda$setDialogTtl$57(int i, long j) throws InterruptedException {
        try {
            this.database.executeFast(String.format(Locale.US, "UPDATE dialogs SET ttl_period = %d WHERE did = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
        } catch (SQLiteException e) {
            checkSQLException(e);
        }
    }

    public ArrayList<File> getDatabaseFiles() {
        ArrayList<File> arrayList = new ArrayList<>();
        arrayList.add(this.cacheFile);
        arrayList.add(this.walCacheFile);
        arrayList.add(this.shmCacheFile);
        return arrayList;
    }

    public void reset() {
        clearDatabaseValues();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$reset$58();
            }
        });
    }

    public void lambda$reset$58() {
        for (int i = 0; i < 2; i++) {
            getUserConfig().setDialogsLoadOffset(i, 0, 0, 0L, 0L, 0L, 0L);
            getUserConfig().setTotalDialogsCount(i, 0);
        }
        getUserConfig().clearFilters();
        getUserConfig().clearPinnedDialogsLoaded();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didClearDatabase, new Object[0]);
        getMediaDataController().loadAttachMenuBots(false, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseReset, new Object[0]);
        getMessagesController().getStoriesController().cleanup();
    }

    public void fullReset() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$fullReset$60();
            }
        });
    }

    public void lambda$fullReset$60() throws InterruptedException {
        cleanupInternal(true);
        clearLoadingDialogsOffsets();
        openDatabase(1);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$fullReset$59();
            }
        });
    }

    public void lambda$fullReset$59() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseReset, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didClearDatabase, new Object[0]);
        getMessagesController().getSavedMessagesController().cleanup();
    }

    private static class ReadDialog {
        public int date;
        public int lastMid;
        public int unreadCount;

        private ReadDialog() {
        }
    }

    public void readAllDialogs(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$readAllDialogs$62(i);
            }
        });
    }

    public void lambda$readAllDialogs$62(int i) throws Throwable {
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursor = 0;
        SQLiteCursor sQLiteCursor2 = null;
        try {
            try {
                ArrayList<Long> arrayList = new ArrayList<>();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                final LongSparseArray longSparseArray = new LongSparseArray();
                if (i >= 0) {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i)), new Object[0]);
                } else {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                }
                while (sQLiteCursorQueryFinalized.next()) {
                    try {
                        long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                        if (!DialogObject.isFolderDialogId(jLongValue)) {
                            ReadDialog readDialog = new ReadDialog();
                            readDialog.lastMid = sQLiteCursorQueryFinalized.intValue(1);
                            readDialog.unreadCount = sQLiteCursorQueryFinalized.intValue(2);
                            readDialog.date = sQLiteCursorQueryFinalized.intValue(3);
                            longSparseArray.put(jLongValue, readDialog);
                            if (!DialogObject.isEncryptedDialog(jLongValue)) {
                                if (DialogObject.isChatDialog(jLongValue)) {
                                    long j = -jLongValue;
                                    if (!arrayList2.contains(Long.valueOf(j))) {
                                        arrayList2.add(Long.valueOf(j));
                                    }
                                } else if (!arrayList.contains(Long.valueOf(jLongValue))) {
                                    arrayList.add(Long.valueOf(jLongValue));
                                }
                            } else {
                                int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                }
                            }
                        }
                    } catch (Exception e) {
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        e = e;
                        checkSQLException(e);
                        if (sQLiteCursor != 0) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        sQLiteCursor2 = sQLiteCursorQueryFinalized;
                        th = th;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                final ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                final ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                final ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                if (!arrayList3.isEmpty()) {
                    getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    getUsersInternal(arrayList, arrayList4);
                }
                if (!arrayList2.isEmpty()) {
                    getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$readAllDialogs$61(arrayList4, arrayList5, arrayList6, longSparseArray);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void lambda$readAllDialogs$61(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, LongSparseArray longSparseArray) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        getMessagesController().putEncryptedChats(arrayList3, true);
        for (int i = 0; i < longSparseArray.size(); i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ReadDialog readDialog = (ReadDialog) longSparseArray.valueAt(i);
            if (getMessagesController().isForum(jKeyAt) || isForum(jKeyAt, 8) || getMessagesController().isMonoForumWithManageRights(jKeyAt)) {
                getMessagesController().markAllTopicsAsRead(jKeyAt);
            }
            MessagesController messagesController = getMessagesController();
            int i2 = readDialog.lastMid;
            messagesController.markDialogAsRead(jKeyAt, i2, i2, readDialog.date, false, 0L, readDialog.unreadCount, true, 0);
        }
    }

    private org.telegram.tgnet.TLRPC.messages_Dialogs loadDialogsByIds(java.lang.String r19, java.util.ArrayList<java.lang.Long> r20, java.util.ArrayList<java.lang.Long> r21, java.util.ArrayList<java.lang.Integer> r22) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.loadDialogsByIds(java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):org.telegram.tgnet.TLRPC$messages_Dialogs");
    }

    private void loadDialogFilters() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$loadDialogFilters$64();
            }
        });
    }

    public void lambda$loadDialogFilters$64() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadDialogFilters$64():void");
    }

    public static int lambda$loadDialogFilters$63(MessagesController.DialogFilter dialogFilter, MessagesController.DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    private void calcUnreadCounters(boolean r29) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.calcUnreadCounters(boolean):void");
    }

    private void saveDialogFilterInternal(MessagesController.DialogFilter dialogFilter, boolean z, boolean z2) throws Throwable {
        int i;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (!this.dialogFilters.contains(dialogFilter)) {
                    if (z) {
                        if (this.dialogFilters.get(0).isDefault()) {
                            this.dialogFilters.add(1, dialogFilter);
                        } else {
                            this.dialogFilters.add(0, dialogFilter);
                        }
                    } else {
                        this.dialogFilters.add(dialogFilter);
                    }
                    this.dialogFiltersMap.put(dialogFilter.id, dialogFilter);
                }
                sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            sQLitePreparedStatementExecuteFast.bindInteger(1, dialogFilter.id);
            sQLitePreparedStatementExecuteFast.bindInteger(2, dialogFilter.order);
            sQLitePreparedStatementExecuteFast.bindInteger(3, dialogFilter.unreadCount);
            sQLitePreparedStatementExecuteFast.bindInteger(4, dialogFilter.flags);
            sQLitePreparedStatementExecuteFast.bindString(5, dialogFilter.id == 0 ? "ALL_CHATS" : dialogFilter.name);
            sQLitePreparedStatementExecuteFast.bindInteger(6, dialogFilter.color);
            Vector vector = new Vector(new MessagesStorage$$ExternalSyntheticLambda42());
            vector.objects.addAll(dialogFilter.entities);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
            vector.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(7, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindInteger(8, dialogFilter.title_noanimate ? 1 : 0);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
            nativeByteBuffer.reuse();
            if (z2) {
                this.database.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + dialogFilter.id).stepThis().dispose();
                this.database.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + dialogFilter.id).stepThis().dispose();
                this.database.beginTransaction();
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = this.database.executeFast("REPLACE INTO dialog_filter_pin_v2 VALUES(?, ?, ?)");
                int size = dialogFilter.alwaysShow.size();
                for (int i2 = 0; i2 < size; i2++) {
                    long jLongValue = dialogFilter.alwaysShow.get(i2).longValue();
                    sQLitePreparedStatementExecuteFast2.requery();
                    sQLitePreparedStatementExecuteFast2.bindInteger(1, dialogFilter.id);
                    sQLitePreparedStatementExecuteFast2.bindLong(2, jLongValue);
                    sQLitePreparedStatementExecuteFast2.bindInteger(3, dialogFilter.pinnedDialogs.get(jLongValue, Integer.MIN_VALUE));
                    sQLitePreparedStatementExecuteFast2.step();
                }
                int size2 = dialogFilter.pinnedDialogs.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    long jKeyAt = dialogFilter.pinnedDialogs.keyAt(i3);
                    if (DialogObject.isEncryptedDialog(jKeyAt)) {
                        sQLitePreparedStatementExecuteFast2.requery();
                        sQLitePreparedStatementExecuteFast2.bindInteger(1, dialogFilter.id);
                        sQLitePreparedStatementExecuteFast2.bindLong(2, jKeyAt);
                        sQLitePreparedStatementExecuteFast2.bindInteger(3, dialogFilter.pinnedDialogs.valueAt(i3));
                        sQLitePreparedStatementExecuteFast2.step();
                    }
                }
                sQLitePreparedStatementExecuteFast2.dispose();
                sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO dialog_filter_ep VALUES(?, ?)");
                int size3 = dialogFilter.neverShow.size();
                for (i = 0; i < size3; i++) {
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindInteger(1, dialogFilter.id);
                    sQLitePreparedStatementExecuteFast.bindLong(2, dialogFilter.neverShow.get(i).longValue());
                    sQLitePreparedStatementExecuteFast.step();
                }
                sQLitePreparedStatementExecuteFast.dispose();
                this.database.commitTransaction();
            }
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            checkSQLException(e);
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            SQLiteDatabase sQLiteDatabase3 = this.database;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private ArrayList<Long> toPeerIds(ArrayList<TLRPC.InputPeer> arrayList) {
        ArrayList<Long> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            return arrayList2;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.InputPeer inputPeer = arrayList.get(i);
            if (inputPeer != null) {
                long j = inputPeer.user_id;
                if (j == 0) {
                    long j2 = inputPeer.chat_id;
                    if (j2 == 0) {
                        j2 = inputPeer.channel_id;
                    }
                    j = -j2;
                }
                arrayList2.add(Long.valueOf(j));
            }
        }
        return arrayList2;
    }

    public void checkLoadedRemoteFilters(final ArrayList<TLRPC.DialogFilter> arrayList, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$checkLoadedRemoteFilters$66(arrayList, runnable);
            }
        });
    }

    public void lambda$checkLoadedRemoteFilters$66(java.util.ArrayList r36, java.lang.Runnable r37) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkLoadedRemoteFilters$66(java.util.ArrayList, java.lang.Runnable):void");
    }

    public static int lambda$checkLoadedRemoteFilters$65(LongSparseIntArray longSparseIntArray, Long l, Long l2) {
        int i = longSparseIntArray.get(l.longValue());
        int i2 = longSparseIntArray.get(l2.longValue());
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void lambda$processLoadedFilterPeers$68(TLRPC.messages_Dialogs messages_dialogs, TLRPC.messages_Dialogs messages_dialogs2, ArrayList<TLRPC.User> arrayList, ArrayList<TLRPC.Chat> arrayList2, ArrayList<MessagesController.DialogFilter> arrayList3, SparseArray<MessagesController.DialogFilter> sparseArray, ArrayList<Integer> arrayList4, HashMap<Integer, HashSet<Long>> map, HashSet<Integer> hashSet, Runnable runnable) throws Throwable {
        putUsersAndChats(arrayList, arrayList2, true, false);
        int size = sparseArray.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            lambda$deleteDialogFilter$69(sparseArray.valueAt(i));
            i++;
            z = true;
        }
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            MessagesController.DialogFilter dialogFilter = this.dialogFiltersMap.get(it.next().intValue());
            if (dialogFilter != null) {
                dialogFilter.pendingUnreadCount = -1;
            }
        }
        for (Map.Entry<Integer, HashSet<Long>> entry : map.entrySet()) {
            MessagesController.DialogFilter dialogFilter2 = this.dialogFiltersMap.get(entry.getKey().intValue());
            if (dialogFilter2 != null) {
                Iterator<Long> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    dialogFilter2.pinnedDialogs.delete(it2.next().longValue());
                }
                z = true;
            }
        }
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            saveDialogFilterInternal(arrayList3.get(i2), false, true);
            i2++;
            z = true;
        }
        int size3 = this.dialogFilters.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size3; i3++) {
            MessagesController.DialogFilter dialogFilter3 = this.dialogFilters.get(i3);
            int iIndexOf = arrayList4.indexOf(Integer.valueOf(dialogFilter3.id));
            if (dialogFilter3.order != iIndexOf) {
                dialogFilter3.order = iIndexOf;
                z2 = true;
                z = true;
            }
        }
        if (z2) {
            Collections.sort(this.dialogFilters, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return MessagesStorage.lambda$processLoadedFilterPeersInternal$67((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
                }
            });
            saveDialogFiltersOrderInternal();
        }
        int i4 = z ? 1 : 2;
        calcUnreadCounters(true);
        getMessagesController().processLoadedDialogFilters(new ArrayList<>(this.dialogFilters), messages_dialogs, messages_dialogs2, arrayList, arrayList2, null, i4, runnable);
    }

    public static int lambda$processLoadedFilterPeersInternal$67(MessagesController.DialogFilter dialogFilter, MessagesController.DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    protected void processLoadedFilterPeers(final TLRPC.messages_Dialogs messages_dialogs, final TLRPC.messages_Dialogs messages_dialogs2, final ArrayList<TLRPC.User> arrayList, final ArrayList<TLRPC.Chat> arrayList2, final ArrayList<MessagesController.DialogFilter> arrayList3, final SparseArray<MessagesController.DialogFilter> sparseArray, final ArrayList<Integer> arrayList4, final HashMap<Integer, HashSet<Long>> map, final HashSet<Integer> hashSet, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$processLoadedFilterPeers$68(messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map, hashSet, runnable);
            }
        });
    }

    public void lambda$deleteDialogFilter$69(MessagesController.DialogFilter dialogFilter) throws InterruptedException {
        try {
            this.dialogFilters.remove(dialogFilter);
            this.dialogFiltersMap.remove(dialogFilter.id);
            this.database.executeFast("DELETE FROM dialog_filter WHERE id = " + dialogFilter.id).stepThis().dispose();
            this.database.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + dialogFilter.id).stepThis().dispose();
            this.database.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + dialogFilter.id).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void deleteDialogFilter(final MessagesController.DialogFilter dialogFilter) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$deleteDialogFilter$69(dialogFilter);
            }
        });
    }

    public void saveDialogFilter(final MessagesController.DialogFilter dialogFilter, final boolean z, final boolean z2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$saveDialogFilter$71(dialogFilter, z, z2);
            }
        });
    }

    public void lambda$saveDialogFilter$71(MessagesController.DialogFilter dialogFilter, boolean z, boolean z2) throws Throwable {
        saveDialogFilterInternal(dialogFilter, z, z2);
        calcUnreadCounters(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveDialogFilter$70();
            }
        });
    }

    public void lambda$saveDialogFilter$70() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).unreadCount = arrayList.get(i).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE));
    }

    public void saveDialogFiltersOrderInternal() {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE dialog_filter SET ord = ?, flags = ? WHERE id = ?");
                int size = this.dialogFilters.size();
                for (int i = 0; i < size; i++) {
                    MessagesController.DialogFilter dialogFilter = this.dialogFilters.get(i);
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindInteger(1, dialogFilter.order);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, dialogFilter.flags);
                    sQLitePreparedStatementExecuteFast.bindInteger(3, dialogFilter.id);
                    sQLitePreparedStatementExecuteFast.step();
                }
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void saveDialogFiltersOrder() {
        final ArrayList arrayList = new ArrayList(getMessagesController().dialogFilters);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveDialogFiltersOrder$72(arrayList);
            }
        });
    }

    public void lambda$saveDialogFiltersOrder$72(ArrayList arrayList) {
        this.dialogFilters.clear();
        this.dialogFiltersMap.clear();
        this.dialogFilters.addAll(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            ((MessagesController.DialogFilter) arrayList.get(i)).order = i;
            this.dialogFiltersMap.put(((MessagesController.DialogFilter) arrayList.get(i)).id, (MessagesController.DialogFilter) arrayList.get(i));
        }
        saveDialogFiltersOrderInternal();
    }

    protected static void addReplyMessages(TLRPC.Message message, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        int i = message.reply_to.reply_to_msg_id;
        long replyToDialogId = (message.flags & 1073741824) != 0 ? message.quick_reply_shortcut_id : MessageObject.getReplyToDialogId(message);
        SparseArray sparseArray = (SparseArray) longSparseArray.get(replyToDialogId);
        ArrayList arrayList = (ArrayList) longSparseArray2.get(replyToDialogId);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            longSparseArray.put(replyToDialogId, sparseArray);
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            longSparseArray2.put(replyToDialogId, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) sparseArray.get(message.reply_to.reply_to_msg_id);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            sparseArray.put(message.reply_to.reply_to_msg_id, arrayList2);
            if (!arrayList.contains(Integer.valueOf(message.reply_to.reply_to_msg_id))) {
                arrayList.add(Integer.valueOf(message.reply_to.reply_to_msg_id));
            }
        }
        arrayList2.add(message);
    }

    protected void loadReplyMessages(androidx.collection.LongSparseArray r23, androidx.collection.LongSparseArray r24, java.util.ArrayList<java.lang.Long> r25, java.util.ArrayList<java.lang.Long> r26, int r27) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.loadReplyMessages(androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public void loadUnreadMessages() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$loadUnreadMessages$74();
            }
        });
    }

    public void lambda$loadUnreadMessages$74() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadUnreadMessages$74():void");
    }

    public void lambda$loadUnreadMessages$73(LongSparseArray longSparseArray, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, HashMap map) {
        getNotificationsController().processLoadedUnreadMessages(longSparseArray, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, map.values());
    }

    public void putWallpapers(final ArrayList<TLRPC.WallPaper> arrayList, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$putWallpapers$75(i, arrayList);
            }
        });
    }

    public void lambda$putWallpapers$75(int r11, java.util.ArrayList r12) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putWallpapers$75(int, java.util.ArrayList):void");
    }

    public void deleteWallpaper(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$deleteWallpaper$76(j);
            }
        });
    }

    public void lambda$deleteWallpaper$76(long j) throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void getWallpapers() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getWallpapers$78();
            }
        });
    }

    public void lambda$getWallpapers$78() {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
                final ArrayList arrayList = new ArrayList();
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        TLRPC.WallPaper wallPaperTLdeserialize = TLRPC.WallPaper.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        nativeByteBufferByteBufferValue.reuse();
                        if (wallPaperTLdeserialize != null) {
                            arrayList.add(wallPaperTLdeserialize);
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.lambda$getWallpapers$77(arrayList);
                    }
                });
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized == null) {
                    return;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public static void lambda$getWallpapers$77(ArrayList arrayList) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.wallpapersDidLoad, arrayList);
    }

    public void addRecentLocalFile(final String str, final String str2, final TLRPC.Document document) {
        if (str == null || str.length() == 0) {
            return;
        }
        if ((str2 == null || str2.length() == 0) && document == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$addRecentLocalFile$79(document, str, str2);
            }
        });
    }

    public void lambda$addRecentLocalFile$79(TLRPC.Document document, String str, String str2) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatementExecuteFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.bindString(2, str);
                    sQLitePreparedStatementExecuteFast.step();
                    sQLitePreparedStatementExecuteFast.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindString(1, str2);
                    sQLitePreparedStatementExecuteFast.bindString(2, str);
                    sQLitePreparedStatementExecuteFast.step();
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void deleteUserChatHistory(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$deleteUserChatHistory$82(j, j2);
            }
        });
    }

    public void lambda$deleteUserChatHistory$82(final long r18, long r20) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteUserChatHistory$82(long, long):void");
    }

    public void lambda$deleteUserChatHistory$80(ArrayList arrayList, long j, ArrayList arrayList2) {
        getFileLoader().cancelLoadFiles(arrayList);
        getMessagesController().markDialogMessageAsDeleted(j, arrayList2);
    }

    public void lambda$deleteUserChatHistory$81(ArrayList arrayList, long j) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, Long.valueOf(DialogObject.isChatDialog(j) ? -j : 0L), Boolean.FALSE);
    }

    private boolean addFilesToDelete(TLRPC.Message message, ArrayList<File> arrayList, ArrayList<Pair<Long, Integer>> arrayList2, ArrayList<String> arrayList3, boolean z) {
        long j;
        int i;
        int i2 = 0;
        if (message == null) {
            return false;
        }
        TLRPC.Document document = MessageObject.getDocument(message);
        TLRPC.Photo photo = MessageObject.getPhoto(message);
        if (MessageObject.isVoiceMessage(message)) {
            if (document == null || getMediaDataController().ringtoneDataStore.contains(document.id)) {
                return false;
            }
            j = document.id;
            i = 2;
        } else {
            if (MessageObject.isStickerMessage(message) || MessageObject.isAnimatedStickerMessage(message)) {
                if (document == null) {
                    return false;
                }
                j = document.id;
            } else if (MessageObject.isVideoMessage(message) || MessageObject.isRoundVideoMessage(message) || MessageObject.isGifMessage(message)) {
                if (document == null) {
                    return false;
                }
                j = document.id;
                i = 4;
            } else if (document != null) {
                if (getMediaDataController().ringtoneDataStore.contains(document.id)) {
                    return false;
                }
                j = document.id;
                i = 8;
            } else if (photo == null || FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize()) == null) {
                j = 0;
                i = 0;
            } else {
                j = photo.id;
            }
            i = 1;
        }
        if (j != 0) {
            arrayList2.add(new Pair<>(Long.valueOf(j), Integer.valueOf(i)));
        }
        if (photo != null) {
            int size = photo.sizes.size();
            while (i2 < size) {
                TLRPC.PhotoSize photoSize = photo.sizes.get(i2);
                String attachFileName = FileLoader.getAttachFileName(photoSize);
                if (!TextUtils.isEmpty(attachFileName)) {
                    arrayList3.add(attachFileName);
                }
                File pathToAttach = getFileLoader().getPathToAttach(photoSize, z);
                if (pathToAttach.toString().length() > 0) {
                    arrayList.add(pathToAttach);
                }
                i2++;
            }
            return true;
        }
        if (document == null) {
            return false;
        }
        String attachFileName2 = FileLoader.getAttachFileName(document);
        if (!TextUtils.isEmpty(attachFileName2)) {
            arrayList3.add(attachFileName2);
        }
        File pathToAttach2 = getFileLoader().getPathToAttach(document, z);
        if (pathToAttach2.toString().length() > 0) {
            arrayList.add(pathToAttach2);
        }
        int size2 = document.thumbs.size();
        while (i2 < size2) {
            File pathToAttach3 = getFileLoader().getPathToAttach(document.thumbs.get(i2));
            if (pathToAttach3.toString().length() > 0) {
                arrayList.add(pathToAttach3);
            }
            i2++;
        }
        return true;
    }

    public void deleteDialog(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$deleteDialog$85(i, j);
            }
        });
    }

    public void lambda$deleteDialog$85(int r28, long r29) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteDialog$85(int, long):void");
    }

    public void lambda$deleteDialog$83(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$deleteDialog$84() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needReloadRecentDialogsSearch, new Object[0]);
    }

    public void onDeleteQueryComplete(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$onDeleteQueryComplete$86(j);
            }
        });
    }

    public void lambda$onDeleteQueryComplete$86(long j) throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void clearUserPhotos(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$clearUserPhotos$87(j);
            }
        });
    }

    public void lambda$clearUserPhotos$87(long j) throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM dialog_photos WHERE uid = " + j).stepThis().dispose();
            this.database.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void clearUserPhoto(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$clearUserPhoto$88(j, j2);
            }
        });
    }

    public void lambda$clearUserPhoto$88(long j, long j2) throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM dialog_photos WHERE uid = " + j + " AND id = " + j2).stepThis().dispose();
            this.database.executeFast("UPDATE dialog_photos_count SET count = count - 1 WHERE uid = " + j + " AND count > 0").stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void resetDialogs(final TLRPC.messages_Dialogs messages_dialogs, final int i, final int i2, final int i3, final int i4, final int i5, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2, final TLRPC.Message message, final int i6) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$resetDialogs$90(messages_dialogs, i6, i2, i3, i4, i5, message, i, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$resetDialogs$90(org.telegram.tgnet.TLRPC.messages_Dialogs r35, int r36, int r37, int r38, int r39, int r40, org.telegram.tgnet.TLRPC.Message r41, int r42, androidx.collection.LongSparseArray r43, androidx.collection.LongSparseArray r44) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$resetDialogs$90(org.telegram.tgnet.TLRPC$messages_Dialogs, int, int, int, int, int, org.telegram.tgnet.TLRPC$Message, int, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public static int lambda$resetDialogs$89(LongSparseIntArray longSparseIntArray, Long l, Long l2) {
        int i = longSparseIntArray.get(l.longValue());
        int i2 = longSparseIntArray.get(l2.longValue());
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public void emptyMessagesMedia(final long j, final ArrayList<Integer> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$emptyMessagesMedia$94(arrayList, j);
            }
        });
    }

    public void lambda$emptyMessagesMedia$94(java.util.ArrayList r18, long r19) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$emptyMessagesMedia$94(java.util.ArrayList, long):void");
    }

    public void lambda$emptyMessagesMedia$91(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, arrayList.get(i));
        }
    }

    public void lambda$emptyMessagesMedia$92(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    private void lambda$emptyMessagesMedia$93(ArrayList arrayList) {
        if (getMessagesController().getSavedMessagesController().updateSavedDialogs(arrayList)) {
            getMessagesController().getSavedMessagesController().update();
        }
    }

    public void toggleTodo(final long j, final int i, final int i2, final boolean z, final long j2) {
        final long clientUserId = getUserConfig().getClientUserId();
        final int currentTime = getConnectionsManager().getCurrentTime();
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$toggleTodo$95(j, i, clientUserId, j2, i2, z, currentTime);
            }
        });
    }

    public void lambda$toggleTodo$95(long r25, int r27, long r28, long r30, int r32, boolean r33, int r34) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$toggleTodo$95(long, int, long, long, int, boolean, int):void");
    }

    public void updateMessagePollResults(final long j, final TLRPC.Poll poll, final TLRPC.PollResults pollResults) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateMessagePollResults$96(j, poll, pollResults);
            }
        });
    }

    public void lambda$updateMessagePollResults$96(long r23, org.telegram.tgnet.TLRPC.Poll r25, org.telegram.tgnet.TLRPC.PollResults r26) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateMessagePollResults$96(long, org.telegram.tgnet.TLRPC$Poll, org.telegram.tgnet.TLRPC$PollResults):void");
    }

    public void searchSavedByTag(final TLRPC.Reaction reaction, final long j, final String str, final int i, final int i2, final Utilities.Callback4<ArrayList<MessageObject>, ArrayList<TLRPC.User>, ArrayList<TLRPC.Chat>, ArrayList<TLRPC.Document>> callback4, final boolean z) {
        if (callback4 == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$searchSavedByTag$98(str, j, reaction, i, i2, z, callback4);
            }
        });
    }

    public void lambda$searchSavedByTag$98(java.lang.String r38, long r39, org.telegram.tgnet.TLRPC.Reaction r41, int r42, int r43, boolean r44, final org.telegram.messenger.Utilities.Callback4 r45) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$searchSavedByTag$98(java.lang.String, long, org.telegram.tgnet.TLRPC$Reaction, int, int, boolean, org.telegram.messenger.Utilities$Callback4):void");
    }

    public void updateMessageReactions(final long j, final int i, final TLRPC.TL_messageReactions tL_messageReactions) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateMessageReactions$99(i, j, tL_messageReactions);
            }
        });
    }

    public void lambda$updateMessageReactions$99(int r22, long r23, org.telegram.tgnet.TLRPC.TL_messageReactions r25) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateMessageReactions$99(int, long, org.telegram.tgnet.TLRPC$TL_messageReactions):void");
    }

    private class SavedReactionsUpdate {
        TLRPC.TL_messageReactions last;
        TLRPC.TL_messageReactions old;
        long topic_id;

        public SavedReactionsUpdate(long j, TLRPC.Message message, TLRPC.Message message2) {
            this.topic_id = MessageObject.getSavedDialogId(j, message2);
            this.old = message.reactions;
            this.last = message2.reactions;
        }
    }

    private void onReactionsUpdate(final ArrayList<SavedReactionsUpdate> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onReactionsUpdate$100(arrayList);
            }
        });
    }

    public void lambda$onReactionsUpdate$100(ArrayList arrayList) {
        HashSet<Long> hashSet = new HashSet<>();
        LongSparseArray longSparseArray = new LongSparseArray();
        LongSparseArray longSparseArray2 = new LongSparseArray();
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            SavedReactionsUpdate savedReactionsUpdate = (SavedReactionsUpdate) arrayList.get(i);
            TLRPC.TL_messageReactions tL_messageReactions = savedReactionsUpdate.old;
            TLRPC.TL_messageReactions tL_messageReactions2 = savedReactionsUpdate.last;
            longSparseArray.clear();
            longSparseArray2.clear();
            if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                for (int i2 = 0; i2 < tL_messageReactions.results.size(); i2++) {
                    ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_messageReactions.results.get(i2).reaction);
                    if (visibleReactionFromTL != null) {
                        longSparseArray.put(visibleReactionFromTL.hash, visibleReactionFromTL);
                    }
                }
            }
            if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                for (int i3 = 0; i3 < tL_messageReactions2.results.size(); i3++) {
                    ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL2 = ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_messageReactions2.results.get(i3).reaction);
                    if (visibleReactionFromTL2 != null) {
                        longSparseArray2.put(visibleReactionFromTL2.hash, visibleReactionFromTL2);
                    }
                }
            }
            for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
                long jKeyAt = longSparseArray.keyAt(i4);
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) longSparseArray.valueAt(i4);
                if (!longSparseArray2.containsKey(jKeyAt) && getMessagesController().updateSavedReactionTags(savedReactionsUpdate.topic_id, visibleReaction, false, false)) {
                    hashSet.add(Long.valueOf(savedReactionsUpdate.topic_id));
                    z = true;
                }
            }
            for (int i5 = 0; i5 < longSparseArray2.size(); i5++) {
                long jKeyAt2 = longSparseArray2.keyAt(i5);
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = (ReactionsLayoutInBubble.VisibleReaction) longSparseArray2.valueAt(i5);
                if (!longSparseArray.containsKey(jKeyAt2) && getMessagesController().updateSavedReactionTags(savedReactionsUpdate.topic_id, visibleReaction2, true, false)) {
                    hashSet.add(Long.valueOf(savedReactionsUpdate.topic_id));
                    z = true;
                }
            }
        }
        if (!z || hashSet.isEmpty()) {
            return;
        }
        getMessagesController().updateSavedReactionTags(hashSet);
    }

    private void onReactionsUpdate(final long j, final TLRPC.TL_messageReactions tL_messageReactions, final TLRPC.TL_messageReactions tL_messageReactions2) {
        ArrayList<TLRPC.ReactionCount> arrayList;
        if (tL_messageReactions == null || (arrayList = tL_messageReactions.results) == null) {
            return;
        }
        if (arrayList.isEmpty() && tL_messageReactions2 != null && tL_messageReactions2.results.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onReactionsUpdate$101(tL_messageReactions, tL_messageReactions2, j);
            }
        });
    }

    public void lambda$onReactionsUpdate$101(TLRPC.TL_messageReactions tL_messageReactions, TLRPC.TL_messageReactions tL_messageReactions2, long j) {
        LongSparseArray longSparseArray = new LongSparseArray();
        LongSparseArray longSparseArray2 = new LongSparseArray();
        if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
            for (int i = 0; i < tL_messageReactions.results.size(); i++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_messageReactions.results.get(i).reaction);
                longSparseArray.put(visibleReactionFromTL.hash, visibleReactionFromTL);
            }
        }
        if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
            for (int i2 = 0; i2 < tL_messageReactions2.results.size(); i2++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL2 = ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_messageReactions2.results.get(i2).reaction);
                longSparseArray2.put(visibleReactionFromTL2.hash, visibleReactionFromTL2);
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            long jKeyAt = longSparseArray.keyAt(i3);
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) longSparseArray.valueAt(i3);
            if (!longSparseArray2.containsKey(jKeyAt)) {
                z = getMessagesController().updateSavedReactionTags(j, visibleReaction, false, false) || z;
            }
        }
        for (int i4 = 0; i4 < longSparseArray2.size(); i4++) {
            long jKeyAt2 = longSparseArray2.keyAt(i4);
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = (ReactionsLayoutInBubble.VisibleReaction) longSparseArray2.valueAt(i4);
            if (!longSparseArray.containsKey(jKeyAt2)) {
                z = getMessagesController().updateSavedReactionTags(j, visibleReaction2, true, false) || z;
            }
        }
        if (z) {
            if (j != 0) {
                getMessagesController().updateSavedReactionTags(0L);
            }
            getMessagesController().updateSavedReactionTags(j);
        }
    }

    private void bindMessageTags(SQLitePreparedStatement sQLitePreparedStatement, TLRPC.Message message) {
        ArrayList<TLRPC.ReactionCount> arrayList;
        long jHashCode;
        long clientUserId = getUserConfig().getClientUserId();
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions == null || !tL_messageReactions.reactions_as_tags || (arrayList = tL_messageReactions.results) == null || arrayList.isEmpty()) {
            return;
        }
        LocaleController localeController = LocaleController.getInstance();
        String str = message.message;
        if (str == null) {
            str = "";
        }
        String translitString = localeController.getTranslitString(str);
        Iterator<TLRPC.ReactionCount> it = message.reactions.results.iterator();
        while (it.hasNext()) {
            TLRPC.ReactionCount next = it.next();
            TLRPC.Reaction reaction = next.reaction;
            if ((reaction instanceof TLRPC.TL_reactionEmoji) || (reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, message.id);
                sQLitePreparedStatement.bindLong(2, MessageObject.getSavedDialogId(clientUserId, message));
                TLRPC.Reaction reaction2 = next.reaction;
                if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                    jHashCode = ((TLRPC.TL_reactionEmoji) reaction2).emoticon.hashCode();
                } else {
                    jHashCode = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id : 0L;
                }
                sQLitePreparedStatement.bindLong(3, jHashCode);
                sQLitePreparedStatement.bindString(4, translitString == null ? "" : translitString);
                sQLitePreparedStatement.step();
            }
        }
    }

    public void updateMessageVoiceTranscriptionOpen(final long j, final int i, final TLRPC.Message message) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateMessageVoiceTranscriptionOpen$102(i, j, message);
            }
        });
    }

    public void lambda$updateMessageVoiceTranscriptionOpen$102(int i, long j, TLRPC.Message message) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                TLRPC.Message messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(i, j);
                messageWithCustomParamsOnlyInternal.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionRated = message.voiceTranscriptionRated;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionForce = message.voiceTranscriptionForce;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionId = message.voiceTranscriptionId;
                for (int i2 = 0; i2 < 2; i2++) {
                    if (i2 == 0) {
                        sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        sQLitePreparedStatementExecuteFast.requery();
                        NativeByteBuffer nativeByteBufferWriteLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
                        if (nativeByteBufferWriteLocalParams != null) {
                            sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBufferWriteLocalParams);
                        } else {
                            sQLitePreparedStatementExecuteFast.bindNull(1);
                        }
                        sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                        sQLitePreparedStatementExecuteFast.bindLong(3, j);
                        sQLitePreparedStatementExecuteFast.step();
                        sQLitePreparedStatementExecuteFast.dispose();
                        if (nativeByteBufferWriteLocalParams != null) {
                            nativeByteBufferWriteLocalParams.reuse();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                this.database.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = this.database;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void updateMessageVoiceTranscription(final long j, final int i, final String str, final long j2, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateMessageVoiceTranscription$103(i, j, z, j2, str);
            }
        });
    }

    public void lambda$updateMessageVoiceTranscription$103(int i, long j, boolean z, long j2, String str) throws Throwable {
        TLRPC.Message messageWithCustomParamsOnlyInternal;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(i, j);
                messageWithCustomParamsOnlyInternal.voiceTranscriptionFinal = z;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionId = j2;
                messageWithCustomParamsOnlyInternal.voiceTranscription = str;
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBufferWriteLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
            if (nativeByteBufferWriteLocalParams != null) {
                sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBufferWriteLocalParams);
            } else {
                sQLitePreparedStatementExecuteFast.bindNull(1);
            }
            sQLitePreparedStatementExecuteFast.bindInteger(2, i);
            sQLitePreparedStatementExecuteFast.bindLong(3, j);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
            this.database.commitTransaction();
            if (nativeByteBufferWriteLocalParams != null) {
                nativeByteBufferWriteLocalParams.reuse();
            }
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            checkSQLException(e);
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            SQLiteDatabase sQLiteDatabase3 = this.database;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void updateMessageVoiceTranscription(final long j, final int i, final String str, final TLRPC.Message message) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateMessageVoiceTranscription$104(i, j, message, str);
            }
        });
    }

    public void lambda$updateMessageVoiceTranscription$104(int i, long j, TLRPC.Message message, String str) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                TLRPC.Message messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(i, j);
                messageWithCustomParamsOnlyInternal.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionRated = message.voiceTranscriptionRated;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionForce = message.voiceTranscriptionForce;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionId = message.voiceTranscriptionId;
                messageWithCustomParamsOnlyInternal.voiceTranscription = str;
                for (int i2 = 0; i2 < 2; i2++) {
                    if (i2 == 0) {
                        sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        sQLitePreparedStatementExecuteFast.requery();
                        NativeByteBuffer nativeByteBufferWriteLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
                        if (nativeByteBufferWriteLocalParams != null) {
                            sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBufferWriteLocalParams);
                        } else {
                            sQLitePreparedStatementExecuteFast.bindNull(1);
                        }
                        sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                        sQLitePreparedStatementExecuteFast.bindLong(3, j);
                        sQLitePreparedStatementExecuteFast.step();
                        sQLitePreparedStatementExecuteFast.dispose();
                        this.database.commitTransaction();
                        if (nativeByteBufferWriteLocalParams != null) {
                            nativeByteBufferWriteLocalParams.reuse();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                SQLiteDatabase sQLiteDatabase3 = this.database;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void updateMessageCustomParams(final long j, final TLRPC.Message message) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateMessageCustomParams$105(message, j);
            }
        });
    }

    public void lambda$updateMessageCustomParams$105(TLRPC.Message message, long j) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                TLRPC.Message messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(message.id, j);
                MessageCustomParamsHelper.copyParams(message, messageWithCustomParamsOnlyInternal);
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        sQLitePreparedStatementExecuteFast.requery();
                        NativeByteBuffer nativeByteBufferWriteLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
                        if (nativeByteBufferWriteLocalParams != null) {
                            sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBufferWriteLocalParams);
                        } else {
                            sQLitePreparedStatementExecuteFast.bindNull(1);
                        }
                        sQLitePreparedStatementExecuteFast.bindInteger(2, message.id);
                        sQLitePreparedStatementExecuteFast.bindLong(3, j);
                        sQLitePreparedStatementExecuteFast.step();
                        sQLitePreparedStatementExecuteFast.dispose();
                        if (nativeByteBufferWriteLocalParams != null) {
                            nativeByteBufferWriteLocalParams.reuse();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                this.database.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = this.database;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public TLRPC.Message getMessageWithCustomParamsOnlyInternal(int i, long j) throws Throwable {
        SQLiteCursor sQLiteCursorQueryFinalized;
        boolean z;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        SQLiteCursor sQLiteCursorQueryFinalized2 = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT custom_params FROM messages_v2 WHERE mid = ? AND uid = ?", Integer.valueOf(i), Long.valueOf(j));
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (sQLiteCursorQueryFinalized.next()) {
                MessageCustomParamsHelper.readLocalParams(tL_message, sQLiteCursorQueryFinalized.byteBufferValue(0));
                z = true;
            } else {
                z = false;
            }
            sQLiteCursorQueryFinalized.dispose();
            if (!z) {
                sQLiteCursorQueryFinalized2 = this.database.queryFinalized("SELECT custom_params FROM messages_topics WHERE mid = ? AND uid = ?", Integer.valueOf(i), Long.valueOf(j));
                if (sQLiteCursorQueryFinalized2.next()) {
                    MessageCustomParamsHelper.readLocalParams(tL_message, sQLiteCursorQueryFinalized2.byteBufferValue(0));
                }
                sQLiteCursorQueryFinalized2.dispose();
            }
        } catch (SQLiteException e2) {
            e = e2;
            sQLiteCursorQueryFinalized2 = sQLiteCursorQueryFinalized;
            checkSQLException(e);
            if (sQLiteCursorQueryFinalized2 != null) {
                sQLiteCursorQueryFinalized2.dispose();
            }
            return tL_message;
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursorQueryFinalized2 = sQLiteCursorQueryFinalized;
            if (sQLiteCursorQueryFinalized2 != null) {
                sQLiteCursorQueryFinalized2.dispose();
            }
            throw th;
        }
        return tL_message;
    }

    public void getNewTask(final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$getNewTask$106(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getNewTask$106(androidx.collection.LongSparseArray r14, androidx.collection.LongSparseArray r15) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getNewTask$106(androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public void markMentionMessageAsRead(final long j, final int i, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$markMentionMessageAsRead$107(i, j, j2);
            }
        });
    }

    public void lambda$markMentionMessageAsRead$107(int i, long j, long j2) throws Throwable {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast(String.format(locale, "UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
                SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j2, new Object[0]);
                try {
                    int iMax = sQLiteCursorQueryFinalized.next() ? Math.max(0, sQLiteCursorQueryFinalized.intValue(0) - 1) : 0;
                    sQLiteCursorQueryFinalized.dispose();
                    this.database.executeFast(String.format(locale, "UPDATE dialogs SET unread_count_i = %d WHERE did = %d", Integer.valueOf(iMax), Long.valueOf(j2))).stepThis().dispose();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j2, iMax);
                    if (iMax == 0) {
                        updateFiltersReadCounter(null, longSparseIntArray, true);
                    }
                    getMessagesController().processDialogsUpdateRead(null, longSparseIntArray);
                    this.database.executeFast(String.format(locale, "UPDATE messages_topics SET read_state = read_state | 2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
                    sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(locale, "SELECT data FROM messages_topics WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j)), new Object[0]);
                    long topicId = 0;
                    while (sQLiteCursorQueryFinalized.next()) {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                            nativeByteBufferByteBufferValue.reuse();
                            topicId = MessageObject.getTopicId(this.currentAccount, messageTLdeserialize, getForumTypeFlags(j));
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    if (topicId != 0) {
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        Locale locale2 = Locale.US;
                        SQLiteCursor sQLiteCursorQueryFinalized2 = sQLiteDatabase2.queryFinalized(String.format(locale2, "SELECT unread_mentions FROM topics WHERE did = %d AND topic_id = %d", Long.valueOf(j2), Long.valueOf(topicId)), new Object[0]);
                        try {
                            int iMax2 = sQLiteCursorQueryFinalized2.next() ? Math.max(0, sQLiteCursorQueryFinalized2.intValue(0) - 1) : 0;
                            sQLiteCursorQueryFinalized2.dispose();
                            this.database.executeFast(String.format(locale2, "UPDATE topics SET unread_mentions = %d WHERE did = %d AND topic_id = %d", Integer.valueOf(iMax2), Long.valueOf(j), Long.valueOf(topicId))).stepThis().dispose();
                            getMessagesController().getTopicsController().updateMentionsUnread(j, topicId, iMax2);
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = sQLiteCursorQueryFinalized2;
                            checkSQLException(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = sQLiteCursorQueryFinalized2;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = sQLiteCursorQueryFinalized;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = sQLiteCursorQueryFinalized;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void markMessageAsMention(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$markMessageAsMention$108(i, j);
            }
        });
    }

    public void lambda$markMessageAsMention$108(int i, long j) throws InterruptedException {
        try {
            this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void resetMentionsCount(final long j, final long j2, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$resetMentionsCount$109(j2, j, i);
            }
        });
    }

    public void lambda$resetMentionsCount$109(long r17, long r19, int r21) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$resetMentionsCount$109(long, long, int):void");
    }

    public void createTaskForMid(final long j, final int i, final int i2, final int i3, final int i4, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$createTaskForMid$111(i2, i3, i4, i, z, j);
            }
        });
    }

    public void lambda$createTaskForMid$111(int i, int i2, int i3, int i4, final boolean z, final long j) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                int iMax = Math.max(i, i2) + i3;
                SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
                final ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(i4));
                sparseArray.put(iMax, arrayList);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createTaskForMid$110(z, j, arrayList);
                    }
                });
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                    try {
                        int iKeyAt = sparseArray.keyAt(i5);
                        ArrayList<Integer> arrayList2 = sparseArray.get(iKeyAt);
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            sQLitePreparedStatementExecuteFast.requery();
                            sQLitePreparedStatementExecuteFast.bindInteger(1, arrayList2.get(i6).intValue());
                            sQLitePreparedStatementExecuteFast.bindLong(2, j);
                            sQLitePreparedStatementExecuteFast.bindInteger(3, iKeyAt);
                            sQLitePreparedStatementExecuteFast.bindInteger(4, 1);
                            sQLitePreparedStatementExecuteFast.step();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        checkSQLException(e);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                sQLitePreparedStatementExecuteFast.dispose();
                this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET ttl = 0 WHERE mid = %d AND uid = %d", Integer.valueOf(i4), Long.valueOf(j))).stepThis().dispose();
                getMessagesController().didAddedNewTask(iMax, j, sparseArray);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void lambda$createTaskForMid$110(boolean z, long j, ArrayList arrayList) {
        if (!z) {
            markMessagesContentAsRead(j, arrayList, 0, 0);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesReadContent, Long.valueOf(j), arrayList);
    }

    private void createTaskForSecretMedia(long r17, android.util.SparseArray<java.util.ArrayList<java.lang.Integer>> r19) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.createTaskForSecretMedia(long, android.util.SparseArray):void");
    }

    public void createTaskForSecretChat(final int i, final int i2, final int i3, final int i4, final ArrayList<Long> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$createTaskForSecretChat$113(i, arrayList, i4, i2, i3);
            }
        });
    }

    public void lambda$createTaskForSecretChat$113(int r20, java.util.ArrayList r21, int r22, int r23, int r24) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$createTaskForSecretChat$113(int, java.util.ArrayList, int, int, int):void");
    }

    public void lambda$createTaskForSecretChat$112(long j, ArrayList arrayList) {
        markMessagesContentAsRead(j, arrayList, 0, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesReadContent, Long.valueOf(j), arrayList);
    }

    private void updateFiltersReadCounter(org.telegram.messenger.support.LongSparseIntArray r29, org.telegram.messenger.support.LongSparseIntArray r30, boolean r31) throws java.lang.InterruptedException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateFiltersReadCounter(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, boolean):void");
    }

    public void lambda$updateFiltersReadCounter$114() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).unreadCount = arrayList.get(i).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
    }

    private void updateDialogsWithReadMessagesInternal(ArrayList<Integer> arrayList, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, LongSparseArray longSparseArray, LongSparseIntArray longSparseIntArray3) throws InterruptedException {
        LongSparseIntArray longSparseIntArray4;
        ArrayList<Long> arrayList2;
        ArrayList<Long> arrayList3;
        LongSparseIntArray longSparseIntArray5;
        boolean z;
        int i;
        String str;
        ArrayList<Long> arrayList4;
        LongSparseIntArray longSparseIntArray6;
        int i2;
        int i3;
        int i4;
        LongSparseIntArray longSparseIntArray7 = longSparseIntArray;
        int i5 = 2;
        int i6 = 0;
        try {
            LongSparseIntArray longSparseIntArray8 = new LongSparseIntArray();
            LongSparseIntArray longSparseIntArray9 = new LongSparseIntArray();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            String str2 = ",";
            if (!isEmpty(arrayList)) {
                SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT uid, read_state, out FROM messages_v2 WHERE mid IN(%s) AND is_channel = 0", TextUtils.join(",", arrayList)), new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    if (sQLiteCursorQueryFinalized.intValue(2) == 0 && sQLiteCursorQueryFinalized.intValue(1) == 0) {
                        long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                        int i7 = longSparseIntArray8.get(jLongValue);
                        if (i7 == 0) {
                            longSparseIntArray8.put(jLongValue, 1);
                        } else {
                            longSparseIntArray8.put(jLongValue, i7 + 1);
                        }
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                arrayList2 = arrayList5;
                longSparseIntArray4 = longSparseIntArray9;
            } else {
                if (!isEmpty(longSparseIntArray)) {
                    int i8 = 0;
                    while (i8 < longSparseIntArray.size()) {
                        LongSparseIntArray longSparseIntArray10 = longSparseIntArray9;
                        long jKeyAt = longSparseIntArray7.keyAt(i8);
                        int i9 = longSparseIntArray7.get(jKeyAt);
                        int i10 = longSparseIntArray3 == null ? -2 : longSparseIntArray3.get(jKeyAt, -2);
                        if (i10 >= 0) {
                            longSparseIntArray8.put(jKeyAt, i10);
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d(jKeyAt + " update unread messages count by still unread " + i10);
                            }
                            i = i8;
                        } else {
                            if (longSparseIntArray3 == null || i10 == -2) {
                                z = true;
                            } else {
                                SQLiteCursor sQLiteCursorQueryFinalized2 = this.database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM messages_holes WHERE uid = %d AND end > %d", Long.valueOf(jKeyAt), Integer.valueOf(i9)), new Object[0]);
                                z = true;
                                while (sQLiteCursorQueryFinalized2.next()) {
                                    z = false;
                                }
                                sQLiteCursorQueryFinalized2.dispose();
                            }
                            if (z) {
                                i = i8;
                                SQLiteCursor sQLiteCursorQueryFinalized3 = this.database.queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM messages_v2 WHERE uid = %d AND mid > %d AND read_state IN(0,2) AND out = 0", Long.valueOf(jKeyAt), Integer.valueOf(i9)), new Object[0]);
                                if (sQLiteCursorQueryFinalized3.next()) {
                                    int iIntValue = sQLiteCursorQueryFinalized3.intValue(0);
                                    longSparseIntArray8.put(jKeyAt, iIntValue);
                                    if (BuildVars.DEBUG_VERSION) {
                                        FileLog.d(jKeyAt + " update unread messages count " + iIntValue);
                                    }
                                } else if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d(jKeyAt + " can't update unread messages count cursor trouble");
                                }
                                sQLiteCursorQueryFinalized3.dispose();
                            } else {
                                i = i8;
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d(jKeyAt + " can't update unread messages count");
                                }
                            }
                        }
                        SQLiteCursor sQLiteCursorQueryFinalized4 = this.database.queryFinalized("SELECT inbox_max FROM dialogs WHERE did = " + jKeyAt, new Object[0]);
                        int iIntValue2 = sQLiteCursorQueryFinalized4.next() ? sQLiteCursorQueryFinalized4.intValue(0) : 0;
                        sQLiteCursorQueryFinalized4.dispose();
                        FileLog.d(jKeyAt + " set inbox max " + i9);
                        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE dialogs SET inbox_max = max((SELECT inbox_max FROM dialogs WHERE did = ?), ?) WHERE did = ?");
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindLong(1, jKeyAt);
                        sQLitePreparedStatementExecuteFast.bindInteger(2, i9);
                        sQLitePreparedStatementExecuteFast.bindLong(3, jKeyAt);
                        sQLitePreparedStatementExecuteFast.step();
                        sQLitePreparedStatementExecuteFast.dispose();
                        if (isForum(jKeyAt, 14)) {
                            i2 = i;
                            str = str2;
                            arrayList4 = arrayList5;
                            longSparseIntArray6 = longSparseIntArray10;
                            updateTopicsWithReadFromAllInternal(jKeyAt, iIntValue2, i9);
                        } else {
                            str = str2;
                            arrayList4 = arrayList5;
                            longSparseIntArray6 = longSparseIntArray10;
                            i2 = i;
                        }
                        i8 = i2 + 1;
                        longSparseIntArray7 = longSparseIntArray;
                        str2 = str;
                        longSparseIntArray9 = longSparseIntArray6;
                        arrayList5 = arrayList4;
                    }
                }
                String str3 = str2;
                LongSparseIntArray longSparseIntArray11 = longSparseIntArray9;
                ArrayList<Long> arrayList6 = arrayList5;
                if (!isEmpty(longSparseArray)) {
                    int size = longSparseArray.size();
                    int i11 = 0;
                    while (i11 < size) {
                        ArrayList arrayList7 = (ArrayList) longSparseArray.valueAt(i11);
                        ArrayList arrayList8 = new ArrayList(arrayList7);
                        SQLiteCursor sQLiteCursorQueryFinalized5 = this.database.queryFinalized(String.format(Locale.US, "SELECT uid, read_state, out, mention, mid, is_channel FROM messages_v2 WHERE mid IN(%s)", TextUtils.join(str3, arrayList7)), new Object[0]);
                        long jLongValue2 = 0;
                        while (sQLiteCursorQueryFinalized5.next()) {
                            long jLongValue3 = sQLiteCursorQueryFinalized5.longValue(0);
                            arrayList8.remove(Integer.valueOf(sQLiteCursorQueryFinalized5.intValue(4)));
                            if (sQLiteCursorQueryFinalized5.intValue(1) < i5 && sQLiteCursorQueryFinalized5.intValue(i5) == 0 && sQLiteCursorQueryFinalized5.intValue(3) == 1) {
                                longSparseIntArray5 = longSparseIntArray11;
                                int i12 = longSparseIntArray5.get(jLongValue3, -1);
                                if (i12 < 0) {
                                    SQLiteCursor sQLiteCursorQueryFinalized6 = this.database.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + jLongValue3, new Object[0]);
                                    int iIntValue3 = sQLiteCursorQueryFinalized6.next() ? sQLiteCursorQueryFinalized6.intValue(0) : 0;
                                    sQLiteCursorQueryFinalized6.dispose();
                                    longSparseIntArray5.put(jLongValue3, Math.max(0, iIntValue3 - 1));
                                } else {
                                    longSparseIntArray5.put(jLongValue3, Math.max(0, i12 - 1));
                                }
                            } else {
                                longSparseIntArray5 = longSparseIntArray11;
                            }
                            jLongValue2 = sQLiteCursorQueryFinalized5.longValue(5);
                            longSparseIntArray11 = longSparseIntArray5;
                            i5 = 2;
                        }
                        LongSparseIntArray longSparseIntArray12 = longSparseIntArray11;
                        sQLiteCursorQueryFinalized5.dispose();
                        if (arrayList8.isEmpty() || jLongValue2 == 0) {
                            arrayList3 = arrayList6;
                        } else {
                            arrayList3 = arrayList6;
                            if (!arrayList3.contains(Long.valueOf(jLongValue2))) {
                                arrayList3.add(Long.valueOf(jLongValue2));
                            }
                        }
                        i11++;
                        arrayList6 = arrayList3;
                        longSparseIntArray11 = longSparseIntArray12;
                        i5 = 2;
                    }
                }
                longSparseIntArray4 = longSparseIntArray11;
                arrayList2 = arrayList6;
                if (!isEmpty(longSparseIntArray2)) {
                    for (int i13 = 0; i13 < longSparseIntArray2.size(); i13++) {
                        long jKeyAt2 = longSparseIntArray2.keyAt(i13);
                        int i14 = longSparseIntArray2.get(jKeyAt2);
                        SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = this.database.executeFast("UPDATE dialogs SET outbox_max = max((SELECT outbox_max FROM dialogs WHERE did = ?), ?) WHERE did = ?");
                        sQLitePreparedStatementExecuteFast2.requery();
                        sQLitePreparedStatementExecuteFast2.bindLong(1, jKeyAt2);
                        sQLitePreparedStatementExecuteFast2.bindInteger(2, i14);
                        sQLitePreparedStatementExecuteFast2.bindLong(3, jKeyAt2);
                        sQLitePreparedStatementExecuteFast2.step();
                        sQLitePreparedStatementExecuteFast2.dispose();
                    }
                }
            }
            if (longSparseIntArray8.size() > 0 || longSparseIntArray4.size() > 0) {
                this.database.beginTransaction();
                if (longSparseIntArray8.size() > 0) {
                    ArrayList<Long> arrayList9 = new ArrayList<>();
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast3 = this.database.executeFast("UPDATE dialogs SET unread_count = ? WHERE did = ?");
                    int i15 = 0;
                    while (i15 < longSparseIntArray8.size()) {
                        long jKeyAt3 = longSparseIntArray8.keyAt(i15);
                        if (isForum(jKeyAt3, 13)) {
                            longSparseIntArray8.removeAt(i15);
                        } else {
                            int iValueAt = longSparseIntArray8.valueAt(i15);
                            SQLiteCursor sQLiteCursorQueryFinalized7 = this.database.queryFinalized("SELECT unread_count FROM dialogs WHERE did = " + jKeyAt3, new Object[0]);
                            int iIntValue4 = sQLiteCursorQueryFinalized7.next() ? sQLiteCursorQueryFinalized7.intValue(0) : 0;
                            sQLiteCursorQueryFinalized7.dispose();
                            if (iIntValue4 == iValueAt) {
                                longSparseIntArray8.removeAt(i15);
                            } else {
                                sQLitePreparedStatementExecuteFast3.requery();
                                i4 = 1;
                                sQLitePreparedStatementExecuteFast3.bindInteger(1, iValueAt);
                                sQLitePreparedStatementExecuteFast3.bindLong(2, jKeyAt3);
                                sQLitePreparedStatementExecuteFast3.step();
                                arrayList9.add(Long.valueOf(jKeyAt3));
                                i15 += i4;
                            }
                        }
                        i15--;
                        i4 = 1;
                        i15 += i4;
                    }
                    sQLitePreparedStatementExecuteFast3.dispose();
                    updateWidgets(arrayList9);
                }
                if (longSparseIntArray4.size() > 0) {
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast4 = this.database.executeFast("UPDATE dialogs SET unread_count_i = ? WHERE did = ?");
                    while (i6 < longSparseIntArray4.size()) {
                        long jKeyAt4 = longSparseIntArray4.keyAt(i6);
                        if (isForum(jKeyAt4, 13)) {
                            longSparseIntArray4.removeAt(i6);
                            i6--;
                            i3 = 1;
                        } else {
                            sQLitePreparedStatementExecuteFast4.requery();
                            i3 = 1;
                            sQLitePreparedStatementExecuteFast4.bindInteger(1, longSparseIntArray4.valueAt(i6));
                            sQLitePreparedStatementExecuteFast4.bindLong(2, jKeyAt4);
                            sQLitePreparedStatementExecuteFast4.step();
                        }
                        i6 += i3;
                    }
                    sQLitePreparedStatementExecuteFast4.dispose();
                }
                this.database.commitTransaction();
            }
            updateFiltersReadCounter(longSparseIntArray8, longSparseIntArray4, true);
            getMessagesController().processDialogsUpdateRead(longSparseIntArray8, longSparseIntArray4);
            if (arrayList2.isEmpty()) {
                return;
            }
            getMessagesController().reloadMentionsCountForChannels(arrayList2);
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    private static boolean isEmpty(SparseArray<?> sparseArray) {
        return sparseArray == null || sparseArray.size() == 0;
    }

    private static boolean isEmpty(LongSparseIntArray longSparseIntArray) {
        return longSparseIntArray == null || longSparseIntArray.size() == 0;
    }

    private static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    private static boolean isEmpty(SparseIntArray sparseIntArray) {
        return sparseIntArray == null || sparseIntArray.size() == 0;
    }

    private static boolean isEmpty(LongSparseArray longSparseArray) {
        return longSparseArray == null || longSparseArray.size() == 0;
    }

    public void updateDialogsWithReadMessages(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final LongSparseArray longSparseArray, final LongSparseIntArray longSparseIntArray3, boolean z) {
        if (isEmpty(longSparseIntArray) && isEmpty(longSparseIntArray2) && isEmpty(longSparseArray) && isEmpty(longSparseIntArray3)) {
            return;
        }
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws InterruptedException {
                    this.f$0.lambda$updateDialogsWithReadMessages$115(longSparseIntArray, longSparseIntArray2, longSparseArray, longSparseIntArray3);
                }
            });
        } else {
            updateDialogsWithReadMessagesInternal(null, longSparseIntArray, longSparseIntArray2, longSparseArray, longSparseIntArray3);
        }
    }

    public void lambda$updateDialogsWithReadMessages$115(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, LongSparseArray longSparseArray, LongSparseIntArray longSparseIntArray3) throws InterruptedException {
        updateDialogsWithReadMessagesInternal(null, longSparseIntArray, longSparseIntArray2, longSparseArray, longSparseIntArray3);
    }

    public void updateChatParticipants(final TLRPC.ChatParticipants chatParticipants) {
        if (chatParticipants == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateChatParticipants$117(chatParticipants);
            }
        });
    }

    public void lambda$updateChatParticipants$117(TLRPC.ChatParticipants chatParticipants) throws Throwable {
        SQLiteCursor sQLiteCursorQueryFinalized;
        final TLRPC.ChatFull chatFullTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            new ArrayList();
            if (!sQLiteCursorQueryFinalized.next() || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                chatFullTLdeserialize = null;
            } else {
                chatFullTLdeserialize = TLRPC.ChatFull.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                nativeByteBufferByteBufferValue.reuse();
                chatFullTLdeserialize.pinned_msg_id = sQLiteCursorQueryFinalized.intValue(1);
                chatFullTLdeserialize.online_count = sQLiteCursorQueryFinalized.intValue(2);
                chatFullTLdeserialize.inviterId = sQLiteCursorQueryFinalized.longValue(3);
            }
            sQLiteCursorQueryFinalized.dispose();
            if (chatFullTLdeserialize instanceof TLRPC.TL_chatFull) {
                chatFullTLdeserialize.participants = chatParticipants;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$updateChatParticipants$116(chatFullTLdeserialize);
                    }
                });
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chatFullTLdeserialize.getObjectSize());
                chatFullTLdeserialize.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindLong(1, chatFullTLdeserialize.id);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindInteger(3, chatFullTLdeserialize.pinned_msg_id);
                sQLitePreparedStatementExecuteFast.bindInteger(4, chatFullTLdeserialize.online_count);
                sQLitePreparedStatementExecuteFast.bindLong(5, chatFullTLdeserialize.inviterId);
                sQLitePreparedStatementExecuteFast.bindInteger(6, chatFullTLdeserialize.invitesCount);
                sQLitePreparedStatementExecuteFast.bindInteger(7, chatFullTLdeserialize.participants_count);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                nativeByteBuffer.reuse();
            }
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateChatParticipants$116(TLRPC.ChatFull chatFull) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, chatFull, 0, bool, bool);
    }

    public void loadChannelAdmins(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$loadChannelAdmins$118(j);
            }
        });
    }

    public void lambda$loadChannelAdmins$118(long j) throws Throwable {
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j, new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            LongSparseArray longSparseArray = new LongSparseArray();
            while (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(1);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.ChannelParticipant channelParticipantTLdeserialize = TLRPC.ChannelParticipant.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    nativeByteBufferByteBufferValue.reuse();
                    if (channelParticipantTLdeserialize != null) {
                        longSparseArray.put(sQLiteCursorQueryFinalized.longValue(0), channelParticipantTLdeserialize);
                    }
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            getMessagesController().processLoadedChannelAdmins(longSparseArray, j, true);
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void putChannelAdmins(final long j, final LongSparseArray longSparseArray) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$putChannelAdmins$119(j, longSparseArray);
            }
        });
    }

    public void lambda$putChannelAdmins$119(long j, LongSparseArray longSparseArray) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j).stepThis().dispose();
                this.database.beginTransaction();
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                for (int i = 0; i < longSparseArray.size(); i++) {
                    try {
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindLong(1, j);
                        sQLitePreparedStatementExecuteFast.bindLong(2, longSparseArray.keyAt(i));
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) longSparseArray.valueAt(i);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                        channelParticipant.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.step();
                        nativeByteBuffer.reuse();
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                sQLitePreparedStatementExecuteFast.dispose();
                this.database.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = this.database;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void updateChannelUsers(final long j, final ArrayList<TLRPC.ChannelParticipant> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateChannelUsers$120(j, arrayList);
            }
        });
    }

    public void lambda$updateChannelUsers$120(long j, ArrayList arrayList) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        long j2 = -j;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j2).stepThis().dispose();
                this.database.beginTransaction();
                sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) arrayList.get(i);
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, j2);
                sQLitePreparedStatementExecuteFast.bindLong(2, MessageObject.getPeerId(channelParticipant.peer));
                sQLitePreparedStatementExecuteFast.bindInteger(3, iCurrentTimeMillis);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                channelParticipant.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                iCurrentTimeMillis--;
            }
            sQLitePreparedStatementExecuteFast.dispose();
            this.database.commitTransaction();
            loadChatInfo(j, true, null, false, true);
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            checkSQLException(e);
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            SQLiteDatabase sQLiteDatabase3 = this.database;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void saveBotCache(final String str, final TLObject tLObject) {
        if (tLObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$saveBotCache$121(tLObject, str);
            }
        });
    }

    public void lambda$saveBotCache$121(TLObject tLObject, String str) throws Throwable {
        int currentTime;
        int i;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                currentTime = getConnectionsManager().getCurrentTime();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (tLObject instanceof TLRPC.TL_messages_botCallbackAnswer) {
                i = ((TLRPC.TL_messages_botCallbackAnswer) tLObject).cache_time;
            } else {
                if (tLObject instanceof TLRPC.TL_messages_botResults) {
                    i = ((TLRPC.TL_messages_botResults) tLObject).cache_time;
                }
                sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
                tLObject.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindString(1, str);
                sQLitePreparedStatementExecuteFast.bindInteger(2, currentTime);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                nativeByteBuffer.reuse();
                return;
            }
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer2);
            sQLitePreparedStatementExecuteFast.bindString(1, str);
            sQLitePreparedStatementExecuteFast.bindInteger(2, currentTime);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer2);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
            nativeByteBuffer2.reuse();
            return;
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            checkSQLException(e);
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
                return;
            }
            return;
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
        currentTime += i;
        sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
    }

    public void getBotCache(final String str, final RequestDelegate requestDelegate) {
        if (str == null || requestDelegate == null) {
            return;
        }
        final int currentTime = getConnectionsManager().getCurrentTime();
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$getBotCache$122(currentTime, str, requestDelegate);
            }
        });
    }

    public void lambda$getBotCache$122(int r6, java.lang.String r7, org.telegram.tgnet.RequestDelegate r8) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getBotCache$122(int, java.lang.String, org.telegram.tgnet.RequestDelegate):void");
    }

    public ArrayList<TLRPC.UserFull> loadUserInfos(HashSet<Long> hashSet) throws InterruptedException {
        ArrayList<TLRPC.UserFull> arrayList = new ArrayList<>();
        try {
            String strJoin = TextUtils.join(",", hashSet);
            SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid IN(" + strJoin + ")", new Object[0]);
            while (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.UserFull userFullTLdeserialize = TLRPC.UserFull.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    userFullTLdeserialize.pinned_msg_id = sQLiteCursorQueryFinalized.intValue(1);
                    arrayList.add(userFullTLdeserialize);
                    nativeByteBufferByteBufferValue.reuse();
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return arrayList;
    }

    public void loadUserInfo(final TLRPC.User user, final boolean z, final int i, int i2) {
        if (user == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$loadUserInfo$124(user, z, i);
            }
        });
    }

    public void lambda$loadUserInfo$124(org.telegram.tgnet.TLRPC.User r20, boolean r21, int r22) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadUserInfo$124(org.telegram.tgnet.TLRPC$User, boolean, int):void");
    }

    public void lambda$loadUserInfo$123(ArrayList arrayList) {
        getMessagesController().putChats(arrayList, true);
    }

    public void updateUserInfo(final TLRPC.UserFull userFull, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateUserInfo$125(userFull, z);
            }
        });
    }

    public void lambda$updateUserInfo$125(org.telegram.tgnet.TLRPC.UserFull r10, boolean r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateUserInfo$125(org.telegram.tgnet.TLRPC$UserFull, boolean):void");
    }

    public void updateUserInfoContactBlocked(final long j, final TL_account.RequirementToContact requirementToContact) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateUserInfoContactBlocked$126(j, requirementToContact);
            }
        });
    }

    public void lambda$updateUserInfoContactBlocked$126(long j, TL_account.RequirementToContact requirementToContact) throws Throwable {
        SQLiteCursor sQLiteCursorQueryFinalized;
        TLRPC.UserFull userFullTLdeserialize;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j, new Object[0]);
            try {
                try {
                    boolean next = sQLiteCursorQueryFinalized.next();
                    if (next) {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(1);
                        userFullTLdeserialize = TLRPC.UserFull.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                        if (userFullTLdeserialize != null) {
                            userFullTLdeserialize.pinned_msg_id = sQLiteCursorQueryFinalized.intValue(2);
                        }
                        nativeByteBufferByteBufferValue.reuse();
                    } else {
                        userFullTLdeserialize = null;
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    if (next && userFullTLdeserialize != null && UserObject.applyRequirementToContact(userFullTLdeserialize, requirementToContact)) {
                        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                        try {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFullTLdeserialize.getObjectSize());
                            userFullTLdeserialize.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatementExecuteFast.bindLong(1, j);
                            sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                            sQLitePreparedStatementExecuteFast.bindInteger(3, userFullTLdeserialize.pinned_msg_id);
                            sQLitePreparedStatementExecuteFast.step();
                            sQLitePreparedStatementExecuteFast.dispose();
                            nativeByteBuffer.reuse();
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursorQueryFinalized = null;
                            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                            checkSQLException(e);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursorQueryFinalized != null) {
                                sQLiteCursorQueryFinalized.dispose();
                            }
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursorQueryFinalized = null;
                            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursorQueryFinalized != null) {
                                sQLiteCursorQueryFinalized.dispose();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteCursorQueryFinalized = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursorQueryFinalized = null;
        }
    }

    public void saveChatInviter(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveChatInviter$127(j2, j);
            }
        });
    }

    public void lambda$saveChatInviter$127(long j, long j2) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE chat_settings_v2 SET inviter = ? WHERE uid = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, j);
                sQLitePreparedStatementExecuteFast.bindLong(2, j2);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void saveChatLinksCount(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveChatLinksCount$128(i, j);
            }
        });
    }

    public void lambda$saveChatLinksCount$128(int i, long j) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                sQLitePreparedStatementExecuteFast.bindLong(2, j);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void updateChatInfo(final TLRPC.ChatFull chatFull, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateChatInfo$129(chatFull, z);
            }
        });
    }

    public void lambda$updateChatInfo$129(org.telegram.tgnet.TLRPC.ChatFull r12, boolean r13) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateChatInfo$129(org.telegram.tgnet.TLRPC$ChatFull, boolean):void");
    }

    public void updateChatOnlineCount(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateChatOnlineCount$130(i, j);
            }
        });
    }

    public void lambda$updateChatOnlineCount$130(int i, long j) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                sQLitePreparedStatementExecuteFast.bindLong(2, j);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void updatePinnedMessages(final long j, final ArrayList<Integer> arrayList, final boolean z, final int i, final int i2, final boolean z2, final HashMap<Integer, MessageObject> map) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updatePinnedMessages$133(z, map, i2, j, arrayList, i, z2);
            }
        });
    }

    public void lambda$updatePinnedMessages$133(

    public void lambda$updatePinnedMessages$131(long j, ArrayList arrayList, HashMap map, int i, int i2, boolean z) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(j), arrayList, Boolean.TRUE, null, map, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public void lambda$updatePinnedMessages$132(long j, ArrayList arrayList, HashMap map, int i, int i2, boolean z) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(j), arrayList, Boolean.FALSE, null, map, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public void updateChatInfo(final long j, final long j2, final int i, final long j3, final int i2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateChatInfo$135(j, i, j2, j3, i2);
            }
        });
    }

    public void lambda$updateChatInfo$135(long j, int i, long j2, long j3, int i2) throws Throwable {
        int i3;
        SQLiteCursor sQLiteCursorQueryFinalized;
        final TLRPC.ChatFull chatFullTLdeserialize;
        TLRPC.ChatParticipant tL_chatParticipant;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                i3 = 0;
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + j, new Object[0]);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            new ArrayList();
            if (!sQLiteCursorQueryFinalized.next() || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                chatFullTLdeserialize = null;
            } else {
                chatFullTLdeserialize = TLRPC.ChatFull.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                nativeByteBufferByteBufferValue.reuse();
                chatFullTLdeserialize.pinned_msg_id = sQLiteCursorQueryFinalized.intValue(1);
                chatFullTLdeserialize.online_count = sQLiteCursorQueryFinalized.intValue(2);
                chatFullTLdeserialize.inviterId = sQLiteCursorQueryFinalized.longValue(3);
            }
            sQLiteCursorQueryFinalized.dispose();
            if (chatFullTLdeserialize instanceof TLRPC.TL_chatFull) {
                if (i == 1) {
                    while (true) {
                        if (i3 >= chatFullTLdeserialize.participants.participants.size()) {
                            break;
                        }
                        if (chatFullTLdeserialize.participants.participants.get(i3).user_id == j2) {
                            chatFullTLdeserialize.participants.participants.remove(i3);
                            break;
                        }
                        i3++;
                    }
                } else if (i == 0) {
                    Iterator<TLRPC.ChatParticipant> it = chatFullTLdeserialize.participants.participants.iterator();
                    while (it.hasNext()) {
                        if (it.next().user_id == j2) {
                            return;
                        }
                    }
                    TLRPC.TL_chatParticipant tL_chatParticipant2 = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant2.user_id = j2;
                    tL_chatParticipant2.inviter_id = j3;
                    tL_chatParticipant2.date = getConnectionsManager().getCurrentTime();
                    chatFullTLdeserialize.participants.participants.add(tL_chatParticipant2);
                } else if (i == 2) {
                    while (true) {
                        if (i3 >= chatFullTLdeserialize.participants.participants.size()) {
                            break;
                        }
                        TLRPC.ChatParticipant chatParticipant = chatFullTLdeserialize.participants.participants.get(i3);
                        if (chatParticipant.user_id == j2) {
                            if (j3 == 1) {
                                tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                            } else {
                                tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            }
                            tL_chatParticipant.user_id = chatParticipant.user_id;
                            tL_chatParticipant.date = chatParticipant.date;
                            tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                            chatFullTLdeserialize.participants.participants.set(i3, tL_chatParticipant);
                        } else {
                            i3++;
                        }
                    }
                }
                chatFullTLdeserialize.participants.version = i2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$updateChatInfo$134(chatFullTLdeserialize);
                    }
                });
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chatFullTLdeserialize.getObjectSize());
                chatFullTLdeserialize.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindLong(1, j);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindInteger(3, chatFullTLdeserialize.pinned_msg_id);
                sQLitePreparedStatementExecuteFast.bindInteger(4, chatFullTLdeserialize.online_count);
                sQLitePreparedStatementExecuteFast.bindLong(5, chatFullTLdeserialize.inviterId);
                sQLitePreparedStatementExecuteFast.bindInteger(6, chatFullTLdeserialize.invitesCount);
                sQLitePreparedStatementExecuteFast.bindInteger(7, chatFullTLdeserialize.participants_count);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                nativeByteBuffer.reuse();
            }
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateChatInfo$134(TLRPC.ChatFull chatFull) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, chatFull, 0, bool, bool);
    }

    public boolean isMigratedChat(final long j) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$isMigratedChat$136(j, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$isMigratedChat$136(long j, boolean[] zArr, CountDownLatch countDownLatch) throws Throwable {
        SQLiteCursor sQLiteCursorQueryFinalized;
        TLRPC.ChatFull chatFullTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT info FROM chat_settings_v2 WHERE uid = " + j, new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            new ArrayList();
            if (!sQLiteCursorQueryFinalized.next() || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                chatFullTLdeserialize = null;
            } else {
                chatFullTLdeserialize = TLRPC.ChatFull.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                nativeByteBufferByteBufferValue.reuse();
            }
            sQLiteCursorQueryFinalized.dispose();
            zArr[0] = (chatFullTLdeserialize instanceof TLRPC.TL_channelFull) && chatFullTLdeserialize.migrated_from_chat_id != 0;
            countDownLatch.countDown();
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public TLRPC.Message getMessage(final long j, final long j2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getMessage$137(j, j2, atomicReference, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return (TLRPC.Message) atomicReference.get();
    }

    public void lambda$getMessage$137(long j, long j2, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " AND mid = " + j2 + " LIMIT 1", new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        nativeByteBufferByteBufferValue.reuse();
                        atomicReference.set(messageTLdeserialize);
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    public boolean hasInviteMeMessage(final long j) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$hasInviteMeMessage$138(j, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$hasInviteMeMessage$138(long j, boolean[] zArr, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                long clientUserId = getUserConfig().getClientUserId();
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + (-j) + " AND out = 0 ORDER BY mid DESC LIMIT 100", new Object[0]);
                while (true) {
                    if (!sQLiteCursorQueryFinalized.next()) {
                        break;
                    }
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        nativeByteBufferByteBufferValue.reuse();
                        TLRPC.MessageAction messageAction = messageTLdeserialize.action;
                        if ((messageAction instanceof TLRPC.TL_messageActionChatAddUser) && messageAction.users.contains(Long.valueOf(clientUserId))) {
                            zArr[0] = true;
                            break;
                        }
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    public HashMap<Long, Integer> getSmallGroupsParticipantsCount() {
        HashMap<Long, Integer> map = new HashMap<>();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT uid, info, participants_count FROM chat_settings_v2 WHERE participants_count > 1", new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(1);
                    int iIntValue = sQLiteCursorQueryFinalized.intValue(2);
                    if (nativeByteBufferByteBufferValue != null) {
                        TLRPC.ChatFull chatFullTLdeserialize = TLRPC.ChatFull.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        nativeByteBufferByteBufferValue.reuse();
                        if (chatFullTLdeserialize instanceof TLRPC.TL_channelFull) {
                            map.put(Long.valueOf(jLongValue), Integer.valueOf(iIntValue));
                        }
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
            }
            return map;
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    private org.telegram.tgnet.TLRPC.ChatFull loadChatInfoInternal(long r22, boolean r24, boolean r25, boolean r26, int r27) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.loadChatInfoInternal(long, boolean, boolean, boolean, int):org.telegram.tgnet.TLRPC$ChatFull");
    }

    public TLRPC.ChatFull loadChatInfo(long j, boolean z, CountDownLatch countDownLatch, boolean z2, boolean z3) {
        return loadChatInfo(j, z, countDownLatch, z2, z3, 0);
    }

    public TLRPC.ChatFull loadChatInfo(final long j, final boolean z, final CountDownLatch countDownLatch, final boolean z2, final boolean z3, final int i) {
        final TLRPC.ChatFull[] chatFullArr = new TLRPC.ChatFull[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadChatInfo$139(chatFullArr, j, z, z2, z3, i, countDownLatch);
            }
        });
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }
        return chatFullArr[0];
    }

    public void lambda$loadChatInfo$139(TLRPC.ChatFull[] chatFullArr, long j, boolean z, boolean z2, boolean z3, int i, CountDownLatch countDownLatch) {
        chatFullArr[0] = loadChatInfoInternal(j, z, z2, z3, i);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public TLRPC.ChatFull loadChatInfoInQueue(long j, boolean z, boolean z2, boolean z3, int i) {
        return loadChatInfoInternal(j, z, z2, z3, i);
    }

    public void processPendingRead(final long j, final int i, final int i2, final int i3) {
        final int i4 = this.lastSavedDate;
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$processPendingRead$140(j, i, i3, i4, i2);
            }
        });
    }

    public void lambda$processPendingRead$140(long r19, int r21, int r22, int r23, int r24) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$processPendingRead$140(long, int, int, int, int):void");
    }

    private void updateTopicsWithReadFromAllInternal(long j, long j2, long j3) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT topic_id FROM topics WHERE did = %d AND max_read_id < %d AND (top_message > %d OR unread_count > 0)", Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j2)), new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    updateRepliesMaxReadIdInternal(j, sQLiteCursorQueryFinalized.longValue(0), (int) j3, -1);
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized == null) {
                    return;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void putContacts(ArrayList<TLRPC.TL_contact> arrayList, final boolean z) {
        if (!arrayList.isEmpty() || z) {
            final ArrayList arrayList2 = new ArrayList(arrayList);
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$putContacts$141(z, arrayList2);
                }
            });
        }
    }

    public void lambda$putContacts$141(boolean r7, java.util.ArrayList r8) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putContacts$141(boolean, java.util.ArrayList):void");
    }

    public void deleteContacts(final ArrayList<Long> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$deleteContacts$142(arrayList);
            }
        });
    }

    public void lambda$deleteContacts$142(ArrayList arrayList) throws InterruptedException {
        try {
            String strJoin = TextUtils.join(",", arrayList);
            this.database.executeFast("DELETE FROM contacts WHERE uid IN(" + strJoin + ")").stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void applyPhoneBookUpdates(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$applyPhoneBookUpdates$143(str, str2);
            }
        });
    }

    public void lambda$applyPhoneBookUpdates$143(String str, String str2) throws InterruptedException {
        try {
            if (str.length() != 0) {
                this.database.executeFast(String.format(Locale.US, "UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(%s)", str)).stepThis().dispose();
            }
            if (str2.length() != 0) {
                this.database.executeFast(String.format(Locale.US, "UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(%s)", str2)).stepThis().dispose();
            }
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void putCachedPhoneBook(final HashMap<String, ContactsController.Contact> map, final boolean z, boolean z2) {
        if (map != null) {
            if (!map.isEmpty() || z || z2) {
                this.storageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() throws Throwable {
                        this.f$0.lambda$putCachedPhoneBook$144(map, z);
                    }
                });
            }
        }
    }

    public void lambda$putCachedPhoneBook$144(java.util.HashMap r12, boolean r13) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putCachedPhoneBook$144(java.util.HashMap, boolean):void");
    }

    public void getCachedPhoneBook(final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getCachedPhoneBook$145(z);
            }
        });
    }

    public void lambda$getCachedPhoneBook$145(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getCachedPhoneBook$145(boolean):void");
    }

    public void getContacts() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$getContacts$146();
            }
        });
    }

    public void lambda$getContacts$146() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getContacts$146():void");
    }

    public void getUnsentMessages(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$getUnsentMessages$147(i);
            }
        });
    }

    public void lambda$getUnsentMessages$147(int r23) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getUnsentMessages$147(int):void");
    }

    public boolean checkMessageByRandomId(final long j) throws InterruptedException {
        final boolean[] zArr = new boolean[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkMessageByRandomId$148(j, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$checkMessageByRandomId$148(long j, boolean[] zArr, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT random_id FROM randoms_v2 WHERE random_id = %d", Long.valueOf(j)), new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    zArr[0] = true;
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public boolean checkMessageId(final long j, final int i) throws InterruptedException {
        final boolean[] zArr = new boolean[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkMessageId$149(j, i, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$checkMessageId$149(long j, int i, boolean[] zArr, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT mid FROM messages_v2 WHERE uid = %d AND mid = %d", Long.valueOf(j), Integer.valueOf(i)), new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    zArr[0] = true;
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void getUnreadMention(final long j, final long j2, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getUnreadMention$151(j2, j, intCallback);
            }
        });
    }

    public void lambda$getUnreadMention$151(long j, long j2, final IntCallback intCallback) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                if (j != 0) {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT MIN(mid) FROM messages_topics WHERE uid = %d AND topic_id = %d AND mention = 1 AND read_state IN(0, 1)", Long.valueOf(j2), Long.valueOf(j)), new Object[0]);
                } else {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT MIN(mid) FROM messages_v2 WHERE uid = %d AND mention = 1 AND read_state IN(0, 1)", Long.valueOf(j2)), new Object[0]);
                }
                sQLiteCursor = sQLiteCursorQueryFinalized;
                final int iIntValue = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        intCallback.run(iIntValue);
                    }
                });
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursor == null) {
                    return;
                }
            }
            sQLiteCursor.dispose();
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void getMessagesCount(final long j, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getMessagesCount$153(j, intCallback);
            }
        });
    }

    public void lambda$getMessagesCount$153(long j, final IntCallback intCallback) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM messages_v2 WHERE uid = %d", Long.valueOf(j)), new Object[0]);
                final int iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : 0;
                sQLiteCursorQueryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        intCallback.run(iIntValue);
                    }
                });
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized == null) {
                    return;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public java.lang.Runnable getMessagesInternal(long r65, long r67, int r69, int r70, int r71, int r72, int r73, int r74, int r75, long r76, int r78, boolean r79, boolean r80, org.telegram.messenger.Timer r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.getMessagesInternal(long, long, int, int, int, int, int, int, int, long, int, boolean, boolean, org.telegram.messenger.Timer):java.lang.Runnable");
    }

    public static int lambda$getMessagesInternal$154(TLRPC.Message message, TLRPC.Message message2) {
        int i;
        int i2;
        int i3 = message.id;
        if (i3 > 0 && (i2 = message2.id) > 0) {
            if (i3 > i2) {
                return -1;
            }
            return i3 < i2 ? 1 : 0;
        }
        if (i3 < 0 && (i = message2.id) < 0) {
            if (i3 < i) {
                return -1;
            }
            return i3 > i ? 1 : 0;
        }
        int i4 = message.date;
        int i5 = message2.date;
        if (i4 > i5) {
            return -1;
        }
        return i4 < i5 ? 1 : 0;
    }

    public void lambda$getMessagesInternal$155(TLRPC.TL_messages_messages tL_messages_messages, int i, long j, long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, int i11, long j3, int i12, boolean z2, int i13, boolean z3, boolean z4, Timer timer) {
        getMessagesController().processLoadedMessages(tL_messages_messages, i, j, j2, i2, i3, i4, true, i5, i6, i7, i8, i9, i10, z, i11, j3, i12, z2, i13, z3, z4, timer);
    }

    public void getAnimatedEmoji(String str, ArrayList<TLRPC.Document> arrayList) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM animated_emoji WHERE document_id IN (%s)", str), new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    try {
                        TLRPC.Document documentTLdeserialize = TLRPC.Document.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                        if (documentTLdeserialize != null && documentTLdeserialize.id != 0) {
                            arrayList.add(documentTLdeserialize);
                        }
                    } catch (Exception e) {
                        checkSQLException(e);
                    }
                    if (nativeByteBufferByteBufferValue != null) {
                        nativeByteBufferByteBufferValue.reuse();
                    }
                }
            } catch (SQLiteException e2) {
                e2.printStackTrace();
                if (sQLiteCursorQueryFinalized == null) {
                    return;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void getMessages(final long j, final long j2, boolean z, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7, final long j3, final int i8, final boolean z2, final boolean z3, final Timer timer) {
        final Timer.Task taskStart = Timer.start(timer, "MessagesStorage.getMessages: storageQueue.postRunnable");
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getMessages$157(taskStart, timer, j, j2, i, i2, i3, i4, i5, i6, i7, j3, i8, z2, z3);
            }
        });
    }

    public void lambda$getMessages$157(Timer.Task task, Timer timer, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j3, int i8, boolean z, boolean z2) {
        Timer.done(task);
        Timer.Task taskStart = Timer.start(timer, "MessagesStorage.getMessages");
        final Runnable messagesInternal = getMessagesInternal(j, j2, i, i2, i3, i4, i5, i6, i7, j3, i8, z, z2, timer);
        Timer.done(taskStart);
        final Timer.Task taskStart2 = Timer.start(timer, "MessagesStorage.getMessages: stageQueue.postRunnable");
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.lambda$getMessages$156(taskStart2, messagesInternal);
            }
        });
    }

    public static void lambda$getMessages$156(Timer.Task task, Runnable runnable) {
        Timer.done(task);
        runnable.run();
    }

    public void clearSentMedia() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$clearSentMedia$158();
            }
        });
    }

    public void lambda$clearSentMedia$158() throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public Object[] getSentFile(final String str, final int i) throws InterruptedException {
        if (str == null || str.toLowerCase().endsWith("attheme")) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Object[] objArr = new Object[2];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getSentFile$159(str, i, objArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        if (objArr[0] != null) {
            return objArr;
        }
        return null;
    }

    public void lambda$getSentFile$159(String str, int i, Object[] objArr, CountDownLatch countDownLatch) {
        NativeByteBuffer nativeByteBufferByteBufferValue;
        try {
            try {
                String strMD5 = Utilities.MD5(str);
                if (strMD5 != null) {
                    SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data, parent FROM sent_files_v2 WHERE uid = '%s' AND type = %d", strMD5, Integer.valueOf(i)), new Object[0]);
                    if (sQLiteCursorQueryFinalized.next() && (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) != null) {
                        TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        nativeByteBufferByteBufferValue.reuse();
                        if (messageMediaTLdeserialize instanceof TLRPC.TL_messageMediaDocument) {
                            objArr[0] = ((TLRPC.TL_messageMediaDocument) messageMediaTLdeserialize).document;
                        } else if (messageMediaTLdeserialize instanceof TLRPC.TL_messageMediaPhoto) {
                            objArr[0] = ((TLRPC.TL_messageMediaPhoto) messageMediaTLdeserialize).photo;
                        }
                        if (objArr[0] != null) {
                            objArr[1] = sQLiteCursorQueryFinalized.stringValue(1);
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    private void updateWidgets(long j) throws InterruptedException {
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(Long.valueOf(j));
        updateWidgets(arrayList);
    }

    private void updateWidgets(ArrayList<Long> arrayList) throws InterruptedException {
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            TextUtils.join(",", arrayList);
            SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT DISTINCT id FROM shortcut_widget WHERE did IN(%s,-1)", TextUtils.join(",", arrayList)), new Object[0]);
            AppWidgetManager appWidgetManager = null;
            while (sQLiteCursorQueryFinalized.next()) {
                if (appWidgetManager == null) {
                    appWidgetManager = AppWidgetManager.getInstance(ApplicationLoader.applicationContext);
                }
                appWidgetManager.notifyAppWidgetViewDataChanged(sQLiteCursorQueryFinalized.intValue(0), R.id.list_view);
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void putWidgetDialogs(final int i, final ArrayList<TopicKey> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$putWidgetDialogs$160(i, arrayList);
            }
        });
    }

    public void lambda$putWidgetDialogs$160(int i, ArrayList arrayList) throws InterruptedException {
        try {
            this.database.beginTransaction();
            this.database.executeFast("DELETE FROM shortcut_widget WHERE id = " + i).stepThis().dispose();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO shortcut_widget VALUES(?, ?, ?)");
            if (arrayList.isEmpty()) {
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                sQLitePreparedStatementExecuteFast.bindLong(2, -1L);
                sQLitePreparedStatementExecuteFast.bindInteger(3, 0);
                sQLitePreparedStatementExecuteFast.step();
            } else {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    long j = ((TopicKey) arrayList.get(i2)).dialogId;
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                    sQLitePreparedStatementExecuteFast.bindLong(2, j);
                    sQLitePreparedStatementExecuteFast.bindInteger(3, i2);
                    sQLitePreparedStatementExecuteFast.step();
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
            this.database.commitTransaction();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void clearWidgetDialogs(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$clearWidgetDialogs$161(i);
            }
        });
    }

    public void lambda$clearWidgetDialogs$161(int i) throws InterruptedException {
        try {
            this.database.executeFast("DELETE FROM shortcut_widget WHERE id = " + i).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void getWidgetDialogIds(final int i, final int i2, final ArrayList<Long> arrayList, final ArrayList<TLRPC.User> arrayList2, final ArrayList<TLRPC.Chat> arrayList3, final boolean z) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$getWidgetDialogIds$162(i, arrayList, arrayList2, arrayList3, z, i2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void lambda$getWidgetDialogIds$162(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i2, CountDownLatch countDownLatch) throws Throwable {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                ArrayList<Long> arrayList4 = new ArrayList<>();
                ArrayList arrayList5 = new ArrayList();
                SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT did FROM shortcut_widget WHERE id = %d ORDER BY ord ASC", Integer.valueOf(i)), new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    try {
                        long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                        if (jLongValue != -1) {
                            arrayList.add(Long.valueOf(jLongValue));
                            if (arrayList2 != null && arrayList3 != null) {
                                if (DialogObject.isUserDialog(jLongValue)) {
                                    arrayList4.add(Long.valueOf(jLongValue));
                                } else {
                                    arrayList5.add(Long.valueOf(-jLongValue));
                                }
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                        throw th;
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                if (!z && arrayList.isEmpty()) {
                    if (i2 == 0) {
                        SQLiteCursor sQLiteCursorQueryFinalized2 = this.database.queryFinalized("SELECT did FROM dialogs WHERE folder_id = 0 ORDER BY pinned DESC, date DESC LIMIT 0,10", new Object[0]);
                        while (sQLiteCursorQueryFinalized2.next()) {
                            long jLongValue2 = sQLiteCursorQueryFinalized2.longValue(0);
                            if (!DialogObject.isFolderDialogId(jLongValue2)) {
                                arrayList.add(Long.valueOf(jLongValue2));
                                if (arrayList2 != null && arrayList3 != null) {
                                    if (DialogObject.isUserDialog(jLongValue2)) {
                                        arrayList4.add(Long.valueOf(jLongValue2));
                                    } else {
                                        arrayList5.add(Long.valueOf(-jLongValue2));
                                    }
                                }
                            }
                        }
                        sQLiteCursorQueryFinalized2.dispose();
                    } else {
                        SQLiteCursor sQLiteCursorQueryFinalized3 = getMessagesStorage().getDatabase().queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                        while (sQLiteCursorQueryFinalized3.next()) {
                            long jLongValue3 = sQLiteCursorQueryFinalized3.longValue(0);
                            arrayList.add(Long.valueOf(jLongValue3));
                            if (arrayList2 != null && arrayList3 != null) {
                                if (DialogObject.isUserDialog(jLongValue3)) {
                                    arrayList4.add(Long.valueOf(jLongValue3));
                                } else {
                                    arrayList5.add(Long.valueOf(-jLongValue3));
                                }
                            }
                        }
                        sQLiteCursorQueryFinalized3.dispose();
                    }
                }
                if (arrayList2 != null && arrayList3 != null) {
                    if (!arrayList5.isEmpty()) {
                        getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    if (!arrayList4.isEmpty()) {
                        getUsersInternal(arrayList4, (ArrayList<TLRPC.User>) arrayList2);
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void getWidgetDialogs(final int i, final int i2, final ArrayList<Long> arrayList, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2, final ArrayList<TLRPC.User> arrayList2, final ArrayList<TLRPC.Chat> arrayList3) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$getWidgetDialogs$163(i, arrayList, i2, longSparseArray, longSparseArray2, arrayList3, arrayList2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void lambda$getWidgetDialogs$163(int i, ArrayList arrayList, int i2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) throws Throwable {
        boolean z;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                ArrayList<Long> arrayList4 = new ArrayList<>();
                ArrayList arrayList5 = new ArrayList();
                SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT did FROM shortcut_widget WHERE id = %d ORDER BY ord ASC", Integer.valueOf(i)), new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    try {
                        long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                        if (jLongValue != -1) {
                            arrayList.add(Long.valueOf(jLongValue));
                            if (DialogObject.isUserDialog(jLongValue)) {
                                arrayList4.add(Long.valueOf(jLongValue));
                            } else {
                                arrayList5.add(Long.valueOf(-jLongValue));
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                        throw th;
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                if (arrayList.isEmpty() && i2 == 1) {
                    SQLiteCursor sQLiteCursorQueryFinalized2 = getMessagesStorage().getDatabase().queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                    while (sQLiteCursorQueryFinalized2.next()) {
                        long jLongValue2 = sQLiteCursorQueryFinalized2.longValue(0);
                        arrayList.add(Long.valueOf(jLongValue2));
                        if (DialogObject.isUserDialog(jLongValue2)) {
                            arrayList4.add(Long.valueOf(jLongValue2));
                        } else {
                            arrayList5.add(Long.valueOf(-jLongValue2));
                        }
                    }
                    sQLiteCursorQueryFinalized2.dispose();
                }
                if (arrayList.isEmpty()) {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.folder_id = 0 ORDER BY d.pinned DESC, d.date DESC LIMIT 0,10", new Object[0]);
                    z = true;
                } else {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.did IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
                    z = false;
                }
                while (sQLiteCursorQueryFinalized.next()) {
                    long jLongValue3 = sQLiteCursorQueryFinalized.longValue(0);
                    if (!DialogObject.isFolderDialogId(jLongValue3)) {
                        if (z) {
                            arrayList.add(Long.valueOf(jLongValue3));
                        }
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.id = jLongValue3;
                        tL_dialog.top_message = sQLiteCursorQueryFinalized.intValue(1);
                        tL_dialog.unread_count = sQLiteCursorQueryFinalized.intValue(2);
                        tL_dialog.last_message_date = sQLiteCursorQueryFinalized.intValue(3);
                        longSparseArray.put(tL_dialog.id, tL_dialog);
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(4);
                        if (nativeByteBufferByteBufferValue != null) {
                            TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                            messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, getUserConfig().clientUserId);
                            nativeByteBufferByteBufferValue.reuse();
                            MessageObject.setUnreadFlags(messageTLdeserialize, sQLiteCursorQueryFinalized.intValue(5));
                            messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(6);
                            messageTLdeserialize.send_state = sQLiteCursorQueryFinalized.intValue(7);
                            int iIntValue = sQLiteCursorQueryFinalized.intValue(8);
                            if (iIntValue != 0) {
                                tL_dialog.last_message_date = iIntValue;
                            }
                            long j = tL_dialog.id;
                            messageTLdeserialize.dialog_id = j;
                            longSparseArray2.put(j, messageTLdeserialize);
                            addUsersAndChatsFromMessage(messageTLdeserialize, arrayList4, arrayList5, null);
                        }
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                if (!z && arrayList.size() > longSparseArray.size()) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Long l = (Long) arrayList.get(i3);
                        long jLongValue4 = l.longValue();
                        if (longSparseArray.get(((Long) arrayList.get(i3)).longValue()) == null) {
                            TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                            tL_dialog2.id = jLongValue4;
                            longSparseArray.put(jLongValue4, tL_dialog2);
                            if (DialogObject.isChatDialog(jLongValue4)) {
                                long j2 = -jLongValue4;
                                if (arrayList5.contains(Long.valueOf(j2))) {
                                    arrayList5.add(Long.valueOf(j2));
                                }
                            } else if (arrayList4.contains(l)) {
                                arrayList4.add(l);
                            }
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    getChatsInternal(TextUtils.join(",", arrayList5), arrayList2);
                }
                if (!arrayList4.isEmpty()) {
                    getUsersInternal(arrayList4, (ArrayList<TLRPC.User>) arrayList3);
                }
            } catch (Exception e2) {
                e = e2;
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void putSentFile(final String str, final TLObject tLObject, final int i, final String str2) {
        if (str == null || tLObject == null || str2 == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$putSentFile$164(str, tLObject, i, str2);
            }
        });
    }

    public void lambda$putSentFile$164(String str, TLObject tLObject, int i, String str2) {
        TLRPC.MessageMedia tL_messageMediaDocument;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                String strMD5 = Utilities.MD5(str);
                if (strMD5 != null) {
                    if (tLObject instanceof TLRPC.Photo) {
                        tL_messageMediaDocument = new TLRPC.TL_messageMediaPhoto();
                        tL_messageMediaDocument.photo = (TLRPC.Photo) tLObject;
                        tL_messageMediaDocument.flags |= 1;
                    } else if (tLObject instanceof TLRPC.Document) {
                        tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_messageMediaDocument.document = (TLRPC.Document) tLObject;
                        tL_messageMediaDocument.flags |= 1;
                    } else {
                        tL_messageMediaDocument = null;
                    }
                    if (tL_messageMediaDocument == null) {
                        return;
                    }
                    sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
                    sQLitePreparedStatementExecuteFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messageMediaDocument.getObjectSize());
                    tL_messageMediaDocument.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.bindString(1, strMD5);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.bindString(4, str2);
                    sQLitePreparedStatementExecuteFast.step();
                    nativeByteBuffer.reuse();
                }
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void updateEncryptedChatSeq(final TLRPC.EncryptedChat encryptedChat, final boolean z) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateEncryptedChatSeq$165(encryptedChat, z);
            }
        });
    }

    public void lambda$updateEncryptedChatSeq$165(TLRPC.EncryptedChat encryptedChat, boolean z) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatementExecuteFast.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatementExecuteFast.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatementExecuteFast.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatementExecuteFast.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatementExecuteFast.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatementExecuteFast.bindInteger(6, encryptedChat.id);
                sQLitePreparedStatementExecuteFast.step();
                if (z && encryptedChat.in_seq_no != 0) {
                    long encryptedChatId = DialogObject.getEncryptedChatId(encryptedChat.id);
                    this.database.executeFast(String.format(Locale.US, "DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = %d AND m.date = 0 AND m.mid < 0 AND s.seq_out <= %d) AND uid = %d", Long.valueOf(encryptedChatId), Integer.valueOf(encryptedChat.in_seq_no), Long.valueOf(encryptedChatId))).stepThis().dispose();
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void updateEncryptedChatTTL(final TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateEncryptedChatTTL$166(encryptedChat);
            }
        });
    }

    public void lambda$updateEncryptedChatTTL$166(TLRPC.EncryptedChat encryptedChat) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE enc_chats SET ttl = ? WHERE uid = ?");
                sQLitePreparedStatementExecuteFast.bindInteger(1, encryptedChat.ttl);
                sQLitePreparedStatementExecuteFast.bindInteger(2, encryptedChat.id);
                sQLitePreparedStatementExecuteFast.step();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void updateEncryptedChatLayer(final TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateEncryptedChatLayer$167(encryptedChat);
            }
        });
    }

    public void lambda$updateEncryptedChatLayer$167(TLRPC.EncryptedChat encryptedChat) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE enc_chats SET layer = ? WHERE uid = ?");
                sQLitePreparedStatementExecuteFast.bindInteger(1, encryptedChat.layer);
                sQLitePreparedStatementExecuteFast.bindInteger(2, encryptedChat.id);
                sQLitePreparedStatementExecuteFast.step();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void updateEncryptedChat(final TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateEncryptedChat$168(encryptedChat);
            }
        });
    }

    public void lambda$updateEncryptedChat$168(TLRPC.EncryptedChat encryptedChat) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                byte[] bArr = encryptedChat.key_hash;
                if (bArr == null || bArr.length < 16) {
                    byte[] bArr2 = encryptedChat.auth_key;
                    if (bArr2 != null) {
                        encryptedChat.key_hash = AndroidUtilities.calcAuthKeyHash(bArr2);
                    }
                }
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE enc_chats SET data = ?, g = ?, authkey = ?, ttl = ?, layer = ?, seq_in = ?, seq_out = ?, use_count = ?, exchange_id = ?, key_date = ?, fprint = ?, fauthkey = ?, khash = ?, in_seq_no = ?, admin_id = ?, mtproto_seq = ? WHERE uid = ?");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedChat.getObjectSize());
                byte[] bArr3 = encryptedChat.a_or_b;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(bArr3 != null ? bArr3.length : 1);
                byte[] bArr4 = encryptedChat.auth_key;
                NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(bArr4 != null ? bArr4.length : 1);
                byte[] bArr5 = encryptedChat.future_auth_key;
                NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(bArr5 != null ? bArr5.length : 1);
                byte[] bArr6 = encryptedChat.key_hash;
                NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(bArr6 != null ? bArr6.length : 1);
                encryptedChat.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                byte[] bArr7 = encryptedChat.a_or_b;
                if (bArr7 != null) {
                    nativeByteBuffer2.writeBytes(bArr7);
                }
                byte[] bArr8 = encryptedChat.auth_key;
                if (bArr8 != null) {
                    nativeByteBuffer3.writeBytes(bArr8);
                }
                byte[] bArr9 = encryptedChat.future_auth_key;
                if (bArr9 != null) {
                    nativeByteBuffer4.writeBytes(bArr9);
                }
                byte[] bArr10 = encryptedChat.key_hash;
                if (bArr10 != null) {
                    nativeByteBuffer5.writeBytes(bArr10);
                }
                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer2);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer3);
                sQLitePreparedStatementExecuteFast.bindInteger(4, encryptedChat.ttl);
                sQLitePreparedStatementExecuteFast.bindInteger(5, encryptedChat.layer);
                sQLitePreparedStatementExecuteFast.bindInteger(6, encryptedChat.seq_in);
                sQLitePreparedStatementExecuteFast.bindInteger(7, encryptedChat.seq_out);
                sQLitePreparedStatementExecuteFast.bindInteger(8, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatementExecuteFast.bindLong(9, encryptedChat.exchange_id);
                sQLitePreparedStatementExecuteFast.bindInteger(10, encryptedChat.key_create_date);
                sQLitePreparedStatementExecuteFast.bindLong(11, encryptedChat.future_key_fingerprint);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(12, nativeByteBuffer4);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(13, nativeByteBuffer5);
                sQLitePreparedStatementExecuteFast.bindInteger(14, encryptedChat.in_seq_no);
                sQLitePreparedStatementExecuteFast.bindLong(15, encryptedChat.admin_id);
                sQLitePreparedStatementExecuteFast.bindInteger(16, encryptedChat.mtproto_seq);
                sQLitePreparedStatementExecuteFast.bindInteger(17, encryptedChat.id);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                nativeByteBuffer2.reuse();
                nativeByteBuffer3.reuse();
                nativeByteBuffer4.reuse();
                nativeByteBuffer5.reuse();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void isDialogHasTopMessage(final long j, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$isDialogHasTopMessage$169(j, runnable);
            }
        });
    }

    public void lambda$isDialogHasTopMessage$169(long r7, java.lang.Runnable r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$isDialogHasTopMessage$169(long, java.lang.Runnable):void");
    }

    public boolean hasAuthMessage(final int i) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$hasAuthMessage$170(i, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$hasAuthMessage$170(int i, boolean[] zArr, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT mid FROM messages_v2 WHERE uid = 777000 AND date = %d AND mid < 0 LIMIT 1", Integer.valueOf(i)), new Object[0]);
                zArr[0] = sQLiteCursorQueryFinalized.next();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    public void getEncryptedChat(final long j, final CountDownLatch countDownLatch, final ArrayList<TLObject> arrayList) {
        if (countDownLatch == null || arrayList == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getEncryptedChat$171(j, arrayList, countDownLatch);
            }
        });
    }

    public void lambda$getEncryptedChat$171(long j, ArrayList arrayList, CountDownLatch countDownLatch) {
        try {
            try {
                ArrayList<Long> arrayList2 = new ArrayList<>();
                ArrayList<TLRPC.EncryptedChat> arrayList3 = new ArrayList<>();
                getEncryptedChatsInternal("" + j, arrayList3, arrayList2);
                if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                    ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                    getUsersInternal(arrayList2, arrayList4);
                    if (!arrayList4.isEmpty()) {
                        arrayList.add(arrayList3.get(0));
                        arrayList.add(arrayList4.get(0));
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    public void putEncryptedChat(final TLRPC.EncryptedChat encryptedChat, final TLRPC.User user, final TLRPC.Dialog dialog) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$putEncryptedChat$172(encryptedChat, user, dialog);
            }
        });
    }

    public void lambda$putEncryptedChat$172(org.telegram.tgnet.TLRPC.EncryptedChat r17, org.telegram.tgnet.TLRPC.User r18, org.telegram.tgnet.TLRPC.Dialog r19) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putEncryptedChat$172(org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Dialog):void");
    }

    private String formatUserSearchName(TLRPC.User user) {
        StringBuilder sb = new StringBuilder();
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            sb.append(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(user.last_name);
        }
        sb.append(";;;");
        String str3 = user.username;
        if (str3 != null && str3.length() > 0) {
            sb.append(user.username);
        } else {
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i = 0; i < user.usernames.size(); i++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i);
                    if (tL_username != null && tL_username.active) {
                        sb.append(tL_username.username);
                        sb.append(";;");
                    }
                }
            }
        }
        return sb.toString().toLowerCase();
    }

    public boolean containsLocalDialog(final long j) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Boolean[] boolArr = {Boolean.FALSE};
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$containsLocalDialog$173(j, boolArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return boolArr[0].booleanValue();
    }

    public void lambda$containsLocalDialog$173(long j, Boolean[] boolArr, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT date FROM dialogs WHERE did = " + j, new Object[0]);
                boolArr[0] = Boolean.valueOf(sQLiteCursorQueryFinalized.next());
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    private void putUsersInternal(List<TLRPC.User> list) throws InterruptedException {
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO users VALUES(?, ?, ?, ?)");
        for (int i = 0; i < list.size(); i++) {
            TLRPC.User user = list.get(i);
            if (user != null) {
                if (user.min) {
                    SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM users WHERE uid = %d", Long.valueOf(user.id)), new Object[0]);
                    if (sQLiteCursorQueryFinalized.next()) {
                        try {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            if (nativeByteBufferByteBufferValue != null) {
                                TLRPC.User userTLdeserialize = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                nativeByteBufferByteBufferValue.reuse();
                                if (userTLdeserialize != null) {
                                    String str = user.username;
                                    if (str != null) {
                                        userTLdeserialize.username = str;
                                        userTLdeserialize.flags |= 8;
                                    } else {
                                        userTLdeserialize.username = null;
                                        userTLdeserialize.flags &= -9;
                                    }
                                    if (user.apply_min_photo) {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                        if (userProfilePhoto != null) {
                                            userTLdeserialize.photo = userProfilePhoto;
                                            userTLdeserialize.flags |= 32;
                                        } else {
                                            userTLdeserialize.photo = null;
                                            userTLdeserialize.flags &= -33;
                                        }
                                    }
                                    user = userTLdeserialize;
                                }
                            }
                        } catch (Exception e) {
                            checkSQLException(e);
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                }
                sQLitePreparedStatementExecuteFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(user.getObjectSize());
                user.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindLong(1, user.id);
                sQLitePreparedStatementExecuteFast.bindString(2, formatUserSearchName(user));
                TLRPC.UserStatus userStatus = user.status;
                if (userStatus != null) {
                    if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                        userStatus.expires = userStatus.by_me ? -1000 : -100;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                        userStatus.expires = userStatus.by_me ? -1001 : -101;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                        userStatus.expires = userStatus.by_me ? -1002 : -102;
                    }
                    sQLitePreparedStatementExecuteFast.bindInteger(3, userStatus.expires);
                } else {
                    sQLitePreparedStatementExecuteFast.bindInteger(3, 0);
                }
                sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                isForumCacheInvalidate(user.id);
            }
        }
        sQLitePreparedStatementExecuteFast.dispose();
    }

    public void updateChatDefaultBannedRights(final long j, final TLRPC.TL_chatBannedRights tL_chatBannedRights, final int i) {
        if (tL_chatBannedRights == null || j == 0) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateChatDefaultBannedRights$174(j, i, tL_chatBannedRights);
            }
        });
    }

    public void lambda$updateChatDefaultBannedRights$174(long r8, int r10, org.telegram.tgnet.TLRPC.TL_chatBannedRights r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateChatDefaultBannedRights$174(long, int, org.telegram.tgnet.TLRPC$TL_chatBannedRights):void");
    }

    private void putChatsInternal(List<TLRPC.Chat> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO chats VALUES(?, ?, ?)");
        for (int i = 0; i < list.size(); i++) {
            TLRPC.Chat chat = list.get(i);
            if (chat.min) {
                SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM chats WHERE uid = %d", Long.valueOf(chat.id)), new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    try {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            TLRPC.Chat chatTLdeserialize = TLRPC.Chat.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                            nativeByteBufferByteBufferValue.reuse();
                            if (chatTLdeserialize != null) {
                                chatTLdeserialize.title = chat.title;
                                chatTLdeserialize.photo = chat.photo;
                                chatTLdeserialize.broadcast = chat.broadcast;
                                chatTLdeserialize.verified = chat.verified;
                                chatTLdeserialize.megagroup = chat.megagroup;
                                chatTLdeserialize.call_not_empty = chat.call_not_empty;
                                chatTLdeserialize.call_active = chat.call_active;
                                chatTLdeserialize.monoforum = chat.monoforum;
                                chatTLdeserialize.broadcast_messages_allowed = chat.broadcast_messages_allowed;
                                if ((chat.flags2 & 262144) != 0) {
                                    chatTLdeserialize.linked_monoforum_id = chat.linked_monoforum_id;
                                    chatTLdeserialize.flags2 |= 262144;
                                }
                                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                                if (tL_chatBannedRights != null) {
                                    chatTLdeserialize.default_banned_rights = tL_chatBannedRights;
                                    chatTLdeserialize.flags |= 262144;
                                }
                                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                                if (tL_chatAdminRights != null) {
                                    chatTLdeserialize.admin_rights = tL_chatAdminRights;
                                    chatTLdeserialize.flags |= 16384;
                                }
                                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                                if (tL_chatBannedRights2 != null) {
                                    chatTLdeserialize.banned_rights = tL_chatBannedRights2;
                                    chatTLdeserialize.flags |= 32768;
                                }
                                String str = chat.username;
                                if (str != null) {
                                    chatTLdeserialize.username = str;
                                    chatTLdeserialize.flags |= 64;
                                } else {
                                    chatTLdeserialize.username = null;
                                    chatTLdeserialize.flags &= -65;
                                }
                                int i2 = chat.participants_count;
                                if (i2 > 0) {
                                    chatTLdeserialize.participants_count = i2;
                                }
                                chat = chatTLdeserialize;
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
            }
            sQLitePreparedStatementExecuteFast.requery();
            chat.flags |= 131072;
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize());
            chat.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindLong(1, chat.id);
            String str2 = chat.title;
            if (str2 != null) {
                sQLitePreparedStatementExecuteFast.bindString(2, str2.toLowerCase());
            } else {
                sQLitePreparedStatementExecuteFast.bindString(2, "");
            }
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            isForumCacheInvalidate(-chat.id);
        }
        sQLitePreparedStatementExecuteFast.dispose();
    }

    public void getUsersInternal(ArrayList<Long> arrayList, ArrayList<TLRPC.User> arrayList2) throws InterruptedException {
        getUsersInternal(arrayList, arrayList2, false);
    }

    public void getUsersInternal(ArrayList<Long> arrayList, ArrayList<TLRPC.User> arrayList2, boolean z) throws InterruptedException {
        if (arrayList == null || arrayList.isEmpty() || arrayList2 == null) {
            return;
        }
        if (arrayList.size() > 50) {
            int i = 0;
            while (i < arrayList.size()) {
                Long l = arrayList.get(i);
                l.longValue();
                TLRPC.User user = getMessagesController().getUser(l);
                if (user != null) {
                    arrayList2.add(user);
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data, status FROM users WHERE uid IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
        while (sQLiteCursorQueryFinalized.next()) {
            try {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.User userTLdeserialize = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    nativeByteBufferByteBufferValue.reuse();
                    if (userTLdeserialize != null) {
                        TLRPC.UserStatus userStatus = userTLdeserialize.status;
                        if (userStatus != null) {
                            userStatus.expires = sQLiteCursorQueryFinalized.intValue(1);
                        }
                        arrayList2.add(userTLdeserialize);
                        if (arrayList.size() > 50 && z) {
                            getMessagesController().putUser(userTLdeserialize, true, false);
                        }
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
        }
        sQLiteCursorQueryFinalized.dispose();
    }

    public void getUsersInternal(HashSet<Long> hashSet, ArrayList<TLRPC.User> arrayList) throws InterruptedException {
        if (hashSet == null || hashSet.isEmpty() || arrayList == null) {
            return;
        }
        if (hashSet.size() > 50) {
            Iterator<Long> it = hashSet.iterator();
            while (it.hasNext()) {
                TLRPC.User user = getMessagesController().getUser(it.next());
                if (user != null) {
                    arrayList.add(user);
                    it.remove();
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data, status FROM users WHERE uid IN(%s)", TextUtils.join(",", hashSet)), new Object[0]);
        while (sQLiteCursorQueryFinalized.next()) {
            try {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.User userTLdeserialize = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    nativeByteBufferByteBufferValue.reuse();
                    if (userTLdeserialize != null) {
                        TLRPC.UserStatus userStatus = userTLdeserialize.status;
                        if (userStatus != null) {
                            userStatus.expires = sQLiteCursorQueryFinalized.intValue(1);
                        }
                        arrayList.add(userTLdeserialize);
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
        }
        sQLiteCursorQueryFinalized.dispose();
    }

    public void getChatsInternal(String str, ArrayList<TLRPC.Chat> arrayList) throws InterruptedException {
        getChatsInternal(str, arrayList, true);
    }

    public void getChatsInternal(String str, ArrayList<TLRPC.Chat> arrayList, boolean z) throws InterruptedException {
        if (str == null || str.length() == 0 || arrayList == null) {
            return;
        }
        SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM chats WHERE uid IN(%s)", str), new Object[0]);
        ArrayList arrayList2 = null;
        while (sQLiteCursorQueryFinalized.next()) {
            try {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.Chat chatTLdeserialize = TLRPC.Chat.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false, z);
                    nativeByteBufferByteBufferValue.reuse();
                    if (chatTLdeserialize != null) {
                        arrayList.add(chatTLdeserialize);
                        if (chatTLdeserialize.linked_monoforum_id != 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(Long.valueOf(chatTLdeserialize.linked_monoforum_id));
                        }
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
        }
        sQLiteCursorQueryFinalized.dispose();
        if (arrayList2 != null) {
            SQLiteCursor sQLiteCursorQueryFinalized2 = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM chats WHERE uid IN(%s)", TextUtils.join(", ", arrayList2)), new Object[0]);
            while (sQLiteCursorQueryFinalized2.next()) {
                try {
                    NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue2 != null) {
                        TLRPC.Chat chatTLdeserialize2 = TLRPC.Chat.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false, z);
                        nativeByteBufferByteBufferValue2.reuse();
                        if (chatTLdeserialize2 != null) {
                            arrayList.add(chatTLdeserialize2);
                        }
                    }
                } catch (Exception e2) {
                    checkSQLException(e2);
                }
            }
            sQLiteCursorQueryFinalized2.dispose();
        }
    }

    public void getEncryptedChatsInternal(String str, ArrayList<TLRPC.EncryptedChat> arrayList, ArrayList<Long> arrayList2) throws InterruptedException {
        if (str == null || str.length() == 0 || arrayList == null) {
            return;
        }
        SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data, user, g, authkey, ttl, layer, seq_in, seq_out, use_count, exchange_id, key_date, fprint, fauthkey, khash, in_seq_no, admin_id, mtproto_seq FROM enc_chats WHERE uid IN(%s)", str), new Object[0]);
        while (sQLiteCursorQueryFinalized.next()) {
            try {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.EncryptedChat encryptedChatTLdeserialize = TLRPC.EncryptedChat.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    nativeByteBufferByteBufferValue.reuse();
                    if (encryptedChatTLdeserialize != null) {
                        long jLongValue = sQLiteCursorQueryFinalized.longValue(1);
                        encryptedChatTLdeserialize.user_id = jLongValue;
                        if (arrayList2 != null && !arrayList2.contains(Long.valueOf(jLongValue))) {
                            arrayList2.add(Long.valueOf(encryptedChatTLdeserialize.user_id));
                        }
                        encryptedChatTLdeserialize.a_or_b = sQLiteCursorQueryFinalized.byteArrayValue(2);
                        encryptedChatTLdeserialize.auth_key = sQLiteCursorQueryFinalized.byteArrayValue(3);
                        encryptedChatTLdeserialize.ttl = sQLiteCursorQueryFinalized.intValue(4);
                        encryptedChatTLdeserialize.layer = sQLiteCursorQueryFinalized.intValue(5);
                        encryptedChatTLdeserialize.seq_in = sQLiteCursorQueryFinalized.intValue(6);
                        encryptedChatTLdeserialize.seq_out = sQLiteCursorQueryFinalized.intValue(7);
                        int iIntValue = sQLiteCursorQueryFinalized.intValue(8);
                        encryptedChatTLdeserialize.key_use_count_in = (short) (iIntValue >> 16);
                        encryptedChatTLdeserialize.key_use_count_out = (short) iIntValue;
                        encryptedChatTLdeserialize.exchange_id = sQLiteCursorQueryFinalized.longValue(9);
                        encryptedChatTLdeserialize.key_create_date = sQLiteCursorQueryFinalized.intValue(10);
                        encryptedChatTLdeserialize.future_key_fingerprint = sQLiteCursorQueryFinalized.longValue(11);
                        encryptedChatTLdeserialize.future_auth_key = sQLiteCursorQueryFinalized.byteArrayValue(12);
                        encryptedChatTLdeserialize.key_hash = sQLiteCursorQueryFinalized.byteArrayValue(13);
                        encryptedChatTLdeserialize.in_seq_no = sQLiteCursorQueryFinalized.intValue(14);
                        long jLongValue2 = sQLiteCursorQueryFinalized.longValue(15);
                        if (jLongValue2 != 0) {
                            encryptedChatTLdeserialize.admin_id = jLongValue2;
                        }
                        encryptedChatTLdeserialize.mtproto_seq = sQLiteCursorQueryFinalized.intValue(16);
                        arrayList.add(encryptedChatTLdeserialize);
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
        }
        sQLiteCursorQueryFinalized.dispose();
    }

    public void lambda$putUsersAndChats$175(List<TLRPC.User> list, List<TLRPC.Chat> list2, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        if (z) {
            try {
                try {
                    this.database.beginTransaction();
                } catch (Exception e) {
                    checkSQLException(e);
                    sQLiteDatabase = this.database;
                    if (sQLiteDatabase == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                SQLiteDatabase sQLiteDatabase2 = this.database;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.commitTransaction();
                }
                throw th;
            }
        }
        putUsersInternal(list);
        putChatsInternal(list2);
        sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.commitTransaction();
    }

    public void putUsersAndChats(final List<TLRPC.User> list, final List<TLRPC.Chat> list2, final boolean z, boolean z2) {
        if (list == null || !list.isEmpty() || list2 == null || !list2.isEmpty()) {
            if (z2) {
                this.storageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$putUsersAndChats$175(list, list2, z);
                    }
                });
            } else {
                lambda$putUsersAndChats$175(list, list2, z);
            }
        }
    }

    public void removeFromDownloadQueue(final long j, final int i, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$removeFromDownloadQueue$176(z, i, j);
            }
        });
    }

    public void lambda$removeFromDownloadQueue$176(boolean z, int i, long j) throws Throwable {
        Throwable th;
        Exception e;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                try {
                    if (z) {
                        SQLiteDatabase sQLiteDatabase = this.database;
                        Locale locale = Locale.US;
                        SQLiteCursor sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT min(date) FROM download_queue WHERE type = %d", Integer.valueOf(i)), new Object[0]);
                        try {
                            int iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : -1;
                            sQLiteCursorQueryFinalized.dispose();
                            if (iIntValue != -1) {
                                this.database.executeFast(String.format(locale, "UPDATE download_queue SET date = %d WHERE uid = %d AND type = %d", Integer.valueOf(iIntValue - 1), Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
                            }
                        } catch (Exception e2) {
                            e = e2;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            checkSQLException(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.database.executeFast(String.format(Locale.US, "DELETE FROM download_queue WHERE uid = %d AND type = %d", Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private void deleteFromDownloadQueue(final java.util.ArrayList<android.util.Pair<java.lang.Long, java.lang.Integer>> r9, boolean r10) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.deleteFromDownloadQueue(java.util.ArrayList, boolean):void");
    }

    public void lambda$deleteFromDownloadQueue$177(ArrayList arrayList) {
        getDownloadController().cancelDownloading(arrayList);
    }

    public void clearDownloadQueue(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$clearDownloadQueue$178(i);
            }
        });
    }

    public void lambda$clearDownloadQueue$178(int i) throws InterruptedException {
        try {
            if (i == 0) {
                this.database.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
            } else {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM download_queue WHERE type = %d", Integer.valueOf(i))).stepThis().dispose();
            }
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void getDownloadQueue(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$getDownloadQueue$180(i);
            }
        });
    }

    public void lambda$getDownloadQueue$180(final int r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDownloadQueue$180(int):void");
    }

    public void lambda$getDownloadQueue$179(int i, ArrayList arrayList) {
        getDownloadController().processDownloadObjects(i, arrayList);
    }

    public int getMessageMediaType(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            if (!(message.media instanceof TLRPC.TL_messageMediaPhoto) && !MessageObject.isGifMessage(message) && !MessageObject.isVoiceMessage(message) && !MessageObject.isVideoMessage(message) && !MessageObject.isRoundVideoMessage(message)) {
                return -1;
            }
            int i = message.ttl;
            return (i <= 0 || i > 60) ? 0 : 1;
        }
        if (message instanceof TLRPC.TL_message) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) || (messageMedia instanceof TLRPC.TL_messageMediaDocument)) && messageMedia.ttl_seconds != 0) {
                return 1;
            }
        }
        return ((message.media instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isVideoMessage(message)) ? 0 : -1;
    }

    public void putWebPages(final LongSparseArray longSparseArray) {
        if (isEmpty(longSparseArray)) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$putWebPages$182(longSparseArray);
            }
        });
    }

    public void lambda$putWebPages$182(androidx.collection.LongSparseArray r18) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putWebPages$182(androidx.collection.LongSparseArray):void");
    }

    public void lambda$putWebPages$181(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReceivedWebpages, arrayList);
    }

    public void overwriteChannel(final long j, final TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, final int i, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$overwriteChannel$184(j, i, tL_updates_channelDifferenceTooLong, runnable);
            }
        });
    }

    public void lambda$overwriteChannel$184(long r20, int r22, final org.telegram.tgnet.TLRPC.TL_updates_channelDifferenceTooLong r23, java.lang.Runnable r24) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$overwriteChannel$184(long, int, org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceTooLong, java.lang.Runnable):void");
    }

    public void lambda$overwriteChannel$183(long j, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.removeAllMessagesFromDialog, Long.valueOf(j), Boolean.TRUE, tL_updates_channelDifferenceTooLong);
    }

    public void putChannelViews(final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2, final LongSparseArray longSparseArray3, final boolean z) {
        if (isEmpty(longSparseArray) && isEmpty(longSparseArray2) && isEmpty(longSparseArray3)) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$putChannelViews$185(longSparseArray, longSparseArray2, longSparseArray3, z);
            }
        });
    }

    public void lambda$putChannelViews$185(androidx.collection.LongSparseArray r21, androidx.collection.LongSparseArray r22, androidx.collection.LongSparseArray r23, boolean r24) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putChannelViews$185(androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean):void");
    }

    private void updateRepliesMaxReadIdInternal(final long r22, final long r24, final int r26, int r27) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateRepliesMaxReadIdInternal(long, long, int, int):void");
    }

    public void lambda$updateRepliesMaxReadIdInternal$186(long j, long j2, int i, int i2, int i3) {
        getMessagesController().getTopicsController().updateMaxReadId(-j, j2, i, i2, i3);
    }

    private void resetForumBadgeIfNeed(long j) {
        LongSparseIntArray longSparseIntArray;
        SQLiteCursor sQLiteCursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.ENGLISH;
            SQLiteCursor sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT topic_id FROM topics WHERE did = %d AND unread_count > 0", Long.valueOf(j)), new Object[0]);
            try {
                if (sQLiteCursorQueryFinalized.next()) {
                    longSparseIntArray = null;
                } else {
                    longSparseIntArray = new LongSparseIntArray();
                    longSparseIntArray.put(j, 0);
                }
                sQLiteCursorQueryFinalized.dispose();
                if (longSparseIntArray != null) {
                    this.database.executeFast(String.format(locale, "UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = %d", Long.valueOf(j))).stepThis().dispose();
                }
                updateFiltersReadCounter(longSparseIntArray, null, true);
                getMessagesController().processDialogsUpdateRead(longSparseIntArray, null);
            } catch (Throwable th) {
                th = th;
                sQLiteCursor = sQLiteCursorQueryFinalized;
                try {
                    checkSQLException(th);
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void lambda$updateRepliesMaxReadId$187(long j, long j2, int i, int i2) throws Throwable {
        updateRepliesMaxReadIdInternal(-j, j2, i, i2);
    }

    public void updateRepliesMaxReadId(final long j, final long j2, final int i, final int i2, boolean z) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$updateRepliesMaxReadId$187(j, j2, i, i2);
                }
            });
        } else {
            updateRepliesMaxReadIdInternal(-j, j2, i, i2);
        }
    }

    public void updateRepliesCount(final long j, final int i, final ArrayList<TLRPC.Peer> arrayList, final int i2, final int i3) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateRepliesCount$188(i, j, i3, arrayList, i2);
            }
        });
    }

    public void lambda$updateRepliesCount$188(int r17, long r18, int r20, java.util.ArrayList r21, int r22) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateRepliesCount$188(int, long, int, java.util.ArrayList, int):void");
    }

    private boolean isValidKeyboardToSave(TLRPC.Message message) {
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        return (replyMarkup == null || (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) || (replyMarkup.selective && !message.mentioned)) ? false : true;
    }

    public void updateMessageVerifyFlags(final ArrayList<TLRPC.Message> arrayList) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateMessageVerifyFlags$189(arrayList);
            }
        });
    }

    public void lambda$updateMessageVerifyFlags$189(ArrayList arrayList) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        boolean z = false;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                try {
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                    try {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                            sQLitePreparedStatementExecuteFast.requery();
                            int i2 = message.stickerVerified;
                            sQLitePreparedStatementExecuteFast.bindInteger(1, i2 == 0 ? 1 : i2 == 2 ? 2 : 0);
                            sQLitePreparedStatementExecuteFast.bindInteger(2, message.id);
                            sQLitePreparedStatementExecuteFast.bindLong(3, MessageObject.getDialogId(message));
                            sQLitePreparedStatementExecuteFast.step();
                        }
                        sQLitePreparedStatementExecuteFast.dispose();
                        this.database.commitTransaction();
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        z = true;
                        checkSQLException(e);
                        if (z && (sQLiteDatabase2 = this.database) != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        z = true;
                        if (z && (sQLiteDatabase = this.database) != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void lambda$putMessages$194(java.util.ArrayList<org.telegram.tgnet.TLRPC.Message> r60, boolean r61, boolean r62, int r63, boolean r64, int r65, long r66) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putMessages$194(java.util.ArrayList, boolean, boolean, int, boolean, int, long):void");
    }

    public void lambda$putMessagesInternal$190(int i) {
        getDownloadController().newDownloadObjectsAvailable(i);
    }

    public void lambda$putMessagesInternal$191(ArrayList arrayList) {
        if (getMessagesController().getSavedMessagesController().updateSavedDialogs(arrayList)) {
            getMessagesController().getSavedMessagesController().update();
        }
    }

    public void lambda$putMessagesInternal$192(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            getMessagesController().reportMessageDelivery(((Long) pair.first).longValue(), ((Integer) pair.second).intValue(), false);
        }
    }

    private void createOrEditTopic(final long j, TLRPC.Message message) throws Throwable {
        final TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.topicStartMessage = message;
        tL_forumTopic.top_message = message.id;
        tL_forumTopic.topMessage = message;
        tL_forumTopic.from_id = message.from_id;
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        tL_forumTopic.unread_count = 0;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) messageAction;
            tL_forumTopic.id = message.id;
            long j2 = tL_messageActionTopicCreate.icon_emoji_id;
            tL_forumTopic.icon_emoji_id = j2;
            tL_forumTopic.title = tL_messageActionTopicCreate.title;
            tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
            if (j2 != 0) {
                tL_forumTopic.flags |= 1;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(tL_forumTopic);
            saveTopics(j, arrayList, false, false, message.date);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createOrEditTopic$193(j, tL_forumTopic);
                }
            });
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
            tL_forumTopic.id = (int) MessageObject.getTopicId(this.currentAccount, message, true);
            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
            tL_forumTopic.title = tL_messageActionTopicEdit.title;
            tL_forumTopic.closed = tL_messageActionTopicEdit.closed;
            tL_forumTopic.hidden = tL_messageActionTopicEdit.hidden;
            int i = tL_messageActionTopicEdit.flags;
            int i2 = (i & 1) != 0 ? 1 : 0;
            if ((i & 2) != 0) {
                i2 += 2;
            }
            if ((i & 4) != 0) {
                i2 += 8;
            }
            if ((i & 8) != 0) {
                i2 += 32;
            }
            updateTopicData(j, tL_forumTopic, i2, message.date);
        }
    }

    public void lambda$createOrEditTopic$193(long j, TLRPC.TL_forumTopic tL_forumTopic) {
        getMessagesController().getTopicsController().onTopicCreated(j, tL_forumTopic, false);
    }

    public void putMessages(ArrayList<TLRPC.Message> arrayList, boolean z, boolean z2, boolean z3, int i, int i2, long j) {
        putMessages(arrayList, z, z2, z3, i, false, i2, j);
    }

    public void putMessages(final ArrayList<TLRPC.Message> arrayList, final boolean z, boolean z2, final boolean z3, final int i, final boolean z4, final int i2, final long j) {
        if (arrayList.size() == 0) {
            return;
        }
        if (z2) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$putMessages$194(arrayList, z, z3, i, z4, i2, j);
                }
            });
        } else {
            lambda$putMessages$194(arrayList, z, z3, i, z4, i2, j);
        }
    }

    public void markMessageAsSendError(final TLRPC.Message message, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$markMessageAsSendError$195(i, message);
            }
        });
    }

    public void lambda$markMessageAsSendError$195(int i, TLRPC.Message message) throws InterruptedException {
        try {
            long j = message.id;
            if (MessageObject.isQuickReply(message)) {
                i = 5;
            }
            if (i == 5) {
                this.database.executeFast(String.format(Locale.US, "UPDATE quick_replies_messages SET send_state = 2 WHERE mid = %d AND topic_id = %d", Long.valueOf(j), Integer.valueOf(MessageObject.getQuickReplyId(this.currentAccount, message)))).stepThis().dispose();
            } else if (i == 1) {
                this.database.executeFast(String.format(Locale.US, "UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j), Long.valueOf(MessageObject.getDialogId(message)))).stepThis().dispose();
            } else {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast(String.format(locale, "UPDATE messages_v2 SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j), Long.valueOf(MessageObject.getDialogId(message)))).stepThis().dispose();
                this.database.executeFast(String.format(locale, "UPDATE messages_topics SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j), Long.valueOf(MessageObject.getDialogId(message)))).stepThis().dispose();
            }
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void markMessageAsSendErrorWithParams(final TLRPC.Message message, long j, long j2) {
        final long clientUserId = getUserConfig().getClientUserId();
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$markMessageAsSendErrorWithParams$196(message, clientUserId);
            }
        });
    }

    public void lambda$markMessageAsSendErrorWithParams$196(TLRPC.Message message, long j) {
        NativeByteBuffer nativeByteBufferByteBufferValue;
        int i = 2;
        int i2 = 0;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                long j2 = message.id;
                long dialogId = MessageObject.getDialogId(message);
                int i3 = 0;
                while (i3 < i) {
                    String str = i3 == 0 ? "messages_v2" : "messages_topics";
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Locale locale = Locale.US;
                    Long lValueOf = Long.valueOf(j2);
                    Long lValueOf2 = Long.valueOf(dialogId);
                    Object[] objArr = new Object[i];
                    objArr[i2] = lValueOf;
                    objArr[1] = lValueOf2;
                    sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT data FROM messages_v2 WHERE mid = %d AND uid = %d LIMIT 1", objArr), new Object[i2]);
                    if (sQLiteCursorQueryFinalized.next() && (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(i2)) != null) {
                        TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(i2), i2).readAttachPath(nativeByteBufferByteBufferValue, j);
                        nativeByteBufferByteBufferValue.reuse();
                    }
                    this.database.executeFast(String.format(locale, "UPDATE " + str + " SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j2), Long.valueOf(dialogId))).stepThis().dispose();
                    this.database.executeFast(String.format(locale, "UPDATE " + str + " SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j2), Long.valueOf(dialogId))).stepThis().dispose();
                    i3++;
                    i = 2;
                    i2 = 0;
                }
                if (sQLiteCursorQueryFinalized == null) {
                    return;
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized == null) {
                    return;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void setMessageSeq(final int i, final int i2, final int i3) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setMessageSeq$197(i, i2, i3);
            }
        });
    }

    public void lambda$setMessageSeq$197(int i, int i2, int i3) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                sQLitePreparedStatementExecuteFast.bindInteger(2, i2);
                sQLitePreparedStatementExecuteFast.bindInteger(3, i3);
                sQLitePreparedStatementExecuteFast.step();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public long[] lambda$updateMessageStateAndId$199(long r19, long r21, java.lang.Integer r23, int r24, int r25, int r26, int r27) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateMessageStateAndId$199(long, long, java.lang.Integer, int, int, int, int):long[]");
    }

    public void lambda$updateMessageStateAndIdInternal$198(TLRPC.TL_updates tL_updates) {
        getMessagesController().processUpdates(tL_updates, false);
    }

    public long[] updateMessageStateAndId(final long j, final long j2, final Integer num, final int i, final int i2, boolean z, final int i3, final int i4) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$updateMessageStateAndId$199(j, j2, num, i, i2, i3, i4);
                }
            });
            return null;
        }
        return lambda$updateMessageStateAndId$199(j, j2, num, i, i2, i3, i4);
    }

    public void updateMessageTopicId(final long j, final long j2, final int i) {
        executeInStorageQueue(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateMessageTopicId$200(i, j, j2);
            }
        });
    }

    public void lambda$updateMessageTopicId$200(int i, long j, long j2) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE messages_topics SET topic_id = ? WHERE uid = ? AND mid = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, i);
                sQLitePreparedStatementExecuteFast.bindLong(2, j);
                sQLitePreparedStatementExecuteFast.bindLong(3, j2);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateUsers$201(ArrayList<TLRPC.User> arrayList, boolean z, boolean z2) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (z) {
                    if (z2) {
                        this.database.beginTransaction();
                    }
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE users SET status = ? WHERE uid = ?");
                    try {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            TLRPC.User user = arrayList.get(i);
                            sQLitePreparedStatementExecuteFast.requery();
                            TLRPC.UserStatus userStatus = user.status;
                            if (userStatus != null) {
                                sQLitePreparedStatementExecuteFast.bindInteger(1, userStatus.expires);
                            } else {
                                sQLitePreparedStatementExecuteFast.bindInteger(1, 0);
                            }
                            sQLitePreparedStatementExecuteFast.bindLong(2, user.id);
                            sQLitePreparedStatementExecuteFast.step();
                        }
                        sQLitePreparedStatementExecuteFast.dispose();
                        if (z2) {
                            this.database.commitTransaction();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } else {
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    LongSparseArray longSparseArray = new LongSparseArray();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        TLRPC.User user2 = arrayList.get(i2);
                        arrayList2.add(Long.valueOf(user2.id));
                        longSparseArray.put(user2.id, user2);
                    }
                    ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                    getUsersInternal(arrayList2, arrayList3);
                    int size3 = arrayList3.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        TLRPC.User user3 = arrayList3.get(i3);
                        TLRPC.User user4 = (TLRPC.User) longSparseArray.get(user3.id);
                        if (user4 != null) {
                            if (user4.first_name != null && user4.last_name != null) {
                                if (!UserObject.isContact(user3)) {
                                    user3.first_name = user4.first_name;
                                    user3.last_name = user4.last_name;
                                }
                                user3.username = user4.username;
                            } else {
                                TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                                if (userProfilePhoto != null) {
                                    user3.photo = userProfilePhoto;
                                } else {
                                    String str = user4.phone;
                                    if (str != null) {
                                        user3.phone = str;
                                    }
                                }
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (z2) {
                            this.database.beginTransaction();
                        }
                        putUsersInternal(arrayList3);
                        if (z2) {
                            this.database.commitTransaction();
                        }
                    }
                }
                SQLiteDatabase sQLiteDatabase3 = this.database;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void updateUsers(final ArrayList<TLRPC.User> arrayList, final boolean z, final boolean z2, boolean z3) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z3) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$updateUsers$201(arrayList, z, z2);
                }
            });
        } else {
            lambda$updateUsers$201(arrayList, z, z2);
        }
    }

    public void lambda$markMessagesAsRead$203(org.telegram.messenger.support.LongSparseIntArray r19, org.telegram.messenger.support.LongSparseIntArray r20, android.util.SparseIntArray r21) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsRead$203(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, android.util.SparseIntArray):void");
    }

    private void markMessagesContentAsReadInternal(long j, ArrayList<Integer> arrayList, int i) throws Throwable {
        SQLiteCursor sQLiteCursor = null;
        ArrayList<Integer> arrayList2 = null;
        sQLiteCursor = null;
        try {
            try {
                String strJoin = TextUtils.join(",", arrayList);
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast(String.format(locale, "UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid IN (%s) AND uid = %d", strJoin, Long.valueOf(j))).stepThis().dispose();
                if (i != 0) {
                    SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(locale, "SELECT mid, ttl FROM messages_v2 WHERE mid IN (%s) AND uid = %d AND ttl > 0", strJoin, Long.valueOf(j)), new Object[0]);
                    while (sQLiteCursorQueryFinalized.next()) {
                        try {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList<>();
                            }
                            arrayList2.add(Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0)));
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            checkSQLException(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    if (arrayList2 != null) {
                        emptyMessagesMedia(j, arrayList2);
                    }
                    sQLiteCursorQueryFinalized.dispose();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void markMessagesContentAsRead(final long j, final ArrayList<Integer> arrayList, final int i, final int i2) {
        if (isEmpty(arrayList)) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$markMessagesContentAsRead$202(j, arrayList, i2, i);
            }
        });
    }

    public void lambda$markMessagesContentAsRead$202(long r9, java.util.ArrayList r11, int r12, int r13) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesContentAsRead$202(long, java.util.ArrayList, int, int):void");
    }

    public void markMessagesAsRead(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final SparseIntArray sparseIntArray, boolean z) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$markMessagesAsRead$203(longSparseIntArray, longSparseIntArray2, sparseIntArray);
                }
            });
        } else {
            lambda$markMessagesAsRead$203(longSparseIntArray, longSparseIntArray2, sparseIntArray);
        }
    }

    public void markMessagesAsDeletedByRandoms(final ArrayList<Long> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$markMessagesAsDeletedByRandoms$205(arrayList);
            }
        });
    }

    public void lambda$markMessagesAsDeletedByRandoms$205(ArrayList arrayList) throws Throwable {
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                try {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT mid, uid FROM randoms_v2 WHERE random_id IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
                } catch (Exception e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            LongSparseArray longSparseArray = new LongSparseArray();
            while (sQLiteCursorQueryFinalized.next()) {
                long jLongValue = sQLiteCursorQueryFinalized.longValue(1);
                ArrayList arrayList2 = (ArrayList) longSparseArray.get(jLongValue);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    longSparseArray.put(jLongValue, arrayList2);
                }
                arrayList2.add(Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0)));
            }
            sQLiteCursorQueryFinalized.dispose();
            if (longSparseArray.isEmpty()) {
                return;
            }
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = longSparseArray.keyAt(i);
                final ArrayList<Integer> arrayList3 = (ArrayList) longSparseArray.valueAt(i);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$markMessagesAsDeletedByRandoms$204(arrayList3);
                    }
                });
                updateDialogsWithReadMessagesInternal(arrayList3, null, null, null, null);
                lambda$markMessagesAsDeleted$213(jKeyAt, arrayList3, true, 0, 0);
                lambda$updateDialogsWithDeletedMessages$212(jKeyAt, 0L, arrayList3, null);
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$markMessagesAsDeletedByRandoms$204(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
    }

    protected void deletePushMessages(long j, ArrayList<Integer> arrayList) {
        try {
            this.database.executeFast(String.format(Locale.US, "DELETE FROM unread_push_messages WHERE uid = %d AND mid IN(%s)", Long.valueOf(j), TextUtils.join(",", arrayList))).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    private void broadcastScheduledMessagesChange(final Long l) throws Throwable {
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM scheduled_messages_v2 WHERE uid = %d", l), new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            final int iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : 0;
            sQLiteCursorQueryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$broadcastScheduledMessagesChange$206(l, iIntValue);
                }
            });
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$broadcastScheduledMessagesChange$206(Long l, int i) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.scheduledMessagesUpdated, l, Integer.valueOf(i), Boolean.TRUE);
    }

    private void broadcastQuickRepliesMessagesChange(Long l, long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$broadcastQuickRepliesMessagesChange$207();
            }
        });
    }

    public void lambda$broadcastQuickRepliesMessagesChange$207() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public java.util.ArrayList<java.lang.Long> lambda$markMessagesAsDeleted$213(long r42, java.util.ArrayList<java.lang.Integer> r44, boolean r45, int r46, int r47) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsDeleted$213(long, java.util.ArrayList, boolean, int, int):java.util.ArrayList");
    }

    public void lambda$markMessagesAsDeletedInternal$208(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$markMessagesAsDeletedInternal$209(LongSparseArray longSparseArray) {
        getMessagesController().getSavedMessagesController().updateDeleted(longSparseArray);
    }

    public void lambda$markMessagesAsDeletedInternal$210(ArrayList arrayList, long j) {
        HashSet<Long> hashSet = new HashSet<>();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            TLRPC.Message message = (TLRPC.Message) it.next();
            if (getMessagesController().processDeletedReactionTags(message)) {
                hashSet.add(Long.valueOf(MessageObject.getSavedDialogId(j, message)));
                z = true;
            }
        }
        if (z) {
            getMessagesController().updateSavedReactionTags(hashSet);
        }
    }

    public void lambda$markMessagesAsDeletedInternal$211(ArrayList arrayList) {
        HashSet<Long> hashSet = new HashSet<>();
        long[] jArr = new long[1];
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (getMediaDataController().processDeletedMessage(((Integer) arrayList.get(i)).intValue(), jArr)) {
                hashSet.add(Long.valueOf(jArr[0]));
                z = true;
            }
        }
        if (z) {
            getMessagesController().updateSavedReactionTags(hashSet);
        }
    }

    public void lambda$updateDialogsWithDeletedMessages$212(long r24, long r26, java.util.ArrayList<java.lang.Integer> r28, java.util.ArrayList<java.lang.Long> r29) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateDialogsWithDeletedMessages$212(long, long, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void updateDialogsWithDeletedMessages(final long j, final long j2, final ArrayList<Integer> arrayList, final ArrayList<Long> arrayList2, boolean z) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$updateDialogsWithDeletedMessages$212(j, j2, arrayList, arrayList2);
                }
            });
        } else {
            lambda$updateDialogsWithDeletedMessages$212(j, j2, arrayList, arrayList2);
        }
    }

    public ArrayList<Long> markMessagesAsDeleted(final long j, final ArrayList<Integer> arrayList, boolean z, final boolean z2, final int i, final int i2) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$markMessagesAsDeleted$213(j, arrayList, z2, i, i2);
                }
            });
            return null;
        }
        return lambda$markMessagesAsDeleted$213(j, arrayList, z2, i, i2);
    }

    public java.util.ArrayList<java.lang.Long> lambda$markMessagesAsDeleted$215(long r25, int r27, boolean r28) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsDeleted$215(long, int, boolean):java.util.ArrayList");
    }

    public void lambda$markMessagesAsDeletedInternal$214(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public ArrayList<Long> markMessagesAsDeleted(final long j, final int i, boolean z, final boolean z2) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$markMessagesAsDeleted$215(j, i, z2);
                }
            });
            return null;
        }
        return lambda$markMessagesAsDeleted$215(j, i, z2);
    }

    private void fixUnsupportedMedia(TLRPC.Message message) {
        if (message == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported_old) {
            if (messageMedia.bytes.length == 0) {
                messageMedia.bytes = Utilities.intToBytes(221);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            TLRPC.TL_messageMediaUnsupported_old tL_messageMediaUnsupported_old = new TLRPC.TL_messageMediaUnsupported_old();
            message.media = tL_messageMediaUnsupported_old;
            tL_messageMediaUnsupported_old.bytes = Utilities.intToBytes(221);
            message.flags |= 512;
        }
    }

    private void doneHolesInTable(String str, long j, int i, long j2) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        int i2 = 2;
        if (j2 != 0) {
            if (i == 0) {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d", Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
            } else {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = 0", Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
            }
        } else if (i == 0) {
            this.database.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d", Long.valueOf(j))).stepThis().dispose();
        } else {
            this.database.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = 0", Long.valueOf(j))).stepThis().dispose();
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (j2 != 0) {
                    sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                } else {
                    sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                }
                sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j);
                if (j2 != 0) {
                    sQLitePreparedStatement.bindLong(2, j2);
                    i2 = 3;
                }
                sQLitePreparedStatement.bindInteger(i2, 1);
                sQLitePreparedStatement.bindInteger(i2 + 1, 1);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void doneHolesInMedia(long r19, int r21, int r22, long r23) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.doneHolesInMedia(long, int, int, long):void");
    }

    private static class Hole {
        public int end;
        public int start;
        public int type;

        public Hole(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public Hole(int i, int i2, int i3) {
            this.type = i;
            this.start = i2;
            this.end = i3;
        }
    }

    public void closeHolesInMedia(long r38, int r40, int r41, int r42, long r43) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.closeHolesInMedia(long, int, int, int, long):void");
    }

    private void closeHolesInTable(java.lang.String r36, long r37, int r39, int r40, long r41) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.closeHolesInTable(java.lang.String, long, int, int, long):void");
    }

    public void replaceMessageIfExists(final TLRPC.Message message, final ArrayList<TLRPC.User> arrayList, final ArrayList<TLRPC.Chat> arrayList2, final boolean z) {
        if (message == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$replaceMessageIfExists$218(message, z, arrayList, arrayList2);
            }
        });
    }

    public void lambda$replaceMessageIfExists$218(org.telegram.tgnet.TLRPC.Message r25, boolean r26, java.util.ArrayList r27, java.util.ArrayList r28) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$replaceMessageIfExists$218(org.telegram.tgnet.TLRPC$Message, boolean, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void lambda$replaceMessageIfExists$216(MessageObject messageObject, ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(messageObject.getDialogId()), arrayList);
    }

    public void lambda$replaceMessageIfExists$217(ArrayList arrayList) {
        if (getMessagesController().getSavedMessagesController().updateSavedDialogs(arrayList)) {
            getMessagesController().getSavedMessagesController().update();
        }
    }

    public void loadMessageAttachPaths(final ArrayList<MessageObject> arrayList, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadMessageAttachPaths$219(arrayList, runnable);
            }
        });
    }

    public void lambda$loadMessageAttachPaths$219(ArrayList arrayList, Runnable runnable) {
        NativeByteBuffer nativeByteBufferByteBufferValue;
        long clientUserId = getUserConfig().getClientUserId();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) it.next();
            if (!messageObject.scheduled && !messageObject.isQuickReply()) {
                SQLiteCursor sQLiteCursorQueryFinalized = null;
                try {
                    try {
                        sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
                        if (sQLiteCursorQueryFinalized.next() && (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) != null) {
                            TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                            messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, clientUserId);
                            nativeByteBufferByteBufferValue.reuse();
                            messageObject.messageOwner.attachPath = messageTLdeserialize.attachPath;
                            messageObject.checkMediaExistance();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (sQLiteCursorQueryFinalized != null) {
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                } catch (Throwable th) {
                    if (sQLiteCursorQueryFinalized != null) {
                        sQLiteCursorQueryFinalized.dispose();
                    }
                    throw th;
                }
            }
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void putMessages(final TLRPC.messages_Messages messages_messages, final long j, final int i, final int i2, final boolean z, final int i3, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$putMessages$222(i3, messages_messages, j, j2, i, i2, z);
            }
        });
    }

    public void lambda$putMessages$222(int r52, org.telegram.tgnet.TLRPC.messages_Messages r53, long r54, long r56, int r58, int r59, boolean r60) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putMessages$222(int, org.telegram.tgnet.TLRPC$messages_Messages, long, long, int, int, boolean):void");
    }

    public void lambda$putMessages$220(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$putMessages$221(ArrayList arrayList) {
        if (getMessagesController().getSavedMessagesController().updateSavedDialogs(arrayList)) {
            getMessagesController().getSavedMessagesController().update();
        }
    }

    public static void addUsersAndChatsFromMessage(TLRPC.Message message, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, ArrayList<Long> arrayList3) {
        TL_stars.StarGift starGift;
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        String str;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer3;
        TLRPC.Peer peer4;
        TLRPC.WebPage webPage;
        TLRPC.Peer peer5;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TL_stories.StoryItem storyItem;
        TLRPC.Peer peer6;
        TLRPC.Peer peer7;
        long fromChatId = MessageObject.getFromChatId(message);
        if (DialogObject.isUserDialog(fromChatId)) {
            if (!arrayList.contains(Long.valueOf(fromChatId))) {
                arrayList.add(Long.valueOf(fromChatId));
            }
        } else if (DialogObject.isChatDialog(fromChatId)) {
            long j = -fromChatId;
            if (!arrayList2.contains(Long.valueOf(j))) {
                arrayList2.add(Long.valueOf(j));
            }
        }
        long j2 = message.via_bot_id;
        if (j2 != 0 && !arrayList.contains(Long.valueOf(j2))) {
            arrayList.add(Long.valueOf(message.via_bot_id));
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction != null) {
            long j3 = messageAction.user_id;
            if (j3 != 0 && !arrayList.contains(Long.valueOf(j3))) {
                arrayList.add(Long.valueOf(message.action.user_id));
            }
            long j4 = message.action.channel_id;
            if (j4 != 0 && !arrayList2.contains(Long.valueOf(j4))) {
                arrayList2.add(Long.valueOf(message.action.channel_id));
            }
            long j5 = message.action.chat_id;
            if (j5 != 0 && !arrayList2.contains(Long.valueOf(j5))) {
                arrayList2.add(Long.valueOf(message.action.chat_id));
            }
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                addLoadPeerInfo(((TLRPC.TL_messageActionGiftCode) messageAction2).boost_peer, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction3 = message.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached) {
                TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction3;
                addLoadPeerInfo(tL_messageActionGeoProximityReached.from_id, arrayList, arrayList2);
                addLoadPeerInfo(tL_messageActionGeoProximityReached.to_id, arrayList, arrayList2);
            }
            if (!message.action.users.isEmpty()) {
                for (int i = 0; i < message.action.users.size(); i++) {
                    Long l = message.action.users.get(i);
                    if (!arrayList.contains(l)) {
                        arrayList.add(l);
                    }
                }
            }
        }
        if (!message.entities.isEmpty()) {
            for (int i2 = 0; i2 < message.entities.size(); i2++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i2);
                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                } else if (arrayList3 != null && (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    arrayList3.add(Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id));
                }
            }
        }
        TLRPC.MessageAction messageAction4 = message.action;
        if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
            TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGift) messageAction4).gift;
            if (starGift2 != null && (peer7 = starGift2.released_by) != null) {
                addLoadPeerInfo(peer7, arrayList, arrayList2);
            }
        } else if ((messageAction4 instanceof TLRPC.TL_messageActionStarGiftUnique) && (starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction4).gift) != null && (peer = starGift.released_by) != null) {
            addLoadPeerInfo(peer, arrayList, arrayList2);
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null) {
            long j6 = messageMedia.user_id;
            if (j6 != 0 && !arrayList.contains(Long.valueOf(j6))) {
                arrayList.add(Long.valueOf(message.media.user_id));
            }
            TLRPC.MessageMedia messageMedia2 = message.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                Iterator<Long> it = ((TLRPC.TL_messageMediaGiveaway) messageMedia2).channels.iterator();
                while (it.hasNext()) {
                    Long next = it.next();
                    if (!arrayList2.contains(next)) {
                        arrayList2.add(next);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia3 = message.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                Iterator<Long> it2 = ((TLRPC.TL_messageMediaGiveawayResults) messageMedia3).winners.iterator();
                while (it2.hasNext()) {
                    Long next2 = it2.next();
                    if (!arrayList.contains(next2)) {
                        arrayList.add(next2);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia4 = message.media;
            if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia4;
                if (!tL_messageMediaPoll.results.recent_voters.isEmpty()) {
                    for (int i3 = 0; i3 < tL_messageMediaPoll.results.recent_voters.size(); i3++) {
                        addLoadPeerInfo(tL_messageMediaPoll.results.recent_voters.get(i3), arrayList, arrayList2);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia5 = message.media;
            if ((messageMedia5 instanceof TLRPC.TL_messageMediaStory) && (storyItem = messageMedia5.storyItem) != null) {
                TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                if (storyFwdHeader2 != null) {
                    addLoadPeerInfo(storyFwdHeader2.from, arrayList, arrayList2);
                }
                TL_stories.StoryItem storyItem2 = message.media.storyItem;
                if (storyItem2 != null && storyItem2.media_areas != null) {
                    for (int i4 = 0; i4 < message.media.storyItem.media_areas.size(); i4++) {
                        if (message.media.storyItem.media_areas.get(i4) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            long j7 = ((TL_stories.TL_mediaAreaChannelPost) message.media.storyItem.media_areas.get(i4)).channel_id;
                            if (!arrayList2.contains(Long.valueOf(j7))) {
                                arrayList2.add(Long.valueOf(j7));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem3 = message.media.storyItem;
                if (storyItem3 != null && (peer6 = storyItem3.from_id) != null) {
                    addLoadPeerInfo(peer6, arrayList, arrayList2);
                }
            }
            TLRPC.MessageMedia messageMedia6 = message.media;
            if ((messageMedia6 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia6.webpage) != null && webPage.attributes != null) {
                for (int i5 = 0; i5 < message.media.webpage.attributes.size(); i5++) {
                    if (message.media.webpage.attributes.get(i5) instanceof TLRPC.TL_webPageAttributeStory) {
                        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) message.media.webpage.attributes.get(i5);
                        TL_stories.StoryItem storyItem4 = tL_webPageAttributeStory.storyItem;
                        if (storyItem4 != null && (storyFwdHeader = storyItem4.fwd_from) != null) {
                            addLoadPeerInfo(storyFwdHeader.from, arrayList, arrayList2);
                        }
                        TL_stories.StoryItem storyItem5 = tL_webPageAttributeStory.storyItem;
                        if (storyItem5 != null && storyItem5.media_areas != null) {
                            for (int i6 = 0; i6 < tL_webPageAttributeStory.storyItem.media_areas.size(); i6++) {
                                if (tL_webPageAttributeStory.storyItem.media_areas.get(i6) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                    long j8 = ((TL_stories.TL_mediaAreaChannelPost) tL_webPageAttributeStory.storyItem.media_areas.get(i6)).channel_id;
                                    if (!arrayList2.contains(Long.valueOf(j8))) {
                                        arrayList2.add(Long.valueOf(j8));
                                    }
                                }
                            }
                        }
                        TL_stories.StoryItem storyItem6 = tL_webPageAttributeStory.storyItem;
                        if (storyItem6 != null && (peer5 = storyItem6.from_id) != null) {
                            addLoadPeerInfo(peer5, arrayList, arrayList2);
                        }
                    }
                }
            }
            TLRPC.Peer peer8 = message.media.peer;
            if (peer8 != null) {
                addLoadPeerInfo(peer8, arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplies messageReplies = message.replies;
        if (messageReplies != null) {
            int size = messageReplies.recent_repliers.size();
            for (int i7 = 0; i7 < size; i7++) {
                addLoadPeerInfo(message.replies.recent_repliers.get(i7), arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if (messageReplyHeader != null && (peer4 = messageReplyHeader.reply_to_peer_id) != null) {
            addLoadPeerInfo(peer4, arrayList, arrayList2);
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
        if (messageFwdHeader2 != null) {
            addLoadPeerInfo(messageFwdHeader2.from_id, arrayList, arrayList2);
            addLoadPeerInfo(message.fwd_from.saved_from_peer, arrayList, arrayList2);
        }
        TLRPC.MessageReplyHeader messageReplyHeader2 = message.reply_to;
        if (messageReplyHeader2 != null && (messageFwdHeader = messageReplyHeader2.reply_from) != null && (peer3 = messageFwdHeader.from_id) != null) {
            addLoadPeerInfo(peer3, arrayList, arrayList2);
        }
        HashMap<String, String> map = message.params;
        if (map != null && (str = map.get("fwd_peer")) != null) {
            long jLongValue = Utilities.parseLong(str).longValue();
            if (jLongValue < 0) {
                long j9 = -jLongValue;
                if (!arrayList2.contains(Long.valueOf(j9))) {
                    arrayList2.add(Long.valueOf(j9));
                }
            }
        }
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions == null || tL_messageReactions.top_reactors == null) {
            return;
        }
        for (int i8 = 0; i8 < message.reactions.top_reactors.size(); i8++) {
            TLRPC.MessageReactor messageReactor = message.reactions.top_reactors.get(i8);
            if (messageReactor != null && (peer2 = messageReactor.peer_id) != null) {
                addLoadPeerInfo(peer2, arrayList, arrayList2);
            }
        }
    }

    public static void addLoadPeerInfo(TLRPC.Peer peer, ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        if (peer instanceof TLRPC.TL_peerUser) {
            if (arrayList.contains(Long.valueOf(peer.user_id))) {
                return;
            }
            arrayList.add(Long.valueOf(peer.user_id));
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            if (arrayList2.contains(Long.valueOf(peer.channel_id))) {
                return;
            }
            arrayList2.add(Long.valueOf(peer.channel_id));
        } else {
            if (!(peer instanceof TLRPC.TL_peerChat) || arrayList2.contains(Long.valueOf(peer.chat_id))) {
                return;
            }
            arrayList2.add(Long.valueOf(peer.chat_id));
        }
    }

    public void getDialogs(final int i, final int i2, final int i3, boolean z) {
        long[] jArr;
        LongSparseArray drafts;
        int size;
        if (!z || (size = (drafts = getMediaDataController().getDrafts()).size()) <= 0) {
            jArr = null;
        } else {
            jArr = new long[size];
            for (int i4 = 0; i4 < size; i4++) {
                if (((LongSparseArray) drafts.valueAt(i4)).get(0L) != null) {
                    jArr[i4] = drafts.keyAt(i4);
                }
            }
        }
        final long[] jArr2 = jArr;
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$getDialogs$224(i, i2, i3, jArr2);
            }
        });
    }

    public void lambda$getDialogs$224(int r35, int r36, int r37, long[] r38) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogs$224(int, int, int, long[]):void");
    }

    public void lambda$getDialogs$223(LongSparseArray longSparseArray) {
        MediaDataController mediaDataController = getMediaDataController();
        mediaDataController.clearDraftsFolderIds();
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                mediaDataController.setDraftFolderId(longSparseArray.keyAt(i), ((Integer) longSparseArray.valueAt(i)).intValue());
            }
        }
    }

    public static void createFirstHoles(long j, SQLitePreparedStatement sQLitePreparedStatement, SQLitePreparedStatement sQLitePreparedStatement2, int i, long j2) {
        int i2;
        int i3;
        sQLitePreparedStatement.requery();
        sQLitePreparedStatement.bindLong(1, j);
        if (j2 != 0) {
            sQLitePreparedStatement.bindLong(2, j2);
            i2 = 3;
        } else {
            i2 = 2;
        }
        int i4 = i2 + 1;
        sQLitePreparedStatement.bindInteger(i2, i == 1 ? 1 : 0);
        sQLitePreparedStatement.bindInteger(i4, i);
        sQLitePreparedStatement.step();
        for (int i5 = 0; i5 < 8; i5++) {
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(1, j);
            if (j2 != 0) {
                sQLitePreparedStatement2.bindLong(2, j2);
                i3 = 3;
            } else {
                i3 = 2;
            }
            int i6 = i3 + 1;
            sQLitePreparedStatement2.bindInteger(i3, i5);
            int i7 = i3 + 2;
            sQLitePreparedStatement2.bindInteger(i6, i == 1 ? 1 : 0);
            sQLitePreparedStatement2.bindInteger(i7, i);
            sQLitePreparedStatement2.step();
        }
    }

    public void updateDialogData(final TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateDialogData$225(dialog);
            }
        });
    }

    public void lambda$updateDialogData$225(org.telegram.tgnet.TLRPC.Dialog r7) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateDialogData$225(org.telegram.tgnet.TLRPC$Dialog):void");
    }

    private void putDialogsInternal(org.telegram.tgnet.TLRPC.messages_Dialogs r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.putDialogsInternal(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    private int getDialogFolderIdInternal(long j) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                if (this.unknownDialogsIds.get(j) == null) {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                    iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : -1;
                    sQLiteCursorQueryFinalized.dispose();
                }
                return iIntValue;
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
                return 0;
            }
        } finally {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
        }
    }

    public void getDialogFolderId(final long j, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getDialogFolderId$227(j, intCallback);
            }
        });
    }

    public void lambda$getDialogFolderId$227(long j, final IntCallback intCallback) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                if (this.unknownDialogsIds.get(j) == null) {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                    iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : -1;
                    sQLiteCursorQueryFinalized.dispose();
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        intCallback.run(iIntValue);
                    }
                });
                if (sQLiteCursorQueryFinalized == null) {
                    return;
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized == null) {
                    return;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void setDialogsFolderId(final ArrayList<TLRPC.TL_folderPeer> arrayList, final ArrayList<TLRPC.TL_inputFolderPeer> arrayList2, final long j, final int i) {
        if (arrayList == null && arrayList2 == null && j == 0) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$setDialogsFolderId$228(arrayList, arrayList2, i, j);
            }
        });
    }

    public void lambda$setDialogsFolderId$228(ArrayList arrayList, ArrayList arrayList2, int i, long j) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        boolean z;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (arrayList != null) {
                int size = arrayList.size();
                z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.TL_folderPeer tL_folderPeer = (TLRPC.TL_folderPeer) arrayList.get(i2);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_folderPeer.peer);
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindInteger(1, tL_folderPeer.folder_id);
                    if (tL_folderPeer.folder_id == 1) {
                        z = true;
                    }
                    sQLitePreparedStatementExecuteFast.bindInteger(2, 0);
                    sQLitePreparedStatementExecuteFast.bindLong(3, peerDialogId);
                    sQLitePreparedStatementExecuteFast.step();
                    this.unknownDialogsIds.remove(peerDialogId);
                }
            } else if (arrayList2 != null) {
                int size2 = arrayList2.size();
                z = false;
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i3);
                    long peerDialogId2 = DialogObject.getPeerDialogId(tL_inputFolderPeer.peer);
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                    if (tL_inputFolderPeer.folder_id == 1) {
                        z = true;
                    }
                    sQLitePreparedStatementExecuteFast.bindInteger(2, 0);
                    sQLitePreparedStatementExecuteFast.bindLong(3, peerDialogId2);
                    sQLitePreparedStatementExecuteFast.step();
                    this.unknownDialogsIds.remove(peerDialogId2);
                }
            } else {
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                boolean z2 = i == 1;
                sQLitePreparedStatementExecuteFast.bindInteger(2, 0);
                sQLitePreparedStatementExecuteFast.bindLong(3, j);
                sQLitePreparedStatementExecuteFast.step();
                z = z2;
            }
            sQLitePreparedStatementExecuteFast.dispose();
            this.database.commitTransaction();
            if (!z) {
                lambda$checkIfFolderEmpty$230(1);
            }
            resetAllUnreadCounters(false);
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            checkSQLException(e);
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
            SQLiteDatabase sQLiteDatabase3 = this.database;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$checkIfFolderEmpty$230(final int i) {
        boolean z = false;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT did FROM dialogs WHERE folder_id = ?", Integer.valueOf(i));
                while (true) {
                    if (!sQLiteCursorQueryFinalized.next()) {
                        z = true;
                        break;
                    }
                    long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                    if (!DialogObject.isUserDialog(jLongValue) && !DialogObject.isEncryptedDialog(jLongValue)) {
                        TLRPC.Chat chat = getChat(-jLongValue);
                        if (!ChatObject.isNotInChat(chat) && chat.migrated_to == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                if (z) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$checkIfFolderEmptyInternal$229(i);
                        }
                    });
                    this.database.executeFast("DELETE FROM dialogs WHERE did = " + DialogObject.makeFolderDialogId(i)).stepThis().dispose();
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized == null) {
                    return;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void lambda$checkIfFolderEmptyInternal$229(int i) {
        getMessagesController().onFolderEmpty(i);
    }

    public void checkIfFolderEmpty(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkIfFolderEmpty$230(i);
            }
        });
    }

    public void unpinAllDialogsExceptNew(final ArrayList<Long> arrayList, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$unpinAllDialogsExceptNew$231(arrayList, i);
            }
        });
    }

    public void lambda$unpinAllDialogsExceptNew$231(java.util.ArrayList r10, int r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$unpinAllDialogsExceptNew$231(java.util.ArrayList, int):void");
    }

    public void setDialogUnread(final long j, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setDialogUnread$232(j, z);
            }
        });
    }

    public void lambda$setDialogUnread$232(long r6, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$setDialogUnread$232(long, boolean):void");
    }

    public void setDialogViewThreadAsMessages(final long j, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setDialogViewThreadAsMessages$233(j, z);
            }
        });
    }

    public void lambda$setDialogViewThreadAsMessages$233(long r6, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$setDialogViewThreadAsMessages$233(long, boolean):void");
    }

    public void resetAllUnreadCounters(boolean z) {
        int size = this.dialogFilters.size();
        for (int i = 0; i < size; i++) {
            MessagesController.DialogFilter dialogFilter = this.dialogFilters.get(i);
            if (z) {
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                    dialogFilter.pendingUnreadCount = -1;
                }
            } else {
                dialogFilter.pendingUnreadCount = -1;
            }
        }
        calcUnreadCounters(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$resetAllUnreadCounters$234();
            }
        });
    }

    public void lambda$resetAllUnreadCounters$234() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).unreadCount = arrayList.get(i).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE));
    }

    public void setDialogPinned(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setDialogPinned$235(i, j);
            }
        });
    }

    public void lambda$setDialogPinned$235(int i, long j) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                sQLitePreparedStatementExecuteFast.bindLong(2, j);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void setDialogsPinned(final ArrayList<Long> arrayList, final ArrayList<Integer> arrayList2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setDialogsPinned$236(arrayList, arrayList2);
            }
        });
    }

    public void lambda$setDialogsPinned$236(ArrayList arrayList, ArrayList arrayList2) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindInteger(1, ((Integer) arrayList2.get(i)).intValue());
                    sQLitePreparedStatementExecuteFast.bindLong(2, ((Long) arrayList.get(i)).longValue());
                    sQLitePreparedStatementExecuteFast.step();
                }
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void putDialogs(final TLRPC.messages_Dialogs messages_dialogs, final int i) {
        if (messages_dialogs.dialogs.isEmpty()) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$putDialogs$237(messages_dialogs, i);
            }
        });
    }

    public void lambda$putDialogs$237(TLRPC.messages_Dialogs messages_dialogs, int i) throws InterruptedException {
        putDialogsInternal(messages_dialogs, i);
        try {
            loadUnreadMessages();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void getDialogMaxMessageId(final long j, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getDialogMaxMessageId$239(j, intCallback);
            }
        });
    }

    public void lambda$getDialogMaxMessageId$239(long j, final IntCallback intCallback) {
        final int[] iArr = new int[1];
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    iArr[0] = sQLiteCursorQueryFinalized.intValue(0);
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.lambda$getDialogMaxMessageId$238(intCallback, iArr);
                }
            });
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public static void lambda$getDialogMaxMessageId$238(IntCallback intCallback, int[] iArr) {
        intCallback.run(iArr[0]);
    }

    public int getDialogReadMaxSync(boolean z, long j) {
        int iIntValue = 0;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                if (z) {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + j, new Object[0]);
                    if (sQLiteCursorQueryFinalized.next()) {
                        iIntValue = sQLiteCursorQueryFinalized.intValue(0);
                    }
                } else {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + j, new Object[0]);
                    if (sQLiteCursorQueryFinalized.next()) {
                        int iIntValue2 = sQLiteCursorQueryFinalized.intValue(0);
                        int iIntValue3 = sQLiteCursorQueryFinalized.intValue(1);
                        if (iIntValue3 <= iIntValue2) {
                            iIntValue = iIntValue3;
                        }
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            return iIntValue;
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public int getDialogReadMax(final boolean z, final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getDialogReadMax$240(z, j, numArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return numArr[0].intValue();
    }

    public void lambda$getDialogReadMax$240(boolean z, long j, Integer[] numArr, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                if (z) {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + j, new Object[0]);
                    if (sQLiteCursorQueryFinalized.next()) {
                        numArr[0] = Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0));
                    }
                } else {
                    sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + j, new Object[0]);
                    if (sQLiteCursorQueryFinalized.next()) {
                        int iIntValue = sQLiteCursorQueryFinalized.intValue(0);
                        int iIntValue2 = sQLiteCursorQueryFinalized.intValue(1);
                        if (iIntValue2 > iIntValue) {
                            numArr[0] = 0;
                        } else {
                            numArr[0] = Integer.valueOf(iIntValue2);
                        }
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public int getChannelPtsSync(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$getChannelPtsSync$241(j, numArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return numArr[0].intValue();
    }

    public void lambda$getChannelPtsSync$241(long j, Integer[] numArr, CountDownLatch countDownLatch) throws InterruptedException {
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT pts FROM dialogs WHERE did = " + (-j), new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    numArr[0] = Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0));
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            try {
                countDownLatch.countDown();
            } catch (Exception e2) {
                checkSQLException(e2);
            }
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public TLRPC.User getUserSync(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final TLRPC.User[] userArr = new TLRPC.User[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getUserSync$242(userArr, j, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return userArr[0];
    }

    public void lambda$getUserSync$242(TLRPC.User[] userArr, long j, CountDownLatch countDownLatch) {
        userArr[0] = getUser(j);
        countDownLatch.countDown();
    }

    public TLRPC.Chat getChatSync(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final TLRPC.Chat[] chatArr = new TLRPC.Chat[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getChatSync$243(chatArr, j, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return chatArr[0];
    }

    public void lambda$getChatSync$243(TLRPC.Chat[] chatArr, long j, CountDownLatch countDownLatch) {
        chatArr[0] = getChat(j);
        countDownLatch.countDown();
    }

    public TLRPC.User getUser(long j) throws InterruptedException {
        try {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            ArrayList<Long> arrayList2 = new ArrayList<>();
            arrayList2.add(Long.valueOf(j));
            getUsersInternal(arrayList2, arrayList);
            if (!arrayList.isEmpty()) {
                return arrayList.get(0);
            }
        } catch (Exception e) {
            checkSQLException(e);
        }
        return null;
    }

    public ArrayList<TLRPC.User> getUsers(ArrayList<Long> arrayList) throws InterruptedException {
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        try {
            getUsersInternal(arrayList, arrayList2);
        } catch (Exception e) {
            arrayList2.clear();
            checkSQLException(e);
        }
        return arrayList2;
    }

    public ArrayList<TLRPC.Chat> getChats(ArrayList<Long> arrayList) throws InterruptedException {
        ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
        try {
            getChatsInternal(TextUtils.join(",", arrayList), arrayList2);
        } catch (Exception e) {
            arrayList2.clear();
            checkSQLException(e);
        }
        return arrayList2;
    }

    public TLRPC.Chat getChat(long j) {
        try {
            ArrayList<TLRPC.Chat> arrayList = new ArrayList<>();
            getChatsInternal("" + j, arrayList);
            if (!arrayList.isEmpty()) {
                return arrayList.get(0);
            }
        } catch (Exception e) {
            checkSQLException(e);
        }
        return null;
    }

    public TLRPC.EncryptedChat getEncryptedChat(long j) throws InterruptedException {
        try {
            ArrayList<TLRPC.EncryptedChat> arrayList = new ArrayList<>();
            getEncryptedChatsInternal("" + j, arrayList, null);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList.get(0);
        } catch (Exception e) {
            checkSQLException(e);
            return null;
        }
    }

    public void localSearch(int r29, java.lang.String r30, java.util.ArrayList<java.lang.Object> r31, java.util.ArrayList<java.lang.CharSequence> r32, java.util.ArrayList<org.telegram.tgnet.TLRPC.User> r33, java.util.ArrayList<java.lang.Long> r34, int r35) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.localSearch(int, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public static int lambda$localSearch$244(DialogsSearchAdapter.DialogSearchResult dialogSearchResult, DialogsSearchAdapter.DialogSearchResult dialogSearchResult2) {
        int i = dialogSearchResult.date;
        int i2 = dialogSearchResult2.date;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public ArrayList<Integer> getCachedMessagesInRange(long j, int i, int i2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT mid FROM messages_v2 WHERE uid = %d AND date >= %d AND date <= %d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    try {
                        arrayList.add(Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0)));
                    } catch (Exception e) {
                        checkSQLException(e);
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
            } catch (Exception e2) {
                checkSQLException(e2);
                if (0 != 0) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void updateUnreadReactionsCount(long j, long j2, int i) {
        updateUnreadReactionsCount(j, j2, i, false);
    }

    public void updateUnreadReactionsCount(final long j, final long j2, final int i, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateUnreadReactionsCount$245(j2, z, j, i);
            }
        });
    }

    public void lambda$updateUnreadReactionsCount$245(long r10, boolean r12, long r13, int r15) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateUnreadReactionsCount$245(long, boolean, long, int):void");
    }

    public void markMessageReactionsAsRead(final long j, final long j2, final int i, boolean z) {
        if (z) {
            getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$markMessageReactionsAsRead$246(j, j2, i);
                }
            });
        } else {
            lambda$markMessageReactionsAsRead$246(j, j2, i);
        }
    }

    public void lambda$markMessageReactionsAsRead$246(long r19, long r21, int r23) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessageReactionsAsRead$246(long, long, int):void");
    }

    public void updateDialogUnreadReactions(final long j, final long j2, final int i, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateDialogUnreadReactions$247(z, j, i, j2);
            }
        });
    }

    public void lambda$updateDialogUnreadReactions$247(boolean r17, long r18, int r20, long r21) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateDialogUnreadReactions$247(boolean, long, int, long):void");
    }

    public void putGiftChatTheme(TLRPC.ChatTheme chatTheme) {
        putGiftChatThemes(Collections.singletonList(chatTheme));
    }

    public void putGiftChatThemes(final List<TLRPC.ChatTheme> list) {
        executeInStorageQueue(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$putGiftChatThemes$248(list);
            }
        });
    }

    public void lambda$putGiftChatThemes$248(List list) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                try {
                    sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        TLRPC.ChatTheme chatTheme = (TLRPC.ChatTheme) it.next();
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
                            sQLitePreparedStatementExecuteFast.requery();
                            sQLitePreparedStatementExecuteFast.bindString(1, tL_chatThemeUniqueGift.gift.slug);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_chatThemeUniqueGift.getObjectSize());
                            tL_chatThemeUniqueGift.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                            nativeByteBuffer.reuse();
                            sQLitePreparedStatementExecuteFast.step();
                        }
                    }
                    sQLitePreparedStatementExecuteFast.dispose();
                } catch (Exception e) {
                    FileLog.e(e);
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
            } catch (SQLiteException e2) {
                checkSQLException(e2);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
                sQLitePreparedStatementExecuteFast.dispose();
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void loadGiftChatTheme(final Utilities.Callback<List<TLRPC.TL_chatThemeUniqueGift>> callback) {
        executeInStorageQueue(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$loadGiftChatTheme$251(callback);
            }
        });
    }

    public void lambda$loadGiftChatTheme$251(final org.telegram.messenger.Utilities.Callback r7) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadGiftChatTheme$251(org.telegram.messenger.Utilities$Callback):void");
    }

    private void executeInStorageQueue(Runnable runnable) {
        if (this.storageQueue.getHandler().getLooper() != Looper.myLooper()) {
            this.storageQueue.postRunnable(runnable);
        } else {
            runnable.run();
        }
    }

    public void saveStoryAlbumsCache(final long j, final List<StoriesController.StoryAlbum> list) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveStoryAlbumsCache$252(j, list);
            }
        });
    }

    public void lambda$saveStoryAlbumsCache$252(long j, List<StoriesController.StoryAlbum> list) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                this.database.beginTransaction();
                this.database.executeFast("DELETE FROM profile_stories_albums WHERE dialog_id = " + j).stepThis().dispose();
                sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO profile_stories_albums VALUES(?, ?, ?, ?)");
                for (int i = 0; i < list.size(); i++) {
                    StoriesController.StoryAlbum storyAlbum = list.get(i);
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindLong(1, j);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, storyAlbum.album_id);
                    sQLitePreparedStatementExecuteFast.bindInteger(3, i);
                    TL_stories.TL_storyAlbum tl = storyAlbum.toTl();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tl.getObjectSize());
                    tl.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.step();
                    nativeByteBuffer.reuse();
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                }
            }
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            this.database.commitTransaction();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            this.database.commitTransaction();
            throw th;
        }
    }

    public void loadStoryAlbumsCache(final long j, final Consumer<List<StoriesController.StoryAlbum>> consumer) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadStoryAlbumsCache$253(j, consumer);
            }
        });
    }

    public void lambda$loadStoryAlbumsCache$253(long j, Consumer consumer) {
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM profile_stories_albums WHERE dialog_id = %d ORDER BY order_index ASC", Long.valueOf(j)), new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        TL_stories.TL_storyAlbum tL_storyAlbumTLdeserialize = TL_stories.TL_storyAlbum.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        nativeByteBufferByteBufferValue.reuse();
                        if (tL_storyAlbumTLdeserialize != null) {
                            arrayList.add(StoriesController.StoryAlbum.from(tL_storyAlbumTLdeserialize));
                        }
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            consumer.p(arrayList);
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public SQLiteCursor createLoadStoriesCursor(long j, int i, int i2) {
        return this.database.queryFinalized(String.format(Locale.US, "SELECT data, seen, pin FROM profile_stories JOIN profile_stories_albums_links ON profile_stories.story_id = profile_stories_albums_links.story_id WHERE profile_stories.dialog_id = %d AND profile_stories_albums_links.dialog_id = %d  AND profile_stories_albums_links.album_id = %d AND profile_stories.type = %d ORDER BY profile_stories_albums_links.order_index ASC;", Long.valueOf(j), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
    }

    public boolean isMonoForum(long j) {
        return isForum(j, 4);
    }

    public int getForumTypeFlags(long j) throws InterruptedException {
        int i = this.dialogIsForumTyped.get(j, -1);
        if (i == -1) {
            int i2 = 0;
            if (j < 0) {
                TLRPC.Chat chat = getChat(-j);
                if (chat != null && chat.forum) {
                    i2 = chat.forum_tabs ? 3 : 1;
                }
                i = (chat == null || !chat.monoforum) ? i2 : i2 | 4;
            } else {
                TLRPC.User user = getUser(j);
                i = (user == null || !user.bot_forum_view) ? 0 : 8;
            }
            this.dialogIsForumTyped.put(j, i);
        }
        return i;
    }

    public boolean isForum(long j, int i) {
        return (getForumTypeFlags(j) & i) != 0;
    }

    private void isForumCacheInvalidate(long j) {
        this.dialogIsForumTyped.delete(j);
    }

    public static class TopicKey {
        public long dialogId;
        public long topicId;

        public static TopicKey of(long j, long j2) {
            TopicKey topicKey = new TopicKey();
            topicKey.dialogId = j;
            topicKey.topicId = j2;
            return topicKey;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TopicKey topicKey = (TopicKey) obj;
            return this.dialogId == topicKey.dialogId && this.topicId == topicKey.topicId;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.dialogId), Long.valueOf(this.topicId));
        }

        public String toString() {
            return "TopicKey{dialogId=" + this.dialogId + ", topicId=" + this.topicId + '}';
        }
    }
}
