package oi;

import org.telegram.ui.Components.wv;
public final class i implements c5.g {
    public int f21081a;
    public final wv f21082b;
    public final q f21083c;

    public i(q qVar, wv wvVar) {
        this.f21083c = qVar;
        this.f21082b = wvVar;
        this.f21081a = wvVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.f21082b.getScrollX();
        this.f21083c.h(scrollX - this.f21081a, 0);
        this.f21081a = scrollX;
    }

    @Override
    public final void c(int i7) {
        this.f21083c.f21104g++;
    }

    @Override
    public final void a(int i7) {
    }
}
