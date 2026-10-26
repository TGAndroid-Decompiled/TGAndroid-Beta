package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xj0;
public final class fc extends View {
    public final xj0 f10885a;
    public final org.telegram.ui.Components.r6 f10886b;
    public final Paint f10887c;
    public final Paint d;
    public final xc e;
    public boolean f10888f;
    public final org.telegram.ui.Components.h6 h;

    public fc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f10887c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new xc(this);
        ds dsVar = ds.h;
        this.h = new org.telegram.ui.Components.h6(this, 0L, 240L, dsVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        xj0 xj0Var = new xj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f10885a = xj0Var;
        xj0Var.R(this);
        xj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        xj0Var.h = true;
        xj0Var.P(0);
        xj0Var.J(true);
        xj0Var.start();
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, true, false);
        this.f10886b = r6Var;
        r6Var.n(0.3f, 250L, dsVar);
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.u(-1);
        r6Var.s(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        r6Var.t(LocaleController.getString(R.string.TrashHintDrag), true, true);
        r6Var.f32121b = 17;
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
        this.f10886b.t(LocaleController.getString(i10), true, true);
        int i11 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f10888f = z12;
        xj0 xj0Var = this.f10885a;
        if (z12) {
            if (xj0Var.f34736a0 > 34) {
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
        float e = (this.h.e(this.f10888f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e, this.d);
        canvas.drawCircle(width, height, e, this.f10887c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        xj0 xj0Var = this.f10885a;
        xj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        xj0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.r6 r6Var = this.f10886b;
        r6Var.setBounds(0, dp3, width2, height2);
        r6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f10886b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
