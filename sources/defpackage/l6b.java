package defpackage;
public final class l6b implements Runnable {
    public final byte a;
    public final t7b b;
    public final boolean c;

    public l6b(t7b t7bVar, boolean z, byte b) {
        this.a = b;
        this.b = t7bVar;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.c(z);
                return;
            case 1:
                if (!z) {
                    t7bVar.K0.b(false, false);
                    return;
                }
                return;
            default:
                t7bVar.S = null;
                t7bVar.e = false;
                t7bVar.o(z);
                return;
        }
    }
}
