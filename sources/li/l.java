package li;
public final class l implements Runnable {
    public final int f15627a;
    public final q f15628b;

    public l(q qVar, int i10) {
        this.f15627a = i10;
        this.f15628b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f15627a) {
            case 0:
                b bVar = this.f15628b.v;
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            default:
                this.f15628b.a();
                return;
        }
    }
}
