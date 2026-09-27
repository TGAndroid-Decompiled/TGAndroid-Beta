package li;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import yf.f0;
public final class c {
    public final RenderNode d;
    public final RenderNode e;
    public int f14365f;
    public int f14366g;
    public int h;
    public final RectF f14362a = new RectF();
    public final Rect f14363b = new Rect();
    public final RectF f14364c = new RectF();
    public final RectF f14367i = new RectF();

    public c(int i10) {
        RenderNode renderNode = new RenderNode("cap-" + i10);
        this.d = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i10);
        this.e = renderNode2;
        renderNode2.setUseCompositingLayer(true, null);
        renderNode2.setRenderEffect(f0.b());
    }

    public final void a(RectF rectF, int i10, int i11, int i12) {
        float max;
        int ceil;
        RectF rectF2 = this.f14362a;
        rectF2.set(rectF);
        float dpf2 = AndroidUtilities.dpf2(7.0f);
        if (dpf2 <= 0.0f) {
            max = 0.0f;
        } else {
            max = Math.max(0.0f, ((((dpf2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
        }
        if (this.h != i10) {
            this.d.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        this.h = i10;
        if (max <= 0.0f) {
            ceil = 0;
        } else {
            ceil = ((int) Math.ceil(e2.B(max, 0.57735f, 0.5f, 3.0f))) * i10;
        }
        int i13 = i10 / 2;
        RectF rectF3 = this.f14367i;
        rectF3.set(rectF2);
        float f7 = -(ceil + i13 + 1);
        rectF3.inset(f7, f7);
        if (i10 > 0) {
            float f10 = i10;
            Rect rect = this.f14363b;
            rect.left = ((int) Math.floor(rectF3.left / f10)) * i10;
            rect.top = ((int) Math.floor(rectF3.top / f10)) * i10;
            rect.right = ((int) Math.ceil(rectF3.right / f10)) * i10;
            rect.bottom = ((int) Math.ceil(rectF3.bottom / f10)) * i10;
            RectF rectF4 = this.f14364c;
            rectF4.set(rect);
            int i14 = i11 % i10;
            if (i14 > i13) {
                i14 -= i10;
            } else if (i14 < (-i10) / 2) {
                i14 += i10;
            }
            float f11 = -i14;
            int i15 = i12 % i10;
            if (i15 > i13) {
                i15 -= i10;
            } else if (i15 < (-i10) / 2) {
                i15 += i10;
            }
            rectF4.offset(f11, -i15);
            return;
        }
        throw new IllegalArgumentException("n must be positive");
    }
}
