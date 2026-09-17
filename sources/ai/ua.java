package ai;
public final class ua implements Runnable {
    public final int f1593a;
    public final va f1594b;

    public ua(va vaVar, int i10) {
        this.f1593a = i10;
        this.f1594b = vaVar;
    }

    @Override
    public final void run() {
        switch (this.f1593a) {
            case 0:
                wa waVar = this.f1594b.v;
                waVar.f1674s = 0;
                waVar.requestLayout();
                xa xaVar = waVar.J;
                xaVar.L(xaVar.getWidth(), xaVar.getHeight());
                xaVar.requestLayout();
                return;
            case 1:
                wa waVar2 = this.f1594b.v;
                waVar2.f1674s = 0;
                waVar2.requestLayout();
                xa xaVar2 = waVar2.J;
                xaVar2.L(xaVar2.getWidth(), xaVar2.getHeight());
                xaVar2.requestLayout();
                return;
            case 2:
                va vaVar = this.f1594b;
                vaVar.v.post(new ua(vaVar, 3));
                return;
            default:
                this.f1594b.v.f1676x = true;
                return;
        }
    }
}
