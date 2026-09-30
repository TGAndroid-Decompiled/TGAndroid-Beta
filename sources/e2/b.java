package e2;
public final class b implements Runnable {
    public final int f7871a;
    public final c f7872b;
    public final Object f7873c;

    public b(c cVar, Object obj, int i10) {
        this.f7871a = i10;
        this.f7872b = cVar;
        this.f7873c = obj;
    }

    @Override
    public final void run() {
        switch (this.f7871a) {
            case 0:
                c cVar = this.f7872b;
                if (cVar.f7877a == 0) {
                    cVar.n(this.f7873c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f7872b;
                int i10 = cVar2.f7877a - 1;
                cVar2.f7877a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f7873c);
                    return;
                }
                return;
        }
    }
}
