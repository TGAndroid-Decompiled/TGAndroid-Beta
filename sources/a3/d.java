package a3;

import b2.x1;
public final class d implements Runnable {
    public final int f61a;
    public final n4.y f62b;

    public d(int i10, n4.y yVar) {
        this.f61a = i10;
        this.f62b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f61a) {
            case 0:
                ((e) this.f62b.f16497c).f83g.onFirstFrameRendered();
                return;
            case 1:
                ((e) this.f62b.f16497c).f83g.H();
                return;
            default:
                ((e) this.f62b.f16497c).f83g.h0();
                return;
        }
    }

    public d(n4.y yVar, x1 x1Var) {
        this.f61a = 2;
        this.f62b = yVar;
    }
}
