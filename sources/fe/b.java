package fe;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements e {
    public final int f7018a;
    public final e f7019b;
    public final Interpolator f7020c;
    public final long d;
    public float e;
    public boolean f7021f;
    public f h;

    public b(View view, Interpolator interpolator, long j10) {
        this(0, new a(view), interpolator, j10, false);
    }

    @Override
    public final void E(float f7, int i10) {
        this.f7019b.E(f7, this.f7018a);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f7021f != z10 || !z11) {
            this.f7021f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new f(0, bVar, this.f7020c, this.d, this.e);
                } else {
                    bVar = this;
                }
                bVar.h.a(f7);
                return;
            }
            f fVar = this.h;
            if (fVar != null) {
                fVar.c(f7);
            }
            float f10 = this.e;
            if (f10 != f7) {
                int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
                int i11 = this.f7018a;
                e eVar = this.f7019b;
                if (i10 != 0) {
                    this.e = f7;
                    eVar.v(i11, f7, -1.0f, null);
                }
                eVar.E(f7, i11);
            }
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, f fVar) {
        if (this.e != f7) {
            this.e = f7;
            this.f7019b.v(this.f7018a, f7, -1.0f, null);
        }
    }

    public b(int i10, e eVar, Interpolator interpolator, long j10) {
        this(i10, eVar, interpolator, j10, false);
    }

    public b(int i10, e eVar, Interpolator interpolator, long j10, boolean z10) {
        this.f7018a = i10;
        this.f7019b = eVar;
        this.f7020c = interpolator;
        this.d = j10;
        this.f7021f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
