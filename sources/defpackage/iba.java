package defpackage;
public final class iba implements Runnable {
    public final byte a;
    public final uba b;

    public iba(uba ubaVar, byte b) {
        this.a = b;
        this.b = ubaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uba ubaVar = this.b;
        switch (b) {
            case 0:
                ubaVar.b0();
                return;
            case 1:
                m01.u(ubaVar.getParentActivity(), ob6.M0(2131752119, null));
                return;
            default:
                ubaVar.c.g3.O(true);
                return;
        }
    }
}
