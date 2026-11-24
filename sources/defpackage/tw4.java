package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
public final class tw4 extends xie {
    public final RenderNode a = mk1.o();
    public final Paint b = new Paint(1);
    public final ww4 c;

    public tw4(ww4 ww4Var) {
        this.c = ww4Var;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f;
        ww4 ww4Var = this.c;
        if (!ww4Var.x && this.a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i = ww4Var.y;
        if (i != 1 && i != 4) {
            f = width;
        } else {
            f = height;
        }
        float f2 = f;
        xw4 xw4Var = ww4Var.G;
        xw4Var.getClass();
        LinearGradient l = ww4Var.l(xw4Var, f2, 0.0f, ww4Var.K, 1);
        Paint paint = this.b;
        paint.setShader(l);
        this.a.setPosition(0, 0, width, height);
        this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.a.endRecording();
        paint.setShader(null);
        ww4Var.x = false;
    }

    @Override
    public final void b() {
        this.a.discardDisplayList();
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override
    public final void e(float f) {
        this.a.setAlpha(f);
    }
}
