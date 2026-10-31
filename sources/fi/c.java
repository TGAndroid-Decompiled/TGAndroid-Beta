package fi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import org.telegram.ui.Components.au;
import v7.i7;
public final class c extends i7 {
    public final RenderNode f7111a = new RenderNode("glass-fade-content");
    public final RenderNode f7112b = new RenderNode("glass-fade-overlay");
    public final Paint f7113c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f7114f;
    public int f7115g;
    public int h;
    public int f7116i;
    public final f f7117j;

    public c(f fVar) {
        this.f7117j = fVar;
        Paint paint = new Paint();
        this.f7113c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.f7115g = -1;
        this.h = -1;
        paint.setBlendMode(au.k());
    }

    @Override
    public final void a(android.graphics.Rect r29, android.graphics.RectF r30) {
        throw new UnsupportedOperationException("Method not decompiled: fi.c.a(android.graphics.Rect, android.graphics.RectF):void");
    }

    @Override
    public final void b() {
        this.f7111a.discardDisplayList();
        this.f7112b.discardDisplayList();
        this.f7115g = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.f7111a);
        canvas.drawRenderNode(this.f7112b);
    }

    @Override
    public final boolean d() {
        if (this.f7111a.hasDisplayList() && this.f7112b.hasDisplayList()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f7111a.setAlpha(f7);
        this.f7112b.setAlpha(f7);
    }
}
