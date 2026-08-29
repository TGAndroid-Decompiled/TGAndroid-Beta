package ih;
public final class n2 implements Runnable {
    public final int f9290a;
    public final n3 f9291b;
    public final int f9292c;

    public n2(n3 n3Var, int i10, int i11) {
        this.f9290a = i11;
        this.f9291b = n3Var;
        this.f9292c = i10;
    }

    @Override
    public final void run() {
        switch (this.f9290a) {
            case 0:
                this.f9291b.f9297f.scrollBy(0, this.f9292c);
                return;
            default:
                h3 h3Var = this.f9291b.f9297f;
                if (h3Var != null) {
                    h3Var.setSpanCount(this.f9292c);
                    return;
                }
                return;
        }
    }
}
