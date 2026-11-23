package di;

import org.telegram.ui.Components.pt0;
public final class e9 implements te.b, pt0 {
    public final int f8747a;
    public final pb f8748b;

    public e9(pb pbVar, int i7) {
        this.f8747a = i7;
        this.f8748b = pbVar;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f8747a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f8747a) {
            case 0:
                this.f8748b.s1();
                return;
            case 1:
                this.f8748b.s1();
                return;
            default:
                this.f8748b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f8748b.f9567b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
