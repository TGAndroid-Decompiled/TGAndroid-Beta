package di;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vl;
import org.telegram.ui.Components.pr;
public final class dd extends View {
    public final Paint f7113a;
    public final org.telegram.ui.Components.p6 f7114b;
    public boolean f7115c;

    public dd(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f7113a = paint;
        this.f7115c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.f7114b = p6Var;
        p6Var.k(0.2f, 200L, pr.h);
        p6Var.t(AndroidUtilities.dp(13.0f));
        p6Var.r(-1);
        p6Var.u(AndroidUtilities.bold());
        p6Var.setCallback(this);
        p6Var.f29285b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, p6Var.f29289g)) {
            p6Var.b();
            p6Var.q(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f7115c && z10) {
            return;
        }
        this.f7115c = false;
        animate().cancel();
        if (z10) {
            vl.q(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), pr.h, 220L);
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
        org.telegram.ui.Components.p6 p6Var = this.f7114b;
        float d = p6Var.d();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - d) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + d) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f7113a);
        p6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        p6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f7114b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
