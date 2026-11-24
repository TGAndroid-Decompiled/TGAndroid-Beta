package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
public final class vy4 extends yke {
    public final RenderNode a = ul1.o();
    public final Paint b = new Paint(1);
    public final yy4 c;

    public vy4(yy4 yy4Var) {
        this.c = yy4Var;
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
        float f;
        yy4 yy4Var = this.c;
        if (!yy4Var.x && this.a.hasDisplayList()) {
            return;
        }
        int width = rect.width();
        int height = rect.height();
        int i = yy4Var.y;
        if (i != 1 && i != 4) {
            f = width;
        } else {
            f = height;
        }
        float f2 = f;
        zy4 zy4Var = yy4Var.G;
        zy4Var.getClass();
        LinearGradient l = yy4Var.l(zy4Var, f2, 0.0f, yy4Var.K, 1);
        Paint paint = this.b;
        paint.setShader(l);
        this.a.setPosition(0, 0, width, height);
        this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
        this.a.endRecording();
        paint.setShader(null);
        yy4Var.x = false;
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
