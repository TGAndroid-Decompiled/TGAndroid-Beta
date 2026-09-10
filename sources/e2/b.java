package e2;
public final class b implements Runnable {
    public final int f7177a;
    public final c f7178b;
    public final Object f7179c;

    public b(c cVar, Object obj, int i10) {
        this.f7177a = i10;
        this.f7178b = cVar;
        this.f7179c = obj;
    }

    @Override
    public final void run() {
        switch (this.f7177a) {
            case 0:
                c cVar = this.f7178b;
                if (cVar.f7183a == 0) {
                    cVar.n(this.f7179c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f7178b;
                int i10 = cVar2.f7183a - 1;
                cVar2.f7183a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f7179c);
                    return;
                }
                return;
        }
    }
}
