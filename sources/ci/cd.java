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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yi0;
public final class cd extends View {
    public final yi0 f4443a;
    public final org.telegram.ui.Components.m6 f4444b;
    public final Paint f4445c;
    public final Paint d;
    public final org.telegram.ui.Components.wc e;
    public boolean f4446f;
    public final org.telegram.ui.Components.c6 h;

    public cd(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f4445c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new org.telegram.ui.Components.wc(this);
        qr qrVar = qr.h;
        this.h = new org.telegram.ui.Components.c6(this, 0L, 240L, qrVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        yi0 yi0Var = new yi0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f4443a = yi0Var;
        yi0Var.f30245v0 = this;
        yi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        yi0Var.h = true;
        yi0Var.P(0);
        yi0Var.J(true);
        yi0Var.start();
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, false, false);
        this.f4444b = m6Var;
        m6Var.k(0.3f, 250L, qrVar);
        m6Var.G = AndroidUtilities.displaySize.x;
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.r(-1);
        m6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        m6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        m6Var.f26067b = 17;
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
        this.f4444b.q(LocaleController.getString(i10), true, true);
        int i11 = 0;
        z12 = (!z10 || z11) ? false : false;
        this.f4446f = z12;
        yi0 yi0Var = this.f4443a;
        if (z12) {
            if (yi0Var.f30221b0 > 34) {
                yi0Var.N(0, false, false);
            }
            yi0Var.P(33);
            yi0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            yi0Var.P(i11);
            yi0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e = (this.h.e(this.f4446f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e, this.d);
        canvas.drawCircle(width, height, e, this.f4445c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        yi0 yi0Var = this.f4443a;
        yi0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        yi0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.m6 m6Var = this.f4444b;
        m6Var.setBounds(0, dp3, width2, height2);
        m6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f4444b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
