package ci;
public final class ra implements Runnable {
    public final int f5909a;
    public final lc f5910b;
    public final boolean f5911c;

    public ra(lc lcVar, boolean z10, int i10) {
        this.f5909a = i10;
        this.f5910b = lcVar;
        this.f5911c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5909a) {
            case 0:
                this.f5910b.e(this.f5911c);
                return;
            case 1:
                lc lcVar = this.f5910b;
                if (!this.f5911c) {
                    lcVar.J0.b(false, false);
                    return;
                } else {
                    lcVar.getClass();
                    return;
                }
            default:
                lc lcVar2 = this.f5910b;
                lcVar2.R = null;
                lcVar2.f5470e = false;
                lcVar2.p(this.f5911c);
                return;
        }
    }
}
