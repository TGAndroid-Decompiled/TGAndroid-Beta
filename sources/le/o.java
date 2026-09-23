package le;

import android.graphics.RectF;
public final class o {
    public final RectF e = new RectF();
    public final n f13989a = new n(0.0f);
    public final n f13990b = new n(0.0f);
    public final n f13991c = new n(0.0f);
    public final n d = new n(0.0f);

    public final boolean a(float f7) {
        boolean z10;
        boolean z11;
        boolean a2 = this.f13989a.a(f7);
        if (!this.f13990b.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f13991c.a(f7) && !z10) {
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
        if (!this.f13989a.b(f7) && !this.f13990b.b(f10) && !this.f13991c.b(f11) && !this.d.b(f12)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z10) {
        this.f13989a.c(z10);
        this.f13990b.c(z10);
        this.f13991c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.f13989a.d(f7);
        this.f13990b.d(f10);
        this.f13991c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.f13989a.f13988c = f7;
        this.f13990b.f13988c = f10;
        this.f13991c.f13988c = f11;
        this.d.f13988c = f12;
    }
}
