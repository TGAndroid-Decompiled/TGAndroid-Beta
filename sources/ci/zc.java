package ci;

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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.is;
public final class zc extends View {
    public final dk0 f6432a;
    public final org.telegram.ui.Components.q6 f6433b;
    public final Paint f6434c;
    public final Paint d;
    public final org.telegram.ui.Components.bd f6435e;
    public boolean f6436f;
    public final org.telegram.ui.Components.g6 h;

    public zc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f6434c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f6435e = new org.telegram.ui.Components.bd(this);
        is isVar = is.h;
        this.h = new org.telegram.ui.Components.g6(this, 0L, 240L, isVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        dk0 dk0Var = new dk0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f6432a = dk0Var;
        dk0Var.R(this);
        dk0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        dk0Var.h = true;
        dk0Var.P(0);
        dk0Var.J(true);
        dk0Var.start();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, false);
        this.f6433b = q6Var;
        q6Var.n(0.3f, 250L, isVar);
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.u(-1);
        q6Var.s(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        q6Var.t(LocaleController.getString(R.string.TrashHintDrag), true, true);
        q6Var.f30134b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        this.f6435e.c(z10);
        if (!z10 && !z11) {
            i10 = R.string.TrashHintDrag;
        } else {
            i10 = R.string.TrashHintRelease;
        }
        boolean z12 = true;
        this.f6433b.t(LocaleController.getString(i10), true, true);
        int i11 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f6436f = z12;
        dk0 dk0Var = this.f6432a;
        if (z12) {
            if (dk0Var.f25804a0 > 34) {
                dk0Var.N(0, false, false);
            }
            dk0Var.P(33);
            dk0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            dk0Var.P(i11);
            dk0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e7 = (this.h.e(this.f6436f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e7, this.d);
        canvas.drawCircle(width, height, e7, this.f6434c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        dk0 dk0Var = this.f6432a;
        dk0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        dk0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.q6 q6Var = this.f6433b;
        q6Var.setBounds(0, dp3, width2, height2);
        q6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f6433b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
