package e2;
public final class b implements Runnable {
    public final int f7876a;
    public final c f7877b;
    public final Object f7878c;

    public b(c cVar, Object obj, int i10) {
        this.f7876a = i10;
        this.f7877b = cVar;
        this.f7878c = obj;
    }

    @Override
    public final void run() {
        switch (this.f7876a) {
            case 0:
                c cVar = this.f7877b;
                if (cVar.f7882a == 0) {
                    cVar.n(this.f7878c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f7877b;
                int i10 = cVar2.f7882a - 1;
                cVar2.f7882a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f7878c);
                    return;
                }
                return;
        }
    }
}
