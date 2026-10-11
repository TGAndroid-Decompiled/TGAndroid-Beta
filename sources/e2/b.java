package e2;
public final class b implements Runnable {
    public final int f8519a;
    public final c f8520b;
    public final Object f8521c;

    public b(c cVar, Object obj, int i10) {
        this.f8519a = i10;
        this.f8520b = cVar;
        this.f8521c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8519a) {
            case 0:
                c cVar = this.f8520b;
                if (cVar.f8525a == 0) {
                    cVar.n(this.f8521c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8520b;
                int i10 = cVar2.f8525a - 1;
                cVar2.f8525a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8521c);
                    return;
                }
                return;
        }
    }
}
