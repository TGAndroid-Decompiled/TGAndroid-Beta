package oi;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import bg.o0;
import org.telegram.messenger.g0;
public final class b {
    public final RenderNode f21032e;
    public final RenderNode f21033f;
    public final RenderNode f21034g;
    public final RenderNode h;
    public final RenderNode f21035i;
    public ColorFilter f21036j;
    public int f21037k;
    public int f21038l;
    public int f21039m;
    public int f21040n;
    public int f21041o;
    public int f21042p;
    public float f21045s;
    public float f21046t;
    public int f21047u;
    public int v;
    public int f21048w;
    public int f21049x;
    public final RectF f21029a = new RectF();
    public final Rect f21030b = new Rect();
    public final RectF f21031c = new RectF();
    public final RectF d = new RectF();
    public int f21043q = 1;
    public final RectF f21044r = new RectF();

    public b(int i7) {
        RenderNode renderNode = new RenderNode("cap-" + i7);
        this.f21032e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i7);
        this.f21033f = renderNode2;
        renderNode2.setRenderEffect(o0.d());
        this.f21034g = new RenderNode("glass-frosted-" + i7);
        RenderNode renderNode3 = new RenderNode("filtered-" + i7);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(d.v));
        this.f21035i = new RenderNode("frosted-filtered-" + i7);
    }

    public final RenderNode a(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        return this.f21035i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(jg.g.E(i7)));
                }
                return this.f21034g;
            }
            return this.f21033f;
        }
        return this.f21032e;
    }

    public final void b(int i7, int i10, int i11) {
        float max;
        float f10 = 0.0f;
        if (this.f21041o != i7) {
            this.f21041o = i7;
            float N = g0.N(7.0f);
            if (N <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i7) - 0.5f) / 0.57735f);
            }
            this.f21045s = max;
            this.f21032e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f21042p != i10) {
            this.f21042p = i10;
            float N2 = g0.N(36.0f);
            if (N2 > 0.0f) {
                f10 = Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f21046t = f10;
            RenderNode renderNode = this.f21034g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
            RenderNode renderNode2 = this.f21035i;
            float f11 = this.f21046t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, tileMode));
        }
        this.f21043q = i11;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.f21036j != colorMatrixColorFilter) {
            this.f21036j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = d.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
