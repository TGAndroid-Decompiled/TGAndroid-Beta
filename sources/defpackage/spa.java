package defpackage;
public final class spa implements Runnable {
    public final byte a;
    public final tpa b;
    public final int c;

    public spa(tpa tpaVar, int i, byte b) {
        this.a = b;
        this.b = tpaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        tpa tpaVar = this.b;
        switch (b) {
            case 0:
                tpaVar.post(new spa(tpaVar, i, (byte) 1));
                return;
            default:
                if (i == tpaVar.h) {
                    tpaVar.f = false;
                    tpaVar.d = true;
                    tpaVar.b();
                    return;
                }
                return;
        }
    }
}
