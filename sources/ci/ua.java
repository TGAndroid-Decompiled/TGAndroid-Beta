package ci;
public final class ua implements Runnable {
    public final int f5629a;
    public final oc f5630b;
    public final boolean f5631c;

    public ua(oc ocVar, boolean z10, int i10) {
        this.f5629a = i10;
        this.f5630b = ocVar;
        this.f5631c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5629a) {
            case 0:
                this.f5630b.f(this.f5631c);
                return;
            case 1:
                oc ocVar = this.f5630b;
                if (!this.f5631c) {
                    ocVar.J0.b(false, false);
                    return;
                } else {
                    ocVar.getClass();
                    return;
                }
            default:
                oc ocVar2 = this.f5630b;
                ocVar2.R = null;
                ocVar2.e = false;
                ocVar2.q(this.f5631c);
                return;
        }
    }
}
