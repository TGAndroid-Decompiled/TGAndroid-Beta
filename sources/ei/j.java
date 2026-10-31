package ei;

import org.telegram.ui.Components.iw;
public final class j implements z4.e {
    public int f6653a;
    public final iw f6654b;
    public final r f6655c;

    public j(r rVar, iw iwVar) {
        this.f6655c = rVar;
        this.f6654b = iwVar;
        this.f6653a = iwVar.getScrollX();
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int scrollX = this.f6654b.getScrollX();
        this.f6655c.h(scrollX - this.f6653a, 0);
        this.f6653a = scrollX;
    }

    @Override
    public final void c(int i10) {
        this.f6655c.f6674g++;
    }

    @Override
    public final void a(int i10) {
    }
}
