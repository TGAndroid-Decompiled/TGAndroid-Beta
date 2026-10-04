package li;

import org.telegram.ui.Components.cx;
public final class i implements z4.e {
    public int f15655a;
    public final cx f15656b;
    public final n f15657c;

    public i(n nVar, cx cxVar) {
        this.f15657c = nVar;
        this.f15656b = cxVar;
        this.f15655a = cxVar.getScrollX();
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int scrollX = this.f15656b.getScrollX();
        this.f15657c.h(scrollX - this.f15655a, 0);
        this.f15655a = scrollX;
    }

    @Override
    public final void c(int i10) {
        this.f15657c.f15669e++;
    }

    @Override
    public final void a(int i10) {
    }
}
