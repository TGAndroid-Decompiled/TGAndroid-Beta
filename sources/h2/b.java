package h2;
public final class b implements Runnable {
    public final int f13715a;
    public final c f13716b;
    public final Object f13717c;

    public b(c cVar, Object obj, int i7) {
        this.f13715a = i7;
        this.f13716b = cVar;
        this.f13717c = obj;
    }

    @Override
    public final void run() {
        switch (this.f13715a) {
            case 0:
                c cVar = this.f13716b;
                if (cVar.f13724a == 0) {
                    cVar.G(this.f13717c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f13716b;
                int i7 = cVar2.f13724a - 1;
                cVar2.f13724a = i7;
                if (i7 == 0) {
                    cVar2.G(this.f13717c);
                    return;
                }
                return;
        }
    }
}
