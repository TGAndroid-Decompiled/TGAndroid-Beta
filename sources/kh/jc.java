package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
public final class jc extends View {
    public final mi0 f15488a;
    public final org.telegram.ui.Components.i6 f15489b;
    public final Paint f15490c;
    public final Paint d;
    public final org.telegram.ui.Components.pc f15491e;
    public boolean f15492f;
    public final org.telegram.ui.Components.y5 h;

    public jc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f15490c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f15491e = new org.telegram.ui.Components.pc(this);
        gr grVar = gr.h;
        this.h = new org.telegram.ui.Components.y5(this, 0L, 240L, grVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        int i9 = R.raw.group_pip_delete_icon;
        mi0 mi0Var = new mi0(i9, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f15488a = mi0Var;
        mi0Var.f30863r0 = this;
        mi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        mi0Var.h = true;
        mi0Var.N(0);
        mi0Var.H(true);
        mi0Var.start();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false, false);
        this.f15489b = i6Var;
        i6Var.k(0.3f, 250L, grVar);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.r(-1);
        i6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        i6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        i6Var.f29333b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i9;
        this.f15491e.c(z10);
        if (!z10 && !z11) {
            i9 = R.string.TrashHintDrag;
        } else {
            i9 = R.string.TrashHintRelease;
        }
        boolean z12 = true;
        this.f15489b.q(LocaleController.getString(i9), true, true);
        int i10 = 0;
        z12 = (!z10 || z11) ? false : false;
        this.f15492f = z12;
        mi0 mi0Var = this.f15488a;
        if (z12) {
            if (mi0Var.X > 34) {
                mi0Var.L(0, false, false);
            }
            mi0Var.N(33);
            mi0Var.start();
        } else {
            if (z11) {
                i10 = 66;
            }
            mi0Var.N(i10);
            mi0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e10 = (this.h.e(this.f15492f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e10, this.d);
        canvas.drawCircle(width, height, e10, this.f15490c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        mi0 mi0Var = this.f15488a;
        mi0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        mi0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.i6 i6Var = this.f15489b;
        i6Var.setBounds(0, dp3, width2, height2);
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(i9, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f15489b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
