package defpackage;

import java.util.TimerTask;
public final class qx7 extends TimerTask {
    public final rx7 a;

    public qx7(rx7 rx7Var) {
        this.a = rx7Var;
    }

    @Override
    public final void run() {
        rx7 rx7Var = this.a;
        if (rx7Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        rx7Var.E = (int) (rx7Var.E - (currentTimeMillis - rx7Var.G));
        rx7Var.G = currentTimeMillis;
        gl.d3(new oq7(this, (byte) 10));
    }
}
