package e2;
public final class b implements Runnable {
    public final int f8526a;
    public final c f8527b;
    public final Object f8528c;

    public b(c cVar, Object obj, int i10) {
        this.f8526a = i10;
        this.f8527b = cVar;
        this.f8528c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8526a) {
            case 0:
                c cVar = this.f8527b;
                if (cVar.f8532a == 0) {
                    cVar.n(this.f8528c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8527b;
                int i10 = cVar2.f8532a - 1;
                cVar2.f8532a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8528c);
                    return;
                }
                return;
        }
    }
}
