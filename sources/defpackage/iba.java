package defpackage;
public final class iba implements Runnable {
    public final byte a;
    public final tba b;

    public iba(tba tbaVar, byte b) {
        this.a = b;
        this.b = tbaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tba tbaVar = this.b;
        switch (b) {
            case 0:
                tbaVar.b0();
                return;
            case 1:
                m01.u(tbaVar.getParentActivity(), ob6.M0(2131752119, null));
                return;
            default:
                tbaVar.c.g3.O(true);
                return;
        }
    }
}
