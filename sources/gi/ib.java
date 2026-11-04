package gi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xq;
public final class ib extends View {
    public final ch0 f12981a;
    public final org.telegram.ui.Components.g6 f12982b;
    public final Paint f12983c;
    public final Paint d;
    public final gc f12984e;
    public boolean f12985f;
    public final org.telegram.ui.Components.u5 h;

    public ib(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f12983c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f12984e = new gc(this);
        xq xqVar = xq.h;
        this.h = new org.telegram.ui.Components.u5(this, 0L, 240L, xqVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        ch0 ch0Var = new ch0(2131624042, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.f12981a = ch0Var;
        ch0Var.R(this);
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        ch0Var.h = true;
        ch0Var.P(0);
        ch0Var.J(true);
        ch0Var.start();
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, false);
        this.f12982b = g6Var;
        g6Var.n(0.3f, 250L, xqVar);
        g6Var.M = org.telegram.messenger.g0.f22608q.x;
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.u(-1);
        g6Var.s(org.telegram.messenger.g0.N(1.33f), org.telegram.messenger.g0.L(1.0f), 1073741824);
        g6Var.t(bd.M0(2131743955, null), true, true);
        g6Var.f33983b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i3;
        this.f12984e.c(z10);
        if (!z10 && !z11) {
            i3 = 2131743955;
        } else {
            i3 = 2131743954;
        }
        boolean z12 = true;
        this.f12982b.t(bd.M0(i3, null), true, true);
        int i10 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f12985f = z12;
        ch0 ch0Var = this.f12981a;
        if (z12) {
            if (ch0Var.f32721b0 > 34) {
                ch0Var.N(0, false, false);
            }
            ch0Var.P(33);
            ch0Var.start();
        } else {
            if (z11) {
                i10 = 66;
            }
            ch0Var.P(i10);
            ch0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f12985f) * org.telegram.messenger.g0.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.f12983c);
        float L2 = org.telegram.messenger.g0.L(48.0f) / 2.0f;
        ch0 ch0Var = this.f12981a;
        ch0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        ch0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.g0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.g6 g6Var = this.f12982b;
        g6Var.setBounds(0, L3, width2, height2);
        g6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(i3, org.telegram.messenger.g0.L(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f12982b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
