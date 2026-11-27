package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class ws7 implements icc {
    public final byte a = 1;
    public final long b;
    public final TL_stars.TL_starGiftUnique c;
    public final Context d;
    public final int e;
    public final vnb f;
    public final String g;
    public final Runnable h;

    public ws7(long j, TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i, vnb vnbVar, String str, jra jraVar) {
        this.b = j;
        this.c = tL_starGiftUnique;
        this.d = context;
        this.e = i;
        this.f = vnbVar;
        this.g = str;
        this.h = jraVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        byte b = this.a;
        Runnable runnable = this.h;
        switch (b) {
            case 0:
                jra jraVar = (jra) runnable;
                a35 a35Var = (a35) obj;
                Boolean bool = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = new TL_wallet.walletOnchainGiftActionChangePrice();
                pj pjVar = pj.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                long j = tL_starGiftUnique.getResellAmount(pjVar).b;
                if (j > 0) {
                    walletonchaingiftactionchangeprice.flags |= 1;
                    walletonchaingiftactionchangeprice.old_price = j;
                }
                long j2 = this.b;
                walletonchaingiftactionchangeprice.new_price = j2;
                a35Var.h = walletonchaingiftactionchangeprice;
                a35Var.i = tL_starGiftUnique;
                Context context = this.d;
                int i4 = this.e;
                vnb vnbVar = this.f;
                ms7 ms7Var = new ms7(context, i4, tL_starGiftUnique, vnbVar);
                String M0 = ob6.M0(2131750223, null);
                String l = it7.l(j2);
                String str = this.g;
                ms7Var.h1(hl.S2(ob6.a0(null, null, 2131749614, str, l)), M0);
                String M02 = ob6.M0(2131749496, null);
                SpannableStringBuilder m = it7.m(j2);
                hjb hjbVar = ms7Var.Y1;
                hjbVar.f(M02, m, null, null);
                it7.c(ms7Var, j2, it7.g(tL_starGiftUnique), vnbVar);
                hjbVar.f(ob6.M0(2131749501, null), it7.j(a35Var.b), null, null);
                ms7Var.e1(ob6.M0(2131750223, null));
                ms7Var.p2 = 2131749576;
                ms7Var.f1(a35Var);
                ms7Var.d1(new wy(jraVar, tL_starGiftUnique, str, i4, j2, (byte) 10), new p4c(tL_starGiftUnique, str, j2, (byte) 6), new xs7(context, i4, vnbVar, ms7Var, bool, (byte) 2));
                ms7Var.show();
                return;
            default:
                jra jraVar2 = (jra) runnable;
                a35 a35Var2 = (a35) obj;
                Boolean bool2 = (Boolean) obj2;
                TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice2 = new TL_wallet.walletOnchainGiftActionChangePrice();
                long j3 = this.b;
                walletonchaingiftactionchangeprice2.new_price = j3;
                a35Var2.h = walletonchaingiftactionchangeprice2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.c;
                a35Var2.i = tL_starGiftUnique2;
                Context context2 = this.d;
                int i5 = this.e;
                vnb vnbVar2 = this.f;
                ms7 ms7Var2 = new ms7(context2, i5, tL_starGiftUnique2, vnbVar2);
                if (bool2.booleanValue()) {
                    i = 2131749490;
                } else {
                    i = 2131749477;
                }
                String M03 = ob6.M0(i, null);
                if (bool2.booleanValue()) {
                    i2 = 2131749489;
                } else {
                    i2 = 2131749491;
                }
                int i6 = i2;
                String l2 = it7.l(j3);
                String str2 = this.g;
                ms7Var2.h1(hl.S2(ob6.a0(null, null, i6, str2, l2)), M03);
                String M04 = ob6.M0(2131749496, null);
                SpannableStringBuilder m2 = it7.m(j3);
                hjb hjbVar2 = ms7Var2.Y1;
                hjbVar2.f(M04, m2, null, null);
                it7.c(ms7Var2, j3, it7.g(tL_starGiftUnique2), vnbVar2);
                hjbVar2.f(ob6.M0(2131749501, null), it7.j(a35Var2.b), null, null);
                it7.b(ms7Var2, tL_starGiftUnique2);
                if (bool2.booleanValue()) {
                    i3 = 2131749485;
                } else {
                    i3 = 2131749488;
                }
                ms7Var2.g1(ob6.M0(i3, null));
                ms7Var2.e1(ob6.M0(2131749492, null));
                ms7Var2.p2 = 2131749576;
                ms7Var2.f1(a35Var2);
                ms7Var2.d1(new he(jraVar2, tL_starGiftUnique2, bool2, str2, i5, j3, (byte) 3), new gt(tL_starGiftUnique2, bool2, str2, (byte) 29), new xs7(context2, i5, vnbVar2, ms7Var2, bool2, (byte) 3));
                ms7Var2.show();
                return;
        }
    }

    public ws7(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Context context, int i, vnb vnbVar, String str, jra jraVar) {
        this.c = tL_starGiftUnique;
        this.b = j;
        this.d = context;
        this.e = i;
        this.f = vnbVar;
        this.g = str;
        this.h = jraVar;
    }
}
