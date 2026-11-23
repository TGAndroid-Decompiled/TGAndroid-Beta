package di;

import org.telegram.ui.Components.ot0;
public final class e9 implements te.b, ot0 {
    public final int f8708a;
    public final pb f8709b;

    public e9(pb pbVar, int i7) {
        this.f8708a = i7;
        this.f8709b = pbVar;
    }

    @Override
    public void G(float f10, int i7) {
        int i10 = this.f8708a;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        switch (this.f8708a) {
            case 0:
                this.f8709b.s1();
                return;
            case 1:
                this.f8709b.s1();
                return;
            default:
                this.f8709b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f8709b.f9528b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
