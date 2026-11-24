package defpackage;
public final class rj0 implements Runnable {
    public final byte a;
    public final ak0 b;

    public rj0(ak0 ak0Var, byte b) {
        this.a = b;
        this.b = ak0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ak0 ak0Var = this.b;
        switch (b) {
            case 0:
                lk0 lk0Var = ak0Var.m0;
                dqd dqdVar = lk0Var.c;
                dqd dqdVar2 = dqdVar;
                if (dqdVar == null) {
                    ?? obj = new Object();
                    lk0Var.c = obj;
                    dqdVar2 = obj;
                }
                dqdVar2.b();
                return;
            default:
                ak0Var.m0.u = false;
                return;
        }
    }
}
