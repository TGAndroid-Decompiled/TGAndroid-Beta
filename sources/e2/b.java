package e2;
public final class b implements Runnable {
    public final int f6108a;
    public final c f6109b;
    public final Object f6110c;

    public b(c cVar, Object obj, int i10) {
        this.f6108a = i10;
        this.f6109b = cVar;
        this.f6110c = obj;
    }

    @Override
    public final void run() {
        switch (this.f6108a) {
            case 0:
                c cVar = this.f6109b;
                if (cVar.f6116a == 0) {
                    cVar.t(this.f6110c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f6109b;
                int i10 = cVar2.f6116a - 1;
                cVar2.f6116a = i10;
                if (i10 == 0) {
                    cVar2.t(this.f6110c);
                    return;
                }
                return;
        }
    }
}
