package ii;

import org.telegram.ui.Components.et0;
public final class a implements te.b, et0 {
    public final int f15944a;
    public final f f15945b;

    public a(f fVar, int i7) {
        this.f15944a = i7;
        this.f15945b = fVar;
    }

    @Override
    public void E(float f10, int i7) {
        int i10 = this.f15944a;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        switch (this.f15944a) {
            case 0:
                this.f15945b.H0();
                return;
            case 1:
                this.f15945b.H0();
                return;
            default:
                this.f15945b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f15945b.f15954b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
