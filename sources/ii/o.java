package ii;

import org.telegram.ui.Components.pt0;
public final class o implements te.b, pt0 {
    public final int f16353a;
    public final t f16354b;

    public o(t tVar, int i7) {
        this.f16353a = i7;
        this.f16354b = tVar;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f16353a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f16353a) {
            case 0:
                this.f16354b.H0();
                return;
            case 1:
                this.f16354b.H0();
                return;
            default:
                this.f16354b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f16354b.f16363b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
