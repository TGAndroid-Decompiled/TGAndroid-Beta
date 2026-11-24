package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class yp7 implements i8c {
    public final byte a = 0;
    public final TL_stars.TL_starGiftUnique b;
    public final long c;
    public final Context d;
    public final int e;
    public final wjb f;
    public final String g;
    public final Runnable h;

    public yp7(long j, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i, wjb wjbVar, String str, nna nnaVar) {
        this.c = j;
        this.b = tL_starGiftUnique;
        this.d = context;
        this.e = i;
        this.f = wjbVar;
        this.g = str;
        this.h = nnaVar;
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
                nna nnaVar = (nna) runnable;
                w05 w05Var = (w05) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j = this.c;
                walletonchaingiftactionchangeprice.new_price = j;
                w05Var.h = walletonchaingiftactionchangeprice;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.b;
                w05Var.i = tL_starGiftUnique;
                Context context = this.d;
                int i5 = this.e;
                wjb wjbVar = this.f;
                mp7 mp7Var = new mp7(context, i5, tL_starGiftUnique, wjbVar);
                if (bool.booleanValue()) {
                    i = 2131749529;
                } else {
                    i = 2131749516;
                }
                String M0 = k96.M0(i, null);
                if (bool.booleanValue()) {
                    i2 = 2131749528;
                } else {
                    i2 = 2131749530;
                }
                String k = cq7.k(j);
                String str = this.g;
                mp7Var.e1(gl.S2(k96.a0(null, null, i2, str, k)), M0);
                String M02 = k96.M0(2131749535, null);
                SpannableStringBuilder l = cq7.l(j);
                mfb mfbVar = mp7Var.Y1;
                mfbVar.f(M02, l, null, null);
                cq7.c(mp7Var, j, cq7.f(tL_starGiftUnique), wjbVar);
                mfbVar.f(k96.M0(2131749540, null), cq7.i(w05Var.b), null, null);
                cq7.b(mp7Var, tL_starGiftUnique);
                if (bool.booleanValue()) {
                    i3 = 2131749524;
                } else {
                    i3 = 2131749527;
                }
                String M03 = k96.M0(i3, null);
                l46 l46Var = mp7Var.Z1;
                l46Var.setText(M03);
                if (TextUtils.isEmpty(M03)) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                l46Var.setVisibility(i4);
                mp7Var.c2.i(k96.M0(2131749531, null), false, true);
                mp7Var.p2 = 2131749615;
                mp7Var.d1(w05Var);
                mp7Var.c1(new ue(nnaVar, tL_starGiftUnique, bool, str, i5, j, (byte) 3), new ht(tL_starGiftUnique, bool, str, (byte) 29), new xp7(context, i5, wjbVar, mp7Var, bool, (byte) 2));
                mp7Var.show();
                return;
            default:
                nna nnaVar2 = (nna) runnable;
                w05 w05Var2 = (w05) obj;
                Boolean bool2 = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice2 = new TL_wallet.walletOnchainGiftActionChangePrice();
                oj ojVar = oj.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.b;
                long j2 = tL_starGiftUnique2.getResellAmount(ojVar).b;
                if (j2 > 0) {
                    walletonchaingiftactionchangeprice2.flags |= 1;
                    walletonchaingiftactionchangeprice2.old_price = j2;
                }
                long j3 = this.c;
                walletonchaingiftactionchangeprice2.new_price = j3;
                w05Var2.h = walletonchaingiftactionchangeprice2;
                w05Var2.i = tL_starGiftUnique2;
                Context context2 = this.d;
                int i6 = this.e;
                wjb wjbVar2 = this.f;
                mp7 mp7Var2 = new mp7(context2, i6, tL_starGiftUnique2, wjbVar2);
                String M04 = k96.M0(2131750248, null);
                String k2 = cq7.k(j3);
                String str2 = this.g;
                mp7Var2.e1(gl.S2(k96.a0(null, null, 2131749652, str2, k2)), M04);
                String M05 = k96.M0(2131749535, null);
                SpannableStringBuilder l2 = cq7.l(j3);
                mfb mfbVar2 = mp7Var2.Y1;
                mfbVar2.f(M05, l2, null, null);
                cq7.c(mp7Var2, j3, cq7.f(tL_starGiftUnique2), wjbVar2);
                mfbVar2.f(k96.M0(2131749540, null), cq7.i(w05Var2.b), null, null);
                mp7Var2.c2.i(k96.M0(2131750248, null), false, true);
                mp7Var2.p2 = 2131749615;
                mp7Var2.d1(w05Var2);
                mp7Var2.c1(new wy(nnaVar2, tL_starGiftUnique2, str2, i6, j3, (byte) 10), new p0c(tL_starGiftUnique2, str2, j3, (byte) 6), new xp7(context2, i6, wjbVar2, mp7Var2, bool2, (byte) 3));
                mp7Var2.show();
                return;
        }
    }

    public yp7(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Context context, int i, wjb wjbVar, String str, nna nnaVar) {
        this.b = tL_starGiftUnique;
        this.c = j;
        this.d = context;
        this.e = i;
        this.f = wjbVar;
        this.g = str;
        this.h = nnaVar;
    }
}
