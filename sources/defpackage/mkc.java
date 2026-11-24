package defpackage;
public final class mkc implements Runnable {
    public final byte a;
    public final rkc b;
    public final int c;

    public mkc(rkc rkcVar, int i, byte b) {
        this.a = b;
        this.b = rkcVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        rkc rkcVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new mkc(rkcVar, i, (byte) 2));
                return;
            case 1:
                gm.c3(new mkc(rkcVar, i, (byte) 3));
                return;
            case 2:
                rkcVar.c(i);
                return;
            default:
                rkcVar.a(i);
                return;
        }
    }
}
