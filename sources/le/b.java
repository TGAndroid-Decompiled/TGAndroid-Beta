package le;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f12867a;
    public final d f12868b;
    public final Interpolator f12869c;
    public final long d;
    public float e;
    public boolean f12870f;
    public e h;

    public b(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override
    public final void B(float f7, int i10) {
        this.f12868b.B(f7, this.f12867a);
    }

    @Override
    public final void G(int i10, float f7, float f10, e eVar) {
        if (this.e != f7) {
            this.e = f7;
            this.f12868b.G(this.f12867a, f7, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f12870f != z10 || !z11) {
            this.f12870f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f12869c, this.d, this.e);
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
                int i10 = this.f12867a;
                d dVar = this.f12868b;
                if (f10 != f7) {
                    this.e = f7;
                    dVar.G(i10, f7, -1.0f, null);
                }
                dVar.B(f7, i10);
            }
        }
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3) {
        this(i10, dVar, interpolator, j3, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3, boolean z10) {
        this.f12867a = i10;
        this.f12868b = dVar;
        this.f12869c = interpolator;
        this.d = j3;
        this.f12870f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
