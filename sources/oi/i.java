package oi;

import org.telegram.ui.Components.vv;
public final class i implements c5.g {
    public int f21086a;
    public final vv f21087b;
    public final q f21088c;

    public i(q qVar, vv vvVar) {
        this.f21088c = qVar;
        this.f21087b = vvVar;
        this.f21086a = vvVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.f21087b.getScrollX();
        this.f21088c.h(scrollX - this.f21086a, 0);
        this.f21086a = scrollX;
    }

    @Override
    public final void c(int i7) {
        this.f21088c.f21109g++;
    }

    @Override
    public final void a(int i7) {
    }
}
