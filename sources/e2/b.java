package e2;
public final class b implements Runnable {
    public final int f8197a;
    public final c f8198b;
    public final Object f8199c;

    public b(c cVar, Object obj, int i10) {
        this.f8197a = i10;
        this.f8198b = cVar;
        this.f8199c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8197a) {
            case 0:
                c cVar = this.f8198b;
                if (cVar.f8205a == 0) {
                    cVar.n(this.f8199c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8198b;
                int i10 = cVar2.f8205a - 1;
                cVar2.f8205a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8199c);
                    return;
                }
                return;
        }
    }
}
