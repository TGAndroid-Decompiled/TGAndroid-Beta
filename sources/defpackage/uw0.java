package defpackage;
public final class uw0 implements Runnable {
    public final byte a;
    public final zha b;

    public uw0(zha zhaVar, byte b) {
        this.a = b;
        this.b = zhaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zha zhaVar = this.b;
        switch (b) {
            case 0:
                zhaVar.a(true);
                return;
            case 1:
                zhaVar.a(true);
                return;
            case 2:
                if (!zhaVar.I && zhaVar.U) {
                    zhaVar.c();
                    return;
                }
                return;
            default:
                zhaVar.a(true);
                return;
        }
    }
}
