package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.qr;
public final class dd extends View {
    public final Paint f4549a;
    public final org.telegram.ui.Components.n6 f4550b;
    public boolean f4551c;

    public dd(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f4549a = paint;
        this.f4551c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.f4550b = n6Var;
        n6Var.k(0.2f, 200L, qr.h);
        n6Var.t(AndroidUtilities.dp(13.0f));
        n6Var.r(-1);
        n6Var.u(AndroidUtilities.bold());
        n6Var.setCallback(this);
        n6Var.f26575b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, n6Var.f26578g)) {
            n6Var.b();
            n6Var.q(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f4551c && z10) {
            return;
        }
        this.f4551c = false;
        animate().cancel();
        if (z10) {
            rk.s(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), qr.h, 220L);
            return;
        }
        setTranslationY(AndroidUtilities.dp(6.0f));
        setScaleX(0.8f);
        setScaleY(0.8f);
        setAlpha(0.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.n6 n6Var = this.f4550b;
        float d = n6Var.d();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - d) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + d) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f4549a);
        n6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f4550b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
