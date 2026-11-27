package defpackage;
public final class oqc implements Runnable {
    public final byte a;
    public final pqc b;

    public oqc(pqc pqcVar, byte b) {
        this.a = b;
        this.b = pqcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pqc pqcVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new oqc(pqcVar, (byte) 1));
                return;
            default:
                pqcVar.a();
                return;
        }
    }
}
