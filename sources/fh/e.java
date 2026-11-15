package fh;

import a8.ca;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.j6;
public final class e extends ca {
    public final float f11310a = g0.N(0.55f);
    public final Outline f11311b = new Outline();
    public final Rect f11312c = new Rect();
    public final RenderNode d;
    public final RenderNode f11313e;
    public final Paint f11314f;
    public dh.h f11315g;
    public boolean h;
    public boolean f11316i;
    public final RectF f11317j;
    public final g f11318k;

    public e(g gVar) {
        this.f11318k = gVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.f11313e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f11314f = paint;
        this.h = true;
        this.f11316i = true;
        this.f11317j = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override
    public final void a() {
        this.d.discardDisplayList();
        this.f11313e.discardDisplayList();
        this.h = true;
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        g gVar = this.f11318k;
        f fVar = gVar.R;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = j6.r1(this.d.getAlpha() * gVar.W, gVar.f11355x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f11314f;
        if (alpha != 0) {
            paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r12);
            fVar.d(canvas, paint, gVar.T);
        }
        int r13 = j6.r1(this.d.getAlpha() * gVar.W, gVar.G);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.f11310a, 0.0f, 0.0f, r13);
            fVar.d(canvas, paint, gVar.T);
        }
        Rect rect = fVar.f11329m;
        canvas.save();
        if (fVar.e()) {
            canvas.clipPath(fVar.f11327k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.f11318k.R;
        Rect rect = fVar.f11329m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.f11312c;
        boolean z10 = false;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.f11320b;
        Outline outline = this.f11311b;
        g.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (!rect.isEmpty()) {
            this.f11313e.setPosition(0, 0, rect.width(), rect.height());
            this.d.setPosition(0, 0, rect.width(), rect.height());
            this.d.setOutline(outline);
            RenderNode renderNode = this.d;
            if (this.f11316i && !fVar.e()) {
                z10 = true;
            }
            renderNode.setClipToOutline(z10);
            this.h = true;
        }
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: fh.e.e():void");
    }

    public final void f(float f10) {
        this.d.setAlpha(f10);
    }

    public final void g(boolean z10) {
        boolean z11;
        this.f11316i = z10;
        RenderNode renderNode = this.d;
        if (z10 && !this.f11318k.R.e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        renderNode.setClipToOutline(z11);
    }

    public final void h(boolean z10) {
        boolean z11;
        if (this.f11315g != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11 && Build.VERSION.SDK_INT >= 33) {
            if (z10) {
                this.f11315g = new dh.h(this.f11313e);
            } else {
                this.f11315g = null;
                this.f11313e.setRenderEffect(null);
            }
            this.h = true;
        }
    }
}
