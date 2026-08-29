package d5;

import f5.d0;
import q8.j0;
public final class o extends n {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final boolean f5355e;
    public final h f5356f;
    public final boolean h;
    public final boolean f5357n;
    public final int f5358r;
    public final int f5359s;
    public final int v;
    public final int f5360w;
    public final boolean f5361x;
    public final boolean f5362y;

    public o(int r6, l4.j1 r7, int r8, d5.h r9, int r10, int r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: d5.o.<init>(int, l4.j1, int, d5.h, int, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        q8.t b10 = q8.t.f46493a.c(oVar.f5357n, oVar2.f5357n).a(oVar.f5360w, oVar2.f5360w).c(oVar.f5361x, oVar2.f5361x).c(oVar.f5355e, oVar2.f5355e).c(oVar.h, oVar2.h).b(Integer.valueOf(oVar.v), Integer.valueOf(oVar2.v), j0.f46457c);
        boolean z10 = oVar.B;
        q8.t c3 = b10.c(z10, oVar2.B);
        boolean z11 = oVar.C;
        q8.t c6 = c3.c(z11, oVar2.C);
        if (z10 && z11) {
            c6 = c6.a(oVar.D, oVar2.D);
        }
        return c6.e();
    }

    @Override
    public final int a() {
        return this.A;
    }

    @Override
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.f5362y || d0.a(this.d.B, oVar.d.B)) {
            if (!this.f5356f.P) {
                if (this.B != oVar.B || this.C != oVar.C) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
