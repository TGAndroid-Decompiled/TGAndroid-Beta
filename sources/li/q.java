package li;
public final class q implements Runnable {
    public final int f14943a;
    public final u f14944b;

    public q(u uVar, int i10) {
        this.f14943a = i10;
        this.f14944b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f14943a) {
            case 0:
                this.f14944b.c();
                return;
            default:
                u uVar = this.f14944b;
                if (uVar.W != 0) {
                    uVar.V = true;
                    return;
                }
                return;
        }
    }
}
