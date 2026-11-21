package di;
public final class qb implements Runnable {
    public final int f9632a;
    public final mc f9633b;

    public qb(mc mcVar, int i7) {
        this.f9632a = i7;
        this.f9633b = mcVar;
    }

    @Override
    public final void run() {
        switch (this.f9632a) {
            case 0:
                mc mcVar = this.f9633b;
                mcVar.O1 = true;
                mcVar.K0(null);
                org.telegram.messenger.g0.h3(new qb(mcVar, 1), 240L);
                return;
            case 1:
                this.f9633b.dismiss();
                return;
            default:
                wb wbVar = this.f9633b.f9371t1;
                wbVar.G = false;
                wbVar.invalidate();
                return;
        }
    }
}
