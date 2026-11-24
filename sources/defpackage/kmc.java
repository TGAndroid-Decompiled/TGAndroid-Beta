package defpackage;
public final class kmc implements Runnable {
    public final byte a;
    public final mmc b;

    public kmc(mmc mmcVar, byte b) {
        this.a = b;
        this.b = mmcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mmc mmcVar = this.b;
        switch (b) {
            case 0:
                mmcVar.performClick();
                return;
            default:
                mmcVar.h.invalidate();
                mmcVar.n.invalidate();
                mmcVar.e.invalidate();
                return;
        }
    }
}
