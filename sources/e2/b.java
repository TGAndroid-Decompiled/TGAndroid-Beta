package e2;
public final class b implements Runnable {
    public final int f8525a;
    public final c f8526b;
    public final Object f8527c;

    public b(c cVar, Object obj, int i10) {
        this.f8525a = i10;
        this.f8526b = cVar;
        this.f8527c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8525a) {
            case 0:
                c cVar = this.f8526b;
                if (cVar.f8531a == 0) {
                    cVar.n(this.f8527c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8526b;
                int i10 = cVar2.f8531a - 1;
                cVar2.f8531a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8527c);
                    return;
                }
                return;
        }
    }
}
