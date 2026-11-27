package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class mm0 extends View {
    public final hn a;
    public float b;
    public ValueAnimator c;
    public int d;
    public final Paint e;

    public mm0(Context context) {
        super(context);
        this.b = 1.0f;
        hn hnVar = new hn(false, false, true);
        this.a = hnVar;
        hnVar.n(0.3f, 250L, k43.h);
        hnVar.setCallback(this);
        hnVar.w(hl.L(11.5f));
        hnVar.x(hl.o());
        hnVar.u(-1);
        hnVar.t("", true, true);
        hnVar.b = 17;
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
        hn hnVar = this.a;
        if (z) {
            hnVar.a();
            if (i != this.d && i > 0) {
                ValueAnimator valueAnimator = this.c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.c = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.c = ofFloat;
                ofFloat.addUpdateListener(new g0(this, (byte) 15));
                this.c.addListener(new h0(this, (byte) 20));
                c00.o(2.0f, this.c);
                this.c.setDuration(200L);
                this.c.start();
            }
        }
        this.d = i;
        int length = hnVar.i.length();
        hnVar.t("x" + i, z, true);
        int length2 = hnVar.i.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(hl.L(3.0f), hl.L(3.0f));
        Rect rect = hl.Q;
        int L = hl.L(8.0f);
        hn hnVar = this.a;
        rect.set(0, 0, L + ((int) hnVar.c()), hl.L(20.0f));
        RectF rectF = hl.P;
        rectF.set(rect);
        if (this.b != 1.0f) {
            canvas.save();
            float f = this.b;
            canvas.scale(f, f, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), hl.L(19.0f));
        hnVar.setBounds(rect);
        hnVar.draw(canvas);
        if (this.b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.a.e() + hl.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(26.0f), 1073741824));
    }
}
