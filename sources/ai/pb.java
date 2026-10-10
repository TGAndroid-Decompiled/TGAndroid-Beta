package ai;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
public final class pb extends Drawable {
    public int f1591a;
    public final View f1592b;
    public final Paint f1593c;
    public final Paint d;
    public final org.telegram.ui.Components.g6 f1596g;
    public boolean h;
    public Paint f1597i;
    public int f1594e = 255;
    public final float[] f1595f = new float[15];
    public final Path f1598j = new Path();

    public pb(View view) {
        this.f1592b = view;
        this.f1596g = new org.telegram.ui.Components.g6(view, 350L, is.h);
        Paint paint = new Paint(1);
        this.f1593c = paint;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i10 = this.f1591a + 1;
        this.f1591a = i10;
        if (i10 >= 2) {
            this.f1591a = 0;
        }
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.h = z10;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f1596g.d(f7, true);
            return;
        }
        this.f1592b.invalidate();
    }

    public final void c(float f7) {
        this.f1593c.setShadowLayer(AndroidUtilities.dp(2.0f) / f7, 0.0f, AndroidUtilities.dpf2(0.7f) / f7, i0.a.k(-16777216, 45));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        Paint paint;
        int i10;
        int i11;
        int i12;
        float[] fArr = this.f1595f;
        int i13 = 0;
        fArr[0] = getBounds().centerX();
        int i14 = 1;
        fArr[1] = getBounds().centerY();
        int i15 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i16 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i17 = 4;
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
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f1596g.d(f7, false);
        int i18 = this.f1591a;
        Paint paint2 = this.d;
        if (i18 == 0) {
            paint2.setColor(-1);
        } else if (i18 == 1) {
            if (this.f1597i == null) {
                Paint paint3 = new Paint(1);
                this.f1597i = paint3;
                paint3.setColor(-16777216);
                this.f1597i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.f1597i.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            paint2.setColor(i0.a.k(-16777216, 127));
        }
        if (this.f1594e == 255 && this.f1591a != 1) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.f1594e, 31);
        }
        Path path = this.f1598j;
        path.rewind();
        int i19 = 0;
        while (i19 < i15) {
            if (this.f1591a == i14 && i19 == 0) {
                i11 = i15;
            } else {
                if (i19 == 0) {
                    paint = this.f1593c;
                } else {
                    paint = paint2;
                }
                if (i19 == 0) {
                    i10 = i14;
                } else {
                    i10 = i13;
                }
                while (i13 < 5) {
                    if (i13 == i14 || i13 == i15) {
                        i12 = i15;
                        if (d != 1.0f) {
                            int i20 = i13 * 3;
                            path.addCircle(fArr[i20], fArr[i20 + 1], ((1.0f - d) * fArr[i20 + 2]) - i10, Path.Direction.CW);
                        }
                    } else if (i13 == i16 || i13 == i17) {
                        i12 = i15;
                        if (d != 0.0f) {
                            int i21 = i13 * 3;
                            path.addCircle(fArr[i21], fArr[i21 + 1], (fArr[i21 + 2] * d) - i10, Path.Direction.CW);
                        }
                    } else {
                        int i22 = i13 * 3;
                        i12 = i15;
                        path.addCircle(fArr[i22], fArr[i22 + 1], fArr[i22 + 2] - i10, Path.Direction.CW);
                    }
                    i13++;
                    i15 = i12;
                    i16 = 3;
                    i14 = 1;
                    i17 = 4;
                }
                i11 = i15;
                canvas.drawPath(path, paint);
            }
            i19++;
            i15 = i11;
            i16 = 3;
            i13 = 0;
            i14 = 1;
            i17 = 4;
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f1594e = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
