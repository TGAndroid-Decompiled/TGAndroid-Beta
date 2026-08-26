package org.telegram.messenger;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

public class DatabaseMigrationHelper {
    private static void executeNoException(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.executeFast(str).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static int migrate(MessagesStorage messagesStorage, SQLiteDatabase sQLiteDatabase, int i) {
        char c;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursorQueryFinalized2;
        NativeByteBuffer nativeByteBuffer;
        SQLiteCursor sQLiteCursorQueryFinalized3;
        SQLiteCursor sQLiteCursorQueryFinalized4;
        SQLiteCursor sQLiteCursorQueryFinalized5;
        SQLiteCursor sQLiteCursorQueryFinalized6;
        SQLiteCursor sQLiteCursorQueryFinalized7;
        SQLiteCursor sQLiteCursorQueryFinalized8;
        int i2 = 4;
        int i3 = i;
        if (i3 < 4) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS user_photos(uid INTEGER, id INTEGER, data BLOB, PRIMARY KEY (uid, id))", "DROP INDEX IF EXISTS read_state_out_idx_messages;", "DROP INDEX IF EXISTS ttl_idx_messages;", "DROP INDEX IF EXISTS date_idx_messages;");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages ON messages(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages ON messages(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages ON messages(uid, date, mid);", "CREATE TABLE IF NOT EXISTS user_contacts_v6(uid INTEGER PRIMARY KEY, fname TEXT, sname TEXT)");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS user_phones_v6(uid INTEGER, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (uid, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v6(sphone, deleted);", "CREATE INDEX IF NOT EXISTS mid_idx_randoms ON randoms(mid);", "CREATE TABLE IF NOT EXISTS sent_files_v2(uid TEXT, type INTEGER, data BLOB, PRIMARY KEY (uid, type))");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, PRIMARY KEY (uid, type));", "CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);", "CREATE TABLE IF NOT EXISTS dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);", "CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);");
            sQLiteDatabase.executeFast("UPDATE messages SET send_state = 2 WHERE mid < 0 AND send_state = 1").stepThis().dispose();
            messagesStorage.fixNotificationSettings();
            sQLiteDatabase.executeFast("PRAGMA user_version = 4").stepThis().dispose();
            i3 = 4;
        }
        int i4 = 6;
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        if (i3 == 4) {
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
                    for (int i8 = 0; i8 < iLimit / 4; i8++) {
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
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE messages ADD COLUMN media INTEGER default 0", "PRAGMA user_version = 6");
            i3 = 6;
        }
        if (i3 == 6) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);", "CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);", "ALTER TABLE enc_chats ADD COLUMN layer INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN seq_in INTEGER default 0");
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE enc_chats ADD COLUMN seq_out INTEGER default 0", "PRAGMA user_version = 7");
            i3 = 7;
        }
        if (i3 == 7 || i3 == 8 || i3 == 9) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "ALTER TABLE enc_chats ADD COLUMN use_count INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN exchange_id INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN key_date INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN fprint INTEGER default 0");
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "ALTER TABLE enc_chats ADD COLUMN fauthkey BLOB default NULL", "ALTER TABLE enc_chats ADD COLUMN khash BLOB default NULL", "PRAGMA user_version = 10");
            i3 = 10;
        }
        if (i3 == 10) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, PRIMARY KEY (id, type));", "PRAGMA user_version = 11");
            i3 = 11;
        }
        if (i3 == 11 || i3 == 12) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "DROP INDEX IF EXISTS uid_mid_idx_media;", "DROP INDEX IF EXISTS mid_idx_media;", "DROP INDEX IF EXISTS uid_date_mid_idx_media;", "DROP TABLE IF EXISTS media;");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "DROP TABLE IF EXISTS media_counts;", "CREATE TABLE IF NOT EXISTS media_v2(mid INTEGER PRIMARY KEY, uid INTEGER, date INTEGER, type INTEGER, data BLOB)", "CREATE TABLE IF NOT EXISTS media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, PRIMARY KEY(uid, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media ON media_v2(uid, mid, type, date);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS keyvalue(id TEXT PRIMARY KEY, value TEXT)", "PRAGMA user_version = 13");
            i3 = 13;
        }
        if (i3 == 13) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE messages ADD COLUMN replydata BLOB default NULL", "PRAGMA user_version = 14");
            i3 = 14;
        }
        if (i3 == 14) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);", "PRAGMA user_version = 15");
            i3 = 15;
        }
        if (i3 == 15) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS webpage_pending(id INTEGER, mid INTEGER, PRIMARY KEY (id, mid));", "PRAGMA user_version = 16");
            i3 = 16;
        }
        if (i3 == 16) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "ALTER TABLE dialogs ADD COLUMN inbox_max INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN outbox_max INTEGER default 0", "PRAGMA user_version = 17");
            i3 = 17;
        }
        if (i3 == 17) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 18");
            i3 = 18;
        }
        if (i3 == 18) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "DROP TABLE IF EXISTS stickers;", "CREATE TABLE IF NOT EXISTS stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);", "PRAGMA user_version = 19");
            i3 = 19;
        }
        if (i3 == 19) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid ON bot_keyboard(mid);", "PRAGMA user_version = 20");
            i3 = 20;
        }
        if (i3 == 20) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);", "PRAGMA user_version = 21");
            i3 = 21;
        }
        if (i3 == 21) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB)");
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
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "ALTER TABLE dialogs ADD COLUMN unread_count_i INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN pts INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN date_i INTEGER default 0", "CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);", "ALTER TABLE messages ADD COLUMN imp INTEGER default 0", "CREATE TABLE IF NOT EXISTS messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes(uid, end);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 22");
            i3 = 22;
        }
        if (i3 == 22) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);", "PRAGMA user_version = 23");
            i3 = 23;
        }
        if (i3 == 23 || i3 == 24) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "DELETE FROM media_holes_v2 WHERE uid != 0 AND type >= 0 AND start IN (0, 1)", "PRAGMA user_version = 25");
            i3 = 25;
        }
        if (i3 == 25 || i3 == 26) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))", "PRAGMA user_version = 27");
            i3 = 27;
        }
        if (i3 == 27) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE web_recent_v3 ADD COLUMN document BLOB default NULL", "PRAGMA user_version = 28");
            i3 = 28;
        }
        if (i3 == 28 || i3 == 29) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "DELETE FROM sent_files_v2 WHERE 1", "DELETE FROM download_queue WHERE 1", "PRAGMA user_version = 30");
            i3 = 30;
        }
        if (i3 == 30) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "ALTER TABLE chat_settings_v2 ADD COLUMN pinned INTEGER default 0", "CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;", "CREATE TABLE IF NOT EXISTS users_data(uid INTEGER PRIMARY KEY, about TEXT)", "PRAGMA user_version = 31");
            i3 = 31;
        }
        if (i3 == 31) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "DROP TABLE IF EXISTS bot_recent;", "CREATE TABLE IF NOT EXISTS chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))", "CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);", "PRAGMA user_version = 32");
            i3 = 32;
        }
        if (i3 == 32) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "DROP INDEX IF EXISTS uid_mid_idx_imp_messages;", "DROP INDEX IF EXISTS uid_date_mid_imp_idx_messages;", "PRAGMA user_version = 33");
            i3 = 33;
        }
        if (i3 == 33) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS pending_tasks(id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 34");
            i3 = 34;
        }
        if (i3 == 34) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER);", "PRAGMA user_version = 35");
            i3 = 35;
        }
        if (i3 == 35) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));", "PRAGMA user_version = 36");
            i3 = 36;
        }
        if (i3 == 36) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE enc_chats ADD COLUMN in_seq_no INTEGER default 0", "PRAGMA user_version = 37");
            i3 = 37;
        }
        if (i3 == 37) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)", "CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);", "PRAGMA user_version = 38");
            i3 = 38;
        }
        if (i3 == 38) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE dialogs ADD COLUMN pinned INTEGER default 0", "PRAGMA user_version = 39");
            i3 = 39;
        }
        if (i3 == 39) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE enc_chats ADD COLUMN admin_id INTEGER default 0", "PRAGMA user_version = 40");
            i3 = 40;
        }
        if (i3 == 40) {
            messagesStorage.fixNotificationSettings();
            sQLiteDatabase.executeFast("PRAGMA user_version = 41").stepThis().dispose();
            i3 = 41;
        }
        if (i3 == 41) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "ALTER TABLE messages ADD COLUMN mention INTEGER default 0", "ALTER TABLE user_contacts_v6 ADD COLUMN imported INTEGER default 0", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages ON messages(uid, mention, read_state);", "PRAGMA user_version = 42");
            i3 = 42;
        }
        if (i3 == 42) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB);", "PRAGMA user_version = 43");
            i3 = 43;
        }
        if (i3 == 43) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 44");
            i3 = 44;
        }
        if (i3 == 44) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)", "CREATE TABLE IF NOT EXISTS user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);", "PRAGMA user_version = 45");
            i3 = 45;
        }
        if (i3 == 45) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE enc_chats ADD COLUMN mtproto_seq INTEGER default 0", "PRAGMA user_version = 46");
            i3 = 46;
        }
        if (i3 == 46) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "DELETE FROM botcache WHERE 1", "PRAGMA user_version = 47");
            i3 = 47;
        }
        if (i3 == 47) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE dialogs ADD COLUMN flags INTEGER default 0", "PRAGMA user_version = 48");
            i3 = 48;
        }
        if (i3 == 48) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, PRIMARY KEY(uid, mid))", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);", "PRAGMA user_version = 49");
            i3 = 49;
        }
        if (i3 == 49) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)", "CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;", "PRAGMA user_version = 50");
            i3 = 50;
        }
        if (i3 == 50) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "DELETE FROM sent_files_v2 WHERE 1", "ALTER TABLE sent_files_v2 ADD COLUMN parent TEXT", "DELETE FROM download_queue WHERE 1", "ALTER TABLE download_queue ADD COLUMN parent TEXT");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 51");
            i3 = 51;
        }
        if (i3 == 51) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE media_counts_v2 ADD COLUMN old INTEGER", "PRAGMA user_version = 52");
            i3 = 52;
        }
        if (i3 == 52) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));", "CREATE INDEX IF NOT EXISTS polls_id ON polls_v2(id);", "PRAGMA user_version = 53");
            i3 = 53;
        }
        if (i3 == 53) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "ALTER TABLE chat_settings_v2 ADD COLUMN online INTEGER default 0", "PRAGMA user_version = 54");
            i3 = 54;
        }
        if (i3 == 54) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "DROP TABLE IF EXISTS wallpapers;", "PRAGMA user_version = 55");
            i3 = 55;
        }
        if (i3 == 55) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)", "CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);", "PRAGMA user_version = 56");
            i3 = 56;
        }
        if (i3 == 56 || i3 == 57) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));", "CREATE TABLE IF NOT EXISTS emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER);", "PRAGMA user_version = 58");
            i3 = 58;
        }
        if (i3 == 58) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);", "ALTER TABLE emoji_keywords_info_v2 ADD COLUMN date INTEGER default 0", "PRAGMA user_version = 59");
            i3 = 59;
        }
        if (i3 == 59) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "ALTER TABLE dialogs ADD COLUMN folder_id INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN data BLOB default NULL", "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON dialogs(folder_id);", "PRAGMA user_version = 60");
            i3 = 60;
        }
        if (i3 == 60) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "DROP TABLE IF EXISTS channel_admins;", "DROP TABLE IF EXISTS blocked_users;", "PRAGMA user_version = 61");
            i3 = 61;
        }
        if (i3 == 61) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "DROP INDEX IF EXISTS send_state_idx_messages;", "CREATE INDEX IF NOT EXISTS send_state_idx_messages2 ON messages(mid, send_state, date);", "PRAGMA user_version = 62");
            i3 = 62;
        }
        if (i3 == 62) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS scheduled_messages(mid INTEGER PRIMARY KEY, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB)", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages ON scheduled_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages ON scheduled_messages(uid, date);", "PRAGMA user_version = 63");
            i3 = 63;
        }
        if (i3 == 63) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "DELETE FROM download_queue WHERE 1", "PRAGMA user_version = 64");
            i3 = 64;
        }
        if (i3 == 64) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT)", "CREATE TABLE IF NOT EXISTS dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))", "PRAGMA user_version = 65");
            i3 = 65;
        }
        if (i3 == 65) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON dialogs(flags);", "PRAGMA user_version = 66");
            i3 = 66;
        }
        if (i3 == 66) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))", "PRAGMA user_version = 67");
            i3 = 67;
        }
        if (i3 == 67) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);", "PRAGMA user_version = 68");
            i3 = 68;
        }
        if (i3 == 68) {
            executeNoException(sQLiteDatabase, "ALTER TABLE messages ADD COLUMN forwards INTEGER default 0");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 69");
            i3 = 69;
        }
        if (i3 == 69) {
            executeNoException(sQLiteDatabase, "ALTER TABLE messages ADD COLUMN replies_data BLOB default NULL");
            executeNoException(sQLiteDatabase, "ALTER TABLE messages ADD COLUMN thread_reply_id INTEGER default 0");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 70");
            i3 = 70;
        }
        if (i3 == 70) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));", "PRAGMA user_version = 71");
            i3 = 71;
        }
        if (i3 == 71) {
            executeNoException(sQLiteDatabase, "ALTER TABLE sharing_locations ADD COLUMN proximity INTEGER default 0");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 72");
            i3 = 72;
        }
        if (i3 == 72) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);", "PRAGMA user_version = 73");
            i3 = 73;
        }
        if (i3 == 73) {
            executeNoException(sQLiteDatabase, "ALTER TABLE chat_settings_v2 ADD COLUMN inviter INTEGER default 0");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 74");
            i3 = 74;
        }
        if (i3 == 74) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));", "CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);", "PRAGMA user_version = 75");
            i3 = 75;
        }
        if (i3 == 75) {
            executeNoException(sQLiteDatabase, "ALTER TABLE chat_settings_v2 ADD COLUMN links INTEGER default 0");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 76");
            i3 = 76;
        }
        if (i3 == 76) {
            executeNoException(sQLiteDatabase, "ALTER TABLE enc_tasks_v2 ADD COLUMN media INTEGER default -1");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 77");
            i3 = 77;
        }
        if (i3 == 77) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "DROP TABLE IF EXISTS channel_admins_v2;", "CREATE TABLE IF NOT EXISTS channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))", "PRAGMA user_version = 78");
            i3 = 78;
        }
        if (i3 == 78) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase, "DROP TABLE IF EXISTS bot_info;", "CREATE TABLE IF NOT EXISTS bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))", "PRAGMA user_version = 79");
            i3 = 79;
        }
        int i9 = 3;
        if (i3 == 79) {
            sQLiteDatabase.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v3(mid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, media))").stepThis().dispose();
            sQLiteDatabase.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v3 ON enc_tasks_v3(date);").stepThis().dispose();
            sQLiteDatabase.beginTransaction();
            SQLiteCursor sQLiteCursorQueryFinalized11 = sQLiteDatabase.queryFinalized("SELECT mid, date, media FROM enc_tasks_v2 WHERE 1", new Object[0]);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast3 = sQLiteDatabase.executeFast("REPLACE INTO enc_tasks_v3 VALUES(?, ?, ?)");
            if (sQLiteCursorQueryFinalized11.next()) {
                long jLongValue = sQLiteCursorQueryFinalized11.longValue(0);
                int iIntValue2 = sQLiteCursorQueryFinalized11.intValue(1);
                c = ' ';
                int iIntValue3 = sQLiteCursorQueryFinalized11.intValue(2);
                sQLitePreparedStatementExecuteFast3.requery();
                sQLitePreparedStatementExecuteFast3.bindLong(1, jLongValue);
                sQLitePreparedStatementExecuteFast3.bindInteger(2, iIntValue2);
                sQLitePreparedStatementExecuteFast3.bindInteger(3, iIntValue3);
                sQLitePreparedStatementExecuteFast3.step();
            } else {
                c = ' ';
            }
            sQLitePreparedStatementExecuteFast3.dispose();
            sQLiteCursorQueryFinalized11.dispose();
            sQLiteDatabase.commitTransaction();
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks_v2;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS enc_tasks_v2;").stepThis().dispose();
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase, "PRAGMA user_version = 80");
            i3 = 80;
        } else {
            c = ' ';
        }
        int i10 = 5;
        if (i3 == 80) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);");
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
                        int iIntValue4 = sQLiteCursorQueryFinalized8.intValue(i7);
                        long jLongValue2 = sQLiteCursorQueryFinalized8.longValue(1);
                        int iIntValue5 = sQLiteCursorQueryFinalized8.intValue(2);
                        int iIntValue6 = sQLiteCursorQueryFinalized8.intValue(3);
                        int iIntValue7 = sQLiteCursorQueryFinalized8.intValue(i10);
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
                        i7 = 0;
                        i10 = 5;
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
            i3 = 81;
        }
        if (i3 == 81) {
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
                            jLongValue3 = DialogObject.makeEncryptedDialogId((int) (jLongValue3 >> c));
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
            i3 = 82;
        }
        if (i3 == 82) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))", "CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);", "CREATE TABLE IF NOT EXISTS enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))", "CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);");
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
                        jLongValue5 = DialogObject.makeEncryptedDialogId((int) (jLongValue5 >> c));
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
                        jLongValue6 = DialogObject.makeEncryptedDialogId((int) (jLongValue6 >> c));
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
                        jLongValue9 = DialogObject.makeEncryptedDialogId((int) (jLongValue9 >> c));
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
                        jLongValue10 = DialogObject.makeEncryptedDialogId((int) (jLongValue10 >> c));
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
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "DROP INDEX IF EXISTS mid_idx_randoms;", "DROP TABLE IF EXISTS randoms;", "DROP INDEX IF EXISTS date_idx_enc_tasks_v3;", "DROP TABLE IF EXISTS enc_tasks_v3;");
            sQLiteDatabase.executeFast("DROP INDEX IF EXISTS polls_id;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS polls;").stepThis().dispose();
            sQLiteDatabase.executeFast("DROP TABLE IF EXISTS webpage_pending;").stepThis().dispose();
            sQLiteDatabase.commitTransaction();
            sQLiteDatabase.executeFast("PRAGMA user_version = 83").stepThis().dispose();
            i3 = 83;
        }
        if (i3 == 83) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);", "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);");
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
                        long jLongValue11 = sQLiteCursorQueryFinalized2.longValue(i6);
                        if (((int) jLongValue11) == 0) {
                            jLongValue11 = DialogObject.makeEncryptedDialogId((int) (jLongValue11 >> c));
                        }
                        int iIntValue17 = sQLiteCursorQueryFinalized2.intValue(i5);
                        int iIntValue18 = sQLiteCursorQueryFinalized2.intValue(i9);
                        int iIntValue19 = sQLiteCursorQueryFinalized2.intValue(i2);
                        int iIntValue20 = sQLiteCursorQueryFinalized2.intValue(i4);
                        int iIntValue21 = sQLiteCursorQueryFinalized2.intValue(7);
                        int iIntValue22 = sQLiteCursorQueryFinalized2.intValue(8);
                        NativeByteBuffer nativeByteBufferByteBufferValue7 = sQLiteCursorQueryFinalized2.byteBufferValue(9);
                        int iIntValue23 = sQLiteCursorQueryFinalized2.intValue(10);
                        int iIntValue24 = sQLiteCursorQueryFinalized2.intValue(11);
                        int iIntValue25 = sQLiteCursorQueryFinalized2.intValue(12);
                        NativeByteBuffer nativeByteBufferByteBufferValue8 = sQLiteCursorQueryFinalized2.byteBufferValue(13);
                        int iIntValue26 = sQLiteCursorQueryFinalized2.intValue(14);
                        SQLiteCursor sQLiteCursor = sQLiteCursorQueryFinalized2;
                        int i11 = (int) (jLongValue11 >> c);
                        if (iIntValue21 < 0) {
                            TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue6, nativeByteBufferByteBufferValue6.readInt32(false), false);
                            if (messageTLdeserialize != null) {
                                messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue6, messagesStorage.getUserConfig().clientUserId);
                                if (messageTLdeserialize.params == null) {
                                    HashMap<String, String> map = new HashMap<>();
                                    messageTLdeserialize.params = map;
                                    map.put("fwd_peer", "" + iIntValue21);
                                }
                                nativeByteBufferByteBufferValue6.reuse();
                                nativeByteBufferByteBufferValue6 = new NativeByteBuffer(messageTLdeserialize.getObjectSize());
                                messageTLdeserialize.serializeToStream(nativeByteBufferByteBufferValue6);
                            }
                            iIntValue21 = 0;
                        } else {
                            sQLiteCursor = sQLiteCursor;
                            iIntValue22 = iIntValue22;
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
                        sQLitePreparedStatementExecuteFast10.bindInteger(9, iIntValue22);
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
                        sQLitePreparedStatementExecuteFast10.bindInteger(16, i11 > 0 ? 1 : 0);
                        sQLitePreparedStatementExecuteFast10.step();
                        if (nativeByteBufferByteBufferValue7 != null) {
                            nativeByteBufferByteBufferValue7.reuse();
                        }
                        if (nativeByteBuffer != null) {
                            nativeByteBuffer.reuse();
                        }
                        nativeByteBufferByteBufferValue6.reuse();
                        sQLiteCursorQueryFinalized2 = sQLiteCursor;
                        i2 = 4;
                        i4 = 6;
                        i5 = 2;
                        i6 = 1;
                        i9 = 3;
                    }
                }
                sQLiteCursorQueryFinalized2.dispose();
                sQLitePreparedStatementExecuteFast10.dispose();
            }
            int i12 = 0;
            sQLiteDatabase2 = sQLiteDatabase;
            SQLiteCursor sQLiteCursorQueryFinalized12 = sQLiteDatabase2.queryFinalized("SELECT did, last_mid, last_mid_i FROM dialogs WHERE 1", new Object[0]);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast11 = sQLiteDatabase2.executeFast("UPDATE dialogs SET last_mid = ?, last_mid_i = ? WHERE did = ?");
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (sQLiteCursorQueryFinalized12.next()) {
                long jLongValue12 = sQLiteCursorQueryFinalized12.longValue(i12);
                int i13 = (int) jLongValue12;
                int i14 = (int) (jLongValue12 >> c);
                if (i13 == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(i14));
                } else if (i14 == 2) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(i13));
                }
                sQLitePreparedStatementExecuteFast11.requery();
                sQLitePreparedStatementExecuteFast11.bindInteger(1, sQLiteCursorQueryFinalized12.intValue(1));
                sQLitePreparedStatementExecuteFast11.bindInteger(2, sQLiteCursorQueryFinalized12.intValue(2));
                sQLitePreparedStatementExecuteFast11.bindLong(3, jLongValue12);
                sQLitePreparedStatementExecuteFast11.step();
                i12 = 0;
            }
            sQLitePreparedStatementExecuteFast11.dispose();
            sQLiteCursorQueryFinalized12.dispose();
            int i15 = 0;
            SQLiteCursor sQLiteCursorQueryFinalized13 = sQLiteDatabase2.queryFinalized("SELECT uid, mid FROM unread_push_messages WHERE 1", new Object[0]);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast12 = sQLiteDatabase2.executeFast("UPDATE unread_push_messages SET mid = ? WHERE uid = ? AND mid = ?");
            while (sQLiteCursorQueryFinalized13.next()) {
                long jLongValue13 = sQLiteCursorQueryFinalized13.longValue(i15);
                int iIntValue27 = sQLiteCursorQueryFinalized13.intValue(1);
                sQLitePreparedStatementExecuteFast12.requery();
                sQLitePreparedStatementExecuteFast12.bindInteger(1, iIntValue27);
                sQLitePreparedStatementExecuteFast12.bindLong(2, jLongValue13);
                sQLitePreparedStatementExecuteFast12.bindInteger(3, iIntValue27);
                sQLitePreparedStatementExecuteFast12.step();
                i15 = 0;
            }
            sQLitePreparedStatementExecuteFast12.dispose();
            sQLiteCursorQueryFinalized13.dispose();
            if (arrayList != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast13 = sQLiteDatabase2.executeFast("UPDATE dialogs SET did = ? WHERE did = ?");
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast14 = sQLiteDatabase2.executeFast("UPDATE dialog_filter_pin_v2 SET peer = ? WHERE peer = ?");
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast15 = sQLiteDatabase2.executeFast("UPDATE dialog_filter_ep SET peer = ? WHERE peer = ?");
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    long jIntValue3 = ((Integer) arrayList.get(i16)).intValue();
                    long jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(jIntValue3);
                    long j = jIntValue3 << c;
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
                for (int i17 = 0; i17 < size2; i17++) {
                    int iIntValue28 = ((Integer) arrayList2.get(i17)).intValue();
                    long jMakeFolderDialogId = DialogObject.makeFolderDialogId(iIntValue28);
                    sQLitePreparedStatementExecuteFast16.requery();
                    sQLitePreparedStatementExecuteFast16.bindLong(1, jMakeFolderDialogId);
                    sQLitePreparedStatementExecuteFast16.bindLong(2, ((long) iIntValue28) | 8589934592L);
                    sQLitePreparedStatementExecuteFast16.step();
                }
                sQLitePreparedStatementExecuteFast16.dispose();
            }
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_read_out_idx_messages;", "DROP INDEX IF EXISTS uid_date_mid_idx_messages;", "DROP INDEX IF EXISTS mid_out_idx_messages;", "DROP INDEX IF EXISTS task_idx_messages;");
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS send_state_idx_messages2;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mention_idx_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS messages;").stepThis().dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 84").stepThis().dispose();
            i3 = 84;
        } else {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        if (i3 == 84) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
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
                            jLongValue14 = DialogObject.makeEncryptedDialogId((int) (jLongValue14 >> c));
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
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS media_v3;").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 85").stepThis().dispose();
            i3 = 85;
        }
        if (i3 == 85) {
            executeNoException(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            executeNoException(sQLiteDatabase2, "ALTER TABLE scheduled_messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);");
            executeNoException(sQLiteDatabase2, "UPDATE messages_v2 SET replydata = NULL");
            executeNoException(sQLiteDatabase2, "UPDATE scheduled_messages_v2 SET replydata = NULL");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase2, "PRAGMA user_version = 86");
            i3 = 86;
        }
        if (i3 == 86) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS reactions(data BLOB, hash INTEGER, date INTEGER);", "PRAGMA user_version = 87");
            i3 = 87;
        }
        if (i3 == 87) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN unread_reactions INTEGER default 0", "CREATE TABLE reaction_mentions(message_id INTEGER PRIMARY KEY, state INTEGER);", "PRAGMA user_version = 88");
            i3 = 88;
        }
        if (i3 == 88 || i3 == 89) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "DROP TABLE IF EXISTS reaction_mentions;", "CREATE TABLE IF NOT EXISTS reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(dialog_id, message_id));", "CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);", "DROP INDEX IF EXISTS uid_mid_type_date_idx_media_v3");
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);", "PRAGMA user_version = 90");
            i3 = 90;
        }
        if (i3 == 90 || i3 == 91) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "DROP TABLE IF EXISTS downloading_documents;", "CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));", "PRAGMA user_version = 92");
            i3 = 92;
        }
        if (i3 == 92) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);", "PRAGMA user_version = 93");
            i3 = 95;
        }
        if (i3 == 95 || i3 == 93) {
            executeNoException(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN custom_params BLOB default NULL");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase2, "PRAGMA user_version = 96");
            i3 = 96;
        }
        if (i3 == 96) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS premium_promo(data BLOB, date INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("UPDATE stickers_v2 SET date = 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 97").stepThis().dispose();
            i3 = 97;
        }
        if (i3 == 97) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "DROP TABLE IF EXISTS stickers_featured;", "CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER);", "PRAGMA user_version = 98");
            i3 = 98;
        }
        if (i3 == 98) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 99");
            i3 = 99;
        }
        if (i3 == 99) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE stickers_featured ADD COLUMN emoji INTEGER default 0", "PRAGMA user_version = 100");
            i3 = 100;
        }
        if (i3 == 100) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE emoji_statuses(data BLOB, type INTEGER);", "PRAGMA user_version = 101");
            i3 = 101;
        }
        if (i3 == 101) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN group_id INTEGER default NULL", "ALTER TABLE dialogs ADD COLUMN last_mid_group INTEGER default NULL", "CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);", "PRAGMA user_version = 102");
            i3 = 102;
        }
        if (i3 == 102) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes_topics(uid, topic_id, end);", "CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, PRIMARY KEY(mid, topic_id, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, mid, read_state, out);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);", "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, mention, read_state);", "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS mid_uid_topic_id_messages_topics ON messages_topics(mid, topic_id, uid);", "CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);", "CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);", "CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, PRIMARY KEY(did, topic_id));", "CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);", "PRAGMA user_version = 103");
            i3 = 103;
        }
        if (i3 == 103) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))", "CREATE TABLE IF NOT EXISTS reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);", "PRAGMA user_version = 104");
            i3 = 104;
        }
        if (i3 == 104) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN read_outbox INTEGER default 0", "PRAGMA user_version = 105");
            i3 = 105;
        }
        if (i3 == 105) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN pinned INTEGER default 0", "PRAGMA user_version = 106");
            i3 = 106;
        }
        if (i3 == 106) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_read_out_idx_messages_topics", "DROP INDEX IF EXISTS uid_mention_idx_messages_topics", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);", "CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);", "CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);", "CREATE INDEX IF NOT EXISTS did_topics ON topics(did);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase2, "PRAGMA user_version = 107");
            i3 = 107;
        }
        if (i3 == 107) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN total_messages_count INTEGER default 0", "PRAGMA user_version = 108");
            i3 = 108;
        }
        if (i3 == 108) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN hidden INTEGER default 0", "PRAGMA user_version = 109");
            i3 = 109;
        }
        if (i3 == 109) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN ttl_period INTEGER default 0", "PRAGMA user_version = 110");
            i3 = 110;
        }
        if (i3 == 110) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE stickersets(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER);", "PRAGMA user_version = 111");
            i3 = 111;
        }
        if (i3 == 111) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)", "PRAGMA user_version = 112");
            i3 = 112;
        }
        if (i3 == 112) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE app_config(data BLOB)", "PRAGMA user_version = 113");
            i3 = 113;
        }
        if (i3 == 113) {
            messagesStorage.reset();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 114").stepThis().dispose();
            i3 = 114;
        }
        if (i3 == 114) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))", "CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);", "PRAGMA user_version = 115");
            i3 = 115;
        }
        if (i3 == 115) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);", "PRAGMA user_version = 117");
            i3 = 117;
        }
        if (i3 == 116 || i3 == 117 || i3 == 118) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "DROP TABLE IF EXISTS stories", "DROP TABLE IF EXISTS stories_counter", "CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, local_path TEXT, local_thumb_path TEXT, PRIMARY KEY (dialog_id, story_id));", "CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 119").stepThis().dispose();
            messagesStorage.getMessagesController().getStoriesController().cleanup();
            i3 = 119;
        }
        if (i3 == 119) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN reply_to_story_id INTEGER default 0", "ALTER TABLE messages_topics ADD COLUMN reply_to_story_id INTEGER default 0", "PRAGMA user_version = 120");
            i3 = 120;
        }
        if (i3 == 120) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, PRIMARY KEY(dialog_id, story_id));", "CREATE TABLE archived_stories (story_id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 121");
            i3 = 121;
        }
        if (i3 == 121) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB);", "PRAGMA user_version = 122");
            i3 = 122;
        }
        if (i3 == 122) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN participants_count INTEGER default 0", "PRAGMA user_version = 123");
            i3 = 123;
        }
        if (i3 == 123) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE story_pushes (uid INTEGER PRIMARY KEY, minId INTEGER, maxId INTEGER, date INTEGER, localName TEXT);", "PRAGMA user_version = 124");
            i3 = 124;
        }
        if (i3 == 124) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "DROP TABLE IF EXISTS story_pushes;", "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, PRIMARY KEY(uid, sid));", "PRAGMA user_version = 125");
            i3 = 125;
        }
        if (i3 == 125) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE story_pushes ADD COLUMN flags INTEGER default 0", "PRAGMA user_version = 126");
            i3 = 126;
        }
        if (i3 == 126) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE story_pushes ADD COLUMN expire_date INTEGER default 0", "PRAGMA user_version = 127");
            i3 = 127;
        }
        if (i3 == 127) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE stories ADD COLUMN custom_params BLOB default NULL", "PRAGMA user_version = 128");
            i3 = 128;
        }
        if (i3 == 128) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE story_drafts ADD COLUMN type INTEGER default 0", "PRAGMA user_version = 129");
            i3 = 129;
        }
        if (i3 == 129) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);", "PRAGMA user_version = 130");
            i3 = 130;
        }
        if (i3 == 130) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "DROP TABLE archived_stories", "ALTER TABLE profile_stories ADD COLUMN type INTEGER default 0", "PRAGMA user_version = 131");
            i3 = 131;
        }
        if (i3 == 131) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "ALTER TABLE stories DROP COLUMN local_path", "ALTER TABLE stories DROP COLUMN local_thumb_path", "PRAGMA user_version = 132");
            i3 = 132;
        }
        if (i3 == 132) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE unconfirmed_auth (data BLOB);", "PRAGMA user_version = 133");
            i3 = 133;
        }
        if (i3 == 133) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE unread_push_messages ADD COLUMN topicId INTEGER default 0", "PRAGMA user_version = 134");
            i3 = 134;
        }
        if (i3 == 134) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "DROP TABLE user_photos", "CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))", "CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)", "PRAGMA user_version = 135");
            i3 = 135;
        }
        if (i3 == 135) {
            if (ApplicationLoader.isAndroidTestEnvironment()) {
                DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase2, "DROP TABLE stickersets");
            }
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER);", "CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);", "PRAGMA user_version = 136");
            i3 = 136;
        }
        if (i3 == 136) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE TABLE saved_dialogs(did INTEGER PRIMARY KEY, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER)", "CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);", "PRAGMA user_version = 137");
            i3 = 137;
        }
        if (i3 == 137) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE unread_push_messages ADD COLUMN is_reaction INTEGER default 0", "PRAGMA user_version = 138");
            i3 = 138;
        }
        if (i3 == 138 || i3 == 139 || i3 == 140 || i3 == 141) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "DROP TABLE IF EXISTS tag_message_id;", "CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);", "CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);", "CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);", "CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);", "PRAGMA user_version = 142");
            i3 = 142;
        }
        if (i3 == 142) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "DROP TABLE IF EXISTS saved_reaction_tags;", "CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 143");
            i3 = 143;
        }
        if (i3 == 143) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE dialog_filter ADD COLUMN color INTEGER default -1", "PRAGMA user_version = 144");
            i3 = 144;
        }
        if (i3 == 144) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase2, "PRAGMA user_version = 145");
            i3 = 145;
        }
        if (i3 == 145) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER);", "PRAGMA user_version = 146");
            i3 = 146;
        }
        if (i3 == 146) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);", "PRAGMA user_version = 147");
            i3 = 147;
        }
        if (i3 == 147) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE business_replies ADD COLUMN count INTEGER default 0", "PRAGMA user_version = 148");
            i3 = 148;
        }
        if (i3 == 148) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN edit_date INTEGER default 0", "PRAGMA user_version = 149");
            i3 = 149;
        }
        if (i3 == 149) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "ALTER TABLE stickersets2 ADD COLUMN short_name TEXT;", "CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);", "PRAGMA user_version = 150");
            i3 = 150;
        }
        if (i3 == 150) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE business_links(data BLOB, order_value INTEGER);", "PRAGMA user_version = 151");
            i3 = 151;
        }
        if (i3 == 151) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE profile_stories ADD COLUMN seen INTEGER default 0;", "PRAGMA user_version = 152");
            i3 = 152;
        }
        if (i3 == 152) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE profile_stories ADD COLUMN pin INTEGER default 0;", "PRAGMA user_version = 153");
            i3 = 153;
        }
        if (i3 == 153) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE effects(data BLOB)", "PRAGMA user_version = 154");
            i3 = 154;
        }
        if (i3 == 154) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);", "PRAGMA user_version = 155");
            i3 = 155;
        }
        if (i3 == 155) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT);", "PRAGMA user_version = 156");
            i3 = 156;
        }
        if (i3 == 156 || i3 == 157) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER);", "PRAGMA user_version = 158");
            i3 = 158;
        }
        if (i3 == 158) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "DELETE FROM star_gifts2", "ALTER TABLE star_gifts2 ADD COLUMN pos INTEGER default 0;", "PRAGMA user_version = 159");
            i3 = 159;
        }
        if (i3 == 159) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE dialog_filter ADD COLUMN entities BLOB", "PRAGMA user_version = 160");
            i3 = 160;
        }
        if (i3 == 160) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE dialog_filter ADD COLUMN noanimate INTEGER", "PRAGMA user_version = 161");
            i3 = 161;
        }
        if (i3 == 161) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "DELETE FROM popular_bots", "ALTER TABLE popular_bots ADD COLUMN pos INTEGER", "PRAGMA user_version = 162");
            i3 = 162;
        }
        if (i3 == 162) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "DROP TABLE saved_dialogs", "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "PRAGMA user_version = 163");
            i3 = 163;
        }
        if (i3 == 163) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "DROP TABLE saved_dialogs", "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "PRAGMA user_version = 164");
            i3 = 164;
        }
        if (i3 == 164) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN nopaid_messages_exception INTEGER default 0;", "PRAGMA user_version = 165");
            i3 = 165;
        }
        if (i3 == 165) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));", "CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));", "PRAGMA user_version = 166");
            i3 = 166;
        }
        if (i3 == 166) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "DROP TABLE profile_stories", "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));", "PRAGMA user_version = 167");
            i3 = 167;
        }
        if (i3 == 167) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);", "PRAGMA user_version = 168");
            i3 = 168;
        }
        if (i3 == 168) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN unread_poll_votes INTEGER default 0", "PRAGMA user_version = 169");
            i3 = 169;
        }
        if (i3 == 169) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN unread_poll_votes INTEGER default 0", "PRAGMA user_version = 170");
            i3 = 170;
        }
        if (i3 == 170) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);", "CREATE TABLE IF NOT EXISTS poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline0.m(sQLiteDatabase2, "PRAGMA user_version = 171");
            i3 = 171;
        }
        if (i3 == 171) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "DROP TABLE story_pushes", "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));", "PRAGMA user_version = 172");
            i3 = 172;
        }
        if (i3 == 172) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_dialogs ON messages_holes(uid, end);", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_topics ON messages_holes_topics(uid, topic_id, end);", "CREATE INDEX IF NOT EXISTS date_idx_4_saved_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS date_idx_4_dialogs ON dialogs(date);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS last_mid_idx_4_saved_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_dialogs ON dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_saved_dialogs ON saved_dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_dialogs ON dialogs(folder_id);");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS flags_idx_4_saved_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS flags_idx_4_dialogs ON dialogs(flags);", "DROP INDEX IF EXISTS uid_end_messages_holes;", "DROP INDEX IF EXISTS date_idx_dialogs;");
            DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "DROP INDEX IF EXISTS last_mid_idx_dialogs;", "DROP INDEX IF EXISTS folder_id_idx_dialogs;", "DROP INDEX IF EXISTS flags_idx_dialogs;", "PRAGMA user_version = 173");
            i3 = 173;
        }
        if (i3 == 173) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE TABLE web_browser_settings(data BLOB)", "PRAGMA user_version = 174");
            i3 = 174;
        }
        if (i3 == 174) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_type_date_mid_idx_media_v4 ON media_v4(uid, type, date DESC, mid DESC);", "PRAGMA user_version = 175");
            i3 = 175;
        }
        if (i3 == 175) {
            DatabaseMigrationHelper$$ExternalSyntheticOutline2.m(sQLiteDatabase2, "CREATE TABLE ephemeral_messages (id INTEGER, dialog_id INTEGER, topic_id INTEGER, date INTEGER, data BLOB, PRIMARY KEY(dialog_id, id));", "CREATE INDEX IF NOT EXISTS ephemeral_messages_date_idx ON ephemeral_messages(date);", "PRAGMA user_version = 176");
            i3 = 176;
        }
        if (i3 != 176) {
            return i3;
        }
        DatabaseMigrationHelper$$ExternalSyntheticOutline3.m(sQLiteDatabase2, "CREATE TABLE welcome_messages(mid INTEGER, dialog_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, dialog_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_welcome_messages ON welcome_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS dialog_date_idx_welcome_messages ON welcome_messages(dialog_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_welcome_messages ON welcome_messages(mid, reply_to_message_id);");
        DatabaseMigrationHelper$$ExternalSyntheticOutline1.m(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS idx_to_reply_welcome_messages ON welcome_messages(reply_to_message_id, mid);", "PRAGMA user_version = 177");
        return 177;
    }

    public static boolean recoverDatabase(File file, File file2, File file3, int i) {
        boolean z;
        boolean z2;
        long jCurrentTimeMillis;
        boolean z3;
        long j;
        File file4 = new File(ApplicationLoader.getFilesDirFixed(), Fragment$$ExternalSyntheticOutline0.m(i, "recover_database_", "/"));
        file4.mkdirs();
        File file5 = new File(file4, "cache4.db");
        File file6 = new File(file4, "cache4.db-wal");
        File file7 = new File(file4, "cache4.db-shm");
        try {
            file5.delete();
            file6.delete();
            file7.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        FileLog.d("start recover database");
        int i2 = 1;
        int i3 = 0;
        try {
            jCurrentTimeMillis = System.currentTimeMillis();
            try {
                SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(file5.getPath());
                sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
                sQLiteDatabase.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
                sQLiteDatabase.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
                sQLiteDatabase.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
                MessagesStorage.createTables(sQLiteDatabase);
                sQLiteDatabase.executeFast("ATTACH DATABASE \"" + file.getAbsolutePath() + "\" AS old;").stepThis().dispose();
                int iIntValue = sQLiteDatabase.executeInt("PRAGMA old.user_version", new Object[0]).intValue();
                try {
                    if (iIntValue != 177) {
                        FileLog.e("can't restore database from version " + iIntValue);
                        return false;
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.add("messages_v2");
                    hashSet.add("messages_holes");
                    hashSet.add("scheduled_messages_v2");
                    hashSet.add("media_holes_v2");
                    hashSet.add("media_v4");
                    hashSet.add("messages_holes_topics");
                    hashSet.add("messages_topics");
                    hashSet.add("media_topics");
                    hashSet.add("media_holes_topics");
                    hashSet.add("topics");
                    hashSet.add("media_counts_v2");
                    hashSet.add("media_counts_topics");
                    hashSet.add("dialogs");
                    hashSet.add("dialog_filter");
                    hashSet.add("dialog_filter_ep");
                    hashSet.add("dialog_filter_pin_v2");
                    int i4 = 0;
                    while (true) {
                        String[] strArr = MessagesStorage.DATABASE_TABLES;
                        if (i4 >= strArr.length) {
                            break;
                        }
                        String str = strArr[i4];
                        if (!hashSet.contains(str)) {
                            Locale locale = Locale.US;
                            sQLiteDatabase.executeFast("INSERT OR IGNORE INTO " + str + " SELECT * FROM old." + str + ";").stepThis().dispose();
                        }
                        i4++;
                    }
                    SQLiteCursor sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM old.dialogs", new Object[0]);
                    while (sQLiteCursorQueryFinalized.next()) {
                        long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                        if (DialogObject.isEncryptedDialog(jLongValue)) {
                            arrayList.add(Long.valueOf(jLongValue));
                        } else {
                            arrayList2.add(Long.valueOf(jLongValue));
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        Long l = (Long) arrayList.get(i5);
                        l.getClass();
                        Locale locale2 = Locale.US;
                        sQLiteDatabase.executeFast("INSERT OR IGNORE INTO messages_v2 SELECT * FROM old.messages_v2 WHERE uid = " + l + ";").stepThis().dispose();
                        sQLiteDatabase.executeFast("INSERT OR IGNORE INTO messages_holes SELECT * FROM old.messages_holes WHERE uid = " + l + ";").stepThis().dispose();
                        sQLiteDatabase.executeFast("INSERT OR IGNORE INTO media_holes_v2 SELECT * FROM old.media_holes_v2 WHERE uid = " + l + ";").stepThis().dispose();
                        sQLiteDatabase.executeFast("INSERT OR IGNORE INTO media_v4 SELECT * FROM old.media_v4 WHERE uid = " + l + ";").stepThis().dispose();
                    }
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast = sQLiteDatabase.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = sQLiteDatabase.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                    int i6 = 0;
                    while (i6 < arrayList2.size()) {
                        Long l2 = (Long) arrayList2.get(i6);
                        SQLiteCursor sQLiteCursorQueryFinalized2 = sQLiteDatabase.queryFinalized("SELECT last_mid_i, last_mid FROM old.dialogs WHERE did = " + l2, new Object[i3]);
                        if (sQLiteCursorQueryFinalized2.next()) {
                            long jLongValue2 = sQLiteCursorQueryFinalized2.longValue(i3);
                            j = jCurrentTimeMillis;
                            z = false;
                            try {
                                long jLongValue3 = sQLiteCursorQueryFinalized2.longValue(i2);
                                StringBuilder sb = new StringBuilder();
                                sb.append("INSERT OR IGNORE INTO messages_v2 SELECT * FROM old.messages_v2 WHERE uid = ");
                                sb.append(l2);
                                z2 = true;
                                try {
                                    sb.append(" AND mid IN (");
                                    sb.append(jLongValue2);
                                    sb.append(",");
                                    sb.append(jLongValue3);
                                    sb.append(")");
                                    sQLiteDatabase.executeFast(sb.toString()).stepThis().dispose();
                                    MessagesStorage.createFirstHoles(l2.longValue(), sQLitePreparedStatementExecuteFast, sQLitePreparedStatementExecuteFast2, (int) jLongValue3, 0L);
                                } catch (Exception e2) {
                                    e = e2;
                                    jCurrentTimeMillis = j;
                                    FileLog.e(e);
                                    z3 = false;
                                    if (!z3) {
                                        return z;
                                    }
                                    try {
                                        file.delete();
                                        file2.delete();
                                        file3.delete();
                                        AndroidUtilities.copyFile(file5, file);
                                        AndroidUtilities.copyFile(file6, file2);
                                        AndroidUtilities.copyFile(file7, file3);
                                        file5.delete();
                                        file6.delete();
                                        file7.delete();
                                        FileLog.d("database recovered time " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                        return z2;
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                        return z;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                z2 = true;
                                jCurrentTimeMillis = j;
                                FileLog.e(e);
                                z3 = false;
                                if (!z3) {
                                    return z;
                                }
                                file.delete();
                                file2.delete();
                                file3.delete();
                                AndroidUtilities.copyFile(file5, file);
                                AndroidUtilities.copyFile(file6, file2);
                                AndroidUtilities.copyFile(file7, file3);
                                file5.delete();
                                file6.delete();
                                file7.delete();
                                FileLog.d("database recovered time " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                return z2;
                            }
                        } else {
                            j = jCurrentTimeMillis;
                        }
                        sQLiteCursorQueryFinalized2.dispose();
                        i6++;
                        jCurrentTimeMillis = j;
                        i2 = 1;
                        i3 = 0;
                    }
                    j = jCurrentTimeMillis;
                    z = false;
                    z2 = true;
                    sQLitePreparedStatementExecuteFast.dispose();
                    sQLitePreparedStatementExecuteFast2.dispose();
                    sQLiteDatabase.executeFast("DETACH DATABASE old;").stepThis().dispose();
                    sQLiteDatabase.close();
                    jCurrentTimeMillis = j;
                    z3 = true;
                    if (!z3) {
                        return z;
                    }
                    file.delete();
                    file2.delete();
                    file3.delete();
                    AndroidUtilities.copyFile(file5, file);
                    AndroidUtilities.copyFile(file6, file2);
                    AndroidUtilities.copyFile(file7, file3);
                    file5.delete();
                    file6.delete();
                    file7.delete();
                    FileLog.d("database recovered time " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    return z2;
                } catch (Exception e5) {
                    e = e5;
                    z = false;
                    z2 = true;
                }
            } catch (Exception e6) {
                e = e6;
            }
            z = false;
            z2 = true;
        } catch (Exception e7) {
            e = e7;
            z = false;
            z2 = true;
            jCurrentTimeMillis = 0;
        }
        FileLog.e(e);
        z3 = false;
        if (!z3) {
            return z;
        }
        file.delete();
        file2.delete();
        file3.delete();
        AndroidUtilities.copyFile(file5, file);
        AndroidUtilities.copyFile(file6, file2);
        AndroidUtilities.copyFile(file7, file3);
        file5.delete();
        file6.delete();
        file7.delete();
        FileLog.d("database recovered time " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return z2;
    }

    public static int migrate(MessagesStorage messagesStorage, int i) {
        return migrate(messagesStorage, messagesStorage.getDatabase(), i);
    }
}
