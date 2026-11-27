package defpackage;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class en {
    public final dm a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final hn i;

    public en(hn hnVar, StaticLayout staticLayout, float f, int i) {
        float f2;
        float f3;
        float f4;
        this.i = hnVar;
        this.b = staticLayout;
        this.d = i;
        this.c = f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f2 = staticLayout.getLineLeft(0);
        } else {
            f2 = 0.0f;
        }
        this.e = f2;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f3 = staticLayout.getLineWidth(0);
        } else {
            f3 = 0.0f;
        }
        this.f = f3;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f4 = staticLayout.getLineBaseline(0);
        } else {
            f4 = 0.0f;
        }
        this.g = f4;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.g : 0.0f;
        if (hnVar.getCallback() instanceof View) {
            this.a = hm.update(hnVar.p, (View) hnVar.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f) {
        int i;
        hn hnVar = this.i;
        int i2 = hnVar.C;
        TextPaint textPaint = hnVar.a;
        int max = Math.max(0, Math.min(255, (int) (i2 * f)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (hnVar.V) {
                textPaint.setShadowLayer(hnVar.W, 0.0f, hnVar.X, hnVar.Y);
            }
            if (max < 255) {
                i = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i = -1;
            }
            this.b.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, hnVar.b0);
            if (i != -1) {
                canvas.restoreToCount(i);
            }
        }
    }
}
