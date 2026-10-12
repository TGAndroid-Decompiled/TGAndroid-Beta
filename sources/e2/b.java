package e2;
public final class b implements Runnable {
    public final int f8517a;
    public final c f8518b;
    public final Object f8519c;

    public b(c cVar, Object obj, int i10) {
        this.f8517a = i10;
        this.f8518b = cVar;
        this.f8519c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8517a) {
            case 0:
                c cVar = this.f8518b;
                if (cVar.f8523a == 0) {
                    cVar.n(this.f8519c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8518b;
                int i10 = cVar2.f8523a - 1;
                cVar2.f8523a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8519c);
                    return;
                }
                return;
        }
    }
}
