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
    public final RenderNode f15614e;
    public final RenderNode f15615f;
    public final RenderNode f15616g;
    public int h;
    public int f15617i;
    public int f15618j;
    public int f15619k;
    public int f15620l;
    public int f15621m;
    public float f15624p;
    public float f15625q;
    public int f15626r;
    public int f15627s;
    public int f15628t;
    public int f15629u;
    public final RectF f15611a = new RectF();
    public final Rect f15612b = new Rect();
    public final RectF f15613c = new RectF();
    public final RectF d = new RectF();
    public int f15622n = 1;
    public final RectF f15623o = new RectF();

    public b(int i10) {
        RenderNode renderNode = new RenderNode("cap-" + i10);
        this.f15614e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i10);
        this.f15615f = renderNode2;
        renderNode2.setRenderEffect(h0.c());
        this.f15616g = new RenderNode("glass-frosted-" + i10);
    }

    public final RenderNode a(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    return this.f15616g;
                }
                throw new IllegalArgumentException("Unknown source index: ".concat(k0.D(i10)));
            }
            return this.f15615f;
        }
        return this.f15614e;
    }

    public final void b(int i10, int i11, int i12) {
        float max;
        float f7 = 0.0f;
        if (this.f15620l != i10) {
            this.f15620l = i10;
            float dpf2 = AndroidUtilities.dpf2(7.0f);
            if (dpf2 <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((dpf2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f15624p = max;
            this.f15614e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f15621m != i11) {
            this.f15621m = i11;
            float dpf22 = AndroidUtilities.dpf2(36.0f);
            if (dpf22 > 0.0f) {
                f7 = Math.max(0.0f, ((((dpf22 * 0.57735f) + 0.5f) / i11) - 0.5f) / 0.57735f);
            }
            this.f15625q = f7;
            this.f15616g.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP));
        }
        this.f15622n = i12;
    }
}
