package ki;
public final class n implements Runnable {
    public final int f13795a;
    public final q f13796b;

    public n(q qVar, int i10) {
        this.f13795a = i10;
        this.f13796b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f13795a) {
            case 0:
                this.f13796b.b();
                return;
            default:
                q qVar = this.f13796b;
                if (qVar.G != 0) {
                    qVar.F = true;
                    return;
                }
                return;
        }
    }
}
