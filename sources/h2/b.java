package h2;
public final class b implements Runnable {
    public final int f14048a;
    public final c f14049b;
    public final Object f14050c;

    public b(c cVar, Object obj, int i7) {
        this.f14048a = i7;
        this.f14049b = cVar;
        this.f14050c = obj;
    }

    @Override
    public final void run() {
        switch (this.f14048a) {
            case 0:
                c cVar = this.f14049b;
                if (cVar.f14057a == 0) {
                    cVar.G(this.f14050c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f14049b;
                int i7 = cVar2.f14057a - 1;
                cVar2.f14057a = i7;
                if (i7 == 0) {
                    cVar2.G(this.f14050c);
                    return;
                }
                return;
        }
    }
}
