package hi;
public final class k9 implements Runnable {
    public final int f14938a;
    public final sa f14939b;

    public k9(sa saVar, int i7) {
        this.f14938a = i7;
        this.f14939b = saVar;
    }

    @Override
    public final void run() {
        switch (this.f14938a) {
            case 0:
                sa saVar = this.f14939b;
                saVar.getClass();
                saVar.f(1.0f, true, new r8(saVar, 6));
                saVar.f15391c1.b(true, true);
                return;
            default:
                sa saVar2 = this.f14939b;
                saVar2.e(false);
                saVar2.f15424n2 = null;
                return;
        }
    }
}
