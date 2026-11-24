package defpackage;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
public final class cw4 {
    public final RenderNode e;
    public final RenderNode f;
    public final RenderNode g;
    public final RenderNode h;
    public final RenderNode i;
    public ColorMatrixColorFilter j;
    public int k;
    public int l;
    public int m;
    public int n;
    public byte o;
    public byte p;
    public float s;
    public float t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final RectF a = new RectF();
    public final Rect b = new Rect();
    public final RectF c = new RectF();
    public final RectF d = new RectF();
    public int q = 1;
    public final RectF r = new RectF();

    public cw4(int i) {
        mk1.p();
        RenderNode renderNode = new RenderNode("cap-" + i);
        this.e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        mk1.p();
        RenderNode renderNode2 = new RenderNode("glass-" + i);
        this.f = renderNode2;
        renderNode2.setRenderEffect(yz.m());
        mk1.p();
        this.g = new RenderNode("glass-frosted-" + i);
        mk1.p();
        RenderNode renderNode3 = new RenderNode("filtered-" + i);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(ew4.v));
        mk1.p();
        this.i = new RenderNode("frosted-filtered-" + i);
    }

    public final RenderNode a(int i) {
        int F = ug8.F(i);
        if (F != 0) {
            if (F != 1) {
                if (F != 2) {
                    if (F == 3) {
                        return this.i;
                    }
                    w26.j("Unknown source index: ".concat(tb4.B(i)));
                    return null;
                }
                return this.g;
            }
            return this.f;
        }
        return this.e;
    }

    public final void b(int i, int i2, int i3) {
        float max;
        float f = 0.0f;
        if (this.o != i) {
            this.o = i;
            float N = gl.N(7.0f);
            if (N <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i) - 0.5f) / 0.57735f);
            }
            this.s = max;
            this.e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.p != i2) {
            this.p = i2;
            float N2 = gl.N(36.0f);
            if (N2 > 0.0f) {
                f = Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i2) - 0.5f) / 0.57735f);
            }
            this.t = f;
            RenderNode renderNode = this.g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f, f, tileMode));
            RenderNode renderNode2 = this.i;
            float f2 = this.t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f2, f2, tileMode));
        }
        this.q = i3;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.j != colorMatrixColorFilter) {
            this.j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = ew4.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
