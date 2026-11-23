package bi;
public final class n5 implements Runnable {
    public final int f3953a;
    public final m6 f3954b;
    public final int f3955c;

    public n5(m6 m6Var, int i7, int i10) {
        this.f3953a = i10;
        this.f3954b = m6Var;
        this.f3955c = i7;
    }

    @Override
    public final void run() {
        switch (this.f3953a) {
            case 0:
                this.f3954b.f3901f.scrollBy(0, this.f3955c);
                return;
            default:
                f6 f6Var = this.f3954b.f3901f;
                if (f6Var != null) {
                    f6Var.setSpanCount(this.f3955c);
                    return;
                }
                return;
        }
    }
}
