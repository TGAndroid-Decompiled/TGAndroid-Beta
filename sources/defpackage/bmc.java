package defpackage;
public final class bmc implements Runnable {
    public final byte a;
    public final cmc b;

    public bmc(cmc cmcVar, byte b) {
        this.a = b;
        this.b = cmcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cmc cmcVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new bmc(cmcVar, (byte) 1));
                return;
            default:
                cmcVar.a();
                return;
        }
    }
}
