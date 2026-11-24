package defpackage;

import j$.util.Objects;
import java.util.List;
public final class kw5 implements s84 {
    public u84 b;
    public byte c;
    public int d;
    public int e;
    public hh7 g;
    public vb3 h;
    public vh2 i;
    public sh7 j;
    public final yw7 a = new yw7(2);
    public long f = -1;

    @Override
    public final int b(defpackage.t84 r26, defpackage.u21 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw5.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        String v;
        yw7 yw7Var = this.a;
        yw7Var.K(2);
        ((vb3) t84Var).d(yw7Var.a, 0, 2, false);
        if (yw7Var.H() == 65496) {
            while (true) {
                vb3 vb3Var = (vb3) t84Var;
                yw7Var.K(2);
                vb3Var.d(yw7Var.a, 0, 2, false);
                int H = yw7Var.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                yw7Var.K(2);
                vb3Var.d(yw7Var.a, 0, 2, false);
                int H2 = yw7Var.H() - 2;
                if (H2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    vb3Var.a(H2, false);
                } else {
                    yw7Var.K(H2);
                    vb3Var.d(yw7Var.a, 0, H2, false);
                    if (Objects.equals(yw7Var.v(), "http://ns.adobe.com/xap/1.0/") && (v = yw7Var.v()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (v.contains(tfd.a[i] + "=\"1\"")) {
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
            sh7 sh7Var = this.j;
            sh7Var.getClass();
            sh7Var.d(j, j2);
        }
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.b = u84Var;
    }

    public final void g() {
        u84 u84Var = this.b;
        u84Var.getClass();
        u84Var.B();
        this.b.f0(new od0(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override
    public final void release() {
        sh7 sh7Var = this.j;
        if (sh7Var != null) {
            sh7Var.getClass();
        }
    }

    @Override
    public final s84 a() {
        return this;
    }
}
