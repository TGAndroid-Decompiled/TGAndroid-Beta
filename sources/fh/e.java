package fh;

import a8.fa;
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
public final class e extends fa {
    public final float f11622a = g0.N(0.55f);
    public final Outline f11623b = new Outline();
    public final Rect f11624c = new Rect();
    public final RenderNode d;
    public final RenderNode f11625e;
    public final Paint f11626f;
    public dh.h f11627g;
    public boolean h;
    public boolean f11628i;
    public final RectF f11629j;
    public final g f11630k;

    public e(g gVar) {
        this.f11630k = gVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.f11625e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f11626f = paint;
        this.h = true;
        this.f11628i = true;
        this.f11629j = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override
    public final void a() {
        this.d.discardDisplayList();
        this.f11625e.discardDisplayList();
        this.h = true;
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        g gVar = this.f11630k;
        f fVar = gVar.R;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = m6.r1(this.d.getAlpha() * gVar.W, gVar.f11667x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f11626f;
        if (alpha != 0) {
            paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r12);
            fVar.d(canvas, paint, gVar.T);
        }
        int r13 = m6.r1(this.d.getAlpha() * gVar.W, gVar.G);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.f11622a, 0.0f, 0.0f, r13);
            fVar.d(canvas, paint, gVar.T);
        }
        Rect rect = fVar.f11641m;
        canvas.save();
        if (fVar.e()) {
            canvas.clipPath(fVar.f11639k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.f11630k.R;
        Rect rect = fVar.f11641m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.f11624c;
        boolean z10 = false;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.f11632b;
        Outline outline = this.f11623b;
        g.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (!rect.isEmpty()) {
            this.f11625e.setPosition(0, 0, rect.width(), rect.height());
            this.d.setPosition(0, 0, rect.width(), rect.height());
            this.d.setOutline(outline);
            RenderNode renderNode = this.d;
            if (this.f11628i && !fVar.e()) {
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
        this.f11628i = z10;
        RenderNode renderNode = this.d;
        if (z10 && !this.f11630k.R.e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        renderNode.setClipToOutline(z11);
    }

    public final void h(boolean z10) {
        boolean z11;
        if (this.f11627g != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11 && Build.VERSION.SDK_INT >= 33) {
            if (z10) {
                this.f11627g = new dh.h(this.f11625e);
            } else {
                this.f11627g = null;
                this.f11625e.setRenderEffect(null);
            }
            this.h = true;
        }
    }
}
