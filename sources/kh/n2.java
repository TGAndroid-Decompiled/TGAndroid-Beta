package kh;
public final class n2 implements Runnable {
    public final int f10716a;
    public final n3 f10717b;
    public final int f10718c;

    public n2(n3 n3Var, int i10, int i11) {
        this.f10716a = i11;
        this.f10717b = n3Var;
        this.f10718c = i10;
    }

    @Override
    public final void run() {
        switch (this.f10716a) {
            case 0:
                this.f10717b.f10722f.scrollBy(0, this.f10718c);
                return;
            default:
                h3 h3Var = this.f10717b.f10722f;
                if (h3Var != null) {
                    h3Var.setSpanCount(this.f10718c);
                    return;
                }
                return;
        }
    }
}
