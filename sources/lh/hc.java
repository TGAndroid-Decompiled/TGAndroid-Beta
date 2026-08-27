package lh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class hc extends View implements q2 {

    public Paint f16083a;

    public Paint f16084b;

    public org.telegram.ui.Components.i6 f16085c;
    public boolean d;

    public org.telegram.ui.Components.y5 f16086e;

    public final void a(long j10, boolean z10) {
        long j11 = j10 % 60;
        long j12 = (j10 - j11) / 60;
        StringBuilder sb2 = new StringBuilder(5);
        if (j12 < 10) {
            sb2.append('0');
        }
        sb2.append(j12);
        sb2.append(':');
        if (j11 < 10) {
            sb2.append('0');
        }
        sb2.append(j11);
        this.f16085c.q(sb2, z10, true);
    }

    public final void b(boolean z10, boolean z11) {
        this.d = z10;
        if (!z11) {
            this.f16086e.d(z10 ? 1.0f : 0.0f, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f16084b;
        org.telegram.ui.Components.i6 i6Var = this.f16085c;
        super.onDraw(canvas);
        float fD = this.f16086e.d(this.d ? 1.0f : 0.0f, false);
        float fDp = AndroidUtilities.dp(12.66f) * fD;
        float fD2 = i6Var.d() + fDp;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - fD2) / 2.0f) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(18.0f), ((getWidth() + fD2) / 2.0f) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f16083a);
        if (fD > 0.0f) {
            paint.setAlpha((int) (Utilities.clamp((((float) Math.sin(((double) ((System.currentTimeMillis() % 2000) / 1000.0f)) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + AndroidUtilities.dp(10.66f), rectF.centerY(), AndroidUtilities.dp(4.0f) * fD, paint);
        }
        i6Var.setBounds((int) (rectF.left + fDp), ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }

    @Override
    public void setInvert(float f10) {
        this.f16083a.setColor(i0.b.d(f10, 1056964608, 268435456));
        this.f16085c.r(i0.b.d(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f16085c == drawable || super.verifyDrawable(drawable);
    }
}
