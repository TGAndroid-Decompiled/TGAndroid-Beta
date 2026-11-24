package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class x95 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final fk0 f;
    public final fk0 g;
    public boolean h;
    public byte i;
    public float d = 0.0f;
    public float j = 0.0f;

    public x95(int i, int i2) {
        fk0 fk0Var = new fk0(6);
        this.f = fk0Var;
        fk0 fk0Var2 = new fk0(8);
        this.g = fk0Var2;
        float f = i;
        fk0Var.a = f;
        float f2 = i2;
        fk0Var.b = f2;
        fk0Var2.a = f;
        fk0Var2.b = f2;
        fk0Var.b();
        fk0Var2.b();
        int i3 = bkb.gh;
        fk0Var.d.setColor(bm2.o(bkb.w0(null, i3, false), 38));
        fk0Var2.d.setColor(bm2.o(bkb.w0(null, i3, false), 38));
    }

    public final void a(Canvas canvas, float f, float f2, View view) {
        int i;
        fk0 fk0Var = this.f;
        Paint paint = fk0Var.d;
        if (e66.e(512)) {
            float f3 = (this.a * 0.4f) + 0.8f;
            if (this.e || this.d != 0.0f) {
                canvas.save();
                float interpolation = s33.f.getInterpolation(this.d) * f3;
                canvas.scale(interpolation, interpolation, f, f2);
                if (!this.h) {
                    byte b = this.i;
                    float f4 = this.j;
                    if (b != 1) {
                        if (f4 != 1.0f) {
                            float f5 = f4 + 0.10666667f;
                            this.j = f5;
                            if (f5 > 1.0f) {
                                this.j = 1.0f;
                            }
                        }
                    } else if (f4 != 0.0f) {
                        float f6 = f4 - 0.10666667f;
                        this.j = f6;
                        if (f6 < 0.0f) {
                            this.j = 0.0f;
                        }
                    }
                    int w0 = bkb.w0(null, bkb.gh, false);
                    if (this.i == 2) {
                        i = bkb.ih;
                    } else {
                        i = bkb.fh;
                    }
                    paint.setColor(bm2.o(bm2.f(this.j, w0, bkb.w0(null, i, false)), 38));
                }
                fk0Var.e(this.a, 1.0f);
                fk0Var.a(f, f2, canvas, paint);
                float f7 = this.a;
                fk0 fk0Var2 = this.g;
                fk0Var2.e(f7, 1.0f);
                fk0Var2.a(f, f2, canvas, paint);
                canvas.restore();
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final float b() {
        float interpolation = s33.g.getInterpolation(this.d);
        return tb4.A(1.0f, interpolation, 1.0f, ((this.a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
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

    public final void d(int i) {
        this.h = true;
        this.f.d.setColor(i);
    }

    public final void e(View view, boolean z) {
        if (this.e != z) {
            view.invalidate();
        }
        this.e = z;
    }

    public final void f() {
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
        float f5 = this.d;
        if (z) {
            if (f5 != 1.0f) {
                float f6 = f5 + 0.045714285f;
                this.d = f6;
                if (f6 > 1.0f) {
                    this.d = 1.0f;
                }
            }
        } else if (f5 != 0.0f) {
            float f7 = f5 - 0.045714285f;
            this.d = f7;
            if (f7 < 0.0f) {
                this.d = 0.0f;
            }
        }
    }
}
