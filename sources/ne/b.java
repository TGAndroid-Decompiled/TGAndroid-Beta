package ne;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f17383a;
    public final d f17384b;
    public final Interpolator f17385c;
    public final long d;
    public float e;
    public boolean f17386f;
    public e h;

    public b(View view, Interpolator interpolator, long j10) {
        this(0, new a(view), interpolator, j10, false);
    }

    @Override
    public final void H(float f7, int i10) {
        this.f17384b.H(f7, this.f17383a);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f17386f != z10 || !z11) {
            this.f17386f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f17385c, this.d, this.e);
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
                int i11 = this.f17383a;
                d dVar = this.f17384b;
                if (i10 != 0) {
                    this.e = f7;
                    dVar.r(i11, f7, -1.0f, null);
                }
                dVar.H(f7, i11);
            }
        }
    }

    @Override
    public final void r(int i10, float f7, float f10, e eVar) {
        if (this.e != f7) {
            this.e = f7;
            this.f17384b.r(this.f17383a, f7, -1.0f, null);
        }
    }

    public b(int i10, d dVar, Interpolator interpolator, long j10) {
        this(i10, dVar, interpolator, j10, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j10, boolean z10) {
        this.f17383a = i10;
        this.f17384b = dVar;
        this.f17385c = interpolator;
        this.d = j10;
        this.f17386f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
