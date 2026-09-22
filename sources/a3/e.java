package a3;

import b2.x1;
public final class e implements Runnable {
    public final int f81a;
    public final n4.y f82b;

    public e(int i10, n4.y yVar) {
        this.f81a = i10;
        this.f82b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f81a) {
            case 0:
                ((f) this.f82b.f14993c).f101g.onFirstFrameRendered();
                return;
            case 1:
                ((f) this.f82b.f14993c).f101g.B();
                return;
            default:
                ((f) this.f82b.f14993c).f101g.J();
                return;
        }
    }

    public e(n4.y yVar, x1 x1Var) {
        this.f81a = 2;
        this.f82b = yVar;
    }
}
