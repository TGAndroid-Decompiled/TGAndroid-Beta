package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class mu9 extends Drawable {
    public final Paint b;
    public boolean f;
    public byte j;
    public boolean m;
    public sr6 o;
    public float p;
    public float q;
    public float r;
    public int a = 255;
    public final Path c = new Path();
    public final RectF d = new RectF();
    public long e = -1;
    public float g = 0.0f;
    public float h = 0.0f;
    public final float[] i = new float[2];
    public byte k = 0;
    public boolean l = false;
    public final ln n = new ln(1.0f, new kf9(this, (byte) 19), 0, 350, d53.h);

    public mu9() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gm.L(1.333f));
    }

    public final void a(int i) {
        Paint paint = this.b;
        paint.setColor(i);
        this.a = paint.getAlpha();
        paint.setAlpha(255);
    }

    public final void b(int i) {
        c(i, true, false);
    }

    public final void c(int i, boolean z, boolean z2) {
        if (this.k == i) {
            if (i != 2) {
                gm.r(this.o);
                this.o = null;
            }
        } else if (!z2 && i == 2) {
            if (this.o == null) {
                sr6 sr6Var = new sr6(this, i, z);
                this.o = sr6Var;
                gm.d3(sr6Var, 65L);
            }
        } else {
            sr6 sr6Var2 = this.o;
            if (sr6Var2 != null) {
                gm.r(sr6Var2);
            }
            ln lnVar = this.n;
            boolean z3 = false;
            if (lnVar.c < 1.0f && z) {
                c(this.k, false, false);
            }
            if (i == 2) {
                this.g = 180.0f;
                this.e = -1L;
            } else if (this.k == 2) {
                if (i == 0) {
                    this.h = -45.0f;
                } else {
                    this.h = 0.0f;
                }
            }
            if (z) {
                byte b = this.k;
                this.j = b;
                this.k = i;
                if (b == 2 && i != 2) {
                    z3 = true;
                }
                this.l = z3;
                lnVar.e(true, 0.0f);
            } else {
                this.k = i;
                this.j = i;
                this.l = false;
                lnVar.e(true, 1.0f);
            }
            invalidateSelf();
        }
    }

    public final float d(float f) {
        return kt6.B(0.5f, f, this.p, this.q);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        ?? r19;
        float f5;
        float d;
        ?? r23;
        float d2;
        float f6;
        float f7;
        float f8;
        float f9;
        boolean z;
        boolean z2;
        float d3;
        Rect bounds = getBounds();
        this.p = Math.min(bounds.width(), bounds.height());
        this.q = bounds.centerX();
        this.r = bounds.centerY();
        int i = this.a;
        if (i < 255) {
            float f10 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, f10, i, 31);
        } else {
            canvas2 = canvas;
        }
        if (this.l) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        float e = this.n.e(false, f);
        byte b = this.k;
        byte b2 = this.j;
        if (b == 0) {
            if (b2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = e;
            }
        } else if (b2 == 0) {
            f2 = 1.0f - e;
        } else {
            f2 = 0.0f;
        }
        if (b == 1) {
            if (b2 == 1) {
                f3 = 1.0f;
            } else {
                f3 = e;
            }
        } else if (b2 == 1) {
            f3 = 1.0f - e;
        } else {
            f3 = 0.0f;
        }
        if (b == 2) {
            if (b2 == 2) {
                f4 = 1.0f;
            } else {
                f4 = e;
            }
        } else if (b2 == 2) {
            f4 = 1.0f - e;
        } else {
            f4 = 0.0f;
        }
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        Paint paint = this.b;
        if (i2 > 0) {
            boolean z3 = true;
            float R1 = gm.R1(d(0.25f), d(0.444f), f2);
            float R12 = gm.R1(e(0.5f), e(0.444f), f2);
            float R13 = gm.R1(0.0f, this.p * 0.208f, f2);
            r19 = z3;
            if (R13 >= this.p * 0.075f) {
                canvas2.drawCircle(R1, R12, R13, paint);
                r19 = z3;
            }
        } else {
            r19 = 1;
        }
        if (i2 <= 0 && f3 <= 0.0f) {
            f5 = 45.0f;
            f7 = 0.0f;
            r23 = 0;
            f9 = 0.25f;
            f6 = f4;
            f8 = 0.5f;
        } else {
            canvas2.save();
            f5 = 45.0f;
            canvas2.rotate(f2 * 45.0f, this.q, this.r);
            float d4 = d(0.914f);
            float d5 = d(0.7638f);
            if (this.j == 2) {
                d = d(0.75f);
            } else {
                d = d(0.2409f);
            }
            float f11 = (d * f4) + (d5 * f3) + (d4 * f2);
            float e2 = e(0.5f);
            float d6 = d(0.658f);
            float d7 = d(0.2409f);
            r23 = 0;
            if (this.j == 2) {
                d2 = d(0.75f);
            } else {
                d2 = d(0.2409f);
            }
            float f12 = (d2 * f4) + (d7 * f3) + (d6 * f2);
            float e3 = e(0.5f);
            if (oqe.a(f11, e2, f12, e3) <= this.p * 0.075f) {
                f6 = f4;
                f7 = 0.0f;
                f8 = 0.5f;
                f9 = 0.25f;
            } else {
                f6 = f4;
                f7 = 0.0f;
                f8 = 0.5f;
                f9 = 0.25f;
                canvas2.drawLine(f11, e2, f12, e3, paint);
            }
            canvas2.restore();
        }
        if (f3 > f7) {
            if (this.j == 2) {
                d3 = gm.R1(d(0.75f), d(0.2409f), f3);
            } else {
                d3 = d(0.2409f);
            }
            canvas2.save();
            canvas2.rotate(f2 * f5, this.q, this.r);
            float d8 = (d(0.2452f) * f3) + d3;
            float R14 = gm.R1(e(f8), e(f9), f3);
            float e4 = e(f8);
            float d9 = (d(0.2452f) * f3) + d3;
            float R15 = gm.R1(e(f8), e(0.75f), f3);
            if (Math.max(oqe.a(d8, R14, d3, e4), oqe.a(d9, R15, d3, e4)) > this.p * 0.075f) {
                Path path = this.c;
                path.rewind();
                path.moveTo(d8, R14);
                path.lineTo(d3, e4);
                path.lineTo(d9, R15);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f6 > f7) {
            long j = this.e;
            if (j < 0 && f6 > 0.8f) {
                j = System.currentTimeMillis();
                this.e = j;
                this.m = this.l;
            }
            if (j > 0) {
                float[] fArr = this.i;
                wi2.a(((float) (System.currentTimeMillis() - this.e)) % 5400.0f, fArr);
                float f13 = fArr[r23];
                float f14 = fArr[r19];
                if (this.k != 2 && !this.l) {
                    float max = Math.max(f7, (((float) Math.floor((f13 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f14 = Math.min(f14, this.h + max);
                    f13 = gm.R1(f14, Math.min(f13, max + this.h), f6);
                }
                float f15 = this.h;
                float f16 = this.g;
                float f17 = f16 + f13;
                float f18 = f16 + f14;
                float f19 = f17 % 360.0f;
                if (f19 < 0.0f) {
                    f19 += 360.0f;
                }
                float f20 = f18 % 360.0f;
                if (f20 < 0.0f) {
                    f20 += 360.0f;
                }
                if (f19 <= f20 ? !(f15 < f19 || f15 > f20) : !(f15 < f19 && f15 > f20)) {
                    z = r19;
                } else {
                    z = r23;
                }
                boolean z4 = this.l;
                if (z4 && !this.m) {
                    this.m = z4;
                    this.f = z;
                }
                boolean z5 = this.f;
                if (z5 && !z) {
                    z2 = r23;
                    this.f = z2;
                    z5 = z2;
                } else {
                    z2 = r23;
                }
                if (z4 && z && !z5) {
                    this.l = z2;
                }
                float d10 = d(f9);
                float e5 = e(f9);
                float d11 = d(0.75f);
                float e6 = e(0.75f);
                float f21 = f13;
                RectF rectF = this.d;
                rectF.set(d10, e5, d11, e6);
                canvas2.drawArc(rectF, this.g + f21, f14 - f21, false, paint);
                invalidateSelf();
            }
        }
        if (this.a < 255) {
            canvas.restore();
        }
        if (e < 1.0f) {
            invalidateSelf();
        }
    }

    public final float e(float f) {
        return kt6.B(0.5f, f, this.p, this.r);
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.a = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
