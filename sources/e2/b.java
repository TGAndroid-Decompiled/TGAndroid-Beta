package e2;
public final class b implements Runnable {
    public final int f7877a;
    public final c f7878b;
    public final Object f7879c;

    public b(c cVar, Object obj, int i10) {
        this.f7877a = i10;
        this.f7878b = cVar;
        this.f7879c = obj;
    }

    @Override
    public final void run() {
        switch (this.f7877a) {
            case 0:
                c cVar = this.f7878b;
                if (cVar.f7883a == 0) {
                    cVar.n(this.f7879c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f7878b;
                int i10 = cVar2.f7883a - 1;
                cVar2.f7883a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f7879c);
                    return;
                }
                return;
        }
    }
}
