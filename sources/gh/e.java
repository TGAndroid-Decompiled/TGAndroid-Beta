package gh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import b8.mc;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
public final class e extends mc {
    public final float f12290a = g0.N(0.55f);
    public final Outline f12291b = new Outline();
    public final Rect f12292c = new Rect();
    public final RenderNode d;
    public final RenderNode f12293e;
    public final Paint f12294f;
    public eh.h f12295g;
    public boolean h;
    public boolean f12296i;
    public final RectF f12297j;
    public final g f12298k;

    public e(g gVar) {
        this.f12298k = gVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.f12293e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f12294f = paint;
        this.h = true;
        this.f12296i = true;
        this.f12297j = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override
    public final void a() {
        this.d.discardDisplayList();
        this.f12293e.discardDisplayList();
        this.h = true;
    }

    @Override
    public final void b(Canvas canvas, si.a aVar) {
        g gVar = this.f12298k;
        f fVar = gVar.R;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = k6.r1(this.d.getAlpha() * gVar.W, gVar.f12335x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f12294f;
        if (alpha != 0) {
            paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r12);
            fVar.d(canvas, paint, gVar.T);
        }
        int r13 = k6.r1(this.d.getAlpha() * gVar.W, gVar.G);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.f12290a, 0.0f, 0.0f, r13);
            fVar.d(canvas, paint, gVar.T);
        }
        Rect rect = fVar.f12309m;
        canvas.save();
        if (fVar.e()) {
            canvas.clipPath(fVar.f12307k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.f12298k.R;
        Rect rect = fVar.f12309m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.f12292c;
        boolean z10 = false;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.f12300b;
        Outline outline = this.f12291b;
        g.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (!rect.isEmpty()) {
            this.f12293e.setPosition(0, 0, rect.width(), rect.height());
            this.d.setPosition(0, 0, rect.width(), rect.height());
            this.d.setOutline(outline);
            RenderNode renderNode = this.d;
            if (this.f12296i && !fVar.e()) {
                z10 = true;
            }
            renderNode.setClipToOutline(z10);
            this.h = true;
        }
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: gh.e.e():void");
    }

    public final void f(float f10) {
        this.d.setAlpha(f10);
    }

    public final void g(boolean z10) {
        boolean z11;
        this.f12296i = z10;
        RenderNode renderNode = this.d;
        if (z10 && !this.f12298k.R.e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        renderNode.setClipToOutline(z11);
    }

    public final void h(boolean z10) {
        boolean z11;
        if (this.f12295g != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11 && Build.VERSION.SDK_INT >= 33) {
            if (z10) {
                this.f12295g = new eh.h(this.f12293e);
            } else {
                this.f12295g = null;
                this.f12293e.setRenderEffect(null);
            }
            this.h = true;
        }
    }
}
