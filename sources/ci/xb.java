package ci;
public final class xb implements Runnable {
    public final int f6369a;
    public final tc f6370b;

    public xb(tc tcVar, int i3) {
        this.f6369a = i3;
        this.f6370b = tcVar;
    }

    @Override
    public final void run() {
        switch (this.f6369a) {
            case 0:
                tc tcVar = this.f6370b;
                tcVar.L1 = true;
                tcVar.J0(null);
                org.telegram.messenger.g0.i3(new xb(tcVar, 1), 240L);
                return;
            case 1:
                this.f6370b.dismiss();
                return;
            default:
                dc dcVar = this.f6370b.f6059q1;
                dcVar.G = false;
                dcVar.invalidate();
                return;
        }
    }
}
