package hi;
public final class k9 implements Runnable {
    public final int f14941a;
    public final sa f14942b;

    public k9(sa saVar, int i7) {
        this.f14941a = i7;
        this.f14942b = saVar;
    }

    @Override
    public final void run() {
        switch (this.f14941a) {
            case 0:
                sa saVar = this.f14942b;
                saVar.getClass();
                saVar.f(1.0f, true, new r8(saVar, 6));
                saVar.f15394c1.b(true, true);
                return;
            default:
                sa saVar2 = this.f14942b;
                saVar2.e(false);
                saVar2.f15427n2 = null;
                return;
        }
    }
}
