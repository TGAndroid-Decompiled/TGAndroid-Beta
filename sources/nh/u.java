package nh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xb0;
public final class u extends Drawable {
    public final int f18696a = 1;
    public final Path f18697b;
    public final Paint f18698c;
    public final Paint d;
    public final Paint f18699e;
    public boolean f18700f;
    public final Object f18701g;

    public u() {
        Path path = new Path();
        this.f18697b = path;
        Paint paint = new Paint(1);
        this.f18698c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f18699e = paint3;
        this.f18701g = new org.telegram.ui.Components.d6(new xb0(this, 1), 320L, jr.h, 0);
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
        switch (this.f18696a) {
            case 0:
                boolean z10 = this.f18700f;
                if (z10) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.f18697b, this.f18698c);
                if (z10) {
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.d);
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.f18699e);
                }
                canvas.restore();
                return;
            default:
                float dpf2 = AndroidUtilities.dpf2(1.66f);
                Paint paint = this.f18698c;
                paint.setStrokeWidth(dpf2);
                float dpf22 = AndroidUtilities.dpf2(3.32f);
                Paint paint2 = this.f18699e;
                paint2.setStrokeWidth(dpf22);
                float e10 = ((org.telegram.ui.Components.d6) this.f18701g).e(this.f18700f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float dpf23 = AndroidUtilities.dpf2(10.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(centerX - dpf23, centerY - dpf23, centerX + dpf23, dpf23 + centerY);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.33f), AndroidUtilities.dpf2(8.33f), paint);
                int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
                if (i10 > 0) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(1.0f) + centerX, centerY - AndroidUtilities.dpf2(0.5f));
                canvas.drawPath(this.f18697b, this.d);
                canvas.restore();
                if (i10 > 0) {
                    if (this.f18700f) {
                        canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (centerX - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * e10), (centerY - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * e10), paint2);
                        canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (AndroidUtilities.dpf2(16.66f) * e10) + (centerX - AndroidUtilities.dpf2(8.33f)), (AndroidUtilities.dpf2(16.66f) * e10) + (centerY - AndroidUtilities.dpf2(8.33f)), paint);
                    } else {
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + centerX, AndroidUtilities.dpf2(8.33f) + centerY, (AndroidUtilities.dpf2(8.33f) + centerX) - (AndroidUtilities.dpf2(16.66f) * e10), (AndroidUtilities.dpf2(8.33f) + centerY) - (AndroidUtilities.dpf2(16.66f) * e10), paint2);
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + centerX, AndroidUtilities.dpf2(8.33f) + centerY, (AndroidUtilities.dpf2(8.33f) + centerX) - (AndroidUtilities.dpf2(16.66f) * e10), (AndroidUtilities.dpf2(8.33f) + centerY) - (AndroidUtilities.dpf2(16.66f) * e10), paint);
                    }
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f18696a) {
            case 0:
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f18696a) {
            case 0:
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f18696a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f18696a) {
            case 0:
                this.f18698c.setAlpha(i10);
                return;
            default:
                this.f18698c.setAlpha(i10);
                this.d.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f18696a) {
            case 0:
                this.f18698c.setColorFilter(colorFilter);
                return;
            default:
                this.d.setColorFilter(colorFilter);
                this.f18698c.setColorFilter(colorFilter);
                return;
        }
    }

    public u(t tVar, boolean z10) {
        t tVar2 = tVar;
        Paint paint = new Paint(1);
        this.f18698c = paint;
        this.d = new Paint(1);
        this.f18699e = new Paint(1);
        Path path = new Path();
        this.f18697b = path;
        this.f18701g = new float[8];
        this.f18700f = z10;
        paint.setColor(-1);
        float dpf2 = AndroidUtilities.dpf2(13.333333f);
        float dpf22 = AndroidUtilities.dpf2(18.666666f);
        float dpf23 = AndroidUtilities.dpf2(3.0f);
        float dpf24 = AndroidUtilities.dpf2(10.0f);
        float dpf25 = AndroidUtilities.dpf2(15.333333f);
        float dpf26 = AndroidUtilities.dpf2(1.0f);
        float dpf27 = AndroidUtilities.dpf2(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-dpf2) / 2.0f, (-dpf22) / 2.0f, dpf2 / 2.0f, dpf22 / 2.0f);
        path.addRoundRect(rectF, dpf23, dpf23, Path.Direction.CW);
        ArrayList arrayList = tVar2.f18567e;
        int i10 = tVar2.f18566c;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            int i13 = i12 + 1;
            s sVar = (s) obj;
            int[] iArr = tVar2.d;
            int i14 = sVar.f18542c;
            int i15 = sVar.f18541b;
            int i16 = iArr[i14];
            int i17 = i16 - 1;
            float max = (dpf24 - (Math.max(i11, i17) * dpf27)) / i16;
            int i18 = i10 - 1;
            float max2 = (dpf25 - (Math.max(i11, i18) * dpf27)) / i10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            ArrayList arrayList2 = arrayList;
            float f9 = (-dpf24) / 2.0f;
            int i19 = i10;
            float f10 = i15;
            float f11 = f10 * dpf27;
            int i20 = size;
            float f12 = (-dpf25) / 2.0f;
            float f13 = dpf24;
            float f14 = i14;
            float f15 = f14 * dpf27;
            float f16 = dpf25;
            float f17 = dpf26;
            rectF2.set(f11 + (max * f10) + f9, f15 + (max2 * f14) + f12, com.google.android.recaptcha.internal.a.d(max, i15 + 1, f9, f11), com.google.android.recaptcha.internal.a.d(max2, i14 + 1, f12, f15));
            float[] fArr = (float[]) this.f18701g;
            float f18 = 0.0f;
            float f19 = (i15 == 0 && i14 == 0) ? f17 : 0.0f;
            fArr[1] = f19;
            fArr[0] = f19;
            float f20 = (i15 == i17 && i14 == 0) ? f17 : 0.0f;
            fArr[3] = f20;
            fArr[2] = f20;
            float f21 = (i15 == i17 && i14 == i18) ? f17 : 0.0f;
            fArr[5] = f21;
            fArr[4] = f21;
            if (i15 == 0 && i14 == i18) {
                f18 = f17;
            }
            fArr[7] = f18;
            fArr[6] = f18;
            this.f18697b.addRoundRect(rectF2, fArr, Path.Direction.CW);
            tVar2 = tVar;
            arrayList = arrayList2;
            i10 = i19;
            i12 = i13;
            size = i20;
            dpf24 = f13;
            dpf26 = f17;
            dpf25 = f16;
            i11 = 0;
        }
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStrokeWidth(AndroidUtilities.dp(3.33f));
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f18699e.setStyle(style);
        this.f18699e.setStrokeWidth(AndroidUtilities.dp(1.33f));
        this.f18699e.setColor(-1);
        this.f18699e.setStrokeCap(Paint.Cap.ROUND);
        this.f18699e.setStrokeJoin(Paint.Join.ROUND);
    }
}
