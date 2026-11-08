package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import bi.ud;
import c8.ka;
import org.telegram.messenger.id;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class r1 extends View {
    public long D;
    public float E;
    public final int[] F;
    public final float G;
    public final q1 f9678a;
    public final RectF f9679b;
    public final Path f9680c;
    public final ud d;
    public final org.telegram.ui.Components.w5 f9681e;
    public final org.telegram.ui.Components.w5 f9682f;
    public final org.telegram.ui.Components.i6 h;
    public final Paint f9683n;
    public final Paint f9684r;
    public final Drawable f9685s;
    public final dh.j f9686w;
    public int f9687x;
    public boolean f9688y;

    public r1(Context context, q1 q1Var, gh.b bVar) {
        super(context);
        this.f9679b = new RectF();
        this.f9680c = new Path();
        xq xqVar = xq.h;
        this.f9681e = new org.telegram.ui.Components.w5(this, 320L, xqVar);
        this.f9682f = new org.telegram.ui.Components.w5(this, 320L, xqVar);
        Paint paint = new Paint(1);
        this.f9683n = paint;
        Paint paint2 = new Paint(1);
        this.f9684r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f9678a = q1Var;
        ka.a(this);
        this.f9685s = context.getResources().getDrawable(2131232748).mutate();
        dh.j jVar = new dh.j();
        this.f9686w = jVar;
        jVar.f8773a = bVar;
        jVar.a();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.h = i6Var;
        i6Var.u(-9866632);
        i6Var.w(org.telegram.messenger.g0.L(9.0f));
        i6Var.setCallback(this);
        i6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        wp wpVar = new wp(2131232748, 0);
        wpVar.H = 1.8f;
        wpVar.I = 1.8f;
        setCount(0);
        this.d = new ud(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        float L = org.telegram.messenger.g0.L(38.0f);
        float d = this.f9681e.d(this.f9688y);
        if (this.f9687x > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float d2 = this.f9682f.d(z9);
        RectF rectF = this.f9679b;
        rectF.set((getWidth() - L) / 2.0f, (getHeight() - L) / 2.0f, (getWidth() + L) / 2.0f, (getHeight() + L) / 2.0f);
        int f10 = i0.a.f(d, -14670806, -548067);
        Paint paint = this.f9683n;
        paint.setColor(f10);
        dh.j jVar = this.f9686w;
        jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        jVar.f8778g.setColor(f10);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(20.0f);
        Drawable drawable = this.f9685s;
        drawable.setBounds((getWidth() - L2) / 2, (getHeight() - L2) / 2, (getWidth() + L2) / 2, (getHeight() + L2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f9680c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float T1 = org.telegram.messenger.g0.T1(5.0f, 15.0f, d);
        ud udVar = this.d;
        udVar.h = T1;
        udVar.g(rectF);
        udVar.d();
        udVar.b(canvas, -1, org.telegram.messenger.g0.T1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d2 > 0.0f) {
            org.telegram.ui.Components.i6 i6Var = this.h;
            float max = Math.max(org.telegram.messenger.g0.L(12.0f), i6Var.c() + org.telegram.messenger.g0.L(6.0f));
            float i7 = i6Var.i() * this.G * d2;
            canvas.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.scale(i7, i7, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f9684r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - i6Var.c()) / 2.0f) + rectF2.left, org.telegram.messenger.g0.L(6.33f));
            i6Var.u(i0.a.f(d, -9866632, -1));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f9678a.c(this);
    }

    public void setCount(int i7) {
        this.f9687x = i7;
        org.telegram.ui.Components.i6 i6Var = this.h;
        if (i7 > 50000) {
            i6Var.t(org.telegram.messenger.g0.o0(i7, 0), true, true);
        } else {
            i6Var.t(id.E(i7, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z9) {
        if (this.f9688y == z9) {
            return;
        }
        this.f9688y = z9;
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
