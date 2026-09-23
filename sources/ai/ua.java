package ai;
public final class ua implements Runnable {
    public final int f1588a;
    public final va f1589b;

    public ua(va vaVar, int i10) {
        this.f1588a = i10;
        this.f1589b = vaVar;
    }

    @Override
    public final void run() {
        switch (this.f1588a) {
            case 0:
                wa waVar = this.f1589b.v;
                waVar.f1669s = 0;
                waVar.requestLayout();
                xa xaVar = waVar.J;
                xaVar.L(xaVar.getWidth(), xaVar.getHeight());
                xaVar.requestLayout();
                return;
            case 1:
                wa waVar2 = this.f1589b.v;
                waVar2.f1669s = 0;
                waVar2.requestLayout();
                xa xaVar2 = waVar2.J;
                xaVar2.L(xaVar2.getWidth(), xaVar2.getHeight());
                xaVar2.requestLayout();
                return;
            case 2:
                va vaVar = this.f1589b;
                vaVar.v.post(new ua(vaVar, 3));
                return;
            default:
                this.f1589b.v.f1671x = true;
                return;
        }
    }
}
