package lh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;

public final class fc extends View {

    public final oi0 f16019a;

    public final org.telegram.ui.Components.i6 f16020b;

    public final Paint f16021c;
    public final Paint d;

    public final org.telegram.ui.Components.nc f16022e;

    public boolean f16023f;
    public final org.telegram.ui.Components.y5 h;

    public fc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f16021c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f16022e = new org.telegram.ui.Components.nc(this);
        er erVar = er.h;
        this.h = new org.telegram.ui.Components.y5(this, 0L, 240L, erVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        oi0 oi0Var = new oi0(R.raw.group_pip_delete_icon, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f16019a = oi0Var;
        oi0Var.f31328r0 = this;
        oi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        oi0Var.h = true;
        oi0Var.N(0);
        oi0Var.H(true);
        oi0Var.start();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false, false);
        this.f16020b = i6Var;
        i6Var.k(0.3f, 250L, erVar);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.r(-1);
        i6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        i6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        i6Var.f29239b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        this.f16022e.c(z10);
        this.f16020b.q(LocaleController.getString((z10 || z11) ? R.string.TrashHintRelease : R.string.TrashHintDrag), true, true);
        boolean z12 = z10 && !z11;
        this.f16023f = z12;
        oi0 oi0Var = this.f16019a;
        if (z12) {
            if (oi0Var.X > 34) {
                oi0Var.L(0, false, false);
            }
            oi0Var.N(33);
            oi0Var.start();
        } else {
            oi0Var.N(z11 ? 66 : 0);
            oi0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fDp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fE = (this.h.e(this.f16023f) * AndroidUtilities.dp(3.0f)) + fDp;
        canvas.drawCircle(width, height, fE, this.d);
        canvas.drawCircle(width, height, fE, this.f16021c);
        float fDp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        oi0 oi0Var = this.f16019a;
        oi0Var.setBounds((int) (width - fDp2), (int) (height - fDp2), (int) (width + fDp2), (int) (fDp2 + height));
        oi0Var.draw(canvas);
        int iDp = (int) (height + fDp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.i6 i6Var = this.f16020b;
        i6Var.setBounds(0, iDp, width2, height2);
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f16020b || super.verifyDrawable(drawable);
    }
}
