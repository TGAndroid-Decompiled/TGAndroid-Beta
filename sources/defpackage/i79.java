package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class i79 extends Drawable {
    public final si3 e;
    public final si3 f;
    public float h;
    public float i;
    public final Rect a = new Rect();
    public final s33 b = ls3.b;
    public final int c = gl.L(24.0f);
    public final int d = gl.L(24.0f);
    public long g = -1;

    public i79() {
        si3 si3Var = new si3((byte) 2);
        this.e = si3Var;
        si3Var.b.setColor(-2130706433);
        si3 si3Var2 = new si3((byte) 2);
        this.f = si3Var2;
        si3Var2.b.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        Rect rect = this.a;
        rect.left = (int) (gl.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (gl.L(6.0f) * this.i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (gl.L(4.0f) * this.i));
        si3 si3Var = this.f;
        si3Var.setBounds(rect);
        si3Var.draw(canvas);
        int L2 = gl.L(12.0f);
        rect.right = L2;
        rect.left = L2;
        int L3 = gl.L(8.0f);
        rect.bottom = L3;
        rect.top = L3;
        rect.inset(-gl.L(gl.U1(interpolation, 10, 11)), -gl.L(gl.U1(interpolation, 2, 3)));
        si3 si3Var2 = this.e;
        si3Var2.setBounds(rect);
        si3Var2.setAlpha(gl.U1(interpolation, 128, 255));
        si3Var2.draw(canvas);
    }

    public final void b(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        Rect rect = this.a;
        rect.left = (int) (gl.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (gl.L(6.0f) * this.i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (gl.L(4.0f) * this.i));
        rect.offset(0, gl.L(gl.U1(interpolation, 0, -8)));
        si3 si3Var = this.f;
        si3Var.setBounds(rect);
        si3Var.draw(canvas);
        rect.left = (int) (gl.N(gl.U1(interpolation, 1, 2)) * this.h);
        int N = (int) (gl.N(gl.U1(interpolation, 5, 6)) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (gl.N(gl.U1(interpolation, 6, 4)) * this.i));
        rect.offset(0, gl.L(gl.U1(interpolation, 0, 8)));
        si3 si3Var2 = this.e;
        si3Var2.setBounds(rect);
        si3Var2.setAlpha(255);
        si3Var2.draw(canvas);
    }

    public final void c(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        Rect rect = this.a;
        rect.left = (int) (gl.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (gl.L(6.0f) * this.i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (gl.L(4.0f) * this.i));
        rect.offset(0, gl.L(-8.0f));
        si3 si3Var = this.f;
        si3Var.setBounds(rect);
        si3Var.draw(canvas);
        rect.left = (int) (gl.N(2.0f) * this.h);
        int N = (int) (gl.N(6.0f) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (gl.N(4.0f) * this.i));
        rect.offset(0, gl.L(8.0f));
        si3 si3Var2 = this.e;
        si3Var2.setBounds(rect);
        si3Var2.setAlpha(gl.U1(interpolation, 255, 128));
        si3Var2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.g > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.g);
            int i = currentTimeMillis - 300;
            if (i >= 0) {
                if (i < 150) {
                    a(canvas, i / 150.0f);
                } else {
                    int i2 = currentTimeMillis - 750;
                    if (i2 >= 0) {
                        if (i2 < 200) {
                            b(canvas, i2 / 200.0f);
                        } else {
                            int i3 = currentTimeMillis - 1250;
                            if (i3 >= 0) {
                                if (i3 < 150) {
                                    c(canvas, i3 / 150.0f);
                                } else {
                                    c(canvas, 1.0f);
                                    if (currentTimeMillis - 1400 >= 100) {
                                        this.g = System.currentTimeMillis();
                                    }
                                }
                            } else {
                                b(canvas, 1.0f);
                            }
                        }
                    } else {
                        a(canvas, 1.0f);
                    }
                }
            } else {
                a(canvas, 0.0f);
            }
            invalidateSelf();
            return;
        }
        a(canvas, 0.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.c;
        this.i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i) {
    }
}
