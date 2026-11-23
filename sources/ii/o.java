package ii;

import org.telegram.ui.Components.ot0;
public final class o implements te.b, ot0 {
    public final int f16416a;
    public final t f16417b;

    public o(t tVar, int i7) {
        this.f16416a = i7;
        this.f16417b = tVar;
    }

    @Override
    public void G(float f10, int i7) {
        int i10 = this.f16416a;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        switch (this.f16416a) {
            case 0:
                this.f16417b.H0();
                return;
            case 1:
                this.f16417b.H0();
                return;
            default:
                this.f16417b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f16417b.f16426b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
