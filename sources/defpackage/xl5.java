package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class xl5 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final pjc f;
    public final pjc g;
    public ValueAnimator j;
    public int k;
    public float d = 0.0f;
    public boolean h = false;
    public float i = 1.0f;

    public xl5(int i, int i2, int i3, int i4) {
        ?? fk0Var = new fk0(i4 - 1);
        this.f = fk0Var;
        ?? fk0Var2 = new fk0(i4);
        this.g = fk0Var2;
        fk0Var.a = i;
        fk0Var.b = i2;
        fk0Var2.a = i - i3;
        fk0Var2.b = i2 - i3;
        fk0Var.b();
        fk0Var2.b();
        fk0Var.d.setColor(-1);
        fk0Var.d.setAlpha(20);
        fk0Var2.d.setColor(-1);
        fk0Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f, float f2, View view) {
        pjc pjcVar = this.f;
        Paint paint = pjcVar.d;
        float f3 = (this.a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = s33.f.getInterpolation(this.d) * f3;
            canvas.scale(interpolation, interpolation, f, f2);
            pjcVar.g(this.a, this.i);
            pjcVar.a(f, f2, canvas, paint);
            float f4 = this.a;
            float f5 = this.i;
            pjc pjcVar2 = this.g;
            pjcVar2.g(f4, f5);
            pjcVar2.a(f, f2, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.k != 0) {
            int i = this.k;
            if (i != 0) {
                this.k = i - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f = ((float) d) / 80.0f;
        float f2 = 0.0f;
        if (!this.e) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f2 = 1.0f;
        } else if (f >= 0.0f) {
            f2 = f;
        }
        this.b = f2;
        this.c = (f2 - this.a) / 200.0f;
    }

    public final void c() {
        float f = this.b;
        float f2 = this.a;
        if (f != f2) {
            float f3 = this.c;
            float f4 = (16.0f * f3) + f2;
            this.a = f4;
            if (f3 > 0.0f) {
                if (f4 > f) {
                    this.a = f;
                }
            } else if (f4 < f) {
                this.a = f;
            }
        }
        boolean z = this.e;
        if (z) {
            float f5 = this.d;
            if (f5 != 1.0f) {
                float f6 = f5 + 0.045714285f;
                this.d = f6;
                if (f6 > 1.0f) {
                    this.d = 1.0f;
                    return;
                }
                return;
            }
        }
        if (!z) {
            float f7 = this.d;
            if (f7 != 0.0f) {
                float f8 = f7 - 0.045714285f;
                this.d = f8;
                if (f8 < 0.0f) {
                    this.d = 0.0f;
                }
            }
        }
    }
}
