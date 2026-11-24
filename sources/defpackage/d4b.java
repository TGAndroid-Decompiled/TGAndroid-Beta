package defpackage;
public final class d4b implements Runnable {
    public final byte a;
    public final g4b b;

    public d4b(g4b g4bVar, byte b) {
        this.a = b;
        this.b = g4bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        g4b g4bVar = this.b;
        switch (b) {
            case 0:
                g4bVar.e();
                return;
            default:
                g4bVar.b();
                return;
        }
    }
}
