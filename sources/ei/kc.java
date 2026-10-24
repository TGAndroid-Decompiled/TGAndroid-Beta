package ei;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.tl;
import org.telegram.ui.Components.zr;
public final class kc extends View {
    public final Paint f9351a;
    public final org.telegram.ui.Components.n6 f9352b;
    public boolean f9353c;

    public kc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f9351a = paint;
        this.f9353c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f9352b = n6Var;
        n6Var.n(0.2f, 200L, zr.h);
        n6Var.w(AndroidUtilities.dp(13.0f));
        n6Var.u(-1);
        n6Var.x(AndroidUtilities.bold());
        n6Var.setCallback(this);
        n6Var.f28797b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, n6Var.f28802i)) {
            n6Var.a();
            n6Var.t(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f9353c && z10) {
            return;
        }
        this.f9353c = false;
        animate().cancel();
        if (z10) {
            tl.t(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), zr.h, 220L);
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
        org.telegram.ui.Components.n6 n6Var = this.f9352b;
        float c10 = n6Var.c();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - c10) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + c10) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f9351a);
        n6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f9352b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
