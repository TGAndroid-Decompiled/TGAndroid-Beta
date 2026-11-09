package gi;

import org.telegram.ui.Components.ft0;
public final class a implements te.b, ft0 {
    public final int f13975a;
    public final f f13976b;

    public a(f fVar, int i7) {
        this.f13975a = i7;
        this.f13976b = fVar;
    }

    @Override
    public void F(float f10, int i7) {
        int i10 = this.f13975a;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        switch (this.f13975a) {
            case 0:
                this.f13976b.H0();
                return;
            case 1:
                this.f13976b.H0();
                return;
            default:
                this.f13976b.W.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f13976b.f13984a0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
