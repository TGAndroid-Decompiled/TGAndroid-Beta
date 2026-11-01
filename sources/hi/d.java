package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.Iterator;
public final class d implements a, tg.a, fi.a {
    public final a f7713a;
    public final a f7714b;
    public final je.b f7715c = new je.b();
    public float d;

    public d(a aVar, a aVar2) {
        this.f7713a = aVar;
        this.f7714b = aVar2;
    }

    public static fi.a i(a aVar) {
        if (aVar instanceof fi.a) {
            fi.a aVar2 = (fi.a) aVar;
            if (aVar2.h()) {
                return aVar2;
            }
        }
        return null;
    }

    @Override
    public final int a() {
        return j().a();
    }

    @Override
    public final vg.f b() {
        vg.f fVar = new vg.f(this, this, this);
        c(fVar);
        return fVar;
    }

    @Override
    public final void c(vg.f fVar) {
        this.f7715c.add(fVar);
    }

    @Override
    public final void d(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        float f11;
        float f12;
        int i11;
        Canvas canvas2;
        RectF rectF2;
        if (this.d < 1.0f) {
            f11 = f7;
            f12 = f10;
            i11 = i10;
            canvas2 = canvas;
            rectF2 = rectF;
            i(this.f7713a).d(f11, f12, i11, canvas2, rectF2);
        } else {
            f11 = f7;
            f12 = f10;
            i11 = i10;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        float f13 = this.d;
        if (f13 > 0.0f) {
            if (f13 < 1.0f) {
                canvas2.saveLayerAlpha(null, (int) (f13 * 255.0f));
            }
            RectF rectF3 = rectF2;
            Canvas canvas3 = canvas2;
            int i12 = i11;
            i(this.f7714b).d(f11, f12, i12, canvas3, rectF3);
            if (this.d < 1.0f) {
                canvas3.restore();
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
            this.f7713a.e(canvas2, f13, f14, f15, f16);
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
            this.f7714b.e(canvas3, f21, f20, f19, f18);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }

    @Override
    public final int f() {
        return j().f();
    }

    @Override
    public final int g() {
        return j().g();
    }

    @Override
    public final boolean h() {
        if (i(this.f7713a) != null && i(this.f7714b) != null) {
            return true;
        }
        return false;
    }

    public final fi.a j() {
        fi.a i10 = i(this.f7713a);
        fi.a i11 = i(this.f7714b);
        if (i10.f() <= i11.f()) {
            return i10;
        }
        return i11;
    }

    public final void k(float f7) {
        if (this.d != f7) {
            this.d = f7;
            Iterator it = this.f7715c.iterator();
            while (it.hasNext()) {
                vg.f fVar = (vg.f) it.next();
                fVar.updateColors();
                fVar.invalidateSelf();
            }
        }
    }
}
