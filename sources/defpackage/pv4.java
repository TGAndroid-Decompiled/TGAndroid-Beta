package defpackage;
public final class pv4 implements Runnable {
    public final byte a;
    public final rv4 b;

    public pv4(rv4 rv4Var, byte b) {
        this.a = b;
        this.b = rv4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rv4 rv4Var = this.b;
        switch (b) {
            case 0:
                rv4Var.E();
                return;
            default:
                uj3 uj3Var = new uj3(qd4.j(3, "onlySelect", "dialogsType", true));
                uj3Var.E2 = new u34(rv4Var, "https://t.me/giftcode/" + rv4Var.h, (byte) 4);
                rv4Var.e.presentFragment(uj3Var);
                ((sv4) rv4Var).r.dismiss();
                return;
        }
    }
}
