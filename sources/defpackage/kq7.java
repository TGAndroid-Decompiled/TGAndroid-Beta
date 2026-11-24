package defpackage;

import java.util.List;
public final class kq7 implements s84 {
    public u84 a;
    public yab b;
    public boolean c;

    @Override
    public final int b(defpackage.t84 r25, defpackage.u21 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq7.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        try {
            return g((vb3) t84Var);
        } catch (bx7 unused) {
            return false;
        }
    }

    @Override
    public final void d(long j, long j2) {
        yab yabVar = this.b;
        if (yabVar != null) {
            mq7 mq7Var = yabVar.a;
            nq7 nq7Var = mq7Var.a;
            nq7Var.a = (short) 0;
            nq7Var.b = 0L;
            nq7Var.c = (short) 0;
            nq7Var.d = 0;
            nq7Var.e = 0;
            mq7Var.b.K(0);
            mq7Var.c = -1;
            mq7Var.e = false;
            if (j == 0) {
                yabVar.d(!yabVar.l);
            } else if (yabVar.h != 0) {
                long j3 = (yabVar.i * j2) / 1000000;
                yabVar.e = j3;
                oq7 oq7Var = yabVar.d;
                String str = hac.a;
                oq7Var.u0(j3);
                yabVar.h = (byte) 2;
            }
        }
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.a = u84Var;
    }

    public final boolean g(vb3 vb3Var) {
        boolean z;
        nq7 nq7Var = new nq7();
        if (nq7Var.a(vb3Var, true) && (nq7Var.a & 2) == 2) {
            int min = Math.min(nq7Var.e, 8);
            yw7 yw7Var = new yw7(min);
            vb3Var.d(yw7Var.a, 0, min, false);
            yw7Var.N(0);
            if (yw7Var.a() >= 5 && yw7Var.A() == 127 && yw7Var.C() == 1179402563) {
                this.b = new yab();
                return true;
            }
            yw7Var.N(0);
            try {
                z = c0f.c(1, yw7Var, true);
            } catch (bx7 unused) {
                z = false;
            }
            if (z) {
                this.b = new yab();
            } else {
                yw7Var.N(0);
                if (ys7.e(yw7Var, ys7.o)) {
                    this.b = new yab();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
