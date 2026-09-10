package bi;

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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.wr;
public final class pe extends View {
    public final hj0 f3422a;
    public final org.telegram.ui.Components.n6 f3423b;
    public final Paint f3424c;
    public final Paint d;
    public final org.telegram.ui.Components.xc e;
    public boolean f3425f;
    public final org.telegram.ui.Components.d6 h;

    public pe(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f3424c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new org.telegram.ui.Components.xc(this);
        wr wrVar = wr.h;
        this.h = new org.telegram.ui.Components.d6(this, 0L, 240L, wrVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        hj0 hj0Var = new hj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f3422a = hj0Var;
        hj0Var.f23672v0 = this;
        hj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        hj0Var.h = true;
        hj0Var.P(0);
        hj0Var.J(true);
        hj0Var.start();
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false, false);
        this.f3423b = n6Var;
        n6Var.k(0.3f, 250L, wrVar);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.r(-1);
        n6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        n6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        n6Var.f25425b = 17;
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
        this.f3423b.q(LocaleController.getString(i10), true, true);
        int i11 = 0;
        z12 = (!z10 || z11) ? false : false;
        this.f3425f = z12;
        hj0 hj0Var = this.f3422a;
        if (z12) {
            if (hj0Var.f23648b0 > 34) {
                hj0Var.N(0, false, false);
            }
            hj0Var.P(33);
            hj0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            hj0Var.P(i11);
            hj0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e = (this.h.e(this.f3425f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e, this.d);
        canvas.drawCircle(width, height, e, this.f3424c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        hj0 hj0Var = this.f3422a;
        hj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        hj0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.n6 n6Var = this.f3423b;
        n6Var.setBounds(0, dp3, width2, height2);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f3423b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
