package gi;
public final class f9 implements Runnable {
    public final int f12755a;
    public final va f12756b;
    public final boolean f12757c;

    public f9(va vaVar, boolean z10, int i3) {
        this.f12755a = i3;
        this.f12756b = vaVar;
        this.f12757c = z10;
    }

    @Override
    public final void run() {
        switch (this.f12755a) {
            case 0:
                this.f12756b.e(this.f12757c);
                return;
            case 1:
                va vaVar = this.f12756b;
                if (!this.f12757c) {
                    vaVar.K0.b(false, false);
                    return;
                } else {
                    vaVar.getClass();
                    return;
                }
            default:
                va vaVar2 = this.f12756b;
                vaVar2.S = null;
                vaVar2.f13712e = false;
                vaVar2.p(this.f12757c);
                return;
        }
    }
}
