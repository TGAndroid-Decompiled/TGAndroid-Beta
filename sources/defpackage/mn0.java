package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class mn0 extends View {
    public final ho a;
    public float b;
    public ValueAnimator c;
    public int d;
    public final Paint e;

    public mn0(Context context) {
        super(context);
        this.b = 1.0f;
        ho hoVar = new ho(false, false, true);
        this.a = hoVar;
        hoVar.n(0.3f, 250L, d53.h);
        hoVar.setCallback(this);
        hoVar.w(gm.L(11.5f));
        hoVar.x(gm.o());
        hoVar.u(-1);
        hoVar.t("", true, true);
        hoVar.b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i, boolean z) {
        if (!oo0.k()) {
            i = 0;
        }
        if (i > 0) {
            setVisibility(0);
        }
        ho hoVar = this.a;
        if (z) {
            hoVar.a();
            if (i != this.d && i > 0) {
                ValueAnimator valueAnimator = this.c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.c = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.c = ofFloat;
                ofFloat.addUpdateListener(new f0(this, (byte) 16));
                this.c.addListener(new g0(this, (byte) 22));
                b10.n(2.0f, this.c);
                this.c.setDuration(200L);
                this.c.start();
            }
        }
        this.d = i;
        int length = hoVar.i.length();
        hoVar.t("x" + i, z, true);
        int length2 = hoVar.i.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(gm.L(3.0f), gm.L(3.0f));
        Rect rect = gm.Q;
        int L = gm.L(8.0f);
        ho hoVar = this.a;
        rect.set(0, 0, L + ((int) hoVar.c()), gm.L(20.0f));
        RectF rectF = gm.P;
        rectF.set(rect);
        if (this.b != 1.0f) {
            canvas.save();
            float f = this.b;
            canvas.scale(f, f, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), gm.L(19.0f));
        hoVar.setBounds(rect);
        hoVar.draw(canvas);
        if (this.b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.a.e() + gm.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(26.0f), 1073741824));
    }
}
