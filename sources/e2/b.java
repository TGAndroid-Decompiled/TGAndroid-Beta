package e2;
public final class b implements Runnable {
    public final int f7860a;
    public final c f7861b;
    public final Object f7862c;

    public b(c cVar, Object obj, int i10) {
        this.f7860a = i10;
        this.f7861b = cVar;
        this.f7862c = obj;
    }

    @Override
    public final void run() {
        switch (this.f7860a) {
            case 0:
                c cVar = this.f7861b;
                if (cVar.f7866a == 0) {
                    cVar.n(this.f7862c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f7861b;
                int i10 = cVar2.f7866a - 1;
                cVar2.f7866a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f7862c);
                    return;
                }
                return;
        }
    }
}
