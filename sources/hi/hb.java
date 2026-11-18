package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.lr;
public final class hb extends View {
    public final Paint f14739a;
    public final org.telegram.ui.Components.m6 f14740b;
    public boolean f14741c;

    public hb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f14739a = paint;
        this.f14741c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f14740b = m6Var;
        m6Var.n(0.2f, 200L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(13.0f));
        m6Var.u(-1);
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.setCallback(this);
        m6Var.f37377b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, m6Var.f37384i)) {
            m6Var.a();
            m6Var.t(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f14741c && z10) {
            return;
        }
        this.f14741c = false;
        animate().cancel();
        if (z10) {
            n10.o(animate().translationY(org.telegram.messenger.g0.L(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), lr.h, 220L);
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
        org.telegram.ui.Components.m6 m6Var = this.f14740b;
        float c10 = m6Var.c();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(((getWidth() - c10) / 2.0f) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), ((getWidth() + c10) / 2.0f) + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(23.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), this.f14739a);
        m6Var.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        m6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f14740b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
