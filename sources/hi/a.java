package hi;

import org.telegram.ui.Components.ct0;
public final class a implements qe.b, ct0 {
    public final int f14421a;
    public final g f14422b;

    public a(g gVar, int i3) {
        this.f14421a = i3;
        this.f14422b = gVar;
    }

    @Override
    public void F(float f10, int i3) {
        int i10 = this.f14421a;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        switch (this.f14421a) {
            case 0:
                this.f14422b.H0();
                return;
            case 1:
                this.f14422b.H0();
                return;
            default:
                this.f14422b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int c() {
        return this.f14422b.f14433b0;
    }

    private final void a(float f10, int i3) {
    }

    private final void b(float f10, int i3) {
    }

    private final void d(float f10, int i3) {
    }
}
