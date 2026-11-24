package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class k3c extends View {
    public final p09 a;
    public final ho b;
    public final Paint c;
    public final Paint d;
    public final u51 e;
    public boolean f;
    public final ln h;

    public k3c(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new u51(this);
        d53 d53Var = d53.h;
        this.h = new ln(this, 0L, 240L, d53Var);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.N(2.66f));
        paint.setShadowLayer(gm.N(3.0f), 0.0f, gm.L(1.66f), 805306368);
        paint2.setColor(855638016);
        p09 p09Var = new p09(2131624043, gm.L(48.0f), gm.L(48.0f), true, null);
        this.a = p09Var;
        p09Var.M(this);
        p09Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        p09Var.h = true;
        p09Var.K(0);
        p09Var.E(true);
        p09Var.start();
        ho hoVar = new ho(true, true, false);
        this.b = hoVar;
        hoVar.n(0.3f, 250L, d53Var);
        hoVar.N = gm.q.x;
        hoVar.w(gm.L(14.0f));
        hoVar.u(-1);
        hoVar.s(gm.N(1.33f), gm.L(1.0f), 1073741824);
        hoVar.t(jb6.M0(2131743632, null), true, true);
        hoVar.b = 17;
    }

    public final void a(boolean z, boolean z2) {
        int i;
        this.e.c(z);
        if (!z && !z2) {
            i = 2131743632;
        } else {
            i = 2131743631;
        }
        boolean z3 = true;
        this.b.t(jb6.M0(i, null), true, true);
        int i2 = 0;
        if (!z || z2) {
            z3 = false;
        }
        this.f = z3;
        p09 p09Var = this.a;
        if (z3) {
            if (p09Var.b0 > 34) {
                p09Var.I(0, false, false);
            }
            p09Var.K(33);
            p09Var.start();
        } else {
            if (z2) {
                i2 = 66;
            }
            p09Var.K(i2);
            p09Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = gm.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f) * gm.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.c);
        float L2 = gm.L(48.0f) / 2.0f;
        p09 p09Var = this.a;
        p09Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        p09Var.draw(canvas);
        int width2 = getWidth();
        int height2 = getHeight();
        ho hoVar = this.b;
        hoVar.setBounds(0, (int) (height + L + gm.L(7.0f)), width2, height2);
        hoVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(i, gm.L(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
