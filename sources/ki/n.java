package ki;
public final class n implements Runnable {
    public final int f14992a;
    public final q f14993b;

    public n(q qVar, int i10) {
        this.f14992a = i10;
        this.f14993b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f14992a) {
            case 0:
                this.f14993b.b();
                return;
            default:
                q qVar = this.f14993b;
                if (qVar.G != 0) {
                    qVar.F = true;
                    return;
                }
                return;
        }
    }
}
