package me;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f16398a;
    public final d f16399b;
    public final Interpolator f16400c;
    public final long d;
    public float f16401e;
    public boolean f16402f;
    public e h;

    public b(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override
    public final void A(float f7, int i10) {
        this.f16399b.A(f7, this.f16398a);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f16402f != z10 || !z11) {
            this.f16402f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f16400c, this.d, this.f16401e);
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
            float f10 = this.f16401e;
            if (f10 != f7) {
                int i10 = (f10 > f7 ? 1 : (f10 == f7 ? 0 : -1));
                int i11 = this.f16398a;
                d dVar = this.f16399b;
                if (i10 != 0) {
                    this.f16401e = f7;
                    dVar.n(i11, f7, -1.0f, null);
                }
                dVar.A(f7, i11);
            }
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
        if (this.f16401e != f7) {
            this.f16401e = f7;
            this.f16399b.n(this.f16398a, f7, -1.0f, null);
        }
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3) {
        this(i10, dVar, interpolator, j3, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3, boolean z10) {
        this.f16398a = i10;
        this.f16399b = dVar;
        this.f16400c = interpolator;
        this.d = j3;
        this.f16402f = z10;
        this.f16401e = z10 ? 1.0f : 0.0f;
    }
}
