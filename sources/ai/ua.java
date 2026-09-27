package ai;
public final class ua implements Runnable {
    public final int f1590a;
    public final va f1591b;

    public ua(va vaVar, int i10) {
        this.f1590a = i10;
        this.f1591b = vaVar;
    }

    @Override
    public final void run() {
        switch (this.f1590a) {
            case 0:
                wa waVar = this.f1591b.v;
                waVar.f1671s = 0;
                waVar.requestLayout();
                xa xaVar = waVar.J;
                xaVar.L(xaVar.getWidth(), xaVar.getHeight());
                xaVar.requestLayout();
                return;
            case 1:
                wa waVar2 = this.f1591b.v;
                waVar2.f1671s = 0;
                waVar2.requestLayout();
                xa xaVar2 = waVar2.J;
                xaVar2.L(xaVar2.getWidth(), xaVar2.getHeight());
                xaVar2.requestLayout();
                return;
            case 2:
                va vaVar = this.f1591b;
                vaVar.v.post(new ua(vaVar, 3));
                return;
            default:
                this.f1591b.v.f1673x = true;
                return;
        }
    }
}
