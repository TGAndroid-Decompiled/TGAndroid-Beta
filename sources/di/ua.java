package di;
public final class ua implements Runnable {
    public final int f8260a;
    public final pc f8261b;
    public final boolean f8262c;

    public ua(pc pcVar, boolean z10, int i10) {
        this.f8260a = i10;
        this.f8261b = pcVar;
        this.f8262c = z10;
    }

    @Override
    public final void run() {
        switch (this.f8260a) {
            case 0:
                this.f8261b.f(this.f8262c);
                return;
            case 1:
                pc pcVar = this.f8261b;
                if (!this.f8262c) {
                    pcVar.J0.b(false, false);
                    return;
                } else {
                    pcVar.getClass();
                    return;
                }
            default:
                pc pcVar2 = this.f8261b;
                pcVar2.R = null;
                pcVar2.f7855e = false;
                pcVar2.q(this.f8262c);
                return;
        }
    }
}
