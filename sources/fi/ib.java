package fi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zg0;
public final class ib extends View {
    public final zg0 f12194a;
    public final org.telegram.ui.Components.h6 f12195b;
    public final Paint f12196c;
    public final Paint d;
    public final hc f12197e;
    public boolean f12198f;
    public final org.telegram.ui.Components.v5 h;

    public ib(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f12196c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f12197e = new hc(this);
        wq wqVar = wq.h;
        this.h = new org.telegram.ui.Components.v5(this, 0L, 240L, wqVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        zg0 zg0Var = new zg0(2131624042, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.f12194a = zg0Var;
        zg0Var.R(this);
        zg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        zg0Var.h = true;
        zg0Var.P(0);
        zg0Var.J(true);
        zg0Var.start();
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(true, true, false);
        this.f12195b = h6Var;
        h6Var.n(0.3f, 250L, wqVar);
        h6Var.M = org.telegram.messenger.g0.f22567q.x;
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.u(-1);
        h6Var.s(org.telegram.messenger.g0.N(1.33f), org.telegram.messenger.g0.L(1.0f), 1073741824);
        h6Var.t(id.M0(2131743945, null), true, true);
        h6Var.f34187b = 17;
    }

    public final void a(boolean z9, boolean z10) {
        int i7;
        this.f12197e.c(z9);
        if (!z9 && !z10) {
            i7 = 2131743945;
        } else {
            i7 = 2131743944;
        }
        boolean z11 = true;
        this.f12195b.t(id.M0(i7, null), true, true);
        int i10 = 0;
        if (!z9 || z10) {
            z11 = false;
        }
        this.f12198f = z11;
        zg0 zg0Var = this.f12194a;
        if (z11) {
            if (zg0Var.f40962a0 > 34) {
                zg0Var.N(0, false, false);
            }
            zg0Var.P(33);
            zg0Var.start();
        } else {
            if (z10) {
                i10 = 66;
            }
            zg0Var.P(i10);
            zg0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f12198f) * org.telegram.messenger.g0.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.f12196c);
        float L2 = org.telegram.messenger.g0.L(48.0f) / 2.0f;
        zg0 zg0Var = this.f12194a;
        zg0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        zg0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.g0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.h6 h6Var = this.f12195b;
        h6Var.setBounds(0, L3, width2, height2);
        h6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(i7, org.telegram.messenger.g0.L(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f12195b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
