package le;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f15392a;
    public final d f15393b;
    public final Interpolator f15394c;
    public final long d;
    public float f15395e;
    public boolean f15396f;
    public e h;

    public b(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        if (this.f15395e != f7) {
            this.f15395e = f7;
            this.f15393b.E(this.f15392a, f7, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f15396f != z10 || !z11) {
            this.f15396f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f15394c, this.d, this.f15395e);
                } else {
                    bVar = this;
                }
                bVar.h.a(f7);
                return;
            }
            e eVar = this.h;
            if (eVar != null) {
                eVar.c(f7);
            }
            float f10 = this.f15395e;
            if (f10 != f7) {
                int i10 = this.f15392a;
                d dVar = this.f15393b;
                if (f10 != f7) {
                    this.f15395e = f7;
                    dVar.E(i10, f7, -1.0f, null);
                }
                dVar.z(f7, i10);
            }
        }
    }

    @Override
    public final void z(float f7, int i10) {
        this.f15393b.z(f7, this.f15392a);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3) {
        this(i10, dVar, interpolator, j3, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3, boolean z10) {
        this.f15392a = i10;
        this.f15393b = dVar;
        this.f15394c = interpolator;
        this.d = j3;
        this.f15396f = z10;
        this.f15395e = z10 ? 1.0f : 0.0f;
    }
}
