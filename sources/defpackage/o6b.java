package defpackage;
public final class o6b implements Runnable {
    public final byte a;
    public final t7b b;

    public o6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.c(false);
                t7bVar.n2 = null;
                return;
            default:
                t7bVar.getClass();
                t7bVar.d(1.0f, true, new d6b(t7bVar, (byte) 27));
                t7bVar.c1.b(true, true);
                return;
        }
    }
}
