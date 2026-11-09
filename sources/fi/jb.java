package fi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.xq;
public final class jb extends View {
    public final Paint f12244a;
    public final org.telegram.ui.Components.i6 f12245b;
    public boolean f12246c;

    public jb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f12244a = paint;
        this.f12246c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.f12245b = i6Var;
        i6Var.n(0.2f, 200L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(13.0f));
        i6Var.u(-1);
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.setCallback(this);
        i6Var.f34587b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (!TextUtils.equals(sb2, i6Var.f34593i)) {
            i6Var.a();
            i6Var.t(sb2, false, true);
        }
    }

    public final void a(boolean z9) {
        if (!this.f12246c && z9) {
            return;
        }
        this.f12246c = false;
        animate().cancel();
        if (z9) {
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
        org.telegram.ui.Components.i6 i6Var = this.f12245b;
        float c10 = i6Var.c();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(((getWidth() - c10) / 2.0f) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), ((getWidth() + c10) / 2.0f) + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(23.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), this.f12244a);
        i6Var.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f12245b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
