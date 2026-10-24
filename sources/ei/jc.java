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
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zr;
public final class jc extends View {
    public final xj0 f9295a;
    public final org.telegram.ui.Components.n6 f9296b;
    public final Paint f9297c;
    public final Paint d;
    public final wc e;
    public boolean f9298f;
    public final org.telegram.ui.Components.d6 h;

    public jc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f9297c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new wc(this);
        zr zrVar = zr.h;
        this.h = new org.telegram.ui.Components.d6(this, 0L, 240L, zrVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        xj0 xj0Var = new xj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f9295a = xj0Var;
        xj0Var.R(this);
        xj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        xj0Var.h = true;
        xj0Var.P(0);
        xj0Var.J(true);
        xj0Var.start();
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false);
        this.f9296b = n6Var;
        n6Var.n(0.3f, 250L, zrVar);
        n6Var.M = AndroidUtilities.displaySize.x;
        n6Var.w(AndroidUtilities.dp(14.0f));
        n6Var.u(-1);
        n6Var.s(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        n6Var.t(LocaleController.getString(R.string.TrashHintDrag), true, true);
        n6Var.f28797b = 17;
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
        this.f9296b.t(LocaleController.getString(i10), true, true);
        int i11 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f9298f = z12;
        xj0 xj0Var = this.f9295a;
        if (z12) {
            if (xj0Var.f32594a0 > 34) {
                xj0Var.N(0, false, false);
            }
            xj0Var.P(33);
            xj0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            xj0Var.P(i11);
            xj0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e = (this.h.e(this.f9298f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e, this.d);
        canvas.drawCircle(width, height, e, this.f9297c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        xj0 xj0Var = this.f9295a;
        xj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        xj0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.n6 n6Var = this.f9296b;
        n6Var.setBounds(0, dp3, width2, height2);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f9296b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
