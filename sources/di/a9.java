package di;

import org.telegram.ui.Components.et0;
public final class a9 implements te.b, et0 {
    public final int f8208a;
    public final lb f8209b;

    public a9(lb lbVar, int i7) {
        this.f8208a = i7;
        this.f8209b = lbVar;
    }

    @Override
    public void E(float f10, int i7) {
        int i10 = this.f8208a;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        switch (this.f8208a) {
            case 0:
                this.f8209b.r1();
                return;
            case 1:
                this.f8209b.r1();
                return;
            default:
                this.f8209b.X.setAlpha(f10);
                return;
        }
    }

    @Override
    public int b() {
        return this.f8209b.f9016b0;
    }

    private final void a(float f10, int i7) {
    }

    private final void c(float f10, int i7) {
    }

    private final void d(float f10, int i7) {
    }
}
