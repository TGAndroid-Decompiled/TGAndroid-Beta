package defpackage;
public final class vla implements Runnable {
    public final byte a;
    public final wla b;
    public final int c;

    public vla(wla wlaVar, int i, byte b) {
        this.a = b;
        this.b = wlaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        wla wlaVar = this.b;
        switch (b) {
            case 0:
                wlaVar.post(new vla(wlaVar, i, (byte) 1));
                return;
            default:
                if (i == wlaVar.h) {
                    wlaVar.f = false;
                    wlaVar.d = true;
                    wlaVar.b();
                    return;
                }
                return;
        }
    }
}
