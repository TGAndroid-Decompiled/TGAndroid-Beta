package me;

import android.graphics.RectF;
public final class n {
    public final RectF f16375e = new RectF();
    public final m f16372a = new m(0.0f);
    public final m f16373b = new m(0.0f);
    public final m f16374c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f16372a.a(f7);
        if (!this.f16373b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f16374c.a(f7) && !z10) {
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
        if (!this.f16372a.b(f7) && !this.f16373b.b(f10) && !this.f16374c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f16372a.c(z10);
        this.f16373b.c(z10);
        this.f16374c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f16372a.d(f7);
        this.f16373b.d(f10);
        this.f16374c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f16372a.f16371c = f7;
        this.f16373b.f16371c = f10;
        this.f16374c.f16371c = f11;
        this.d.f16371c = f12;
    }
}
