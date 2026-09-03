package f5;

import h5.d0;
import s8.g0;
public final class o extends n {
    public final int B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final boolean e;
    public final h f5932f;
    public final boolean h;
    public final boolean f5933n;
    public final int f5934r;
    public final int f5935s;
    public final int v;
    public final int f5936w;
    public final boolean f5937x;
    public final boolean f5938y;

    public o(int r6, o4.s0 r7, int r8, f5.h r9, int r10, int r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: f5.o.<init>(int, o4.s0, int, f5.h, int, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        s8.p b10 = s8.p.f44207a.c(oVar.f5933n, oVar2.f5933n).a(oVar.f5936w, oVar2.f5936w).c(oVar.f5937x, oVar2.f5937x).c(oVar.e, oVar2.e).c(oVar.h, oVar2.h).b(Integer.valueOf(oVar.v), Integer.valueOf(oVar2.v), g0.f44192c);
        boolean z4 = oVar.C;
        s8.p c3 = b10.c(z4, oVar2.C);
        boolean z10 = oVar.D;
        s8.p c10 = c3.c(z10, oVar2.D);
        if (z4 && z10) {
            c10 = c10.a(oVar.E, oVar2.E);
        }
        return c10.e();
    }

    @Override
    public final int a() {
        return this.B;
    }

    @Override
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.f5938y || d0.a(this.d.C, oVar.d.C)) {
            if (!this.f5932f.Q) {
                if (this.C != oVar.C || this.D != oVar.D) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
