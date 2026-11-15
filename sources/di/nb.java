package di;
public final class nb implements Runnable {
    public final int f9133a;
    public final jc f9134b;

    public nb(jc jcVar, int i7) {
        this.f9133a = i7;
        this.f9134b = jcVar;
    }

    @Override
    public final void run() {
        switch (this.f9133a) {
            case 0:
                jc jcVar = this.f9134b;
                jcVar.O1 = true;
                jcVar.J0(null);
                org.telegram.messenger.g0.i3(new nb(jcVar, 1), 240L);
                return;
            case 1:
                this.f9134b.dismiss();
                return;
            default:
                tb tbVar = this.f9134b.f8880t1;
                tbVar.G = false;
                tbVar.invalidate();
                return;
        }
    }
}
