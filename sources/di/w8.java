package di;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.wq;
public final class w8 extends Drawable {
    public int f9910a;
    public final View f9911b;
    public final Paint f9912c;
    public final Paint d;
    public final org.telegram.ui.Components.v5 f9915g;
    public boolean h;
    public Paint f9916i;
    public int f9913e = 255;
    public final float[] f9914f = new float[15];
    public final Path f9917j = new Path();

    public w8(View view) {
        this.f9911b = view;
        this.f9915g = new org.telegram.ui.Components.v5(view, 350L, wq.h);
        Paint paint = new Paint(1);
        this.f9912c = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i7 = this.f9910a + 1;
        this.f9910a = i7;
        if (i7 >= 2) {
            this.f9910a = 0;
        }
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        this.h = z9;
        if (!z10) {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f9915g.e(true, f10);
            return;
        }
        this.f9911b.invalidate();
    }

    public final void c(float f10) {
        this.f9912c.setShadowLayer(org.telegram.messenger.g0.L(2.0f) / f10, 0.0f, org.telegram.messenger.g0.N(0.7f) / f10, i0.a.o(-16777216, 45));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint;
        int i7;
        int i10;
        int i11;
        float[] fArr = this.f9914f;
        int i12 = 0;
        fArr[0] = getBounds().centerX();
        int i13 = 1;
        fArr[1] = getBounds().centerY();
        int i14 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i15 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i16 = 4;
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
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f9915g.e(false, f10);
        int i17 = this.f9910a;
        Paint paint2 = this.d;
        if (i17 == 0) {
            paint2.setColor(-1);
        } else if (i17 == 1) {
            if (this.f9916i == null) {
                Paint paint3 = new Paint(1);
                this.f9916i = paint3;
                paint3.setColor(-16777216);
                this.f9916i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.f9916i.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            }
            paint2.setColor(i0.a.o(-16777216, 127));
        }
        if (this.f9913e == 255 && this.f9910a != 1) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.f9913e, 31);
        }
        Path path = this.f9917j;
        path.rewind();
        int i18 = 0;
        while (i18 < i14) {
            if (this.f9910a == i13 && i18 == 0) {
                i10 = i14;
            } else {
                if (i18 == 0) {
                    paint = this.f9912c;
                } else {
                    paint = paint2;
                }
                if (i18 == 0) {
                    i7 = i13;
                } else {
                    i7 = i12;
                }
                while (i12 < 5) {
                    if (i12 == i13 || i12 == i14) {
                        i11 = i14;
                        if (e10 != 1.0f) {
                            int i19 = i12 * 3;
                            path.addCircle(fArr[i19], fArr[i19 + 1], ((1.0f - e10) * fArr[i19 + 2]) - i7, Path.Direction.CW);
                        }
                    } else if (i12 == i15 || i12 == i16) {
                        i11 = i14;
                        if (e10 != 0.0f) {
                            int i20 = i12 * 3;
                            path.addCircle(fArr[i20], fArr[i20 + 1], (fArr[i20 + 2] * e10) - i7, Path.Direction.CW);
                        }
                    } else {
                        int i21 = i12 * 3;
                        i11 = i14;
                        path.addCircle(fArr[i21], fArr[i21 + 1], fArr[i21 + 2] - i7, Path.Direction.CW);
                    }
                    i12++;
                    i14 = i11;
                    i15 = 3;
                    i13 = 1;
                    i16 = 4;
                }
                i10 = i14;
                canvas.drawPath(path, paint);
            }
            i18++;
            i14 = i10;
            i15 = 3;
            i12 = 0;
            i13 = 1;
            i16 = 4;
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f9913e = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
