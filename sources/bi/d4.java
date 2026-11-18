package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
public final class d4 implements x10 {
    public final org.telegram.ui.ActionBar.u1 f3544a;
    public final Context f3545b;
    public final int f3546c;
    public final TLRPC.TL_messageActionStarGiftOnchainOffer d;
    public final TL_stars.TL_payments_starGiftOnchainOfferTx f3547e;
    public final org.telegram.ui.Wallet.p0 f3548f;
    public final org.telegram.ui.ActionBar.i6 f3549g;
    public final lc h;

    public d4(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, org.telegram.ui.Wallet.p0 p0Var, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar) {
        this.f3544a = u1Var;
        this.f3545b = context;
        this.f3546c = i7;
        this.d = tL_messageActionStarGiftOnchainOffer;
        this.f3547e = tL_payments_starGiftOnchainOfferTx;
        this.f3548f = p0Var;
        this.f3549g = i6Var;
        this.h = lcVar;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String a02;
        String M0;
        this.f3544a.dismiss();
        final long longValue = ((Long) obj).longValue();
        TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = this.f3547e;
        long j10 = tL_payments_starGiftOnchainOfferTx.fine;
        if (j10 <= 0) {
            j10 = 0;
        }
        final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.d;
        long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j10);
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i7 > 0) {
            j3 = 0;
            a02 = gd.a0(null, null, 2131749550, v4.k(j10), v4.k(max));
        } else {
            j3 = 0;
            a02 = gd.a0(null, null, 2131749548, v4.k(max));
        }
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
        if (i7 > 0) {
            M0 = gd.a0(null, null, 2131749549, v4.k(j10));
        } else {
            M0 = gd.M0(2131749552, null);
        }
        TL_wallet.walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = new TL_wallet.walletOnchainGiftActionOfferCancel();
        walletonchaingiftactionoffercancel.offer_address = tL_messageActionStarGiftOnchainOffer.offer_address;
        int i10 = walletonchaingiftactionoffercancel.flags;
        walletonchaingiftactionoffercancel.flags = i10 | 2;
        walletonchaingiftactionoffercancel.price = tL_messageActionStarGiftOnchainOffer.amount;
        walletonchaingiftactionoffercancel.refund_amount = max;
        long j11 = tL_payments_starGiftOnchainOfferTx.fine;
        if (j11 > j3) {
            walletonchaingiftactionoffercancel.flags = i10 | 6;
            walletonchaingiftactionoffercancel.fine = j11;
        }
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        final org.telegram.ui.Wallet.p0 p0Var = this.f3548f;
        p0Var.h = walletonchaingiftactionoffercancel;
        p0Var.f44737i = starGift;
        final long j12 = tL_messageActionStarGiftOnchainOffer.offer_id;
        final boolean[] zArr = new boolean[1];
        f4.i(j12, Long.MAX_VALUE);
        final Context context = this.f3545b;
        final org.telegram.ui.ActionBar.i6 i6Var = this.f3549g;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        u3 u3Var = new u3(zArr, j12, 0);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.setOnDismissListener(u3Var);
        u1Var.S = gd.M0(2131749546, null);
        u1Var.U = W2;
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        final int i11 = this.f3546c;
        final lc lcVar = this.h;
        alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                org.telegram.ui.Wallet.p0 p0Var2 = p0Var;
                Context context2 = context;
                int i13 = i11;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                if (!o3.e1(context2, i13, i6Var2, p0Var2.f44732b + longValue, 2131749615)) {
                    return;
                }
                vf.b h = u1Var2.h(i12, true, true);
                h.d();
                aa.r rVar = new aa.r(new boolean[1], h, u1Var2, 9);
                zArr[0] = true;
                long j13 = j12;
                f4.i(j13, 300000L);
                org.telegram.ui.Wallet.u0.D(i13).o0(p0Var2, new w3(j13, rVar, context2, i13, i6Var2, lcVar), new x3(rVar, j13, tL_messageActionStarGiftOnchainOffer), new y3(j13, rVar));
            }
        });
        alertDialog$Builder.p();
    }
}
