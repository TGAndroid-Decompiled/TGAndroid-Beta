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
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.tr;
public final class zc extends View {
    public final lj0 f5934a;
    public final org.telegram.ui.Components.o6 f5935b;
    public final Paint f5936c;
    public final Paint d;
    public final org.telegram.ui.Components.zc e;
    public boolean f5937f;
    public final org.telegram.ui.Components.e6 h;

    public zc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f5936c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new org.telegram.ui.Components.zc(this);
        tr trVar = tr.h;
        this.h = new org.telegram.ui.Components.e6(this, 0L, 240L, trVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        lj0 lj0Var = new lj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f5934a = lj0Var;
        lj0Var.R(this);
        lj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        lj0Var.h = true;
        lj0Var.P(0);
        lj0Var.J(true);
        lj0Var.start();
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, true, false, false);
        this.f5935b = o6Var;
        o6Var.k(0.3f, 250L, trVar);
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.r(-1);
        o6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        o6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        o6Var.f26991b = 17;
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
        this.f5935b.q(LocaleController.getString(i10), true, true);
        int i11 = 0;
        z12 = (!z10 || z11) ? false : false;
        this.f5937f = z12;
        lj0 lj0Var = this.f5934a;
        if (z12) {
            if (lj0Var.f26008a0 > 34) {
                lj0Var.N(0, false, false);
            }
            lj0Var.P(33);
            lj0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            lj0Var.P(i11);
            lj0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e = (this.h.e(this.f5937f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e, this.d);
        canvas.drawCircle(width, height, e, this.f5936c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        lj0 lj0Var = this.f5934a;
        lj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        lj0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.o6 o6Var = this.f5935b;
        o6Var.setBounds(0, dp3, width2, height2);
        o6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f5935b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
