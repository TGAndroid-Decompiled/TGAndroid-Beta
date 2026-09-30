package ki;
public final class n implements Runnable {
    public final int f13809a;
    public final q f13810b;

    public n(q qVar, int i10) {
        this.f13809a = i10;
        this.f13810b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f13809a) {
            case 0:
                this.f13810b.b();
                return;
            default:
                q qVar = this.f13810b;
                if (qVar.G != 0) {
                    qVar.F = true;
                    return;
                }
                return;
        }
    }
}
