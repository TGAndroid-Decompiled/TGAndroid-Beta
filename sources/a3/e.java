package a3;

import b2.x1;
public final class e implements Runnable {
    public final int f79a;
    public final n4.y f80b;

    public e(int i10, n4.y yVar) {
        this.f79a = i10;
        this.f80b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f79a) {
            case 0:
                ((f) this.f80b.f14995c).f99g.onFirstFrameRendered();
                return;
            case 1:
                ((f) this.f80b.f14995c).f99g.B();
                return;
            default:
                ((f) this.f80b.f14995c).f99g.J();
                return;
        }
    }

    public e(n4.y yVar, x1 x1Var) {
        this.f79a = 2;
        this.f80b = yVar;
    }
}
