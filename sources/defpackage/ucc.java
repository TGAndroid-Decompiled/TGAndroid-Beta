package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class ucc extends Drawable {
    public static final int[] r = {10, 7, 26, 16, 10, 25};
    public final Paint a;
    public final TextPaint b;
    public final Path c;
    public boolean d;
    public final boolean e;
    public Path f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public long m;
    public tcc n;
    public long o;
    public String p;
    public float q;

    public ucc(boolean z) {
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Path path = new Path();
        this.c = path;
        this.q = 1.0f;
        this.e = z;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(gm.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        int i = 0;
        while (true) {
            Path path2 = this.c;
            if (i < 3) {
                int[] iArr = r;
                int i2 = i << 1;
                if (i == 0) {
                    path2.moveTo(gm.L(iArr[i2]), gm.L(iArr[i2 + 1]));
                } else {
                    path2.lineTo(gm.L(iArr[i2]), gm.L(iArr[i2 + 1]));
                }
                i++;
            } else {
                path2.close();
                return;
            }
        }
    }

    public final void a() {
        tcc tccVar = this.n;
        if (tccVar != null) {
            tccVar.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final void b(boolean z) {
        boolean z2 = this.d;
        if (z2 == z && this.h >= 1.0f && this.k) {
            return;
        }
        if (z2 != z) {
            this.o = 0L;
            this.p = null;
        }
        this.d = z;
        this.j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    public final void c(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.p = null;
            this.o = 0L;
            this.h = 0.0f;
        }
    }

    public final void d(boolean z) {
        this.l = z;
        a();
    }

    @Override
    public final void draw(Canvas canvas) {
        int v;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds = getBounds();
        int width = ((bounds.width() - gm.L(32.0f)) / 2) + bounds.left;
        int height = ((bounds.height() - gm.L(32.0f)) / 2) + bounds.top;
        if (this.d) {
            v = hg9.f(16.0f, bounds.width() / 4, width);
        } else {
            v = hg9.v(16.0f, bounds.width() / 4, width);
        }
        canvas.save();
        if (this.e) {
            Path path = this.f;
            if (path == null) {
                path = new Path();
                this.f = path;
            }
            int i5 = bounds.left + (bounds.top << 8) + (bounds.bottom << 16) + (bounds.right << 24);
            if (this.g != i5) {
                path.reset();
                RectF rectF = gm.P;
                rectF.set(bounds);
                this.f.addOval(rectF, Path.Direction.CCW);
                this.g = i5;
            }
            canvas.clipPath(this.f);
        } else {
            canvas.clipRect(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
        boolean z = this.k;
        TextPaint textPaint = this.b;
        Paint paint = this.a;
        if (!z) {
            paint.setAlpha((int) (this.i * 80.0f));
            textPaint.setAlpha((int) (this.i * 255.0f));
        } else {
            float f = this.h;
            if (f <= 0.7f) {
                paint.setAlpha((int) (Math.min(1.0f, f / 0.3f) * 80.0f));
                textPaint.setAlpha((int) (Math.min(1.0f, this.h / 0.3f) * 255.0f));
            } else {
                paint.setAlpha((int) ((1.0f - ((f - 0.7f) / 0.3f)) * 80.0f));
                textPaint.setAlpha((int) ((1.0f - ((this.h - 0.7f) / 0.3f)) * 255.0f));
            }
        }
        int max = Math.max(bounds.width(), bounds.height()) / 4;
        int i6 = 1;
        if (this.d) {
            i = -1;
        } else {
            i = 1;
        }
        canvas.drawCircle((max * i) + v, gm.L(16.0f) + height, Math.max(bounds.width(), bounds.height()) / 2, paint);
        canvas.restore();
        String str = this.p;
        if (str != null) {
            int L = gm.L(32.0f);
            if (this.d) {
                i6 = -1;
            }
            canvas.drawText(str, (L * i6) + v, gm.L(15.0f) + gm.L(32.0f) + height, textPaint);
        }
        canvas.save();
        float f2 = this.q;
        float f3 = v;
        float f4 = height;
        canvas.scale(f2, f2, f3, (gm.L(32.0f) / 2.0f) + f4);
        if (this.d) {
            canvas.rotate(180.0f, f3, (gm.L(32.0f) / 2) + height);
        }
        canvas.translate(f3, f4);
        float f5 = this.h;
        int i7 = (f5 > 0.6f ? 1 : (f5 == 0.6f ? 0 : -1));
        Path path2 = this.c;
        if (i7 <= 0) {
            if (f5 < 0.4f) {
                i4 = Math.min(255, (int) ((f5 * 255.0f) / 0.2f));
            } else {
                i4 = (int) ((1.0f - ((f5 - 0.4f) / 0.2f)) * 255.0f);
            }
            if (!this.k) {
                i4 = (int) (i4 * this.i);
            }
            paint.setAlpha(i4);
            canvas.drawPath(path2, paint);
        }
        canvas.translate(gm.L(18.0f), 0.0f);
        float f6 = this.h;
        if (f6 >= 0.2f && f6 <= 0.8f) {
            float f7 = f6 - 0.2f;
            if (f7 < 0.4f) {
                i3 = Math.min(255, (int) ((f7 * 255.0f) / 0.2f));
            } else {
                i3 = (int) ((1.0f - ((f7 - 0.4f) / 0.2f)) * 255.0f);
            }
            if (!this.k) {
                i3 = (int) (i3 * this.i);
            }
            paint.setAlpha(i3);
            canvas.drawPath(path2, paint);
        }
        canvas.translate(gm.L(18.0f), 0.0f);
        float f8 = this.h;
        if (f8 >= 0.4f && f8 <= 1.0f) {
            float f9 = f8 - 0.4f;
            if (f9 < 0.4f) {
                i2 = Math.min(255, (int) ((f9 * 255.0f) / 0.2f));
            } else {
                i2 = (int) ((1.0f - ((f9 - 0.4f) / 0.2f)) * 255.0f);
            }
            if (!this.k) {
                i2 = (int) (i2 * this.i);
            }
            paint.setAlpha(i2);
            canvas.drawPath(path2, paint);
        }
        canvas.restore();
        if (this.j) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.m;
            if (j > 17) {
                j = 17;
            }
            this.m = currentTimeMillis;
            float f10 = this.h;
            if (f10 < 1.0f) {
                float f11 = (((float) j) / 800.0f) + f10;
                this.h = f11;
                if (!this.k) {
                    if (f11 >= 1.0f) {
                        if (this.l) {
                            this.h = 0.0f;
                        } else {
                            this.h = 1.0f;
                        }
                    }
                } else if (f11 >= 1.0f) {
                    this.h = 0.0f;
                    this.j = false;
                    this.o = 0L;
                    this.p = null;
                }
                a();
            }
            if (!this.k) {
                boolean z2 = this.l;
                float f12 = this.i;
                if (z2) {
                    if (f12 != 1.0f) {
                        this.i = f12 + 0.10666667f;
                        a();
                    }
                } else if (f12 != 0.0f) {
                    this.i = f12 - 0.10666667f;
                    a();
                }
                float f13 = this.i;
                if (f13 < 0.0f) {
                    this.i = 0.0f;
                } else if (f13 > 1.0f) {
                    this.i = 1.0f;
                }
            }
        }
    }

    public final void e(long j) {
        this.o = j;
        if (j >= 1000) {
            this.p = jb6.G((int) (j / 1000), "Seconds", new Object[0]);
        } else {
            this.p = null;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(32.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return gm.L(32.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return gm.L(32.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
