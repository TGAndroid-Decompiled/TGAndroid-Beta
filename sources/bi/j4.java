package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;
public final class j4 implements q10 {
    public final int f3747a = 0;
    public final TL_stars.TL_starGiftUnique f3748b;
    public final long f3749c;
    public final Context d;
    public final int f3750e;
    public final org.telegram.ui.ActionBar.i6 f3751f;
    public final String f3752g;
    public final Runnable h;

    public j4(long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.f3749c = j3;
        this.f3748b = tL_starGiftUnique;
        this.d = context;
        this.f3750e = i7;
        this.f3751f = i6Var;
        this.f3752g = str;
        this.h = k1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3747a;
        Runnable runnable = this.h;
        switch (i13) {
            case 0:
                di.k1 k1Var = (di.k1) runnable;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j3 = this.f3749c;
                walletonchaingiftactionchangeprice.new_price = j3;
                p0Var.h = walletonchaingiftactionchangeprice;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f3748b;
                p0Var.f44737i = tL_starGiftUnique;
                int i14 = this.f3750e;
                Context context = this.d;
                org.telegram.ui.ActionBar.i6 i6Var = this.f3751f;
                o3 o3Var = new o3(i14, context, tL_starGiftUnique, i6Var);
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
                String k10 = u4.k(j3);
                String str = this.f3752g;
                o3Var.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, i10, str, k10)), M0);
                String M02 = gd.M0(2131749535, null);
                SpannableStringBuilder l10 = u4.l(j3);
                cy0 cy0Var = o3Var.Z1;
                cy0Var.e(M02, l10, null, null);
                u4.c(o3Var, j3, u4.f(tL_starGiftUnique), i6Var);
                cy0Var.e(gd.M0(2131749540, null), u4.i(p0Var.f44732b), null, null);
                u4.b(o3Var, tL_starGiftUnique);
                if (bool.booleanValue()) {
                    i11 = 2131749524;
                } else {
                    i11 = 2131749527;
                }
                String M03 = gd.M0(i11, null);
                k80 k80Var = o3Var.f3891a2;
                k80Var.setText(M03);
                if (TextUtils.isEmpty(M03)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                k80Var.setVisibility(i12);
                o3Var.d2.i(gd.M0(2131749531, null), false, true);
                o3Var.f3906q2 = 2131749615;
                o3Var.j1(p0Var);
                o3Var.i1(new l4(k1Var, tL_starGiftUnique, bool, str, i14, j3), new j(tL_starGiftUnique, bool, str, 2), new g4(context, i14, i6Var, o3Var, bool, 2));
                o3Var.show();
                return;
            default:
                di.k1 k1Var2 = (di.k1) runnable;
                org.telegram.ui.Wallet.p0 p0Var2 = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool2 = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice2 = new TL_wallet.walletOnchainGiftActionChangePrice();
                cg.b bVar = cg.b.f5274b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.f3748b;
                long j10 = tL_starGiftUnique2.getResellAmount(bVar).f5272b;
                if (j10 > 0) {
                    walletonchaingiftactionchangeprice2.flags |= 1;
                    walletonchaingiftactionchangeprice2.old_price = j10;
                }
                long j11 = this.f3749c;
                walletonchaingiftactionchangeprice2.new_price = j11;
                p0Var2.h = walletonchaingiftactionchangeprice2;
                p0Var2.f44737i = tL_starGiftUnique2;
                int i15 = this.f3750e;
                Context context2 = this.d;
                org.telegram.ui.ActionBar.i6 i6Var2 = this.f3751f;
                o3 o3Var2 = new o3(i15, context2, tL_starGiftUnique2, i6Var2);
                String M04 = gd.M0(2131750248, null);
                String k11 = u4.k(j11);
                String str2 = this.f3752g;
                o3Var2.k1(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749652, str2, k11)), M04);
                String M05 = gd.M0(2131749535, null);
                SpannableStringBuilder l11 = u4.l(j11);
                cy0 cy0Var2 = o3Var2.Z1;
                cy0Var2.e(M05, l11, null, null);
                u4.c(o3Var2, j11, u4.f(tL_starGiftUnique2), i6Var2);
                cy0Var2.e(gd.M0(2131749540, null), u4.i(p0Var2.f44732b), null, null);
                o3Var2.d2.i(gd.M0(2131750248, null), false, true);
                o3Var2.f3906q2 = 2131749615;
                o3Var2.j1(p0Var2);
                o3Var2.i1(new e0(k1Var2, tL_starGiftUnique2, str2, i15, j11), new x3(tL_starGiftUnique2, str2, j11, 1), new g4(context2, i15, i6Var2, o3Var2, bool2, 3));
                o3Var2.show();
                return;
        }
    }

    public j4(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.f3748b = tL_starGiftUnique;
        this.f3749c = j3;
        this.d = context;
        this.f3750e = i7;
        this.f3751f = i6Var;
        this.f3752g = str;
        this.h = k1Var;
    }
}
