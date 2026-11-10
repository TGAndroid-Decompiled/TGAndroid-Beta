package h2;
public final class b implements Runnable {
    public final int f14050a;
    public final c f14051b;
    public final Object f14052c;

    public b(c cVar, Object obj, int i7) {
        this.f14050a = i7;
        this.f14051b = cVar;
        this.f14052c = obj;
    }

    @Override
    public final void run() {
        switch (this.f14050a) {
            case 0:
                c cVar = this.f14051b;
                if (cVar.f14059a == 0) {
                    cVar.G(this.f14052c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f14051b;
                int i7 = cVar2.f14059a - 1;
                cVar2.f14059a = i7;
                if (i7 == 0) {
                    cVar2.G(this.f14052c);
                    return;
                }
                return;
        }
    }
}
