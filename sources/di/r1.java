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
import org.telegram.ui.Components.wq;
public final class r1 extends View {
    public long D;
    public float E;
    public final int[] F;
    public final float G;
    public final q1 f9670a;
    public final RectF f9671b;
    public final Path f9672c;
    public final ud d;
    public final org.telegram.ui.Components.v5 f9673e;
    public final org.telegram.ui.Components.v5 f9674f;
    public final org.telegram.ui.Components.h6 h;
    public final Paint f9675n;
    public final Paint f9676r;
    public final Drawable f9677s;
    public final dh.j f9678w;
    public int f9679x;
    public boolean f9680y;

    public r1(Context context, q1 q1Var, gh.b bVar) {
        super(context);
        this.f9671b = new RectF();
        this.f9672c = new Path();
        wq wqVar = wq.h;
        this.f9673e = new org.telegram.ui.Components.v5(this, 320L, wqVar);
        this.f9674f = new org.telegram.ui.Components.v5(this, 320L, wqVar);
        Paint paint = new Paint(1);
        this.f9675n = paint;
        Paint paint2 = new Paint(1);
        this.f9676r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f9670a = q1Var;
        ka.a(this);
        this.f9677s = context.getResources().getDrawable(2131232748).mutate();
        dh.j jVar = new dh.j();
        this.f9678w = jVar;
        jVar.f8776a = bVar;
        jVar.a();
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(false, true, true);
        this.h = h6Var;
        h6Var.u(-9866632);
        h6Var.w(org.telegram.messenger.g0.L(9.0f));
        h6Var.setCallback(this);
        h6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        h6Var.J = true;
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
        float d = this.f9673e.d(this.f9680y);
        if (this.f9679x > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float d2 = this.f9674f.d(z9);
        RectF rectF = this.f9671b;
        rectF.set((getWidth() - L) / 2.0f, (getHeight() - L) / 2.0f, (getWidth() + L) / 2.0f, (getHeight() + L) / 2.0f);
        int f10 = i0.a.f(d, -14670806, -548067);
        Paint paint = this.f9675n;
        paint.setColor(f10);
        dh.j jVar = this.f9678w;
        jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        jVar.f8781g.setColor(f10);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(20.0f);
        Drawable drawable = this.f9677s;
        drawable.setBounds((getWidth() - L2) / 2, (getHeight() - L2) / 2, (getWidth() + L2) / 2, (getHeight() + L2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f9672c;
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
            org.telegram.ui.Components.h6 h6Var = this.h;
            float max = Math.max(org.telegram.messenger.g0.L(12.0f), h6Var.c() + org.telegram.messenger.g0.L(6.0f));
            float i7 = h6Var.i() * this.G * d2;
            canvas.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.scale(i7, i7, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f9676r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - h6Var.c()) / 2.0f) + rectF2.left, org.telegram.messenger.g0.L(6.33f));
            h6Var.u(i0.a.f(d, -9866632, -1));
            h6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f9670a.c(this);
    }

    public void setCount(int i7) {
        this.f9679x = i7;
        org.telegram.ui.Components.h6 h6Var = this.h;
        if (i7 > 50000) {
            h6Var.t(org.telegram.messenger.g0.o0(i7, 0), true, true);
        } else {
            h6Var.t(id.E(i7, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z9) {
        if (this.f9680y == z9) {
            return;
        }
        this.f9680y = z9;
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
