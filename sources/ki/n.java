package ki;
public final class n implements Runnable {
    public final int f13794a;
    public final q f13795b;

    public n(q qVar, int i10) {
        this.f13794a = i10;
        this.f13795b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f13794a) {
            case 0:
                this.f13795b.b();
                return;
            default:
                q qVar = this.f13795b;
                if (qVar.G != 0) {
                    qVar.F = true;
                    return;
                }
                return;
        }
    }
}
