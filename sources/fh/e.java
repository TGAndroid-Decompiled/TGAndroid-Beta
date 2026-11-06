package fh;

import a8.aa;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
public final class e extends aa {
    public final float f11496a = g0.N(0.55f);
    public final Outline f11497b = new Outline();
    public final Rect f11498c = new Rect();
    public final RenderNode d;
    public final RenderNode f11499e;
    public final Paint f11500f;
    public dh.h f11501g;
    public boolean h;
    public boolean f11502i;
    public final RectF f11503j;
    public final g f11504k;

    public e(g gVar) {
        this.f11504k = gVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.f11499e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f11500f = paint;
        this.h = true;
        this.f11502i = true;
        this.f11503j = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override
    public final void a() {
        this.d.discardDisplayList();
        this.f11499e.discardDisplayList();
        this.h = true;
    }

    @Override
    public final void b(Canvas canvas, ri.a aVar) {
        g gVar = this.f11504k;
        f fVar = gVar.Q;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = k6.r1(this.d.getAlpha() * gVar.V, gVar.f11540x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f11500f;
        if (alpha != 0) {
            paint.setShadowLayer(gVar.T, 0.0f, gVar.U, r12);
            fVar.d(canvas, paint, gVar.S);
        }
        int r13 = k6.r1(this.d.getAlpha() * gVar.V, gVar.F);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.f11496a, 0.0f, 0.0f, r13);
            fVar.d(canvas, paint, gVar.S);
        }
        Rect rect = fVar.f11515m;
        canvas.save();
        if (fVar.e()) {
            canvas.clipPath(fVar.f11513k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.f11504k.Q;
        Rect rect = fVar.f11515m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.f11498c;
        boolean z9 = false;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.f11506b;
        Outline outline = this.f11497b;
        g.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (!rect.isEmpty()) {
            this.f11499e.setPosition(0, 0, rect.width(), rect.height());
            this.d.setPosition(0, 0, rect.width(), rect.height());
            this.d.setOutline(outline);
            RenderNode renderNode = this.d;
            if (this.f11502i && !fVar.e()) {
                z9 = true;
            }
            renderNode.setClipToOutline(z9);
            this.h = true;
        }
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: fh.e.e():void");
    }

    public final void f(float f10) {
        this.d.setAlpha(f10);
    }

    public final void g(boolean z9) {
        boolean z10;
        this.f11502i = z9;
        RenderNode renderNode = this.d;
        if (z9 && !this.f11504k.Q.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        renderNode.setClipToOutline(z10);
    }

    public final void h(boolean z9) {
        boolean z10;
        if (this.f11501g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10 && Build.VERSION.SDK_INT >= 33) {
            if (z9) {
                this.f11501g = new dh.h(this.f11499e);
            } else {
                this.f11501g = null;
                this.f11499e.setRenderEffect(null);
            }
            this.h = true;
        }
    }
}
