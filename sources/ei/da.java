package ei;
public final class da implements Runnable {
    public final int f8912a;
    public final vb f8913b;
    public final boolean f8914c;

    public da(vb vbVar, boolean z10, int i10) {
        this.f8912a = i10;
        this.f8913b = vbVar;
        this.f8914c = z10;
    }

    @Override
    public final void run() {
        switch (this.f8912a) {
            case 0:
                this.f8913b.e(this.f8914c);
                return;
            case 1:
                vb vbVar = this.f8913b;
                if (!this.f8914c) {
                    vbVar.J0.b(false, false);
                    return;
                } else {
                    vbVar.getClass();
                    return;
                }
            default:
                vb vbVar2 = this.f8913b;
                vbVar2.R = null;
                vbVar2.e = false;
                vbVar2.p(this.f8914c);
                return;
        }
    }
}
