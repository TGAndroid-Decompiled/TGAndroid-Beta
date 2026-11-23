package ii;

import org.telegram.ui.Components.pt0;
public final class o implements te.b, pt0 {
    public final int f16319a;
    public final t f16320b;

    public o(t tVar, int i7) {
        this.f16319a = i7;
        this.f16320b = tVar;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f16319a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f16319a) {
            case 0:
                this.f16320b.H0();
                return;
            case 1:
                this.f16320b.H0();
                return;
            default:
                this.f16320b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f16320b.f16329b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
