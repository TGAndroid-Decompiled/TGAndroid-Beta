package jh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class o8 extends Drawable {

    public int f13756a;

    public final View f13757b;

    public final Paint f13758c;
    public final Paint d;

    public final org.telegram.ui.Components.y5 f13761g;
    public boolean h;

    public Paint f13762i;

    public int f13759e = 255;

    public final float[] f13760f = new float[15];

    public final Path f13763j = new Path();

    public o8(View view) {
        this.f13757b = view;
        this.f13761g = new org.telegram.ui.Components.y5(view, 350L, er.h);
        Paint paint = new Paint(1);
        this.f13758c = paint;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(-1);
    }

    public final void a() {
        int i10 = this.f13756a + 1;
        this.f13756a = i10;
        if (i10 >= 2) {
            this.f13756a = 0;
        }
    }

    public final void b(boolean z10, boolean z11) {
        this.h = z10;
        if (z11) {
            this.f13757b.invalidate();
        } else {
            this.f13761g.d(z10 ? 1.0f : 0.0f, true);
        }
    }

    public final void c(float f10) {
        this.f13758c.setShadowLayer(AndroidUtilities.dp(2.0f) / f10, 0.0f, AndroidUtilities.dpf2(0.7f) / f10, i0.b.k(-16777216, 45));
    }

    @Override
    public final void draw(Canvas canvas) {
        float fCenterX = getBounds().centerX();
        float[] fArr = this.f13760f;
        int i10 = 0;
        fArr[0] = fCenterX;
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
        float fD = this.f13761g.d(this.h ? 1.0f : 0.0f, false);
        int i15 = this.f13756a;
        Paint paint = this.d;
        if (i15 == 0) {
            paint.setColor(-1);
        } else if (i15 == 1) {
            if (this.f13762i == null) {
                Paint paint2 = new Paint(1);
                this.f13762i = paint2;
                paint2.setColor(-16777216);
                this.f13762i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.f13762i.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            paint.setColor(i0.b.k(-16777216, 127));
        }
        if (this.f13759e != 255 || this.f13756a == 1) {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.f13759e, 31);
        } else {
            canvas.save();
        }
        Path path = this.f13763j;
        path.rewind();
        int i16 = 0;
        while (i16 < i12) {
            if (this.f13756a != i11 || i16 != 0) {
                Paint paint3 = i16 == 0 ? this.f13758c : paint;
                int i17 = i16 == 0 ? 1 : 0;
                while (i10 < 5) {
                    if (i10 == i11 || i10 == i12) {
                        if (fD != 1.0f) {
                            int i18 = i10 * 3;
                            path.addCircle(fArr[i18], fArr[i18 + 1], ((1.0f - fD) * fArr[i18 + 2]) - i17, Path.Direction.CW);
                        }
                    } else if (i10 != i13 && i10 != i14) {
                        int i19 = i10 * 3;
                        path.addCircle(fArr[i19], fArr[i19 + 1], fArr[i19 + 2] - i17, Path.Direction.CW);
                    } else if (fD != 0.0f) {
                        int i20 = i10 * 3;
                        path.addCircle(fArr[i20], fArr[i20 + 1], (fArr[i20 + 2] * fD) - i17, Path.Direction.CW);
                    }
                    i10++;
                    i13 = 3;
                    i11 = 1;
                    i12 = 2;
                    i14 = 4;
                }
                canvas.drawPath(path, paint3);
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
    public final void setAlpha(int i10) {
        this.f13759e = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
