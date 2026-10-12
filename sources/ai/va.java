package ai;
public final class va implements Runnable {
    public final int f1835a;
    public final wa f1836b;

    public va(wa waVar, int i10) {
        this.f1835a = i10;
        this.f1836b = waVar;
    }

    @Override
    public final void run() {
        switch (this.f1835a) {
            case 0:
                xa xaVar = this.f1836b.v;
                xaVar.f1922s = 0;
                xaVar.requestLayout();
                ya yaVar = xaVar.J;
                yaVar.L(yaVar.getWidth(), yaVar.getHeight());
                yaVar.requestLayout();
                return;
            case 1:
                xa xaVar2 = this.f1836b.v;
                xaVar2.f1922s = 0;
                xaVar2.requestLayout();
                ya yaVar2 = xaVar2.J;
                yaVar2.L(yaVar2.getWidth(), yaVar2.getHeight());
                yaVar2.requestLayout();
                return;
            case 2:
                wa waVar = this.f1836b;
                waVar.v.post(new va(waVar, 3));
                return;
            default:
                this.f1836b.v.f1924x = true;
                return;
        }
    }
}
