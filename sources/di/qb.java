package di;
public final class qb implements Runnable {
    public final int f9604a;
    public final mc f9605b;

    public qb(mc mcVar, int i7) {
        this.f9604a = i7;
        this.f9605b = mcVar;
    }

    @Override
    public final void run() {
        switch (this.f9604a) {
            case 0:
                mc mcVar = this.f9605b;
                mcVar.O1 = true;
                mcVar.K0(null);
                org.telegram.messenger.g0.h3(new qb(mcVar, 1), 240L);
                return;
            case 1:
                this.f9605b.dismiss();
                return;
            default:
                wb wbVar = this.f9605b.f9350t1;
                wbVar.G = false;
                wbVar.invalidate();
                return;
        }
    }
}
