package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
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
import org.telegram.tgnet.TLRPC$InputDialogPeer;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessageReplies;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Poll;
import org.telegram.tgnet.TLRPC$PollResults;
import org.telegram.tgnet.TLRPC$ReplyMarkup;
import org.telegram.tgnet.TLRPC$TL_channelFull;
import org.telegram.tgnet.TLRPC$TL_channels_deleteMessages;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_chatFull;
import org.telegram.tgnet.TLRPC$TL_chatParticipant;
import org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$TL_dialog;
import org.telegram.tgnet.TLRPC$TL_dialogFolder;
import org.telegram.tgnet.TLRPC$TL_folder;
import org.telegram.tgnet.TLRPC$TL_folderPeer;
import org.telegram.tgnet.TLRPC$TL_inputFolderPeer;
import org.telegram.tgnet.TLRPC$TL_inputMediaGame;
import org.telegram.tgnet.TLRPC$TL_inputMessageEntityMentionName;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageActionChatAddUser;
import org.telegram.tgnet.TLRPC$TL_messageActionGameScore;
import org.telegram.tgnet.TLRPC$TL_messageActionGeoProximityReached;
import org.telegram.tgnet.TLRPC$TL_messageActionPaymentSent;
import org.telegram.tgnet.TLRPC$TL_messageActionPinMessage;
import org.telegram.tgnet.TLRPC$TL_messageEntityMentionName;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported;
import org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported_old;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messageReactions;
import org.telegram.tgnet.TLRPC$TL_messageReplies;
import org.telegram.tgnet.TLRPC$TL_messageReplyHeader;
import org.telegram.tgnet.TLRPC$TL_message_secret;
import org.telegram.tgnet.TLRPC$TL_messages_botCallbackAnswer;
import org.telegram.tgnet.TLRPC$TL_messages_botResults;
import org.telegram.tgnet.TLRPC$TL_messages_deleteMessages;
import org.telegram.tgnet.TLRPC$TL_messages_deleteScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_dialogs;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettings;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettingsEmpty_layer77;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_photoEmpty;
import org.telegram.tgnet.TLRPC$TL_photos_photos;
import org.telegram.tgnet.TLRPC$TL_replyInlineMarkup;
import org.telegram.tgnet.TLRPC$TL_updates;
import org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceTooLong;
import org.telegram.tgnet.TLRPC$TL_userStatusLastMonth;
import org.telegram.tgnet.TLRPC$TL_userStatusLastWeek;
import org.telegram.tgnet.TLRPC$TL_userStatusRecently;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$messages_BotResults;
import org.telegram.tgnet.TLRPC$messages_Dialogs;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.TLRPC$photos_Photos;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;

public class MessagesStorage extends BaseController {
    private static volatile MessagesStorage[] Instance = new MessagesStorage[3];
    private static final int LAST_DB_VERSION = 93;
    private int archiveUnreadCount;
    private File cacheFile;
    private SQLiteDatabase database;
    private boolean databaseMigrationInProgress;
    private int mainUnreadCount;
    private volatile int pendingArchiveUnreadCount;
    private volatile int pendingMainUnreadCount;
    private File shmCacheFile;
    public boolean showClearDatabaseAlert;
    private File walCacheFile;
    private DispatchQueue storageQueue = new DispatchQueue("storageQueue");
    private AtomicLong lastTaskId = new AtomicLong(System.currentTimeMillis());
    private SparseArray<ArrayList<Runnable>> tasks = new SparseArray<>();
    private int lastDateValue = 0;
    private int lastPtsValue = 0;
    private int lastQtsValue = 0;
    private int lastSeqValue = 0;
    private int lastSecretVersion = 0;
    private byte[] secretPBytes = null;
    private int secretG = 0;
    private int lastSavedSeq = 0;
    private int lastSavedPts = 0;
    private int lastSavedDate = 0;
    private int lastSavedQts = 0;
    private ArrayList<MessagesController.DialogFilter> dialogFilters = new ArrayList<>();
    private SparseArray<MessagesController.DialogFilter> dialogFiltersMap = new SparseArray<>();
    private LongSparseArray<Boolean> unknownDialogsIds = new LongSparseArray<>();
    private CountDownLatch openSync = new CountDownLatch(1);
    private int[][] contacts = {new int[2], new int[2]};
    private int[][] nonContacts = {new int[2], new int[2]};
    private int[][] bots = {new int[2], new int[2]};
    private int[][] channels = {new int[2], new int[2]};
    private int[][] groups = {new int[2], new int[2]};
    private int[] mentionChannels = new int[2];
    private int[] mentionGroups = new int[2];
    private LongSparseArray<Integer> dialogsWithMentions = new LongSparseArray<>();
    private LongSparseArray<Integer> dialogsWithUnread = new LongSparseArray<>();

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

    public static MessagesStorage getInstance(int i) {
        MessagesStorage messagesStorage = Instance[i];
        if (messagesStorage == null) {
            synchronized (MessagesStorage.class) {
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
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.storageQueue.cancelRunnable(arrayList.get(i2));
            }
            this.tasks.remove(i);
        }
    }

    public void completeTaskForGuid(Runnable runnable, int i) {
        ArrayList<Runnable> arrayList = this.tasks.get(i);
        if (arrayList != null) {
            arrayList.remove(runnable);
            if (arrayList.isEmpty()) {
                this.tasks.remove(i);
            }
        }
    }

    public long getDatabaseSize() {
        File file = this.cacheFile;
        long j = 0;
        if (file != null) {
            j = 0 + file.length();
        }
        File file2 = this.shmCacheFile;
        return file2 != null ? j + file2.length() : j;
    }

