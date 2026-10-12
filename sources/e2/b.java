package e2;
public final class b implements Runnable {
    public final int f8314a;
    public final c f8315b;
    public final Object f8316c;

    public b(c cVar, Object obj, int i10) {
        this.f8314a = i10;
        this.f8315b = cVar;
        this.f8316c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8314a) {
            case 0:
                c cVar = this.f8315b;
                if (cVar.f8322a == 0) {
                    cVar.n(this.f8316c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8315b;
                int i10 = cVar2.f8322a - 1;
                cVar2.f8322a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8316c);
                    return;
                }
                return;
        }
    }
}
