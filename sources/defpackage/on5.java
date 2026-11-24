package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class on5 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final float c;
    public float d;
    public final View e;
    public boolean f;
    public float h;
    public int n;

    public on5(float f, int i, View view) {
        wd wdVar = new wd(this, (byte) 10);
        this.f = true;
        this.n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.d = i;
        this.c = f;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(0.66f), 855638016);
        View view2 = this.e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(wdVar);
                if (this.e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.K();
                }
            }
            View view3 = this.e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.I();
            }
            this.e = view;
            imageReceiver.p0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(wdVar);
            }
        }
    }

    public final void a(float f) {
        float L = gm.L(f);
        this.d = L;
        this.b.q0((int) L);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z = this.f;
        Paint paint2 = this.a;
        if (z && this.n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(0.66f), cmb.p1(this.n / 255.0f, 855638016));
        }
        float f2 = this.h + f;
        float f3 = this.c;
        float L = (((i3 + i5) / 2.0f) + 0.0f) - (gm.L(f3) / 2.0f);
        if (this.f) {
            RectF rectF = gm.P;
            rectF.set(f2, L, gm.L(f3) + f2, gm.L(f3) + L);
            float f4 = this.d;
            canvas.drawRoundRect(rectF, f4, f4, paint2);
        }
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f2, L, gm.L(f3), gm.L(f3));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.h(canvas, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return gm.L(this.c);
    }
}
