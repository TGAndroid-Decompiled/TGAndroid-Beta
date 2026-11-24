package defpackage;
public final class p28 implements Runnable {
    public final byte a;
    public final y5b b;

    public p28(y5b y5bVar, byte b) {
        this.a = b;
        this.b = y5bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        y5b y5bVar = this.b;
        switch (b) {
            case 0:
                y5bVar.dismiss();
                return;
            case 1:
                y5bVar.dismiss();
                return;
            default:
                y5bVar.onBackPressed();
                return;
        }
    }
}
