package bi;
public final class k5 implements Runnable {
    public final int f3788a;
    public final j6 f3789b;
    public final int f3790c;

    public k5(j6 j6Var, int i7, int i10) {
        this.f3788a = i10;
        this.f3789b = j6Var;
        this.f3790c = i7;
    }

    @Override
    public final void run() {
        switch (this.f3788a) {
            case 0:
                this.f3789b.f3760f.scrollBy(0, this.f3790c);
                return;
            default:
                c6 c6Var = this.f3789b.f3760f;
                if (c6Var != null) {
                    c6Var.setSpanCount(this.f3790c);
                    return;
                }
                return;
        }
    }
}
