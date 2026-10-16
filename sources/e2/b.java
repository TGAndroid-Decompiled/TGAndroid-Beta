package e2;
public final class b implements Runnable {
    public final int f8317a;
    public final c f8318b;
    public final Object f8319c;

    public b(c cVar, Object obj, int i10) {
        this.f8317a = i10;
        this.f8318b = cVar;
        this.f8319c = obj;
    }

    @Override
    public final void run() {
        switch (this.f8317a) {
            case 0:
                c cVar = this.f8318b;
                if (cVar.f8325a == 0) {
                    cVar.n(this.f8319c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f8318b;
                int i10 = cVar2.f8325a - 1;
                cVar2.f8325a = i10;
                if (i10 == 0) {
                    cVar2.n(this.f8319c);
                    return;
                }
                return;
        }
    }
}
