package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import b8.pf;
import ci.lc;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class w1 extends View {
    public long E;
    public float F;
    public final int[] G;
    public final float H;
    public final v1 f11165a;
    public final RectF f11166b;
    public final Path f11167c;
    public final lc d;
    public final org.telegram.ui.Components.u5 f11168e;
    public final org.telegram.ui.Components.u5 f11169f;
    public final org.telegram.ui.Components.g6 h;
    public final Paint f11170n;
    public final Paint f11171r;
    public final Drawable f11172s;
    public final eh.j f11173w;
    public int f11174x;
    public boolean f11175y;

    public w1(Context context, v1 v1Var, hh.b bVar) {
        super(context);
        this.f11166b = new RectF();
        this.f11167c = new Path();
        xq xqVar = xq.h;
        this.f11168e = new org.telegram.ui.Components.u5(this, 320L, xqVar);
        this.f11169f = new org.telegram.ui.Components.u5(this, 320L, xqVar);
        Paint paint = new Paint(1);
        this.f11170n = paint;
        Paint paint2 = new Paint(1);
        this.f11171r = paint2;
        this.G = new int[2];
        this.H = 1.0f;
        this.f11165a = v1Var;
        pf.a(this);
        this.f11172s = context.getResources().getDrawable(2131232746).mutate();
        eh.j jVar = new eh.j();
        this.f11173w = jVar;
        jVar.f10051a = bVar;
        jVar.a();
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.h = g6Var;
        g6Var.u(-9866632);
        g6Var.w(org.telegram.messenger.g0.L(9.0f));
        g6Var.setCallback(this);
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        wp wpVar = new wp(2131232746, 0);
        wpVar.I = 1.8f;
        wpVar.J = 1.8f;
        setCount(0);
        this.d = new lc(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float L = org.telegram.messenger.g0.L(38.0f);
        float d = this.f11168e.d(this.f11175y);
        if (this.f11174x > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d10 = this.f11169f.d(z10);
        RectF rectF = this.f11166b;
        rectF.set((getWidth() - L) / 2.0f, (getHeight() - L) / 2.0f, (getWidth() + L) / 2.0f, (getHeight() + L) / 2.0f);
        int f10 = i0.a.f(d, -14670806, -548067);
        Paint paint = this.f11170n;
        paint.setColor(f10);
        eh.j jVar = this.f11173w;
        jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        jVar.f10056g.setColor(f10);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(20.0f);
        Drawable drawable = this.f11172s;
        drawable.setBounds((getWidth() - L2) / 2, (getHeight() - L2) / 2, (getWidth() + L2) / 2, (getHeight() + L2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f11167c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float T1 = org.telegram.messenger.g0.T1(5.0f, 15.0f, d);
        lc lcVar = this.d;
        lcVar.h = T1;
        lcVar.g(rectF);
        lcVar.d();
        lcVar.b(canvas, -1, org.telegram.messenger.g0.T1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d10 > 0.0f) {
            org.telegram.ui.Components.g6 g6Var = this.h;
            float max = Math.max(org.telegram.messenger.g0.L(12.0f), g6Var.c() + org.telegram.messenger.g0.L(6.0f));
            float i3 = g6Var.i() * this.H * d10;
            canvas.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.scale(i3, i3, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f11171r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - g6Var.c()) / 2.0f) + rectF2.left, org.telegram.messenger.g0.L(6.33f));
            g6Var.u(i0.a.f(d, -9866632, -1));
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f11165a.c(this);
    }

    public void setCount(int i3) {
        this.f11174x = i3;
        org.telegram.ui.Components.g6 g6Var = this.h;
        if (i3 > 50000) {
            g6Var.t(org.telegram.messenger.g0.o0(i3, 0), true, true);
        } else {
            g6Var.t(bd.E(i3, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f11175y == z10) {
            return;
        }
        this.f11175y = z10;
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
