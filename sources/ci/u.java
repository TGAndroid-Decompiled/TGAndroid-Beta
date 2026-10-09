package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.hs;
public final class u extends Drawable {
    public final int f6040a = 1;
    public final Path f6041b;
    public final Paint f6042c;
    public final Paint d;
    public final Paint f6043e;
    public boolean f6044f;
    public final Object f6045g;

    public u() {
        Path path = new Path();
        this.f6041b = path;
        Paint paint = new Paint(1);
        this.f6042c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f6043e = paint3;
        this.f6045g = new org.telegram.ui.Components.g6(new bd0(this, 1), 320L, hs.h, 0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-AndroidUtilities.dpf2(3.75f), -AndroidUtilities.dpf2(5.4166f));
        path.lineTo(AndroidUtilities.dpf2(3.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dpf2(3.75f), AndroidUtilities.dpf2(5.4166f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f6040a) {
            case 0:
                boolean z10 = this.f6044f;
                if (z10) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.f6041b, this.f6042c);
                if (z10) {
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.d);
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.f6043e);
                }
                canvas.restore();
                return;
            default:
                float dpf2 = AndroidUtilities.dpf2(1.66f);
                Paint paint = this.f6042c;
                paint.setStrokeWidth(dpf2);
                float dpf22 = AndroidUtilities.dpf2(3.32f);
                Paint paint2 = this.f6043e;
                paint2.setStrokeWidth(dpf22);
                float e7 = ((org.telegram.ui.Components.g6) this.f6045g).e(this.f6044f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float dpf23 = AndroidUtilities.dpf2(10.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(centerX - dpf23, centerY - dpf23, centerX + dpf23, dpf23 + centerY);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.33f), AndroidUtilities.dpf2(8.33f), paint);
                int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
                if (i10 > 0) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(1.0f) + centerX, centerY - AndroidUtilities.dpf2(0.5f));
                canvas.drawPath(this.f6041b, this.d);
                canvas.restore();
                if (i10 > 0) {
                    if (this.f6044f) {
                        canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (centerX - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * e7), (centerY - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * e7), paint2);
                        canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (AndroidUtilities.dpf2(16.66f) * e7) + (centerX - AndroidUtilities.dpf2(8.33f)), (AndroidUtilities.dpf2(16.66f) * e7) + (centerY - AndroidUtilities.dpf2(8.33f)), paint);
                    } else {
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + centerX, AndroidUtilities.dpf2(8.33f) + centerY, (AndroidUtilities.dpf2(8.33f) + centerX) - (AndroidUtilities.dpf2(16.66f) * e7), (AndroidUtilities.dpf2(8.33f) + centerY) - (AndroidUtilities.dpf2(16.66f) * e7), paint2);
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + centerX, AndroidUtilities.dpf2(8.33f) + centerY, (AndroidUtilities.dpf2(8.33f) + centerX) - (AndroidUtilities.dpf2(16.66f) * e7), (AndroidUtilities.dpf2(8.33f) + centerY) - (AndroidUtilities.dpf2(16.66f) * e7), paint);
                    }
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f6040a) {
            case 0:
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f6040a) {
            case 0:
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f6040a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f6040a) {
            case 0:
                this.f6042c.setAlpha(i10);
                return;
            default:
                this.f6042c.setAlpha(i10);
                this.d.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f6040a) {
            case 0:
                this.f6042c.setColorFilter(colorFilter);
                return;
            default:
                this.d.setColorFilter(colorFilter);
                this.f6042c.setColorFilter(colorFilter);
                return;
        }
    }

    public u(t tVar, boolean z10) {
        t tVar2 = tVar;
        Paint paint = new Paint(1);
        this.f6042c = paint;
        this.d = new Paint(1);
        this.f6043e = new Paint(1);
        Path path = new Path();
        this.f6041b = path;
        this.f6045g = new float[8];
        this.f6044f = z10;
        paint.setColor(-1);
        float dpf2 = AndroidUtilities.dpf2(13.333333f);
        float dpf22 = AndroidUtilities.dpf2(18.666666f);
        float dpf23 = AndroidUtilities.dpf2(3.0f);
        float dpf24 = AndroidUtilities.dpf2(10.0f);
        float dpf25 = AndroidUtilities.dpf2(15.333333f);
        float dpf26 = AndroidUtilities.dpf2(1.0f);
        float f7 = 1.33f;
        float dpf27 = AndroidUtilities.dpf2(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = 2.0f;
        rectF.set((-dpf2) / 2.0f, (-dpf22) / 2.0f, dpf2 / 2.0f, dpf22 / 2.0f);
        path.addRoundRect(rectF, dpf23, dpf23, Path.Direction.CW);
        ArrayList arrayList = tVar2.f5977e;
        int i10 = tVar2.f5976c;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            int i13 = i12 + 1;
            s sVar = (s) obj;
            int[] iArr = tVar2.d;
            float f11 = f7;
            int i14 = sVar.f5919c;
            int i15 = sVar.f5918b;
            int i16 = iArr[i14];
            float f12 = f10;
            int i17 = i16 - 1;
            float max = (dpf24 - (Math.max(i11, i17) * dpf27)) / i16;
            int i18 = i10 - 1;
            int i19 = i11;
            float max2 = (dpf25 - (Math.max(i11, i18) * dpf27)) / i10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            ArrayList arrayList2 = arrayList;
            float f13 = (-dpf24) / f12;
            int i20 = i10;
            float f14 = i15;
            float f15 = f14 * dpf27;
            int i21 = size;
            float f16 = (-dpf25) / f12;
            float f17 = dpf24;
            float f18 = i14;
            float f19 = f18 * dpf27;
            float f20 = dpf25;
            float f21 = dpf26;
            rectF2.set(f15 + (max * f14) + f13, f19 + (max2 * f18) + f16, sc.v.d(max, i15 + 1, f13, f15), sc.v.d(max2, i14 + 1, f16, f19));
            float[] fArr = (float[]) this.f6045g;
            float f22 = 0.0f;
            float f23 = (i15 == 0 && i14 == 0) ? f21 : 0.0f;
            fArr[1] = f23;
            fArr[i19] = f23;
            float f24 = (i15 == i17 && i14 == 0) ? f21 : 0.0f;
            fArr[3] = f24;
            fArr[2] = f24;
            float f25 = (i15 == i17 && i14 == i18) ? f21 : 0.0f;
            fArr[5] = f25;
            fArr[4] = f25;
            if (i15 == 0 && i14 == i18) {
                f22 = f21;
            }
            fArr[7] = f22;
            fArr[6] = f22;
            this.f6041b.addRoundRect(rectF2, fArr, Path.Direction.CW);
            tVar2 = tVar;
            f7 = f11;
            f10 = f12;
            i11 = i19;
            arrayList = arrayList2;
            i10 = i20;
            i12 = i13;
            size = i21;
            dpf24 = f17;
            dpf26 = f21;
            dpf25 = f20;
        }
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStrokeWidth(AndroidUtilities.dp(3.33f));
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f6043e.setStyle(style);
        this.f6043e.setStrokeWidth(AndroidUtilities.dp(f7));
        this.f6043e.setColor(-1);
        this.f6043e.setStrokeCap(Paint.Cap.ROUND);
        this.f6043e.setStrokeJoin(Paint.Join.ROUND);
    }
}
