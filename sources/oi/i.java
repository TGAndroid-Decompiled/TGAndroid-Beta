package oi;

import org.telegram.ui.Components.vv;
public final class i implements c5.g {
    public int f21078a;
    public final vv f21079b;
    public final q f21080c;

    public i(q qVar, vv vvVar) {
        this.f21080c = qVar;
        this.f21079b = vvVar;
        this.f21078a = vvVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.f21079b.getScrollX();
        this.f21080c.h(scrollX - this.f21078a, 0);
        this.f21078a = scrollX;
    }

    @Override
    public final void c(int i7) {
        this.f21080c.f21101g++;
    }

    @Override
    public final void a(int i7) {
    }
}
