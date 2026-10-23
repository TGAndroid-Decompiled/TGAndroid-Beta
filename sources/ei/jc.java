package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.yc;
public final class jc extends View {
    public final vj0 f9284a;
    public final org.telegram.ui.Components.p6 f9285b;
    public final Paint f9286c;
    public final Paint d;
    public final yc e;
    public boolean f9287f;
    public final org.telegram.ui.Components.f6 h;

    public jc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f9286c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new yc(this);
        bs bsVar = bs.h;
        this.h = new org.telegram.ui.Components.f6(this, 0L, 240L, bsVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        vj0 vj0Var = new vj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f9284a = vj0Var;
        vj0Var.R(this);
        vj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        vj0Var.h = true;
        vj0Var.P(0);
        vj0Var.J(true);
        vj0Var.start();
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, false);
        this.f9285b = p6Var;
        p6Var.n(0.3f, 250L, bsVar);
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.u(-1);
        p6Var.s(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        p6Var.t(LocaleController.getString(R.string.TrashHintDrag), true, true);
        p6Var.f29230b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        this.e.c(z10);
        if (!z10 && !z11) {
            i10 = R.string.TrashHintDrag;
        } else {
            i10 = R.string.TrashHintRelease;
        }
        boolean z12 = true;
        this.f9285b.t(LocaleController.getString(i10), true, true);
        int i11 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f9287f = z12;
        vj0 vj0Var = this.f9284a;
        if (z12) {
            if (vj0Var.f31269a0 > 34) {
                vj0Var.N(0, false, false);
            }
            vj0Var.P(33);
            vj0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            vj0Var.P(i11);
            vj0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e = (this.h.e(this.f9287f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e, this.d);
        canvas.drawCircle(width, height, e, this.f9286c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        vj0 vj0Var = this.f9284a;
        vj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        vj0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.p6 p6Var = this.f9285b;
        p6Var.setBounds(0, dp3, width2, height2);
        p6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f9285b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
