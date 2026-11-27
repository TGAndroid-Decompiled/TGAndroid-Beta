package defpackage;
public final class u0c implements Runnable {
    public final byte a;
    public final l1c b;

    public u0c(l1c l1cVar, byte b) {
        this.a = b;
        this.b = l1cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        l1c l1cVar = this.b;
        switch (b) {
            case 0:
                if (l1cVar.i()) {
                    l1cVar.j();
                    return;
                }
                return;
            default:
                b1c b1cVar = l1cVar.K;
                b1cVar.A1(true);
                z0c z0cVar = l1cVar.y;
                z0cVar.A1(true);
                l1cVar.N.a(true, true);
                hl.V3(z0cVar);
                hl.V3(b1cVar);
                return;
        }
    }
}
