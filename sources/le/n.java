package le;

import android.graphics.RectF;
public final class n {
    public final RectF e = new RectF();
    public final m f12896a = new m(0.0f);
    public final m f12897b = new m(0.0f);
    public final m f12898c = new m(0.0f);
    public final m d = new m(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f12896a.a(f7);
        if (!this.f12897b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f12898c.a(f7) && !z10) {
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
        if (!this.f12896a.b(f7) && !this.f12897b.b(f10) && !this.f12898c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f12896a.c(z10);
        this.f12897b.c(z10);
        this.f12898c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f12896a.d(f7);
        this.f12897b.d(f10);
        this.f12898c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f12896a.f12895c = f7;
        this.f12897b.f12895c = f10;
        this.f12898c.f12895c = f11;
        this.d.f12895c = f12;
    }
}
