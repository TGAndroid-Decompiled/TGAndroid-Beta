package defpackage;

import java.util.TimerTask;
public final class sz7 extends TimerTask {
    public final tz7 a;

    public sz7(tz7 tz7Var) {
        this.a = tz7Var;
    }

    @Override
    public final void run() {
        tz7 tz7Var = this.a;
        if (tz7Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        tz7Var.E = (int) (tz7Var.E - (currentTimeMillis - tz7Var.G));
        tz7Var.G = currentTimeMillis;
        gm.c3(new kl7(this, (byte) 17));
    }
}
