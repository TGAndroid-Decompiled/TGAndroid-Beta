package me;

import android.graphics.RectF;
public final class n {
    public final RectF f16399e = new RectF();
    public final m f16396a = new m(0.0f);
    public final m f16397b = new m(0.0f);
    public final m f16398c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f16396a.a(f7);
        if (!this.f16397b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f16398c.a(f7) && !z10) {
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
        if (!this.f16396a.b(f7) && !this.f16397b.b(f10) && !this.f16398c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f16396a.c(z10);
        this.f16397b.c(z10);
        this.f16398c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f16396a.d(f7);
        this.f16397b.d(f10);
        this.f16398c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f16396a.f16395c = f7;
        this.f16397b.f16395c = f10;
        this.f16398c.f16395c = f11;
        this.d.f16395c = f12;
    }
}
