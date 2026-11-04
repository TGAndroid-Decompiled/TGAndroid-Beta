package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import gi.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
public final class f0 extends Drawable {
    public final ImageView f14925a;
    public final Paint f14926b;
    public final RectF f14927c;
    public final long d;
    public final Drawable f14928e;
    public boolean f14929f;
    public float f14930g;
    public boolean h;
    public final u5 f14931i;
    public final u5 f14932j;
    public final u5 f14933k;
    public ch0 f14934l;

    public f0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f14926b = paint;
        this.f14927c = new RectF();
        this.h = false;
        f6 f6Var = new f6(this, 15);
        xq xqVar = xq.h;
        this.f14931i = new u5(f6Var, 320L, xqVar, 0);
        this.f14932j = new u5(new f6(this, 15), 320L, xqVar, 0);
        this.f14933k = new u5(new f6(this, 15), 320L, xqVar, 0);
        this.f14925a = imageView;
        this.d = System.currentTimeMillis();
        this.f14928e = k2.p1.g(context, 2131232684);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        ch0 ch0Var;
        int i3;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float d = this.f14933k.d(this.h);
        float f12 = 0.0f;
        char c2 = 2;
        if (d < 1.0f) {
            float f13 = 1.0f - d;
            float f14 = (0.4f * f13) + 0.6f;
            canvas2.save();
            float f15 = centerX;
            float f16 = centerY;
            canvas2.scale(f14, f14, f15, f16);
            Drawable drawable = this.f14928e;
            drawable.setBounds(org.telegram.ui.Cells.f1.C(2, centerX, drawable), org.telegram.ui.Cells.f1.B(2, centerY, drawable), org.telegram.ui.Cells.f1.z(2, centerX, drawable), org.telegram.ui.Cells.f1.i(2, centerY, drawable));
            drawable.setAlpha((int) (f13 * 255.0f));
            drawable.draw(canvas2);
            float L = org.telegram.messenger.g0.L(14.0f);
            int r12 = k6.r1(0.2f * f13, -1);
            Paint paint = this.f14926b;
            paint.setColor(r12);
            canvas2.drawCircle(f15, f16, L, paint);
            float f17 = f13 * 1.0f;
            paint.setColor(k6.r1(f17, -1));
            float f18 = f15 - L;
            f11 = 255.0f;
            float f19 = f16 - L;
            float f20 = f15 + L;
            float f21 = f16 + L;
            RectF rectF = this.f14927c;
            rectF.set(f18, f19, f20, f21);
            float d10 = this.f14931i.d(this.f14929f);
            paint.setColor(k6.r1((1.0f - d10) * f13 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j10) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j10)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i10 = 0;
            while (i10 < 4) {
                w1.a aVar = cp.h;
                float f22 = f12;
                aVar.getInterpolation((currentTimeMillis2 - (i10 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i3 + 667)) / 667.0f) * 250.0f;
                i10++;
                f12 = f22;
                c2 = c2;
            }
            f10 = f12;
            paint.setColor(k6.r1(f17, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f14932j.e(false, this.f14930g)) * (-360.0f) * d10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 0.0f;
            f11 = 255.0f;
        }
        if (d > f10 && (ch0Var = this.f14934l) != null) {
            int i11 = ch0Var.f32720b / 2;
            int i12 = ch0Var.f32722c / 2;
            ch0Var.setBounds(centerX - i11, centerY - i12, i11 + centerX, i12 + centerY);
            this.f14934l.setAlpha((int) (d * f11));
            this.f14934l.draw(canvas2);
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
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
