package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
public final class gl0 extends mod {
    public final float a = gl.N(0.55f);
    public final Outline b = new Outline();
    public final Rect c = new Rect();
    public final RenderNode d;
    public final RenderNode e;
    public final Paint f;
    public s46 g;
    public boolean h;
    public boolean i;
    public final RectF j;
    public final il0 k;

    public gl0(il0 il0Var) {
        this.k = il0Var;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = true;
        this.i = true;
        this.j = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override
    public final void a() {
        this.d.discardDisplayList();
        this.e.discardDisplayList();
        this.h = true;
    }

    @Override
    public final void b(Canvas canvas, gx4 gx4Var) {
        il0 il0Var = this.k;
        hl0 hl0Var = il0Var.S;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int p1 = bkb.p1(this.d.getAlpha() * il0Var.X, il0Var.x);
        int alpha = Color.alpha(p1);
        Paint paint = this.f;
        if (alpha != 0) {
            paint.setShadowLayer(il0Var.V, 0.0f, il0Var.W, p1);
            hl0Var.d(canvas, paint, il0Var.U);
        }
        int p12 = bkb.p1(this.d.getAlpha() * il0Var.X, il0Var.G);
        if (Color.alpha(p12) != 0) {
            paint.setShadowLayer(this.a, 0.0f, 0.0f, p12);
            hl0Var.d(canvas, paint, il0Var.U);
        }
        Rect rect = hl0Var.m;
        canvas.save();
        if (hl0Var.e()) {
            canvas.clipPath(hl0Var.k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        hl0 hl0Var = this.k.S;
        Rect rect = hl0Var.m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.c;
        boolean z = false;
        rect2.set(0, 0, width, height);
        float[] fArr = hl0Var.b;
        Outline outline = this.b;
        il0.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (!rect.isEmpty()) {
            this.e.setPosition(0, 0, rect.width(), rect.height());
            this.d.setPosition(0, 0, rect.width(), rect.height());
            this.d.setOutline(outline);
            RenderNode renderNode = this.d;
            if (this.i && !hl0Var.e()) {
                z = true;
            }
            renderNode.setClipToOutline(z);
            this.h = true;
        }
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl0.e():void");
    }

    public final void f(float f) {
        this.d.setAlpha(f);
    }

    public final void g(boolean z) {
        boolean z2;
        this.i = z;
        RenderNode renderNode = this.d;
        if (z && !this.k.S.e()) {
            z2 = true;
        } else {
            z2 = false;
        }
        renderNode.setClipToOutline(z2);
    }

    public final void h(boolean z) {
        boolean z2;
        if (this.g != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2 && Build.VERSION.SDK_INT >= 33) {
            if (z) {
                this.g = new s46(this.e);
            } else {
                this.g = null;
                this.e.setRenderEffect(null);
            }
            this.h = true;
        }
    }
}
