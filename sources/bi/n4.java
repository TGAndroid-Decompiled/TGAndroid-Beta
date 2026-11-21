package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.m80;
public final class n4 implements q10 {
    public final int f3935a = 0;
    public final TL_stars.TL_starGiftUnique f3936b;
    public final long f3937c;
    public final Context d;
    public final int f3938e;
    public final org.telegram.ui.ActionBar.h6 f3939f;
    public final String f3940g;
    public final Runnable h;

    public n4(long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, String str, di.k1 k1Var) {
        this.f3937c = j3;
        this.f3936b = tL_starGiftUnique;
        this.d = context;
        this.f3938e = i7;
        this.f3939f = h6Var;
        this.f3940g = str;
        this.h = k1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3935a;
        Runnable runnable = this.h;
        switch (i13) {
            case 0:
                di.k1 k1Var = (di.k1) runnable;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j3 = this.f3937c;
                walletonchaingiftactionchangeprice.new_price = j3;
                p0Var.h = walletonchaingiftactionchangeprice;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f3936b;
                p0Var.f44777i = tL_starGiftUnique;
                int i14 = this.f3938e;
                Context context = this.d;
                org.telegram.ui.ActionBar.h6 h6Var = this.f3939f;
                s3 s3Var = new s3(i14, context, tL_starGiftUnique, h6Var);
                if (bool.booleanValue()) {
                    i7 = 2131749528;
                } else {
                    i7 = 2131749515;
                }
                String N0 = gd.N0(i7, null);
                if (bool.booleanValue()) {
                    i10 = 2131749527;
                } else {
                    i10 = 2131749529;
                }
                String k10 = y4.k(j3);
                String str = this.f3940g;
                s3Var.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, i10, str, k10)), N0);
                String N02 = gd.N0(2131749534, null);
                SpannableStringBuilder l10 = y4.l(j3);
                ey0 ey0Var = s3Var.Z1;
                ey0Var.e(N02, l10, null, null);
                y4.c(s3Var, j3, y4.f(tL_starGiftUnique), h6Var);
                ey0Var.e(gd.N0(2131749539, null), y4.i(p0Var.f44772b), null, null);
                y4.b(s3Var, tL_starGiftUnique);
                if (bool.booleanValue()) {
                    i11 = 2131749523;
                } else {
                    i11 = 2131749526;
                }
                String N03 = gd.N0(i11, null);
                m80 m80Var = s3Var.f4063a2;
                m80Var.setText(N03);
                if (TextUtils.isEmpty(N03)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                m80Var.setVisibility(i12);
                s3Var.d2.i(gd.N0(2131749530, null), false, true);
                s3Var.f4078q2 = 2131749614;
                s3Var.j1(p0Var);
                s3Var.i1(new p4(k1Var, tL_starGiftUnique, bool, str, i14, j3), new j(tL_starGiftUnique, bool, str, 2), new k4(context, i14, h6Var, s3Var, bool, 2));
                s3Var.show();
                return;
            default:
                di.k1 k1Var2 = (di.k1) runnable;
                org.telegram.ui.Wallet.p0 p0Var2 = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool2 = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice2 = new TL_wallet.walletOnchainGiftActionChangePrice();
                cg.b bVar = cg.b.f5303b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.f3936b;
                long j10 = tL_starGiftUnique2.getResellAmount(bVar).f5301b;
                if (j10 > 0) {
                    walletonchaingiftactionchangeprice2.flags |= 1;
                    walletonchaingiftactionchangeprice2.old_price = j10;
                }
                long j11 = this.f3937c;
                walletonchaingiftactionchangeprice2.new_price = j11;
                p0Var2.h = walletonchaingiftactionchangeprice2;
                p0Var2.f44777i = tL_starGiftUnique2;
                int i15 = this.f3938e;
                Context context2 = this.d;
                org.telegram.ui.ActionBar.h6 h6Var2 = this.f3939f;
                s3 s3Var2 = new s3(i15, context2, tL_starGiftUnique2, h6Var2);
                String N04 = gd.N0(2131750247, null);
                String k11 = y4.k(j11);
                String str2 = this.f3940g;
                s3Var2.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749651, str2, k11)), N04);
                String N05 = gd.N0(2131749534, null);
                SpannableStringBuilder l11 = y4.l(j11);
                ey0 ey0Var2 = s3Var2.Z1;
                ey0Var2.e(N05, l11, null, null);
                y4.c(s3Var2, j11, y4.f(tL_starGiftUnique2), h6Var2);
                ey0Var2.e(gd.N0(2131749539, null), y4.i(p0Var2.f44772b), null, null);
                s3Var2.d2.i(gd.N0(2131750247, null), false, true);
                s3Var2.f4078q2 = 2131749614;
                s3Var2.j1(p0Var2);
                s3Var2.i1(new e0(k1Var2, tL_starGiftUnique2, str2, i15, j11), new b4(tL_starGiftUnique2, str2, j11, 1), new k4(context2, i15, h6Var2, s3Var2, bool2, 3));
                s3Var2.show();
                return;
        }
    }

    public n4(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, String str, di.k1 k1Var) {
        this.f3936b = tL_starGiftUnique;
        this.f3937c = j3;
        this.d = context;
        this.f3938e = i7;
        this.f3939f = h6Var;
        this.f3940g = str;
        this.h = k1Var;
    }
}
