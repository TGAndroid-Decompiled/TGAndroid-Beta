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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tr;
public final class yc extends View {
    public final kj0 f6352a;
    public final org.telegram.ui.Components.o6 f6353b;
    public final Paint f6354c;
    public final Paint d;
    public final org.telegram.ui.Components.zc f6355e;
    public boolean f6356f;
    public final org.telegram.ui.Components.e6 h;

    public yc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f6354c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f6355e = new org.telegram.ui.Components.zc(this);
        tr trVar = tr.h;
        this.h = new org.telegram.ui.Components.e6(this, 0L, 240L, trVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        kj0 kj0Var = new kj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f6352a = kj0Var;
        kj0Var.R(this);
        kj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        kj0Var.h = true;
        kj0Var.P(0);
        kj0Var.J(true);
        kj0Var.start();
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, true, false, false);
        this.f6353b = o6Var;
        o6Var.k(0.3f, 250L, trVar);
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.r(-1);
        o6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        o6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        o6Var.f29240b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        this.f6355e.c(z10);
        if (!z10 && !z11) {
            i10 = R.string.TrashHintDrag;
        } else {
            i10 = R.string.TrashHintRelease;
        }
        boolean z12 = true;
        this.f6353b.q(LocaleController.getString(i10), true, true);
        int i11 = 0;
        z12 = (!z10 || z11) ? false : false;
        this.f6356f = z12;
        kj0 kj0Var = this.f6352a;
        if (z12) {
            if (kj0Var.f28119a0 > 34) {
                kj0Var.N(0, false, false);
            }
            kj0Var.P(33);
            kj0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            kj0Var.P(i11);
            kj0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e7 = (this.h.e(this.f6356f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e7, this.d);
        canvas.drawCircle(width, height, e7, this.f6354c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        kj0 kj0Var = this.f6352a;
        kj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        kj0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.o6 o6Var = this.f6353b;
        o6Var.setBounds(0, dp3, width2, height2);
        o6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f6353b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
