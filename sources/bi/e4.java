package bi;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
public abstract class e4 {
    public static final HashMap f3543a = new HashMap();
    public static final HashSet f3544b = new HashSet();
    public static final HashMap f3545c = new HashMap();
    public static final HashMap d = new HashMap();

    public static String a(int i7, long j3) {
        return i7 + ":" + j3;
    }

    public static boolean b(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = f3543a;
        Long l10 = (Long) hashMap.get(valueOf);
        if (l10 != null && l10.longValue() > elapsedRealtime) {
            return false;
        }
        hashMap.put(Long.valueOf(j3), Long.valueOf(elapsedRealtime + 30000));
        c();
        return true;
    }

    public static void c() {
        ks.e().k(ks.L3, new Object[0]);
    }

    public static SpannableStringBuilder d(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        String str;
        String a02;
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        if (starGift != null) {
            str = u4.h(starGift);
        } else {
            str = "";
        }
        String p10 = p(str);
        String p11 = p(u4.k(tL_messageActionStarGiftOnchainOffer.amount));
        if (tL_messageActionStarGiftOnchainOffer.buyer) {
            return org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749580, p11, p10));
        }
        String p12 = p(u4.t(tL_messageActionStarGiftOnchainOffer.amount));
        if (p12 != null) {
            a02 = gd.a0(null, null, 2131749591, p11, p12, p10);
        } else {
            a02 = gd.a0(null, null, 2131749590, p11, p10);
        }
        return org.telegram.messenger.g0.W2(a02);
    }

    public static void e(Activity activity, int i7, int i10, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar) {
        f(activity, i7, i10, tL_messageActionStarGiftOnchainOffer, i6Var, lcVar, null);
    }

    public static void f(final Context context, final int i7, final int i10, final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, final org.telegram.ui.ActionBar.i6 i6Var, final lc lcVar, final k3 k3Var) {
        String str;
        if (k(i7, tL_messageActionStarGiftOnchainOffer.offer_id)) {
            s(lcVar);
        } else if (m(i7, tL_messageActionStarGiftOnchainOffer.offer_id)) {
        } else {
            TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
            if (starGift != null) {
                str = u4.h(starGift);
            } else {
                str = "";
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            String M0 = gd.M0(2131749603, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749604, u4.k(tL_messageActionStarGiftOnchainOffer.amount), str));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            alertDialog$Builder.k(gd.M0(2131749605, null), new org.telegram.ui.ActionBar.r1() {
                @Override
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                    TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = tL_messageActionStarGiftOnchainOffer;
                    long j3 = tL_messageActionStarGiftOnchainOffer2.offer_id;
                    int i12 = i7;
                    boolean k10 = e4.k(i12, j3);
                    lc lcVar2 = lcVar;
                    if (k10) {
                        e4.s(lcVar2);
                    } else if (e4.m(i12, tL_messageActionStarGiftOnchainOffer2.offer_id)) {
                    } else {
                        String a10 = e4.a(i12, tL_messageActionStarGiftOnchainOffer2.offer_id);
                        e4.f3545c.put(a10, Long.valueOf(SystemClock.elapsedRealtime() + 30000));
                        e4.c();
                        TL_stars.declineStarGiftOnchainOffer declinestargiftonchainoffer = new TL_stars.declineStarGiftOnchainOffer();
                        declinestargiftonchainoffer.offer_msg_id = i10;
                        ConnectionsManager.getInstance(i12).sendRequestTyped(declinestargiftonchainoffer, new d3.b(1), new t3(a10, i12, k3Var, context, i6Var, lcVar2));
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void g(long j3) {
        f3543a.remove(Long.valueOf(j3));
        f3544b.remove(Long.valueOf(j3));
        c();
    }

    public static lc h() {
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (T != null) {
            return lc.b0(T);
        }
        return lc.Y();
    }

    public static boolean i(int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        boolean z10 = tL_messageActionStarGiftOnchainOffer.buyer;
        if (z10) {
            if (z10 && !tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined && !tL_messageActionStarGiftOnchainOffer.cancelled && !tL_messageActionStarGiftOnchainOffer.expired && !tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.cancelling) {
                return true;
            }
            return false;
        }
        return n(i7, tL_messageActionStarGiftOnchainOffer);
    }

    public static void j(long j3, long j10) {
        Long valueOf = Long.valueOf(j3);
        long j11 = Long.MAX_VALUE;
        if (j10 != Long.MAX_VALUE) {
            j11 = SystemClock.elapsedRealtime() + j10;
        }
        f3543a.put(valueOf, Long.valueOf(j11));
        c();
    }

    public static boolean k(int i7, long j3) {
        String a10 = a(i7, j3);
        HashMap hashMap = d;
        Long l10 = (Long) hashMap.get(a10);
        if (l10 == null) {
            return false;
        }
        if (l10.longValue() > SystemClock.elapsedRealtime()) {
            return true;
        }
        hashMap.remove(a(i7, j3));
        return false;
    }

    public static boolean l(int i7, long j3) {
        Long l10 = (Long) f3543a.get(Long.valueOf(j3));
        if ((l10 != null && l10.longValue() > SystemClock.elapsedRealtime()) || k(i7, j3) || m(i7, j3)) {
            return true;
        }
        return false;
    }

    public static boolean m(int i7, long j3) {
        String a10 = a(i7, j3);
        HashMap hashMap = f3545c;
        Long l10 = (Long) hashMap.get(a10);
        if (l10 == null) {
            return false;
        }
        if (l10.longValue() > SystemClock.elapsedRealtime()) {
            return true;
        }
        hashMap.remove(a(i7, j3));
        return false;
    }

    public static boolean n(int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined && !tL_messageActionStarGiftOnchainOffer.cancelled && !tL_messageActionStarGiftOnchainOffer.expired && !tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.cancelling && tL_messageActionStarGiftOnchainOffer.expires_at > ConnectionsManager.getInstance(i7).getCurrentTime()) {
            return true;
        }
        return false;
    }

    public static boolean o(TLRPC.Message message) {
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_to_msg_id != 0) {
            return true;
        }
        return false;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(' ', (char) 160);
    }

    public static org.telegram.ui.Wallet.p0 q(Context context, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar, int i7, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx) {
        try {
            return org.telegram.ui.Wallet.p0.b(tL_payments_starGiftOnchainOfferTx.message);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            u4.q(context, i7, i6Var, lcVar, "WALLET_UNSUPPORTED_SEND_MODE", null);
            return null;
        }
    }

    public static SpannableStringBuilder r(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        String str;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        if (starGift != null) {
            str = u4.h(starGift);
        } else {
            str = "";
        }
        String p10 = p(str);
        String p11 = p(u4.k(tL_messageActionStarGiftOnchainOffer.amount));
        if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.settled) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (tL_messageActionStarGiftOnchainOffer.buyer) {
            if (z10) {
                arrayList.add(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749588, p11, p10)));
            } else if (tL_messageActionStarGiftOnchainOffer.declined) {
                arrayList.add(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749587, p11, p10)));
            } else if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                arrayList.add(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749584, p11, p10)));
            }
            if (!z10 && (tL_messageActionStarGiftOnchainOffer.flags & 16) != 0) {
                arrayList.add(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749585, p(u4.k(tL_messageActionStarGiftOnchainOffer.buyer_refund)))));
            }
            if (tL_messageActionStarGiftOnchainOffer.cancelled && (tL_messageActionStarGiftOnchainOffer.flags & 32) != 0) {
                long j3 = tL_messageActionStarGiftOnchainOffer.fine;
                if (j3 > 0) {
                    arrayList.add(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749586, p(u4.k(j3)))));
                }
            }
        } else if (z10) {
            arrayList.add(gd.M0(2131749583, null));
            arrayList.add(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749581, p10, p11)));
        } else if (tL_messageActionStarGiftOnchainOffer.declined) {
            arrayList.add(gd.M0(2131749582, null));
        }
        if (arrayList.isEmpty()) {
            return u(tL_messageActionStarGiftOnchainOffer);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (i7 > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i7));
        }
        return spannableStringBuilder;
    }

    public static void s(lc lcVar) {
        if (lcVar == null) {
            lcVar = h();
        }
        org.telegram.messenger.f3.n(null, 2131749612, lcVar, 2131624012, 36);
    }

    public static void t(int i7, TL_stars.StarGift starGift) {
        String str;
        if (starGift != null) {
            str = u4.h(starGift);
        } else {
            str = "";
        }
        org.telegram.messenger.g0.g3(new ai.w0(i7, str, 2));
    }

    public static SpannableStringBuilder u(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        String str;
        boolean z10;
        int i7;
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        if (starGift != null) {
            str = u4.h(starGift);
        } else {
            str = "";
        }
        String p10 = p(str);
        String p11 = p(u4.k(tL_messageActionStarGiftOnchainOffer.amount));
        if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.settled) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = tL_messageActionStarGiftOnchainOffer.buyer;
        if (z11) {
            if (z10) {
                return org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749588, p11, p10));
            }
            if (tL_messageActionStarGiftOnchainOffer.declined) {
                return org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749587, p11, p10));
            }
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                return org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749584, p11, p10));
            }
        } else if (z10) {
            return org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749581, p10, p11));
        }
        if (tL_messageActionStarGiftOnchainOffer.declined) {
            i7 = 2131749555;
        } else if (tL_messageActionStarGiftOnchainOffer.cancelled) {
            i7 = 2131749556;
        } else if (tL_messageActionStarGiftOnchainOffer.expired) {
            if (z11) {
                i7 = 2131749554;
            } else {
                i7 = 2131749557;
            }
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            return d(tL_messageActionStarGiftOnchainOffer);
        }
        return org.telegram.messenger.g0.W2(gd.a0(null, null, i7, p11, p10));
    }
}
