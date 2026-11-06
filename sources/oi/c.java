package oi;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class c implements ri.a, pi.a {
    public final int f21050a;
    public final d f21051b;

    public c(d dVar, int i7) {
        this.f21051b = dVar;
        this.f21050a = i7;
    }

    @Override
    public final int a() {
        boolean a10 = jg.g.a(this.f21050a);
        d dVar = this.f21051b;
        if (a10) {
            return dVar.f21068s;
        }
        return dVar.f21066q;
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.f21051b, this.f21050a, canvas, rectF, i7, f10, f11);
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        d.a(this.f21051b, canvas, this.f21050a, f10, f11, f12, f13);
    }

    @Override
    public final int f() {
        boolean a10 = jg.g.a(this.f21050a);
        d dVar = this.f21051b;
        if (a10) {
            return dVar.f21063n;
        }
        return dVar.f21062m;
    }

    @Override
    public final int g() {
        boolean a10 = jg.g.a(this.f21050a);
        d dVar = this.f21051b;
        if (a10) {
            return dVar.f21067r;
        }
        return dVar.f21065p;
    }

    @Override
    public final boolean h() {
        return true;
    }
}
