package defpackage;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
public final class b46 extends pw2 {
    public static CornerPathEffect w;
    public static int x;
    public Layout h;
    public int i;
    public float j;
    public float k;
    public float l;
    public final boolean m;
    public boolean n;
    public int o;
    public int p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;

    public b46(int i) {
        this.j = -1.0f;
        this.n = true;
        this.s = Float.MAX_VALUE;
        this.u = Float.MAX_VALUE;
        this.m = true;
        this.c = false;
    }

    public static CornerPathEffect c() {
        if (w == null || x != gl.L(5.0f)) {
            int L = gl.L(5.0f);
            x = L;
            w = new CornerPathEffect(L);
        }
        return w;
    }

    @Override
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f, f2, f3, f4, direction);
            return;
        }
        try {
            float f5 = this.l;
            float f6 = f2 + f5;
            float f7 = f4 + f5;
            float f8 = this.j;
            if (f8 == -1.0f) {
                this.j = f6;
            } else if (f8 != f6) {
                this.j = f6;
                this.i++;
            }
            float lineRight = layout.getLineRight(this.i);
            float lineLeft = this.h.getLineLeft(this.i);
            if (f < lineRight) {
                int i = (f > lineLeft ? 1 : (f == lineLeft ? 0 : -1));
                if (i > 0 || f3 > lineLeft) {
                    if (f3 > lineRight) {
                        f3 = lineRight;
                    }
                    if (i < 0) {
                        f = lineLeft;
                    }
                    float f9 = this.k;
                    float f10 = f + f9;
                    float f11 = f3 + f9;
                    float f12 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f7 - f6 > this.p) {
                            float f13 = this.l;
                            if (f7 != this.h.getHeight()) {
                                f12 = this.h.getLineBottom(this.i) - this.h.getSpacingAdd();
                            }
                            f7 = f13 + f12;
                        }
                    } else {
                        if (f7 != this.h.getHeight()) {
                            f12 = this.h.getSpacingAdd();
                        }
                        f7 -= f12;
                    }
                    int i2 = this.o;
                    if (i2 < 0) {
                        f7 += i2;
                    } else if (i2 > 0) {
                        f6 += i2;
                    }
                    if (this.m) {
                        f(f10 - (gl.L(5.0f) / 2.0f), f6, f11 + (gl.L(5.0f) / 2.0f), f7, direction);
                    } else {
                        f(f10, f6, f11, f7, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i, float f) {
        e(layout, i, 0.0f, f);
    }

    public final void e(Layout layout, int i, float f, float f2) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.i = 0;
            this.j = -1.0f;
            this.k = f;
            this.l = f2;
            return;
        }
        this.h = layout;
        this.i = layout.getLineForOffset(i);
        this.j = -1.0f;
        this.k = f;
        this.l = f2;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i2 = lineCount - 1;
            this.p = layout.getLineBottom(i2) - layout.getLineTop(i2);
        }
    }

    public final void f(float f, float f2, float f3, float f4, Path.Direction direction) {
        float f5 = this.r;
        float f6 = f - f5;
        float f7 = this.q;
        float f8 = f2 - f7;
        float f9 = f3 + f5;
        float f10 = f4 + f7;
        this.s = Math.min(this.s, Math.min(f6, f9));
        this.u = Math.min(this.u, Math.min(f8, f10));
        this.t = Math.max(this.t, Math.max(f6, f9));
        this.v = Math.max(this.v, Math.max(f8, f10));
        super.addRect(f6, f8, f9, f10, direction);
    }

    @Override
    public final void reset() {
        if (!this.n) {
            return;
        }
        super.reset();
    }

    public b46() {
        this.j = -1.0f;
        this.n = true;
        this.s = Float.MAX_VALUE;
        this.u = Float.MAX_VALUE;
        this.c = false;
    }
}
