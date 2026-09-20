package ci;
public final class ua implements Runnable {
    public final int f5635a;
    public final oc f5636b;
    public final boolean f5637c;

    public ua(oc ocVar, boolean z10, int i10) {
        this.f5635a = i10;
        this.f5636b = ocVar;
        this.f5637c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5635a) {
            case 0:
                this.f5636b.f(this.f5637c);
                return;
            case 1:
                oc ocVar = this.f5636b;
                if (!this.f5637c) {
                    ocVar.J0.b(false, false);
                    return;
                } else {
                    ocVar.getClass();
                    return;
                }
            default:
                oc ocVar2 = this.f5636b;
                ocVar2.R = null;
                ocVar2.e = false;
                ocVar2.q(this.f5637c);
                return;
        }
    }
}
