package ei;
public final class da implements Runnable {
    public final int f8902a;
    public final vb f8903b;
    public final boolean f8904c;

    public da(vb vbVar, boolean z10, int i10) {
        this.f8902a = i10;
        this.f8903b = vbVar;
        this.f8904c = z10;
    }

    @Override
    public final void run() {
        switch (this.f8902a) {
            case 0:
                this.f8903b.e(this.f8904c);
                return;
            case 1:
                vb vbVar = this.f8903b;
                if (!this.f8904c) {
                    vbVar.J0.b(false, false);
                    return;
                } else {
                    vbVar.getClass();
                    return;
                }
            default:
                vb vbVar2 = this.f8903b;
                vbVar2.R = null;
                vbVar2.e = false;
                vbVar2.p(this.f8904c);
                return;
        }
    }
}
