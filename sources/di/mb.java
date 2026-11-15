package di;
public final class mb implements Runnable {
    public final int f9067a;
    public final ic f9068b;

    public mb(ic icVar, int i7) {
        this.f9067a = i7;
        this.f9068b = icVar;
    }

    @Override
    public final void run() {
        switch (this.f9067a) {
            case 0:
                ic icVar = this.f9068b;
                icVar.O1 = true;
                icVar.J0(null);
                org.telegram.messenger.g0.i3(new mb(icVar, 1), 240L);
                return;
            case 1:
                this.f9068b.dismiss();
                return;
            default:
                sb sbVar = this.f9068b.f8827t1;
                sbVar.G = false;
                sbVar.invalidate();
                return;
        }
    }
}
