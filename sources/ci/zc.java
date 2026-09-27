package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.qk;
import org.telegram.ui.Components.sr;
public final class zc extends View {
    public final Paint f5924a;
    public final org.telegram.ui.Components.o6 f5925b;
    public boolean f5926c;

    public zc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f5924a = paint;
        this.f5926c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.f5925b = o6Var;
        o6Var.k(0.2f, 200L, sr.h);
        o6Var.t(AndroidUtilities.dp(13.0f));
        o6Var.r(-1);
        o6Var.u(AndroidUtilities.bold());
        o6Var.setCallback(this);
        o6Var.f26983b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, o6Var.f26986g)) {
            o6Var.b();
            o6Var.q(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f5926c && z10) {
            return;
        }
        this.f5926c = false;
        animate().cancel();
        if (z10) {
            qk.s(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), sr.h, 220L);
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
        org.telegram.ui.Components.o6 o6Var = this.f5925b;
        float d = o6Var.d();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - d) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + d) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f5924a);
        o6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        o6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f5925b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
