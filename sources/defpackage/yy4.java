package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
public final class yy4 extends rne {
    public final RenderNode a = vk1.o();
    public final Paint b = new Paint(1);
    public final bz4 c;

    public yy4(bz4 bz4Var) {
        this.c = bz4Var;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f;
        bz4 bz4Var = this.c;
        if (!bz4Var.x && this.a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i = bz4Var.y;
        if (i != 1 && i != 4) {
            f = width;
        } else {
            f = height;
        }
        float f2 = f;
        cz4 cz4Var = bz4Var.G;
        cz4Var.getClass();
        LinearGradient l = bz4Var.l(cz4Var, f2, 0.0f, bz4Var.K, 1);
        Paint paint = this.b;
        paint.setShader(l);
        this.a.setPosition(0, 0, width, height);
        this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.a.endRecording();
        paint.setShader(null);
        bz4Var.x = false;
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
