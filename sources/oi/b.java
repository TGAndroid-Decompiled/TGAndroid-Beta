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
    public final RenderNode f21040e;
    public final RenderNode f21041f;
    public final RenderNode f21042g;
    public final RenderNode h;
    public final RenderNode f21043i;
    public ColorFilter f21044j;
    public int f21045k;
    public int f21046l;
    public int f21047m;
    public int f21048n;
    public int f21049o;
    public int f21050p;
    public float f21053s;
    public float f21054t;
    public int f21055u;
    public int v;
    public int f21056w;
    public int f21057x;
    public final RectF f21037a = new RectF();
    public final Rect f21038b = new Rect();
    public final RectF f21039c = new RectF();
    public final RectF d = new RectF();
    public int f21051q = 1;
    public final RectF f21052r = new RectF();

    public b(int i7) {
        RenderNode renderNode = new RenderNode("cap-" + i7);
        this.f21040e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i7);
        this.f21041f = renderNode2;
        renderNode2.setRenderEffect(o0.d());
        this.f21042g = new RenderNode("glass-frosted-" + i7);
        RenderNode renderNode3 = new RenderNode("filtered-" + i7);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(d.v));
        this.f21043i = new RenderNode("frosted-filtered-" + i7);
    }

    public final RenderNode a(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        return this.f21043i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(jg.g.E(i7)));
                }
                return this.f21042g;
            }
            return this.f21041f;
        }
        return this.f21040e;
    }

    public final void b(int i7, int i10, int i11) {
        float max;
        float f10 = 0.0f;
        if (this.f21049o != i7) {
            this.f21049o = i7;
            float N = g0.N(7.0f);
            if (N <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i7) - 0.5f) / 0.57735f);
            }
            this.f21053s = max;
            this.f21040e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f21050p != i10) {
            this.f21050p = i10;
            float N2 = g0.N(36.0f);
            if (N2 > 0.0f) {
                f10 = Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f21054t = f10;
            RenderNode renderNode = this.f21042g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
            RenderNode renderNode2 = this.f21043i;
            float f11 = this.f21054t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, tileMode));
        }
        this.f21051q = i11;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.f21044j != colorMatrixColorFilter) {
            this.f21044j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = d.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
