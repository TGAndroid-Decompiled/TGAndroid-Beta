package defpackage;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class dn {
    public final cm a;
    public final StaticLayout b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final gn i;

    public dn(gn gnVar, StaticLayout staticLayout, float f, int i) {
        float f2;
        float f3;
        float f4;
        this.i = gnVar;
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
        if (gnVar.getCallback() instanceof View) {
            this.a = gm.update(gnVar.p, (View) gnVar.getCallback(), this.a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f) {
        int i;
        gn gnVar = this.i;
        int i2 = gnVar.C;
        TextPaint textPaint = gnVar.a;
        int max = Math.max(0, Math.min(255, (int) (i2 * f)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (gnVar.V) {
                textPaint.setShadowLayer(gnVar.W, 0.0f, gnVar.X, gnVar.Y);
            }
            if (max < 255) {
                i = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i = -1;
            }
            this.b.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.b, this.a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, gnVar.b0);
            if (i != -1) {
                canvas.restoreToCount(i);
            }
        }
    }
}