    public void openDatabase(int i) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, "account" + this.currentAccount + "/");
            file.mkdirs();
            filesDirFixed = file;
        }
        this.cacheFile = new File(filesDirFixed, "cache4.db");
        this.walCacheFile = new File(filesDirFixed, "cache4.db-wal");
        this.shmCacheFile = new File(filesDirFixed, "cache4.db-shm");
        boolean z = !this.cacheFile.exists();
        int i2 = 3;
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
                this.database.executeFast("CREATE TABLE messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes(uid, end);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, uid))").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, PRIMARY KEY(mid, uid))").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)").stepThis().dispose();
                this.database.executeFast("CREATE TABLE user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE dialogs(did INTEGER PRIMARY KEY, date INTEGER, unread_count INTEGER, last_mid INTEGER, inbox_max INTEGER, outbox_max INTEGER, last_mid_i INTEGER, unread_count_i INTEGER, pts INTEGER, date_i INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, data BLOB, unread_reactions INTEGER)").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS date_idx_dialogs ON dialogs(date);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON dialogs(last_mid);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON dialogs(folder_id);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON dialogs(flags);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT)").stepThis().dispose();
                this.database.executeFast("CREATE TABLE dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))").stepThis().dispose();
                this.database.executeFast("CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))").stepThis().dispose();
                this.database.executeFast("CREATE TABLE randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
                this.database.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
                this.database.executeFast("CREATE TABLE media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER, online INTEGER, inviter INTEGER, links INTEGER)").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;").stepThis().dispose();
                this.database.executeFast("CREATE TABLE user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;").stepThis().dispose();
                this.database.executeFast("CREATE TABLE chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));").stepThis().dispose();
                this.database.executeFast("CREATE TABLE chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE users_data(uid INTEGER PRIMARY KEY, about TEXT)").stepThis().dispose();
                this.database.executeFast("CREATE TABLE users(uid INTEGER PRIMARY KEY, name TEXT, status INTEGER, data BLOB)").stepThis().dispose();
                this.database.executeFast("CREATE TABLE chats(uid INTEGER PRIMARY KEY, name TEXT, data BLOB)").stepThis().dispose();
                this.database.executeFast("CREATE TABLE enc_chats(uid INTEGER PRIMARY KEY, user INTEGER, name TEXT, data BLOB, g BLOB, authkey BLOB, ttl INTEGER, layer INTEGER, seq_in INTEGER, seq_out INTEGER, use_count INTEGER, exchange_id INTEGER, key_date INTEGER, fprint INTEGER, fauthkey BLOB, khash BLOB, in_seq_no INTEGER, admin_id INTEGER, mtproto_seq INTEGER)").stepThis().dispose();
                this.database.executeFast("CREATE TABLE channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))").stepThis().dispose();
                this.database.executeFast("CREATE TABLE channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))").stepThis().dispose();
                this.database.executeFast("CREATE TABLE contacts(uid INTEGER PRIMARY KEY, mutual INTEGER)").stepThis().dispose();
                this.database.executeFast("CREATE TABLE user_photos(uid INTEGER, id INTEGER, data BLOB, PRIMARY KEY (uid, id))").stepThis().dispose();
                this.database.executeFast("CREATE TABLE dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, document BLOB, PRIMARY KEY (id, type));").stepThis().dispose();
                this.database.executeFast("CREATE TABLE stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));").stepThis().dispose();
                this.database.executeFast("CREATE TABLE sent_files_v2(uid TEXT, type INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type))").stepThis().dispose();
                this.database.executeFast("CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, type))").stepThis().dispose();
                this.database.executeFast("CREATE TABLE keyvalue(id TEXT PRIMARY KEY, value TEXT)").stepThis().dispose();
                this.database.executeFast("CREATE TABLE bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))").stepThis().dispose();
                this.database.executeFast("CREATE TABLE pending_tasks(id INTEGER PRIMARY KEY, data BLOB);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));").stepThis().dispose();
                this.database.executeFast("CREATE TABLE sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB, proximity INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER, date INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, PRIMARY KEY(uid, mid))").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE reactions(data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));").stepThis().dispose();
                this.database.executeFast("CREATE TABLE attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
                this.database.executeFast("PRAGMA user_version = 93").stepThis().dispose();
            } else {
                int intValue = this.database.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current db version = " + intValue);
                }
                if (intValue != 0) {
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
                    } catch (Exception e) {
                        if (e.getMessage() != null && e.getMessage().contains("malformed")) {
                            throw new RuntimeException("malformed");
                        }
                        FileLog.e(e);
                        try {
                            this.database.executeFast("CREATE TABLE IF NOT EXISTS params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
                            this.database.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                    }
                    if (intValue < LAST_DB_VERSION) {
                        try {
                            updateDbToLastVersion(intValue);
                        } catch (Exception e3) {
                            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                                throw e3;
                            }
                            FileLog.e(e3);
                            throw new RuntimeException("malformed");
                        }
                    }
                } else {
                    throw new Exception("malformed");
                }
            }
        } catch (Exception e4) {
            FileLog.e(e4);
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                throw new RuntimeException(e4);
            } else if (i < 3 && e4.getMessage() != null && e4.getMessage().contains("malformed")) {
                if (i == 2) {
                    cleanupInternal(true);
                    for (int i3 = 0; i3 < 2; i3++) {
                        getUserConfig().setDialogsLoadOffset(i3, 0, 0, 0L, 0L, 0L, 0L);
                        getUserConfig().setTotalDialogsCount(i3, 0);
                    }
                    getUserConfig().saveConfig(false);
                } else {
                    cleanupInternal(false);
                }
                if (i == 1) {
                    i2 = 2;
                }
                openDatabase(i2);
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
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.onDatabaseMigration, Boolean.FALSE);
        }
    }

    public void lambda$openDatabase$2() {
        this.showClearDatabaseAlert = false;
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.onDatabaseOpened, new Object[0]);
    }

    public boolean isDatabaseMigrationInProgress() {
        return this.databaseMigrationInProgress;
    }

    private void updateDbToLastVersion(int i) throws Exception {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        int i2;
        int i3;
        NativeByteBuffer nativeByteBuffer;
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        SQLiteCursor sQLiteCursor5;
        SQLiteCursor sQLiteCursor6;
        SQLiteCursor sQLiteCursor7;
        SQLiteCursor sQLiteCursor8;
        final MessagesStorage messagesStorage = this;
        int i4 = i;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateDbToLastVersion$3();
            }
        });
        FileLog.d("MessagesStorage start db migration from " + i4 + " to " + LAST_DB_VERSION);
        int i5 = 4;
        if (i4 < 4) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS user_photos(uid INTEGER, id INTEGER, data BLOB, PRIMARY KEY (uid, id))").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS read_state_out_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS ttl_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS date_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS mid_out_idx_messages ON messages(mid, out);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages ON messages(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages ON messages(uid, date, mid);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS user_contacts_v6(uid INTEGER PRIMARY KEY, fname TEXT, sname TEXT)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS user_phones_v6(uid INTEGER, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (uid, phone))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v6(sphone, deleted);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS mid_idx_randoms ON randoms(mid);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS sent_files_v2(uid TEXT, type INTEGER, data BLOB, PRIMARY KEY (uid, type))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, PRIMARY KEY (uid, type));").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);").stepThis().dispose();
            messagesStorage.database.executeFast("UPDATE messages SET send_state = 2 WHERE mid < 0 AND send_state = 1").stepThis().dispose();
            fixNotificationSettings();
            messagesStorage.database.executeFast("PRAGMA user_version = 4").stepThis().dispose();
            i4 = 4;
        }
        int i6 = 6;
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        if (i4 == 4) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v2(mid INTEGER PRIMARY KEY, date INTEGER)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v2 ON enc_tasks_v2(date);").stepThis().dispose();
            messagesStorage.database.beginTransaction();
            SQLiteCursor queryFinalized = messagesStorage.database.queryFinalized("SELECT date, data FROM enc_tasks WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast = messagesStorage.database.executeFast("REPLACE INTO enc_tasks_v2 VALUES(?, ?)");
            if (queryFinalized.next()) {
                int intValue = queryFinalized.intValue(0);
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    int limit = byteBufferValue.limit();
                    for (int i10 = 0; i10 < limit / 4; i10++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, byteBufferValue.readInt32(false));
                        executeFast.bindInteger(2, intValue);
                        executeFast.step();
                    }
                    byteBufferValue.reuse();
                }
            }
            executeFast.dispose();
            queryFinalized.dispose();
            messagesStorage.database.commitTransaction();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS enc_tasks;").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE messages ADD COLUMN media INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 6").stepThis().dispose();
            i4 = 6;
        }
        if (i4 == 6) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN layer INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN seq_in INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN seq_out INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 7").stepThis().dispose();
            i4 = 7;
        }
        if (i4 == 7 || i4 == 8 || i4 == 9) {
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN use_count INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN exchange_id INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN key_date INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN fprint INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN fauthkey BLOB default NULL").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN khash BLOB default NULL").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 10").stepThis().dispose();
            i4 = 10;
        }
        if (i4 == 10) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, PRIMARY KEY (id, type));").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 11").stepThis().dispose();
            i4 = 11;
        }
        if (i4 == 11 || i4 == 12) {
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_mid_idx_media;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS mid_idx_media;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_date_mid_idx_media;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS media;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS media_counts;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS media_v2(mid INTEGER PRIMARY KEY, uid INTEGER, date INTEGER, type INTEGER, data BLOB)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, PRIMARY KEY(uid, type))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media ON media_v2(uid, mid, type, date);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS keyvalue(id TEXT PRIMARY KEY, value TEXT)").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 13").stepThis().dispose();
            i4 = 13;
        }
        if (i4 == 13) {
            messagesStorage.database.executeFast("ALTER TABLE messages ADD COLUMN replydata BLOB default NULL").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 14").stepThis().dispose();
            i4 = 14;
        }
        if (i4 == 14) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 15").stepThis().dispose();
            i4 = 15;
        }
        if (i4 == 15) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS webpage_pending(id INTEGER, mid INTEGER, PRIMARY KEY (id, mid));").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 16").stepThis().dispose();
            i4 = 16;
        }
        if (i4 == 16) {
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN inbox_max INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN outbox_max INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 17").stepThis().dispose();
            i4 = 17;
        }
        if (i4 == 17) {
            messagesStorage.database.executeFast("PRAGMA user_version = 18").stepThis().dispose();
            i4 = 18;
        }
        if (i4 == 18) {
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS stickers;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 19").stepThis().dispose();
            i4 = 19;
        }
        if (i4 == 19) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid ON bot_keyboard(mid);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 20").stepThis().dispose();
            i4 = 20;
        }
        if (i4 == 20) {
            messagesStorage.database.executeFast("CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 21").stepThis().dispose();
            i4 = 21;
        }
        if (i4 == 21) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB)").stepThis().dispose();
            SQLiteCursor queryFinalized2 = messagesStorage.database.queryFinalized("SELECT uid, participants FROM chat_settings WHERE uid < 0", new Object[0]);
            SQLitePreparedStatement executeFast2 = messagesStorage.database.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?)");
            while (queryFinalized2.next()) {
                long intValue2 = queryFinalized2.intValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(1);
                if (byteBufferValue2 != null) {
                    TLRPC$ChatParticipants TLdeserialize = TLRPC$ChatParticipants.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                    byteBufferValue2.reuse();
                    if (TLdeserialize != null) {
                        TLRPC$TL_chatFull tLRPC$TL_chatFull = new TLRPC$TL_chatFull();
                        tLRPC$TL_chatFull.id = intValue2;
                        tLRPC$TL_chatFull.chat_photo = new TLRPC$TL_photoEmpty();
                        tLRPC$TL_chatFull.notify_settings = new TLRPC$TL_peerNotifySettingsEmpty_layer77();
                        tLRPC$TL_chatFull.exported_invite = null;
                        tLRPC$TL_chatFull.participants = TLdeserialize;
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLRPC$TL_chatFull.getObjectSize());
                        tLRPC$TL_chatFull.serializeToStream(nativeByteBuffer2);
                        executeFast2.requery();
                        executeFast2.bindLong(1, intValue2);
                        executeFast2.bindByteBuffer(2, nativeByteBuffer2);
                        executeFast2.step();
                        nativeByteBuffer2.reuse();
                    }
                }
            }
            executeFast2.dispose();
            queryFinalized2.dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS chat_settings;").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN last_mid_i INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN unread_count_i INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN pts INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN date_i INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE messages ADD COLUMN imp INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes(uid, end);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 22").stepThis().dispose();
            i4 = 22;
        }
        if (i4 == 22) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 23").stepThis().dispose();
            i4 = 23;
        }
        if (i4 == 23 || i4 == 24) {
            messagesStorage.database.executeFast("DELETE FROM media_holes_v2 WHERE uid != 0 AND type >= 0 AND start IN (0, 1)").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 25").stepThis().dispose();
            i4 = 25;
        }
        if (i4 == 25 || i4 == 26) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 27").stepThis().dispose();
            i4 = 27;
        }
        if (i4 == 27) {
            messagesStorage.database.executeFast("ALTER TABLE web_recent_v3 ADD COLUMN document BLOB default NULL").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 28").stepThis().dispose();
            i4 = 28;
        }
        if (i4 == 28 || i4 == 29) {
            messagesStorage.database.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
            messagesStorage.database.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 30").stepThis().dispose();
            i4 = 30;
        }
        if (i4 == 30) {
            messagesStorage.database.executeFast("ALTER TABLE chat_settings_v2 ADD COLUMN pinned INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS users_data(uid INTEGER PRIMARY KEY, about TEXT)").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 31").stepThis().dispose();
            i4 = 31;
        }
        if (i4 == 31) {
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS bot_recent;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 32").stepThis().dispose();
            i4 = 32;
        }
        if (i4 == 32) {
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_mid_idx_imp_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_date_mid_imp_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 33").stepThis().dispose();
            i4 = 33;
        }
        if (i4 == 33) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS pending_tasks(id INTEGER PRIMARY KEY, data BLOB);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 34").stepThis().dispose();
            i4 = 34;
        }
        if (i4 == 34) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 35").stepThis().dispose();
            i4 = 35;
        }
        if (i4 == 35) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 36").stepThis().dispose();
            i4 = 36;
        }
        if (i4 == 36) {
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN in_seq_no INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 37").stepThis().dispose();
            i4 = 37;
        }
        if (i4 == 37) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 38").stepThis().dispose();
            i4 = 38;
        }
        if (i4 == 38) {
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN pinned INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 39").stepThis().dispose();
            i4 = 39;
        }
        if (i4 == 39) {
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN admin_id INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 40").stepThis().dispose();
            i4 = 40;
        }
        if (i4 == 40) {
            fixNotificationSettings();
            messagesStorage.database.executeFast("PRAGMA user_version = 41").stepThis().dispose();
            i4 = 41;
        }
        if (i4 == 41) {
            messagesStorage.database.executeFast("ALTER TABLE messages ADD COLUMN mention INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE user_contacts_v6 ADD COLUMN imported INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages ON messages(uid, mention, read_state);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 42").stepThis().dispose();
            i4 = 42;
        }
        if (i4 == 42) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 43").stepThis().dispose();
            i4 = 43;
        }
        if (i4 == 43) {
            messagesStorage.database.executeFast("PRAGMA user_version = 44").stepThis().dispose();
            i4 = 44;
        }
        if (i4 == 44) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 45").stepThis().dispose();
            i4 = 45;
        }
        if (i4 == 45) {
            messagesStorage.database.executeFast("ALTER TABLE enc_chats ADD COLUMN mtproto_seq INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 46").stepThis().dispose();
            i4 = 46;
        }
        if (i4 == 46) {
            messagesStorage.database.executeFast("DELETE FROM botcache WHERE 1").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 47").stepThis().dispose();
            i4 = 47;
        }
        if (i4 == 47) {
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN flags INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 48").stepThis().dispose();
            i4 = 48;
        }
        if (i4 == 48) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, PRIMARY KEY(uid, mid))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 49").stepThis().dispose();
            i4 = 49;
        }
        if (i4 == 49) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 50").stepThis().dispose();
            i4 = 50;
        }
        if (i4 == 50) {
            messagesStorage.database.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE sent_files_v2 ADD COLUMN parent TEXT").stepThis().dispose();
            messagesStorage.database.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE download_queue ADD COLUMN parent TEXT").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 51").stepThis().dispose();
            i4 = 51;
        }
        if (i4 == 51) {
            messagesStorage.database.executeFast("ALTER TABLE media_counts_v2 ADD COLUMN old INTEGER").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 52").stepThis().dispose();
            i4 = 52;
        }
        if (i4 == 52) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS polls_id ON polls_v2(id);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 53").stepThis().dispose();
            i4 = 53;
        }
        if (i4 == 53) {
            messagesStorage.database.executeFast("ALTER TABLE chat_settings_v2 ADD COLUMN online INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 54").stepThis().dispose();
            i4 = 54;
        }
        if (i4 == 54) {
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS wallpapers;").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 55").stepThis().dispose();
            i4 = 55;
        }
        if (i4 == 55) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 56").stepThis().dispose();
            i4 = 56;
        }
        if (i4 == 56 || i4 == 57) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 58").stepThis().dispose();
            i4 = 58;
        }
        if (i4 == 58) {
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE emoji_keywords_info_v2 ADD COLUMN date INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 59").stepThis().dispose();
            i4 = 59;
        }
        if (i4 == 59) {
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN folder_id INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN data BLOB default NULL").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON dialogs(folder_id);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 60").stepThis().dispose();
            i4 = 60;
        }
        if (i4 == 60) {
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS channel_admins;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS blocked_users;").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 61").stepThis().dispose();
            i4 = 61;
        }
        if (i4 == 61) {
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS send_state_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages2 ON messages(mid, send_state, date);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 62").stepThis().dispose();
            i4 = 62;
        }
        if (i4 == 62) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS scheduled_messages(mid INTEGER PRIMARY KEY, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages ON scheduled_messages(mid, send_state, date);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages ON scheduled_messages(uid, date);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 63").stepThis().dispose();
            i4 = 63;
        }
        if (i4 == 63) {
            messagesStorage.database.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 64").stepThis().dispose();
            i4 = 64;
        }
        if (i4 == 64) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT)").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 65").stepThis().dispose();
            i4 = 65;
        }
        if (i4 == 65) {
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON dialogs(flags);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 66").stepThis().dispose();
            i4 = 66;
        }
        if (i4 == 66) {
            messagesStorage.database.executeFast("CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 67").stepThis().dispose();
            i4 = 67;
        }
        if (i4 == 67) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 68").stepThis().dispose();
            i4 = 68;
        }
        if (i4 == 68) {
            messagesStorage.executeNoException("ALTER TABLE messages ADD COLUMN forwards INTEGER default 0");
            messagesStorage.database.executeFast("PRAGMA user_version = 69").stepThis().dispose();
            i4 = 69;
        }
        if (i4 == 69) {
            messagesStorage.executeNoException("ALTER TABLE messages ADD COLUMN replies_data BLOB default NULL");
            messagesStorage.executeNoException("ALTER TABLE messages ADD COLUMN thread_reply_id INTEGER default 0");
            messagesStorage.database.executeFast("PRAGMA user_version = 70").stepThis().dispose();
            i4 = 70;
        }
        if (i4 == 70) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 71").stepThis().dispose();
            i4 = 71;
        }
        if (i4 == 71) {
            messagesStorage.executeNoException("ALTER TABLE sharing_locations ADD COLUMN proximity INTEGER default 0");
            messagesStorage.database.executeFast("PRAGMA user_version = 72").stepThis().dispose();
            i4 = 72;
        }
        if (i4 == 72) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 73").stepThis().dispose();
            i4 = 73;
        }
        if (i4 == 73) {
            messagesStorage.executeNoException("ALTER TABLE chat_settings_v2 ADD COLUMN inviter INTEGER default 0");
            messagesStorage.database.executeFast("PRAGMA user_version = 74").stepThis().dispose();
            i4 = 74;
        }
        if (i4 == 74) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 75").stepThis().dispose();
            i4 = 75;
        }
        if (i4 == 75) {
            messagesStorage.executeNoException("ALTER TABLE chat_settings_v2 ADD COLUMN links INTEGER default 0");
            messagesStorage.database.executeFast("PRAGMA user_version = 76").stepThis().dispose();
            i4 = 76;
        }
        if (i4 == 76) {
            messagesStorage.executeNoException("ALTER TABLE enc_tasks_v2 ADD COLUMN media INTEGER default -1");
            messagesStorage.database.executeFast("PRAGMA user_version = 77").stepThis().dispose();
            i4 = 77;
        }
        if (i4 == 77) {
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS channel_admins_v2;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 78").stepThis().dispose();
            i4 = 78;
        }
        if (i4 == 78) {
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS bot_info;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 79").stepThis().dispose();
            i4 = 79;
        }
        int i11 = 3;
        if (i4 == 79) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v3(mid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, media))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v3 ON enc_tasks_v3(date);").stepThis().dispose();
            messagesStorage.database.beginTransaction();
            SQLiteCursor queryFinalized3 = messagesStorage.database.queryFinalized("SELECT mid, date, media FROM enc_tasks_v2 WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast3 = messagesStorage.database.executeFast("REPLACE INTO enc_tasks_v3 VALUES(?, ?, ?)");
            if (queryFinalized3.next()) {
                long longValue = queryFinalized3.longValue(0);
                int intValue3 = queryFinalized3.intValue(1);
                int intValue4 = queryFinalized3.intValue(2);
                executeFast3.requery();
                executeFast3.bindLong(1, longValue);
                executeFast3.bindInteger(2, intValue3);
                executeFast3.bindInteger(3, intValue4);
                executeFast3.step();
            }
            executeFast3.dispose();
            queryFinalized3.dispose();
            messagesStorage.database.commitTransaction();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks_v2;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS enc_tasks_v2;").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 80").stepThis().dispose();
            i4 = 80;
        }
        int i12 = 5;
        if (i4 == 80) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, PRIMARY KEY(mid, uid))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS bot_keyboard_idx_mid;").stepThis().dispose();
            messagesStorage.database.beginTransaction();
            try {
                sQLiteCursor8 = messagesStorage.database.queryFinalized("SELECT mid, uid, send_state, date, data, ttl, replydata FROM scheduled_messages_v2 WHERE 1", new Object[0]);
            } catch (Exception e) {
                FileLog.e(e);
                sQLiteCursor8 = null;
            }
            if (sQLiteCursor8 != null) {
                SQLitePreparedStatement executeFast4 = messagesStorage.database.executeFast("REPLACE INTO scheduled_messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                while (sQLiteCursor8.next()) {
                    NativeByteBuffer byteBufferValue3 = sQLiteCursor8.byteBufferValue(4);
                    if (byteBufferValue3 != null) {
                        int intValue5 = sQLiteCursor8.intValue(i9);
                        long longValue2 = sQLiteCursor8.longValue(1);
                        int intValue6 = sQLiteCursor8.intValue(2);
                        int intValue7 = sQLiteCursor8.intValue(3);
                        int intValue8 = sQLiteCursor8.intValue(i12);
                        NativeByteBuffer byteBufferValue4 = sQLiteCursor8.byteBufferValue(6);
                        executeFast4.requery();
                        executeFast4.bindInteger(1, intValue5);
                        executeFast4.bindLong(2, longValue2);
                        executeFast4.bindInteger(3, intValue6);
                        executeFast4.bindByteBuffer(4, byteBufferValue3);
                        executeFast4.bindInteger(5, intValue7);
                        executeFast4.bindInteger(6, intValue8);
                        if (byteBufferValue4 != null) {
                            executeFast4.bindByteBuffer(7, byteBufferValue4);
                        } else {
                            executeFast4.bindNull(7);
                        }
                        executeFast4.step();
                        if (byteBufferValue4 != null) {
                            byteBufferValue4.reuse();
                        }
                        byteBufferValue3.reuse();
                        i9 = 0;
                        i12 = 5;
                    }
                }
                sQLiteCursor8.dispose();
                executeFast4.dispose();
            }
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS send_state_idx_scheduled_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_date_idx_scheduled_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS scheduled_messages;").stepThis().dispose();
            messagesStorage.database.commitTransaction();
            messagesStorage.database.executeFast("PRAGMA user_version = 81").stepThis().dispose();
            i4 = 81;
        }
        if (i4 == 81) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS media_v3(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v3 ON media_v3(uid, mid, type, date);").stepThis().dispose();
            messagesStorage.database.beginTransaction();
            try {
                sQLiteCursor7 = messagesStorage.database.queryFinalized("SELECT mid, uid, date, type, data FROM media_v2 WHERE 1", new Object[0]);
            } catch (Exception e2) {
                FileLog.e(e2);
                sQLiteCursor7 = null;
            }
            if (sQLiteCursor7 != null) {
                SQLitePreparedStatement executeFast5 = messagesStorage.database.executeFast("REPLACE INTO media_v3 VALUES(?, ?, ?, ?, ?)");
                while (sQLiteCursor7.next()) {
                    NativeByteBuffer byteBufferValue5 = sQLiteCursor7.byteBufferValue(4);
                    if (byteBufferValue5 != null) {
                        int intValue9 = sQLiteCursor7.intValue(0);
                        long longValue3 = sQLiteCursor7.longValue(1);
                        if (((int) longValue3) == 0) {
                            longValue3 = DialogObject.makeEncryptedDialogId((int) (longValue3 >> 32));
                        }
                        int intValue10 = sQLiteCursor7.intValue(2);
                        int intValue11 = sQLiteCursor7.intValue(3);
                        executeFast5.requery();
                        executeFast5.bindInteger(1, intValue9);
                        executeFast5.bindLong(2, longValue3);
                        executeFast5.bindInteger(3, intValue10);
                        executeFast5.bindInteger(4, intValue11);
                        executeFast5.bindByteBuffer(5, byteBufferValue5);
                        executeFast5.step();
                        byteBufferValue5.reuse();
                    }
                }
                sQLiteCursor7.dispose();
                executeFast5.dispose();
            }
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_mid_type_date_idx_media;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS media_v2;").stepThis().dispose();
            messagesStorage.database.commitTransaction();
            messagesStorage.database.executeFast("PRAGMA user_version = 82").stepThis().dispose();
            i4 = 82;
        }
        if (i4 == 82) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));").stepThis().dispose();
            messagesStorage.database.beginTransaction();
            try {
                sQLiteCursor3 = messagesStorage.database.queryFinalized("SELECT r.random_id, r.mid, m.uid FROM randoms as r INNER JOIN messages as m ON r.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e3) {
                FileLog.e(e3);
                sQLiteCursor3 = null;
            }
            if (sQLiteCursor3 != null) {
                SQLitePreparedStatement executeFast6 = messagesStorage.database.executeFast("REPLACE INTO randoms_v2 VALUES(?, ?, ?)");
                while (sQLiteCursor3.next()) {
                    long longValue4 = sQLiteCursor3.longValue(0);
                    int intValue12 = sQLiteCursor3.intValue(1);
                    long longValue5 = sQLiteCursor3.longValue(2);
                    if (((int) longValue5) == 0) {
                        longValue5 = DialogObject.makeEncryptedDialogId((int) (longValue5 >> 32));
                    }
                    executeFast6.requery();
                    executeFast6.bindLong(1, longValue4);
                    executeFast6.bindInteger(2, intValue12);
                    executeFast6.bindLong(3, longValue5);
                    executeFast6.step();
                }
                sQLiteCursor3.dispose();
                executeFast6.dispose();
            }
            try {
                sQLiteCursor4 = messagesStorage.database.queryFinalized("SELECT p.mid, m.uid, p.id FROM polls as p INNER JOIN messages as m ON p.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e4) {
                FileLog.e(e4);
                sQLiteCursor4 = null;
            }
            if (sQLiteCursor4 != null) {
                SQLitePreparedStatement executeFast7 = messagesStorage.database.executeFast("REPLACE INTO polls_v2 VALUES(?, ?, ?)");
                while (sQLiteCursor4.next()) {
                    int intValue13 = sQLiteCursor4.intValue(0);
                    long longValue6 = sQLiteCursor4.longValue(1);
                    long longValue7 = sQLiteCursor4.longValue(2);
                    if (((int) longValue6) == 0) {
                        longValue6 = DialogObject.makeEncryptedDialogId((int) (longValue6 >> 32));
                    }
                    executeFast7.requery();
                    executeFast7.bindInteger(1, intValue13);
                    executeFast7.bindLong(2, longValue6);
                    executeFast7.bindLong(3, longValue7);
                    executeFast7.step();
                }
                sQLiteCursor4.dispose();
                executeFast7.dispose();
            }
            try {
                sQLiteCursor5 = messagesStorage.database.queryFinalized("SELECT wp.id, wp.mid, m.uid FROM webpage_pending as wp INNER JOIN messages as m ON wp.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e5) {
                FileLog.e(e5);
                sQLiteCursor5 = null;
            }
            if (sQLiteCursor5 != null) {
                SQLitePreparedStatement executeFast8 = messagesStorage.database.executeFast("REPLACE INTO webpage_pending_v2 VALUES(?, ?, ?)");
                while (sQLiteCursor5.next()) {
                    long longValue8 = sQLiteCursor5.longValue(0);
                    int intValue14 = sQLiteCursor5.intValue(1);
                    long longValue9 = sQLiteCursor5.longValue(2);
                    if (((int) longValue9) == 0) {
                        longValue9 = DialogObject.makeEncryptedDialogId((int) (longValue9 >> 32));
                    }
                    executeFast8.requery();
                    executeFast8.bindLong(1, longValue8);
                    executeFast8.bindInteger(2, intValue14);
                    executeFast8.bindLong(3, longValue9);
                    executeFast8.step();
                }
                sQLiteCursor5.dispose();
                executeFast8.dispose();
            }
            try {
                sQLiteCursor6 = messagesStorage.database.queryFinalized("SELECT et.mid, m.uid, et.date, et.media FROM enc_tasks_v3 as et INNER JOIN messages as m ON et.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e6) {
                FileLog.e(e6);
                sQLiteCursor6 = null;
            }
            if (sQLiteCursor6 != null) {
                SQLitePreparedStatement executeFast9 = messagesStorage.database.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                while (sQLiteCursor6.next()) {
                    int intValue15 = sQLiteCursor6.intValue(0);
                    long longValue10 = sQLiteCursor6.longValue(1);
                    int intValue16 = sQLiteCursor6.intValue(2);
                    int intValue17 = sQLiteCursor6.intValue(3);
                    if (((int) longValue10) == 0) {
                        longValue10 = DialogObject.makeEncryptedDialogId((int) (longValue10 >> 32));
                    }
                    executeFast9.requery();
                    executeFast9.bindInteger(1, intValue15);
                    executeFast9.bindLong(2, longValue10);
                    executeFast9.bindInteger(3, intValue16);
                    executeFast9.bindInteger(4, intValue17);
                    executeFast9.step();
                }
                sQLiteCursor6.dispose();
                executeFast9.dispose();
            }
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS mid_idx_randoms;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS randoms;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks_v3;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS enc_tasks_v3;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS polls_id;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS polls;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS webpage_pending;").stepThis().dispose();
            messagesStorage.database.commitTransaction();
            messagesStorage.database.executeFast("PRAGMA user_version = 83").stepThis().dispose();
            i4 = 83;
        }
        if (i4 == 83) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, PRIMARY KEY(mid, uid))").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);").stepThis().dispose();
            messagesStorage.database.beginTransaction();
            try {
                sQLiteCursor2 = messagesStorage.database.queryFinalized("SELECT mid, uid, read_state, send_state, date, data, out, ttl, media, replydata, imp, mention, forwards, replies_data, thread_reply_id FROM messages WHERE 1", new Object[0]);
            } catch (Exception e7) {
                FileLog.e(e7);
                sQLiteCursor2 = null;
            }
            if (sQLiteCursor2 != null) {
                SQLitePreparedStatement executeFast10 = messagesStorage.database.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                while (sQLiteCursor2.next()) {
                    NativeByteBuffer byteBufferValue6 = sQLiteCursor2.byteBufferValue(5);
                    if (byteBufferValue6 != null) {
                        long intValue18 = sQLiteCursor2.intValue(0);
                        long longValue11 = sQLiteCursor2.longValue(i8);
                        if (((int) longValue11) == 0) {
                            longValue11 = DialogObject.makeEncryptedDialogId((int) (longValue11 >> 32));
                        }
                        int intValue19 = sQLiteCursor2.intValue(i7);
                        int intValue20 = sQLiteCursor2.intValue(i11);
                        int intValue21 = sQLiteCursor2.intValue(i5);
                        int intValue22 = sQLiteCursor2.intValue(i6);
                        int intValue23 = sQLiteCursor2.intValue(7);
                        int intValue24 = sQLiteCursor2.intValue(8);
                        NativeByteBuffer byteBufferValue7 = sQLiteCursor2.byteBufferValue(9);
                        int intValue25 = sQLiteCursor2.intValue(10);
                        int intValue26 = sQLiteCursor2.intValue(11);
                        int intValue27 = sQLiteCursor2.intValue(12);
                        NativeByteBuffer byteBufferValue8 = sQLiteCursor2.byteBufferValue(13);
                        int intValue28 = sQLiteCursor2.intValue(14);
                        sQLiteCursor2 = sQLiteCursor2;
                        int i13 = (int) (longValue11 >> 32);
                        if (intValue23 < 0) {
                            TLRPC$Message TLdeserialize2 = TLRPC$Message.TLdeserialize(byteBufferValue6, byteBufferValue6.readInt32(false), false);
                            if (TLdeserialize2 != null) {
                                i3 = intValue24;
                                TLdeserialize2.readAttachPath(byteBufferValue6, getUserConfig().clientUserId);
                                if (TLdeserialize2.params == null) {
                                    HashMap<String, String> hashMap = new HashMap<>();
                                    TLdeserialize2.params = hashMap;
                                    StringBuilder sb = new StringBuilder();
                                    i2 = i13;
                                    sb.append("");
                                    sb.append(intValue23);
                                    hashMap.put("fwd_peer", sb.toString());
                                } else {
                                    i2 = i13;
                                }
                                byteBufferValue6.reuse();
                                NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                TLdeserialize2.serializeToStream(nativeByteBuffer3);
                                byteBufferValue6 = nativeByteBuffer3;
                            } else {
                                i2 = i13;
                                i3 = intValue24;
                            }
                            intValue23 = 0;
                        } else {
                            i2 = i13;
                            i3 = intValue24;
                        }
                        executeFast10.requery();
                        executeFast10.bindInteger(1, (int) intValue18);
                        executeFast10.bindLong(2, longValue11);
                        executeFast10.bindInteger(3, intValue19);
                        executeFast10.bindInteger(4, intValue20);
                        executeFast10.bindInteger(5, intValue21);
                        executeFast10.bindByteBuffer(6, byteBufferValue6);
                        executeFast10.bindInteger(7, intValue22);
                        executeFast10.bindInteger(8, intValue23);
                        executeFast10.bindInteger(9, i3);
                        if (byteBufferValue7 != null) {
                            executeFast10.bindByteBuffer(10, byteBufferValue7);
                        } else {
                            executeFast10.bindNull(10);
                        }
                        executeFast10.bindInteger(11, intValue25);
                        executeFast10.bindInteger(12, intValue26);
                        executeFast10.bindInteger(13, intValue27);
                        if (byteBufferValue8 != null) {
                            nativeByteBuffer = byteBufferValue8;
                            executeFast10.bindByteBuffer(14, nativeByteBuffer);
                        } else {
                            nativeByteBuffer = byteBufferValue8;
                            executeFast10.bindNull(14);
                        }
                        executeFast10.bindInteger(15, intValue28);
                        executeFast10.bindInteger(16, i2 > 0 ? 1 : 0);
                        executeFast10.step();
                        if (byteBufferValue7 != null) {
                            byteBufferValue7.reuse();
                        }
                        if (nativeByteBuffer != null) {
                            nativeByteBuffer.reuse();
                        }
                        byteBufferValue6.reuse();
                        i5 = 4;
                        i6 = 6;
                        i7 = 2;
                        i8 = 1;
                        i11 = 3;
                    }
                }
                sQLiteCursor2.dispose();
                executeFast10.dispose();
            }
            messagesStorage = this;
            int i14 = 0;
            SQLiteCursor queryFinalized4 = messagesStorage.database.queryFinalized("SELECT did, last_mid, last_mid_i FROM dialogs WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast11 = messagesStorage.database.executeFast("UPDATE dialogs SET last_mid = ?, last_mid_i = ? WHERE did = ?");
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (queryFinalized4.next()) {
                long longValue12 = queryFinalized4.longValue(i14);
                int i15 = (int) longValue12;
                int i16 = (int) (longValue12 >> 32);
                if (i15 == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(i16));
                } else if (i16 == 2) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(i15));
                }
                executeFast11.requery();
                executeFast11.bindInteger(1, queryFinalized4.intValue(1));
                executeFast11.bindInteger(2, queryFinalized4.intValue(2));
                executeFast11.bindLong(3, longValue12);
                executeFast11.step();
                i14 = 0;
            }
            executeFast11.dispose();
            queryFinalized4.dispose();
            int i17 = 0;
            SQLiteCursor queryFinalized5 = messagesStorage.database.queryFinalized("SELECT uid, mid FROM unread_push_messages WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast12 = messagesStorage.database.executeFast("UPDATE unread_push_messages SET mid = ? WHERE uid = ? AND mid = ?");
            while (queryFinalized5.next()) {
                long longValue13 = queryFinalized5.longValue(i17);
                int intValue29 = queryFinalized5.intValue(1);
                executeFast12.requery();
                executeFast12.bindInteger(1, intValue29);
                executeFast12.bindLong(2, longValue13);
                executeFast12.bindInteger(3, intValue29);
                executeFast12.step();
                i17 = 0;
            }
            executeFast12.dispose();
            queryFinalized5.dispose();
            if (arrayList != null) {
                SQLitePreparedStatement executeFast13 = messagesStorage.database.executeFast("UPDATE dialogs SET did = ? WHERE did = ?");
                SQLitePreparedStatement executeFast14 = messagesStorage.database.executeFast("UPDATE dialog_filter_pin_v2 SET peer = ? WHERE peer = ?");
                SQLitePreparedStatement executeFast15 = messagesStorage.database.executeFast("UPDATE dialog_filter_ep SET peer = ? WHERE peer = ?");
                int size = arrayList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    long intValue30 = ((Integer) arrayList.get(i18)).intValue();
                    long makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(intValue30);
                    long j = intValue30 << 32;
                    executeFast13.requery();
                    executeFast13.bindLong(1, makeEncryptedDialogId);
                    executeFast13.bindLong(2, j);
                    executeFast13.step();
                    executeFast14.requery();
                    executeFast14.bindLong(1, makeEncryptedDialogId);
                    executeFast14.bindLong(2, j);
                    executeFast14.step();
                    executeFast15.requery();
                    executeFast15.bindLong(1, makeEncryptedDialogId);
                    executeFast15.bindLong(2, j);
                    executeFast15.step();
                }
                executeFast13.dispose();
                executeFast14.dispose();
                executeFast15.dispose();
            }
            if (arrayList2 != null) {
                SQLitePreparedStatement executeFast16 = messagesStorage.database.executeFast("UPDATE dialogs SET did = ? WHERE did = ?");
                int size2 = arrayList2.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    int intValue31 = ((Integer) arrayList2.get(i19)).intValue();
                    long makeFolderDialogId = DialogObject.makeFolderDialogId(intValue31);
                    executeFast16.requery();
                    executeFast16.bindLong(1, makeFolderDialogId);
                    executeFast16.bindLong(2, 8589934592L | intValue31);
                    executeFast16.step();
                }
                executeFast16.dispose();
            }
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_mid_read_out_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_date_mid_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS mid_out_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS task_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS send_state_idx_messages2;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_mention_idx_messages;").stepThis().dispose();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS messages;").stepThis().dispose();
            messagesStorage.database.commitTransaction();
            messagesStorage.database.executeFast("PRAGMA user_version = 84").stepThis().dispose();
            i4 = 84;
        }
        if (i4 == 84) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))").stepThis().dispose();
            messagesStorage.database.beginTransaction();
            try {
                sQLiteCursor = messagesStorage.database.queryFinalized("SELECT mid, uid, date, type, data FROM media_v3 WHERE 1", new Object[0]);
            } catch (Exception e8) {
                FileLog.e(e8);
                sQLiteCursor = null;
            }
            if (sQLiteCursor != null) {
                SQLitePreparedStatement executeFast17 = messagesStorage.database.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue9 = sQLiteCursor.byteBufferValue(4);
                    if (byteBufferValue9 != null) {
                        int intValue32 = sQLiteCursor.intValue(0);
                        long longValue14 = sQLiteCursor.longValue(1);
                        if (((int) longValue14) == 0) {
                            longValue14 = DialogObject.makeEncryptedDialogId((int) (longValue14 >> 32));
                        }
                        int intValue33 = sQLiteCursor.intValue(2);
                        int intValue34 = sQLiteCursor.intValue(3);
                        executeFast17.requery();
                        executeFast17.bindInteger(1, intValue32);
                        executeFast17.bindLong(2, longValue14);
                        executeFast17.bindInteger(3, intValue33);
                        executeFast17.bindInteger(4, intValue34);
                        executeFast17.bindByteBuffer(5, byteBufferValue9);
                        executeFast17.step();
                        byteBufferValue9.reuse();
                    }
                }
                sQLiteCursor.dispose();
                executeFast17.dispose();
            }
            messagesStorage.database.commitTransaction();
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS media_v3;").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 85").stepThis().dispose();
            i4 = 85;
        }
        if (i4 == 85) {
            messagesStorage.executeNoException("ALTER TABLE messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            messagesStorage.executeNoException("ALTER TABLE scheduled_messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);").stepThis().dispose();
            messagesStorage.executeNoException("UPDATE messages_v2 SET replydata = NULL");
            messagesStorage.executeNoException("UPDATE scheduled_messages_v2 SET replydata = NULL");
            messagesStorage.database.executeFast("PRAGMA user_version = 86").stepThis().dispose();
            i4 = 86;
        }
        if (i4 == 86) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS reactions(data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 87").stepThis().dispose();
            i4 = 87;
        }
        if (i4 == 87) {
            messagesStorage.database.executeFast("ALTER TABLE dialogs ADD COLUMN unread_reactions INTEGER default 0").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE reaction_mentions(message_id INTEGER PRIMARY KEY, state INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 88").stepThis().dispose();
            i4 = 88;
        }
        if (i4 == 88 || i4 == 89) {
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS reaction_mentions;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(dialog_id, message_id));").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);").stepThis().dispose();
            messagesStorage.database.executeFast("DROP INDEX IF EXISTS uid_mid_type_date_idx_media_v3").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 90").stepThis().dispose();
            i4 = 90;
        }
        if (i4 == 90 || i4 == 91) {
            messagesStorage.database.executeFast("DROP TABLE IF EXISTS downloading_documents;").stepThis().dispose();
            messagesStorage.database.executeFast("CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 92").stepThis().dispose();
            i4 = 92;
        }
        if (i4 == 92) {
            messagesStorage.database.executeFast("CREATE TABLE IF NOT EXISTS attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
            messagesStorage.database.executeFast("PRAGMA user_version = 93").stepThis().dispose();
        }
        FileLog.d("MessagesStorage db migration finished");
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateDbToLastVersion$4();
            }
        });
    }

    public void lambda$updateDbToLastVersion$3() {
        this.databaseMigrationInProgress = true;
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.onDatabaseMigration, Boolean.TRUE);
    }

    public void lambda$updateDbToLastVersion$4() {
        this.databaseMigrationInProgress = false;
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.onDatabaseMigration, Boolean.FALSE);
    }

    private void executeNoException(String str) {
        try {
            this.database.executeFast(str).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void cleanupInternal(boolean z) {
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
            int i3 = 1;
            executeFast.bindInteger(1, i);
            executeFast.bindInteger(2, i2);
            if (bArr != null) {
                i3 = bArr.length;
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i3);
            if (bArr != null) {
                nativeByteBuffer.writeBytes(bArr);
            }
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void fixNotificationSettings() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$fixNotificationSettings$8();
            }
        });
    }

    public void lambda$fixNotificationSettings$8() {
        try {
            LongSparseArray longSparseArray = new LongSparseArray();
            Map<String, ?> all = MessagesController.getNotificationsSettings(this.currentAccount).getAll();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("notify2_")) {
                    Integer num = (Integer) entry.getValue();
                    if (num.intValue() == 2 || num.intValue() == 3) {
                        String replace = key.replace("notify2_", "");
                        long j = 1;
                        if (num.intValue() != 2) {
                            Integer num2 = (Integer) all.get("notifyuntil_" + replace);
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
                FileLog.e(e2);
            }
        } catch (Throwable th) {
            FileLog.e(th);
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
                MessagesStorage.this.lambda$createPendingTask$9(andAdd, nativeByteBuffer);
            }
        });
        return andAdd;
    }

    public void lambda$createPendingTask$9(long j, NativeByteBuffer nativeByteBuffer) {
        try {
            try {
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
                executeFast.bindLong(1, j);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.step();
                executeFast.dispose();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } finally {
            nativeByteBuffer.reuse();
        }
    }

    public void removePendingTask(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$removePendingTask$10(j);
            }
        });
    }

    public void lambda$removePendingTask$10(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM pending_tasks WHERE id = " + j).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void loadPendingTasks() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadPendingTasks$30();
            }
        });
    }

    public void lambda$loadPendingTasks$30() {
        try {
            SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT id, data FROM pending_tasks WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                final long longValue = queryFinalized.longValue(0);
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    int readInt32 = byteBufferValue.readInt32(false);
                    if (readInt32 != 100) {
                        switch (readInt32) {
                            case 0:
                                final TLRPC$Chat TLdeserialize = TLRPC$Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                if (TLdeserialize != null) {
                                    Utilities.stageQueue.postRunnable(new Runnable() {
                                        @Override
                                        public final void run() {
                                            MessagesStorage.this.lambda$loadPendingTasks$11(TLdeserialize, longValue);
                                        }
                                    });
                                    break;
                                }
                                break;
                            case 1:
                                final long readInt322 = byteBufferValue.readInt32(false);
                                final int readInt323 = byteBufferValue.readInt32(false);
                                Utilities.stageQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$12(readInt322, readInt323, longValue);
                                    }
                                });
                                break;
                            case 2:
                            case 5:
                            case 8:
                            case 10:
                            case 14:
                                final TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
                                tLRPC$TL_dialog.id = byteBufferValue.readInt64(false);
                                tLRPC$TL_dialog.top_message = byteBufferValue.readInt32(false);
                                tLRPC$TL_dialog.read_inbox_max_id = byteBufferValue.readInt32(false);
                                tLRPC$TL_dialog.read_outbox_max_id = byteBufferValue.readInt32(false);
                                tLRPC$TL_dialog.unread_count = byteBufferValue.readInt32(false);
                                tLRPC$TL_dialog.last_message_date = byteBufferValue.readInt32(false);
                                tLRPC$TL_dialog.pts = byteBufferValue.readInt32(false);
                                tLRPC$TL_dialog.flags = byteBufferValue.readInt32(false);
                                if (readInt32 >= 5) {
                                    tLRPC$TL_dialog.pinned = byteBufferValue.readBool(false);
                                    tLRPC$TL_dialog.pinnedNum = byteBufferValue.readInt32(false);
                                }
                                if (readInt32 >= 8) {
                                    tLRPC$TL_dialog.unread_mentions_count = byteBufferValue.readInt32(false);
                                }
                                if (readInt32 >= 10) {
                                    tLRPC$TL_dialog.unread_mark = byteBufferValue.readBool(false);
                                }
                                if (readInt32 >= 14) {
                                    tLRPC$TL_dialog.folder_id = byteBufferValue.readInt32(false);
                                }
                                final TLRPC$InputPeer TLdeserialize2 = TLRPC$InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$13(tLRPC$TL_dialog, TLdeserialize2, longValue);
                                    }
                                });
                                break;
                            case 3:
                                getSendMessagesHelper().sendGame(TLRPC$InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), (TLRPC$TL_inputMediaGame) TLRPC$InputMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), byteBufferValue.readInt64(false), longValue);
                                break;
                            case 4:
                                final long readInt64 = byteBufferValue.readInt64(false);
                                final boolean readBool = byteBufferValue.readBool(false);
                                final TLRPC$InputPeer TLdeserialize3 = TLRPC$InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$14(readInt64, readBool, TLdeserialize3, longValue);
                                    }
                                });
                                break;
                            case 6:
                                final long readInt324 = byteBufferValue.readInt32(false);
                                final int readInt325 = byteBufferValue.readInt32(false);
                                final TLRPC$InputChannel TLdeserialize4 = TLRPC$InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                Utilities.stageQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$15(readInt324, readInt325, longValue, TLdeserialize4);
                                    }
                                });
                                break;
                            case 7:
                                final long readInt326 = byteBufferValue.readInt32(false);
                                int readInt327 = byteBufferValue.readInt32(false);
                                TLObject TLdeserialize5 = TLRPC$TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt327, false);
                                final TLObject TLdeserialize6 = TLdeserialize5 == null ? TLRPC$TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt327, false) : TLdeserialize5;
                                if (TLdeserialize6 == null) {
                                    removePendingTask(longValue);
                                    break;
                                } else {
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            MessagesStorage.this.lambda$loadPendingTasks$17(readInt326, longValue, TLdeserialize6);
                                        }
                                    });
                                    break;
                                }
                            case 9:
                                final long readInt642 = byteBufferValue.readInt64(false);
                                final TLRPC$InputPeer TLdeserialize7 = TLRPC$InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$19(readInt642, TLdeserialize7, longValue);
                                    }
                                });
                                break;
                            case 11:
                                final int readInt328 = byteBufferValue.readInt32(false);
                                final long readInt329 = byteBufferValue.readInt32(false);
                                final int readInt3210 = byteBufferValue.readInt32(false);
                                final TLRPC$InputChannel TLdeserialize8 = readInt329 != 0 ? TLRPC$InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false) : null;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$20(readInt329, readInt328, TLdeserialize8, readInt3210, longValue);
                                    }
                                });
                                break;
                            case 12:
                            case R.styleable.MapAttrs_uiTiltGestures:
                            case R.styleable.MapAttrs_uiZoomControls:
                                removePendingTask(longValue);
                                break;
                            case 13:
                                final long readInt643 = byteBufferValue.readInt64(false);
                                final boolean readBool2 = byteBufferValue.readBool(false);
                                final int readInt3211 = byteBufferValue.readInt32(false);
                                final int readInt3212 = byteBufferValue.readInt32(false);
                                final boolean readBool3 = byteBufferValue.readBool(false);
                                final TLRPC$InputPeer TLdeserialize9 = TLRPC$InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$23(readInt643, readBool2, readInt3211, readInt3212, readBool3, TLdeserialize9, longValue);
                                    }
                                });
                                break;
                            case 15:
                                final TLRPC$InputPeer TLdeserialize10 = TLRPC$InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                Utilities.stageQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$24(TLdeserialize10, longValue);
                                    }
                                });
                                break;
                            case 16:
                                final int readInt3213 = byteBufferValue.readInt32(false);
                                int readInt3214 = byteBufferValue.readInt32(false);
                                final ArrayList arrayList = new ArrayList();
                                for (int i = 0; i < readInt3214; i++) {
                                    arrayList.add(TLRPC$InputDialogPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                                }
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$25(readInt3213, arrayList, longValue);
                                    }
                                });
                                break;
                            case 17:
                                final int readInt3215 = byteBufferValue.readInt32(false);
                                int readInt3216 = byteBufferValue.readInt32(false);
                                final ArrayList arrayList2 = new ArrayList();
                                for (int i2 = 0; i2 < readInt3216; i2++) {
                                    arrayList2.add(TLRPC$TL_inputFolderPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                                }
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$26(readInt3215, arrayList2, longValue);
                                    }
                                });
                                break;
                            case R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom:
                                final long readInt644 = byteBufferValue.readInt64(false);
                                byteBufferValue.readInt32(false);
                                final TLRPC$TL_messages_deleteScheduledMessages TLdeserialize11 = TLRPC$TL_messages_deleteScheduledMessages.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                if (TLdeserialize11 == null) {
                                    removePendingTask(longValue);
                                    break;
                                } else {
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            MessagesStorage.this.lambda$loadPendingTasks$27(readInt644, longValue, TLdeserialize11);
                                        }
                                    });
                                    break;
                                }
                            case R.styleable.MapAttrs_uiZoomGestures:
                                final Theme.OverrideWallpaperInfo overrideWallpaperInfo = new Theme.OverrideWallpaperInfo();
                                byteBufferValue.readInt64(false);
                                overrideWallpaperInfo.isBlurred = byteBufferValue.readBool(false);
                                overrideWallpaperInfo.isMotion = byteBufferValue.readBool(false);
                                overrideWallpaperInfo.color = byteBufferValue.readInt32(false);
                                overrideWallpaperInfo.gradientColor1 = byteBufferValue.readInt32(false);
                                overrideWallpaperInfo.rotation = byteBufferValue.readInt32(false);
                                overrideWallpaperInfo.intensity = (float) byteBufferValue.readDouble(false);
                                final boolean readBool4 = byteBufferValue.readBool(false);
                                overrideWallpaperInfo.slug = byteBufferValue.readString(false);
                                overrideWallpaperInfo.originalFileName = byteBufferValue.readString(false);
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$22(overrideWallpaperInfo, readBool4, longValue);
                                    }
                                });
                                break;
                            case R.styleable.MapAttrs_useViewLifecycle:
                                final TLRPC$InputPeer TLdeserialize12 = TLRPC$InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$28(TLdeserialize12, longValue);
                                    }
                                });
                                break;
                            case R.styleable.MapAttrs_zOrderOnTop:
                                final long readInt645 = byteBufferValue.readInt64(false);
                                final int readInt3217 = byteBufferValue.readInt32(false);
                                final int readInt3218 = byteBufferValue.readInt32(false);
                                final TLRPC$InputChannel TLdeserialize13 = (DialogObject.isEncryptedDialog(readInt645) || !DialogObject.isChatDialog(readInt645) || !byteBufferValue.hasRemaining()) ? null : TLRPC$InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$21(readInt645, readInt3217, TLdeserialize13, readInt3218, longValue);
                                    }
                                });
                                break;
                            case 24:
                                final long readInt646 = byteBufferValue.readInt64(false);
                                int readInt3219 = byteBufferValue.readInt32(false);
                                TLObject TLdeserialize14 = TLRPC$TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3219, false);
                                final TLObject TLdeserialize15 = TLdeserialize14 == null ? TLRPC$TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3219, false) : TLdeserialize14;
                                if (TLdeserialize15 == null) {
                                    removePendingTask(longValue);
                                    break;
                                } else {
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            MessagesStorage.this.lambda$loadPendingTasks$18(readInt646, longValue, TLdeserialize15);
                                        }
                                    });
                                    break;
                                }
                            case 25:
                                final long readInt647 = byteBufferValue.readInt64(false);
                                final int readInt3220 = byteBufferValue.readInt32(false);
                                final TLRPC$InputChannel TLdeserialize16 = TLRPC$InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                Utilities.stageQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        MessagesStorage.this.lambda$loadPendingTasks$16(readInt647, readInt3220, longValue, TLdeserialize16);
                                    }
                                });
                                break;
                        }
                    } else {
                        final int readInt3221 = byteBufferValue.readInt32(false);
                        final boolean readBool5 = byteBufferValue.readBool(false);
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                MessagesStorage.this.lambda$loadPendingTasks$29(readInt3221, readBool5, longValue);
                            }
                        });
                    }
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadPendingTasks$11(TLRPC$Chat tLRPC$Chat, long j) {
        getMessagesController().loadUnknownChannel(tLRPC$Chat, j);
    }

    public void lambda$loadPendingTasks$12(long j, int i, long j2) {
        getMessagesController().getChannelDifference(j, i, j2, null);
    }

    public void lambda$loadPendingTasks$13(TLRPC$Dialog tLRPC$Dialog, TLRPC$InputPeer tLRPC$InputPeer, long j) {
        getMessagesController().checkLastDialogMessage(tLRPC$Dialog, tLRPC$InputPeer, j);
    }

    public void lambda$loadPendingTasks$14(long j, boolean z, TLRPC$InputPeer tLRPC$InputPeer, long j2) {
        getMessagesController().pinDialog(j, z, tLRPC$InputPeer, j2);
    }

    public void lambda$loadPendingTasks$15(long j, int i, long j2, TLRPC$InputChannel tLRPC$InputChannel) {
        getMessagesController().getChannelDifference(j, i, j2, tLRPC$InputChannel);
    }

    public void lambda$loadPendingTasks$16(long j, int i, long j2, TLRPC$InputChannel tLRPC$InputChannel) {
        getMessagesController().getChannelDifference(j, i, j2, tLRPC$InputChannel);
    }

    public void lambda$loadPendingTasks$17(long j, long j2, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, -j, true, false, false, j2, tLObject);
    }

    public void lambda$loadPendingTasks$18(long j, long j2, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, j, true, false, false, j2, tLObject);
    }

    public void lambda$loadPendingTasks$19(long j, TLRPC$InputPeer tLRPC$InputPeer, long j2) {
        getMessagesController().markDialogAsUnread(j, tLRPC$InputPeer, j2);
    }

    public void lambda$loadPendingTasks$20(long j, int i, TLRPC$InputChannel tLRPC$InputChannel, int i2, long j2) {
        getMessagesController().markMessageAsRead2(-j, i, tLRPC$InputChannel, i2, j2);
    }

    public void lambda$loadPendingTasks$21(long j, int i, TLRPC$InputChannel tLRPC$InputChannel, int i2, long j2) {
        getMessagesController().markMessageAsRead2(j, i, tLRPC$InputChannel, i2, j2);
    }

    public void lambda$loadPendingTasks$22(Theme.OverrideWallpaperInfo overrideWallpaperInfo, boolean z, long j) {
        getMessagesController().saveWallpaperToServer(null, overrideWallpaperInfo, z, j);
    }

    public void lambda$loadPendingTasks$23(long j, boolean z, int i, int i2, boolean z2, TLRPC$InputPeer tLRPC$InputPeer, long j2) {
        getMessagesController().deleteDialog(j, z ? 1 : 0, i, i2, z2, tLRPC$InputPeer, j2);
    }

    public void lambda$loadPendingTasks$24(TLRPC$InputPeer tLRPC$InputPeer, long j) {
        getMessagesController().loadUnknownDialog(tLRPC$InputPeer, j);
    }

    public void lambda$loadPendingTasks$25(int i, ArrayList arrayList, long j) {
        getMessagesController().reorderPinnedDialogs(i, arrayList, j);
    }

    public void lambda$loadPendingTasks$26(int i, ArrayList arrayList, long j) {
        getMessagesController().addDialogToFolder(null, i, -1, arrayList, j);
    }

    public void lambda$loadPendingTasks$27(long j, long j2, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, j, true, true, false, j2, tLObject);
    }

    public void lambda$loadPendingTasks$28(TLRPC$InputPeer tLRPC$InputPeer, long j) {
        getMessagesController().reloadMentionsCountForChannel(tLRPC$InputPeer, j);
    }

    public void lambda$loadPendingTasks$29(int i, boolean z, long j) {
        getSecretChatHelper().declineSecretChat(i, z, j);
    }

    public void saveChannelPts(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveChannelPts$31(i, j);
            }
        });
    }

    public void lambda$saveChannelPts$31(int i, long j) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
            executeFast.bindInteger(1, i);
            executeFast.bindLong(2, -j);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$saveDiffParams$32(int i, int i2, int i3, int i4) {
        try {
            if (this.lastSavedSeq != i || this.lastSavedPts != i2 || this.lastSavedDate != i3 || this.lastQtsValue != i4) {
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
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void saveDiffParams(final int i, final int i2, final int i3, final int i4) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveDiffParams$32(i, i2, i3, i4);
            }
        });
    }

    public void lambda$updateMutedDialogsFiltersCounters$33() {
        resetAllUnreadCounters(true);
    }

    public void updateMutedDialogsFiltersCounters() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMutedDialogsFiltersCounters$33();
            }
        });
    }

    public void setDialogFlags(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setDialogFlags$34(j, j2);
            }
        });
    }

    public void lambda$setDialogFlags$34(long j, long j2) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT flags FROM dialog_settings WHERE did = " + j, new Object[0]);
            int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            if (j2 != intValue) {
                this.database.executeFast(String.format(Locale.US, "REPLACE INTO dialog_settings VALUES(%d, %d)", Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
                resetAllUnreadCounters(true);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void putPushMessage(final MessageObject messageObject) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putPushMessage$35(messageObject);
            }
        });
    }

    public void lambda$putPushMessage$35(MessageObject messageObject) {
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(nativeByteBuffer);
            int i = 0;
            if (messageObject.localType == 2) {
                i = 1;
            }
            if (messageObject.localChannel) {
                i |= 2;
            }
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void clearLocalDatabase() {
        getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearLocalDatabase$37();
            }
        });
    }

    public void lambda$clearLocalDatabase$37() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$clearLocalDatabase$37():void");
    }

    public void lambda$clearLocalDatabase$36() {
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didClearDatabase, new Object[0]);
        getMediaDataController().loadAttachMenuBots(false, true);
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
                MessagesStorage.this.lambda$readAllDialogs$39(i);
            }
        });
    }

    public void lambda$readAllDialogs$39(int i) {
        SQLiteCursor sQLiteCursor;
        try {
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            final LongSparseArray longSparseArray = new LongSparseArray();
            if (i >= 0) {
                sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i)), new Object[0]);
            } else {
                sQLiteCursor = this.database.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
            }
            while (sQLiteCursor.next()) {
                long longValue = sQLiteCursor.longValue(0);
                if (!DialogObject.isFolderDialogId(longValue)) {
                    ReadDialog readDialog = new ReadDialog();
                    readDialog.lastMid = sQLiteCursor.intValue(1);
                    readDialog.unreadCount = sQLiteCursor.intValue(2);
                    readDialog.date = sQLiteCursor.intValue(3);
                    longSparseArray.put(longValue, readDialog);
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                        if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                            arrayList3.add(Integer.valueOf(encryptedChatId));
                        }
                    } else if (DialogObject.isChatDialog(longValue)) {
                        long j = -longValue;
                        if (!arrayList2.contains(Long.valueOf(j))) {
                            arrayList2.add(Long.valueOf(j));
                        }
                    } else if (!arrayList.contains(Long.valueOf(longValue))) {
                        arrayList.add(Long.valueOf(longValue));
                    }
                }
            }
            sQLiteCursor.dispose();
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
                    MessagesStorage.this.lambda$readAllDialogs$38(arrayList4, arrayList5, arrayList6, longSparseArray);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$readAllDialogs$38(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, LongSparseArray longSparseArray) {
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

    private TLRPC$messages_Dialogs loadDialogsByIds(String str, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, ArrayList<Integer> arrayList3) throws Exception {
        int i;
        TLRPC$Message tLRPC$Message;
        NativeByteBuffer byteBufferValue;
        TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
        LongSparseArray longSparseArray = new LongSparseArray();
        boolean z = false;
        SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, s.flags, m.date, d.pts, d.inbox_max, d.outbox_max, m.replydata, d.pinned, d.unread_count_i, d.flags, d.folder_id, d.data, d.unread_reactions FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid LEFT JOIN dialog_settings as s ON d.did = s.did WHERE d.did IN (%s) ORDER BY d.pinned DESC, d.date DESC", str), new Object[0]);
        while (true) {
            i = 2;
            if (!queryFinalized.next()) {
                break;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            long longValue = queryFinalized.longValue(i2);
            TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
            tLRPC$TL_dialog.id = longValue;
            tLRPC$TL_dialog.top_message = queryFinalized.intValue(1);
            tLRPC$TL_dialog.unread_count = queryFinalized.intValue(2);
            tLRPC$TL_dialog.last_message_date = queryFinalized.intValue(3);
            int intValue = queryFinalized.intValue(10);
            tLRPC$TL_dialog.pts = intValue;
            tLRPC$TL_dialog.flags = (intValue == 0 || DialogObject.isUserDialog(tLRPC$TL_dialog.id)) ? 0 : 1;
            tLRPC$TL_dialog.read_inbox_max_id = queryFinalized.intValue(11);
            tLRPC$TL_dialog.read_outbox_max_id = queryFinalized.intValue(12);
            int intValue2 = queryFinalized.intValue(14);
            tLRPC$TL_dialog.pinnedNum = intValue2;
            tLRPC$TL_dialog.pinned = intValue2 != 0;
            tLRPC$TL_dialog.unread_mentions_count = queryFinalized.intValue(15);
            tLRPC$TL_dialog.unread_mark = (queryFinalized.intValue(16) & 1) != 0;
            long longValue2 = queryFinalized.longValue(8);
            TLRPC$TL_peerNotifySettings tLRPC$TL_peerNotifySettings = new TLRPC$TL_peerNotifySettings();
            tLRPC$TL_dialog.notify_settings = tLRPC$TL_peerNotifySettings;
            if ((((int) longValue2) & 1) != 0) {
                int i4 = (int) (longValue2 >> 32);
                tLRPC$TL_peerNotifySettings.mute_until = i4;
                if (i4 == 0) {
                    tLRPC$TL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
            }
            tLRPC$TL_dialog.folder_id = queryFinalized.intValue(17);
            tLRPC$TL_dialog.unread_reactions_count = queryFinalized.intValue(19);
            tLRPC$TL_messages_dialogs.dialogs.add(tLRPC$TL_dialog);
            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(4);
            if (byteBufferValue2 != null) {
                TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(z), z);
                if (TLdeserialize != null) {
                    TLdeserialize.readAttachPath(byteBufferValue2, getUserConfig().clientUserId);
                    byteBufferValue2.reuse();
                    MessageObject.setUnreadFlags(TLdeserialize, queryFinalized.intValue(5));
                    TLdeserialize.id = queryFinalized.intValue(6);
                    int intValue3 = queryFinalized.intValue(9);
                    if (intValue3 != 0) {
                        tLRPC$TL_dialog.last_message_date = intValue3;
                    }
                    TLdeserialize.send_state = queryFinalized.intValue(7);
                    TLdeserialize.dialog_id = tLRPC$TL_dialog.id;
                    tLRPC$TL_messages_dialogs.messages.add(TLdeserialize);
                    addUsersAndChatsFromMessage(TLdeserialize, arrayList, arrayList2);
                    try {
                        TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = TLdeserialize.reply_to;
                        if (!(tLRPC$TL_messageReplyHeader == null || tLRPC$TL_messageReplyHeader.reply_to_msg_id == 0)) {
                            TLRPC$MessageAction tLRPC$MessageAction = TLdeserialize.action;
                            if ((tLRPC$MessageAction instanceof TLRPC$TL_messageActionPinMessage) || (tLRPC$MessageAction instanceof TLRPC$TL_messageActionPaymentSent) || (tLRPC$MessageAction instanceof TLRPC$TL_messageActionGameScore)) {
                                if (queryFinalized.isNull(13) || (byteBufferValue = queryFinalized.byteBufferValue(13)) == null) {
                                    tLRPC$Message = TLdeserialize;
                                } else {
                                    TLRPC$Message TLdeserialize2 = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z), z);
                                    TLdeserialize.replyMessage = TLdeserialize2;
                                    TLdeserialize2.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                                    byteBufferValue.reuse();
                                    tLRPC$Message = TLdeserialize;
                                    TLRPC$Message tLRPC$Message2 = tLRPC$Message.replyMessage;
                                    if (tLRPC$Message2 != null) {
                                        addUsersAndChatsFromMessage(tLRPC$Message2, arrayList, arrayList2);
                                    }
                                }
                                if (tLRPC$Message.replyMessage == null) {
                                    longSparseArray.put(tLRPC$TL_dialog.id, tLRPC$Message);
                                }
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else {
                    byteBufferValue2.reuse();
                }
            }
            if (DialogObject.isEncryptedDialog(longValue)) {
                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                    arrayList3.add(Integer.valueOf(encryptedChatId));
                }
            } else if (!DialogObject.isUserDialog(longValue)) {
                long j = -longValue;
                if (!arrayList2.contains(Long.valueOf(j))) {
                    arrayList2.add(Long.valueOf(j));
                }
            } else if (!arrayList.contains(Long.valueOf(longValue))) {
                arrayList.add(Long.valueOf(longValue));
            }
            z = false;
        }
        queryFinalized.dispose();
        if (!longSparseArray.isEmpty()) {
            int size = longSparseArray.size();
            int i5 = 0;
            while (i5 < size) {
                long keyAt = longSparseArray.keyAt(i5);
                TLRPC$Message tLRPC$Message3 = (TLRPC$Message) longSparseArray.valueAt(i5);
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                Object[] objArr = new Object[i];
                objArr[0] = Integer.valueOf(tLRPC$Message3.id);
                objArr[1] = Long.valueOf(keyAt);
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT data, mid, date, uid FROM messages_v2 WHERE mid = %d and uid = %d", objArr), new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue3 = queryFinalized2.byteBufferValue(0);
                    if (byteBufferValue3 != null) {
                        TLRPC$Message TLdeserialize3 = TLRPC$Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                        TLdeserialize3.readAttachPath(byteBufferValue3, getUserConfig().clientUserId);
                        byteBufferValue3.reuse();
                        TLdeserialize3.id = queryFinalized2.intValue(1);
                        TLdeserialize3.date = queryFinalized2.intValue(2);
                        TLdeserialize3.dialog_id = queryFinalized2.longValue(3);
                        addUsersAndChatsFromMessage(TLdeserialize3, arrayList, arrayList2);
                        tLRPC$Message3.replyMessage = TLdeserialize3;
                        TLdeserialize3.dialog_id = tLRPC$Message3.dialog_id;
                    }
                }
                queryFinalized2.dispose();
                i5++;
                i = 2;
            }
        }
        return tLRPC$TL_messages_dialogs;
    }

    private void loadDialogFilters() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadDialogFilters$41();
            }
        });
    }

    public void lambda$loadDialogFilters$41() {
        TLRPC$messages_Dialogs tLRPC$messages_Dialogs;
        SQLiteCursor sQLiteCursor;
        try {
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            arrayList.add(Long.valueOf(getUserConfig().getClientUserId()));
            int i = 0;
            SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT id, ord, unread_count, flags, title FROM dialog_filter WHERE 1", new Object[0]);
            boolean z = false;
            while (queryFinalized.next()) {
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                dialogFilter.id = queryFinalized.intValue(i);
                dialogFilter.order = queryFinalized.intValue(1);
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                dialogFilter.flags = queryFinalized.intValue(3);
                dialogFilter.name = queryFinalized.stringValue(4);
                this.dialogFilters.add(dialogFilter);
                this.dialogFiltersMap.put(dialogFilter.id, dialogFilter);
                sparseArray.put(dialogFilter.id, dialogFilter);
                if (dialogFilter.pendingUnreadCount < 0) {
                    z = true;
                }
                int i2 = 0;
                while (i2 < 2) {
                    if (i2 == 0) {
                        SQLiteDatabase sQLiteDatabase = this.database;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT peer, pin FROM dialog_filter_pin_v2 WHERE id = " + dialogFilter.id, new Object[i]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT peer FROM dialog_filter_ep WHERE id = " + dialogFilter.id, new Object[i]);
                    }
                    while (sQLiteCursor.next()) {
                        long longValue = sQLiteCursor.longValue(i);
                        if (i2 == 0) {
                            if (!DialogObject.isEncryptedDialog(longValue)) {
                                dialogFilter.alwaysShow.add(Long.valueOf(longValue));
                            }
                            int intValue = sQLiteCursor.intValue(1);
                            if (intValue != Integer.MIN_VALUE) {
                                dialogFilter.pinnedDialogs.put(longValue, intValue);
                                if (!arrayList4.contains(Long.valueOf(longValue))) {
                                    arrayList4.add(Long.valueOf(longValue));
                                }
                            }
                        } else if (!DialogObject.isEncryptedDialog(longValue)) {
                            dialogFilter.neverShow.add(Long.valueOf(longValue));
                        }
                        if (DialogObject.isChatDialog(longValue)) {
                            long j = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j))) {
                                arrayList2.add(Long.valueOf(j));
                            }
                        } else if (!DialogObject.isUserDialog(longValue)) {
                            int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                            if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                arrayList3.add(Integer.valueOf(encryptedChatId));
                            }
                        } else if (!arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                        }
                        i = 0;
                    }
                    sQLiteCursor.dispose();
                    i2++;
                    i = 0;
                }
            }
            queryFinalized.dispose();
            Collections.sort(this.dialogFilters, MessagesStorage$$ExternalSyntheticLambda194.INSTANCE);
            if (z) {
                calcUnreadCounters(true);
            }
            if (!arrayList4.isEmpty()) {
                tLRPC$messages_Dialogs = loadDialogsByIds(TextUtils.join(",", arrayList4), arrayList, arrayList2, arrayList3);
            } else {
                tLRPC$messages_Dialogs = new TLRPC$TL_messages_dialogs();
            }
            TLRPC$messages_Dialogs tLRPC$messages_Dialogs2 = tLRPC$messages_Dialogs;
            ArrayList<TLRPC$User> arrayList5 = new ArrayList<>();
            ArrayList<TLRPC$Chat> arrayList6 = new ArrayList<>();
            ArrayList<TLRPC$EncryptedChat> arrayList7 = new ArrayList<>();
            if (!arrayList3.isEmpty()) {
                getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList7, arrayList);
            }
            if (!arrayList.isEmpty()) {
                getUsersInternal(TextUtils.join(",", arrayList), arrayList5);
            }
            if (!arrayList2.isEmpty()) {
                getChatsInternal(TextUtils.join(",", arrayList2), arrayList6);
            }
            getMessagesController().processLoadedDialogFilters(new ArrayList<>(this.dialogFilters), tLRPC$messages_Dialogs2, null, arrayList5, arrayList6, arrayList7, 0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static int lambda$loadDialogFilters$40(MessagesController.DialogFilter dialogFilter, MessagesController.DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    private void calcUnreadCounters(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.calcUnreadCounters(boolean):void");
    }

    private void saveDialogFilterInternal(MessagesController.DialogFilter dialogFilter, boolean z, boolean z2) {
        try {
            if (!this.dialogFilters.contains(dialogFilter)) {
                if (z) {
                    this.dialogFilters.add(0, dialogFilter);
                } else {
                    this.dialogFilters.add(dialogFilter);
                }
                this.dialogFiltersMap.put(dialogFilter.id, dialogFilter);
            }
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?)");
            executeFast.bindInteger(1, dialogFilter.id);
            executeFast.bindInteger(2, dialogFilter.order);
            executeFast.bindInteger(3, dialogFilter.unreadCount);
            executeFast.bindInteger(4, dialogFilter.flags);
            executeFast.bindString(5, dialogFilter.name);
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
                for (int i = 0; i < size; i++) {
                    long longValue = dialogFilter.alwaysShow.get(i).longValue();
                    executeFast2.requery();
                    executeFast2.bindInteger(1, dialogFilter.id);
                    executeFast2.bindLong(2, longValue);
                    executeFast2.bindInteger(3, dialogFilter.pinnedDialogs.get(longValue, Integer.MIN_VALUE));
                    executeFast2.step();
                }
                int size2 = dialogFilter.pinnedDialogs.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    long keyAt = dialogFilter.pinnedDialogs.keyAt(i2);
                    if (DialogObject.isEncryptedDialog(keyAt)) {
                        executeFast2.requery();
                        executeFast2.bindInteger(1, dialogFilter.id);
                        executeFast2.bindLong(2, keyAt);
                        executeFast2.bindInteger(3, dialogFilter.pinnedDialogs.valueAt(i2));
                        executeFast2.step();
                    }
                }
                executeFast2.dispose();
                SQLitePreparedStatement executeFast3 = this.database.executeFast("REPLACE INTO dialog_filter_ep VALUES(?, ?)");
                int size3 = dialogFilter.neverShow.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    executeFast3.requery();
                    executeFast3.bindInteger(1, dialogFilter.id);
                    executeFast3.bindLong(2, dialogFilter.neverShow.get(i3).longValue());
                    executeFast3.step();
                }
                executeFast3.dispose();
                this.database.commitTransaction();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void checkLoadedRemoteFilters(final TLRPC$Vector tLRPC$Vector) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$checkLoadedRemoteFilters$43(tLRPC$Vector);
            }
        });
    }

    public void lambda$checkLoadedRemoteFilters$43(org.telegram.tgnet.TLRPC$Vector r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkLoadedRemoteFilters$43(org.telegram.tgnet.TLRPC$Vector):void");
    }

    public static int lambda$checkLoadedRemoteFilters$42(LongSparseIntArray longSparseIntArray, Long l, Long l2) {
        int i = longSparseIntArray.get(l.longValue());
        int i2 = longSparseIntArray.get(l2.longValue());
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void lambda$processLoadedFilterPeers$45(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, ArrayList<TLRPC$User> arrayList, ArrayList<TLRPC$Chat> arrayList2, ArrayList<MessagesController.DialogFilter> arrayList3, SparseArray<MessagesController.DialogFilter> sparseArray, ArrayList<Integer> arrayList4, HashMap<Integer, HashSet<Long>> hashMap, HashMap<Integer, HashSet<Long>> hashMap2, HashSet<Integer> hashSet) {
        putUsersAndChats(arrayList, arrayList2, true, false);
        int size = sparseArray.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            lambda$deleteDialogFilter$46(sparseArray.valueAt(i));
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
        for (Map.Entry<Integer, HashSet<Long>> entry : hashMap2.entrySet()) {
            MessagesController.DialogFilter dialogFilter2 = this.dialogFiltersMap.get(entry.getKey().intValue());
            if (dialogFilter2 != null) {
                HashSet<Long> value = entry.getValue();
                dialogFilter2.alwaysShow.removeAll(value);
                dialogFilter2.neverShow.removeAll(value);
                z = true;
            }
        }
        for (Map.Entry<Integer, HashSet<Long>> entry2 : hashMap.entrySet()) {
            MessagesController.DialogFilter dialogFilter3 = this.dialogFiltersMap.get(entry2.getKey().intValue());
            if (dialogFilter3 != null) {
                Iterator<Long> it2 = entry2.getValue().iterator();
                while (it2.hasNext()) {
                    dialogFilter3.pinnedDialogs.delete(it2.next().longValue());
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
            MessagesController.DialogFilter dialogFilter4 = this.dialogFilters.get(i3);
            int indexOf = arrayList4.indexOf(Integer.valueOf(dialogFilter4.id));
            if (dialogFilter4.order != indexOf) {
                dialogFilter4.order = indexOf;
                z2 = true;
                z = true;
            }
        }
        if (z2) {
            Collections.sort(this.dialogFilters, MessagesStorage$$ExternalSyntheticLambda195.INSTANCE);
            saveDialogFiltersOrderInternal();
        }
        int i4 = z ? 1 : 2;
        calcUnreadCounters(true);
        getMessagesController().processLoadedDialogFilters(new ArrayList<>(this.dialogFilters), tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, null, i4);
    }

    public static int lambda$processLoadedFilterPeersInternal$44(MessagesController.DialogFilter dialogFilter, MessagesController.DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void processLoadedFilterPeers(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList, final ArrayList<TLRPC$Chat> arrayList2, final ArrayList<MessagesController.DialogFilter> arrayList3, final SparseArray<MessagesController.DialogFilter> sparseArray, final ArrayList<Integer> arrayList4, final HashMap<Integer, HashSet<Long>> hashMap, final HashMap<Integer, HashSet<Long>> hashMap2, final HashSet<Integer> hashSet) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$processLoadedFilterPeers$45(tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap, hashMap2, hashSet);
            }
        });
    }

    public void lambda$deleteDialogFilter$46(MessagesController.DialogFilter dialogFilter) {
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
            FileLog.e(e);
        }
    }

    public void deleteDialogFilter(final MessagesController.DialogFilter dialogFilter) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteDialogFilter$46(dialogFilter);
            }
        });
    }

    public void saveDialogFilter(final MessagesController.DialogFilter dialogFilter, final boolean z, final boolean z2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveDialogFilter$48(dialogFilter, z, z2);
            }
        });
    }

    public void lambda$saveDialogFilter$48(MessagesController.DialogFilter dialogFilter, boolean z, boolean z2) {
        saveDialogFilterInternal(dialogFilter, z, z2);
        calcUnreadCounters(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveDialogFilter$47();
            }
        });
    }

    public void lambda$saveDialogFilter$47() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).unreadCount = arrayList.get(i).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE));
    }

    public void saveDialogFiltersOrderInternal() {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialog_filter SET ord = ?, flags = ? WHERE id = ?");
            int size = this.dialogFilters.size();
            for (int i = 0; i < size; i++) {
                MessagesController.DialogFilter dialogFilter = this.dialogFilters.get(i);
                executeFast.requery();
                executeFast.bindInteger(1, dialogFilter.order);
                executeFast.bindInteger(2, dialogFilter.flags);
                executeFast.bindInteger(3, dialogFilter.id);
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void saveDialogFiltersOrder() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.saveDialogFiltersOrderInternal();
            }
        });
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

    protected void loadReplyMessages(LongSparseArray<SparseArray<ArrayList<TLRPC$Message>>> longSparseArray, LongSparseArray<ArrayList<Integer>> longSparseArray2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, boolean z) throws SQLiteException {
        SQLiteCursor sQLiteCursor;
        if (!longSparseArray.isEmpty()) {
            int size = longSparseArray.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                long keyAt = longSparseArray.keyAt(i2);
                SparseArray<ArrayList<TLRPC$Message>> valueAt = longSparseArray.valueAt(i2);
                ArrayList<Integer> arrayList3 = longSparseArray2.get(keyAt);
                if (arrayList3 != null) {
                    if (z) {
                        SQLiteDatabase sQLiteDatabase = this.database;
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[2];
                        objArr[i] = TextUtils.join(",", arrayList3);
                        objArr[1] = Long.valueOf(keyAt);
                        sQLiteCursor = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(%s) AND uid = %d", objArr), new Object[i]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        Locale locale2 = Locale.US;
                        Object[] objArr2 = new Object[2];
                        objArr2[i] = TextUtils.join(",", arrayList3);
                        objArr2[1] = Long.valueOf(keyAt);
                        sQLiteCursor = sQLiteDatabase2.queryFinalized(String.format(locale2, "SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(%s) AND uid = %d", objArr2), new Object[i]);
                    }
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(i);
                        if (byteBufferValue != null) {
                            TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i), i);
                            TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                            byteBufferValue.reuse();
                            TLdeserialize.id = sQLiteCursor.intValue(1);
                            TLdeserialize.date = sQLiteCursor.intValue(2);
                            TLdeserialize.dialog_id = sQLiteCursor.longValue(3);
                            addUsersAndChatsFromMessage(TLdeserialize, arrayList, arrayList2);
                            ArrayList<TLRPC$Message> arrayList4 = valueAt.get(TLdeserialize.id);
                            if (arrayList4 != null) {
                                int size2 = arrayList4.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    arrayList4.get(i3).replyMessage = TLdeserialize;
                                    MessageObject.getDialogId(TLdeserialize);
                                }
                            }
                        }
                        i = 0;
                    }
                    sQLiteCursor.dispose();
                }
                i2++;
                i = 0;
            }
        }
    }

    public void loadUnreadMessages() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadUnreadMessages$50();
            }
        });
    }

    public void lambda$loadUnreadMessages$50() {
        String str;
        ArrayList arrayList;
        ArrayList<TLRPC$Chat> arrayList2;
        ArrayList<TLRPC$User> arrayList3;
        ArrayList<TLRPC$EncryptedChat> arrayList4;
        final LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        ArrayList<TLRPC$EncryptedChat> arrayList5;
        LongSparseArray longSparseArray3;
        ArrayList<TLRPC$User> arrayList6;
        String str2;
        int i;
        Exception e;
        TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader;
        NativeByteBuffer byteBufferValue;
        try {
            ArrayList<Long> arrayList7 = new ArrayList<>();
            ArrayList<Long> arrayList8 = new ArrayList<>();
            ArrayList arrayList9 = new ArrayList();
            LongSparseArray longSparseArray4 = new LongSparseArray();
            SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT d.did, d.unread_count, s.flags FROM dialogs as d LEFT JOIN dialog_settings as s ON d.did = s.did WHERE d.unread_count > 0", new Object[0]);
            StringBuilder sb = new StringBuilder();
            int currentTime = getConnectionsManager().getCurrentTime();
            while (true) {
                str = ",";
                if (!queryFinalized.next()) {
                    break;
                }
                long longValue = queryFinalized.longValue(2);
                boolean z = (longValue & 1) != 0;
                int i2 = (int) (longValue >> 32);
                if (queryFinalized.isNull(2) || !z || (i2 != 0 && i2 < currentTime)) {
                    long longValue2 = queryFinalized.longValue(0);
                    if (!DialogObject.isFolderDialogId(longValue2)) {
                        longSparseArray4.put(longValue2, Integer.valueOf(queryFinalized.intValue(1)));
                        if (sb.length() != 0) {
                            sb.append(str);
                        }
                        sb.append(longValue2);
                        if (DialogObject.isEncryptedDialog(longValue2)) {
                            int encryptedChatId = DialogObject.getEncryptedChatId(longValue2);
                            if (!arrayList9.contains(Integer.valueOf(encryptedChatId))) {
                                arrayList9.add(Integer.valueOf(encryptedChatId));
                            }
                        } else if (!DialogObject.isUserDialog(longValue2)) {
                            long j = -longValue2;
                            if (!arrayList8.contains(Long.valueOf(j))) {
                                arrayList8.add(Long.valueOf(j));
                            }
                        } else if (!arrayList7.contains(Long.valueOf(longValue2))) {
                            arrayList7.add(Long.valueOf(longValue2));
                        }
                    }
                }
            }
            queryFinalized.dispose();
            LongSparseArray<SparseArray<ArrayList<TLRPC$Message>>> longSparseArray5 = new LongSparseArray<>();
            LongSparseArray<ArrayList<Integer>> longSparseArray6 = new LongSparseArray<>();
            final ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            ArrayList<TLRPC$User> arrayList12 = new ArrayList<>();
            ArrayList<TLRPC$Chat> arrayList13 = new ArrayList<>();
            ArrayList<TLRPC$EncryptedChat> arrayList14 = new ArrayList<>();
            if (sb.length() > 0) {
                SQLiteCursor queryFinalized2 = this.database.queryFinalized("SELECT read_state, data, send_state, mid, date, uid, replydata FROM messages_v2 WHERE uid IN (" + sb.toString() + ") AND out = 0 AND read_state IN(0,2) ORDER BY date DESC LIMIT 50", new Object[0]);
                int i3 = 0;
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(1);
                    if (byteBufferValue2 != null) {
                        arrayList6 = arrayList12;
                        TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                        longSparseArray3 = longSparseArray4;
                        TLdeserialize.readAttachPath(byteBufferValue2, getUserConfig().clientUserId);
                        byteBufferValue2.reuse();
                        MessageObject.setUnreadFlags(TLdeserialize, queryFinalized2.intValue(0));
                        TLdeserialize.id = queryFinalized2.intValue(3);
                        TLdeserialize.date = queryFinalized2.intValue(4);
                        str2 = str;
                        TLdeserialize.dialog_id = queryFinalized2.longValue(5);
                        arrayList10.add(TLdeserialize);
                        int max = Math.max(i3, TLdeserialize.date);
                        addUsersAndChatsFromMessage(TLdeserialize, arrayList7, arrayList8);
                        TLdeserialize.send_state = queryFinalized2.intValue(2);
                        if ((TLdeserialize.peer_id.channel_id == 0 && !MessageObject.isUnread(TLdeserialize) && !DialogObject.isEncryptedDialog(TLdeserialize.dialog_id)) || TLdeserialize.id > 0) {
                            TLdeserialize.send_state = 0;
                        }
                        if (DialogObject.isEncryptedDialog(TLdeserialize.dialog_id) && !queryFinalized2.isNull(5)) {
                            TLdeserialize.random_id = queryFinalized2.longValue(5);
                        }
                        try {
                            tLRPC$TL_messageReplyHeader = TLdeserialize.reply_to;
                        } catch (Exception e2) {
                            e = e2;
                            i = max;
                        }
                        if (!(tLRPC$TL_messageReplyHeader == null || tLRPC$TL_messageReplyHeader.reply_to_msg_id == 0)) {
                            TLRPC$MessageAction tLRPC$MessageAction = TLdeserialize.action;
                            if ((tLRPC$MessageAction instanceof TLRPC$TL_messageActionPinMessage) || (tLRPC$MessageAction instanceof TLRPC$TL_messageActionPaymentSent) || (tLRPC$MessageAction instanceof TLRPC$TL_messageActionGameScore)) {
                                if (queryFinalized2.isNull(6) || (byteBufferValue = queryFinalized2.byteBufferValue(6)) == null) {
                                    i = max;
                                } else {
                                    TLRPC$Message TLdeserialize2 = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    TLdeserialize.replyMessage = TLdeserialize2;
                                    i = max;
                                    try {
                                        TLdeserialize2.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                                        byteBufferValue.reuse();
                                        TLRPC$Message tLRPC$Message = TLdeserialize.replyMessage;
                                        if (tLRPC$Message != null) {
                                            addUsersAndChatsFromMessage(tLRPC$Message, arrayList7, arrayList8);
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        FileLog.e(e);
                                        i3 = i;
                                        str = str2;
                                        arrayList12 = arrayList6;
                                        longSparseArray4 = longSparseArray3;
                                    }
                                }
                                if (TLdeserialize.replyMessage == null) {
                                    addReplyMessages(TLdeserialize, longSparseArray5, longSparseArray6);
                                }
                                i3 = i;
                            }
                        }
                        i = max;
                        i3 = i;
                    } else {
                        arrayList6 = arrayList12;
                        longSparseArray3 = longSparseArray4;
                        str2 = str;
                    }
                    str = str2;
                    arrayList12 = arrayList6;
                    longSparseArray4 = longSparseArray3;
                }
                arrayList3 = arrayList12;
                LongSparseArray longSparseArray7 = longSparseArray4;
                String str3 = str;
                queryFinalized2.dispose();
                this.database.executeFast("DELETE FROM unread_push_messages WHERE date <= " + i3).stepThis().dispose();
                boolean z2 = false;
                SQLiteCursor queryFinalized3 = this.database.queryFinalized("SELECT data, mid, date, uid, random, fm, name, uname, flags FROM unread_push_messages WHERE 1 ORDER BY date DESC LIMIT 50", new Object[0]);
                while (queryFinalized3.next()) {
                    int i4 = z2 ? 1 : 0;
                    int i5 = z2 ? 1 : 0;
                    NativeByteBuffer byteBufferValue3 = queryFinalized3.byteBufferValue(i4);
                    if (byteBufferValue3 != null) {
                        TLRPC$Message TLdeserialize3 = TLRPC$Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(z2), z2);
                        byteBufferValue3.reuse();
                        TLdeserialize3.id = queryFinalized3.intValue(1);
                        TLdeserialize3.date = queryFinalized3.intValue(2);
                        TLdeserialize3.dialog_id = queryFinalized3.longValue(3);
                        ArrayList<TLRPC$EncryptedChat> arrayList15 = arrayList14;
                        TLdeserialize3.random_id = queryFinalized3.longValue(4);
                        String stringValue = queryFinalized3.isNull(5) ? null : queryFinalized3.stringValue(5);
                        String stringValue2 = queryFinalized3.isNull(6) ? null : queryFinalized3.stringValue(6);
                        String stringValue3 = queryFinalized3.isNull(7) ? null : queryFinalized3.stringValue(7);
                        int intValue = queryFinalized3.intValue(8);
                        if (MessageObject.getFromChatId(TLdeserialize3) != 0 || !DialogObject.isUserDialog(TLdeserialize3.dialog_id)) {
                            arrayList5 = arrayList15;
                        } else {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            TLdeserialize3.from_id = tLRPC$TL_peerUser;
                            arrayList5 = arrayList15;
                            tLRPC$TL_peerUser.user_id = TLdeserialize3.dialog_id;
                        }
                        if (DialogObject.isUserDialog(TLdeserialize3.dialog_id)) {
                            if (!arrayList7.contains(Long.valueOf(TLdeserialize3.dialog_id))) {
                                arrayList7.add(Long.valueOf(TLdeserialize3.dialog_id));
                            }
                        } else if (DialogObject.isChatDialog(TLdeserialize3.dialog_id) && !arrayList8.contains(Long.valueOf(-TLdeserialize3.dialog_id))) {
                            arrayList8.add(Long.valueOf(-TLdeserialize3.dialog_id));
                        }
                        arrayList11.add(new MessageObject(this.currentAccount, TLdeserialize3, stringValue, stringValue2, stringValue3, (intValue & 1) != 0, (intValue & 2) != 0, (TLdeserialize3.flags & Integer.MIN_VALUE) != 0, false));
                        addUsersAndChatsFromMessage(TLdeserialize3, arrayList7, arrayList8);
                    } else {
                        arrayList5 = arrayList14;
                    }
                    arrayList14 = arrayList5;
                    z2 = false;
                }
                arrayList4 = arrayList14;
                queryFinalized3.dispose();
                arrayList = arrayList11;
                arrayList2 = arrayList13;
                loadReplyMessages(longSparseArray5, longSparseArray6, arrayList7, arrayList8, false);
                if (!arrayList9.isEmpty()) {
                    getEncryptedChatsInternal(TextUtils.join(str3, arrayList9), arrayList4, arrayList7);
                }
                if (!arrayList7.isEmpty()) {
                    getUsersInternal(TextUtils.join(str3, arrayList7), arrayList3);
                }
                if (!arrayList8.isEmpty()) {
                    getChatsInternal(TextUtils.join(str3, arrayList8), arrayList2);
                    int i6 = 0;
                    while (i6 < arrayList2.size()) {
                        TLRPC$Chat tLRPC$Chat = arrayList2.get(i6);
                        if (tLRPC$Chat == null || (!ChatObject.isNotInChat(tLRPC$Chat) && !tLRPC$Chat.min && tLRPC$Chat.migrated_to == null)) {
                            longSparseArray2 = longSparseArray7;
                        } else {
                            long j2 = -tLRPC$Chat.id;
                            this.database.executeFast("UPDATE dialogs SET unread_count = 0 WHERE did = " + j2).stepThis().dispose();
                            this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET read_state = 3 WHERE uid = %d AND mid > 0 AND read_state IN(0,2) AND out = 0", Long.valueOf(j2))).stepThis().dispose();
                            arrayList2.remove(i6);
                            i6 += -1;
                            longSparseArray2 = longSparseArray7;
                            longSparseArray2.remove(j2);
                            int i7 = 0;
                            while (i7 < arrayList10.size()) {
                                if (((TLRPC$Message) arrayList10.get(i7)).dialog_id == j2) {
                                    arrayList10.remove(i7);
                                    i7--;
                                }
                                i7++;
                            }
                        }
                        i6++;
                        longSparseArray7 = longSparseArray2;
                    }
                }
                longSparseArray = longSparseArray7;
            } else {
                arrayList = arrayList11;
                arrayList3 = arrayList12;
                longSparseArray = longSparseArray4;
                arrayList2 = arrayList13;
                arrayList4 = arrayList14;
            }
            Collections.reverse(arrayList10);
            final ArrayList arrayList16 = arrayList;
            final ArrayList<TLRPC$User> arrayList17 = arrayList3;
            final ArrayList<TLRPC$Chat> arrayList18 = arrayList2;
            final ArrayList<TLRPC$EncryptedChat> arrayList19 = arrayList4;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$loadUnreadMessages$49(longSparseArray, arrayList10, arrayList16, arrayList17, arrayList18, arrayList19);
                }
            });
        } catch (Exception e4) {
            FileLog.e(e4);
        }
    }

    public void lambda$loadUnreadMessages$49(LongSparseArray longSparseArray, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        getNotificationsController().processLoadedUnreadMessages(longSparseArray, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    public void putWallpapers(final ArrayList<TLRPC$WallPaper> arrayList, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putWallpapers$51(i, arrayList);
            }
        });
    }

    public void lambda$putWallpapers$51(int i, ArrayList arrayList) {
        SQLitePreparedStatement sQLitePreparedStatement;
        if (i == 1) {
            try {
                this.database.executeFast("DELETE FROM wallpapers2 WHERE num >= -1").stepThis().dispose();
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.database.beginTransaction();
        if (i != 0) {
            sQLitePreparedStatement = this.database.executeFast("REPLACE INTO wallpapers2 VALUES(?, ?, ?)");
        } else {
            sQLitePreparedStatement = this.database.executeFast("UPDATE wallpapers2 SET data = ? WHERE uid = ?");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$WallPaper tLRPC$WallPaper = (TLRPC$WallPaper) arrayList.get(i2);
            sQLitePreparedStatement.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$WallPaper.getObjectSize());
            tLRPC$WallPaper.serializeToStream(nativeByteBuffer);
            if (i != 0) {
                sQLitePreparedStatement.bindLong(1, tLRPC$WallPaper.id);
                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                if (i < 0) {
                    sQLitePreparedStatement.bindInteger(3, i);
                } else {
                    sQLitePreparedStatement.bindInteger(3, i == 2 ? -1 : i2);
                }
            } else {
                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                sQLitePreparedStatement.bindLong(2, tLRPC$WallPaper.id);
            }
            sQLitePreparedStatement.step();
            nativeByteBuffer.reuse();
        }
        sQLitePreparedStatement.dispose();
        this.database.commitTransaction();
    }

    public void deleteWallpaper(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteWallpaper$52(j);
            }
        });
    }

    public void lambda$deleteWallpaper$52(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void getWallpapers() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getWallpapers$54();
            }
        });
    }

    public void lambda$getWallpapers$54() {
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
                        MessagesStorage.lambda$getWallpapers$53(arrayList);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
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

    public static void lambda$getWallpapers$53(ArrayList arrayList) {
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.wallpapersDidLoad, arrayList);
    }

    public void addRecentLocalFile(final String str, final String str2, final TLRPC$Document tLRPC$Document) {
        if (str != null && str.length() != 0) {
            if ((str2 != null && str2.length() != 0) || tLRPC$Document != null) {
                this.storageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$addRecentLocalFile$55(tLRPC$Document, str, str2);
                    }
                });
            }
        }
    }

    public void lambda$addRecentLocalFile$55(TLRPC$Document tLRPC$Document, String str, String str2) {
        try {
            if (tLRPC$Document != null) {
                SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Document.getObjectSize());
                tLRPC$Document.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindString(2, str);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
            } else {
                SQLitePreparedStatement executeFast2 = this.database.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                executeFast2.requery();
                executeFast2.bindString(1, str2);
                executeFast2.bindString(2, str);
                executeFast2.step();
                executeFast2.dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void deleteUserChatHistory(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteUserChatHistory$58(j, j2);
            }
        });
    }

    public void lambda$deleteUserChatHistory$58(final long r18, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteUserChatHistory$58(long, long):void");
    }

    public void lambda$deleteUserChatHistory$56(ArrayList arrayList, long j, ArrayList arrayList2) {
        getFileLoader().cancelLoadFiles(arrayList);
        getMessagesController().markDialogMessageAsDeleted(j, arrayList2);
    }

    public void lambda$deleteUserChatHistory$57(ArrayList arrayList, long j) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.messagesDeleted;
        Object[] objArr = new Object[3];
        objArr[0] = arrayList;
        objArr[1] = Long.valueOf(DialogObject.isChatDialog(j) ? -j : 0L);
        objArr[2] = Boolean.FALSE;
        notificationCenter.postNotificationName(i, objArr);
    }

    private boolean addFilesToDelete(TLRPC$Message tLRPC$Message, ArrayList<File> arrayList, ArrayList<Pair<Long, Integer>> arrayList2, ArrayList<String> arrayList3, boolean z) {
        int i;
        long j;
        int i2 = 0;
        if (tLRPC$Message == null) {
            return false;
        }
        TLRPC$Document document = MessageObject.getDocument(tLRPC$Message);
        TLRPC$Photo photo = MessageObject.getPhoto(tLRPC$Message);
        if (!MessageObject.isVoiceMessage(tLRPC$Message)) {
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
                j = document.id;
                i = 8;
            } else if (photo == null || FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize()) == null) {
                j = 0;
                i = 0;
            } else {
                j = photo.id;
            }
            i = 1;
        } else if (document == null) {
            return false;
        } else {
            j = document.id;
            i = 2;
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
                File pathToAttach = FileLoader.getPathToAttach(tLRPC$PhotoSize, z);
                if (pathToAttach.toString().length() > 0) {
                    arrayList.add(pathToAttach);
                }
                i2++;
            }
            return true;
        } else if (document == null) {
            return false;
        } else {
            String attachFileName2 = FileLoader.getAttachFileName(document);
            if (!TextUtils.isEmpty(attachFileName2)) {
                arrayList3.add(attachFileName2);
            }
            File pathToAttach2 = FileLoader.getPathToAttach(document, z);
            if (pathToAttach2.toString().length() > 0) {
                arrayList.add(pathToAttach2);
            }
            int size2 = document.thumbs.size();
            while (i2 < size2) {
                File pathToAttach3 = FileLoader.getPathToAttach(document.thumbs.get(i2));
                if (pathToAttach3.toString().length() > 0) {
                    arrayList.add(pathToAttach3);
                }
                i2++;
            }
            return true;
        }
    }

    public void deleteDialog(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$deleteDialog$61(i, j);
            }
        });
    }

    public void lambda$deleteDialog$61(int r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteDialog$61(int, long):void");
    }

    public void lambda$deleteDialog$59(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$deleteDialog$60() {
        getNotificationCenter().postNotificationName(NotificationCenter.needReloadRecentDialogsSearch, new Object[0]);
    }

    public void onDeleteQueryComplete(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$onDeleteQueryComplete$62(j);
            }
        });
    }

    public void lambda$onDeleteQueryComplete$62(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void getDialogPhotos(final long j, final int i, final int i2, final int i3) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getDialogPhotos$64(i2, j, i, i3);
            }
        });
    }

    public void lambda$getDialogPhotos$64(final int i, final long j, final int i2, final int i3) {
        SQLiteCursor sQLiteCursor;
        try {
            if (i != 0) {
                sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM user_photos WHERE uid = %d AND id < %d ORDER BY rowid ASC LIMIT %d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
            } else {
                sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM user_photos WHERE uid = %d ORDER BY rowid ASC LIMIT %d", Long.valueOf(j), Integer.valueOf(i2)), new Object[0]);
            }
            final TLRPC$TL_photos_photos tLRPC$TL_photos_photos = new TLRPC$TL_photos_photos();
            final ArrayList arrayList = new ArrayList();
            while (sQLiteCursor.next()) {
                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$Photo TLdeserialize = TLRPC$Photo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (byteBufferValue.remaining() > 0) {
                        arrayList.add(TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                    } else {
                        arrayList.add(null);
                    }
                    byteBufferValue.reuse();
                    tLRPC$TL_photos_photos.photos.add(TLdeserialize);
                }
            }
            sQLiteCursor.dispose();
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$getDialogPhotos$63(tLRPC$TL_photos_photos, arrayList, j, i2, i, i3);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$getDialogPhotos$63(TLRPC$photos_Photos tLRPC$photos_Photos, ArrayList arrayList, long j, int i, int i2, int i3) {
        getMessagesController().processLoadedUserPhotos(tLRPC$photos_Photos, arrayList, j, i, i2, true, i3);
    }

    public void clearUserPhotos(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearUserPhotos$65(j);
            }
        });
    }

    public void lambda$clearUserPhotos$65(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM user_photos WHERE uid = " + j).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void clearUserPhoto(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearUserPhoto$66(j, j2);
            }
        });
    }

    public void lambda$clearUserPhoto$66(long j, long j2) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM user_photos WHERE uid = " + j + " AND id = " + j2).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void resetDialogs(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final int i, final int i2, final int i3, final int i4, final int i5, final LongSparseArray<TLRPC$Dialog> longSparseArray, final LongSparseArray<MessageObject> longSparseArray2, final TLRPC$Message tLRPC$Message, final int i6) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$resetDialogs$68(tLRPC$messages_Dialogs, i6, i2, i3, i4, i5, tLRPC$Message, i, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$resetDialogs$68(org.telegram.tgnet.TLRPC$messages_Dialogs r31, int r32, int r33, int r34, int r35, int r36, org.telegram.tgnet.TLRPC$Message r37, int r38, androidx.collection.LongSparseArray r39, androidx.collection.LongSparseArray r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$resetDialogs$68(org.telegram.tgnet.TLRPC$messages_Dialogs, int, int, int, int, int, org.telegram.tgnet.TLRPC$Message, int, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public static int lambda$resetDialogs$67(LongSparseIntArray longSparseIntArray, Long l, Long l2) {
        int i = longSparseIntArray.get(l.longValue());
        int i2 = longSparseIntArray.get(l2.longValue());
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public void putDialogPhotos(final long j, final TLRPC$photos_Photos tLRPC$photos_Photos, final ArrayList<TLRPC$Message> arrayList) {
        if (tLRPC$photos_Photos != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putDialogPhotos$69(j, tLRPC$photos_Photos, arrayList);
                }
            });
        }
    }

    public void lambda$putDialogPhotos$69(long j, TLRPC$photos_Photos tLRPC$photos_Photos, ArrayList arrayList) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM user_photos WHERE uid = " + j).stepThis().dispose();
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO user_photos VALUES(?, ?, ?)");
            int size = tLRPC$photos_Photos.photos.size();
            for (int i = 0; i < size; i++) {
                TLRPC$Photo tLRPC$Photo = tLRPC$photos_Photos.photos.get(i);
                if (!(tLRPC$Photo instanceof TLRPC$TL_photoEmpty)) {
                    executeFast.requery();
                    int objectSize = tLRPC$Photo.getObjectSize();
                    if (arrayList != null) {
                        objectSize += ((TLRPC$Message) arrayList.get(i)).getObjectSize();
                    }
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
                    tLRPC$Photo.serializeToStream(nativeByteBuffer);
                    if (arrayList != null) {
                        ((TLRPC$Message) arrayList.get(i)).serializeToStream(nativeByteBuffer);
                    }
                    executeFast.bindLong(1, j);
                    executeFast.bindLong(2, tLRPC$Photo.id);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                }
            }
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void emptyMessagesMedia(final long j, final ArrayList<Integer> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$emptyMessagesMedia$72(arrayList, j);
            }
        });
    }

    public void lambda$emptyMessagesMedia$72(java.util.ArrayList r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$emptyMessagesMedia$72(java.util.ArrayList, long):void");
    }

    public void lambda$emptyMessagesMedia$70(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            getNotificationCenter().postNotificationName(NotificationCenter.updateMessageMedia, arrayList.get(i));
        }
    }

    public void lambda$emptyMessagesMedia$71(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void updateMessagePollResults(final long j, final TLRPC$Poll tLRPC$Poll, final TLRPC$PollResults tLRPC$PollResults) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessagePollResults$73(j, tLRPC$Poll, tLRPC$PollResults);
            }
        });
    }

    public void lambda$updateMessagePollResults$73(long j, TLRPC$Poll tLRPC$Poll, TLRPC$PollResults tLRPC$PollResults) {
        int i;
        ArrayList arrayList;
        LongSparseArray longSparseArray = null;
        try {
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT uid, mid FROM polls_v2 WHERE id = %d", Long.valueOf(j)), new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray();
                }
                ArrayList arrayList2 = (ArrayList) longSparseArray.get(longValue);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    longSparseArray.put(longValue, arrayList2);
                }
                arrayList2.add(Integer.valueOf(queryFinalized.intValue(1)));
            }
            queryFinalized.dispose();
            if (longSparseArray != null) {
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                int size = longSparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    long keyAt = longSparseArray.keyAt(i2);
                    ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i2);
                    int i3 = 0;
                    for (int size2 = arrayList3.size(); i3 < size2; size2 = i) {
                        Integer num = (Integer) arrayList3.get(i3);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        Locale locale = Locale.US;
                        longSparseArray = longSparseArray;
                        size = size;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT data FROM messages_v2 WHERE mid = %d AND uid = %d", num, Long.valueOf(keyAt)), new Object[0]);
                        if (queryFinalized2.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                arrayList = arrayList3;
                                i = size2;
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
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                    TLdeserialize.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                                    executeFast.bindInteger(2, num.intValue());
                                    executeFast.bindLong(3, keyAt);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                }
                            } else {
                                arrayList = arrayList3;
                                i = size2;
                            }
                        } else {
                            arrayList = arrayList3;
                            i = size2;
                            this.database.executeFast(String.format(locale, "DELETE FROM polls_v2 WHERE mid = %d AND uid = %d", num, Long.valueOf(keyAt))).stepThis().dispose();
                        }
                        queryFinalized2.dispose();
                        i3++;
                        arrayList3 = arrayList;
                    }
                }
                executeFast.dispose();
                this.database.commitTransaction();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateMessageReactions(final long j, final int i, final TLRPC$TL_messageReactions tLRPC$TL_messageReactions) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageReactions$74(i, j, tLRPC$TL_messageReactions);
            }
        });
    }

    public void lambda$updateMessageReactions$74(int i, long j, TLRPC$TL_messageReactions tLRPC$TL_messageReactions) {
        NativeByteBuffer byteBufferValue;
        try {
            this.database.beginTransaction();
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_v2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j)), new Object[0]);
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                if (TLdeserialize != null) {
                    TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                    byteBufferValue.reuse();
                    MessageObject.updateReactions(TLdeserialize, tLRPC$TL_messageReactions);
                    SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
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
            this.database.commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void getNewTask(final LongSparseArray<ArrayList<Integer>> longSparseArray, final LongSparseArray<ArrayList<Integer>> longSparseArray2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getNewTask$75(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getNewTask$75(androidx.collection.LongSparseArray r13, androidx.collection.LongSparseArray r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getNewTask$75(androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public void markMentionMessageAsRead(final long j, final int i, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$markMentionMessageAsRead$76(i, j, j2);
            }
        });
    }

    public void lambda$markMentionMessageAsRead$76(int i, long j, long j2) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast(String.format(locale, "UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j2, new Object[0]);
            int max = queryFinalized.next() ? Math.max(0, queryFinalized.intValue(0) - 1) : 0;
            queryFinalized.dispose();
            this.database.executeFast(String.format(locale, "UPDATE dialogs SET unread_count_i = %d WHERE did = %d", Integer.valueOf(max), Long.valueOf(j2))).stepThis().dispose();
            LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
            longSparseIntArray.put(j2, max);
            if (max == 0) {
                updateFiltersReadCounter(null, longSparseIntArray, true);
            }
            getMessagesController().processDialogsUpdateRead(null, longSparseIntArray);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void markMessageAsMention(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$markMessageAsMention$77(i, j);
            }
        });
    }

    public void lambda$markMessageAsMention$77(int i, long j) {
        try {
            this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void resetMentionsCount(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$resetMentionsCount$78(j, i);
            }
        });
    }

    public void lambda$resetMentionsCount$78(long j, int i) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j, new Object[0]);
            int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            if (intValue != 0 || i != 0) {
                if (i == 0) {
                    this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET read_state = read_state | 2 WHERE uid = %d AND mention = 1 AND read_state IN(0, 1)", Long.valueOf(j))).stepThis().dispose();
                }
                this.database.executeFast(String.format(Locale.US, "UPDATE dialogs SET unread_count_i = %d WHERE did = %d", Integer.valueOf(i), Long.valueOf(j))).stepThis().dispose();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j, i);
                getMessagesController().processDialogsUpdateRead(null, longSparseIntArray);
                if (i == 0) {
                    updateFiltersReadCounter(null, longSparseIntArray, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void createTaskForMid(final long j, final int i, final int i2, final int i3, final int i4, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$createTaskForMid$80(i2, i3, i4, i, z, j);
            }
        });
    }

    public void lambda$createTaskForMid$80(int i, int i2, int i3, int i4, final boolean z, final long j) {
        try {
            int max = Math.max(i, i2) + i3;
            SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
            final ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.valueOf(i4));
            sparseArray.put(max, arrayList);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$createTaskForMid$79(z, j, arrayList);
                }
            });
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
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
            }
            executeFast.dispose();
            this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET ttl = 0 WHERE mid = %d AND uid = %d", Integer.valueOf(i4), Long.valueOf(j))).stepThis().dispose();
            getMessagesController().didAddedNewTask(max, j, sparseArray);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$createTaskForMid$79(boolean z, long j, ArrayList arrayList) {
        if (!z) {
            markMessagesContentAsRead(j, arrayList, 0);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.messagesReadContent, Long.valueOf(j), arrayList);
    }

    public void createTaskForSecretChat(final int i, final int i2, final int i3, final int i4, final ArrayList<Long> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$createTaskForSecretChat$82(i, arrayList, i4, i2, i3);
            }
        });
    }

    public void lambda$createTaskForSecretChat$82(int i, ArrayList arrayList, int i2, int i3, int i4) {
        SQLiteCursor sQLiteCursor;
        try {
            final long makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(i);
            SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
            final ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            if (arrayList == null) {
                sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT mid, ttl FROM messages_v2 WHERE uid = %d AND out = %d AND read_state > 0 AND ttl > 0 AND date <= %d AND send_state = 0 AND media != 1", Long.valueOf(makeEncryptedDialogId), Integer.valueOf(i2), Integer.valueOf(i3)), new Object[0]);
            } else {
                sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT m.mid, m.ttl FROM messages_v2 as m INNER JOIN randoms_v2 as r ON m.mid = r.mid AND m.uid = r.uid WHERE r.random_id IN (%s)", TextUtils.join(",", arrayList)), new Object[0]);
            }
            int i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (sQLiteCursor.next()) {
                int intValue = sQLiteCursor.intValue(1);
                int intValue2 = sQLiteCursor.intValue(0);
                if (arrayList != null) {
                    arrayList2.add(Integer.valueOf(intValue2));
                }
                if (intValue > 0) {
                    int max = Math.max(i3, i4) + intValue;
                    i5 = Math.min(i5, max);
                    ArrayList<Integer> arrayList3 = sparseArray.get(max);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                        sparseArray.put(max, arrayList3);
                    }
                    if (sb.length() != 0) {
                        sb.append(",");
                    }
                    sb.append(intValue2);
                    arrayList3.add(Integer.valueOf(intValue2));
                }
            }
            sQLiteCursor.dispose();
            if (arrayList != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$createTaskForSecretChat$81(makeEncryptedDialogId, arrayList2);
                    }
                });
            }
            if (sparseArray.size() != 0) {
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                    int keyAt = sparseArray.keyAt(i6);
                    ArrayList<Integer> arrayList4 = sparseArray.get(keyAt);
                    for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, arrayList4.get(i7).intValue());
                        executeFast.bindLong(2, makeEncryptedDialogId);
                        executeFast.bindInteger(3, keyAt);
                        executeFast.bindInteger(4, 0);
                        executeFast.step();
                    }
                }
                executeFast.dispose();
                this.database.commitTransaction();
                this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET ttl = 0 WHERE mid IN(%s) AND uid = %d", sb.toString(), Long.valueOf(makeEncryptedDialogId))).stepThis().dispose();
                getMessagesController().didAddedNewTask(i5, makeEncryptedDialogId, sparseArray);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$createTaskForSecretChat$81(long j, ArrayList arrayList) {
        markMessagesContentAsRead(j, arrayList, 0);
        getNotificationCenter().postNotificationName(NotificationCenter.messagesReadContent, Long.valueOf(j), arrayList);
    }

    private void updateFiltersReadCounter(org.telegram.messenger.support.LongSparseIntArray r26, org.telegram.messenger.support.LongSparseIntArray r27, boolean r28) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateFiltersReadCounter(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, boolean):void");
    }

    public void lambda$updateFiltersReadCounter$83() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).unreadCount = arrayList.get(i).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
    }

    private void updateDialogsWithReadMessagesInternal(java.util.ArrayList<java.lang.Integer> r22, org.telegram.messenger.support.LongSparseIntArray r23, org.telegram.messenger.support.LongSparseIntArray r24, androidx.collection.LongSparseArray<java.util.ArrayList<java.lang.Integer>> r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateDialogsWithReadMessagesInternal(java.util.ArrayList, org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, androidx.collection.LongSparseArray):void");
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

    public void updateDialogsWithReadMessages(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final LongSparseArray<ArrayList<Integer>> longSparseArray, boolean z) {
        if (isEmpty(longSparseIntArray) && isEmpty(longSparseIntArray2) && isEmpty(longSparseArray)) {
            return;
        }
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateDialogsWithReadMessages$84(longSparseIntArray, longSparseIntArray2, longSparseArray);
                }
            });
        } else {
            updateDialogsWithReadMessagesInternal(null, longSparseIntArray, longSparseIntArray2, longSparseArray);
        }
    }

    public void lambda$updateDialogsWithReadMessages$84(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, LongSparseArray longSparseArray) {
        updateDialogsWithReadMessagesInternal(null, longSparseIntArray, longSparseIntArray2, longSparseArray);
    }

    public void updateChatParticipants(final TLRPC$ChatParticipants tLRPC$ChatParticipants) {
        if (tLRPC$ChatParticipants != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateChatParticipants$86(tLRPC$ChatParticipants);
                }
            });
        }
    }

    public void lambda$updateChatParticipants$86(TLRPC$ChatParticipants tLRPC$ChatParticipants) {
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + tLRPC$ChatParticipants.chat_id, new Object[0]);
            final TLRPC$ChatFull tLRPC$ChatFull = null;
            new ArrayList();
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
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
                        MessagesStorage.this.lambda$updateChatParticipants$85(tLRPC$ChatFull);
                    }
                });
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$ChatFull.getObjectSize());
                tLRPC$ChatFull.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, tLRPC$ChatFull.id);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, tLRPC$ChatFull.pinned_msg_id);
                executeFast.bindInteger(4, tLRPC$ChatFull.online_count);
                executeFast.bindLong(5, tLRPC$ChatFull.inviterId);
                executeFast.bindInteger(6, tLRPC$ChatFull.invitesCount);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$updateChatParticipants$85(TLRPC$ChatFull tLRPC$ChatFull) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.postNotificationName(i, tLRPC$ChatFull, 0, bool, bool);
    }

    public void loadChannelAdmins(final long j) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$loadChannelAdmins$87(j);
            }
        });
    }

    public void lambda$loadChannelAdmins$87(long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j, new Object[0]);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void putChannelAdmins(final long j, final LongSparseArray<TLRPC$ChannelParticipant> longSparseArray) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putChannelAdmins$88(j, longSparseArray);
            }
        });
    }

    public void lambda$putChannelAdmins$88(long j, LongSparseArray longSparseArray) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j).stepThis().dispose();
            this.database.beginTransaction();
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (int i = 0; i < longSparseArray.size(); i++) {
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindLong(2, longSparseArray.keyAt(i));
                TLRPC$ChannelParticipant tLRPC$ChannelParticipant = (TLRPC$ChannelParticipant) longSparseArray.valueAt(i);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$ChannelParticipant.getObjectSize());
                tLRPC$ChannelParticipant.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            this.database.commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateChannelUsers(final long j, final ArrayList<TLRPC$ChannelParticipant> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChannelUsers$89(j, arrayList);
            }
        });
    }

    public void lambda$updateChannelUsers$89(long j, ArrayList arrayList) {
        long j2 = -j;
        try {
            this.database.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j2).stepThis().dispose();
            this.database.beginTransaction();
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void saveBotCache(final String str, final TLObject tLObject) {
        if (tLObject != null && !TextUtils.isEmpty(str)) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$saveBotCache$90(tLObject, str);
                }
            });
        }
    }

    public void lambda$saveBotCache$90(TLObject tLObject, String str) {
        int i;
        try {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (tLObject instanceof TLRPC$TL_messages_botCallbackAnswer) {
                i = ((TLRPC$TL_messages_botCallbackAnswer) tLObject).cache_time;
            } else {
                if (tLObject instanceof TLRPC$TL_messages_botResults) {
                    i = ((TLRPC$TL_messages_botResults) tLObject).cache_time;
                }
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
                tLObject.serializeToStream(nativeByteBuffer);
                executeFast.bindString(1, str);
                executeFast.bindInteger(2, currentTime);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
            }
            currentTime += i;
            SQLitePreparedStatement executeFast2 = this.database.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer2);
            executeFast2.bindString(1, str);
            executeFast2.bindInteger(2, currentTime);
            executeFast2.bindByteBuffer(3, nativeByteBuffer2);
            executeFast2.step();
            executeFast2.dispose();
            nativeByteBuffer2.reuse();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void getBotCache(final String str, final RequestDelegate requestDelegate) {
        if (str != null && requestDelegate != null) {
            final int currentTime = getConnectionsManager().getCurrentTime();
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$getBotCache$91(currentTime, str, requestDelegate);
                }
            });
        }
    }

    public void lambda$getBotCache$91(int i, String str, RequestDelegate requestDelegate) {
        Throwable th;
        TLObject tLObject;
        Exception e;
        SQLiteCursor queryFinalized;
        Exception e2;
        NativeByteBuffer byteBufferValue;
        try {
            try {
                this.database.executeFast("DELETE FROM botcache WHERE date < " + i).stepThis().dispose();
                queryFinalized = this.database.queryFinalized("SELECT data FROM botcache WHERE id = ?", str);
            } catch (Exception e3) {
                e = e3;
                tLObject = null;
            }
            if (queryFinalized.next()) {
                try {
                    byteBufferValue = queryFinalized.byteBufferValue(0);
                } catch (Exception e4) {
                    e2 = e4;
                    tLObject = null;
                }
                if (byteBufferValue != null) {
                    int readInt32 = byteBufferValue.readInt32(false);
                    if (readInt32 == TLRPC$TL_messages_botCallbackAnswer.constructor) {
                        tLObject = TLRPC$TL_messages_botCallbackAnswer.TLdeserialize(byteBufferValue, readInt32, false);
                    } else {
                        tLObject = TLRPC$messages_BotResults.TLdeserialize(byteBufferValue, readInt32, false);
                    }
                    try {
                        try {
                            byteBufferValue.reuse();
                        } catch (Exception e5) {
                            e2 = e5;
                            try {
                                FileLog.e(e2);
                                queryFinalized.dispose();
                            } catch (Exception e6) {
                                e = e6;
                                FileLog.e(e);
                                requestDelegate.run(tLObject, null);
                            }
                            requestDelegate.run(tLObject, null);
                        }
                        queryFinalized.dispose();
                        requestDelegate.run(tLObject, null);
                    } catch (Throwable th2) {
                        th = th2;
                        requestDelegate.run(tLObject, null);
                        throw th;
                    }
                }
            }
            tLObject = null;
            queryFinalized.dispose();
            requestDelegate.run(tLObject, null);
        } catch (Throwable th3) {
            th = th3;
            tLObject = null;
            requestDelegate.run(tLObject, null);
            throw th;
        }
    }

    public void loadUserInfo(final TLRPC$User tLRPC$User, final boolean z, final int i, int i2) {
        if (tLRPC$User != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$loadUserInfo$92(tLRPC$User, z, i);
                }
            });
        }
    }

    public void lambda$loadUserInfo$92(TLRPC$User tLRPC$User, boolean z, int i) {
        boolean z2;
        int i2;
        TLRPC$UserFull tLRPC$UserFull;
        Exception e;
        MessagesController messagesController;
        boolean z3;
        TLRPC$User tLRPC$User2;
        boolean z4;
        int i3;
        TLRPC$UserFull tLRPC$UserFull2;
        SQLiteCursor queryFinalized;
        boolean z5;
        int i4;
        ArrayList<MessageObject> loadPinnedMessages;
        NativeByteBuffer byteBufferValue;
        HashMap<Integer, MessageObject> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            SQLiteCursor queryFinalized2 = this.database.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid = " + tLRPC$User.id, new Object[0]);
            boolean z6 = true;
            if (!queryFinalized2.next() || (byteBufferValue = queryFinalized2.byteBufferValue(0)) == null) {
                tLRPC$UserFull2 = null;
            } else {
                tLRPC$UserFull2 = TLRPC$UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                try {
                    tLRPC$UserFull2.pinned_msg_id = queryFinalized2.intValue(1);
                    byteBufferValue.reuse();
                } catch (Exception e2) {
                    e = e2;
                    tLRPC$UserFull = tLRPC$UserFull2;
                    i2 = 0;
                    z2 = false;
                    try {
                        FileLog.e(e);
                        messagesController = getMessagesController();
                        z3 = true;
                        tLRPC$User2 = tLRPC$User;
                        z4 = z;
                        i3 = i;
                        messagesController.processUserInfo(tLRPC$User2, tLRPC$UserFull, z3, z4, i3, arrayList, hashMap, i2, z2);
                    } catch (Throwable th) {
                        th = th;
                        getMessagesController().processUserInfo(tLRPC$User, tLRPC$UserFull, true, z, i, arrayList, hashMap, i2, z2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    tLRPC$UserFull = tLRPC$UserFull2;
                    i2 = 0;
                    z2 = false;
                    getMessagesController().processUserInfo(tLRPC$User, tLRPC$UserFull, true, z, i, arrayList, hashMap, i2, z2);
                    throw th;
                }
            }
            queryFinalized2.dispose();
            SQLiteCursor queryFinalized3 = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT mid FROM chat_pinned_v2 WHERE uid = %d ORDER BY mid DESC", Long.valueOf(tLRPC$User.id)), new Object[0]);
            while (queryFinalized3.next()) {
                int intValue = queryFinalized3.intValue(0);
                arrayList.add(Integer.valueOf(intValue));
                hashMap.put(Integer.valueOf(intValue), null);
            }
            queryFinalized3.dispose();
            queryFinalized = this.database.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + tLRPC$User.id, new Object[0]);
            if (queryFinalized.next()) {
                int intValue2 = queryFinalized.intValue(0);
                try {
                    if (queryFinalized.intValue(1) == 0) {
                        z6 = false;
                    }
                    i4 = intValue2;
                    z5 = z6;
                } catch (Exception e3) {
                    e = e3;
                    i2 = intValue2;
                    tLRPC$UserFull = tLRPC$UserFull2;
                    z2 = false;
                    FileLog.e(e);
                    messagesController = getMessagesController();
                    z3 = true;
                    tLRPC$User2 = tLRPC$User;
                    z4 = z;
                    i3 = i;
                    messagesController.processUserInfo(tLRPC$User2, tLRPC$UserFull, z3, z4, i3, arrayList, hashMap, i2, z2);
                } catch (Throwable th3) {
                    th = th3;
                    i2 = intValue2;
                    tLRPC$UserFull = tLRPC$UserFull2;
                    z2 = false;
                    getMessagesController().processUserInfo(tLRPC$User, tLRPC$UserFull, true, z, i, arrayList, hashMap, i2, z2);
                    throw th;
                }
            } else {
                i4 = 0;
                z5 = false;
            }
        } catch (Exception e4) {
            e = e4;
            tLRPC$UserFull = null;
        } catch (Throwable th4) {
            th = th4;
            tLRPC$UserFull = null;
        }
        try {
            queryFinalized.dispose();
            if (!(tLRPC$UserFull2 == null || tLRPC$UserFull2.pinned_msg_id == 0 || (!arrayList.isEmpty() && tLRPC$UserFull2.pinned_msg_id <= arrayList.get(0).intValue()))) {
                arrayList.clear();
                arrayList.add(Integer.valueOf(tLRPC$UserFull2.pinned_msg_id));
                hashMap.put(Integer.valueOf(tLRPC$UserFull2.pinned_msg_id), null);
            }
            if (!arrayList.isEmpty() && (loadPinnedMessages = getMediaDataController().loadPinnedMessages(tLRPC$User.id, 0L, arrayList, false)) != null) {
                int size = loadPinnedMessages.size();
                for (int i5 = 0; i5 < size; i5++) {
                    MessageObject messageObject = loadPinnedMessages.get(i5);
                    hashMap.put(Integer.valueOf(messageObject.getId()), messageObject);
                }
            }
            messagesController = getMessagesController();
            z3 = true;
            tLRPC$User2 = tLRPC$User;
            tLRPC$UserFull = tLRPC$UserFull2;
            z4 = z;
            i3 = i;
            i2 = i4;
            z2 = z5;
        } catch (Exception e5) {
            e = e5;
            tLRPC$UserFull = tLRPC$UserFull2;
            i2 = i4;
            z2 = z5;
            FileLog.e(e);
            messagesController = getMessagesController();
            z3 = true;
            tLRPC$User2 = tLRPC$User;
            z4 = z;
            i3 = i;
            messagesController.processUserInfo(tLRPC$User2, tLRPC$UserFull, z3, z4, i3, arrayList, hashMap, i2, z2);
        } catch (Throwable th5) {
            th = th5;
            tLRPC$UserFull = tLRPC$UserFull2;
            i2 = i4;
            z2 = z5;
            getMessagesController().processUserInfo(tLRPC$User, tLRPC$UserFull, true, z, i, arrayList, hashMap, i2, z2);
            throw th;
        }
        messagesController.processUserInfo(tLRPC$User2, tLRPC$UserFull, z3, z4, i3, arrayList, hashMap, i2, z2);
    }

    public void updateUserInfo(final TLRPC$UserFull tLRPC$UserFull, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateUserInfo$93(z, tLRPC$UserFull);
            }
        });
    }

    public void lambda$updateUserInfo$93(boolean z, TLRPC$UserFull tLRPC$UserFull) {
        if (z) {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT uid FROM user_settings WHERE uid = " + tLRPC$UserFull.user.id, new Object[0]);
                boolean next = queryFinalized.next();
                queryFinalized.dispose();
                if (!next) {
                    return;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$UserFull.getObjectSize());
        tLRPC$UserFull.serializeToStream(nativeByteBuffer);
        executeFast.bindLong(1, tLRPC$UserFull.user.id);
        executeFast.bindByteBuffer(2, nativeByteBuffer);
        executeFast.bindInteger(3, tLRPC$UserFull.pinned_msg_id);
        executeFast.step();
        executeFast.dispose();
        nativeByteBuffer.reuse();
        if ((tLRPC$UserFull.flags & 2048) != 0) {
            SQLitePreparedStatement executeFast2 = this.database.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
            executeFast2.bindInteger(1, tLRPC$UserFull.folder_id);
            executeFast2.bindLong(2, tLRPC$UserFull.user.id);
            executeFast2.step();
            executeFast2.dispose();
            this.unknownDialogsIds.remove(tLRPC$UserFull.user.id);
        }
    }

    public void saveChatInviter(final long j, final long j2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveChatInviter$94(j2, j);
            }
        });
    }

    public void lambda$saveChatInviter$94(long j, long j2) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE chat_settings_v2 SET inviter = ? WHERE uid = ?");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindLong(2, j2);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void saveChatLinksCount(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$saveChatLinksCount$95(i, j);
            }
        });
    }

    public void lambda$saveChatLinksCount$95(int i, long j) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
            executeFast.requery();
            executeFast.bindInteger(1, i);
            executeFast.bindLong(2, j);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateChatInfo(final TLRPC$ChatFull tLRPC$ChatFull, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChatInfo$96(tLRPC$ChatFull, z);
            }
        });
    }

    public void lambda$updateChatInfo$96(TLRPC$ChatFull tLRPC$ChatFull, boolean z) {
        int i;
        int i2;
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT online, inviter, links FROM chat_settings_v2 WHERE uid = " + tLRPC$ChatFull.id, new Object[0]);
            if (queryFinalized.next()) {
                i2 = queryFinalized.intValue(0);
                tLRPC$ChatFull.inviterId = queryFinalized.longValue(1);
                i = queryFinalized.intValue(2);
            } else {
                i2 = -1;
                i = 0;
            }
            queryFinalized.dispose();
            if (!z || i2 != -1) {
                if (i2 >= 0 && (tLRPC$ChatFull.flags & 8192) == 0) {
                    tLRPC$ChatFull.online_count = i2;
                }
                if (i >= 0) {
                    tLRPC$ChatFull.invitesCount = i;
                }
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$ChatFull.getObjectSize());
                tLRPC$ChatFull.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, tLRPC$ChatFull.id);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, tLRPC$ChatFull.pinned_msg_id);
                executeFast.bindInteger(4, tLRPC$ChatFull.online_count);
                executeFast.bindLong(5, tLRPC$ChatFull.inviterId);
                executeFast.bindInteger(6, tLRPC$ChatFull.invitesCount);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
                if (tLRPC$ChatFull instanceof TLRPC$TL_channelFull) {
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT inbox_max, outbox_max FROM dialogs WHERE did = " + (-tLRPC$ChatFull.id), new Object[0]);
                    if (queryFinalized2.next() && queryFinalized2.intValue(0) < tLRPC$ChatFull.read_inbox_max_id) {
                        int intValue = queryFinalized2.intValue(1);
                        SQLitePreparedStatement executeFast2 = this.database.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ?, outbox_max = ? WHERE did = ?");
                        executeFast2.bindInteger(1, tLRPC$ChatFull.unread_count);
                        executeFast2.bindInteger(2, tLRPC$ChatFull.read_inbox_max_id);
                        executeFast2.bindInteger(3, Math.max(intValue, tLRPC$ChatFull.read_outbox_max_id));
                        executeFast2.bindLong(4, -tLRPC$ChatFull.id);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    queryFinalized2.dispose();
                }
                if ((tLRPC$ChatFull.flags & 2048) != 0) {
                    SQLitePreparedStatement executeFast3 = this.database.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
                    executeFast3.bindInteger(1, tLRPC$ChatFull.folder_id);
                    executeFast3.bindLong(2, -tLRPC$ChatFull.id);
                    executeFast3.step();
                    executeFast3.dispose();
                    this.unknownDialogsIds.remove(-tLRPC$ChatFull.id);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateChatOnlineCount(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChatOnlineCount$97(i, j);
            }
        });
    }

    public void lambda$updateChatOnlineCount$97(int i, long j) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
            executeFast.requery();
            executeFast.bindInteger(1, i);
            executeFast.bindLong(2, j);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updatePinnedMessages(final long j, final ArrayList<Integer> arrayList, final boolean z, final int i, final int i2, final boolean z2, final HashMap<Integer, MessageObject> hashMap) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updatePinnedMessages$100(z, hashMap, i2, j, arrayList, i, z2);
            }
        });
    }

    public void lambda$updatePinnedMessages$100(boolean z, final HashMap hashMap, final int i, final long j, final ArrayList arrayList, int i2, boolean z2) {
        int i3;
        final boolean z3;
        final int i4;
        int i5;
        boolean z4;
        int i6;
        final boolean z5;
        int i7;
        int max;
        int i8 = 2;
        int i9 = 1;
        try {
            if (z) {
                this.database.beginTransaction();
                if (hashMap != null) {
                    if (i == 0) {
                        SQLiteDatabase sQLiteDatabase = this.database;
                        sQLiteDatabase.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j).stepThis().dispose();
                    }
                    i6 = 0;
                } else {
                    SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM chat_pinned_v2 WHERE uid = %d AND mid IN (%s)", Long.valueOf(j), TextUtils.join(",", arrayList)), new Object[0]);
                    i6 = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                    queryFinalized.dispose();
                }
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Integer num = (Integer) arrayList.get(i10);
                    executeFast.requery();
                    executeFast.bindLong(1, j);
                    executeFast.bindInteger(i8, num.intValue());
                    NativeByteBuffer nativeByteBuffer = null;
                    MessageObject messageObject = hashMap != null ? (MessageObject) hashMap.get(num) : null;
                    if (messageObject != null) {
                        nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
                        messageObject.messageOwner.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                    } else {
                        executeFast.bindNull(3);
                    }
                    executeFast.step();
                    if (nativeByteBuffer != null) {
                        nativeByteBuffer.reuse();
                    }
                    i10++;
                    i8 = 2;
                }
                executeFast.dispose();
                this.database.commitTransaction();
                SQLiteDatabase sQLiteDatabase2 = this.database;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized(String.format(locale, "SELECT COUNT(mid) FROM chat_pinned_v2 WHERE uid = %d", Long.valueOf(j)), new Object[0]);
                int intValue = queryFinalized2.next() ? queryFinalized2.intValue(0) : 0;
                queryFinalized2.dispose();
                if (hashMap != null) {
                    max = Math.max(i2, intValue);
                    z5 = z2;
                } else {
                    SQLiteCursor queryFinalized3 = this.database.queryFinalized(String.format(locale, "SELECT count, end FROM chat_pinned_count WHERE uid = %d", Long.valueOf(j)), new Object[0]);
                    if (queryFinalized3.next()) {
                        i7 = queryFinalized3.intValue(0);
                        if (queryFinalized3.intValue(1) != 0) {
                            z5 = true;
                            queryFinalized3.dispose();
                            max = Math.max(i7 + (arrayList.size() - i6), intValue);
                        }
                    } else {
                        i7 = 0;
                    }
                    z5 = false;
                    queryFinalized3.dispose();
                    max = Math.max(i7 + (arrayList.size() - i6), intValue);
                }
                final int i11 = max;
                SQLitePreparedStatement executeFast2 = this.database.executeFast("REPLACE INTO chat_pinned_count VALUES(?, ?, ?)");
                executeFast2.requery();
                executeFast2.bindLong(1, j);
                executeFast2.bindInteger(2, i11);
                if (!z5) {
                    i9 = 0;
                }
                executeFast2.bindInteger(3, i9);
                executeFast2.step();
                executeFast2.dispose();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$updatePinnedMessages$98(j, arrayList, hashMap, i, i11, z5);
                    }
                });
                return;
            }
            if (arrayList == null) {
                SQLiteDatabase sQLiteDatabase3 = this.database;
                sQLiteDatabase3.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j).stepThis().dispose();
                if (DialogObject.isChatDialog(j)) {
                    this.database.executeFast(String.format(Locale.US, "UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = %d", Long.valueOf(-j))).stepThis().dispose();
                } else {
                    this.database.executeFast(String.format(Locale.US, "UPDATE user_settings SET pinned = 0 WHERE uid = %d", Long.valueOf(j))).stepThis().dispose();
                }
                i4 = 0;
                z3 = true;
                i3 = 0;
            } else {
                String join = TextUtils.join(",", arrayList);
                if (DialogObject.isChatDialog(j)) {
                    this.database.executeFast(String.format(Locale.US, "UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = %d AND pinned IN (%s)", Long.valueOf(-j), join)).stepThis().dispose();
                } else {
                    this.database.executeFast(String.format(Locale.US, "UPDATE user_settings SET pinned = 0 WHERE uid = %d AND pinned IN (%s)", Long.valueOf(j), join)).stepThis().dispose();
                }
                SQLiteDatabase sQLiteDatabase4 = this.database;
                Locale locale2 = Locale.US;
                sQLiteDatabase4.executeFast(String.format(locale2, "DELETE FROM chat_pinned_v2 WHERE uid = %d AND mid IN(%s)", Long.valueOf(j), join)).stepThis().dispose();
                SQLiteCursor queryFinalized4 = this.database.queryFinalized("SELECT changes()", new Object[0]);
                int intValue2 = queryFinalized4.next() ? queryFinalized4.intValue(0) : 0;
                queryFinalized4.dispose();
                SQLiteCursor queryFinalized5 = this.database.queryFinalized(String.format(locale2, "SELECT COUNT(mid) FROM chat_pinned_v2 WHERE uid = %d", Long.valueOf(j)), new Object[0]);
                int intValue3 = queryFinalized5.next() ? queryFinalized5.intValue(0) : 0;
                queryFinalized5.dispose();
                i3 = 0;
                SQLiteCursor queryFinalized6 = this.database.queryFinalized(String.format(locale2, "SELECT count, end FROM chat_pinned_count WHERE uid = %d", Long.valueOf(j)), new Object[0]);
                if (queryFinalized6.next()) {
                    i5 = Math.max(0, queryFinalized6.intValue(0) - intValue2);
                    z4 = queryFinalized6.intValue(1) != 0;
                } else {
                    z4 = false;
                    i5 = 0;
                }
                queryFinalized6.dispose();
                i4 = Math.max(intValue3, i5);
                z3 = z4;
            }
            SQLitePreparedStatement executeFast3 = this.database.executeFast("REPLACE INTO chat_pinned_count VALUES(?, ?, ?)");
            executeFast3.requery();
            executeFast3.bindLong(1, j);
            executeFast3.bindInteger(2, i4);
            if (z3) {
                i3 = 1;
            }
            executeFast3.bindInteger(3, i3);
            executeFast3.step();
            executeFast3.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updatePinnedMessages$99(j, arrayList, hashMap, i, i4, z3);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$updatePinnedMessages$98(long j, ArrayList arrayList, HashMap hashMap, int i, int i2, boolean z) {
        getNotificationCenter().postNotificationName(NotificationCenter.didLoadPinnedMessages, Long.valueOf(j), arrayList, Boolean.TRUE, 0, hashMap, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public void lambda$updatePinnedMessages$99(long j, ArrayList arrayList, HashMap hashMap, int i, int i2, boolean z) {
        getNotificationCenter().postNotificationName(NotificationCenter.didLoadPinnedMessages, Long.valueOf(j), arrayList, Boolean.FALSE, 0, hashMap, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public void updateChatInfo(final long j, final long j2, final int i, final long j3, final int i2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChatInfo$102(j, i, j2, j3, i2);
            }
        });
    }

    public void lambda$updateChatInfo$102(long j, int i, long j2, long j3, int i2) {
        TLRPC$ChatParticipant tLRPC$ChatParticipant;
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + j, new Object[0]);
            final TLRPC$ChatFull tLRPC$ChatFull = null;
            new ArrayList();
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tLRPC$ChatFull = TLRPC$ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
                tLRPC$ChatFull.pinned_msg_id = queryFinalized.intValue(1);
                tLRPC$ChatFull.online_count = queryFinalized.intValue(2);
                tLRPC$ChatFull.inviterId = queryFinalized.longValue(3);
            }
            queryFinalized.dispose();
            if (tLRPC$ChatFull instanceof TLRPC$TL_chatFull) {
                if (i == 1) {
                    int i3 = 0;
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
                    TLRPC$TL_chatParticipant tLRPC$TL_chatParticipant = new TLRPC$TL_chatParticipant();
                    tLRPC$TL_chatParticipant.user_id = j2;
                    tLRPC$TL_chatParticipant.inviter_id = j3;
                    tLRPC$TL_chatParticipant.date = getConnectionsManager().getCurrentTime();
                    tLRPC$ChatFull.participants.participants.add(tLRPC$TL_chatParticipant);
                } else if (i == 2) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= tLRPC$ChatFull.participants.participants.size()) {
                            break;
                        }
                        TLRPC$ChatParticipant tLRPC$ChatParticipant2 = tLRPC$ChatFull.participants.participants.get(i4);
                        if (tLRPC$ChatParticipant2.user_id == j2) {
                            if (j3 == 1) {
                                tLRPC$ChatParticipant = new TLRPC$TL_chatParticipantAdmin();
                            } else {
                                tLRPC$ChatParticipant = new TLRPC$TL_chatParticipant();
                            }
                            tLRPC$ChatParticipant.user_id = tLRPC$ChatParticipant2.user_id;
                            tLRPC$ChatParticipant.date = tLRPC$ChatParticipant2.date;
                            tLRPC$ChatParticipant.inviter_id = tLRPC$ChatParticipant2.inviter_id;
                            tLRPC$ChatFull.participants.participants.set(i4, tLRPC$ChatParticipant);
                        } else {
                            i4++;
                        }
                    }
                }
                tLRPC$ChatFull.participants.version = i2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$updateChatInfo$101(tLRPC$ChatFull);
                    }
                });
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$ChatFull.getObjectSize());
                tLRPC$ChatFull.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, j);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, tLRPC$ChatFull.pinned_msg_id);
                executeFast.bindInteger(4, tLRPC$ChatFull.online_count);
                executeFast.bindLong(5, tLRPC$ChatFull.inviterId);
                executeFast.bindInteger(6, tLRPC$ChatFull.invitesCount);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$updateChatInfo$101(TLRPC$ChatFull tLRPC$ChatFull) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.postNotificationName(i, tLRPC$ChatFull, 0, bool, bool);
    }

    public boolean isMigratedChat(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$isMigratedChat$103(j, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return zArr[0];
    }

    public void lambda$isMigratedChat$103(long j, boolean[] zArr, CountDownLatch countDownLatch) {
        NativeByteBuffer byteBufferValue;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM chat_settings_v2 WHERE uid = " + j, new Object[0]);
                TLRPC$ChatFull tLRPC$ChatFull = null;
                new ArrayList();
                if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                    tLRPC$ChatFull = TLRPC$ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                }
                queryFinalized.dispose();
                zArr[0] = (tLRPC$ChatFull instanceof TLRPC$TL_channelFull) && tLRPC$ChatFull.migrated_from_chat_id != 0;
                countDownLatch.countDown();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    public boolean hasInviteMeMessage(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$hasInviteMeMessage$104(j, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return zArr[0];
    }

    public void lambda$hasInviteMeMessage$104(long j, boolean[] zArr, CountDownLatch countDownLatch) {
        try {
            try {
                long clientUserId = getUserConfig().getClientUserId();
                SQLiteDatabase sQLiteDatabase = this.database;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + (-j) + " AND out = 0 ORDER BY mid DESC LIMIT 100", new Object[0]);
                while (true) {
                    if (!queryFinalized.next()) {
                        break;
                    }
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
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
                queryFinalized.dispose();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    private org.telegram.tgnet.TLRPC$ChatFull loadChatInfoInternal(long r22, boolean r24, boolean r25, boolean r26, int r27) {
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
                MessagesStorage.this.lambda$loadChatInfo$105(tLRPC$ChatFullArr, j, z, z2, z3, i, countDownLatch);
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

    public void lambda$loadChatInfo$105(TLRPC$ChatFull[] tLRPC$ChatFullArr, long j, boolean z, boolean z2, boolean z3, int i, CountDownLatch countDownLatch) {
        tLRPC$ChatFullArr[0] = loadChatInfoInternal(j, z, z2, z3, i);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void processPendingRead(final long j, final int i, final int i2, final int i3) {
        final int i4 = this.lastSavedDate;
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$processPendingRead$106(j, i, i3, i4, i2);
            }
        });
    }

    public void lambda$processPendingRead$106(long j, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i4;
        long j2 = 0;
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            int i9 = 0;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT unread_count, inbox_max, last_mid FROM dialogs WHERE did = " + j, new Object[0]);
            if (queryFinalized.next()) {
                i7 = queryFinalized.intValue(0);
                i6 = i7;
                i5 = queryFinalized.intValue(1);
                j2 = queryFinalized.longValue(2);
            } else {
                i7 = 0;
                i6 = 0;
                i5 = 0;
            }
            queryFinalized.dispose();
            this.database.beginTransaction();
            if (!DialogObject.isEncryptedDialog(j)) {
                i8 = Math.max(i5, i);
                SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid <= ? AND read_state IN(0,2) AND out = 0");
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, i8);
                executeFast.step();
                executeFast.dispose();
                if (i8 < j2) {
                    SQLiteCursor queryFinalized2 = this.database.queryFinalized("SELECT changes()", new Object[0]);
                    int intValue = queryFinalized2.next() ? queryFinalized2.intValue(0) + i2 : 0;
                    queryFinalized2.dispose();
                    i9 = Math.max(0, i7 - intValue);
                }
                SQLitePreparedStatement executeFast2 = this.database.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                executeFast2.requery();
                executeFast2.bindLong(1, j);
                executeFast2.bindInteger(2, i8);
                executeFast2.step();
                executeFast2.dispose();
                SQLitePreparedStatement executeFast3 = this.database.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND date <= ?");
                executeFast3.requery();
                executeFast3.bindLong(1, j);
                executeFast3.bindInteger(2, i3);
                executeFast3.step();
                executeFast3.dispose();
            } else {
                SQLitePreparedStatement executeFast4 = this.database.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid >= ? AND read_state IN(0,2) AND out = 0");
                executeFast4.requery();
                executeFast4.bindLong(1, j);
                executeFast4.bindInteger(2, i8);
                executeFast4.step();
                executeFast4.dispose();
                if (i8 > j2) {
                    SQLiteCursor queryFinalized3 = this.database.queryFinalized("SELECT changes()", new Object[0]);
                    int intValue2 = queryFinalized3.next() ? queryFinalized3.intValue(0) + i2 : 0;
                    queryFinalized3.dispose();
                    i9 = Math.max(0, i7 - intValue2);
                }
            }
            SQLitePreparedStatement executeFast5 = this.database.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ? WHERE did = ?");
            executeFast5.requery();
            executeFast5.bindInteger(1, i9);
            executeFast5.bindInteger(2, i8);
            executeFast5.bindLong(3, j);
            executeFast5.step();
            executeFast5.dispose();
            this.database.commitTransaction();
            if (i6 != 0 && i9 == 0) {
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                longSparseIntArray.put(j, i9);
                updateFiltersReadCounter(longSparseIntArray, null, true);
            }
            updateWidgets(j);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void putContacts(ArrayList<TLRPC$TL_contact> arrayList, final boolean z) {
        if (!arrayList.isEmpty() || z) {
            final ArrayList arrayList2 = new ArrayList(arrayList);
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putContacts$107(z, arrayList2);
                }
            });
        }
    }

    public void lambda$putContacts$107(boolean z, ArrayList arrayList) {
        if (z) {
            try {
                this.database.executeFast("DELETE FROM contacts WHERE 1").stepThis().dispose();
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.database.beginTransaction();
        SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO contacts VALUES(?, ?)");
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$TL_contact tLRPC$TL_contact = (TLRPC$TL_contact) arrayList.get(i);
            executeFast.requery();
            int i2 = 1;
            executeFast.bindLong(1, tLRPC$TL_contact.user_id);
            if (!tLRPC$TL_contact.mutual) {
                i2 = 0;
            }
            executeFast.bindInteger(2, i2);
            executeFast.step();
        }
        executeFast.dispose();
        this.database.commitTransaction();
    }

    public void deleteContacts(final ArrayList<Long> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$deleteContacts$108(arrayList);
                }
            });
        }
    }

    public void lambda$deleteContacts$108(ArrayList arrayList) {
        try {
            String join = TextUtils.join(",", arrayList);
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM contacts WHERE uid IN(" + join + ")").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void applyPhoneBookUpdates(final String str, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$applyPhoneBookUpdates$109(str, str2);
                }
            });
        }
    }

    public void lambda$applyPhoneBookUpdates$109(String str, String str2) {
        try {
            if (str.length() != 0) {
                this.database.executeFast(String.format(Locale.US, "UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(%s)", str)).stepThis().dispose();
            }
            if (str2.length() != 0) {
                this.database.executeFast(String.format(Locale.US, "UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(%s)", str2)).stepThis().dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void putCachedPhoneBook(final HashMap<String, ContactsController.Contact> hashMap, final boolean z, boolean z2) {
        if (hashMap == null) {
            return;
        }
        if (!hashMap.isEmpty() || z || z2) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putCachedPhoneBook$110(hashMap, z);
                }
            });
        }
    }

    public void lambda$putCachedPhoneBook$110(HashMap hashMap, boolean z) {
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d(this.currentAccount + " save contacts to db " + hashMap.size());
            }
            this.database.executeFast("DELETE FROM user_contacts_v7 WHERE 1").stepThis().dispose();
            this.database.executeFast("DELETE FROM user_phones_v7 WHERE 1").stepThis().dispose();
            this.database.beginTransaction();
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO user_contacts_v7 VALUES(?, ?, ?, ?, ?)");
            SQLitePreparedStatement executeFast2 = this.database.executeFast("REPLACE INTO user_phones_v7 VALUES(?, ?, ?, ?)");
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ContactsController.Contact contact = (ContactsController.Contact) ((Map.Entry) it.next()).getValue();
                if (!contact.phones.isEmpty() && !contact.shortPhones.isEmpty()) {
                    executeFast.requery();
                    executeFast.bindString(1, contact.key);
                    executeFast.bindInteger(2, contact.contact_id);
                    executeFast.bindString(3, contact.first_name);
                    executeFast.bindString(4, contact.last_name);
                    executeFast.bindInteger(5, contact.imported);
                    executeFast.step();
                    for (int i = 0; i < contact.phones.size(); i++) {
                        executeFast2.requery();
                        executeFast2.bindString(1, contact.key);
                        executeFast2.bindString(2, contact.phones.get(i));
                        executeFast2.bindString(3, contact.shortPhones.get(i));
                        executeFast2.bindInteger(4, contact.phoneDeleted.get(i).intValue());
                        executeFast2.step();
                    }
                }
            }
            executeFast.dispose();
            executeFast2.dispose();
            this.database.commitTransaction();
            if (z) {
                this.database.executeFast("DROP TABLE IF EXISTS user_contacts_v6;").stepThis().dispose();
                this.database.executeFast("DROP TABLE IF EXISTS user_phones_v6;").stepThis().dispose();
                getCachedPhoneBook(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void getCachedPhoneBook(final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getCachedPhoneBook$111(z);
            }
        });
    }

    public void lambda$getCachedPhoneBook$111(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getCachedPhoneBook$111(boolean):void");
    }

    public void getContacts() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getContacts$112();
            }
        });
    }

    public void lambda$getContacts$112() {
        ArrayList<TLRPC$TL_contact> arrayList = new ArrayList<>();
        ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
        try {
            SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
            StringBuilder sb = new StringBuilder();
            while (queryFinalized.next()) {
                TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                tLRPC$TL_contact.user_id = queryFinalized.intValue(0);
                tLRPC$TL_contact.mutual = queryFinalized.intValue(1) == 1;
                if (sb.length() != 0) {
                    sb.append(",");
                }
                arrayList.add(tLRPC$TL_contact);
                sb.append(tLRPC$TL_contact.user_id);
            }
            queryFinalized.dispose();
            if (sb.length() != 0) {
                getUsersInternal(sb.toString(), arrayList2);
            }
        } catch (Exception e) {
            arrayList.clear();
            arrayList2.clear();
            FileLog.e(e);
        }
        getContactsController().processLoadedContacts(arrayList, arrayList2, 1);
    }

    public void getUnsentMessages(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getUnsentMessages$113(i);
            }
        });
    }

    public void lambda$getUnsentMessages$113(int i) {
        int i2;
        try {
            SparseArray sparseArray = new SparseArray();
            ArrayList<TLRPC$Message> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<TLRPC$User> arrayList3 = new ArrayList<>();
            ArrayList<TLRPC$Chat> arrayList4 = new ArrayList<>();
            ArrayList<TLRPC$EncryptedChat> arrayList5 = new ArrayList<>();
            ArrayList<Long> arrayList6 = new ArrayList<>();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            SQLiteDatabase sQLiteDatabase = this.database;
            boolean z = false;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.read_state, m.data, m.send_state, m.mid, m.date, r.random_id, m.uid, s.seq_in, s.seq_out, m.ttl FROM messages_v2 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid AND r.uid = m.uid LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE (m.mid < 0 AND m.send_state = 1) OR (m.mid > 0 AND m.send_state = 3) ORDER BY m.mid DESC LIMIT " + i, new Object[0]);
            while (true) {
                i2 = 1;
                if (!queryFinalized.next()) {
                    break;
                }
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z), z);
                    TLdeserialize.send_state = queryFinalized.intValue(2);
                    TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                    byteBufferValue.reuse();
                    if (sparseArray.indexOfKey(TLdeserialize.id) < 0) {
                        MessageObject.setUnreadFlags(TLdeserialize, queryFinalized.intValue(0));
                        TLdeserialize.id = queryFinalized.intValue(3);
                        TLdeserialize.date = queryFinalized.intValue(4);
                        if (!queryFinalized.isNull(5)) {
                            TLdeserialize.random_id = queryFinalized.longValue(5);
                        }
                        TLdeserialize.dialog_id = queryFinalized.longValue(6);
                        TLdeserialize.seq_in = queryFinalized.intValue(7);
                        TLdeserialize.seq_out = queryFinalized.intValue(8);
                        TLdeserialize.ttl = queryFinalized.intValue(9);
                        arrayList.add(TLdeserialize);
                        sparseArray.put(TLdeserialize.id, TLdeserialize);
                        if (DialogObject.isEncryptedDialog(TLdeserialize.dialog_id)) {
                            int encryptedChatId = DialogObject.getEncryptedChatId(TLdeserialize.dialog_id);
                            if (!arrayList8.contains(Integer.valueOf(encryptedChatId))) {
                                arrayList8.add(Integer.valueOf(encryptedChatId));
                            }
                        } else if (DialogObject.isUserDialog(TLdeserialize.dialog_id)) {
                            if (!arrayList6.contains(Long.valueOf(TLdeserialize.dialog_id))) {
                                arrayList6.add(Long.valueOf(TLdeserialize.dialog_id));
                            }
                        } else if (!arrayList7.contains(Long.valueOf(-TLdeserialize.dialog_id))) {
                            arrayList7.add(Long.valueOf(-TLdeserialize.dialog_id));
                        }
                        addUsersAndChatsFromMessage(TLdeserialize, arrayList6, arrayList7);
                        if (TLdeserialize.send_state != 3 && ((TLdeserialize.peer_id.channel_id == 0 && !MessageObject.isUnread(TLdeserialize) && !DialogObject.isEncryptedDialog(TLdeserialize.dialog_id)) || TLdeserialize.id > 0)) {
                            TLdeserialize.send_state = 0;
                        }
                    }
                }
                z = false;
            }
            queryFinalized.dispose();
            boolean z2 = false;
            SQLiteCursor queryFinalized2 = this.database.queryFinalized("SELECT m.data, m.send_state, m.mid, m.date, r.random_id, m.uid, m.ttl FROM scheduled_messages_v2 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid AND r.uid = m.uid WHERE (m.mid < 0 AND m.send_state = 1) OR (m.mid > 0 AND m.send_state = 3) ORDER BY date ASC", new Object[0]);
            while (queryFinalized2.next()) {
                int i3 = z2 ? 1 : 0;
                int i4 = z2 ? 1 : 0;
                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(i3);
                if (byteBufferValue2 != null) {
                    TLRPC$Message TLdeserialize2 = TLRPC$Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(z2), z2);
                    TLdeserialize2.send_state = queryFinalized2.intValue(i2);
                    TLdeserialize2.readAttachPath(byteBufferValue2, getUserConfig().clientUserId);
                    byteBufferValue2.reuse();
                    if (sparseArray.indexOfKey(TLdeserialize2.id) < 0) {
                        TLdeserialize2.id = queryFinalized2.intValue(2);
                        TLdeserialize2.date = queryFinalized2.intValue(3);
                        if (!queryFinalized2.isNull(4)) {
                            TLdeserialize2.random_id = queryFinalized2.longValue(4);
                        }
                        TLdeserialize2.dialog_id = queryFinalized2.longValue(5);
                        TLdeserialize2.ttl = queryFinalized2.intValue(6);
                        arrayList2.add(TLdeserialize2);
                        sparseArray.put(TLdeserialize2.id, TLdeserialize2);
                        if (DialogObject.isEncryptedDialog(TLdeserialize2.dialog_id)) {
                            int encryptedChatId2 = DialogObject.getEncryptedChatId(TLdeserialize2.dialog_id);
                            if (!arrayList8.contains(Integer.valueOf(encryptedChatId2))) {
                                arrayList8.add(Integer.valueOf(encryptedChatId2));
                            }
                        } else if (DialogObject.isUserDialog(TLdeserialize2.dialog_id)) {
                            if (!arrayList6.contains(Long.valueOf(TLdeserialize2.dialog_id))) {
                                arrayList6.add(Long.valueOf(TLdeserialize2.dialog_id));
                            }
                        } else if (!arrayList7.contains(Long.valueOf(-TLdeserialize2.dialog_id))) {
                            arrayList7.add(Long.valueOf(-TLdeserialize2.dialog_id));
                        }
                        addUsersAndChatsFromMessage(TLdeserialize2, arrayList6, arrayList7);
                        if (TLdeserialize2.send_state != 3) {
                            if (!(TLdeserialize2.peer_id.channel_id != 0 || MessageObject.isUnread(TLdeserialize2) || DialogObject.isEncryptedDialog(TLdeserialize2.dialog_id)) || TLdeserialize2.id > 0) {
                                TLdeserialize2.send_state = 0;
                            }
                            z2 = false;
                            i2 = 1;
                        }
                    }
                }
                z2 = false;
                i2 = 1;
            }
            queryFinalized2.dispose();
            if (!arrayList8.isEmpty()) {
                getEncryptedChatsInternal(TextUtils.join(",", arrayList8), arrayList5, arrayList6);
            }
            if (!arrayList6.isEmpty()) {
                getUsersInternal(TextUtils.join(",", arrayList6), arrayList3);
            }
            if (!arrayList7.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i5 = 0; i5 < arrayList7.size(); i5++) {
                    Long l = (Long) arrayList7.get(i5);
                    if (sb.length() != 0) {
                        sb.append(",");
                    }
                    sb.append(l);
                }
                getChatsInternal(sb.toString(), arrayList4);
            }
            getSendMessagesHelper().processUnsentMessages(arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean checkMessageByRandomId(final long j) {
        final boolean[] zArr = new boolean[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$checkMessageByRandomId$114(j, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return zArr[0];
    }

    public void lambda$checkMessageByRandomId$114(long r7, boolean[] r9, java.util.concurrent.CountDownLatch r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkMessageByRandomId$114(long, boolean[], java.util.concurrent.CountDownLatch):void");
    }

    public boolean checkMessageId(final long j, final int i) {
        final boolean[] zArr = new boolean[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$checkMessageId$115(j, i, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return zArr[0];
    }

    public void lambda$checkMessageId$115(long r6, int r8, boolean[] r9, java.util.concurrent.CountDownLatch r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkMessageId$115(long, int, boolean[], java.util.concurrent.CountDownLatch):void");
    }

    public void getUnreadMention(final long j, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getUnreadMention$117(j, intCallback);
            }
        });
    }

    public void lambda$getUnreadMention$117(long j, final IntCallback intCallback) {
        try {
            final int i = 0;
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT MIN(mid) FROM messages_v2 WHERE uid = %d AND mention = 1 AND read_state IN(0, 1)", Long.valueOf(j)), new Object[0]);
            if (queryFinalized.next()) {
                i = queryFinalized.intValue(0);
            }
            queryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.IntCallback.this.run(i);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void getMessagesCount(final long j, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getMessagesCount$119(j, intCallback);
            }
        });
    }

    public void lambda$getMessagesCount$119(long j, final IntCallback intCallback) {
        try {
            final int i = 0;
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM messages_v2 WHERE uid = %d", Long.valueOf(j)), new Object[0]);
            if (queryFinalized.next()) {
                i = queryFinalized.intValue(0);
            }
            queryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.IntCallback.this.run(i);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public java.lang.Runnable getMessagesInternal(final long r46, final long r48, int r50, int r51, final int r52, int r53, final int r54, final int r55, final boolean r56, final int r57, final int r58, final boolean r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.getMessagesInternal(long, long, int, int, int, int, int, int, boolean, int, int, boolean):java.lang.Runnable");
    }

    public static int lambda$getMessagesInternal$120(TLRPC$Message tLRPC$Message, TLRPC$Message tLRPC$Message2) {
        int i;
        int i2;
        int i3 = tLRPC$Message.id;
        if (i3 <= 0 || (i2 = tLRPC$Message2.id) <= 0) {
            if (i3 >= 0 || (i = tLRPC$Message2.id) >= 0) {
                int i4 = tLRPC$Message.date;
                int i5 = tLRPC$Message2.date;
                if (i4 > i5) {
                    return -1;
                }
                return i4 < i5 ? 1 : 0;
            } else if (i3 < i) {
                return -1;
            } else {
                return i3 > i ? 1 : 0;
            }
        } else if (i3 > i2) {
            return -1;
        } else {
            return i3 < i2 ? 1 : 0;
        }
    }

    public void lambda$getMessagesInternal$121(TLRPC$TL_messages_messages tLRPC$TL_messages_messages, int i, long j, long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, boolean z2, int i11, int i12, boolean z3, int i13, boolean z4) {
        getMessagesController().processLoadedMessages(tLRPC$TL_messages_messages, i, j, j2, i2, i3, i4, true, i5, i6, i7, i8, i9, i10, z, z2 ? 1 : 0, i11, i12, z3, i13, z4);
    }

    public void getMessages(final long j, final long j2, boolean z, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final boolean z2, final int i7, final int i8, final boolean z3) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getMessages$122(j, j2, i, i2, i3, i4, i5, i6, z2, i7, i8, z3);
            }
        });
    }

    public void lambda$getMessages$122(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, boolean z2) {
        Utilities.stageQueue.postRunnable(getMessagesInternal(j, j2, i, i2, i3, i4, i5, i6, z, i7, i8, z2));
    }

    public void clearSentMedia() {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearSentMedia$123();
            }
        });
    }

    public void lambda$clearSentMedia$123() {
        try {
            this.database.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
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
                MessagesStorage.this.lambda$getSentFile$124(str, i, objArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (objArr[0] != null) {
            return objArr;
        }
        return null;
    }

    public void lambda$getSentFile$124(String str, int i, Object[] objArr, CountDownLatch countDownLatch) {
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
                FileLog.e(e);
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
        if (!arrayList.isEmpty()) {
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
                FileLog.e(e);
            }
        }
    }

    public void putWidgetDialogs(final int i, final ArrayList<Long> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putWidgetDialogs$125(i, arrayList);
            }
        });
    }

    public void lambda$putWidgetDialogs$125(int i, ArrayList arrayList) {
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
                    long longValue = ((Long) arrayList.get(i2)).longValue();
                    executeFast.requery();
                    executeFast.bindInteger(1, i);
                    executeFast.bindLong(2, longValue);
                    executeFast.bindInteger(3, i2);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            this.database.commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void clearWidgetDialogs(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearWidgetDialogs$126(i);
            }
        });
    }

    public void lambda$clearWidgetDialogs$126(int i) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM shortcut_widget WHERE id = " + i).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void getWidgetDialogIds(final int i, final int i2, final ArrayList<Long> arrayList, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final boolean z) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getWidgetDialogIds$127(i, arrayList, arrayList2, arrayList3, z, i2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$getWidgetDialogIds$127(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i2, CountDownLatch countDownLatch) {
        try {
            try {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT did FROM shortcut_widget WHERE id = %d ORDER BY ord ASC", Integer.valueOf(i)), new Object[0]);
                while (queryFinalized.next()) {
                    long longValue = queryFinalized.longValue(0);
                    if (longValue != -1) {
                        arrayList.add(Long.valueOf(longValue));
                        if (!(arrayList2 == null || arrayList3 == null)) {
                            if (DialogObject.isUserDialog(longValue)) {
                                arrayList4.add(Long.valueOf(longValue));
                            } else {
                                arrayList5.add(Long.valueOf(-longValue));
                            }
                        }
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
                                if (!(arrayList2 == null || arrayList3 == null)) {
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
                            if (!(arrayList2 == null || arrayList3 == null)) {
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
                if (!(arrayList2 == null || arrayList3 == null)) {
                    if (!arrayList5.isEmpty()) {
                        getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    if (!arrayList4.isEmpty()) {
                        getUsersInternal(TextUtils.join(",", arrayList4), arrayList2);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    public void getWidgetDialogs(final int i, final int i2, final ArrayList<Long> arrayList, final LongSparseArray<TLRPC$Dialog> longSparseArray, final LongSparseArray<TLRPC$Message> longSparseArray2, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getWidgetDialogs$128(i, arrayList, i2, longSparseArray, longSparseArray2, arrayList3, arrayList2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$getWidgetDialogs$128(int i, ArrayList arrayList, int i2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        boolean z;
        SQLiteCursor sQLiteCursor;
        try {
            try {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT did FROM shortcut_widget WHERE id = %d ORDER BY ord ASC", Integer.valueOf(i)), new Object[0]);
                while (queryFinalized.next()) {
                    long longValue = queryFinalized.longValue(0);
                    if (longValue != -1) {
                        arrayList.add(Long.valueOf(longValue));
                        if (DialogObject.isUserDialog(longValue)) {
                            arrayList4.add(Long.valueOf(longValue));
                        } else {
                            arrayList5.add(Long.valueOf(-longValue));
                        }
                    }
                }
                queryFinalized.dispose();
                if (arrayList.isEmpty() && i2 == 1) {
                    SQLiteCursor queryFinalized2 = getMessagesStorage().getDatabase().queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                    while (queryFinalized2.next()) {
                        long longValue2 = queryFinalized2.longValue(0);
                        arrayList.add(Long.valueOf(longValue2));
                        if (DialogObject.isUserDialog(longValue2)) {
                            arrayList4.add(Long.valueOf(longValue2));
                        } else {
                            arrayList5.add(Long.valueOf(-longValue2));
                        }
                    }
                    queryFinalized2.dispose();
                }
                if (arrayList.isEmpty()) {
                    sQLiteCursor = this.database.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.folder_id = 0 ORDER BY d.pinned DESC, d.date DESC LIMIT 0,10", new Object[0]);
                    z = true;
                } else {
                    sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.did IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
                    z = false;
                }
                while (sQLiteCursor.next()) {
                    long longValue3 = sQLiteCursor.longValue(0);
                    if (!DialogObject.isFolderDialogId(longValue3)) {
                        if (z) {
                            arrayList.add(Long.valueOf(longValue3));
                        }
                        TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
                        tLRPC$TL_dialog.id = longValue3;
                        tLRPC$TL_dialog.top_message = sQLiteCursor.intValue(1);
                        tLRPC$TL_dialog.unread_count = sQLiteCursor.intValue(2);
                        tLRPC$TL_dialog.last_message_date = sQLiteCursor.intValue(3);
                        longSparseArray.put(tLRPC$TL_dialog.id, tLRPC$TL_dialog);
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                            byteBufferValue.reuse();
                            MessageObject.setUnreadFlags(TLdeserialize, sQLiteCursor.intValue(5));
                            TLdeserialize.id = sQLiteCursor.intValue(6);
                            TLdeserialize.send_state = sQLiteCursor.intValue(7);
                            int intValue = sQLiteCursor.intValue(8);
                            if (intValue != 0) {
                                tLRPC$TL_dialog.last_message_date = intValue;
                            }
                            long j = tLRPC$TL_dialog.id;
                            TLdeserialize.dialog_id = j;
                            longSparseArray2.put(j, TLdeserialize);
                            addUsersAndChatsFromMessage(TLdeserialize, arrayList4, arrayList5);
                        }
                    }
                }
                sQLiteCursor.dispose();
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    public void putSentFile(final String str, final TLObject tLObject, final int i, final String str2) {
        if (str != null && tLObject != null && str2 != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putSentFile$129(str, tLObject, i, str2);
                }
            });
        }
    }

    public void lambda$putSentFile$129(String str, TLObject tLObject, int i, String str2) {
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
                    if (tLRPC$MessageMedia != null) {
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
                    } else {
                        return;
                    }
                }
                if (sQLitePreparedStatement == null) {
                    return;
                }
            } catch (Exception e) {
                FileLog.e(e);
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
        if (tLRPC$EncryptedChat != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateEncryptedChatSeq$130(tLRPC$EncryptedChat, z);
                }
            });
        }
    }

    public void lambda$updateEncryptedChatSeq$130(TLRPC$EncryptedChat tLRPC$EncryptedChat, boolean z) {
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
                FileLog.e(e);
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
        if (tLRPC$EncryptedChat != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateEncryptedChatTTL$131(tLRPC$EncryptedChat);
                }
            });
        }
    }

    public void lambda$updateEncryptedChatTTL$131(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE enc_chats SET ttl = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, tLRPC$EncryptedChat.ttl);
                sQLitePreparedStatement.bindInteger(2, tLRPC$EncryptedChat.id);
                sQLitePreparedStatement.step();
            } catch (Exception e) {
                FileLog.e(e);
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
        if (tLRPC$EncryptedChat != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateEncryptedChatLayer$132(tLRPC$EncryptedChat);
                }
            });
        }
    }

    public void lambda$updateEncryptedChatLayer$132(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE enc_chats SET layer = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, tLRPC$EncryptedChat.layer);
                sQLitePreparedStatement.bindInteger(2, tLRPC$EncryptedChat.id);
                sQLitePreparedStatement.step();
            } catch (Exception e) {
                FileLog.e(e);
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
        if (tLRPC$EncryptedChat != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateEncryptedChat$133(tLRPC$EncryptedChat);
                }
            });
        }
    }

    public void lambda$updateEncryptedChat$133(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
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
                FileLog.e(e);
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
                MessagesStorage.this.lambda$isDialogHasTopMessage$134(j, runnable);
            }
        });
    }

    public void lambda$isDialogHasTopMessage$134(long j, Runnable runnable) {
        boolean z = false;
        try {
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT last_mid FROM dialogs WHERE did = %d", Long.valueOf(j)), new Object[0]);
            if (queryFinalized.next() && queryFinalized.intValue(0) != 0) {
                z = true;
            }
            queryFinalized.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!z) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public boolean hasAuthMessage(final int i) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$hasAuthMessage$135(i, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return zArr[0];
    }

    public void lambda$hasAuthMessage$135(int i, boolean[] zArr, CountDownLatch countDownLatch) {
        try {
            try {
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT mid FROM messages_v2 WHERE uid = 777000 AND date = %d AND mid < 0 LIMIT 1", Integer.valueOf(i)), new Object[0]);
                zArr[0] = queryFinalized.next();
                queryFinalized.dispose();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    public void getEncryptedChat(final long j, final CountDownLatch countDownLatch, final ArrayList<TLObject> arrayList) {
        if (countDownLatch != null && arrayList != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$getEncryptedChat$136(j, arrayList, countDownLatch);
                }
            });
        }
    }

    public void lambda$getEncryptedChat$136(long j, ArrayList arrayList, CountDownLatch countDownLatch) {
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
                FileLog.e(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    public void putEncryptedChat(final TLRPC$EncryptedChat tLRPC$EncryptedChat, final TLRPC$User tLRPC$User, final TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$EncryptedChat != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putEncryptedChat$137(tLRPC$EncryptedChat, tLRPC$User, tLRPC$Dialog);
                }
            });
        }
    }

    public void lambda$putEncryptedChat$137(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$User tLRPC$User, TLRPC$Dialog tLRPC$Dialog) {
        byte[] bArr;
        try {
            byte[] bArr2 = tLRPC$EncryptedChat.key_hash;
            if ((bArr2 == null || bArr2.length < 16) && (bArr = tLRPC$EncryptedChat.auth_key) != null) {
                tLRPC$EncryptedChat.key_hash = AndroidUtilities.calcAuthKeyHash(bArr);
            }
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO enc_chats VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
            executeFast.bindInteger(1, tLRPC$EncryptedChat.id);
            executeFast.bindLong(2, tLRPC$User.id);
            executeFast.bindString(3, formatUserSearchName(tLRPC$User));
            executeFast.bindByteBuffer(4, nativeByteBuffer);
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
            executeFast.bindByteBuffer(5, nativeByteBuffer2);
            executeFast.bindByteBuffer(6, nativeByteBuffer3);
            executeFast.bindInteger(7, tLRPC$EncryptedChat.ttl);
            executeFast.bindInteger(8, tLRPC$EncryptedChat.layer);
            executeFast.bindInteger(9, tLRPC$EncryptedChat.seq_in);
            executeFast.bindInteger(10, tLRPC$EncryptedChat.seq_out);
            executeFast.bindInteger(11, tLRPC$EncryptedChat.key_use_count_out | (tLRPC$EncryptedChat.key_use_count_in << 16));
            executeFast.bindLong(12, tLRPC$EncryptedChat.exchange_id);
            executeFast.bindInteger(13, tLRPC$EncryptedChat.key_create_date);
            executeFast.bindLong(14, tLRPC$EncryptedChat.future_key_fingerprint);
            executeFast.bindByteBuffer(15, nativeByteBuffer4);
            executeFast.bindByteBuffer(16, nativeByteBuffer5);
            executeFast.bindInteger(17, tLRPC$EncryptedChat.in_seq_no);
            executeFast.bindLong(18, tLRPC$EncryptedChat.admin_id);
            executeFast.bindInteger(19, tLRPC$EncryptedChat.mtproto_seq);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
            nativeByteBuffer2.reuse();
            nativeByteBuffer3.reuse();
            nativeByteBuffer4.reuse();
            nativeByteBuffer5.reuse();
            if (tLRPC$Dialog != null) {
                SQLitePreparedStatement executeFast2 = this.database.executeFast("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                executeFast2.bindLong(1, tLRPC$Dialog.id);
                executeFast2.bindInteger(2, tLRPC$Dialog.last_message_date);
                executeFast2.bindInteger(3, tLRPC$Dialog.unread_count);
                executeFast2.bindInteger(4, tLRPC$Dialog.top_message);
                executeFast2.bindInteger(5, tLRPC$Dialog.read_inbox_max_id);
                executeFast2.bindInteger(6, tLRPC$Dialog.read_outbox_max_id);
                executeFast2.bindInteger(7, 0);
                executeFast2.bindInteger(8, tLRPC$Dialog.unread_mentions_count);
                executeFast2.bindInteger(9, tLRPC$Dialog.pts);
                executeFast2.bindInteger(10, 0);
                executeFast2.bindInteger(11, tLRPC$Dialog.pinnedNum);
                executeFast2.bindInteger(12, tLRPC$Dialog.flags);
                executeFast2.bindInteger(13, tLRPC$Dialog.folder_id);
                executeFast2.bindNull(14);
                executeFast2.bindInteger(15, tLRPC$Dialog.unread_reactions_count);
                executeFast2.step();
                executeFast2.dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
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
        }
        return sb.toString().toLowerCase();
    }

    private void putUsersInternal(ArrayList<TLRPC$User> arrayList) throws Exception {
        if (!(arrayList == null || arrayList.isEmpty())) {
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO users VALUES(?, ?, ?, ?)");
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$User tLRPC$User = arrayList.get(i);
                if (tLRPC$User.min) {
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
                            FileLog.e(e);
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
    }

    public void updateChatDefaultBannedRights(final long j, final TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, final int i) {
        if (tLRPC$TL_chatBannedRights != null && j != 0) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateChatDefaultBannedRights$138(j, i, tLRPC$TL_chatBannedRights);
                }
            });
        }
    }

    public void lambda$updateChatDefaultBannedRights$138(long j, int i, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights) {
        NativeByteBuffer byteBufferValue;
        TLRPC$Chat tLRPC$Chat = null;
        try {
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM chats WHERE uid = %d", Long.valueOf(j)), new Object[0]);
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tLRPC$Chat = TLRPC$Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tLRPC$Chat == null) {
                return;
            }
            if (tLRPC$Chat.default_banned_rights == null || i >= tLRPC$Chat.version) {
                tLRPC$Chat.default_banned_rights = tLRPC$TL_chatBannedRights;
                tLRPC$Chat.flags |= 262144;
                tLRPC$Chat.version = i;
                SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE chats SET data = ? WHERE uid = ?");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Chat.getObjectSize());
                tLRPC$Chat.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindLong(2, tLRPC$Chat.id);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void putChatsInternal(ArrayList<TLRPC$Chat> arrayList) throws Exception {
        if (!(arrayList == null || arrayList.isEmpty())) {
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chats VALUES(?, ?, ?)");
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$Chat tLRPC$Chat = arrayList.get(i);
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
                                        TLdeserialize.flags |= 16384;
                                    }
                                    TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2 = tLRPC$Chat.banned_rights;
                                    if (tLRPC$TL_chatBannedRights2 != null) {
                                        TLdeserialize.banned_rights = tLRPC$TL_chatBannedRights2;
                                        TLdeserialize.flags |= 32768;
                                    }
                                    String str = tLRPC$Chat.username;
                                    if (str != null) {
                                        TLdeserialize.username = str;
                                        TLdeserialize.flags |= 64;
                                    } else {
                                        TLdeserialize.username = null;
                                        TLdeserialize.flags &= -65;
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
            }
            executeFast.dispose();
        }
    }

    public void getUsersInternal(String str, ArrayList<TLRPC$User> arrayList) throws Exception {
        if (str != null && str.length() != 0 && arrayList != null) {
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
                    FileLog.e(e);
                }
            }
            queryFinalized.dispose();
        }
    }

    public void getChatsInternal(String str, ArrayList<TLRPC$Chat> arrayList) throws Exception {
        if (str != null && str.length() != 0 && arrayList != null) {
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM chats WHERE uid IN(%s)", str), new Object[0]);
            while (queryFinalized.next()) {
                try {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC$Chat TLdeserialize = TLRPC$Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            arrayList.add(TLdeserialize);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            queryFinalized.dispose();
        }
    }

    public void getEncryptedChatsInternal(String str, ArrayList<TLRPC$EncryptedChat> arrayList, ArrayList<Long> arrayList2) throws Exception {
        if (str != null && str.length() != 0 && arrayList != null) {
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
                    FileLog.e(e);
                }
            }
            queryFinalized.dispose();
        }
    }

    public void lambda$putUsersAndChats$139(ArrayList<TLRPC$User> arrayList, ArrayList<TLRPC$Chat> arrayList2, boolean z) {
        if (z) {
            try {
                this.database.beginTransaction();
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        putUsersInternal(arrayList);
        putChatsInternal(arrayList2);
        if (z) {
            this.database.commitTransaction();
        }
    }

    public void putUsersAndChats(final ArrayList<TLRPC$User> arrayList, final ArrayList<TLRPC$Chat> arrayList2, final boolean z, boolean z2) {
        if (arrayList != null && arrayList.isEmpty() && arrayList2 != null && arrayList2.isEmpty()) {
            return;
        }
        if (z2) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putUsersAndChats$139(arrayList, arrayList2, z);
                }
            });
        } else {
            lambda$putUsersAndChats$139(arrayList, arrayList2, z);
        }
    }

    public void removeFromDownloadQueue(final long j, final int i, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$removeFromDownloadQueue$140(z, i, j);
            }
        });
    }

    public void lambda$removeFromDownloadQueue$140(boolean z, int i, long j) {
        try {
            if (z) {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT min(date) FROM download_queue WHERE type = %d", Integer.valueOf(i)), new Object[0]);
                int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : -1;
                queryFinalized.dispose();
                if (intValue != -1) {
                    this.database.executeFast(String.format(locale, "UPDATE download_queue SET date = %d WHERE uid = %d AND type = %d", Integer.valueOf(intValue - 1), Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
                    return;
                }
                return;
            }
            this.database.executeFast(String.format(Locale.US, "DELETE FROM download_queue WHERE uid = %d AND type = %d", Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void deleteFromDownloadQueue(final ArrayList<Pair<Long, Integer>> arrayList, boolean z) {
        if (!(arrayList == null || arrayList.isEmpty())) {
            if (z) {
                try {
                    this.database.beginTransaction();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            SQLitePreparedStatement executeFast = this.database.executeFast("DELETE FROM download_queue WHERE uid = ? AND type = ?");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Pair<Long, Integer> pair = arrayList.get(i);
                executeFast.requery();
                executeFast.bindLong(1, ((Long) pair.first).longValue());
                executeFast.bindInteger(2, ((Integer) pair.second).intValue());
                executeFast.step();
            }
            executeFast.dispose();
            if (z) {
                this.database.commitTransaction();
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$deleteFromDownloadQueue$141(arrayList);
                }
            });
        }
    }

    public void lambda$deleteFromDownloadQueue$141(ArrayList arrayList) {
        getDownloadController().cancelDownloading(arrayList);
    }

    public void clearDownloadQueue(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$clearDownloadQueue$142(i);
            }
        });
    }

    public void lambda$clearDownloadQueue$142(int i) {
        try {
            if (i == 0) {
                this.database.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
            } else {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM download_queue WHERE type = %d", Integer.valueOf(i))).stepThis().dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void getDownloadQueue(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getDownloadQueue$144(i);
            }
        });
    }

    public void lambda$getDownloadQueue$144(final int i) {
        int i2;
        try {
            final ArrayList arrayList = new ArrayList();
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT uid, type, data, parent FROM download_queue WHERE type = %d ORDER BY date DESC LIMIT 3", Integer.valueOf(i)), new Object[0]);
            while (queryFinalized.next()) {
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
                        downloadObject.secret = MessageObject.isVideoDocument(tLRPC$Document) && (i2 = TLdeserialize.ttl_seconds) > 0 && i2 <= 60;
                    } else {
                        TLRPC$Photo tLRPC$Photo = TLdeserialize.photo;
                        if (tLRPC$Photo != null) {
                            downloadObject.object = tLRPC$Photo;
                            int i3 = TLdeserialize.ttl_seconds;
                            downloadObject.secret = i3 > 0 && i3 <= 60;
                        }
                    }
                    downloadObject.forceCache = (TLdeserialize.flags & Integer.MIN_VALUE) != 0;
                }
                arrayList.add(downloadObject);
            }
            queryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$getDownloadQueue$143(i, arrayList);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$getDownloadQueue$143(int i, ArrayList arrayList) {
        getDownloadController().processDownloadObjects(i, arrayList);
    }

    private int getMessageMediaType(TLRPC$Message tLRPC$Message) {
        if (!(tLRPC$Message instanceof TLRPC$TL_message_secret)) {
            if (tLRPC$Message instanceof TLRPC$TL_message) {
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                if (((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) || (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument)) && tLRPC$MessageMedia.ttl_seconds != 0) {
                    return 1;
                }
            }
            return ((tLRPC$Message.media instanceof TLRPC$TL_messageMediaPhoto) || MessageObject.isVideoMessage(tLRPC$Message)) ? 0 : -1;
        } else if (!(tLRPC$Message.media instanceof TLRPC$TL_messageMediaPhoto) && !MessageObject.isGifMessage(tLRPC$Message) && !MessageObject.isVoiceMessage(tLRPC$Message) && !MessageObject.isVideoMessage(tLRPC$Message) && !MessageObject.isRoundVideoMessage(tLRPC$Message)) {
            return -1;
        } else {
            int i = tLRPC$Message.ttl;
            return (i <= 0 || i > 60) ? 0 : 1;
        }
    }

    public void putWebPages(final LongSparseArray<TLRPC$WebPage> longSparseArray) {
        if (!isEmpty(longSparseArray)) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putWebPages$146(longSparseArray);
                }
            });
        }
    }

    public void lambda$putWebPages$146(LongSparseArray longSparseArray) {
        try {
            final ArrayList arrayList = new ArrayList();
            int size = longSparseArray.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 2;
                if (i2 >= size) {
                    break;
                }
                SQLiteDatabase sQLiteDatabase = this.database;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid, uid FROM webpage_pending_v2 WHERE id = " + longSparseArray.keyAt(i2), new Object[i]);
                LongSparseArray longSparseArray2 = new LongSparseArray();
                while (queryFinalized.next()) {
                    long longValue = queryFinalized.longValue(1);
                    ArrayList arrayList2 = (ArrayList) longSparseArray2.get(longValue);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        longSparseArray2.put(longValue, arrayList2);
                    }
                    arrayList2.add(Integer.valueOf(queryFinalized.intValue(i)));
                }
                queryFinalized.dispose();
                if (!longSparseArray2.isEmpty()) {
                    int size2 = longSparseArray2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        long keyAt = longSparseArray2.keyAt(i4);
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[i3];
                        objArr[0] = TextUtils.join(",", (ArrayList) longSparseArray2.valueAt(i4));
                        objArr[1] = Long.valueOf(keyAt);
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized(String.format(locale, "SELECT mid, data FROM messages_v2 WHERE mid IN (%s) AND uid = %d", objArr), new Object[0]);
                        while (queryFinalized2.next()) {
                            int intValue = queryFinalized2.intValue(0);
                            NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                                byteBufferValue.reuse();
                                TLRPC$MessageMedia tLRPC$MessageMedia = TLdeserialize.media;
                                if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaWebPage) {
                                    TLdeserialize.id = intValue;
                                    tLRPC$MessageMedia.webpage = (TLRPC$WebPage) longSparseArray.valueAt(i2);
                                    arrayList.add(TLdeserialize);
                                }
                            }
                        }
                        queryFinalized2.dispose();
                        i4++;
                        i3 = 2;
                    }
                }
                i2++;
                i = 0;
            }
            if (!arrayList.isEmpty()) {
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast2 = this.database.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    TLRPC$Message tLRPC$Message = (TLRPC$Message) arrayList.get(i5);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Message.getObjectSize());
                    tLRPC$Message.serializeToStream(nativeByteBuffer);
                    executeFast.requery();
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, tLRPC$Message.id);
                    executeFast.bindLong(3, MessageObject.getDialogId(tLRPC$Message));
                    executeFast.step();
                    executeFast2.requery();
                    executeFast2.bindByteBuffer(1, nativeByteBuffer);
                    executeFast2.bindInteger(2, tLRPC$Message.id);
                    executeFast2.bindLong(3, MessageObject.getDialogId(tLRPC$Message));
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                }
                executeFast.dispose();
                executeFast2.dispose();
                this.database.commitTransaction();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$putWebPages$145(arrayList);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putWebPages$145(ArrayList arrayList) {
        getNotificationCenter().postNotificationName(NotificationCenter.didReceivedWebpages, arrayList);
    }

    public void overwriteChannel(final long j, final TLRPC$TL_updates_channelDifferenceTooLong tLRPC$TL_updates_channelDifferenceTooLong, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$overwriteChannel$148(j, i, tLRPC$TL_updates_channelDifferenceTooLong);
            }
        });
    }

    public void lambda$overwriteChannel$148(long r19, int r21, final org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceTooLong r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$overwriteChannel$148(long, int, org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceTooLong):void");
    }

    public void lambda$overwriteChannel$147(long j, TLRPC$TL_updates_channelDifferenceTooLong tLRPC$TL_updates_channelDifferenceTooLong) {
        getNotificationCenter().postNotificationName(NotificationCenter.removeAllMessagesFromDialog, Long.valueOf(j), Boolean.TRUE, tLRPC$TL_updates_channelDifferenceTooLong);
    }

    public void putChannelViews(final LongSparseArray<SparseIntArray> longSparseArray, final LongSparseArray<SparseIntArray> longSparseArray2, final LongSparseArray<SparseArray<TLRPC$MessageReplies>> longSparseArray3, final boolean z) {
        if (!isEmpty(longSparseArray) || !isEmpty(longSparseArray2) || !isEmpty(longSparseArray3)) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putChannelViews$149(longSparseArray, longSparseArray2, longSparseArray3, z);
                }
            });
        }
    }

    public void lambda$putChannelViews$149(LongSparseArray longSparseArray, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3, boolean z) {
        TLRPC$TL_messageReplies tLRPC$TL_messageReplies;
        int i;
        int i2;
        NativeByteBuffer byteBufferValue;
        LongSparseArray longSparseArray4 = longSparseArray3;
        try {
            this.database.beginTransaction();
            int i3 = 2;
            char c = 1;
            if (!isEmpty(longSparseArray)) {
                SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET media = max((SELECT media FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
                    long keyAt = longSparseArray.keyAt(i4);
                    SparseIntArray sparseIntArray = (SparseIntArray) longSparseArray.valueAt(i4);
                    int size = sparseIntArray.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        int valueAt = sparseIntArray.valueAt(i5);
                        int keyAt2 = sparseIntArray.keyAt(i5);
                        executeFast.requery();
                        executeFast.bindInteger(1, keyAt2);
                        executeFast.bindLong(2, keyAt);
                        executeFast.bindInteger(3, valueAt);
                        executeFast.bindInteger(4, keyAt2);
                        executeFast.bindLong(5, keyAt);
                        executeFast.step();
                    }
                }
                executeFast.dispose();
            }
            if (!isEmpty(longSparseArray2)) {
                SQLitePreparedStatement executeFast2 = this.database.executeFast("UPDATE messages_v2 SET forwards = max((SELECT forwards FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                for (int i6 = 0; i6 < longSparseArray2.size(); i6++) {
                    long keyAt3 = longSparseArray2.keyAt(i6);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) longSparseArray2.valueAt(i6);
                    int size2 = sparseIntArray2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        int valueAt2 = sparseIntArray2.valueAt(i7);
                        int keyAt4 = sparseIntArray2.keyAt(i7);
                        executeFast2.requery();
                        executeFast2.bindInteger(1, keyAt4);
                        executeFast2.bindLong(2, keyAt3);
                        executeFast2.bindInteger(3, valueAt2);
                        executeFast2.bindInteger(4, keyAt4);
                        executeFast2.bindLong(5, keyAt3);
                        executeFast2.step();
                    }
                }
                executeFast2.dispose();
            }
            if (!isEmpty(longSparseArray3)) {
                SQLitePreparedStatement executeFast3 = this.database.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
                int i8 = 0;
                while (i8 < longSparseArray3.size()) {
                    long keyAt5 = longSparseArray4.keyAt(i8);
                    SparseArray sparseArray = (SparseArray) longSparseArray4.valueAt(i8);
                    int size3 = sparseArray.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        int keyAt6 = sparseArray.keyAt(i9);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[i3];
                        objArr[0] = Integer.valueOf(keyAt6);
                        objArr[c] = Long.valueOf(keyAt5);
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT replies_data FROM messages_v2 WHERE mid = %d AND uid = %d", objArr), new Object[0]);
                        boolean next = queryFinalized.next();
                        if (!next || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                            tLRPC$TL_messageReplies = null;
                        } else {
                            tLRPC$TL_messageReplies = TLRPC$MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                        }
                        queryFinalized.dispose();
                        if (next) {
                            TLRPC$MessageReplies tLRPC$MessageReplies = (TLRPC$MessageReplies) sparseArray.get(sparseArray.keyAt(i9));
                            if (z || tLRPC$TL_messageReplies == null || (i2 = tLRPC$TL_messageReplies.replies_pts) == 0 || tLRPC$MessageReplies.replies_pts > i2 || tLRPC$MessageReplies.read_max_id > tLRPC$TL_messageReplies.read_max_id || tLRPC$MessageReplies.max_id > tLRPC$TL_messageReplies.max_id) {
                                if (z) {
                                    if (tLRPC$TL_messageReplies == null) {
                                        TLRPC$TL_messageReplies tLRPC$TL_messageReplies2 = new TLRPC$TL_messageReplies();
                                        tLRPC$TL_messageReplies2.flags |= 2;
                                        tLRPC$TL_messageReplies = tLRPC$TL_messageReplies2;
                                    }
                                    tLRPC$TL_messageReplies.replies += tLRPC$MessageReplies.replies;
                                    int size4 = tLRPC$MessageReplies.recent_repliers.size();
                                    for (int i10 = 0; i10 < size4; i10++) {
                                        long peerId = MessageObject.getPeerId(tLRPC$MessageReplies.recent_repliers.get(i10));
                                        int size5 = tLRPC$TL_messageReplies.recent_repliers.size();
                                        int i11 = 0;
                                        while (i11 < size5) {
                                            if (peerId == MessageObject.getPeerId(tLRPC$TL_messageReplies.recent_repliers.get(i11))) {
                                                tLRPC$TL_messageReplies.recent_repliers.remove(i11);
                                                i11--;
                                                size5--;
                                            }
                                            i11++;
                                        }
                                    }
                                    tLRPC$TL_messageReplies.recent_repliers.addAll(0, tLRPC$MessageReplies.recent_repliers);
                                    while (tLRPC$TL_messageReplies.recent_repliers.size() > 3) {
                                        tLRPC$TL_messageReplies.recent_repliers.remove(0);
                                    }
                                    tLRPC$MessageReplies = tLRPC$TL_messageReplies;
                                }
                                if (tLRPC$TL_messageReplies != null && (i = tLRPC$TL_messageReplies.read_max_id) > tLRPC$MessageReplies.read_max_id) {
                                    tLRPC$MessageReplies.read_max_id = i;
                                }
                                executeFast3.requery();
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$MessageReplies.getObjectSize());
                                tLRPC$MessageReplies.serializeToStream(nativeByteBuffer);
                                executeFast3.bindByteBuffer(1, nativeByteBuffer);
                                executeFast3.bindInteger(2, keyAt6);
                                executeFast3.bindLong(3, keyAt5);
                                executeFast3.step();
                                nativeByteBuffer.reuse();
                                i9++;
                                i3 = 2;
                                c = 1;
                            }
                        }
                        i9++;
                        i3 = 2;
                        c = 1;
                    }
                    i8++;
                    longSparseArray4 = longSparseArray3;
                    i3 = 2;
                    c = 1;
                }
                executeFast3.dispose();
            }
            this.database.commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$updateRepliesMaxReadId$150(long j, int i, int i2) {
        NativeByteBuffer byteBufferValue;
        long j2 = -j;
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
            TLRPC$MessageReplies tLRPC$MessageReplies = null;
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT replies_data FROM messages_v2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j2)), new Object[0]);
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tLRPC$MessageReplies = TLRPC$MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tLRPC$MessageReplies != null) {
                tLRPC$MessageReplies.read_max_id = i2;
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$MessageReplies.getObjectSize());
                tLRPC$MessageReplies.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindInteger(2, i);
                executeFast.bindLong(3, j2);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateRepliesMaxReadId(final long j, final int i, final int i2, boolean z) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateRepliesMaxReadId$150(j, i, i2);
                }
            });
        } else {
            lambda$updateRepliesMaxReadId$150(j, i, i2);
        }
    }

    public void updateRepliesCount(final long j, final int i, final ArrayList<TLRPC$Peer> arrayList, final int i2, final int i3) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateRepliesCount$151(i, j, i3, arrayList, i2);
            }
        });
    }

    public void lambda$updateRepliesCount$151(int i, long j, int i2, ArrayList arrayList, int i3) {
        NativeByteBuffer byteBufferValue;
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
            TLRPC$MessageReplies tLRPC$MessageReplies = null;
            long j2 = -j;
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.ENGLISH, "SELECT replies_data FROM messages_v2 WHERE mid = %d AND uid = %d", Integer.valueOf(i), Long.valueOf(j2)), new Object[0]);
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tLRPC$MessageReplies = TLRPC$MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tLRPC$MessageReplies != null) {
                int i4 = tLRPC$MessageReplies.replies + i2;
                tLRPC$MessageReplies.replies = i4;
                if (i4 < 0) {
                    tLRPC$MessageReplies.replies = 0;
                }
                if (arrayList != null) {
                    tLRPC$MessageReplies.recent_repliers = arrayList;
                    tLRPC$MessageReplies.flags |= 2;
                }
                if (i3 != 0) {
                    tLRPC$MessageReplies.max_id = i3;
                }
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$MessageReplies.getObjectSize());
                tLRPC$MessageReplies.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindInteger(2, i);
                executeFast.bindLong(3, j2);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private boolean isValidKeyboardToSave(TLRPC$Message tLRPC$Message) {
        TLRPC$ReplyMarkup tLRPC$ReplyMarkup = tLRPC$Message.reply_markup;
        return tLRPC$ReplyMarkup != null && !(tLRPC$ReplyMarkup instanceof TLRPC$TL_replyInlineMarkup) && (!tLRPC$ReplyMarkup.selective || tLRPC$Message.mentioned);
    }

    public void updateMessageVerifyFlags(final ArrayList<TLRPC$Message> arrayList) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageVerifyFlags$152(arrayList);
            }
        });
    }

    public void lambda$updateMessageVerifyFlags$152(ArrayList arrayList) {
        try {
            this.database.beginTransaction();
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putMessages$154(java.util.ArrayList<org.telegram.tgnet.TLRPC$Message> r40, boolean r41, boolean r42, int r43, boolean r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putMessages$154(java.util.ArrayList, boolean, boolean, int, boolean, boolean):void");
    }

    public void lambda$putMessagesInternal$153(int i) {
        getDownloadController().newDownloadObjectsAvailable(i);
    }

    public void putMessages(ArrayList<TLRPC$Message> arrayList, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        putMessages(arrayList, z, z2, z3, i, false, z4);
    }

    public void putMessages(final ArrayList<TLRPC$Message> arrayList, final boolean z, boolean z2, final boolean z3, final int i, final boolean z4, final boolean z5) {
        if (arrayList.size() != 0) {
            if (z2) {
                this.storageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$putMessages$154(arrayList, z, z3, i, z4, z5);
                    }
                });
            } else {
                lambda$putMessages$154(arrayList, z, z3, i, z4, z5);
            }
        }
    }

    public void markMessageAsSendError(final TLRPC$Message tLRPC$Message, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$markMessageAsSendError$155(tLRPC$Message, z);
            }
        });
    }

    public void lambda$markMessageAsSendError$155(TLRPC$Message tLRPC$Message, boolean z) {
        try {
            long j = tLRPC$Message.id;
            if (z) {
                this.database.executeFast(String.format(Locale.US, "UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j), Long.valueOf(MessageObject.getDialogId(tLRPC$Message)))).stepThis().dispose();
            } else {
                this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET send_state = 2 WHERE mid = %d AND uid = %d", Long.valueOf(j), Long.valueOf(MessageObject.getDialogId(tLRPC$Message)))).stepThis().dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setMessageSeq(final int i, final int i2, final int i3) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setMessageSeq$156(i, i2, i3);
            }
        });
    }

    public void lambda$setMessageSeq$156(int i, int i2, int i3) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
            executeFast.requery();
            executeFast.bindInteger(1, i);
            executeFast.bindInteger(2, i2);
            executeFast.bindInteger(3, i3);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public long[] lambda$updateMessageStateAndId$158(long r20, long r22, java.lang.Integer r24, int r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateMessageStateAndId$158(long, long, java.lang.Integer, int, int, int):long[]");
    }

    public void lambda$updateMessageStateAndIdInternal$157(TLRPC$TL_updates tLRPC$TL_updates) {
        getMessagesController().processUpdates(tLRPC$TL_updates, false);
    }

    public long[] updateMessageStateAndId(final long j, final long j2, final Integer num, final int i, final int i2, boolean z, final int i3) {
        if (!z) {
            return lambda$updateMessageStateAndId$158(j, j2, num, i, i2, i3);
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageStateAndId$158(j, j2, num, i, i2, i3);
            }
        });
        return null;
    }

    public void lambda$updateUsers$159(ArrayList<TLRPC$User> arrayList, boolean z, boolean z2) {
        try {
            if (z) {
                if (z2) {
                    this.database.beginTransaction();
                }
                SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE users SET status = ? WHERE uid = ?");
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
                    return;
                }
                return;
            }
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
                    if (tLRPC$User4.first_name == null || tLRPC$User4.last_name == null) {
                        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$User4.photo;
                        if (tLRPC$UserProfilePhoto != null) {
                            tLRPC$User3.photo = tLRPC$UserProfilePhoto;
                        } else {
                            String str = tLRPC$User4.phone;
                            if (str != null) {
                                tLRPC$User3.phone = str;
                            }
                        }
                    } else {
                        if (!UserObject.isContact(tLRPC$User3)) {
                            tLRPC$User3.first_name = tLRPC$User4.first_name;
                            tLRPC$User3.last_name = tLRPC$User4.last_name;
                        }
                        tLRPC$User3.username = tLRPC$User4.username;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateUsers(final ArrayList<TLRPC$User> arrayList, final boolean z, final boolean z2, boolean z3) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z3) {
                this.storageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$updateUsers$159(arrayList, z, z2);
                    }
                });
            } else {
                lambda$updateUsers$159(arrayList, z, z2);
            }
        }
    }

    public void lambda$markMessagesAsRead$161(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray) {
        try {
            if (!isEmpty(longSparseIntArray)) {
                SQLitePreparedStatement executeFast = this.database.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                for (int i = 0; i < longSparseIntArray.size(); i++) {
                    long keyAt = longSparseIntArray.keyAt(i);
                    int i2 = longSparseIntArray.get(keyAt);
                    this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = %d AND mid > 0 AND mid <= %d AND read_state IN(0,2) AND out = 0", Long.valueOf(keyAt), Integer.valueOf(i2))).stepThis().dispose();
                    executeFast.requery();
                    executeFast.bindLong(1, keyAt);
                    executeFast.bindInteger(2, i2);
                    executeFast.step();
                }
                executeFast.dispose();
            }
            if (!isEmpty(longSparseIntArray2)) {
                for (int i3 = 0; i3 < longSparseIntArray2.size(); i3++) {
                    long keyAt2 = longSparseIntArray2.keyAt(i3);
                    this.database.executeFast(String.format(Locale.US, "UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = %d AND mid > 0 AND mid <= %d AND read_state IN(0,2) AND out = 1", Long.valueOf(keyAt2), Integer.valueOf(longSparseIntArray2.get(keyAt2)))).stepThis().dispose();
                }
            }
            if (!(sparseIntArray == null || isEmpty(sparseIntArray))) {
                for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                    long makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(sparseIntArray.keyAt(i4));
                    int valueAt = sparseIntArray.valueAt(i4);
                    SQLitePreparedStatement executeFast2 = this.database.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND date <= ? AND read_state IN(0,2) AND out = 1");
                    executeFast2.requery();
                    executeFast2.bindLong(1, makeEncryptedDialogId);
                    executeFast2.bindInteger(2, valueAt);
                    executeFast2.step();
                    executeFast2.dispose();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void markMessagesContentAsReadInternal(long j, ArrayList<Integer> arrayList, int i) {
        try {
            String join = TextUtils.join(",", arrayList);
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast(String.format(locale, "UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid IN (%s) AND uid = %d", join, Long.valueOf(j))).stepThis().dispose();
            if (i != 0) {
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(locale, "SELECT mid, ttl FROM messages_v2 WHERE mid IN (%s) AND uid = %d AND ttl > 0", join, Long.valueOf(j)), new Object[0]);
                ArrayList<Integer> arrayList2 = null;
                while (queryFinalized.next()) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                }
                if (arrayList2 != null) {
                    emptyMessagesMedia(j, arrayList2);
                }
                queryFinalized.dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void markMessagesContentAsRead(final long j, final ArrayList<Integer> arrayList, final int i) {
        if (!isEmpty(arrayList)) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$markMessagesContentAsRead$160(j, arrayList, i);
                }
            });
        }
    }

    public void lambda$markMessagesContentAsRead$160(long j, ArrayList arrayList, int i) {
        if (j == 0) {
            try {
                LongSparseArray longSparseArray = new LongSparseArray();
                SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT uid, mid FROM messages_v2 WHERE mid IN (%s) AND is_channel = 0", TextUtils.join(",", arrayList)), new Object[0]);
                while (queryFinalized.next()) {
                    long longValue = queryFinalized.longValue(0);
                    ArrayList arrayList2 = (ArrayList) longSparseArray.get(longValue);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        longSparseArray.put(longValue, arrayList2);
                    }
                    arrayList2.add(Integer.valueOf(queryFinalized.intValue(1)));
                }
                queryFinalized.dispose();
                int size = longSparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    markMessagesContentAsReadInternal(longSparseArray.keyAt(i2), (ArrayList) longSparseArray.valueAt(i2), i);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            markMessagesContentAsReadInternal(j, arrayList, i);
        }
    }

    public void markMessagesAsRead(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final SparseIntArray sparseIntArray, boolean z) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$markMessagesAsRead$161(longSparseIntArray, longSparseIntArray2, sparseIntArray);
                }
            });
        } else {
            lambda$markMessagesAsRead$161(longSparseIntArray, longSparseIntArray2, sparseIntArray);
        }
    }

    public void markMessagesAsDeletedByRandoms(final ArrayList<Long> arrayList) {
        if (!arrayList.isEmpty()) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$markMessagesAsDeletedByRandoms$163(arrayList);
                }
            });
        }
    }

    public void lambda$markMessagesAsDeletedByRandoms$163(ArrayList arrayList) {
        try {
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT mid, uid FROM randoms_v2 WHERE random_id IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
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
            if (!longSparseArray.isEmpty()) {
                int size = longSparseArray.size();
                for (int i = 0; i < size; i++) {
                    long keyAt = longSparseArray.keyAt(i);
                    final ArrayList<Integer> arrayList3 = (ArrayList) longSparseArray.valueAt(i);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MessagesStorage.this.lambda$markMessagesAsDeletedByRandoms$162(arrayList3);
                        }
                    });
                    updateDialogsWithReadMessagesInternal(arrayList3, null, null, null);
                    lambda$markMessagesAsDeleted$167(keyAt, arrayList3, true, false);
                    lambda$updateDialogsWithDeletedMessages$166(keyAt, 0L, arrayList3, null);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$markMessagesAsDeletedByRandoms$162(ArrayList arrayList) {
        getNotificationCenter().postNotificationName(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
    }

    public void deletePushMessages(long j, ArrayList<Integer> arrayList) {
        try {
            this.database.executeFast(String.format(Locale.US, "DELETE FROM unread_push_messages WHERE uid = %d AND mid IN(%s)", Long.valueOf(j), TextUtils.join(",", arrayList))).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void broadcastScheduledMessagesChange(final Long l) {
        try {
            final int i = 0;
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM scheduled_messages_v2 WHERE uid = %d", l), new Object[0]);
            if (queryFinalized.next()) {
                i = queryFinalized.intValue(0);
            }
            queryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$broadcastScheduledMessagesChange$164(l, i);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$broadcastScheduledMessagesChange$164(Long l, int i) {
        getNotificationCenter().postNotificationName(NotificationCenter.scheduledMessagesUpdated, l, Integer.valueOf(i));
    }

    public java.util.ArrayList<java.lang.Long> lambda$markMessagesAsDeleted$167(long r30, java.util.ArrayList<java.lang.Integer> r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsDeleted$167(long, java.util.ArrayList, boolean, boolean):java.util.ArrayList");
    }

    public void lambda$markMessagesAsDeletedInternal$165(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$updateDialogsWithDeletedMessages$166(long j, long j2, ArrayList<Integer> arrayList, ArrayList<Long> arrayList2) {
        TLRPC$TL_dialog tLRPC$TL_dialog;
        SQLitePreparedStatement sQLitePreparedStatement;
        long j3 = j2;
        try {
            ArrayList arrayList3 = new ArrayList();
            boolean z = false;
            if (!arrayList.isEmpty()) {
                if (j3 != 0) {
                    arrayList3.add(Long.valueOf(-j3));
                    sQLitePreparedStatement = this.database.executeFast("UPDATE dialogs SET last_mid = (SELECT mid FROM messages_v2 WHERE uid = ? AND date = (SELECT MAX(date) FROM messages_v2 WHERE uid = ?)) WHERE did = ?");
                } else {
                    if (j == 0) {
                        SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT did FROM dialogs WHERE last_mid IN(%s) AND flags = 0", TextUtils.join(",", arrayList)), new Object[0]);
                        while (queryFinalized.next()) {
                            arrayList3.add(Long.valueOf(queryFinalized.longValue(0)));
                        }
                        queryFinalized.dispose();
                    } else {
                        arrayList3.add(Long.valueOf(j));
                    }
                    sQLitePreparedStatement = this.database.executeFast("UPDATE dialogs SET last_mid = (SELECT mid FROM messages_v2 WHERE uid = ? AND date = (SELECT MAX(date) FROM messages_v2 WHERE uid = ? AND date != 0)) WHERE did = ?");
                }
                this.database.beginTransaction();
                for (int i = 0; i < arrayList3.size(); i++) {
                    long longValue = ((Long) arrayList3.get(i)).longValue();
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, longValue);
                    sQLitePreparedStatement.bindLong(2, longValue);
                    sQLitePreparedStatement.bindLong(3, longValue);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
                this.database.commitTransaction();
            } else {
                arrayList3.add(Long.valueOf(-j3));
            }
            if (arrayList2 != null) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    Long l = arrayList2.get(i2);
                    if (!arrayList3.contains(l)) {
                        arrayList3.add(l);
                    }
                }
            }
            String join = TextUtils.join(",", arrayList3);
            TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
            ArrayList<TLRPC$EncryptedChat> arrayList4 = new ArrayList<>();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            SQLiteCursor queryFinalized2 = this.database.queryFinalized(String.format(Locale.US, "SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date, d.pts, d.inbox_max, d.outbox_max, d.pinned, d.unread_count_i, d.flags, d.folder_id, d.data, d.unread_reactions FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.did IN(%s)", join), new Object[0]);
            while (queryFinalized2.next()) {
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                long longValue2 = queryFinalized2.longValue(i3);
                if (DialogObject.isFolderDialogId(longValue2)) {
                    TLRPC$TL_dialogFolder tLRPC$TL_dialogFolder = new TLRPC$TL_dialogFolder();
                    tLRPC$TL_dialog = tLRPC$TL_dialogFolder;
                    if (!queryFinalized2.isNull(16)) {
                        NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(16);
                        if (byteBufferValue != null) {
                            tLRPC$TL_dialogFolder.folder = TLRPC$TL_folder.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z), z);
                            byteBufferValue.reuse();
                            tLRPC$TL_dialog = tLRPC$TL_dialogFolder;
                        } else {
                            TLRPC$TL_folder tLRPC$TL_folder = new TLRPC$TL_folder();
                            tLRPC$TL_dialogFolder.folder = tLRPC$TL_folder;
                            tLRPC$TL_folder.id = queryFinalized2.intValue(15);
                            tLRPC$TL_dialog = tLRPC$TL_dialogFolder;
                        }
                    }
                } else {
                    tLRPC$TL_dialog = new TLRPC$TL_dialog();
                }
                tLRPC$TL_dialog.id = longValue2;
                tLRPC$TL_dialog.top_message = queryFinalized2.intValue(1);
                tLRPC$TL_dialog.read_inbox_max_id = queryFinalized2.intValue(10);
                tLRPC$TL_dialog.read_outbox_max_id = queryFinalized2.intValue(11);
                tLRPC$TL_dialog.unread_count = queryFinalized2.intValue(2);
                tLRPC$TL_dialog.unread_mentions_count = queryFinalized2.intValue(13);
                tLRPC$TL_dialog.last_message_date = queryFinalized2.intValue(3);
                tLRPC$TL_dialog.pts = queryFinalized2.intValue(9);
                tLRPC$TL_dialog.flags = j3 == 0 ? 0 : 1;
                int intValue = queryFinalized2.intValue(12);
                tLRPC$TL_dialog.pinnedNum = intValue;
                tLRPC$TL_dialog.pinned = intValue != 0;
                tLRPC$TL_dialog.unread_mark = (queryFinalized2.intValue(14) & 1) != 0;
                tLRPC$TL_dialog.folder_id = queryFinalized2.intValue(15);
                tLRPC$TL_dialog.unread_reactions_count = queryFinalized2.intValue(17);
                tLRPC$TL_messages_dialogs.dialogs.add(tLRPC$TL_dialog);
                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(4);
                if (byteBufferValue2 != null) {
                    TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue2, getUserConfig().clientUserId);
                    byteBufferValue2.reuse();
                    MessageObject.setUnreadFlags(TLdeserialize, queryFinalized2.intValue(5));
                    TLdeserialize.id = queryFinalized2.intValue(6);
                    TLdeserialize.send_state = queryFinalized2.intValue(7);
                    int intValue2 = queryFinalized2.intValue(8);
                    if (intValue2 != 0) {
                        tLRPC$TL_dialog.last_message_date = intValue2;
                    }
                    TLdeserialize.dialog_id = tLRPC$TL_dialog.id;
                    tLRPC$TL_messages_dialogs.messages.add(TLdeserialize);
                    addUsersAndChatsFromMessage(TLdeserialize, arrayList5, arrayList6);
                }
                if (DialogObject.isEncryptedDialog(longValue2)) {
                    int encryptedChatId = DialogObject.getEncryptedChatId(longValue2);
                    if (!arrayList7.contains(Integer.valueOf(encryptedChatId))) {
                        arrayList7.add(Integer.valueOf(encryptedChatId));
                    }
                } else if (!DialogObject.isUserDialog(longValue2)) {
                    long j4 = -longValue2;
                    if (!arrayList6.contains(Long.valueOf(j4))) {
                        arrayList6.add(Long.valueOf(j4));
                    }
                } else if (!arrayList5.contains(Long.valueOf(longValue2))) {
                    arrayList5.add(Long.valueOf(longValue2));
                }
                j3 = j2;
                z = false;
            }
            queryFinalized2.dispose();
            if (!arrayList7.isEmpty()) {
                getEncryptedChatsInternal(TextUtils.join(",", arrayList7), arrayList4, arrayList5);
            }
            if (!arrayList6.isEmpty()) {
                getChatsInternal(TextUtils.join(",", arrayList6), tLRPC$TL_messages_dialogs.chats);
            }
            if (!arrayList5.isEmpty()) {
                getUsersInternal(TextUtils.join(",", arrayList5), tLRPC$TL_messages_dialogs.users);
            }
            if (!tLRPC$TL_messages_dialogs.dialogs.isEmpty() || !arrayList4.isEmpty()) {
                getMessagesController().processDialogsUpdate(tLRPC$TL_messages_dialogs, arrayList4, true);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateDialogsWithDeletedMessages(final long j, final long j2, final ArrayList<Integer> arrayList, final ArrayList<Long> arrayList2, boolean z) {
        if (z) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateDialogsWithDeletedMessages$166(j, j2, arrayList, arrayList2);
                }
            });
        } else {
            lambda$updateDialogsWithDeletedMessages$166(j, j2, arrayList, arrayList2);
        }
    }

    public ArrayList<Long> markMessagesAsDeleted(final long j, final ArrayList<Integer> arrayList, boolean z, final boolean z2, final boolean z3) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (!z) {
            return lambda$markMessagesAsDeleted$167(j, arrayList, z2, z3);
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$markMessagesAsDeleted$167(j, arrayList, z2, z3);
            }
        });
        return null;
    }

    public java.util.ArrayList<java.lang.Long> lambda$markMessagesAsDeleted$169(long r20, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsDeleted$169(long, int, boolean):java.util.ArrayList");
    }

    public void lambda$markMessagesAsDeletedInternal$168(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public ArrayList<Long> markMessagesAsDeleted(final long j, final int i, boolean z, final boolean z2) {
        if (!z) {
            return lambda$markMessagesAsDeleted$169(j, i, z2);
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$markMessagesAsDeleted$169(j, i, z2);
            }
        });
        return null;
    }

    private void fixUnsupportedMedia(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message != null) {
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
            if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaUnsupported_old) {
                if (tLRPC$MessageMedia.bytes.length == 0) {
                    tLRPC$MessageMedia.bytes = Utilities.intToBytes(140);
                }
            } else if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaUnsupported) {
                TLRPC$TL_messageMediaUnsupported_old tLRPC$TL_messageMediaUnsupported_old = new TLRPC$TL_messageMediaUnsupported_old();
                tLRPC$Message.media = tLRPC$TL_messageMediaUnsupported_old;
                tLRPC$TL_messageMediaUnsupported_old.bytes = Utilities.intToBytes(140);
                tLRPC$Message.flags |= 512;
            }
        }
    }

    private void doneHolesInTable(String str, long j, int i) throws Exception {
        if (i == 0) {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM " + str + " WHERE uid = %d", Long.valueOf(j))).stepThis().dispose();
        } else {
            SQLiteDatabase sQLiteDatabase2 = this.database;
            Locale locale2 = Locale.US;
            sQLiteDatabase2.executeFast(String.format(locale2, "DELETE FROM " + str + " WHERE uid = %d AND start = 0", Long.valueOf(j))).stepThis().dispose();
        }
        SQLiteDatabase sQLiteDatabase3 = this.database;
        SQLitePreparedStatement executeFast = sQLiteDatabase3.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
        executeFast.requery();
        executeFast.bindLong(1, j);
        executeFast.bindInteger(2, 1);
        executeFast.bindInteger(3, 1);
        executeFast.step();
        executeFast.dispose();
    }

    public void doneHolesInMedia(long j, int i, int i2) throws Exception {
        if (i2 == -1) {
            if (i == 0) {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d", Long.valueOf(j))).stepThis().dispose();
            } else {
                this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND start = 0", Long.valueOf(j))).stepThis().dispose();
            }
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
            for (int i3 = 0; i3 < 8; i3++) {
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, i3);
                executeFast.bindInteger(3, 1);
                executeFast.bindInteger(4, 1);
                executeFast.step();
            }
            executeFast.dispose();
            return;
        }
        if (i == 0) {
            this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d", Long.valueOf(j), Integer.valueOf(i2))).stepThis().dispose();
        } else {
            this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d AND start = 0", Long.valueOf(j), Integer.valueOf(i2))).stepThis().dispose();
        }
        SQLitePreparedStatement executeFast2 = this.database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
        executeFast2.requery();
        executeFast2.bindLong(1, j);
        executeFast2.bindInteger(2, i2);
        executeFast2.bindInteger(3, 1);
        executeFast2.bindInteger(4, 1);
        executeFast2.step();
        executeFast2.dispose();
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

    public void closeHolesInMedia(long j, int i, int i2, int i3) {
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList;
        int i4 = 4;
        try {
            if (i3 < 0) {
                sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT type, start, end FROM media_holes_v2 WHERE uid = %d AND type >= 0 AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
            } else {
                sQLiteCursor = this.database.queryFinalized(String.format(Locale.US, "SELECT type, start, end FROM media_holes_v2 WHERE uid = %d AND type = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
            }
            arrayList = null;
            while (sQLiteCursor.next()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                int intValue = sQLiteCursor.intValue(0);
                int intValue2 = sQLiteCursor.intValue(1);
                int intValue3 = sQLiteCursor.intValue(2);
                if (intValue2 != intValue3 || intValue2 != 1) {
                    arrayList.add(new Hole(intValue, intValue2, intValue3));
                }
            }
            sQLiteCursor.dispose();
        } catch (Exception e) {
            FileLog.e(e);
            return;
        }
        if (arrayList != null) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                Hole hole = (Hole) arrayList.get(i5);
                int i6 = hole.end;
                if (i2 < i6 - 1 || i > hole.start + 1) {
                    if (i2 < i6 - 1) {
                        int i7 = hole.start;
                        if (i > i7 + 1) {
                            this.database.executeFast(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d AND start = %d AND end = %d", Long.valueOf(j), Integer.valueOf(hole.type), Integer.valueOf(hole.start), Integer.valueOf(hole.end))).stepThis().dispose();
                            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                            executeFast.requery();
                            executeFast.bindLong(1, j);
                            executeFast.bindInteger(2, hole.type);
                            executeFast.bindInteger(3, hole.start);
                            executeFast.bindInteger(4, i);
                            executeFast.step();
                            executeFast.requery();
                            executeFast.bindLong(1, j);
                            executeFast.bindInteger(2, hole.type);
                            executeFast.bindInteger(3, i2);
                            i4 = 4;
                            executeFast.bindInteger(4, hole.end);
                            executeFast.step();
                            executeFast.dispose();
                        } else if (i7 != i2) {
                            try {
                                this.database.executeFast(String.format(Locale.US, "UPDATE media_holes_v2 SET start = %d WHERE uid = %d AND type = %d AND start = %d AND end = %d", Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(hole.type), Integer.valueOf(hole.start), Integer.valueOf(hole.end))).stepThis().dispose();
                            } catch (Exception e2) {
                                FileLog.e((Throwable) e2, false);
                            }
                        }
                    } else if (i6 != i) {
                        try {
                            this.database.executeFast(String.format(Locale.US, "UPDATE media_holes_v2 SET end = %d WHERE uid = %d AND type = %d AND start = %d AND end = %d", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(hole.type), Integer.valueOf(hole.start), Integer.valueOf(hole.end))).stepThis().dispose();
                        } catch (Exception e3) {
                            FileLog.e((Throwable) e3, false);
                        }
                    }
                    FileLog.e(e);
                    return;
                }
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                Object[] objArr = new Object[i4];
                objArr[0] = Long.valueOf(j);
                objArr[1] = Integer.valueOf(hole.type);
                objArr[2] = Integer.valueOf(hole.start);
                objArr[3] = Integer.valueOf(hole.end);
                sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d AND start = %d AND end = %d", objArr)).stepThis().dispose();
                i4 = 4;
            }
        }
    }

    private void closeHolesInTable(String str, long j, int i, int i2) {
        int i3;
        ArrayList arrayList;
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            i3 = 1;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(String.format(locale, "SELECT start, end FROM " + str + " WHERE uid = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
            arrayList = null;
            while (queryFinalized.next()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                int intValue = queryFinalized.intValue(0);
                int intValue2 = queryFinalized.intValue(1);
                if (intValue != intValue2 || intValue != 1) {
                    arrayList.add(new Hole(intValue, intValue2));
                }
            }
            queryFinalized.dispose();
        } catch (Exception e) {
            FileLog.e(e);
            return;
        }
        if (arrayList != null) {
            int i4 = 0;
            while (i4 < arrayList.size()) {
                Hole hole = (Hole) arrayList.get(i4);
                int i5 = hole.end;
                if (i2 < i5 - 1 || i > hole.start + i3) {
                    if (i2 < i5 - 1) {
                        int i6 = hole.start;
                        if (i > i6 + 1) {
                            SQLiteDatabase sQLiteDatabase2 = this.database;
                            Locale locale2 = Locale.US;
                            sQLiteDatabase2.executeFast(String.format(locale2, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", Long.valueOf(j), Integer.valueOf(hole.start), Integer.valueOf(hole.end))).stepThis().dispose();
                            SQLiteDatabase sQLiteDatabase3 = this.database;
                            SQLitePreparedStatement executeFast = sQLiteDatabase3.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                            executeFast.requery();
                            executeFast.bindLong(1, j);
                            executeFast.bindInteger(2, hole.start);
                            executeFast.bindInteger(3, i);
                            executeFast.step();
                            executeFast.requery();
                            executeFast.bindLong(1, j);
                            executeFast.bindInteger(2, i2);
                            executeFast.bindInteger(3, hole.end);
                            executeFast.step();
                            executeFast.dispose();
                            i4++;
                            i3 = 1;
                        } else if (i6 != i2) {
                            try {
                                SQLiteDatabase sQLiteDatabase4 = this.database;
                                Locale locale3 = Locale.US;
                                sQLiteDatabase4.executeFast(String.format(locale3, "UPDATE " + str + " SET start = %d WHERE uid = %d AND start = %d AND end = %d", Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(hole.start), Integer.valueOf(hole.end))).stepThis().dispose();
                            } catch (Exception e2) {
                                FileLog.e((Throwable) e2, false);
                            }
                        }
                    } else if (i5 != i) {
                        try {
                            SQLiteDatabase sQLiteDatabase5 = this.database;
                            Locale locale4 = Locale.US;
                            sQLiteDatabase5.executeFast(String.format(locale4, "UPDATE " + str + " SET end = %d WHERE uid = %d AND start = %d AND end = %d", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(hole.start), Integer.valueOf(hole.end))).stepThis().dispose();
                        } catch (Exception e3) {
                            FileLog.e((Throwable) e3, false);
                        }
                    }
                    FileLog.e(e);
                    return;
                }
                SQLiteDatabase sQLiteDatabase6 = this.database;
                Locale locale5 = Locale.US;
                sQLiteDatabase6.executeFast(String.format(locale5, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", Long.valueOf(j), Integer.valueOf(hole.start), Integer.valueOf(hole.end))).stepThis().dispose();
                i4++;
                i3 = 1;
            }
        }
    }

    public void replaceMessageIfExists(final TLRPC$Message tLRPC$Message, final ArrayList<TLRPC$User> arrayList, final ArrayList<TLRPC$Chat> arrayList2, final boolean z) {
        if (tLRPC$Message != null) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$replaceMessageIfExists$171(tLRPC$Message, z, arrayList, arrayList2);
                }
            });
        }
    }

    public void lambda$replaceMessageIfExists$171(org.telegram.tgnet.TLRPC$Message r16, boolean r17, java.util.ArrayList r18, java.util.ArrayList r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$replaceMessageIfExists$171(org.telegram.tgnet.TLRPC$Message, boolean, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void lambda$replaceMessageIfExists$170(MessageObject messageObject, ArrayList arrayList) {
        getNotificationCenter().postNotificationName(NotificationCenter.replaceMessagesObjects, Long.valueOf(messageObject.getDialogId()), arrayList);
    }

    public void putMessages(final TLRPC$messages_Messages tLRPC$messages_Messages, final long j, final int i, final int i2, final boolean z, final boolean z2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$putMessages$173(z2, j, tLRPC$messages_Messages, i, i2, z);
            }
        });
    }

    public void lambda$putMessages$173(boolean r39, long r40, org.telegram.tgnet.TLRPC$messages_Messages r42, int r43, int r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putMessages$173(boolean, long, org.telegram.tgnet.TLRPC$messages_Messages, int, int, boolean):void");
    }

    public void lambda$putMessages$172(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public static void addUsersAndChatsFromMessage(TLRPC$Message tLRPC$Message, ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        String str;
        TLRPC$Peer tLRPC$Peer;
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
                long peerId = MessageObject.getPeerId(tLRPC$TL_messageActionGeoProximityReached.from_id);
                if (!DialogObject.isUserDialog(peerId)) {
                    long j6 = -peerId;
                    if (!arrayList2.contains(Long.valueOf(j6))) {
                        arrayList2.add(Long.valueOf(j6));
                    }
                } else if (!arrayList.contains(Long.valueOf(peerId))) {
                    arrayList.add(Long.valueOf(peerId));
                }
                long peerId2 = MessageObject.getPeerId(tLRPC$TL_messageActionGeoProximityReached.to_id);
                if (peerId2 <= 0) {
                    long j7 = -peerId2;
                    if (!arrayList2.contains(Long.valueOf(j7))) {
                        arrayList2.add(Long.valueOf(j7));
                    }
                } else if (!arrayList.contains(Long.valueOf(peerId2))) {
                    arrayList.add(Long.valueOf(peerId2));
                }
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
                }
            }
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
        if (tLRPC$MessageMedia != null) {
            long j8 = tLRPC$MessageMedia.user_id;
            if (j8 != 0 && !arrayList.contains(Long.valueOf(j8))) {
                arrayList.add(Long.valueOf(tLRPC$Message.media.user_id));
            }
            TLRPC$MessageMedia tLRPC$MessageMedia2 = tLRPC$Message.media;
            if (tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaPoll) {
                TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll = (TLRPC$TL_messageMediaPoll) tLRPC$MessageMedia2;
                if (!tLRPC$TL_messageMediaPoll.results.recent_voters.isEmpty()) {
                    arrayList.addAll(tLRPC$TL_messageMediaPoll.results.recent_voters);
                }
            }
        }
        TLRPC$MessageReplies tLRPC$MessageReplies = tLRPC$Message.replies;
        if (tLRPC$MessageReplies != null) {
            int size = tLRPC$MessageReplies.recent_repliers.size();
            for (int i3 = 0; i3 < size; i3++) {
                long peerId3 = MessageObject.getPeerId(tLRPC$Message.replies.recent_repliers.get(i3));
                if (DialogObject.isUserDialog(peerId3)) {
                    if (!arrayList.contains(Long.valueOf(peerId3))) {
                        arrayList.add(Long.valueOf(peerId3));
                    }
                } else if (DialogObject.isChatDialog(peerId3)) {
                    long j9 = -peerId3;
                    if (!arrayList2.contains(Long.valueOf(j9))) {
                        arrayList2.add(Long.valueOf(j9));
                    }
                }
            }
        }
        TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = tLRPC$Message.reply_to;
        if (!(tLRPC$TL_messageReplyHeader == null || (tLRPC$Peer = tLRPC$TL_messageReplyHeader.reply_to_peer_id) == null)) {
            long peerId4 = MessageObject.getPeerId(tLRPC$Peer);
            if (DialogObject.isUserDialog(peerId4)) {
                if (!arrayList.contains(Long.valueOf(peerId4))) {
                    arrayList.add(Long.valueOf(peerId4));
                }
            } else if (DialogObject.isChatDialog(peerId4)) {
                long j10 = -peerId4;
                if (!arrayList2.contains(Long.valueOf(j10))) {
                    arrayList2.add(Long.valueOf(j10));
                }
            }
        }
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = tLRPC$Message.fwd_from;
        if (tLRPC$MessageFwdHeader != null) {
            TLRPC$Peer tLRPC$Peer2 = tLRPC$MessageFwdHeader.from_id;
            if (tLRPC$Peer2 instanceof TLRPC$TL_peerUser) {
                if (!arrayList.contains(Long.valueOf(tLRPC$Peer2.user_id))) {
                    arrayList.add(Long.valueOf(tLRPC$Message.fwd_from.from_id.user_id));
                }
            } else if (tLRPC$Peer2 instanceof TLRPC$TL_peerChannel) {
                if (!arrayList2.contains(Long.valueOf(tLRPC$Peer2.channel_id))) {
                    arrayList2.add(Long.valueOf(tLRPC$Message.fwd_from.from_id.channel_id));
                }
            } else if ((tLRPC$Peer2 instanceof TLRPC$TL_peerChat) && !arrayList2.contains(Long.valueOf(tLRPC$Peer2.chat_id))) {
                arrayList2.add(Long.valueOf(tLRPC$Message.fwd_from.from_id.chat_id));
            }
            TLRPC$Peer tLRPC$Peer3 = tLRPC$Message.fwd_from.saved_from_peer;
            if (tLRPC$Peer3 != null) {
                long j11 = tLRPC$Peer3.user_id;
                if (j11 == 0) {
                    long j12 = tLRPC$Peer3.channel_id;
                    if (j12 == 0) {
                        long j13 = tLRPC$Peer3.chat_id;
                        if (j13 != 0 && !arrayList2.contains(Long.valueOf(j13))) {
                            arrayList2.add(Long.valueOf(tLRPC$Message.fwd_from.saved_from_peer.chat_id));
                        }
                    } else if (!arrayList2.contains(Long.valueOf(j12))) {
                        arrayList2.add(Long.valueOf(tLRPC$Message.fwd_from.saved_from_peer.channel_id));
                    }
                } else if (!arrayList2.contains(Long.valueOf(j11))) {
                    arrayList.add(Long.valueOf(tLRPC$Message.fwd_from.saved_from_peer.user_id));
                }
            }
        }
        HashMap<String, String> hashMap = tLRPC$Message.params;
        if (!(hashMap == null || (str = hashMap.get("fwd_peer")) == null)) {
            long longValue = Utilities.parseLong(str).longValue();
            if (longValue < 0) {
                long j14 = -longValue;
                if (!arrayList2.contains(Long.valueOf(j14))) {
                    arrayList2.add(Long.valueOf(j14));
                }
            }
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
                MessagesStorage.this.lambda$getDialogs$175(i, i2, i3, jArr2);
            }
        });
    }

    public void lambda$getDialogs$175(int r24, int r25, int r26, long[] r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogs$175(int, int, int, long[]):void");
    }

    public void lambda$getDialogs$174(LongSparseArray longSparseArray) {
        MediaDataController mediaDataController = getMediaDataController();
        mediaDataController.clearDraftsFolderIds();
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                mediaDataController.setDraftFolderId(longSparseArray.keyAt(i), ((Integer) longSparseArray.valueAt(i)).intValue());
            }
        }
    }

    public static void createFirstHoles(long j, SQLitePreparedStatement sQLitePreparedStatement, SQLitePreparedStatement sQLitePreparedStatement2, int i) throws Exception {
        sQLitePreparedStatement.requery();
        sQLitePreparedStatement.bindLong(1, j);
        sQLitePreparedStatement.bindInteger(2, i == 1 ? 1 : 0);
        sQLitePreparedStatement.bindInteger(3, i);
        sQLitePreparedStatement.step();
        for (int i2 = 0; i2 < 8; i2++) {
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(1, j);
            sQLitePreparedStatement2.bindInteger(2, i2);
            sQLitePreparedStatement2.bindInteger(3, i == 1 ? 1 : 0);
            sQLitePreparedStatement2.bindInteger(4, i);
            sQLitePreparedStatement2.step();
        }
    }

    private void putDialogsInternal(org.telegram.tgnet.TLRPC$messages_Dialogs r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.putDialogsInternal(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public void getDialogFolderId(final long j, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getDialogFolderId$177(j, intCallback);
            }
        });
    }

    public void lambda$getDialogFolderId$177(long j, final IntCallback intCallback) {
        try {
            final int i = -1;
            if (this.unknownDialogsIds.get(j) == null) {
                SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                if (queryFinalized.next()) {
                    i = queryFinalized.intValue(0);
                }
                queryFinalized.dispose();
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.IntCallback.this.run(i);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setDialogsFolderId(final ArrayList<TLRPC$TL_folderPeer> arrayList, final ArrayList<TLRPC$TL_inputFolderPeer> arrayList2, final long j, final int i) {
        if (arrayList != null || arrayList2 != null || j != 0) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$setDialogsFolderId$178(arrayList, arrayList2, i, j);
                }
            });
        }
    }

    public void lambda$setDialogsFolderId$178(ArrayList arrayList, ArrayList arrayList2, int i, long j) {
        try {
            this.database.beginTransaction();
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC$TL_folderPeer tLRPC$TL_folderPeer = (TLRPC$TL_folderPeer) arrayList.get(i2);
                    long peerDialogId = DialogObject.getPeerDialogId(tLRPC$TL_folderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tLRPC$TL_folderPeer.folder_id);
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, peerDialogId);
                    executeFast.step();
                    this.unknownDialogsIds.remove(peerDialogId);
                }
            } else if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC$TL_inputFolderPeer tLRPC$TL_inputFolderPeer = (TLRPC$TL_inputFolderPeer) arrayList2.get(i3);
                    long peerDialogId2 = DialogObject.getPeerDialogId(tLRPC$TL_inputFolderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tLRPC$TL_inputFolderPeer.folder_id);
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, peerDialogId2);
                    executeFast.step();
                    this.unknownDialogsIds.remove(peerDialogId2);
                }
            } else {
                executeFast.requery();
                executeFast.bindInteger(1, i);
                executeFast.bindInteger(2, 0);
                executeFast.bindLong(3, j);
                executeFast.step();
            }
            executeFast.dispose();
            this.database.commitTransaction();
            lambda$checkIfFolderEmpty$180(1);
            resetAllUnreadCounters(false);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$checkIfFolderEmpty$180(final int i) {
        try {
            boolean z = true;
            SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT did FROM dialogs WHERE folder_id = ?", Integer.valueOf(i));
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (!DialogObject.isUserDialog(longValue) && !DialogObject.isEncryptedDialog(longValue)) {
                    TLRPC$Chat chat = getChat(-longValue);
                    if (ChatObject.isNotInChat(chat) || chat.migrated_to != null) {
                    }
                }
                z = false;
            }
            queryFinalized.dispose();
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.this.lambda$checkIfFolderEmptyInternal$179(i);
                    }
                });
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteDatabase.executeFast("DELETE FROM dialogs WHERE did = " + DialogObject.makeFolderDialogId(i)).stepThis().dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$checkIfFolderEmptyInternal$179(int i) {
        getMessagesController().onFolderEmpty(i);
    }

    public void checkIfFolderEmpty(final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$checkIfFolderEmpty$180(i);
            }
        });
    }

    public void unpinAllDialogsExceptNew(final ArrayList<Long> arrayList, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$unpinAllDialogsExceptNew$181(arrayList, i);
            }
        });
    }

    public void lambda$unpinAllDialogsExceptNew$181(ArrayList arrayList, int i) {
        try {
            ArrayList arrayList2 = new ArrayList();
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT did, folder_id FROM dialogs WHERE pinned > 0 AND did NOT IN (%s)", TextUtils.join(",", arrayList)), new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (queryFinalized.intValue(1) == i && !DialogObject.isEncryptedDialog(longValue) && !DialogObject.isFolderDialogId(longValue)) {
                    arrayList2.add(Long.valueOf(queryFinalized.longValue(0)));
                }
            }
            queryFinalized.dispose();
            if (!arrayList2.isEmpty()) {
                SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    long longValue2 = ((Long) arrayList2.get(i2)).longValue();
                    executeFast.requery();
                    executeFast.bindInteger(1, 0);
                    executeFast.bindLong(2, longValue2);
                    executeFast.step();
                }
                executeFast.dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setDialogUnread(final long j, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setDialogUnread$182(j, z);
            }
        });
    }

    public void lambda$setDialogUnread$182(long j, boolean z) {
        int i;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT flags FROM dialogs WHERE did = " + j, new Object[0]);
                i = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                sQLiteCursor.dispose();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                i = 0;
            }
            int i2 = z ? i | 1 : i & (-2);
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialogs SET flags = ? WHERE did = ?");
            executeFast.bindInteger(1, i2);
            executeFast.bindLong(2, j);
            executeFast.step();
            executeFast.dispose();
            resetAllUnreadCounters(false);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    private void resetAllUnreadCounters(boolean z) {
        int size = this.dialogFilters.size();
        for (int i = 0; i < size; i++) {
            MessagesController.DialogFilter dialogFilter = this.dialogFilters.get(i);
            if (!z) {
                dialogFilter.pendingUnreadCount = -1;
            } else if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                dialogFilter.pendingUnreadCount = -1;
            }
        }
        calcUnreadCounters(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$resetAllUnreadCounters$183();
            }
        });
    }

    public void lambda$resetAllUnreadCounters$183() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).unreadCount = arrayList.get(i).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE));
    }

    public void setDialogPinned(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setDialogPinned$184(i, j);
            }
        });
    }

    public void lambda$setDialogPinned$184(int i, long j) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
            executeFast.bindInteger(1, i);
            executeFast.bindLong(2, j);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setDialogsPinned(final ArrayList<Long> arrayList, final ArrayList<Integer> arrayList2) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$setDialogsPinned$185(arrayList, arrayList2);
            }
        });
    }

    public void lambda$setDialogsPinned$185(ArrayList arrayList, ArrayList arrayList2) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                executeFast.requery();
                executeFast.bindInteger(1, ((Integer) arrayList2.get(i)).intValue());
                executeFast.bindLong(2, ((Long) arrayList.get(i)).longValue());
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void putDialogs(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final int i) {
        if (!tLRPC$messages_Dialogs.dialogs.isEmpty()) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putDialogs$186(tLRPC$messages_Dialogs, i);
                }
            });
        }
    }

    public void lambda$putDialogs$186(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, int i) {
        putDialogsInternal(tLRPC$messages_Dialogs, i);
        try {
            loadUnreadMessages();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void getDialogMaxMessageId(final long j, final IntCallback intCallback) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getDialogMaxMessageId$188(j, intCallback);
            }
        });
    }

    public void lambda$getDialogMaxMessageId$188(long r6, final org.telegram.messenger.MessagesStorage.IntCallback r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogMaxMessageId$188(long, org.telegram.messenger.MessagesStorage$IntCallback):void");
    }

    public static void lambda$getDialogMaxMessageId$187(IntCallback intCallback, int[] iArr) {
        intCallback.run(iArr[0]);
    }

    public int getDialogReadMax(final boolean z, final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getDialogReadMax$189(z, j, numArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return numArr[0].intValue();
    }

    public void lambda$getDialogReadMax$189(boolean r5, long r6, java.lang.Integer[] r8, java.util.concurrent.CountDownLatch r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogReadMax$189(boolean, long, java.lang.Integer[], java.util.concurrent.CountDownLatch):void");
    }

    public int getChannelPtsSync(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getChannelPtsSync$190(j, numArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return numArr[0].intValue();
    }

    public void lambda$getChannelPtsSync$190(long r5, java.lang.Integer[] r7, java.util.concurrent.CountDownLatch r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getChannelPtsSync$190(long, java.lang.Integer[], java.util.concurrent.CountDownLatch):void");
    }

    public TLRPC$User getUserSync(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final TLRPC$User[] tLRPC$UserArr = new TLRPC$User[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getUserSync$191(tLRPC$UserArr, j, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return tLRPC$UserArr[0];
    }

    public void lambda$getUserSync$191(TLRPC$User[] tLRPC$UserArr, long j, CountDownLatch countDownLatch) {
        tLRPC$UserArr[0] = getUser(j);
        countDownLatch.countDown();
    }

    public TLRPC$Chat getChatSync(final long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final TLRPC$Chat[] tLRPC$ChatArr = new TLRPC$Chat[1];
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getChatSync$192(tLRPC$ChatArr, j, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return tLRPC$ChatArr[0];
    }

    public void lambda$getChatSync$192(TLRPC$Chat[] tLRPC$ChatArr, long j, CountDownLatch countDownLatch) {
        tLRPC$ChatArr[0] = getChat(j);
        countDownLatch.countDown();
    }

    public TLRPC$User getUser(long j) {
        try {
            ArrayList<TLRPC$User> arrayList = new ArrayList<>();
            getUsersInternal("" + j, arrayList);
            if (!arrayList.isEmpty()) {
                return arrayList.get(0);
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public ArrayList<TLRPC$User> getUsers(ArrayList<Long> arrayList) {
        ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
        try {
            getUsersInternal(TextUtils.join(",", arrayList), arrayList2);
        } catch (Exception e) {
            arrayList2.clear();
            FileLog.e(e);
        }
        return arrayList2;
    }

    public TLRPC$Chat getChat(long j) {
        try {
            ArrayList<TLRPC$Chat> arrayList = new ArrayList<>();
            getChatsInternal("" + j, arrayList);
            if (!arrayList.isEmpty()) {
                return arrayList.get(0);
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public TLRPC$EncryptedChat getEncryptedChat(long j) {
        try {
            ArrayList<TLRPC$EncryptedChat> arrayList = new ArrayList<>();
            getEncryptedChatsInternal("" + j, arrayList, null);
            if (!arrayList.isEmpty()) {
                return arrayList.get(0);
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public void localSearch(int r23, java.lang.String r24, java.util.ArrayList<java.lang.Object> r25, java.util.ArrayList<java.lang.CharSequence> r26, java.util.ArrayList<org.telegram.tgnet.TLRPC$User> r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.localSearch(int, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public static int lambda$localSearch$193(DialogsSearchAdapter.DialogSearchResult dialogSearchResult, DialogsSearchAdapter.DialogSearchResult dialogSearchResult2) {
        int i = dialogSearchResult.date;
        int i2 = dialogSearchResult2.date;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public ArrayList<Integer> getCachedMessagesInRange(long j, int i, int i2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT mid FROM messages_v2 WHERE uid = %d AND date >= %d AND date <= %d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
            while (queryFinalized.next()) {
                try {
                    arrayList.add(Integer.valueOf(queryFinalized.intValue(0)));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            queryFinalized.dispose();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return arrayList;
    }

    public void updateUnreadReactionsCount(final long j, final int i) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateUnreadReactionsCount$194(i, j);
            }
        });
    }

    public void lambda$updateUnreadReactionsCount$194(int i, long j) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialogs SET unread_reactions = ? WHERE did = ?");
            executeFast.bindInteger(1, Math.max(i, 0));
            executeFast.bindLong(2, j);
            executeFast.step();
            executeFast.dispose();
            if (i == 0) {
                SQLitePreparedStatement executeFast2 = this.database.executeFast("UPDATE reaction_mentions SET state = 0 WHERE dialog_id = ?");
                executeFast2.bindLong(1, j);
                executeFast2.step();
                executeFast2.dispose();
            }
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    public void markMessageReactionsAsRead(final long j, final int i, boolean z) {
        if (z) {
            getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$markMessageReactionsAsRead$195(j, i);
                }
            });
        } else {
            lambda$markMessageReactionsAsRead$195(j, i);
        }
    }

    public void lambda$markMessageReactionsAsRead$195(long j, int i) {
        NativeByteBuffer byteBufferValue;
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE reaction_mentions SET state = 0 WHERE message_id = ? AND dialog_id = ?");
            executeFast.bindInteger(1, i);
            executeFast.bindLong(2, j);
            executeFast.step();
            executeFast.dispose();
            SQLiteCursor queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT data FROM messages_v2 WHERE uid = %d AND mid = %d", Long.valueOf(j), Integer.valueOf(i)), new Object[0]);
            TLRPC$Message tLRPC$Message = null;
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tLRPC$Message = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                tLRPC$Message.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                byteBufferValue.reuse();
                TLRPC$TL_messageReactions tLRPC$TL_messageReactions = tLRPC$Message.reactions;
                if (!(tLRPC$TL_messageReactions == null || tLRPC$TL_messageReactions.recent_reactions == null)) {
                    for (int i2 = 0; i2 < tLRPC$Message.reactions.recent_reactions.size(); i2++) {
                        tLRPC$Message.reactions.recent_reactions.get(i2).unread = false;
                    }
                }
            }
            queryFinalized.dispose();
            if (tLRPC$Message != null) {
                SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast(String.format(Locale.US, "UPDATE messages_v2 SET data = ? WHERE uid = %d AND mid = %d", Long.valueOf(j), Integer.valueOf(i)));
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Message.getObjectSize());
                    tLRPC$Message.serializeToStream(nativeByteBuffer);
                    executeFast2.bindByteBuffer(1, nativeByteBuffer);
                    executeFast2.step();
                    executeFast2.dispose();
                    nativeByteBuffer.reuse();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (SQLiteException e2) {
            FileLog.e(e2);
        }
    }

    public void updateDialogUnreadReactions(final long j, final int i, final boolean z) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateDialogUnreadReactions$196(z, j, i);
            }
        });
    }

    public void lambda$updateDialogUnreadReactions$196(boolean z, long j, int i) {
        int i2 = 0;
        if (z) {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT unread_reactions FROM dialogs WHERE did = " + j, new Object[0]);
                if (queryFinalized.next()) {
                    i2 = Math.max(0, queryFinalized.intValue(0));
                }
                queryFinalized.dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
                return;
            }
        }
        SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE dialogs SET unread_reactions = ? WHERE did = ?");
        executeFast.bindInteger(1, i2 + i);
        executeFast.bindLong(2, j);
        executeFast.step();
        executeFast.dispose();
    }
}
