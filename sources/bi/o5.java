package bi;
public final class o5 implements Runnable {
    public final int f3974a;
    public final n6 f3975b;
    public final int f3976c;

    public o5(n6 n6Var, int i7, int i10) {
        this.f3974a = i10;
        this.f3975b = n6Var;
        this.f3976c = i7;
    }

    @Override
    public final void run() {
        switch (this.f3974a) {
            case 0:
                this.f3975b.f3948f.scrollBy(0, this.f3976c);
                return;
            default:
                g6 g6Var = this.f3975b.f3948f;
                if (g6Var != null) {
                    g6Var.setSpanCount(this.f3976c);
                    return;
                }
                return;
        }
    }
}
