package defpackage;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class l08 implements p8c {
    public final byte a;
    public final m08 b;

    public l08(m08 m08Var, byte b) {
        this.a = b;
        this.b = m08Var;
    }

    @Override
    public final void a(Object obj) {
        TL_stars.StarGift starGift;
        int i;
        t08 t08Var;
        y08 y08Var;
        t08 t08Var2;
        byte b = this.a;
        m08 m08Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                t08 t08Var3 = m08Var.e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) t08Var3.N.get(num);
                }
                t08Var3.L = starGift;
                a18 a18Var = t08Var3.q0;
                q99 q99Var = t08Var3.K;
                if (starGift == null) {
                    if (q99Var != null) {
                        q99Var.i();
                        t08Var3.K = null;
                    }
                } else if (q99Var == null || q99Var.b != starGift.id) {
                    i = ((d) a18Var).currentAccount;
                    q99 q99Var2 = new q99(i, t08Var3.L.id, new l08(m08Var, (byte) 2));
                    q99Var2.w = true;
                    t08Var3.K = q99Var2;
                    q99Var2.l(false);
                }
                t08Var3.e();
                if (a18Var.J.getCurrentPosition() == 1) {
                    t08Var = a18Var.n;
                } else {
                    t08Var = a18Var.h;
                }
                t08Var.d();
                return;
            case 1:
                t08 t08Var4 = m08Var.e;
                t08Var4.h = ((Integer) obj).intValue();
                t08Var4.r = null;
                t08Var4.s = null;
                t08Var4.J = null;
                t08Var4.j(true);
                t08Var4.i();
                t08Var4.f(true);
                s08 s08Var = t08Var4.E;
                if (s08Var != null) {
                    s08Var.invalidate();
                }
                a18 a18Var2 = t08Var4.q0;
                t08 t08Var5 = a18Var2.n;
                if (t08Var5 != null && (y08Var = t08Var5.a) != null && (t08Var2 = a18Var2.h) != null) {
                    y08Var.a(t08Var2.h);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                m08Var.e.d();
                return;
        }
    }
}
