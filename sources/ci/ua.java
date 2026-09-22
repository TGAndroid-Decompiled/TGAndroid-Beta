package ci;
public final class ua implements Runnable {
    public final int f5631a;
    public final oc f5632b;
    public final boolean f5633c;

    public ua(oc ocVar, boolean z10, int i10) {
        this.f5631a = i10;
        this.f5632b = ocVar;
        this.f5633c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5631a) {
            case 0:
                this.f5632b.f(this.f5633c);
                return;
            case 1:
                oc ocVar = this.f5632b;
                if (!this.f5633c) {
                    ocVar.J0.b(false, false);
                    return;
                } else {
                    ocVar.getClass();
                    return;
                }
            default:
                oc ocVar2 = this.f5632b;
                ocVar2.R = null;
                ocVar2.e = false;
                ocVar2.q(this.f5633c);
                return;
        }
    }
}
