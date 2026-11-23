package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.m80;
public final class q4 implements r10 {
    public final int f3996a = 0;
    public final TL_stars.TL_starGiftUnique f3997b;
    public final long f3998c;
    public final Context d;
    public final int f3999e;
    public final org.telegram.ui.ActionBar.h6 f4000f;
    public final String f4001g;
    public final Runnable h;

    public q4(long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, String str, di.k1 k1Var) {
        this.f3998c = j3;
        this.f3997b = tL_starGiftUnique;
        this.d = context;
        this.f3999e = i7;
        this.f4000f = h6Var;
        this.f4001g = str;
        this.h = k1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3996a;
        Runnable runnable = this.h;
        switch (i13) {
            case 0:
                di.k1 k1Var = (di.k1) runnable;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j3 = this.f3998c;
                walletonchaingiftactionchangeprice.new_price = j3;
                p0Var.h = walletonchaingiftactionchangeprice;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f3997b;
                p0Var.f44747i = tL_starGiftUnique;
                int i14 = this.f3999e;
                Context context = this.d;
                org.telegram.ui.ActionBar.h6 h6Var = this.f4000f;
                u3 u3Var = new u3(i14, context, tL_starGiftUnique, h6Var);
                if (bool.booleanValue()) {
                    i7 = 2131749528;
                } else {
                    i7 = 2131749515;
                }
                String N0 = hd.N0(i7, null);
                if (bool.booleanValue()) {
                    i10 = 2131749527;
                } else {
                    i10 = 2131749529;
                }
                String k10 = a5.k(j3);
                String str = this.f4001g;
                u3Var.k1(org.telegram.messenger.g0.W2(hd.a0(null, null, i10, str, k10)), N0);
                String N02 = hd.N0(2131749534, null);
                SpannableStringBuilder l10 = a5.l(j3);
                ey0 ey0Var = u3Var.Z1;
                ey0Var.e(N02, l10, null, null);
                a5.c(u3Var, j3, a5.f(tL_starGiftUnique), h6Var);
                ey0Var.e(hd.N0(2131749539, null), a5.i(p0Var.f44742b), null, null);
                a5.b(u3Var, tL_starGiftUnique);
                if (bool.booleanValue()) {
                    i11 = 2131749523;
                } else {
                    i11 = 2131749526;
                }
                String N03 = hd.N0(i11, null);
                m80 m80Var = u3Var.f4097a2;
                m80Var.setText(N03);
                if (TextUtils.isEmpty(N03)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                m80Var.setVisibility(i12);
                u3Var.d2.i(hd.N0(2131749530, null), false, true);
                u3Var.f4112q2 = 2131749614;
                u3Var.j1(p0Var);
                u3Var.i1(new s4(k1Var, tL_starGiftUnique, bool, str, i14, j3), new j(tL_starGiftUnique, bool, str, 2), new n4(context, i14, h6Var, u3Var, bool, 2));
                u3Var.show();
                return;
            default:
                di.k1 k1Var2 = (di.k1) runnable;
                org.telegram.ui.Wallet.p0 p0Var2 = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool2 = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice2 = new TL_wallet.walletOnchainGiftActionChangePrice();
                cg.b bVar = cg.b.f5269b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.f3997b;
                long j10 = tL_starGiftUnique2.getResellAmount(bVar).f5267b;
                if (j10 > 0) {
                    walletonchaingiftactionchangeprice2.flags |= 1;
                    walletonchaingiftactionchangeprice2.old_price = j10;
                }
                long j11 = this.f3998c;
                walletonchaingiftactionchangeprice2.new_price = j11;
                p0Var2.h = walletonchaingiftactionchangeprice2;
                p0Var2.f44747i = tL_starGiftUnique2;
                int i15 = this.f3999e;
                Context context2 = this.d;
                org.telegram.ui.ActionBar.h6 h6Var2 = this.f4000f;
                u3 u3Var2 = new u3(i15, context2, tL_starGiftUnique2, h6Var2);
                String N04 = hd.N0(2131750247, null);
                String k11 = a5.k(j11);
                String str2 = this.f4001g;
                u3Var2.k1(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749651, str2, k11)), N04);
                String N05 = hd.N0(2131749534, null);
                SpannableStringBuilder l11 = a5.l(j11);
                ey0 ey0Var2 = u3Var2.Z1;
                ey0Var2.e(N05, l11, null, null);
                a5.c(u3Var2, j11, a5.f(tL_starGiftUnique2), h6Var2);
                ey0Var2.e(hd.N0(2131749539, null), a5.i(p0Var2.f44742b), null, null);
                u3Var2.d2.i(hd.N0(2131750247, null), false, true);
                u3Var2.f4112q2 = 2131749614;
                u3Var2.j1(p0Var2);
                u3Var2.i1(new e0(k1Var2, tL_starGiftUnique2, str2, i15, j11), new d4(tL_starGiftUnique2, str2, j11, 1), new n4(context2, i15, h6Var2, u3Var2, bool2, 3));
                u3Var2.show();
                return;
        }
    }

    public q4(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, String str, di.k1 k1Var) {
        this.f3997b = tL_starGiftUnique;
        this.f3998c = j3;
        this.d = context;
        this.f3999e = i7;
        this.f4000f = h6Var;
        this.f4001g = str;
        this.h = k1Var;
    }
}
