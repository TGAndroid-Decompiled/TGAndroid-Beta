package e2;
public final class b implements Runnable {
    public final int f8725a;
    public final c f8726b;
    public final Object f8727c;

    public b(c cVar, Object obj, int i10) {
        this.f8725a = i10;
        this.f8726b = cVar;
        this.f8727c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8725a) {
            case 0:
                c cVar = this.f8726b;
                if (cVar.f8731a == 0) {
                    cVar.n(this.f8727c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8726b;
                int i10 = cVar2.f8731a - 1;
                cVar2.f8731a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8727c);
                    return;
                }
                return;
        }
    }
}
