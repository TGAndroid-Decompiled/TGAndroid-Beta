package di;

import org.telegram.ui.Components.pt0;
public final class e9 implements te.b, pt0 {
    public final int f8744a;
    public final pb f8745b;

    public e9(pb pbVar, int i7) {
        this.f8744a = i7;
        this.f8745b = pbVar;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f8744a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f8744a) {
            case 0:
                this.f8745b.s1();
                return;
            case 1:
                this.f8745b.s1();
                return;
            default:
                this.f8745b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f8745b.f9564b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
