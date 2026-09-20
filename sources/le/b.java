package le;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f14167a;
    public final d f14168b;
    public final Interpolator f14169c;
    public final long d;
    public float e;
    public boolean f14170f;
    public e h;

    public b(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override
    public final void C(float f7, int i10) {
        this.f14168b.C(f7, this.f14167a);
    }

    @Override
    public final void D(int i10, float f7, float f10, e eVar) {
        if (this.e != f7) {
            this.e = f7;
            this.f14168b.D(this.f14167a, f7, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f14170f != z10 || !z11) {
            this.f14170f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f14169c, this.d, this.e);
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
                int i10 = this.f14167a;
                d dVar = this.f14168b;
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
        this.f14167a = i10;
        this.f14168b = dVar;
        this.f14169c = interpolator;
        this.d = j3;
        this.f14170f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
