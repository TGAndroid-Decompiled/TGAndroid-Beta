package defpackage;
public final class xqc implements Runnable {
    public final byte a;
    public final zqc b;

    public xqc(zqc zqcVar, byte b) {
        this.a = b;
        this.b = zqcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zqc zqcVar = this.b;
        switch (b) {
            case 0:
                zqcVar.performClick();
                return;
            default:
                zqcVar.h.invalidate();
                zqcVar.n.invalidate();
                zqcVar.e.invalidate();
                return;
        }
    }
}
