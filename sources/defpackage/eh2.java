package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
public final class eh2 extends Drawable {
    public final vnb a;
    public final Paint b = new Paint(1);
    public final Paint c;
    public final Drawable d;
    public final RectF e;
    public final hn f;
    public final hn g;
    public final Paint h;
    public final Path i;
    public final Drawable j;
    public int k;
    public boolean l;
    public final mm m;

    public eh2(ContextThemeWrapper contextThemeWrapper, int i, vnb vnbVar) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new RectF();
        hn hnVar = new hn(false, false, false);
        this.f = hnVar;
        hn hnVar2 = new hn(false, false, false);
        this.g = hnVar2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.i = path;
        this.m = new mm(new vd2(this, (byte) 4), 320L, k43.h, 0);
        jn jnVar = new jn(this, (byte) 2);
        this.a = vnbVar;
        this.d = contextThemeWrapper.getResources().getDrawable(i).mutate();
        this.j = contextThemeWrapper.getResources().getDrawable(2131231940).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.u(-16777216);
        hnVar.w(hl.L(7.0f));
        hnVar.setCallback(jnVar);
        hnVar.b = 17;
        Point point = hl.q;
        hnVar.N = point.x;
        hnVar2.x(hl.n1("fonts/num.otf"));
        hnVar2.u(-16777216);
        hnVar2.w(hl.L(7.0f));
        hnVar2.setCallback(jnVar);
        hnVar2.b = 17;
        hnVar2.N = point.x;
        RectF rectF = hl.P;
        rectF.set(hl.L(0.66f), hl.L(4.0f), hl.L(13.0f), hl.L(13.33f));
        path.addRoundRect(rectF, hl.L(2.66f), hl.L(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float d = this.m.d(this.l);
        hn hnVar = this.f;
        float c = hnVar.c() + (hnVar.i() * hl.L(5.0f));
        hn hnVar2 = this.g;
        float c2 = hnVar2.c() + (hnVar2.i() * hl.L(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i2 = (c > 0.0f ? 1 : (c == 0.0f ? 0 : -1));
        if (i2 <= 0 && c2 <= 0.0f && d <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        }
        Rect rect = hl.Q;
        rect.set(hl.L(6.0f), hl.L(6.0f), (bounds.width() + hl.L(6.0f)) - hl.L(12.0f), (bounds.height() + hl.L(6.0f)) - hl.L(12.0f));
        rect.offset(bounds.left, bounds.top);
        Drawable drawable = this.d;
        drawable.setBounds(rect);
        canvas2.save();
        canvas2.rotate(-0.0f, bounds.centerX(), bounds.centerY());
        drawable.draw(canvas2);
        canvas2.restore();
        Paint paint = this.b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float L = hl.L(10.0f);
        Paint paint2 = this.c;
        RectF rectF = this.e;
        if (i2 > 0) {
            f = L;
            float f5 = f / 2.0f;
            f2 = height;
            f3 = height2;
            rectF.set(width - c, f2 - f5, width, f2 + f5);
            canvas2.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), paint2);
        } else {
            f = L;
            f2 = height;
            f3 = height2;
        }
        int i3 = (c2 > 0.0f ? 1 : (c2 == 0.0f ? 0 : -1));
        if (i3 > 0) {
            float f6 = f / 2.0f;
            i = i3;
            rectF.set(width - c2, f3 - f6, width, f3 + f6);
            canvas2.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), paint2);
        } else {
            i = i3;
        }
        float f7 = 1.0f - d;
        if (c * f7 > 0.0f) {
            paint.setAlpha((int) (hnVar.i() * 255.0f * f7));
            hnVar.C = (int) (hnVar.i() * 255.0f * f7);
            float f8 = f / 2.0f;
            rectF.set(width - c, f2 - f8, width, f2 + f8);
            rectF.inset(hl.L(1.0f), hl.L(1.0f));
            canvas2.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), paint);
            rectF.inset(-hl.L(1.0f), -hl.L(1.0f));
            hnVar.p(rectF);
            hnVar.draw(canvas2);
        }
        if (d > 0.0f) {
            canvas2.save();
            int v0 = aob.v0(aob.Fi, this.a);
            int i4 = this.k;
            Drawable drawable2 = this.j;
            if (i4 != v0) {
                this.k = v0;
                drawable2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            f4 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - hl.L(3.0f), hl.L(0.66f) + bounds.top, bounds.right - hl.L(3.0f), drawable2.getIntrinsicHeight() + hl.L(0.66f) + bounds.top);
            drawable2.setAlpha((int) (d * 255.0f));
            float R1 = hl.R1(0.8f, 1.0f, d);
            canvas2.scale(R1, R1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (d > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f4 = 255.0f;
        }
        if (i > 0) {
            paint.setAlpha((int) (hnVar2.i() * f4));
            hnVar2.C = (int) (hnVar2.i() * f4);
            float f9 = f / 2.0f;
            rectF.set(width - c2, f3 - f9, width, f3 + f9);
            rectF.inset(hl.L(1.0f), hl.L(1.0f));
            canvas2.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), paint);
            rectF.inset(-hl.L(1.0f), -hl.L(1.0f));
            hnVar2.p(rectF);
            hnVar2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return hl.L(12.0f) + this.d.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
