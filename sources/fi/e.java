package fi;

import android.graphics.Canvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import v7.i7;
public final class e extends i7 {
    public final RenderNode f7118a = w.m();
    public final RuntimeShader f7119b = d.a();
    public int f7120c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f7121f;
    public float[] f7122g;
    public float[] h;
    public final f f7123i;

    public e(f fVar) {
        this.f7123i = fVar;
    }

    @Override
    public final void a(android.graphics.Rect r25, android.graphics.RectF r26) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f7118a.discardDisplayList();
        this.f7120c = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f7118a);
    }

    @Override
    public final boolean d() {
        return this.f7118a.hasDisplayList();
    }

    @Override
    public final void e(float f7) {
        this.f7118a.setAlpha(f7);
    }
}
