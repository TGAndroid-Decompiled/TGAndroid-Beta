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
public final class ai2 extends Drawable {
    public final ylb a;
    public final Paint b = new Paint(1);
    public final Paint c;
    public final Drawable d;
    public final RectF e;
    public final ho f;
    public final ho g;
    public final Paint h;
    public final Path i;
    public final Drawable j;
    public int k;
    public boolean l;
    public final ln m;

    public ai2(ContextThemeWrapper contextThemeWrapper, int i, ylb ylbVar) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new RectF();
        ho hoVar = new ho(false, false, false);
        this.f = hoVar;
        ho hoVar2 = new ho(false, false, false);
        this.g = hoVar2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.i = path;
        this.m = new ln(new xf2(this, (byte) 3), 320L, d53.h, 0);
        jo joVar = new jo(this, (byte) 2);
        this.a = ylbVar;
        this.d = contextThemeWrapper.getResources().getDrawable(i).mutate();
        this.j = contextThemeWrapper.getResources().getDrawable(2131231941).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        hoVar.x(gm.n1("fonts/num.otf"));
        hoVar.u(-16777216);
        hoVar.w(gm.L(7.0f));
        hoVar.setCallback(joVar);
        hoVar.b = 17;
        Point point = gm.q;
        hoVar.N = point.x;
        hoVar2.x(gm.n1("fonts/num.otf"));
        hoVar2.u(-16777216);
        hoVar2.w(gm.L(7.0f));
        hoVar2.setCallback(joVar);
        hoVar2.b = 17;
        hoVar2.N = point.x;
        RectF rectF = gm.P;
        rectF.set(gm.L(0.66f), gm.L(4.0f), gm.L(13.0f), gm.L(13.33f));
        path.addRoundRect(rectF, gm.L(2.66f), gm.L(2.66f), Path.Direction.CW);
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
        ho hoVar = this.f;
        float c = hoVar.c() + (hoVar.i() * gm.L(5.0f));
        ho hoVar2 = this.g;
        float c2 = hoVar2.c() + (hoVar2.i() * gm.L(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i2 = (c > 0.0f ? 1 : (c == 0.0f ? 0 : -1));
        if (i2 <= 0 && c2 <= 0.0f && d <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        }
        Rect rect = gm.Q;
        rect.set(gm.L(6.0f), gm.L(6.0f), (bounds.width() + gm.L(6.0f)) - gm.L(12.0f), (bounds.height() + gm.L(6.0f)) - gm.L(12.0f));
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
        float L = gm.L(10.0f);
        Paint paint2 = this.c;
        RectF rectF = this.e;
        if (i2 > 0) {
            f = L;
            float f5 = f / 2.0f;
            f2 = height;
            f3 = height2;
            rectF.set(width - c, f2 - f5, width, f2 + f5);
            canvas2.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), paint2);
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
            canvas2.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), paint2);
        } else {
            i = i3;
        }
        float f7 = 1.0f - d;
        if (c * f7 > 0.0f) {
            paint.setAlpha((int) (hoVar.i() * 255.0f * f7));
            hoVar.C = (int) (hoVar.i() * 255.0f * f7);
            float f8 = f / 2.0f;
            rectF.set(width - c, f2 - f8, width, f2 + f8);
            rectF.inset(gm.L(1.0f), gm.L(1.0f));
            canvas2.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), paint);
            rectF.inset(-gm.L(1.0f), -gm.L(1.0f));
            hoVar.p(rectF);
            hoVar.draw(canvas2);
        }
        if (d > 0.0f) {
            canvas2.save();
            int v0 = cmb.v0(cmb.Ei, this.a);
            int i4 = this.k;
            Drawable drawable2 = this.j;
            if (i4 != v0) {
                this.k = v0;
                drawable2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            f4 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - gm.L(3.0f), gm.L(0.66f) + bounds.top, bounds.right - gm.L(3.0f), drawable2.getIntrinsicHeight() + gm.L(0.66f) + bounds.top);
            drawable2.setAlpha((int) (d * 255.0f));
            float R1 = gm.R1(0.8f, 1.0f, d);
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
            paint.setAlpha((int) (hoVar2.i() * f4));
            hoVar2.C = (int) (hoVar2.i() * f4);
            float f9 = f / 2.0f;
            rectF.set(width - c2, f3 - f9, width, f3 + f9);
            rectF.inset(gm.L(1.0f), gm.L(1.0f));
            canvas2.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), paint);
            rectF.inset(-gm.L(1.0f), -gm.L(1.0f));
            hoVar2.p(rectF);
            hoVar2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(12.0f) + this.d.getIntrinsicWidth();
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
