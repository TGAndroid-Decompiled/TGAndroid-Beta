package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class vb5 {
    public float a;
    public float b;
    public float c;
    public boolean e;
    public final fl0 f;
    public final fl0 g;
    public boolean h;
    public byte i;
    public float d = 0.0f;
    public float j = 0.0f;

    public vb5(int i, int i2) {
        fl0 fl0Var = new fl0(6);
        this.f = fl0Var;
        fl0 fl0Var2 = new fl0(8);
        this.g = fl0Var2;
        float f = i;
        fl0Var.a = f;
        float f2 = i2;
        fl0Var.b = f2;
        fl0Var2.a = f;
        fl0Var2.b = f2;
        fl0Var.b();
        fl0Var2.b();
        int i3 = cmb.gh;
        fl0Var.d.setColor(on2.p(cmb.w0(null, i3, false), 38));
        fl0Var2.d.setColor(on2.p(cmb.w0(null, i3, false), 38));
    }

    public final void a(Canvas canvas, float f, float f2, View view) {
        int i;
        fl0 fl0Var = this.f;
        Paint paint = fl0Var.d;
        if (e86.e(512)) {
            float f3 = (this.a * 0.4f) + 0.8f;
            if (this.e || this.d != 0.0f) {
                canvas.save();
                float interpolation = d53.f.getInterpolation(this.d) * f3;
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
                    int w0 = cmb.w0(null, cmb.gh, false);
                    if (this.i == 2) {
                        i = cmb.ih;
                    } else {
                        i = cmb.fh;
                    }
                    paint.setColor(on2.p(on2.f(this.j, w0, cmb.w0(null, i, false)), 38));
                }
                fl0Var.e(this.a, 1.0f);
                fl0Var.a(f, f2, canvas, paint);
                float f7 = this.a;
                fl0 fl0Var2 = this.g;
                fl0Var2.e(f7, 1.0f);
                fl0Var2.a(f, f2, canvas, paint);
                canvas.restore();
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final float b() {
        float interpolation = d53.g.getInterpolation(this.d);
        return td4.A(1.0f, interpolation, 1.0f, ((this.a * 0.2f) + 0.9f) * interpolation);
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
