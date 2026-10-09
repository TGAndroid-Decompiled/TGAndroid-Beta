package me;

import android.graphics.RectF;
public final class n {
    public final RectF f16371e = new RectF();
    public final m f16368a = new m(0.0f);
    public final m f16369b = new m(0.0f);
    public final m f16370c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f16368a.a(f7);
        if (!this.f16369b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f16370c.a(f7) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.d.a(f7) || z11) {
            return true;
        }
        return false;
    }

    public final boolean b(float f7, float f10, float f11, float f12) {
        if (!this.f16368a.b(f7) && !this.f16369b.b(f10) && !this.f16370c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f16368a.c(z10);
        this.f16369b.c(z10);
        this.f16370c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f16368a.d(f7);
        this.f16369b.d(f10);
        this.f16370c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f16368a.f16367c = f7;
        this.f16369b.f16367c = f10;
        this.f16370c.f16367c = f11;
        this.d.f16367c = f12;
    }
}
