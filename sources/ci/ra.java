package ci;
public final class ra implements Runnable {
    public final int f5911a;
    public final lc f5912b;
    public final boolean f5913c;

    public ra(lc lcVar, boolean z10, int i10) {
        this.f5911a = i10;
        this.f5912b = lcVar;
        this.f5913c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5911a) {
            case 0:
                this.f5912b.e(this.f5913c);
                return;
            case 1:
                lc lcVar = this.f5912b;
                if (!this.f5913c) {
                    lcVar.J0.b(false, false);
                    return;
                } else {
                    lcVar.getClass();
                    return;
                }
            default:
                lc lcVar2 = this.f5912b;
                lcVar2.R = null;
                lcVar2.f5472e = false;
                lcVar2.p(this.f5913c);
                return;
        }
    }
}
