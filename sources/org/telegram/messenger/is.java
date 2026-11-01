package org.telegram.messenger;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
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
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class is extends f1 {
    public static volatile is[] f16328e0 = new is[4];
    public static final Object[] f16329f0 = new Object[4];
    public static final String[] f16330g0;
    public int D;
    public int E;
    public int F;
    public int G;
    public final ArrayList H;
    public final SparseArray I;
    public final a0.h J;
    public int K;
    public int L;
    public volatile int M;
    public volatile int N;
    public boolean O;
    public final CountDownLatch P;
    public boolean Q;
    public final LongSparseIntArray R;
    public boolean S;
    public final int[][] T;
    public final int[][] U;
    public final int[][] V;
    public final int[][] W;
    public final int[][] X;
    public final int[][] Y;
    public final int[] Z;
    public final r5 f16331a;
    public final int[] f16332a0;
    public SQLiteDatabase f16333b;
    public final a0.h f16334b0;
    public File f16335c;
    public final a0.h f16336c0;
    public File d;
    public final l2.f f16337d0;
    public File e;
    public final AtomicLong f16338f;
    public final SparseArray h;
    public int f16339n;
    public int f16340r;
    public int f16341s;
    public int f16342w;
    public int f16343x;
    public byte[] f16344y;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f16329f0[i10] = new Object();
        }
        f16330g0 = new String[]{"messages_holes", "media_holes_v2", "scheduled_messages_v2", "quick_replies", "messages_v2", "download_queue", "user_contacts_v7", "user_phones_v7", "dialogs", "dialog_filter", "dialog_filter_ep", "dialog_filter_pin_v2", "randoms_v2", "enc_tasks_v4", "messages_seq", "params", "media_v4", "bot_keyboard", "bot_keyboard_topics", "chat_settings_v2", "user_settings", "chat_pinned_v2", "chat_pinned_count", "chat_hints", "botcache", "users_data", "users", "chats", "enc_chats", "channel_users_v2", "channel_admins_v3", "contacts", "dialog_photos", "dialog_settings", "web_recent_v3", "stickers_v2", "stickers_featured", "stickers_dice", "stickersets", "hashtag_recent_v2", "webpage_pending_v2", "sent_files_v2", "search_recent", "media_counts_v2", "keyvalue", "bot_info_v2", "pending_tasks", "requested_holes", "sharing_locations", "shortcut_widget", "emoji_keywords_v2", "emoji_keywords_info_v2", "wallpapers2", "unread_push_messages", "polls_v2", "reactions", "reaction_mentions", "downloading_documents", "animated_emoji", "attach_menu_bots", "premium_promo", "emoji_statuses", "messages_holes_topics", "messages_topics", "saved_dialogs", "media_topics", "media_holes_topics", "topics", "media_counts_topics", "reaction_mentions_topics", "emoji_groups", "poll_votes_mentions", "poll_votes_mentions_topics", "ephemeral_messages", "widget_state", "widget_heights"};
    }

    public is(int i10) {
        super(i10);
        this.f16338f = new AtomicLong(System.currentTimeMillis());
        this.h = new SparseArray();
        this.f16339n = 0;
        this.f16340r = 0;
        this.f16341s = 0;
        this.f16342w = 0;
        this.f16343x = 0;
        this.f16344y = null;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.J = new a0.h();
        this.P = new CountDownLatch(1);
        this.R = new LongSparseIntArray();
        this.T = new int[][]{new int[2], new int[2]};
        this.U = new int[][]{new int[2], new int[2]};
        this.V = new int[][]{new int[2], new int[2]};
        this.W = new int[][]{new int[2], new int[2]};
        this.X = new int[][]{new int[2], new int[2]};
        this.Y = new int[][]{new int[2], new int[2]};
        this.Z = new int[2];
        this.f16332a0 = new int[2];
        this.f16334b0 = new a0.h();
        this.f16336c0 = new a0.h();
        this.f16337d0 = new l2.f(25);
        r5 r5Var = new r5(i0.a.i(i10, "storageQueue_"));
        this.f16331a = r5Var;
        r5Var.setPriority(8);
        r5Var.c(new cr(this, 10));
    }

    public static void A(SQLiteDatabase sQLiteDatabase) {
        m5.v(sQLiteDatabase, "CREATE TABLE messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_dialogs ON messages_holes(uid, end);", "CREATE TABLE media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);");
        m5.v(sQLiteDatabase, "CREATE TABLE scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);", "CREATE TABLE messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, group_id INTEGER, reply_to_story_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);");
        m5.v(sQLiteDatabase, "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_4_saved_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_saved_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_saved_dialogs ON saved_dialogs(folder_id);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS flags_idx_4_saved_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "CREATE TABLE download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type));", "CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);");
        m5.v(sQLiteDatabase, "CREATE TABLE user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)", "CREATE TABLE user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);", "CREATE TABLE dialogs(did INTEGER PRIMARY KEY, date INTEGER, unread_count INTEGER, last_mid INTEGER, inbox_max INTEGER, outbox_max INTEGER, last_mid_i INTEGER, unread_count_i INTEGER, pts INTEGER, date_i INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, data BLOB, unread_reactions INTEGER, last_mid_group INTEGER, ttl_period INTEGER, unread_poll_votes INTEGER)");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS date_idx_4_dialogs ON dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_dialogs ON dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);", "CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_dialogs ON dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_4_dialogs ON dialogs(flags);", "CREATE TABLE dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT, color INTEGER DEFAULT -1, entities BLOB, noanimate INTEGER)");
        m5.v(sQLiteDatabase, "CREATE TABLE dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))", "CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);");
        m5.v(sQLiteDatabase, "CREATE TABLE enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))", "CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);", "CREATE TABLE messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);", "CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);");
        m5.v(sQLiteDatabase, "CREATE TABLE params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)", "INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)", "CREATE TABLE media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_type_date_mid_idx_media_v4 ON media_v4(uid, type, date DESC, mid DESC);", "CREATE INDEX IF NOT EXISTS media_v4_music_browse_idx ON media_v4(uid, date DESC, mid DESC) WHERE type = 4 AND mid > 0 AND uid != 0;", "CREATE TABLE bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);");
        m5.v(sQLiteDatabase, "CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))", "CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);", "CREATE TABLE chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER, online INTEGER, inviter INTEGER, links INTEGER, participants_count INTEGER)", "CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;");
        m5.v(sQLiteDatabase, "CREATE TABLE user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)", "CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;", "CREATE TABLE chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));", "CREATE TABLE chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);");
        m5.v(sQLiteDatabase, "CREATE TABLE chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))", "CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);", "CREATE TABLE botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)", "CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);");
        m5.v(sQLiteDatabase, "CREATE TABLE users_data(uid INTEGER PRIMARY KEY, about TEXT)", "CREATE TABLE users(uid INTEGER PRIMARY KEY, name TEXT, status INTEGER, data BLOB)", "CREATE TABLE chats(uid INTEGER PRIMARY KEY, name TEXT, data BLOB)", "CREATE TABLE enc_chats(uid INTEGER PRIMARY KEY, user INTEGER, name TEXT, data BLOB, g BLOB, authkey BLOB, ttl INTEGER, layer INTEGER, seq_in INTEGER, seq_out INTEGER, use_count INTEGER, exchange_id INTEGER, key_date INTEGER, fprint INTEGER, fauthkey BLOB, khash BLOB, in_seq_no INTEGER, admin_id INTEGER, mtproto_seq INTEGER)");
        m5.v(sQLiteDatabase, "CREATE TABLE channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE contacts(uid INTEGER PRIMARY KEY, mutual INTEGER)", "CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))");
        m5.v(sQLiteDatabase, "CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)", "CREATE TABLE dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);", "CREATE TABLE web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, document BLOB, PRIMARY KEY (id, type));", "CREATE TABLE stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);");
        m5.v(sQLiteDatabase, "CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER, emoji INTEGER);", "CREATE TABLE stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);", "CREATE TABLE hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);", "CREATE TABLE webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));");
        m5.v(sQLiteDatabase, "CREATE TABLE sent_files_v2(uid TEXT, type INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type))", "CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);", "CREATE TABLE media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, type))", "CREATE TABLE keyvalue(id TEXT PRIMARY KEY, value TEXT)");
        m5.v(sQLiteDatabase, "CREATE TABLE bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))", "CREATE TABLE pending_tasks(id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));", "CREATE TABLE sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB, proximity INTEGER);");
        m5.v(sQLiteDatabase, "CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER, short_name TEXT);", "CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);", "CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);", "CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);");
        m5.v(sQLiteDatabase, "CREATE TABLE shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));", "CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);", "CREATE TABLE emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));", "CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);");
        m5.v(sQLiteDatabase, "CREATE TABLE emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER, date INTEGER);", "CREATE TABLE wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)", "CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);", "CREATE TABLE unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, topicId INTEGER, is_reaction INTEGER, PRIMARY KEY(uid, mid))");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);", "CREATE TABLE polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));", "CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);");
        m5.v(sQLiteDatabase, "CREATE TABLE reactions(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);", "CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));");
        m5.v(sQLiteDatabase, "CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE premium_promo(data BLOB, date INTEGER);", "CREATE TABLE emoji_statuses(data BLOB, type INTEGER);");
        m5.v(sQLiteDatabase, "CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_topics ON messages_holes_topics(uid, topic_id, end);", "CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, reply_to_story_id INTEGER, PRIMARY KEY(mid, topic_id, uid))", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);", "CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);", "CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);", "CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);");
        m5.v(sQLiteDatabase, "CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);", "CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);");
        m5.v(sQLiteDatabase, "CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, read_outbox INTEGER, pinned INTEGER, total_messages_count INTEGER, hidden INTEGER, edit_date INTEGER, nopaid_messages_exception INTEGER, unread_poll_votes INTEGER, PRIMARY KEY(did, topic_id));", "CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);", "CREATE INDEX IF NOT EXISTS did_topics ON topics(did);", "CREATE TABLE media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))");
        m5.v(sQLiteDatabase, "CREATE TABLE reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);", "CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)", "CREATE TABLE app_config(data BLOB)");
        m5.v(sQLiteDatabase, "CREATE TABLE web_browser_settings(data BLOB)", "CREATE TABLE effects(data BLOB)", "CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, custom_params BLOB, PRIMARY KEY (dialog_id, story_id));", "CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);");
        m5.v(sQLiteDatabase, "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));", "CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));", "CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));", "CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB, type INTEGER);");
        m5.v(sQLiteDatabase, "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));", "CREATE TABLE unconfirmed_auth (data BLOB);", "CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);", "CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);", "CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);", "CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);");
        m5.v(sQLiteDatabase, "CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER, count INTEGER);", "CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);", "CREATE TABLE welcome_messages(mid INTEGER, dialog_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, dialog_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_welcome_messages ON welcome_messages(mid, send_state, date);");
        m5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS dialog_date_idx_welcome_messages ON welcome_messages(dialog_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_welcome_messages ON welcome_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_welcome_messages ON welcome_messages(reply_to_message_id, mid);", "CREATE TABLE business_links(data BLOB, order_value INTEGER);");
        m5.v(sQLiteDatabase, "CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);", "CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT, pos INTEGER);", "CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER, pos INTEGER);", "CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);");
        m5.v(sQLiteDatabase, "CREATE TABLE poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);", "CREATE TABLE poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);");
        m5.v(sQLiteDatabase, "CREATE TABLE ephemeral_messages (id INTEGER, dialog_id INTEGER, topic_id INTEGER, date INTEGER, data BLOB, PRIMARY KEY(dialog_id, id));", "CREATE INDEX IF NOT EXISTS ephemeral_messages_date_idx ON ephemeral_messages(date);", "CREATE TABLE widget_state(uid INTEGER, mid INTEGER, local TEXT, PRIMARY KEY(uid, mid));", "CREATE TABLE widget_heights(uid INTEGER, mid INTEGER, width INTEGER, height INTEGER, date INTEGER, anchor INTEGER default 0, PRIMARY KEY(uid, mid, width));");
        m5.s(sQLiteDatabase, "PRAGMA user_version = 181");
    }

    public static void J(TLRPC.Message message) {
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported_old) {
                if (messageMedia.bytes.length == 0) {
                    Pattern pattern = Utilities.f14519a;
                    byte b10 = (byte) 0;
                    messageMedia.bytes = new byte[]{b10, b10, b10, (byte) 233};
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
                TLRPC.TL_messageMediaUnsupported_old tL_messageMediaUnsupported_old = new TLRPC.TL_messageMediaUnsupported_old();
                message.media = tL_messageMediaUnsupported_old;
                Pattern pattern2 = Utilities.f14519a;
                byte b11 = (byte) 0;
                tL_messageMediaUnsupported_old.bytes = new byte[]{b11, b11, b11, (byte) 233};
                message.flags |= 512;
            }
        }
    }

    public static String K(TLRPC.User user) {
        StringBuilder sb2 = new StringBuilder();
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            sb2.append(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(user.last_name);
        }
        sb2.append(";;;");
        String str3 = user.username;
        if (str3 != null && str3.length() > 0) {
            sb2.append(user.username);
        } else {
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i10 = 0; i10 < user.usernames.size(); i10++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.active) {
                        sb2.append(tL_username.username);
                        sb2.append(";;");
                    }
                }
            }
        }
        return sb2.toString().toLowerCase();
    }

    public static ArrayList L1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) arrayList.get(i10);
                if (inputPeer != null) {
                    long j10 = inputPeer.user_id;
                    if (j10 == 0) {
                        long j11 = inputPeer.chat_id;
                        if (j11 == 0) {
                            j11 = inputPeer.channel_id;
                        }
                        j10 = -j11;
                    }
                    arrayList2.add(Long.valueOf(j10));
                }
            }
        }
        return arrayList2;
    }

    public static void a(is isVar, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj;
            isVar.getMessagesController().k4(((Integer) pair.second).intValue(), ((Long) pair.first).longValue(), false);
        }
    }

    public static is a0(int i10) {
        is isVar;
        is isVar2 = f16328e0[i10];
        if (isVar2 == null) {
            synchronized (f16329f0[i10]) {
                try {
                    isVar = f16328e0[i10];
                    if (isVar == null) {
                        is[] isVarArr = f16328e0;
                        is isVar3 = new is(i10);
                        isVarArr[i10] = isVar3;
                        isVar = isVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return isVar;
        }
        return isVar2;
    }

    public static void c(TLRPC.Peer peer, ArrayList arrayList, ArrayList arrayList2) {
        if (peer instanceof TLRPC.TL_peerUser) {
            if (!arrayList.contains(Long.valueOf(peer.user_id))) {
                arrayList.add(Long.valueOf(peer.user_id));
            }
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            if (!arrayList2.contains(Long.valueOf(peer.channel_id))) {
                arrayList2.add(Long.valueOf(peer.channel_id));
            }
        } else if ((peer instanceof TLRPC.TL_peerChat) && !arrayList2.contains(Long.valueOf(peer.chat_id))) {
            arrayList2.add(Long.valueOf(peer.chat_id));
        }
    }

    public static void d(TLRPC.Message message, a0.h hVar, a0.h hVar2) {
        long B0;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        int i10 = messageReplyHeader.reply_to_msg_id;
        if ((message.flags & 1073741824) != 0) {
            B0 = message.quick_reply_shortcut_id;
        } else {
            TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
            if (peer != null) {
                B0 = kj.C1(peer);
            } else {
                B0 = kj.B0(message);
            }
        }
        SparseArray sparseArray = (SparseArray) hVar.f(B0);
        ArrayList arrayList = (ArrayList) hVar2.f(B0);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            hVar.k(sparseArray, B0);
        }
        if (arrayList == null) {
            arrayList = m5.i(hVar2, B0);
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

    public static int d0(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            if ((message.media instanceof TLRPC.TL_messageMediaPhoto) || kj.t3(message) || kj.R4(message) || kj.L4(message) || kj.j4(message)) {
                int i10 = message.ttl;
                if (i10 > 0 && i10 <= 60) {
                    return 1;
                }
                return 0;
            }
            return -1;
        }
        if (message instanceof TLRPC.TL_message) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) || (messageMedia instanceof TLRPC.TL_messageMediaDocument)) && messageMedia.ttl_seconds != 0) {
                return 1;
            }
        }
        if (!(message.media instanceof TLRPC.TL_messageMediaPhoto) && !kj.L4(message)) {
            return -1;
        }
        return 0;
    }

    public static void e(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
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
        long C1 = kj.C1(message.from_id);
        if (o5.E(C1)) {
            if (!arrayList.contains(Long.valueOf(C1))) {
                arrayList.add(Long.valueOf(C1));
            }
        } else if (o5.z(C1)) {
            long j10 = -C1;
            if (!arrayList2.contains(Long.valueOf(j10))) {
                arrayList2.add(Long.valueOf(j10));
            }
        }
        long j11 = message.via_bot_id;
        if (j11 != 0 && !arrayList.contains(Long.valueOf(j11))) {
            arrayList.add(Long.valueOf(message.via_bot_id));
        }
        TLRPC.Peer peer8 = message.guestchat_via_from;
        if (peer8 != null) {
            c(peer8, arrayList, arrayList2);
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction != null) {
            long j12 = messageAction.user_id;
            if (j12 != 0 && !arrayList.contains(Long.valueOf(j12))) {
                arrayList.add(Long.valueOf(message.action.user_id));
            }
            long j13 = message.action.channel_id;
            if (j13 != 0 && !arrayList2.contains(Long.valueOf(j13))) {
                arrayList2.add(Long.valueOf(message.action.channel_id));
            }
            long j14 = message.action.chat_id;
            if (j14 != 0 && !arrayList2.contains(Long.valueOf(j14))) {
                arrayList2.add(Long.valueOf(message.action.chat_id));
            }
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                c(((TLRPC.TL_messageActionGiftCode) messageAction2).boost_peer, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction3 = message.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached) {
                TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction3;
                c(tL_messageActionGeoProximityReached.from_id, arrayList, arrayList2);
                c(tL_messageActionGeoProximityReached.to_id, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction4 = message.action;
            if (messageAction4 instanceof TLRPC.TL_messageActionManagedBotCreated) {
                arrayList.add(Long.valueOf(((TLRPC.TL_messageActionManagedBotCreated) messageAction4).bot_id));
            }
            TLRPC.MessageAction messageAction5 = message.action;
            if (messageAction5 instanceof TLRPC.TL_messageActionChangeCommunity) {
                long j15 = ((TLRPC.TL_messageActionChangeCommunity) messageAction5).community_id;
                if (j15 > 0) {
                    arrayList2.add(Long.valueOf(j15));
                }
            }
            if (!message.action.users.isEmpty()) {
                for (int i10 = 0; i10 < message.action.users.size(); i10++) {
                    Long l4 = message.action.users.get(i10);
                    if (!arrayList.contains(l4)) {
                        arrayList.add(l4);
                    }
                }
            }
        }
        if (!message.entities.isEmpty()) {
            for (int i11 = 0; i11 < message.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i11);
                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                } else if (arrayList3 != null && (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    arrayList3.add(Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id));
                }
            }
        }
        TLRPC.MessageAction messageAction6 = message.action;
        if (messageAction6 instanceof TLRPC.TL_messageActionStarGift) {
            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGift) messageAction6).gift;
            if (starGift != null && (peer7 = starGift.released_by) != null) {
                c(peer7, arrayList, arrayList2);
            }
        } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftUnique) {
            TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction6).gift;
            if (starGift2 != null && (peer = starGift2.released_by) != null) {
                c(peer, arrayList, arrayList2);
            }
        } else if (messageAction6 instanceof TLRPC.TL_messageActionRequestedPeer) {
            TLRPC.TL_messageActionRequestedPeer tL_messageActionRequestedPeer = (TLRPC.TL_messageActionRequestedPeer) messageAction6;
            for (int i12 = 0; i12 < tL_messageActionRequestedPeer.peers.size(); i12++) {
                c(tL_messageActionRequestedPeer.peers.get(i12), arrayList, arrayList2);
            }
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null) {
            long j16 = messageMedia.user_id;
            if (j16 != 0 && !arrayList.contains(Long.valueOf(j16))) {
                arrayList.add(Long.valueOf(message.media.user_id));
            }
            TLRPC.MessageMedia messageMedia2 = message.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                ArrayList<Long> arrayList4 = ((TLRPC.TL_messageMediaGiveaway) messageMedia2).channels;
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Long l10 = arrayList4.get(i13);
                    i13++;
                    Long l11 = l10;
                    if (!arrayList2.contains(l11)) {
                        arrayList2.add(l11);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia3 = message.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                ArrayList<Long> arrayList5 = ((TLRPC.TL_messageMediaGiveawayResults) messageMedia3).winners;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    Long l12 = arrayList5.get(i14);
                    i14++;
                    Long l13 = l12;
                    if (!arrayList.contains(l13)) {
                        arrayList.add(l13);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia4 = message.media;
            if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia4;
                if (!tL_messageMediaPoll.poll.answers.isEmpty()) {
                    for (int i15 = 0; i15 < tL_messageMediaPoll.poll.answers.size(); i15++) {
                        TLRPC.Peer peer9 = tL_messageMediaPoll.poll.answers.get(i15).added_by;
                        if (peer9 != null) {
                            c(peer9, arrayList, arrayList2);
                        }
                    }
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                if (pollResults != null) {
                    ArrayList<TLRPC.Peer> arrayList6 = pollResults.recent_voters;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        for (int i16 = 0; i16 < tL_messageMediaPoll.results.recent_voters.size(); i16++) {
                            c(tL_messageMediaPoll.results.recent_voters.get(i16), arrayList, arrayList2);
                        }
                    }
                    if (!tL_messageMediaPoll.results.results.isEmpty()) {
                        ArrayList<TLRPC.PollAnswerVoters> arrayList7 = tL_messageMediaPoll.results.results;
                        int size3 = arrayList7.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = arrayList7.get(i17);
                            i17++;
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = pollAnswerVoters;
                            ArrayList<TLRPC.Peer> arrayList8 = pollAnswerVoters2.recent_voters;
                            if (arrayList8 != null && !arrayList8.isEmpty()) {
                                ArrayList<TLRPC.Peer> arrayList9 = pollAnswerVoters2.recent_voters;
                                int size4 = arrayList9.size();
                                int i18 = 0;
                                while (i18 < size4) {
                                    TLRPC.Peer peer10 = arrayList9.get(i18);
                                    i18++;
                                    c(peer10, arrayList, arrayList2);
                                }
                            }
                        }
                    }
                }
            }
            TLRPC.MessageMedia messageMedia5 = message.media;
            if ((messageMedia5 instanceof TLRPC.TL_messageMediaStory) && (storyItem = messageMedia5.storyItem) != null) {
                TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                if (storyFwdHeader2 != null) {
                    c(storyFwdHeader2.from, arrayList, arrayList2);
                }
                TL_stories.StoryItem storyItem2 = message.media.storyItem;
                if (storyItem2 != null && storyItem2.media_areas != null) {
                    for (int i19 = 0; i19 < message.media.storyItem.media_areas.size(); i19++) {
                        if (message.media.storyItem.media_areas.get(i19) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            long j17 = ((TL_stories.TL_mediaAreaChannelPost) message.media.storyItem.media_areas.get(i19)).channel_id;
                            if (!arrayList2.contains(Long.valueOf(j17))) {
                                arrayList2.add(Long.valueOf(j17));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem3 = message.media.storyItem;
                if (storyItem3 != null && (peer6 = storyItem3.from_id) != null) {
                    c(peer6, arrayList, arrayList2);
                }
            }
            TLRPC.MessageMedia messageMedia6 = message.media;
            if ((messageMedia6 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia6.webpage) != null && webPage.attributes != null) {
                for (int i20 = 0; i20 < message.media.webpage.attributes.size(); i20++) {
                    if (message.media.webpage.attributes.get(i20) instanceof TLRPC.TL_webPageAttributeStory) {
                        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) message.media.webpage.attributes.get(i20);
                        TL_stories.StoryItem storyItem4 = tL_webPageAttributeStory.storyItem;
                        if (storyItem4 != null && (storyFwdHeader = storyItem4.fwd_from) != null) {
                            c(storyFwdHeader.from, arrayList, arrayList2);
                        }
                        TL_stories.StoryItem storyItem5 = tL_webPageAttributeStory.storyItem;
                        if (storyItem5 != null && storyItem5.media_areas != null) {
                            for (int i21 = 0; i21 < tL_webPageAttributeStory.storyItem.media_areas.size(); i21++) {
                                if (tL_webPageAttributeStory.storyItem.media_areas.get(i21) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                    long j18 = ((TL_stories.TL_mediaAreaChannelPost) tL_webPageAttributeStory.storyItem.media_areas.get(i21)).channel_id;
                                    if (!arrayList2.contains(Long.valueOf(j18))) {
                                        arrayList2.add(Long.valueOf(j18));
                                    }
                                }
                            }
                        }
                        TL_stories.StoryItem storyItem6 = tL_webPageAttributeStory.storyItem;
                        if (storyItem6 != null && (peer5 = storyItem6.from_id) != null) {
                            c(peer5, arrayList, arrayList2);
                        }
                    }
                }
            }
            TLRPC.Peer peer11 = message.media.peer;
            if (peer11 != null) {
                c(peer11, arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplies messageReplies = message.replies;
        if (messageReplies != null) {
            int size5 = messageReplies.recent_repliers.size();
            for (int i22 = 0; i22 < size5; i22++) {
                c(message.replies.recent_repliers.get(i22), arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if (messageReplyHeader != null && (peer4 = messageReplyHeader.reply_to_peer_id) != null) {
            c(peer4, arrayList, arrayList2);
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
        if (messageFwdHeader2 != null) {
            c(messageFwdHeader2.from_id, arrayList, arrayList2);
            c(message.fwd_from.saved_from_peer, arrayList, arrayList2);
        }
        TLRPC.MessageReplyHeader messageReplyHeader2 = message.reply_to;
        if (messageReplyHeader2 != null && (messageFwdHeader = messageReplyHeader2.reply_from) != null && (peer3 = messageFwdHeader.from_id) != null) {
            c(peer3, arrayList, arrayList2);
        }
        HashMap<String, String> hashMap = message.params;
        if (hashMap != null && (str = hashMap.get("fwd_peer")) != null) {
            long longValue = Utilities.A(str).longValue();
            if (longValue < 0) {
                long j19 = -longValue;
                if (!arrayList2.contains(Long.valueOf(j19))) {
                    arrayList2.add(Long.valueOf(j19));
                }
            }
        }
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions != null && tL_messageReactions.top_reactors != null) {
            for (int i23 = 0; i23 < message.reactions.top_reactors.size(); i23++) {
                TLRPC.MessageReactor messageReactor = message.reactions.top_reactors.get(i23);
                if (messageReactor != null && (peer2 = messageReactor.peer_id) != null) {
                    c(peer2, arrayList, arrayList2);
                }
            }
        }
    }

    public static boolean s0(a0.h hVar) {
        if (hVar != null && hVar.m() != 0) {
            return false;
        }
        return true;
    }

    public static boolean t0(LongSparseIntArray longSparseIntArray) {
        if (longSparseIntArray != null && longSparseIntArray.size() != 0) {
            return false;
        }
        return true;
    }

    public static boolean v0(TLRPC.MessageAction messageAction) {
        if (!(messageAction instanceof TLRPC.TL_messageActionPinMessage) && !(messageAction instanceof TLRPC.TL_messageActionPaymentSent) && !(messageAction instanceof TLRPC.TL_messageActionGameScore) && !(messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && !(messageAction instanceof TLRPC.TL_messageActionPollAppendAnswer) && !(messageAction instanceof TLRPC.TL_messageActionPollDeleteAnswer)) {
            return false;
        }
        return true;
    }

    public static void w(long j10, SQLitePreparedStatement sQLitePreparedStatement, SQLitePreparedStatement sQLitePreparedStatement2, int i10, long j11) {
        int i11;
        int i12;
        int i13;
        int i14;
        sQLitePreparedStatement.requery();
        sQLitePreparedStatement.bindLong(1, j10);
        int i15 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i15 != 0) {
            sQLitePreparedStatement.bindLong(2, j11);
            i11 = 3;
        } else {
            i11 = 2;
        }
        int i16 = i11 + 1;
        if (i10 == 1) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        sQLitePreparedStatement.bindInteger(i11, i12);
        sQLitePreparedStatement.bindInteger(i16, i10);
        sQLitePreparedStatement.step();
        for (int i17 = 0; i17 < 9; i17++) {
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(1, j10);
            if (i15 != 0) {
                sQLitePreparedStatement2.bindLong(2, j11);
                i13 = 3;
            } else {
                i13 = 2;
            }
            int i18 = i13 + 1;
            sQLitePreparedStatement2.bindInteger(i13, i17);
            int i19 = i13 + 2;
            if (i10 == 1) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            sQLitePreparedStatement2.bindInteger(i18, i14);
            sQLitePreparedStatement2.bindInteger(i19, i10);
            sQLitePreparedStatement2.step();
        }
    }

    public static boolean y0(TLRPC.Message message) {
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (replyMarkup != null && !(replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            if (!replyMarkup.selective || message.mentioned) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A0(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.A0(int, long):void");
    }

    public final void A1(int i10, int i11, int i12, int i13) {
        this.f16331a.c(new rr(this, i10, i11, i12, i13, 0));
    }

    public final void B(long j10, SparseArray sparseArray) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                if (sparseArray.size() != 0) {
                    this.f16333b.beginTransaction();
                    SQLitePreparedStatement executeFast = this.f16333b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                    int i10 = Integer.MAX_VALUE;
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        try {
                            int keyAt = sparseArray.keyAt(i11);
                            ArrayList arrayList2 = (ArrayList) sparseArray.get(keyAt);
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                int intValue = ((Integer) arrayList2.get(i12)).intValue();
                                executeFast.requery();
                                executeFast.bindInteger(1, intValue);
                                executeFast.bindLong(2, j10);
                                executeFast.bindInteger(3, keyAt);
                                executeFast.bindInteger(4, 1);
                                i10 = Math.min(i10, intValue);
                                executeFast.step();
                                arrayList.add((Integer) arrayList2.get(i12));
                            }
                        } catch (Exception e) {
                            e = e;
                            sQLitePreparedStatement = executeFast;
                            o(e, true);
                            SQLiteDatabase sQLiteDatabase = this.f16333b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLitePreparedStatement = executeFast;
                            SQLiteDatabase sQLiteDatabase2 = this.f16333b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                    executeFast.dispose();
                    this.f16333b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = this.f16333b;
                    Locale locale = Locale.US;
                    sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE uid = " + j10 + " AND mid IN(" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    getMessagesController().n0(i10, j10, sparseArray);
                }
                SQLiteDatabase sQLiteDatabase4 = this.f16333b;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.commitTransaction();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    public final void B0(int r29, int r30, int r31, long[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.B0(int, int, int, long[]):void");
    }

    public final void B1(int i10, int i11, int i12, int i13) {
        try {
            if (this.E == i10 && this.F == i11 && this.G == i12 && this.f16341s == i13) {
                return;
            }
            SQLitePreparedStatement executeFast = this.f16333b.executeFast("UPDATE params SET seq = ?, pts = ?, date = ?, qts = ? WHERE id = 1");
            executeFast.bindInteger(1, i10);
            executeFast.bindInteger(2, i11);
            executeFast.bindInteger(3, i12);
            executeFast.bindInteger(4, i13);
            executeFast.step();
            executeFast.dispose();
            this.E = i10;
            this.F = i11;
            this.G = i12;
        } catch (Exception e) {
            o(e, true);
        }
    }

    public final void C(bp bpVar) {
        try {
            this.H.remove(bpVar);
            this.I.remove(bpVar.f15000a);
            SQLiteDatabase sQLiteDatabase = this.f16333b;
            sQLiteDatabase.executeFast("DELETE FROM dialog_filter WHERE id = " + bpVar.f15000a).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.f16333b;
            sQLiteDatabase2.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + bpVar.f15000a).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase3 = this.f16333b;
            sQLiteDatabase3.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + bpVar.f15000a).stepThis().dispose();
        } catch (Exception e) {
            o(e, true);
        }
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.C0():void");
    }

    public final void C1(int i10, long j10, List list, boolean z10) {
        this.f16331a.c(new er(this, j10, list, z10, i10, 1));
    }

    public final void D(java.util.ArrayList r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.D(java.util.ArrayList, boolean):void");
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.D0():void");
    }

    public final void D1(long r20, java.util.List r22, boolean r23, boolean r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.D1(long, java.util.List, boolean, boolean, int):void");
    }

    public final void E(ArrayList arrayList, long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f16333b;
            Locale locale = Locale.US;
            String join = TextUtils.join(",", arrayList);
            sQLiteDatabase.executeFast("DELETE FROM unread_push_messages WHERE uid = " + j10 + " AND mid IN(" + join + ")").stepThis().dispose();
        } catch (Exception e) {
            o(e, true);
        }
    }

    public final void E0(int r49, int r50, int r51, long r52, long r54, org.telegram.tgnet.TLRPC.messages_Messages r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.E0(int, int, int, long, long, org.telegram.tgnet.TLRPC$messages_Messages, boolean):void");
    }

    public final void E1(long j10, long j11) {
        this.f16331a.c(new bq(0, j10, j11, this));
    }

    public final void F(long r19, long r21, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.F(long, long, int, int):void");
    }

    public final TLRPC.ChatFull F0(final long j10, final boolean z10, final CountDownLatch countDownLatch, final boolean z11, final boolean z12, final int i10) {
        final TLRPC.ChatFull[] chatFullArr = new TLRPC.ChatFull[1];
        this.f16331a.c(new Runnable(chatFullArr, j10, z10, z11, z12, i10, countDownLatch) {
            public final TLRPC.ChatFull[] f18300b;
            public final long f18301c;
            public final boolean d;
            public final boolean e;
            public final boolean f18302f;
            public final CountDownLatch h;

            {
                this.h = countDownLatch;
            }

            @Override
            public final void run() {
                this.f18300b[0] = is.this.G0(this.f18301c, this.d, this.e, this.f18302f);
                CountDownLatch countDownLatch2 = this.h;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
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

    public final void F1(long j10, boolean z10) {
        this.f16331a.c(new gq(0, j10, this, z10));
    }

    public final void G(int i10, long j10, long j11, String str) {
        SQLitePreparedStatement executeFast;
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        int i12 = 2;
        if (i11 != 0) {
            if (i10 == 0) {
                this.f16333b.executeFast(String.format(Locale.US, a1.g.n("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d"), Long.valueOf(j10), Long.valueOf(j11))).stepThis().dispose();
            } else {
                this.f16333b.executeFast(String.format(Locale.US, a1.g.n("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d AND start = 0"), Long.valueOf(j10), Long.valueOf(j11))).stepThis().dispose();
            }
        } else if (i10 == 0) {
            this.f16333b.executeFast(String.format(Locale.US, a1.g.n("DELETE FROM ", str, " WHERE uid = %d"), Long.valueOf(j10))).stepThis().dispose();
        } else {
            this.f16333b.executeFast(String.format(Locale.US, a1.g.n("DELETE FROM ", str, " WHERE uid = %d AND start = 0"), Long.valueOf(j10))).stepThis().dispose();
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (i11 != 0) {
                    SQLiteDatabase sQLiteDatabase = this.f16333b;
                    executeFast = sQLiteDatabase.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                } else {
                    SQLiteDatabase sQLiteDatabase2 = this.f16333b;
                    executeFast = sQLiteDatabase2.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                }
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j10);
                if (i11 != 0) {
                    sQLitePreparedStatement.bindLong(2, j11);
                    i12 = 3;
                }
                sQLitePreparedStatement.bindInteger(i12, 1);
                sQLitePreparedStatement.bindInteger(i12 + 1, 1);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    public final org.telegram.tgnet.TLRPC.ChatFull G0(final long r24, boolean r26, final boolean r27, final boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.G0(long, boolean, boolean, boolean):org.telegram.tgnet.TLRPC$ChatFull");
    }

    public final void G1(ArrayList arrayList, ArrayList arrayList2, long j10, int i10) {
        if (arrayList == null && arrayList2 == null && j10 == 0) {
            return;
        }
        this.f16331a.c(new d2(this, arrayList, arrayList2, i10, j10));
    }

    public final void H() {
        try {
            this.P.await();
        } catch (Throwable unused) {
        }
    }

    public final org.telegram.tgnet.TLRPC.TL_messages_dialogs H0(java.util.ArrayList r22, java.util.ArrayList r23, java.util.ArrayList r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.H0(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):org.telegram.tgnet.TLRPC$TL_messages_dialogs");
    }

    public final void H1(int i10) {
        H();
        this.f16339n = i10;
    }

    public final void I(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        r5 r5Var = this.f16331a;
        if (currentThread != r5Var) {
            r5Var.c(runnable);
        } else {
            runnable.run();
        }
    }

    public final void I0(ArrayList arrayList) {
        try {
            a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((w00) arrayList.get(i10)).f18959i && !((w00) arrayList.get(i10)).f18960j && ((w00) arrayList.get(i10)).f18958g != null) {
                    long j10 = ((w00) arrayList.get(i10)).f18958g.grouped_id;
                    if (j10 != 0) {
                        ArrayList arrayList2 = (ArrayList) hVar.f(j10);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            hVar.k(arrayList2, j10);
                        }
                        arrayList2.add((w00) arrayList.get(i10));
                    }
                }
            }
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                long j11 = hVar.j(i11);
                ArrayList arrayList3 = (ArrayList) hVar.n(i11);
                SQLiteDatabase sQLiteDatabase = this.f16333b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + ((w00) arrayList3.get(0)).f18955b + " AND group_id = " + j11 + " ORDER BY date DESC", new Object[0]);
                ArrayList arrayList4 = null;
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, e20.i(this.currentAccount).f15524n);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(new kj(this.currentAccount, TLdeserialize, false, false));
                }
                queryFinalized.dispose();
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((w00) arrayList3.get(i12)).h = arrayList4;
                }
            }
        } catch (Throwable th2) {
            o(th2, true);
        }
    }

    public final void I1(int i10) {
        H();
        this.f16340r = i10;
    }

    public final void J0(ArrayList arrayList, long j10) {
        if (arrayList != null) {
            try {
                a0.h hVar = new a0.h();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((TLRPC.TL_forumTopic) arrayList.get(i10)).topMessage != null) {
                        long j11 = ((TLRPC.TL_forumTopic) arrayList.get(i10)).topMessage.grouped_id;
                        if (j11 != 0) {
                            ArrayList arrayList2 = (ArrayList) hVar.f(j11);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                hVar.k(arrayList2, j11);
                            }
                            arrayList2.add((TLRPC.TL_forumTopic) arrayList.get(i10));
                        }
                    }
                }
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    long j12 = hVar.j(i11);
                    ArrayList arrayList3 = (ArrayList) hVar.n(i11);
                    SQLiteDatabase sQLiteDatabase = this.f16333b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND group_id = " + j12 + " ORDER BY date DESC", new Object[0]);
                    ArrayList<kj> arrayList4 = null;
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize != null) {
                            TLdeserialize.readAttachPath(byteBufferValue, e20.i(this.currentAccount).f15524n);
                        }
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList<>();
                        }
                        arrayList4.add(new kj(this.currentAccount, TLdeserialize, false, false));
                    }
                    queryFinalized.dispose();
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        ((TLRPC.TL_forumTopic) arrayList3.get(i12)).groupedMessages = arrayList4;
                    }
                }
            } catch (Throwable th2) {
                o(th2, true);
            }
        }
    }

    public final void J1(int i10) {
        H();
        this.f16341s = i10;
    }

    public final void K0(a0.h r22, a0.h r23, java.util.ArrayList r24, java.util.ArrayList r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.K0(a0.h, a0.h, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public final void K1(int i10) {
        H();
        this.f16342w = i10;
    }

    public final void L(String str, ArrayList arrayList) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f16333b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM animated_emoji WHERE document_id IN (" + str + ")", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    try {
                        TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (TLdeserialize != null && TLdeserialize.f19800id != 0) {
                            arrayList.add(TLdeserialize);
                        }
                    } catch (Exception e) {
                        o(e, true);
                    }
                    if (byteBufferValue != null) {
                        byteBufferValue.reuse();
                    }
                }
            } catch (SQLiteException e7) {
                e7.printStackTrace();
                if (sQLiteCursor == null) {
                    return;
                }
            }
            sQLiteCursor.dispose();
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public final ArrayList L0(HashSet hashSet) {
        ArrayList arrayList = new ArrayList();
        try {
            String join = TextUtils.join(",", hashSet);
            SQLiteDatabase sQLiteDatabase = this.f16333b;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid IN(" + join + ")", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.UserFull TLdeserialize = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                    arrayList.add(TLdeserialize);
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
            return arrayList;
        } catch (Exception e) {
            o(e, true);
            return arrayList;
        }
    }

    public final void M(String str, RequestDelegate requestDelegate) {
        if (str != null) {
            this.f16331a.c(new dg(this, getConnectionsManager().getCurrentTime(), str, requestDelegate, 15));
        }
    }

    public final void M0(int r32, java.lang.String r33, java.util.ArrayList r34, java.util.ArrayList r35, java.util.ArrayList r36, java.util.ArrayList r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.M0(int, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public final void M1(long j10, TLRPC.TL_chatBannedRights tL_chatBannedRights, int i10) {
        if (tL_chatBannedRights != null && j10 != 0) {
            this.f16331a.c(new sk(this, j10, i10, tL_chatBannedRights, 8));
        }
    }

    public final int N(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Integer[] numArr = {0};
        this.f16331a.c(new xm(this, j10, numArr, countDownLatch, 14));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            o(e, true);
        }
        return numArr[0].intValue();
    }

    public final void N0(int i10, TLRPC.Message message) {
        this.f16331a.c(new o7(this, i10, message, 1));
    }

    public final void N1(TLRPC.ChatFull chatFull, boolean z10) {
        this.f16331a.c(new xf(this, chatFull, z10, 11));
    }

    public final TLRPC.Chat O(long j10) {
        try {
            ArrayList arrayList = new ArrayList();
            Q("" + j10, arrayList);
            if (arrayList.isEmpty()) {
                return null;
            }
            return (TLRPC.Chat) arrayList.get(0);
        } catch (Exception e) {
            o(e, true);
            return null;
        }
    }

    public final void O0(java.lang.String r19, java.lang.String r20, long r21, long r23, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.O0(java.lang.String, java.lang.String, long, long, int, boolean):void");
    }

    public final void O1(TLRPC.ChatParticipants chatParticipants) {
        if (chatParticipants == null) {
            return;
        }
        this.f16331a.c(new pi(28, this, chatParticipants));
    }

    public final TLRPC.Chat P(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.Chat[] chatArr = new TLRPC.Chat[1];
        this.f16331a.c(new xm(this, chatArr, j10, countDownLatch, 15));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            o(e, true);
        }
        return chatArr[0];
    }

    public final ArrayList P0(long j10, ArrayList arrayList, boolean z10, boolean z11, int i10, int i11) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (z10) {
            this.f16331a.c(new xp(this, j10, arrayList, z11, i10, i11));
            return null;
        }
        return Q0(i10, i11, j10, arrayList, z11);
    }

    public final void P1(int i10) {
        i0.g3(new cr(this, 4));
        f8.b("MessagesStorage start db migration from " + i10 + " to 181");
        int c10 = n5.c(this, this.f16333b, i10);
        f8.b("MessagesStorage db migration finished to varsion " + c10);
        i0.g3(new cr(this, 5));
    }

    public final void Q(String str, ArrayList arrayList) {
        if (str != null && str.length() != 0 && arrayList != null) {
            SQLiteDatabase sQLiteDatabase = this.f16333b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.n("SELECT data FROM chats WHERE uid IN(", str, ")"), new Object[0]);
            ArrayList arrayList2 = null;
            while (queryFinalized.next()) {
                try {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false, true);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            arrayList.add(TLdeserialize);
                            if (TLdeserialize.linked_monoforum_id != 0) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(Long.valueOf(TLdeserialize.linked_monoforum_id));
                            }
                            if (TLdeserialize.linked_community_id != 0) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(Long.valueOf(TLdeserialize.linked_community_id));
                            }
                        }
                    }
                } catch (Exception e) {
                    o(e, true);
                }
            }
            queryFinalized.dispose();
            if (arrayList2 != null) {
                SQLiteDatabase sQLiteDatabase2 = this.f16333b;
                Locale locale2 = Locale.US;
                SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized(a1.g.n("SELECT data FROM chats WHERE uid IN(", TextUtils.join(", ", arrayList2), ")"), new Object[0]);
                while (queryFinalized2.next()) {
                    try {
                        NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                        if (byteBufferValue2 != null) {
                            TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false, true);
                            byteBufferValue2.reuse();
                            if (TLdeserialize2 != null) {
                                arrayList.add(TLdeserialize2);
                            }
                        }
                    } catch (Exception e7) {
                        o(e7, true);
                    }
                }
                queryFinalized2.dispose();
            }
        }
    }

    public final java.util.ArrayList Q0(int r47, int r48, long r49, java.util.ArrayList r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.Q0(int, int, long, java.util.ArrayList, boolean):java.util.ArrayList");
    }

    public final void Q1(long j10, int i10, boolean z10, boolean z11) {
        String str;
        String str2;
        if (!z11) {
            str = "unread_poll_votes";
        } else {
            str = "unread_reactions";
        }
        if (!z11) {
            str2 = "unread_poll_votes";
        } else {
            str2 = "unread_reactions";
        }
        this.f16331a.c(new er(this, z10, str, j10, i10, str2));
    }

    public final SQLiteDatabase R() {
        return this.f16333b;
    }

    public final void R0(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray) {
        this.f16331a.c(new vl(this, longSparseIntArray, longSparseIntArray2, sparseIntArray, 19));
    }

    public final void R1(long j10, long j11, ArrayList arrayList, ArrayList arrayList2) {
        I(new n9(this, j10, j11, arrayList, arrayList2, 5));
    }

    public final long S() {
        long j10;
        File file = this.f16335c;
        if (file != null) {
            j10 = file.length();
        } else {
            j10 = 0;
        }
        File file2 = this.e;
        if (file2 != null) {
            return file2.length() + j10;
        }
        return j10;
    }

    public final void S0(int i10, int i11, long j10, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f16331a.c(new e1(i11, i10, j10, arrayList, this));
        }
    }

    public final void S1(long r24, long r26, java.util.ArrayList r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.S1(long, long, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final int T(long j10) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                int i10 = -1;
                if (this.J.f(j10) == null) {
                    sQLiteCursor = this.f16333b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
                    if (sQLiteCursor.next()) {
                        i10 = sQLiteCursor.intValue(0);
                    }
                    sQLiteCursor.dispose();
                }
                return i10;
            } catch (Exception e) {
                o(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return 0;
            }
        } finally {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        }
    }

    public final void T0(int r11, long r12, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.T0(int, long, java.util.ArrayList):void");
    }

    public final void T1(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, a0.h hVar, LongSparseIntArray longSparseIntArray3) {
        if (t0(longSparseIntArray) && t0(longSparseIntArray2) && s0(hVar) && t0(longSparseIntArray3)) {
            return;
        }
        this.f16331a.c(new dn(this, longSparseIntArray, longSparseIntArray2, hVar, longSparseIntArray3, 11));
    }

    public final int U(final long j10, final boolean z10) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.f16331a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.run():void");
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            o(e, true);
        }
        return numArr[0].intValue();
    }

    public final void U0(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            i0.g3(new yp(this, arrayList, 5));
        }
    }

    public final void U1(java.util.ArrayList r26, org.telegram.messenger.support.LongSparseIntArray r27, org.telegram.messenger.support.LongSparseIntArray r28, a0.h r29, org.telegram.messenger.support.LongSparseIntArray r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.U1(java.util.ArrayList, org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, a0.h, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public final void V(String str, ArrayList arrayList, ArrayList arrayList2) {
        if (str != null && str.length() != 0) {
            SQLiteDatabase sQLiteDatabase = this.f16333b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.n("SELECT data, user, g, authkey, ttl, layer, seq_in, seq_out, use_count, exchange_id, key_date, fprint, fauthkey, khash, in_seq_no, admin_id, mtproto_seq FROM enc_chats WHERE uid IN(", str, ")"), new Object[0]);
            while (queryFinalized.next()) {
                try {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.EncryptedChat TLdeserialize = TLRPC.EncryptedChat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
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
                    o(e, true);
                }
            }
            queryFinalized.dispose();
        }
    }

    public final void V0(int i10) {
        if (!ks.f16782a) {
            int i11 = 0;
            while (!ks.f16782a) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i11++;
                if (i11 > 5) {
                    break;
                }
            }
        }
        File h = w0.h();
        if (this.currentAccount != 0) {
            File file = new File(h, a1.g.p(new StringBuilder("account"), this.currentAccount, "/"));
            file.mkdirs();
            h = file;
        }
        this.f16335c = new File(h, "cache4.db");
        this.d = new File(h, "cache4.db-wal");
        this.e = new File(h, "cache4.db-shm");
        this.O = false;
        boolean exists = this.f16335c.exists();
        int i12 = 3;
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.f16335c.getPath());
            this.f16333b = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.f16333b.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            this.f16333b.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
            this.f16333b.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            if (!exists) {
                if (v2.f18578a) {
                    f8.b("create new database");
                }
                A(this.f16333b);
            } else {
                int intValue = this.f16333b.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (v2.f18578a) {
                    f8.b("current db version = " + intValue);
                }
                if (intValue != 0) {
                    try {
                        SQLiteCursor queryFinalized = this.f16333b.queryFinalized("SELECT seq, pts, date, qts, lsv, sg, pbytes FROM params WHERE id = 1", new Object[0]);
                        if (queryFinalized.next()) {
                            this.f16342w = queryFinalized.intValue(0);
                            this.f16340r = queryFinalized.intValue(1);
                            this.f16339n = queryFinalized.intValue(2);
                            this.f16341s = queryFinalized.intValue(3);
                            this.f16343x = queryFinalized.intValue(4);
                            this.D = queryFinalized.intValue(5);
                            if (queryFinalized.isNull(6)) {
                                this.f16344y = null;
                            } else {
                                byte[] byteArrayValue = queryFinalized.byteArrayValue(6);
                                this.f16344y = byteArrayValue;
                                if (byteArrayValue != null && byteArrayValue.length == 1) {
                                    this.f16344y = null;
                                }
                            }
                        }
                        queryFinalized.dispose();
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        if (e7.getMessage() != null && e7.getMessage().contains("malformed")) {
                            throw new RuntimeException("malformed");
                        }
                        try {
                            this.f16333b.executeFast("CREATE TABLE IF NOT EXISTS params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
                            this.f16333b.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
                        } catch (Exception e10) {
                            f8.g(e10, true);
                        }
                    }
                    if (intValue < 181) {
                        try {
                            P1(intValue);
                        } catch (Exception e11) {
                            boolean z10 = v2.f18578a;
                            f8.g(e11, true);
                            throw new RuntimeException("malformed");
                        }
                    }
                } else {
                    throw new Exception("malformed");
                }
            }
            this.O = true;
        } catch (Exception e12) {
            f8.g(e12, true);
            if (i10 < 3 && e12.getMessage() != null && e12.getMessage().contains("malformed")) {
                if (i10 == 2) {
                    p(true);
                    s();
                } else {
                    p(false);
                }
                if (i10 == 1) {
                    i12 = 2;
                }
                V0(i12);
                return;
            }
        }
        i0.g3(new cr(this, 2));
        this.f16331a.c(new cr(this, 26));
        this.f16331a.c(new cr(this, 21));
        this.f16331a.c(new cr(this, 27));
        try {
            this.P.countDown();
        } catch (Throwable unused) {
        }
        i0.g3(new cr(this, 3));
    }

    public final void V1(TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.f16331a.c(new lq(this, encryptedChat, 1));
    }

    public final org.telegram.tgnet.tl.TL_ephemeral.EphemeralMessage W(int r5, long r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.W(int, long):org.telegram.tgnet.tl.TL_ephemeral$EphemeralMessage");
    }

    public final void W0(ArrayList arrayList, mk mkVar) {
        if (arrayList != null && !arrayList.isEmpty()) {
            I(new lg(this, arrayList, mkVar, 16));
        }
    }

    public final void W1(org.telegram.messenger.support.LongSparseIntArray r31, org.telegram.messenger.support.LongSparseIntArray r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.W1(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, boolean):void");
    }

    public final ArrayList X(long j10, long j11) {
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.f16333b.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = ? AND topic_id = ? AND date >= ? ORDER BY date DESC LIMIT 30", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(getConnectionsManager().getCurrentTime() - 172800));
                while (sQLiteCursor.next()) {
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) sQLiteCursor.tlObjectValue(0, new e9(19), false);
                    if (ephemeralMessage != null && ephemeralMessage.anchor_msg_id == 0) {
                        arrayList.add(ephemeralMessage);
                    }
                }
                sQLiteCursor.dispose();
                return arrayList;
            } catch (Exception e) {
                o(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return arrayList;
            }
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public final void X0(ArrayList arrayList, lk lkVar) {
        if (arrayList != null && !arrayList.isEmpty()) {
            I(new lg(this, arrayList, lkVar, 23));
        }
    }

    public final void X1(long j10, TLRPC.Message message) {
        this.f16331a.c(new d4(this, message, j10, 29));
    }

    public final ArrayList Y(ArrayList arrayList, long j10) {
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            SQLiteCursor sQLiteCursor = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.f16333b;
                    Locale locale = Locale.US;
                    String join = TextUtils.join(",", arrayList);
                    sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = " + j10 + " AND id IN (" + join + ")", new Object[0]);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_ephemeral.EphemeralMessage TLdeserialize = TL_ephemeral.EphemeralMessage.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                arrayList2.add(TLdeserialize);
                            }
                        }
                    }
                    sQLiteCursor.dispose();
                    return arrayList2;
                } catch (Exception e) {
                    o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            } catch (Throwable th2) {
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                throw th2;
            }
        }
        return arrayList2;
    }

    public final void Y0(TLRPC.TL_messages_dialogs tL_messages_dialogs, TLRPC.TL_messages_dialogs tL_messages_dialogs2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SparseArray sparseArray, ArrayList arrayList4, HashMap hashMap, HashSet hashSet, Runnable runnable) {
        int i10;
        m1(arrayList, arrayList2, true, false);
        int size = sparseArray.size();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < size) {
            C((bp) sparseArray.valueAt(i11));
            i11++;
            z10 = true;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            bp bpVar = (bp) this.I.get(((Integer) it.next()).intValue());
            if (bpVar != null) {
                bpVar.e = -1;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            bp bpVar2 = (bp) this.I.get(((Integer) entry.getKey()).intValue());
            if (bpVar2 != null) {
                Iterator it2 = ((HashSet) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    bpVar2.f15006j.delete(((Long) it2.next()).longValue());
                }
                z10 = true;
            }
        }
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            x1((bp) arrayList3.get(i12), false);
            i12++;
            z10 = true;
        }
        int size3 = this.H.size();
        boolean z11 = false;
        for (int i13 = 0; i13 < size3; i13++) {
            bp bpVar3 = (bp) this.H.get(i13);
            int indexOf = arrayList4.indexOf(Integer.valueOf(bpVar3.f15000a));
            if (bpVar3.f15003f != indexOf) {
                bpVar3.f15003f = indexOf;
                z11 = true;
                z10 = true;
            }
        }
        if (z11) {
            Collections.sort(this.H, new ck(13));
            z1();
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        j(true);
        wp messagesController = getMessagesController();
        ArrayList arrayList5 = new ArrayList(this.H);
        messagesController.getClass();
        Utilities.d.c(new kn(messagesController, tL_messages_dialogs, null, tL_messages_dialogs2, i10, arrayList5, arrayList, arrayList2, runnable));
    }

    public final void Y1(long j10, TLRPC.Poll poll, TLRPC.PollResults pollResults) {
        this.f16331a.c(new xm(this, j10, poll, pollResults, 17));
    }

    public final int Z(long j10) {
        LongSparseIntArray longSparseIntArray = this.R;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 == -1) {
            i10 = 0;
            if (j10 < 0) {
                TLRPC.Chat O = O(-j10);
                if (O != null && O.forum) {
                    i10 = O.forum_tabs ? 3 : 1;
                }
                if (O != null && O.monoforum) {
                    i10 |= 4;
                }
            } else {
                TLRPC.User j02 = j0(j10);
                if (j02 != null && j02.bot_forum_view) {
                    i10 = 8;
                }
            }
            longSparseIntArray.put(j10, i10);
        }
        return i10;
    }

    public final void Z0(HashMap hashMap, boolean z10, boolean z11) {
        if (hashMap.isEmpty() && !z10 && !z11) {
            return;
        }
        this.f16331a.c(new xf(this, hashMap, z10, 2));
    }

    public final void Z1(long j10, int i10, TLRPC.TL_messageReactions tL_messageReactions) {
        this.f16331a.c(new sk(this, i10, j10, tL_messageReactions, 9));
    }

    public final void a1(a0.h hVar, a0.h hVar2, a0.h hVar3, boolean z10) {
        if (s0(hVar) && s0(hVar2) && s0(hVar3)) {
            return;
        }
        this.f16331a.c(new sn(this, hVar, hVar2, hVar3, z10, 3));
    }

    public final long[] a2(long r35, long r37, java.lang.Integer r39, int r40, int r41, int r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.a2(long, long, java.lang.Integer, int, int, int, int):long[]");
    }

    public final boolean b(org.telegram.tgnet.TLRPC.Message r11, java.util.ArrayList r12, java.util.ArrayList r13, java.util.ArrayList r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.b(org.telegram.tgnet.TLRPC$Message, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean):boolean");
    }

    public final TLRPC.Message b0(long j10, long j11) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        this.f16331a.c(new n9(this, j10, j11, atomicReference, countDownLatch, 4));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            o(e, true);
        }
        return (TLRPC.Message) atomicReference.get();
    }

    public final void b1(List list) {
        if (list != null && !list.isEmpty()) {
            SQLitePreparedStatement executeFast = this.f16333b.executeFast("REPLACE INTO chats VALUES(?, ?, ?)");
            for (int i10 = 0; i10 < list.size(); i10++) {
                TLRPC.Chat chat = (TLRPC.Chat) list.get(i10);
                if (chat.min) {
                    SQLiteDatabase sQLiteDatabase = this.f16333b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.l(chat.f19794id, "SELECT data FROM chats WHERE uid = "), new Object[0]);
                    if (queryFinalized.next()) {
                        try {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    TLdeserialize.title = chat.title;
                                    TLdeserialize.photo = chat.photo;
                                    TLdeserialize.broadcast = chat.broadcast;
                                    TLdeserialize.verified = chat.verified;
                                    TLdeserialize.megagroup = chat.megagroup;
                                    TLdeserialize.call_not_empty = chat.call_not_empty;
                                    TLdeserialize.call_active = chat.call_active;
                                    TLdeserialize.monoforum = chat.monoforum;
                                    TLdeserialize.broadcast_messages_allowed = chat.broadcast_messages_allowed;
                                    if ((chat.flags2 & 262144) != 0) {
                                        TLdeserialize.linked_monoforum_id = chat.linked_monoforum_id;
                                        TLdeserialize.flags2 |= 262144;
                                    }
                                    if (v7.u7.a(chat.flags2, 1048576)) {
                                        TLdeserialize.linked_community_id = chat.linked_community_id;
                                        TLdeserialize.flags2 |= 1048576;
                                    }
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                                    if (tL_chatBannedRights != null) {
                                        TLdeserialize.default_banned_rights = tL_chatBannedRights;
                                        TLdeserialize.flags |= 262144;
                                    }
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                                    if (tL_chatAdminRights != null) {
                                        TLdeserialize.admin_rights = tL_chatAdminRights;
                                        TLdeserialize.flags |= 16384;
                                    }
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                                    if (tL_chatBannedRights2 != null) {
                                        TLdeserialize.banned_rights = tL_chatBannedRights2;
                                        TLdeserialize.flags |= 32768;
                                    }
                                    String str = chat.username;
                                    if (str != null) {
                                        TLdeserialize.username = str;
                                        TLdeserialize.flags |= 64;
                                    } else {
                                        TLdeserialize.username = null;
                                        TLdeserialize.flags &= -65;
                                    }
                                    int i11 = chat.participants_count;
                                    if (i11 > 0) {
                                        TLdeserialize.participants_count = i11;
                                    }
                                    chat = TLdeserialize;
                                }
                            }
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                    queryFinalized.dispose();
                }
                executeFast.requery();
                chat.flags |= 131072;
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize());
                chat.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, chat.f19794id);
                String str2 = chat.title;
                if (str2 != null) {
                    executeFast.bindString(2, str2.toLowerCase());
                } else {
                    executeFast.bindString(2, "");
                }
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                this.R.delete(-chat.f19794id);
            }
            executeFast.dispose();
        }
    }

    public final void b2(final int i10, final long j10, final long j11, final String str, final boolean z10) {
        this.f16331a.c(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_message e02;
                SQLitePreparedStatement executeFast;
                is isVar = is.this;
                int i11 = i10;
                long j12 = j10;
                boolean z11 = z10;
                long j13 = j11;
                String str2 = str;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        isVar.f16333b.beginTransaction();
                        e02 = isVar.e0(i11, j12);
                        e02.voiceTranscriptionFinal = z11;
                        e02.voiceTranscriptionId = j13;
                        e02.voiceTranscription = str2;
                        executeFast = isVar.f16333b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e) {
                    e = e;
                }
                try {
                    executeFast.requery();
                    NativeByteBuffer c10 = yi.c(e02);
                    if (c10 != null) {
                        executeFast.bindByteBuffer(1, c10);
                    } else {
                        executeFast.bindNull(1);
                    }
                    executeFast.bindInteger(2, i11);
                    executeFast.bindLong(3, j12);
                    executeFast.step();
                    executeFast.dispose();
                    isVar.f16333b.commitTransaction();
                    if (c10 != null) {
                        c10.reuse();
                    }
                    SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLitePreparedStatement = executeFast;
                    isVar.o(e, true);
                    SQLiteDatabase sQLiteDatabase2 = isVar.f16333b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = executeFast;
                    SQLiteDatabase sQLiteDatabase3 = isVar.f16333b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            }
        });
    }

    public final TLRPC.Message c0(long j10, long j11) {
        TLRPC.Message message;
        SQLiteCursor sQLiteCursor = null;
        TLRPC.Message message2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        try {
            try {
                SQLiteCursor queryFinalized = this.f16333b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND mid = " + j11 + " LIMIT 1", new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().f15524n);
                            }
                            byteBufferValue.reuse();
                            message2 = TLdeserialize;
                        }
                    } catch (Exception e) {
                        e = e;
                        TLRPC.Message message3 = message2;
                        sQLiteCursor = queryFinalized;
                        message = message3;
                        o(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        return message;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = queryFinalized;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                }
                queryFinalized.dispose();
                return message2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            e = e7;
            message = null;
        }
    }

    public final void c1(ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty() && !z10) {
            return;
        }
        this.f16331a.c(new kq(this, z10, new ArrayList(arrayList)));
    }

    public final void c2(final long j10, final ArrayList arrayList, final boolean z10, final int i10, final int i11, final boolean z11, final HashMap hashMap) {
        this.f16331a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zr.run():void");
            }
        });
    }

    public final void d1(TLRPC.messages_Dialogs messages_dialogs, int i10) {
        if (messages_dialogs.dialogs.isEmpty()) {
            return;
        }
        this.f16331a.c(new o7(this, messages_dialogs, i10, 18));
    }

    public final void d2(long j10, long j11, int i10, int i11) {
        this.f16331a.c(new mg(this, j10, j11, i10, i11, 2));
    }

    public final TLRPC.TL_message e0(int i10, long j10) {
        SQLiteCursor queryFinalized;
        boolean z10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.f16333b.queryFinalized("SELECT custom_params FROM messages_v2 WHERE mid = ? AND uid = ?", Integer.valueOf(i10), Long.valueOf(j10));
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (queryFinalized.next()) {
                yi.b(tL_message, queryFinalized.byteBufferValue(0));
                z10 = true;
            } else {
                z10 = false;
            }
            queryFinalized.dispose();
            if (!z10) {
                sQLiteCursor = this.f16333b.queryFinalized("SELECT custom_params FROM messages_topics WHERE mid = ? AND uid = ?", Integer.valueOf(i10), Long.valueOf(j10));
                if (sQLiteCursor.next()) {
                    yi.b(tL_message, sQLiteCursor.byteBufferValue(0));
                }
                sQLiteCursor.dispose();
                return tL_message;
            }
        } catch (SQLiteException e7) {
            e = e7;
            sQLiteCursor = queryFinalized;
            o(e, true);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            return tL_message;
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        return tL_message;
    }

    public final void e1(org.telegram.tgnet.TLRPC.messages_Dialogs r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.e1(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public final void e2(final long r23, final long r25, final int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.e2(long, long, int, int):void");
    }

    public final void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16331a.c(new lg(this, str, str2, 19));
    }

    public final org.telegram.messenger.kr f0(long r83, long r85, int r87, int r88, int r89, int r90, int r91, int r92, int r93, long r94, int r96, boolean r97, boolean r98, org.telegram.messenger.m00 r99) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.f0(long, long, int, int, int, int, int, int, int, long, int, boolean, boolean, org.telegram.messenger.m00):org.telegram.messenger.kr");
    }

    public final void f1(ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        I(new kq(this, arrayList, z10, 1));
    }

    public final void f2(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        int currentTime = getConnectionsManager().getCurrentTime();
        if (tL_forumTopic == null) {
            return;
        }
        this.f16331a.c(new e1(this, i10, tL_forumTopic, j10, currentTime));
    }

    public final void g(SQLitePreparedStatement sQLitePreparedStatement, TLRPC.Message message) {
        ArrayList<TLRPC.ReactionCount> arrayList;
        long j10;
        String str;
        long e = getUserConfig().e();
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions != null && tL_messageReactions.reactions_as_tags && (arrayList = tL_messageReactions.results) != null && !arrayList.isEmpty()) {
            dd D0 = dd.D0();
            String str2 = message.message;
            if (str2 == null) {
                str2 = "";
            }
            int i10 = 0;
            String R0 = D0.R0(str2, true, false);
            ArrayList<TLRPC.ReactionCount> arrayList2 = message.reactions.results;
            int size = arrayList2.size();
            while (i10 < size) {
                TLRPC.ReactionCount reactionCount = arrayList2.get(i10);
                i10++;
                TLRPC.ReactionCount reactionCount2 = reactionCount;
                TLRPC.Reaction reaction = reactionCount2.reaction;
                if ((reaction instanceof TLRPC.TL_reactionEmoji) || (reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, message.f19815id);
                    sQLitePreparedStatement.bindLong(2, kj.R1(e, message));
                    TLRPC.Reaction reaction2 = reactionCount2.reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        j10 = ((TLRPC.TL_reactionEmoji) reaction2).emoticon.hashCode();
                    } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                        j10 = ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
                    } else {
                        j10 = 0;
                    }
                    sQLitePreparedStatement.bindLong(3, j10);
                    if (R0 == null) {
                        str = "";
                    } else {
                        str = R0;
                    }
                    sQLitePreparedStatement.bindString(4, str);
                    sQLitePreparedStatement.step();
                }
            }
        }
    }

    public final Object[] g0(int i10, String str) {
        if (str == null || str.toLowerCase().endsWith("attheme")) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Object[] objArr = new Object[2];
        this.f16331a.c(new lk(this, str, i10, objArr, countDownLatch, 3));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            o(e, true);
        }
        if (objArr[0] == null) {
            return null;
        }
        return objArr;
    }

    public final void g1(ArrayList arrayList, boolean z10) {
        SQLitePreparedStatement sQLitePreparedStatement = 0;
        if (z10) {
            try {
                try {
                    this.f16333b.beginTransaction();
                } catch (Exception e) {
                    o(e, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                throw th2;
            }
        }
        sQLitePreparedStatement = this.f16333b.executeFast("INSERT OR REPLACE INTO ephemeral_messages (dialog_id, id, topic_id, date, data) VALUES (?, ?, ?, ?, ?);");
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (!ephemeralMessage.welcome) {
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, o5.o(ephemeralMessage.peer_id));
                sQLitePreparedStatement.bindInteger(2, ephemeralMessage.f20008id);
                sQLitePreparedStatement.bindInteger(3, ephemeralMessage.top_msg_id);
                sQLitePreparedStatement.bindInteger(4, ephemeralMessage.date);
                sQLitePreparedStatement.bindTlObject(5, ephemeralMessage);
                sQLitePreparedStatement.step();
            }
        }
        if (z10) {
            this.f16333b.commitTransaction();
        }
        if (sQLitePreparedStatement != null) {
            sQLitePreparedStatement.dispose();
        }
    }

    public final void g2(long r10, long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.g2(long, long, long):void");
    }

    public final void h() {
        i0.g3(new cr(this, 14));
    }

    public final HashMap h0() {
        HashMap hashMap = new HashMap();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.f16333b.queryFinalized("SELECT uid, info, participants_count FROM chat_settings_v2 WHERE participants_count > 1", new Object[0]);
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    int intValue = sQLiteCursor.intValue(2);
                    if (byteBufferValue != null) {
                        TLRPC.ChatFull TLdeserialize = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize instanceof TLRPC.TL_channelFull) {
                            hashMap.put(Long.valueOf(longValue), Integer.valueOf(intValue));
                        }
                    }
                }
                sQLiteCursor.dispose();
                return hashMap;
            } catch (Exception e) {
                o(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return hashMap;
            }
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public final void h1(int i10, int i11, int i12, long j10, long j11, TLRPC.messages_Messages messages_messages, boolean z10) {
        this.f16331a.c(new tg(this, i12, messages_messages, j10, j11, i10, i11, z10));
    }

    public final void h2(int i10, long j10, long j11, boolean z10) {
        this.f16331a.c(new eq(this, j11, z10, "unread_poll_votes", j10, i10, "poll_votes_mentions_topics", "unread_poll_votes", "poll_votes_mentions"));
    }

    public final void i(Long l4) {
        int i10;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f16333b;
                Locale locale = Locale.US;
                i10 = 0;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM scheduled_messages_v2 WHERE uid = " + l4, new Object[0]);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (queryFinalized.next()) {
                i10 = queryFinalized.intValue(0);
            }
            queryFinalized.dispose();
            i0.g3(new o7(this, l4, i10, 17));
        } catch (Exception e7) {
            e = e7;
            sQLiteCursor = queryFinalized;
            o(e, true);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public final r5 i0() {
        return this.f16331a;
    }

    public final void i1(int i10, int i11, long j10, ArrayList arrayList, boolean z10) {
        j1(arrayList, z10, true, false, i10, false, i11, j10);
    }

    public final void i2(int i10, long j10, long j11, boolean z10) {
        this.f16331a.c(new eq(this, j11, z10, "unread_reactions", j10, i10, "reaction_mentions_topics", "unread_reactions", "reaction_mentions"));
    }

    public final void j(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.j(boolean):void");
    }

    public final TLRPC.User j0(long j10) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(j10));
            n0(arrayList2, arrayList, false);
            if (arrayList.isEmpty()) {
                return null;
            }
            return (TLRPC.User) arrayList.get(0);
        } catch (Exception e) {
            o(e, true);
            return null;
        }
    }

    public final void j1(final ArrayList arrayList, final boolean z10, boolean z11, final boolean z12, final int i10, final boolean z13, final int i11, final long j10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z11) {
                this.f16331a.c(new Runnable() {
                    @Override
                    public final void run() {
                        is.this.k1(arrayList, z10, z12, i10, z13, i11, j10);
                    }
                });
                return;
            }
            k1(arrayList, z10, z12, i10, z13, i11, j10);
        }
    }

    public final void j2(TLRPC.UserFull userFull, boolean z10) {
        this.f16331a.c(new xf(this, userFull, z10, 8));
    }

    public final void k(int i10) {
        SparseArray sparseArray = this.h;
        ArrayList arrayList = (ArrayList) sparseArray.get(i10);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f16331a.a((Runnable) arrayList.get(i11));
        }
        sparseArray.remove(i10);
    }

    public final TLRPC.User k0(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.User[] userArr = new TLRPC.User[1];
        this.f16331a.c(new xm(this, userArr, j10, countDownLatch, 12));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            o(e, true);
        }
        return userArr[0];
    }

    public final void k1(java.util.ArrayList r65, boolean r66, boolean r67, int r68, boolean r69, int r70, long r71) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.k1(java.util.ArrayList, boolean, boolean, int, boolean, int, long):void");
    }

    public final void k2(ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.f16331a.c(new kq(this, arrayList, z10, 0));
    }

    public final void l(int i10) {
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.f16333b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = ?", Integer.valueOf(i10));
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    if (!o5.E(longValue) && !o5.C(longValue)) {
                        TLRPC.Chat O = O(-longValue);
                        if (w3.r0(O) || O.migrated_to != null) {
                        }
                    }
                    z10 = false;
                }
                z10 = true;
                sQLiteCursor.dispose();
                if (z10) {
                    i0.g3(new zp(this, i10, 0));
                    this.f16333b.executeFast("DELETE FROM dialogs WHERE did = " + (2305843009213693952L | i10)).stepThis().dispose();
                }
                sQLiteCursor.dispose();
            } catch (Exception e) {
                o(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public final ArrayList l0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        try {
            n0(arrayList, arrayList2, false);
            return arrayList2;
        } catch (Exception e) {
            arrayList2.clear();
            o(e, true);
            return arrayList2;
        }
    }

    public final void l1(String str, TLObject tLObject, int i10, String str2) {
        if (str != null && tLObject != null && str2 != null) {
            this.f16331a.c(new lk(this, str, tLObject, i10, str2, 4));
        }
    }

    public final void l2(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            try {
                SQLiteDatabase sQLiteDatabase = this.f16333b;
                Locale locale = Locale.US;
                String join = TextUtils.join(",", arrayList);
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT id FROM shortcut_widget WHERE did IN(" + join + ",-1)", new Object[0]);
                ArrayList arrayList2 = null;
                while (queryFinalized.next()) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                }
                queryFinalized.dispose();
                if (arrayList2 != null) {
                    i0.g3(new l(4, arrayList2));
                }
            } catch (Exception e) {
                o(e, true);
            }
        }
    }

    public final boolean m(long j10) {
        boolean[] zArr = new boolean[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f16331a.c(new mq(this, j10, zArr, countDownLatch, 2));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            o(e, true);
        }
        return zArr[0];
    }

    public final void m0(ArrayList arrayList, ArrayList arrayList2) {
        n0(arrayList, arrayList2, false);
    }

    public final void m1(List list, List list2, boolean z10, boolean z11) {
        if (list != null && list.isEmpty() && list2 != null && list2.isEmpty()) {
            return;
        }
        if (z11) {
            this.f16331a.c(new bi.n4(this, list, list2, z10, 19));
            return;
        }
        n1(list, list2, z10);
    }

    public final void n(Exception exc) {
        o(exc, true);
    }

    public final void n0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        if (!arrayList.isEmpty() && arrayList2 != null) {
            if (arrayList.size() > 50) {
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    Long l4 = (Long) arrayList.get(i10);
                    l4.getClass();
                    TLRPC.User Z1 = getMessagesController().Z1(l4);
                    if (Z1 != null) {
                        arrayList2.add(Z1);
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
            }
            if (!arrayList.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = this.f16333b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.n("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", arrayList), ")"), new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                TLRPC.UserStatus userStatus = TLdeserialize.status;
                                if (userStatus != null) {
                                    userStatus.expires = queryFinalized.intValue(1);
                                }
                                arrayList2.add(TLdeserialize);
                                if (arrayList.size() > 50 && z10) {
                                    getMessagesController().U3(TLdeserialize, true, false);
                                }
                            }
                        }
                    } catch (Exception e) {
                        o(e, true);
                    }
                }
                queryFinalized.dispose();
            }
        }
    }

    public final void n1(List list, List list2, boolean z10) {
        if (z10) {
            try {
                try {
                    this.f16333b.beginTransaction();
                } catch (Exception e) {
                    o(e, true);
                    SQLiteDatabase sQLiteDatabase = this.f16333b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                SQLiteDatabase sQLiteDatabase2 = this.f16333b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.commitTransaction();
                }
                throw th2;
            }
        }
        o1(list);
        b1(list2);
        SQLiteDatabase sQLiteDatabase3 = this.f16333b;
        if (sQLiteDatabase3 != null) {
            sQLiteDatabase3.commitTransaction();
        }
    }

    public final void o(java.lang.Throwable r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.o(java.lang.Throwable, boolean):void");
    }

    public final void o0(ArrayList arrayList, HashSet hashSet) {
        if (!hashSet.isEmpty()) {
            if (hashSet.size() > 50) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    TLRPC.User Z1 = getMessagesController().Z1((Long) it.next());
                    if (Z1 != null) {
                        arrayList.add(Z1);
                        it.remove();
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = this.f16333b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.n("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", hashSet), ")"), new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                TLRPC.UserStatus userStatus = TLdeserialize.status;
                                if (userStatus != null) {
                                    userStatus.expires = queryFinalized.intValue(1);
                                }
                                arrayList.add(TLdeserialize);
                            }
                        }
                    } catch (Exception e) {
                        o(e, true);
                    }
                }
                queryFinalized.dispose();
            }
        }
    }

    public final void o1(List list) {
        int i10;
        int i11;
        int i12;
        if (list != null && !list.isEmpty()) {
            SQLitePreparedStatement executeFast = this.f16333b.executeFast("REPLACE INTO users VALUES(?, ?, ?, ?)");
            for (int i13 = 0; i13 < list.size(); i13++) {
                TLRPC.User user = (TLRPC.User) list.get(i13);
                if (user != null) {
                    if (user.min) {
                        SQLiteDatabase sQLiteDatabase = this.f16333b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.l(user.f19943id, "SELECT data FROM users WHERE uid = "), new Object[0]);
                        if (queryFinalized.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    if (TLdeserialize != null) {
                                        String str = user.username;
                                        if (str != null) {
                                            TLdeserialize.username = str;
                                            TLdeserialize.flags |= 8;
                                        } else {
                                            TLdeserialize.username = null;
                                            TLdeserialize.flags &= -9;
                                        }
                                        if (user.apply_min_photo) {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                            if (userProfilePhoto != null) {
                                                TLdeserialize.photo = userProfilePhoto;
                                                TLdeserialize.flags |= 32;
                                            } else {
                                                TLdeserialize.photo = null;
                                                TLdeserialize.flags &= -33;
                                            }
                                        }
                                        user = TLdeserialize;
                                    }
                                }
                            } catch (Exception e) {
                                o(e, true);
                            }
                        }
                        queryFinalized.dispose();
                    }
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(user.getObjectSize());
                    user.serializeToStream(nativeByteBuffer);
                    executeFast.bindLong(1, user.f19943id);
                    executeFast.bindString(2, K(user));
                    TLRPC.UserStatus userStatus = user.status;
                    if (userStatus != null) {
                        if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                            if (userStatus.by_me) {
                                i12 = -1000;
                            } else {
                                i12 = -100;
                            }
                            userStatus.expires = i12;
                        } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                            if (userStatus.by_me) {
                                i11 = -1001;
                            } else {
                                i11 = -101;
                            }
                            userStatus.expires = i11;
                        } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                            if (userStatus.by_me) {
                                i10 = -1002;
                            } else {
                                i10 = -102;
                            }
                            userStatus.expires = i10;
                        }
                        executeFast.bindInteger(3, userStatus.expires);
                    } else {
                        executeFast.bindInteger(3, 0);
                    }
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    this.R.delete(user.f19943id);
                }
            }
            executeFast.dispose();
        }
    }

    public final void p(boolean z10) {
        if (z10) {
            s1();
        } else {
            q();
        }
        SQLiteDatabase sQLiteDatabase = this.f16333b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f16333b = null;
        }
        if (z10) {
            File file = this.f16335c;
            if (file != null) {
                file.delete();
                this.f16335c = null;
            }
            File file2 = this.d;
            if (file2 != null) {
                file2.delete();
                this.d = null;
            }
            File file3 = this.e;
            if (file3 != null) {
                file3.delete();
                this.e = null;
            }
        }
    }

    public final void p0() {
        this.f16331a.c(new cr(this, 23));
    }

    public final void p1(int i10, ArrayList arrayList) {
        this.f16331a.c(new aq(this, i10, arrayList, 0));
    }

    public final void q() {
        this.f16339n = 0;
        this.f16342w = 0;
        this.f16340r = 0;
        this.f16341s = 0;
        this.f16343x = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.H.clear();
        this.I.clear();
        this.J.b();
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.f16344y = null;
        this.D = 0;
    }

    public final void q0(final int i10, final int i11, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final boolean z10) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f16331a.c(new Runnable() {
            @Override
            public final void run() {
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                is isVar = is.this;
                int i12 = i10;
                CountDownLatch countDownLatch2 = countDownLatch;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                        Locale locale = Locale.US;
                        try {
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i12 + " ORDER BY ord ASC", new Object[0]);
                            while (true) {
                                try {
                                    boolean next = queryFinalized.next();
                                    arrayList4 = arrayList;
                                    arrayList5 = arrayList2;
                                    arrayList6 = arrayList3;
                                    if (!next) {
                                        break;
                                    }
                                    long longValue = queryFinalized.longValue(0);
                                    if (longValue != -1) {
                                        arrayList4.add(Long.valueOf(longValue));
                                        if (arrayList5 != null && arrayList6 != null) {
                                            if (o5.E(longValue)) {
                                                arrayList7.add(Long.valueOf(longValue));
                                            } else {
                                                arrayList8.add(Long.valueOf(-longValue));
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    sQLiteCursor = queryFinalized;
                                    isVar.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    countDownLatch2.countDown();
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteCursor = queryFinalized;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    countDownLatch2.countDown();
                                    throw th;
                                }
                            }
                            queryFinalized.dispose();
                            if (!z10 && arrayList4.isEmpty()) {
                                if (i11 == 0) {
                                    SQLiteCursor queryFinalized2 = isVar.f16333b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = 0 ORDER BY pinned DESC, date DESC LIMIT 0,10", new Object[0]);
                                    while (queryFinalized2.next()) {
                                        long longValue2 = queryFinalized2.longValue(0);
                                        if (!o5.D(longValue2)) {
                                            arrayList4.add(Long.valueOf(longValue2));
                                            if (arrayList5 != null && arrayList6 != null) {
                                                if (o5.E(longValue2)) {
                                                    arrayList7.add(Long.valueOf(longValue2));
                                                } else {
                                                    arrayList8.add(Long.valueOf(-longValue2));
                                                }
                                            }
                                        }
                                    }
                                    queryFinalized2.dispose();
                                } else {
                                    SQLiteCursor queryFinalized3 = isVar.getMessagesStorage().f16333b.queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                                    while (queryFinalized3.next()) {
                                        long longValue3 = queryFinalized3.longValue(0);
                                        arrayList4.add(Long.valueOf(longValue3));
                                        if (arrayList5 != null && arrayList6 != null) {
                                            if (o5.E(longValue3)) {
                                                arrayList7.add(Long.valueOf(longValue3));
                                            } else {
                                                arrayList8.add(Long.valueOf(-longValue3));
                                            }
                                        }
                                    }
                                    queryFinalized3.dispose();
                                }
                            }
                            if (arrayList5 != null && arrayList6 != null) {
                                if (!arrayList8.isEmpty()) {
                                    isVar.Q(TextUtils.join(",", arrayList8), arrayList6);
                                }
                                if (!arrayList7.isEmpty()) {
                                    isVar.n0(arrayList7, arrayList5, false);
                                }
                            }
                            countDownLatch2.countDown();
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            o(e, true);
        }
    }

    public final void q1(long j10) {
        this.f16331a.c(new dq(this, j10, 6));
    }

    public final void r(int i10) {
        this.f16331a.c(new zp(this, i10, 5));
    }

    public final boolean r0(a0.h hVar, TLRPC.Chat chat) {
        long j10 = chat.linked_community_id;
        if (j10 != 0) {
            TLRPC.Chat chat2 = (TLRPC.Chat) hVar.f(j10);
            if (chat2 == null) {
                chat2 = O(chat.linked_community_id);
                hVar.k(chat2, chat.linked_community_id);
            }
            if (chat2 != null && chat2.collapsed_in_dialogs) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r1(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        if (message == null || (message instanceof TLRPC.TL_messageEmpty)) {
            return;
        }
        this.f16331a.c(new sn(this, message, z10, arrayList, arrayList2, 1));
    }

    public final void s() {
        for (int i10 = 0; i10 < 2; i10++) {
            getUserConfig().x(i10, 0, 0, 0L, 0L, 0L, 0L);
            getUserConfig().z(i10, 0);
        }
        getUserConfig().v(false);
    }

    public final void s1() {
        q();
        i0.g3(new cr(this, 8));
    }

    public final void t(int r23, long r24, long r26, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.t(int, long, long, int, int):void");
    }

    public final void t1(boolean z10) {
        int size = this.H.size();
        for (int i10 = 0; i10 < size; i10++) {
            bp bpVar = (bp) this.H.get(i10);
            if (z10) {
                int i11 = bpVar.f15004g;
                int i12 = wp.D8;
                if ((i11 & 32) != 0) {
                    bpVar.e = -1;
                }
            } else {
                bpVar.e = -1;
            }
        }
        j(false);
        i0.g3(new cr(this, 24));
    }

    public final void u(int i10, int i11, long j10, long j11, String str) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        int i12;
        int i13;
        int i14;
        int i15;
        SQLiteCursor queryFinalized;
        int i16;
        ArrayList arrayList;
        int i17;
        boolean z10;
        SQLitePreparedStatement executeFast;
        long j12;
        int i18;
        int i19;
        int i20;
        int i21 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        boolean z11 = false;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                try {
                    if (i21 != 0) {
                        i12 = 2;
                        i13 = 3;
                        i14 = 4;
                        i15 = 1;
                        queryFinalized = this.f16333b.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND topic_id = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i11)), new Object[0]);
                    } else {
                        i12 = 2;
                        i13 = 3;
                        i14 = 4;
                        i15 = 1;
                        queryFinalized = this.f16333b.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j10), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i11)), new Object[0]);
                    }
                    sQLiteCursor2 = queryFinalized;
                    ArrayList arrayList2 = null;
                    while (sQLiteCursor2.next()) {
                        try {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            int intValue = sQLiteCursor2.intValue(0);
                            int i22 = i15;
                            int intValue2 = sQLiteCursor2.intValue(i22);
                            if (intValue != intValue2 || intValue != i22) {
                                arrayList2.add(new bs(intValue, intValue2));
                            }
                            i15 = 1;
                        } catch (Exception e) {
                            e = e;
                        }
                    }
                    sQLiteCursor2.dispose();
                    if (arrayList2 != null) {
                        int i23 = 0;
                        while (i23 < arrayList2.size()) {
                            bs bsVar = (bs) arrayList2.get(i23);
                            int i24 = bsVar.f15020b;
                            int i25 = bsVar.f15019a;
                            int i26 = i24 - 1;
                            boolean z12 = z11;
                            int i27 = i21;
                            if (i11 >= i26) {
                                i16 = i23;
                                if (i10 <= i25 + 1) {
                                    if (i27 != 0) {
                                        Long valueOf = Long.valueOf(j10);
                                        Long valueOf2 = Long.valueOf(j11);
                                        Integer valueOf3 = Integer.valueOf(i25);
                                        Integer valueOf4 = Integer.valueOf(i24);
                                        arrayList = arrayList2;
                                        Object[] objArr = new Object[i14];
                                        objArr[z12 ? 1 : 0] = valueOf;
                                        objArr[1] = valueOf2;
                                        objArr[i12] = valueOf3;
                                        objArr[i13] = valueOf4;
                                        this.f16333b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr)).stepThis().dispose();
                                    } else {
                                        arrayList = arrayList2;
                                        Long valueOf5 = Long.valueOf(j10);
                                        Integer valueOf6 = Integer.valueOf(i25);
                                        Integer valueOf7 = Integer.valueOf(i24);
                                        Object[] objArr2 = new Object[i13];
                                        objArr2[z12 ? 1 : 0] = valueOf5;
                                        objArr2[1] = valueOf6;
                                        objArr2[i12] = valueOf7;
                                        this.f16333b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr2)).stepThis().dispose();
                                    }
                                    i19 = i12;
                                    i17 = 3;
                                    z10 = false;
                                    i23 = i16 + 1;
                                    i13 = i17;
                                    i12 = i19;
                                    z11 = z10;
                                    i21 = i27;
                                    arrayList2 = arrayList;
                                    i14 = 4;
                                }
                            } else {
                                i16 = i23;
                            }
                            arrayList = arrayList2;
                            if (i11 >= i26) {
                                if (i24 != i10) {
                                    if (i27 != 0) {
                                        try {
                                            SQLiteDatabase sQLiteDatabase = this.f16333b;
                                            Locale locale = Locale.US;
                                            Long valueOf8 = Long.valueOf(j10);
                                            Long valueOf9 = Long.valueOf(j11);
                                            Integer valueOf10 = Integer.valueOf(i25);
                                            Integer valueOf11 = Integer.valueOf(i24);
                                            Object[] objArr3 = new Object[4];
                                            objArr3[z12 ? 1 : 0] = valueOf8;
                                            objArr3[1] = valueOf9;
                                            objArr3[i12] = valueOf10;
                                            objArr3[3] = valueOf11;
                                            sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr3)).stepThis().dispose();
                                            Long valueOf12 = Long.valueOf(j10);
                                            Long valueOf13 = Long.valueOf(j11);
                                            Integer valueOf14 = Integer.valueOf(i25);
                                            Integer valueOf15 = Integer.valueOf(i10);
                                            Object[] objArr4 = new Object[4];
                                            objArr4[z12 ? 1 : 0] = valueOf12;
                                            objArr4[1] = valueOf13;
                                            objArr4[i12] = valueOf14;
                                            objArr4[3] = valueOf15;
                                            this.f16333b.executeFast(String.format(locale, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr4)).stepThis().dispose();
                                        } catch (Exception e7) {
                                            o(e7, z12);
                                        }
                                    } else {
                                        SQLiteDatabase sQLiteDatabase2 = this.f16333b;
                                        Locale locale2 = Locale.US;
                                        Long valueOf16 = Long.valueOf(j10);
                                        Integer valueOf17 = Integer.valueOf(i25);
                                        Integer valueOf18 = Integer.valueOf(i24);
                                        Object[] objArr5 = new Object[3];
                                        objArr5[z12 ? 1 : 0] = valueOf16;
                                        objArr5[1] = valueOf17;
                                        objArr5[i12] = valueOf18;
                                        sQLiteDatabase2.executeFast(String.format(locale2, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr5)).stepThis().dispose();
                                        Long valueOf19 = Long.valueOf(j10);
                                        Integer valueOf20 = Integer.valueOf(i25);
                                        Integer valueOf21 = Integer.valueOf(i10);
                                        Object[] objArr6 = new Object[3];
                                        objArr6[z12 ? 1 : 0] = valueOf19;
                                        objArr6[1] = valueOf20;
                                        objArr6[i12] = valueOf21;
                                        this.f16333b.executeFast(String.format(locale2, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr6)).stepThis().dispose();
                                    }
                                }
                            } else if (i10 <= i25 + 1) {
                                if (i25 != i11) {
                                    if (i27 != 0) {
                                        try {
                                            SQLiteDatabase sQLiteDatabase3 = this.f16333b;
                                            Locale locale3 = Locale.US;
                                            Long valueOf22 = Long.valueOf(j10);
                                            Long valueOf23 = Long.valueOf(j11);
                                            Integer valueOf24 = Integer.valueOf(i25);
                                            Integer valueOf25 = Integer.valueOf(i24);
                                            Object[] objArr7 = new Object[4];
                                            objArr7[0] = valueOf22;
                                            objArr7[1] = valueOf23;
                                            objArr7[i12] = valueOf24;
                                            objArr7[3] = valueOf25;
                                            sQLiteDatabase3.executeFast(String.format(locale3, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr7)).stepThis().dispose();
                                            Long valueOf26 = Long.valueOf(j10);
                                            Long valueOf27 = Long.valueOf(j11);
                                            Integer valueOf28 = Integer.valueOf(i11);
                                            Integer valueOf29 = Integer.valueOf(i24);
                                            Object[] objArr8 = new Object[4];
                                            objArr8[0] = valueOf26;
                                            objArr8[1] = valueOf27;
                                            objArr8[i12] = valueOf28;
                                            objArr8[3] = valueOf29;
                                            this.f16333b.executeFast(String.format(locale3, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr8)).stepThis().dispose();
                                        } catch (Exception e10) {
                                            o(e10, false);
                                        }
                                    } else {
                                        SQLiteDatabase sQLiteDatabase4 = this.f16333b;
                                        Locale locale4 = Locale.US;
                                        Long valueOf30 = Long.valueOf(j10);
                                        Integer valueOf31 = Integer.valueOf(i25);
                                        Integer valueOf32 = Integer.valueOf(i24);
                                        Object[] objArr9 = new Object[3];
                                        objArr9[0] = valueOf30;
                                        objArr9[1] = valueOf31;
                                        objArr9[i12] = valueOf32;
                                        sQLiteDatabase4.executeFast(String.format(locale4, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr9)).stepThis().dispose();
                                        Long valueOf33 = Long.valueOf(j10);
                                        Integer valueOf34 = Integer.valueOf(i11);
                                        Integer valueOf35 = Integer.valueOf(i24);
                                        Object[] objArr10 = new Object[3];
                                        objArr10[0] = valueOf33;
                                        objArr10[1] = valueOf34;
                                        objArr10[i12] = valueOf35;
                                        this.f16333b.executeFast(String.format(locale4, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr10)).stepThis().dispose();
                                    }
                                }
                            } else {
                                if (i27 != 0) {
                                    Long valueOf36 = Long.valueOf(j10);
                                    Long valueOf37 = Long.valueOf(j11);
                                    Integer valueOf38 = Integer.valueOf(i25);
                                    Integer valueOf39 = Integer.valueOf(i24);
                                    Object[] objArr11 = new Object[4];
                                    objArr11[0] = valueOf36;
                                    objArr11[1] = valueOf37;
                                    objArr11[i12] = valueOf38;
                                    objArr11[3] = valueOf39;
                                    this.f16333b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr11)).stepThis().dispose();
                                    executeFast = this.f16333b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                                    i17 = 3;
                                    z10 = false;
                                } else {
                                    Long valueOf40 = Long.valueOf(j10);
                                    Integer valueOf41 = Integer.valueOf(i25);
                                    Integer valueOf42 = Integer.valueOf(i24);
                                    i17 = 3;
                                    Object[] objArr12 = new Object[3];
                                    z10 = false;
                                    objArr12[0] = valueOf40;
                                    objArr12[1] = valueOf41;
                                    objArr12[i12] = valueOf42;
                                    this.f16333b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr12)).stepThis().dispose();
                                    executeFast = this.f16333b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                                }
                                try {
                                    executeFast.requery();
                                    executeFast.bindLong(1, j10);
                                    if (i27 != 0) {
                                        j12 = j11;
                                        executeFast.bindLong(i12, j12);
                                        i18 = i17;
                                    } else {
                                        j12 = j11;
                                        i18 = 2;
                                    }
                                    executeFast.bindInteger(i18, i25);
                                    executeFast.bindInteger(i18 + 1, i10);
                                    executeFast.step();
                                    executeFast.requery();
                                    executeFast.bindLong(1, j10);
                                    if (i27 != 0) {
                                        i19 = 2;
                                        executeFast.bindLong(2, j12);
                                        i20 = i17;
                                    } else {
                                        i19 = 2;
                                        i20 = 2;
                                    }
                                    executeFast.bindInteger(i20, i11);
                                    executeFast.bindInteger(i20 + 1, i24);
                                    executeFast.step();
                                    executeFast.dispose();
                                    i23 = i16 + 1;
                                    i13 = i17;
                                    i12 = i19;
                                    z11 = z10;
                                    i21 = i27;
                                    arrayList2 = arrayList;
                                    i14 = 4;
                                } catch (Exception e11) {
                                    e = e11;
                                    sQLiteCursor2 = null;
                                    sQLitePreparedStatement = executeFast;
                                    n(e);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteCursor = null;
                                    sQLitePreparedStatement = executeFast;
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                            i19 = i12;
                            i17 = 3;
                            z10 = false;
                            i23 = i16 + 1;
                            i13 = i17;
                            i12 = i19;
                            z11 = z10;
                            i21 = i27;
                            arrayList2 = arrayList;
                            i14 = 4;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                e = e12;
                sQLiteCursor2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }

    public final boolean u0(int i10, long j10) {
        if ((i10 & Z(j10)) != 0) {
            return true;
        }
        return false;
    }

    public final void u1(long j10) {
        LongSparseIntArray longSparseIntArray;
        SQLiteCursor sQLiteCursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f16333b;
            Locale locale = Locale.ENGLISH;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT topic_id FROM topics WHERE did = " + j10 + " AND unread_count > 0", new Object[0]);
            try {
                if (!queryFinalized.next()) {
                    longSparseIntArray = new LongSparseIntArray();
                    longSparseIntArray.put(j10, 0);
                } else {
                    longSparseIntArray = null;
                }
                queryFinalized.dispose();
                if (longSparseIntArray != null) {
                    this.f16333b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j10).stepThis().dispose();
                }
                W1(longSparseIntArray, null, true);
                getMessagesController().E3(longSparseIntArray, null);
            } catch (Throwable th2) {
                th = th2;
                sQLiteCursor = queryFinalized;
                try {
                    o(th, true);
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean v(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Boolean[] boolArr = {Boolean.FALSE};
        this.f16331a.c(new xm(this, j10, boolArr, countDownLatch, 13));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            o(e, true);
        }
        return boolArr[0].booleanValue();
    }

    public final void v1(String str, TLObject tLObject) {
        if (tLObject != null && !TextUtils.isEmpty(str)) {
            this.f16331a.c(new lg((f1) this, tLObject, str, 18));
        }
    }

    public final boolean w0(long j10) {
        return u0(4, j10);
    }

    public final void w1(int i10, long j10) {
        this.f16331a.c(new hq(this, i10, j10, 2));
    }

    public final SQLiteCursor x(int i10, int i11, long j10) {
        SQLiteDatabase sQLiteDatabase = this.f16333b;
        Locale locale = Locale.US;
        StringBuilder s10 = a1.g.s(j10, "SELECT data, seen, pin FROM profile_stories JOIN profile_stories_albums_links ON profile_stories.story_id = profile_stories_albums_links.story_id WHERE profile_stories.dialog_id = ", " AND profile_stories_albums_links.dialog_id = ");
        s10.append(j10);
        s10.append("  AND profile_stories_albums_links.album_id = ");
        s10.append(i10);
        s10.append(" AND profile_stories.type = ");
        s10.append(i11);
        s10.append(" ORDER BY profile_stories_albums_links.order_index ASC;");
        return sQLiteDatabase.queryFinalized(s10.toString(), new Object[0]);
    }

    public final boolean x0(a0.h hVar, TLRPC.User user) {
        long j10 = user.linked_community_id;
        if (j10 != 0) {
            TLRPC.Chat chat = (TLRPC.Chat) hVar.f(j10);
            if (chat == null) {
                chat = O(user.linked_community_id);
                hVar.k(chat, user.linked_community_id);
            }
            if (chat != null && chat.collapsed_in_dialogs) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void x1(bp bpVar, boolean z10) {
        int i10;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        String str;
        ArrayList arrayList = this.H;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        try {
            try {
                if (!arrayList.contains(bpVar)) {
                    if (z10) {
                        if (((bp) arrayList.get(0)).e()) {
                            arrayList.add(1, bpVar);
                        } else {
                            arrayList.add(0, bpVar);
                        }
                    } else {
                        arrayList.add(bpVar);
                    }
                    this.I.put(bpVar.f15000a, bpVar);
                }
                executeFast = this.f16333b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            int i11 = bpVar.f15000a;
            LongSparseIntArray longSparseIntArray = bpVar.f15006j;
            executeFast.bindInteger(1, i11);
            executeFast.bindInteger(2, bpVar.f15003f);
            executeFast.bindInteger(3, bpVar.d);
            executeFast.bindInteger(4, bpVar.f15004g);
            if (bpVar.f15000a == 0) {
                str = "ALL_CHATS";
            } else {
                str = bpVar.f15001b;
            }
            executeFast.bindString(5, str);
            executeFast.bindInteger(6, bpVar.f15009m);
            Vector vector = new Vector(new e9(18));
            vector.objects.addAll(bpVar.f15002c);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
            vector.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(7, nativeByteBuffer);
            executeFast.bindInteger(8, bpVar.f15010n ? 1 : 0);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
            this.f16333b.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + bpVar.f15000a).stepThis().dispose();
            this.f16333b.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + bpVar.f15000a).stepThis().dispose();
            this.f16333b.beginTransaction();
            SQLitePreparedStatement executeFast2 = this.f16333b.executeFast("REPLACE INTO dialog_filter_pin_v2 VALUES(?, ?, ?)");
            int size = bpVar.h.size();
            for (int i12 = 0; i12 < size; i12++) {
                long longValue = ((Long) bpVar.h.get(i12)).longValue();
                executeFast2.requery();
                executeFast2.bindInteger(1, bpVar.f15000a);
                executeFast2.bindLong(2, longValue);
                executeFast2.bindInteger(3, longSparseIntArray.get(longValue, Integer.MIN_VALUE));
                executeFast2.step();
            }
            int size2 = longSparseIntArray.size();
            for (int i13 = 0; i13 < size2; i13++) {
                long keyAt = longSparseIntArray.keyAt(i13);
                if (o5.C(keyAt)) {
                    executeFast2.requery();
                    executeFast2.bindInteger(1, bpVar.f15000a);
                    executeFast2.bindLong(2, keyAt);
                    executeFast2.bindInteger(3, longSparseIntArray.valueAt(i13));
                    executeFast2.step();
                }
            }
            executeFast2.dispose();
            SQLitePreparedStatement executeFast3 = this.f16333b.executeFast("REPLACE INTO dialog_filter_ep VALUES(?, ?)");
            int size3 = bpVar.f15005i.size();
            for (i10 = 0; i10 < size3; i10++) {
                executeFast3.requery();
                executeFast3.bindInteger(1, bpVar.f15000a);
                executeFast3.bindLong(2, ((Long) bpVar.f15005i.get(i10)).longValue());
                executeFast3.step();
            }
            executeFast3.dispose();
            this.f16333b.commitTransaction();
            SQLiteDatabase sQLiteDatabase = this.f16333b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e7) {
            e = e7;
            sQLitePreparedStatement3 = sQLitePreparedStatement2;
            o(e, true);
            SQLiteDatabase sQLiteDatabase2 = this.f16333b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement3 = sQLitePreparedStatement;
            SQLiteDatabase sQLiteDatabase3 = this.f16333b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
            throw th;
        }
    }

    public final void y(long j10, TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.topicStartMessage = message;
        tL_forumTopic.top_message = message.f19815id;
        tL_forumTopic.topMessage = message;
        tL_forumTopic.from_id = message.from_id;
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        int i10 = 0;
        tL_forumTopic.unread_count = 0;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) messageAction;
            tL_forumTopic.f19846id = message.f19815id;
            long j11 = tL_messageActionTopicCreate.icon_emoji_id;
            tL_forumTopic.icon_emoji_id = j11;
            tL_forumTopic.title = tL_messageActionTopicCreate.title;
            tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
            if (j11 != 0) {
                tL_forumTopic.flags |= 1;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(tL_forumTopic);
            D1(j10, arrayList, false, false, message.date);
            i0.g3(new d4(this, j10, tL_forumTopic, 22));
        } else if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
            tL_forumTopic.f19846id = (int) kj.c2(this.currentAccount, message, true, false);
            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
            tL_forumTopic.title = tL_messageActionTopicEdit.title;
            tL_forumTopic.closed = tL_messageActionTopicEdit.closed;
            tL_forumTopic.hidden = tL_messageActionTopicEdit.hidden;
            int i11 = tL_messageActionTopicEdit.flags;
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            if ((i11 & 2) != 0) {
                i10 += 2;
            }
            if ((i11 & 4) != 0) {
                i10 += 8;
            }
            if ((i11 & 8) != 0) {
                i10 += 32;
            }
            this.f16331a.c(new e1(this, i10, tL_forumTopic, j10, message.date));
        }
    }

    public final void y1() {
        this.f16331a.c(new yp(this, new ArrayList(getMessagesController().P0), 9));
    }

    public final long z(NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return 0L;
        }
        long andAdd = this.f16338f.getAndAdd(1L);
        this.f16331a.c(new d4(this, andAdd, nativeByteBuffer, 25));
        return andAdd;
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.is.z0():void");
    }

    public final void z1() {
        ArrayList arrayList = this.H;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.f16333b.executeFast("UPDATE dialog_filter SET ord = ?, flags = ? WHERE id = ?");
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bp bpVar = (bp) arrayList.get(i10);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, bpVar.f15003f);
                    sQLitePreparedStatement.bindInteger(2, bpVar.f15004g);
                    sQLitePreparedStatement.bindInteger(3, bpVar.f15000a);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                o(e, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }
}
