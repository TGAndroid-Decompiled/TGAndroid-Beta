package defpackage;

import j$.util.Objects;
import java.util.List;
public final class ku5 implements j74 {
    public l74 b;
    public byte c;
    public int d;
    public int e;
    public ef7 g;
    public ja3 h;
    public hg2 i;
    public pf7 j;
    public final xu7 a = new xu7(2);
    public long f = -1;

    @Override
    public final int b(defpackage.k74 r26, defpackage.m11 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku5.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        String v;
        xu7 xu7Var = this.a;
        xu7Var.K(2);
        ((ja3) k74Var).d(xu7Var.a, 0, 2, false);
        if (xu7Var.H() == 65496) {
            while (true) {
                ja3 ja3Var = (ja3) k74Var;
                xu7Var.K(2);
                ja3Var.d(xu7Var.a, 0, 2, false);
                int H = xu7Var.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                xu7Var.K(2);
                ja3Var.d(xu7Var.a, 0, 2, false);
                int H2 = xu7Var.H() - 2;
                if (H2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    ja3Var.a(H2, false);
                } else {
                    xu7Var.K(H2);
                    ja3Var.d(xu7Var.a, 0, H2, false);
                    if (Objects.equals(xu7Var.v(), "http://ns.adobe.com/xap/1.0/") && (v = xu7Var.v()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (v.contains(rdd.a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = (byte) 0;
            this.j = null;
        } else if (this.c == 5) {
            pf7 pf7Var = this.j;
            pf7Var.getClass();
            pf7Var.d(j, j2);
        }
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.b = l74Var;
    }

    public final void g() {
        l74 l74Var = this.b;
        l74Var.getClass();
        l74Var.z();
        this.b.g0(new oc0(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override
    public final void release() {
        pf7 pf7Var = this.j;
        if (pf7Var != null) {
            pf7Var.getClass();
        }
    }

    @Override
    public final j74 a() {
        return this;
    }
}
