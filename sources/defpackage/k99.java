package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class k99 extends Drawable {
    public final ck3 e;
    public final ck3 f;
    public float h;
    public float i;
    public final Rect a = new Rect();
    public final d53 b = vt3.b;
    public final int c = gm.L(24.0f);
    public final int d = gm.L(24.0f);
    public long g = -1;

    public k99() {
        ck3 ck3Var = new ck3((byte) 2);
        this.e = ck3Var;
        ck3Var.b.setColor(-2130706433);
        ck3 ck3Var2 = new ck3((byte) 2);
        this.f = ck3Var2;
        ck3Var2.b.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        Rect rect = this.a;
        rect.left = (int) (gm.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (gm.L(6.0f) * this.i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (gm.L(4.0f) * this.i));
        ck3 ck3Var = this.f;
        ck3Var.setBounds(rect);
        ck3Var.draw(canvas);
        int L2 = gm.L(12.0f);
        rect.right = L2;
        rect.left = L2;
        int L3 = gm.L(8.0f);
        rect.bottom = L3;
        rect.top = L3;
        rect.inset(-gm.L(gm.U1(interpolation, 10, 11)), -gm.L(gm.U1(interpolation, 2, 3)));
        ck3 ck3Var2 = this.e;
        ck3Var2.setBounds(rect);
        ck3Var2.setAlpha(gm.U1(interpolation, 128, 255));
        ck3Var2.draw(canvas);
    }

    public final void b(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        Rect rect = this.a;
        rect.left = (int) (gm.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (gm.L(6.0f) * this.i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (gm.L(4.0f) * this.i));
        rect.offset(0, gm.L(gm.U1(interpolation, 0, -8)));
        ck3 ck3Var = this.f;
        ck3Var.setBounds(rect);
        ck3Var.draw(canvas);
        rect.left = (int) (gm.N(gm.U1(interpolation, 1, 2)) * this.h);
        int N = (int) (gm.N(gm.U1(interpolation, 5, 6)) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (gm.N(gm.U1(interpolation, 6, 4)) * this.i));
        rect.offset(0, gm.L(gm.U1(interpolation, 0, 8)));
        ck3 ck3Var2 = this.e;
        ck3Var2.setBounds(rect);
        ck3Var2.setAlpha(255);
        ck3Var2.draw(canvas);
    }

    public final void c(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        Rect rect = this.a;
        rect.left = (int) (gm.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (gm.L(6.0f) * this.i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (gm.L(4.0f) * this.i));
        rect.offset(0, gm.L(-8.0f));
        ck3 ck3Var = this.f;
        ck3Var.setBounds(rect);
        ck3Var.draw(canvas);
        rect.left = (int) (gm.N(2.0f) * this.h);
        int N = (int) (gm.N(6.0f) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (gm.N(4.0f) * this.i));
        rect.offset(0, gm.L(8.0f));
        ck3 ck3Var2 = this.e;
        ck3Var2.setBounds(rect);
        ck3Var2.setAlpha(gm.U1(interpolation, 255, 128));
        ck3Var2.draw(canvas);
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
