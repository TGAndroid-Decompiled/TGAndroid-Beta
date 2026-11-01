package ei;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import c3.i0;
import e0.f0;
public final class c {
    public final RenderNode e;
    public final RenderNode f6611f;
    public final RenderNode f6612g;
    public final RenderNode h;
    public final RenderNode f6613i;
    public ColorFilter f6614j;
    public int f6615k;
    public int f6616l;
    public int f6617m;
    public int f6618n;
    public int f6619o;
    public int f6620p;
    public float f6623s;
    public float f6624t;
    public int f6625u;
    public int v;
    public int f6626w;
    public int f6627x;
    public final RectF f6608a = new RectF();
    public final Rect f6609b = new Rect();
    public final RectF f6610c = new RectF();
    public final RectF d = new RectF();
    public int f6621q = 1;
    public final RectF f6622r = new RectF();

    public c(int i10) {
        RenderNode renderNode = new RenderNode("cap-" + i10);
        this.e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i10);
        this.f6611f = renderNode2;
        renderNode2.setRenderEffect(f0.d());
        this.f6612g = new RenderNode("glass-frosted-" + i10);
        RenderNode renderNode3 = new RenderNode("filtered-" + i10);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(e.v));
        this.f6613i = new RenderNode("frosted-filtered-" + i10);
    }

    public final RenderNode a(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        return this.f6613i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(i0.F(i10)));
                }
                return this.f6612g;
            }
            return this.f6611f;
        }
        return this.e;
    }

    public final void b(int i10, int i11, int i12) {
        float max;
        float f7 = 0.0f;
        if (this.f6619o != i10) {
            this.f6619o = i10;
            float N = org.telegram.messenger.i0.N(7.0f);
            if (N <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f6623s = max;
            this.e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f6620p != i11) {
            this.f6620p = i11;
            float N2 = org.telegram.messenger.i0.N(36.0f);
            if (N2 > 0.0f) {
                f7 = Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i11) - 0.5f) / 0.57735f);
            }
            this.f6624t = f7;
            RenderNode renderNode = this.f6612g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, tileMode));
            RenderNode renderNode2 = this.f6613i;
            float f10 = this.f6624t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        }
        this.f6621q = i12;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.f6614j != colorMatrixColorFilter) {
            this.f6614j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = e.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
