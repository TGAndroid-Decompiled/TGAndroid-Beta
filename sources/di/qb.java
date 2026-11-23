package di;
public final class qb implements Runnable {
    public final int f9600a;
    public final mc f9601b;

    public qb(mc mcVar, int i7) {
        this.f9600a = i7;
        this.f9601b = mcVar;
    }

    @Override
    public final void run() {
        switch (this.f9600a) {
            case 0:
                mc mcVar = this.f9601b;
                mcVar.O1 = true;
                mcVar.K0(null);
                org.telegram.messenger.g0.h3(new qb(mcVar, 1), 240L);
                return;
            case 1:
                this.f9601b.dismiss();
                return;
            default:
                wb wbVar = this.f9601b.f9339t1;
                wbVar.G = false;
                wbVar.invalidate();
                return;
        }
    }
}
