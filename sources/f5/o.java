package f5;

import h5.d0;
import s8.g0;
public final class o extends n {
    public final int B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final boolean f6044e;
    public final h f6045f;
    public final boolean h;
    public final boolean f6046n;
    public final int f6047r;
    public final int f6048s;
    public final int v;
    public final int f6049w;
    public final boolean f6050x;
    public final boolean f6051y;

    public o(int r6, o4.s0 r7, int r8, f5.h r9, int r10, int r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: f5.o.<init>(int, o4.s0, int, f5.h, int, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        s8.p b10 = s8.p.f47158a.c(oVar.f6046n, oVar2.f6046n).a(oVar.f6049w, oVar2.f6049w).c(oVar.f6050x, oVar2.f6050x).c(oVar.f6044e, oVar2.f6044e).c(oVar.h, oVar2.h).b(Integer.valueOf(oVar.v), Integer.valueOf(oVar2.v), g0.f47136c);
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
        if (this.f6051y || d0.a(this.d.C, oVar.d.C)) {
            if (!this.f6045f.Q) {
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
