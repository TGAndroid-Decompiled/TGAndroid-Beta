package oi;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class c implements ri.a, pi.a {
    public final int f21053a;
    public final d f21054b;

    public c(d dVar, int i7) {
        this.f21054b = dVar;
        this.f21053a = i7;
    }

    @Override
    public final int a() {
        boolean a10 = jg.g.a(this.f21053a);
        d dVar = this.f21054b;
        if (a10) {
            return dVar.f21071s;
        }
        return dVar.f21069q;
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.f21054b, this.f21053a, canvas, rectF, i7, f10, f11);
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        d.a(this.f21054b, canvas, this.f21053a, f10, f11, f12, f13);
    }

    @Override
    public final int f() {
        boolean a10 = jg.g.a(this.f21053a);
        d dVar = this.f21054b;
        if (a10) {
            return dVar.f21066n;
        }
        return dVar.f21065m;
    }

    @Override
    public final int g() {
        boolean a10 = jg.g.a(this.f21053a);
        d dVar = this.f21054b;
        if (a10) {
            return dVar.f21070r;
        }
        return dVar.f21068p;
    }

    @Override
    public final boolean h() {
        return true;
    }
}
