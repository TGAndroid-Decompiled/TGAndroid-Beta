package e2;
public final class b implements Runnable {
    public final int f7859a;
    public final c f7860b;
    public final Object f7861c;

    public b(c cVar, Object obj, int i10) {
        this.f7859a = i10;
        this.f7860b = cVar;
        this.f7861c = obj;
    }

    @Override
    public final void run() {
        switch (this.f7859a) {
            case 0:
                c cVar = this.f7860b;
                if (cVar.f7865a == 0) {
                    cVar.n(this.f7861c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f7860b;
                int i10 = cVar2.f7865a - 1;
                cVar2.f7865a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f7861c);
                    return;
                }
                return;
        }
    }
}
