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
public final class qr extends c1 {
    public static volatile qr[] f24931f0 = new qr[4];
    public static final Object[] f24932g0 = new Object[4];
    public static final String[] f24933h0;
    public int E;
    public int F;
    public int G;
    public int H;
    public final ArrayList I;
    public final SparseArray J;
    public final a0.h K;
    public int L;
    public int M;
    public volatile int N;
    public volatile int O;
    public boolean P;
    public final CountDownLatch Q;
    public boolean R;
    public final LongSparseIntArray S;
    public boolean T;
    public final int[][] U;
    public final int[][] V;
    public final int[][] W;
    public final int[][] X;
    public final int[][] Y;
    public final int[][] Z;
    public final p5 f24934a;
    public final int[] f24935a0;
    public SQLiteDatabase f24936b;
    public final int[] f24937b0;
    public File f24938c;
    public final a0.h f24939c0;
    public File d;
    public final a0.h f24940d0;
    public File f24941e;
    public final android.support.v4.media.c f24942e0;
    public final AtomicLong f24943f;
    public final SparseArray h;
    public int f24944n;
    public int f24945r;
    public int f24946s;
    public int f24947w;
    public int f24948x;
    public byte[] f24949y;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            f24932g0[i3] = new Object();
        }
        f24933h0 = new String[]{"messages_holes", "media_holes_v2", "scheduled_messages_v2", "quick_replies", "messages_v2", "download_queue", "user_contacts_v7", "user_phones_v7", "dialogs", "dialog_filter", "dialog_filter_ep", "dialog_filter_pin_v2", "randoms_v2", "enc_tasks_v4", "messages_seq", "params", "media_v4", "bot_keyboard", "bot_keyboard_topics", "chat_settings_v2", "user_settings", "chat_pinned_v2", "chat_pinned_count", "chat_hints", "botcache", "users_data", "users", "chats", "enc_chats", "channel_users_v2", "channel_admins_v3", "contacts", "dialog_photos", "dialog_settings", "web_recent_v3", "stickers_v2", "stickers_featured", "stickers_dice", "stickersets", "hashtag_recent_v2", "webpage_pending_v2", "sent_files_v2", "search_recent", "media_counts_v2", "keyvalue", "bot_info_v2", "pending_tasks", "requested_holes", "sharing_locations", "shortcut_widget", "emoji_keywords_v2", "emoji_keywords_info_v2", "wallpapers2", "unread_push_messages", "polls_v2", "reactions", "reaction_mentions", "downloading_documents", "animated_emoji", "attach_menu_bots", "premium_promo", "emoji_statuses", "messages_holes_topics", "messages_topics", "saved_dialogs", "media_topics", "media_holes_topics", "topics", "media_counts_topics", "reaction_mentions_topics", "emoji_groups", "poll_votes_mentions", "poll_votes_mentions_topics", "ephemeral_messages", "widget_state", "widget_heights"};
    }

    public qr(int i3) {
        super(i3);
        this.f24943f = new AtomicLong(System.currentTimeMillis());
        this.h = new SparseArray();
        this.f24944n = 0;
        this.f24945r = 0;
        this.f24946s = 0;
        this.f24947w = 0;
        this.f24948x = 0;
        this.f24949y = null;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = new ArrayList();
        this.J = new SparseArray();
        this.K = new a0.h();
        this.Q = new CountDownLatch(1);
        this.S = new LongSparseIntArray();
        this.U = new int[][]{new int[2], new int[2]};
        this.V = new int[][]{new int[2], new int[2]};
        this.W = new int[][]{new int[2], new int[2]};
        this.X = new int[][]{new int[2], new int[2]};
        this.Y = new int[][]{new int[2], new int[2]};
        this.Z = new int[][]{new int[2], new int[2]};
        this.f24935a0 = new int[2];
        this.f24937b0 = new int[2];
        this.f24939c0 = new a0.h();
        this.f24940d0 = new a0.h();
        this.f24942e0 = new android.support.v4.media.c(8);
        p5 p5Var = new p5(k2.p1.i(i3, "storageQueue_"));
        this.f24934a = p5Var;
        p5Var.setPriority(8);
        p5Var.c(new hq(this, 10));
    }

    public static void A(SQLiteDatabase sQLiteDatabase) {
        k5.v(sQLiteDatabase, "CREATE TABLE messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_dialogs ON messages_holes(uid, end);", "CREATE TABLE media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);");
        k5.v(sQLiteDatabase, "CREATE TABLE scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);", "CREATE TABLE messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, group_id INTEGER, reply_to_story_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);");
        k5.v(sQLiteDatabase, "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_4_saved_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_saved_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_saved_dialogs ON saved_dialogs(folder_id);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS flags_idx_4_saved_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "CREATE TABLE download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type));", "CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);");
        k5.v(sQLiteDatabase, "CREATE TABLE user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)", "CREATE TABLE user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);", "CREATE TABLE dialogs(did INTEGER PRIMARY KEY, date INTEGER, unread_count INTEGER, last_mid INTEGER, inbox_max INTEGER, outbox_max INTEGER, last_mid_i INTEGER, unread_count_i INTEGER, pts INTEGER, date_i INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, data BLOB, unread_reactions INTEGER, last_mid_group INTEGER, ttl_period INTEGER, unread_poll_votes INTEGER)");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS date_idx_4_dialogs ON dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_dialogs ON dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);", "CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_dialogs ON dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_4_dialogs ON dialogs(flags);", "CREATE TABLE dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT, color INTEGER DEFAULT -1, entities BLOB, noanimate INTEGER)");
        k5.v(sQLiteDatabase, "CREATE TABLE dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))", "CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);");
        k5.v(sQLiteDatabase, "CREATE TABLE enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))", "CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);", "CREATE TABLE messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);", "CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);");
        k5.v(sQLiteDatabase, "CREATE TABLE params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)", "INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)", "CREATE TABLE media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_type_date_mid_idx_media_v4 ON media_v4(uid, type, date DESC, mid DESC);", "CREATE INDEX IF NOT EXISTS media_v4_music_browse_idx ON media_v4(uid, date DESC, mid DESC) WHERE type = 4 AND mid > 0 AND uid != 0;", "CREATE TABLE bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);");
        k5.v(sQLiteDatabase, "CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))", "CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);", "CREATE TABLE chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER, online INTEGER, inviter INTEGER, links INTEGER, participants_count INTEGER)", "CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;");
        k5.v(sQLiteDatabase, "CREATE TABLE user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)", "CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;", "CREATE TABLE chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));", "CREATE TABLE chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))", "CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);", "CREATE TABLE botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)", "CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);");
        k5.v(sQLiteDatabase, "CREATE TABLE users_data(uid INTEGER PRIMARY KEY, about TEXT)", "CREATE TABLE users(uid INTEGER PRIMARY KEY, name TEXT, status INTEGER, data BLOB)", "CREATE TABLE chats(uid INTEGER PRIMARY KEY, name TEXT, data BLOB)", "CREATE TABLE enc_chats(uid INTEGER PRIMARY KEY, user INTEGER, name TEXT, data BLOB, g BLOB, authkey BLOB, ttl INTEGER, layer INTEGER, seq_in INTEGER, seq_out INTEGER, use_count INTEGER, exchange_id INTEGER, key_date INTEGER, fprint INTEGER, fauthkey BLOB, khash BLOB, in_seq_no INTEGER, admin_id INTEGER, mtproto_seq INTEGER)");
        k5.v(sQLiteDatabase, "CREATE TABLE channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE contacts(uid INTEGER PRIMARY KEY, mutual INTEGER)", "CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))");
        k5.v(sQLiteDatabase, "CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)", "CREATE TABLE dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);", "CREATE TABLE web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, document BLOB, PRIMARY KEY (id, type));", "CREATE TABLE stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER, emoji INTEGER);", "CREATE TABLE stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);", "CREATE TABLE hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);", "CREATE TABLE webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));");
        k5.v(sQLiteDatabase, "CREATE TABLE sent_files_v2(uid TEXT, type INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type))", "CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);", "CREATE TABLE media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, type))", "CREATE TABLE keyvalue(id TEXT PRIMARY KEY, value TEXT)");
        k5.v(sQLiteDatabase, "CREATE TABLE bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))", "CREATE TABLE pending_tasks(id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));", "CREATE TABLE sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB, proximity INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER, short_name TEXT);", "CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);", "CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);", "CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);");
        k5.v(sQLiteDatabase, "CREATE TABLE shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));", "CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);", "CREATE TABLE emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));", "CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);");
        k5.v(sQLiteDatabase, "CREATE TABLE emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER, date INTEGER);", "CREATE TABLE wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)", "CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);", "CREATE TABLE unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, topicId INTEGER, is_reaction INTEGER, PRIMARY KEY(uid, mid))");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);", "CREATE TABLE polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));", "CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);");
        k5.v(sQLiteDatabase, "CREATE TABLE reactions(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);", "CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));");
        k5.v(sQLiteDatabase, "CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE premium_promo(data BLOB, date INTEGER);", "CREATE TABLE emoji_statuses(data BLOB, type INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_topics ON messages_holes_topics(uid, topic_id, end);", "CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, reply_to_story_id INTEGER, PRIMARY KEY(mid, topic_id, uid))", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);", "CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);", "CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);", "CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);");
        k5.v(sQLiteDatabase, "CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);", "CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);");
        k5.v(sQLiteDatabase, "CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, read_outbox INTEGER, pinned INTEGER, total_messages_count INTEGER, hidden INTEGER, edit_date INTEGER, nopaid_messages_exception INTEGER, unread_poll_votes INTEGER, PRIMARY KEY(did, topic_id));", "CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);", "CREATE INDEX IF NOT EXISTS did_topics ON topics(did);", "CREATE TABLE media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))");
        k5.v(sQLiteDatabase, "CREATE TABLE reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);", "CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)", "CREATE TABLE app_config(data BLOB)");
        k5.v(sQLiteDatabase, "CREATE TABLE web_browser_settings(data BLOB)", "CREATE TABLE effects(data BLOB)", "CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, custom_params BLOB, PRIMARY KEY (dialog_id, story_id));", "CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));", "CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));", "CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));", "CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB, type INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));", "CREATE TABLE unconfirmed_auth (data BLOB);", "CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);", "CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);", "CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);", "CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);");
        k5.v(sQLiteDatabase, "CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER, count INTEGER);", "CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);", "CREATE TABLE welcome_messages(mid INTEGER, dialog_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, dialog_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_welcome_messages ON welcome_messages(mid, send_state, date);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS dialog_date_idx_welcome_messages ON welcome_messages(dialog_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_welcome_messages ON welcome_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_welcome_messages ON welcome_messages(reply_to_message_id, mid);", "CREATE TABLE business_links(data BLOB, order_value INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);", "CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT, pos INTEGER);", "CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER, pos INTEGER);", "CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);");
        k5.v(sQLiteDatabase, "CREATE TABLE poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);", "CREATE TABLE poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);");
        k5.v(sQLiteDatabase, "CREATE TABLE ephemeral_messages (id INTEGER, dialog_id INTEGER, topic_id INTEGER, date INTEGER, data BLOB, PRIMARY KEY(dialog_id, id));", "CREATE INDEX IF NOT EXISTS ephemeral_messages_date_idx ON ephemeral_messages(date);", "CREATE TABLE widget_state(uid INTEGER, mid INTEGER, local TEXT, PRIMARY KEY(uid, mid));", "CREATE TABLE widget_heights(uid INTEGER, mid INTEGER, width INTEGER, height INTEGER, date INTEGER, anchor INTEGER default 0, PRIMARY KEY(uid, mid, width));");
        k2.p1.y(sQLiteDatabase, "PRAGMA user_version = 181");
    }

    public static void J(TLRPC.Message message) {
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported_old) {
                if (messageMedia.bytes.length == 0) {
                    Pattern pattern = Utilities.f21384a;
                    byte b10 = (byte) 0;
                    messageMedia.bytes = new byte[]{b10, b10, b10, (byte) 233};
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
                TLRPC.TL_messageMediaUnsupported_old tL_messageMediaUnsupported_old = new TLRPC.TL_messageMediaUnsupported_old();
                message.media = tL_messageMediaUnsupported_old;
                Pattern pattern2 = Utilities.f21384a;
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
                for (int i3 = 0; i3 < user.usernames.size(); i3++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i3);
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
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) arrayList.get(i3);
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

    public static void a(qr qrVar, ArrayList arrayList) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Pair pair = (Pair) obj;
            qrVar.getMessagesController().n4(((Integer) pair.second).intValue(), ((Long) pair.first).longValue(), false);
        }
    }

    public static qr a0(int i3) {
        qr qrVar;
        qr qrVar2 = f24931f0[i3];
        if (qrVar2 == null) {
            synchronized (f24932g0[i3]) {
                try {
                    qrVar = f24931f0[i3];
                    if (qrVar == null) {
                        qr[] qrVarArr = f24931f0;
                        qr qrVar3 = new qr(i3);
                        qrVarArr[i3] = qrVar3;
                        qrVar = qrVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return qrVar;
        }
        return qrVar2;
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
        int i3 = messageReplyHeader.reply_to_msg_id;
        if ((message.flags & 1073741824) != 0) {
            B0 = message.quick_reply_shortcut_id;
        } else {
            TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
            if (peer != null) {
                B0 = zi.C1(peer);
            } else {
                B0 = zi.B0(message);
            }
        }
        SparseArray sparseArray = (SparseArray) hVar.f(B0);
        ArrayList arrayList = (ArrayList) hVar2.f(B0);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            hVar.k(sparseArray, B0);
        }
        if (arrayList == null) {
            arrayList = k5.j(hVar2, B0);
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
            if ((message.media instanceof TLRPC.TL_messageMediaPhoto) || zi.u3(message) || zi.S4(message) || zi.M4(message) || zi.k4(message)) {
                int i3 = message.ttl;
                if (i3 > 0 && i3 <= 60) {
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
        if (!(message.media instanceof TLRPC.TL_messageMediaPhoto) && !zi.M4(message)) {
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
        long C1 = zi.C1(message.from_id);
        if (m5.E(C1)) {
            if (!arrayList.contains(Long.valueOf(C1))) {
                arrayList.add(Long.valueOf(C1));
            }
        } else if (m5.z(C1)) {
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
                for (int i3 = 0; i3 < message.action.users.size(); i3++) {
                    Long l10 = message.action.users.get(i3);
                    if (!arrayList.contains(l10)) {
                        arrayList.add(l10);
                    }
                }
            }
        }
        if (!message.entities.isEmpty()) {
            for (int i10 = 0; i10 < message.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i10);
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
            for (int i11 = 0; i11 < tL_messageActionRequestedPeer.peers.size(); i11++) {
                c(tL_messageActionRequestedPeer.peers.get(i11), arrayList, arrayList2);
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
                int i12 = 0;
                while (i12 < size) {
                    Long l11 = arrayList4.get(i12);
                    i12++;
                    Long l12 = l11;
                    if (!arrayList2.contains(l12)) {
                        arrayList2.add(l12);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia3 = message.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                ArrayList<Long> arrayList5 = ((TLRPC.TL_messageMediaGiveawayResults) messageMedia3).winners;
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    Long l13 = arrayList5.get(i13);
                    i13++;
                    Long l14 = l13;
                    if (!arrayList.contains(l14)) {
                        arrayList.add(l14);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia4 = message.media;
            if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia4;
                if (!tL_messageMediaPoll.poll.answers.isEmpty()) {
                    for (int i14 = 0; i14 < tL_messageMediaPoll.poll.answers.size(); i14++) {
                        TLRPC.Peer peer9 = tL_messageMediaPoll.poll.answers.get(i14).added_by;
                        if (peer9 != null) {
                            c(peer9, arrayList, arrayList2);
                        }
                    }
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                if (pollResults != null) {
                    ArrayList<TLRPC.Peer> arrayList6 = pollResults.recent_voters;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        for (int i15 = 0; i15 < tL_messageMediaPoll.results.recent_voters.size(); i15++) {
                            c(tL_messageMediaPoll.results.recent_voters.get(i15), arrayList, arrayList2);
                        }
                    }
                    if (!tL_messageMediaPoll.results.results.isEmpty()) {
                        ArrayList<TLRPC.PollAnswerVoters> arrayList7 = tL_messageMediaPoll.results.results;
                        int size3 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = arrayList7.get(i16);
                            i16++;
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = pollAnswerVoters;
                            ArrayList<TLRPC.Peer> arrayList8 = pollAnswerVoters2.recent_voters;
                            if (arrayList8 != null && !arrayList8.isEmpty()) {
                                ArrayList<TLRPC.Peer> arrayList9 = pollAnswerVoters2.recent_voters;
                                int size4 = arrayList9.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    TLRPC.Peer peer10 = arrayList9.get(i17);
                                    i17++;
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
                    for (int i18 = 0; i18 < message.media.storyItem.media_areas.size(); i18++) {
                        if (message.media.storyItem.media_areas.get(i18) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            long j17 = ((TL_stories.TL_mediaAreaChannelPost) message.media.storyItem.media_areas.get(i18)).channel_id;
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
                for (int i19 = 0; i19 < message.media.webpage.attributes.size(); i19++) {
                    if (message.media.webpage.attributes.get(i19) instanceof TLRPC.TL_webPageAttributeStory) {
                        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) message.media.webpage.attributes.get(i19);
                        TL_stories.StoryItem storyItem4 = tL_webPageAttributeStory.storyItem;
                        if (storyItem4 != null && (storyFwdHeader = storyItem4.fwd_from) != null) {
                            c(storyFwdHeader.from, arrayList, arrayList2);
                        }
                        TL_stories.StoryItem storyItem5 = tL_webPageAttributeStory.storyItem;
                        if (storyItem5 != null && storyItem5.media_areas != null) {
                            for (int i20 = 0; i20 < tL_webPageAttributeStory.storyItem.media_areas.size(); i20++) {
                                if (tL_webPageAttributeStory.storyItem.media_areas.get(i20) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                    long j18 = ((TL_stories.TL_mediaAreaChannelPost) tL_webPageAttributeStory.storyItem.media_areas.get(i20)).channel_id;
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
            for (int i21 = 0; i21 < size5; i21++) {
                c(message.replies.recent_repliers.get(i21), arrayList, arrayList2);
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
            for (int i22 = 0; i22 < message.reactions.top_reactors.size(); i22++) {
                TLRPC.MessageReactor messageReactor = message.reactions.top_reactors.get(i22);
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

    public static void w(long j10, SQLitePreparedStatement sQLitePreparedStatement, SQLitePreparedStatement sQLitePreparedStatement2, int i3, long j11) {
        int i10;
        int i11;
        int i12;
        int i13;
        sQLitePreparedStatement.requery();
        sQLitePreparedStatement.bindLong(1, j10);
        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i14 != 0) {
            sQLitePreparedStatement.bindLong(2, j11);
            i10 = 3;
        } else {
            i10 = 2;
        }
        int i15 = i10 + 1;
        if (i3 == 1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        sQLitePreparedStatement.bindInteger(i10, i11);
        sQLitePreparedStatement.bindInteger(i15, i3);
        sQLitePreparedStatement.step();
        for (int i16 = 0; i16 < 9; i16++) {
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(1, j10);
            if (i14 != 0) {
                sQLitePreparedStatement2.bindLong(2, j11);
                i12 = 3;
            } else {
                i12 = 2;
            }
            int i17 = i12 + 1;
            sQLitePreparedStatement2.bindInteger(i12, i16);
            int i18 = i12 + 2;
            if (i3 == 1) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            sQLitePreparedStatement2.bindInteger(i17, i13);
            sQLitePreparedStatement2.bindInteger(i18, i3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.A0(int, long):void");
    }

    public final void A1(int i3, int i10, int i11, int i12) {
        this.f24934a.c(new br(this, i3, i10, i11, i12, 0));
    }

    public final void B(long j10, SparseArray sparseArray) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                if (sparseArray.size() != 0) {
                    this.f24936b.beginTransaction();
                    SQLitePreparedStatement executeFast = this.f24936b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                    int i3 = Integer.MAX_VALUE;
                    for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                        try {
                            int keyAt = sparseArray.keyAt(i10);
                            ArrayList arrayList2 = (ArrayList) sparseArray.get(keyAt);
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                int intValue = ((Integer) arrayList2.get(i11)).intValue();
                                executeFast.requery();
                                executeFast.bindInteger(1, intValue);
                                executeFast.bindLong(2, j10);
                                executeFast.bindInteger(3, keyAt);
                                executeFast.bindInteger(4, 1);
                                i3 = Math.min(i3, intValue);
                                executeFast.step();
                                arrayList.add((Integer) arrayList2.get(i11));
                            }
                        } catch (Exception e10) {
                            e = e10;
                            sQLitePreparedStatement = executeFast;
                            o(e, true);
                            SQLiteDatabase sQLiteDatabase = this.f24936b;
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
                            SQLiteDatabase sQLiteDatabase2 = this.f24936b;
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
                    this.f24936b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = this.f24936b;
                    Locale locale = Locale.US;
                    sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE uid = " + j10 + " AND mid IN(" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    getMessagesController().n0(i3, j10, sparseArray);
                }
                SQLiteDatabase sQLiteDatabase4 = this.f24936b;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.commitTransaction();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void B0(int r29, int r30, int r31, long[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.B0(int, int, int, long[]):void");
    }

    public final void B1(int i3, int i10, int i11, int i12) {
        try {
            if (this.F == i3 && this.G == i10 && this.H == i11 && this.f24946s == i12) {
                return;
            }
            SQLitePreparedStatement executeFast = this.f24936b.executeFast("UPDATE params SET seq = ?, pts = ?, date = ?, qts = ? WHERE id = 1");
            executeFast.bindInteger(1, i3);
            executeFast.bindInteger(2, i10);
            executeFast.bindInteger(3, i11);
            executeFast.bindInteger(4, i12);
            executeFast.step();
            executeFast.dispose();
            this.F = i3;
            this.G = i10;
            this.H = i11;
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    public final void C(mo moVar) {
        try {
            this.I.remove(moVar);
            this.J.remove(moVar.f24237a);
            SQLiteDatabase sQLiteDatabase = this.f24936b;
            sQLiteDatabase.executeFast("DELETE FROM dialog_filter WHERE id = " + moVar.f24237a).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.f24936b;
            sQLiteDatabase2.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + moVar.f24237a).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase3 = this.f24936b;
            sQLiteDatabase3.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + moVar.f24237a).stepThis().dispose();
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.C0():void");
    }

    public final void C1(int i3, long j10, List list, boolean z10) {
        this.f24934a.c(new oq(this, j10, list, z10, i3, 1));
    }

    public final void D(java.util.ArrayList r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.D(java.util.ArrayList, boolean):void");
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.D0():void");
    }

    public final void D1(long r20, java.util.List r22, boolean r23, boolean r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.D1(long, java.util.List, boolean, boolean, int):void");
    }

    public final void E(ArrayList arrayList, long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f24936b;
            Locale locale = Locale.US;
            String join = TextUtils.join(",", arrayList);
            sQLiteDatabase.executeFast("DELETE FROM unread_push_messages WHERE uid = " + j10 + " AND mid IN(" + join + ")").stepThis().dispose();
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    public final void E0(int r49, int r50, int r51, long r52, long r54, org.telegram.tgnet.TLRPC.messages_Messages r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.E0(int, int, int, long, long, org.telegram.tgnet.TLRPC$messages_Messages, boolean):void");
    }

    public final void E1(long j10, long j11) {
        this.f24934a.c(new mp(0, j10, j11, this));
    }

    public final void F(long r19, long r21, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.F(long, long, int, int):void");
    }

    public final TLRPC.ChatFull F0(final long j10, final boolean z10, final CountDownLatch countDownLatch, final boolean z11, final boolean z12, final int i3) {
        final TLRPC.ChatFull[] chatFullArr = new TLRPC.ChatFull[1];
        this.f24934a.c(new Runnable(chatFullArr, j10, z10, z11, z12, i3, countDownLatch) {
            public final TLRPC.ChatFull[] f22056b;
            public final long f22057c;
            public final boolean d;
            public final boolean f22058e;
            public final boolean f22059f;
            public final CountDownLatch h;

            {
                this.h = countDownLatch;
            }

            @Override
            public final void run() {
                this.f22056b[0] = qr.this.G0(this.f22057c, this.d, this.f22058e, this.f22059f);
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
        this.f24934a.c(new qp(0, j10, this, z10));
    }

    public final void G(int i3, long j10, long j11, String str) {
        SQLitePreparedStatement executeFast;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        int i11 = 2;
        if (i10 != 0) {
            if (i3 == 0) {
                this.f24936b.executeFast(String.format(Locale.US, a1.g.q("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d"), Long.valueOf(j10), Long.valueOf(j11))).stepThis().dispose();
            } else {
                this.f24936b.executeFast(String.format(Locale.US, a1.g.q("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d AND start = 0"), Long.valueOf(j10), Long.valueOf(j11))).stepThis().dispose();
            }
        } else if (i3 == 0) {
            this.f24936b.executeFast(String.format(Locale.US, a1.g.q("DELETE FROM ", str, " WHERE uid = %d"), Long.valueOf(j10))).stepThis().dispose();
        } else {
            this.f24936b.executeFast(String.format(Locale.US, a1.g.q("DELETE FROM ", str, " WHERE uid = %d AND start = 0"), Long.valueOf(j10))).stepThis().dispose();
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (i10 != 0) {
                    SQLiteDatabase sQLiteDatabase = this.f24936b;
                    executeFast = sQLiteDatabase.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                } else {
                    SQLiteDatabase sQLiteDatabase2 = this.f24936b;
                    executeFast = sQLiteDatabase2.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                }
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j10);
                if (i10 != 0) {
                    sQLitePreparedStatement.bindLong(2, j11);
                    i11 = 3;
                }
                sQLitePreparedStatement.bindInteger(i11, 1);
                sQLitePreparedStatement.bindInteger(i11 + 1, 1);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    public final org.telegram.tgnet.TLRPC.ChatFull G0(final long r24, boolean r26, final boolean r27, final boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.G0(long, boolean, boolean, boolean):org.telegram.tgnet.TLRPC$ChatFull");
    }

    public final void G1(ArrayList arrayList, ArrayList arrayList2, long j10, int i3) {
        if (arrayList == null && arrayList2 == null && j10 == 0) {
            return;
        }
        this.f24934a.c(new z1(this, arrayList, arrayList2, i3, j10));
    }

    public final void H() {
        try {
            this.Q.await();
        } catch (Throwable unused) {
        }
    }

    public final org.telegram.tgnet.TLRPC.TL_messages_dialogs H0(java.util.ArrayList r22, java.util.ArrayList r23, java.util.ArrayList r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.H0(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):org.telegram.tgnet.TLRPC$TL_messages_dialogs");
    }

    public final void H1(int i3) {
        H();
        this.f24944n = i3;
    }

    public final void I(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        p5 p5Var = this.f24934a;
        if (currentThread != p5Var) {
            p5Var.c(runnable);
        } else {
            runnable.run();
        }
    }

    public final void I0(ArrayList arrayList) {
        try {
            a0.h hVar = new a0.h();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (!((a00) arrayList.get(i3)).f21417i && !((a00) arrayList.get(i3)).f21418j && ((a00) arrayList.get(i3)).f21416g != null) {
                    long j10 = ((a00) arrayList.get(i3)).f21416g.grouped_id;
                    if (j10 != 0) {
                        ArrayList arrayList2 = (ArrayList) hVar.f(j10);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            hVar.k(arrayList2, j10);
                        }
                        arrayList2.add((a00) arrayList.get(i3));
                    }
                }
            }
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                long j11 = hVar.j(i10);
                ArrayList arrayList3 = (ArrayList) hVar.n(i10);
                SQLiteDatabase sQLiteDatabase = this.f24936b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + ((a00) arrayList3.get(0)).f21412b + " AND group_id = " + j11 + " ORDER BY date DESC", new Object[0]);
                ArrayList arrayList4 = null;
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, h10.i(this.currentAccount).f22848n);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(new zi(this.currentAccount, TLdeserialize, false, false));
                }
                queryFinalized.dispose();
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ((a00) arrayList3.get(i11)).h = arrayList4;
                }
            }
        } catch (Throwable th2) {
            o(th2, true);
        }
    }

    public final void I1(int i3) {
        H();
        this.f24945r = i3;
    }

    public final void J0(ArrayList arrayList, long j10) {
        if (arrayList != null) {
            try {
                a0.h hVar = new a0.h();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (((TLRPC.TL_forumTopic) arrayList.get(i3)).topMessage != null) {
                        long j11 = ((TLRPC.TL_forumTopic) arrayList.get(i3)).topMessage.grouped_id;
                        if (j11 != 0) {
                            ArrayList arrayList2 = (ArrayList) hVar.f(j11);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                hVar.k(arrayList2, j11);
                            }
                            arrayList2.add((TLRPC.TL_forumTopic) arrayList.get(i3));
                        }
                    }
                }
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    long j12 = hVar.j(i10);
                    ArrayList arrayList3 = (ArrayList) hVar.n(i10);
                    SQLiteDatabase sQLiteDatabase = this.f24936b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND group_id = " + j12 + " ORDER BY date DESC", new Object[0]);
                    ArrayList<zi> arrayList4 = null;
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize != null) {
                            TLdeserialize.readAttachPath(byteBufferValue, h10.i(this.currentAccount).f22848n);
                        }
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList<>();
                        }
                        arrayList4.add(new zi(this.currentAccount, TLdeserialize, false, false));
                    }
                    queryFinalized.dispose();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        ((TLRPC.TL_forumTopic) arrayList3.get(i11)).groupedMessages = arrayList4;
                    }
                }
            } catch (Throwable th2) {
                o(th2, true);
            }
        }
    }

    public final void J1(int i3) {
        H();
        this.f24946s = i3;
    }

    public final void K0(a0.h r22, a0.h r23, java.util.ArrayList r24, java.util.ArrayList r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.K0(a0.h, a0.h, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public final void K1(int i3) {
        H();
        this.f24947w = i3;
    }

    public final void L(String str, ArrayList arrayList) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f24936b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM animated_emoji WHERE document_id IN (" + str + ")", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    try {
                        TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (TLdeserialize != null && TLdeserialize.f27007id != 0) {
                            arrayList.add(TLdeserialize);
                        }
                    } catch (Exception e10) {
                        o(e10, true);
                    }
                    if (byteBufferValue != null) {
                        byteBufferValue.reuse();
                    }
                }
            } catch (SQLiteException e11) {
                e11.printStackTrace();
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
            SQLiteDatabase sQLiteDatabase = this.f24936b;
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
        } catch (Exception e10) {
            o(e10, true);
            return arrayList;
        }
    }

    public final void M(String str, RequestDelegate requestDelegate) {
        if (str != null) {
            this.f24934a.c(new vf(this, getConnectionsManager().getCurrentTime(), str, requestDelegate, 15));
        }
    }

    public final void M0(int r32, java.lang.String r33, java.util.ArrayList r34, java.util.ArrayList r35, java.util.ArrayList r36, java.util.ArrayList r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.M0(int, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public final void M1(long j10, TLRPC.TL_chatBannedRights tL_chatBannedRights, int i3) {
        if (tL_chatBannedRights != null && j10 != 0) {
            this.f24934a.c(new yj(this, j10, i3, tL_chatBannedRights, 7));
        }
    }

    public final int N(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Integer[] numArr = {0};
        this.f24934a.c(new zl(this, j10, numArr, countDownLatch, 13));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return numArr[0].intValue();
    }

    public final void N0(int i3, TLRPC.Message message) {
        this.f24934a.c(new k7(this, i3, message, 1));
    }

    public final void N1(TLRPC.ChatFull chatFull, boolean z10) {
        this.f24934a.c(new qf(this, chatFull, z10, 11));
    }

    public final TLRPC.Chat O(long j10) {
        try {
            ArrayList arrayList = new ArrayList();
            Q("" + j10, arrayList);
            if (arrayList.isEmpty()) {
                return null;
            }
            return (TLRPC.Chat) arrayList.get(0);
        } catch (Exception e10) {
            o(e10, true);
            return null;
        }
    }

    public final void O0(java.lang.String r19, java.lang.String r20, long r21, long r23, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.O0(java.lang.String, java.lang.String, long, long, int, boolean):void");
    }

    public final void O1(TLRPC.ChatParticipants chatParticipants) {
        if (chatParticipants == null) {
            return;
        }
        this.f24934a.c(new yh(29, this, chatParticipants));
    }

    public final TLRPC.Chat P(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.Chat[] chatArr = new TLRPC.Chat[1];
        this.f24934a.c(new zl(this, chatArr, j10, countDownLatch, 14));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return chatArr[0];
    }

    public final ArrayList P0(long j10, ArrayList arrayList, boolean z10, boolean z11, int i3, int i10) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (z10) {
            this.f24934a.c(new ip(this, j10, arrayList, z11, i3, i10));
            return null;
        }
        return Q0(i3, i10, j10, arrayList, z11);
    }

    public final void P1(int i3) {
        g0.h3(new hq(this, 4));
        a8.b("MessagesStorage start db migration from " + i3 + " to 181");
        int c2 = l5.c(this, this.f24936b, i3);
        a8.b("MessagesStorage db migration finished to varsion " + c2);
        g0.h3(new hq(this, 5));
    }

    public final void Q(String str, ArrayList arrayList) {
        if (str != null && str.length() != 0 && arrayList != null) {
            SQLiteDatabase sQLiteDatabase = this.f24936b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.q("SELECT data FROM chats WHERE uid IN(", str, ")"), new Object[0]);
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
                } catch (Exception e10) {
                    o(e10, true);
                }
            }
            queryFinalized.dispose();
            if (arrayList2 != null) {
                SQLiteDatabase sQLiteDatabase2 = this.f24936b;
                Locale locale2 = Locale.US;
                SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized(a1.g.q("SELECT data FROM chats WHERE uid IN(", TextUtils.join(", ", arrayList2), ")"), new Object[0]);
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
                    } catch (Exception e11) {
                        o(e11, true);
                    }
                }
                queryFinalized2.dispose();
            }
        }
    }

    public final java.util.ArrayList Q0(int r47, int r48, long r49, java.util.ArrayList r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.Q0(int, int, long, java.util.ArrayList, boolean):java.util.ArrayList");
    }

    public final void Q1(long j10, int i3, boolean z10, boolean z11) {
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
        this.f24934a.c(new oq(this, z10, str, j10, i3, str2));
    }

    public final SQLiteDatabase R() {
        return this.f24936b;
    }

    public final void R0(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray) {
        this.f24934a.c(new ul(this, longSparseIntArray, longSparseIntArray2, sparseIntArray, 19));
    }

    public final void R1(long j10, long j11, ArrayList arrayList, ArrayList arrayList2) {
        I(new f9(this, j10, j11, arrayList, arrayList2, 6));
    }

    public final long S() {
        long j10;
        File file = this.f24938c;
        if (file != null) {
            j10 = file.length();
        } else {
            j10 = 0;
        }
        File file2 = this.f24941e;
        if (file2 != null) {
            return file2.length() + j10;
        }
        return j10;
    }

    public final void S0(int i3, int i10, long j10, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f24934a.c(new b1(i10, i3, j10, arrayList, this));
        }
    }

    public final void S1(long r24, long r26, java.util.ArrayList r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.S1(long, long, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final int T(long j10) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                int i3 = -1;
                if (this.K.f(j10) == null) {
                    sQLiteCursor = this.f24936b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
                    if (sQLiteCursor.next()) {
                        i3 = sQLiteCursor.intValue(0);
                    }
                    sQLiteCursor.dispose();
                }
                return i3;
            } catch (Exception e10) {
                o(e10, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.T0(int, long, java.util.ArrayList):void");
    }

    public final void T1(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, a0.h hVar, LongSparseIntArray longSparseIntArray3) {
        if (t0(longSparseIntArray) && t0(longSparseIntArray2) && s0(hVar) && t0(longSparseIntArray3)) {
            return;
        }
        this.f24934a.c(new cn(this, longSparseIntArray, longSparseIntArray2, hVar, longSparseIntArray3, 11));
    }

    public final int U(final long j10, final boolean z10) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.f24934a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ar.run():void");
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return numArr[0].intValue();
    }

    public final void U0(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            g0.h3(new jp(this, arrayList, 5));
        }
    }

    public final void U1(java.util.ArrayList r26, org.telegram.messenger.support.LongSparseIntArray r27, org.telegram.messenger.support.LongSparseIntArray r28, a0.h r29, org.telegram.messenger.support.LongSparseIntArray r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.U1(java.util.ArrayList, org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, a0.h, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public final void V(String str, ArrayList arrayList, ArrayList arrayList2) {
        if (str != null && str.length() != 0) {
            SQLiteDatabase sQLiteDatabase = this.f24936b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.q("SELECT data, user, g, authkey, ttl, layer, seq_in, seq_out, use_count, exchange_id, key_date, fprint, fauthkey, khash, in_seq_no, admin_id, mtproto_seq FROM enc_chats WHERE uid IN(", str, ")"), new Object[0]);
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
                } catch (Exception e10) {
                    o(e10, true);
                }
            }
            queryFinalized.dispose();
        }
    }

    public final void V0(int i3) {
        if (!sr.f25403a) {
            int i10 = 0;
            while (!sr.f25403a) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                i10++;
                if (i10 > 5) {
                    break;
                }
            }
        }
        File h = t0.h();
        if (this.currentAccount != 0) {
            File file = new File(h, a1.g.o(this.currentAccount, "/", new StringBuilder("account")));
            file.mkdirs();
            h = file;
        }
        this.f24938c = new File(h, "cache4.db");
        this.d = new File(h, "cache4.db-wal");
        this.f24941e = new File(h, "cache4.db-shm");
        this.P = false;
        boolean exists = this.f24938c.exists();
        int i11 = 3;
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.f24938c.getPath());
            this.f24936b = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.f24936b.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            this.f24936b.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
            this.f24936b.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            if (!exists) {
                if (r2.f25040a) {
                    a8.b("create new database");
                }
                A(this.f24936b);
            } else {
                int intValue = this.f24936b.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (r2.f25040a) {
                    a8.b("current db version = " + intValue);
                }
                if (intValue != 0) {
                    try {
                        SQLiteCursor queryFinalized = this.f24936b.queryFinalized("SELECT seq, pts, date, qts, lsv, sg, pbytes FROM params WHERE id = 1", new Object[0]);
                        if (queryFinalized.next()) {
                            this.f24947w = queryFinalized.intValue(0);
                            this.f24945r = queryFinalized.intValue(1);
                            this.f24944n = queryFinalized.intValue(2);
                            this.f24946s = queryFinalized.intValue(3);
                            this.f24948x = queryFinalized.intValue(4);
                            this.E = queryFinalized.intValue(5);
                            if (queryFinalized.isNull(6)) {
                                this.f24949y = null;
                            } else {
                                byte[] byteArrayValue = queryFinalized.byteArrayValue(6);
                                this.f24949y = byteArrayValue;
                                if (byteArrayValue != null && byteArrayValue.length == 1) {
                                    this.f24949y = null;
                                }
                            }
                        }
                        queryFinalized.dispose();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        if (e11.getMessage() != null && e11.getMessage().contains("malformed")) {
                            throw new RuntimeException("malformed");
                        }
                        try {
                            this.f24936b.executeFast("CREATE TABLE IF NOT EXISTS params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
                            this.f24936b.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
                        } catch (Exception e12) {
                            a8.g(e12, true);
                        }
                    }
                    if (intValue < 181) {
                        try {
                            P1(intValue);
                        } catch (Exception e13) {
                            boolean z10 = r2.f25040a;
                            a8.g(e13, true);
                            throw new RuntimeException("malformed");
                        }
                    }
                } else {
                    throw new Exception("malformed");
                }
            }
            this.P = true;
        } catch (Exception e14) {
            a8.g(e14, true);
            if (i3 < 3 && e14.getMessage() != null && e14.getMessage().contains("malformed")) {
                if (i3 == 2) {
                    p(true);
                    s();
                } else {
                    p(false);
                }
                if (i3 == 1) {
                    i11 = 2;
                }
                V0(i11);
                return;
            }
        }
        g0.h3(new hq(this, 2));
        this.f24934a.c(new hq(this, 26));
        this.f24934a.c(new hq(this, 22));
        this.f24934a.c(new hq(this, 27));
        try {
            this.Q.countDown();
        } catch (Throwable unused) {
        }
        g0.h3(new hq(this, 3));
    }

    public final void V1(TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.f24934a.c(new vp(this, encryptedChat, 1));
    }

    public final org.telegram.tgnet.tl.TL_ephemeral.EphemeralMessage W(int r5, long r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.W(int, long):org.telegram.tgnet.tl.TL_ephemeral$EphemeralMessage");
    }

    public final void W0(ArrayList arrayList, tj tjVar) {
        if (arrayList != null && !arrayList.isEmpty()) {
            I(new dg(this, arrayList, tjVar, 16));
        }
    }

    public final void W1(org.telegram.messenger.support.LongSparseIntArray r31, org.telegram.messenger.support.LongSparseIntArray r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.W1(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, boolean):void");
    }

    public final ArrayList X(long j10, long j11) {
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.f24936b.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = ? AND topic_id = ? AND date >= ? ORDER BY date DESC LIMIT 30", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(getConnectionsManager().getCurrentTime() - 172800));
                while (sQLiteCursor.next()) {
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) sQLiteCursor.tlObjectValue(0, new go(2), false);
                    if (ephemeralMessage != null && ephemeralMessage.anchor_msg_id == 0) {
                        arrayList.add(ephemeralMessage);
                    }
                }
                sQLiteCursor.dispose();
                return arrayList;
            } catch (Exception e10) {
                o(e10, true);
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

    public final void X0(ArrayList arrayList, sj sjVar) {
        if (arrayList != null && !arrayList.isEmpty()) {
            I(new dg(this, arrayList, sjVar, 23));
        }
    }

    public final void X1(long j10, TLRPC.Message message) {
        this.f24934a.c(new a4(this, message, j10, 28));
    }

    public final ArrayList Y(ArrayList arrayList, long j10) {
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            SQLiteCursor sQLiteCursor = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.f24936b;
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
                } catch (Exception e10) {
                    o(e10, true);
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
        int i3;
        m1(arrayList, arrayList2, true, false);
        int size = sparseArray.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            C((mo) sparseArray.valueAt(i10));
            i10++;
            z10 = true;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            mo moVar = (mo) this.J.get(((Integer) it.next()).intValue());
            if (moVar != null) {
                moVar.f24240e = -1;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            mo moVar2 = (mo) this.J.get(((Integer) entry.getKey()).intValue());
            if (moVar2 != null) {
                Iterator it2 = ((HashSet) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    moVar2.f24244j.delete(((Long) it2.next()).longValue());
                }
                z10 = true;
            }
        }
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            x1((mo) arrayList3.get(i11), false);
            i11++;
            z10 = true;
        }
        int size3 = this.I.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size3; i12++) {
            mo moVar3 = (mo) this.I.get(i12);
            int indexOf = arrayList4.indexOf(Integer.valueOf(moVar3.f24237a));
            if (moVar3.f24241f != indexOf) {
                moVar3.f24241f = indexOf;
                z11 = true;
                z10 = true;
            }
        }
        if (z11) {
            Collections.sort(this.I, new tq(1));
            z1();
        }
        if (z10) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        j(true);
        hp messagesController = getMessagesController();
        ArrayList arrayList5 = new ArrayList(this.I);
        messagesController.getClass();
        Utilities.d.c(new rm(messagesController, tL_messages_dialogs, null, tL_messages_dialogs2, i3, arrayList5, arrayList, arrayList2, runnable));
    }

    public final void Y1(long j10, TLRPC.Poll poll, TLRPC.PollResults pollResults) {
        this.f24934a.c(new zl(this, j10, poll, pollResults, 16));
    }

    public final int Z(long j10) {
        LongSparseIntArray longSparseIntArray = this.S;
        int i3 = longSparseIntArray.get(j10, -1);
        if (i3 == -1) {
            i3 = 0;
            if (j10 < 0) {
                TLRPC.Chat O = O(-j10);
                if (O != null && O.forum) {
                    i3 = O.forum_tabs ? 3 : 1;
                }
                if (O != null && O.monoforum) {
                    i3 |= 4;
                }
            } else {
                TLRPC.User j02 = j0(j10);
                if (j02 != null && j02.bot_forum_view) {
                    i3 = 8;
                }
            }
            longSparseIntArray.put(j10, i3);
        }
        return i3;
    }

    public final void Z0(HashMap hashMap, boolean z10, boolean z11) {
        if (hashMap.isEmpty() && !z10 && !z11) {
            return;
        }
        this.f24934a.c(new qf(this, hashMap, z10, 2));
    }

    public final void Z1(long j10, int i3, TLRPC.TL_messageReactions tL_messageReactions) {
        this.f24934a.c(new yj(this, i3, j10, tL_messageReactions, 8));
    }

    public final void a1(a0.h hVar, a0.h hVar2, a0.h hVar3, boolean z10) {
        if (s0(hVar) && s0(hVar2) && s0(hVar3)) {
            return;
        }
        this.f24934a.c(new bn((c1) this, (Object) hVar, (Object) hVar2, (Object) hVar3, z10, 3));
    }

    public final long[] a2(long r35, long r37, java.lang.Integer r39, int r40, int r41, int r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.a2(long, long, java.lang.Integer, int, int, int, int):long[]");
    }

    public final boolean b(org.telegram.tgnet.TLRPC.Message r11, java.util.ArrayList r12, java.util.ArrayList r13, java.util.ArrayList r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.b(org.telegram.tgnet.TLRPC$Message, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean):boolean");
    }

    public final TLRPC.Message b0(long j10, long j11) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        this.f24934a.c(new f9(this, j10, j11, atomicReference, countDownLatch, 5));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return (TLRPC.Message) atomicReference.get();
    }

    public final void b1(List list) {
        if (list != null && !list.isEmpty()) {
            SQLitePreparedStatement executeFast = this.f24936b.executeFast("REPLACE INTO chats VALUES(?, ?, ?)");
            for (int i3 = 0; i3 < list.size(); i3++) {
                TLRPC.Chat chat = (TLRPC.Chat) list.get(i3);
                if (chat.min) {
                    SQLiteDatabase sQLiteDatabase = this.f24936b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.p(chat.f27001id, "SELECT data FROM chats WHERE uid = "), new Object[0]);
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
                                    if (x7.u.a(chat.flags2, 1048576)) {
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
                                    int i10 = chat.participants_count;
                                    if (i10 > 0) {
                                        TLdeserialize.participants_count = i10;
                                    }
                                    chat = TLdeserialize;
                                }
                            }
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    queryFinalized.dispose();
                }
                executeFast.requery();
                chat.flags |= 131072;
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize());
                chat.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, chat.f27001id);
                String str2 = chat.title;
                if (str2 != null) {
                    executeFast.bindString(2, str2.toLowerCase());
                } else {
                    executeFast.bindString(2, "");
                }
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                this.S.delete(-chat.f27001id);
            }
            executeFast.dispose();
        }
    }

    public final void b2(final int i3, final long j10, final long j11, final String str, final boolean z10) {
        this.f24934a.c(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_message e02;
                SQLitePreparedStatement executeFast;
                qr qrVar = qr.this;
                int i10 = i3;
                long j12 = j10;
                boolean z11 = z10;
                long j13 = j11;
                String str2 = str;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        qrVar.f24936b.beginTransaction();
                        e02 = qrVar.e0(i10, j12);
                        e02.voiceTranscriptionFinal = z11;
                        e02.voiceTranscriptionId = j13;
                        e02.voiceTranscription = str2;
                        executeFast = qrVar.f24936b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    executeFast.requery();
                    NativeByteBuffer c2 = oi.c(e02);
                    if (c2 != null) {
                        executeFast.bindByteBuffer(1, c2);
                    } else {
                        executeFast.bindNull(1);
                    }
                    executeFast.bindInteger(2, i10);
                    executeFast.bindLong(3, j12);
                    executeFast.step();
                    executeFast.dispose();
                    qrVar.f24936b.commitTransaction();
                    if (c2 != null) {
                        c2.reuse();
                    }
                    SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLitePreparedStatement = executeFast;
                    qrVar.o(e, true);
                    SQLiteDatabase sQLiteDatabase2 = qrVar.f24936b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = executeFast;
                    SQLiteDatabase sQLiteDatabase3 = qrVar.f24936b;
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
                SQLiteCursor queryFinalized = this.f24936b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND mid = " + j11 + " LIMIT 1", new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().f22848n);
                            }
                            byteBufferValue.reuse();
                            message2 = TLdeserialize;
                        }
                    } catch (Exception e10) {
                        e = e10;
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
        } catch (Exception e11) {
            e = e11;
            message = null;
        }
    }

    public final void c1(ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty() && !z10) {
            return;
        }
        this.f24934a.c(new up(this, z10, new ArrayList(arrayList)));
    }

    public final void c2(final long j10, final ArrayList arrayList, final boolean z10, final int i3, final int i10, final boolean z11, final HashMap hashMap) {
        this.f24934a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hr.run():void");
            }
        });
    }

    public final void d1(TLRPC.messages_Dialogs messages_dialogs, int i3) {
        if (messages_dialogs.dialogs.isEmpty()) {
            return;
        }
        this.f24934a.c(new k7(this, messages_dialogs, i3, 18));
    }

    public final void d2(long j10, long j11, int i3, int i10) {
        this.f24934a.c(new eg(this, j10, j11, i3, i10, 2));
    }

    public final TLRPC.TL_message e0(int i3, long j10) {
        SQLiteCursor queryFinalized;
        boolean z10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.f24936b.queryFinalized("SELECT custom_params FROM messages_v2 WHERE mid = ? AND uid = ?", Integer.valueOf(i3), Long.valueOf(j10));
            } catch (SQLiteException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (queryFinalized.next()) {
                oi.b(tL_message, queryFinalized.byteBufferValue(0));
                z10 = true;
            } else {
                z10 = false;
            }
            queryFinalized.dispose();
            if (!z10) {
                sQLiteCursor = this.f24936b.queryFinalized("SELECT custom_params FROM messages_topics WHERE mid = ? AND uid = ?", Integer.valueOf(i3), Long.valueOf(j10));
                if (sQLiteCursor.next()) {
                    oi.b(tL_message, sQLiteCursor.byteBufferValue(0));
                }
                sQLiteCursor.dispose();
                return tL_message;
            }
        } catch (SQLiteException e11) {
            e = e11;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.e1(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public final void e2(final long r23, final long r25, final int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.e2(long, long, int, int):void");
    }

    public final void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24934a.c(new dg((Object) this, (Object) str, (Object) str2, 19));
    }

    public final org.telegram.messenger.uq f0(long r83, long r85, int r87, int r88, int r89, int r90, int r91, int r92, int r93, long r94, int r96, boolean r97, boolean r98, org.telegram.messenger.sz r99) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.f0(long, long, int, int, int, int, int, int, int, long, int, boolean, boolean, org.telegram.messenger.sz):org.telegram.messenger.uq");
    }

    public final void f1(ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        I(new up(this, arrayList, z10, 1));
    }

    public final void f2(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i3) {
        int currentTime = getConnectionsManager().getCurrentTime();
        if (tL_forumTopic == null) {
            return;
        }
        this.f24934a.c(new b1(this, i3, tL_forumTopic, j10, currentTime));
    }

    public final void g(SQLitePreparedStatement sQLitePreparedStatement, TLRPC.Message message) {
        ArrayList<TLRPC.ReactionCount> arrayList;
        long j10;
        String str;
        long e10 = getUserConfig().e();
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions != null && tL_messageReactions.reactions_as_tags && (arrayList = tL_messageReactions.results) != null && !arrayList.isEmpty()) {
            bd E0 = bd.E0();
            String str2 = message.message;
            if (str2 == null) {
                str2 = "";
            }
            int i3 = 0;
            String S0 = E0.S0(str2, true, false);
            ArrayList<TLRPC.ReactionCount> arrayList2 = message.reactions.results;
            int size = arrayList2.size();
            while (i3 < size) {
                TLRPC.ReactionCount reactionCount = arrayList2.get(i3);
                i3++;
                TLRPC.ReactionCount reactionCount2 = reactionCount;
                TLRPC.Reaction reaction = reactionCount2.reaction;
                if ((reaction instanceof TLRPC.TL_reactionEmoji) || (reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, message.f27022id);
                    sQLitePreparedStatement.bindLong(2, zi.R1(e10, message));
                    TLRPC.Reaction reaction2 = reactionCount2.reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        j10 = ((TLRPC.TL_reactionEmoji) reaction2).emoticon.hashCode();
                    } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                        j10 = ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
                    } else {
                        j10 = 0;
                    }
                    sQLitePreparedStatement.bindLong(3, j10);
                    if (S0 == null) {
                        str = "";
                    } else {
                        str = S0;
                    }
                    sQLitePreparedStatement.bindString(4, str);
                    sQLitePreparedStatement.step();
                }
            }
        }
    }

    public final Object[] g0(int i3, String str) {
        if (str == null || str.toLowerCase().endsWith("attheme")) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Object[] objArr = new Object[2];
        this.f24934a.c(new sj(this, str, i3, objArr, countDownLatch, 3));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
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
                    this.f24936b.beginTransaction();
                } catch (Exception e10) {
                    o(e10, true);
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
        sQLitePreparedStatement = this.f24936b.executeFast("INSERT OR REPLACE INTO ephemeral_messages (dialog_id, id, topic_id, date, data) VALUES (?, ?, ?, ?, ?);");
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (!ephemeralMessage.welcome) {
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, m5.o(ephemeralMessage.peer_id));
                sQLitePreparedStatement.bindInteger(2, ephemeralMessage.f27216id);
                sQLitePreparedStatement.bindInteger(3, ephemeralMessage.top_msg_id);
                sQLitePreparedStatement.bindInteger(4, ephemeralMessage.date);
                sQLitePreparedStatement.bindTlObject(5, ephemeralMessage);
                sQLitePreparedStatement.step();
            }
        }
        if (z10) {
            this.f24936b.commitTransaction();
        }
        if (sQLitePreparedStatement != null) {
            sQLitePreparedStatement.dispose();
        }
    }

    public final void g2(long r10, long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.g2(long, long, long):void");
    }

    public final void h() {
        g0.h3(new hq(this, 14));
    }

    public final HashMap h0() {
        HashMap hashMap = new HashMap();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.f24936b.queryFinalized("SELECT uid, info, participants_count FROM chat_settings_v2 WHERE participants_count > 1", new Object[0]);
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
            } catch (Exception e10) {
                o(e10, true);
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

    public final void h1(int i3, int i10, int i11, long j10, long j11, TLRPC.messages_Messages messages_messages, boolean z10) {
        this.f24934a.c(new lg(this, i11, messages_messages, j10, j11, i3, i10, z10));
    }

    public final void h2(int i3, long j10, long j11, boolean z10) {
        this.f24934a.c(new ci.o8(this, j11, z10, "unread_poll_votes", j10, i3, "poll_votes_mentions_topics", "unread_poll_votes", "poll_votes_mentions"));
    }

    public final void i(Long l10) {
        int i3;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f24936b;
                Locale locale = Locale.US;
                i3 = 0;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM scheduled_messages_v2 WHERE uid = " + l10, new Object[0]);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (queryFinalized.next()) {
                i3 = queryFinalized.intValue(0);
            }
            queryFinalized.dispose();
            g0.h3(new k7(this, l10, i3, 17));
        } catch (Exception e11) {
            e = e11;
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

    public final p5 i0() {
        return this.f24934a;
    }

    public final void i1(int i3, int i10, long j10, ArrayList arrayList, boolean z10) {
        j1(arrayList, z10, true, false, i3, false, i10, j10);
    }

    public final void i2(int i3, long j10, long j11, boolean z10) {
        this.f24934a.c(new ci.o8(this, j11, z10, "unread_reactions", j10, i3, "reaction_mentions_topics", "unread_reactions", "reaction_mentions"));
    }

    public final void j(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.j(boolean):void");
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
        } catch (Exception e10) {
            o(e10, true);
            return null;
        }
    }

    public final void j1(final ArrayList arrayList, final boolean z10, boolean z11, final boolean z12, final int i3, final boolean z13, final int i10, final long j10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z11) {
                this.f24934a.c(new Runnable() {
                    @Override
                    public final void run() {
                        qr.this.k1(arrayList, z10, z12, i3, z13, i10, j10);
                    }
                });
                return;
            }
            k1(arrayList, z10, z12, i3, z13, i10, j10);
        }
    }

    public final void j2(TLRPC.UserFull userFull, boolean z10) {
        this.f24934a.c(new qf(this, userFull, z10, 8));
    }

    public final void k(int i3) {
        SparseArray sparseArray = this.h;
        ArrayList arrayList = (ArrayList) sparseArray.get(i3);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f24934a.a((Runnable) arrayList.get(i10));
        }
        sparseArray.remove(i3);
    }

    public final TLRPC.User k0(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.User[] userArr = new TLRPC.User[1];
        this.f24934a.c(new zl(this, userArr, j10, countDownLatch, 11));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return userArr[0];
    }

    public final void k1(java.util.ArrayList r65, boolean r66, boolean r67, int r68, boolean r69, int r70, long r71) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.k1(java.util.ArrayList, boolean, boolean, int, boolean, int, long):void");
    }

    public final void k2(ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.f24934a.c(new up(this, arrayList, z10, 0));
    }

    public final void l(int i3) {
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.f24936b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = ?", Integer.valueOf(i3));
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    if (!m5.E(longValue) && !m5.C(longValue)) {
                        TLRPC.Chat O = O(-longValue);
                        if (t3.r0(O) || O.migrated_to != null) {
                        }
                    }
                    z10 = false;
                }
                z10 = true;
                sQLiteCursor.dispose();
                if (z10) {
                    g0.h3(new kp(this, i3, 0));
                    this.f24936b.executeFast("DELETE FROM dialogs WHERE did = " + (2305843009213693952L | i3)).stepThis().dispose();
                }
                sQLiteCursor.dispose();
            } catch (Exception e10) {
                o(e10, true);
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
        } catch (Exception e10) {
            arrayList2.clear();
            o(e10, true);
            return arrayList2;
        }
    }

    public final void l1(String str, TLObject tLObject, int i3, String str2) {
        if (str != null && tLObject != null && str2 != null) {
            this.f24934a.c(new sj(this, str, tLObject, i3, str2, 4));
        }
    }

    public final void l2(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            try {
                SQLiteDatabase sQLiteDatabase = this.f24936b;
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
                    g0.h3(new k(4, arrayList2));
                }
            } catch (Exception e10) {
                o(e10, true);
            }
        }
    }

    public final boolean m(long j10) {
        boolean[] zArr = new boolean[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f24934a.c(new wp(this, j10, zArr, countDownLatch, 2));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
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
            this.f24934a.c(new ci.u8(this, list, list2, z10, 21));
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
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    Long l10 = (Long) arrayList.get(i3);
                    l10.getClass();
                    TLRPC.User a22 = getMessagesController().a2(l10);
                    if (a22 != null) {
                        arrayList2.add(a22);
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            if (!arrayList.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = this.f24936b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.q("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", arrayList), ")"), new Object[0]);
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
                                    getMessagesController().X3(TLdeserialize, true, false);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        o(e10, true);
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
                    this.f24936b.beginTransaction();
                } catch (Exception e10) {
                    o(e10, true);
                    SQLiteDatabase sQLiteDatabase = this.f24936b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                SQLiteDatabase sQLiteDatabase2 = this.f24936b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.commitTransaction();
                }
                throw th2;
            }
        }
        o1(list);
        b1(list2);
        SQLiteDatabase sQLiteDatabase3 = this.f24936b;
        if (sQLiteDatabase3 != null) {
            sQLiteDatabase3.commitTransaction();
        }
    }

    public final void o(java.lang.Throwable r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.o(java.lang.Throwable, boolean):void");
    }

    public final void o0(ArrayList arrayList, HashSet hashSet) {
        if (!hashSet.isEmpty()) {
            if (hashSet.size() > 50) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    TLRPC.User a22 = getMessagesController().a2((Long) it.next());
                    if (a22 != null) {
                        arrayList.add(a22);
                        it.remove();
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = this.f24936b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.q("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", hashSet), ")"), new Object[0]);
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
                    } catch (Exception e10) {
                        o(e10, true);
                    }
                }
                queryFinalized.dispose();
            }
        }
    }

    public final void o1(List list) {
        int i3;
        int i10;
        int i11;
        if (list != null && !list.isEmpty()) {
            SQLitePreparedStatement executeFast = this.f24936b.executeFast("REPLACE INTO users VALUES(?, ?, ?, ?)");
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.User user = (TLRPC.User) list.get(i12);
                if (user != null) {
                    if (user.min) {
                        SQLiteDatabase sQLiteDatabase = this.f24936b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a1.g.p(user.f27150id, "SELECT data FROM users WHERE uid = "), new Object[0]);
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
                            } catch (Exception e10) {
                                o(e10, true);
                            }
                        }
                        queryFinalized.dispose();
                    }
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(user.getObjectSize());
                    user.serializeToStream(nativeByteBuffer);
                    executeFast.bindLong(1, user.f27150id);
                    executeFast.bindString(2, K(user));
                    TLRPC.UserStatus userStatus = user.status;
                    if (userStatus != null) {
                        if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                            if (userStatus.by_me) {
                                i11 = -1000;
                            } else {
                                i11 = -100;
                            }
                            userStatus.expires = i11;
                        } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                            if (userStatus.by_me) {
                                i10 = -1001;
                            } else {
                                i10 = -101;
                            }
                            userStatus.expires = i10;
                        } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                            if (userStatus.by_me) {
                                i3 = -1002;
                            } else {
                                i3 = -102;
                            }
                            userStatus.expires = i3;
                        }
                        executeFast.bindInteger(3, userStatus.expires);
                    } else {
                        executeFast.bindInteger(3, 0);
                    }
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    this.S.delete(user.f27150id);
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
        SQLiteDatabase sQLiteDatabase = this.f24936b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f24936b = null;
        }
        if (z10) {
            File file = this.f24938c;
            if (file != null) {
                file.delete();
                this.f24938c = null;
            }
            File file2 = this.d;
            if (file2 != null) {
                file2.delete();
                this.d = null;
            }
            File file3 = this.f24941e;
            if (file3 != null) {
                file3.delete();
                this.f24941e = null;
            }
        }
    }

    public final void p0() {
        this.f24934a.c(new hq(this, 21));
    }

    public final void p1(int i3, ArrayList arrayList) {
        this.f24934a.c(new lp(this, i3, arrayList, 0));
    }

    public final void q() {
        this.f24944n = 0;
        this.f24947w = 0;
        this.f24945r = 0;
        this.f24946s = 0;
        this.f24948x = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.I.clear();
        this.J.clear();
        this.K.b();
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.f24949y = null;
        this.E = 0;
    }

    public final void q0(final int i3, final int i10, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final boolean z10) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f24934a.c(new Runnable() {
            @Override
            public final void run() {
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                qr qrVar = qr.this;
                int i11 = i3;
                CountDownLatch countDownLatch2 = countDownLatch;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                        Locale locale = Locale.US;
                        try {
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i11 + " ORDER BY ord ASC", new Object[0]);
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
                                            if (m5.E(longValue)) {
                                                arrayList7.add(Long.valueOf(longValue));
                                            } else {
                                                arrayList8.add(Long.valueOf(-longValue));
                                            }
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    sQLiteCursor = queryFinalized;
                                    qrVar.o(e, true);
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
                                if (i10 == 0) {
                                    SQLiteCursor queryFinalized2 = qrVar.f24936b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = 0 ORDER BY pinned DESC, date DESC LIMIT 0,10", new Object[0]);
                                    while (queryFinalized2.next()) {
                                        long longValue2 = queryFinalized2.longValue(0);
                                        if (!m5.D(longValue2)) {
                                            arrayList4.add(Long.valueOf(longValue2));
                                            if (arrayList5 != null && arrayList6 != null) {
                                                if (m5.E(longValue2)) {
                                                    arrayList7.add(Long.valueOf(longValue2));
                                                } else {
                                                    arrayList8.add(Long.valueOf(-longValue2));
                                                }
                                            }
                                        }
                                    }
                                    queryFinalized2.dispose();
                                } else {
                                    SQLiteCursor queryFinalized3 = qrVar.getMessagesStorage().f24936b.queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                                    while (queryFinalized3.next()) {
                                        long longValue3 = queryFinalized3.longValue(0);
                                        arrayList4.add(Long.valueOf(longValue3));
                                        if (arrayList5 != null && arrayList6 != null) {
                                            if (m5.E(longValue3)) {
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
                                    qrVar.Q(TextUtils.join(",", arrayList8), arrayList6);
                                }
                                if (!arrayList7.isEmpty()) {
                                    qrVar.n0(arrayList7, arrayList5, false);
                                }
                            }
                            countDownLatch2.countDown();
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    public final void q1(long j10) {
        this.f24934a.c(new op(this, j10, 6));
    }

    public final void r(int i3) {
        this.f24934a.c(new kp(this, i3, 4));
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
        this.f24934a.c(new bn(this, message, z10, arrayList, arrayList2, 1));
    }

    public final void s() {
        for (int i3 = 0; i3 < 2; i3++) {
            getUserConfig().x(i3, 0, 0, 0L, 0L, 0L, 0L);
            getUserConfig().z(i3, 0);
        }
        getUserConfig().v(false);
    }

    public final void s1() {
        q();
        g0.h3(new hq(this, 8));
    }

    public final void t(int r23, long r24, long r26, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.t(int, long, long, int, int):void");
    }

    public final void t1(boolean z10) {
        int size = this.I.size();
        for (int i3 = 0; i3 < size; i3++) {
            mo moVar = (mo) this.I.get(i3);
            if (z10) {
                int i10 = moVar.f24242g;
                int i11 = hp.C8;
                if ((i10 & 32) != 0) {
                    moVar.f24240e = -1;
                }
            } else {
                moVar.f24240e = -1;
            }
        }
        j(false);
        g0.h3(new hq(this, 24));
    }

    public final void u(int i3, int i10, long j10, long j11, String str) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        int i11;
        int i12;
        int i13;
        int i14;
        SQLiteCursor queryFinalized;
        int i15;
        ArrayList arrayList;
        int i16;
        boolean z10;
        SQLitePreparedStatement executeFast;
        long j12;
        int i17;
        int i18;
        int i19;
        int i20 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        boolean z11 = false;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                try {
                    if (i20 != 0) {
                        i11 = 2;
                        i12 = 3;
                        i13 = 4;
                        i14 = 1;
                        queryFinalized = this.f24936b.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND topic_id = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i3), Integer.valueOf(i10)), new Object[0]);
                    } else {
                        i11 = 2;
                        i12 = 3;
                        i13 = 4;
                        i14 = 1;
                        queryFinalized = this.f24936b.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j10), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i3), Integer.valueOf(i10)), new Object[0]);
                    }
                    sQLiteCursor2 = queryFinalized;
                    ArrayList arrayList2 = null;
                    while (sQLiteCursor2.next()) {
                        try {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            int intValue = sQLiteCursor2.intValue(0);
                            int i21 = i14;
                            int intValue2 = sQLiteCursor2.intValue(i21);
                            if (intValue != intValue2 || intValue != i21) {
                                arrayList2.add(new jr(intValue, intValue2));
                            }
                            i14 = 1;
                        } catch (Exception e10) {
                            e = e10;
                        }
                    }
                    sQLiteCursor2.dispose();
                    if (arrayList2 != null) {
                        int i22 = 0;
                        while (i22 < arrayList2.size()) {
                            jr jrVar = (jr) arrayList2.get(i22);
                            int i23 = jrVar.f23703b;
                            int i24 = jrVar.f23702a;
                            int i25 = i23 - 1;
                            boolean z12 = z11;
                            int i26 = i20;
                            if (i10 >= i25) {
                                i15 = i22;
                                if (i3 <= i24 + 1) {
                                    if (i26 != 0) {
                                        Long valueOf = Long.valueOf(j10);
                                        Long valueOf2 = Long.valueOf(j11);
                                        Integer valueOf3 = Integer.valueOf(i24);
                                        Integer valueOf4 = Integer.valueOf(i23);
                                        arrayList = arrayList2;
                                        Object[] objArr = new Object[i13];
                                        objArr[z12 ? 1 : 0] = valueOf;
                                        objArr[1] = valueOf2;
                                        objArr[i11] = valueOf3;
                                        objArr[i12] = valueOf4;
                                        this.f24936b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr)).stepThis().dispose();
                                    } else {
                                        arrayList = arrayList2;
                                        Long valueOf5 = Long.valueOf(j10);
                                        Integer valueOf6 = Integer.valueOf(i24);
                                        Integer valueOf7 = Integer.valueOf(i23);
                                        Object[] objArr2 = new Object[i12];
                                        objArr2[z12 ? 1 : 0] = valueOf5;
                                        objArr2[1] = valueOf6;
                                        objArr2[i11] = valueOf7;
                                        this.f24936b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr2)).stepThis().dispose();
                                    }
                                    i18 = i11;
                                    i16 = 3;
                                    z10 = false;
                                    i22 = i15 + 1;
                                    i12 = i16;
                                    i11 = i18;
                                    z11 = z10;
                                    i20 = i26;
                                    arrayList2 = arrayList;
                                    i13 = 4;
                                }
                            } else {
                                i15 = i22;
                            }
                            arrayList = arrayList2;
                            if (i10 >= i25) {
                                if (i23 != i3) {
                                    if (i26 != 0) {
                                        try {
                                            SQLiteDatabase sQLiteDatabase = this.f24936b;
                                            Locale locale = Locale.US;
                                            Long valueOf8 = Long.valueOf(j10);
                                            Long valueOf9 = Long.valueOf(j11);
                                            Integer valueOf10 = Integer.valueOf(i24);
                                            Integer valueOf11 = Integer.valueOf(i23);
                                            Object[] objArr3 = new Object[4];
                                            objArr3[z12 ? 1 : 0] = valueOf8;
                                            objArr3[1] = valueOf9;
                                            objArr3[i11] = valueOf10;
                                            objArr3[3] = valueOf11;
                                            sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr3)).stepThis().dispose();
                                            Long valueOf12 = Long.valueOf(j10);
                                            Long valueOf13 = Long.valueOf(j11);
                                            Integer valueOf14 = Integer.valueOf(i24);
                                            Integer valueOf15 = Integer.valueOf(i3);
                                            Object[] objArr4 = new Object[4];
                                            objArr4[z12 ? 1 : 0] = valueOf12;
                                            objArr4[1] = valueOf13;
                                            objArr4[i11] = valueOf14;
                                            objArr4[3] = valueOf15;
                                            this.f24936b.executeFast(String.format(locale, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr4)).stepThis().dispose();
                                        } catch (Exception e11) {
                                            o(e11, z12);
                                        }
                                    } else {
                                        SQLiteDatabase sQLiteDatabase2 = this.f24936b;
                                        Locale locale2 = Locale.US;
                                        Long valueOf16 = Long.valueOf(j10);
                                        Integer valueOf17 = Integer.valueOf(i24);
                                        Integer valueOf18 = Integer.valueOf(i23);
                                        Object[] objArr5 = new Object[3];
                                        objArr5[z12 ? 1 : 0] = valueOf16;
                                        objArr5[1] = valueOf17;
                                        objArr5[i11] = valueOf18;
                                        sQLiteDatabase2.executeFast(String.format(locale2, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr5)).stepThis().dispose();
                                        Long valueOf19 = Long.valueOf(j10);
                                        Integer valueOf20 = Integer.valueOf(i24);
                                        Integer valueOf21 = Integer.valueOf(i3);
                                        Object[] objArr6 = new Object[3];
                                        objArr6[z12 ? 1 : 0] = valueOf19;
                                        objArr6[1] = valueOf20;
                                        objArr6[i11] = valueOf21;
                                        this.f24936b.executeFast(String.format(locale2, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr6)).stepThis().dispose();
                                    }
                                }
                            } else if (i3 <= i24 + 1) {
                                if (i24 != i10) {
                                    if (i26 != 0) {
                                        try {
                                            SQLiteDatabase sQLiteDatabase3 = this.f24936b;
                                            Locale locale3 = Locale.US;
                                            Long valueOf22 = Long.valueOf(j10);
                                            Long valueOf23 = Long.valueOf(j11);
                                            Integer valueOf24 = Integer.valueOf(i24);
                                            Integer valueOf25 = Integer.valueOf(i23);
                                            Object[] objArr7 = new Object[4];
                                            objArr7[0] = valueOf22;
                                            objArr7[1] = valueOf23;
                                            objArr7[i11] = valueOf24;
                                            objArr7[3] = valueOf25;
                                            sQLiteDatabase3.executeFast(String.format(locale3, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr7)).stepThis().dispose();
                                            Long valueOf26 = Long.valueOf(j10);
                                            Long valueOf27 = Long.valueOf(j11);
                                            Integer valueOf28 = Integer.valueOf(i10);
                                            Integer valueOf29 = Integer.valueOf(i23);
                                            Object[] objArr8 = new Object[4];
                                            objArr8[0] = valueOf26;
                                            objArr8[1] = valueOf27;
                                            objArr8[i11] = valueOf28;
                                            objArr8[3] = valueOf29;
                                            this.f24936b.executeFast(String.format(locale3, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr8)).stepThis().dispose();
                                        } catch (Exception e12) {
                                            o(e12, false);
                                        }
                                    } else {
                                        SQLiteDatabase sQLiteDatabase4 = this.f24936b;
                                        Locale locale4 = Locale.US;
                                        Long valueOf30 = Long.valueOf(j10);
                                        Integer valueOf31 = Integer.valueOf(i24);
                                        Integer valueOf32 = Integer.valueOf(i23);
                                        Object[] objArr9 = new Object[3];
                                        objArr9[0] = valueOf30;
                                        objArr9[1] = valueOf31;
                                        objArr9[i11] = valueOf32;
                                        sQLiteDatabase4.executeFast(String.format(locale4, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr9)).stepThis().dispose();
                                        Long valueOf33 = Long.valueOf(j10);
                                        Integer valueOf34 = Integer.valueOf(i10);
                                        Integer valueOf35 = Integer.valueOf(i23);
                                        Object[] objArr10 = new Object[3];
                                        objArr10[0] = valueOf33;
                                        objArr10[1] = valueOf34;
                                        objArr10[i11] = valueOf35;
                                        this.f24936b.executeFast(String.format(locale4, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr10)).stepThis().dispose();
                                    }
                                }
                            } else {
                                if (i26 != 0) {
                                    Long valueOf36 = Long.valueOf(j10);
                                    Long valueOf37 = Long.valueOf(j11);
                                    Integer valueOf38 = Integer.valueOf(i24);
                                    Integer valueOf39 = Integer.valueOf(i23);
                                    Object[] objArr11 = new Object[4];
                                    objArr11[0] = valueOf36;
                                    objArr11[1] = valueOf37;
                                    objArr11[i11] = valueOf38;
                                    objArr11[3] = valueOf39;
                                    this.f24936b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr11)).stepThis().dispose();
                                    executeFast = this.f24936b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                                    i16 = 3;
                                    z10 = false;
                                } else {
                                    Long valueOf40 = Long.valueOf(j10);
                                    Integer valueOf41 = Integer.valueOf(i24);
                                    Integer valueOf42 = Integer.valueOf(i23);
                                    i16 = 3;
                                    Object[] objArr12 = new Object[3];
                                    z10 = false;
                                    objArr12[0] = valueOf40;
                                    objArr12[1] = valueOf41;
                                    objArr12[i11] = valueOf42;
                                    this.f24936b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr12)).stepThis().dispose();
                                    executeFast = this.f24936b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                                }
                                try {
                                    executeFast.requery();
                                    executeFast.bindLong(1, j10);
                                    if (i26 != 0) {
                                        j12 = j11;
                                        executeFast.bindLong(i11, j12);
                                        i17 = i16;
                                    } else {
                                        j12 = j11;
                                        i17 = 2;
                                    }
                                    executeFast.bindInteger(i17, i24);
                                    executeFast.bindInteger(i17 + 1, i3);
                                    executeFast.step();
                                    executeFast.requery();
                                    executeFast.bindLong(1, j10);
                                    if (i26 != 0) {
                                        i18 = 2;
                                        executeFast.bindLong(2, j12);
                                        i19 = i16;
                                    } else {
                                        i18 = 2;
                                        i19 = 2;
                                    }
                                    executeFast.bindInteger(i19, i10);
                                    executeFast.bindInteger(i19 + 1, i23);
                                    executeFast.step();
                                    executeFast.dispose();
                                    i22 = i15 + 1;
                                    i12 = i16;
                                    i11 = i18;
                                    z11 = z10;
                                    i20 = i26;
                                    arrayList2 = arrayList;
                                    i13 = 4;
                                } catch (Exception e13) {
                                    e = e13;
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
                            i18 = i11;
                            i16 = 3;
                            z10 = false;
                            i22 = i15 + 1;
                            i12 = i16;
                            i11 = i18;
                            z11 = z10;
                            i20 = i26;
                            arrayList2 = arrayList;
                            i13 = 4;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e14) {
                e = e14;
                sQLiteCursor2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }

    public final boolean u0(int i3, long j10) {
        if ((i3 & Z(j10)) != 0) {
            return true;
        }
        return false;
    }

    public final void u1(long j10) {
        LongSparseIntArray longSparseIntArray;
        SQLiteCursor sQLiteCursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f24936b;
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
                    this.f24936b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j10).stepThis().dispose();
                }
                W1(longSparseIntArray, null, true);
                getMessagesController().H3(longSparseIntArray, null);
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
        this.f24934a.c(new zl(this, j10, boolArr, countDownLatch, 12));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return boolArr[0].booleanValue();
    }

    public final void v1(String str, TLObject tLObject) {
        if (tLObject != null && !TextUtils.isEmpty(str)) {
            this.f24934a.c(new dg((Object) this, (Object) tLObject, str, 18));
        }
    }

    public final boolean w0(long j10) {
        return u0(4, j10);
    }

    public final void w1(int i3, long j10) {
        this.f24934a.c(new rp(this, i3, j10, 2));
    }

    public final SQLiteCursor x(int i3, int i10, long j10) {
        SQLiteDatabase sQLiteDatabase = this.f24936b;
        Locale locale = Locale.US;
        StringBuilder t10 = a1.g.t(j10, "SELECT data, seen, pin FROM profile_stories JOIN profile_stories_albums_links ON profile_stories.story_id = profile_stories_albums_links.story_id WHERE profile_stories.dialog_id = ", " AND profile_stories_albums_links.dialog_id = ");
        t10.append(j10);
        t10.append("  AND profile_stories_albums_links.album_id = ");
        t10.append(i3);
        t10.append(" AND profile_stories.type = ");
        t10.append(i10);
        t10.append(" ORDER BY profile_stories_albums_links.order_index ASC;");
        return sQLiteDatabase.queryFinalized(t10.toString(), new Object[0]);
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

    public final void x1(mo moVar, boolean z10) {
        int i3;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        String str;
        ArrayList arrayList = this.I;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        try {
            try {
                if (!arrayList.contains(moVar)) {
                    if (z10) {
                        if (((mo) arrayList.get(0)).e()) {
                            arrayList.add(1, moVar);
                        } else {
                            arrayList.add(0, moVar);
                        }
                    } else {
                        arrayList.add(moVar);
                    }
                    this.J.put(moVar.f24237a, moVar);
                }
                executeFast = this.f24936b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            int i10 = moVar.f24237a;
            LongSparseIntArray longSparseIntArray = moVar.f24244j;
            executeFast.bindInteger(1, i10);
            executeFast.bindInteger(2, moVar.f24241f);
            executeFast.bindInteger(3, moVar.d);
            executeFast.bindInteger(4, moVar.f24242g);
            if (moVar.f24237a == 0) {
                str = "ALL_CHATS";
            } else {
                str = moVar.f24238b;
            }
            executeFast.bindString(5, str);
            executeFast.bindInteger(6, moVar.f24247m);
            Vector vector = new Vector(new go(1));
            vector.objects.addAll(moVar.f24239c);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
            vector.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(7, nativeByteBuffer);
            executeFast.bindInteger(8, moVar.f24248n ? 1 : 0);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
            this.f24936b.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + moVar.f24237a).stepThis().dispose();
            this.f24936b.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + moVar.f24237a).stepThis().dispose();
            this.f24936b.beginTransaction();
            SQLitePreparedStatement executeFast2 = this.f24936b.executeFast("REPLACE INTO dialog_filter_pin_v2 VALUES(?, ?, ?)");
            int size = moVar.h.size();
            for (int i11 = 0; i11 < size; i11++) {
                long longValue = ((Long) moVar.h.get(i11)).longValue();
                executeFast2.requery();
                executeFast2.bindInteger(1, moVar.f24237a);
                executeFast2.bindLong(2, longValue);
                executeFast2.bindInteger(3, longSparseIntArray.get(longValue, Integer.MIN_VALUE));
                executeFast2.step();
            }
            int size2 = longSparseIntArray.size();
            for (int i12 = 0; i12 < size2; i12++) {
                long keyAt = longSparseIntArray.keyAt(i12);
                if (m5.C(keyAt)) {
                    executeFast2.requery();
                    executeFast2.bindInteger(1, moVar.f24237a);
                    executeFast2.bindLong(2, keyAt);
                    executeFast2.bindInteger(3, longSparseIntArray.valueAt(i12));
                    executeFast2.step();
                }
            }
            executeFast2.dispose();
            SQLitePreparedStatement executeFast3 = this.f24936b.executeFast("REPLACE INTO dialog_filter_ep VALUES(?, ?)");
            int size3 = moVar.f24243i.size();
            for (i3 = 0; i3 < size3; i3++) {
                executeFast3.requery();
                executeFast3.bindInteger(1, moVar.f24237a);
                executeFast3.bindLong(2, ((Long) moVar.f24243i.get(i3)).longValue());
                executeFast3.step();
            }
            executeFast3.dispose();
            this.f24936b.commitTransaction();
            SQLiteDatabase sQLiteDatabase = this.f24936b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement3 = sQLitePreparedStatement2;
            o(e, true);
            SQLiteDatabase sQLiteDatabase2 = this.f24936b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement3 = sQLitePreparedStatement;
            SQLiteDatabase sQLiteDatabase3 = this.f24936b;
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
        tL_forumTopic.top_message = message.f27022id;
        tL_forumTopic.topMessage = message;
        tL_forumTopic.from_id = message.from_id;
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        int i3 = 0;
        tL_forumTopic.unread_count = 0;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) messageAction;
            tL_forumTopic.f27053id = message.f27022id;
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
            g0.h3(new a4(this, j10, tL_forumTopic, 22));
        } else if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
            tL_forumTopic.f27053id = (int) zi.c2(this.currentAccount, message, true, false);
            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
            tL_forumTopic.title = tL_messageActionTopicEdit.title;
            tL_forumTopic.closed = tL_messageActionTopicEdit.closed;
            tL_forumTopic.hidden = tL_messageActionTopicEdit.hidden;
            int i10 = tL_messageActionTopicEdit.flags;
            if ((i10 & 1) != 0) {
                i3 = 1;
            }
            if ((i10 & 2) != 0) {
                i3 += 2;
            }
            if ((i10 & 4) != 0) {
                i3 += 8;
            }
            if ((i10 & 8) != 0) {
                i3 += 32;
            }
            this.f24934a.c(new b1(this, i3, tL_forumTopic, j10, message.date));
        }
    }

    public final void y1() {
        this.f24934a.c(new jp(this, new ArrayList(getMessagesController().Q0), 8));
    }

    public final long z(NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return 0L;
        }
        long andAdd = this.f24943f.getAndAdd(1L);
        this.f24934a.c(new a4(this, andAdd, nativeByteBuffer, 25));
        return andAdd;
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qr.z0():void");
    }

    public final void z1() {
        ArrayList arrayList = this.I;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.f24936b.executeFast("UPDATE dialog_filter SET ord = ?, flags = ? WHERE id = ?");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    mo moVar = (mo) arrayList.get(i3);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, moVar.f24241f);
                    sQLitePreparedStatement.bindInteger(2, moVar.f24242g);
                    sQLitePreparedStatement.bindInteger(3, moVar.f24237a);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                o(e10, true);
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
