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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hs;
public final class zc extends View {
    public final ck0 f6433a;
    public final org.telegram.ui.Components.q6 f6434b;
    public final Paint f6435c;
    public final Paint d;
    public final org.telegram.ui.Components.bd f6436e;
    public boolean f6437f;
    public final org.telegram.ui.Components.g6 h;

    public zc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f6435c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f6436e = new org.telegram.ui.Components.bd(this);
        hs hsVar = hs.h;
        this.h = new org.telegram.ui.Components.g6(this, 0L, 240L, hsVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        ck0 ck0Var = new ck0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f6433a = ck0Var;
        ck0Var.R(this);
        ck0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        ck0Var.h = true;
        ck0Var.P(0);
        ck0Var.J(true);
        ck0Var.start();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, false);
        this.f6434b = q6Var;
        q6Var.n(0.3f, 250L, hsVar);
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.u(-1);
        q6Var.s(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        q6Var.t(LocaleController.getString(R.string.TrashHintDrag), true, true);
        q6Var.f30065b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        this.f6436e.c(z10);
        if (!z10 && !z11) {
            i10 = R.string.TrashHintDrag;
        } else {
            i10 = R.string.TrashHintRelease;
        }
        boolean z12 = true;
        this.f6434b.t(LocaleController.getString(i10), true, true);
        int i11 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f6437f = z12;
        ck0 ck0Var = this.f6433a;
        if (z12) {
            if (ck0Var.f25395a0 > 34) {
                ck0Var.N(0, false, false);
            }
            ck0Var.P(33);
            ck0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            ck0Var.P(i11);
            ck0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e7 = (this.h.e(this.f6437f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e7, this.d);
        canvas.drawCircle(width, height, e7, this.f6435c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        ck0 ck0Var = this.f6433a;
        ck0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        ck0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.q6 q6Var = this.f6434b;
        q6Var.setBounds(0, dp3, width2, height2);
        q6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f6434b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
