package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class ro7 extends View implements snb {
    public final Paint a;
    public final Paint b;
    public final mm c;
    public final hn d;
    public int e;
    public float f;
    public ValueAnimator h;

    public ro7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        k43 k43Var = k43.h;
        this.c = new mm(this, 0L, 320L, k43Var);
        hn hnVar = new hn(false, true, true);
        this.d = hnVar;
        this.f = 1.0f;
        paint.setColor(aob.w0(null, aob.Fi, false));
        paint2.setColor(aob.w0(null, aob.h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hl.L(4.0f));
        hnVar.setCallback(this);
        hnVar.n(0.35f, 200L, k43Var);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = hnVar.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(hl.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        hnVar.w(hl.L(13.3f));
        hnVar.u(aob.w0(null, aob.Ji, false));
        hnVar.N = hl.L(64.0f);
        hnVar.b = 1;
    }

    public final boolean a(int i) {
        String str;
        int i2 = this.e;
        boolean z = false;
        if (i2 != i) {
            if (i2 < i) {
                z = true;
            }
            this.e = i;
            if (i > 0) {
                str = String.valueOf(i);
            } else {
                str = "";
            }
            this.d.t(str, true, true);
            if (z) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new ch4(this, (byte) 28));
                this.h.addListener(new ad5(this, (byte) 18));
                c00.o(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        if (this.e > 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.c.e(false, f);
        canvas.save();
        float f2 = this.f;
        canvas.scale(f2 * e, f2 * e, getWidth() / 2.0f, getHeight() / 2.0f);
        hn hnVar = this.d;
        float N = hl.N(12.66f) + hnVar.c();
        float N2 = hl.N(20.3f);
        RectF rectF = hl.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i = (int) (e * 255.0f);
        Paint paint = this.b;
        paint.setAlpha(i);
        canvas.drawRoundRect(rectF, hl.L(30.0f), hl.L(30.0f), paint);
        Paint paint2 = this.a;
        paint2.setAlpha(i);
        canvas.drawRoundRect(rectF, hl.L(30.0f), hl.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -hl.L(1.0f));
        hnVar.setBounds(0, 0, getWidth(), getHeight());
        hnVar.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        try {
            this.a.setColor(aob.w0(null, aob.Fi, false));
            this.b.setColor(aob.w0(null, aob.h5, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
