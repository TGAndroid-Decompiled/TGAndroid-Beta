package bi;
public final class ed implements Runnable {
    public final int f3834a;
    public final ce f3835b;

    public ed(ce ceVar, int i7) {
        this.f3834a = i7;
        this.f3835b = ceVar;
    }

    @Override
    public final void run() {
        switch (this.f3834a) {
            case 0:
                ce ceVar = this.f3835b;
                ceVar.K1 = true;
                ceVar.J0(null);
                org.telegram.messenger.g0.i3(new ed(ceVar, 1), 240L);
                return;
            case 1:
                this.f3835b.dismiss();
                return;
            default:
                ld ldVar = this.f3835b.f3619p1;
                ldVar.F = false;
                ldVar.invalidate();
                return;
        }
    }
}
