package ki;
public final class n implements Runnable {
    public final int f13793a;
    public final q f13794b;

    public n(q qVar, int i10) {
        this.f13793a = i10;
        this.f13794b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f13793a) {
            case 0:
                this.f13794b.b();
                return;
            default:
                q qVar = this.f13794b;
                if (qVar.G != 0) {
                    qVar.F = true;
                    return;
                }
                return;
        }
    }
}
