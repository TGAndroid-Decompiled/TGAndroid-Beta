package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class zc extends View implements v2 {
    public Paint f8196a;
    public Paint f8197b;
    public org.telegram.ui.Components.r6 f8198c;
    public boolean d;
    public org.telegram.ui.Components.g6 e;

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
        this.f8198c.t(sb2, z10, true);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.d = z10;
        if (!z11) {
            org.telegram.ui.Components.g6 g6Var = this.e;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g6Var.d(f7, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f8197b;
        org.telegram.ui.Components.r6 r6Var = this.f8198c;
        super.onDraw(canvas);
        org.telegram.ui.Components.g6 g6Var = this.e;
        if (this.d) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = g6Var.d(f7, false);
        float dp = AndroidUtilities.dp(12.66f) * d;
        float c10 = r6Var.c() + dp;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - c10) / 2.0f) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(18.0f), ((getWidth() + c10) / 2.0f) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f8196a);
        if (d > 0.0f) {
            paint.setAlpha((int) (Utilities.clamp((((float) Math.sin((((float) (System.currentTimeMillis() % 2000)) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + AndroidUtilities.dp(10.66f), rectF.centerY(), AndroidUtilities.dp(4.0f) * d, paint);
        }
        r6Var.setBounds((int) (rectF.left + dp), ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        r6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }

    @Override
    public void setInvert(float f7) {
        this.f8196a.setColor(i0.a.d(f7, 1056964608, 268435456));
        this.f8198c.u(i0.a.d(f7, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f8198c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
