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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.js;
public final class zc extends View {
    public final fk0 f6431a;
    public final org.telegram.ui.Components.q6 f6432b;
    public final Paint f6433c;
    public final Paint d;
    public final org.telegram.ui.Components.ad f6434e;
    public boolean f6435f;
    public final org.telegram.ui.Components.g6 h;

    public zc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f6433c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f6434e = new org.telegram.ui.Components.ad(this);
        js jsVar = js.h;
        this.h = new org.telegram.ui.Components.g6(this, 0L, 240L, jsVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        fk0 fk0Var = new fk0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f6431a = fk0Var;
        fk0Var.R(this);
        fk0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        fk0Var.h = true;
        fk0Var.P(0);
        fk0Var.J(true);
        fk0Var.start();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, false);
        this.f6432b = q6Var;
        q6Var.n(0.3f, 250L, jsVar);
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.u(-1);
        q6Var.s(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        q6Var.t(LocaleController.getString(R.string.TrashHintDrag), true, true);
        q6Var.f29690b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        this.f6434e.c(z10);
        if (!z10 && !z11) {
            i10 = R.string.TrashHintDrag;
        } else {
            i10 = R.string.TrashHintRelease;
        }
        boolean z12 = true;
        this.f6432b.t(LocaleController.getString(i10), true, true);
        int i11 = 0;
        if (!z10 || z11) {
            z12 = false;
        }
        this.f6435f = z12;
        fk0 fk0Var = this.f6431a;
        if (z12) {
            if (fk0Var.f26103a0 > 34) {
                fk0Var.N(0, false, false);
            }
            fk0Var.P(33);
            fk0Var.start();
        } else {
            if (z11) {
                i11 = 66;
            }
            fk0Var.P(i11);
            fk0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e7 = (this.h.e(this.f6435f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e7, this.d);
        canvas.drawCircle(width, height, e7, this.f6433c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        fk0 fk0Var = this.f6431a;
        fk0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        fk0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.q6 q6Var = this.f6432b;
        q6Var.setBounds(0, dp3, width2, height2);
        q6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f6432b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
