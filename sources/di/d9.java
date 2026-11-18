package di;

import org.telegram.ui.Components.mt0;
public final class d9 implements te.b, mt0 {
    public final int f8666a;
    public final pb f8667b;

    public d9(pb pbVar, int i7) {
        this.f8666a = i7;
        this.f8667b = pbVar;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f8666a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f8666a) {
            case 0:
                this.f8667b.s1();
                return;
            case 1:
                this.f8667b.s1();
                return;
            default:
                this.f8667b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f8667b.f9532b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
