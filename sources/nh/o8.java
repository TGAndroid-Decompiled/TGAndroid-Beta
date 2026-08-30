package nh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class o8 extends Drawable {
    public int f15713a;
    public final View f15714b;
    public final Paint f15715c;
    public final Paint d;
    public final org.telegram.ui.Components.z5 f15717g;
    public boolean h;
    public Paint f15718i;
    public int e = 255;
    public final float[] f15716f = new float[15];
    public final Path f15719j = new Path();

    public o8(View view) {
        this.f15714b = view;
        this.f15717g = new org.telegram.ui.Components.z5(view, 350L, nr.h);
        Paint paint = new Paint(1);
        this.f15715c = paint;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i10 = this.f15713a + 1;
        this.f15713a = i10;
        if (i10 >= 2) {
            this.f15713a = 0;
        }
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        this.h = z4;
        if (!z10) {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f15717g.d(f10, true);
            return;
        }
        this.f15714b.invalidate();
    }

    public final void c(float f10) {
        this.f15715c.setShadowLayer(AndroidUtilities.dp(2.0f) / f10, 0.0f, AndroidUtilities.dpf2(0.7f) / f10, i0.a.k(-16777216, 45));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint;
        int i10;
        float[] fArr = this.f15716f;
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
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f15717g.d(f10, false);
        int i16 = this.f15713a;
        Paint paint2 = this.d;
        if (i16 == 0) {
            paint2.setColor(-1);
        } else if (i16 == 1) {
            if (this.f15718i == null) {
                Paint paint3 = new Paint(1);
                this.f15718i = paint3;
                paint3.setColor(-16777216);
                this.f15718i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.f15718i.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            paint2.setColor(i0.a.k(-16777216, 127));
        }
        if (this.e == 255 && this.f15713a != 1) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.e, 31);
        }
        Path path = this.f15719j;
        path.rewind();
        int i17 = 0;
        while (i17 < i13) {
            if (this.f15713a != i12 || i17 != 0) {
                if (i17 == 0) {
                    paint = this.f15715c;
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
        this.e = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
