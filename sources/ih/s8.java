package ih;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class s8 extends Drawable {
    public int f12126a;
    public final View f12127b;
    public final Paint f12128c;
    public final Paint d;
    public final org.telegram.ui.Components.y5 f12131g;
    public boolean h;
    public Paint f12132i;
    public int f12129e = 255;
    public final float[] f12130f = new float[15];
    public final Path f12133j = new Path();

    public s8(View view) {
        this.f12127b = view;
        this.f12131g = new org.telegram.ui.Components.y5(view, 350L, gr.h);
        Paint paint = new Paint(1);
        this.f12128c = paint;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i9 = this.f12126a + 1;
        this.f12126a = i9;
        if (i9 >= 2) {
            this.f12126a = 0;
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
            this.f12131g.d(f10, true);
            return;
        }
        this.f12127b.invalidate();
    }

    public final void c(float f10) {
        this.f12128c.setShadowLayer(AndroidUtilities.dp(2.0f) / f10, 0.0f, AndroidUtilities.dpf2(0.7f) / f10, i0.a.k(-16777216, 45));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint;
        int i9;
        float[] fArr = this.f12130f;
        int i10 = 0;
        fArr[0] = getBounds().centerX();
        int i11 = 1;
        fArr[1] = getBounds().centerY();
        int i12 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i13 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i14 = 4;
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
        float d = this.f12131g.d(f10, false);
        int i15 = this.f12126a;
        Paint paint2 = this.d;
        if (i15 == 0) {
            paint2.setColor(-1);
        } else if (i15 == 1) {
            if (this.f12132i == null) {
                Paint paint3 = new Paint(1);
                this.f12132i = paint3;
                paint3.setColor(-16777216);
                this.f12132i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.f12132i.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            paint2.setColor(i0.a.k(-16777216, 127));
        }
        if (this.f12129e == 255 && this.f12126a != 1) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.f12129e, 31);
        }
        Path path = this.f12133j;
        path.rewind();
        int i16 = 0;
        while (i16 < i12) {
            if (this.f12126a != i11 || i16 != 0) {
                if (i16 == 0) {
                    paint = this.f12128c;
                } else {
                    paint = paint2;
                }
                if (i16 == 0) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                while (i10 < 5) {
                    if (i10 != i11 && i10 != i12) {
                        if (i10 != i13 && i10 != i14) {
                            int i17 = i10 * 3;
                            path.addCircle(fArr[i17], fArr[i17 + 1], fArr[i17 + 2] - i9, Path.Direction.CW);
                        } else if (d != 0.0f) {
                            int i18 = i10 * 3;
                            path.addCircle(fArr[i18], fArr[i18 + 1], (fArr[i18 + 2] * d) - i9, Path.Direction.CW);
                        }
                    } else if (d != 1.0f) {
                        int i19 = i10 * 3;
                        path.addCircle(fArr[i19], fArr[i19 + 1], ((1.0f - d) * fArr[i19 + 2]) - i9, Path.Direction.CW);
                    }
                    i10++;
                    i13 = 3;
                    i11 = 1;
                    i12 = 2;
                    i14 = 4;
                }
                canvas.drawPath(path, paint);
            }
            i16++;
            i13 = 3;
            i10 = 0;
            i11 = 1;
            i12 = 2;
            i14 = 4;
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f12129e = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
