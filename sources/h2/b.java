package h2;
public final class b implements Runnable {
    public final int f13749a;
    public final c f13750b;
    public final Object f13751c;

    public b(c cVar, Object obj, int i7) {
        this.f13749a = i7;
        this.f13750b = cVar;
        this.f13751c = obj;
    }

    @Override
    public final void run() {
        switch (this.f13749a) {
            case 0:
                c cVar = this.f13750b;
                if (cVar.f13758a == 0) {
                    cVar.G(this.f13751c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f13750b;
                int i7 = cVar2.f13758a - 1;
                cVar2.f13758a = i7;
                if (i7 == 0) {
                    cVar2.G(this.f13751c);
                    return;
                }
                return;
        }
    }
}
