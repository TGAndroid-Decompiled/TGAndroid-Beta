package nh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.xi0;
public final class tb extends View {
    public final xi0 f18691a;
    public final org.telegram.ui.Components.n6 f18692b;
    public final Paint f18693c;
    public final Paint d;
    public final uc f18694e;
    public boolean f18695f;
    public final org.telegram.ui.Components.d6 h;

    public tb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f18693c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f18694e = new uc(this);
        jr jrVar = jr.h;
        this.h = new org.telegram.ui.Components.d6(this, 0L, 240L, jrVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        int i10 = R.raw.group_pip_delete_icon;
        xi0 xi0Var = new xi0(i10, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f18691a = xi0Var;
        xi0Var.f34753r0 = this;
        xi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        xi0Var.h = true;
        xi0Var.N(0);
        xi0Var.H(true);
        xi0Var.start();
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false, false);
        this.f18692b = n6Var;
        n6Var.k(0.3f, 250L, jrVar);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.r(-1);
        n6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        n6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        n6Var.f30862b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        this.f18694e.c(z10);
        if (!z10 && !z11) {
            i10 = R.string.TrashHintDrag;
        } else {
            i10 = R.string.TrashHintRelease;
        }
        boolean z12 = true;
        this.f18692b.q(LocaleController.getString(i10), true, true);
        int i11 = 0;
        z12 = (!z10 || z11) ? false : false;
        this.f18695f = z12;
        xi0 xi0Var = this.f18691a;
        if (z12) {
            if (xi0Var.X > 34) {
                xi0Var.L(0, false, false);
            }
            xi0Var.N(33);
            xi0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            xi0Var.N(i11);
            xi0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e10 = (this.h.e(this.f18695f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e10, this.d);
        canvas.drawCircle(width, height, e10, this.f18693c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        xi0 xi0Var = this.f18691a;
        xi0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        xi0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.n6 n6Var = this.f18692b;
        n6Var.setBounds(0, dp3, width2, height2);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f18692b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
