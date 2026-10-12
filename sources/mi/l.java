package mi;
public final class l implements Runnable {
    public final int f15871a;
    public final q f15872b;

    public l(q qVar, int i10) {
        this.f15871a = i10;
        this.f15872b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15871a) {
            case 0:
                b bVar = this.f15872b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f15872b.a();
                return;
        }
    }
}
