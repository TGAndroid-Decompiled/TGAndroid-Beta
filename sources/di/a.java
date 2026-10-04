package di;

import org.telegram.ui.Components.wv0;
public final class a implements le.d, wv0 {
    public final int f8357a;
    public final k f8358b;

    public a(k kVar, int i10) {
        this.f8357a = i10;
        this.f8358b = kVar;
    }

    @Override
    public void V(float f7, int i10) {
        int i11 = this.f8357a;
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        switch (this.f8357a) {
            case 0:
                this.f8358b.L0();
                return;
            case 1:
                this.f8358b.L0();
                return;
            default:
                this.f8358b.U.setAlpha(f7);
                return;
        }
    }

    @Override
    public int b() {
        return this.f8358b.Y;
    }

    private final void a(float f7, int i10) {
    }

    private final void c(float f7, int i10) {
    }

    private final void d(float f7, int i10) {
    }
}
