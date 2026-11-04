package g2;
public final class b implements Runnable {
    public final int f11799a;
    public final d f11800b;
    public final Object f11801c;

    public b(d dVar, Object obj, int i3) {
        this.f11799a = i3;
        this.f11800b = dVar;
        this.f11801c = obj;
    }

    @Override
    public final void run() {
        switch (this.f11799a) {
            case 0:
                d dVar = this.f11800b;
                if (dVar.f11818a == 0) {
                    dVar.G(this.f11801c);
                    return;
                }
                return;
            default:
                d dVar2 = this.f11800b;
                int i3 = dVar2.f11818a - 1;
                dVar2.f11818a = i3;
                if (i3 == 0) {
                    dVar2.G(this.f11801c);
                    return;
                }
                return;
        }
    }
}
