package f5;

import h5.d0;
import s8.g0;
public final class o extends n {
    public final int B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final boolean e;
    public final h f5943f;
    public final boolean h;
    public final boolean f5944n;
    public final int f5945r;
    public final int f5946s;
    public final int v;
    public final int f5947w;
    public final boolean f5948x;
    public final boolean f5949y;

    public o(int r6, o4.s0 r7, int r8, f5.h r9, int r10, int r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: f5.o.<init>(int, o4.s0, int, f5.h, int, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        s8.p b10 = s8.p.f44142a.c(oVar.f5944n, oVar2.f5944n).a(oVar.f5947w, oVar2.f5947w).c(oVar.f5948x, oVar2.f5948x).c(oVar.e, oVar2.e).c(oVar.h, oVar2.h).b(Integer.valueOf(oVar.v), Integer.valueOf(oVar2.v), g0.f44127c);
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
        if (this.f5949y || d0.a(this.d.C, oVar.d.C)) {
            if (!this.f5943f.Q) {
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
