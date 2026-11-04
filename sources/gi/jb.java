package gi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.xq;
public final class jb extends View {
    public final Paint f13021a;
    public final org.telegram.ui.Components.g6 f13022b;
    public boolean f13023c;

    public jb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f13021a = paint;
        this.f13023c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f13022b = g6Var;
        g6Var.n(0.2f, 200L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(13.0f));
        g6Var.u(-1);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.setCallback(this);
        g6Var.f33983b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, g6Var.f33989i)) {
            g6Var.a();
            g6Var.t(sb2, false, true);
        }
    }

    public final void a(boolean z10) {
        if (!this.f13023c && z10) {
            return;
        }
        this.f13023c = false;
        animate().cancel();
        if (z10) {
            org.telegram.messenger.camera.q.l(animate().translationY(org.telegram.messenger.g0.L(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), xq.h, 220L);
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
        org.telegram.ui.Components.g6 g6Var = this.f13022b;
        float c2 = g6Var.c();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(((getWidth() - c2) / 2.0f) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), ((getWidth() + c2) / 2.0f) + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(23.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), this.f13021a);
        g6Var.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        g6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f13022b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
