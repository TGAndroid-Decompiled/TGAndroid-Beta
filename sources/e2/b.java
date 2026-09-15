package e2;
public final class b implements Runnable {
    public final int f7872a;
    public final c f7873b;
    public final Object f7874c;

    public b(c cVar, Object obj, int i10) {
        this.f7872a = i10;
        this.f7873b = cVar;
        this.f7874c = obj;
    }

    @Override
    public final void run() {
        switch (this.f7872a) {
            case 0:
                c cVar = this.f7873b;
                if (cVar.f7878a == 0) {
                    cVar.n(this.f7874c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f7873b;
                int i10 = cVar2.f7878a - 1;
                cVar2.f7878a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f7874c);
                    return;
                }
                return;
        }
    }
}
