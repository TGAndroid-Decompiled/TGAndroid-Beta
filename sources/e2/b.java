package e2;
public final class b implements Runnable {
    public final int f8195a;
    public final c f8196b;
    public final Object f8197c;

    public b(c cVar, Object obj, int i10) {
        this.f8195a = i10;
        this.f8196b = cVar;
        this.f8197c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8195a) {
            case 0:
                c cVar = this.f8196b;
                if (cVar.f8203a == 0) {
                    cVar.n(this.f8197c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8196b;
                int i10 = cVar2.f8203a - 1;
                cVar2.f8203a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8197c);
                    return;
                }
                return;
        }
    }
}
