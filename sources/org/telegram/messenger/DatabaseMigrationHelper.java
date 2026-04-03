package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

public class DatabaseMigrationHelper {
    public static int migrate(MessagesStorage messagesStorage, int i) {
        return migrate(messagesStorage, messagesStorage.getDatabase(), i);
    }

    public static int migrate(MessagesStorage messagesStorage, SQLiteDatabase sQLiteDatabase, int i) {
        SQLiteDatabase sQLiteDatabase2;
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursorQueryFinalized2;
        int i2;
        int i3;
        NativeByteBuffer nativeByteBuffer;
        SQLiteCursor sQLiteCursorQueryFinalized3;
        SQLiteCursor sQLiteCursorQueryFinalized4;
        SQLiteCursor sQLiteCursorQueryFinalized5;
        SQLiteCursor sQLiteCursorQueryFinalized6;
        SQLiteCursor sQLiteCursorQueryFinalized7;
        SQLiteCursor sQLiteCursorQueryFinalized8;
        int i4 = 4;
        int i5 = i;
        if (i5 < 4) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS user_photos(uid INTEGER, id INTEGER, data BLOB, PRIMARY KEY (uid, id))").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS read_state_out_idx_messages;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS ttl_idx_messages;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS date_idx_messages;").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS mid_out_idx_messages ON messages(mid, out);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages ON messages(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages ON messages(uid, date, mid);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS user_contacts_v6(uid INTEGER PRIMARY KEY, fname TEXT, sname TEXT)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS user_phones_v6(uid INTEGER, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (uid, phone))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v6(sphone, deleted);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS mid_idx_randoms ON randoms(mid);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS sent_files_v2(uid TEXT, type INTEGER, data BLOB, PRIMARY KEY (uid, type))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, PRIMARY KEY (uid, type));").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);").stepThis().dispose();
            sQLiteDatabase.executeFast("UPDATE messages SET send_state = 2 WHERE mid < 0 AND send_state = 1").stepThis().dispose();
            messagesStorage.fixNotificationSettings();
            sQLiteDatabase.executeFast("PRAGMA user_version = 4").stepThis().dispose();
            i5 = 4;
        }
        int i6 = 6;
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        if (i5 == 4) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v2(mid INTEGER PRIMARY KEY, date INTEGER)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v2 ON enc_tasks_v2(date);").stepThis().dispose();
            sQLiteDatabase.beginTransaction();
            SQLiteCursor sQLiteCursorQueryFinalized9 = sQLiteDatabase.queryFinalized("SELECT date, data FROM enc_tasks WHERE 1", new Object[0]);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = sQLiteDatabase.executeFast("REPLACE INTO enc_tasks_v2 VALUES(?, ?)");
            if (sQLiteCursorQueryFinalized9.next()) {
                int iIntValue = sQLiteCursorQueryFinalized9.intValue(0);
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized9.byteBufferValue(1);
                if (nativeByteBufferByteBufferValue != null) {
                    int iLimit = nativeByteBufferByteBufferValue.limit();
                    for (int i10 = 0; i10 < iLimit / 4; i10++) {
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindInteger(1, nativeByteBufferByteBufferValue.readInt32(false));
                        sQLitePreparedStatementExecuteFast.bindInteger(2, iIntValue);
                        sQLitePreparedStatementExecuteFast.step();
                    }
                    nativeByteBufferByteBufferValue.reuse();
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
            sQLiteCursorQueryFinalized9.dispose();
            sQLiteDatabase.commitTransaction();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS enc_tasks;").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE messages ADD COLUMN media INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 6").stepThis().dispose();
            i5 = 6;
        }
        if (i5 == 6) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN layer INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN seq_in INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN seq_out INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 7").stepThis().dispose();
            i5 = 7;
        }
        if (i5 == 7 || i5 == 8 || i5 == 9) {
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN use_count INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN exchange_id INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN key_date INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN fprint INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN fauthkey BLOB default NULL").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN khash BLOB default NULL").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 10").stepThis().dispose();
            i5 = 10;
        }
        if (i5 == 10) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, PRIMARY KEY (id, type));").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 11").stepThis().dispose();
            i5 = 11;
        }
        if (i5 == 11 || i5 == 12) {
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS uid_mid_idx_media;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS mid_idx_media;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS uid_date_mid_idx_media;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS media;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS media_counts;").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS media_v2(mid INTEGER PRIMARY KEY, uid INTEGER, date INTEGER, type INTEGER, data BLOB)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, PRIMARY KEY(uid, type))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media ON media_v2(uid, mid, type, date);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS keyvalue(id TEXT PRIMARY KEY, value TEXT)").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 13").stepThis().dispose();
            i5 = 13;
        }
        if (i5 == 13) {
            sQLiteDatabase.executeFast("ALTER TABLE messages ADD COLUMN replydata BLOB default NULL").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 14").stepThis().dispose();
            i5 = 14;
        }
        if (i5 == 14) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 15").stepThis().dispose();
            i5 = 15;
        }
        if (i5 == 15) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS webpage_pending(id INTEGER, mid INTEGER, PRIMARY KEY (id, mid));").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 16").stepThis().dispose();
            i5 = 16;
        }
        if (i5 == 16) {
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN inbox_max INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN outbox_max INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 17").stepThis().dispose();
            i5 = 17;
        }
        if (i5 == 17) {
            sQLiteDatabase.executeFast("PRAGMA user_version = 18").stepThis().dispose();
            i5 = 18;
        }
        if (i5 == 18) {
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS stickers;").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 19").stepThis().dispose();
            i5 = 19;
        }
        if (i5 == 19) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid ON bot_keyboard(mid);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 20").stepThis().dispose();
            i5 = 20;
        }
        if (i5 == 20) {
            sQLiteDatabase.executeFast("CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 21").stepThis().dispose();
            i5 = 21;
        }
        if (i5 == 21) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB)").stepThis().dispose();
            SQLiteCursor sQLiteCursorQueryFinalized10 = sQLiteDatabase.queryFinalized("SELECT uid, participants FROM chat_settings WHERE uid < 0", new Object[0]);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = sQLiteDatabase.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?)");
            while (sQLiteCursorQueryFinalized10.next()) {
                long jIntValue = sQLiteCursorQueryFinalized10.intValue(0);
                NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized10.byteBufferValue(1);
                if (nativeByteBufferByteBufferValue2 != null) {
                    TLRPC.ChatParticipants chatParticipantsTLdeserialize = TLRPC.ChatParticipants.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                    nativeByteBufferByteBufferValue2.reuse();
                    if (chatParticipantsTLdeserialize != null) {
                        TLRPC.TL_chatFull tL_chatFull = new TLRPC.TL_chatFull();
                        tL_chatFull.id = jIntValue;
                        tL_chatFull.chat_photo = new TLRPC.TL_photoEmpty();
                        tL_chatFull.notify_settings = new TLRPC.TL_peerNotifySettingsEmpty_layer77();
                        tL_chatFull.exported_invite = null;
                        tL_chatFull.participants = chatParticipantsTLdeserialize;
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_chatFull.getObjectSize());
                        tL_chatFull.serializeToStream(nativeByteBuffer2);
                        sQLitePreparedStatementExecuteFast2.requery();
                        sQLitePreparedStatementExecuteFast2.bindLong(1, jIntValue);
                        sQLitePreparedStatementExecuteFast2.bindByteBuffer(2, nativeByteBuffer2);
                        sQLitePreparedStatementExecuteFast2.step();
                        nativeByteBuffer2.reuse();
                    }
                }
            }
            sQLitePreparedStatementExecuteFast2.dispose();
            sQLiteCursorQueryFinalized10.dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS chat_settings;").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN last_mid_i INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN unread_count_i INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN pts INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN date_i INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE messages ADD COLUMN imp INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes(uid, end);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 22").stepThis().dispose();
            i5 = 22;
        }
        if (i5 == 22) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 23").stepThis().dispose();
            i5 = 23;
        }
        if (i5 == 23 || i5 == 24) {
            sQLiteDatabase.executeFast("DELETE FROM media_holes_v2 WHERE uid != 0 AND type >= 0 AND start IN (0, 1)").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 25").stepThis().dispose();
            i5 = 25;
        }
        if (i5 == 25 || i5 == 26) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 27").stepThis().dispose();
            i5 = 27;
        }
        if (i5 == 27) {
            sQLiteDatabase.executeFast("ALTER TABLE web_recent_v3 ADD COLUMN document BLOB default NULL").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 28").stepThis().dispose();
            i5 = 28;
        }
        if (i5 == 28 || i5 == 29) {
            sQLiteDatabase.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
            sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 30").stepThis().dispose();
            i5 = 30;
        }
        if (i5 == 30) {
            sQLiteDatabase.executeFast("ALTER TABLE chat_settings_v2 ADD COLUMN pinned INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS users_data(uid INTEGER PRIMARY KEY, about TEXT)").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 31").stepThis().dispose();
            i5 = 31;
        }
        if (i5 == 31) {
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS bot_recent;").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 32").stepThis().dispose();
            i5 = 32;
        }
        if (i5 == 32) {
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS uid_mid_idx_imp_messages;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS uid_date_mid_imp_idx_messages;").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 33").stepThis().dispose();
            i5 = 33;
        }
        if (i5 == 33) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS pending_tasks(id INTEGER PRIMARY KEY, data BLOB);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 34").stepThis().dispose();
            i5 = 34;
        }
        if (i5 == 34) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 35").stepThis().dispose();
            i5 = 35;
        }
        if (i5 == 35) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 36").stepThis().dispose();
            i5 = 36;
        }
        if (i5 == 36) {
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN in_seq_no INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 37").stepThis().dispose();
            i5 = 37;
        }
        if (i5 == 37) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 38").stepThis().dispose();
            i5 = 38;
        }
        if (i5 == 38) {
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN pinned INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 39").stepThis().dispose();
            i5 = 39;
        }
        if (i5 == 39) {
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN admin_id INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 40").stepThis().dispose();
            i5 = 40;
        }
        if (i5 == 40) {
            messagesStorage.fixNotificationSettings();
            sQLiteDatabase.executeFast("PRAGMA user_version = 41").stepThis().dispose();
            i5 = 41;
        }
        if (i5 == 41) {
            sQLiteDatabase.executeFast("ALTER TABLE messages ADD COLUMN mention INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE user_contacts_v6 ADD COLUMN imported INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages ON messages(uid, mention, read_state);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 42").stepThis().dispose();
            i5 = 42;
        }
        if (i5 == 42) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 43").stepThis().dispose();
            i5 = 43;
        }
        if (i5 == 43) {
            sQLiteDatabase.executeFast("PRAGMA user_version = 44").stepThis().dispose();
            i5 = 44;
        }
        if (i5 == 44) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 45").stepThis().dispose();
            i5 = 45;
        }
        if (i5 == 45) {
            sQLiteDatabase.executeFast("ALTER TABLE enc_chats ADD COLUMN mtproto_seq INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 46").stepThis().dispose();
            i5 = 46;
        }
        if (i5 == 46) {
            sQLiteDatabase.executeFast("DELETE FROM botcache WHERE 1").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 47").stepThis().dispose();
            i5 = 47;
        }
        if (i5 == 47) {
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN flags INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 48").stepThis().dispose();
            i5 = 48;
        }
        if (i5 == 48) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, PRIMARY KEY(uid, mid))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 49").stepThis().dispose();
            i5 = 49;
        }
        if (i5 == 49) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 50").stepThis().dispose();
            i5 = 50;
        }
        if (i5 == 50) {
            sQLiteDatabase.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE sent_files_v2 ADD COLUMN parent TEXT").stepThis().dispose();
            sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE download_queue ADD COLUMN parent TEXT").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 51").stepThis().dispose();
            i5 = 51;
        }
        if (i5 == 51) {
            sQLiteDatabase.executeFast("ALTER TABLE media_counts_v2 ADD COLUMN old INTEGER").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 52").stepThis().dispose();
            i5 = 52;
        }
        if (i5 == 52) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS polls_id ON polls_v2(id);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 53").stepThis().dispose();
            i5 = 53;
        }
        if (i5 == 53) {
            sQLiteDatabase.executeFast("ALTER TABLE chat_settings_v2 ADD COLUMN online INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 54").stepThis().dispose();
            i5 = 54;
        }
        if (i5 == 54) {
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS wallpapers;").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 55").stepThis().dispose();
            i5 = 55;
        }
        if (i5 == 55) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 56").stepThis().dispose();
            i5 = 56;
        }
        if (i5 == 56 || i5 == 57) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 58").stepThis().dispose();
            i5 = 58;
        }
        if (i5 == 58) {
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE emoji_keywords_info_v2 ADD COLUMN date INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 59").stepThis().dispose();
            i5 = 59;
        }
        if (i5 == 59) {
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN folder_id INTEGER default 0").stepThis().dispose();
            sQLiteDatabase.executeFast("ALTER TABLE dialogs ADD COLUMN data BLOB default NULL").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON dialogs(folder_id);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 60").stepThis().dispose();
            i5 = 60;
        }
        if (i5 == 60) {
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS channel_admins;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS blocked_users;").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 61").stepThis().dispose();
            i5 = 61;
        }
        if (i5 == 61) {
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS send_state_idx_messages;").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages2 ON messages(mid, send_state, date);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 62").stepThis().dispose();
            i5 = 62;
        }
        if (i5 == 62) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS scheduled_messages(mid INTEGER PRIMARY KEY, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages ON scheduled_messages(mid, send_state, date);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages ON scheduled_messages(uid, date);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 63").stepThis().dispose();
            i5 = 63;
        }
        if (i5 == 63) {
            sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 64").stepThis().dispose();
            i5 = 64;
        }
        if (i5 == 64) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT)").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 65").stepThis().dispose();
            i5 = 65;
        }
        if (i5 == 65) {
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON dialogs(flags);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 66").stepThis().dispose();
            i5 = 66;
        }
        if (i5 == 66) {
            sQLiteDatabase.executeFast("CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 67").stepThis().dispose();
            i5 = 67;
        }
        if (i5 == 67) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 68").stepThis().dispose();
            i5 = 68;
        }
        if (i5 == 68) {
            executeNoException(sQLiteDatabase, "ALTER TABLE messages ADD COLUMN forwards INTEGER default 0");
            sQLiteDatabase.executeFast("PRAGMA user_version = 69").stepThis().dispose();
            i5 = 69;
        }
        if (i5 == 69) {
            executeNoException(sQLiteDatabase, "ALTER TABLE messages ADD COLUMN replies_data BLOB default NULL");
            executeNoException(sQLiteDatabase, "ALTER TABLE messages ADD COLUMN thread_reply_id INTEGER default 0");
            sQLiteDatabase.executeFast("PRAGMA user_version = 70").stepThis().dispose();
            i5 = 70;
        }
        if (i5 == 70) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 71").stepThis().dispose();
            i5 = 71;
        }
        if (i5 == 71) {
            executeNoException(sQLiteDatabase, "ALTER TABLE sharing_locations ADD COLUMN proximity INTEGER default 0");
            sQLiteDatabase.executeFast("PRAGMA user_version = 72").stepThis().dispose();
            i5 = 72;
        }
        if (i5 == 72) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 73").stepThis().dispose();
            i5 = 73;
        }
        if (i5 == 73) {
            executeNoException(sQLiteDatabase, "ALTER TABLE chat_settings_v2 ADD COLUMN inviter INTEGER default 0");
            sQLiteDatabase.executeFast("PRAGMA user_version = 74").stepThis().dispose();
            i5 = 74;
        }
        if (i5 == 74) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 75").stepThis().dispose();
            i5 = 75;
        }
        if (i5 == 75) {
            executeNoException(sQLiteDatabase, "ALTER TABLE chat_settings_v2 ADD COLUMN links INTEGER default 0");
            sQLiteDatabase.executeFast("PRAGMA user_version = 76").stepThis().dispose();
            i5 = 76;
        }
        if (i5 == 76) {
            executeNoException(sQLiteDatabase, "ALTER TABLE enc_tasks_v2 ADD COLUMN media INTEGER default -1");
            sQLiteDatabase.executeFast("PRAGMA user_version = 77").stepThis().dispose();
            i5 = 77;
        }
        if (i5 == 77) {
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS channel_admins_v2;").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 78").stepThis().dispose();
            i5 = 78;
        }
        if (i5 == 78) {
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS bot_info;").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 79").stepThis().dispose();
            i5 = 79;
        }
        int i11 = 3;
        if (i5 == 79) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v3(mid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, media))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v3 ON enc_tasks_v3(date);").stepThis().dispose();
            sQLiteDatabase.beginTransaction();
            SQLiteCursor sQLiteCursorQueryFinalized11 = sQLiteDatabase.queryFinalized("SELECT mid, date, media FROM enc_tasks_v2 WHERE 1", new Object[0]);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast3 = sQLiteDatabase.executeFast("REPLACE INTO enc_tasks_v3 VALUES(?, ?, ?)");
            if (sQLiteCursorQueryFinalized11.next()) {
                long jLongValue = sQLiteCursorQueryFinalized11.longValue(0);
                int iIntValue2 = sQLiteCursorQueryFinalized11.intValue(1);
                int iIntValue3 = sQLiteCursorQueryFinalized11.intValue(2);
                sQLitePreparedStatementExecuteFast3.requery();
                sQLitePreparedStatementExecuteFast3.bindLong(1, jLongValue);
                sQLitePreparedStatementExecuteFast3.bindInteger(2, iIntValue2);
                sQLitePreparedStatementExecuteFast3.bindInteger(3, iIntValue3);
                sQLitePreparedStatementExecuteFast3.step();
            }
            sQLitePreparedStatementExecuteFast3.dispose();
            sQLiteCursorQueryFinalized11.dispose();
            sQLiteDatabase.commitTransaction();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks_v2;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS enc_tasks_v2;").stepThis().dispose();
            sQLiteDatabase.executeFast("PRAGMA user_version = 80").stepThis().dispose();
            i5 = 80;
        }
        int i12 = 5;
        if (i5 == 80) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, PRIMARY KEY(mid, uid))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS bot_keyboard_idx_mid;").stepThis().dispose();
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteCursorQueryFinalized8 = sQLiteDatabase.queryFinalized("SELECT mid, uid, send_state, date, data, ttl, replydata FROM scheduled_messages_v2 WHERE 1", new Object[0]);
            } catch (Exception e) {
                FileLog.e(e);
                sQLiteCursorQueryFinalized8 = null;
            }
            if (sQLiteCursorQueryFinalized8 != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast4 = sQLiteDatabase.executeFast("REPLACE INTO scheduled_messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                while (sQLiteCursorQueryFinalized8.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue3 = sQLiteCursorQueryFinalized8.byteBufferValue(4);
                    if (nativeByteBufferByteBufferValue3 != null) {
                        int iIntValue4 = sQLiteCursorQueryFinalized8.intValue(i9);
                        long jLongValue2 = sQLiteCursorQueryFinalized8.longValue(1);
                        int iIntValue5 = sQLiteCursorQueryFinalized8.intValue(2);
                        int iIntValue6 = sQLiteCursorQueryFinalized8.intValue(3);
                        int iIntValue7 = sQLiteCursorQueryFinalized8.intValue(i12);
                        NativeByteBuffer nativeByteBufferByteBufferValue4 = sQLiteCursorQueryFinalized8.byteBufferValue(6);
                        sQLitePreparedStatementExecuteFast4.requery();
                        sQLitePreparedStatementExecuteFast4.bindInteger(1, iIntValue4);
                        sQLitePreparedStatementExecuteFast4.bindLong(2, jLongValue2);
                        sQLitePreparedStatementExecuteFast4.bindInteger(3, iIntValue5);
                        sQLitePreparedStatementExecuteFast4.bindByteBuffer(4, nativeByteBufferByteBufferValue3);
                        sQLitePreparedStatementExecuteFast4.bindInteger(5, iIntValue6);
                        sQLitePreparedStatementExecuteFast4.bindInteger(6, iIntValue7);
                        if (nativeByteBufferByteBufferValue4 != null) {
                            sQLitePreparedStatementExecuteFast4.bindByteBuffer(7, nativeByteBufferByteBufferValue4);
                        } else {
                            sQLitePreparedStatementExecuteFast4.bindNull(7);
                        }
                        sQLitePreparedStatementExecuteFast4.step();
                        if (nativeByteBufferByteBufferValue4 != null) {
                            nativeByteBufferByteBufferValue4.reuse();
                        }
                        nativeByteBufferByteBufferValue3.reuse();
                        i9 = 0;
                        i12 = 5;
                    }
                }
                sQLiteCursorQueryFinalized8.dispose();
                sQLitePreparedStatementExecuteFast4.dispose();
            }
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS send_state_idx_scheduled_messages;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS uid_date_idx_scheduled_messages;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS scheduled_messages;").stepThis().dispose();
            sQLiteDatabase.commitTransaction();
            sQLiteDatabase.executeFast("PRAGMA user_version = 81").stepThis().dispose();
            i5 = 81;
        }
        if (i5 == 81) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS media_v3(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v3 ON media_v3(uid, mid, type, date);").stepThis().dispose();
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteCursorQueryFinalized7 = sQLiteDatabase.queryFinalized("SELECT mid, uid, date, type, data FROM media_v2 WHERE 1", new Object[0]);
            } catch (Exception e2) {
                FileLog.e(e2);
                sQLiteCursorQueryFinalized7 = null;
            }
            if (sQLiteCursorQueryFinalized7 != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast5 = sQLiteDatabase.executeFast("REPLACE INTO media_v3 VALUES(?, ?, ?, ?, ?)");
                while (sQLiteCursorQueryFinalized7.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue5 = sQLiteCursorQueryFinalized7.byteBufferValue(4);
                    if (nativeByteBufferByteBufferValue5 != null) {
                        int iIntValue8 = sQLiteCursorQueryFinalized7.intValue(0);
                        long jLongValue3 = sQLiteCursorQueryFinalized7.longValue(1);
                        if (((int) jLongValue3) == 0) {
                            jLongValue3 = DialogObject.makeEncryptedDialogId((int) (jLongValue3 >> 32));
                        }
                        int iIntValue9 = sQLiteCursorQueryFinalized7.intValue(2);
                        int iIntValue10 = sQLiteCursorQueryFinalized7.intValue(3);
                        sQLitePreparedStatementExecuteFast5.requery();
                        sQLitePreparedStatementExecuteFast5.bindInteger(1, iIntValue8);
                        sQLitePreparedStatementExecuteFast5.bindLong(2, jLongValue3);
                        sQLitePreparedStatementExecuteFast5.bindInteger(3, iIntValue9);
                        sQLitePreparedStatementExecuteFast5.bindInteger(4, iIntValue10);
                        sQLitePreparedStatementExecuteFast5.bindByteBuffer(5, nativeByteBufferByteBufferValue5);
                        sQLitePreparedStatementExecuteFast5.step();
                        nativeByteBufferByteBufferValue5.reuse();
                    }
                }
                sQLiteCursorQueryFinalized7.dispose();
                sQLitePreparedStatementExecuteFast5.dispose();
            }
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS uid_mid_type_date_idx_media;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS media_v2;").stepThis().dispose();
            sQLiteDatabase.commitTransaction();
            sQLiteDatabase.executeFast("PRAGMA user_version = 82").stepThis().dispose();
            i5 = 82;
        }
        if (i5 == 82) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));").stepThis().dispose();
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteCursorQueryFinalized3 = sQLiteDatabase.queryFinalized("SELECT r.random_id, r.mid, m.uid FROM randoms as r INNER JOIN messages as m ON r.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e3) {
                FileLog.e(e3);
                sQLiteCursorQueryFinalized3 = null;
            }
            if (sQLiteCursorQueryFinalized3 != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast6 = sQLiteDatabase.executeFast("REPLACE INTO randoms_v2 VALUES(?, ?, ?)");
                while (sQLiteCursorQueryFinalized3.next()) {
                    long jLongValue4 = sQLiteCursorQueryFinalized3.longValue(0);
                    int iIntValue11 = sQLiteCursorQueryFinalized3.intValue(1);
                    long jLongValue5 = sQLiteCursorQueryFinalized3.longValue(2);
                    if (((int) jLongValue5) == 0) {
                        jLongValue5 = DialogObject.makeEncryptedDialogId((int) (jLongValue5 >> 32));
                    }
                    sQLitePreparedStatementExecuteFast6.requery();
                    sQLitePreparedStatementExecuteFast6.bindLong(1, jLongValue4);
                    sQLitePreparedStatementExecuteFast6.bindInteger(2, iIntValue11);
                    sQLitePreparedStatementExecuteFast6.bindLong(3, jLongValue5);
                    sQLitePreparedStatementExecuteFast6.step();
                }
                sQLiteCursorQueryFinalized3.dispose();
                sQLitePreparedStatementExecuteFast6.dispose();
            }
            try {
                sQLiteCursorQueryFinalized4 = sQLiteDatabase.queryFinalized("SELECT p.mid, m.uid, p.id FROM polls as p INNER JOIN messages as m ON p.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e4) {
                FileLog.e(e4);
                sQLiteCursorQueryFinalized4 = null;
            }
            if (sQLiteCursorQueryFinalized4 != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast7 = sQLiteDatabase.executeFast("REPLACE INTO polls_v2 VALUES(?, ?, ?)");
                while (sQLiteCursorQueryFinalized4.next()) {
                    int iIntValue12 = sQLiteCursorQueryFinalized4.intValue(0);
                    long jLongValue6 = sQLiteCursorQueryFinalized4.longValue(1);
                    long jLongValue7 = sQLiteCursorQueryFinalized4.longValue(2);
                    if (((int) jLongValue6) == 0) {
                        jLongValue6 = DialogObject.makeEncryptedDialogId((int) (jLongValue6 >> 32));
                    }
                    sQLitePreparedStatementExecuteFast7.requery();
                    sQLitePreparedStatementExecuteFast7.bindInteger(1, iIntValue12);
                    sQLitePreparedStatementExecuteFast7.bindLong(2, jLongValue6);
                    sQLitePreparedStatementExecuteFast7.bindLong(3, jLongValue7);
                    sQLitePreparedStatementExecuteFast7.step();
                }
                sQLiteCursorQueryFinalized4.dispose();
                sQLitePreparedStatementExecuteFast7.dispose();
            }
            try {
                sQLiteCursorQueryFinalized5 = sQLiteDatabase.queryFinalized("SELECT wp.id, wp.mid, m.uid FROM webpage_pending as wp INNER JOIN messages as m ON wp.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e5) {
                FileLog.e(e5);
                sQLiteCursorQueryFinalized5 = null;
            }
            if (sQLiteCursorQueryFinalized5 != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast8 = sQLiteDatabase.executeFast("REPLACE INTO webpage_pending_v2 VALUES(?, ?, ?)");
                while (sQLiteCursorQueryFinalized5.next()) {
                    long jLongValue8 = sQLiteCursorQueryFinalized5.longValue(0);
                    int iIntValue13 = sQLiteCursorQueryFinalized5.intValue(1);
                    long jLongValue9 = sQLiteCursorQueryFinalized5.longValue(2);
                    if (((int) jLongValue9) == 0) {
                        jLongValue9 = DialogObject.makeEncryptedDialogId((int) (jLongValue9 >> 32));
                    }
                    sQLitePreparedStatementExecuteFast8.requery();
                    sQLitePreparedStatementExecuteFast8.bindLong(1, jLongValue8);
                    sQLitePreparedStatementExecuteFast8.bindInteger(2, iIntValue13);
                    sQLitePreparedStatementExecuteFast8.bindLong(3, jLongValue9);
                    sQLitePreparedStatementExecuteFast8.step();
                }
                sQLiteCursorQueryFinalized5.dispose();
                sQLitePreparedStatementExecuteFast8.dispose();
            }
            try {
                sQLiteCursorQueryFinalized6 = sQLiteDatabase.queryFinalized("SELECT et.mid, m.uid, et.date, et.media FROM enc_tasks_v3 as et INNER JOIN messages as m ON et.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e6) {
                FileLog.e(e6);
                sQLiteCursorQueryFinalized6 = null;
            }
            if (sQLiteCursorQueryFinalized6 != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast9 = sQLiteDatabase.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                while (sQLiteCursorQueryFinalized6.next()) {
                    int iIntValue14 = sQLiteCursorQueryFinalized6.intValue(0);
                    long jLongValue10 = sQLiteCursorQueryFinalized6.longValue(1);
                    int iIntValue15 = sQLiteCursorQueryFinalized6.intValue(2);
                    int iIntValue16 = sQLiteCursorQueryFinalized6.intValue(3);
                    if (((int) jLongValue10) == 0) {
                        jLongValue10 = DialogObject.makeEncryptedDialogId((int) (jLongValue10 >> 32));
                    }
                    sQLitePreparedStatementExecuteFast9.requery();
                    sQLitePreparedStatementExecuteFast9.bindInteger(1, iIntValue14);
                    sQLitePreparedStatementExecuteFast9.bindLong(2, jLongValue10);
                    sQLitePreparedStatementExecuteFast9.bindInteger(3, iIntValue15);
                    sQLitePreparedStatementExecuteFast9.bindInteger(4, iIntValue16);
                    sQLitePreparedStatementExecuteFast9.step();
                }
                sQLiteCursorQueryFinalized6.dispose();
                sQLitePreparedStatementExecuteFast9.dispose();
            }
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS mid_idx_randoms;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS randoms;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks_v3;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS enc_tasks_v3;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS polls_id;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS polls;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS webpage_pending;").stepThis().dispose();
            sQLiteDatabase.commitTransaction();
            sQLiteDatabase.executeFast("PRAGMA user_version = 83").stepThis().dispose();
            i5 = 83;
        }
        if (i5 == 83) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, PRIMARY KEY(mid, uid))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);").stepThis().dispose();
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteCursorQueryFinalized2 = sQLiteDatabase.queryFinalized("SELECT mid, uid, read_state, send_state, date, data, out, ttl, media, replydata, imp, mention, forwards, replies_data, thread_reply_id FROM messages WHERE 1", new Object[0]);
            } catch (Exception e7) {
                FileLog.e(e7);
                sQLiteCursorQueryFinalized2 = null;
            }
            if (sQLiteCursorQueryFinalized2 != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast10 = sQLiteDatabase.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                while (sQLiteCursorQueryFinalized2.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue6 = sQLiteCursorQueryFinalized2.byteBufferValue(5);
                    if (nativeByteBufferByteBufferValue6 != null) {
                        long jIntValue2 = sQLiteCursorQueryFinalized2.intValue(0);
                        long jLongValue11 = sQLiteCursorQueryFinalized2.longValue(i8);
                        if (((int) jLongValue11) == 0) {
                            jLongValue11 = DialogObject.makeEncryptedDialogId((int) (jLongValue11 >> 32));
                        }
                        int iIntValue17 = sQLiteCursorQueryFinalized2.intValue(i7);
                        int iIntValue18 = sQLiteCursorQueryFinalized2.intValue(i11);
                        int iIntValue19 = sQLiteCursorQueryFinalized2.intValue(i4);
                        int iIntValue20 = sQLiteCursorQueryFinalized2.intValue(i6);
                        int iIntValue21 = sQLiteCursorQueryFinalized2.intValue(7);
                        int iIntValue22 = sQLiteCursorQueryFinalized2.intValue(8);
                        NativeByteBuffer nativeByteBufferByteBufferValue7 = sQLiteCursorQueryFinalized2.byteBufferValue(9);
                        int iIntValue23 = sQLiteCursorQueryFinalized2.intValue(10);
                        int iIntValue24 = sQLiteCursorQueryFinalized2.intValue(11);
                        int iIntValue25 = sQLiteCursorQueryFinalized2.intValue(12);
                        NativeByteBuffer nativeByteBufferByteBufferValue8 = sQLiteCursorQueryFinalized2.byteBufferValue(13);
                        int iIntValue26 = sQLiteCursorQueryFinalized2.intValue(14);
                        SQLiteCursor sQLiteCursor = sQLiteCursorQueryFinalized2;
                        int i13 = (int) (jLongValue11 >> 32);
                        if (iIntValue21 < 0) {
                            TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue6, nativeByteBufferByteBufferValue6.readInt32(false), false);
                            if (messageTLdeserialize != null) {
                                i3 = iIntValue22;
                                messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue6, messagesStorage.getUserConfig().clientUserId);
                                if (messageTLdeserialize.params == null) {
                                    HashMap<String, String> map = new HashMap<>();
                                    messageTLdeserialize.params = map;
                                    StringBuilder sb = new StringBuilder();
                                    i2 = i13;
                                    sb.append("");
                                    sb.append(iIntValue21);
                                    map.put("fwd_peer", sb.toString());
                                } else {
                                    i2 = i13;
                                }
                                nativeByteBufferByteBufferValue6.reuse();
                                nativeByteBufferByteBufferValue6 = new NativeByteBuffer(messageTLdeserialize.getObjectSize());
                                messageTLdeserialize.serializeToStream(nativeByteBufferByteBufferValue6);
                            } else {
                                i2 = i13;
                                i3 = iIntValue22;
                            }
                            iIntValue21 = 0;
                        } else {
                            i2 = i13;
                            i3 = iIntValue22;
                        }
                        sQLitePreparedStatementExecuteFast10.requery();
                        sQLitePreparedStatementExecuteFast10.bindInteger(1, (int) jIntValue2);
                        sQLitePreparedStatementExecuteFast10.bindLong(2, jLongValue11);
                        sQLitePreparedStatementExecuteFast10.bindInteger(3, iIntValue17);
                        sQLitePreparedStatementExecuteFast10.bindInteger(4, iIntValue18);
                        sQLitePreparedStatementExecuteFast10.bindInteger(5, iIntValue19);
                        sQLitePreparedStatementExecuteFast10.bindByteBuffer(6, nativeByteBufferByteBufferValue6);
                        sQLitePreparedStatementExecuteFast10.bindInteger(7, iIntValue20);
                        sQLitePreparedStatementExecuteFast10.bindInteger(8, iIntValue21);
                        sQLitePreparedStatementExecuteFast10.bindInteger(9, i3);
                        if (nativeByteBufferByteBufferValue7 != null) {
                            sQLitePreparedStatementExecuteFast10.bindByteBuffer(10, nativeByteBufferByteBufferValue7);
                        } else {
                            sQLitePreparedStatementExecuteFast10.bindNull(10);
                        }
                        sQLitePreparedStatementExecuteFast10.bindInteger(11, iIntValue23);
                        sQLitePreparedStatementExecuteFast10.bindInteger(12, iIntValue24);
                        sQLitePreparedStatementExecuteFast10.bindInteger(13, iIntValue25);
                        if (nativeByteBufferByteBufferValue8 != null) {
                            nativeByteBuffer = nativeByteBufferByteBufferValue8;
                            sQLitePreparedStatementExecuteFast10.bindByteBuffer(14, nativeByteBuffer);
                        } else {
                            nativeByteBuffer = nativeByteBufferByteBufferValue8;
                            sQLitePreparedStatementExecuteFast10.bindNull(14);
                        }
                        sQLitePreparedStatementExecuteFast10.bindInteger(15, iIntValue26);
                        sQLitePreparedStatementExecuteFast10.bindInteger(16, i2 > 0 ? 1 : 0);
                        sQLitePreparedStatementExecuteFast10.step();
                        if (nativeByteBufferByteBufferValue7 != null) {
                            nativeByteBufferByteBufferValue7.reuse();
                        }
                        if (nativeByteBuffer != null) {
                            nativeByteBuffer.reuse();
                        }
                        nativeByteBufferByteBufferValue6.reuse();
                        sQLiteCursorQueryFinalized2 = sQLiteCursor;
                        i4 = 4;
                        i6 = 6;
                        i7 = 2;
                        i8 = 1;
                        i11 = 3;
                    }
                }
                sQLiteCursorQueryFinalized2.dispose();
                sQLitePreparedStatementExecuteFast10.dispose();
            }
            int i14 = 0;
            sQLiteDatabase2 = sQLiteDatabase;
            SQLiteCursor sQLiteCursorQueryFinalized12 = sQLiteDatabase2.queryFinalized("SELECT did, last_mid, last_mid_i FROM dialogs WHERE 1", new Object[0]);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast11 = sQLiteDatabase2.executeFast("UPDATE dialogs SET last_mid = ?, last_mid_i = ? WHERE did = ?");
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (sQLiteCursorQueryFinalized12.next()) {
                long jLongValue12 = sQLiteCursorQueryFinalized12.longValue(i14);
                int i15 = (int) jLongValue12;
                int i16 = (int) (jLongValue12 >> 32);
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
                sQLitePreparedStatementExecuteFast11.requery();
                sQLitePreparedStatementExecuteFast11.bindInteger(1, sQLiteCursorQueryFinalized12.intValue(1));
                sQLitePreparedStatementExecuteFast11.bindInteger(2, sQLiteCursorQueryFinalized12.intValue(2));
                sQLitePreparedStatementExecuteFast11.bindLong(3, jLongValue12);
                sQLitePreparedStatementExecuteFast11.step();
                i14 = 0;
            }
            sQLitePreparedStatementExecuteFast11.dispose();
            sQLiteCursorQueryFinalized12.dispose();
            int i17 = 0;
            SQLiteCursor sQLiteCursorQueryFinalized13 = sQLiteDatabase2.queryFinalized("SELECT uid, mid FROM unread_push_messages WHERE 1", new Object[0]);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast12 = sQLiteDatabase2.executeFast("UPDATE unread_push_messages SET mid = ? WHERE uid = ? AND mid = ?");
            while (sQLiteCursorQueryFinalized13.next()) {
                long jLongValue13 = sQLiteCursorQueryFinalized13.longValue(i17);
                int iIntValue27 = sQLiteCursorQueryFinalized13.intValue(1);
                sQLitePreparedStatementExecuteFast12.requery();
                sQLitePreparedStatementExecuteFast12.bindInteger(1, iIntValue27);
                sQLitePreparedStatementExecuteFast12.bindLong(2, jLongValue13);
                sQLitePreparedStatementExecuteFast12.bindInteger(3, iIntValue27);
                sQLitePreparedStatementExecuteFast12.step();
                i17 = 0;
            }
            sQLitePreparedStatementExecuteFast12.dispose();
            sQLiteCursorQueryFinalized13.dispose();
            if (arrayList != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast13 = sQLiteDatabase2.executeFast("UPDATE dialogs SET did = ? WHERE did = ?");
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast14 = sQLiteDatabase2.executeFast("UPDATE dialog_filter_pin_v2 SET peer = ? WHERE peer = ?");
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast15 = sQLiteDatabase2.executeFast("UPDATE dialog_filter_ep SET peer = ? WHERE peer = ?");
                int size = arrayList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    long jIntValue3 = ((Integer) arrayList.get(i18)).intValue();
                    long jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(jIntValue3);
                    long j = jIntValue3 << 32;
                    sQLitePreparedStatementExecuteFast13.requery();
                    sQLitePreparedStatementExecuteFast13.bindLong(1, jMakeEncryptedDialogId);
                    sQLitePreparedStatementExecuteFast13.bindLong(2, j);
                    sQLitePreparedStatementExecuteFast13.step();
                    sQLitePreparedStatementExecuteFast14.requery();
                    sQLitePreparedStatementExecuteFast14.bindLong(1, jMakeEncryptedDialogId);
                    sQLitePreparedStatementExecuteFast14.bindLong(2, j);
                    sQLitePreparedStatementExecuteFast14.step();
                    sQLitePreparedStatementExecuteFast15.requery();
                    sQLitePreparedStatementExecuteFast15.bindLong(1, jMakeEncryptedDialogId);
                    sQLitePreparedStatementExecuteFast15.bindLong(2, j);
                    sQLitePreparedStatementExecuteFast15.step();
                }
                sQLitePreparedStatementExecuteFast13.dispose();
                sQLitePreparedStatementExecuteFast14.dispose();
                sQLitePreparedStatementExecuteFast15.dispose();
            }
            if (arrayList2 != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast16 = sQLiteDatabase2.executeFast("UPDATE dialogs SET did = ? WHERE did = ?");
                int size2 = arrayList2.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    int iIntValue28 = ((Integer) arrayList2.get(i19)).intValue();
                    long jMakeFolderDialogId = DialogObject.makeFolderDialogId(iIntValue28);
                    sQLitePreparedStatementExecuteFast16.requery();
                    sQLitePreparedStatementExecuteFast16.bindLong(1, jMakeFolderDialogId);
                    sQLitePreparedStatementExecuteFast16.bindLong(2, iIntValue28 | 8589934592L);
                    sQLitePreparedStatementExecuteFast16.step();
                }
                sQLitePreparedStatementExecuteFast16.dispose();
            }
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mid_read_out_idx_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_date_mid_idx_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS mid_out_idx_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS task_idx_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS send_state_idx_messages2;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mention_idx_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS messages;").stepThis().dispose();
            sQLiteDatabase.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 84").stepThis().dispose();
            i5 = 84;
        } else {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        if (i5 == 84) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))").stepThis().dispose();
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteCursorQueryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid, uid, date, type, data FROM media_v3 WHERE 1", new Object[0]);
            } catch (Exception e8) {
                FileLog.e(e8);
                sQLiteCursorQueryFinalized = null;
            }
            if (sQLiteCursorQueryFinalized != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast17 = sQLiteDatabase2.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue9 = sQLiteCursorQueryFinalized.byteBufferValue(4);
                    if (nativeByteBufferByteBufferValue9 != null) {
                        int iIntValue29 = sQLiteCursorQueryFinalized.intValue(0);
                        long jLongValue14 = sQLiteCursorQueryFinalized.longValue(1);
                        if (((int) jLongValue14) == 0) {
                            jLongValue14 = DialogObject.makeEncryptedDialogId((int) (jLongValue14 >> 32));
                        }
                        int iIntValue30 = sQLiteCursorQueryFinalized.intValue(2);
                        int iIntValue31 = sQLiteCursorQueryFinalized.intValue(3);
                        sQLitePreparedStatementExecuteFast17.requery();
                        sQLitePreparedStatementExecuteFast17.bindInteger(1, iIntValue29);
                        sQLitePreparedStatementExecuteFast17.bindLong(2, jLongValue14);
                        sQLitePreparedStatementExecuteFast17.bindInteger(3, iIntValue30);
                        sQLitePreparedStatementExecuteFast17.bindInteger(4, iIntValue31);
                        sQLitePreparedStatementExecuteFast17.bindByteBuffer(5, nativeByteBufferByteBufferValue9);
                        sQLitePreparedStatementExecuteFast17.step();
                        nativeByteBufferByteBufferValue9.reuse();
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                sQLitePreparedStatementExecuteFast17.dispose();
            }
            sQLiteDatabase.commitTransaction();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS media_v3;").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 85").stepThis().dispose();
            i5 = 85;
        }
        if (i5 == 85) {
            executeNoException(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            executeNoException(sQLiteDatabase2, "ALTER TABLE scheduled_messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);").stepThis().dispose();
            executeNoException(sQLiteDatabase2, "UPDATE messages_v2 SET replydata = NULL");
            executeNoException(sQLiteDatabase2, "UPDATE scheduled_messages_v2 SET replydata = NULL");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 86").stepThis().dispose();
            i5 = 86;
        }
        if (i5 == 86) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS reactions(data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 87").stepThis().dispose();
            i5 = 87;
        }
        if (i5 == 87) {
            sQLiteDatabase2.executeFast("ALTER TABLE dialogs ADD COLUMN unread_reactions INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE reaction_mentions(message_id INTEGER PRIMARY KEY, state INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 88").stepThis().dispose();
            i5 = 88;
        }
        if (i5 == 88 || i5 == 89) {
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS reaction_mentions;").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(dialog_id, message_id));").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mid_type_date_idx_media_v3").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 90").stepThis().dispose();
            i5 = 90;
        }
        if (i5 == 90 || i5 == 91) {
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS downloading_documents;").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 92").stepThis().dispose();
            i5 = 92;
        }
        if (i5 == 92) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 93").stepThis().dispose();
            i5 = 95;
        }
        if (i5 == 95 || i5 == 93) {
            executeNoException(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN custom_params BLOB default NULL");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 96").stepThis().dispose();
            i5 = 96;
        }
        if (i5 == 96) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS premium_promo(data BLOB, date INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("UPDATE stickers_v2 SET date = 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 97").stepThis().dispose();
            i5 = 97;
        }
        if (i5 == 97) {
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS stickers_featured;").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 98").stepThis().dispose();
            i5 = 98;
        }
        if (i5 == 98) {
            sQLiteDatabase2.executeFast("CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 99").stepThis().dispose();
            i5 = 99;
        }
        if (i5 == 99) {
            sQLiteDatabase2.executeFast("ALTER TABLE stickers_featured ADD COLUMN emoji INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 100").stepThis().dispose();
            i5 = 100;
        }
        if (i5 == 100) {
            sQLiteDatabase2.executeFast("CREATE TABLE emoji_statuses(data BLOB, type INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 101").stepThis().dispose();
            i5 = 101;
        }
        if (i5 == 101) {
            sQLiteDatabase2.executeFast("ALTER TABLE messages_v2 ADD COLUMN group_id INTEGER default NULL").stepThis().dispose();
            sQLiteDatabase2.executeFast("ALTER TABLE dialogs ADD COLUMN last_mid_group INTEGER default NULL").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 102").stepThis().dispose();
            i5 = 102;
        }
        if (i5 == 102) {
            sQLiteDatabase2.executeFast("CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes_topics(uid, topic_id, end);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, PRIMARY KEY(mid, topic_id, uid))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, mid, read_state, out);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, mention, read_state);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS mid_uid_topic_id_messages_topics ON messages_topics(mid, topic_id, uid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, PRIMARY KEY(did, topic_id));").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 103").stepThis().dispose();
            i5 = 103;
        }
        if (i5 == 103) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 104").stepThis().dispose();
            i5 = 104;
        }
        if (i5 == 104) {
            sQLiteDatabase2.executeFast("ALTER TABLE topics ADD COLUMN read_outbox INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 105").stepThis().dispose();
            i5 = 105;
        }
        if (i5 == 105) {
            sQLiteDatabase2.executeFast("ALTER TABLE topics ADD COLUMN pinned INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 106").stepThis().dispose();
            i5 = 106;
        }
        if (i5 == 106) {
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mid_read_out_idx_messages_topics").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mention_idx_messages_topics").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS did_topics ON topics(did);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 107").stepThis().dispose();
            i5 = 107;
        }
        if (i5 == 107) {
            sQLiteDatabase2.executeFast("ALTER TABLE topics ADD COLUMN total_messages_count INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 108").stepThis().dispose();
            i5 = 108;
        }
        if (i5 == 108) {
            sQLiteDatabase2.executeFast("ALTER TABLE topics ADD COLUMN hidden INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 109").stepThis().dispose();
            i5 = 109;
        }
        if (i5 == 109) {
            sQLiteDatabase2.executeFast("ALTER TABLE dialogs ADD COLUMN ttl_period INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 110").stepThis().dispose();
            i5 = 110;
        }
        if (i5 == 110) {
            sQLiteDatabase2.executeFast("CREATE TABLE stickersets(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 111").stepThis().dispose();
            i5 = 111;
        }
        if (i5 == 111) {
            sQLiteDatabase2.executeFast("CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 112").stepThis().dispose();
            i5 = 112;
        }
        if (i5 == 112) {
            sQLiteDatabase2.executeFast("CREATE TABLE app_config(data BLOB)").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 113").stepThis().dispose();
            i5 = 113;
        }
        if (i5 == 113) {
            messagesStorage.reset();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 114").stepThis().dispose();
            i5 = 114;
        }
        if (i5 == 114) {
            sQLiteDatabase2.executeFast("CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 115").stepThis().dispose();
            i5 = 115;
        }
        if (i5 == 115) {
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 117").stepThis().dispose();
            i5 = 117;
        }
        if (i5 == 116 || i5 == 117 || i5 == 118) {
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS stories").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS stories_counter").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, local_path TEXT, local_thumb_path TEXT, PRIMARY KEY (dialog_id, story_id));").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 119").stepThis().dispose();
            messagesStorage.getMessagesController().getStoriesController().cleanup();
            i5 = 119;
        }
        if (i5 == 119) {
            sQLiteDatabase2.executeFast("ALTER TABLE messages_v2 ADD COLUMN reply_to_story_id INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("ALTER TABLE messages_topics ADD COLUMN reply_to_story_id INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 120").stepThis().dispose();
            i5 = 120;
        }
        if (i5 == 120) {
            sQLiteDatabase2.executeFast("CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, PRIMARY KEY(dialog_id, story_id));").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE archived_stories (story_id INTEGER PRIMARY KEY, data BLOB);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 121").stepThis().dispose();
            i5 = 121;
        }
        if (i5 == 121) {
            sQLiteDatabase2.executeFast("CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 122").stepThis().dispose();
            i5 = 122;
        }
        if (i5 == 122) {
            sQLiteDatabase2.executeFast("ALTER TABLE chat_settings_v2 ADD COLUMN participants_count INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 123").stepThis().dispose();
            i5 = 123;
        }
        if (i5 == 123) {
            sQLiteDatabase2.executeFast("CREATE TABLE story_pushes (uid INTEGER PRIMARY KEY, minId INTEGER, maxId INTEGER, date INTEGER, localName TEXT);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 124").stepThis().dispose();
            i5 = 124;
        }
        if (i5 == 124) {
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS story_pushes;").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, PRIMARY KEY(uid, sid));").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 125").stepThis().dispose();
            i5 = 125;
        }
        if (i5 == 125) {
            sQLiteDatabase2.executeFast("ALTER TABLE story_pushes ADD COLUMN flags INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 126").stepThis().dispose();
            i5 = 126;
        }
        if (i5 == 126) {
            sQLiteDatabase2.executeFast("ALTER TABLE story_pushes ADD COLUMN expire_date INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 127").stepThis().dispose();
            i5 = 127;
        }
        if (i5 == 127) {
            sQLiteDatabase2.executeFast("ALTER TABLE stories ADD COLUMN custom_params BLOB default NULL").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 128").stepThis().dispose();
            i5 = 128;
        }
        if (i5 == 128) {
            sQLiteDatabase2.executeFast("ALTER TABLE story_drafts ADD COLUMN type INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 129").stepThis().dispose();
            i5 = 129;
        }
        if (i5 == 129) {
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 130").stepThis().dispose();
            i5 = 130;
        }
        if (i5 == 130) {
            sQLiteDatabase2.executeFast("DROP TABLE archived_stories").stepThis().dispose();
            sQLiteDatabase2.executeFast("ALTER TABLE profile_stories ADD COLUMN type INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 131").stepThis().dispose();
            i5 = 131;
        }
        if (i5 == 131) {
            sQLiteDatabase2.executeFast("ALTER TABLE stories DROP COLUMN local_path").stepThis().dispose();
            sQLiteDatabase2.executeFast("ALTER TABLE stories DROP COLUMN local_thumb_path").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 132").stepThis().dispose();
            i5 = 132;
        }
        if (i5 == 132) {
            sQLiteDatabase2.executeFast("CREATE TABLE unconfirmed_auth (data BLOB);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 133").stepThis().dispose();
            i5 = 133;
        }
        if (i5 == 133) {
            sQLiteDatabase2.executeFast("ALTER TABLE unread_push_messages ADD COLUMN topicId INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 134").stepThis().dispose();
            i5 = 134;
        }
        if (i5 == 134) {
            sQLiteDatabase2.executeFast("DROP TABLE user_photos").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 135").stepThis().dispose();
            i5 = 135;
        }
        if (i5 == 135) {
            if (ApplicationLoader.isAndroidTestEnvironment()) {
                sQLiteDatabase2.executeFast("DROP TABLE stickersets").stepThis().dispose();
            }
            sQLiteDatabase2.executeFast("CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 136").stepThis().dispose();
            i5 = 136;
        }
        if (i5 == 136) {
            sQLiteDatabase2.executeFast("CREATE TABLE saved_dialogs(did INTEGER PRIMARY KEY, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER)").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 137").stepThis().dispose();
            i5 = 137;
        }
        if (i5 == 137) {
            sQLiteDatabase2.executeFast("ALTER TABLE unread_push_messages ADD COLUMN is_reaction INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 138").stepThis().dispose();
            i5 = 138;
        }
        if (i5 == 138 || i5 == 139 || i5 == 140 || i5 == 141) {
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS tag_message_id;").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 142").stepThis().dispose();
            i5 = 142;
        }
        if (i5 == 142) {
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS saved_reaction_tags;").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 143").stepThis().dispose();
            i5 = 143;
        }
        if (i5 == 143) {
            sQLiteDatabase2.executeFast("ALTER TABLE dialog_filter ADD COLUMN color INTEGER default -1").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 144").stepThis().dispose();
            i5 = 144;
        }
        if (i5 == 144) {
            sQLiteDatabase2.executeFast("PRAGMA user_version = 145").stepThis().dispose();
            i5 = 145;
        }
        if (i5 == 145) {
            sQLiteDatabase2.executeFast("CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 146").stepThis().dispose();
            i5 = 146;
        }
        if (i5 == 146) {
            sQLiteDatabase2.executeFast("CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 147").stepThis().dispose();
            i5 = 147;
        }
        if (i5 == 147) {
            sQLiteDatabase2.executeFast("ALTER TABLE business_replies ADD COLUMN count INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 148").stepThis().dispose();
            i5 = 148;
        }
        if (i5 == 148) {
            sQLiteDatabase2.executeFast("ALTER TABLE topics ADD COLUMN edit_date INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 149").stepThis().dispose();
            i5 = 149;
        }
        if (i5 == 149) {
            sQLiteDatabase2.executeFast("ALTER TABLE stickersets2 ADD COLUMN short_name TEXT;").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 150").stepThis().dispose();
            i5 = 150;
        }
        if (i5 == 150) {
            sQLiteDatabase2.executeFast("CREATE TABLE business_links(data BLOB, order_value INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 151").stepThis().dispose();
            i5 = 151;
        }
        if (i5 == 151) {
            sQLiteDatabase2.executeFast("ALTER TABLE profile_stories ADD COLUMN seen INTEGER default 0;").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 152").stepThis().dispose();
            i5 = 152;
        }
        if (i5 == 152) {
            sQLiteDatabase2.executeFast("ALTER TABLE profile_stories ADD COLUMN pin INTEGER default 0;").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 153").stepThis().dispose();
            i5 = 153;
        }
        if (i5 == 153) {
            sQLiteDatabase2.executeFast("CREATE TABLE effects(data BLOB)").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 154").stepThis().dispose();
            i5 = 154;
        }
        if (i5 == 154) {
            sQLiteDatabase2.executeFast("CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 155").stepThis().dispose();
            i5 = 155;
        }
        if (i5 == 155) {
            sQLiteDatabase2.executeFast("CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 156").stepThis().dispose();
            i5 = 156;
        }
        if (i5 == 156 || i5 == 157) {
            sQLiteDatabase2.executeFast("CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 158").stepThis().dispose();
            i5 = 158;
        }
        if (i5 == 158) {
            sQLiteDatabase2.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
            sQLiteDatabase2.executeFast("ALTER TABLE star_gifts2 ADD COLUMN pos INTEGER default 0;").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 159").stepThis().dispose();
            i5 = 159;
        }
        if (i5 == 159) {
            sQLiteDatabase2.executeFast("ALTER TABLE dialog_filter ADD COLUMN entities BLOB").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 160").stepThis().dispose();
            i5 = 160;
        }
        if (i5 == 160) {
            sQLiteDatabase2.executeFast("ALTER TABLE dialog_filter ADD COLUMN noanimate INTEGER").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 161").stepThis().dispose();
            i5 = 161;
        }
        if (i5 == 161) {
            sQLiteDatabase2.executeFast("DELETE FROM popular_bots").stepThis().dispose();
            sQLiteDatabase2.executeFast("ALTER TABLE popular_bots ADD COLUMN pos INTEGER").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 162").stepThis().dispose();
            i5 = 162;
        }
        if (i5 == 162) {
            sQLiteDatabase2.executeFast("DROP TABLE saved_dialogs").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, PRIMARY KEY (did, forumChatId))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 163").stepThis().dispose();
            i5 = 163;
        }
        if (i5 == 163) {
            sQLiteDatabase2.executeFast("DROP TABLE saved_dialogs").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 164").stepThis().dispose();
            i5 = 164;
        }
        if (i5 == 164) {
            sQLiteDatabase2.executeFast("ALTER TABLE topics ADD COLUMN nopaid_messages_exception INTEGER default 0;").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 165").stepThis().dispose();
            i5 = 165;
        }
        if (i5 == 165) {
            sQLiteDatabase2.executeFast("CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 166").stepThis().dispose();
            i5 = 166;
        }
        if (i5 == 166) {
            sQLiteDatabase2.executeFast("DROP TABLE profile_stories").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 167").stepThis().dispose();
            i5 = 167;
        }
        if (i5 == 167) {
            sQLiteDatabase2.executeFast("CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 168").stepThis().dispose();
            i5 = 168;
        }
        if (i5 == 168) {
            sQLiteDatabase2.executeFast("ALTER TABLE dialogs ADD COLUMN unread_poll_votes INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 169").stepThis().dispose();
            i5 = 169;
        }
        if (i5 == 169) {
            sQLiteDatabase2.executeFast("ALTER TABLE topics ADD COLUMN unread_poll_votes INTEGER default 0").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 170").stepThis().dispose();
            i5 = 170;
        }
        if (i5 == 170) {
            sQLiteDatabase2.executeFast("CREATE TABLE poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 171").stepThis().dispose();
            i5 = 171;
        }
        if (i5 != 171) {
            return i5;
        }
        sQLiteDatabase2.executeFast("DROP TABLE story_pushes").stepThis().dispose();
        sQLiteDatabase2.executeFast("CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));").stepThis().dispose();
        sQLiteDatabase2.executeFast("PRAGMA user_version = 172").stepThis().dispose();
        return 172;
    }

    private static void executeNoException(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.executeFast(str).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static boolean recoverDatabase(java.io.File r21, java.io.File r22, java.io.File r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.DatabaseMigrationHelper.recoverDatabase(java.io.File, java.io.File, java.io.File, int):boolean");
    }
}
