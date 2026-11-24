package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class tcc extends View implements li4 {
    public Paint a;
    public Paint b;
    public gn c;
    public boolean d;
    public lm e;

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
            lm lmVar = this.e;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            lmVar.e(true, f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.b;
        gn gnVar = this.c;
        super.onDraw(canvas);
        lm lmVar = this.e;
        if (this.d) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = lmVar.e(false, f);
        float L = gl.L(12.66f) * e;
        float c = gnVar.c() + L;
        RectF rectF = gl.P;
        rectF.set(((getWidth() - c) / 2.0f) - gl.L(8.0f), gl.L(18.0f), ((getWidth() + c) / 2.0f) + gl.L(8.0f), gl.L(40.0f));
        canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), this.a);
        if (e > 0.0f) {
            paint.setAlpha((int) (Utilities.i((((float) Math.sin((((float) (System.currentTimeMillis() % 2000)) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + gl.L(10.66f), rectF.centerY(), gl.L(4.0f) * e, paint);
        }
        gnVar.setBounds((int) (rectF.left + L), ((int) rectF.top) - gl.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        gnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(45.0f), 1073741824));
    }

    @Override
    public void setInvert(float f) {
        this.a.setColor(bm2.f(f, 1056964608, 268435456));
        this.c.u(bm2.f(f, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
