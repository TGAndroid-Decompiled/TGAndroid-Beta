package defpackage;
public final class mca implements Runnable {
    public final byte a;
    public final nca b;

    public mca(nca ncaVar, byte b) {
        this.a = b;
        this.b = ncaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nca ncaVar = this.b;
        switch (b) {
            case 0:
                if (ncaVar.x) {
                    ncaVar.d();
                    return;
                }
                return;
            default:
                ncaVar.invalidateSelf();
                return;
        }
    }
}
