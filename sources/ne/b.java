package ne;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f16290a;
    public final d f16291b;
    public final Interpolator f16292c;
    public final long d;
    public float e;
    public boolean f16293f;
    public e h;

    public b(View view, Interpolator interpolator, long j10) {
        this(0, new a(view), interpolator, j10, false);
    }

    @Override
    public final void C(float f7, int i10) {
        this.f16291b.C(f7, this.f16290a);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f16293f != z10 || !z11) {
            this.f16293f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f16292c, this.d, this.e);
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
                int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
                int i11 = this.f16290a;
                d dVar = this.f16291b;
                if (i10 != 0) {
                    this.e = f7;
                    dVar.p(i11, f7, -1.0f, null);
                }
                dVar.C(f7, i11);
            }
        }
    }

    @Override
    public final void p(int i10, float f7, float f10, e eVar) {
        if (this.e != f7) {
            this.e = f7;
            this.f16291b.p(this.f16290a, f7, -1.0f, null);
        }
    }

    public b(int i10, d dVar, Interpolator interpolator, long j10) {
        this(i10, dVar, interpolator, j10, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j10, boolean z10) {
        this.f16290a = i10;
        this.f16291b = dVar;
        this.f16292c = interpolator;
        this.d = j10;
        this.f16293f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
