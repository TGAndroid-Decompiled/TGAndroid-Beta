package defpackage;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class o28 implements qac {
    public final byte a;
    public final p28 b;

    public o28(p28 p28Var, byte b) {
        this.a = b;
        this.b = p28Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i;
        w28 w28Var;
        b38 b38Var;
        w28 w28Var2;
        byte b = this.a;
        p28 p28Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                w28 w28Var3 = p28Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) w28Var3.N.get(num);
                }
                w28Var3.L = starGift;
                d38 d38Var = w28Var3.q0;
                qb9 qb9Var = w28Var3.K;
                if (starGift == null) {
                    if (qb9Var != null) {
                        qb9Var.i();
                        w28Var3.K = null;
                    }
                } else if (qb9Var == null || qb9Var.b != starGift.id) {
                    i = ((d) d38Var).currentAccount;
                    qb9 qb9Var2 = new qb9(i, w28Var3.L.id, new o28(p28Var, (byte) 2));
                    qb9Var2.w = true;
                    w28Var3.K = qb9Var2;
                    qb9Var2.l(false);
                }
                w28Var3.e();
                if (d38Var.J.getCurrentPosition() == 1) {
                    w28Var = d38Var.n;
                } else {
                    w28Var = d38Var.h;
                }
                w28Var.d();
                return;
            case 1:
                w28 w28Var4 = p28Var.e;
                w28Var4.h = ((Integer) obj).intValue();
                w28Var4.r = null;
                w28Var4.s = null;
                w28Var4.J = null;
                w28Var4.j(true);
                w28Var4.i();
                w28Var4.f(true);
                v28 v28Var = w28Var4.E;
                if (v28Var != null) {
                    v28Var.invalidate();
                }
                d38 d38Var2 = w28Var4.q0;
                w28 w28Var5 = d38Var2.n;
                if (w28Var5 != null && (b38Var = w28Var5.a) != null && (w28Var2 = d38Var2.h) != null) {
                    b38Var.a(w28Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                p28Var.e.d();
                return;
        }
    }
}
