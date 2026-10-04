package mi;

import android.graphics.Canvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import w7.z;
public final class e extends z {
    public final RenderNode f16449a = ah.f.o();
    public final RuntimeShader f16450b = d.a();
    public int f16451c = -1;
    public int d = -1;
    public int f16452e;
    public RenderEffect[] f16453f;
    public float[] f16454g;
    public float[] h;
    public final f f16455i;

    public e(f fVar) {
        this.f16455i = fVar;
    }

    @Override
    public final void a(android.graphics.Rect r26, android.graphics.RectF r27) {
        throw new UnsupportedOperationException("Method not decompiled: mi.e.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f16449a.discardDisplayList();
        this.f16451c = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f16449a);
    }

    @Override
    public final boolean d() {
        return this.f16449a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f16449a.setAlpha(f7);
    }
}
