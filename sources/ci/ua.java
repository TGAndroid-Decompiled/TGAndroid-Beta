package ci;
public final class ua implements Runnable {
    public final int f5633a;
    public final oc f5634b;
    public final boolean f5635c;

    public ua(oc ocVar, boolean z10, int i10) {
        this.f5633a = i10;
        this.f5634b = ocVar;
        this.f5635c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5633a) {
            case 0:
                this.f5634b.f(this.f5635c);
                return;
            case 1:
                oc ocVar = this.f5634b;
                if (!this.f5635c) {
                    ocVar.J0.b(false, false);
                    return;
                } else {
                    ocVar.getClass();
                    return;
                }
            default:
                oc ocVar2 = this.f5634b;
                ocVar2.R = null;
                ocVar2.e = false;
                ocVar2.q(this.f5635c);
                return;
        }
    }
}
