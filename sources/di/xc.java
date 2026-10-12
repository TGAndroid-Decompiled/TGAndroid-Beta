package di;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.yj0;
public final class xc extends View {
    public final yj0 f8108a;
    public final org.telegram.ui.Components.r6 f8109b;
    public final Paint f8110c;
    public final Paint d;
    public final org.telegram.ui.Components.ad e;
    public boolean f8111f;
    public final org.telegram.ui.Components.g6 h;

    public xc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f8110c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new org.telegram.ui.Components.ad(this);
        es esVar = es.h;
        this.h = new org.telegram.ui.Components.g6(this, 0L, 240L, esVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        yj0 yj0Var = new yj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f8108a = yj0Var;
        yj0Var.R(this);
        yj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        yj0Var.h = true;
        yj0Var.P(0);
        yj0Var.J(true);
        yj0Var.start();
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, true, false);
        this.f8109b = r6Var;
        r6Var.n(0.3f, 250L, esVar);
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.u(-1);
        r6Var.s(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        r6Var.t(LocaleController.getString(R.string.TrashHintDrag), true, true);
        r6Var.f28748b = 17;
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
        this.f8109b.t(LocaleController.getString(i10), true, true);
        int i11 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f8111f = z12;
        yj0 yj0Var = this.f8108a;
        if (z12) {
            if (yj0Var.f31602a0 > 34) {
                yj0Var.N(0, false, false);
            }
            yj0Var.P(33);
            yj0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            yj0Var.P(i11);
            yj0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e = (this.h.e(this.f8111f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e, this.d);
        canvas.drawCircle(width, height, e, this.f8110c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        yj0 yj0Var = this.f8108a;
        yj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        yj0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.r6 r6Var = this.f8109b;
        r6Var.setBounds(0, dp3, width2, height2);
        r6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f8109b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
