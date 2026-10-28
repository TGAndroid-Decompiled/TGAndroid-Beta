package e2;
public final class b implements Runnable {
    public final int f9628a;
    public final c f9629b;
    public final Object f9630c;

    public b(c cVar, Object obj, int i10) {
        this.f9628a = i10;
        this.f9629b = cVar;
        this.f9630c = obj;
    }

    @Override
    public final void run() {
        switch (this.f9628a) {
            case 0:
                c cVar = this.f9629b;
                if (cVar.f9636a == 0) {
                    cVar.n(this.f9630c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f9629b;
                int i10 = cVar2.f9636a - 1;
                cVar2.f9636a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f9630c);
                    return;
                }
                return;
        }
    }
}
