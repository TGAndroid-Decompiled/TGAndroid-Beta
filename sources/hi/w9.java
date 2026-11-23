package hi;
public final class w9 implements Runnable {
    public final int f15684a;
    public final nb f15685b;
    public final boolean f15686c;

    public w9(nb nbVar, boolean z10, int i7) {
        this.f15684a = i7;
        this.f15685b = nbVar;
        this.f15686c = z10;
    }

    @Override
    public final void run() {
        switch (this.f15684a) {
            case 0:
                this.f15685b.e(this.f15686c);
                return;
            case 1:
                nb nbVar = this.f15685b;
                if (!this.f15686c) {
                    nbVar.K0.b(false, false);
                    return;
                } else {
                    nbVar.getClass();
                    return;
                }
            default:
                nb nbVar2 = this.f15685b;
                nbVar2.S = null;
                nbVar2.f15068e = false;
                nbVar2.p(this.f15686c);
                return;
        }
    }
}
