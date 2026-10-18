package ei;
public final class da implements Runnable {
    public final int f8903a;
    public final vb f8904b;
    public final boolean f8905c;

    public da(vb vbVar, boolean z10, int i10) {
        this.f8903a = i10;
        this.f8904b = vbVar;
        this.f8905c = z10;
    }

    @Override
    public final void run() {
        switch (this.f8903a) {
            case 0:
                this.f8904b.e(this.f8905c);
                return;
            case 1:
                vb vbVar = this.f8904b;
                if (!this.f8905c) {
                    vbVar.J0.b(false, false);
                    return;
                } else {
                    vbVar.getClass();
                    return;
                }
            default:
                vb vbVar2 = this.f8904b;
                vbVar2.R = null;
                vbVar2.e = false;
                vbVar2.p(this.f8905c);
                return;
        }
    }
}
