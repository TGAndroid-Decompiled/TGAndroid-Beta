package bi;

import org.telegram.ui.Components.hw0;
public final class ab implements oe.d, hw0 {
    public final int f4284a;
    public final dd f4285b;

    public ab(dd ddVar, int i10) {
        this.f4284a = i10;
        this.f4285b = ddVar;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        switch (this.f4284a) {
            case 0:
                this.f4285b.n1();
                return;
            case 1:
                this.f4285b.n1();
                return;
            default:
                this.f4285b.W.setAlpha(f7);
                return;
        }
    }

    @Override
    public int c() {
        return this.f4285b.f4513a0;
    }

    @Override
    public void z(float f7, int i10) {
        int i11 = this.f4284a;
    }

    private final void a(float f7, int i10) {
    }

    private final void b(float f7, int i10) {
    }

    private final void d(float f7, int i10) {
    }
}
