package h2;
public final class b implements Runnable {
    public final int f13408a;
    public final c f13409b;
    public final Object f13410c;

    public b(c cVar, Object obj, int i7) {
        this.f13408a = i7;
        this.f13409b = cVar;
        this.f13410c = obj;
    }

    @Override
    public final void run() {
        switch (this.f13408a) {
            case 0:
                c cVar = this.f13409b;
                if (cVar.f13417a == 0) {
                    cVar.G(this.f13410c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f13409b;
                int i7 = cVar2.f13417a - 1;
                cVar2.f13417a = i7;
                if (i7 == 0) {
                    cVar2.G(this.f13410c);
                    return;
                }
                return;
        }
    }
}
