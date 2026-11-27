package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class cv7 extends View {
    public long E;
    public float F;
    public final int[] G;
    public final float H;
    public final bv7 a;
    public final RectF b;
    public final Path c;
    public final yza d;
    public final mm e;
    public final mm f;
    public final hn h;
    public final Paint n;
    public final Paint r;
    public final Drawable s;
    public final sdb w;
    public int x;
    public boolean y;

    public cv7(Context context, bv7 bv7Var, cl0 cl0Var) {
        super(context);
        this.b = new RectF();
        this.c = new Path();
        k43 k43Var = k43.h;
        this.e = new mm(320L, this, k43Var);
        this.f = new mm(320L, this, k43Var);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.G = new int[2];
        this.H = 1.0f;
        this.a = bv7Var;
        iye.a(this);
        this.s = context.getResources().getDrawable(2131232771).mutate();
        sdb sdbVar = new sdb();
        this.w = sdbVar;
        sdbVar.a = cl0Var;
        sdbVar.a();
        hn hnVar = new hn(false, true, true);
        this.h = hnVar;
        hnVar.u(-9866632);
        hnVar.w(hl.L(9.0f));
        hnVar.setCallback(this);
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        wm2 wm2Var = new wm2(2131232771, 0);
        wm2Var.I = 1.8f;
        wm2Var.J = 1.8f;
        setCount(0);
        this.d = new yza(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        float L = hl.L(38.0f);
        float d = this.e.d(this.y);
        if (this.x > 0) {
            z = true;
        } else {
            z = false;
        }
        float d2 = this.f.d(z);
        RectF rectF = this.b;
        rectF.set((getWidth() - L) / 2.0f, (getHeight() - L) / 2.0f, (getWidth() + L) / 2.0f, (getHeight() + L) / 2.0f);
        int f = vm2.f(d, -14670806, -548067);
        Paint paint = this.n;
        paint.setColor(f);
        sdb sdbVar = this.w;
        sdbVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        sdbVar.g.setColor(f);
        sdbVar.invalidateSelf();
        sdbVar.draw(canvas);
        int L2 = hl.L(20.0f);
        Drawable drawable = this.s;
        drawable.setBounds((getWidth() - L2) / 2, (getHeight() - L2) / 2, (getWidth() + L2) / 2, (getHeight() + L2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float R1 = hl.R1(5.0f, 15.0f, d);
        yza yzaVar = this.d;
        yzaVar.h = R1;
        yzaVar.g(rectF);
        yzaVar.d();
        yzaVar.b(canvas, -1, hl.R1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d2 > 0.0f) {
            hn hnVar = this.h;
            float max = Math.max(hl.L(12.0f), hnVar.c() + hl.L(6.0f));
            float i = hnVar.i() * this.H * d2;
            canvas.save();
            RectF rectF2 = hl.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), hl.L(13.0f));
            canvas.scale(i, i, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-hl.L(2.0f), -hl.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), hl.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - hnVar.c()) / 2.0f) + rectF2.left, hl.L(6.33f));
            hnVar.u(vm2.f(d, -9866632, -1));
            hnVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.c(this);
    }

    public void setCount(int i) {
        this.x = i;
        hn hnVar = this.h;
        if (i > 50000) {
            hnVar.t(hl.o0(i, 0), true, true);
        } else {
            hnVar.t(ob6.E(i, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z) {
        if (this.y == z) {
            return;
        }
        this.y = z;
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
