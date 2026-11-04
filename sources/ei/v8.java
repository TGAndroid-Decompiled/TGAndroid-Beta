package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.xq;
public final class v8 extends Drawable {
    public int f11132a;
    public final View f11133b;
    public final Paint f11134c;
    public final Paint d;
    public final org.telegram.ui.Components.u5 f11137g;
    public boolean h;
    public Paint f11138i;
    public int f11135e = 255;
    public final float[] f11136f = new float[15];
    public final Path f11139j = new Path();

    public v8(View view) {
        this.f11133b = view;
        this.f11137g = new org.telegram.ui.Components.u5(view, 350L, xq.h);
        Paint paint = new Paint(1);
        this.f11134c = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i3 = this.f11132a + 1;
        this.f11132a = i3;
        if (i3 >= 2) {
            this.f11132a = 0;
        }
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        this.h = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f11137g.e(true, f10);
            return;
        }
        this.f11133b.invalidate();
    }

    public final void c(float f10) {
        this.f11134c.setShadowLayer(org.telegram.messenger.g0.L(2.0f) / f10, 0.0f, org.telegram.messenger.g0.N(0.7f) / f10, i0.a.o(-16777216, 45));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint;
        int i3;
        int i10;
        int i11;
        float[] fArr = this.f11136f;
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
        float e10 = this.f11137g.e(false, f10);
        int i17 = this.f11132a;
        Paint paint2 = this.d;
        if (i17 == 0) {
            paint2.setColor(-1);
        } else if (i17 == 1) {
            if (this.f11138i == null) {
                Paint paint3 = new Paint(1);
                this.f11138i = paint3;
                paint3.setColor(-16777216);
                this.f11138i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.f11138i.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            }
            paint2.setColor(i0.a.o(-16777216, 127));
        }
        if (this.f11135e == 255 && this.f11132a != 1) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.f11135e, 31);
        }
        Path path = this.f11139j;
        path.rewind();
        int i18 = 0;
        while (i18 < i14) {
            if (this.f11132a == i13 && i18 == 0) {
                i10 = i14;
            } else {
                if (i18 == 0) {
                    paint = this.f11134c;
                } else {
                    paint = paint2;
                }
                if (i18 == 0) {
                    i3 = i13;
                } else {
                    i3 = i12;
                }
                while (i12 < 5) {
                    if (i12 == i13 || i12 == i14) {
                        i11 = i14;
                        if (e10 != 1.0f) {
                            int i19 = i12 * 3;
                            path.addCircle(fArr[i19], fArr[i19 + 1], ((1.0f - e10) * fArr[i19 + 2]) - i3, Path.Direction.CW);
                        }
                    } else if (i12 == i15 || i12 == i16) {
                        i11 = i14;
                        if (e10 != 0.0f) {
                            int i20 = i12 * 3;
                            path.addCircle(fArr[i20], fArr[i20 + 1], (fArr[i20 + 2] * e10) - i3, Path.Direction.CW);
                        }
                    } else {
                        int i21 = i12 * 3;
                        i11 = i14;
                        path.addCircle(fArr[i21], fArr[i21 + 1], fArr[i21 + 2] - i3, Path.Direction.CW);
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
    public final void setAlpha(int i3) {
        this.f11135e = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
