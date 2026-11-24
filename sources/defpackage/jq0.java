package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public final class jq0 extends Drawable {
    public final ImageView a;
    public final Paint b;
    public final RectF c;
    public final long d;
    public final Drawable e;
    public boolean f;
    public float g;
    public boolean h;
    public final ln i;
    public final ln j;
    public final ln k;
    public p09 l;

    public jq0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new RectF();
        this.h = false;
        f00 f00Var = new f00(this, (byte) 20);
        d53 d53Var = d53.h;
        this.i = new ln(f00Var, 320L, d53Var, 0);
        this.j = new ln(new f00(this, (byte) 20), 320L, d53Var, 0);
        this.k = new ln(new f00(this, (byte) 20), 320L, d53Var, 0);
        this.a = imageView;
        this.d = System.currentTimeMillis();
        this.e = b10.d(context, 2131232703);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        p09 p09Var;
        int i;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float d = this.k.d(this.h);
        float f3 = 0.0f;
        char c = 2;
        if (d < 1.0f) {
            float f4 = 1.0f - d;
            float f5 = (0.4f * f4) + 0.6f;
            canvas2.save();
            float f6 = centerX;
            float f7 = centerY;
            canvas2.scale(f5, f5, f6, f7);
            Drawable drawable = this.e;
            drawable.setBounds(aq1.A(2, centerX, drawable), aq1.y(2, centerY, drawable), aq1.w(2, centerX, drawable), aq1.i(2, centerY, drawable));
            drawable.setAlpha((int) (f4 * 255.0f));
            drawable.draw(canvas2);
            float L = gm.L(14.0f);
            int p1 = cmb.p1(0.2f * f4, -1);
            Paint paint = this.b;
            paint.setColor(p1);
            canvas2.drawCircle(f6, f7, L, paint);
            float f8 = f4 * 1.0f;
            paint.setColor(cmb.p1(f8, -1));
            float f9 = f6 - L;
            f2 = 255.0f;
            float f10 = f7 - L;
            float f11 = f6 + L;
            float f12 = f7 + L;
            RectF rectF = this.c;
            rectF.set(f9, f10, f11, f12);
            float d2 = this.i.d(this.f);
            paint.setColor(cmb.p1((1.0f - d2) * f4 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i2 = 0;
            while (i2 < 4) {
                l94 l94Var = wi2.h;
                float f13 = f3;
                l94Var.getInterpolation((currentTimeMillis2 - (i2 * 1350)) / 667.0f);
                max += l94Var.getInterpolation((currentTimeMillis2 - (i + 667)) / 667.0f) * 250.0f;
                i2++;
                f3 = f13;
                c = c;
            }
            f = f3;
            paint.setColor(cmb.p1(f8, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.j.e(false, this.g)) * (-360.0f) * d2, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f = 0.0f;
            f2 = 255.0f;
        }
        if (d > f && (p09Var = this.l) != null) {
            int i3 = p09Var.b / 2;
            int i4 = p09Var.c / 2;
            p09Var.setBounds(centerX - i3, centerY - i4, i3 + centerX, i4 + centerY);
            this.l.setAlpha((int) (d * f2));
            this.l.draw(canvas2);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(40.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(40.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
