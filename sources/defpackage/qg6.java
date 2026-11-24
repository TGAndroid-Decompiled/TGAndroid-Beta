package defpackage;

import java.util.TimerTask;
public final class qg6 extends TimerTask {
    public final byte a;
    public final rg6 b;

    public qg6(rg6 rg6Var, byte b) {
        this.a = b;
        this.b = rg6Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                gm.c3(new pg6(this, (byte) 0));
                return;
            default:
                if (this.b.U != null) {
                    gm.c3(new pg6(this, (byte) 1));
                    return;
                }
                return;
        }
    }
}
