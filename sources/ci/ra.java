package ci;
public final class ra implements Runnable {
    public final int f5461a;
    public final lc f5462b;
    public final boolean f5463c;

    public ra(lc lcVar, boolean z10, int i10) {
        this.f5461a = i10;
        this.f5462b = lcVar;
        this.f5463c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5461a) {
            case 0:
                this.f5462b.f(this.f5463c);
                return;
            case 1:
                lc lcVar = this.f5462b;
                if (!this.f5463c) {
                    lcVar.J0.b(false, false);
                    return;
                } else {
                    lcVar.getClass();
                    return;
                }
            default:
                lc lcVar2 = this.f5462b;
                lcVar2.R = null;
                lcVar2.e = false;
                lcVar2.q(this.f5463c);
                return;
        }
    }
}
