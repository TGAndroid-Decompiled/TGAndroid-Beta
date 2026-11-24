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
public final class mg2 extends Drawable {
    public final wjb a;
    public final Paint b = new Paint(1);
    public final Paint c;
    public final Drawable d;
    public final RectF e;
    public final gn f;
    public final gn g;
    public final Paint h;
    public final Path i;
    public final Drawable j;
    public int k;
    public boolean l;
    public final lm m;

    public mg2(ContextThemeWrapper contextThemeWrapper, int i, wjb wjbVar) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new RectF();
        gn gnVar = new gn(false, false, false);
        this.f = gnVar;
        gn gnVar2 = new gn(false, false, false);
        this.g = gnVar2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.i = path;
        this.m = new lm(new hq1(this, (byte) 28), 320L, s33.h, 0);
        in inVar = new in(this, (byte) 2);
        this.a = wjbVar;
        this.d = contextThemeWrapper.getResources().getDrawable(i).mutate();
        this.j = contextThemeWrapper.getResources().getDrawable(2131231940).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.u(-16777216);
        gnVar.w(gl.L(7.0f));
        gnVar.setCallback(inVar);
        gnVar.b = 17;
        Point point = gl.q;
        gnVar.N = point.x;
        gnVar2.x(gl.n1("fonts/num.otf"));
        gnVar2.u(-16777216);
        gnVar2.w(gl.L(7.0f));
        gnVar2.setCallback(inVar);
        gnVar2.b = 17;
        gnVar2.N = point.x;
        RectF rectF = gl.P;
        rectF.set(gl.L(0.66f), gl.L(4.0f), gl.L(13.0f), gl.L(13.33f));
        path.addRoundRect(rectF, gl.L(2.66f), gl.L(2.66f), Path.Direction.CW);
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
        gn gnVar = this.f;
        float c = gnVar.c() + (gnVar.i() * gl.L(5.0f));
        gn gnVar2 = this.g;
        float c2 = gnVar2.c() + (gnVar2.i() * gl.L(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i2 = (c > 0.0f ? 1 : (c == 0.0f ? 0 : -1));
        if (i2 <= 0 && c2 <= 0.0f && d <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        }
        Rect rect = gl.Q;
        rect.set(gl.L(6.0f), gl.L(6.0f), (bounds.width() + gl.L(6.0f)) - gl.L(12.0f), (bounds.height() + gl.L(6.0f)) - gl.L(12.0f));
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
        float L = gl.L(10.0f);
        Paint paint2 = this.c;
        RectF rectF = this.e;
        if (i2 > 0) {
            f = L;
            float f5 = f / 2.0f;
            f2 = height;
            f3 = height2;
            rectF.set(width - c, f2 - f5, width, f2 + f5);
            canvas2.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), paint2);
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
            canvas2.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), paint2);
        } else {
            i = i3;
        }
        float f7 = 1.0f - d;
        if (c * f7 > 0.0f) {
            paint.setAlpha((int) (gnVar.i() * 255.0f * f7));
            gnVar.C = (int) (gnVar.i() * 255.0f * f7);
            float f8 = f / 2.0f;
            rectF.set(width - c, f2 - f8, width, f2 + f8);
            rectF.inset(gl.L(1.0f), gl.L(1.0f));
            canvas2.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), paint);
            rectF.inset(-gl.L(1.0f), -gl.L(1.0f));
            gnVar.p(rectF);
            gnVar.draw(canvas2);
        }
        if (d > 0.0f) {
            canvas2.save();
            int v0 = bkb.v0(bkb.Ei, this.a);
            int i4 = this.k;
            Drawable drawable2 = this.j;
            if (i4 != v0) {
                this.k = v0;
                drawable2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            f4 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - gl.L(3.0f), gl.L(0.66f) + bounds.top, bounds.right - gl.L(3.0f), drawable2.getIntrinsicHeight() + gl.L(0.66f) + bounds.top);
            drawable2.setAlpha((int) (d * 255.0f));
            float R1 = gl.R1(0.8f, 1.0f, d);
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
            paint.setAlpha((int) (gnVar2.i() * f4));
            gnVar2.C = (int) (gnVar2.i() * f4);
            float f9 = f / 2.0f;
            rectF.set(width - c2, f3 - f9, width, f3 + f9);
            rectF.inset(gl.L(1.0f), gl.L(1.0f));
            canvas2.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), paint);
            rectF.inset(-gl.L(1.0f), -gl.L(1.0f));
            gnVar2.p(rectF);
            gnVar2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public final int getIntrinsicHeight() {
        return gl.L(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return gl.L(12.0f) + this.d.getIntrinsicWidth();
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
