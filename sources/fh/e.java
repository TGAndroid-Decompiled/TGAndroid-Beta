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
import org.telegram.ui.ActionBar.m6;
public final class e extends ea {
    public final float f11656a = g0.N(0.55f);
    public final Outline f11657b = new Outline();
    public final Rect f11658c = new Rect();
    public final RenderNode d;
    public final RenderNode f11659e;
    public final Paint f11660f;
    public dh.h f11661g;
    public boolean h;
    public boolean f11662i;
    public final RectF f11663j;
    public final g f11664k;

    public e(g gVar) {
        this.f11664k = gVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.f11659e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f11660f = paint;
        this.h = true;
        this.f11662i = true;
        this.f11663j = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override
    public final void a() {
        this.d.discardDisplayList();
        this.f11659e.discardDisplayList();
        this.h = true;
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        g gVar = this.f11664k;
        f fVar = gVar.R;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = m6.r1(this.d.getAlpha() * gVar.W, gVar.f11701x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f11660f;
        if (alpha != 0) {
            paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r12);
            fVar.d(canvas, paint, gVar.T);
        }
        int r13 = m6.r1(this.d.getAlpha() * gVar.W, gVar.G);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.f11656a, 0.0f, 0.0f, r13);
            fVar.d(canvas, paint, gVar.T);
        }
        Rect rect = fVar.f11675m;
        canvas.save();
        if (fVar.e()) {
            canvas.clipPath(fVar.f11673k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.f11664k.R;
        Rect rect = fVar.f11675m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.f11658c;
        boolean z10 = false;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.f11666b;
        Outline outline = this.f11657b;
        g.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (!rect.isEmpty()) {
            this.f11659e.setPosition(0, 0, rect.width(), rect.height());
            this.d.setPosition(0, 0, rect.width(), rect.height());
            this.d.setOutline(outline);
            RenderNode renderNode = this.d;
            if (this.f11662i && !fVar.e()) {
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
        this.f11662i = z10;
        RenderNode renderNode = this.d;
        if (z10 && !this.f11664k.R.e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        renderNode.setClipToOutline(z11);
    }

    public final void h(boolean z10) {
        boolean z11;
        if (this.f11661g != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11 && Build.VERSION.SDK_INT >= 33) {
            if (z10) {
                this.f11661g = new dh.h(this.f11659e);
            } else {
                this.f11661g = null;
                this.f11659e.setRenderEffect(null);
            }
            this.h = true;
        }
    }
}
