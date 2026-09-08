package e2;
public final class b implements Runnable {
    public final int f8753a;
    public final c f8754b;
    public final Object f8755c;

    public b(c cVar, Object obj, int i10) {
        this.f8753a = i10;
        this.f8754b = cVar;
        this.f8755c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8753a) {
            case 0:
                c cVar = this.f8754b;
                if (cVar.f8759a == 0) {
                    cVar.n(this.f8755c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8754b;
                int i10 = cVar2.f8759a - 1;
                cVar2.f8759a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8755c);
                    return;
                }
                return;
        }
    }
}
