package di;

import org.telegram.ui.Components.pt0;
public final class e9 implements te.b, pt0 {
    public final int f8710a;
    public final pb f8711b;

    public e9(pb pbVar, int i7) {
        this.f8710a = i7;
        this.f8711b = pbVar;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f8710a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f8710a) {
            case 0:
                this.f8711b.s1();
                return;
            case 1:
                this.f8711b.s1();
                return;
            default:
                this.f8711b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f8711b.f9530b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
