package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.rp;
public final class d0 extends Drawable {
    public final ImageView f18713a;
    public final Paint f18714b;
    public final RectF f18715c;
    public final long d;
    public final Drawable f18716e;
    public boolean f18717f;
    public float f18718g;
    public boolean h;
    public final c6 f18719i;
    public final c6 f18720j;
    public final c6 f18721k;
    public nh0 f18722l;

    public d0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f18714b = paint;
        this.f18715c = new RectF();
        this.h = false;
        kg.i0 i0Var = new kg.i0(this, 7);
        kr krVar = kr.h;
        this.f18719i = new c6(i0Var, 320L, krVar, 0);
        this.f18720j = new c6(new kg.i0(this, 7), 320L, krVar, 0);
        this.f18721k = new c6(new kg.i0(this, 7), 320L, krVar, 0);
        this.f18713a = imageView;
        this.d = System.currentTimeMillis();
        this.f18716e = i5.c.g(context, 2131232691);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        nh0 nh0Var;
        int i7;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float d = this.f18721k.d(this.h);
        float f12 = 0.0f;
        char c10 = 2;
        if (d < 1.0f) {
            float f13 = 1.0f - d;
            float f14 = (0.4f * f13) + 0.6f;
            canvas2.save();
            float f15 = centerX;
            float f16 = centerY;
            canvas2.scale(f14, f14, f15, f16);
            Drawable drawable = this.f18716e;
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, centerX, drawable), org.telegram.ui.Cells.c0.A(2, centerY, drawable), org.telegram.ui.Cells.c0.y(2, centerX, drawable), org.telegram.ui.Cells.c0.j(2, centerY, drawable));
            drawable.setAlpha((int) (f13 * 255.0f));
            drawable.draw(canvas2);
            float L = org.telegram.messenger.g0.L(14.0f);
            int r12 = n6.r1(0.2f * f13, -1);
            Paint paint = this.f18714b;
            paint.setColor(r12);
            canvas2.drawCircle(f15, f16, L, paint);
            float f17 = f13 * 1.0f;
            paint.setColor(n6.r1(f17, -1));
            float f18 = f15 - L;
            f11 = 255.0f;
            float f19 = f16 - L;
            float f20 = f15 + L;
            float f21 = f16 + L;
            RectF rectF = this.f18715c;
            rectF.set(f18, f19, f20, f21);
            float d2 = this.f18719i.d(this.f18717f);
            paint.setColor(n6.r1((1.0f - d2) * f13 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j3) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j3)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i10 = 0;
            while (i10 < 4) {
                x1.a aVar = rp.h;
                float f22 = f12;
                aVar.getInterpolation((currentTimeMillis2 - (i10 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i7 + 667)) / 667.0f) * 250.0f;
                i10++;
                f12 = f22;
                c10 = c10;
            }
            f10 = f12;
            paint.setColor(n6.r1(f17, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f18720j.e(false, this.f18718g)) * (-360.0f) * d2, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 0.0f;
            f11 = 255.0f;
        }
        if (d > f10 && (nh0Var = this.f18722l) != null) {
            int i11 = nh0Var.f37800b / 2;
            int i12 = nh0Var.f37802c / 2;
            nh0Var.setBounds(centerX - i11, centerY - i12, i11 + centerX, i12 + centerY);
            this.f18722l.setAlpha((int) (d * f11));
            this.f18722l.draw(canvas2);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(40.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(40.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
