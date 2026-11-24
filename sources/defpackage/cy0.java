package defpackage;
public final class cy0 implements Runnable {
    public final byte a;
    public final bka b;

    public cy0(bka bkaVar, byte b) {
        this.a = b;
        this.b = bkaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bka bkaVar = this.b;
        switch (b) {
            case 0:
                bkaVar.a(true);
                return;
            case 1:
                bkaVar.a(true);
                return;
            case 2:
                if (!bkaVar.I && bkaVar.U) {
                    bkaVar.c();
                    return;
                }
                return;
            default:
                bkaVar.a(true);
                return;
        }
    }
}
