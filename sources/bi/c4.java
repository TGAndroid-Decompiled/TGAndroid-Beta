package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lc;
public final class c4 implements q10 {
    public final int f3519a;
    public final long f3520b;
    public final Context f3521c;
    public final int d;
    public final org.telegram.ui.ActionBar.i6 f3522e;
    public final Object f3523f;
    public final Object f3524g;
    public final Object h;

    public c4(long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.f3519a = 1;
        this.f3520b = j3;
        this.f3523f = tL_starGiftUnique;
        this.f3521c = context;
        this.d = i7;
        this.f3522e = i6Var;
        this.f3524g = str;
        this.h = k1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3519a;
        Object obj3 = this.h;
        Object obj4 = this.f3524g;
        Object obj5 = this.f3523f;
        switch (i13) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj5;
                lc lcVar = (lc) obj4;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                long j3 = this.f3520b;
                Context context = this.f3521c;
                int i14 = this.d;
                org.telegram.ui.ActionBar.i6 i6Var = this.f3522e;
                if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                    org.telegram.ui.Wallet.p0 o4 = f4.o(context, i6Var, lcVar, i14, tL_payments_starGiftOnchainOfferTx);
                    if (o4 == null) {
                        u1Var.dismiss();
                        f4.f(j3);
                        return;
                    }
                    d4 d4Var = new d4(u1Var, context, i14, tL_messageActionStarGiftOnchainOffer, tL_payments_starGiftOnchainOfferTx, o4, i6Var, lcVar);
                    int i15 = o3.f3924x2;
                    boolean[] zArr = new boolean[1];
                    aa.r rVar = new aa.r(zArr, r2, d4Var, 8);
                    org.telegram.messenger.g0.h3(rVar, 5000L);
                    Runnable[] runnableArr = {org.telegram.ui.Wallet.u0.D(i14).l(o4, new h0(zArr, rVar, d4Var, 1))};
                    return;
                }
                u1Var.dismiss();
                f4.f(j3);
                v4.r(context, i14, i6Var, lcVar, tL_error, null);
                return;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj5;
                String str = (String) obj4;
                di.k1 k1Var = (di.k1) obj3;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j10 = this.f3520b;
                walletonchaingiftactionchangeprice.new_price = j10;
                p0Var.h = walletonchaingiftactionchangeprice;
                p0Var.f44737i = tL_starGiftUnique;
                int i16 = this.d;
                Context context2 = this.f3521c;
                org.telegram.ui.ActionBar.i6 i6Var2 = this.f3522e;
                o3 o3Var = new o3(i16, context2, tL_starGiftUnique, i6Var2);
                if (bool.booleanValue()) {
                    i7 = 2131749529;
                } else {
                    i7 = 2131749516;
                }
                String M0 = gd.M0(i7, null);
                if (bool.booleanValue()) {
                    i10 = 2131749528;
                } else {
                    i10 = 2131749530;
                }
                o3Var.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, i10, str, v4.k(j10))), M0);
                String M02 = gd.M0(2131749535, null);
                SpannableStringBuilder l10 = v4.l(j10);
                cy0 cy0Var = o3Var.Z1;
                cy0Var.e(M02, l10, null, null);
                v4.c(o3Var, j10, v4.f(tL_starGiftUnique), i6Var2);
                cy0Var.e(gd.M0(2131749540, null), v4.i(p0Var.f44732b), null, null);
                v4.b(o3Var, tL_starGiftUnique);
                if (bool.booleanValue()) {
                    i11 = 2131749524;
                } else {
                    i11 = 2131749527;
                }
                String M03 = gd.M0(i11, null);
                k80 k80Var = o3Var.f3925a2;
                k80Var.setText(M03);
                if (TextUtils.isEmpty(M03)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                k80Var.setVisibility(i12);
                o3Var.d2.i(gd.M0(2131749531, null), false, true);
                o3Var.f3940q2 = 2131749615;
                o3Var.j1(p0Var);
                o3Var.i1(new l4(k1Var, tL_starGiftUnique, bool, str, i16, j10), new j(tL_starGiftUnique, bool, str, 2), new h4(context2, i16, i6Var2, o3Var, bool, 2));
                o3Var.show();
                return;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) obj5;
                String str2 = (String) obj4;
                di.k1 k1Var2 = (di.k1) obj3;
                org.telegram.ui.Wallet.p0 p0Var2 = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool2 = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice2 = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j11 = tL_starGiftUnique2.getResellAmount(cg.b.f5277b).f5275b;
                if (j11 > 0) {
                    walletonchaingiftactionchangeprice2.flags |= 1;
                    walletonchaingiftactionchangeprice2.old_price = j11;
                }
                long j12 = this.f3520b;
                walletonchaingiftactionchangeprice2.new_price = j12;
                p0Var2.h = walletonchaingiftactionchangeprice2;
                p0Var2.f44737i = tL_starGiftUnique2;
                int i17 = this.d;
                Context context3 = this.f3521c;
                org.telegram.ui.ActionBar.i6 i6Var3 = this.f3522e;
                o3 o3Var2 = new o3(i17, context3, tL_starGiftUnique2, i6Var3);
                o3Var2.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749652, str2, v4.k(j12))), gd.M0(2131750248, null));
                String M04 = gd.M0(2131749535, null);
                SpannableStringBuilder l11 = v4.l(j12);
                cy0 cy0Var2 = o3Var2.Z1;
                cy0Var2.e(M04, l11, null, null);
                v4.c(o3Var2, j12, v4.f(tL_starGiftUnique2), i6Var3);
                cy0Var2.e(gd.M0(2131749540, null), v4.i(p0Var2.f44732b), null, null);
                o3Var2.d2.i(gd.M0(2131750248, null), false, true);
                o3Var2.f3940q2 = 2131749615;
                o3Var2.j1(p0Var2);
                o3Var2.i1(new e0(k1Var2, tL_starGiftUnique2, str2, i17, j12), new x3(tL_starGiftUnique2, str2, j12, 1), new h4(context3, i17, i6Var3, o3Var2, bool2, 3));
                o3Var2.show();
                return;
        }
    }

    public c4(Object obj, long j3, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, Object obj2, Object obj3, int i10) {
        this.f3519a = i10;
        this.f3523f = obj;
        this.f3520b = j3;
        this.f3521c = context;
        this.d = i7;
        this.f3522e = i6Var;
        this.f3524g = obj2;
        this.h = obj3;
    }
}
