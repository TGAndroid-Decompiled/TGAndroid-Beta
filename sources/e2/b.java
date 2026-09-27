package e2;
public final class b implements Runnable {
    public final int f7861a;
    public final c f7862b;
    public final Object f7863c;

    public b(c cVar, Object obj, int i10) {
        this.f7861a = i10;
        this.f7862b = cVar;
        this.f7863c = obj;
    }

    @Override
    public final void run() {
        switch (this.f7861a) {
            case 0:
                c cVar = this.f7862b;
                if (cVar.f7867a == 0) {
                    cVar.n(this.f7863c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f7862b;
                int i10 = cVar2.f7867a - 1;
                cVar2.f7867a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f7863c);
                    return;
                }
                return;
        }
    }
}
