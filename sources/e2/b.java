package e2;
public final class b implements Runnable {
    public final int f8196a;
    public final c f8197b;
    public final Object f8198c;

    public b(c cVar, Object obj, int i10) {
        this.f8196a = i10;
        this.f8197b = cVar;
        this.f8198c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8196a) {
            case 0:
                c cVar = this.f8197b;
                if (cVar.f8204a == 0) {
                    cVar.n(this.f8198c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8197b;
                int i10 = cVar2.f8204a - 1;
                cVar2.f8204a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8198c);
                    return;
                }
                return;
        }
    }
}
