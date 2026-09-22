package le;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f13970a;
    public final d f13971b;
    public final Interpolator f13972c;
    public final long d;
    public float e;
    public boolean f13973f;
    public e h;

    public b(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override
    public final void C(float f7, int i10) {
        this.f13971b.C(f7, this.f13970a);
    }

    @Override
    public final void D(int i10, float f7, float f10, e eVar) {
        if (this.e != f7) {
            this.e = f7;
            this.f13971b.D(this.f13970a, f7, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f13973f != z10 || !z11) {
            this.f13973f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f13972c, this.d, this.e);
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
            float f10 = this.e;
            if (f10 != f7) {
                int i10 = this.f13970a;
                d dVar = this.f13971b;
                if (f10 != f7) {
                    this.e = f7;
                    dVar.D(i10, f7, -1.0f, null);
                }
                dVar.C(f7, i10);
            }
        }
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3) {
        this(i10, dVar, interpolator, j3, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3, boolean z10) {
        this.f13970a = i10;
        this.f13971b = dVar;
        this.f13972c = interpolator;
        this.d = j3;
        this.f13973f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
