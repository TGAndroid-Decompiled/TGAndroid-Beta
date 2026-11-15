package bi;
public final class d3 implements Runnable {
    public final int f3439a;
    public final c4 f3440b;
    public final int f3441c;

    public d3(c4 c4Var, int i7, int i10) {
        this.f3439a = i10;
        this.f3440b = c4Var;
        this.f3441c = i7;
    }

    @Override
    public final void run() {
        switch (this.f3439a) {
            case 0:
                this.f3440b.f3413f.scrollBy(0, this.f3441c);
                return;
            default:
                v3 v3Var = this.f3440b.f3413f;
                if (v3Var != null) {
                    v3Var.setSpanCount(this.f3441c);
                    return;
                }
                return;
        }
    }
}
