package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
public final class fb extends View {
    public final oh0 f14658a;
    public final org.telegram.ui.Components.n6 f14659b;
    public final Paint f14660c;
    public final Paint d;
    public final mc f14661e;
    public boolean f14662f;
    public final org.telegram.ui.Components.d6 h;

    public fb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f14660c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f14661e = new mc(this);
        nr nrVar = nr.h;
        this.h = new org.telegram.ui.Components.d6(this, 0L, 240L, nrVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        oh0 oh0Var = new oh0(2131624043, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.f14658a = oh0Var;
        oh0Var.R(this);
        oh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        oh0Var.h = true;
        oh0Var.P(0);
        oh0Var.J(true);
        oh0Var.start();
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false);
        this.f14659b = n6Var;
        n6Var.n(0.3f, 250L, nrVar);
        n6Var.N = org.telegram.messenger.g0.f24046q.x;
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        n6Var.u(-1);
        n6Var.s(org.telegram.messenger.g0.N(1.33f), org.telegram.messenger.g0.L(1.0f), 1073741824);
        n6Var.t(hd.N0(2131743700, null), true, true);
        n6Var.f37795b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        this.f14661e.c(z10);
        if (!z10 && !z11) {
            i7 = 2131743700;
        } else {
            i7 = 2131743699;
        }
        boolean z12 = true;
        this.f14659b.t(hd.N0(i7, null), true, true);
        int i10 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f14662f = z12;
        oh0 oh0Var = this.f14658a;
        if (z12) {
            if (oh0Var.f38206b0 > 34) {
                oh0Var.N(0, false, false);
            }
            oh0Var.P(33);
            oh0Var.start();
        } else {
            if (z11) {
                i10 = 66;
            }
            oh0Var.P(i10);
            oh0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f14662f) * org.telegram.messenger.g0.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.f14660c);
        float L2 = org.telegram.messenger.g0.L(48.0f) / 2.0f;
        oh0 oh0Var = this.f14658a;
        oh0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        oh0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.g0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.n6 n6Var = this.f14659b;
        n6Var.setBounds(0, L3, width2, height2);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(i7, org.telegram.messenger.g0.L(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f14659b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
