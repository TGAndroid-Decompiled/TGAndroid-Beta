package ki;
public final class n implements Runnable {
    public final int f14991a;
    public final q f14992b;

    public n(q qVar, int i10) {
        this.f14991a = i10;
        this.f14992b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f14991a) {
            case 0:
                this.f14992b.b();
                return;
            default:
                q qVar = this.f14992b;
                if (qVar.G != 0) {
                    qVar.F = true;
                    return;
                }
                return;
        }
    }
}
