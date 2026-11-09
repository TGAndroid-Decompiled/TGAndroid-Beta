package fi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;
public final class ib extends View {
    public final ah0 f12190a;
    public final org.telegram.ui.Components.i6 f12191b;
    public final Paint f12192c;
    public final Paint d;
    public final ic f12193e;
    public boolean f12194f;
    public final org.telegram.ui.Components.w5 h;

    public ib(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f12192c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f12193e = new ic(this);
        xq xqVar = xq.h;
        this.h = new org.telegram.ui.Components.w5(this, 0L, 240L, xqVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        ah0 ah0Var = new ah0(2131624042, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.f12190a = ah0Var;
        ah0Var.R(this);
        ah0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        ah0Var.h = true;
        ah0Var.P(0);
        ah0Var.J(true);
        ah0Var.start();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false);
        this.f12191b = i6Var;
        i6Var.n(0.3f, 250L, xqVar);
        i6Var.M = org.telegram.messenger.g0.f22563q.x;
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.u(-1);
        i6Var.s(org.telegram.messenger.g0.N(1.33f), org.telegram.messenger.g0.L(1.0f), 1073741824);
        i6Var.t(id.M0(2131743945, null), true, true);
        i6Var.f34587b = 17;
    }

    public final void a(boolean z9, boolean z10) {
        int i7;
        this.f12193e.c(z9);
        if (!z9 && !z10) {
            i7 = 2131743945;
        } else {
            i7 = 2131743944;
        }
        boolean z11 = true;
        this.f12191b.t(id.M0(i7, null), true, true);
        int i10 = 0;
        if (!z9 || z10) {
            z11 = false;
        }
        this.f12194f = z11;
        ah0 ah0Var = this.f12190a;
        if (z11) {
            if (ah0Var.f31820a0 > 34) {
                ah0Var.N(0, false, false);
            }
            ah0Var.P(33);
            ah0Var.start();
        } else {
            if (z10) {
                i10 = 66;
            }
            ah0Var.P(i10);
            ah0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f12194f) * org.telegram.messenger.g0.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.f12192c);
        float L2 = org.telegram.messenger.g0.L(48.0f) / 2.0f;
        ah0 ah0Var = this.f12190a;
        ah0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        ah0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.g0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.i6 i6Var = this.f12191b;
        i6Var.setBounds(0, L3, width2, height2);
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(i7, org.telegram.messenger.g0.L(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f12191b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
