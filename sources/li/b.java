package li;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import e0.h0;
import org.telegram.messenger.AndroidUtilities;
public final class b {
    public final RenderNode f15615e;
    public final RenderNode f15616f;
    public final RenderNode f15617g;
    public int h;
    public int f15618i;
    public int f15619j;
    public int f15620k;
    public int f15621l;
    public int f15622m;
    public float f15625p;
    public float f15626q;
    public int f15627r;
    public int f15628s;
    public int f15629t;
    public int f15630u;
    public final RectF f15612a = new RectF();
    public final Rect f15613b = new Rect();
    public final RectF f15614c = new RectF();
    public final RectF d = new RectF();
    public int f15623n = 1;
    public final RectF f15624o = new RectF();

    public b(int i10) {
        RenderNode renderNode = new RenderNode("cap-" + i10);
        this.f15615e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i10);
        this.f15616f = renderNode2;
        renderNode2.setRenderEffect(h0.c());
        this.f15617g = new RenderNode("glass-frosted-" + i10);
    }

    public final RenderNode a(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    return this.f15617g;
                }
                throw new IllegalArgumentException("Unknown source index: ".concat(hg.c.D(i10)));
            }
            return this.f15616f;
        }
        return this.f15615e;
    }

    public final void b(int i10, int i11, int i12) {
        float max;
        float f7 = 0.0f;
        if (this.f15621l != i10) {
            this.f15621l = i10;
            float dpf2 = AndroidUtilities.dpf2(7.0f);
            if (dpf2 <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((dpf2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f15625p = max;
            this.f15615e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f15622m != i11) {
            this.f15622m = i11;
            float dpf22 = AndroidUtilities.dpf2(36.0f);
            if (dpf22 > 0.0f) {
                f7 = Math.max(0.0f, ((((dpf22 * 0.57735f) + 0.5f) / i11) - 0.5f) / 0.57735f);
            }
            this.f15626q = f7;
            this.f15617g.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP));
        }
        this.f15623n = i12;
    }
}
