package defpackage;
public final class mv4 implements Runnable {
    public final byte a;
    public final pv4 b;

    public mv4(pv4 pv4Var, byte b) {
        this.a = b;
        this.b = pv4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pv4 pv4Var = this.b;
        switch (b) {
            case 0:
                pv4Var.E();
                return;
            default:
                nk3 nk3Var = new nk3(td4.j(3, "onlySelect", "dialogsType", true));
                nk3Var.E2 = new nv4(pv4Var, "https://t.me/giftcode/" + pv4Var.h, (byte) 0);
                pv4Var.e.presentFragment(nk3Var);
                ((qv4) pv4Var).r.dismiss();
                return;
        }
    }
}
