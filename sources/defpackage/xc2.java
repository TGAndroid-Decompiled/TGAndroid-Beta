package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public abstract class xc2 {
    public static boolean A(int i, TLRPC.Chat chat, int i2) {
        return y(i2, E(i, chat));
    }

    public static boolean B(TLRPC.Chat chat) {
        if (T(chat) && !chat.creator) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
            if (tL_chatAdminRights == null || !tL_chatAdminRights.post_messages) {
                if (chat.broadcast || chat.gigagroup) {
                    if (!chat.gigagroup || !N(chat)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean C(TLRPC.TL_chatBannedRights tL_chatBannedRights, int i) {
        if (tL_chatBannedRights != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 3) {
                        if (i != 26) {
                            if (i != 27) {
                                switch (i) {
                                    case 6:
                                        return tL_chatBannedRights.send_messages;
                                    case 7:
                                        return tL_chatBannedRights.send_media;
                                    case 8:
                                        return tL_chatBannedRights.send_stickers;
                                    case 9:
                                        return tL_chatBannedRights.embed_links;
                                    case 10:
                                        return tL_chatBannedRights.send_polls;
                                    case 11:
                                        return tL_chatBannedRights.view_messages;
                                    default:
                                        switch (i) {
                                            case 15:
                                                return tL_chatBannedRights.manage_topics;
                                            case 16:
                                                return tL_chatBannedRights.send_photos;
                                            case 17:
                                                return tL_chatBannedRights.send_videos;
                                            case 18:
                                                return tL_chatBannedRights.send_audios;
                                            case 19:
                                                return tL_chatBannedRights.send_docs;
                                            case 20:
                                                return tL_chatBannedRights.send_voices;
                                            case 21:
                                                return tL_chatBannedRights.send_roundvideos;
                                            case 22:
                                                return tL_chatBannedRights.send_plain;
                                            default:
                                                return false;
                                        }
                                }
                            }
                            return tL_chatBannedRights.manage_linked_peers;
                        }
                        return tL_chatBannedRights.send_reactions;
                    }
                    return tL_chatBannedRights.invite_users;
                }
                return tL_chatBannedRights.change_info;
            }
            return tL_chatBannedRights.pin_messages;
        }
        return false;
    }

    public static String D(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        StringBuilder sb = new StringBuilder(String.valueOf(tL_chatBannedRights.view_messages ? 1 : 0) + (tL_chatBannedRights.send_messages ? 1 : 0));
        sb.append(tL_chatBannedRights.send_media ? 1 : 0);
        StringBuilder sb2 = new StringBuilder(sb.toString() + (tL_chatBannedRights.send_stickers ? 1 : 0));
        sb2.append(tL_chatBannedRights.send_gifs ? 1 : 0);
        StringBuilder sb3 = new StringBuilder(sb2.toString() + (tL_chatBannedRights.send_games ? 1 : 0));
        sb3.append(tL_chatBannedRights.send_inline ? 1 : 0);
        StringBuilder sb4 = new StringBuilder(sb3.toString() + (tL_chatBannedRights.embed_links ? 1 : 0));
        sb4.append(tL_chatBannedRights.send_polls ? 1 : 0);
        StringBuilder sb5 = new StringBuilder(sb4.toString() + (tL_chatBannedRights.invite_users ? 1 : 0));
        sb5.append(tL_chatBannedRights.change_info ? 1 : 0);
        StringBuilder sb6 = new StringBuilder(sb5.toString() + (tL_chatBannedRights.pin_messages ? 1 : 0));
        sb6.append(tL_chatBannedRights.manage_topics ? 1 : 0);
        StringBuilder sb7 = new StringBuilder(sb6.toString() + (tL_chatBannedRights.send_photos ? 1 : 0));
        sb7.append(tL_chatBannedRights.send_videos ? 1 : 0);
        StringBuilder sb8 = new StringBuilder(sb7.toString() + (tL_chatBannedRights.send_roundvideos ? 1 : 0));
        sb8.append(tL_chatBannedRights.send_voices ? 1 : 0);
        StringBuilder sb9 = new StringBuilder(sb8.toString() + (tL_chatBannedRights.send_audios ? 1 : 0));
        sb9.append(tL_chatBannedRights.send_docs ? 1 : 0);
        StringBuilder sb10 = new StringBuilder(sb9.toString() + (tL_chatBannedRights.send_plain ? 1 : 0));
        sb10.append(tL_chatBannedRights.edit_rank ? 1 : 0);
        StringBuilder sb11 = new StringBuilder(sb10.toString() + (tL_chatBannedRights.send_reactions ? 1 : 0));
        sb11.append(tL_chatBannedRights.manage_linked_peers ? 1 : 0);
        return sb11.toString() + tL_chatBannedRights.until_date;
    }

    public static TLRPC.Chat E(int i, TLRPC.Chat chat) {
        if (chat != null && chat.linked_monoforum_id != 0) {
            if (chat.monoforum) {
                return uc7.s1(i).M0(Long.valueOf(chat.linked_monoforum_id));
            }
            return chat;
        }
        return null;
    }

    public static int F(TLRPC.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = chat.color;
        if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0) {
            return peerColor.color;
        }
        return (int) (chat.id % 7);
    }

    public static long G(TLRPC.Chat chat) {
        if (chat != null) {
            TLRPC.PeerColor peerColor = chat.color;
            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                return peerColor.background_emoji_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static int H(TLRPC.GroupCallParticipant groupCallParticipant) {
        if ((groupCallParticipant.flags & 128) != 0) {
            return groupCallParticipant.volume;
        }
        return 10000;
    }

    public static int I(TLRPC.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TLRPC.PeerColor peerColor = chat.profile_color;
        if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0) {
            return peerColor.color;
        }
        return -1;
    }

    public static long J(TLRPC.Chat chat) {
        if (chat != null) {
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                return ((TLRPC.TL_emojiStatusCollectible) emojiStatus).pattern_document_id;
            }
            TLRPC.PeerColor peerColor = chat.profile_color;
            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                return peerColor.background_emoji_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static String K(TLRPC.Chat chat, boolean z) {
        if (chat != null) {
            if (!TextUtils.isEmpty(chat.username) && !z) {
                return chat.username;
            }
            if (chat.usernames != null) {
                for (int i = 0; i < chat.usernames.size(); i++) {
                    TLRPC.TL_username tL_username = chat.usernames.get(i);
                    if (tL_username != null && (((tL_username.active && !z) || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                        return tL_username.username;
                    }
                }
            }
            if (!TextUtils.isEmpty(chat.username) && z) {
                ArrayList<TLRPC.TL_username> arrayList = chat.usernames;
                if (arrayList == null || arrayList.size() <= 0) {
                    return chat.username;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static String L(int i, TLRPC.Chat chat) {
        if (i == 23) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachGifRestrictedForever", null, 2131753962, new Object[0]);
                }
                return ob6.a0("AttachGifRestricted", null, 2131753963, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749316, null);
        } else if (i == 8) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachStickersRestrictedForever", null, 2131753927, new Object[0]);
                }
                return ob6.a0("AttachStickersRestricted", null, 2131753928, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749310, null);
        } else if (i == 16) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachPhotoRestrictedForever", null, 2131753938, new Object[0]);
                }
                return ob6.a0("AttachPhotoRestricted", null, 2131753939, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749313, null);
        } else if (i == 17) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachVideoRestrictedForever", null, 2131753923, new Object[0]);
                }
                return ob6.a0("AttachVideoRestricted", null, 2131753924, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749309, null);
        } else if (i == 19) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachDocumentsRestrictedForever", null, 2131753966, new Object[0]);
                }
                return ob6.a0("AttachDocumentsRestricted", null, 2131753967, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749318, null);
        } else if (i == 7) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachMediaRestrictedForever", null, 2131753948, new Object[0]);
                }
                return ob6.a0("AttachMediaRestricted", null, 2131753949, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749314, null);
        } else if (i == 18) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachAudioRestrictedForever", null, 2131753973, new Object[0]);
                }
                return ob6.a0("AttachAudioRestricted", null, 2131753974, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749319, null);
        } else if (i == 22) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachPlainRestrictedForever", null, 2131753936, new Object[0]);
                }
                return ob6.a0("AttachPlainRestricted", null, 2131753937, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749312, null);
        } else if (i == 21) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachRoundRestrictedForever", null, 2131753931, new Object[0]);
                }
                return ob6.a0("AttachRoundRestricted", null, 2131753932, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749311, null);
        } else if (i == 20) {
            if (chat != null && !P(i, chat)) {
                if (hl.B1(chat.banned_rights)) {
                    return ob6.a0("AttachVoiceRestrictedForever", null, 2131753920, new Object[0]);
                }
                return ob6.a0("AttachVoiceRestricted", null, 2131753921, ob6.v(chat.banned_rights.until_date));
            }
            return ob6.M0(2131749308, null);
        } else {
            return "";
        }
    }

    public static long M(TLRPC.Chat chat, TLRPC.ChatFull chatFull, boolean z) {
        long j;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (chat != null && chatFull != null && (peer = chatFull.default_send_as) != null) {
            long j2 = peer.user_id;
            if (j2 != 0) {
                return j2;
            }
            j = peer.channel_id;
            if (!z) {
                return j;
            }
        } else if (chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous) {
            j = chat.id;
            if (!z) {
                return j;
            }
        } else if (chat != null && V(chat) && !chat.signatures) {
            j = chat.id;
            if (!z) {
                return j;
            }
        } else {
            return yac.h(yac.t0).e();
        }
        return -j;
    }

    public static boolean N(TLRPC.Chat chat) {
        if (chat != null) {
            if (!chat.creator) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                if (tL_chatAdminRights != null && tL_chatAdminRights.flags != 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean O(String str, TLRPC.Chat chat) {
        if (chat == null) {
            return false;
        }
        if (!TextUtils.isEmpty(chat.username)) {
            return chat.username.equalsIgnoreCase(str);
        }
        if (chat.usernames != null) {
            for (int i = 0; i < chat.usernames.size(); i++) {
                TLRPC.TL_username tL_username = chat.usernames.get(i);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username) && tL_username.username.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean P(int i, TLRPC.Chat chat) {
        if (chat == null) {
            return false;
        }
        if (C(chat.banned_rights, i) && C(chat.default_banned_rights, i)) {
            return true;
        }
        return C(chat.default_banned_rights, i);
    }

    public static boolean Q(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 15) {
            return true;
        }
        return false;
    }

    public static boolean R(TLRPC.Chat chat) {
        if ((V(chat) || n0(chat)) && !p0(chat)) {
            return true;
        }
        return false;
    }

    public static boolean S(int i, long j) {
        return T(uc7.s1(i).M0(Long.valueOf(j)));
    }

    public static boolean T(TLRPC.Chat chat) {
        if (!(chat instanceof TLRPC.TL_channel) && !(chat instanceof TLRPC.TL_channelForbidden) && !Y(chat)) {
            return false;
        }
        return true;
    }

    public static boolean U(int i, long j) {
        return V(uc7.s1(i).M0(Long.valueOf(j)));
    }

    public static boolean V(TLRPC.Chat chat) {
        if (T(chat) && !n0(chat)) {
            return true;
        }
        return false;
    }

    public static boolean W(TLRPC.Chat chat) {
        if (T(chat)) {
            if (!chat.megagroup || chat.gigagroup) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean X(int i, TLRPC.Chat chat) {
        TLRPC.Chat M0;
        if (chat == null || chat.linked_community_id == 0 || (M0 = uc7.s1(i).M0(Long.valueOf(chat.linked_community_id))) == null || !M0.collapsed_in_dialogs) {
            return false;
        }
        return true;
    }

    public static boolean Y(TLRPC.Chat chat) {
        if (!(chat instanceof TLRPC.TL_community) && !(chat instanceof TLRPC.TL_communityForbidden)) {
            return false;
        }
        return true;
    }

    public static boolean Z(int i, long j) {
        uc7 s1 = uc7.s1(i);
        TLRPC.Chat M0 = s1.M0(Long.valueOf(j));
        TLRPC.ChatFull N0 = s1.N0(j);
        if (n0(M0) && N0 != null && N0.linked_chat_id != 0) {
            return true;
        }
        return false;
    }

    public static boolean a(TLRPC.Chat chat) {
        if (!xea.m) {
            if (chat == null || !chat.forum_tabs) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean a0(TLRPC.Chat chat) {
        if (!(chat instanceof TLRPC.TL_chatForbidden) && !(chat instanceof TLRPC.TL_channelForbidden) && !(chat instanceof TLRPC.TL_communityForbidden)) {
            return false;
        }
        return true;
    }

    public static boolean b(TLRPC.Chat chat) {
        if (T(chat)) {
            if (chat.megagroup) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                if ((tL_chatAdminRights != null && (tL_chatAdminRights.post_messages || tL_chatAdminRights.add_admins)) || chat.creator) {
                    return true;
                }
                return false;
            }
            return false;
        } else if (chat.migrated_to == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean b0(int i, long j) {
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
        if (M0 != null) {
            return M0.forum;
        }
        return false;
    }

    public static boolean c(TLRPC.Chat chat) {
        return w(27, chat);
    }

    public static boolean c0(TLRPC.Chat chat) {
        if (chat != null && chat.forum) {
            return true;
        }
        return false;
    }

    public static boolean d(TLRPC.Chat chat) {
        return w(1, chat);
    }

    public static boolean d0(int i, long j) {
        if (j > 0) {
            return f0(i, uc7.s1(i).X1(Long.valueOf(j)));
        }
        return e0(i, uc7.s1(i).M0(Long.valueOf(-j)));
    }

    public static boolean e(int i, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        TLRPC.Message message;
        TLRPC.Message message2;
        int size;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            if (!w(13, chat)) {
                if (q0(i, tL_forumTopic) && (message = tL_forumTopic.topMessage) != null && (message2 = tL_forumTopic.topicStartMessage) != null) {
                    int i2 = message.id - message2.id;
                    ArrayList<r47> arrayList = tL_forumTopic.groupedMessages;
                    if (arrayList == null) {
                        size = 0;
                    } else {
                        size = arrayList.size();
                    }
                    if (i2 > Math.max(1, size) || !r47.u5(tL_forumTopic.from_id, tL_forumTopic.topMessage.from_id)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e0(int i, TLRPC.Chat chat) {
        if (chat != null && g0(chat.linked_community_id, i, -chat.id)) {
            return true;
        }
        return false;
    }

    public static boolean f(TLRPC.Chat chat) {
        return w(14, chat);
    }

    public static boolean f0(int i, TLRPC.User user) {
        if (user != null && g0(user.linked_community_id, i, user.id)) {
            return true;
        }
        return false;
    }

    public static boolean g(int i, TLRPC.Chat chat) {
        return A(i, chat, 24);
    }

    public static boolean g0(long j, int i, long j2) {
        TLRPC.ChatFull N0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j != 0 && j2 != 0 && (N0 = uc7.s1(i).N0(j)) != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (wf3.n(communityPeer2.peer) == j2 && vsd.a(communityPeer2.flags, 1) && !communityPeer2.visible) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h(TLRPC.Chat chat) {
        boolean z;
        if (chat == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.banned_rights;
        if (tL_chatBannedRights == null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
            if (tL_chatBannedRights2 == null) {
                return true;
            }
            z = tL_chatBannedRights2.edit_rank;
        } else {
            z = tL_chatBannedRights.edit_rank;
        }
        return !z;
    }

    public static boolean h0(TLRPC.Chat chat) {
        if (chat != null) {
            return i0(uc7.s1(yac.t0).N0(chat.id));
        }
        return false;
    }

    public static boolean i(int i, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        if (!y(15, chat) && !q0(i, tL_forumTopic)) {
            return false;
        }
        return true;
    }

    public static boolean i0(TLRPC.ChatFull chatFull) {
        int i;
        if (chatFull != null && (i = chatFull.boosts_unrestrict) > 0 && chatFull.boosts_applied - i >= 0) {
            return true;
        }
        return false;
    }

    public static boolean j(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (!w(0, chat)) {
            if (!T(chat) || chat.megagroup || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_messages) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean j0(TLRPC.Chat chat) {
        if (chat == null || (chat instanceof TLRPC.TL_chatEmpty) || a0(chat) || chat.left || chat.kicked || chat.deactivated) {
            return false;
        }
        return true;
    }

    public static boolean k(TLRPC.Chat chat) {
        if (T(chat)) {
            if (chat.megagroup || !chat.signatures || !N(chat) || !B(chat)) {
                if (chat.megagroup) {
                    if (t0(chat) || chat.has_geo || chat.has_link) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean k0(TLRPC.Chat chat) {
        if (chat != null && !(chat instanceof TLRPC.TL_chatEmpty) && !a0(chat) && !chat.kicked && !chat.deactivated) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.banned_rights;
            if (tL_chatBannedRights == null || !tL_chatBannedRights.view_messages) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean l(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(19, chat);
    }

    public static boolean l0(TLRPC.Chat chat) {
        if (chat != null && !(chat instanceof TLRPC.TL_chatEmpty) && !a0(chat) && !chat.left && !chat.deactivated) {
            return false;
        }
        return true;
    }

    public static boolean m(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(9, chat);
    }

    public static boolean m0(int i, long j) {
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(j));
        if (T(M0) && M0.megagroup) {
            return true;
        }
        return false;
    }

    public static boolean n(TLRPC.Chat chat) {
        if (r0(chat) && chat != null && chat.join_to_send) {
            return false;
        }
        if (h0(chat)) {
            return true;
        }
        return w(6, chat);
    }

    public static boolean n0(TLRPC.Chat chat) {
        if (T(chat) && chat.megagroup) {
            return true;
        }
        return false;
    }

    public static boolean o(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(18, chat);
    }

    public static boolean o0(int i, long j) {
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
        if (M0 != null) {
            return M0.monoforum;
        }
        return false;
    }

    public static boolean p(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(16, chat);
    }

    public static boolean p0(TLRPC.Chat chat) {
        if (chat != null && chat.monoforum) {
            return true;
        }
        return false;
    }

    public static boolean q(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(22, chat);
    }

    public static boolean q0(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic != null) {
            if (!tL_forumTopic.my) {
                TLRPC.Peer peer = tL_forumTopic.from_id;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == yac.h(i).n) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean r(TLRPC.Chat chat) {
        if (!p0(chat)) {
            if (h0(chat)) {
                return true;
            }
            return w(10, chat);
        }
        return false;
    }

    public static boolean r0(TLRPC.Chat chat) {
        if (chat != null && !(chat instanceof TLRPC.TL_chatEmpty) && !a0(chat) && !chat.left && !chat.kicked && !chat.deactivated) {
            return false;
        }
        return true;
    }

    public static boolean s(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(21, chat);
    }

    public static boolean s0(TLRPC.Chat chat) {
        TLRPC.ChatFull N0;
        if (chat == null || (N0 = uc7.s1(yac.t0).N0(chat.id)) == null || N0.boosts_unrestrict <= 0) {
            return false;
        }
        return true;
    }

    public static boolean t(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(8, chat);
    }

    public static boolean t0(TLRPC.Chat chat) {
        return !TextUtils.isEmpty(K(chat, false));
    }

    public static boolean u(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(17, chat);
    }

    public static boolean u0(TLRPC.Chat chat) {
        if (chat != null) {
            if ((chat.forum && chat.forum_sidebar) || chat.monoforum) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean v(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(20, chat);
    }

    public static boolean v0(int i, TLRPC.User user) {
        TLRPC.Chat M0;
        if (user == null || user.linked_community_id == 0 || (M0 = uc7.s1(i).M0(Long.valueOf(user.linked_community_id))) == null || !M0.collapsed_in_dialogs) {
            return false;
        }
        return true;
    }

    public static boolean w(int i, TLRPC.Chat chat) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (chat != null && !y(i, chat)) {
            if (!C(chat.banned_rights, i)) {
                if (i != 0 && i != 1 && i != 3 && i != 26 && i != 27) {
                    switch (i) {
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            break;
                        default:
                            switch (i) {
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                    break;
                                default:
                                    return false;
                            }
                    }
                }
                if ((chat.admin_rights == null || Q(i)) && ((tL_chatBannedRights = chat.default_banned_rights) != null ? C(tL_chatBannedRights, i) : !((chat instanceof TLRPC.TL_chat_layer92) || (chat instanceof TLRPC.TL_chat_old) || (chat instanceof TLRPC.TL_chat_old2) || (chat instanceof TLRPC.TL_channel_layer92) || (chat instanceof TLRPC.TL_channel_layer77) || (chat instanceof TLRPC.TL_channel_layer72) || (chat instanceof TLRPC.TL_channel_layer67) || (chat instanceof TLRPC.TL_channel_layer48) || (chat instanceof TLRPC.TL_channel_old)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean w0(TLRPC.ChatFull chatFull, String str) {
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return true;
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            for (int i = 0; i < tL_chatReactionsSome.reactions.size(); i++) {
                if ((tL_chatReactionsSome.reactions.get(i) instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i)).emoticon, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean x(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.ChannelParticipant r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc2.x(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$ChannelParticipant, int):boolean");
    }

    public static boolean y(int i, TLRPC.Chat chat) {
        boolean z;
        if (chat != null) {
            if (!chat.creator) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                if (tL_chatAdminRights != null) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i != 5) {
                                            if (i != 24) {
                                                if (i != 25) {
                                                    if (i != 27) {
                                                        if (i != 28) {
                                                            switch (i) {
                                                                case 12:
                                                                    z = tL_chatAdminRights.edit_messages;
                                                                    break;
                                                                case 13:
                                                                    z = tL_chatAdminRights.delete_messages;
                                                                    break;
                                                                case 14:
                                                                    z = tL_chatAdminRights.manage_call;
                                                                    break;
                                                                case 15:
                                                                    z = tL_chatAdminRights.manage_topics;
                                                                    break;
                                                                default:
                                                                    z = false;
                                                                    break;
                                                            }
                                                        } else {
                                                            z = tL_chatAdminRights.manage_welcome_messages;
                                                        }
                                                    } else {
                                                        z = tL_chatAdminRights.manage_linked_peers;
                                                    }
                                                } else {
                                                    z = tL_chatAdminRights.manage_ranks;
                                                }
                                            } else {
                                                z = tL_chatAdminRights.manage_direct_messages;
                                            }
                                        } else {
                                            z = tL_chatAdminRights.post_messages;
                                        }
                                    } else {
                                        z = tL_chatAdminRights.add_admins;
                                    }
                                } else {
                                    z = tL_chatAdminRights.invite_users;
                                }
                            } else {
                                z = tL_chatAdminRights.ban_users;
                            }
                        } else {
                            z = tL_chatAdminRights.change_info;
                        }
                    } else {
                        z = tL_chatAdminRights.pin_messages;
                    }
                    if (z) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean z(int i, int i2, long j) {
        return y(i2, E(i, uc7.s1(i).M0(Long.valueOf(-j))));
    }
}
