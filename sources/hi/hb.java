package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.nr;
public final class hb extends View {
    public final Paint f14695a;
    public final org.telegram.ui.Components.n6 f14696b;
    public boolean f14697c;

    public hb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f14695a = paint;
        this.f14697c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f14696b = n6Var;
        n6Var.n(0.2f, 200L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(13.0f));
        n6Var.u(-1);
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.setCallback(this);
        n6Var.f37751b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, n6Var.f37758i)) {
            n6Var.a();
            n6Var.t(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f14697c && z10) {
            return;
        }
        this.f14697c = false;
        animate().cancel();
        if (z10) {
            o10.o(animate().translationY(org.telegram.messenger.g0.L(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), nr.h, 220L);
            return;
        }
        setTranslationY(org.telegram.messenger.g0.L(6.0f));
        setScaleX(0.8f);
        setScaleY(0.8f);
        setAlpha(0.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.n6 n6Var = this.f14696b;
        float c10 = n6Var.c();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(((getWidth() - c10) / 2.0f) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), ((getWidth() + c10) / 2.0f) + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(23.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), this.f14695a);
        n6Var.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f14696b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
