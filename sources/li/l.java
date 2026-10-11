package li;
public final class l implements Runnable {
    public final int f15663a;
    public final q f15664b;

    public l(q qVar, int i10) {
        this.f15663a = i10;
        this.f15664b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15663a) {
            case 0:
                b bVar = this.f15664b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f15664b.a();
                return;
        }
    }
}
