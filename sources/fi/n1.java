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
import c8.sa;
import di.ec;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
public final class n1 extends View {
    public long E;
    public float F;
    public final int[] G;
    public final float H;
    public final m1 f12280a;
    public final RectF f12281b;
    public final Path f12282c;
    public final ec d;
    public final org.telegram.ui.Components.d6 f12283e;
    public final org.telegram.ui.Components.d6 f12284f;
    public final org.telegram.ui.Components.n6 h;
    public final Paint f12285n;
    public final Paint f12286r;
    public final Drawable f12287s;
    public final dh.j f12288w;
    public int f12289x;
    public boolean f12290y;

    public n1(Context context, m1 m1Var, gh.b bVar) {
        super(context);
        this.f12281b = new RectF();
        this.f12282c = new Path();
        nr nrVar = nr.h;
        this.f12283e = new org.telegram.ui.Components.d6(this, 320L, nrVar);
        this.f12284f = new org.telegram.ui.Components.d6(this, 320L, nrVar);
        Paint paint = new Paint(1);
        this.f12285n = paint;
        Paint paint2 = new Paint(1);
        this.f12286r = paint2;
        this.G = new int[2];
        this.H = 1.0f;
        this.f12280a = m1Var;
        sa.a(this);
        this.f12287s = context.getResources().getDrawable(2131232750).mutate();
        dh.j jVar = new dh.j();
        this.f12288w = jVar;
        jVar.f8437a = bVar;
        jVar.a();
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.h = n6Var;
        n6Var.u(-9866632);
        n6Var.w(org.telegram.messenger.g0.L(9.0f));
        n6Var.setCallback(this);
        n6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        n6Var.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        nq nqVar = new nq(2131232750, 0);
        nqVar.I = 1.8f;
        nqVar.J = 1.8f;
        setCount(0);
        this.d = new ec(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float L = org.telegram.messenger.g0.L(38.0f);
        float d = this.f12283e.d(this.f12290y);
        if (this.f12289x > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d2 = this.f12284f.d(z10);
        RectF rectF = this.f12281b;
        rectF.set((getWidth() - L) / 2.0f, (getHeight() - L) / 2.0f, (getWidth() + L) / 2.0f, (getHeight() + L) / 2.0f);
        int f10 = i0.a.f(d, -14670806, -548067);
        Paint paint = this.f12285n;
        paint.setColor(f10);
        dh.j jVar = this.f12288w;
        jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        jVar.f8442g.setColor(f10);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(20.0f);
        Drawable drawable = this.f12287s;
        drawable.setBounds((getWidth() - L2) / 2, (getHeight() - L2) / 2, (getWidth() + L2) / 2, (getHeight() + L2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f12282c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float T1 = org.telegram.messenger.g0.T1(5.0f, 15.0f, d);
        ec ecVar = this.d;
        ecVar.h = T1;
        ecVar.g(rectF);
        ecVar.d();
        ecVar.b(canvas, -1, org.telegram.messenger.g0.T1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d2 > 0.0f) {
            org.telegram.ui.Components.n6 n6Var = this.h;
            float max = Math.max(org.telegram.messenger.g0.L(12.0f), n6Var.c() + org.telegram.messenger.g0.L(6.0f));
            float i7 = n6Var.i() * this.H * d2;
            canvas.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.scale(i7, i7, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f12286r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - n6Var.c()) / 2.0f) + rectF2.left, org.telegram.messenger.g0.L(6.33f));
            n6Var.u(i0.a.f(d, -9866632, -1));
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f12280a.c(this);
    }

    public void setCount(int i7) {
        this.f12289x = i7;
        org.telegram.ui.Components.n6 n6Var = this.h;
        if (i7 > 50000) {
            n6Var.t(org.telegram.messenger.g0.o0(i7, 0), true, true);
        } else {
            n6Var.t(hd.E(i7, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f12290y == z10) {
            return;
        }
        this.f12290y = z10;
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
