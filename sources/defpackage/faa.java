package defpackage;

import android.graphics.Typeface;
import android.view.View;
public final class faa extends gb {
    public final gaa x;

    public faa(gaa gaaVar, gaa gaaVar2) {
        super(gaaVar2);
        this.x = gaaVar;
    }

    @Override
    public final boolean b() {
        taa taaVar = this.x.w0;
        if (!taaVar.J && taaVar.T1) {
            return !taaVar.n1.m();
        }
        return false;
    }

    @Override
    public final void e(float f, float f2, boolean z) {
        gaa gaaVar = this.x;
        taa taaVar = gaaVar.w0;
        int i = taa.T2;
        for (int i2 = 0; i2 < taaVar.b.getChildCount(); i2++) {
            View childAt = taaVar.b.getChildAt(i2);
            if (childAt != taaVar.q1 && childAt != taaVar.v1 && childAt != taaVar.N1[1] && childAt != taaVar.x1 && childAt != taaVar.m1 && childAt != taaVar.X1 && childAt != taaVar.p1) {
                childAt.setTranslationY(f);
            }
        }
        v9a v9aVar = taaVar.A1;
        taaVar.o2 = f;
        int i3 = gaaVar.r0;
        if (i3 != -1) {
            if (!z) {
                f2 = 1.0f - f2;
            }
            float f3 = 1.0f - f2;
            int i4 = gaaVar.s0;
            taaVar.k2 = (int) ((i4 * f2) + (i3 * f3));
            float f4 = ((i3 - i4) * f3) + f;
            v9aVar.setTranslationY(f4);
            if (z) {
                taaVar.B1.setTranslationY(f4);
            } else {
                taaVar.B1.setTranslationY(f4 + taaVar.A1.getPaddingTop());
            }
        } else {
            int i5 = gaaVar.t0;
            if (i5 != -1) {
                float f5 = 1.0f - f2;
                int i6 = gaaVar.u0;
                taaVar.k2 = (int) ((i6 * f2) + (i5 * f5));
                if (!z) {
                    f5 = f2;
                }
                if (z) {
                    v9aVar.setTranslationY(f - ((i5 - i6) * f2));
                } else {
                    v9aVar.setTranslationY(((i6 - i5) * f5) + f);
                }
            }
        }
        taaVar.A1.setTopGlowOffset((int) (taaVar.k2 + taaVar.o2));
        taaVar.l1.setTranslationY(taaVar.k2 + taaVar.o2);
        taaVar.L1.setTranslationY(taaVar.k2 + taaVar.o2);
        taaVar.m1.invalidate();
        taaVar.F0 = taaVar.o2;
        taaVar.c.invalidate();
        taaVar.T0();
        gaaVar.invalidate();
    }

    @Override
    public final void f() {
        taa taaVar = this.x.w0;
        z9a z9aVar = taaVar.n1;
        if (z9aVar == null || !z9aVar.m()) {
            Typeface typeface = gl.a;
        }
        taaVar.m2 = false;
        int i = taaVar.k2;
        taaVar.l2 = i;
        taaVar.A1.setTopGlowOffset(i);
        taaVar.l1.setTranslationY(taaVar.k2);
        taaVar.L1.setTranslationY(taaVar.k2);
        taaVar.A1.setTranslationY(0.0f);
        taaVar.B1.setTranslationY(0.0f);
        taaVar.T0();
    }

    @Override
    public final void g(int i, boolean z) {
        gaa gaaVar = this.x;
        taa taaVar = gaaVar.w0;
        int i2 = taaVar.l2;
        int i3 = taaVar.k2;
        if (i2 != i3) {
            gaaVar.r0 = i2;
            gaaVar.s0 = i3;
            taaVar.m2 = true;
            taaVar.k2 = i2;
            i3 = i2;
        } else {
            gaaVar.r0 = -1;
            i2 = -1;
        }
        int i4 = gaaVar.p0;
        int i5 = gaaVar.q0;
        if (i4 != i5) {
            gaaVar.t0 = 0;
            gaaVar.u0 = 0;
            taaVar.m2 = true;
            int i6 = i4 - i5;
            if (!z) {
                gaaVar.u0 = 0 - i6;
                i2 = gaaVar.s0;
            } else {
                gaaVar.u0 = i6;
            }
            taaVar.k2 = i2;
            i3 = i2;
        } else {
            gaaVar.t0 = -1;
        }
        taaVar.A1.setTopGlowOffset((int) (taaVar.o2 + i3));
        taaVar.l1.setTranslationY(taaVar.o2 + taaVar.k2);
        taaVar.L1.setTranslationY(taaVar.o2 + taaVar.k2);
        gaaVar.invalidate();
    }
}
