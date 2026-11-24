package defpackage;
public final class lt4 implements Runnable {
    public final byte a;
    public final nt4 b;

    public lt4(nt4 nt4Var, byte b) {
        this.a = b;
        this.b = nt4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nt4 nt4Var = this.b;
        switch (b) {
            case 0:
                nt4Var.E();
                return;
            default:
                cj3 cj3Var = new cj3(tb4.j(3, "onlySelect", "dialogsType", true));
                cj3Var.E2 = new v82(nt4Var, "https://t.me/giftcode/" + nt4Var.h, (byte) 29);
                nt4Var.e.presentFragment(cj3Var);
                ((ot4) nt4Var).r.dismiss();
                return;
        }
    }
}
