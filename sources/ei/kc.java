package ei;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.bs;
public final class kc extends View {
    public final Paint f9340a;
    public final org.telegram.ui.Components.p6 f9341b;
    public boolean f9342c;

    public kc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f9340a = paint;
        this.f9342c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true);
        this.f9341b = p6Var;
        p6Var.n(0.2f, 200L, bs.h);
        p6Var.w(AndroidUtilities.dp(13.0f));
        p6Var.u(-1);
        p6Var.x(AndroidUtilities.bold());
        p6Var.setCallback(this);
        p6Var.f29180b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, p6Var.f29185i)) {
            p6Var.a();
            p6Var.t(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f9342c && z10) {
            return;
        }
        this.f9342c = false;
        animate().cancel();
        if (z10) {
            kk.t(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), bs.h, 220L);
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
        org.telegram.ui.Components.p6 p6Var = this.f9341b;
        float c10 = p6Var.c();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - c10) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + c10) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f9340a);
        p6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        p6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f9341b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
