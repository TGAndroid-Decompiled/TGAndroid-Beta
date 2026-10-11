package ki;
public final class p implements Runnable {
    public final int f15079a;
    public final t f15080b;

    public p(t tVar, int i10) {
        this.f15079a = i10;
        this.f15080b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f15079a) {
            case 0:
                this.f15080b.c();
                return;
            default:
                t tVar = this.f15080b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
        }
    }
}
