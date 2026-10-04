package mi;

import android.graphics.Canvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import w7.z;
public final class e extends z {
    public final RenderNode f16453a = ah.f.o();
    public final RuntimeShader f16454b = d.a();
    public int f16455c = -1;
    public int d = -1;
    public int f16456e;
    public RenderEffect[] f16457f;
    public float[] f16458g;
    public float[] h;
    public final f f16459i;

    public e(f fVar) {
        this.f16459i = fVar;
    }

    @Override
    public final void a(android.graphics.Rect r26, android.graphics.RectF r27) {
        throw new UnsupportedOperationException("Method not decompiled: mi.e.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f16453a.discardDisplayList();
        this.f16455c = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f16453a);
    }

    @Override
    public final boolean d() {
        return this.f16453a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f16453a.setAlpha(f7);
    }
}
