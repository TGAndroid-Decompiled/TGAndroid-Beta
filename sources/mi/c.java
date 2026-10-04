package mi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import org.telegram.ui.Components.ru;
import w7.z;
public final class c extends z {
    public final RenderNode f16440a = new RenderNode("glass-fade-content");
    public final RenderNode f16441b = new RenderNode("glass-fade-overlay");
    public final Paint f16442c;
    public final Paint d;
    public final Matrix f16443e;
    public LinearGradient f16444f;
    public int f16445g;
    public int h;
    public int f16446i;
    public final f f16447j;

    public c(f fVar) {
        this.f16447j = fVar;
        Paint paint = new Paint();
        this.f16442c = paint;
        this.d = new Paint(1);
        this.f16443e = new Matrix();
        this.f16445g = -1;
        this.h = -1;
        paint.setBlendMode(ru.d());
    }

    @Override
    public final void a(android.graphics.Rect r29, android.graphics.RectF r30) {
        throw new UnsupportedOperationException("Method not decompiled: mi.c.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f16440a.discardDisplayList();
        this.f16441b.discardDisplayList();
        this.f16445g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f16440a);
        canvas.drawRenderNode(this.f16441b);
    }

    @Override
    public final boolean d() {
        if (this.f16440a.hasDisplayList() && this.f16441b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f16440a.setAlpha(f7);
        this.f16441b.setAlpha(f7);
    }
}
