package h2;
public final class b implements Runnable {
    public final int f13720a;
    public final c f13721b;
    public final Object f13722c;

    public b(c cVar, Object obj, int i7) {
        this.f13720a = i7;
        this.f13721b = cVar;
        this.f13722c = obj;
    }

    @Override
    public final void run() {
        switch (this.f13720a) {
            case 0:
                c cVar = this.f13721b;
                if (cVar.f13729a == 0) {
                    cVar.G(this.f13722c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f13721b;
                int i7 = cVar2.f13729a - 1;
                cVar2.f13729a = i7;
                if (i7 == 0) {
                    cVar2.G(this.f13722c);
                    return;
                }
                return;
        }
    }
}
