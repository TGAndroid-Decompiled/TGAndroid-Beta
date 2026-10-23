package e2;
public final class b implements Runnable {
    public final int f8201a;
    public final c f8202b;
    public final Object f8203c;

    public b(c cVar, Object obj, int i10) {
        this.f8201a = i10;
        this.f8202b = cVar;
        this.f8203c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8201a) {
            case 0:
                c cVar = this.f8202b;
                if (cVar.f8209a == 0) {
                    cVar.n(this.f8203c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8202b;
                int i10 = cVar2.f8209a - 1;
                cVar2.f8209a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8203c);
                    return;
                }
                return;
        }
    }
}
