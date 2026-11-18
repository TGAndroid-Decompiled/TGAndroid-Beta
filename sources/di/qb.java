package di;
public final class qb implements Runnable {
    public final int f9601a;
    public final mc f9602b;

    public qb(mc mcVar, int i7) {
        this.f9601a = i7;
        this.f9602b = mcVar;
    }

    @Override
    public final void run() {
        switch (this.f9601a) {
            case 0:
                mc mcVar = this.f9602b;
                mcVar.O1 = true;
                mcVar.K0(null);
                org.telegram.messenger.g0.h3(new qb(mcVar, 1), 240L);
                return;
            case 1:
                this.f9602b.dismiss();
                return;
            default:
                wb wbVar = this.f9602b.f9347t1;
                wbVar.G = false;
                wbVar.invalidate();
                return;
        }
    }
}
