package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public abstract class wf3 {
    public static boolean A(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return false;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
            return false;
        }
        return true;
    }

    public static boolean B(long j) {
        if ((4611686018427387904L & j) != 0 && (j & Long.MIN_VALUE) == 0) {
            return true;
        }
        return false;
    }

    public static boolean C(long j) {
        if ((2305843009213693952L & j) != 0 && (j & Long.MIN_VALUE) == 0) {
            return true;
        }
        return false;
    }

    public static boolean D(long j) {
        if (!B(j) && !C(j) && j > 0) {
            return true;
        }
        return false;
    }

    public static long E(long j) {
        return (j & 4294967295L) | 4611686018427387904L;
    }

    public static long F(int i) {
        return i | 2305843009213693952L;
    }

    public static String G(ImageReceiver imageReceiver, rb0 rb0Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (lbc.B(user)) {
                String M0 = ob6.M0(2131745993, null);
                if (rb0Var != null) {
                    rb0Var.f(12);
                }
                if (imageReceiver != null) {
                    imageReceiver.U(null, rb0Var, null);
                }
                return M0;
            } else if (lbc.D(user)) {
                String M02 = ob6.M0(2131745629, null);
                if (rb0Var != null) {
                    rb0Var.f(1);
                }
                if (imageReceiver != null) {
                    imageReceiver.U(null, rb0Var, null);
                }
                return M02;
            } else {
                String r = lbc.r(user);
                if (rb0Var != null) {
                    rb0Var.q(user);
                }
                if (imageReceiver != null) {
                    imageReceiver.U(tLObject, rb0Var, null);
                }
                return r;
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str = chat.title;
            if (rb0Var != null) {
                rb0Var.p(chat);
            }
            if (imageReceiver != null) {
                imageReceiver.U(tLObject, rb0Var, null);
            }
            return str;
        } else {
            return "";
        }
    }

    public static double H(String str, String str2) {
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
        for (int i = 0; i <= lowerCase.length(); i++) {
            int i2 = i;
            for (int i3 = 0; i3 <= lowerCase2.length(); i3++) {
                if (i == 0) {
                    iArr[i3] = i3;
                } else if (i3 > 0) {
                    int i4 = i3 - 1;
                    int i5 = iArr[i4];
                    if (lowerCase.charAt(i - 1) != lowerCase2.charAt(i4)) {
                        i5 = Math.min(Math.min(i5, i2), iArr[i3]) + 1;
                    }
                    iArr[i4] = i2;
                    i2 = i5;
                }
            }
            if (i > 0) {
                iArr[lowerCase2.length()] = i2;
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
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
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
            return ((TLRPC.User) tLObject).id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return -((TLRPC.Chat) tLObject).id;
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

    public static int h(long j) {
        return (int) (j & 4294967295L);
    }

    public static long i(TLRPC.Dialog dialog, TLRPC.DraftMessage draftMessage) {
        int i;
        if (draftMessage != null && (i = draftMessage.date) >= dialog.last_message_date) {
            return i;
        }
        return dialog.last_message_date;
    }

    public static long j(TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            return ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
        }
        return 0L;
    }

    public static String k(int i, long j) {
        return l(uc7.s1(i).b2(j));
    }

    public static String l(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return hl.C2(hl.A2(lbc.r((TLRPC.User) tLObject)));
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        }
        return "";
    }

    public static long m(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return 0L;
        }
        long j = inputPeer.user_id;
        if (j != 0) {
            return j;
        }
        long j2 = inputPeer.chat_id;
        if (j2 != 0) {
            return -j2;
        }
        return -inputPeer.channel_id;
    }

    public static long n(TLRPC.Peer peer) {
        if (peer == null) {
            return 0L;
        }
        long j = peer.user_id;
        if (j != 0) {
            return j;
        }
        long j2 = peer.chat_id;
        if (j2 != 0) {
            return -j2;
        }
        return -peer.channel_id;
    }

    public static String o(String str, ArrayList arrayList) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i);
                if (tL_username != null && ((tL_username.active || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                    return tL_username.username;
                }
            }
        }
        TextUtils.isEmpty(str);
        return null;
    }

    public static String p(String str, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str2 = chat.username;
            ArrayList<TLRPC.TL_username> arrayList = chat.usernames;
            if (str == null) {
                return o(str2, arrayList);
            }
            return u(str2, arrayList, str);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            String str3 = user.username;
            ArrayList<TLRPC.TL_username> arrayList2 = user.usernames;
            if (str == null) {
                return o(str3, arrayList2);
            }
            return u(str3, arrayList2, str);
        } else {
            return null;
        }
    }

    public static String q(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            return o(chat.username, chat.usernames);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            return o(user.username, user.usernames);
        } else {
            return null;
        }
    }

    public static String r(int i, long j) {
        return t(uc7.s1(i).b2(j));
    }

    public static String s(long j) {
        return t(uc7.s1(yac.t0).b2(j));
    }

    public static String t(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return hl.C2(hl.A2(lbc.l((TLRPC.User) tLObject)));
        }
        if (tLObject instanceof TLRPC.Chat) {
            return hl.C2(hl.A2(((TLRPC.Chat) tLObject).title));
        }
        return "";
    }

    public static String u(String str, ArrayList arrayList, String str2) {
        double H;
        double d = 0.0d;
        double d2 = -1.0d;
        String str3 = null;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                    if (d2 < 0.0d) {
                        H = 0.0d;
                    } else {
                        H = H(tL_username.username, str2);
                    }
                    if (H > d2) {
                        str3 = tL_username.username;
                        d2 = H;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (d2 >= 0.0d) {
                d = H(str, str2);
            }
            if (d > d2) {
                return str;
            }
        }
        return str3;
    }

    public static String v(long j) {
        int i = yac.t0;
        TLObject b2 = uc7.s1(i).b2(j);
        if (b2 instanceof TLRPC.User) {
            return ob6.d0(i, (TLRPC.User) b2, null, null);
        }
        if (b2 instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) b2;
            if (chat.participants_count > 1) {
                boolean V = xc2.V(chat);
                int i2 = chat.participants_count;
                if (V) {
                    return ob6.H(',', "Subscribers", i2);
                }
                return ob6.H(',', "Members", i2);
            } else if (xc2.V(chat)) {
                return ob6.M0(2131751355, null);
            } else {
                return ob6.M0(2131754872, null);
            }
        }
        return "";
    }

    public static void w(TLRPC.Dialog dialog) {
        if (dialog != null && dialog.id == 0) {
            if (dialog instanceof TLRPC.TL_dialog) {
                TLRPC.Peer peer = dialog.peer;
                if (peer != null) {
                    long j = peer.user_id;
                    if (j != 0) {
                        dialog.id = j;
                        return;
                    }
                    long j2 = peer.chat_id;
                    if (j2 != 0) {
                        dialog.id = -j2;
                    } else {
                        dialog.id = -peer.channel_id;
                    }
                }
            } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                dialog.id = ((TLRPC.TL_dialogFolder) dialog).folder.id | 2305843009213693952L;
            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                dialog.id = -dialog.community_id;
            }
        }
    }

    public static boolean x(TLRPC.Dialog dialog) {
        if (dialog != null && (dialog.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    public static boolean y(long j) {
        if (!B(j) && !C(j) && j < 0) {
            return true;
        }
        return false;
    }

    public static boolean z() {
        TLRPC.User X1 = uc7.s1(yac.t0).X1(0L);
        if (X1 == null) {
            return false;
        }
        return A(X1.emoji_status);
    }
}
