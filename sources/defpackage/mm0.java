package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class mm0 extends View {
    public final gn a;
    public float b;
    public ValueAnimator c;
    public int d;
    public final Paint e;

    public mm0(Context context) {
        super(context);
        this.b = 1.0f;
        gn gnVar = new gn(false, false, true);
        this.a = gnVar;
        gnVar.n(0.3f, 250L, s33.h);
        gnVar.setCallback(this);
        gnVar.w(gl.L(11.5f));
        gnVar.x(gl.o());
        gnVar.u(-1);
        gnVar.t("", true, true);
        gnVar.b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i, boolean z) {
        if (!on0.k()) {
            i = 0;
        }
        if (i > 0) {
            setVisibility(0);
        }
        gn gnVar = this.a;
        if (z) {
            gnVar.a();
            if (i != this.d && i > 0) {
                ValueAnimator valueAnimator = this.c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.c = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.c = ofFloat;
                ofFloat.addUpdateListener(new f0(this, (byte) 15));
                this.c.addListener(new g0(this, (byte) 20));
                b00.n(2.0f, this.c);
                this.c.setDuration(200L);
                this.c.start();
            }
        }
        this.d = i;
        int length = gnVar.i.length();
        gnVar.t("x" + i, z, true);
        int length2 = gnVar.i.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(gl.L(3.0f), gl.L(3.0f));
        Rect rect = gl.Q;
        int L = gl.L(8.0f);
        gn gnVar = this.a;
        rect.set(0, 0, L + ((int) gnVar.c()), gl.L(20.0f));
        RectF rectF = gl.P;
        rectF.set(rect);
        if (this.b != 1.0f) {
            canvas.save();
            float f = this.b;
            canvas.scale(f, f, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), gl.L(19.0f));
        gnVar.setBounds(rect);
        gnVar.draw(canvas);
        if (this.b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.a.e() + gl.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(26.0f), 1073741824));
    }
}
