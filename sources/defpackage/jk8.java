package defpackage;
public final class jk8 implements Runnable {
    public final byte a;
    public final lk8 b;

    public jk8(lk8 lk8Var, byte b) {
        this.a = b;
        this.b = lk8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lk8 lk8Var = this.b;
        switch (b) {
            case 0:
                nk3 nk3Var = new nk3(td4.j(3, "onlySelect", "dialogsType", true));
                nk3Var.E2 = new cz6(lk8Var, "https://t.me/giftcode/" + lk8Var.M2, (byte) 25);
                lk8Var.r1.presentFragment(nk3Var);
                lk8Var.dismiss();
                return;
            default:
                yj8 yj8Var = new yj8(lk8Var.r1, z8c.t0, null, null, null, lk8Var.J0);
                yj8Var.E2 = true;
                yj8Var.F2 = true;
                yj8Var.X1 = true;
                lk8Var.r1.showDialog(yj8Var);
                return;
        }
    }
}
