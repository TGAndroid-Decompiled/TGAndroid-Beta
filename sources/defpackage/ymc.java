package defpackage;
public final class ymc implements Runnable {
    public final byte a;
    public final dnc b;
    public final int c;

    public ymc(dnc dncVar, int i, byte b) {
        this.a = b;
        this.b = dncVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        dnc dncVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new ymc(dncVar, i, (byte) 2));
                return;
            case 1:
                hl.c3(new ymc(dncVar, i, (byte) 3));
                return;
            case 2:
                dncVar.c(i);
                return;
            default:
                dncVar.a(i);
                return;
        }
    }
}
