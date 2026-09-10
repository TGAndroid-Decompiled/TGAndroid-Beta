package bi;
public final class dc implements Runnable {
    public final int f2566a;
    public final ce f2567b;
    public final boolean f2568c;

    public dc(ce ceVar, boolean z10, int i10) {
        this.f2566a = i10;
        this.f2567b = ceVar;
        this.f2568c = z10;
    }

    @Override
    public final void run() {
        switch (this.f2566a) {
            case 0:
                this.f2567b.f(this.f2568c);
                return;
            case 1:
                ce ceVar = this.f2567b;
                if (!this.f2568c) {
                    ceVar.J0.b(false, false);
                    return;
                } else {
                    ceVar.getClass();
                    return;
                }
            default:
                ce ceVar2 = this.f2567b;
                ceVar2.R = null;
                ceVar2.e = false;
                ceVar2.q(this.f2568c);
                return;
        }
    }
}
