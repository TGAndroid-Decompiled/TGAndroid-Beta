package lh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class o8 extends Drawable {
    public int f16027a;
    public final View f16028b;
    public final Paint f16029c;
    public final Paint d;
    public final org.telegram.ui.Components.d6 f16032g;
    public boolean h;
    public Paint f16033i;
    public int f16030e = 255;
    public final float[] f16031f = new float[15];
    public final Path f16034j = new Path();

    public o8(View view) {
        this.f16028b = view;
        this.f16032g = new org.telegram.ui.Components.d6(view, 350L, jr.h);
        Paint paint = new Paint(1);
        this.f16029c = paint;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i10 = this.f16027a + 1;
        this.f16027a = i10;
        if (i10 >= 2) {
            this.f16027a = 0;
        }
    }

    public final void b(boolean z10, boolean z11) {
        float f9;
        this.h = z10;
        if (!z11) {
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.f16032g.d(f9, true);
            return;
        }
        this.f16028b.invalidate();
    }

    public final void c(float f9) {
        this.f16029c.setShadowLayer(AndroidUtilities.dp(2.0f) / f9, 0.0f, AndroidUtilities.dpf2(0.7f) / f9, i0.a.k(-16777216, 45));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9;
        Paint paint;
        int i10;
        float[] fArr = this.f16031f;
        int i11 = 0;
        fArr[0] = getBounds().centerX();
        int i12 = 1;
        fArr[1] = getBounds().centerY();
        int i13 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i14 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i15 = 4;
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
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d = this.f16032g.d(f9, false);
        int i16 = this.f16027a;
        Paint paint2 = this.d;
        if (i16 == 0) {
            paint2.setColor(-1);
        } else if (i16 == 1) {
            if (this.f16033i == null) {
                Paint paint3 = new Paint(1);
                this.f16033i = paint3;
                paint3.setColor(-16777216);
                this.f16033i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.f16033i.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            paint2.setColor(i0.a.k(-16777216, 127));
        }
        if (this.f16030e == 255 && this.f16027a != 1) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.f16030e, 31);
        }
        Path path = this.f16034j;
        path.rewind();
        int i17 = 0;
        while (i17 < i13) {
            if (this.f16027a != i12 || i17 != 0) {
                if (i17 == 0) {
                    paint = this.f16029c;
                } else {
                    paint = paint2;
                }
                if (i17 == 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                while (i11 < 5) {
                    if (i11 != i12 && i11 != i13) {
                        if (i11 != i14 && i11 != i15) {
                            int i18 = i11 * 3;
                            path.addCircle(fArr[i18], fArr[i18 + 1], fArr[i18 + 2] - i10, Path.Direction.CW);
                        } else if (d != 0.0f) {
                            int i19 = i11 * 3;
                            path.addCircle(fArr[i19], fArr[i19 + 1], (fArr[i19 + 2] * d) - i10, Path.Direction.CW);
                        }
                    } else if (d != 1.0f) {
                        int i20 = i11 * 3;
                        path.addCircle(fArr[i20], fArr[i20 + 1], ((1.0f - d) * fArr[i20 + 2]) - i10, Path.Direction.CW);
                    }
                    i11++;
                    i14 = 3;
                    i12 = 1;
                    i13 = 2;
                    i15 = 4;
                }
                canvas.drawPath(path, paint);
            }
            i17++;
            i14 = 3;
            i11 = 0;
            i12 = 1;
            i13 = 2;
            i15 = 4;
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f16030e = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
