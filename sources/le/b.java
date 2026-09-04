package le;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f15365a;
    public final d f15366b;
    public final Interpolator f15367c;
    public final long d;
    public float f15368e;
    public boolean f15369f;
    public e h;

    public b(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        if (this.f15368e != f7) {
            this.f15368e = f7;
            this.f15366b.E(this.f15365a, f7, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f15369f != z10 || !z11) {
            this.f15369f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f15367c, this.d, this.f15368e);
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
            float f10 = this.f15368e;
            if (f10 != f7) {
                int i10 = this.f15365a;
                d dVar = this.f15366b;
                if (f10 != f7) {
                    this.f15368e = f7;
                    dVar.E(i10, f7, -1.0f, null);
                }
                dVar.z(f7, i10);
            }
        }
    }

    @Override
    public final void z(float f7, int i10) {
        this.f15366b.z(f7, this.f15365a);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3) {
        this(i10, dVar, interpolator, j3, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3, boolean z10) {
        this.f15365a = i10;
        this.f15366b = dVar;
        this.f15367c = interpolator;
        this.d = j3;
        this.f15369f = z10;
        this.f15368e = z10 ? 1.0f : 0.0f;
    }
}
