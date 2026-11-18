package h2;
public final class b implements Runnable {
    public final int f13723a;
    public final c f13724b;
    public final Object f13725c;

    public b(c cVar, Object obj, int i7) {
        this.f13723a = i7;
        this.f13724b = cVar;
        this.f13725c = obj;
    }

    @Override
    public final void run() {
        switch (this.f13723a) {
            case 0:
                c cVar = this.f13724b;
                if (cVar.f13732a == 0) {
                    cVar.G(this.f13725c);
                    return;
                }
                return;
            default:
                c cVar2 = this.f13724b;
                int i7 = cVar2.f13732a - 1;
                cVar2.f13732a = i7;
                if (i7 == 0) {
                    cVar2.G(this.f13725c);
                    return;
                }
                return;
        }
    }
}
