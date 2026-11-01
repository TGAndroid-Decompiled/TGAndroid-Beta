package li;
public final class q implements Runnable {
    public final int f12228a;
    public final v f12229b;

    public q(v vVar, int i10) {
        this.f12228a = i10;
        this.f12229b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f12228a) {
            case 0:
                v vVar = this.f12229b;
                if (vVar.W != 0) {
                    vVar.V = true;
                    return;
                }
                return;
            default:
                this.f12229b.c();
                return;
        }
    }
}
