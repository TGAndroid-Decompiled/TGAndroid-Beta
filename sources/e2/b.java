package e2;
public final class b implements Runnable {
    public final int f9629a;
    public final c f9630b;
    public final Object f9631c;

    public b(c cVar, Object obj, int i10) {
        this.f9629a = i10;
        this.f9630b = cVar;
        this.f9631c = obj;
    }

    @Override
    public final void run() {
        switch (this.f9629a) {
            case 0:
                c cVar = this.f9630b;
                if (cVar.f9637a == 0) {
                    cVar.n(this.f9631c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f9630b;
                int i10 = cVar2.f9637a - 1;
                cVar2.f9637a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f9631c);
                    return;
                }
                return;
        }
    }
}
