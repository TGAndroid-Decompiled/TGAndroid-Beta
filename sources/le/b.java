package le;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f15431a;
    public final d f15432b;
    public final Interpolator f15433c;
    public final long d;
    public float f15434e;
    public boolean f15435f;
    public e h;

    public b(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override
    public final void V(float f7, int i10) {
        this.f15432b.V(f7, this.f15431a);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f15435f != z10 || !z11) {
            this.f15435f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f15433c, this.d, this.f15434e);
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
            float f10 = this.f15434e;
            if (f10 != f7) {
                int i10 = this.f15431a;
                d dVar = this.f15432b;
                if (f10 != f7) {
                    this.f15434e = f7;
                    dVar.a0(i10, f7, -1.0f, null);
                }
                dVar.V(f7, i10);
            }
        }
    }

    @Override
    public final void a0(int i10, float f7, float f10, e eVar) {
        if (this.f15434e != f7) {
            this.f15434e = f7;
            this.f15432b.a0(this.f15431a, f7, -1.0f, null);
        }
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3) {
        this(i10, dVar, interpolator, j3, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3, boolean z10) {
        this.f15431a = i10;
        this.f15432b = dVar;
        this.f15433c = interpolator;
        this.d = j3;
        this.f15435f = z10;
        this.f15434e = z10 ? 1.0f : 0.0f;
    }
}
