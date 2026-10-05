package mi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import org.telegram.ui.Components.ru;
import w7.z;
public final class c extends z {
    public final RenderNode f16450a = new RenderNode("glass-fade-content");
    public final RenderNode f16451b = new RenderNode("glass-fade-overlay");
    public final Paint f16452c;
    public final Paint d;
    public final Matrix f16453e;
    public LinearGradient f16454f;
    public int f16455g;
    public int h;
    public int f16456i;
    public final f f16457j;

    public c(f fVar) {
        this.f16457j = fVar;
        Paint paint = new Paint();
        this.f16452c = paint;
        this.d = new Paint(1);
        this.f16453e = new Matrix();
        this.f16455g = -1;
        this.h = -1;
        paint.setBlendMode(ru.d());
    }

    @Override
    public final void a(android.graphics.Rect r29, android.graphics.RectF r30) {
        throw new UnsupportedOperationException("Method not decompiled: mi.c.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f16450a.discardDisplayList();
        this.f16451b.discardDisplayList();
        this.f16455g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f16450a);
        canvas.drawRenderNode(this.f16451b);
    }

    @Override
    public final boolean d() {
        if (this.f16450a.hasDisplayList() && this.f16451b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f16450a.setAlpha(f7);
        this.f16451b.setAlpha(f7);
    }
}
