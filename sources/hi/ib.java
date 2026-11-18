package hi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class ib extends View implements n2 {
    public Paint f14779a;
    public Paint f14780b;
    public org.telegram.ui.Components.m6 f14781c;
    public boolean d;
    public org.telegram.ui.Components.c6 f14782e;

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
        this.f14781c.t(sb2, z10, true);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        this.d = z10;
        if (!z11) {
            org.telegram.ui.Components.c6 c6Var = this.f14782e;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c6Var.e(true, f10);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f14780b;
        org.telegram.ui.Components.m6 m6Var = this.f14781c;
        super.onDraw(canvas);
        org.telegram.ui.Components.c6 c6Var = this.f14782e;
        if (this.d) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = c6Var.e(false, f10);
        float L = org.telegram.messenger.g0.L(12.66f) * e10;
        float c10 = m6Var.c() + L;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(((getWidth() - c10) / 2.0f) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(18.0f), ((getWidth() + c10) / 2.0f) + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(40.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.f14779a);
        if (e10 > 0.0f) {
            paint.setAlpha((int) (Utilities.i((((float) Math.sin((((float) (System.currentTimeMillis() % 2000)) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + org.telegram.messenger.g0.L(10.66f), rectF.centerY(), org.telegram.messenger.g0.L(4.0f) * e10, paint);
        }
        m6Var.setBounds((int) (rectF.left + L), ((int) rectF.top) - org.telegram.messenger.g0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        m6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), 1073741824));
    }

    @Override
    public void setInvert(float f10) {
        this.f14779a.setColor(i0.a.f(f10, 1056964608, 268435456));
        this.f14781c.u(i0.a.f(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f14781c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
