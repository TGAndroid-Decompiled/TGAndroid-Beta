package hi;

import android.graphics.Canvas;
import java.util.Iterator;
public final class d implements a, tg.a {
    public final a f7712a;
    public final a f7713b;
    public final je.b f7714c = new je.b();
    public float d;

    public d(a aVar, a aVar2) {
        this.f7712a = aVar;
        this.f7713b = aVar2;
    }

    @Override
    public final vg.f a() {
        vg.f fVar = new vg.f(this);
        this.f7714c.add(fVar);
        return fVar;
    }

    public final void b(float f7) {
        if (this.d != f7) {
            this.d = f7;
            Iterator it = this.f7714c.iterator();
            while (it.hasNext()) {
                vg.f fVar = (vg.f) it.next();
                fVar.updateColors();
                fVar.invalidateSelf();
            }
        }
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        Canvas canvas2;
        float f13;
        float f14;
        float f15;
        float f16;
        if (this.d < 1.0f) {
            canvas2 = canvas;
            f13 = f7;
            f14 = f10;
            f15 = f11;
            f16 = f12;
            this.f7712a.e(canvas2, f13, f14, f15, f16);
        } else {
            canvas2 = canvas;
            f13 = f7;
            f14 = f10;
            f15 = f11;
            f16 = f12;
        }
        float f17 = this.d;
        if (f17 > 0.0f) {
            if (f17 < 1.0f) {
                canvas2.saveLayerAlpha(f13, f14, f15, f16, (int) (f17 * 255.0f));
            }
            float f18 = f16;
            float f19 = f15;
            float f20 = f14;
            float f21 = f13;
            Canvas canvas3 = canvas2;
            this.f7713b.e(canvas3, f21, f20, f19, f18);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }
}
