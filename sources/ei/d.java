package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import c3.i0;
public final class d implements hi.a, fi.a {
    public final int f6628a;
    public final e f6629b;

    public d(e eVar, int i10) {
        this.f6629b = eVar;
        this.f6628a = i10;
    }

    @Override
    public final int a() {
        boolean b10 = i0.b(this.f6628a);
        e eVar = this.f6629b;
        if (b10) {
            return eVar.f6645s;
        }
        return eVar.f6643q;
    }

    @Override
    public final void d(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        e.b(this.f6629b, this.f6628a, canvas, rectF, i10, f7, f10);
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        e.a(this.f6629b, canvas, this.f6628a, f7, f10, f11, f12);
    }

    @Override
    public final int f() {
        boolean b10 = i0.b(this.f6628a);
        e eVar = this.f6629b;
        if (b10) {
            return eVar.f6640n;
        }
        return eVar.f6639m;
    }

    @Override
    public final int g() {
        boolean b10 = i0.b(this.f6628a);
        e eVar = this.f6629b;
        if (b10) {
            return eVar.f6644r;
        }
        return eVar.f6642p;
    }

    @Override
    public final boolean h() {
        return true;
    }
}
