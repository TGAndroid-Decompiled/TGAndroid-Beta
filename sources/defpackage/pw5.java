package defpackage;

import j$.util.Objects;
import java.util.List;
public final class pw5 implements e84 {
    public g84 b;
    public byte c;
    public int d;
    public int e;
    public oh7 g;
    public cb3 h;
    public zg2 i;
    public zh7 j;
    public final ey7 a = new ey7(2);
    public long f = -1;

    @Override
    public final int b(defpackage.f84 r26, defpackage.v11 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw5.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        String v;
        ey7 ey7Var = this.a;
        ey7Var.K(2);
        ((cb3) f84Var).d(ey7Var.a, 0, 2, false);
        if (ey7Var.H() == 65496) {
            while (true) {
                cb3 cb3Var = (cb3) f84Var;
                ey7Var.K(2);
                cb3Var.d(ey7Var.a, 0, 2, false);
                int H = ey7Var.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                ey7Var.K(2);
                cb3Var.d(ey7Var.a, 0, 2, false);
                int H2 = ey7Var.H() - 2;
                if (H2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    cb3Var.a(H2, false);
                } else {
                    ey7Var.K(H2);
                    cb3Var.d(ey7Var.a, 0, H2, false);
                    if (Objects.equals(ey7Var.v(), "http://ns.adobe.com/xap/1.0/") && (v = ey7Var.v()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (v.contains(jid.a[i] + "=\"1\"")) {
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
            zh7 zh7Var = this.j;
            zh7Var.getClass();
            zh7Var.d(j, j2);
        }
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.b = g84Var;
    }

    public final void g() {
        g84 g84Var = this.b;
        g84Var.getClass();
        g84Var.D();
        this.b.m0(new qc0(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override
    public final void release() {
        zh7 zh7Var = this.j;
        if (zh7Var != null) {
            zh7Var.getClass();
        }
    }

    @Override
    public final e84 a() {
        return this;
    }
}
