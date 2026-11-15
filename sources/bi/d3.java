package bi;
public final class d3 implements Runnable {
    public final int f3442a;
    public final c4 f3443b;
    public final int f3444c;

    public d3(c4 c4Var, int i7, int i10) {
        this.f3442a = i10;
        this.f3443b = c4Var;
        this.f3444c = i7;
    }

    @Override
    public final void run() {
        switch (this.f3442a) {
            case 0:
                this.f3443b.f3416f.scrollBy(0, this.f3444c);
                return;
            default:
                v3 v3Var = this.f3443b.f3416f;
                if (v3Var != null) {
                    v3Var.setSpanCount(this.f3444c);
                    return;
                }
                return;
        }
    }
}
