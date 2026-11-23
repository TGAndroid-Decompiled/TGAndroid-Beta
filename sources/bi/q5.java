package bi;
public final class q5 implements Runnable {
    public final int f4002a;
    public final p6 f4003b;
    public final int f4004c;

    public q5(p6 p6Var, int i7, int i10) {
        this.f4002a = i10;
        this.f4003b = p6Var;
        this.f4004c = i7;
    }

    @Override
    public final void run() {
        switch (this.f4002a) {
            case 0:
                this.f4003b.f3970f.scrollBy(0, this.f4004c);
                return;
            default:
                i6 i6Var = this.f4003b.f3970f;
                if (i6Var != null) {
                    i6Var.setSpanCount(this.f4004c);
                    return;
                }
                return;
        }
    }
}
