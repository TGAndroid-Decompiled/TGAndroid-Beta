package ci;
public final class ua implements Runnable {
    public final int f5634a;
    public final oc f5635b;
    public final boolean f5636c;

    public ua(oc ocVar, boolean z10, int i10) {
        this.f5634a = i10;
        this.f5635b = ocVar;
        this.f5636c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5634a) {
            case 0:
                this.f5635b.f(this.f5636c);
                return;
            case 1:
                oc ocVar = this.f5635b;
                if (!this.f5636c) {
                    ocVar.J0.b(false, false);
                    return;
                } else {
                    ocVar.getClass();
                    return;
                }
            default:
                oc ocVar2 = this.f5635b;
                ocVar2.R = null;
                ocVar2.e = false;
                ocVar2.q(this.f5636c);
                return;
        }
    }
}
