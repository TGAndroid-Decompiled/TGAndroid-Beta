package defpackage;
public final class cx0 implements Runnable {
    public final byte a;
    public final ula b;

    public cx0(ula ulaVar, byte b) {
        this.a = b;
        this.b = ulaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ula ulaVar = this.b;
        switch (b) {
            case 0:
                ulaVar.a(true);
                return;
            case 1:
                ulaVar.a(true);
                return;
            case 2:
                if (!ulaVar.I && ulaVar.U) {
                    ulaVar.c();
                    return;
                }
                return;
            default:
                ulaVar.a(true);
                return;
        }
    }
}
