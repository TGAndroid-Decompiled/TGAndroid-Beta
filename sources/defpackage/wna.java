package defpackage;
public final class wna implements Runnable {
    public final byte a;
    public final xna b;
    public final int c;

    public wna(xna xnaVar, int i, byte b) {
        this.a = b;
        this.b = xnaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        xna xnaVar = this.b;
        switch (b) {
            case 0:
                xnaVar.post(new wna(xnaVar, i, (byte) 1));
                return;
            default:
                if (i == xnaVar.h) {
                    xnaVar.f = false;
                    xnaVar.d = true;
                    xnaVar.b();
                    return;
                }
                return;
        }
    }
}
