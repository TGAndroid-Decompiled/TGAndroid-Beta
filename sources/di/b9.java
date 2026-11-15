package di;

import org.telegram.ui.Components.et0;
public final class b9 implements te.b, et0 {
    public final int f8257a;
    public final mb f8258b;

    public b9(mb mbVar, int i7) {
        this.f8257a = i7;
        this.f8258b = mbVar;
    }

    @Override
    public void E(float f10, int i7) {
        int i10 = this.f8257a;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        switch (this.f8257a) {
            case 0:
                this.f8258b.r1();
                return;
            case 1:
                this.f8258b.r1();
                return;
            default:
                this.f8258b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f8258b.f9066b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
