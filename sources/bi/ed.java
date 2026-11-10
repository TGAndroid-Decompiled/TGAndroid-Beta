package bi;
public final class ed implements Runnable {
    public final int f3831a;
    public final ce f3832b;

    public ed(ce ceVar, int i7) {
        this.f3831a = i7;
        this.f3832b = ceVar;
    }

    @Override
    public final void run() {
        switch (this.f3831a) {
            case 0:
                ce ceVar = this.f3832b;
                ceVar.N1 = true;
                ceVar.J0(null);
                org.telegram.messenger.g0.i3(new ed(ceVar, 1), 240L);
                return;
            case 1:
                this.f3832b.dismiss();
                return;
            default:
                ld ldVar = this.f3832b.f3622s1;
                ldVar.F = false;
                ldVar.invalidate();
                return;
        }
    }
}
