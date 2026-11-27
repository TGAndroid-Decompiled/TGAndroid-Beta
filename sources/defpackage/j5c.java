package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class j5c extends View {
    public final b29 a;
    public final hn b;
    public final Paint c;
    public final Paint d;
    public final v41 e;
    public boolean f;
    public final mm h;

    public j5c(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new v41(this);
        k43 k43Var = k43.h;
        this.h = new mm(this, 0L, 240L, k43Var);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(2.66f));
        paint.setShadowLayer(hl.N(3.0f), 0.0f, hl.L(1.66f), 805306368);
        paint2.setColor(855638016);
        b29 b29Var = new b29(2131624043, hl.L(48.0f), hl.L(48.0f), true, null);
        this.a = b29Var;
        b29Var.M(this);
        b29Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        b29Var.h = true;
        b29Var.K(0);
        b29Var.E(true);
        b29Var.start();
        hn hnVar = new hn(true, true, false);
        this.b = hnVar;
        hnVar.n(0.3f, 250L, k43Var);
        hnVar.N = hl.q.x;
        hnVar.w(hl.L(14.0f));
        hnVar.u(-1);
        hnVar.s(hl.N(1.33f), hl.L(1.0f), 1073741824);
        hnVar.t(ob6.M0(2131743600, null), true, true);
        hnVar.b = 17;
    }

    public final void a(boolean z, boolean z2) {
        int i;
        this.e.c(z);
        if (!z && !z2) {
            i = 2131743600;
        } else {
            i = 2131743599;
        }
        boolean z3 = true;
        this.b.t(ob6.M0(i, null), true, true);
        int i2 = 0;
        if (!z || z2) {
            z3 = false;
        }
        this.f = z3;
        b29 b29Var = this.a;
        if (z3) {
            if (b29Var.b0 > 34) {
                b29Var.I(0, false, false);
            }
            b29Var.K(33);
            b29Var.start();
        } else {
            if (z2) {
                i2 = 66;
            }
            b29Var.K(i2);
            b29Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = hl.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f) * hl.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.c);
        float L2 = hl.L(48.0f) / 2.0f;
        b29 b29Var = this.a;
        b29Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        b29Var.draw(canvas);
        int width2 = getWidth();
        int height2 = getHeight();
        hn hnVar = this.b;
        hnVar.setBounds(0, (int) (height + L + hl.L(7.0f)), width2, height2);
        hnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(i, hl.L(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
