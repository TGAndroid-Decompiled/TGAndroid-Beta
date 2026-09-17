package di;
public final class ua implements Runnable {
    public final int f8288a;
    public final pc f8289b;
    public final boolean f8290c;

    public ua(pc pcVar, boolean z10, int i10) {
        this.f8288a = i10;
        this.f8289b = pcVar;
        this.f8290c = z10;
    }

    @Override
    public final void run() {
        switch (this.f8288a) {
            case 0:
                this.f8289b.f(this.f8290c);
                return;
            case 1:
                pc pcVar = this.f8289b;
                if (!this.f8290c) {
                    pcVar.J0.b(false, false);
                    return;
                } else {
                    pcVar.getClass();
                    return;
                }
            default:
                pc pcVar2 = this.f8289b;
                pcVar2.R = null;
                pcVar2.f7883e = false;
                pcVar2.q(this.f8290c);
                return;
        }
    }
}
