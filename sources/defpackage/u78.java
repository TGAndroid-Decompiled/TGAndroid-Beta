package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.PhotoViewer;
public final class u78 {
    public final View i;
    public boolean p;
    public final fm2 q;
    public final xb8 r;
    public final PhotoViewer s;
    public final PhotoViewer t;
    public long a = 0;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f = 0.0f;
    public final RectF g = new RectF();
    public int h = -1;
    public final int j = gl.L(64.0f);
    public int k = -2;
    public float l = 1.0f;
    public final float[] m = new float[3];
    public final float[] n = new float[3];
    public float o = 1.0f;

    public u78(PhotoViewer photoViewer, View view) {
        this.t = photoViewer;
        this.s = photoViewer;
        if (PhotoViewer.i9 == null) {
            PhotoViewer.i9 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.j9 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.j9.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.j9.setStrokeWidth(gl.L(3.0f));
            PhotoViewer.j9.setColor(-1);
        }
        this.i = view;
        int i = 0;
        while (true) {
            float[] fArr = this.n;
            if (i < fArr.length) {
                this.m[i] = 1.0f;
                fArr[i] = 1.0f;
                i++;
            } else {
                a();
                xb8 xb8Var = new xb8(28);
                this.r = xb8Var;
                xb8Var.h = 200.0f;
                this.q = new fm2(photoViewer.E.getDrawable(2131231008).mutate(), xb8Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z;
        int i = 0;
        while (true) {
            float[] fArr = this.n;
            if (i < fArr.length) {
                if (fArr[i] != 1.0f) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z != this.p) {
            this.p = z;
            PhotoViewer photoViewer = this.t;
            if (this == photoViewer.X0[0]) {
                photoViewer.B2();
            }
        }
    }

    public final int b() {
        int i;
        int i2 = gl.q.y;
        Drawable[] drawableArr = PhotoViewer.f9;
        PhotoViewer photoViewer = this.s;
        if (!photoViewer.s) {
            i = gl.m;
        } else {
            i = 0;
        }
        int i3 = (int) ((((i2 + i) - ((int) (this.j * this.o))) / 2) + 0.0f);
        if (photoViewer.d2 == 1) {
            return i3 - gl.L(38.0f);
        }
        return i3;
    }

    public final void c(Canvas canvas) {
        int i;
        Drawable drawable;
        float f = this.j;
        int i2 = (int) (this.o * f);
        int width = (this.s.f0.getWidth() - ((int) (f * this.o))) / 2;
        int b = b();
        float f2 = 1.0f;
        int i3 = 0;
        while (true) {
            float[] fArr = this.m;
            if (i3 >= fArr.length) {
                break;
            }
            if (i3 == 2) {
                f2 = gl.G.getInterpolation(fArr[i3]) * f2;
            } else {
                f2 *= fArr[i3];
            }
            i3++;
        }
        int i4 = this.k;
        Drawable drawable2 = this.q;
        if (i4 >= 0) {
            Drawable[] drawableArr = PhotoViewer.f9;
            if (i4 < drawableArr.length + 2) {
                if (i4 < drawableArr.length) {
                    drawable = drawableArr[i4];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.l * 255.0f * f2));
                    drawable.setBounds(width, b, width + i2, b + i2);
                    drawable.draw(canvas);
                }
            }
        }
        int i5 = this.h;
        if (i5 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.f9;
            if (i5 < drawableArr2.length + 2) {
                if (i5 < drawableArr2.length) {
                    drawable2 = drawableArr2[i5];
                }
                if (drawable2 != null) {
                    if (this.k != -2) {
                        drawable2.setAlpha((int) tb4.z(1.0f, this.l, 255.0f, f2));
                    } else {
                        drawable2.setAlpha((int) (f2 * 255.0f));
                    }
                    drawable2.setBounds(width, b, width + i2, b + i2);
                    drawable2.draw(canvas);
                }
            }
        }
        int i6 = this.h;
        if (i6 != 0 && i6 != 1 && (i = this.k) != 0 && i != 1) {
            g(false);
            return;
        }
        int L = gl.L(4.0f);
        if (this.k != -2) {
            PhotoViewer.j9.setAlpha((int) (this.l * 255.0f * f2));
        } else {
            PhotoViewer.j9.setAlpha((int) (f2 * 255.0f));
        }
        RectF rectF = this.g;
        rectF.set(width + L, b + L, (width + i2) - L, (b + i2) - L);
        canvas.drawArc(rectF, this.b - 90.0f, Math.max(4.0f, this.f * 360.0f), false, PhotoViewer.j9);
        g(true);
    }

    public final void d(int i, boolean z, boolean z2) {
        int i2;
        boolean z3;
        int i3 = this.h;
        if (i3 == i) {
            return;
        }
        View view = this.i;
        xb8 xb8Var = this.r;
        if (xb8Var != null) {
            if (z2 && (i3 == 3 || i3 == 4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i == 3) {
                xb8Var.a(false, z3);
            } else if (i == 4) {
                xb8Var.a(true, z3);
            }
            xb8Var.f = view;
            xb8Var.invalidateSelf();
        }
        this.a = System.currentTimeMillis();
        if (z && (i2 = this.h) != i) {
            this.k = i2;
            this.l = 1.0f;
        } else {
            this.k = -2;
        }
        this.h = i;
        PhotoViewer photoViewer = this.t;
        if (this == photoViewer.X0[0]) {
            photoViewer.B2();
        }
        view.invalidate();
    }

    public final void e(int i, float f, boolean z) {
        float[] fArr = this.n;
        if (fArr[i] != f) {
            fArr[i] = f;
            if (!z) {
                this.m[i] = f;
            }
            a();
            this.i.invalidate();
        }
    }

    public final void f(boolean z, float f) {
        if (!z) {
            this.f = f;
            this.d = f;
        } else {
            this.d = this.f;
        }
        this.c = f;
        this.e = 0L;
        this.i.invalidate();
    }

    public final void g(boolean z) {
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a;
        if (j > 18) {
            j = 18;
        }
        this.a = currentTimeMillis;
        int i = 0;
        if (z) {
            if (this.f == 1.0f && this.c == 1.0f) {
                z2 = false;
            } else {
                this.b = (((float) (360 * j)) / 3000.0f) + this.b;
                float f = this.c - this.d;
                if (Math.abs(f) > 0.0f) {
                    long j2 = this.e + j;
                    this.e = j2;
                    if (j2 >= 300) {
                        float f2 = this.c;
                        this.f = f2;
                        this.d = f2;
                        this.e = 0L;
                    } else {
                        this.f = (PhotoViewer.i9.getInterpolation(((float) j2) / 300.0f) * f) + this.d;
                    }
                }
                z2 = true;
            }
            float f3 = this.l;
            if (f3 > 0.0f && this.k != -2) {
                float f4 = f3 - (((float) j) / 200.0f);
                this.l = f4;
                if (f4 <= 0.0f) {
                    this.l = 0.0f;
                    this.k = -2;
                }
                z2 = true;
            }
        } else {
            z2 = false;
        }
        while (true) {
            float[] fArr = this.n;
            if (i >= fArr.length) {
                break;
            }
            float f5 = fArr[i];
            float[] fArr2 = this.m;
            float f6 = fArr2[i];
            if (f5 > f6) {
                fArr2[i] = ls6.z((float) j, 200.0f, f6, 1.0f);
            } else if (f5 < f6) {
                fArr2[i] = oo1.x((float) j, 200.0f, f6, 0.0f);
            } else {
                i++;
            }
            z2 = true;
            i++;
        }
        if (z2) {
            this.i.postInvalidateOnAnimation();
        }
    }
}
