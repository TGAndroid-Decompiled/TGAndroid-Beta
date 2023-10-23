package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import j$.util.function.Consumer;
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
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$ChatParticipants;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DraftMessage;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$InputChannel;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessageReplies;
import org.telegram.tgnet.TLRPC$MessageReplyHeader;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Poll;
import org.telegram.tgnet.TLRPC$PollResults;
import org.telegram.tgnet.TLRPC$ReplyMarkup;
import org.telegram.tgnet.TLRPC$TL_channelFull;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_chatFull;
import org.telegram.tgnet.TLRPC$TL_chatParticipant;
import org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$TL_dialog;
import org.telegram.tgnet.TLRPC$TL_folderPeer;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_inputFolderPeer;
import org.telegram.tgnet.TLRPC$TL_inputMessageEntityMentionName;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageActionChatAddUser;
import org.telegram.tgnet.TLRPC$TL_messageActionGeoProximityReached;
import org.telegram.tgnet.TLRPC$TL_messageActionTopicCreate;
import org.telegram.tgnet.TLRPC$TL_messageActionTopicEdit;
import org.telegram.tgnet.TLRPC$TL_messageEntityCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_messageEntityMentionName;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported;
import org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported_old;
import org.telegram.tgnet.TLRPC$TL_messageReactions;
import org.telegram.tgnet.TLRPC$TL_message_secret;
import org.telegram.tgnet.TLRPC$TL_messages_botCallbackAnswer;
import org.telegram.tgnet.TLRPC$TL_messages_botResults;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettings;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_replyInlineMarkup;
import org.telegram.tgnet.TLRPC$TL_updates;
import org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceTooLong;
import org.telegram.tgnet.TLRPC$TL_userStatusLastMonth;
import org.telegram.tgnet.TLRPC$TL_userStatusLastWeek;
import org.telegram.tgnet.TLRPC$TL_userStatusRecently;
import org.telegram.tgnet.TLRPC$TL_username;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$messages_Dialogs;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
public class MessagesStorage extends BaseController {
    public static final String[] DATABASE_TABLES;
    public static final int LAST_DB_VERSION = 135;
    private int archiveUnreadCount;
    private int[][] bots;
    private File cacheFile;
    private int[][] channels;
    private int[][] contacts;
    private SQLiteDatabase database;
    private boolean databaseCreated;
    private boolean databaseMigrationInProgress;
    private ArrayList<MessagesController.DialogFilter> dialogFilters;
    private SparseArray<MessagesController.DialogFilter> dialogFiltersMap;
    private LongSparseIntArray dialogIsForum;
    private LongSparseArray<Integer> dialogsWithMentions;
    private LongSparseArray<Integer> dialogsWithUnread;
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
    private AtomicLong lastTaskId;
    private int mainUnreadCount;
    private int[] mentionChannels;
    private int[] mentionGroups;
    private int[][] nonContacts;
    private CountDownLatch openSync;
    private volatile int pendingArchiveUnreadCount;
    private volatile int pendingMainUnreadCount;
    private int secretG;
    private byte[] secretPBytes;
    private File shmCacheFile;
    public boolean showClearDatabaseAlert;
    private DispatchQueue storageQueue;
    private SparseArray<ArrayList<Runnable>> tasks;
    boolean tryRecover;
    private LongSparseArray<Boolean> unknownDialogsIds;
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
        DATABASE_TABLES = new String[]{"messages_holes", "media_holes_v2", "scheduled_messages_v2", "messages_v2", "download_queue", "user_contacts_v7", "user_phones_v7", "dialogs", "dialog_filter", "dialog_filter_ep", "dialog_filter_pin_v2", "randoms_v2", "enc_tasks_v4", "messages_seq", "params", "media_v4", "bot_keyboard", "bot_keyboard_topics", "chat_settings_v2", "user_settings", "chat_pinned_v2", "chat_pinned_count", "chat_hints", "botcache", "users_data", "users", "chats", "enc_chats", "channel_users_v2", "channel_admins_v3", "contacts", "dialog_photos", "dialog_settings", "web_recent_v3", "stickers_v2", "stickers_featured", "stickers_dice", "stickersets", "hashtag_recent_v2", "webpage_pending_v2", "sent_files_v2", "search_recent", "media_counts_v2", "keyvalue", "bot_info_v2", "pending_tasks", "requested_holes", "sharing_locations", "shortcut_widget", "emoji_keywords_v2", "emoji_keywords_info_v2", "wallpapers2", "unread_push_messages", "polls_v2", "reactions", "reaction_mentions", "downloading_documents", "animated_emoji", "attach_menu_bots", "premium_promo", "emoji_statuses", "messages_holes_topics", "messages_topics", "media_topics", "media_holes_topics", "topics", "media_counts_topics", "reaction_mentions_topics", "emoji_groups"};
    }

    public static MessagesStorage getInstance(int i) {
        MessagesStorage messagesStorage = Instance[i];
        if (messagesStorage == null) {
            synchronized (lockObjects[i]) {
                messagesStorage = Instance[i];
                if (messagesStorage == null) {
                    MessagesStorage[] messagesStorageArr = Instance;
                    MessagesStorage messagesStorage2 = new MessagesStorage(i);
                    messagesStorageArr[i] = messagesStorage2;
                    messagesStorage = messagesStorage2;
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
        this.unknownDialogsIds = new LongSparseArray<>();
        this.openSync = new CountDownLatch(1);
        this.dialogIsForum = new LongSparseIntArray();
        this.contacts = new int[][]{new int[2], new int[2]};
        this.nonContacts = new int[][]{new int[2], new int[2]};
        this.bots = new int[][]{new int[2], new int[2]};
        this.channels = new int[][]{new int[2], new int[2]};
        this.groups = new int[][]{new int[2], new int[2]};
        this.mentionChannels = new int[2];
        this.mentionGroups = new int[2];
        this.dialogsWithMentions = new LongSparseArray<>();
        this.dialogsWithUnread = new LongSparseArray<>();
        DispatchQueue dispatchQueue = new DispatchQueue("storageQueue_" + i);
        this.storageQueue = dispatchQueue;
        dispatchQueue.setPriority(8);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$new$0();
            }
        });
    }

    public void lambda$new$0() {
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
        long length = file != null ? 0 + file.length() : 0L;
        File file2 = this.shmCacheFile;
        return file2 != null ? length + file2.length() : length;
    }

    public void openDatabase(int i) {
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
        boolean z = !this.cacheFile.exists();
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
            this.database = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            this.database.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
            this.database.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            if (z) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("create new database");
                }
                createTables(this.database);
            } else {
                int intValue = this.database.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current db version = " + intValue);
                }
                if (intValue == 0) {
                    throw new Exception("malformed");
                }
                try {
                    SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT seq, pts, date, qts, lsv, sg, pbytes FROM params WHERE id = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        this.lastSeqValue = queryFinalized.intValue(0);
                        this.lastPtsValue = queryFinalized.intValue(1);
                        this.lastDateValue = queryFinalized.intValue(2);
                        this.lastQtsValue = queryFinalized.intValue(3);
                        this.lastSecretVersion = queryFinalized.intValue(4);
                        this.secretG = queryFinalized.intValue(5);
                        if (queryFinalized.isNull(6)) {
                            this.secretPBytes = null;
                        } else {
                            byte[] byteArrayValue = queryFinalized.byteArrayValue(6);
                            this.secretPBytes = byteArrayValue;
                            if (byteArrayValue != null && byteArrayValue.length == 1) {
                                this.secretPBytes = null;
                            }
                        }
                    }
                    queryFinalized.dispose();
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
                if (intValue < 135) {
                    try {
                        updateDbToLastVersion(intValue);
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
                openDatabase(i != 1 ? 3 : 2);
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$openDatabase$1();
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
                MessagesStorage.this.lambda$openDatabase$2();
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

    private boolean recoverDatabase() {
        this.database.close();
        boolean recoverDatabase = DatabaseMigrationHelper.recoverDatabase(this.cacheFile, this.walCacheFile, this.shmCacheFile, this.currentAccount);
        FileLog.e("Database restored = " + recoverDatabase);
        if (recoverDatabase) {
            try {
                SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
                this.database = sQLiteDatabase;
                sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
                this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
                this.database.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
                this.database.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            } catch (SQLiteException e) {
                FileLog.e(new Exception(e));
                recoverDatabase = false;
            }
        }
        if (!recoverDatabase) {
            cleanupInternal(true);
            openDatabase(1);
            recoverDatabase = this.databaseCreated;
            FileLog.e("Try create new database = " + recoverDatabase);
        }
        if (recoverDatabase) {
            reset();
        }
        return recoverDatabase;
    }

    public static void createTables(SQLiteDatabase sQLiteDatabase) throws SQLiteException {
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
        sQLiteDatabase.executeFast("CREATE TABLE dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT)").stepThis().dispose();
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
        sQLiteDatabase.executeFast("CREATE TABLE stickersets(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER);").stepThis().dispose();
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
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER, date INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, topicId INTEGER, PRIMARY KEY(uid, mid))").stepThis().dispose();
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
        sQLiteDatabase.executeFast("CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, read_outbox INTEGER, pinned INTEGER, total_messages_count INTEGER, hidden INTEGER, PRIMARY KEY(did, topic_id));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS did_topics ON topics(did);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE app_config(data BLOB)").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, custom_params BLOB, PRIMARY KEY (dialog_id, story_id));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, PRIMARY KEY(dialog_id, story_id));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB, type INTEGER);").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, PRIMARY KEY(uid, sid));").stepThis().dispose();
        sQLiteDatabase.executeFast("CREATE TABLE unconfirmed_auth (data BLOB);").stepThis().dispose();
        sQLiteDatabase.executeFast("PRAGMA user_version = 135").stepThis().dispose();
    }

    public boolean isDatabaseMigrationInProgress() {
        return this.databaseMigrationInProgress;
    }

    private void updateDbToLastVersion(int i) throws Exception {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateDbToLastVersion$3();
            }
        });
        FileLog.d("MessagesStorage start db migration from " + i + " to " + LAST_DB_VERSION);
        int migrate = DatabaseMigrationHelper.migrate(this, i);
        StringBuilder sb = new StringBuilder();
        sb.append("MessagesStorage db migration finished to varsion ");
        sb.append(migrate);
        FileLog.d(sb.toString());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateDbToLastVersion$4();
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

    public void executeNoException(String str) {
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
            public final void run() {
                MessagesStorage.this.lambda$cleanup$6(z);
            }
        });
    }

    public void lambda$cleanup$6(boolean z) {
        cleanupInternal(true);
        openDatabase(1);
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$cleanup$5();
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
            public final void run() {
                MessagesStorage.this.lambda$saveSecretParams$7(i, i2, bArr);
            }
        });
    }

    public void lambda$saveSecretParams$7(int i, int i2, byte[] bArr) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
            executeFast.bindInteger(1, i);
            executeFast.bindInteger(2, i2);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(bArr != null ? bArr.length : 1);
            if (bArr != null) {
                nativeByteBuffer.writeBytes(bArr);
            }
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void checkSQLException(Throwable th) {
        checkSQLException(th, true);
    }

    private void checkSQLException(Throwable th, boolean z) {
        if ((th instanceof SQLiteException) && th.getMessage() != null && th.getMessage().contains("is malformed") && !this.tryRecover) {
            this.tryRecover = true;
            FileLog.e("disk image malformed detected, try recover");
            if (recoverDatabase()) {
                this.tryRecover = false;
                clearLoadingDialogsOffsets();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$checkSQLException$8();
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
            public final void run() {
                MessagesStorage.this.lambda$fixNotificationSettings$9();
            }
        });
    }

    public void lambda$fixNotificationSettings$9() {
        try {
            LongSparseArray longSparseArray = new LongSparseArray();
            Map<String, ?> all = MessagesController.getNotificationsSettings(this.currentAccount).getAll();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith(NotificationsSettingsFacade.PROPERTY_NOTIFY)) {
                    Integer num = (Integer) entry.getValue();
                    if (num.intValue() == 2 || num.intValue() == 3) {
                        String replace = key.replace(NotificationsSettingsFacade.PROPERTY_NOTIFY, "");
                        long j = 1;
                        if (num.intValue() != 2) {
                            Integer num2 = (Integer) all.get(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + replace);
                            if (num2 != null) {
                                j = 1 | (num2.intValue() << 32);
                            }
                        }
                        try {
                            longSparseArray.put(Long.parseLong(replace), Long.valueOf(j));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            try {
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                for (int i = 0; i < longSparseArray.size(); i++) {
                    executeFast.requery();
                    executeFast.bindLong(1, longSparseArray.keyAt(i));
                    executeFast.bindLong(2, ((Long) longSparseArray.valueAt(i)).longValue());
                    executeFast.step();
                }
                executeFast.dispose();
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
                MessagesStorage.this.lambda$createPendingTask$10(andAdd, nativeByteBuffer);
            }
        });
        return andAdd;
    }

    public void lambda$createPendingTask$10(long j, NativeByteBuffer nativeByteBuffer) {
        try {
            try {
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
                executeFast.bindLong(1, j);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.step();
                executeFast.dispose();
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
            public final void run() {
                MessagesStorage.this.lambda$removePendingTask$11(j);
            }
        });
    }

    public void lambda$removePendingTask$11(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM pending_tasks WHERE id = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    private void loadPendingTasks() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadPendingTasks$32();
            }
        });
    }

    public void lambda$loadPendingTasks$32() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadPendingTasks$32():void");
    }

    public void lambda$loadPendingTasks$12(TLRPC$Chat tLRPC$Chat, long j) {
        getMessagesController().loadUnknownChannel(tLRPC$Chat, j);
    }

    public void lambda$loadPendingTasks$13(long j, int i, long j2) {
        getMessagesController().getChannelDifference(j, i, j2, null);
    }

    public void lambda$loadPendingTasks$14(TLRPC$Dialog tLRPC$Dialog, TLRPC$InputPeer tLRPC$InputPeer, long j) {
        getMessagesController().checkLastDialogMessage(tLRPC$Dialog, tLRPC$InputPeer, j);
    }

    public void lambda$loadPendingTasks$15(long j, boolean z, TLRPC$InputPeer tLRPC$InputPeer, long j2) {
        getMessagesController().pinDialog(j, z, tLRPC$InputPeer, j2);
    }

    public void lambda$loadPendingTasks$16(long j, int i, long j2, TLRPC$InputChannel tLRPC$InputChannel) {
        getMessagesController().getChannelDifference(j, i, j2, tLRPC$InputChannel);
    }

    public void lambda$loadPendingTasks$17(long j, int i, long j2, TLRPC$InputChannel tLRPC$InputChannel) {
        getMessagesController().getChannelDifference(j, i, j2, tLRPC$InputChannel);
    }

    public void lambda$loadPendingTasks$18(long j, long j2, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, -j, true, false, false, j2, tLObject);
    }

    public void lambda$loadPendingTasks$19(long j, long j2, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, j, true, false, false, j2, tLObject);
    }

    public void lambda$loadPendingTasks$20(long j, TLRPC$InputPeer tLRPC$InputPeer, long j2) {
        getMessagesController().markDialogAsUnread(j, tLRPC$InputPeer, j2);
    }

    public void lambda$loadPendingTasks$21(long j, int i, TLRPC$InputChannel tLRPC$InputChannel, int i2, long j2) {
        getMessagesController().markMessageAsRead2(-j, i, tLRPC$InputChannel, i2, j2);
    }

    public void lambda$loadPendingTasks$22(long j, int i, TLRPC$InputChannel tLRPC$InputChannel, int i2, long j2, int i3) {
        getMessagesController().markMessageAsRead2(j, i, tLRPC$InputChannel, i2, j2, i3 == 23);
    }

    public void lambda$loadPendingTasks$23(Theme.OverrideWallpaperInfo overrideWallpaperInfo, boolean z, long j) {
        getMessagesController().saveWallpaperToServer(null, overrideWallpaperInfo, z, j);
    }

    public void lambda$loadPendingTasks$24(long j, boolean z, int i, int i2, boolean z2, TLRPC$InputPeer tLRPC$InputPeer, long j2) {
        getMessagesController().deleteDialog(j, z ? 1 : 0, i, i2, z2, tLRPC$InputPeer, j2);
    }

    public void lambda$loadPendingTasks$25(TLRPC$InputPeer tLRPC$InputPeer, long j) {
        getMessagesController().loadUnknownDialog(tLRPC$InputPeer, j);
    }

    public void lambda$loadPendingTasks$26(int i, ArrayList arrayList, long j) {
        getMessagesController().reorderPinnedDialogs(i, arrayList, j);
    }

    public void lambda$loadPendingTasks$27(int i, ArrayList arrayList, long j) {
        getMessagesController().addDialogToFolder(null, i, -1, arrayList, j);
    }

    public void lambda$loadPendingTasks$28(long j, long j2, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, j, true, true, false, j2, tLObject);
    }

    public void lambda$loadPendingTasks$29(TLRPC$InputPeer tLRPC$InputPeer, long j) {
        getMessagesController().reloadMentionsCountForChannel(tLRPC$InputPeer, j);
    }

    public void lambda$loadPendingTasks$30(int i, boolean z, long j) {
        getSecretChatHelper().declineSecretChat(i, z, j);
    }

    public void lambda$loadPendingTasks$31(long j, long j2, int i) {
        getMessagesController().lambda$checkDeletingTask$72(j, j2, i);
    }

    public void saveChannelPts(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveChannelPts$33(i, j);
            }
        });
    }

    public void lambda$saveChannelPts$33(int i, long j) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
            executeFast.bindInteger(1, i);
            executeFast.bindLong(2, -j);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void lambda$saveDiffParams$34(int i, int i2, int i3, int i4) {
        try {
            if (this.lastSavedSeq == i && this.lastSavedPts == i2 && this.lastSavedDate == i3 && this.lastQtsValue == i4) {
                return;
            }
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE params SET seq = ?, pts = ?, date = ?, qts = ? WHERE id = 1");
            executeFast.bindInteger(1, i);
            executeFast.bindInteger(2, i2);
            executeFast.bindInteger(3, i3);
            executeFast.bindInteger(4, i4);
            executeFast.step();
            executeFast.dispose();
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
            public final void run() {
                MessagesStorage.this.lambda$saveDiffParams$34(i, i2, i3, i4);
            }
        });
    }

    public void lambda$updateMutedDialogsFiltersCounters$35() {
        resetAllUnreadCounters(true);
    }

    public void updateMutedDialogsFiltersCounters() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMutedDialogsFiltersCounters$35();
            }
        });
    }

    public void setDialogFlags(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setDialogFlags$36(j, j2);
            }
        });
    }

    public void lambda$setDialogFlags$36(long j, long j2) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT flags FROM dialog_settings WHERE did = " + j, new Object[0]);
            int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            if (j2 == intValue) {
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
            public final void run() {
                MessagesStorage.this.lambda$putStoryPushMessage$37(storyNotification);
            }
        });
    }

    public void lambda$putStoryPushMessage$37(NotificationsController.StoryNotification storyNotification) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM story_pushes WHERE uid = " + storyNotification.dialogId).stepThis().dispose();
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
            for (Map.Entry<Integer, Pair<Long, Long>> entry : storyNotification.dateByIds.entrySet()) {
                int intValue = entry.getKey().intValue();
                long longValue = ((Long) entry.getValue().first).longValue();
                long longValue2 = ((Long) entry.getValue().second).longValue();
                executeFast.requery();
                int i = 1;
                executeFast.bindLong(1, storyNotification.dialogId);
                executeFast.bindInteger(2, intValue);
                executeFast.bindLong(3, longValue);
                if (storyNotification.localName == null) {
                    storyNotification.localName = "";
                }
                executeFast.bindString(4, storyNotification.localName);
                if (!storyNotification.hidden) {
                    i = 0;
                }
                executeFast.bindInteger(5, i);
                executeFast.bindLong(6, longValue2);
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void deleteStoryPushMessage(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteStoryPushMessage$38(j);
            }
        });
    }

    public void lambda$deleteStoryPushMessage$38(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void deleteAllStoryPushMessages() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteAllStoryPushMessages$39();
            }
        });
    }

    public void lambda$deleteAllStoryPushMessages$39() {
        try {
            this.database.executeFast("DELETE FROM story_pushes").stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void putPushMessage(final MessageObject messageObject) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putPushMessage$40(messageObject);
            }
        });
    }

    public void lambda$putPushMessage$40(MessageObject messageObject) {
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(nativeByteBuffer);
            int i = messageObject.localType == 2 ? 1 : 0;
            if (messageObject.localChannel) {
                i |= 2;
            }
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, messageObject.getDialogId());
            executeFast.bindInteger(2, messageObject.getId());
            executeFast.bindLong(3, messageObject.messageOwner.random_id);
            executeFast.bindInteger(4, messageObject.messageOwner.date);
            executeFast.bindByteBuffer(5, nativeByteBuffer);
            CharSequence charSequence = messageObject.messageText;
            if (charSequence == null) {
                executeFast.bindNull(6);
            } else {
                executeFast.bindString(6, charSequence.toString());
            }
            String str = messageObject.localName;
            if (str == null) {
                executeFast.bindNull(7);
            } else {
                executeFast.bindString(7, str);
            }
            String str2 = messageObject.localUserName;
            if (str2 == null) {
                executeFast.bindNull(8);
            } else {
                executeFast.bindString(8, str2);
            }
            executeFast.bindInteger(9, i);
            executeFast.bindInteger(10, MessageObject.getTopicId(messageObject.messageOwner, false));
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void clearLocalDatabase() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearLocalDatabase$41();
            }
        });
    }

    public void lambda$clearLocalDatabase$41() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$clearLocalDatabase$41():void");
    }

    public void saveTopics(final long j, final List<TLRPC$TL_forumTopic> list, final boolean z, boolean z2) {
        if (z2) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$saveTopics$42(j, list, z);
                }
            });
        } else {
            saveTopicsInternal(j, list, z, false);
        }
    }

    public void lambda$saveTopics$42(long j, List list, boolean z) {
        saveTopicsInternal(j, list, z, true);
    }

    private void saveTopicsInternal(long j, List<TLRPC$TL_forumTopic> list, boolean z, boolean z2) {
        int i;
        int i2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                int i3 = 0;
                while (true) {
                    i = 2;
                    if (i3 >= list.size()) {
                        break;
                    }
                    SQLiteDatabase sQLiteDatabase = this.database;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did, pinned FROM topics WHERE did = " + j + " AND topic_id = " + list.get(i3).id, new Object[0]);
                    boolean next = queryFinalized.next();
                    if (next) {
                        hashMap.put(Integer.valueOf(i3), Integer.valueOf(queryFinalized.intValue(2)));
                    }
                    queryFinalized.dispose();
                    if (next) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                    i3++;
                }
                if (z) {
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    sQLiteDatabase2.executeFast("DELETE FROM topics WHERE did = " + j).stepThis().dispose();
                }
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO topics VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                if (z2) {
                    try {
                        this.database.beginTransaction();
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(e);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        this.database.commitTransaction();
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        this.database.commitTransaction();
                        throw th;
                    }
                }
                int i4 = 0;
                while (i4 < list.size()) {
                    TLRPC$TL_forumTopic tLRPC$TL_forumTopic = list.get(i4);
                    boolean contains = hashSet.contains(Integer.valueOf(i4));
                    executeFast.requery();
                    executeFast.bindLong(1, j);
                    executeFast.bindInteger(i, tLRPC$TL_forumTopic.id);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_forumTopic.getObjectSize());
                    tLRPC$TL_forumTopic.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                    executeFast.bindInteger(4, tLRPC$TL_forumTopic.top_message);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLRPC$TL_forumTopic.topicStartMessage.getObjectSize());
                    tLRPC$TL_forumTopic.topicStartMessage.serializeToStream(nativeByteBuffer2);
                    executeFast.bindByteBuffer(5, nativeByteBuffer2);
                    executeFast.bindInteger(6, tLRPC$TL_forumTopic.unread_count);
                    executeFast.bindInteger(7, tLRPC$TL_forumTopic.read_inbox_max_id);
                    executeFast.bindInteger(8, tLRPC$TL_forumTopic.unread_mentions_count);
                    executeFast.bindInteger(9, tLRPC$TL_forumTopic.unread_reactions_count);
                    executeFast.bindInteger(10, tLRPC$TL_forumTopic.read_outbox_max_id);
                    if (tLRPC$TL_forumTopic.isShort && hashMap.containsKey(Integer.valueOf(i4))) {
                        executeFast.bindInteger(11, ((Integer) hashMap.get(Integer.valueOf(i4))).intValue());
                    } else {
                        executeFast.bindInteger(11, tLRPC$TL_forumTopic.pinned ? tLRPC$TL_forumTopic.pinnedOrder + 1 : 0);
                    }
                    executeFast.bindInteger(12, tLRPC$TL_forumTopic.totalMessagesCount);
                    executeFast.bindInteger(13, tLRPC$TL_forumTopic.hidden ? 1 : 0);
                    executeFast.step();
                    nativeByteBuffer2.reuse();
                    nativeByteBuffer.reuse();
                    if (contains) {
                        int i5 = tLRPC$TL_forumTopic.top_message;
                        i2 = i4;
                        closeHolesInTable("messages_holes_topics", j, i5, i5, tLRPC$TL_forumTopic.id);
                        int i6 = tLRPC$TL_forumTopic.top_message;
                        closeHolesInMedia(j, i6, i6, -1, 0);
                    } else {
                        i2 = i4;
                        SQLiteDatabase sQLiteDatabase3 = this.database;
                        Locale locale = Locale.ENGLISH;
                        sQLiteDatabase3.executeFast(String.format(locale, "DELETE FROM messages_holes_topics WHERE uid = %d AND topic_id = %d", Long.valueOf(j), Integer.valueOf(tLRPC$TL_forumTopic.id))).stepThis().dispose();
                        this.database.executeFast(String.format(locale, "DELETE FROM media_holes_topics WHERE uid = %d AND topic_id = %d", Long.valueOf(j), Integer.valueOf(tLRPC$TL_forumTopic.id))).stepThis().dispose();
                        this.database.executeFast(String.format(locale, "DELETE FROM messages_topics WHERE uid = %d AND topic_id = %d", Long.valueOf(j), Integer.valueOf(tLRPC$TL_forumTopic.id))).stepThis().dispose();
                        this.database.executeFast(String.format(locale, "DELETE FROM media_topics WHERE uid = %d AND topic_id = %d", Long.valueOf(j), Integer.valueOf(tLRPC$TL_forumTopic.id))).stepThis().dispose();
                        SQLitePreparedStatement executeFast2 = this.database.executeFast("REPLACE INTO messages_holes_topics VALUES(?, ?, ?, ?)");
                        createFirstHoles(j, executeFast2, this.database.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)"), tLRPC$TL_forumTopic.top_message, tLRPC$TL_forumTopic.id);
                        executeFast2.dispose();
                        executeFast2.dispose();
                    }
                    i4 = i2 + 1;
                    i = 2;
                }
                resetAllUnreadCounters(false);
                if (executeFast != null) {
                    executeFast.dispose();
                }
            } catch (Exception e2) {
                e = e2;
            }
            this.database.commitTransaction();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void updateTopicData(final long j, final TLRPC$TL_forumTopic tLRPC$TL_forumTopic, final int i) {
        if (tLRPC$TL_forumTopic == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateTopicData$43(i, tLRPC$TL_forumTopic, j);
            }
        });
    }

    public void lambda$updateTopicData$43(int r12, org.telegram.tgnet.TLRPC$TL_forumTopic r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateTopicData$43(int, org.telegram.tgnet.TLRPC$TL_forumTopic, long):void");
    }

    public void loadTopics(final long j, final Consumer<ArrayList<TLRPC$TL_forumTopic>> consumer) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadTopics$45(j, consumer);
            }
        });
    }

    public void lambda$loadTopics$45(long r21, j$.util.function.Consumer r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadTopics$45(long, j$.util.function.Consumer):void");
    }

    public void lambda$loadTopics$44(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            getMessagesController().putUsers(arrayList, true);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        getMessagesController().putChats(arrayList2, true);
    }

    public void loadGroupedMessagesForTopicUpdates(ArrayList<TopicsController.TopicUpdate> arrayList) {
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
                long keyAt = longSparseArray.keyAt(i2);
                ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i2);
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_v2 WHERE uid = %s AND group_id = %s ORDER BY date DESC", Long.valueOf(((TopicsController.TopicUpdate) arrayList3.get(0)).dialogId), Long.valueOf(keyAt)), new Object[0]);
                ArrayList<MessageObject> arrayList4 = null;
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList4.add(new MessageObject(this.currentAccount, TLdeserialize, false, false));
                }
                queryFinalized.dispose();
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    ((TopicsController.TopicUpdate) arrayList3.get(i3)).groupedMessages = arrayList4;
                }
            }
        } catch (Throwable th) {
            checkSQLException(th);
        }
    }

    public void loadGroupedMessagesForTopics(long j, ArrayList<TLRPC$TL_forumTopic> arrayList) {
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
                long keyAt = longSparseArray.keyAt(i2);
                ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i2);
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_v2 WHERE uid = %s AND group_id = %s ORDER BY date DESC", Long.valueOf(j), Long.valueOf(keyAt)), new Object[0]);
                ArrayList<MessageObject> arrayList4 = null;
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList4.add(new MessageObject(this.currentAccount, TLdeserialize, false, false));
                }
                queryFinalized.dispose();
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    ((TLRPC$TL_forumTopic) arrayList3.get(i3)).groupedMessages = arrayList4;
                }
            }
        } catch (Throwable th) {
            checkSQLException(th);
        }
    }

    public void removeTopic(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$removeTopic$46(j, i);
            }
        });
    }

    public void lambda$removeTopic$46(long j, int i) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM topics WHERE did = %d AND topic_id = %d", Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
            this.database.executeFast(String.format(locale, "DELETE FROM messages_topics WHERE uid = %d AND topic_id = %d", Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    public void removeTopics(final long j, final ArrayList<Integer> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$removeTopics$47(arrayList, j);
            }
        });
    }

    public void lambda$removeTopics$47(ArrayList arrayList, long j) {
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM topics WHERE did = %d AND topic_id IN (%s)", Long.valueOf(j), join)).stepThis().dispose();
            this.database.executeFast(String.format(locale, "DELETE FROM messages_topics WHERE uid = %d AND topic_id IN (%s)", Long.valueOf(j), join)).stepThis().dispose();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    public void updateTopicsWithReadMessages(final HashMap<TopicKey, Integer> hashMap) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateTopicsWithReadMessages$48(hashMap);
            }
        });
    }

    public void lambda$updateTopicsWithReadMessages$48(HashMap hashMap) {
        for (TopicKey topicKey : hashMap.keySet()) {
            try {
                this.database.executeFast(String.format(Locale.US, "UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = %d AND topic_id = %d), %d) WHERE did = %d AND topic_id = %d", Long.valueOf(topicKey.dialogId), Integer.valueOf(topicKey.topicId), Integer.valueOf(((Integer) hashMap.get(topicKey)).intValue()), Long.valueOf(topicKey.dialogId), Integer.valueOf(topicKey.topicId))).stepThis().dispose();
            } catch (SQLiteException e) {
                checkSQLException(e);
            }
        }
    }

    public void setDialogTtl(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setDialogTtl$49(i, j);
            }
        });
    }

    public void lambda$setDialogTtl$49(int i, long j) {
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
                MessagesStorage.this.lambda$reset$50();
            }
        });
    }

    public void lambda$reset$50() {
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
            public final void run() {
                MessagesStorage.this.lambda$fullReset$52();
            }
        });
    }

    public void lambda$fullReset$52() {
        cleanupInternal(true);
        clearLoadingDialogsOffsets();
        openDatabase(1);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$fullReset$51();
            }
        });
    }

    public void lambda$fullReset$51() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseReset, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didClearDatabase, new Object[0]);
    }

    public static class ReadDialog {
        public int date;
        public int lastMid;
        public int unreadCount;

        private ReadDialog() {
        }
    }

    public void readAllDialogs(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$readAllDialogs$54(i);
            }
        });
    }

    public void lambda$readAllDialogs$54(int i) {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                ArrayList<Long> arrayList = new ArrayList<>();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                final LongSparseArray longSparseArray = new LongSparseArray();
                if (i >= 0) {
                    queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i)), new Object[0]);
                } else {
                    queryFinalized = this.database.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                }
                while (queryFinalized.next()) {
                    try {
                        long longValue = queryFinalized.longValue(0);
                        if (!DialogObject.isFolderDialogId(longValue)) {
                            ReadDialog readDialog = new ReadDialog();
                            readDialog.lastMid = queryFinalized.intValue(1);
                            readDialog.unreadCount = queryFinalized.intValue(2);
                            readDialog.date = queryFinalized.intValue(3);
                            longSparseArray.put(longValue, readDialog);
                            if (!DialogObject.isEncryptedDialog(longValue)) {
                                if (DialogObject.isChatDialog(longValue)) {
                                    long j = -longValue;
                                    if (!arrayList2.contains(Long.valueOf(j))) {
                                        arrayList2.add(Long.valueOf(j));
                                    }
                                } else if (!arrayList.contains(Long.valueOf(longValue))) {
                                    arrayList.add(Long.valueOf(longValue));
                                }
                            } else {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                }
                            }
                        }
                    } catch (Exception e) {
                        sQLiteCursor = queryFinalized;
                        e = e;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        sQLiteCursor = queryFinalized;
                        th = th;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                }
                queryFinalized.dispose();
                final ArrayList<TLRPC$User> arrayList4 = new ArrayList<>();
                final ArrayList<TLRPC$Chat> arrayList5 = new ArrayList<>();
                final ArrayList<TLRPC$EncryptedChat> arrayList6 = new ArrayList<>();
                if (!arrayList3.isEmpty()) {
                    getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    getUsersInternal(TextUtils.join(",", arrayList), arrayList4);
                }
                if (!arrayList2.isEmpty()) {
                    getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$readAllDialogs$53(arrayList4, arrayList5, arrayList6, longSparseArray);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void lambda$readAllDialogs$53(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, LongSparseArray longSparseArray) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        getMessagesController().putEncryptedChats(arrayList3, true);
        for (int i = 0; i < longSparseArray.size(); i++) {
            long keyAt = longSparseArray.keyAt(i);
            ReadDialog readDialog = (ReadDialog) longSparseArray.valueAt(i);
            MessagesController messagesController = getMessagesController();
            int i2 = readDialog.lastMid;
            messagesController.markDialogAsRead(keyAt, i2, i2, readDialog.date, false, 0, readDialog.unreadCount, true, 0);
        }
    }

    private org.telegram.tgnet.TLRPC$messages_Dialogs loadDialogsByIds(java.lang.String r22, java.util.ArrayList<java.lang.Long> r23, java.util.ArrayList<java.lang.Long> r24, java.util.ArrayList<java.lang.Integer> r25) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.loadDialogsByIds(java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):org.telegram.tgnet.TLRPC$messages_Dialogs");
    }

    private void loadDialogFilters() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadDialogFilters$56();
            }
        });
    }

    public void lambda$loadDialogFilters$56() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadDialogFilters$56():void");
    }

    public static int lambda$loadDialogFilters$55(MessagesController.DialogFilter dialogFilter, MessagesController.DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    private void calcUnreadCounters(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.calcUnreadCounters(boolean):void");
    }

    private void saveDialogFilterInternal(MessagesController.DialogFilter dialogFilter, boolean z, boolean z2) {
        int i;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
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
                executeFast = this.database.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?)");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            executeFast.bindInteger(1, dialogFilter.id);
            executeFast.bindInteger(2, dialogFilter.order);
            executeFast.bindInteger(3, dialogFilter.unreadCount);
            executeFast.bindInteger(4, dialogFilter.flags);
            executeFast.bindString(5, dialogFilter.id == 0 ? "ALL_CHATS" : dialogFilter.name);
            executeFast.step();
            executeFast.dispose();
            if (z2) {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteDatabase.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + dialogFilter.id).stepThis().dispose();
                SQLiteDatabase sQLiteDatabase2 = this.database;
                sQLiteDatabase2.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + dialogFilter.id).stepThis().dispose();
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast2 = this.database.executeFast("REPLACE INTO dialog_filter_pin_v2 VALUES(?, ?, ?)");
                int size = dialogFilter.alwaysShow.size();
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = dialogFilter.alwaysShow.get(i2).longValue();
                    executeFast2.requery();
                    executeFast2.bindInteger(1, dialogFilter.id);
                    executeFast2.bindLong(2, longValue);
                    executeFast2.bindInteger(3, dialogFilter.pinnedDialogs.get(longValue, Integer.MIN_VALUE));
                    executeFast2.step();
                }
                int size2 = dialogFilter.pinnedDialogs.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    long keyAt = dialogFilter.pinnedDialogs.keyAt(i3);
                    if (DialogObject.isEncryptedDialog(keyAt)) {
                        executeFast2.requery();
                        executeFast2.bindInteger(1, dialogFilter.id);
                        executeFast2.bindLong(2, keyAt);
                        executeFast2.bindInteger(3, dialogFilter.pinnedDialogs.valueAt(i3));
                        executeFast2.step();
                    }
                }
                executeFast2.dispose();
                SQLitePreparedStatement executeFast3 = this.database.executeFast("REPLACE INTO dialog_filter_ep VALUES(?, ?)");
                int size3 = dialogFilter.neverShow.size();
                for (i = 0; i < size3; i++) {
                    executeFast3.requery();
                    executeFast3.bindInteger(1, dialogFilter.id);
                    executeFast3.bindLong(2, dialogFilter.neverShow.get(i).longValue());
                    executeFast3.step();
                }
                executeFast3.dispose();
                this.database.commitTransaction();
            }
            SQLiteDatabase sQLiteDatabase3 = this.database;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement3 = sQLitePreparedStatement2;
            checkSQLException(e);
            SQLiteDatabase sQLiteDatabase4 = this.database;
            if (sQLiteDatabase4 != null) {
                sQLiteDatabase4.commitTransaction();
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement3 = sQLitePreparedStatement;
            SQLiteDatabase sQLiteDatabase5 = this.database;
            if (sQLiteDatabase5 != null) {
                sQLiteDatabase5.commitTransaction();
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
            throw th;
        }
    }

    private ArrayList<Long> toPeerIds(ArrayList<TLRPC$InputPeer> arrayList) {
        ArrayList<Long> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            return arrayList2;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$InputPeer tLRPC$InputPeer = arrayList.get(i);
            if (tLRPC$InputPeer != null) {
                long j = tLRPC$InputPeer.user_id;
                if (j == 0) {
                    long j2 = tLRPC$InputPeer.chat_id;
                    if (j2 == 0) {
                        j2 = tLRPC$InputPeer.channel_id;
                    }
                    j = -j2;
                }
                arrayList2.add(Long.valueOf(j));
            }
        }
        return arrayList2;
    }

    public void checkLoadedRemoteFilters(final TLRPC$Vector tLRPC$Vector, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$checkLoadedRemoteFilters$58(tLRPC$Vector, runnable);
            }
        });
    }

    public void lambda$checkLoadedRemoteFilters$58(org.telegram.tgnet.TLRPC$Vector r36, java.lang.Runnable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkLoadedRemoteFilters$58(org.telegram.tgnet.TLRPC$Vector, java.lang.Runnable):void");
    }

    public static int lambda$checkLoadedRemoteFilters$57(LongSparseIntArray longSparseIntArray, Long l, Long l2) {
        int i = longSparseIntArray.get(l.longValue());
        int i2 = longSparseIntArray.get(l2.longValue());
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void lambda$processLoadedFilterPeers$60(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, ArrayList<TLRPC$User> arrayList, ArrayList<TLRPC$Chat> arrayList2, ArrayList<MessagesController.DialogFilter> arrayList3, SparseArray<MessagesController.DialogFilter> sparseArray, ArrayList<Integer> arrayList4, HashMap<Integer, HashSet<Long>> hashMap, HashSet<Integer> hashSet, Runnable runnable) {
        putUsersAndChats(arrayList, arrayList2, true, false);
        int size = sparseArray.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            lambda$deleteDialogFilter$61(sparseArray.valueAt(i));
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
        for (Map.Entry<Integer, HashSet<Long>> entry : hashMap.entrySet()) {
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
            int indexOf = arrayList4.indexOf(Integer.valueOf(dialogFilter3.id));
            if (dialogFilter3.order != indexOf) {
                dialogFilter3.order = indexOf;
                z2 = true;
                z = true;
            }
        }
        if (z2) {
            Collections.sort(this.dialogFilters, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$processLoadedFilterPeersInternal$59;
                    lambda$processLoadedFilterPeersInternal$59 = MessagesStorage.lambda$processLoadedFilterPeersInternal$59((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
                    return lambda$processLoadedFilterPeersInternal$59;
                }
            });
            saveDialogFiltersOrderInternal();
        }
        int i4 = z ? 1 : 2;
        calcUnreadCounters(true);
        getMessagesController().processLoadedDialogFilters(new ArrayList<>(this.dialogFilters), tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, null, i4, runnable);
    }

    public static int lambda$processLoadedFilterPeersInternal$59(MessagesController.DialogFilter dialogFilter, MessagesController.DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void processLoadedFilterPeers(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList, final ArrayList<TLRPC$Chat> arrayList2, final ArrayList<MessagesController.DialogFilter> arrayList3, final SparseArray<MessagesController.DialogFilter> sparseArray, final ArrayList<Integer> arrayList4, final HashMap<Integer, HashSet<Long>> hashMap, final HashSet<Integer> hashSet, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$processLoadedFilterPeers$60(tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap, hashSet, runnable);
            }
        });
    }

    public void lambda$deleteDialogFilter$61(MessagesController.DialogFilter dialogFilter) {
        try {
            this.dialogFilters.remove(dialogFilter);
            this.dialogFiltersMap.remove(dialogFilter.id);
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM dialog_filter WHERE id = " + dialogFilter.id).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.database;
            sQLiteDatabase2.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + dialogFilter.id).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase3 = this.database;
            sQLiteDatabase3.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + dialogFilter.id).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void deleteDialogFilter(final MessagesController.DialogFilter dialogFilter) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteDialogFilter$61(dialogFilter);
            }
        });
    }

    public void saveDialogFilter(final MessagesController.DialogFilter dialogFilter, final boolean z, final boolean z2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveDialogFilter$63(dialogFilter, z, z2);
            }
        });
    }

    public void lambda$saveDialogFilter$63(MessagesController.DialogFilter dialogFilter, boolean z, boolean z2) {
        saveDialogFilterInternal(dialogFilter, z, z2);
        calcUnreadCounters(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveDialogFilter$62();
            }
        });
    }

    public void lambda$saveDialogFilter$62() {
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
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE dialog_filter SET ord = ?, flags = ? WHERE id = ?");
                int size = this.dialogFilters.size();
                for (int i = 0; i < size; i++) {
                    MessagesController.DialogFilter dialogFilter = this.dialogFilters.get(i);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, dialogFilter.order);
                    sQLitePreparedStatement.bindInteger(2, dialogFilter.flags);
                    sQLitePreparedStatement.bindInteger(3, dialogFilter.id);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void saveDialogFiltersOrder() {
        final ArrayList arrayList = new ArrayList(getMessagesController().dialogFilters);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveDialogFiltersOrder$64(arrayList);
            }
        });
    }

    public void lambda$saveDialogFiltersOrder$64(ArrayList arrayList) {
        this.dialogFilters.clear();
        this.dialogFiltersMap.clear();
        this.dialogFilters.addAll(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            ((MessagesController.DialogFilter) arrayList.get(i)).order = i;
            this.dialogFiltersMap.put(((MessagesController.DialogFilter) arrayList.get(i)).id, (MessagesController.DialogFilter) arrayList.get(i));
        }
        saveDialogFiltersOrderInternal();
    }

    protected static void addReplyMessages(TLRPC$Message tLRPC$Message, LongSparseArray<SparseArray<ArrayList<TLRPC$Message>>> longSparseArray, LongSparseArray<ArrayList<Integer>> longSparseArray2) {
        int i = tLRPC$Message.reply_to.reply_to_msg_id;
        long replyToDialogId = MessageObject.getReplyToDialogId(tLRPC$Message);
        SparseArray<ArrayList<TLRPC$Message>> sparseArray = longSparseArray.get(replyToDialogId);
        ArrayList<Integer> arrayList = longSparseArray2.get(replyToDialogId);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            longSparseArray.put(replyToDialogId, sparseArray);
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            longSparseArray2.put(replyToDialogId, arrayList);
        }
        ArrayList<TLRPC$Message> arrayList2 = sparseArray.get(tLRPC$Message.reply_to.reply_to_msg_id);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
            sparseArray.put(tLRPC$Message.reply_to.reply_to_msg_id, arrayList2);
            if (!arrayList.contains(Integer.valueOf(tLRPC$Message.reply_to.reply_to_msg_id))) {
                arrayList.add(Integer.valueOf(tLRPC$Message.reply_to.reply_to_msg_id));
            }
        }
        arrayList2.add(tLRPC$Message);
    }

    protected void loadReplyMessages(androidx.collection.LongSparseArray<android.util.SparseArray<java.util.ArrayList<org.telegram.tgnet.TLRPC$Message>>> r20, androidx.collection.LongSparseArray<java.util.ArrayList<java.lang.Integer>> r21, java.util.ArrayList<java.lang.Long> r22, java.util.ArrayList<java.lang.Long> r23, boolean r24) throws org.telegram.SQLite.SQLiteException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.loadReplyMessages(androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    public void loadUnreadMessages() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadUnreadMessages$66();
            }
        });
    }

    public void lambda$loadUnreadMessages$66() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadUnreadMessages$66():void");
    }

    public void lambda$loadUnreadMessages$65(LongSparseArray longSparseArray, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, HashMap hashMap) {
        getNotificationsController().processLoadedUnreadMessages(longSparseArray, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, hashMap.values());
    }

    public void putWallpapers(final ArrayList<TLRPC$WallPaper> arrayList, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putWallpapers$67(i, arrayList);
            }
        });
    }

    public void lambda$putWallpapers$67(int r11, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putWallpapers$67(int, java.util.ArrayList):void");
    }

    public void deleteWallpaper(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteWallpaper$68(j);
            }
        });
    }

    public void lambda$deleteWallpaper$68(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void getWallpapers() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getWallpapers$70();
            }
        });
    }

    public void lambda$getWallpapers$70() {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.database.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
                final ArrayList arrayList = new ArrayList();
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC$WallPaper TLdeserialize = TLRPC$WallPaper.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            arrayList.add(TLdeserialize);
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.lambda$getWallpapers$69(arrayList);
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

    public static void lambda$getWallpapers$69(ArrayList arrayList) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.wallpapersDidLoad, arrayList);
    }

    public void addRecentLocalFile(final String str, final String str2, final TLRPC$Document tLRPC$Document) {
        if (str == null || str.length() == 0) {
            return;
        }
        if ((str2 == null || str2.length() == 0) && tLRPC$Document == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$addRecentLocalFile$71(tLRPC$Document, str, str2);
            }
        });
    }

    public void lambda$addRecentLocalFile$71(TLRPC$Document tLRPC$Document, String str, String str2) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (tLRPC$Document != null) {
                    sQLitePreparedStatement = this.database.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Document.getObjectSize());
                    tLRPC$Document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = this.database.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void deleteUserChatHistory(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteUserChatHistory$74(j, j2);
            }
        });
    }

    public void lambda$deleteUserChatHistory$74(final long r18, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteUserChatHistory$74(long, long):void");
    }

    public void lambda$deleteUserChatHistory$72(ArrayList arrayList, long j, ArrayList arrayList2) {
        getFileLoader().cancelLoadFiles(arrayList);
        getMessagesController().markDialogMessageAsDeleted(j, arrayList2);
    }

    public void lambda$deleteUserChatHistory$73(ArrayList arrayList, long j) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.messagesDeleted;
        Object[] objArr = new Object[3];
        objArr[0] = arrayList;
        objArr[1] = Long.valueOf(DialogObject.isChatDialog(j) ? -j : 0L);
        objArr[2] = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, objArr);
    }

    private boolean addFilesToDelete(TLRPC$Message tLRPC$Message, ArrayList<File> arrayList, ArrayList<Pair<Long, Integer>> arrayList2, ArrayList<String> arrayList3, boolean z) {
        long j;
        int i;
        int i2 = 0;
        if (tLRPC$Message == null) {
            return false;
        }
        TLRPC$Document document = MessageObject.getDocument(tLRPC$Message);
        TLRPC$Photo photo = MessageObject.getPhoto(tLRPC$Message);
        if (MessageObject.isVoiceMessage(tLRPC$Message)) {
            if (document == null || getMediaDataController().ringtoneDataStore.contains(document.id)) {
                return false;
            }
            j = document.id;
            i = 2;
        } else {
            if (MessageObject.isStickerMessage(tLRPC$Message) || MessageObject.isAnimatedStickerMessage(tLRPC$Message)) {
                if (document == null) {
                    return false;
                }
                j = document.id;
            } else if (MessageObject.isVideoMessage(tLRPC$Message) || MessageObject.isRoundVideoMessage(tLRPC$Message) || MessageObject.isGifMessage(tLRPC$Message)) {
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
                TLRPC$PhotoSize tLRPC$PhotoSize = photo.sizes.get(i2);
                String attachFileName = FileLoader.getAttachFileName(tLRPC$PhotoSize);
                if (!TextUtils.isEmpty(attachFileName)) {
                    arrayList3.add(attachFileName);
                }
                File pathToAttach = getFileLoader().getPathToAttach(tLRPC$PhotoSize, z);
                if (pathToAttach.toString().length() > 0) {
                    arrayList.add(pathToAttach);
                }
                i2++;
            }
            return true;
        } else if (document != null) {
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
        } else {
            return false;
        }
    }

    public void deleteDialog(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteDialog$77(i, j);
            }
        });
    }

    public void lambda$deleteDialog$77(int r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteDialog$77(int, long):void");
    }

    public void lambda$deleteDialog$75(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$deleteDialog$76() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needReloadRecentDialogsSearch, new Object[0]);
    }

    public void onDeleteQueryComplete(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$onDeleteQueryComplete$78(j);
            }
        });
    }

    public void lambda$onDeleteQueryComplete$78(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void clearUserPhotos(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearUserPhotos$79(j);
            }
        });
    }

    public void lambda$clearUserPhotos$79(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM dialog_photos WHERE uid = " + j).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.database;
            sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void clearUserPhoto(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearUserPhoto$80(j, j2);
            }
        });
    }

    public void lambda$clearUserPhoto$80(long j, long j2) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM dialog_photos WHERE uid = " + j + " AND id = " + j2).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.database;
            sQLiteDatabase2.executeFast("UPDATE dialog_photos_count SET count = count - 1 WHERE uid = " + j + " AND count > 0").stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void resetDialogs(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final int i, final int i2, final int i3, final int i4, final int i5, final LongSparseArray<TLRPC$Dialog> longSparseArray, final LongSparseArray<ArrayList<MessageObject>> longSparseArray2, final TLRPC$Message tLRPC$Message, final int i6) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$resetDialogs$82(tLRPC$messages_Dialogs, i6, i2, i3, i4, i5, tLRPC$Message, i, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$resetDialogs$82(org.telegram.tgnet.TLRPC$messages_Dialogs r33, int r34, int r35, int r36, int r37, int r38, org.telegram.tgnet.TLRPC$Message r39, int r40, androidx.collection.LongSparseArray r41, androidx.collection.LongSparseArray r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$resetDialogs$82(org.telegram.tgnet.TLRPC$messages_Dialogs, int, int, int, int, int, org.telegram.tgnet.TLRPC$Message, int, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public static int lambda$resetDialogs$81(LongSparseIntArray longSparseIntArray, Long l, Long l2) {
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
            public final void run() {
                MessagesStorage.this.lambda$emptyMessagesMedia$85(arrayList, j);
            }
        });
    }

    public void lambda$emptyMessagesMedia$85(java.util.ArrayList r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$emptyMessagesMedia$85(java.util.ArrayList, long):void");
    }

    public void lambda$emptyMessagesMedia$83(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, arrayList.get(i));
        }
    }

    public void lambda$emptyMessagesMedia$84(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void updateMessagePollResults(final long j, final TLRPC$Poll tLRPC$Poll, final TLRPC$PollResults tLRPC$PollResults) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessagePollResults$86(j, tLRPC$Poll, tLRPC$PollResults);
            }
        });
    }

    public void lambda$updateMessagePollResults$86(long j, TLRPC$Poll tLRPC$Poll, TLRPC$PollResults tLRPC$PollResults) {
        LongSparseArray longSparseArray;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i;
        SQLiteCursor queryFinalized;
        ArrayList arrayList;
        int i2;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                int i3 = 1;
                int i4 = 0;
                SQLiteCursor queryFinalized2 = this.database.queryFinalized(String.format(Locale.US, "SELECT uid, mid FROM polls_v2 WHERE id = %d", Long.valueOf(j)), new Object[0]);
                LongSparseArray longSparseArray2 = null;
                while (queryFinalized2.next()) {
                    try {
                        long longValue = queryFinalized2.longValue(0);
                        if (longSparseArray2 == null) {
                            longSparseArray2 = new LongSparseArray();
                        }
                        ArrayList arrayList2 = (ArrayList) longSparseArray2.get(longValue);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            longSparseArray2.put(longValue, arrayList2);
                        }
                        arrayList2.add(Integer.valueOf(queryFinalized2.intValue(1)));
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = queryFinalized2;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized2;
                    }
                }
                queryFinalized2.dispose();
                if (longSparseArray2 != null) {
                    this.database.beginTransaction();
                    SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast2 = this.database.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                    int size = longSparseArray2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        long keyAt = longSparseArray2.keyAt(i5);
                        ArrayList arrayList3 = (ArrayList) longSparseArray2.valueAt(i5);
                        int size2 = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Integer num = (Integer) arrayList3.get(i6);
                            SQLiteCursor sQLiteCursor2 = sQLiteCursor;
                            boolean z = false;
                            while (i4 < 2) {
                                boolean z2 = i4 == i3;
                                if (z2) {
                                    try {
                                        longSparseArray = longSparseArray2;
                                        sQLitePreparedStatement = executeFast2;
                                        i = size;
                                        queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_topics WHERE mid = %d AND uid = %d", num, Long.valueOf(keyAt)), new Object[0]);
                                    } catch (Exception e2) {
                                        e = e2;
                                        sQLiteCursor = sQLiteCursor2;
                                        checkSQLException(e);
                                        if (sQLiteCursor == null) {
                                            return;
                                        }
                                        sQLiteCursor.dispose();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteCursor = sQLiteCursor2;
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                } else {
                                    longSparseArray = longSparseArray2;
                                    sQLitePreparedStatement = executeFast2;
                                    i = size;
                                    queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_v2 WHERE mid = %d AND uid = %d", num, Long.valueOf(keyAt)), new Object[0]);
                                }
                                SQLitePreparedStatement sQLitePreparedStatement2 = z2 ? sQLitePreparedStatement : executeFast;
                                if (queryFinalized.next()) {
                                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                    if (byteBufferValue != null) {
                                        TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        arrayList = arrayList3;
                                        i2 = size2;
                                        TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                                        byteBufferValue.reuse();
                                        TLRPC$MessageMedia tLRPC$MessageMedia = TLdeserialize.media;
                                        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPoll) {
                                            TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll = (TLRPC$TL_messageMediaPoll) tLRPC$MessageMedia;
                                            if (tLRPC$Poll != null) {
                                                tLRPC$TL_messageMediaPoll.poll = tLRPC$Poll;
                                            }
                                            if (tLRPC$PollResults != null) {
                                                MessageObject.updatePollResults(tLRPC$TL_messageMediaPoll, tLRPC$PollResults);
                                            }
                                            MessageObject.normalizeFlags(TLdeserialize);
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                            TLdeserialize.serializeToStream(nativeByteBuffer);
                                            sQLitePreparedStatement2.requery();
                                            sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                                            sQLitePreparedStatement2.bindInteger(2, num.intValue());
                                            sQLitePreparedStatement2.bindLong(3, keyAt);
                                            sQLitePreparedStatement2.step();
                                            nativeByteBuffer.reuse();
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        i2 = size2;
                                    }
                                    z = true;
                                } else {
                                    arrayList = arrayList3;
                                    i2 = size2;
                                }
                                queryFinalized.dispose();
                                i4++;
                                sQLiteCursor2 = queryFinalized;
                                arrayList3 = arrayList;
                                longSparseArray2 = longSparseArray;
                                executeFast2 = sQLitePreparedStatement;
                                size = i;
                                size2 = i2;
                                i3 = 1;
                            }
                            LongSparseArray longSparseArray3 = longSparseArray2;
                            SQLitePreparedStatement sQLitePreparedStatement3 = executeFast2;
                            int i7 = size;
                            ArrayList arrayList4 = arrayList3;
                            int i8 = size2;
                            if (!z) {
                                this.database.executeFast(String.format(Locale.US, "DELETE FROM polls_v2 WHERE mid = %d AND uid = %d", num, Long.valueOf(keyAt))).stepThis().dispose();
                            }
                            i6++;
                            sQLiteCursor = sQLiteCursor2;
                            arrayList3 = arrayList4;
                            longSparseArray2 = longSparseArray3;
                            executeFast2 = sQLitePreparedStatement3;
                            size = i7;
                            size2 = i8;
                            i3 = 1;
                            i4 = 0;
                        }
                        i5++;
                        size = size;
                        i3 = 1;
                        i4 = 0;
                    }
                    executeFast.dispose();
                    this.database.commitTransaction();
                }
                if (sQLiteCursor == null) {
                    return;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
        }
        sQLiteCursor.dispose();
    }

    public void updateMessageReactions(final long j, final int i, final TLRPC$TL_messageReactions tLRPC$TL_messageReactions) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageReactions$87(i, j, tLRPC$TL_messageReactions);
            }
        });
    }

    public void lambda$updateMessageReactions$87(int i, long j, TLRPC$TL_messageReactions tLRPC$TL_messageReactions) {
        SQLiteCursor queryFinalized;
        NativeByteBuffer byteBufferValue;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                this.database.beginTransaction();
                for (int i2 = 0; i2 < 2; i2++) {
                    if (i2 == 0) {
                        queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_v2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j)), new Object[0]);
                    } else {
                        queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_topics WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j)), new Object[0]);
                    }
                    try {
                        if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                            TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                                byteBufferValue.reuse();
                                MessageObject.updateReactions(TLdeserialize, tLRPC$TL_messageReactions);
                                if (i2 == 0) {
                                    executeFast = this.database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                } else {
                                    executeFast = this.database.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                }
                                MessageObject.normalizeFlags(TLdeserialize);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                TLdeserialize.serializeToStream(nativeByteBuffer);
                                executeFast.requery();
                                executeFast.bindByteBuffer(1, nativeByteBuffer);
                                executeFast.bindInteger(2, i);
                                executeFast.bindLong(3, j);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                                executeFast.dispose();
                            } else {
                                byteBufferValue.reuse();
                            }
                        }
                        queryFinalized.dispose();
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = queryFinalized;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
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

    public void updateMessageVoiceTranscriptionOpen(final long j, final int i, final TLRPC$Message tLRPC$Message) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageVoiceTranscriptionOpen$88(i, j, tLRPC$Message);
            }
        });
    }

    public void lambda$updateMessageVoiceTranscriptionOpen$88(int i, long j, TLRPC$Message tLRPC$Message) {
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                TLRPC$Message messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(i, j);
                messageWithCustomParamsOnlyInternal.voiceTranscriptionOpen = tLRPC$Message.voiceTranscriptionOpen;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionRated = tLRPC$Message.voiceTranscriptionRated;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionFinal = tLRPC$Message.voiceTranscriptionFinal;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionForce = tLRPC$Message.voiceTranscriptionForce;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionId = tLRPC$Message.voiceTranscriptionId;
                for (int i2 = 0; i2 < 2; i2++) {
                    if (i2 == 0) {
                        executeFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = this.database.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        executeFast.requery();
                        NativeByteBuffer writeLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
                        if (writeLocalParams != null) {
                            executeFast.bindByteBuffer(1, writeLocalParams);
                        } else {
                            executeFast.bindNull(1);
                        }
                        executeFast.bindInteger(2, i);
                        executeFast.bindLong(3, j);
                        executeFast.step();
                        executeFast.dispose();
                        if (writeLocalParams != null) {
                            writeLocalParams.reuse();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
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
                        sQLitePreparedStatement = executeFast;
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
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void updateMessageVoiceTranscription(final long j, final int i, final String str, final long j2, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageVoiceTranscription$89(i, j, z, j2, str);
            }
        });
    }

    public void lambda$updateMessageVoiceTranscription$89(int i, long j, boolean z, long j2, String str) {
        TLRPC$Message messageWithCustomParamsOnlyInternal;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(i, j);
                messageWithCustomParamsOnlyInternal.voiceTranscriptionFinal = z;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionId = j2;
                messageWithCustomParamsOnlyInternal.voiceTranscription = str;
                executeFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            executeFast.requery();
            NativeByteBuffer writeLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
            if (writeLocalParams != null) {
                executeFast.bindByteBuffer(1, writeLocalParams);
            } else {
                executeFast.bindNull(1);
            }
            executeFast.bindInteger(2, i);
            executeFast.bindLong(3, j);
            executeFast.step();
            executeFast.dispose();
            this.database.commitTransaction();
            if (writeLocalParams != null) {
                writeLocalParams.reuse();
            }
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
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
            sQLitePreparedStatement = executeFast;
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

    public void updateMessageVoiceTranscription(final long j, final int i, final String str, final TLRPC$Message tLRPC$Message) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageVoiceTranscription$90(i, j, tLRPC$Message, str);
            }
        });
    }

    public void lambda$updateMessageVoiceTranscription$90(int i, long j, TLRPC$Message tLRPC$Message, String str) {
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                TLRPC$Message messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(i, j);
                messageWithCustomParamsOnlyInternal.voiceTranscriptionOpen = tLRPC$Message.voiceTranscriptionOpen;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionRated = tLRPC$Message.voiceTranscriptionRated;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionFinal = tLRPC$Message.voiceTranscriptionFinal;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionForce = tLRPC$Message.voiceTranscriptionForce;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionId = tLRPC$Message.voiceTranscriptionId;
                messageWithCustomParamsOnlyInternal.voiceTranscription = str;
                for (int i2 = 0; i2 < 2; i2++) {
                    if (i2 == 0) {
                        executeFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = this.database.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        executeFast.requery();
                        NativeByteBuffer writeLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
                        if (writeLocalParams != null) {
                            executeFast.bindByteBuffer(1, writeLocalParams);
                        } else {
                            executeFast.bindNull(1);
                        }
                        executeFast.bindInteger(2, i);
                        executeFast.bindLong(3, j);
                        executeFast.step();
                        executeFast.dispose();
                        this.database.commitTransaction();
                        if (writeLocalParams != null) {
                            writeLocalParams.reuse();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
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
                        sQLitePreparedStatement = executeFast;
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

    public void updateMessageCustomParams(final long j, final TLRPC$Message tLRPC$Message) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageCustomParams$91(tLRPC$Message, j);
            }
        });
    }

    public void lambda$updateMessageCustomParams$91(TLRPC$Message tLRPC$Message, long j) {
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                TLRPC$Message messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(tLRPC$Message.id, j);
                MessageCustomParamsHelper.copyParams(tLRPC$Message, messageWithCustomParamsOnlyInternal);
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        executeFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = this.database.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        executeFast.requery();
                        NativeByteBuffer writeLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
                        if (writeLocalParams != null) {
                            executeFast.bindByteBuffer(1, writeLocalParams);
                        } else {
                            executeFast.bindNull(1);
                        }
                        executeFast.bindInteger(2, tLRPC$Message.id);
                        executeFast.bindLong(3, j);
                        executeFast.step();
                        executeFast.dispose();
                        if (writeLocalParams != null) {
                            writeLocalParams.reuse();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
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
                        sQLitePreparedStatement = executeFast;
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

    public TLRPC$Message getMessageWithCustomParamsOnlyInternal(int i, long j) {
        SQLiteCursor queryFinalized;
        boolean z;
        TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT custom_params FROM messages_v2 WHERE mid = " + i + " AND uid = " + j, new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e) {
            e = e;
        }
        try {
            if (queryFinalized.next()) {
                MessageCustomParamsHelper.readLocalParams(tLRPC$TL_message, queryFinalized.byteBufferValue(0));
                z = true;
            } else {
                z = false;
            }
            queryFinalized.dispose();
            if (!z) {
                SQLiteDatabase sQLiteDatabase2 = this.database;
                sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT custom_params FROM messages_topics WHERE mid = " + i + " AND uid = " + j, new Object[0]);
                if (sQLiteCursor.next()) {
                    MessageCustomParamsHelper.readLocalParams(tLRPC$TL_message, sQLiteCursor.byteBufferValue(0));
                }
                sQLiteCursor.dispose();
            }
        } catch (SQLiteException e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            return tLRPC$TL_message;
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        return tLRPC$TL_message;
    }

    public void getNewTask(final LongSparseArray<ArrayList<Integer>> longSparseArray, final LongSparseArray<ArrayList<Integer>> longSparseArray2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getNewTask$92(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getNewTask$92(androidx.collection.LongSparseArray r14, androidx.collection.LongSparseArray r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getNewTask$92(androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public void markMentionMessageAsRead(final long j, final int i, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$markMentionMessageAsRead$93(i, j, j2);
            }
        });
    }

    public void lambda$markMentionMessageAsRead$93(int i, long j, long j2) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast(String.format(locale, "UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
                SQLiteDatabase sQLiteDatabase2 = this.database;
                SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j2, new Object[0]);
                try {
                    int max = queryFinalized.next() ? Math.max(0, queryFinalized.intValue(0) - 1) : 0;
                    queryFinalized.dispose();
                    this.database.executeFast(String.format(locale, "UPDATE dialogs SET unread_count_i = %d WHERE did = %d", Integer.valueOf(max), Long.valueOf(j2))).stepThis().dispose();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j2, max);
                    if (max == 0) {
                        updateFiltersReadCounter(null, longSparseIntArray, true);
                    }
                    getMessagesController().processDialogsUpdateRead(null, longSparseIntArray);
                    this.database.executeFast(String.format(locale, "UPDATE messages_topics SET read_state = read_state | 2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
                    SQLiteCursor queryFinalized2 = this.database.queryFinalized(String.format(locale, "SELECT data FROM messages_topics WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j)), new Object[0]);
                    int i2 = 0;
                    while (queryFinalized2.next()) {
                        try {
                            NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                i2 = MessageObject.getTopicId(TLdeserialize, isForum(j));
                            }
                        } catch (Exception e) {
                            sQLiteCursor3 = sQLiteCursor2;
                            e = e;
                            checkSQLException(e);
                            if (sQLiteCursor3 != null) {
                                sQLiteCursor3.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            sQLiteCursor3 = sQLiteCursor;
                            th = th;
                            if (sQLiteCursor3 != null) {
                                sQLiteCursor3.dispose();
                            }
                            throw th;
                        }
                    }
                    queryFinalized2.dispose();
                    if (i2 != 0) {
                        SQLiteDatabase sQLiteDatabase3 = this.database;
                        Locale locale2 = Locale.US;
                        SQLiteCursor queryFinalized3 = sQLiteDatabase3.queryFinalized(String.format(locale2, "SELECT unread_mentions FROM topics WHERE did = %d AND topic_id = %d", Long.valueOf(j2), Integer.valueOf(i2)), new Object[0]);
                        int max2 = queryFinalized3.next() ? Math.max(0, queryFinalized3.intValue(0) - 1) : 0;
                        queryFinalized3.dispose();
                        this.database.executeFast(String.format(locale2, "UPDATE topics SET unread_mentions = %d WHERE did = %d AND topic_id = %d", Integer.valueOf(max2), Long.valueOf(j), Integer.valueOf(i2))).stepThis().dispose();
                        getMessagesController().getTopicsController().updateMentionsUnread(j, i2, max2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor3 = queryFinalized;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor3 = queryFinalized;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void markMessageAsMention(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$markMessageAsMention$94(i, j);
            }
        });
    }

    public void lambda$markMessageAsMention$94(int i, long j) {
        try {
            this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void resetMentionsCount(final long j, final int i, final int i2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$resetMentionsCount$95(i, j, i2);
            }
        });
    }

    public void lambda$resetMentionsCount$95(int i, long j, int i2) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                if (i == 0) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j, new Object[0]);
                    try {
                        int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                        queryFinalized.dispose();
                        if (intValue == 0 && i2 == 0) {
                            return;
                        }
                        if (i2 == 0) {
                            this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET read_state = read_state | 2 WHERE uid = %d AND mention = 1 AND read_state IN(0, 1)", Long.valueOf(j))).stepThis().dispose();
                        }
                        this.database.executeFast(String.format(Locale.US, "UPDATE dialogs SET unread_count_i = %d WHERE did = %d", Integer.valueOf(i2), Long.valueOf(j))).stepThis().dispose();
                        LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                        longSparseIntArray.put(j, i2);
                        getMessagesController().processDialogsUpdateRead(null, longSparseIntArray);
                        if (i2 == 0) {
                            updateFiltersReadCounter(null, longSparseIntArray, true);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = queryFinalized;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                }
                this.database.executeFast(String.format(Locale.US, "UPDATE topics SET unread_mentions = %d WHERE did = %d AND topic_id = %d", Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
                TopicsController.TopicUpdate topicUpdate = new TopicsController.TopicUpdate();
                topicUpdate.dialogId = j;
                topicUpdate.topicId = i;
                topicUpdate.onlyCounters = true;
                topicUpdate.unreadMentions = i2;
                topicUpdate.unreadCount = -1;
                getMessagesController().getTopicsController().processUpdate(Collections.singletonList(topicUpdate));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void createTaskForMid(final long j, final int i, final int i2, final int i3, final int i4, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$createTaskForMid$97(i2, i3, i4, i, z, j);
            }
        });
    }

    public void lambda$createTaskForMid$97(int i, int i2, int i3, int i4, final boolean z, final long j) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                int max = Math.max(i, i2) + i3;
                SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
                final ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(i4));
                sparseArray.put(max, arrayList);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$createTaskForMid$96(z, j, arrayList);
                    }
                });
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                    try {
                        int keyAt = sparseArray.keyAt(i5);
                        ArrayList<Integer> arrayList2 = sparseArray.get(keyAt);
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            executeFast.requery();
                            executeFast.bindInteger(1, arrayList2.get(i6).intValue());
                            executeFast.bindLong(2, j);
                            executeFast.bindInteger(3, keyAt);
                            executeFast.bindInteger(4, 1);
                            executeFast.step();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(e);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                executeFast.dispose();
                this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET ttl = 0 WHERE mid = %d AND uid = %d", Integer.valueOf(i4), Long.valueOf(j))).stepThis().dispose();
                getMessagesController().didAddedNewTask(max, j, sparseArray);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void lambda$createTaskForMid$96(boolean z, long j, ArrayList arrayList) {
        if (!z) {
            markMessagesContentAsRead(j, arrayList, 0, 0);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesReadContent, Long.valueOf(j), arrayList);
    }

    private void createTaskForSecretMedia(long r17, android.util.SparseArray<java.util.ArrayList<java.lang.Integer>> r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.createTaskForSecretMedia(long, android.util.SparseArray):void");
    }

    public void createTaskForSecretChat(final int i, final int i2, final int i3, final int i4, final ArrayList<Long> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$createTaskForSecretChat$99(i, arrayList, i4, i2, i3);
            }
        });
    }

    public void lambda$createTaskForSecretChat$99(int r18, java.util.ArrayList r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$createTaskForSecretChat$99(int, java.util.ArrayList, int, int, int):void");
    }

    public void lambda$createTaskForSecretChat$98(long j, ArrayList arrayList) {
        markMessagesContentAsRead(j, arrayList, 0, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesReadContent, Long.valueOf(j), arrayList);
    }

    private void updateFiltersReadCounter(org.telegram.messenger.support.LongSparseIntArray r26, org.telegram.messenger.support.LongSparseIntArray r27, boolean r28) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateFiltersReadCounter(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, boolean):void");
    }

    public void lambda$updateFiltersReadCounter$100() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).unreadCount = arrayList.get(i).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
    }

    private void updateDialogsWithReadMessagesInternal(java.util.ArrayList<java.lang.Integer> r22, org.telegram.messenger.support.LongSparseIntArray r23, org.telegram.messenger.support.LongSparseIntArray r24, androidx.collection.LongSparseArray<java.util.ArrayList<java.lang.Integer>> r25, org.telegram.messenger.support.LongSparseIntArray r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateDialogsWithReadMessagesInternal(java.util.ArrayList, org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, androidx.collection.LongSparseArray, org.telegram.messenger.support.LongSparseIntArray):void");
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

    private static boolean isEmpty(LongSparseArray<?> longSparseArray) {
        return longSparseArray == null || longSparseArray.size() == 0;
    }

    public void updateDialogsWithReadMessages(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final LongSparseArray<ArrayList<Integer>> longSparseArray, final LongSparseIntArray longSparseIntArray3, boolean z) {
        if (isEmpty(longSparseIntArray) && isEmpty(longSparseIntArray2) && isEmpty(longSparseArray) && isEmpty(longSparseIntArray3)) {
            return;
        }
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateDialogsWithReadMessages$101(longSparseIntArray, longSparseIntArray2, longSparseArray, longSparseIntArray3);
                }
            });
        } else {
            updateDialogsWithReadMessagesInternal(null, longSparseIntArray, longSparseIntArray2, longSparseArray, longSparseIntArray3);
        }
    }

    public void lambda$updateDialogsWithReadMessages$101(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, LongSparseArray longSparseArray, LongSparseIntArray longSparseIntArray3) {
        updateDialogsWithReadMessagesInternal(null, longSparseIntArray, longSparseIntArray2, longSparseArray, longSparseIntArray3);
    }

    public void updateChatParticipants(final TLRPC$ChatParticipants tLRPC$ChatParticipants) {
        if (tLRPC$ChatParticipants == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChatParticipants$103(tLRPC$ChatParticipants);
            }
        });
    }

    public void lambda$updateChatParticipants$103(TLRPC$ChatParticipants tLRPC$ChatParticipants) {
        SQLiteCursor queryFinalized;
        final TLRPC$ChatFull tLRPC$ChatFull;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.database.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + tLRPC$ChatParticipants.chat_id, new Object[0]);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            new ArrayList();
            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                tLRPC$ChatFull = null;
            } else {
                tLRPC$ChatFull = TLRPC$ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
                tLRPC$ChatFull.pinned_msg_id = queryFinalized.intValue(1);
                tLRPC$ChatFull.online_count = queryFinalized.intValue(2);
                tLRPC$ChatFull.inviterId = queryFinalized.longValue(3);
            }
            queryFinalized.dispose();
            if (tLRPC$ChatFull instanceof TLRPC$TL_chatFull) {
                tLRPC$ChatFull.participants = tLRPC$ChatParticipants;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$updateChatParticipants$102(tLRPC$ChatFull);
                    }
                });
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$ChatFull.getObjectSize());
                tLRPC$ChatFull.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, tLRPC$ChatFull.id);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, tLRPC$ChatFull.pinned_msg_id);
                executeFast.bindInteger(4, tLRPC$ChatFull.online_count);
                executeFast.bindLong(5, tLRPC$ChatFull.inviterId);
                executeFast.bindInteger(6, tLRPC$ChatFull.invitesCount);
                executeFast.bindInteger(7, tLRPC$ChatFull.participants_count);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
            }
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateChatParticipants$102(TLRPC$ChatFull tLRPC$ChatFull) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, tLRPC$ChatFull, 0, bool, bool);
    }

    public void loadChannelAdmins(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadChannelAdmins$104(j);
            }
        });
    }

    public void lambda$loadChannelAdmins$104(long j) {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j, new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            LongSparseArray<TLRPC$ChannelParticipant> longSparseArray = new LongSparseArray<>();
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    TLRPC$ChannelParticipant TLdeserialize = TLRPC$ChannelParticipant.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        longSparseArray.put(queryFinalized.longValue(0), TLdeserialize);
                    }
                }
            }
            queryFinalized.dispose();
            getMessagesController().processLoadedChannelAdmins(longSparseArray, j, true);
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void putChannelAdmins(final long j, final LongSparseArray<TLRPC$ChannelParticipant> longSparseArray) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putChannelAdmins$105(j, longSparseArray);
            }
        });
    }

    public void lambda$putChannelAdmins$105(long j, LongSparseArray longSparseArray) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteDatabase.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j).stepThis().dispose();
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                for (int i = 0; i < longSparseArray.size(); i++) {
                    try {
                        executeFast.requery();
                        executeFast.bindLong(1, j);
                        executeFast.bindLong(2, longSparseArray.keyAt(i));
                        TLRPC$ChannelParticipant tLRPC$ChannelParticipant = (TLRPC$ChannelParticipant) longSparseArray.valueAt(i);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$ChannelParticipant.getObjectSize());
                        tLRPC$ChannelParticipant.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
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
                executeFast.dispose();
                this.database.commitTransaction();
                SQLiteDatabase sQLiteDatabase4 = this.database;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.commitTransaction();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void updateChannelUsers(final long j, final ArrayList<TLRPC$ChannelParticipant> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChannelUsers$106(j, arrayList);
            }
        });
    }

    public void lambda$updateChannelUsers$106(long j, ArrayList arrayList) {
        SQLitePreparedStatement executeFast;
        long j2 = -j;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j2).stepThis().dispose();
                this.database.beginTransaction();
                executeFast = this.database.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$ChannelParticipant tLRPC$ChannelParticipant = (TLRPC$ChannelParticipant) arrayList.get(i);
                executeFast.requery();
                executeFast.bindLong(1, j2);
                executeFast.bindLong(2, MessageObject.getPeerId(tLRPC$ChannelParticipant.peer));
                executeFast.bindInteger(3, currentTimeMillis);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$ChannelParticipant.getObjectSize());
                tLRPC$ChannelParticipant.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(4, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                currentTimeMillis--;
            }
            executeFast.dispose();
            this.database.commitTransaction();
            loadChatInfo(j, true, null, false, true);
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
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
            sQLitePreparedStatement = executeFast;
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
            public final void run() {
                MessagesStorage.this.lambda$saveBotCache$107(tLObject, str);
            }
        });
    }

    public void lambda$saveBotCache$107(TLObject tLObject, String str) {
        int currentTime;
        int i;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                currentTime = getConnectionsManager().getCurrentTime();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (tLObject instanceof TLRPC$TL_messages_botCallbackAnswer) {
                i = ((TLRPC$TL_messages_botCallbackAnswer) tLObject).cache_time;
            } else {
                if (tLObject instanceof TLRPC$TL_messages_botResults) {
                    i = ((TLRPC$TL_messages_botResults) tLObject).cache_time;
                }
                executeFast = this.database.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
                tLObject.serializeToStream(nativeByteBuffer);
                executeFast.bindString(1, str);
                executeFast.bindInteger(2, currentTime);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
                return;
            }
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer2);
            executeFast.bindString(1, str);
            executeFast.bindInteger(2, currentTime);
            executeFast.bindByteBuffer(3, nativeByteBuffer2);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer2.reuse();
            return;
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
            checkSQLException(e);
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
                return;
            }
            return;
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
        currentTime += i;
        executeFast = this.database.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
    }

    public void getBotCache(final String str, final RequestDelegate requestDelegate) {
        if (str == null || requestDelegate == null) {
            return;
        }
        final int currentTime = getConnectionsManager().getCurrentTime();
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getBotCache$108(currentTime, str, requestDelegate);
            }
        });
    }

    public void lambda$getBotCache$108(int r5, java.lang.String r6, org.telegram.tgnet.RequestDelegate r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getBotCache$108(int, java.lang.String, org.telegram.tgnet.RequestDelegate):void");
    }

    public ArrayList<TLRPC$UserFull> loadUserInfos(HashSet<Long> hashSet) {
        ArrayList<TLRPC$UserFull> arrayList = new ArrayList<>();
        try {
            String join = TextUtils.join(",", hashSet);
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid IN(" + join + ")", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$UserFull TLdeserialize = TLRPC$UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                    arrayList.add(TLdeserialize);
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return arrayList;
    }

    public void loadUserInfo(final TLRPC$User tLRPC$User, final boolean z, final int i, int i2) {
        if (tLRPC$User == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadUserInfo$109(tLRPC$User, z, i);
            }
        });
    }

    public void lambda$loadUserInfo$109(org.telegram.tgnet.TLRPC$User r20, boolean r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadUserInfo$109(org.telegram.tgnet.TLRPC$User, boolean, int):void");
    }

    public void updateUserInfo(final TLRPC$UserFull tLRPC$UserFull, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateUserInfo$110(tLRPC$UserFull, z);
            }
        });
    }

    public void lambda$updateUserInfo$110(org.telegram.tgnet.TLRPC$UserFull r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateUserInfo$110(org.telegram.tgnet.TLRPC$UserFull, boolean):void");
    }

    public void saveChatInviter(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveChatInviter$111(j2, j);
            }
        });
    }

    public void lambda$saveChatInviter$111(long j, long j2) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE chat_settings_v2 SET inviter = ? WHERE uid = ?");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j);
                sQLitePreparedStatement.bindLong(2, j2);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void saveChatLinksCount(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveChatLinksCount$112(i, j);
            }
        });
    }

    public void lambda$saveChatLinksCount$112(int i, long j) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindInteger(1, i);
                sQLitePreparedStatement.bindLong(2, j);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void updateChatInfo(final TLRPC$ChatFull tLRPC$ChatFull, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChatInfo$113(tLRPC$ChatFull, z);
            }
        });
    }

    public void lambda$updateChatInfo$113(org.telegram.tgnet.TLRPC$ChatFull r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateChatInfo$113(org.telegram.tgnet.TLRPC$ChatFull, boolean):void");
    }

    public void updateChatOnlineCount(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChatOnlineCount$114(i, j);
            }
        });
    }

    public void lambda$updateChatOnlineCount$114(int i, long j) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindInteger(1, i);
                sQLitePreparedStatement.bindLong(2, j);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void updatePinnedMessages(final long j, final ArrayList<Integer> arrayList, final boolean z, final int i, final int i2, final boolean z2, final HashMap<Integer, MessageObject> hashMap) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updatePinnedMessages$117(z, hashMap, i2, j, arrayList, i, z2);
            }
        });
    }

    public void lambda$updatePinnedMessages$117(boolean r19, final java.util.HashMap r20, final int r21, final long r22, final java.util.ArrayList r24, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updatePinnedMessages$117(boolean, java.util.HashMap, int, long, java.util.ArrayList, int, boolean):void");
    }

    public void lambda$updatePinnedMessages$115(long j, ArrayList arrayList, HashMap hashMap, int i, int i2, boolean z) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(j), arrayList, Boolean.TRUE, 0, hashMap, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public void lambda$updatePinnedMessages$116(long j, ArrayList arrayList, HashMap hashMap, int i, int i2, boolean z) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(j), arrayList, Boolean.FALSE, 0, hashMap, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public void updateChatInfo(final long j, final long j2, final int i, final long j3, final int i2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChatInfo$119(j, i, j2, j3, i2);
            }
        });
    }

    public void lambda$updateChatInfo$119(long j, int i, long j2, long j3, int i2) {
        int i3;
        SQLiteCursor queryFinalized;
        final TLRPC$ChatFull tLRPC$ChatFull;
        TLRPC$ChatParticipant tLRPC$TL_chatParticipant;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                i3 = 0;
                queryFinalized = this.database.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + j, new Object[0]);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            new ArrayList();
            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                tLRPC$ChatFull = null;
            } else {
                tLRPC$ChatFull = TLRPC$ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
                tLRPC$ChatFull.pinned_msg_id = queryFinalized.intValue(1);
                tLRPC$ChatFull.online_count = queryFinalized.intValue(2);
                tLRPC$ChatFull.inviterId = queryFinalized.longValue(3);
            }
            queryFinalized.dispose();
            if (tLRPC$ChatFull instanceof TLRPC$TL_chatFull) {
                if (i == 1) {
                    while (true) {
                        if (i3 >= tLRPC$ChatFull.participants.participants.size()) {
                            break;
                        } else if (tLRPC$ChatFull.participants.participants.get(i3).user_id == j2) {
                            tLRPC$ChatFull.participants.participants.remove(i3);
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else if (i == 0) {
                    Iterator<TLRPC$ChatParticipant> it = tLRPC$ChatFull.participants.participants.iterator();
                    while (it.hasNext()) {
                        if (it.next().user_id == j2) {
                            return;
                        }
                    }
                    TLRPC$TL_chatParticipant tLRPC$TL_chatParticipant2 = new TLRPC$TL_chatParticipant();
                    tLRPC$TL_chatParticipant2.user_id = j2;
                    tLRPC$TL_chatParticipant2.inviter_id = j3;
                    tLRPC$TL_chatParticipant2.date = getConnectionsManager().getCurrentTime();
                    tLRPC$ChatFull.participants.participants.add(tLRPC$TL_chatParticipant2);
                } else if (i == 2) {
                    while (true) {
                        if (i3 >= tLRPC$ChatFull.participants.participants.size()) {
                            break;
                        }
                        TLRPC$ChatParticipant tLRPC$ChatParticipant = tLRPC$ChatFull.participants.participants.get(i3);
                        if (tLRPC$ChatParticipant.user_id == j2) {
                            if (j3 == 1) {
                                tLRPC$TL_chatParticipant = new TLRPC$TL_chatParticipantAdmin();
                            } else {
                                tLRPC$TL_chatParticipant = new TLRPC$TL_chatParticipant();
                            }
                            tLRPC$TL_chatParticipant.user_id = tLRPC$ChatParticipant.user_id;
                            tLRPC$TL_chatParticipant.date = tLRPC$ChatParticipant.date;
                            tLRPC$TL_chatParticipant.inviter_id = tLRPC$ChatParticipant.inviter_id;
                            tLRPC$ChatFull.participants.participants.set(i3, tLRPC$TL_chatParticipant);
                        } else {
                            i3++;
                        }
                    }
                }
                tLRPC$ChatFull.participants.version = i2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$updateChatInfo$118(tLRPC$ChatFull);
                    }
                });
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$ChatFull.getObjectSize());
                tLRPC$ChatFull.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, j);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, tLRPC$ChatFull.pinned_msg_id);
                executeFast.bindInteger(4, tLRPC$ChatFull.online_count);
                executeFast.bindLong(5, tLRPC$ChatFull.inviterId);
                executeFast.bindInteger(6, tLRPC$ChatFull.invitesCount);
                executeFast.bindInteger(7, tLRPC$ChatFull.participants_count);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
            }
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateChatInfo$118(TLRPC$ChatFull tLRPC$ChatFull) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, tLRPC$ChatFull, 0, bool, bool);
    }

    public boolean isMigratedChat(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$isMigratedChat$120(j, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$isMigratedChat$120(long j, boolean[] zArr, CountDownLatch countDownLatch) {
        SQLiteCursor queryFinalized;
        TLRPC$ChatFull tLRPC$ChatFull;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.database.queryFinalized("SELECT info FROM chat_settings_v2 WHERE uid = " + j, new Object[0]);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            new ArrayList();
            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                tLRPC$ChatFull = null;
            } else {
                tLRPC$ChatFull = TLRPC$ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            zArr[0] = (tLRPC$ChatFull instanceof TLRPC$TL_channelFull) && tLRPC$ChatFull.migrated_from_chat_id != 0;
            countDownLatch.countDown();
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public TLRPC$Message getMessage(final long j, final long j2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getMessage$121(j, j2, atomicReference, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return (TLRPC$Message) atomicReference.get();
    }

    public void lambda$getMessage$121(long j, long j2, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " AND mid = " + j2 + " LIMIT 1", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        atomicReference.set(TLdeserialize);
                    }
                }
                sQLiteCursor.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    public boolean hasInviteMeMessage(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$hasInviteMeMessage$122(j, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$hasInviteMeMessage$122(long j, boolean[] zArr, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                long clientUserId = getUserConfig().getClientUserId();
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + (-j) + " AND out = 0 ORDER BY mid DESC LIMIT 100", new Object[0]);
                while (true) {
                    if (!sQLiteCursor.next()) {
                        break;
                    }
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        TLRPC$MessageAction tLRPC$MessageAction = TLdeserialize.action;
                        if ((tLRPC$MessageAction instanceof TLRPC$TL_messageActionChatAddUser) && tLRPC$MessageAction.users.contains(Long.valueOf(clientUserId))) {
                            zArr[0] = true;
                            break;
                        }
                    }
                }
                sQLiteCursor.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    public HashMap<Long, Integer> getSmallGroupsParticipantsCount() {
        HashMap<Long, Integer> hashMap = new HashMap<>();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.database.queryFinalized("SELECT uid, info, participants_count FROM chat_settings_v2 WHERE participants_count > 1", new Object[0]);
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    int intValue = sQLiteCursor.intValue(2);
                    if (byteBufferValue != null) {
                        TLRPC$ChatFull TLdeserialize = TLRPC$ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize instanceof TLRPC$TL_channelFull) {
                            hashMap.put(Long.valueOf(longValue), Integer.valueOf(intValue));
                        }
                    }
                }
                sQLiteCursor.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
            return hashMap;
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private org.telegram.tgnet.TLRPC$ChatFull loadChatInfoInternal(long r23, boolean r25, boolean r26, boolean r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.loadChatInfoInternal(long, boolean, boolean, boolean, int):org.telegram.tgnet.TLRPC$ChatFull");
    }

    public TLRPC$ChatFull loadChatInfo(long j, boolean z, CountDownLatch countDownLatch, boolean z2, boolean z3) {
        return loadChatInfo(j, z, countDownLatch, z2, z3, 0);
    }

    public TLRPC$ChatFull loadChatInfo(final long j, final boolean z, final CountDownLatch countDownLatch, final boolean z2, final boolean z3, final int i) {
        final TLRPC$ChatFull[] tLRPC$ChatFullArr = new TLRPC$ChatFull[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadChatInfo$123(tLRPC$ChatFullArr, j, z, z2, z3, i, countDownLatch);
            }
        });
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }
        return tLRPC$ChatFullArr[0];
    }

    public void lambda$loadChatInfo$123(TLRPC$ChatFull[] tLRPC$ChatFullArr, long j, boolean z, boolean z2, boolean z3, int i, CountDownLatch countDownLatch) {
        tLRPC$ChatFullArr[0] = loadChatInfoInternal(j, z, z2, z3, i);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public TLRPC$ChatFull loadChatInfoInQueue(long j, boolean z, boolean z2, boolean z3, int i) {
        return loadChatInfoInternal(j, z, z2, z3, i);
    }

    public void processPendingRead(final long j, final int i, final int i2, final int i3) {
        final int i4 = this.lastSavedDate;
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$processPendingRead$124(j, i, i3, i4, i2);
            }
        });
    }

    public void lambda$processPendingRead$124(long r19, int r21, int r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$processPendingRead$124(long, int, int, int, int):void");
    }

    public void putContacts(ArrayList<TLRPC$TL_contact> arrayList, final boolean z) {
        if (!arrayList.isEmpty() || z) {
            final ArrayList arrayList2 = new ArrayList(arrayList);
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putContacts$125(z, arrayList2);
                }
            });
        }
    }

    public void lambda$putContacts$125(boolean r8, java.util.ArrayList r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putContacts$125(boolean, java.util.ArrayList):void");
    }

    public void deleteContacts(final ArrayList<Long> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteContacts$126(arrayList);
            }
        });
    }

    public void lambda$deleteContacts$126(ArrayList arrayList) {
        try {
            String join = TextUtils.join(",", arrayList);
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM contacts WHERE uid IN(" + join + ")").stepThis().dispose();
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
            public final void run() {
                MessagesStorage.this.lambda$applyPhoneBookUpdates$127(str, str2);
            }
        });
    }

    public void lambda$applyPhoneBookUpdates$127(String str, String str2) {
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

    public void putCachedPhoneBook(final HashMap<String, ContactsController.Contact> hashMap, final boolean z, boolean z2) {
        if (hashMap != null) {
            if (!hashMap.isEmpty() || z || z2) {
                this.storageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$putCachedPhoneBook$128(hashMap, z);
                    }
                });
            }
        }
    }

    public void lambda$putCachedPhoneBook$128(java.util.HashMap r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putCachedPhoneBook$128(java.util.HashMap, boolean):void");
    }

    public void getCachedPhoneBook(final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getCachedPhoneBook$129(z);
            }
        });
    }

    public void lambda$getCachedPhoneBook$129(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getCachedPhoneBook$129(boolean):void");
    }

    public void getContacts() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getContacts$130();
            }
        });
    }

    public void lambda$getContacts$130() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getContacts$130():void");
    }

    public void getUnsentMessages(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getUnsentMessages$131(i);
            }
        });
    }

    public void lambda$getUnsentMessages$131(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getUnsentMessages$131(int):void");
    }

    public boolean checkMessageByRandomId(final long j) {
        final boolean[] zArr = new boolean[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$checkMessageByRandomId$132(j, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$checkMessageByRandomId$132(long r7, boolean[] r9, java.util.concurrent.CountDownLatch r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkMessageByRandomId$132(long, boolean[], java.util.concurrent.CountDownLatch):void");
    }

    public boolean checkMessageId(final long j, final int i) {
        final boolean[] zArr = new boolean[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$checkMessageId$133(j, i, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$checkMessageId$133(long r6, int r8, boolean[] r9, java.util.concurrent.CountDownLatch r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkMessageId$133(long, int, boolean[], java.util.concurrent.CountDownLatch):void");
    }

    public void getUnreadMention(final long j, final int i, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getUnreadMention$135(i, j, intCallback);
            }
        });
    }

    public void lambda$getUnreadMention$135(int i, long j, final IntCallback intCallback) {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                if (i != 0) {
                    queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT MIN(mid) FROM messages_topics WHERE uid = %d AND topic_id = %d AND mention = 1 AND read_state IN(0, 1)", Long.valueOf(j), Integer.valueOf(i)), new Object[0]);
                } else {
                    queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT MIN(mid) FROM messages_v2 WHERE uid = %d AND mention = 1 AND read_state IN(0, 1)", Long.valueOf(j)), new Object[0]);
                }
                sQLiteCursor = queryFinalized;
                final int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.IntCallback.this.run(intValue);
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
                MessagesStorage.this.lambda$getMessagesCount$137(j, intCallback);
            }
        });
    }

    public void lambda$getMessagesCount$137(long j, final IntCallback intCallback) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM messages_v2 WHERE uid = %d", Long.valueOf(j)), new Object[0]);
                final int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.IntCallback.this.run(intValue);
                    }
                });
            } catch (Exception e) {
                checkSQLException(e);
            }
        } finally {
            sQLiteCursor.dispose();
        }
    }

    public java.lang.Runnable getMessagesInternal(long r54, long r56, int r58, int r59, int r60, int r61, int r62, int r63, boolean r64, int r65, int r66, boolean r67, boolean r68, org.telegram.messenger.MessageLoaderLogger r69) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.getMessagesInternal(long, long, int, int, int, int, int, int, boolean, int, int, boolean, boolean, org.telegram.messenger.MessageLoaderLogger):java.lang.Runnable");
    }

    public static int lambda$getMessagesInternal$138(TLRPC$Message tLRPC$Message, TLRPC$Message tLRPC$Message2) {
        int i;
        int i2;
        int i3 = tLRPC$Message.id;
        if (i3 > 0 && (i2 = tLRPC$Message2.id) > 0) {
            if (i3 > i2) {
                return -1;
            }
            return i3 < i2 ? 1 : 0;
        } else if (i3 < 0 && (i = tLRPC$Message2.id) < 0) {
            if (i3 < i) {
                return -1;
            }
            return i3 > i ? 1 : 0;
        } else {
            int i4 = tLRPC$Message.date;
            int i5 = tLRPC$Message2.date;
            if (i4 > i5) {
                return -1;
            }
            return i4 < i5 ? 1 : 0;
        }
    }

    public void lambda$getMessagesInternal$139(TLRPC$TL_messages_messages tLRPC$TL_messages_messages, int i, long j, long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, boolean z2, int i11, int i12, boolean z3, int i13, boolean z4, boolean z5, MessageLoaderLogger messageLoaderLogger) {
        getMessagesController().processLoadedMessages(tLRPC$TL_messages_messages, i, j, j2, i2, i3, i4, true, i5, i6, i7, i8, i9, i10, z, z2 ? 1 : 0, i11, i12, z3, i13, z4, z5, messageLoaderLogger);
    }

    private void getAnimatedEmoji(String str, ArrayList<TLRPC$Document> arrayList) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM animated_emoji WHERE document_id IN (%s)", str), new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    try {
                        TLRPC$Document TLdeserialize = TLRPC$Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (TLdeserialize != null && TLdeserialize.id != 0) {
                            arrayList.add(TLdeserialize);
                        }
                    } catch (Exception e) {
                        checkSQLException(e);
                    }
                    if (byteBufferValue != null) {
                        byteBufferValue.reuse();
                    }
                }
            } catch (Throwable th) {
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e2.printStackTrace();
            if (sQLiteCursor == null) {
                return;
            }
        }
        sQLiteCursor.dispose();
    }

    public void getMessages(final long j, final long j2, boolean z, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final boolean z2, final int i7, final int i8, final boolean z3, final boolean z4, final MessageLoaderLogger messageLoaderLogger) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getMessages$141(messageLoaderLogger, j, j2, i, i2, i3, i4, i5, i6, z2, i7, i8, z3, z4);
            }
        });
    }

    public void lambda$getMessages$141(final MessageLoaderLogger messageLoaderLogger, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, boolean z2, boolean z3) {
        if (messageLoaderLogger != null) {
            messageLoaderLogger.logStorageQueuePost();
        }
        final Runnable messagesInternal = getMessagesInternal(j, j2, i, i2, i3, i4, i5, i6, z, i7, i8, z2, z3, messageLoaderLogger);
        if (messageLoaderLogger != null) {
            messageLoaderLogger.logStorageProccessing();
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.lambda$getMessages$140(MessageLoaderLogger.this, messagesInternal);
            }
        });
    }

    public static void lambda$getMessages$140(MessageLoaderLogger messageLoaderLogger, Runnable runnable) {
        if (messageLoaderLogger != null) {
            messageLoaderLogger.logStageQueuePost();
        }
        runnable.run();
    }

    public void clearSentMedia() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearSentMedia$142();
            }
        });
    }

    public void lambda$clearSentMedia$142() {
        try {
            this.database.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public Object[] getSentFile(final String str, final int i) {
        if (str == null || str.toLowerCase().endsWith("attheme")) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Object[] objArr = new Object[2];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getSentFile$143(str, i, objArr, countDownLatch);
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

    public void lambda$getSentFile$143(String str, int i, Object[] objArr, CountDownLatch countDownLatch) {
        NativeByteBuffer byteBufferValue;
        try {
            try {
                String MD5 = Utilities.MD5(str);
                if (MD5 != null) {
                    SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data, parent FROM sent_files_v2 WHERE uid = '%s' AND type = %d", MD5, Integer.valueOf(i)), new Object[0]);
                    if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize instanceof TLRPC$TL_messageMediaDocument) {
                            objArr[0] = ((TLRPC$TL_messageMediaDocument) TLdeserialize).document;
                        } else if (TLdeserialize instanceof TLRPC$TL_messageMediaPhoto) {
                            objArr[0] = ((TLRPC$TL_messageMediaPhoto) TLdeserialize).photo;
                        }
                        if (objArr[0] != null) {
                            objArr[1] = queryFinalized.stringValue(1);
                        }
                    }
                    queryFinalized.dispose();
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    private void updateWidgets(long j) {
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(Long.valueOf(j));
        updateWidgets(arrayList);
    }

    private void updateWidgets(ArrayList<Long> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        AppWidgetManager appWidgetManager = null;
        try {
            TextUtils.join(",", arrayList);
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT DISTINCT id FROM shortcut_widget WHERE did IN(%s,-1)", TextUtils.join(",", arrayList)), new Object[0]);
            while (queryFinalized.next()) {
                if (appWidgetManager == null) {
                    appWidgetManager = AppWidgetManager.getInstance(ApplicationLoader.applicationContext);
                }
                appWidgetManager.notifyAppWidgetViewDataChanged(queryFinalized.intValue(0), R.id.list_view);
            }
            queryFinalized.dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void putWidgetDialogs(final int i, final ArrayList<TopicKey> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putWidgetDialogs$144(i, arrayList);
            }
        });
    }

    public void lambda$putWidgetDialogs$144(int i, ArrayList arrayList) {
        try {
            this.database.beginTransaction();
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM shortcut_widget WHERE id = " + i).stepThis().dispose();
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO shortcut_widget VALUES(?, ?, ?)");
            if (arrayList.isEmpty()) {
                executeFast.requery();
                executeFast.bindInteger(1, i);
                executeFast.bindLong(2, -1L);
                executeFast.bindInteger(3, 0);
                executeFast.step();
            } else {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    long j = ((TopicKey) arrayList.get(i2)).dialogId;
                    executeFast.requery();
                    executeFast.bindInteger(1, i);
                    executeFast.bindLong(2, j);
                    executeFast.bindInteger(3, i2);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            this.database.commitTransaction();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void clearWidgetDialogs(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearWidgetDialogs$145(i);
            }
        });
    }

    public void lambda$clearWidgetDialogs$145(int i) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM shortcut_widget WHERE id = " + i).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void getWidgetDialogIds(final int i, final int i2, final ArrayList<Long> arrayList, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final boolean z) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getWidgetDialogIds$146(i, arrayList, arrayList2, arrayList3, z, i2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void lambda$getWidgetDialogIds$146(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i2, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT did FROM shortcut_widget WHERE id = %d ORDER BY ord ASC", Integer.valueOf(i)), new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        long longValue = queryFinalized.longValue(0);
                        if (longValue != -1) {
                            arrayList.add(Long.valueOf(longValue));
                            if (arrayList2 != null && arrayList3 != null) {
                                if (DialogObject.isUserDialog(longValue)) {
                                    arrayList4.add(Long.valueOf(longValue));
                                } else {
                                    arrayList5.add(Long.valueOf(-longValue));
                                }
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = queryFinalized;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                        throw th;
                    }
                }
                queryFinalized.dispose();
                if (!z && arrayList.isEmpty()) {
                    if (i2 == 0) {
                        SQLiteCursor queryFinalized2 = this.database.queryFinalized("SELECT did FROM dialogs WHERE folder_id = 0 ORDER BY pinned DESC, date DESC LIMIT 0,10", new Object[0]);
                        while (queryFinalized2.next()) {
                            long longValue2 = queryFinalized2.longValue(0);
                            if (!DialogObject.isFolderDialogId(longValue2)) {
                                arrayList.add(Long.valueOf(longValue2));
                                if (arrayList2 != null && arrayList3 != null) {
                                    if (DialogObject.isUserDialog(longValue2)) {
                                        arrayList4.add(Long.valueOf(longValue2));
                                    } else {
                                        arrayList5.add(Long.valueOf(-longValue2));
                                    }
                                }
                            }
                        }
                        queryFinalized2.dispose();
                    } else {
                        SQLiteCursor queryFinalized3 = getMessagesStorage().getDatabase().queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                        while (queryFinalized3.next()) {
                            long longValue3 = queryFinalized3.longValue(0);
                            arrayList.add(Long.valueOf(longValue3));
                            if (arrayList2 != null && arrayList3 != null) {
                                if (DialogObject.isUserDialog(longValue3)) {
                                    arrayList4.add(Long.valueOf(longValue3));
                                } else {
                                    arrayList5.add(Long.valueOf(-longValue3));
                                }
                            }
                        }
                        queryFinalized3.dispose();
                    }
                }
                if (arrayList2 != null && arrayList3 != null) {
                    if (!arrayList5.isEmpty()) {
                        getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    if (!arrayList4.isEmpty()) {
                        getUsersInternal(TextUtils.join(",", arrayList4), arrayList2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        countDownLatch.countDown();
    }

    public void getWidgetDialogs(final int i, final int i2, final ArrayList<Long> arrayList, final LongSparseArray<TLRPC$Dialog> longSparseArray, final LongSparseArray<TLRPC$Message> longSparseArray2, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getWidgetDialogs$147(i, arrayList, i2, longSparseArray, longSparseArray2, arrayList3, arrayList2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void lambda$getWidgetDialogs$147(int i, ArrayList arrayList, int i2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        SQLiteCursor queryFinalized;
        boolean z;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                SQLiteCursor queryFinalized2 = this.database.queryFinalized(String.format(Locale.US, "SELECT did FROM shortcut_widget WHERE id = %d ORDER BY ord ASC", Integer.valueOf(i)), new Object[0]);
                while (queryFinalized2.next()) {
                    try {
                        long longValue = queryFinalized2.longValue(0);
                        if (longValue != -1) {
                            arrayList.add(Long.valueOf(longValue));
                            if (DialogObject.isUserDialog(longValue)) {
                                arrayList4.add(Long.valueOf(longValue));
                            } else {
                                arrayList5.add(Long.valueOf(-longValue));
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = queryFinalized;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                        throw th;
                    }
                }
                queryFinalized2.dispose();
                if (arrayList.isEmpty() && i2 == 1) {
                    SQLiteCursor queryFinalized3 = getMessagesStorage().getDatabase().queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                    while (queryFinalized3.next()) {
                        long longValue2 = queryFinalized3.longValue(0);
                        arrayList.add(Long.valueOf(longValue2));
                        if (DialogObject.isUserDialog(longValue2)) {
                            arrayList4.add(Long.valueOf(longValue2));
                        } else {
                            arrayList5.add(Long.valueOf(-longValue2));
                        }
                    }
                    queryFinalized3.dispose();
                }
                if (arrayList.isEmpty()) {
                    queryFinalized = this.database.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.folder_id = 0 ORDER BY d.pinned DESC, d.date DESC LIMIT 0,10", new Object[0]);
                    z = true;
                } else {
                    queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.did IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
                    z = false;
                }
                while (queryFinalized.next()) {
                    long longValue3 = queryFinalized.longValue(0);
                    if (!DialogObject.isFolderDialogId(longValue3)) {
                        if (z) {
                            arrayList.add(Long.valueOf(longValue3));
                        }
                        TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
                        tLRPC$TL_dialog.id = longValue3;
                        tLRPC$TL_dialog.top_message = queryFinalized.intValue(1);
                        tLRPC$TL_dialog.unread_count = queryFinalized.intValue(2);
                        tLRPC$TL_dialog.last_message_date = queryFinalized.intValue(3);
                        longSparseArray.put(tLRPC$TL_dialog.id, tLRPC$TL_dialog);
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                            byteBufferValue.reuse();
                            MessageObject.setUnreadFlags(TLdeserialize, queryFinalized.intValue(5));
                            TLdeserialize.id = queryFinalized.intValue(6);
                            TLdeserialize.send_state = queryFinalized.intValue(7);
                            int intValue = queryFinalized.intValue(8);
                            if (intValue != 0) {
                                tLRPC$TL_dialog.last_message_date = intValue;
                            }
                            long j = tLRPC$TL_dialog.id;
                            TLdeserialize.dialog_id = j;
                            longSparseArray2.put(j, TLdeserialize);
                            addUsersAndChatsFromMessage(TLdeserialize, arrayList4, arrayList5, null);
                        }
                    }
                }
                queryFinalized.dispose();
                if (!z && arrayList.size() > longSparseArray.size()) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        long longValue4 = ((Long) arrayList.get(i3)).longValue();
                        if (longSparseArray.get(((Long) arrayList.get(i3)).longValue()) == null) {
                            TLRPC$TL_dialog tLRPC$TL_dialog2 = new TLRPC$TL_dialog();
                            tLRPC$TL_dialog2.id = longValue4;
                            longSparseArray.put(longValue4, tLRPC$TL_dialog2);
                            if (DialogObject.isChatDialog(longValue4)) {
                                long j2 = -longValue4;
                                if (arrayList5.contains(Long.valueOf(j2))) {
                                    arrayList5.add(Long.valueOf(j2));
                                }
                            } else if (arrayList4.contains(Long.valueOf(longValue4))) {
                                arrayList4.add(Long.valueOf(longValue4));
                            }
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    getChatsInternal(TextUtils.join(",", arrayList5), arrayList2);
                }
                if (!arrayList4.isEmpty()) {
                    getUsersInternal(TextUtils.join(",", arrayList4), arrayList3);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        countDownLatch.countDown();
    }

    public void putSentFile(final String str, final TLObject tLObject, final int i, final String str2) {
        if (str == null || tLObject == null || str2 == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putSentFile$148(str, tLObject, i, str2);
            }
        });
    }

    public void lambda$putSentFile$148(String str, TLObject tLObject, int i, String str2) {
        TLRPC$MessageMedia tLRPC$MessageMedia;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                String MD5 = Utilities.MD5(str);
                if (MD5 != null) {
                    if (tLObject instanceof TLRPC$Photo) {
                        tLRPC$MessageMedia = new TLRPC$TL_messageMediaPhoto();
                        tLRPC$MessageMedia.photo = (TLRPC$Photo) tLObject;
                        tLRPC$MessageMedia.flags |= 1;
                    } else if (tLObject instanceof TLRPC$Document) {
                        tLRPC$MessageMedia = new TLRPC$TL_messageMediaDocument();
                        tLRPC$MessageMedia.document = (TLRPC$Document) tLObject;
                        tLRPC$MessageMedia.flags |= 1;
                    } else {
                        tLRPC$MessageMedia = null;
                    }
                    if (tLRPC$MessageMedia == null) {
                        return;
                    }
                    sQLitePreparedStatement = this.database.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$MessageMedia.getObjectSize());
                    tLRPC$MessageMedia.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindString(1, MD5);
                    sQLitePreparedStatement.bindInteger(2, i);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(4, str2);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer.reuse();
                }
                if (sQLitePreparedStatement == null) {
                    return;
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void updateEncryptedChatSeq(final TLRPC$EncryptedChat tLRPC$EncryptedChat, final boolean z) {
        if (tLRPC$EncryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateEncryptedChatSeq$149(tLRPC$EncryptedChat, z);
            }
        });
    }

    public void lambda$updateEncryptedChatSeq$149(TLRPC$EncryptedChat tLRPC$EncryptedChat, boolean z) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, tLRPC$EncryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, tLRPC$EncryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (tLRPC$EncryptedChat.key_use_count_in << 16) | tLRPC$EncryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, tLRPC$EncryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, tLRPC$EncryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, tLRPC$EncryptedChat.id);
                sQLitePreparedStatement.step();
                if (z && tLRPC$EncryptedChat.in_seq_no != 0) {
                    long encryptedChatId = DialogObject.getEncryptedChatId(tLRPC$EncryptedChat.id);
                    this.database.executeFast(String.format(Locale.US, "DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = %d AND m.date = 0 AND m.mid < 0 AND s.seq_out <= %d) AND uid = %d", Long.valueOf(encryptedChatId), Integer.valueOf(tLRPC$EncryptedChat.in_seq_no), Long.valueOf(encryptedChatId))).stepThis().dispose();
                }
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void updateEncryptedChatTTL(final TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        if (tLRPC$EncryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateEncryptedChatTTL$150(tLRPC$EncryptedChat);
            }
        });
    }

    public void lambda$updateEncryptedChatTTL$150(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE enc_chats SET ttl = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, tLRPC$EncryptedChat.ttl);
                sQLitePreparedStatement.bindInteger(2, tLRPC$EncryptedChat.id);
                sQLitePreparedStatement.step();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void updateEncryptedChatLayer(final TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        if (tLRPC$EncryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateEncryptedChatLayer$151(tLRPC$EncryptedChat);
            }
        });
    }

    public void lambda$updateEncryptedChatLayer$151(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE enc_chats SET layer = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, tLRPC$EncryptedChat.layer);
                sQLitePreparedStatement.bindInteger(2, tLRPC$EncryptedChat.id);
                sQLitePreparedStatement.step();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void updateEncryptedChat(final TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        if (tLRPC$EncryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateEncryptedChat$152(tLRPC$EncryptedChat);
            }
        });
    }

    public void lambda$updateEncryptedChat$152(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        byte[] bArr;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                byte[] bArr2 = tLRPC$EncryptedChat.key_hash;
                if ((bArr2 == null || bArr2.length < 16) && (bArr = tLRPC$EncryptedChat.auth_key) != null) {
                    tLRPC$EncryptedChat.key_hash = AndroidUtilities.calcAuthKeyHash(bArr);
                }
                sQLitePreparedStatement = this.database.executeFast("UPDATE enc_chats SET data = ?, g = ?, authkey = ?, ttl = ?, layer = ?, seq_in = ?, seq_out = ?, use_count = ?, exchange_id = ?, key_date = ?, fprint = ?, fauthkey = ?, khash = ?, in_seq_no = ?, admin_id = ?, mtproto_seq = ? WHERE uid = ?");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$EncryptedChat.getObjectSize());
                byte[] bArr3 = tLRPC$EncryptedChat.a_or_b;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(bArr3 != null ? bArr3.length : 1);
                byte[] bArr4 = tLRPC$EncryptedChat.auth_key;
                NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(bArr4 != null ? bArr4.length : 1);
                byte[] bArr5 = tLRPC$EncryptedChat.future_auth_key;
                NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(bArr5 != null ? bArr5.length : 1);
                byte[] bArr6 = tLRPC$EncryptedChat.key_hash;
                NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(bArr6 != null ? bArr6.length : 1);
                tLRPC$EncryptedChat.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                byte[] bArr7 = tLRPC$EncryptedChat.a_or_b;
                if (bArr7 != null) {
                    nativeByteBuffer2.writeBytes(bArr7);
                }
                byte[] bArr8 = tLRPC$EncryptedChat.auth_key;
                if (bArr8 != null) {
                    nativeByteBuffer3.writeBytes(bArr8);
                }
                byte[] bArr9 = tLRPC$EncryptedChat.future_auth_key;
                if (bArr9 != null) {
                    nativeByteBuffer4.writeBytes(bArr9);
                }
                byte[] bArr10 = tLRPC$EncryptedChat.key_hash;
                if (bArr10 != null) {
                    nativeByteBuffer5.writeBytes(bArr10);
                }
                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer2);
                sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer3);
                sQLitePreparedStatement.bindInteger(4, tLRPC$EncryptedChat.ttl);
                sQLitePreparedStatement.bindInteger(5, tLRPC$EncryptedChat.layer);
                sQLitePreparedStatement.bindInteger(6, tLRPC$EncryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(7, tLRPC$EncryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(8, (tLRPC$EncryptedChat.key_use_count_in << 16) | tLRPC$EncryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindLong(9, tLRPC$EncryptedChat.exchange_id);
                sQLitePreparedStatement.bindInteger(10, tLRPC$EncryptedChat.key_create_date);
                sQLitePreparedStatement.bindLong(11, tLRPC$EncryptedChat.future_key_fingerprint);
                sQLitePreparedStatement.bindByteBuffer(12, nativeByteBuffer4);
                sQLitePreparedStatement.bindByteBuffer(13, nativeByteBuffer5);
                sQLitePreparedStatement.bindInteger(14, tLRPC$EncryptedChat.in_seq_no);
                sQLitePreparedStatement.bindLong(15, tLRPC$EncryptedChat.admin_id);
                sQLitePreparedStatement.bindInteger(16, tLRPC$EncryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(17, tLRPC$EncryptedChat.id);
                sQLitePreparedStatement.step();
                nativeByteBuffer.reuse();
                nativeByteBuffer2.reuse();
                nativeByteBuffer3.reuse();
                nativeByteBuffer4.reuse();
                nativeByteBuffer5.reuse();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void isDialogHasTopMessage(final long j, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$isDialogHasTopMessage$153(j, runnable);
            }
        });
    }

    public void lambda$isDialogHasTopMessage$153(long r8, java.lang.Runnable r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$isDialogHasTopMessage$153(long, java.lang.Runnable):void");
    }

    public boolean hasAuthMessage(final int i) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$hasAuthMessage$154(i, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return zArr[0];
    }

    public void lambda$hasAuthMessage$154(int r7, boolean[] r8, java.util.concurrent.CountDownLatch r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$hasAuthMessage$154(int, boolean[], java.util.concurrent.CountDownLatch):void");
    }

    public void getEncryptedChat(final long j, final CountDownLatch countDownLatch, final ArrayList<TLObject> arrayList) {
        if (countDownLatch == null || arrayList == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getEncryptedChat$155(j, arrayList, countDownLatch);
            }
        });
    }

    public void lambda$getEncryptedChat$155(long j, ArrayList arrayList, CountDownLatch countDownLatch) {
        try {
            try {
                ArrayList<Long> arrayList2 = new ArrayList<>();
                ArrayList<TLRPC$EncryptedChat> arrayList3 = new ArrayList<>();
                getEncryptedChatsInternal("" + j, arrayList3, arrayList2);
                if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                    ArrayList<TLRPC$User> arrayList4 = new ArrayList<>();
                    getUsersInternal(TextUtils.join(",", arrayList2), arrayList4);
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

    public void putEncryptedChat(final TLRPC$EncryptedChat tLRPC$EncryptedChat, final TLRPC$User tLRPC$User, final TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$EncryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putEncryptedChat$156(tLRPC$EncryptedChat, tLRPC$User, tLRPC$Dialog);
            }
        });
    }

    public void lambda$putEncryptedChat$156(org.telegram.tgnet.TLRPC$EncryptedChat r17, org.telegram.tgnet.TLRPC$User r18, org.telegram.tgnet.TLRPC$Dialog r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putEncryptedChat$156(org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Dialog):void");
    }

    private String formatUserSearchName(TLRPC$User tLRPC$User) {
        StringBuilder sb = new StringBuilder();
        String str = tLRPC$User.first_name;
        if (str != null && str.length() > 0) {
            sb.append(tLRPC$User.first_name);
        }
        String str2 = tLRPC$User.last_name;
        if (str2 != null && str2.length() > 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(tLRPC$User.last_name);
        }
        sb.append(";;;");
        String str3 = tLRPC$User.username;
        if (str3 != null && str3.length() > 0) {
            sb.append(tLRPC$User.username);
        } else {
            ArrayList<TLRPC$TL_username> arrayList = tLRPC$User.usernames;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i = 0; i < tLRPC$User.usernames.size(); i++) {
                    TLRPC$TL_username tLRPC$TL_username = tLRPC$User.usernames.get(i);
                    if (tLRPC$TL_username != null && tLRPC$TL_username.active) {
                        sb.append(tLRPC$TL_username.username);
                        sb.append(";;");
                    }
                }
            }
        }
        return sb.toString().toLowerCase();
    }

    public boolean containsLocalDialog(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Boolean[] boolArr = {Boolean.FALSE};
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$containsLocalDialog$157(j, boolArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return boolArr[0].booleanValue();
    }

    public void lambda$containsLocalDialog$157(long r5, java.lang.Boolean[] r7, java.util.concurrent.CountDownLatch r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$containsLocalDialog$157(long, java.lang.Boolean[], java.util.concurrent.CountDownLatch):void");
    }

    private void putUsersInternal(List<TLRPC$User> list) throws Exception {
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO users VALUES(?, ?, ?, ?)");
        for (int i = 0; i < list.size(); i++) {
            TLRPC$User tLRPC$User = list.get(i);
            if (tLRPC$User != null && tLRPC$User.min) {
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM users WHERE uid = %d", Long.valueOf(tLRPC$User.id)), new Object[0]);
                if (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                String str = tLRPC$User.username;
                                if (str != null) {
                                    TLdeserialize.username = str;
                                    TLdeserialize.flags |= 8;
                                } else {
                                    TLdeserialize.username = null;
                                    TLdeserialize.flags &= -9;
                                }
                                if (tLRPC$User.apply_min_photo) {
                                    TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$User.photo;
                                    if (tLRPC$UserProfilePhoto != null) {
                                        TLdeserialize.photo = tLRPC$UserProfilePhoto;
                                        TLdeserialize.flags |= 32;
                                    } else {
                                        TLdeserialize.photo = null;
                                        TLdeserialize.flags &= -33;
                                    }
                                }
                                tLRPC$User = TLdeserialize;
                            }
                        }
                    } catch (Exception e) {
                        checkSQLException(e);
                    }
                }
                queryFinalized.dispose();
            }
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$User.getObjectSize());
            tLRPC$User.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, tLRPC$User.id);
            executeFast.bindString(2, formatUserSearchName(tLRPC$User));
            TLRPC$UserStatus tLRPC$UserStatus = tLRPC$User.status;
            if (tLRPC$UserStatus != null) {
                if (tLRPC$UserStatus instanceof TLRPC$TL_userStatusRecently) {
                    tLRPC$UserStatus.expires = -100;
                } else if (tLRPC$UserStatus instanceof TLRPC$TL_userStatusLastWeek) {
                    tLRPC$UserStatus.expires = -101;
                } else if (tLRPC$UserStatus instanceof TLRPC$TL_userStatusLastMonth) {
                    tLRPC$UserStatus.expires = -102;
                }
                executeFast.bindInteger(3, tLRPC$UserStatus.expires);
            } else {
                executeFast.bindInteger(3, 0);
            }
            executeFast.bindByteBuffer(4, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
        }
        executeFast.dispose();
    }

    public void updateChatDefaultBannedRights(final long j, final TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, final int i) {
        if (tLRPC$TL_chatBannedRights == null || j == 0) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChatDefaultBannedRights$158(j, i, tLRPC$TL_chatBannedRights);
            }
        });
    }

    public void lambda$updateChatDefaultBannedRights$158(long j, int i, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights) {
        SQLiteCursor queryFinalized;
        TLRPC$Chat tLRPC$Chat;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM chats WHERE uid = %d", Long.valueOf(j)), new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            j = 0;
        } catch (Throwable th2) {
            th = th2;
            j = 0;
        }
        try {
            if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                tLRPC$Chat = null;
            } else {
                tLRPC$Chat = TLRPC$Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tLRPC$Chat != null) {
                if (tLRPC$Chat.default_banned_rights == null || i >= tLRPC$Chat.version) {
                    tLRPC$Chat.default_banned_rights = tLRPC$TL_chatBannedRights;
                    tLRPC$Chat.flags |= 262144;
                    tLRPC$Chat.version = i;
                    j = this.database.executeFast("UPDATE chats SET data = ? WHERE uid = ?");
                    try {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Chat.getObjectSize());
                        tLRPC$Chat.serializeToStream(nativeByteBuffer);
                        j.bindByteBuffer(1, nativeByteBuffer);
                        j.bindLong(2, tLRPC$Chat.id);
                        j.step();
                        nativeByteBuffer.reuse();
                        j.dispose();
                    } catch (Exception e2) {
                        e = e2;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        if (j != 0) {
                            j.dispose();
                        }
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteCursor = queryFinalized;
            j = 0;
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = queryFinalized;
            j = 0;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            if (j != 0) {
                j.dispose();
            }
            throw th;
        }
    }

    private void putChatsInternal(List<TLRPC$Chat> list) throws Exception {
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chats VALUES(?, ?, ?)");
        for (int i = 0; i < list.size(); i++) {
            TLRPC$Chat tLRPC$Chat = list.get(i);
            if (tLRPC$Chat.min) {
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM chats WHERE uid = %d", Long.valueOf(tLRPC$Chat.id)), new Object[0]);
                if (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC$Chat TLdeserialize = TLRPC$Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                TLdeserialize.title = tLRPC$Chat.title;
                                TLdeserialize.photo = tLRPC$Chat.photo;
                                TLdeserialize.broadcast = tLRPC$Chat.broadcast;
                                TLdeserialize.verified = tLRPC$Chat.verified;
                                TLdeserialize.megagroup = tLRPC$Chat.megagroup;
                                TLdeserialize.call_not_empty = tLRPC$Chat.call_not_empty;
                                TLdeserialize.call_active = tLRPC$Chat.call_active;
                                TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = tLRPC$Chat.default_banned_rights;
                                if (tLRPC$TL_chatBannedRights != null) {
                                    TLdeserialize.default_banned_rights = tLRPC$TL_chatBannedRights;
                                    TLdeserialize.flags |= 262144;
                                }
                                TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = tLRPC$Chat.admin_rights;
                                if (tLRPC$TL_chatAdminRights != null) {
                                    TLdeserialize.admin_rights = tLRPC$TL_chatAdminRights;
                                    TLdeserialize.flags |= LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM;
                                }
                                TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2 = tLRPC$Chat.banned_rights;
                                if (tLRPC$TL_chatBannedRights2 != null) {
                                    TLdeserialize.banned_rights = tLRPC$TL_chatBannedRights2;
                                    TLdeserialize.flags |= LiteMode.FLAG_CHAT_SCALE;
                                }
                                String str = tLRPC$Chat.username;
                                if (str != null) {
                                    TLdeserialize.username = str;
                                    TLdeserialize.flags |= 64;
                                } else {
                                    TLdeserialize.username = null;
                                    TLdeserialize.flags &= -65;
                                }
                                int i2 = tLRPC$Chat.participants_count;
                                if (i2 > 0) {
                                    TLdeserialize.participants_count = i2;
                                }
                                tLRPC$Chat = TLdeserialize;
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                queryFinalized.dispose();
            }
            executeFast.requery();
            tLRPC$Chat.flags |= 131072;
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Chat.getObjectSize());
            tLRPC$Chat.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, tLRPC$Chat.id);
            String str2 = tLRPC$Chat.title;
            if (str2 != null) {
                executeFast.bindString(2, str2.toLowerCase());
            } else {
                executeFast.bindString(2, "");
            }
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            this.dialogIsForum.put(-tLRPC$Chat.id, tLRPC$Chat.forum ? 1 : 0);
        }
        executeFast.dispose();
    }

    public void getUsersInternal(String str, ArrayList<TLRPC$User> arrayList) throws Exception {
        if (str == null || str.length() == 0 || arrayList == null) {
            return;
        }
        SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data, status FROM users WHERE uid IN(%s)", str), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        TLRPC$UserStatus tLRPC$UserStatus = TLdeserialize.status;
                        if (tLRPC$UserStatus != null) {
                            tLRPC$UserStatus.expires = queryFinalized.intValue(1);
                        }
                        arrayList.add(TLdeserialize);
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
        }
        queryFinalized.dispose();
    }

    public void getChatsInternal(String str, ArrayList<TLRPC$Chat> arrayList) throws Exception {
        getChatsInternal(str, arrayList, true);
    }

    public void getChatsInternal(String str, ArrayList<TLRPC$Chat> arrayList, boolean z) throws Exception {
        if (str == null || str.length() == 0 || arrayList == null) {
            return;
        }
        SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM chats WHERE uid IN(%s)", str), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$Chat TLdeserialize = TLRPC$Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false, z);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        arrayList.add(TLdeserialize);
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
        }
        queryFinalized.dispose();
    }

    public void getEncryptedChatsInternal(String str, ArrayList<TLRPC$EncryptedChat> arrayList, ArrayList<Long> arrayList2) throws Exception {
        if (str == null || str.length() == 0 || arrayList == null) {
            return;
        }
        SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data, user, g, authkey, ttl, layer, seq_in, seq_out, use_count, exchange_id, key_date, fprint, fauthkey, khash, in_seq_no, admin_id, mtproto_seq FROM enc_chats WHERE uid IN(%s)", str), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$EncryptedChat TLdeserialize = TLRPC$EncryptedChat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        long longValue = queryFinalized.longValue(1);
                        TLdeserialize.user_id = longValue;
                        if (arrayList2 != null && !arrayList2.contains(Long.valueOf(longValue))) {
                            arrayList2.add(Long.valueOf(TLdeserialize.user_id));
                        }
                        TLdeserialize.a_or_b = queryFinalized.byteArrayValue(2);
                        TLdeserialize.auth_key = queryFinalized.byteArrayValue(3);
                        TLdeserialize.ttl = queryFinalized.intValue(4);
                        TLdeserialize.layer = queryFinalized.intValue(5);
                        TLdeserialize.seq_in = queryFinalized.intValue(6);
                        TLdeserialize.seq_out = queryFinalized.intValue(7);
                        int intValue = queryFinalized.intValue(8);
                        TLdeserialize.key_use_count_in = (short) (intValue >> 16);
                        TLdeserialize.key_use_count_out = (short) intValue;
                        TLdeserialize.exchange_id = queryFinalized.longValue(9);
                        TLdeserialize.key_create_date = queryFinalized.intValue(10);
                        TLdeserialize.future_key_fingerprint = queryFinalized.longValue(11);
                        TLdeserialize.future_auth_key = queryFinalized.byteArrayValue(12);
                        TLdeserialize.key_hash = queryFinalized.byteArrayValue(13);
                        TLdeserialize.in_seq_no = queryFinalized.intValue(14);
                        long longValue2 = queryFinalized.longValue(15);
                        if (longValue2 != 0) {
                            TLdeserialize.admin_id = longValue2;
                        }
                        TLdeserialize.mtproto_seq = queryFinalized.intValue(16);
                        arrayList.add(TLdeserialize);
                    }
                }
            } catch (Exception e) {
                checkSQLException(e);
            }
        }
        queryFinalized.dispose();
    }

    public void lambda$putUsersAndChats$159(List<TLRPC$User> list, List<TLRPC$Chat> list2, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        try {
            if (z) {
                try {
                    this.database.beginTransaction();
                } catch (Exception e) {
                    checkSQLException(e);
                    sQLiteDatabase = this.database;
                    if (sQLiteDatabase == null) {
                        return;
                    }
                }
            }
            putUsersInternal(list);
            putChatsInternal(list2);
            sQLiteDatabase = this.database;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.commitTransaction();
        } catch (Throwable th) {
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            throw th;
        }
    }

    public void putUsersAndChats(final List<TLRPC$User> list, final List<TLRPC$Chat> list2, final boolean z, boolean z2) {
        if (list == null || !list.isEmpty() || list2 == null || !list2.isEmpty()) {
            if (z2) {
                this.storageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$putUsersAndChats$159(list, list2, z);
                    }
                });
            } else {
                lambda$putUsersAndChats$159(list, list2, z);
            }
        }
    }

    public void removeFromDownloadQueue(final long j, final int i, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$removeFromDownloadQueue$160(z, i, j);
            }
        });
    }

    public void lambda$removeFromDownloadQueue$160(boolean z, int i, long j) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                if (z) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT min(date) FROM download_queue WHERE type = %d", Integer.valueOf(i)), new Object[0]);
                    try {
                        int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : -1;
                        queryFinalized.dispose();
                        if (intValue != -1) {
                            this.database.executeFast(String.format(locale, "UPDATE download_queue SET date = %d WHERE uid = %d AND type = %d", Integer.valueOf(intValue - 1), Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = queryFinalized;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.database.executeFast(String.format(Locale.US, "DELETE FROM download_queue WHERE uid = %d AND type = %d", Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private void deleteFromDownloadQueue(final java.util.ArrayList<android.util.Pair<java.lang.Long, java.lang.Integer>> r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.deleteFromDownloadQueue(java.util.ArrayList, boolean):void");
    }

    public void lambda$deleteFromDownloadQueue$161(ArrayList arrayList) {
        getDownloadController().cancelDownloading(arrayList);
    }

    public void clearDownloadQueue(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearDownloadQueue$162(i);
            }
        });
    }

    public void lambda$clearDownloadQueue$162(int i) {
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
            public final void run() {
                MessagesStorage.this.lambda$getDownloadQueue$164(i);
            }
        });
    }

    public void lambda$getDownloadQueue$164(final int i) {
        int i2;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                final ArrayList arrayList = new ArrayList();
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT uid, type, data, parent FROM download_queue WHERE type = %d ORDER BY date DESC LIMIT 3", Integer.valueOf(i)), new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        DownloadObject downloadObject = new DownloadObject();
                        downloadObject.type = queryFinalized.intValue(1);
                        downloadObject.id = queryFinalized.longValue(0);
                        downloadObject.parent = queryFinalized.stringValue(3);
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(2);
                        if (byteBufferValue != null) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            TLRPC$Document tLRPC$Document = TLdeserialize.document;
                            if (tLRPC$Document != null) {
                                downloadObject.object = tLRPC$Document;
                                downloadObject.secret = MessageObject.isVideoDocument(tLRPC$Document) && (((i2 = TLdeserialize.ttl_seconds) > 0 && i2 <= 60) || i2 == Integer.MAX_VALUE);
                            } else {
                                TLRPC$Photo tLRPC$Photo = TLdeserialize.photo;
                                if (tLRPC$Photo != null) {
                                    downloadObject.object = tLRPC$Photo;
                                    int i3 = TLdeserialize.ttl_seconds;
                                    downloadObject.secret = (i3 > 0 && i3 <= 60) || i3 == Integer.MAX_VALUE;
                                }
                            }
                            downloadObject.forceCache = (TLdeserialize.flags & Integer.MIN_VALUE) != 0;
                        }
                        arrayList.add(downloadObject);
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = queryFinalized;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                }
                queryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$getDownloadQueue$163(i, arrayList);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void lambda$getDownloadQueue$163(int i, ArrayList arrayList) {
        getDownloadController().processDownloadObjects(i, arrayList);
    }

    private int getMessageMediaType(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message instanceof TLRPC$TL_message_secret) {
            if ((tLRPC$Message.media instanceof TLRPC$TL_messageMediaPhoto) || MessageObject.isGifMessage(tLRPC$Message) || MessageObject.isVoiceMessage(tLRPC$Message) || MessageObject.isVideoMessage(tLRPC$Message) || MessageObject.isRoundVideoMessage(tLRPC$Message)) {
                int i = tLRPC$Message.ttl;
                return (i <= 0 || i > 60) ? 0 : 1;
            }
            return -1;
        }
        if (tLRPC$Message instanceof TLRPC$TL_message) {
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
            if (((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) || (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument)) && tLRPC$MessageMedia.ttl_seconds != 0) {
                return 1;
            }
        }
        return ((tLRPC$Message.media instanceof TLRPC$TL_messageMediaPhoto) || MessageObject.isVideoMessage(tLRPC$Message)) ? 0 : -1;
    }

    public void putWebPages(final LongSparseArray<TLRPC$WebPage> longSparseArray) {
        if (isEmpty(longSparseArray)) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putWebPages$166(longSparseArray);
            }
        });
    }

    public void lambda$putWebPages$166(androidx.collection.LongSparseArray r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putWebPages$166(androidx.collection.LongSparseArray):void");
    }

    public void lambda$putWebPages$165(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReceivedWebpages, arrayList);
    }

    public void overwriteChannel(final long j, final TLRPC$TL_updates_channelDifferenceTooLong tLRPC$TL_updates_channelDifferenceTooLong, final int i, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$overwriteChannel$168(j, i, tLRPC$TL_updates_channelDifferenceTooLong, runnable);
            }
        });
    }

    public void lambda$overwriteChannel$168(long r20, int r22, final org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceTooLong r23, java.lang.Runnable r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$overwriteChannel$168(long, int, org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceTooLong, java.lang.Runnable):void");
    }

    public void lambda$overwriteChannel$167(long j, TLRPC$TL_updates_channelDifferenceTooLong tLRPC$TL_updates_channelDifferenceTooLong) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.removeAllMessagesFromDialog, Long.valueOf(j), Boolean.TRUE, tLRPC$TL_updates_channelDifferenceTooLong);
    }

    public void putChannelViews(final LongSparseArray<SparseIntArray> longSparseArray, final LongSparseArray<SparseIntArray> longSparseArray2, final LongSparseArray<SparseArray<TLRPC$MessageReplies>> longSparseArray3, final boolean z) {
        if (isEmpty(longSparseArray) && isEmpty(longSparseArray2) && isEmpty(longSparseArray3)) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putChannelViews$169(longSparseArray, longSparseArray2, longSparseArray3, z);
            }
        });
    }

    public void lambda$putChannelViews$169(androidx.collection.LongSparseArray r23, androidx.collection.LongSparseArray r24, androidx.collection.LongSparseArray r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putChannelViews$169(androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean):void");
    }

    public void lambda$updateRepliesMaxReadId$171(final long r21, final int r23, final int r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateRepliesMaxReadId$171(long, int, int, int):void");
    }

    public void lambda$updateRepliesMaxReadIdInternal$170(long j, int i, int i2, int i3, int i4) {
        getMessagesController().getTopicsController().updateMaxReadId(j, i, i2, i3, i4);
    }

    private void resetForumBadgeIfNeed(long j) {
        LongSparseIntArray longSparseIntArray;
        SQLiteCursor sQLiteCursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.ENGLISH;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT topic_id FROM topics WHERE did = %d AND unread_count > 0", Long.valueOf(j)), new Object[0]);
            try {
                if (queryFinalized.next()) {
                    longSparseIntArray = null;
                } else {
                    longSparseIntArray = new LongSparseIntArray();
                    longSparseIntArray.put(j, 0);
                }
                queryFinalized.dispose();
                if (longSparseIntArray != null) {
                    this.database.executeFast(String.format(locale, "UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = %d", Long.valueOf(j))).stepThis().dispose();
                }
                updateFiltersReadCounter(longSparseIntArray, null, true);
                getMessagesController().processDialogsUpdateRead(longSparseIntArray, null);
            } catch (Throwable th) {
                th = th;
                sQLiteCursor = queryFinalized;
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

    public void updateRepliesMaxReadId(final long j, final int i, final int i2, final int i3, boolean z) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateRepliesMaxReadId$171(j, i, i2, i3);
                }
            });
        } else {
            lambda$updateRepliesMaxReadId$171(j, i, i2, i3);
        }
    }

    public void updateRepliesCount(final long j, final int i, final ArrayList<TLRPC$Peer> arrayList, final int i2, final int i3) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateRepliesCount$172(i, j, i3, arrayList, i2);
            }
        });
    }

    public void lambda$updateRepliesCount$172(int r16, long r17, int r19, java.util.ArrayList r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateRepliesCount$172(int, long, int, java.util.ArrayList, int):void");
    }

    private boolean isValidKeyboardToSave(TLRPC$Message tLRPC$Message) {
        TLRPC$ReplyMarkup tLRPC$ReplyMarkup = tLRPC$Message.reply_markup;
        return (tLRPC$ReplyMarkup == null || (tLRPC$ReplyMarkup instanceof TLRPC$TL_replyInlineMarkup) || (tLRPC$ReplyMarkup.selective && !tLRPC$Message.mentioned)) ? false : true;
    }

    public void updateMessageVerifyFlags(final ArrayList<TLRPC$Message> arrayList) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageVerifyFlags$173(arrayList);
            }
        });
    }

    public void lambda$updateMessageVerifyFlags$173(ArrayList arrayList) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        boolean z = false;
        try {
            try {
                this.database.beginTransaction();
                try {
                    executeFast = this.database.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                } catch (Exception e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC$Message tLRPC$Message = (TLRPC$Message) arrayList.get(i);
                executeFast.requery();
                int i2 = tLRPC$Message.stickerVerified;
                executeFast.bindInteger(1, i2 == 0 ? 1 : i2 == 2 ? 2 : 0);
                executeFast.bindInteger(2, tLRPC$Message.id);
                executeFast.bindLong(3, MessageObject.getDialogId(tLRPC$Message));
                executeFast.step();
            }
            executeFast.dispose();
            this.database.commitTransaction();
        } catch (Exception e3) {
            e = e3;
            sQLitePreparedStatement = executeFast;
            z = true;
            checkSQLException(e);
            if (z && (sQLiteDatabase2 = this.database) != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = executeFast;
            z = true;
            if (z && (sQLiteDatabase = this.database) != null) {
                sQLiteDatabase.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$putMessages$177(java.util.ArrayList<org.telegram.tgnet.TLRPC$Message> r52, boolean r53, boolean r54, int r55, boolean r56, boolean r57, int r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putMessages$177(java.util.ArrayList, boolean, boolean, int, boolean, boolean, int):void");
    }

    public void lambda$putMessagesInternal$174(int i) {
        getDownloadController().newDownloadObjectsAvailable(i);
    }

    private void createOrEditTopic(final long j, TLRPC$Message tLRPC$Message) {
        final TLRPC$TL_forumTopic tLRPC$TL_forumTopic = new TLRPC$TL_forumTopic();
        tLRPC$TL_forumTopic.topicStartMessage = tLRPC$Message;
        tLRPC$TL_forumTopic.top_message = tLRPC$Message.id;
        tLRPC$TL_forumTopic.topMessage = tLRPC$Message;
        tLRPC$TL_forumTopic.from_id = getMessagesController().getPeer(getUserConfig().clientUserId);
        tLRPC$TL_forumTopic.notify_settings = new TLRPC$TL_peerNotifySettings();
        tLRPC$TL_forumTopic.unread_count = 0;
        TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
        if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionTopicCreate) {
            TLRPC$TL_messageActionTopicCreate tLRPC$TL_messageActionTopicCreate = (TLRPC$TL_messageActionTopicCreate) tLRPC$MessageAction;
            tLRPC$TL_forumTopic.id = tLRPC$Message.id;
            long j2 = tLRPC$TL_messageActionTopicCreate.icon_emoji_id;
            tLRPC$TL_forumTopic.icon_emoji_id = j2;
            tLRPC$TL_forumTopic.title = tLRPC$TL_messageActionTopicCreate.title;
            tLRPC$TL_forumTopic.icon_color = tLRPC$TL_messageActionTopicCreate.icon_color;
            if (j2 != 0) {
                tLRPC$TL_forumTopic.flags |= 1;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(tLRPC$TL_forumTopic);
            saveTopics(j, arrayList, false, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$createOrEditTopic$175(j, tLRPC$TL_forumTopic);
                }
            });
        } else if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionTopicEdit) {
            TLRPC$TL_messageActionTopicEdit tLRPC$TL_messageActionTopicEdit = (TLRPC$TL_messageActionTopicEdit) tLRPC$MessageAction;
            tLRPC$TL_forumTopic.id = MessageObject.getTopicId(tLRPC$Message, true);
            tLRPC$TL_forumTopic.icon_emoji_id = tLRPC$TL_messageActionTopicEdit.icon_emoji_id;
            tLRPC$TL_forumTopic.title = tLRPC$TL_messageActionTopicEdit.title;
            tLRPC$TL_forumTopic.closed = tLRPC$TL_messageActionTopicEdit.closed;
            tLRPC$TL_forumTopic.hidden = tLRPC$TL_messageActionTopicEdit.hidden;
            int i = tLRPC$TL_messageActionTopicEdit.flags;
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
            final int i3 = i2;
            updateTopicData(j, tLRPC$TL_forumTopic, i3);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$createOrEditTopic$176(j, tLRPC$TL_forumTopic, i3);
                }
            });
        }
    }

    public void lambda$createOrEditTopic$175(long j, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
        getMessagesController().getTopicsController().onTopicCreated(j, tLRPC$TL_forumTopic, false);
    }

    public void lambda$createOrEditTopic$176(long j, TLRPC$TL_forumTopic tLRPC$TL_forumTopic, int i) {
        getMessagesController().getTopicsController().updateTopicInUi(j, tLRPC$TL_forumTopic, i);
    }

    public void putMessages(ArrayList<TLRPC$Message> arrayList, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2) {
        putMessages(arrayList, z, z2, z3, i, false, z4, i2);
    }

    public void putMessages(final ArrayList<TLRPC$Message> arrayList, final boolean z, boolean z2, final boolean z3, final int i, final boolean z4, final boolean z5, final int i2) {
        if (arrayList.size() == 0) {
            return;
        }
        if (z2) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putMessages$177(arrayList, z, z3, i, z4, z5, i2);
                }
            });
        } else {
            lambda$putMessages$177(arrayList, z, z3, i, z4, z5, i2);
        }
    }

    public void markMessageAsSendError(final TLRPC$Message tLRPC$Message, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$markMessageAsSendError$178(tLRPC$Message, z);
            }
        });
    }

    public void lambda$markMessageAsSendError$178(TLRPC$Message tLRPC$Message, boolean z) {
        try {
            long j = tLRPC$Message.id;
            if (z) {
                this.database.executeFast(String.format(Locale.US, "UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j), Long.valueOf(MessageObject.getDialogId(tLRPC$Message)))).stepThis().dispose();
            } else {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast(String.format(locale, "UPDATE messages_v2 SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j), Long.valueOf(MessageObject.getDialogId(tLRPC$Message)))).stepThis().dispose();
                this.database.executeFast(String.format(locale, "UPDATE messages_topics SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j), Long.valueOf(MessageObject.getDialogId(tLRPC$Message)))).stepThis().dispose();
            }
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    public void setMessageSeq(final int i, final int i2, final int i3) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setMessageSeq$179(i, i2, i3);
            }
        });
    }

    public void lambda$setMessageSeq$179(int i, int i2, int i3) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindInteger(1, i);
                sQLitePreparedStatement.bindInteger(2, i2);
                sQLitePreparedStatement.bindInteger(3, i3);
                sQLitePreparedStatement.step();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public long[] lambda$updateMessageStateAndId$181(long r20, long r22, java.lang.Integer r24, int r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateMessageStateAndId$181(long, long, java.lang.Integer, int, int, int):long[]");
    }

    public void lambda$updateMessageStateAndIdInternal$180(TLRPC$TL_updates tLRPC$TL_updates) {
        getMessagesController().processUpdates(tLRPC$TL_updates, false);
    }

    public long[] updateMessageStateAndId(final long j, final long j2, final Integer num, final int i, final int i2, boolean z, final int i3) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateMessageStateAndId$181(j, j2, num, i, i2, i3);
                }
            });
            return null;
        }
        return lambda$updateMessageStateAndId$181(j, j2, num, i, i2, i3);
    }

    public void lambda$updateUsers$182(ArrayList<TLRPC$User> arrayList, boolean z, boolean z2) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (z) {
                    if (z2) {
                        this.database.beginTransaction();
                    }
                    SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE users SET status = ? WHERE uid = ?");
                    try {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            TLRPC$User tLRPC$User = arrayList.get(i);
                            executeFast.requery();
                            TLRPC$UserStatus tLRPC$UserStatus = tLRPC$User.status;
                            if (tLRPC$UserStatus != null) {
                                executeFast.bindInteger(1, tLRPC$UserStatus.expires);
                            } else {
                                executeFast.bindInteger(1, 0);
                            }
                            executeFast.bindLong(2, tLRPC$User.id);
                            executeFast.step();
                        }
                        executeFast.dispose();
                        if (z2) {
                            this.database.commitTransaction();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
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
                        sQLitePreparedStatement = executeFast;
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
                    StringBuilder sb = new StringBuilder();
                    LongSparseArray longSparseArray = new LongSparseArray();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        TLRPC$User tLRPC$User2 = arrayList.get(i2);
                        if (sb.length() != 0) {
                            sb.append(",");
                        }
                        sb.append(tLRPC$User2.id);
                        longSparseArray.put(tLRPC$User2.id, tLRPC$User2);
                    }
                    ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
                    getUsersInternal(sb.toString(), arrayList2);
                    int size3 = arrayList2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        TLRPC$User tLRPC$User3 = arrayList2.get(i3);
                        TLRPC$User tLRPC$User4 = (TLRPC$User) longSparseArray.get(tLRPC$User3.id);
                        if (tLRPC$User4 != null) {
                            if (tLRPC$User4.first_name != null && tLRPC$User4.last_name != null) {
                                if (!UserObject.isContact(tLRPC$User3)) {
                                    tLRPC$User3.first_name = tLRPC$User4.first_name;
                                    tLRPC$User3.last_name = tLRPC$User4.last_name;
                                }
                                tLRPC$User3.username = tLRPC$User4.username;
                            } else {
                                TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$User4.photo;
                                if (tLRPC$UserProfilePhoto != null) {
                                    tLRPC$User3.photo = tLRPC$UserProfilePhoto;
                                } else {
                                    String str = tLRPC$User4.phone;
                                    if (str != null) {
                                        tLRPC$User3.phone = str;
                                    }
                                }
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        if (z2) {
                            this.database.beginTransaction();
                        }
                        putUsersInternal(arrayList2);
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

    public void updateUsers(final ArrayList<TLRPC$User> arrayList, final boolean z, final boolean z2, boolean z3) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z3) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateUsers$182(arrayList, z, z2);
                }
            });
        } else {
            lambda$updateUsers$182(arrayList, z, z2);
        }
    }

    public void lambda$markMessagesAsRead$184(org.telegram.messenger.support.LongSparseIntArray r18, org.telegram.messenger.support.LongSparseIntArray r19, android.util.SparseIntArray r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsRead$184(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, android.util.SparseIntArray):void");
    }

    private void markMessagesContentAsReadInternal(long j, ArrayList<Integer> arrayList, int i) {
        SQLiteCursor sQLiteCursor = null;
        ArrayList<Integer> arrayList2 = null;
        sQLiteCursor = null;
        try {
            try {
                String join = TextUtils.join(",", arrayList);
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast(String.format(locale, "UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid IN (%s) AND uid = %d", join, Long.valueOf(j))).stepThis().dispose();
                if (i != 0) {
                    SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(locale, "SELECT mid, ttl FROM messages_v2 WHERE mid IN (%s) AND uid = %d AND ttl > 0", join, Long.valueOf(j)), new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList<>();
                            }
                            arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = queryFinalized;
                            checkSQLException(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    if (arrayList2 != null) {
                        emptyMessagesMedia(j, arrayList2);
                    }
                    queryFinalized.dispose();
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
            public final void run() {
                MessagesStorage.this.lambda$markMessagesContentAsRead$183(j, arrayList, i2, i);
            }
        });
    }

    public void lambda$markMessagesContentAsRead$183(long r9, java.util.ArrayList r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesContentAsRead$183(long, java.util.ArrayList, int, int):void");
    }

    public void markMessagesAsRead(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final SparseIntArray sparseIntArray, boolean z) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$markMessagesAsRead$184(longSparseIntArray, longSparseIntArray2, sparseIntArray);
                }
            });
        } else {
            lambda$markMessagesAsRead$184(longSparseIntArray, longSparseIntArray2, sparseIntArray);
        }
    }

    public void markMessagesAsDeletedByRandoms(final ArrayList<Long> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$markMessagesAsDeletedByRandoms$186(arrayList);
            }
        });
    }

    public void lambda$markMessagesAsDeletedByRandoms$186(ArrayList arrayList) {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT mid, uid FROM randoms_v2 WHERE random_id IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            LongSparseArray longSparseArray = new LongSparseArray();
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(1);
                ArrayList arrayList2 = (ArrayList) longSparseArray.get(longValue);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    longSparseArray.put(longValue, arrayList2);
                }
                arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
            }
            queryFinalized.dispose();
            if (longSparseArray.isEmpty()) {
                return;
            }
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long keyAt = longSparseArray.keyAt(i);
                final ArrayList<Integer> arrayList3 = (ArrayList) longSparseArray.valueAt(i);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$markMessagesAsDeletedByRandoms$185(arrayList3);
                    }
                });
                updateDialogsWithReadMessagesInternal(arrayList3, null, null, null, null);
                lambda$markMessagesAsDeleted$190(keyAt, arrayList3, true, false);
                lambda$updateDialogsWithDeletedMessages$189(keyAt, 0L, arrayList3, null);
            }
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$markMessagesAsDeletedByRandoms$185(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
    }

    public void deletePushMessages(long j, ArrayList<Integer> arrayList) {
        try {
            this.database.executeFast(String.format(Locale.US, "DELETE FROM unread_push_messages WHERE uid = %d AND mid IN(%s)", Long.valueOf(j), TextUtils.join(",", arrayList))).stepThis().dispose();
        } catch (Exception e) {
            checkSQLException(e);
        }
    }

    private void broadcastScheduledMessagesChange(final Long l) {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM scheduled_messages_v2 WHERE uid = %d", l), new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            final int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$broadcastScheduledMessagesChange$187(l, intValue);
                }
            });
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$broadcastScheduledMessagesChange$187(Long l, int i) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.scheduledMessagesUpdated, l, Integer.valueOf(i), Boolean.TRUE);
    }

    public java.util.ArrayList<java.lang.Long> lambda$markMessagesAsDeleted$190(long r39, java.util.ArrayList<java.lang.Integer> r41, boolean r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsDeleted$190(long, java.util.ArrayList, boolean, boolean):java.util.ArrayList");
    }

    public void lambda$markMessagesAsDeletedInternal$188(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$updateDialogsWithDeletedMessages$189(long r24, long r26, java.util.ArrayList<java.lang.Integer> r28, java.util.ArrayList<java.lang.Long> r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateDialogsWithDeletedMessages$189(long, long, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void updateDialogsWithDeletedMessages(final long j, final long j2, final ArrayList<Integer> arrayList, final ArrayList<Long> arrayList2, boolean z) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateDialogsWithDeletedMessages$189(j, j2, arrayList, arrayList2);
                }
            });
        } else {
            lambda$updateDialogsWithDeletedMessages$189(j, j2, arrayList, arrayList2);
        }
    }

    public ArrayList<Long> markMessagesAsDeleted(final long j, final ArrayList<Integer> arrayList, boolean z, final boolean z2, final boolean z3) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$markMessagesAsDeleted$190(j, arrayList, z2, z3);
                }
            });
            return null;
        }
        return lambda$markMessagesAsDeleted$190(j, arrayList, z2, z3);
    }

    public java.util.ArrayList<java.lang.Long> lambda$markMessagesAsDeleted$192(long r24, int r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsDeleted$192(long, int, boolean):java.util.ArrayList");
    }

    public void lambda$markMessagesAsDeletedInternal$191(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public ArrayList<Long> markMessagesAsDeleted(final long j, final int i, boolean z, final boolean z2) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$markMessagesAsDeleted$192(j, i, z2);
                }
            });
            return null;
        }
        return lambda$markMessagesAsDeleted$192(j, i, z2);
    }

    private void fixUnsupportedMedia(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message == null) {
            return;
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaUnsupported_old) {
            if (tLRPC$MessageMedia.bytes.length == 0) {
                tLRPC$MessageMedia.bytes = Utilities.intToBytes(166);
            }
        } else if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaUnsupported) {
            TLRPC$TL_messageMediaUnsupported_old tLRPC$TL_messageMediaUnsupported_old = new TLRPC$TL_messageMediaUnsupported_old();
            tLRPC$Message.media = tLRPC$TL_messageMediaUnsupported_old;
            tLRPC$TL_messageMediaUnsupported_old.bytes = Utilities.intToBytes(166);
            tLRPC$Message.flags |= LiteMode.FLAG_CALLS_ANIMATIONS;
        }
    }

    private void doneHolesInTable(String str, long j, int i, int i2) throws Exception {
        SQLitePreparedStatement executeFast;
        int i3 = 2;
        if (i2 != 0) {
            if (i == 0) {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d", Long.valueOf(j), Integer.valueOf(i2))).stepThis().dispose();
            } else {
                SQLiteDatabase sQLiteDatabase2 = this.database;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast(String.format(locale2, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = 0", Long.valueOf(j), Integer.valueOf(i2))).stepThis().dispose();
            }
        } else if (i == 0) {
            SQLiteDatabase sQLiteDatabase3 = this.database;
            Locale locale3 = Locale.US;
            sQLiteDatabase3.executeFast(String.format(locale3, "DELETE FROM " + str + " WHERE uid = %d", Long.valueOf(j))).stepThis().dispose();
        } else {
            SQLiteDatabase sQLiteDatabase4 = this.database;
            Locale locale4 = Locale.US;
            sQLiteDatabase4.executeFast(String.format(locale4, "DELETE FROM " + str + " WHERE uid = %d AND start = 0", Long.valueOf(j))).stepThis().dispose();
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (i2 != 0) {
                    SQLiteDatabase sQLiteDatabase5 = this.database;
                    executeFast = sQLiteDatabase5.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                } else {
                    SQLiteDatabase sQLiteDatabase6 = this.database;
                    executeFast = sQLiteDatabase6.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                }
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j);
                if (i2 != 0) {
                    sQLitePreparedStatement.bindInteger(2, i2);
                    i3 = 3;
                }
                sQLitePreparedStatement.bindInteger(i3, 1);
                sQLitePreparedStatement.bindInteger(i3 + 1, 1);
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

    public void doneHolesInMedia(long j, int i, int i2, int i3) throws Exception {
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement executeFast2;
        int i4;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i5 = 3;
        if (i2 == -1) {
            if (i3 != 0) {
                if (i == 0) {
                    this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_topics WHERE uid = %d AND topic_id = %d", Long.valueOf(j), Integer.valueOf(i3))).stepThis().dispose();
                } else {
                    this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND start = 0", Long.valueOf(j), Integer.valueOf(i3))).stepThis().dispose();
                }
            } else if (i == 0) {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d", Long.valueOf(j))).stepThis().dispose();
            } else {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND start = 0", Long.valueOf(j))).stepThis().dispose();
            }
            try {
                try {
                    if (i3 != 0) {
                        executeFast2 = this.database.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                    } else {
                        executeFast2 = this.database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                    }
                    sQLitePreparedStatement = executeFast2;
                    for (int i6 = 0; i6 < 8; i6++) {
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, j);
                        if (i3 != 0) {
                            sQLitePreparedStatement.bindInteger(2, i3);
                            i4 = 3;
                        } else {
                            i4 = 2;
                        }
                        int i7 = i4 + 1;
                        sQLitePreparedStatement.bindInteger(i4, i6);
                        sQLitePreparedStatement.bindInteger(i7, 1);
                        sQLitePreparedStatement.bindInteger(i7 + 1, 1);
                        sQLitePreparedStatement.step();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw e;
                }
            } finally {
            }
        }
        if (i3 != 0) {
            if (i == 0) {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d", Long.valueOf(j), Integer.valueOf(i3), Integer.valueOf(i2))).stepThis().dispose();
            } else {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d AND start = 0", Long.valueOf(j), Integer.valueOf(i3), Integer.valueOf(i2))).stepThis().dispose();
            }
        } else if (i == 0) {
            this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d", Long.valueOf(j), Integer.valueOf(i2))).stepThis().dispose();
        } else {
            this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d AND start = 0", Long.valueOf(j), Integer.valueOf(i2))).stepThis().dispose();
        }
        try {
            try {
                if (i3 != 0) {
                    executeFast = this.database.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                } else {
                    executeFast = this.database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                }
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j);
                if (i3 != 0) {
                    sQLitePreparedStatement.bindInteger(2, i3);
                } else {
                    i5 = 2;
                }
                int i8 = i5 + 1;
                sQLitePreparedStatement.bindInteger(i5, i2);
                sQLitePreparedStatement.bindInteger(i8, 1);
                sQLitePreparedStatement.bindInteger(i8 + 1, 1);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
                sQLitePreparedStatement.dispose();
            } finally {
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static class Hole {
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

    public void closeHolesInMedia(long r25, int r27, int r28, int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.closeHolesInMedia(long, int, int, int, int):void");
    }

    private void closeHolesInTable(java.lang.String r25, long r26, int r28, int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.closeHolesInTable(java.lang.String, long, int, int, int):void");
    }

    public void replaceMessageIfExists(final TLRPC$Message tLRPC$Message, final ArrayList<TLRPC$User> arrayList, final ArrayList<TLRPC$Chat> arrayList2, final boolean z) {
        if (tLRPC$Message == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$replaceMessageIfExists$194(tLRPC$Message, z, arrayList, arrayList2);
            }
        });
    }

    public void lambda$replaceMessageIfExists$194(org.telegram.tgnet.TLRPC$Message r20, boolean r21, java.util.ArrayList r22, java.util.ArrayList r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$replaceMessageIfExists$194(org.telegram.tgnet.TLRPC$Message, boolean, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void lambda$replaceMessageIfExists$193(MessageObject messageObject, ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(messageObject.getDialogId()), arrayList);
    }

    public void putMessages(final TLRPC$messages_Messages tLRPC$messages_Messages, final long j, final int i, final int i2, final boolean z, final boolean z2, final int i3) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putMessages$196(z2, j, tLRPC$messages_Messages, i3, i, i2, z);
            }
        });
    }

    public void lambda$putMessages$196(boolean r45, long r46, org.telegram.tgnet.TLRPC$messages_Messages r48, int r49, int r50, int r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putMessages$196(boolean, long, org.telegram.tgnet.TLRPC$messages_Messages, int, int, int, boolean):void");
    }

    public void lambda$putMessages$195(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public static void addUsersAndChatsFromMessage(TLRPC$Message tLRPC$Message, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, ArrayList<Long> arrayList3) {
        String str;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader;
        TLRPC$Peer tLRPC$Peer;
        TLRPC$Peer tLRPC$Peer2;
        long fromChatId = MessageObject.getFromChatId(tLRPC$Message);
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
        long j2 = tLRPC$Message.via_bot_id;
        if (j2 != 0 && !arrayList.contains(Long.valueOf(j2))) {
            arrayList.add(Long.valueOf(tLRPC$Message.via_bot_id));
        }
        TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
        if (tLRPC$MessageAction != null) {
            long j3 = tLRPC$MessageAction.user_id;
            if (j3 != 0 && !arrayList.contains(Long.valueOf(j3))) {
                arrayList.add(Long.valueOf(tLRPC$Message.action.user_id));
            }
            long j4 = tLRPC$Message.action.channel_id;
            if (j4 != 0 && !arrayList2.contains(Long.valueOf(j4))) {
                arrayList2.add(Long.valueOf(tLRPC$Message.action.channel_id));
            }
            long j5 = tLRPC$Message.action.chat_id;
            if (j5 != 0 && !arrayList2.contains(Long.valueOf(j5))) {
                arrayList2.add(Long.valueOf(tLRPC$Message.action.chat_id));
            }
            TLRPC$MessageAction tLRPC$MessageAction2 = tLRPC$Message.action;
            if (tLRPC$MessageAction2 instanceof TLRPC$TL_messageActionGeoProximityReached) {
                TLRPC$TL_messageActionGeoProximityReached tLRPC$TL_messageActionGeoProximityReached = (TLRPC$TL_messageActionGeoProximityReached) tLRPC$MessageAction2;
                addLoadPeerInfo(tLRPC$TL_messageActionGeoProximityReached.from_id, arrayList, arrayList2);
                addLoadPeerInfo(tLRPC$TL_messageActionGeoProximityReached.to_id, arrayList, arrayList2);
            }
            if (!tLRPC$Message.action.users.isEmpty()) {
                for (int i = 0; i < tLRPC$Message.action.users.size(); i++) {
                    Long l = tLRPC$Message.action.users.get(i);
                    if (!arrayList.contains(l)) {
                        arrayList.add(l);
                    }
                }
            }
        }
        if (!tLRPC$Message.entities.isEmpty()) {
            for (int i2 = 0; i2 < tLRPC$Message.entities.size(); i2++) {
                TLRPC$MessageEntity tLRPC$MessageEntity = tLRPC$Message.entities.get(i2);
                if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC$TL_messageEntityMentionName) tLRPC$MessageEntity).user_id));
                } else if (tLRPC$MessageEntity instanceof TLRPC$TL_inputMessageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC$TL_inputMessageEntityMentionName) tLRPC$MessageEntity).user_id.user_id));
                } else if (arrayList3 != null && (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityCustomEmoji)) {
                    arrayList3.add(Long.valueOf(((TLRPC$TL_messageEntityCustomEmoji) tLRPC$MessageEntity).document_id));
                }
            }
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
        if (tLRPC$MessageMedia != null) {
            long j6 = tLRPC$MessageMedia.user_id;
            if (j6 != 0 && !arrayList.contains(Long.valueOf(j6))) {
                arrayList.add(Long.valueOf(tLRPC$Message.media.user_id));
            }
            TLRPC$MessageMedia tLRPC$MessageMedia2 = tLRPC$Message.media;
            if (tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaPoll) {
                TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll = (TLRPC$TL_messageMediaPoll) tLRPC$MessageMedia2;
                if (!tLRPC$TL_messageMediaPoll.results.recent_voters.isEmpty()) {
                    for (int i3 = 0; i3 < tLRPC$TL_messageMediaPoll.results.recent_voters.size(); i3++) {
                        addLoadPeerInfo(tLRPC$TL_messageMediaPoll.results.recent_voters.get(i3), arrayList, arrayList2);
                    }
                }
            }
            TLRPC$Peer tLRPC$Peer3 = tLRPC$Message.media.peer;
            if (tLRPC$Peer3 != null) {
                addLoadPeerInfo(tLRPC$Peer3, arrayList, arrayList2);
            }
        }
        TLRPC$MessageReplies tLRPC$MessageReplies = tLRPC$Message.replies;
        if (tLRPC$MessageReplies != null) {
            int size = tLRPC$MessageReplies.recent_repliers.size();
            for (int i4 = 0; i4 < size; i4++) {
                addLoadPeerInfo(tLRPC$Message.replies.recent_repliers.get(i4), arrayList, arrayList2);
            }
        }
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = tLRPC$Message.reply_to;
        if (tLRPC$MessageReplyHeader != null && (tLRPC$Peer2 = tLRPC$MessageReplyHeader.reply_to_peer_id) != null) {
            addLoadPeerInfo(tLRPC$Peer2, arrayList, arrayList2);
        }
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader2 = tLRPC$Message.fwd_from;
        if (tLRPC$MessageFwdHeader2 != null) {
            addLoadPeerInfo(tLRPC$MessageFwdHeader2.from_id, arrayList, arrayList2);
            addLoadPeerInfo(tLRPC$Message.fwd_from.saved_from_peer, arrayList, arrayList2);
        }
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader2 = tLRPC$Message.reply_to;
        if (tLRPC$MessageReplyHeader2 != null && (tLRPC$MessageFwdHeader = tLRPC$MessageReplyHeader2.reply_from) != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.from_id) != null) {
            addLoadPeerInfo(tLRPC$Peer, arrayList, arrayList2);
        }
        HashMap<String, String> hashMap = tLRPC$Message.params;
        if (hashMap == null || (str = hashMap.get("fwd_peer")) == null) {
            return;
        }
        long longValue = Utilities.parseLong(str).longValue();
        if (longValue < 0) {
            long j7 = -longValue;
            if (arrayList2.contains(Long.valueOf(j7))) {
                return;
            }
            arrayList2.add(Long.valueOf(j7));
        }
    }

    private static void addLoadPeerInfo(TLRPC$Peer tLRPC$Peer, ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        if (tLRPC$Peer instanceof TLRPC$TL_peerUser) {
            if (arrayList.contains(Long.valueOf(tLRPC$Peer.user_id))) {
                return;
            }
            arrayList.add(Long.valueOf(tLRPC$Peer.user_id));
        } else if (tLRPC$Peer instanceof TLRPC$TL_peerChannel) {
            if (arrayList2.contains(Long.valueOf(tLRPC$Peer.channel_id))) {
                return;
            }
            arrayList2.add(Long.valueOf(tLRPC$Peer.channel_id));
        } else if (!(tLRPC$Peer instanceof TLRPC$TL_peerChat) || arrayList2.contains(Long.valueOf(tLRPC$Peer.chat_id))) {
        } else {
            arrayList2.add(Long.valueOf(tLRPC$Peer.chat_id));
        }
    }

    public void getDialogs(final int i, final int i2, final int i3, boolean z) {
        LongSparseArray<SparseArray<TLRPC$DraftMessage>> drafts;
        int size;
        long[] jArr = null;
        if (z && (size = (drafts = getMediaDataController().getDrafts()).size()) > 0) {
            jArr = new long[size];
            for (int i4 = 0; i4 < size; i4++) {
                if (drafts.valueAt(i4).get(0) != null) {
                    jArr[i4] = drafts.keyAt(i4);
                }
            }
        }
        final long[] jArr2 = jArr;
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getDialogs$198(i, i2, i3, jArr2);
            }
        });
    }

    public void lambda$getDialogs$198(int r34, int r35, int r36, long[] r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogs$198(int, int, int, long[]):void");
    }

    public void lambda$getDialogs$197(LongSparseArray longSparseArray) {
        MediaDataController mediaDataController = getMediaDataController();
        mediaDataController.clearDraftsFolderIds();
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                mediaDataController.setDraftFolderId(longSparseArray.keyAt(i), ((Integer) longSparseArray.valueAt(i)).intValue());
            }
        }
    }

    public static void createFirstHoles(long j, SQLitePreparedStatement sQLitePreparedStatement, SQLitePreparedStatement sQLitePreparedStatement2, int i, int i2) throws Exception {
        int i3;
        int i4;
        sQLitePreparedStatement.requery();
        sQLitePreparedStatement.bindLong(1, j);
        if (i2 != 0) {
            sQLitePreparedStatement.bindInteger(2, i2);
            i3 = 3;
        } else {
            i3 = 2;
        }
        int i5 = i3 + 1;
        sQLitePreparedStatement.bindInteger(i3, i == 1 ? 1 : 0);
        sQLitePreparedStatement.bindInteger(i5, i);
        sQLitePreparedStatement.step();
        for (int i6 = 0; i6 < 8; i6++) {
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(1, j);
            if (i2 != 0) {
                sQLitePreparedStatement2.bindInteger(2, i2);
                i4 = 3;
            } else {
                i4 = 2;
            }
            int i7 = i4 + 1;
            sQLitePreparedStatement2.bindInteger(i4, i6);
            int i8 = i7 + 1;
            sQLitePreparedStatement2.bindInteger(i7, i == 1 ? 1 : 0);
            sQLitePreparedStatement2.bindInteger(i8, i);
            sQLitePreparedStatement2.step();
        }
    }

    public void updateDialogData(final TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$Dialog == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateDialogData$199(tLRPC$Dialog);
            }
        });
    }

    public void lambda$updateDialogData$199(org.telegram.tgnet.TLRPC$Dialog r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateDialogData$199(org.telegram.tgnet.TLRPC$Dialog):void");
    }

    private void putDialogsInternal(org.telegram.tgnet.TLRPC$messages_Dialogs r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.putDialogsInternal(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public void getDialogFolderId(final long j, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getDialogFolderId$201(j, intCallback);
            }
        });
    }

    public void lambda$getDialogFolderId$201(long j, final IntCallback intCallback) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                if (this.unknownDialogsIds.get(j) == null) {
                    sQLiteCursor = this.database.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                    r2 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                    sQLiteCursor.dispose();
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.IntCallback.this.run(r2);
                    }
                });
                if (sQLiteCursor == null) {
                    return;
                }
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

    public void setDialogsFolderId(final ArrayList<TLRPC$TL_folderPeer> arrayList, final ArrayList<TLRPC$TL_inputFolderPeer> arrayList2, final long j, final int i) {
        if (arrayList == null && arrayList2 == null && j == 0) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setDialogsFolderId$202(arrayList, arrayList2, i, j);
            }
        });
    }

    public void lambda$setDialogsFolderId$202(ArrayList arrayList, ArrayList arrayList2, int i, long j) {
        SQLitePreparedStatement executeFast;
        boolean z;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                executeFast = this.database.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (arrayList != null) {
                int size = arrayList.size();
                z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC$TL_folderPeer tLRPC$TL_folderPeer = (TLRPC$TL_folderPeer) arrayList.get(i2);
                    long peerDialogId = DialogObject.getPeerDialogId(tLRPC$TL_folderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tLRPC$TL_folderPeer.folder_id);
                    if (tLRPC$TL_folderPeer.folder_id == 1) {
                        z = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, peerDialogId);
                    executeFast.step();
                    this.unknownDialogsIds.remove(peerDialogId);
                }
            } else if (arrayList2 != null) {
                int size2 = arrayList2.size();
                z = false;
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC$TL_inputFolderPeer tLRPC$TL_inputFolderPeer = (TLRPC$TL_inputFolderPeer) arrayList2.get(i3);
                    long peerDialogId2 = DialogObject.getPeerDialogId(tLRPC$TL_inputFolderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tLRPC$TL_inputFolderPeer.folder_id);
                    if (tLRPC$TL_inputFolderPeer.folder_id == 1) {
                        z = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, peerDialogId2);
                    executeFast.step();
                    this.unknownDialogsIds.remove(peerDialogId2);
                }
            } else {
                executeFast.requery();
                executeFast.bindInteger(1, i);
                boolean z2 = i == 1;
                executeFast.bindInteger(2, 0);
                executeFast.bindLong(3, j);
                executeFast.step();
                z = z2;
            }
            executeFast.dispose();
            this.database.commitTransaction();
            if (!z) {
                lambda$checkIfFolderEmpty$204(1);
            }
            resetAllUnreadCounters(false);
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
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
            sQLitePreparedStatement = executeFast;
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

    public void lambda$checkIfFolderEmpty$204(final int i) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                boolean z = true;
                sQLiteCursor = this.database.queryFinalized("SELECT did FROM dialogs WHERE folder_id = ?", Integer.valueOf(i));
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    if (!DialogObject.isUserDialog(longValue) && !DialogObject.isEncryptedDialog(longValue)) {
                        TLRPC$Chat chat = getChat(-longValue);
                        if (ChatObject.isNotInChat(chat) || chat.migrated_to != null) {
                        }
                    }
                    z = false;
                }
                sQLiteCursor.dispose();
                if (z) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MessagesStorage.this.lambda$checkIfFolderEmptyInternal$203(i);
                        }
                    });
                    SQLiteDatabase sQLiteDatabase = this.database;
                    sQLiteDatabase.executeFast("DELETE FROM dialogs WHERE did = " + DialogObject.makeFolderDialogId(i)).stepThis().dispose();
                }
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

    public void lambda$checkIfFolderEmptyInternal$203(int i) {
        getMessagesController().onFolderEmpty(i);
    }

    public void checkIfFolderEmpty(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$checkIfFolderEmpty$204(i);
            }
        });
    }

    public void unpinAllDialogsExceptNew(final ArrayList<Long> arrayList, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$unpinAllDialogsExceptNew$205(arrayList, i);
            }
        });
    }

    public void lambda$unpinAllDialogsExceptNew$205(java.util.ArrayList r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$unpinAllDialogsExceptNew$205(java.util.ArrayList, int):void");
    }

    public void setDialogUnread(final long j, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setDialogUnread$206(j, z);
            }
        });
    }

    public void lambda$setDialogUnread$206(long r6, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$setDialogUnread$206(long, boolean):void");
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
                MessagesStorage.this.lambda$resetAllUnreadCounters$207();
            }
        });
    }

    public void lambda$resetAllUnreadCounters$207() {
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
                MessagesStorage.this.lambda$setDialogPinned$208(i, j);
            }
        });
    }

    public void lambda$setDialogPinned$208(int i, long j) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                sQLitePreparedStatement.bindInteger(1, i);
                sQLitePreparedStatement.bindLong(2, j);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void setDialogsPinned(final ArrayList<Long> arrayList, final ArrayList<Integer> arrayList2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setDialogsPinned$209(arrayList, arrayList2);
            }
        });
    }

    public void lambda$setDialogsPinned$209(ArrayList arrayList, ArrayList arrayList2) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList2.get(i)).intValue());
                    sQLitePreparedStatement.bindLong(2, ((Long) arrayList.get(i)).longValue());
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                checkSQLException(e);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void putDialogs(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final int i) {
        if (tLRPC$messages_Dialogs.dialogs.isEmpty()) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putDialogs$210(tLRPC$messages_Dialogs, i);
            }
        });
    }

    public void lambda$putDialogs$210(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, int i) {
        putDialogsInternal(tLRPC$messages_Dialogs, i);
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
                MessagesStorage.this.lambda$getDialogMaxMessageId$212(j, intCallback);
            }
        });
    }

    public void lambda$getDialogMaxMessageId$212(long r6, final org.telegram.messenger.MessagesStorage.IntCallback r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogMaxMessageId$212(long, org.telegram.messenger.MessagesStorage$IntCallback):void");
    }

    public static void lambda$getDialogMaxMessageId$211(IntCallback intCallback, int[] iArr) {
        intCallback.run(iArr[0]);
    }

    public int getDialogReadMax(final boolean z, final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getDialogReadMax$213(z, j, numArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return numArr[0].intValue();
    }

    public void lambda$getDialogReadMax$213(boolean r5, long r6, java.lang.Integer[] r8, java.util.concurrent.CountDownLatch r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogReadMax$213(boolean, long, java.lang.Integer[], java.util.concurrent.CountDownLatch):void");
    }

    public int getChannelPtsSync(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getChannelPtsSync$214(j, numArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return numArr[0].intValue();
    }

    public void lambda$getChannelPtsSync$214(long r5, java.lang.Integer[] r7, java.util.concurrent.CountDownLatch r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getChannelPtsSync$214(long, java.lang.Integer[], java.util.concurrent.CountDownLatch):void");
    }

    public TLRPC$User getUserSync(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final TLRPC$User[] tLRPC$UserArr = new TLRPC$User[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getUserSync$215(tLRPC$UserArr, j, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return tLRPC$UserArr[0];
    }

    public void lambda$getUserSync$215(TLRPC$User[] tLRPC$UserArr, long j, CountDownLatch countDownLatch) {
        tLRPC$UserArr[0] = getUser(j);
        countDownLatch.countDown();
    }

    public TLRPC$Chat getChatSync(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final TLRPC$Chat[] tLRPC$ChatArr = new TLRPC$Chat[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getChatSync$216(tLRPC$ChatArr, j, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            checkSQLException(e);
        }
        return tLRPC$ChatArr[0];
    }

    public void lambda$getChatSync$216(TLRPC$Chat[] tLRPC$ChatArr, long j, CountDownLatch countDownLatch) {
        tLRPC$ChatArr[0] = getChat(j);
        countDownLatch.countDown();
    }

    public TLRPC$User getUser(long j) {
        try {
            ArrayList<TLRPC$User> arrayList = new ArrayList<>();
            getUsersInternal("" + j, arrayList);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList.get(0);
        } catch (Exception e) {
            checkSQLException(e);
            return null;
        }
    }

    public ArrayList<TLRPC$User> getUsers(ArrayList<Long> arrayList) {
        ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
        try {
            getUsersInternal(TextUtils.join(",", arrayList), arrayList2);
        } catch (Exception e) {
            arrayList2.clear();
            checkSQLException(e);
        }
        return arrayList2;
    }

    public ArrayList<TLRPC$Chat> getChats(ArrayList<Long> arrayList) {
        ArrayList<TLRPC$Chat> arrayList2 = new ArrayList<>();
        try {
            getChatsInternal(TextUtils.join(",", arrayList), arrayList2);
        } catch (Exception e) {
            arrayList2.clear();
            checkSQLException(e);
        }
        return arrayList2;
    }

    public TLRPC$Chat getChat(long j) {
        try {
            ArrayList<TLRPC$Chat> arrayList = new ArrayList<>();
            getChatsInternal("" + j, arrayList);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList.get(0);
        } catch (Exception e) {
            checkSQLException(e);
            return null;
        }
    }

    public TLRPC$EncryptedChat getEncryptedChat(long j) {
        try {
            ArrayList<TLRPC$EncryptedChat> arrayList = new ArrayList<>();
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

    public void localSearch(int r28, java.lang.String r29, java.util.ArrayList<java.lang.Object> r30, java.util.ArrayList<java.lang.CharSequence> r31, java.util.ArrayList<org.telegram.tgnet.TLRPC$User> r32, java.util.ArrayList<java.lang.Long> r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.localSearch(int, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public static int lambda$localSearch$217(DialogsSearchAdapter.DialogSearchResult dialogSearchResult, DialogsSearchAdapter.DialogSearchResult dialogSearchResult2) {
        int i = dialogSearchResult.date;
        int i2 = dialogSearchResult2.date;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public java.util.ArrayList<java.lang.Integer> getCachedMessagesInRange(long r7, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.getCachedMessagesInRange(long, int, int):java.util.ArrayList");
    }

    public void updateUnreadReactionsCount(long j, int i, int i2) {
        updateUnreadReactionsCount(j, i, i2, false);
    }

    public void updateUnreadReactionsCount(final long j, final int i, final int i2, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateUnreadReactionsCount$218(i, z, j, i2);
            }
        });
    }

    public void lambda$updateUnreadReactionsCount$218(int r8, boolean r9, long r10, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateUnreadReactionsCount$218(int, boolean, long, int):void");
    }

    public void markMessageReactionsAsRead(final long j, final int i, final int i2, boolean z) {
        if (z) {
            getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$markMessageReactionsAsRead$219(j, i, i2);
                }
            });
        } else {
            lambda$markMessageReactionsAsRead$219(j, i, i2);
        }
    }

    public void lambda$markMessageReactionsAsRead$219(long r18, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessageReactionsAsRead$219(long, int, int):void");
    }

    public void updateDialogUnreadReactions(final long j, final int i, final int i2, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateDialogUnreadReactions$220(z, j, i2, i);
            }
        });
    }

    public void lambda$updateDialogUnreadReactions$220(boolean r10, long r11, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateDialogUnreadReactions$220(boolean, long, int, int):void");
    }

    private boolean isForum(long j) {
        int i = this.dialogIsForum.get(j, -1);
        if (i == -1) {
            TLRPC$Chat chat = getChat(-j);
            i = (chat == null || !chat.forum) ? 0 : 1;
            this.dialogIsForum.put(j, i);
        }
        return i == 1;
    }

    public static class TopicKey {
        public long dialogId;
        public int topicId;

        public static TopicKey of(long j, int i) {
            TopicKey topicKey = new TopicKey();
            topicKey.dialogId = j;
            topicKey.topicId = i;
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
            return Objects.hash(Long.valueOf(this.dialogId), Integer.valueOf(this.topicId));
        }

        public String toString() {
            return "TopicKey{dialogId=" + this.dialogId + ", topicId=" + this.topicId + '}';
        }
    }
}
