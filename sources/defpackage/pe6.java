package defpackage;

import java.util.TimerTask;
public final class pe6 extends TimerTask {
    public final byte a;
    public final qe6 b;

    public pe6(qe6 qe6Var, byte b) {
        this.a = b;
        this.b = qe6Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                gl.c3(new tp5(this, (byte) 23));
                return;
            default:
                if (this.b.U != null) {
                    gl.c3(new tp5(this, (byte) 24));
                    return;
                }
                return;
        }
    }
}
