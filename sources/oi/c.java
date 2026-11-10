package oi;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class c implements ri.a, pi.a {
    public final int f21058a;
    public final d f21059b;

    public c(d dVar, int i7) {
        this.f21059b = dVar;
        this.f21058a = i7;
    }

    @Override
    public final int a() {
        boolean a10 = jg.g.a(this.f21058a);
        d dVar = this.f21059b;
        if (a10) {
            return dVar.f21076s;
        }
        return dVar.f21074q;
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.f21059b, this.f21058a, canvas, rectF, i7, f10, f11);
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        d.a(this.f21059b, canvas, this.f21058a, f10, f11, f12, f13);
    }

    @Override
    public final int f() {
        boolean a10 = jg.g.a(this.f21058a);
        d dVar = this.f21059b;
        if (a10) {
            return dVar.f21071n;
        }
        return dVar.f21070m;
    }

    @Override
    public final int g() {
        boolean a10 = jg.g.a(this.f21058a);
        d dVar = this.f21059b;
        if (a10) {
            return dVar.f21075r;
        }
        return dVar.f21073p;
    }

    @Override
    public final boolean h() {
        return true;
    }
}
