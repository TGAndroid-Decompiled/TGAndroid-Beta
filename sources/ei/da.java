package ei;
public final class da implements Runnable {
    public final int f8901a;
    public final vb f8902b;
    public final boolean f8903c;

    public da(vb vbVar, boolean z10, int i10) {
        this.f8901a = i10;
        this.f8902b = vbVar;
        this.f8903c = z10;
    }

    @Override
    public final void run() {
        switch (this.f8901a) {
            case 0:
                this.f8902b.e(this.f8903c);
                return;
            case 1:
                vb vbVar = this.f8902b;
                if (!this.f8903c) {
                    vbVar.J0.b(false, false);
                    return;
                } else {
                    vbVar.getClass();
                    return;
                }
            default:
                vb vbVar2 = this.f8902b;
                vbVar2.R = null;
                vbVar2.e = false;
                vbVar2.p(this.f8903c);
                return;
        }
    }
}
