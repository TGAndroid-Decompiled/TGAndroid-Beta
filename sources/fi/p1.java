package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import c8.na;
import di.ac;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
public final class p1 extends View {
    public long E;
    public float F;
    public final int[] G;
    public final float H;
    public final o1 f12159a;
    public final RectF f12160b;
    public final Path f12161c;
    public final ac d;
    public final org.telegram.ui.Components.u5 f12162e;
    public final org.telegram.ui.Components.u5 f12163f;
    public final org.telegram.ui.Components.g6 h;
    public final Paint f12164n;
    public final Paint f12165r;
    public final Drawable f12166s;
    public final dh.j f12167w;
    public int f12168x;
    public boolean f12169y;

    public p1(Context context, o1 o1Var, gh.b bVar) {
        super(context);
        this.f12160b = new RectF();
        this.f12161c = new Path();
        er erVar = er.h;
        this.f12162e = new org.telegram.ui.Components.u5(this, 320L, erVar);
        this.f12163f = new org.telegram.ui.Components.u5(this, 320L, erVar);
        Paint paint = new Paint(1);
        this.f12164n = paint;
        Paint paint2 = new Paint(1);
        this.f12165r = paint2;
        this.G = new int[2];
        this.H = 1.0f;
        this.f12159a = o1Var;
        na.a(this);
        this.f12166s = context.getResources().getDrawable(2131232749).mutate();
        dh.j jVar = new dh.j();
        this.f12167w = jVar;
        jVar.f8163a = bVar;
        jVar.a();
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.h = g6Var;
        g6Var.u(-9866632);
        g6Var.w(org.telegram.messenger.g0.L(9.0f));
        g6Var.setCallback(this);
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        eq eqVar = new eq(2131232749, 0);
        eqVar.I = 1.8f;
        eqVar.J = 1.8f;
        setCount(0);
        this.d = new ac(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float L = org.telegram.messenger.g0.L(38.0f);
        float d = this.f12162e.d(this.f12169y);
        if (this.f12168x > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d2 = this.f12163f.d(z10);
        RectF rectF = this.f12160b;
        rectF.set((getWidth() - L) / 2.0f, (getHeight() - L) / 2.0f, (getWidth() + L) / 2.0f, (getHeight() + L) / 2.0f);
        int f10 = i0.a.f(d, -14670806, -548067);
        Paint paint = this.f12164n;
        paint.setColor(f10);
        dh.j jVar = this.f12167w;
        jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        jVar.f8168g.setColor(f10);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(20.0f);
        Drawable drawable = this.f12166s;
        drawable.setBounds((getWidth() - L2) / 2, (getHeight() - L2) / 2, (getWidth() + L2) / 2, (getHeight() + L2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f12161c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float T1 = org.telegram.messenger.g0.T1(5.0f, 15.0f, d);
        ac acVar = this.d;
        acVar.h = T1;
        acVar.g(rectF);
        acVar.d();
        acVar.b(canvas, -1, org.telegram.messenger.g0.T1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d2 > 0.0f) {
            org.telegram.ui.Components.g6 g6Var = this.h;
            float max = Math.max(org.telegram.messenger.g0.L(12.0f), g6Var.c() + org.telegram.messenger.g0.L(6.0f));
            float i7 = g6Var.i() * this.H * d2;
            canvas.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.scale(i7, i7, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f12165r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - g6Var.c()) / 2.0f) + rectF2.left, org.telegram.messenger.g0.L(6.33f));
            g6Var.u(i0.a.f(d, -9866632, -1));
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f12159a.c(this);
    }

    public void setCount(int i7) {
        this.f12168x = i7;
        org.telegram.ui.Components.g6 g6Var = this.h;
        if (i7 > 50000) {
            g6Var.t(org.telegram.messenger.g0.o0(i7, 0), true, true);
        } else {
            g6Var.t(hd.E(i7, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f12169y == z10) {
            return;
        }
        this.f12169y = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
