package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class bs7 implements jac {
    public final byte a = 0;
    public final TL_stars.TL_starGiftUnique b;
    public final long c;
    public final Context d;
    public final int e;
    public final ylb f;
    public final String g;
    public final Runnable h;

    public bs7(long j, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i, ylb ylbVar, String str, npa npaVar) {
        this.c = j;
        this.b = tL_starGiftUnique;
        this.d = context;
        this.e = i;
        this.f = ylbVar;
        this.g = str;
        this.h = npaVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        Runnable runnable = this.h;
        switch (b) {
            case 0:
                npa npaVar = (npa) runnable;
                w25 w25Var = (w25) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j = this.c;
                walletonchaingiftactionchangeprice.new_price = j;
                w25Var.h = walletonchaingiftactionchangeprice;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.b;
                w25Var.i = tL_starGiftUnique;
                Context context = this.d;
                int i5 = this.e;
                ylb ylbVar = this.f;
                pr7 pr7Var = new pr7(context, i5, tL_starGiftUnique, ylbVar);
                if (bool.booleanValue()) {
                    i = 2131749478;
                } else {
                    i = 2131749465;
                }
                String M0 = jb6.M0(i, null);
                if (bool.booleanValue()) {
                    i2 = 2131749477;
                } else {
                    i2 = 2131749479;
                }
                String k = fs7.k(j);
                String str = this.g;
                pr7Var.e1(gm.S2(jb6.a0(null, null, i2, str, k)), M0);
                String M02 = jb6.M0(2131749484, null);
                SpannableStringBuilder l = fs7.l(j);
                mhb mhbVar = pr7Var.Y1;
                mhbVar.f(M02, l, null, null);
                fs7.c(pr7Var, j, fs7.f(tL_starGiftUnique), ylbVar);
                mhbVar.f(jb6.M0(2131749489, null), fs7.i(w25Var.b), null, null);
                fs7.b(pr7Var, tL_starGiftUnique);
                if (bool.booleanValue()) {
                    i3 = 2131749473;
                } else {
                    i3 = 2131749476;
                }
                String M03 = jb6.M0(i3, null);
                l66 l66Var = pr7Var.Z1;
                l66Var.setText(M03);
                if (TextUtils.isEmpty(M03)) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                l66Var.setVisibility(i4);
                pr7Var.c2.i(jb6.M0(2131749480, null), false, true);
                pr7Var.p2 = 2131749564;
                pr7Var.d1(w25Var);
                pr7Var.c1(new vf(npaVar, tL_starGiftUnique, bool, str, i5, j, (byte) 3), new iu(tL_starGiftUnique, bool, str, (byte) 29), new as7(context, i5, ylbVar, pr7Var, bool, (byte) 2));
                pr7Var.show();
                return;
            default:
                npa npaVar2 = (npa) runnable;
                w25 w25Var2 = (w25) obj;
                Boolean bool2 = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice2 = new TL_wallet.walletOnchainGiftActionChangePrice();
                ok okVar = ok.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.b;
                long j2 = tL_starGiftUnique2.getResellAmount(okVar).b;
                if (j2 > 0) {
                    walletonchaingiftactionchangeprice2.flags |= 1;
                    walletonchaingiftactionchangeprice2.old_price = j2;
                }
                long j3 = this.c;
                walletonchaingiftactionchangeprice2.new_price = j3;
                w25Var2.h = walletonchaingiftactionchangeprice2;
                w25Var2.i = tL_starGiftUnique2;
                Context context2 = this.d;
                int i6 = this.e;
                ylb ylbVar2 = this.f;
                pr7 pr7Var2 = new pr7(context2, i6, tL_starGiftUnique2, ylbVar2);
                String M04 = jb6.M0(2131750197, null);
                String k2 = fs7.k(j3);
                String str2 = this.g;
                pr7Var2.e1(gm.S2(jb6.a0(null, null, 2131749601, str2, k2)), M04);
                String M05 = jb6.M0(2131749484, null);
                SpannableStringBuilder l2 = fs7.l(j3);
                mhb mhbVar2 = pr7Var2.Y1;
                mhbVar2.f(M05, l2, null, null);
                fs7.c(pr7Var2, j3, fs7.f(tL_starGiftUnique2), ylbVar2);
                mhbVar2.f(jb6.M0(2131749489, null), fs7.i(w25Var2.b), null, null);
                pr7Var2.c2.i(jb6.M0(2131750197, null), false, true);
                pr7Var2.p2 = 2131749564;
                pr7Var2.d1(w25Var2);
                pr7Var2.c1(new wz(npaVar2, tL_starGiftUnique2, str2, i6, j3, (byte) 10), new p2c(tL_starGiftUnique2, str2, j3, (byte) 6), new as7(context2, i6, ylbVar2, pr7Var2, bool2, (byte) 3));
                pr7Var2.show();
                return;
        }
    }

    public bs7(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Context context, int i, ylb ylbVar, String str, npa npaVar) {
        this.b = tL_starGiftUnique;
        this.c = j;
        this.d = context;
        this.e = i;
        this.f = ylbVar;
        this.g = str;
        this.h = npaVar;
    }
}
