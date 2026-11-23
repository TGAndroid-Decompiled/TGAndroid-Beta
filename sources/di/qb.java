package di;
public final class qb implements Runnable {
    public final int f9635a;
    public final mc f9636b;

    public qb(mc mcVar, int i7) {
        this.f9635a = i7;
        this.f9636b = mcVar;
    }

    @Override
    public final void run() {
        switch (this.f9635a) {
            case 0:
                mc mcVar = this.f9636b;
                mcVar.O1 = true;
                mcVar.K0(null);
                org.telegram.messenger.g0.h3(new qb(mcVar, 1), 240L);
                return;
            case 1:
                this.f9636b.dismiss();
                return;
            default:
                wb wbVar = this.f9636b.f9374t1;
                wbVar.G = false;
                wbVar.invalidate();
                return;
        }
    }
}
