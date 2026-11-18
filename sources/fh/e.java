package fh;

import a8.ea;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.n6;
public final class e extends ea {
    public final float f11627a = g0.N(0.55f);
    public final Outline f11628b = new Outline();
    public final Rect f11629c = new Rect();
    public final RenderNode d;
    public final RenderNode f11630e;
    public final Paint f11631f;
    public dh.h f11632g;
    public boolean h;
    public boolean f11633i;
    public final RectF f11634j;
    public final g f11635k;

    public e(g gVar) {
        this.f11635k = gVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.f11630e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f11631f = paint;
        this.h = true;
        this.f11633i = true;
        this.f11634j = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override
    public final void a() {
        this.d.discardDisplayList();
        this.f11630e.discardDisplayList();
        this.h = true;
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        g gVar = this.f11635k;
        f fVar = gVar.R;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = n6.r1(this.d.getAlpha() * gVar.W, gVar.f11672x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f11631f;
        if (alpha != 0) {
            paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r12);
            fVar.d(canvas, paint, gVar.T);
        }
        int r13 = n6.r1(this.d.getAlpha() * gVar.W, gVar.G);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.f11627a, 0.0f, 0.0f, r13);
            fVar.d(canvas, paint, gVar.T);
        }
        Rect rect = fVar.f11646m;
        canvas.save();
        if (fVar.e()) {
            canvas.clipPath(fVar.f11644k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.f11635k.R;
        Rect rect = fVar.f11646m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.f11629c;
        boolean z10 = false;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.f11637b;
        Outline outline = this.f11628b;
        g.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (!rect.isEmpty()) {
            this.f11630e.setPosition(0, 0, rect.width(), rect.height());
            this.d.setPosition(0, 0, rect.width(), rect.height());
            this.d.setOutline(outline);
            RenderNode renderNode = this.d;
            if (this.f11633i && !fVar.e()) {
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
        this.f11633i = z10;
        RenderNode renderNode = this.d;
        if (z10 && !this.f11635k.R.e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        renderNode.setClipToOutline(z11);
    }

    public final void h(boolean z10) {
        boolean z11;
        if (this.f11632g != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11 && Build.VERSION.SDK_INT >= 33) {
            if (z10) {
                this.f11632g = new dh.h(this.f11630e);
            } else {
                this.f11632g = null;
                this.f11630e.setRenderEffect(null);
            }
            this.h = true;
        }
    }
}
