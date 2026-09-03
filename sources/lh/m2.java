package lh;
public final class m2 implements Runnable {
    public final int f12851a;
    public final n3 f12852b;
    public final int f12853c;

    public m2(n3 n3Var, int i10, int i11) {
        this.f12851a = i11;
        this.f12852b = n3Var;
        this.f12853c = i10;
    }

    @Override
    public final void run() {
        switch (this.f12851a) {
            case 0:
                this.f12852b.f12866f.scrollBy(0, this.f12853c);
                return;
            default:
                h3 h3Var = this.f12852b.f12866f;
                if (h3Var != null) {
                    h3Var.setSpanCount(this.f12853c);
                    return;
                }
                return;
        }
    }
}
