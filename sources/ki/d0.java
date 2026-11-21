package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.up;
public final class d0 extends Drawable {
    public final ImageView f18640a;
    public final Paint f18641b;
    public final RectF f18642c;
    public final long d;
    public final Drawable f18643e;
    public boolean f18644f;
    public float f18645g;
    public boolean h;
    public final d6 f18646i;
    public final d6 f18647j;
    public final d6 f18648k;
    public oh0 f18649l;

    public d0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f18641b = paint;
        this.f18642c = new RectF();
        this.h = false;
        kg.i0 i0Var = new kg.i0(this, 7);
        nr nrVar = nr.h;
        this.f18646i = new d6(i0Var, 320L, nrVar, 0);
        this.f18647j = new d6(new kg.i0(this, 7), 320L, nrVar, 0);
        this.f18648k = new d6(new kg.i0(this, 7), 320L, nrVar, 0);
        this.f18640a = imageView;
        this.d = System.currentTimeMillis();
        this.f18643e = i5.c.g(context, 2131232688);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        oh0 oh0Var;
        int i7;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float d = this.f18648k.d(this.h);
        float f12 = 0.0f;
        char c10 = 2;
        if (d < 1.0f) {
            float f13 = 1.0f - d;
            float f14 = (0.4f * f13) + 0.6f;
            canvas2.save();
            float f15 = centerX;
            float f16 = centerY;
            canvas2.scale(f14, f14, f15, f16);
            Drawable drawable = this.f18643e;
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, centerX, drawable), org.telegram.ui.Cells.c0.A(2, centerY, drawable), org.telegram.ui.Cells.c0.y(2, centerX, drawable), org.telegram.ui.Cells.c0.j(2, centerY, drawable));
            drawable.setAlpha((int) (f13 * 255.0f));
            drawable.draw(canvas2);
            float L = org.telegram.messenger.g0.L(14.0f);
            int r12 = m6.r1(0.2f * f13, -1);
            Paint paint = this.f18641b;
            paint.setColor(r12);
            canvas2.drawCircle(f15, f16, L, paint);
            float f17 = f13 * 1.0f;
            paint.setColor(m6.r1(f17, -1));
            float f18 = f15 - L;
            f11 = 255.0f;
            float f19 = f16 - L;
            float f20 = f15 + L;
            float f21 = f16 + L;
            RectF rectF = this.f18642c;
            rectF.set(f18, f19, f20, f21);
            float d2 = this.f18646i.d(this.f18644f);
            paint.setColor(m6.r1((1.0f - d2) * f13 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j3) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j3)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i10 = 0;
            while (i10 < 4) {
                x1.a aVar = up.h;
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
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f18647j.e(false, this.f18645g)) * (-360.0f) * d2, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 0.0f;
            f11 = 255.0f;
        }
        if (d > f10 && (oh0Var = this.f18649l) != null) {
            int i11 = oh0Var.f38212b / 2;
            int i12 = oh0Var.f38214c / 2;
            oh0Var.setBounds(centerX - i11, centerY - i12, i11 + centerX, i12 + centerY);
            this.f18649l.setAlpha((int) (d * f11));
            this.f18649l.draw(canvas2);
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
