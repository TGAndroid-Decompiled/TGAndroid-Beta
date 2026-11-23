package h2;
public final class b implements Runnable {
    public final int f13752a;
    public final c f13753b;
    public final Object f13754c;

    public b(c cVar, Object obj, int i7) {
        this.f13752a = i7;
        this.f13753b = cVar;
        this.f13754c = obj;
    }

    @Override
    public final void run() {
        switch (this.f13752a) {
            case 0:
                c cVar = this.f13753b;
                if (cVar.f13761a == 0) {
                    cVar.G(this.f13754c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f13753b;
                int i7 = cVar2.f13761a - 1;
                cVar2.f13761a = i7;
                if (i7 == 0) {
                    cVar2.G(this.f13754c);
                    return;
                }
                return;
        }
    }
}
