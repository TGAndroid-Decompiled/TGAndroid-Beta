package oi;

import org.telegram.ui.Components.fx;
public final class i implements a5.i {
    public int f19465a;
    public final fx f19466b;
    public final q f19467c;

    public i(q qVar, fx fxVar) {
        this.f19467c = qVar;
        this.f19466b = fxVar;
        this.f19465a = fxVar.getScrollX();
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int scrollX = this.f19466b.getScrollX();
        this.f19467c.h(scrollX - this.f19465a, 0);
        this.f19465a = scrollX;
    }

    @Override
    public final void c(int i10) {
        this.f19467c.e++;
    }

    @Override
    public final void a(int i10) {
    }
}
