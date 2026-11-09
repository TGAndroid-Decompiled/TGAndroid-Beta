package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class kb extends View implements o2 {
    public Paint f12283a;
    public Paint f12284b;
    public org.telegram.ui.Components.i6 f12285c;
    public boolean d;
    public org.telegram.ui.Components.w5 f12286e;

    public final void a(long j3, boolean z9) {
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
        this.f12285c.t(sb2, z9, true);
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        this.d = z9;
        if (!z10) {
            org.telegram.ui.Components.w5 w5Var = this.f12286e;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            w5Var.e(true, f10);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f12284b;
        org.telegram.ui.Components.i6 i6Var = this.f12285c;
        super.onDraw(canvas);
        org.telegram.ui.Components.w5 w5Var = this.f12286e;
        if (this.d) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = w5Var.e(false, f10);
        float L = org.telegram.messenger.g0.L(12.66f) * e10;
        float c10 = i6Var.c() + L;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(((getWidth() - c10) / 2.0f) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(18.0f), ((getWidth() + c10) / 2.0f) + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(40.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.f12283a);
        if (e10 > 0.0f) {
            paint.setAlpha((int) (Utilities.i((((float) Math.sin((((float) (System.currentTimeMillis() % 2000)) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + org.telegram.messenger.g0.L(10.66f), rectF.centerY(), org.telegram.messenger.g0.L(4.0f) * e10, paint);
        }
        i6Var.setBounds((int) (rectF.left + L), ((int) rectF.top) - org.telegram.messenger.g0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), 1073741824));
    }

    @Override
    public void setInvert(float f10) {
        this.f12283a.setColor(i0.a.f(f10, 1056964608, 268435456));
        this.f12285c.u(i0.a.f(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f12285c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
