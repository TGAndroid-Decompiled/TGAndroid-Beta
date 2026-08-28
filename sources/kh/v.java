package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ib0;
public final class v extends Drawable {
    public final int f16176a = 1;
    public final Path f16177b;
    public final Paint f16178c;
    public final Paint d;
    public final Paint f16179e;
    public boolean f16180f;
    public final Object f16181g;

    public v() {
        Path path = new Path();
        this.f16177b = path;
        Paint paint = new Paint(1);
        this.f16178c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f16179e = paint3;
        this.f16181g = new org.telegram.ui.Components.y5(new ib0(this, 1), 320L, gr.h, 0);
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
        switch (this.f16176a) {
            case 0:
                boolean z10 = this.f16180f;
                if (z10) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.f16177b, this.f16178c);
                if (z10) {
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.d);
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.f16179e);
                }
                canvas.restore();
                return;
            default:
                float dpf2 = AndroidUtilities.dpf2(1.66f);
                Paint paint = this.f16178c;
                paint.setStrokeWidth(dpf2);
                float dpf22 = AndroidUtilities.dpf2(3.32f);
                Paint paint2 = this.f16179e;
                paint2.setStrokeWidth(dpf22);
                float e10 = ((org.telegram.ui.Components.y5) this.f16181g).e(this.f16180f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float dpf23 = AndroidUtilities.dpf2(10.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(centerX - dpf23, centerY - dpf23, centerX + dpf23, dpf23 + centerY);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.33f), AndroidUtilities.dpf2(8.33f), paint);
                int i9 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
                if (i9 > 0) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(1.0f) + centerX, centerY - AndroidUtilities.dpf2(0.5f));
                canvas.drawPath(this.f16177b, this.d);
                canvas.restore();
                if (i9 > 0) {
                    if (this.f16180f) {
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
        switch (this.f16176a) {
            case 0:
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f16176a) {
            case 0:
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f16176a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        switch (this.f16176a) {
            case 0:
                this.f16178c.setAlpha(i9);
                return;
            default:
                this.f16178c.setAlpha(i9);
                this.d.setAlpha(i9);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f16176a) {
            case 0:
                this.f16178c.setColorFilter(colorFilter);
                return;
            default:
                this.d.setColorFilter(colorFilter);
                this.f16178c.setColorFilter(colorFilter);
                return;
        }
    }

    public v(u uVar, boolean z10) {
        u uVar2 = uVar;
        Paint paint = new Paint(1);
        this.f16178c = paint;
        this.d = new Paint(1);
        this.f16179e = new Paint(1);
        Path path = new Path();
        this.f16177b = path;
        this.f16181g = new float[8];
        this.f16180f = z10;
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
        ArrayList arrayList = uVar2.f16118e;
        int i9 = uVar2.f16117c;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            int i12 = i11 + 1;
            t tVar = (t) obj;
            int[] iArr = uVar2.d;
            int i13 = tVar.f16075c;
            int i14 = tVar.f16074b;
            int i15 = iArr[i13];
            int i16 = i15 - 1;
            float max = (dpf24 - (Math.max(i10, i16) * dpf27)) / i15;
            int i17 = i9 - 1;
            float max2 = (dpf25 - (Math.max(i10, i17) * dpf27)) / i9;
            RectF rectF2 = AndroidUtilities.rectTmp;
            ArrayList arrayList2 = arrayList;
            float f10 = (-dpf24) / 2.0f;
            int i18 = i9;
            float f11 = i14;
            float f12 = f11 * dpf27;
            int i19 = size;
            float f13 = (-dpf25) / 2.0f;
            float f14 = dpf24;
            float f15 = i13;
            float f16 = f15 * dpf27;
            float f17 = dpf25;
            float f18 = dpf26;
            rectF2.set(f12 + (max * f11) + f10, f16 + (max2 * f15) + f13, aa.d.w(max, i14 + 1, f10, f12), aa.d.w(max2, i13 + 1, f13, f16));
            float[] fArr = (float[]) this.f16181g;
            float f19 = 0.0f;
            float f20 = (i14 == 0 && i13 == 0) ? f18 : 0.0f;
            fArr[1] = f20;
            fArr[0] = f20;
            float f21 = (i14 == i16 && i13 == 0) ? f18 : 0.0f;
            fArr[3] = f21;
            fArr[2] = f21;
            float f22 = (i14 == i16 && i13 == i17) ? f18 : 0.0f;
            fArr[5] = f22;
            fArr[4] = f22;
            if (i14 == 0 && i13 == i17) {
                f19 = f18;
            }
            fArr[7] = f19;
            fArr[6] = f19;
            this.f16177b.addRoundRect(rectF2, fArr, Path.Direction.CW);
            uVar2 = uVar;
            arrayList = arrayList2;
            i9 = i18;
            i11 = i12;
            size = i19;
            dpf24 = f14;
            dpf26 = f18;
            dpf25 = f17;
            i10 = 0;
        }
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStrokeWidth(AndroidUtilities.dp(3.33f));
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f16179e.setStyle(style);
        this.f16179e.setStrokeWidth(AndroidUtilities.dp(1.33f));
        this.f16179e.setColor(-1);
        this.f16179e.setStrokeCap(Paint.Cap.ROUND);
        this.f16179e.setStrokeJoin(Paint.Join.ROUND);
    }
}
