package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public abstract class m5 {
    public static boolean A() {
        TLRPC.User a22 = qp.s1(p10.f24459s0).a2(0L);
        if (a22 == null) {
            return false;
        }
        return B(a22.emoji_status);
    }

    public static boolean B(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return false;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
            return false;
        }
        return true;
    }

    public static boolean C(long j3) {
        if ((4611686018427387904L & j3) != 0 && (j3 & Long.MIN_VALUE) == 0) {
            return true;
        }
        return false;
    }

    public static boolean D(long j3) {
        if ((2305843009213693952L & j3) != 0 && (j3 & Long.MIN_VALUE) == 0) {
            return true;
        }
        return false;
    }

    public static boolean E(long j3) {
        if (!C(j3) && !D(j3) && j3 > 0) {
            return true;
        }
        return false;
    }

    public static long F(long j3) {
        return (j3 & 4294967295L) | 4611686018427387904L;
    }

    public static long G(int i7) {
        return 2305843009213693952L | i7;
    }

    public static String H(ImageReceiver imageReceiver, org.telegram.ui.Components.w8 w8Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (t10.z(user)) {
                String M0 = hd.M0(2131746265, null);
                if (w8Var != null) {
                    w8Var.g(12);
                }
                if (imageReceiver != null) {
                    imageReceiver.i0(null, w8Var, null);
                }
                return M0;
            } else if (t10.B(user)) {
                String M02 = hd.M0(2131745902, null);
                if (w8Var != null) {
                    w8Var.g(1);
                }
                if (imageReceiver != null) {
                    imageReceiver.i0(null, w8Var, null);
                }
                return M02;
            } else {
                String p10 = t10.p(user);
                if (w8Var != null) {
                    w8Var.r(user);
                }
                if (imageReceiver != null) {
                    imageReceiver.i0(tLObject, w8Var, null);
                }
                return p10;
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str = chat.title;
            if (w8Var != null) {
                w8Var.q(chat);
            }
            if (imageReceiver != null) {
                imageReceiver.i0(tLObject, w8Var, null);
            }
            return str;
        } else {
            return "";
        }
    }

    public static double I(String str, String str2) {
        if (str.length() < str2.length()) {
            str2 = str;
            str = str2;
        }
        int length = str.length();
        if (length == 0) {
            return 1.0d;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int[] iArr = new int[lowerCase2.length() + 1];
        for (int i7 = 0; i7 <= lowerCase.length(); i7++) {
            int i10 = i7;
            for (int i11 = 0; i11 <= lowerCase2.length(); i11++) {
                if (i7 == 0) {
                    iArr[i11] = i11;
                } else if (i11 > 0) {
                    int i12 = i11 - 1;
                    int i13 = iArr[i12];
                    if (lowerCase.charAt(i7 - 1) != lowerCase2.charAt(i12)) {
                        i13 = Math.min(Math.min(i13, i10), iArr[i11]) + 1;
                    }
                    iArr[i12] = i10;
                    i10 = i13;
                }
            }
            if (i7 > 0) {
                iArr[lowerCase2.length()] = i10;
            }
        }
        return (length - iArr[lowerCase2.length()]) / length;
    }

    public static boolean a(TLRPC.EmojiStatus emojiStatus, TLRPC.EmojiStatus emojiStatus2) {
        if (f(emojiStatus) == f(emojiStatus2) && e(emojiStatus) == e(emojiStatus2) && g(emojiStatus) == g(emojiStatus2)) {
            return true;
        }
        return false;
    }

    public static TLRPC.TL_username b(String str, ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
            if (tL_username != null && TextUtils.equals(tL_username.username, str)) {
                return tL_username;
            }
        }
        return null;
    }

    public static long c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).bot_verification_icon;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).bot_verification_icon;
        }
        return 0L;
    }

    public static long d(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).f27101id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return -((TLRPC.Chat) tLObject).f26952id;
        }
        return 0L;
    }

    public static long e(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0L;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
            return 0L;
        }
        return tL_emojiStatusCollectible.collectible_id;
    }

    public static long f(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                return 0L;
            }
            return tL_emojiStatus.document_id;
        } else if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0L;
        } else {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                return 0L;
            }
            return tL_emojiStatusCollectible.document_id;
        }
    }

    public static int g(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0) {
                return tL_emojiStatus.until;
            }
            return 0;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0) {
                return tL_emojiStatusCollectible.until;
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static int h(long j3) {
        return (int) (j3 & 4294967295L);
    }

    public static int i(long j3) {
        return (int) j3;
    }

    public static long j(TLRPC.Dialog dialog, TLRPC.DraftMessage draftMessage) {
        int i7;
        if (draftMessage != null && (i7 = draftMessage.date) >= dialog.last_message_date) {
            return i7;
        }
        return dialog.last_message_date;
    }

    public static long k(TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            return ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
        }
        return 0L;
    }

    public static String l(int i7, long j3) {
        return m(qp.s1(i7).e2(j3));
    }

    public static String m(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return g0.F2(g0.D2(t10.p((TLRPC.User) tLObject)));
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        }
        return "";
    }

    public static long n(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return 0L;
        }
        long j3 = inputPeer.user_id;
        if (j3 != 0) {
            return j3;
        }
        long j10 = inputPeer.chat_id;
        if (j10 != 0) {
            return -j10;
        }
        return -inputPeer.channel_id;
    }

    public static long o(TLRPC.Peer peer) {
        if (peer == null) {
            return 0L;
        }
        long j3 = peer.user_id;
        if (j3 != 0) {
            return j3;
        }
        long j10 = peer.chat_id;
        if (j10 != 0) {
            return -j10;
        }
        return -peer.channel_id;
    }

    public static String p(String str, ArrayList arrayList) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i7);
                if (tL_username != null && ((tL_username.active || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                    return tL_username.username;
                }
            }
        }
        TextUtils.isEmpty(str);
        return null;
    }

    public static String q(String str, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            if (str == null) {
                return p(chat.username, chat.usernames);
            }
            return v(chat.username, chat.usernames, str);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (str == null) {
                return p(user.username, user.usernames);
            }
            return v(user.username, user.usernames, str);
        } else {
            return null;
        }
    }

    public static String r(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            return p(chat.username, chat.usernames);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            return p(user.username, user.usernames);
        } else {
            return null;
        }
    }

    public static String s(int i7, long j3) {
        return u(qp.s1(i7).e2(j3));
    }

    public static String t(long j3) {
        return u(qp.s1(p10.f24459s0).e2(j3));
    }

    public static String u(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return g0.F2(g0.D2(t10.k((TLRPC.User) tLObject)));
        }
        if (tLObject instanceof TLRPC.Chat) {
            return g0.F2(g0.D2(((TLRPC.Chat) tLObject).title));
        }
        return "";
    }

    public static String v(String str, ArrayList arrayList, String str2) {
        double I;
        double d = 0.0d;
        double d2 = -1.0d;
        String str3 = null;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i7);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                    if (d2 < 0.0d) {
                        I = 0.0d;
                    } else {
                        I = I(tL_username.username, str2);
                    }
                    if (I > d2) {
                        str3 = tL_username.username;
                        d2 = I;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (d2 >= 0.0d) {
                d = I(str, str2);
            }
            if (d > d2) {
                return str;
            }
        }
        return str3;
    }

    public static String w(long j3) {
        int i7 = p10.f24459s0;
        TLObject e22 = qp.s1(i7).e2(j3);
        if (e22 instanceof TLRPC.User) {
            return hd.d0(i7, (TLRPC.User) e22, null, null);
        }
        if (e22 instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) e22;
            if (chat.participants_count > 1) {
                if (t3.V(chat)) {
                    return hd.H(',', "Subscribers", chat.participants_count);
                }
                return hd.H(',', "Members", chat.participants_count);
            } else if (t3.V(chat)) {
                return hd.M0(2131751391, null);
            } else {
                return hd.M0(2131754876, null);
            }
        }
        return "";
    }

    public static void x(TLRPC.Dialog dialog) {
        if (dialog != null && dialog.f26956id == 0) {
            if (dialog instanceof TLRPC.TL_dialog) {
                TLRPC.Peer peer = dialog.peer;
                if (peer != null) {
                    long j3 = peer.user_id;
                    if (j3 != 0) {
                        dialog.f26956id = j3;
                        return;
                    }
                    long j10 = peer.chat_id;
                    if (j10 != 0) {
                        dialog.f26956id = -j10;
                    } else {
                        dialog.f26956id = -peer.channel_id;
                    }
                }
            } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                dialog.f26956id = 2305843009213693952L | ((TLRPC.TL_dialogFolder) dialog).folder.f27003id;
            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                dialog.f26956id = -dialog.community_id;
            }
        }
    }

    public static boolean y(TLRPC.Dialog dialog) {
        if (dialog != null && (dialog.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    public static boolean z(long j3) {
        if (!C(j3) && !D(j3) && j3 < 0) {
            return true;
        }
        return false;
    }
}
