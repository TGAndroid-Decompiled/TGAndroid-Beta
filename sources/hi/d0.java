package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import fi.v9;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zg0;
public final class d0 extends Drawable {
    public final ImageView f14602a;
    public final Paint f14603b;
    public final RectF f14604c;
    public final long d;
    public final Drawable f14605e;
    public boolean f14606f;
    public float f14607g;
    public boolean h;
    public final v5 f14608i;
    public final v5 f14609j;
    public final v5 f14610k;
    public zg0 f14611l;

    public d0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f14603b = paint;
        this.f14604c = new RectF();
        this.h = false;
        v9 v9Var = new v9(this, 11);
        wq wqVar = wq.h;
        this.f14608i = new v5(v9Var, 320L, wqVar, 0);
        this.f14609j = new v5(new v9(this, 11), 320L, wqVar, 0);
        this.f14610k = new v5(new v9(this, 11), 320L, wqVar, 0);
        this.f14602a = imageView;
        this.d = System.currentTimeMillis();
        this.f14605e = jg.g.h(context, 2131232686);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        zg0 zg0Var;
        int i7;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float d = this.f14610k.d(this.h);
        float f12 = 0.0f;
        char c10 = 2;
        if (d < 1.0f) {
            float f13 = 1.0f - d;
            float f14 = (0.4f * f13) + 0.6f;
            canvas2.save();
            float f15 = centerX;
            float f16 = centerY;
            canvas2.scale(f14, f14, f15, f16);
            Drawable drawable = this.f14605e;
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, centerX, drawable), org.telegram.ui.Cells.f1.y(2, centerY, drawable), org.telegram.ui.Cells.f1.w(2, centerX, drawable), org.telegram.ui.Cells.f1.f(2, centerY, drawable));
            drawable.setAlpha((int) (f13 * 255.0f));
            drawable.draw(canvas2);
            float L = org.telegram.messenger.g0.L(14.0f);
            int r12 = m6.r1(0.2f * f13, -1);
            Paint paint = this.f14603b;
            paint.setColor(r12);
            canvas2.drawCircle(f15, f16, L, paint);
            float f17 = f13 * 1.0f;
            paint.setColor(m6.r1(f17, -1));
            float f18 = f15 - L;
            f11 = 255.0f;
            float f19 = f16 - L;
            float f20 = f15 + L;
            float f21 = f16 + L;
            RectF rectF = this.f14604c;
            rectF.set(f18, f19, f20, f21);
            float d2 = this.f14608i.d(this.f14606f);
            paint.setColor(m6.r1((1.0f - d2) * f13 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j3) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j3)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i10 = 0;
            while (i10 < 4) {
                x1.a aVar = cp.h;
                float f22 = f12;
                aVar.getInterpolation((currentTimeMillis2 - (i10 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i7 + 667)) / 667.0f) * 250.0f;
                i10++;
                f12 = f22;
                c10 = c10;
            }
            f10 = f12;
            paint.setColor(m6.r1(f17, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f14609j.e(false, this.f14607g)) * (-360.0f) * d2, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 0.0f;
            f11 = 255.0f;
        }
        if (d > f10 && (zg0Var = this.f14611l) != null) {
            int i11 = zg0Var.f40963b / 2;
            int i12 = zg0Var.f40965c / 2;
            zg0Var.setBounds(centerX - i11, centerY - i12, i11 + centerX, i12 + centerY);
            this.f14611l.setAlpha((int) (d * f11));
            this.f14611l.draw(canvas2);
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
