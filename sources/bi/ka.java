package bi;

import org.telegram.ui.Components.ft0;
public final class ka implements te.b, ft0 {
    public final int f4225a;
    public final dd f4226b;

    public ka(dd ddVar, int i7) {
        this.f4225a = i7;
        this.f4226b = ddVar;
    }

    @Override
    public void F(float f10, int i7) {
        int i10 = this.f4225a;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        switch (this.f4225a) {
            case 0:
                this.f4226b.r1();
                return;
            case 1:
                this.f4226b.r1();
                return;
            default:
                this.f4226b.W.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f4226b.f3708a0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
