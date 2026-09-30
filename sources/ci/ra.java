package ci;
public final class ra implements Runnable {
    public final int f5470a;
    public final lc f5471b;
    public final boolean f5472c;

    public ra(lc lcVar, boolean z10, int i10) {
        this.f5470a = i10;
        this.f5471b = lcVar;
        this.f5472c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5470a) {
            case 0:
                this.f5471b.f(this.f5472c);
                return;
            case 1:
                lc lcVar = this.f5471b;
                if (!this.f5472c) {
                    lcVar.J0.b(false, false);
                    return;
                } else {
                    lcVar.getClass();
                    return;
                }
            default:
                lc lcVar2 = this.f5471b;
                lcVar2.R = null;
                lcVar2.e = false;
                lcVar2.q(this.f5472c);
                return;
        }
    }
}
