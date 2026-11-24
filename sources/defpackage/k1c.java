package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class k1c extends View {
    public final oy8 a;
    public final gn b;
    public final Paint c;
    public final Paint d;
    public final n41 e;
    public boolean f;
    public final lm h;

    public k1c(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new n41(this);
        s33 s33Var = s33.h;
        this.h = new lm(this, 0L, 240L, s33Var);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.N(2.66f));
        paint.setShadowLayer(gl.N(3.0f), 0.0f, gl.L(1.66f), 805306368);
        paint2.setColor(855638016);
        oy8 oy8Var = new oy8(2131624043, gl.L(48.0f), gl.L(48.0f), true, null);
        this.a = oy8Var;
        oy8Var.M(this);
        oy8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        oy8Var.h = true;
        oy8Var.K(0);
        oy8Var.E(true);
        oy8Var.start();
        gn gnVar = new gn(true, true, false);
        this.b = gnVar;
        gnVar.n(0.3f, 250L, s33Var);
        gnVar.N = gl.q.x;
        gnVar.w(gl.L(14.0f));
        gnVar.u(-1);
        gnVar.s(gl.N(1.33f), gl.L(1.0f), 1073741824);
        gnVar.t(k96.M0(2131743706, null), true, true);
        gnVar.b = 17;
    }

    public final void a(boolean z, boolean z2) {
        int i;
        this.e.c(z);
        if (!z && !z2) {
            i = 2131743706;
        } else {
            i = 2131743705;
        }
        boolean z3 = true;
        this.b.t(k96.M0(i, null), true, true);
        int i2 = 0;
        if (!z || z2) {
            z3 = false;
        }
        this.f = z3;
        oy8 oy8Var = this.a;
        if (z3) {
            if (oy8Var.b0 > 34) {
                oy8Var.I(0, false, false);
            }
            oy8Var.K(33);
            oy8Var.start();
        } else {
            if (z2) {
                i2 = 66;
            }
            oy8Var.K(i2);
            oy8Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = gl.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f) * gl.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.c);
        float L2 = gl.L(48.0f) / 2.0f;
        oy8 oy8Var = this.a;
        oy8Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        oy8Var.draw(canvas);
        int width2 = getWidth();
        int height2 = getHeight();
        gn gnVar = this.b;
        gnVar.setBounds(0, (int) (height + L + gl.L(7.0f)), width2, height2);
        gnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(i, gl.L(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
