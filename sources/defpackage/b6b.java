package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class b6b extends Drawable {
    public int a;
    public final View b;
    public final Paint c;
    public final Paint d;
    public final lm g;
    public boolean h;
    public Paint i;
    public int e = 255;
    public final float[] f = new float[15];
    public final Path j = new Path();

    public b6b(View view) {
        this.b = view;
        this.g = new lm(350L, view, s33.h);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setShadowLayer(gl.L(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i = this.a + 1;
        this.a = i;
        if (i >= 2) {
            this.a = 0;
        }
    }

    public final void b(boolean z, boolean z2) {
        float f;
        this.h = z;
        if (!z2) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.g.e(true, f);
            return;
        }
        this.b.invalidate();
    }

    public final void c(float f) {
        this.c.setShadowLayer(gl.L(2.0f) / f, 0.0f, gl.N(0.7f) / f, bm2.o(-16777216, 45));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        int i;
        Paint paint;
        int i2;
        int i3;
        float[] fArr = this.f;
        int i4 = 0;
        fArr[0] = getBounds().centerX();
        int i5 = 1;
        fArr[1] = getBounds().centerY();
        int i6 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i7 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i8 = 4;
        fArr[4] = (getBounds().height() * 0.956f) + getBounds().top;
        fArr[5] = getBounds().height() * 0.055f;
        fArr[6] = (getBounds().width() * 0.843f) + getBounds().left;
        fArr[7] = (getBounds().height() * 0.812f) + getBounds().top;
        fArr[8] = getBounds().height() * 0.132f;
        fArr[9] = (getBounds().width() * (-0.02699995f)) + getBounds().left;
        fArr[10] = (getBounds().height() * 0.956f) + getBounds().top;
        fArr[11] = getBounds().height() * 0.055f;
        fArr[12] = (getBounds().width() * 0.157f) + getBounds().left;
        fArr[13] = (getBounds().height() * 0.812f) + getBounds().top;
        fArr[14] = getBounds().height() * 0.132f;
        if (this.h) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.g.e(false, f);
        int i9 = this.a;
        Paint paint2 = this.d;
        if (i9 == 0) {
            paint2.setColor(-1);
        } else if (i9 == 1) {
            if (this.i == null) {
                Paint paint3 = new Paint(1);
                this.i = paint3;
                paint3.setColor(-16777216);
                this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.i.setStrokeWidth(gl.L(3.0f));
            }
            paint2.setColor(bm2.o(-16777216, 127));
        }
        if (this.e == 255 && this.a != 1) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.e, 31);
        }
        Path path = this.j;
        path.rewind();
        int i10 = 0;
        while (i10 < i6) {
            if (this.a == i5 && i10 == 0) {
                i2 = i6;
            } else {
                if (i10 == 0) {
                    paint = this.c;
                    i = i5;
                } else {
                    i = i4;
                    paint = paint2;
                }
                while (i4 < 5) {
                    if (i4 != i5 && i4 != i6) {
                        if (i4 != i7 && i4 != i8) {
                            int i11 = i4 * 3;
                            i3 = i6;
                            path.addCircle(fArr[i11], fArr[i11 + 1], fArr[i11 + 2] - i, Path.Direction.CW);
                        } else {
                            i3 = i6;
                            if (e != 0.0f) {
                                int i12 = i4 * 3;
                                path.addCircle(fArr[i12], fArr[i12 + 1], (fArr[i12 + 2] * e) - i, Path.Direction.CW);
                            }
                        }
                    } else {
                        i3 = i6;
                        if (e != 1.0f) {
                            int i13 = i4 * 3;
                            path.addCircle(fArr[i13], fArr[i13 + 1], ((1.0f - e) * fArr[i13 + 2]) - i, Path.Direction.CW);
                        }
                    }
                    i4++;
                    i6 = i3;
                    i7 = 3;
                    i5 = 1;
                    i8 = 4;
                }
                i2 = i6;
                canvas.drawPath(path, paint);
            }
            i10++;
            i6 = i2;
            i7 = 3;
            i4 = 0;
            i5 = 1;
            i8 = 4;
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
        this.e = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
