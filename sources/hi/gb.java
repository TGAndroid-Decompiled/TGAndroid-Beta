package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mh0;
public final class gb extends View {
    public final mh0 f14703a;
    public final org.telegram.ui.Components.m6 f14704b;
    public final Paint f14705c;
    public final Paint d;
    public final mc f14706e;
    public boolean f14707f;
    public final org.telegram.ui.Components.c6 h;

    public gb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f14705c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f14706e = new mc(this);
        lr lrVar = lr.h;
        this.h = new org.telegram.ui.Components.c6(this, 0L, 240L, lrVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        mh0 mh0Var = new mh0(2131624043, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.f14703a = mh0Var;
        mh0Var.R(this);
        mh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        mh0Var.h = true;
        mh0Var.P(0);
        mh0Var.J(true);
        mh0Var.start();
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, false);
        this.f14704b = m6Var;
        m6Var.n(0.3f, 250L, lrVar);
        m6Var.N = org.telegram.messenger.g0.f24118q.x;
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.u(-1);
        m6Var.s(org.telegram.messenger.g0.N(1.33f), org.telegram.messenger.g0.L(1.0f), 1073741824);
        m6Var.t(gd.M0(2131743708, null), true, true);
        m6Var.f37377b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        this.f14706e.c(z10);
        if (!z10 && !z11) {
            i7 = 2131743708;
        } else {
            i7 = 2131743707;
        }
        boolean z12 = true;
        this.f14704b.t(gd.M0(i7, null), true, true);
        int i10 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f14707f = z12;
        mh0 mh0Var = this.f14703a;
        if (z12) {
            if (mh0Var.f37482b0 > 34) {
                mh0Var.N(0, false, false);
            }
            mh0Var.P(33);
            mh0Var.start();
        } else {
            if (z11) {
                i10 = 66;
            }
            mh0Var.P(i10);
            mh0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f14707f) * org.telegram.messenger.g0.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.f14705c);
        float L2 = org.telegram.messenger.g0.L(48.0f) / 2.0f;
        mh0 mh0Var = this.f14703a;
        mh0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        mh0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.g0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.m6 m6Var = this.f14704b;
        m6Var.setBounds(0, L3, width2, height2);
        m6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(i7, org.telegram.messenger.g0.L(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f14704b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
