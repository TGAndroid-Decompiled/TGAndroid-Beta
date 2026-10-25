package oi;

import ag.t0;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class b {
    public final RenderNode e;
    public final RenderNode f19428f;
    public final RenderNode f19429g;
    public int h;
    public int f19430i;
    public int f19431j;
    public int f19432k;
    public int f19433l;
    public int f19434m;
    public float f19437p;
    public float f19438q;
    public int f19439r;
    public int f19440s;
    public int f19441t;
    public int f19442u;
    public final RectF f19425a = new RectF();
    public final Rect f19426b = new Rect();
    public final RectF f19427c = new RectF();
    public final RectF d = new RectF();
    public int f19435n = 1;
    public final RectF f19436o = new RectF();

    public b(int i10) {
        RenderNode renderNode = new RenderNode("cap-" + i10);
        this.e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i10);
        this.f19428f = renderNode2;
        renderNode2.setRenderEffect(t0.d());
        this.f19429g = new RenderNode("glass-frosted-" + i10);
    }

    public final RenderNode a(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    return this.f19429g;
                }
                throw new IllegalArgumentException("Unknown source index: ".concat(ic.a.D(i10)));
            }
            return this.f19428f;
        }
        return this.e;
    }

    public final void b(int i10, int i11, int i12) {
        float max;
        float f7 = 0.0f;
        if (this.f19433l != i10) {
            this.f19433l = i10;
            float dpf2 = AndroidUtilities.dpf2(7.0f);
            if (dpf2 <= 0.0f) {
                max = 0.0f;
            } else {
                max = Math.max(0.0f, ((((dpf2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            }
            this.f19437p = max;
            this.e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.f19434m != i11) {
            this.f19434m = i11;
            float dpf22 = AndroidUtilities.dpf2(36.0f);
            if (dpf22 > 0.0f) {
                f7 = Math.max(0.0f, ((((dpf22 * 0.57735f) + 0.5f) / i11) - 0.5f) / 0.57735f);
            }
            this.f19438q = f7;
            this.f19429g.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP));
        }
        this.f19435n = i12;
    }
}
