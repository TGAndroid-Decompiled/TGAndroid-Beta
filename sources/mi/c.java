package mi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import org.telegram.ui.Components.ru;
import w7.z;
public final class c extends z {
    public final RenderNode f16441a = new RenderNode("glass-fade-content");
    public final RenderNode f16442b = new RenderNode("glass-fade-overlay");
    public final Paint f16443c;
    public final Paint d;
    public final Matrix f16444e;
    public LinearGradient f16445f;
    public int f16446g;
    public int h;
    public int f16447i;
    public final f f16448j;

    public c(f fVar) {
        this.f16448j = fVar;
        Paint paint = new Paint();
        this.f16443c = paint;
        this.d = new Paint(1);
        this.f16444e = new Matrix();
        this.f16446g = -1;
        this.h = -1;
        paint.setBlendMode(ru.d());
    }

    @Override
    public final void a(android.graphics.Rect r29, android.graphics.RectF r30) {
        throw new UnsupportedOperationException("Method not decompiled: mi.c.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f16441a.discardDisplayList();
        this.f16442b.discardDisplayList();
        this.f16446g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f16441a);
        canvas.drawRenderNode(this.f16442b);
    }

    @Override
    public final boolean d() {
        if (this.f16441a.hasDisplayList() && this.f16442b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f16441a.setAlpha(f7);
        this.f16442b.setAlpha(f7);
    }
}
