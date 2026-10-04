package mi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import org.telegram.ui.Components.ru;
import w7.z;
public final class c extends z {
    public final RenderNode f16445a = new RenderNode("glass-fade-content");
    public final RenderNode f16446b = new RenderNode("glass-fade-overlay");
    public final Paint f16447c;
    public final Paint d;
    public final Matrix f16448e;
    public LinearGradient f16449f;
    public int f16450g;
    public int h;
    public int f16451i;
    public final f f16452j;

    public c(f fVar) {
        this.f16452j = fVar;
        Paint paint = new Paint();
        this.f16447c = paint;
        this.d = new Paint(1);
        this.f16448e = new Matrix();
        this.f16450g = -1;
        this.h = -1;
        paint.setBlendMode(ru.d());
    }

    @Override
    public final void a(android.graphics.Rect r29, android.graphics.RectF r30) {
        throw new UnsupportedOperationException("Method not decompiled: mi.c.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f16445a.discardDisplayList();
        this.f16446b.discardDisplayList();
        this.f16450g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f16445a);
        canvas.drawRenderNode(this.f16446b);
    }

    @Override
    public final boolean d() {
        if (this.f16445a.hasDisplayList() && this.f16446b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f16445a.setAlpha(f7);
        this.f16446b.setAlpha(f7);
    }
}
