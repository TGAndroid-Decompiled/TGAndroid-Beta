package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class rgc extends View implements qk4 {
    public Paint a;
    public Paint b;
    public hn c;
    public boolean d;
    public mm e;

    public final void a(long j, boolean z) {
        long j2 = j % 60;
        long j3 = (j - j2) / 60;
        StringBuilder sb = new StringBuilder(5);
        if (j3 < 10) {
            sb.append('0');
        }
        sb.append(j3);
        sb.append(':');
        if (j2 < 10) {
            sb.append('0');
        }
        sb.append(j2);
        this.c.t(sb, z, true);
    }

    public final void b(boolean z, boolean z2) {
        float f;
        this.d = z;
        if (!z2) {
            mm mmVar = this.e;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            mmVar.e(true, f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.b;
        hn hnVar = this.c;
        super.onDraw(canvas);
        mm mmVar = this.e;
        if (this.d) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = mmVar.e(false, f);
        float L = hl.L(12.66f) * e;
        float c = hnVar.c() + L;
        RectF rectF = hl.P;
        rectF.set(((getWidth() - c) / 2.0f) - hl.L(8.0f), hl.L(18.0f), ((getWidth() + c) / 2.0f) + hl.L(8.0f), hl.L(40.0f));
        canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), this.a);
        if (e > 0.0f) {
            paint.setAlpha((int) (Utilities.i((((float) Math.sin((((float) (System.currentTimeMillis() % 2000)) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + hl.L(10.66f), rectF.centerY(), hl.L(4.0f) * e, paint);
        }
        hnVar.setBounds((int) (rectF.left + L), ((int) rectF.top) - hl.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        hnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(45.0f), 1073741824));
    }

    @Override
    public void setInvert(float f) {
        this.a.setColor(vm2.f(f, 1056964608, 268435456));
        this.c.u(vm2.f(f, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
