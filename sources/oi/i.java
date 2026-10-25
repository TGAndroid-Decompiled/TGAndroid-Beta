package oi;

import org.telegram.ui.Components.fx;
public final class i implements a5.i {
    public int f19466a;
    public final fx f19467b;
    public final q f19468c;

    public i(q qVar, fx fxVar) {
        this.f19468c = qVar;
        this.f19467b = fxVar;
        this.f19466a = fxVar.getScrollX();
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int scrollX = this.f19467b.getScrollX();
        this.f19468c.h(scrollX - this.f19466a, 0);
        this.f19466a = scrollX;
    }

    @Override
    public final void c(int i10) {
        this.f19468c.e++;
    }

    @Override
    public final void a(int i10) {
    }
}
