package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.is;
public final class ad extends View {
    public final Paint f4737a;
    public final org.telegram.ui.Components.q6 f4738b;
    public boolean f4739c;

    public ad(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f4737a = paint;
        this.f4739c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.f4738b = q6Var;
        q6Var.n(0.2f, 200L, is.h);
        q6Var.w(AndroidUtilities.dp(13.0f));
        q6Var.u(-1);
        q6Var.x(AndroidUtilities.bold());
        q6Var.setCallback(this);
        q6Var.f30031b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, q6Var.f30037i)) {
            q6Var.a();
            q6Var.t(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f4739c && z10) {
            return;
        }
        this.f4739c = false;
        animate().cancel();
        if (z10) {
            bi.t(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), is.h, 220L);
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
        org.telegram.ui.Components.q6 q6Var = this.f4738b;
        float c10 = q6Var.c();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - c10) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + c10) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f4737a);
        q6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        q6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f4738b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
