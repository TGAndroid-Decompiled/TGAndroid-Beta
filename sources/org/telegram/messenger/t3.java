package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public abstract class t3 {
    public static boolean A(int i3, TLRPC.Chat chat, int i10) {
        return y(i10, E(i3, chat));
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

    public static boolean C(TLRPC.TL_chatBannedRights tL_chatBannedRights, int i3) {
        if (tL_chatBannedRights != null) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 3) {
                        if (i3 != 26) {
                            if (i3 != 27) {
                                switch (i3) {
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
                                        switch (i3) {
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
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("" + (tL_chatBannedRights.view_messages ? 1 : 0));
        l10.append(tL_chatBannedRights.send_messages ? 1 : 0);
        StringBuilder l11 = com.google.android.recaptcha.internal.a.l(l10.toString());
        l11.append(tL_chatBannedRights.send_media ? 1 : 0);
        StringBuilder l12 = com.google.android.recaptcha.internal.a.l(l11.toString());
        l12.append(tL_chatBannedRights.send_stickers ? 1 : 0);
        StringBuilder l13 = com.google.android.recaptcha.internal.a.l(l12.toString());
        l13.append(tL_chatBannedRights.send_gifs ? 1 : 0);
        StringBuilder l14 = com.google.android.recaptcha.internal.a.l(l13.toString());
        l14.append(tL_chatBannedRights.send_games ? 1 : 0);
        StringBuilder l15 = com.google.android.recaptcha.internal.a.l(l14.toString());
        l15.append(tL_chatBannedRights.send_inline ? 1 : 0);
        StringBuilder l16 = com.google.android.recaptcha.internal.a.l(l15.toString());
        l16.append(tL_chatBannedRights.embed_links ? 1 : 0);
        StringBuilder l17 = com.google.android.recaptcha.internal.a.l(l16.toString());
        l17.append(tL_chatBannedRights.send_polls ? 1 : 0);
        StringBuilder l18 = com.google.android.recaptcha.internal.a.l(l17.toString());
        l18.append(tL_chatBannedRights.invite_users ? 1 : 0);
        StringBuilder l19 = com.google.android.recaptcha.internal.a.l(l18.toString());
        l19.append(tL_chatBannedRights.change_info ? 1 : 0);
        StringBuilder l20 = com.google.android.recaptcha.internal.a.l(l19.toString());
        l20.append(tL_chatBannedRights.pin_messages ? 1 : 0);
        StringBuilder l21 = com.google.android.recaptcha.internal.a.l(l20.toString());
        l21.append(tL_chatBannedRights.manage_topics ? 1 : 0);
        StringBuilder l22 = com.google.android.recaptcha.internal.a.l(l21.toString());
        l22.append(tL_chatBannedRights.send_photos ? 1 : 0);
        StringBuilder l23 = com.google.android.recaptcha.internal.a.l(l22.toString());
        l23.append(tL_chatBannedRights.send_videos ? 1 : 0);
        StringBuilder l24 = com.google.android.recaptcha.internal.a.l(l23.toString());
        l24.append(tL_chatBannedRights.send_roundvideos ? 1 : 0);
        StringBuilder l25 = com.google.android.recaptcha.internal.a.l(l24.toString());
        l25.append(tL_chatBannedRights.send_voices ? 1 : 0);
        StringBuilder l26 = com.google.android.recaptcha.internal.a.l(l25.toString());
        l26.append(tL_chatBannedRights.send_audios ? 1 : 0);
        StringBuilder l27 = com.google.android.recaptcha.internal.a.l(l26.toString());
        l27.append(tL_chatBannedRights.send_docs ? 1 : 0);
        StringBuilder l28 = com.google.android.recaptcha.internal.a.l(l27.toString());
        l28.append(tL_chatBannedRights.send_plain ? 1 : 0);
        StringBuilder l29 = com.google.android.recaptcha.internal.a.l(l28.toString());
        l29.append(tL_chatBannedRights.edit_rank ? 1 : 0);
        StringBuilder l30 = com.google.android.recaptcha.internal.a.l(l29.toString());
        l30.append(tL_chatBannedRights.send_reactions ? 1 : 0);
        StringBuilder l31 = com.google.android.recaptcha.internal.a.l(l30.toString());
        l31.append(tL_chatBannedRights.manage_linked_peers ? 1 : 0);
        StringBuilder l32 = com.google.android.recaptcha.internal.a.l(l31.toString());
        l32.append(tL_chatBannedRights.until_date);
        return l32.toString();
    }

    public static TLRPC.Chat E(int i3, TLRPC.Chat chat) {
        if (chat != null && chat.linked_monoforum_id != 0) {
            if (chat.monoforum) {
                return hp.s1(i3).M0(Long.valueOf(chat.linked_monoforum_id));
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
        return (int) (chat.f27001id % 7);
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
        }
        if (chat != null) {
            TLRPC.PeerColor peerColor = chat.profile_color;
            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                return peerColor.background_emoji_id;
            }
            return 0L;
        }
        return 0L;
    }

    public static String K(TLRPC.Chat chat, boolean z10) {
        if (chat != null) {
            if (!TextUtils.isEmpty(chat.username) && !z10) {
                return chat.username;
            }
            if (chat.usernames != null) {
                for (int i3 = 0; i3 < chat.usernames.size(); i3++) {
                    TLRPC.TL_username tL_username = chat.usernames.get(i3);
                    if (tL_username != null && (((tL_username.active && !z10) || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                        return tL_username.username;
                    }
                }
            }
            if (!TextUtils.isEmpty(chat.username) && z10) {
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

    public static String L(int i3, TLRPC.Chat chat) {
        if (i3 == 23) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachGifRestrictedForever", null, 2131753969, new Object[0]);
                }
                return bd.a0("AttachGifRestricted", null, 2131753970, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749553, null);
        } else if (i3 == 8) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachStickersRestrictedForever", null, 2131753934, new Object[0]);
                }
                return bd.a0("AttachStickersRestricted", null, 2131753935, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749547, null);
        } else if (i3 == 16) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachPhotoRestrictedForever", null, 2131753945, new Object[0]);
                }
                return bd.a0("AttachPhotoRestricted", null, 2131753946, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749550, null);
        } else if (i3 == 17) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachVideoRestrictedForever", null, 2131753930, new Object[0]);
                }
                return bd.a0("AttachVideoRestricted", null, 2131753931, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749546, null);
        } else if (i3 == 19) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachDocumentsRestrictedForever", null, 2131753973, new Object[0]);
                }
                return bd.a0("AttachDocumentsRestricted", null, 2131753974, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749555, null);
        } else if (i3 == 7) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachMediaRestrictedForever", null, 2131753955, new Object[0]);
                }
                return bd.a0("AttachMediaRestricted", null, 2131753956, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749551, null);
        } else if (i3 == 18) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachAudioRestrictedForever", null, 2131753980, new Object[0]);
                }
                return bd.a0("AttachAudioRestricted", null, 2131753981, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749556, null);
        } else if (i3 == 22) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachPlainRestrictedForever", null, 2131753943, new Object[0]);
                }
                return bd.a0("AttachPlainRestricted", null, 2131753944, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749549, null);
        } else if (i3 == 21) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachRoundRestrictedForever", null, 2131753938, new Object[0]);
                }
                return bd.a0("AttachRoundRestricted", null, 2131753939, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749548, null);
        } else if (i3 == 20) {
            if (chat != null && !P(i3, chat)) {
                if (g0.D1(chat.banned_rights)) {
                    return bd.a0("AttachVoiceRestrictedForever", null, 2131753927, new Object[0]);
                }
                return bd.a0("AttachVoiceRestricted", null, 2131753928, bd.v(chat.banned_rights.until_date));
            }
            return bd.M0(2131749545, null);
        } else {
            return "";
        }
    }

    public static long M(TLRPC.Chat chat, TLRPC.ChatFull chatFull, boolean z10) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (chat != null && chatFull != null && (peer = chatFull.default_send_as) != null) {
            long j10 = peer.user_id;
            if (j10 != 0) {
                return j10;
            }
            long j11 = peer.channel_id;
            if (z10) {
                return -j11;
            }
            return j11;
        } else if (chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous) {
            long j12 = chat.f27001id;
            if (z10) {
                return -j12;
            }
            return j12;
        } else if (chat != null && V(chat) && !chat.signatures) {
            long j13 = chat.f27001id;
            if (z10) {
                return -j13;
            }
            return j13;
        } else {
            return h10.i(h10.f22829t0).e();
        }
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
            for (int i3 = 0; i3 < chat.usernames.size(); i3++) {
                TLRPC.TL_username tL_username = chat.usernames.get(i3);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username) && tL_username.username.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean P(int i3, TLRPC.Chat chat) {
        if (chat == null) {
            return false;
        }
        if (C(chat.banned_rights, i3) && C(chat.default_banned_rights, i3)) {
            return true;
        }
        return C(chat.default_banned_rights, i3);
    }

    public static boolean Q(int i3) {
        if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 12 || i3 == 13 || i3 == 15) {
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

    public static boolean S(int i3, long j10) {
        return T(hp.s1(i3).M0(Long.valueOf(j10)));
    }

    public static boolean T(TLRPC.Chat chat) {
        if (!(chat instanceof TLRPC.TL_channel) && !(chat instanceof TLRPC.TL_channelForbidden) && !Y(chat)) {
            return false;
        }
        return true;
    }

    public static boolean U(int i3, long j10) {
        return V(hp.s1(i3).M0(Long.valueOf(j10)));
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

    public static boolean X(int i3, TLRPC.Chat chat) {
        TLRPC.Chat M0;
        if (chat == null || chat.linked_community_id == 0 || (M0 = hp.s1(i3).M0(Long.valueOf(chat.linked_community_id))) == null || !M0.collapsed_in_dialogs) {
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

    public static boolean Z(int i3, long j10) {
        hp s12 = hp.s1(i3);
        TLRPC.Chat M0 = s12.M0(Long.valueOf(j10));
        TLRPC.ChatFull N0 = s12.N0(j10);
        if (n0(M0) && N0 != null && N0.linked_chat_id != 0) {
            return true;
        }
        return false;
    }

    public static boolean a(TLRPC.Chat chat) {
        if (!az.f21646n) {
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

    public static boolean b0(int i3, long j10) {
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
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

    public static boolean d0(int i3, long j10) {
        if (j10 > 0) {
            return f0(i3, hp.s1(i3).a2(Long.valueOf(j10)));
        }
        return e0(i3, hp.s1(i3).M0(Long.valueOf(-j10)));
    }

    public static boolean e(int i3, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        TLRPC.Message message;
        TLRPC.Message message2;
        int size;
        if (tL_forumTopic == null || tL_forumTopic.f27053id != 1) {
            if (!w(13, chat)) {
                if (q0(i3, tL_forumTopic) && (message = tL_forumTopic.topMessage) != null && (message2 = tL_forumTopic.topicStartMessage) != null) {
                    int i10 = message.f27022id - message2.f27022id;
                    ArrayList<zi> arrayList = tL_forumTopic.groupedMessages;
                    if (arrayList == null) {
                        size = 0;
                    } else {
                        size = arrayList.size();
                    }
                    if (i10 > Math.max(1, size) || !zi.w5(tL_forumTopic.from_id, tL_forumTopic.topMessage.from_id)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e0(int i3, TLRPC.Chat chat) {
        if (chat != null && g0(chat.linked_community_id, i3, -chat.f27001id)) {
            return true;
        }
        return false;
    }

    public static boolean f(TLRPC.Chat chat) {
        return w(14, chat);
    }

    public static boolean f0(int i3, TLRPC.User user) {
        if (user != null && g0(user.linked_community_id, i3, user.f27150id)) {
            return true;
        }
        return false;
    }

    public static boolean g(int i3, TLRPC.Chat chat) {
        return A(i3, chat, 24);
    }

    public static boolean g0(long j10, int i3, long j11) {
        TLRPC.ChatFull N0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j10 != 0 && j11 != 0 && (N0 = hp.s1(i3).N0(j10)) != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (m5.o(communityPeer2.peer) == j11 && x7.u.a(communityPeer2.flags, 1) && !communityPeer2.visible) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h(TLRPC.Chat chat) {
        boolean z10;
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
            z10 = tL_chatBannedRights2.edit_rank;
        } else {
            z10 = tL_chatBannedRights.edit_rank;
        }
        return !z10;
    }

    public static boolean h0(TLRPC.Chat chat) {
        if (chat != null) {
            return i0(hp.s1(h10.f22829t0).N0(chat.f27001id));
        }
        return false;
    }

    public static boolean i(int i3, TLRPC.Chat chat, TLRPC.TL_forumTopic tL_forumTopic) {
        if (!y(15, chat) && !q0(i3, tL_forumTopic)) {
            return false;
        }
        return true;
    }

    public static boolean i0(TLRPC.ChatFull chatFull) {
        int i3;
        if (chatFull != null && (i3 = chatFull.boosts_unrestrict) > 0 && chatFull.boosts_applied - i3 >= 0) {
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

    public static boolean m0(int i3, long j10) {
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(j10));
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

    public static boolean o0(int i3, long j10) {
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
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

    public static boolean q0(int i3, TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic != null) {
            if (!tL_forumTopic.my) {
                TLRPC.Peer peer = tL_forumTopic.from_id;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == h10.i(i3).f22848n) {
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
        if (chat == null || (N0 = hp.s1(h10.f22829t0).N0(chat.f27001id)) == null || N0.boosts_unrestrict <= 0) {
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

    public static boolean u0(int i3, TLRPC.User user) {
        TLRPC.Chat M0;
        if (user == null || user.linked_community_id == 0 || (M0 = hp.s1(i3).M0(Long.valueOf(user.linked_community_id))) == null || !M0.collapsed_in_dialogs) {
            return false;
        }
        return true;
    }

    public static boolean v(TLRPC.Chat chat) {
        if (h0(chat)) {
            return true;
        }
        return w(20, chat);
    }

    public static boolean v0(TLRPC.ChatFull chatFull, String str) {
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return true;
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            for (int i3 = 0; i3 < tL_chatReactionsSome.reactions.size(); i3++) {
                if ((tL_chatReactionsSome.reactions.get(i3) instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i3)).emoticon, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean w(int i3, TLRPC.Chat chat) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (chat != null && !y(i3, chat)) {
            if (!C(chat.banned_rights, i3)) {
                if (i3 != 0 && i3 != 1 && i3 != 3 && i3 != 26 && i3 != 27) {
                    switch (i3) {
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            break;
                        default:
                            switch (i3) {
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
                if ((chat.admin_rights != null && !Q(i3)) || ((tL_chatBannedRights = chat.default_banned_rights) == null && ((chat instanceof TLRPC.TL_chat_layer92) || (chat instanceof TLRPC.TL_chat_old) || (chat instanceof TLRPC.TL_chat_old2) || (chat instanceof TLRPC.TL_channel_layer92) || (chat instanceof TLRPC.TL_channel_layer77) || (chat instanceof TLRPC.TL_channel_layer72) || (chat instanceof TLRPC.TL_channel_layer67) || (chat instanceof TLRPC.TL_channel_layer48) || (chat instanceof TLRPC.TL_channel_old)))) {
                    return true;
                }
                if (tL_chatBannedRights == null || C(tL_chatBannedRights, i3)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean x(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.ChannelParticipant r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.t3.x(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$ChannelParticipant, int):boolean");
    }

    public static boolean y(int i3, TLRPC.Chat chat) {
        boolean z10;
        if (chat != null) {
            if (!chat.creator) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                if (tL_chatAdminRights != null) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        if (i3 != 5) {
                                            if (i3 != 24) {
                                                if (i3 != 25) {
                                                    if (i3 != 27) {
                                                        if (i3 != 28) {
                                                            switch (i3) {
                                                                case 12:
                                                                    z10 = tL_chatAdminRights.edit_messages;
                                                                    break;
                                                                case 13:
                                                                    z10 = tL_chatAdminRights.delete_messages;
                                                                    break;
                                                                case 14:
                                                                    z10 = tL_chatAdminRights.manage_call;
                                                                    break;
                                                                case 15:
                                                                    z10 = tL_chatAdminRights.manage_topics;
                                                                    break;
                                                                default:
                                                                    z10 = false;
                                                                    break;
                                                            }
                                                        } else {
                                                            z10 = tL_chatAdminRights.manage_welcome_messages;
                                                        }
                                                    } else {
                                                        z10 = tL_chatAdminRights.manage_linked_peers;
                                                    }
                                                } else {
                                                    z10 = tL_chatAdminRights.manage_ranks;
                                                }
                                            } else {
                                                z10 = tL_chatAdminRights.manage_direct_messages;
                                            }
                                        } else {
                                            z10 = tL_chatAdminRights.post_messages;
                                        }
                                    } else {
                                        z10 = tL_chatAdminRights.add_admins;
                                    }
                                } else {
                                    z10 = tL_chatAdminRights.invite_users;
                                }
                            } else {
                                z10 = tL_chatAdminRights.ban_users;
                            }
                        } else {
                            z10 = tL_chatAdminRights.change_info;
                        }
                    } else {
                        z10 = tL_chatAdminRights.pin_messages;
                    }
                    if (z10) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean z(int i3, int i10, long j10) {
        return y(i10, E(i3, hp.s1(i3).M0(Long.valueOf(-j10))));
    }
}
