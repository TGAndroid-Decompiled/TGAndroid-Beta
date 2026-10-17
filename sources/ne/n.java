package ne;

import android.graphics.RectF;
public final class n {
    public final RectF e = new RectF();
    public final m f17406a = new m(0.0f);
    public final m f17407b = new m(0.0f);
    public final m f17408c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f17406a.a(f7);
        if (!this.f17407b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f17408c.a(f7) && !z10) {
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
        if (!this.f17406a.b(f7) && !this.f17407b.b(f10) && !this.f17408c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f17406a.c(z10);
        this.f17407b.c(z10);
        this.f17408c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f17406a.d(f7);
        this.f17407b.d(f10);
        this.f17408c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f17406a.f17405c = f7;
        this.f17407b.f17405c = f10;
        this.f17408c.f17405c = f11;
        this.d.f17405c = f12;
    }
}
