package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public abstract class o5 {
    public static boolean A() {
        TLRPC.User Z1 = vp.r1(d20.f15147s0).Z1(0L);
        if (Z1 == null) {
            return false;
        }
        return B(Z1.emoji_status);
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

    public static boolean C(long j10) {
        if ((4611686018427387904L & j10) != 0 && (j10 & Long.MIN_VALUE) == 0) {
            return true;
        }
        return false;
    }

    public static boolean D(long j10) {
        if ((2305843009213693952L & j10) != 0 && (j10 & Long.MIN_VALUE) == 0) {
            return true;
        }
        return false;
    }

    public static boolean E(long j10) {
        if (!C(j10) && !D(j10) && j10 > 0) {
            return true;
        }
        return false;
    }

    public static long F(long j10) {
        return (j10 & 4294967295L) | 4611686018427387904L;
    }

    public static long G(int i10) {
        return 2305843009213693952L | i10;
    }

    public static String H(ImageReceiver imageReceiver, org.telegram.ui.Components.r8 r8Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (h20.z(user)) {
                String L0 = cd.L0(2131746281, null);
                if (r8Var != null) {
                    r8Var.g(12);
                }
                if (imageReceiver != null) {
                    imageReceiver.i0(null, r8Var, null);
                }
                return L0;
            } else if (h20.B(user)) {
                String L02 = cd.L0(2131745918, null);
                if (r8Var != null) {
                    r8Var.g(1);
                }
                if (imageReceiver != null) {
                    imageReceiver.i0(null, r8Var, null);
                }
                return L02;
            } else {
                String p5 = h20.p(user);
                if (r8Var != null) {
                    r8Var.r(user);
                }
                if (imageReceiver != null) {
                    imageReceiver.i0(tLObject, r8Var, null);
                }
                return p5;
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str = chat.title;
            if (r8Var != null) {
                r8Var.q(chat);
            }
            if (imageReceiver != null) {
                imageReceiver.i0(tLObject, r8Var, null);
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
        for (int i10 = 0; i10 <= lowerCase.length(); i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 <= lowerCase2.length(); i12++) {
                if (i10 == 0) {
                    iArr[i12] = i12;
                } else if (i12 > 0) {
                    int i13 = i12 - 1;
                    int i14 = iArr[i13];
                    if (lowerCase.charAt(i10 - 1) != lowerCase2.charAt(i13)) {
                        i14 = Math.min(Math.min(i14, i11), iArr[i12]) + 1;
                    }
                    iArr[i13] = i11;
                    i11 = i14;
                }
            }
            if (i10 > 0) {
                iArr[lowerCase2.length()] = i11;
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
            return ((TLRPC.User) tLObject).f19942id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return -((TLRPC.Chat) tLObject).f19793id;
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

    public static int h(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int i(long j10) {
        return (int) j10;
    }

    public static long j(TLRPC.Dialog dialog, TLRPC.DraftMessage draftMessage) {
        int i10;
        if (draftMessage != null && (i10 = draftMessage.date) >= dialog.last_message_date) {
            return i10;
        }
        return dialog.last_message_date;
    }

    public static long k(TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            return ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
        }
        return 0L;
    }

    public static String l(int i10, long j10) {
        return m(vp.r1(i10).d2(j10));
    }

    public static String m(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return i0.F2(i0.D2(h20.p((TLRPC.User) tLObject)));
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
        long j10 = inputPeer.user_id;
        if (j10 != 0) {
            return j10;
        }
        long j11 = inputPeer.chat_id;
        if (j11 != 0) {
            return -j11;
        }
        return -inputPeer.channel_id;
    }

    public static long o(TLRPC.Peer peer) {
        if (peer == null) {
            return 0L;
        }
        long j10 = peer.user_id;
        if (j10 != 0) {
            return j10;
        }
        long j11 = peer.chat_id;
        if (j11 != 0) {
            return -j11;
        }
        return -peer.channel_id;
    }

    public static String p(String str, ArrayList arrayList) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
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

    public static String s(int i10, long j10) {
        return u(vp.r1(i10).d2(j10));
    }

    public static String t(long j10) {
        return u(vp.r1(d20.f15147s0).d2(j10));
    }

    public static String u(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return i0.F2(i0.D2(h20.k((TLRPC.User) tLObject)));
        }
        if (tLObject instanceof TLRPC.Chat) {
            return i0.F2(i0.D2(((TLRPC.Chat) tLObject).title));
        }
        return "";
    }

    public static String v(String str, ArrayList arrayList, String str2) {
        double I;
        double d = 0.0d;
        double d10 = -1.0d;
        String str3 = null;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                    if (d10 < 0.0d) {
                        I = 0.0d;
                    } else {
                        I = I(tL_username.username, str2);
                    }
                    if (I > d10) {
                        str3 = tL_username.username;
                        d10 = I;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (d10 >= 0.0d) {
                d = I(str, str2);
            }
            if (d > d10) {
                return str;
            }
        }
        return str3;
    }

    public static String w(long j10) {
        int i10 = d20.f15147s0;
        TLObject d22 = vp.r1(i10).d2(j10);
        if (d22 instanceof TLRPC.User) {
            return cd.d0(i10, (TLRPC.User) d22, null, null);
        }
        if (d22 instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) d22;
            if (chat.participants_count > 1) {
                if (w3.V(chat)) {
                    return cd.H(',', "Subscribers", chat.participants_count);
                }
                return cd.H(',', "Members", chat.participants_count);
            } else if (w3.V(chat)) {
                return cd.L0(2131751391, null);
            } else {
                return cd.L0(2131754876, null);
            }
        }
        return "";
    }

    public static void x(TLRPC.Dialog dialog) {
        if (dialog != null && dialog.f19797id == 0) {
            if (dialog instanceof TLRPC.TL_dialog) {
                TLRPC.Peer peer = dialog.peer;
                if (peer != null) {
                    long j10 = peer.user_id;
                    if (j10 != 0) {
                        dialog.f19797id = j10;
                        return;
                    }
                    long j11 = peer.chat_id;
                    if (j11 != 0) {
                        dialog.f19797id = -j11;
                    } else {
                        dialog.f19797id = -peer.channel_id;
                    }
                }
            } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                dialog.f19797id = 2305843009213693952L | ((TLRPC.TL_dialogFolder) dialog).folder.f19844id;
            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                dialog.f19797id = -dialog.community_id;
            }
        }
    }

    public static boolean y(TLRPC.Dialog dialog) {
        if (dialog != null && (dialog.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    public static boolean z(long j10) {
        if (!C(j10) && !D(j10) && j10 < 0) {
            return true;
        }
        return false;
    }
}
