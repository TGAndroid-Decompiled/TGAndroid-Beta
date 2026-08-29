package nh;
public final class q9 implements Runnable {
    public final int f18407a;
    public final gb f18408b;
    public final boolean f18409c;

    public q9(gb gbVar, boolean z10, int i10) {
        this.f18407a = i10;
        this.f18408b = gbVar;
        this.f18409c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18407a) {
            case 0:
                this.f18408b.f(this.f18409c);
                return;
            case 1:
                gb gbVar = this.f18408b;
                if (!this.f18409c) {
                    gbVar.F0.b(false, false);
                    return;
                } else {
                    gbVar.getClass();
                    return;
                }
            default:
                gb gbVar2 = this.f18408b;
                gbVar2.N = null;
                gbVar2.f17750e = false;
                gbVar2.q(this.f18409c);
                return;
        }
    }
}
