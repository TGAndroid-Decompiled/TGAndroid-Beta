package hi;

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
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.kr;
public final class d0 extends Drawable {
    public final int f14290a = 1;
    public final Path f14291b;
    public final Paint f14292c;
    public final Paint d;
    public final Paint f14293e;
    public boolean f14294f;
    public final Object f14295g;

    public d0() {
        Path path = new Path();
        this.f14291b = path;
        Paint paint = new Paint(1);
        this.f14292c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f14293e = paint3;
        this.f14295g = new org.telegram.ui.Components.c6(new eb0(this, 0), 320L, kr.h, 0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-org.telegram.messenger.g0.N(3.75f), -org.telegram.messenger.g0.N(5.4166f));
        path.lineTo(org.telegram.messenger.g0.N(3.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.g0.N(3.75f), org.telegram.messenger.g0.N(5.4166f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f14290a) {
            case 0:
                boolean z10 = this.f14294f;
                if (z10) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.f14291b, this.f14292c);
                if (z10) {
                    canvas.drawLine(-org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(8.66f), this.d);
                    canvas.drawLine(-org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(8.66f), this.f14293e);
                }
                canvas.restore();
                return;
            default:
                float N = org.telegram.messenger.g0.N(1.66f);
                Paint paint = this.f14292c;
                paint.setStrokeWidth(N);
                float N2 = org.telegram.messenger.g0.N(3.32f);
                Paint paint2 = this.f14293e;
                paint2.setStrokeWidth(N2);
                float d = ((org.telegram.ui.Components.c6) this.f14295g).d(this.f14294f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float N3 = org.telegram.messenger.g0.N(10.66f);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(centerX - N3, centerY - N3, centerX + N3, N3 + centerY);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(8.33f), org.telegram.messenger.g0.N(8.33f), paint);
                int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
                if (i7 > 0) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(1.0f) + centerX, centerY - org.telegram.messenger.g0.N(0.5f));
                canvas.drawPath(this.f14291b, this.d);
                canvas.restore();
                if (i7 > 0) {
                    if (this.f14294f) {
                        canvas.drawLine(centerX - org.telegram.messenger.g0.N(8.33f), centerY - org.telegram.messenger.g0.N(8.33f), org.telegram.ui.Cells.c0.e(16.66f, d, centerX - org.telegram.messenger.g0.N(8.33f)), org.telegram.ui.Cells.c0.e(16.66f, d, centerY - org.telegram.messenger.g0.N(8.33f)), paint2);
                        canvas.drawLine(centerX - org.telegram.messenger.g0.N(8.33f), centerY - org.telegram.messenger.g0.N(8.33f), org.telegram.ui.Cells.c0.e(16.66f, d, centerX - org.telegram.messenger.g0.N(8.33f)), org.telegram.ui.Cells.c0.e(16.66f, d, centerY - org.telegram.messenger.g0.N(8.33f)), paint);
                    } else {
                        canvas.drawLine(org.telegram.messenger.g0.N(8.33f) + centerX, org.telegram.messenger.g0.N(8.33f) + centerY, (org.telegram.messenger.g0.N(8.33f) + centerX) - (org.telegram.messenger.g0.N(16.66f) * d), (org.telegram.messenger.g0.N(8.33f) + centerY) - (org.telegram.messenger.g0.N(16.66f) * d), paint2);
                        canvas.drawLine(org.telegram.messenger.g0.N(8.33f) + centerX, org.telegram.messenger.g0.N(8.33f) + centerY, (org.telegram.messenger.g0.N(8.33f) + centerX) - (org.telegram.messenger.g0.N(16.66f) * d), (org.telegram.messenger.g0.N(8.33f) + centerY) - (org.telegram.messenger.g0.N(16.66f) * d), paint);
                    }
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f14290a) {
            case 0:
                return org.telegram.messenger.g0.L(32.0f);
            default:
                return org.telegram.messenger.g0.L(24.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f14290a) {
            case 0:
                return org.telegram.messenger.g0.L(32.0f);
            default:
                return org.telegram.messenger.g0.L(24.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f14290a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f14290a) {
            case 0:
                this.f14292c.setAlpha(i7);
                return;
            default:
                this.f14292c.setAlpha(i7);
                this.d.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f14290a) {
            case 0:
                this.f14292c.setColorFilter(colorFilter);
                return;
            default:
                this.d.setColorFilter(colorFilter);
                this.f14292c.setColorFilter(colorFilter);
                return;
        }
    }

    public d0(c0 c0Var, boolean z10) {
        c0 c0Var2 = c0Var;
        Paint paint = new Paint(1);
        this.f14292c = paint;
        this.d = new Paint(1);
        this.f14293e = new Paint(1);
        Path path = new Path();
        this.f14291b = path;
        this.f14295g = new float[8];
        this.f14294f = z10;
        paint.setColor(-1);
        float N = org.telegram.messenger.g0.N(13.333333f);
        float N2 = org.telegram.messenger.g0.N(18.666666f);
        float N3 = org.telegram.messenger.g0.N(3.0f);
        float N4 = org.telegram.messenger.g0.N(10.0f);
        float N5 = org.telegram.messenger.g0.N(15.333333f);
        float N6 = org.telegram.messenger.g0.N(1.0f);
        float f10 = 1.33f;
        float N7 = org.telegram.messenger.g0.N(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = 2.0f;
        rectF.set((-N) / 2.0f, (-N2) / 2.0f, N / 2.0f, N2 / 2.0f);
        path.addRoundRect(rectF, N3, N3, Path.Direction.CW);
        ArrayList arrayList = c0Var2.f14250e;
        int i7 = c0Var2.f14249c;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            int i12 = i11 + 1;
            b0 b0Var = (b0) obj;
            int[] iArr = c0Var2.d;
            float f12 = f10;
            int i13 = b0Var.f14212c;
            int i14 = b0Var.f14211b;
            int i15 = iArr[i13];
            float f13 = f11;
            int i16 = i15 - 1;
            float max = (N4 - (Math.max(i10, i16) * N7)) / i15;
            int i17 = i7 - 1;
            int i18 = i10;
            float max2 = (N5 - (Math.max(i10, i17) * N7)) / i7;
            RectF rectF2 = org.telegram.messenger.g0.P;
            ArrayList arrayList2 = arrayList;
            float f14 = (-N4) / f13;
            int i19 = i7;
            float f15 = i14;
            float f16 = f15 * N7;
            int i20 = size;
            float f17 = (-N5) / f13;
            float f18 = N4;
            float f19 = i13;
            float f20 = f19 * N7;
            float f21 = N5;
            float f22 = N6;
            rectF2.set(f16 + (max * f15) + f14, f20 + (max2 * f19) + f17, p5.c.e(max, i14 + 1, f14, f16), p5.c.e(max2, i13 + 1, f17, f20));
            float[] fArr = (float[]) this.f14295g;
            float f23 = 0.0f;
            float f24 = (i14 == 0 && i13 == 0) ? f22 : 0.0f;
            fArr[1] = f24;
            fArr[i18] = f24;
            float f25 = (i14 == i16 && i13 == 0) ? f22 : 0.0f;
            fArr[3] = f25;
            fArr[2] = f25;
            float f26 = (i14 == i16 && i13 == i17) ? f22 : 0.0f;
            fArr[5] = f26;
            fArr[4] = f26;
            if (i14 == 0 && i13 == i17) {
                f23 = f22;
            }
            fArr[7] = f23;
            fArr[6] = f23;
            this.f14291b.addRoundRect(rectF2, fArr, Path.Direction.CW);
            c0Var2 = c0Var;
            f10 = f12;
            f11 = f13;
            i10 = i18;
            arrayList = arrayList2;
            i7 = i19;
            i11 = i12;
            size = i20;
            N4 = f18;
            N6 = f22;
            N5 = f21;
        }
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f14293e.setStyle(style);
        this.f14293e.setStrokeWidth(org.telegram.messenger.g0.L(f10));
        this.f14293e.setColor(-1);
        this.f14293e.setStrokeCap(Paint.Cap.ROUND);
        this.f14293e.setStrokeJoin(Paint.Join.ROUND);
    }
}
