package hi;
public final class c9 implements Runnable {
    public final int f13987a;
    public final sa f13988b;
    public final boolean f13989c;

    public c9(sa saVar, boolean z10, int i7) {
        this.f13987a = i7;
        this.f13988b = saVar;
        this.f13989c = z10;
    }

    @Override
    public final void run() {
        switch (this.f13987a) {
            case 0:
                this.f13988b.e(this.f13989c);
                return;
            case 1:
                sa saVar = this.f13988b;
                if (!this.f13989c) {
                    saVar.K0.b(false, false);
                    return;
                } else {
                    saVar.getClass();
                    return;
                }
            default:
                sa saVar2 = this.f13988b;
                saVar2.S = null;
                saVar2.f15049e = false;
                saVar2.p(this.f13989c);
                return;
        }
    }
}
