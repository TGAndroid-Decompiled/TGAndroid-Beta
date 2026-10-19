package e2;
public final class b implements Runnable {
    public final int f8194a;
    public final c f8195b;
    public final Object f8196c;

    public b(c cVar, Object obj, int i10) {
        this.f8194a = i10;
        this.f8195b = cVar;
        this.f8196c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8194a) {
            case 0:
                c cVar = this.f8195b;
                if (cVar.f8202a == 0) {
                    cVar.n(this.f8196c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8195b;
                int i10 = cVar2.f8202a - 1;
                cVar2.f8202a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8196c);
                    return;
                }
                return;
        }
    }
}
