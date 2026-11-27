package defpackage;
public final class si0 implements Runnable {
    public final byte a;
    public final bj0 b;

    public si0(bj0 bj0Var, byte b) {
        this.a = b;
        this.b = bj0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bj0 bj0Var = this.b;
        switch (b) {
            case 0:
                mj0 mj0Var = bj0Var.m0;
                rsd rsdVar = mj0Var.c;
                rsd rsdVar2 = rsdVar;
                if (rsdVar == null) {
                    ?? obj = new Object();
                    mj0Var.c = obj;
                    rsdVar2 = obj;
                }
                rsdVar2.b();
                return;
            default:
                bj0Var.m0.u = false;
                return;
        }
    }
}
