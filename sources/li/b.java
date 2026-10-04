package li;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import e0.h0;
import hg.k0;
import org.telegram.messenger.AndroidUtilities;
public final class b {
    public final RenderNode f15613e;
    public final RenderNode f15614f;
    public final RenderNode f15615g;
    public int h;
    public int f15616i;
    public int f15617j;
    public int f15618k;
    public int f15619l;
    public int f15620m;
    public float f15623p;
    public float f15624q;
    public int f15625r;
    public int f15626s;
    public int f15627t;
    public int f15628u;
    public final RectF f15610a = new RectF();
    public final Rect f15611b = new Rect();
    public final RectF f15612c = new RectF();
    public final RectF d = new RectF();
    public int f15621n = 1;
    public final RectF f15622o = new RectF();

    public b(int i10) {
        RenderNode renderNode = new RenderNode("cap-" + i10);
        this.f15613e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i10);
        this.f15614f = renderNode2;
        renderNode2.setRenderEffect(h0.c());
        this.f15615g = new RenderNode("glass-frosted-" + i10);
    }

    public final RenderNode a(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    return this.f15615g;
                }
                throw new IllegalArgumentException("Unknown source index: ".concat(k0.D(i10)));
            }
            return this.f15614f;
        }
        return this.f15613e;
    }

    public final void b(int i10, int i11, int i12) {
        float max;
        float f7 = 0.0f;
        if (this.f15619l != i10) {
            this.f15619l = i10;
            float dpf2 = AndroidUtilities.dpf2(7.0f);
            if (dpf2 <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((dpf2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f15623p = max;
            this.f15613e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f15620m != i11) {
            this.f15620m = i11;
            float dpf22 = AndroidUtilities.dpf2(36.0f);
            if (dpf22 > 0.0f) {
                f7 = Math.max(0.0f, ((((dpf22 * 0.57735f) + 0.5f) / i11) - 0.5f) / 0.57735f);
            }
            this.f15624q = f7;
            this.f15615g.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP));
        }
        this.f15621n = i12;
    }
}
