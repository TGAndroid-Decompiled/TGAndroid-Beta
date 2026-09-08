package a3;

import b2.x1;
public final class e implements Runnable {
    public final int f85a;
    public final n4.y f86b;

    public e(int i10, n4.y yVar) {
        this.f85a = i10;
        this.f86b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f85a) {
            case 0:
                ((f) this.f86b.f16524c).f107g.onFirstFrameRendered();
                return;
            case 1:
                ((f) this.f86b.f16524c).f107g.H();
                return;
            default:
                ((f) this.f86b.f16524c).f107g.h0();
                return;
        }
    }

    public e(n4.y yVar, x1 x1Var) {
        this.f85a = 2;
        this.f86b = yVar;
    }
}
