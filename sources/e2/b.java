package e2;
public final class b implements Runnable {
    public final int f7874a;
    public final c f7875b;
    public final Object f7876c;

    public b(c cVar, Object obj, int i10) {
        this.f7874a = i10;
        this.f7875b = cVar;
        this.f7876c = obj;
    }

    @Override
    public final void run() {
        switch (this.f7874a) {
            case 0:
                c cVar = this.f7875b;
                if (cVar.f7880a == 0) {
                    cVar.n(this.f7876c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f7875b;
                int i10 = cVar2.f7880a - 1;
                cVar2.f7880a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f7876c);
                    return;
                }
                return;
        }
    }
}
