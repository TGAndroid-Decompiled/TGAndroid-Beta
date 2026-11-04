package ci;

import org.telegram.ui.Components.ct0;
public final class k9 implements qe.b, ct0 {
    public final int f5405a;
    public final wb f5406b;

    public k9(wb wbVar, int i3) {
        this.f5405a = i3;
        this.f5406b = wbVar;
    }

    @Override
    public void F(float f10, int i3) {
        int i10 = this.f5405a;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        switch (this.f5405a) {
            case 0:
                this.f5406b.r1();
                return;
            case 1:
                this.f5406b.r1();
                return;
            default:
                this.f5406b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int c() {
        return this.f5406b.f6277b0;
    }

    private final void a(float f10, int i3) {
    }

    private final void b(float f10, int i3) {
    }

    private final void d(float f10, int i3) {
    }
}
