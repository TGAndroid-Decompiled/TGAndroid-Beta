package ai;
public final class va implements Runnable {
    public final int f1837a;
    public final wa f1838b;

    public va(wa waVar, int i10) {
        this.f1837a = i10;
        this.f1838b = waVar;
    }

    @Override
    public final void run() {
        switch (this.f1837a) {
            case 0:
                xa xaVar = this.f1838b.v;
                xaVar.f1924s = 0;
                xaVar.requestLayout();
                ya yaVar = xaVar.J;
                yaVar.L(yaVar.getWidth(), yaVar.getHeight());
                yaVar.requestLayout();
                return;
            case 1:
                xa xaVar2 = this.f1838b.v;
                xaVar2.f1924s = 0;
                xaVar2.requestLayout();
                ya yaVar2 = xaVar2.J;
                yaVar2.L(yaVar2.getWidth(), yaVar2.getHeight());
                yaVar2.requestLayout();
                return;
            case 2:
                wa waVar = this.f1838b;
                waVar.v.post(new va(waVar, 3));
                return;
            default:
                this.f1838b.v.f1926x = true;
                return;
        }
    }
}
