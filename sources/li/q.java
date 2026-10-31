package li;
public final class q implements Runnable {
    public final int f12227a;
    public final v f12228b;

    public q(v vVar, int i10) {
        this.f12227a = i10;
        this.f12228b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f12227a) {
            case 0:
                v vVar = this.f12228b;
                if (vVar.W != 0) {
                    vVar.V = true;
                    return;
                }
                return;
            default:
                this.f12228b.c();
                return;
        }
    }
}
