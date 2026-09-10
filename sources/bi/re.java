package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class re extends View implements l3 {
    public Paint f3631a;
    public Paint f3632b;
    public org.telegram.ui.Components.n6 f3633c;
    public boolean d;
    public org.telegram.ui.Components.d6 e;

    public final void a(long j3, boolean z10) {
        long j10 = j3 % 60;
        long j11 = (j3 - j10) / 60;
        StringBuilder sb2 = new StringBuilder(5);
        if (j11 < 10) {
            sb2.append('0');
        }
        sb2.append(j11);
        sb2.append(':');
        if (j10 < 10) {
            sb2.append('0');
        }
        sb2.append(j10);
        this.f3633c.q(sb2, z10, true);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.d = z10;
        if (!z11) {
            org.telegram.ui.Components.d6 d6Var = this.e;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            d6Var.d(f7, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f3632b;
        org.telegram.ui.Components.n6 n6Var = this.f3633c;
        super.onDraw(canvas);
        org.telegram.ui.Components.d6 d6Var = this.e;
        if (this.d) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = d6Var.d(f7, false);
        float dp = AndroidUtilities.dp(12.66f) * d;
        float d10 = n6Var.d() + dp;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - d10) / 2.0f) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(18.0f), ((getWidth() + d10) / 2.0f) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f3631a);
        if (d > 0.0f) {
            paint.setAlpha((int) (Utilities.clamp((((float) Math.sin((((float) (System.currentTimeMillis() % 2000)) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + AndroidUtilities.dp(10.66f), rectF.centerY(), AndroidUtilities.dp(4.0f) * d, paint);
        }
        n6Var.setBounds((int) (rectF.left + dp), ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }

    @Override
    public void setInvert(float f7) {
        this.f3631a.setColor(i0.a.d(f7, 1056964608, 268435456));
        this.f3633c.r(i0.a.d(f7, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f3633c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
