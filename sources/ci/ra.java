package ci;
public final class ra implements Runnable {
    public final int f5910a;
    public final lc f5911b;
    public final boolean f5912c;

    public ra(lc lcVar, boolean z10, int i10) {
        this.f5910a = i10;
        this.f5911b = lcVar;
        this.f5912c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5910a) {
            case 0:
                this.f5911b.e(this.f5912c);
                return;
            case 1:
                lc lcVar = this.f5911b;
                if (!this.f5912c) {
                    lcVar.J0.b(false, false);
                    return;
                } else {
                    lcVar.getClass();
                    return;
                }
            default:
                lc lcVar2 = this.f5911b;
                lcVar2.R = null;
                lcVar2.f5471e = false;
                lcVar2.p(this.f5912c);
                return;
        }
    }
}
