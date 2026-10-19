package ei;
public final class da implements Runnable {
    public final int f8900a;
    public final vb f8901b;
    public final boolean f8902c;

    public da(vb vbVar, boolean z10, int i10) {
        this.f8900a = i10;
        this.f8901b = vbVar;
        this.f8902c = z10;
    }

    @Override
    public final void run() {
        switch (this.f8900a) {
            case 0:
                this.f8901b.e(this.f8902c);
                return;
            case 1:
                vb vbVar = this.f8901b;
                if (!this.f8902c) {
                    vbVar.J0.b(false, false);
                    return;
                } else {
                    vbVar.getClass();
                    return;
                }
            default:
                vb vbVar2 = this.f8901b;
                vbVar2.R = null;
                vbVar2.e = false;
                vbVar2.p(this.f8902c);
                return;
        }
    }
}
