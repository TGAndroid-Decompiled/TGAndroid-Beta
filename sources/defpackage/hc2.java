package defpackage;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.c;
public final class hc2 implements pcc {
    public final byte a = 0;
    public final int b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object g;

    public hc2(fu5 fu5Var, int i, long j, long j2, zu1 zu1Var, vnb vnbVar) {
        this.e = fu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = zu1Var;
        this.g = vnbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj3;
                vnb vnbVar = (vnb) obj2;
                Integer num = (Integer) obj;
                ((fu5) obj4).u();
                int intValue = num.intValue();
                long j = this.c;
                long j2 = this.d;
                if (intValue == 0) {
                    if (uc7.s1(i).p2(j, j2, null)) {
                        ip7.n(i).G(j, j2, false);
                    }
                    if (d31.a(zu1Var)) {
                        d31.z(zu1Var, 4, num.intValue(), vnbVar).j();
                        return;
                    }
                    return;
                }
                ip7.n(i).H(j, num.intValue(), j2);
                if (d31.a(zu1Var)) {
                    d31.z(zu1Var, 5, num.intValue(), vnbVar).j();
                    return;
                }
                return;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                String str = (String) obj3;
                xra xraVar = (xra) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    it7.v(tL_starGiftUnique, ob6.a0(null, null, 2131749581, str));
                    return;
                }
                xraVar.run();
                jxa.v(i, false).O(tL_starGiftUnique.slug);
                long j3 = this.c;
                if (j3 != 0) {
                    jxa.v(i, false).M(j3);
                    it7.v(tL_starGiftUnique, ob6.a0(null, null, 2131749624, str, wf3.r(i, j3)));
                    return;
                }
                jxa.v(i, false).M(this.d);
                c C = c.C(i);
                String str2 = tL_starGiftUnique.gift_address;
                a25 a25Var = C.B;
                hl.r(a25Var);
                C.y = str2;
                C.z = null;
                C.A = 0;
                C.A().d();
                C.G().g();
                C.J();
                int i2 = C.A;
                long[] jArr = c.U;
                if (i2 < 7) {
                    C.A = i2 + 1;
                    hl.d3(a25Var, jArr[i2]);
                }
                it7.v(tL_starGiftUnique, ob6.a0(null, null, 2131749625, str));
                return;
        }
    }

    public hc2(TL_stars.TL_starGiftUnique tL_starGiftUnique, String str, xra xraVar, int i, long j, long j2) {
        this.e = tL_starGiftUnique;
        this.f = str;
        this.g = xraVar;
        this.b = i;
        this.c = j;
        this.d = j2;
    }
}
