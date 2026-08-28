package b5;

import d5.f0;
import o8.j0;
public final class q extends p {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final boolean f1481e;
    public final j f1482f;
    public final boolean h;
    public final boolean f1483n;
    public final int f1484r;
    public final int f1485s;
    public final int v;
    public final int f1486w;
    public final boolean f1487x;
    public final boolean f1488y;

    public q(int r6, j4.i1 r7, int r8, b5.j r9, int r10, int r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: b5.q.<init>(int, j4.i1, int, b5.j, int, int, boolean):void");
    }

    public static int c(q qVar, q qVar2) {
        o8.t b10 = o8.t.f19087a.c(qVar.f1483n, qVar2.f1483n).a(qVar.f1486w, qVar2.f1486w).c(qVar.f1487x, qVar2.f1487x).c(qVar.f1481e, qVar2.f1481e).c(qVar.h, qVar2.h).b(Integer.valueOf(qVar.v), Integer.valueOf(qVar2.v), j0.f19051c);
        boolean z10 = qVar.B;
        o8.t c10 = b10.c(z10, qVar2.B);
        boolean z11 = qVar.C;
        o8.t c11 = c10.c(z11, qVar2.C);
        if (z10 && z11) {
            c11 = c11.a(qVar.D, qVar2.D);
        }
        return c11.e();
    }

    @Override
    public final int a() {
        return this.A;
    }

    @Override
    public final boolean b(p pVar) {
        q qVar = (q) pVar;
        if (this.f1488y || f0.a(this.d.B, qVar.d.B)) {
            if (!this.f1482f.P) {
                if (this.B != qVar.B || this.C != qVar.C) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
