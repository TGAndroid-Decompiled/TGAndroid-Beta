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
public final class vn7 extends View implements vlb {
    public final Paint a;
    public final Paint b;
    public final ln c;
    public final ho d;
    public int e;
    public float f;
    public ValueAnimator h;

    public vn7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        d53 d53Var = d53.h;
        this.c = new ln(this, 0L, 320L, d53Var);
        ho hoVar = new ho(false, true, true);
        this.d = hoVar;
        this.f = 1.0f;
        paint.setColor(cmb.w0(null, cmb.Ei, false));
        paint2.setColor(cmb.w0(null, cmb.g5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(gm.L(4.0f));
        hoVar.setCallback(this);
        hoVar.n(0.35f, 200L, d53Var);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = hoVar.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(gm.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        hoVar.w(gm.L(13.3f));
        hoVar.u(cmb.w0(null, cmb.Ii, false));
        hoVar.N = gm.L(64.0f);
        hoVar.b = 1;
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
                ofFloat.addUpdateListener(new fh4(this, (byte) 27));
                this.h.addListener(new v85(this, (byte) 21));
                b10.n(2.0f, this.h);
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
        ho hoVar = this.d;
        float N = gm.N(12.66f) + hoVar.c();
        float N2 = gm.N(20.3f);
        RectF rectF = gm.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i = (int) (e * 255.0f);
        Paint paint = this.b;
        paint.setAlpha(i);
        canvas.drawRoundRect(rectF, gm.L(30.0f), gm.L(30.0f), paint);
        Paint paint2 = this.a;
        paint2.setAlpha(i);
        canvas.drawRoundRect(rectF, gm.L(30.0f), gm.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -gm.L(1.0f));
        hoVar.setBounds(0, 0, getWidth(), getHeight());
        hoVar.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        try {
            this.a.setColor(cmb.w0(null, cmb.Ei, false));
            this.b.setColor(cmb.w0(null, cmb.g5, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
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
