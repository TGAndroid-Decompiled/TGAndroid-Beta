package bi;
public final class l5 implements Runnable {
    public final int f3845a;
    public final k6 f3846b;
    public final int f3847c;

    public l5(k6 k6Var, int i7, int i10) {
        this.f3845a = i10;
        this.f3846b = k6Var;
        this.f3847c = i7;
    }

    @Override
    public final void run() {
        switch (this.f3845a) {
            case 0:
                this.f3846b.f3817f.scrollBy(0, this.f3847c);
                return;
            default:
                d6 d6Var = this.f3846b.f3817f;
                if (d6Var != null) {
                    d6Var.setSpanCount(this.f3847c);
                    return;
                }
                return;
        }
    }
}
