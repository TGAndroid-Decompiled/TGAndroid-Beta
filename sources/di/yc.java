package di;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.yh;
import org.telegram.ui.Components.es;
public final class yc extends View {
    public final Paint f8139a;
    public final org.telegram.ui.Components.r6 f8140b;
    public boolean f8141c;

    public yc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f8139a = paint;
        this.f8141c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.f8140b = r6Var;
        r6Var.n(0.2f, 200L, es.h);
        r6Var.w(AndroidUtilities.dp(13.0f));
        r6Var.u(-1);
        r6Var.x(AndroidUtilities.bold());
        r6Var.setCallback(this);
        r6Var.f28748b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, r6Var.f28753i)) {
            r6Var.a();
            r6Var.t(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f8141c && z10) {
            return;
        }
        this.f8141c = false;
        animate().cancel();
        if (z10) {
            yh.s(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), es.h, 220L);
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
        org.telegram.ui.Components.r6 r6Var = this.f8140b;
        float c10 = r6Var.c();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - c10) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + c10) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f8139a);
        r6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        r6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f8140b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
