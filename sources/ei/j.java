package ei;

import org.telegram.ui.Components.iw;
public final class j implements z4.e {
    public int f6654a;
    public final iw f6655b;
    public final r f6656c;

    public j(r rVar, iw iwVar) {
        this.f6656c = rVar;
        this.f6655b = iwVar;
        this.f6654a = iwVar.getScrollX();
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int scrollX = this.f6655b.getScrollX();
        this.f6656c.h(scrollX - this.f6654a, 0);
        this.f6654a = scrollX;
    }

    @Override
    public final void c(int i10) {
        this.f6656c.f6675g++;
    }

    @Override
    public final void a(int i10) {
    }
}
