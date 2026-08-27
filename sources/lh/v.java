package lh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mb0;

public final class v extends Drawable {

    public final int f16922a = 1;

    public final Path f16923b;

    public final Paint f16924c;
    public final Paint d;

    public final Paint f16925e;

    public boolean f16926f;

    public final Object f16927g;

    public v() {
        Path path = new Path();
        this.f16923b = path;
        Paint paint = new Paint(1);
        this.f16924c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f16925e = paint3;
        this.f16927g = new org.telegram.ui.Components.y5(new mb0(this, 1), 320L, er.h, 0);
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
        switch (this.f16922a) {
            case 0:
                boolean z10 = this.f16926f;
                if (z10) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.f16923b, this.f16924c);
                if (z10) {
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.d);
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.f16925e);
                }
                canvas.restore();
                break;
            default:
                float fDpf2 = AndroidUtilities.dpf2(1.66f);
                Paint paint = this.f16924c;
                paint.setStrokeWidth(fDpf2);
                float fDpf3 = AndroidUtilities.dpf2(3.32f);
                Paint paint2 = this.f16925e;
                paint2.setStrokeWidth(fDpf3);
                float fE = ((org.telegram.ui.Components.y5) this.f16927g).e(this.f16926f);
                float fCenterX = getBounds().centerX();
                float fCenterY = getBounds().centerY();
                float fDpf4 = AndroidUtilities.dpf2(10.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(fCenterX - fDpf4, fCenterY - fDpf4, fCenterX + fDpf4, fDpf4 + fCenterY);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.33f), AndroidUtilities.dpf2(8.33f), paint);
                if (fE > 0.0f) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(1.0f) + fCenterX, fCenterY - AndroidUtilities.dpf2(0.5f));
                canvas.drawPath(this.f16923b, this.d);
                canvas.restore();
                if (fE > 0.0f) {
                    if (this.f16926f) {
                        canvas.drawLine(fCenterX - AndroidUtilities.dpf2(8.33f), fCenterY - AndroidUtilities.dpf2(8.33f), (fCenterX - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * fE), (fCenterY - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * fE), paint2);
                        canvas.drawLine(fCenterX - AndroidUtilities.dpf2(8.33f), fCenterY - AndroidUtilities.dpf2(8.33f), (AndroidUtilities.dpf2(16.66f) * fE) + (fCenterX - AndroidUtilities.dpf2(8.33f)), (AndroidUtilities.dpf2(16.66f) * fE) + (fCenterY - AndroidUtilities.dpf2(8.33f)), paint);
                    } else {
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + fCenterX, AndroidUtilities.dpf2(8.33f) + fCenterY, (AndroidUtilities.dpf2(8.33f) + fCenterX) - (AndroidUtilities.dpf2(16.66f) * fE), (AndroidUtilities.dpf2(8.33f) + fCenterY) - (AndroidUtilities.dpf2(16.66f) * fE), paint2);
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + fCenterX, AndroidUtilities.dpf2(8.33f) + fCenterY, (AndroidUtilities.dpf2(8.33f) + fCenterX) - (AndroidUtilities.dpf2(16.66f) * fE), (AndroidUtilities.dpf2(8.33f) + fCenterY) - (AndroidUtilities.dpf2(16.66f) * fE), paint);
                    }
                }
                canvas.restore();
                break;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f16922a) {
            case 0:
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f16922a) {
            case 0:
                return AndroidUtilities.dp(32.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f16922a) {
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f16922a) {
            case 0:
                this.f16924c.setAlpha(i10);
                break;
            default:
                this.f16924c.setAlpha(i10);
                this.d.setAlpha(i10);
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f16922a) {
            case 0:
                this.f16924c.setColorFilter(colorFilter);
                break;
            default:
                this.d.setColorFilter(colorFilter);
                this.f16924c.setColorFilter(colorFilter);
                break;
        }
    }

    public v(u uVar, boolean z10) {
        u uVar2 = uVar;
        Paint paint = new Paint(1);
        this.f16924c = paint;
        this.d = new Paint(1);
        this.f16925e = new Paint(1);
        Path path = new Path();
        this.f16923b = path;
        this.f16927g = new float[8];
        this.f16926f = z10;
        paint.setColor(-1);
        float fDpf2 = AndroidUtilities.dpf2(13.333333f);
        float fDpf3 = AndroidUtilities.dpf2(18.666666f);
        float fDpf4 = AndroidUtilities.dpf2(3.0f);
        float fDpf5 = AndroidUtilities.dpf2(10.0f);
        float fDpf6 = AndroidUtilities.dpf2(15.333333f);
        float fDpf7 = AndroidUtilities.dpf2(1.0f);
        float fDpf8 = AndroidUtilities.dpf2(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-fDpf2) / 2.0f, (-fDpf3) / 2.0f, fDpf2 / 2.0f, fDpf3 / 2.0f);
        path.addRoundRect(rectF, fDpf4, fDpf4, Path.Direction.CW);
        ArrayList arrayList = uVar2.f16885e;
        int i10 = uVar2.f16884c;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            int i13 = i12 + 1;
            t tVar = (t) obj;
            int[] iArr = uVar2.d;
            int i14 = tVar.f16830c;
            int i15 = tVar.f16829b;
            int i16 = iArr[i14];
            int i17 = i16 - 1;
            float fMax = (fDpf5 - (Math.max(i11, i17) * fDpf8)) / i16;
            int i18 = i10 - 1;
            float fMax2 = (fDpf6 - (Math.max(i11, i18) * fDpf8)) / i10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            ArrayList arrayList2 = arrayList;
            float f10 = (-fDpf5) / 2.0f;
            int i19 = i10;
            float f11 = i15;
            float f12 = (fMax * f11) + f10;
            float f13 = f11 * fDpf8;
            int i20 = size;
            float f14 = (-fDpf6) / 2.0f;
            float f15 = fDpf5;
            float f16 = i14;
            float f17 = (fMax2 * f16) + f14;
            float f18 = f16 * fDpf8;
            float f19 = fDpf6;
            float f20 = f18 + f17;
            float f21 = fDpf7;
            rectF2.set(f13 + f12, f20, com.google.android.recaptcha.internal.a.d(fMax, i15 + 1, f10, f13), com.google.android.recaptcha.internal.a.d(fMax2, i14 + 1, f14, f18));
            float[] fArr = (float[]) this.f16927g;
            float f22 = 0.0f;
            float f23 = (i15 == 0 && i14 == 0) ? f21 : 0.0f;
            fArr[1] = f23;
            fArr[0] = f23;
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
            this.f16923b.addRoundRect(rectF2, fArr, Path.Direction.CW);
            uVar2 = uVar;
            arrayList = arrayList2;
            i10 = i19;
            i12 = i13;
            size = i20;
            fDpf5 = f15;
            fDpf7 = f21;
            fDpf6 = f19;
            i11 = 0;
        }
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStrokeWidth(AndroidUtilities.dp(3.33f));
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f16925e.setStyle(style);
        this.f16925e.setStrokeWidth(AndroidUtilities.dp(1.33f));
        this.f16925e.setColor(-1);
        this.f16925e.setStrokeCap(Paint.Cap.ROUND);
        this.f16925e.setStrokeJoin(Paint.Join.ROUND);
    }
}
