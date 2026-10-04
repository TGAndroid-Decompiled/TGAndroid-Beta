package a3;

import b2.x1;
public final class e implements Runnable {
    public final int f87a;
    public final n4.y f88b;

    public e(int i10, n4.y yVar) {
        this.f87a = i10;
        this.f88b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f87a) {
            case 0:
                ((f) this.f88b.f16640c).f109g.onFirstFrameRendered();
                return;
            case 1:
                ((f) this.f88b.f16640c).f109g.q();
                return;
            default:
                ((f) this.f88b.f16640c).f109g.D();
                return;
        }
    }

    public e(n4.y yVar, x1 x1Var) {
        this.f87a = 2;
        this.f88b = yVar;
    }
}
