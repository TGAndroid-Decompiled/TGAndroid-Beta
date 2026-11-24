package defpackage;
public final class q8b implements Runnable {
    public final byte a;
    public final v9b b;

    public q8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.c(false);
                v9bVar.n2 = null;
                return;
            default:
                v9bVar.getClass();
                v9bVar.d(1.0f, true, new f8b(v9bVar, (byte) 27));
                v9bVar.c1.b(true, true);
                return;
        }
    }
}
