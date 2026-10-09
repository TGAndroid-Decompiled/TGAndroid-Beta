package e2;
public final class b implements Runnable {
    public final int f8520a;
    public final c f8521b;
    public final Object f8522c;

    public b(c cVar, Object obj, int i10) {
        this.f8520a = i10;
        this.f8521b = cVar;
        this.f8522c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8520a) {
            case 0:
                c cVar = this.f8521b;
                if (cVar.f8526a == 0) {
                    cVar.n(this.f8522c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8521b;
                int i10 = cVar2.f8526a - 1;
                cVar2.f8526a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8522c);
                    return;
                }
                return;
        }
    }
}
