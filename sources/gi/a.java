package gi;

import org.telegram.ui.Components.et0;
public final class a implements te.b, et0 {
    public final int f13977a;
    public final f f13978b;

    public a(f fVar, int i7) {
        this.f13977a = i7;
        this.f13978b = fVar;
    }

    @Override
    public void F(float f10, int i7) {
        int i10 = this.f13977a;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        switch (this.f13977a) {
            case 0:
                this.f13978b.H0();
                return;
            case 1:
                this.f13978b.H0();
                return;
            default:
                this.f13978b.W.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f13978b.f13986a0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
