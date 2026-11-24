package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
public final class dka extends View {
    public final ImageReceiver a;
    public final pc0 b;
    public final Paint c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public dka(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        this.b = new pc0((ylb) null);
        Paint paint = new Paint(1);
        this.c = paint;
        imageReceiver.q0(gm.L(28.0f));
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = 0.0f;
        if (z2) {
            if (z) {
                f = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f).setDuration(200L);
            duration.setInterpolator(d53.f);
            duration.addUpdateListener(new rha(this, (byte) 1));
            duration.addListener(new c39(this, (byte) 19));
            duration.start();
            this.f = duration;
            return;
        }
        if (z) {
            f = 1.0f;
        }
        this.d = f;
        invalidate();
    }

    @Override
    public final boolean isSelected() {
        if (this.d == 1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f = (this.d * 0.1f) + 0.9f;
        canvas.scale(f, f);
        int w0 = cmb.w0(null, cmb.l5, false);
        Paint paint = this.c;
        paint.setColor(w0);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = gm.P;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (!this.e) {
            float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
            float f2 = 2.0f * strokeWidth2;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.i0(strokeWidth2, strokeWidth2, getWidth() - f2, getHeight() - f2);
            imageReceiver.h(canvas, null);
        }
    }

    public void setAvatar(TLObject tLObject) {
        pc0 pc0Var = this.b;
        pc0Var.k(tLObject);
        this.a.U(tLObject, pc0Var, null);
    }

    public void setHideAvatar(boolean z) {
        this.e = z;
        invalidate();
    }
}
