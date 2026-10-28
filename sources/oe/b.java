package oe;

import android.view.View;
import android.view.animation.Interpolator;
public final class b implements d {
    public final int f19323a;
    public final d f19324b;
    public final Interpolator f19325c;
    public final long d;
    public float e;
    public boolean f19326f;
    public e h;

    public b(View view, Interpolator interpolator, long j10) {
        this(0, new a(view), interpolator, j10, false);
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        if (this.e != f7) {
            this.e = f7;
            this.f19324b.E(this.f19323a, f7, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        b bVar;
        if (this.f19326f != z10 || !z11) {
            this.f19326f = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11) {
                if (this.h == null) {
                    bVar = this;
                    bVar.h = new e(0, bVar, this.f19325c, this.d, this.e);
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
                int i11 = this.f19323a;
                d dVar = this.f19324b;
                if (i10 != 0) {
                    this.e = f7;
                    dVar.E(i11, f7, -1.0f, null);
                }
                dVar.z(f7, i11);
            }
        }
    }

    @Override
    public final void z(float f7, int i10) {
        this.f19324b.z(f7, this.f19323a);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j10) {
        this(i10, dVar, interpolator, j10, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j10, boolean z10) {
        this.f19323a = i10;
        this.f19324b = dVar;
        this.f19325c = interpolator;
        this.d = j10;
        this.f19326f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
