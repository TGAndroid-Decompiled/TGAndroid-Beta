package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public abstract class b93 {
    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.executeFast(str).stepThis().dispose();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        cc4.b("db migration: " + (System.currentTimeMillis() - currentTimeMillis) + "ms " + str);
    }

    public static boolean c(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(qd4.y("PRAGMA table_info(", str, ")"), new Object[0]);
        do {
            try {
                if (!queryFinalized.next()) {
                    return false;
                }
            } finally {
                queryFinalized.dispose();
            }
        } while (!str2.equals(queryFinalized.stringValue(1)));
        return true;
    }

    public static int d(kf7 kf7Var, SQLiteDatabase sQLiteDatabase, int i) {
        char c;
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
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        to3 to3Var = kf7Var.a;
        int i4 = 2;
        int i5 = 4;
        int i6 = i;
        if (i6 < 4) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS user_photos(uid INTEGER, id INTEGER, data BLOB, PRIMARY KEY (uid, id))", "DROP INDEX IF EXISTS read_state_out_idx_messages;", "DROP INDEX IF EXISTS ttl_idx_messages;", "DROP INDEX IF EXISTS date_idx_messages;");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages ON messages(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages ON messages(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages ON messages(uid, date, mid);", "CREATE TABLE IF NOT EXISTS user_contacts_v6(uid INTEGER PRIMARY KEY, fname TEXT, sname TEXT)");
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS user_phones_v6(uid INTEGER, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (uid, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v6(sphone, deleted);", "CREATE INDEX IF NOT EXISTS mid_idx_randoms ON randoms(mid);", "CREATE TABLE IF NOT EXISTS sent_files_v2(uid TEXT, type INTEGER, data BLOB, PRIMARY KEY (uid, type))");
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, PRIMARY KEY (uid, type));", "CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);", "CREATE TABLE IF NOT EXISTS dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);", "CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);");
            sQLiteDatabase2.executeFast("UPDATE messages SET send_state = 2 WHERE mid < 0 AND send_state = 1").stepThis().dispose();
            to3Var.c(new hd7(kf7Var, (byte) 2));
            sQLiteDatabase2.executeFast("PRAGMA user_version = 4").stepThis().dispose();
            i6 = 4;
        }
        int i7 = 1;
        int i8 = 0;
        if (i6 == 4) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v2(mid INTEGER PRIMARY KEY, date INTEGER)").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v2 ON enc_tasks_v2(date);").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT date, data FROM enc_tasks WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast = sQLiteDatabase2.executeFast("REPLACE INTO enc_tasks_v2 VALUES(?, ?)");
            if (queryFinalized.next()) {
                int intValue = queryFinalized.intValue(0);
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    int limit = byteBufferValue.limit();
                    for (int i9 = 0; i9 < limit / 4; i9++) {
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
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS enc_tasks;").stepThis().dispose();
            bs2.z(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN media INTEGER default 0", "PRAGMA user_version = 6");
            i6 = 6;
        }
        if (i6 == 6) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);", "CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);", "ALTER TABLE enc_chats ADD COLUMN layer INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN seq_in INTEGER default 0");
            bs2.z(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN seq_out INTEGER default 0", "PRAGMA user_version = 7");
            i6 = 7;
        }
        if (i6 == 7 || i6 == 8 || i6 == 9) {
            bs2.B(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN use_count INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN exchange_id INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN key_date INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN fprint INTEGER default 0");
            bs2.A(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN fauthkey BLOB default NULL", "ALTER TABLE enc_chats ADD COLUMN khash BLOB default NULL", "PRAGMA user_version = 10");
            i6 = 10;
        }
        if (i6 == 10) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, PRIMARY KEY (id, type));", "PRAGMA user_version = 11");
            i6 = 11;
        }
        if (i6 == 11 || i6 == 12) {
            bs2.B(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_idx_media;", "DROP INDEX IF EXISTS mid_idx_media;", "DROP INDEX IF EXISTS uid_date_mid_idx_media;", "DROP TABLE IF EXISTS media;");
            bs2.B(sQLiteDatabase2, "DROP TABLE IF EXISTS media_counts;", "CREATE TABLE IF NOT EXISTS media_v2(mid INTEGER PRIMARY KEY, uid INTEGER, date INTEGER, type INTEGER, data BLOB)", "CREATE TABLE IF NOT EXISTS media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, PRIMARY KEY(uid, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media ON media_v2(uid, mid, type, date);");
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS keyvalue(id TEXT PRIMARY KEY, value TEXT)", "PRAGMA user_version = 13");
            i6 = 13;
        }
        if (i6 == 13) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN replydata BLOB default NULL", "PRAGMA user_version = 14");
            i6 = 14;
        }
        if (i6 == 14) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);", "PRAGMA user_version = 15");
            i6 = 15;
        }
        if (i6 == 15) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS webpage_pending(id INTEGER, mid INTEGER, PRIMARY KEY (id, mid));", "PRAGMA user_version = 16");
            i6 = 16;
        }
        if (i6 == 16) {
            bs2.A(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN inbox_max INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN outbox_max INTEGER default 0", "PRAGMA user_version = 17");
            i6 = 17;
        }
        if (i6 == 17) {
            bs2.y(sQLiteDatabase2, "PRAGMA user_version = 18");
            i6 = 18;
        }
        if (i6 == 18) {
            bs2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS stickers;", "CREATE TABLE IF NOT EXISTS stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);", "PRAGMA user_version = 19");
            i6 = 19;
        }
        if (i6 == 19) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid ON bot_keyboard(mid);", "PRAGMA user_version = 20");
            i6 = 20;
        }
        if (i6 == 20) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);", "PRAGMA user_version = 21");
            i6 = 21;
        }
        if (i6 == 21) {
            bs2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB)");
            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, participants FROM chat_settings WHERE uid < 0", new Object[0]);
            SQLitePreparedStatement executeFast2 = sQLiteDatabase2.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?)");
            while (queryFinalized2.next()) {
                long intValue2 = queryFinalized2.intValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(1);
                if (byteBufferValue2 != null) {
                    TLRPC.ChatParticipants TLdeserialize = TLRPC.ChatParticipants.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                    byteBufferValue2.reuse();
                    if (TLdeserialize != null) {
                        TLRPC.TL_chatFull tL_chatFull = new TLRPC.TL_chatFull();
                        tL_chatFull.id = intValue2;
                        tL_chatFull.chat_photo = new TLRPC.TL_photoEmpty();
                        tL_chatFull.notify_settings = new TLRPC.TL_peerNotifySettingsEmpty_layer77();
                        tL_chatFull.exported_invite = null;
                        tL_chatFull.participants = TLdeserialize;
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_chatFull.getObjectSize());
                        tL_chatFull.serializeToStream(nativeByteBuffer2);
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
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS chat_settings;").stepThis().dispose();
            sQLiteDatabase2.executeFast("ALTER TABLE dialogs ADD COLUMN last_mid_i INTEGER default 0").stepThis().dispose();
            bs2.B(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN unread_count_i INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN pts INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN date_i INTEGER default 0", "CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);", "ALTER TABLE messages ADD COLUMN imp INTEGER default 0", "CREATE TABLE IF NOT EXISTS messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes(uid, end);");
            bs2.y(sQLiteDatabase2, "PRAGMA user_version = 22");
            i6 = 22;
        }
        if (i6 == 22) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);", "PRAGMA user_version = 23");
            i6 = 23;
        }
        if (i6 == 23 || i6 == 24) {
            bs2.z(sQLiteDatabase2, "DELETE FROM media_holes_v2 WHERE uid != 0 AND type >= 0 AND start IN (0, 1)", "PRAGMA user_version = 25");
            i6 = 25;
        }
        if (i6 == 25 || i6 == 26) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))", "PRAGMA user_version = 27");
            i6 = 27;
        }
        if (i6 == 27) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE web_recent_v3 ADD COLUMN document BLOB default NULL", "PRAGMA user_version = 28");
            i6 = 28;
        }
        if (i6 == 28 || i6 == 29) {
            bs2.A(sQLiteDatabase2, "DELETE FROM sent_files_v2 WHERE 1", "DELETE FROM download_queue WHERE 1", "PRAGMA user_version = 30");
            i6 = 30;
        }
        if (i6 == 30) {
            bs2.B(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN pinned INTEGER default 0", "CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;", "CREATE TABLE IF NOT EXISTS users_data(uid INTEGER PRIMARY KEY, about TEXT)", "PRAGMA user_version = 31");
            i6 = 31;
        }
        char c2 = ' ';
        if (i6 == 31) {
            bs2.B(sQLiteDatabase2, "DROP TABLE IF EXISTS bot_recent;", "CREATE TABLE IF NOT EXISTS chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))", "CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);", "PRAGMA user_version = 32");
            i6 = 32;
        }
        if (i6 == 32) {
            bs2.A(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_idx_imp_messages;", "DROP INDEX IF EXISTS uid_date_mid_imp_idx_messages;", "PRAGMA user_version = 33");
            i6 = 33;
        }
        if (i6 == 33) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS pending_tasks(id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 34");
            i6 = 34;
        }
        if (i6 == 34) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER);", "PRAGMA user_version = 35");
            i6 = 35;
        }
        if (i6 == 35) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));", "PRAGMA user_version = 36");
            i6 = 36;
        }
        if (i6 == 36) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN in_seq_no INTEGER default 0", "PRAGMA user_version = 37");
            i6 = 37;
        }
        if (i6 == 37) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)", "CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);", "PRAGMA user_version = 38");
            i6 = 38;
        }
        if (i6 == 38) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN pinned INTEGER default 0", "PRAGMA user_version = 39");
            i6 = 39;
        }
        if (i6 == 39) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN admin_id INTEGER default 0", "PRAGMA user_version = 40");
            i6 = 40;
        }
        if (i6 == 40) {
            to3Var.c(new hd7(kf7Var, (byte) 2));
            sQLiteDatabase2.executeFast("PRAGMA user_version = 41").stepThis().dispose();
            i6 = 41;
        }
        if (i6 == 41) {
            bs2.B(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN mention INTEGER default 0", "ALTER TABLE user_contacts_v6 ADD COLUMN imported INTEGER default 0", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages ON messages(uid, mention, read_state);", "PRAGMA user_version = 42");
            i6 = 42;
        }
        if (i6 == 42) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB);", "PRAGMA user_version = 43");
            i6 = 43;
        }
        if (i6 == 43) {
            bs2.y(sQLiteDatabase2, "PRAGMA user_version = 44");
            i6 = 44;
        }
        if (i6 == 44) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)", "CREATE TABLE IF NOT EXISTS user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);", "PRAGMA user_version = 45");
            i6 = 45;
        }
        if (i6 == 45) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN mtproto_seq INTEGER default 0", "PRAGMA user_version = 46");
            i6 = 46;
        }
        if (i6 == 46) {
            bs2.z(sQLiteDatabase2, "DELETE FROM botcache WHERE 1", "PRAGMA user_version = 47");
            i6 = 47;
        }
        if (i6 == 47) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN flags INTEGER default 0", "PRAGMA user_version = 48");
            i6 = 48;
        }
        if (i6 == 48) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, PRIMARY KEY(uid, mid))", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);", "PRAGMA user_version = 49");
            i6 = 49;
        }
        if (i6 == 49) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)", "CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;", "PRAGMA user_version = 50");
            i6 = 50;
        }
        if (i6 == 50) {
            bs2.B(sQLiteDatabase2, "DELETE FROM sent_files_v2 WHERE 1", "ALTER TABLE sent_files_v2 ADD COLUMN parent TEXT", "DELETE FROM download_queue WHERE 1", "ALTER TABLE download_queue ADD COLUMN parent TEXT");
            bs2.y(sQLiteDatabase2, "PRAGMA user_version = 51");
            i6 = 51;
        }
        if (i6 == 51) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE media_counts_v2 ADD COLUMN old INTEGER", "PRAGMA user_version = 52");
            i6 = 52;
        }
        if (i6 == 52) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));", "CREATE INDEX IF NOT EXISTS polls_id ON polls_v2(id);", "PRAGMA user_version = 53");
            i6 = 53;
        }
        if (i6 == 53) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN online INTEGER default 0", "PRAGMA user_version = 54");
            i6 = 54;
        }
        if (i6 == 54) {
            bs2.z(sQLiteDatabase2, "DROP TABLE IF EXISTS wallpapers;", "PRAGMA user_version = 55");
            i6 = 55;
        }
        if (i6 == 55) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)", "CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);", "PRAGMA user_version = 56");
            i6 = 56;
        }
        if (i6 == 56 || i6 == 57) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));", "CREATE TABLE IF NOT EXISTS emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER);", "PRAGMA user_version = 58");
            i6 = 58;
        }
        if (i6 == 58) {
            bs2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);", "ALTER TABLE emoji_keywords_info_v2 ADD COLUMN date INTEGER default 0", "PRAGMA user_version = 59");
            i6 = 59;
        }
        if (i6 == 59) {
            bs2.B(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN folder_id INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN data BLOB default NULL", "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON dialogs(folder_id);", "PRAGMA user_version = 60");
            i6 = 60;
        }
        if (i6 == 60) {
            bs2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS channel_admins;", "DROP TABLE IF EXISTS blocked_users;", "PRAGMA user_version = 61");
            i6 = 61;
        }
        if (i6 == 61) {
            bs2.A(sQLiteDatabase2, "DROP INDEX IF EXISTS send_state_idx_messages;", "CREATE INDEX IF NOT EXISTS send_state_idx_messages2 ON messages(mid, send_state, date);", "PRAGMA user_version = 62");
            i6 = 62;
        }
        if (i6 == 62) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS scheduled_messages(mid INTEGER PRIMARY KEY, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB)", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages ON scheduled_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages ON scheduled_messages(uid, date);", "PRAGMA user_version = 63");
            i6 = 63;
        }
        if (i6 == 63) {
            bs2.z(sQLiteDatabase2, "DELETE FROM download_queue WHERE 1", "PRAGMA user_version = 64");
            i6 = 64;
        }
        if (i6 == 64) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT)", "CREATE TABLE IF NOT EXISTS dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))", "PRAGMA user_version = 65");
            i6 = 65;
        }
        if (i6 == 65) {
            bs2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON dialogs(flags);", "PRAGMA user_version = 66");
            i6 = 66;
        }
        if (i6 == 66) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))", "PRAGMA user_version = 67");
            i6 = 67;
        }
        if (i6 == 67) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);", "PRAGMA user_version = 68");
            i6 = 68;
        }
        if (i6 == 68) {
            a(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN forwards INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 69").stepThis().dispose();
            i6 = 69;
        }
        if (i6 == 69) {
            a(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN replies_data BLOB default NULL");
            a(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN thread_reply_id INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 70").stepThis().dispose();
            i6 = 70;
        }
        if (i6 == 70) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));", "PRAGMA user_version = 71");
            i6 = 71;
        }
        if (i6 == 71) {
            a(sQLiteDatabase2, "ALTER TABLE sharing_locations ADD COLUMN proximity INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 72").stepThis().dispose();
            i6 = 72;
        }
        if (i6 == 72) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);", "PRAGMA user_version = 73");
            i6 = 73;
        }
        if (i6 == 73) {
            a(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN inviter INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 74").stepThis().dispose();
            i6 = 74;
        }
        if (i6 == 74) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));", "CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);", "PRAGMA user_version = 75");
            i6 = 75;
        }
        if (i6 == 75) {
            a(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN links INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 76").stepThis().dispose();
            i6 = 76;
        }
        if (i6 == 76) {
            a(sQLiteDatabase2, "ALTER TABLE enc_tasks_v2 ADD COLUMN media INTEGER default -1");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 77").stepThis().dispose();
            i6 = 77;
        }
        if (i6 == 77) {
            bs2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS channel_admins_v2;", "CREATE TABLE IF NOT EXISTS channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))", "PRAGMA user_version = 78");
            i6 = 78;
        }
        if (i6 == 78) {
            bs2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS bot_info;", "CREATE TABLE IF NOT EXISTS bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))", "PRAGMA user_version = 79");
            i6 = 79;
        }
        int i10 = 3;
        if (i6 == 79) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v3(mid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, media))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v3 ON enc_tasks_v3(date);").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            SQLiteCursor queryFinalized3 = sQLiteDatabase2.queryFinalized("SELECT mid, date, media FROM enc_tasks_v2 WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast3 = sQLiteDatabase2.executeFast("REPLACE INTO enc_tasks_v3 VALUES(?, ?, ?)");
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
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks_v2;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS enc_tasks_v2;").stepThis().dispose();
            bs2.y(sQLiteDatabase2, "PRAGMA user_version = 80");
            i6 = 80;
        }
        int i11 = 5;
        if (i6 == 80) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);");
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS bot_keyboard_idx_mid;").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor8 = sQLiteDatabase2.queryFinalized("SELECT mid, uid, send_state, date, data, ttl, replydata FROM scheduled_messages_v2 WHERE 1", new Object[0]);
            } catch (Exception e) {
                cc4.f(e);
                sQLiteCursor8 = null;
            }
            if (sQLiteCursor8 != null) {
                SQLitePreparedStatement executeFast4 = sQLiteDatabase2.executeFast("REPLACE INTO scheduled_messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                while (sQLiteCursor8.next()) {
                    NativeByteBuffer byteBufferValue3 = sQLiteCursor8.byteBufferValue(i5);
                    if (byteBufferValue3 != null) {
                        int intValue5 = sQLiteCursor8.intValue(i8);
                        long longValue2 = sQLiteCursor8.longValue(1);
                        char c3 = c2;
                        int intValue6 = sQLiteCursor8.intValue(2);
                        int intValue7 = sQLiteCursor8.intValue(i10);
                        int intValue8 = sQLiteCursor8.intValue(i11);
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
                        c2 = c3;
                        i5 = 4;
                        i8 = 0;
                        i10 = 3;
                        i11 = 5;
                    }
                }
                c = c2;
                sQLiteCursor8.dispose();
                executeFast4.dispose();
            } else {
                c = ' ';
            }
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS send_state_idx_scheduled_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_date_idx_scheduled_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS scheduled_messages;").stepThis().dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 81").stepThis().dispose();
            i6 = 81;
        } else {
            c = ' ';
        }
        if (i6 == 81) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS media_v3(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v3 ON media_v3(uid, mid, type, date);").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor7 = sQLiteDatabase2.queryFinalized("SELECT mid, uid, date, type, data FROM media_v2 WHERE 1", new Object[0]);
            } catch (Exception e2) {
                cc4.f(e2);
                sQLiteCursor7 = null;
            }
            if (sQLiteCursor7 != null) {
                SQLitePreparedStatement executeFast5 = sQLiteDatabase2.executeFast("REPLACE INTO media_v3 VALUES(?, ?, ?, ?, ?)");
                while (sQLiteCursor7.next()) {
                    NativeByteBuffer byteBufferValue5 = sQLiteCursor7.byteBufferValue(4);
                    if (byteBufferValue5 != null) {
                        int intValue9 = sQLiteCursor7.intValue(0);
                        long longValue3 = sQLiteCursor7.longValue(1);
                        if (((int) longValue3) == 0) {
                            longValue3 = wf3.E((int) (longValue3 >> c));
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
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mid_type_date_idx_media;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS media_v2;").stepThis().dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 82").stepThis().dispose();
            i6 = 82;
        }
        if (i6 == 82) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))", "CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);", "CREATE TABLE IF NOT EXISTS enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))", "CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);");
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor3 = sQLiteDatabase2.queryFinalized("SELECT r.random_id, r.mid, m.uid FROM randoms as r INNER JOIN messages as m ON r.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e3) {
                cc4.f(e3);
                sQLiteCursor3 = null;
            }
            if (sQLiteCursor3 != null) {
                SQLitePreparedStatement executeFast6 = sQLiteDatabase2.executeFast("REPLACE INTO randoms_v2 VALUES(?, ?, ?)");
                while (sQLiteCursor3.next()) {
                    long longValue4 = sQLiteCursor3.longValue(0);
                    int intValue12 = sQLiteCursor3.intValue(1);
                    long longValue5 = sQLiteCursor3.longValue(2);
                    if (((int) longValue5) == 0) {
                        longValue5 = wf3.E((int) (longValue5 >> c));
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
                sQLiteCursor4 = sQLiteDatabase2.queryFinalized("SELECT p.mid, m.uid, p.id FROM polls as p INNER JOIN messages as m ON p.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e4) {
                cc4.f(e4);
                sQLiteCursor4 = null;
            }
            if (sQLiteCursor4 != null) {
                SQLitePreparedStatement executeFast7 = sQLiteDatabase2.executeFast("REPLACE INTO polls_v2 VALUES(?, ?, ?)");
                while (sQLiteCursor4.next()) {
                    int intValue13 = sQLiteCursor4.intValue(0);
                    long longValue6 = sQLiteCursor4.longValue(1);
                    long longValue7 = sQLiteCursor4.longValue(2);
                    if (((int) longValue6) == 0) {
                        longValue6 = wf3.E((int) (longValue6 >> c));
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
                sQLiteCursor5 = sQLiteDatabase2.queryFinalized("SELECT wp.id, wp.mid, m.uid FROM webpage_pending as wp INNER JOIN messages as m ON wp.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e5) {
                cc4.f(e5);
                sQLiteCursor5 = null;
            }
            if (sQLiteCursor5 != null) {
                SQLitePreparedStatement executeFast8 = sQLiteDatabase2.executeFast("REPLACE INTO webpage_pending_v2 VALUES(?, ?, ?)");
                while (sQLiteCursor5.next()) {
                    long longValue8 = sQLiteCursor5.longValue(0);
                    int intValue14 = sQLiteCursor5.intValue(1);
                    long longValue9 = sQLiteCursor5.longValue(2);
                    if (((int) longValue9) == 0) {
                        longValue9 = wf3.E((int) (longValue9 >> c));
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
                sQLiteCursor6 = sQLiteDatabase2.queryFinalized("SELECT et.mid, m.uid, et.date, et.media FROM enc_tasks_v3 as et INNER JOIN messages as m ON et.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e6) {
                cc4.f(e6);
                sQLiteCursor6 = null;
            }
            if (sQLiteCursor6 != null) {
                SQLitePreparedStatement executeFast9 = sQLiteDatabase2.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                while (sQLiteCursor6.next()) {
                    int intValue15 = sQLiteCursor6.intValue(0);
                    long longValue10 = sQLiteCursor6.longValue(1);
                    int intValue16 = sQLiteCursor6.intValue(2);
                    int intValue17 = sQLiteCursor6.intValue(3);
                    if (((int) longValue10) == 0) {
                        longValue10 = wf3.E((int) (longValue10 >> c));
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
            bs2.B(sQLiteDatabase2, "DROP INDEX IF EXISTS mid_idx_randoms;", "DROP TABLE IF EXISTS randoms;", "DROP INDEX IF EXISTS date_idx_enc_tasks_v3;", "DROP TABLE IF EXISTS enc_tasks_v3;");
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS polls_id;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS polls;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS webpage_pending;").stepThis().dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 83").stepThis().dispose();
            i6 = 83;
        }
        if (i6 == 83) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);", "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);");
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT mid, uid, read_state, send_state, date, data, out, ttl, media, replydata, imp, mention, forwards, replies_data, thread_reply_id FROM messages WHERE 1", new Object[0]);
            } catch (Exception e7) {
                cc4.f(e7);
                sQLiteCursor2 = null;
            }
            if (sQLiteCursor2 != null) {
                SQLitePreparedStatement executeFast10 = sQLiteDatabase2.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                while (sQLiteCursor2.next()) {
                    NativeByteBuffer byteBufferValue6 = sQLiteCursor2.byteBufferValue(5);
                    if (byteBufferValue6 != null) {
                        long intValue18 = sQLiteCursor2.intValue(0);
                        long longValue11 = sQLiteCursor2.longValue(i7);
                        if (((int) longValue11) == 0) {
                            longValue11 = wf3.E((int) (longValue11 >> c));
                        }
                        int intValue19 = sQLiteCursor2.intValue(i4);
                        int intValue20 = sQLiteCursor2.intValue(3);
                        int intValue21 = sQLiteCursor2.intValue(4);
                        int intValue22 = sQLiteCursor2.intValue(6);
                        int intValue23 = sQLiteCursor2.intValue(7);
                        int intValue24 = sQLiteCursor2.intValue(8);
                        NativeByteBuffer byteBufferValue7 = sQLiteCursor2.byteBufferValue(9);
                        int intValue25 = sQLiteCursor2.intValue(10);
                        int intValue26 = sQLiteCursor2.intValue(11);
                        int intValue27 = sQLiteCursor2.intValue(12);
                        NativeByteBuffer byteBufferValue8 = sQLiteCursor2.byteBufferValue(13);
                        int intValue28 = sQLiteCursor2.intValue(14);
                        SQLiteCursor sQLiteCursor9 = sQLiteCursor2;
                        int i12 = (int) (longValue11 >> c);
                        if (intValue23 < 0) {
                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue6, byteBufferValue6.readInt32(false), false);
                            if (TLdeserialize2 != null) {
                                i2 = intValue28;
                                TLdeserialize2.readAttachPath(byteBufferValue6, kf7Var.getUserConfig().n);
                                if (TLdeserialize2.params == null) {
                                    HashMap<String, String> hashMap = new HashMap<>();
                                    TLdeserialize2.params = hashMap;
                                    nativeByteBuffer = byteBufferValue6;
                                    hashMap.put("fwd_peer", String.valueOf(intValue23));
                                } else {
                                    nativeByteBuffer = byteBufferValue6;
                                }
                                nativeByteBuffer.reuse();
                                byteBufferValue6 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                TLdeserialize2.serializeToStream(byteBufferValue6);
                            } else {
                                i2 = intValue28;
                            }
                            i3 = 0;
                        } else {
                            i2 = intValue28;
                            i3 = intValue23;
                        }
                        executeFast10.requery();
                        executeFast10.bindInteger(1, (int) intValue18);
                        executeFast10.bindLong(2, longValue11);
                        executeFast10.bindInteger(3, intValue19);
                        executeFast10.bindInteger(4, intValue20);
                        executeFast10.bindInteger(5, intValue21);
                        executeFast10.bindByteBuffer(6, byteBufferValue6);
                        executeFast10.bindInteger(7, intValue22);
                        executeFast10.bindInteger(8, i3);
                        executeFast10.bindInteger(9, intValue24);
                        if (byteBufferValue7 != null) {
                            executeFast10.bindByteBuffer(10, byteBufferValue7);
                        } else {
                            executeFast10.bindNull(10);
                        }
                        executeFast10.bindInteger(11, intValue25);
                        executeFast10.bindInteger(12, intValue26);
                        executeFast10.bindInteger(13, intValue27);
                        if (byteBufferValue8 != null) {
                            executeFast10.bindByteBuffer(14, byteBufferValue8);
                        } else {
                            executeFast10.bindNull(14);
                        }
                        executeFast10.bindInteger(15, i2);
                        executeFast10.bindInteger(16, i12 > 0 ? 1 : 0);
                        executeFast10.step();
                        if (byteBufferValue7 != null) {
                            byteBufferValue7.reuse();
                        }
                        if (byteBufferValue8 != null) {
                            byteBufferValue8.reuse();
                        }
                        byteBufferValue6.reuse();
                        sQLiteCursor2 = sQLiteCursor9;
                        i4 = 2;
                        i7 = 1;
                    }
                }
                sQLiteCursor2.dispose();
                executeFast10.dispose();
            }
            int i13 = 0;
            sQLiteDatabase2 = sQLiteDatabase;
            SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT did, last_mid, last_mid_i FROM dialogs WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast11 = sQLiteDatabase2.executeFast("UPDATE dialogs SET last_mid = ?, last_mid_i = ? WHERE did = ?");
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (queryFinalized4.next()) {
                long longValue12 = queryFinalized4.longValue(i13);
                int i14 = (int) longValue12;
                int i15 = (int) (longValue12 >> c);
                if (i14 == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(i15));
                } else if (i15 == 2) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(i14));
                }
                executeFast11.requery();
                executeFast11.bindInteger(1, queryFinalized4.intValue(1));
                executeFast11.bindInteger(2, queryFinalized4.intValue(2));
                executeFast11.bindLong(3, longValue12);
                executeFast11.step();
                i13 = 0;
            }
            executeFast11.dispose();
            queryFinalized4.dispose();
            int i16 = 0;
            SQLiteCursor queryFinalized5 = sQLiteDatabase2.queryFinalized("SELECT uid, mid FROM unread_push_messages WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast12 = sQLiteDatabase2.executeFast("UPDATE unread_push_messages SET mid = ? WHERE uid = ? AND mid = ?");
            while (queryFinalized5.next()) {
                long longValue13 = queryFinalized5.longValue(i16);
                int intValue29 = queryFinalized5.intValue(1);
                executeFast12.requery();
                executeFast12.bindInteger(1, intValue29);
                executeFast12.bindLong(2, longValue13);
                executeFast12.bindInteger(3, intValue29);
                executeFast12.step();
                i16 = 0;
            }
            executeFast12.dispose();
            queryFinalized5.dispose();
            if (arrayList != null) {
                SQLitePreparedStatement executeFast13 = sQLiteDatabase2.executeFast("UPDATE dialogs SET did = ? WHERE did = ?");
                SQLitePreparedStatement executeFast14 = sQLiteDatabase2.executeFast("UPDATE dialog_filter_pin_v2 SET peer = ? WHERE peer = ?");
                SQLitePreparedStatement executeFast15 = sQLiteDatabase2.executeFast("UPDATE dialog_filter_ep SET peer = ? WHERE peer = ?");
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    long intValue30 = ((Integer) arrayList.get(i17)).intValue();
                    long E = wf3.E(intValue30);
                    long j = intValue30 << c;
                    executeFast13.requery();
                    executeFast13.bindLong(1, E);
                    executeFast13.bindLong(2, j);
                    executeFast13.step();
                    executeFast14.requery();
                    executeFast14.bindLong(1, E);
                    executeFast14.bindLong(2, j);
                    executeFast14.step();
                    executeFast15.requery();
                    executeFast15.bindLong(1, E);
                    executeFast15.bindLong(2, j);
                    executeFast15.step();
                }
                executeFast13.dispose();
                executeFast14.dispose();
                executeFast15.dispose();
            }
            if (arrayList2 != null) {
                SQLitePreparedStatement executeFast16 = sQLiteDatabase2.executeFast("UPDATE dialogs SET did = ? WHERE did = ?");
                int size2 = arrayList2.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    int intValue31 = ((Integer) arrayList2.get(i18)).intValue();
                    long F = wf3.F(intValue31);
                    executeFast16.requery();
                    executeFast16.bindLong(1, F);
                    executeFast16.bindLong(2, intValue31 | 8589934592L);
                    executeFast16.step();
                }
                executeFast16.dispose();
            }
            bs2.B(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_read_out_idx_messages;", "DROP INDEX IF EXISTS uid_date_mid_idx_messages;", "DROP INDEX IF EXISTS mid_out_idx_messages;", "DROP INDEX IF EXISTS task_idx_messages;");
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS send_state_idx_messages2;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mention_idx_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS messages;").stepThis().dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 84").stepThis().dispose();
            i6 = 84;
        }
        if (i6 == 84) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT mid, uid, date, type, data FROM media_v3 WHERE 1", new Object[0]);
            } catch (Exception e8) {
                cc4.f(e8);
                sQLiteCursor = null;
            }
            if (sQLiteCursor != null) {
                SQLitePreparedStatement executeFast17 = sQLiteDatabase2.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue9 = sQLiteCursor.byteBufferValue(4);
                    if (byteBufferValue9 != null) {
                        int intValue32 = sQLiteCursor.intValue(0);
                        long longValue14 = sQLiteCursor.longValue(1);
                        if (((int) longValue14) == 0) {
                            longValue14 = wf3.E((int) (longValue14 >> c));
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
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS media_v3;").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 85").stepThis().dispose();
            i6 = 85;
        }
        if (i6 == 85) {
            a(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            a(sQLiteDatabase2, "ALTER TABLE scheduled_messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);").stepThis().dispose();
            a(sQLiteDatabase2, "UPDATE messages_v2 SET replydata = NULL");
            a(sQLiteDatabase2, "UPDATE scheduled_messages_v2 SET replydata = NULL");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 86").stepThis().dispose();
            i6 = 86;
        }
        if (i6 == 86) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS reactions(data BLOB, hash INTEGER, date INTEGER);", "PRAGMA user_version = 87");
            i6 = 87;
        }
        if (i6 == 87) {
            bs2.A(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN unread_reactions INTEGER default 0", "CREATE TABLE reaction_mentions(message_id INTEGER PRIMARY KEY, state INTEGER);", "PRAGMA user_version = 88");
            i6 = 88;
        }
        if (i6 == 88 || i6 == 89) {
            bs2.B(sQLiteDatabase2, "DROP TABLE IF EXISTS reaction_mentions;", "CREATE TABLE IF NOT EXISTS reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(dialog_id, message_id));", "CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);", "DROP INDEX IF EXISTS uid_mid_type_date_idx_media_v3");
            bs2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);", "PRAGMA user_version = 90");
            i6 = 90;
        }
        if (i6 == 90 || i6 == 91) {
            bs2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS downloading_documents;", "CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));", "PRAGMA user_version = 92");
            i6 = 92;
        }
        if (i6 == 92) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);", "PRAGMA user_version = 93");
            i6 = 95;
        }
        if (i6 == 95 || i6 == 93) {
            a(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN custom_params BLOB default NULL");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 96").stepThis().dispose();
            i6 = 96;
        }
        if (i6 == 96) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS premium_promo(data BLOB, date INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("UPDATE stickers_v2 SET date = 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 97").stepThis().dispose();
            i6 = 97;
        }
        if (i6 == 97) {
            bs2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS stickers_featured;", "CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER);", "PRAGMA user_version = 98");
            i6 = 98;
        }
        if (i6 == 98) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 99");
            i6 = 99;
        }
        if (i6 == 99) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE stickers_featured ADD COLUMN emoji INTEGER default 0", "PRAGMA user_version = 100");
            i6 = 100;
        }
        if (i6 == 100) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE emoji_statuses(data BLOB, type INTEGER);", "PRAGMA user_version = 101");
            i6 = 101;
        }
        if (i6 == 101) {
            bs2.B(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN group_id INTEGER default NULL", "ALTER TABLE dialogs ADD COLUMN last_mid_group INTEGER default NULL", "CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);", "PRAGMA user_version = 102");
            i6 = 102;
        }
        if (i6 == 102) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes_topics(uid, topic_id, end);", "CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, PRIMARY KEY(mid, topic_id, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, mid, read_state, out);");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);", "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, mention, read_state);", "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS mid_uid_topic_id_messages_topics ON messages_topics(mid, topic_id, uid);", "CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);", "CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);", "CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, PRIMARY KEY(did, topic_id));", "CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);", "PRAGMA user_version = 103");
            i6 = 103;
        }
        if (i6 == 103) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))", "CREATE TABLE IF NOT EXISTS reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);", "PRAGMA user_version = 104");
            i6 = 104;
        }
        if (i6 == 104) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN read_outbox INTEGER default 0", "PRAGMA user_version = 105");
            i6 = 105;
        }
        if (i6 == 105) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN pinned INTEGER default 0", "PRAGMA user_version = 106");
            i6 = 106;
        }
        if (i6 == 106) {
            bs2.B(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_read_out_idx_messages_topics", "DROP INDEX IF EXISTS uid_mention_idx_messages_topics", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);", "CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);", "CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);", "CREATE INDEX IF NOT EXISTS did_topics ON topics(did);");
            bs2.y(sQLiteDatabase2, "PRAGMA user_version = 107");
            i6 = 107;
        }
        if (i6 == 107) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN total_messages_count INTEGER default 0", "PRAGMA user_version = 108");
            i6 = 108;
        }
        if (i6 == 108) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN hidden INTEGER default 0", "PRAGMA user_version = 109");
            i6 = 109;
        }
        if (i6 == 109) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN ttl_period INTEGER default 0", "PRAGMA user_version = 110");
            i6 = 110;
        }
        if (i6 == 110) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE stickersets(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER);", "PRAGMA user_version = 111");
            i6 = 111;
        }
        if (i6 == 111) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)", "PRAGMA user_version = 112");
            i6 = 112;
        }
        if (i6 == 112) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE app_config(data BLOB)", "PRAGMA user_version = 113");
            i6 = 113;
        }
        if (i6 == 113) {
            kf7Var.t1();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 114").stepThis().dispose();
            i6 = 114;
        }
        if (i6 == 114) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))", "CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);", "PRAGMA user_version = 115");
            i6 = 115;
        }
        if (i6 == 115) {
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);", "PRAGMA user_version = 117");
            i6 = 117;
        }
        if (i6 == 116 || i6 == 117 || i6 == 118) {
            bs2.B(sQLiteDatabase2, "DROP TABLE IF EXISTS stories", "DROP TABLE IF EXISTS stories_counter", "CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, local_path TEXT, local_thumb_path TEXT, PRIMARY KEY (dialog_id, story_id));", "CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 119").stepThis().dispose();
            kf7Var.getMessagesController().O1().p();
            i6 = 119;
        }
        if (i6 == 119) {
            bs2.A(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN reply_to_story_id INTEGER default 0", "ALTER TABLE messages_topics ADD COLUMN reply_to_story_id INTEGER default 0", "PRAGMA user_version = 120");
            i6 = 120;
        }
        if (i6 == 120) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, PRIMARY KEY(dialog_id, story_id));", "CREATE TABLE archived_stories (story_id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 121");
            i6 = 121;
        }
        if (i6 == 121) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB);", "PRAGMA user_version = 122");
            i6 = 122;
        }
        if (i6 == 122) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN participants_count INTEGER default 0", "PRAGMA user_version = 123");
            i6 = 123;
        }
        if (i6 == 123) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE story_pushes (uid INTEGER PRIMARY KEY, minId INTEGER, maxId INTEGER, date INTEGER, localName TEXT);", "PRAGMA user_version = 124");
            i6 = 124;
        }
        if (i6 == 124) {
            bs2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS story_pushes;", "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, PRIMARY KEY(uid, sid));", "PRAGMA user_version = 125");
            i6 = 125;
        }
        if (i6 == 125) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE story_pushes ADD COLUMN flags INTEGER default 0", "PRAGMA user_version = 126");
            i6 = 126;
        }
        if (i6 == 126) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE story_pushes ADD COLUMN expire_date INTEGER default 0", "PRAGMA user_version = 127");
            i6 = 127;
        }
        if (i6 == 127) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE stories ADD COLUMN custom_params BLOB default NULL", "PRAGMA user_version = 128");
            i6 = 128;
        }
        if (i6 == 128) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE story_drafts ADD COLUMN type INTEGER default 0", "PRAGMA user_version = 129");
            i6 = 129;
        }
        if (i6 == 129) {
            bs2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);", "PRAGMA user_version = 130");
            i6 = 130;
        }
        if (i6 == 130) {
            bs2.A(sQLiteDatabase2, "DROP TABLE archived_stories", "ALTER TABLE profile_stories ADD COLUMN type INTEGER default 0", "PRAGMA user_version = 131");
            i6 = 131;
        }
        if (i6 == 131) {
            bs2.A(sQLiteDatabase2, "ALTER TABLE stories DROP COLUMN local_path", "ALTER TABLE stories DROP COLUMN local_thumb_path", "PRAGMA user_version = 132");
            i6 = 132;
        }
        if (i6 == 132) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE unconfirmed_auth (data BLOB);", "PRAGMA user_version = 133");
            i6 = 133;
        }
        if (i6 == 133) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE unread_push_messages ADD COLUMN topicId INTEGER default 0", "PRAGMA user_version = 134");
            i6 = 134;
        }
        if (i6 == 134) {
            bs2.B(sQLiteDatabase2, "DROP TABLE user_photos", "CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))", "CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)", "PRAGMA user_version = 135");
            i6 = 135;
        }
        if (i6 == 135) {
            a.l();
            sQLiteDatabase2.executeFast("CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 136").stepThis().dispose();
            i6 = 136;
        }
        if (i6 == 136) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE saved_dialogs(did INTEGER PRIMARY KEY, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER)", "CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);");
            bs2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);", "PRAGMA user_version = 137");
            i6 = 137;
        }
        if (i6 == 137) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE unread_push_messages ADD COLUMN is_reaction INTEGER default 0", "PRAGMA user_version = 138");
            i6 = 138;
        }
        if (i6 == 138 || i6 == 139 || i6 == 140 || i6 == 141) {
            bs2.B(sQLiteDatabase2, "DROP TABLE IF EXISTS tag_message_id;", "CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);", "CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);", "CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);");
            bs2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);", "CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);", "PRAGMA user_version = 142");
            i6 = 142;
        }
        if (i6 == 142) {
            bs2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS saved_reaction_tags;", "CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 143");
            i6 = 143;
        }
        if (i6 == 143) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE dialog_filter ADD COLUMN color INTEGER default -1", "PRAGMA user_version = 144");
            i6 = 144;
        }
        if (i6 == 144) {
            bs2.y(sQLiteDatabase2, "PRAGMA user_version = 145");
            i6 = 145;
        }
        if (i6 == 145) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER);", "PRAGMA user_version = 146");
            i6 = 146;
        }
        if (i6 == 146) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);");
            bs2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);", "PRAGMA user_version = 147");
            i6 = 147;
        }
        if (i6 == 147) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE business_replies ADD COLUMN count INTEGER default 0", "PRAGMA user_version = 148");
            i6 = 148;
        }
        if (i6 == 148) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN edit_date INTEGER default 0", "PRAGMA user_version = 149");
            i6 = 149;
        }
        if (i6 == 149) {
            bs2.A(sQLiteDatabase2, "ALTER TABLE stickersets2 ADD COLUMN short_name TEXT;", "CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);", "PRAGMA user_version = 150");
            i6 = 150;
        }
        if (i6 == 150) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE business_links(data BLOB, order_value INTEGER);", "PRAGMA user_version = 151");
            i6 = 151;
        }
        if (i6 == 151) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE profile_stories ADD COLUMN seen INTEGER default 0;", "PRAGMA user_version = 152");
            i6 = 152;
        }
        if (i6 == 152) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE profile_stories ADD COLUMN pin INTEGER default 0;", "PRAGMA user_version = 153");
            i6 = 153;
        }
        if (i6 == 153) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE effects(data BLOB)", "PRAGMA user_version = 154");
            i6 = 154;
        }
        if (i6 == 154) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);", "PRAGMA user_version = 155");
            i6 = 155;
        }
        if (i6 == 155) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT);", "PRAGMA user_version = 156");
            i6 = 156;
        }
        if (i6 == 156 || i6 == 157) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER);", "PRAGMA user_version = 158");
            i6 = 158;
        }
        if (i6 == 158) {
            bs2.A(sQLiteDatabase2, "DELETE FROM star_gifts2", "ALTER TABLE star_gifts2 ADD COLUMN pos INTEGER default 0;", "PRAGMA user_version = 159");
            i6 = 159;
        }
        if (i6 == 159) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE dialog_filter ADD COLUMN entities BLOB", "PRAGMA user_version = 160");
            i6 = 160;
        }
        if (i6 == 160) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE dialog_filter ADD COLUMN noanimate INTEGER", "PRAGMA user_version = 161");
            i6 = 161;
        }
        if (i6 == 161) {
            bs2.A(sQLiteDatabase2, "DELETE FROM popular_bots", "ALTER TABLE popular_bots ADD COLUMN pos INTEGER", "PRAGMA user_version = 162");
            i6 = 162;
        }
        if (i6 == 162) {
            bs2.B(sQLiteDatabase2, "DROP TABLE saved_dialogs", "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "PRAGMA user_version = 163");
            i6 = 163;
        }
        if (i6 == 163) {
            bs2.B(sQLiteDatabase2, "DROP TABLE saved_dialogs", "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "PRAGMA user_version = 164");
            i6 = 164;
        }
        if (i6 == 164) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN nopaid_messages_exception INTEGER default 0;", "PRAGMA user_version = 165");
            i6 = 165;
        }
        if (i6 == 165) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));", "CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));", "PRAGMA user_version = 166");
            i6 = 166;
        }
        if (i6 == 166) {
            bs2.A(sQLiteDatabase2, "DROP TABLE profile_stories", "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));", "PRAGMA user_version = 167");
            i6 = 167;
        }
        if (i6 == 167) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);", "PRAGMA user_version = 168");
            i6 = 168;
        }
        if (i6 == 168) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN unread_poll_votes INTEGER default 0", "PRAGMA user_version = 169");
            i6 = 169;
        }
        if (i6 == 169) {
            bs2.z(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN unread_poll_votes INTEGER default 0", "PRAGMA user_version = 170");
            i6 = 170;
        }
        if (i6 == 170) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);", "CREATE TABLE IF NOT EXISTS poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);");
            bs2.y(sQLiteDatabase2, "PRAGMA user_version = 171");
            i6 = 171;
        }
        if (i6 == 171) {
            bs2.A(sQLiteDatabase2, "DROP TABLE story_pushes", "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));", "PRAGMA user_version = 172");
            i6 = 172;
        }
        if (i6 == 172) {
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_dialogs ON messages_holes(uid, end);", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_topics ON messages_holes_topics(uid, topic_id, end);", "CREATE INDEX IF NOT EXISTS date_idx_4_saved_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS date_idx_4_dialogs ON dialogs(date);");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS last_mid_idx_4_saved_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_dialogs ON dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_saved_dialogs ON saved_dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_dialogs ON dialogs(folder_id);");
            bs2.B(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS flags_idx_4_saved_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS flags_idx_4_dialogs ON dialogs(flags);", "DROP INDEX IF EXISTS uid_end_messages_holes;", "DROP INDEX IF EXISTS date_idx_dialogs;");
            bs2.B(sQLiteDatabase2, "DROP INDEX IF EXISTS last_mid_idx_dialogs;", "DROP INDEX IF EXISTS folder_id_idx_dialogs;", "DROP INDEX IF EXISTS flags_idx_dialogs;", "PRAGMA user_version = 173");
            i6 = 173;
        }
        if (i6 == 173) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE web_browser_settings(data BLOB)", "PRAGMA user_version = 174");
            i6 = 174;
        }
        if (i6 == 174) {
            bs2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_type_date_mid_idx_media_v4 ON media_v4(uid, type, date DESC, mid DESC);", "PRAGMA user_version = 175");
            i6 = 175;
        }
        if (i6 == 175) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE ephemeral_messages (id INTEGER, dialog_id INTEGER, topic_id INTEGER, date INTEGER, data BLOB, PRIMARY KEY(dialog_id, id));", "CREATE INDEX IF NOT EXISTS ephemeral_messages_date_idx ON ephemeral_messages(date);", "PRAGMA user_version = 176");
            i6 = 176;
        }
        if (i6 == 176) {
            bs2.B(sQLiteDatabase2, "CREATE TABLE welcome_messages(mid INTEGER, dialog_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, dialog_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_welcome_messages ON welcome_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS dialog_date_idx_welcome_messages ON welcome_messages(dialog_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_welcome_messages ON welcome_messages(mid, reply_to_message_id);");
            bs2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS idx_to_reply_welcome_messages ON welcome_messages(reply_to_message_id, mid);", "PRAGMA user_version = 177");
            i6 = 177;
        }
        if (i6 == 177) {
            bs2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS media_v4_music_browse_idx ON media_v4(uid, date DESC, mid DESC) WHERE type = 4 AND mid > 0 AND uid != 0;", "PRAGMA user_version = 178");
            i6 = 178;
        }
        if (i6 == 178) {
            bs2.z(sQLiteDatabase2, "DELETE FROM downloading_documents", "PRAGMA user_version = 179");
            i6 = 179;
        }
        if (i6 == 179) {
            bs2.A(sQLiteDatabase2, "CREATE TABLE widget_state(uid INTEGER, mid INTEGER, local TEXT, PRIMARY KEY(uid, mid));", "CREATE TABLE widget_heights(uid INTEGER, mid INTEGER, width INTEGER, height INTEGER, date INTEGER, PRIMARY KEY(uid, mid, width));", "PRAGMA user_version = 180");
            i6 = 180;
        }
        if (i6 == 180) {
            if (c(sQLiteDatabase2, "widget_state", "height")) {
                bs2.y(sQLiteDatabase2, "DROP TABLE widget_state");
            }
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS widget_state(uid INTEGER, mid INTEGER, local TEXT, PRIMARY KEY(uid, mid));", "CREATE TABLE IF NOT EXISTS widget_heights(uid INTEGER, mid INTEGER, width INTEGER, height INTEGER, date INTEGER, anchor INTEGER default 0, PRIMARY KEY(uid, mid, width));");
            if (!c(sQLiteDatabase2, "widget_heights", "anchor")) {
                bs2.y(sQLiteDatabase2, "ALTER TABLE widget_heights ADD COLUMN anchor INTEGER default 0");
            }
            bs2.y(sQLiteDatabase2, "PRAGMA user_version = 181");
            i6 = 181;
        }
        if (i6 == 181) {
            bs2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS onchain_offer_intents(slug TEXT, amount INTEGER, duration INTEGER, random_id INTEGER, used_at INTEGER, PRIMARY KEY(slug, amount, duration));", "PRAGMA user_version = 182");
            i6 = 182;
        }
        if (i6 == 182) {
            b(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS folder_pinned_date_idx_dialogs ON dialogs(folder_id, pinned, date);");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 183").stepThis().dispose();
            i6 = 183;
        }
        if (i6 == 183) {
            b(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS stickersets2_short_name ON stickersets2(short_name);");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 184").stepThis().dispose();
            return 184;
        }
        return i6;
    }
}
