package defpackage;

import java.util.TimerTask;
public final class w08 extends TimerTask {
    public final x08 a;

    public w08(x08 x08Var) {
        this.a = x08Var;
    }

    @Override
    public final void run() {
        x08 x08Var = this.a;
        if (x08Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        x08Var.E = (int) (x08Var.E - (currentTimeMillis - x08Var.G));
        x08Var.G = currentTimeMillis;
        hl.c3(new fe7(this, (byte) 25));
    }
}
