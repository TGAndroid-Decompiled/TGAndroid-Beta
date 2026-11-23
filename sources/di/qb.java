package di;
public final class qb implements Runnable {
    public final int f9596a;
    public final mc f9597b;

    public qb(mc mcVar, int i7) {
        this.f9596a = i7;
        this.f9597b = mcVar;
    }

    @Override
    public final void run() {
        switch (this.f9596a) {
            case 0:
                mc mcVar = this.f9597b;
                mcVar.O1 = true;
                mcVar.K0(null);
                org.telegram.messenger.g0.h3(new qb(mcVar, 1), 240L);
                return;
            case 1:
                this.f9597b.dismiss();
                return;
            default:
                wb wbVar = this.f9597b.f9335t1;
                wbVar.G = false;
                wbVar.invalidate();
                return;
        }
    }
}
