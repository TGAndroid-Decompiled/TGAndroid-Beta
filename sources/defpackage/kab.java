package defpackage;
public final class kab implements Runnable {
    public final byte a;
    public final rbb b;
    public final boolean c;

    public kab(rbb rbbVar, boolean z, byte b) {
        this.a = b;
        this.b = rbbVar;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbbVar.c(z);
                return;
            case 1:
                if (!z) {
                    rbbVar.K0.b(false, false);
                    return;
                }
                return;
            default:
                rbbVar.S = null;
                rbbVar.e = false;
                rbbVar.o(z);
                return;
        }
    }
}
