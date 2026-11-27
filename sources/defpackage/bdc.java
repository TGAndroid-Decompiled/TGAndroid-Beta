package defpackage;

import android.graphics.RectF;
public final class bdc {
    public final RectF e = new RectF();
    public final adc a = new adc(0.0f);
    public final adc b = new adc(0.0f);
    public final adc c = new adc(0.0f);
    public final adc d = new adc(0.0f);

    public final boolean a(float f) {
        boolean z;
        boolean z2;
        boolean a = this.a.a(f);
        if (!this.b.a(f) && !a) {
            z = false;
        } else {
            z = true;
        }
        if (!this.c.a(f) && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.d.a(f) || z2) {
            return true;
        }
        return false;
    }

    public final boolean b(float f, float f2, float f3, float f4) {
        if (!this.a.b(f) && !this.b.b(f2) && !this.c.b(f3) && !this.d.b(f4)) {
            return false;
        }
        return true;
    }

    public final void c(boolean z) {
        this.a.c(z);
        this.b.c(z);
        this.c.c(z);
        this.d.c(z);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.a.d(f);
        this.b.d(f2);
        this.c.d(f3);
        this.d.d(f4);
    }

    public final void e(float f, float f2, float f3, float f4) {
        this.a.c = f;
        this.b.c = f2;
        this.c.c = f3;
        this.d.c = f4;
    }
}
