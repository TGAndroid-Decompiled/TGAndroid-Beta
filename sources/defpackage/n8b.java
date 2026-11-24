package defpackage;
public final class n8b implements Runnable {
    public final byte a;
    public final v9b b;
    public final boolean c;

    public n8b(v9b v9bVar, boolean z, byte b) {
        this.a = b;
        this.b = v9bVar;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.c(z);
                return;
            case 1:
                if (!z) {
                    v9bVar.K0.b(false, false);
                    return;
                }
                return;
            default:
                v9bVar.S = null;
                v9bVar.e = false;
                v9bVar.o(z);
                return;
        }
    }
}
