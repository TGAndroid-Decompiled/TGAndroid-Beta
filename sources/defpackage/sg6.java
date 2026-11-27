package defpackage;

import java.util.TimerTask;
public final class sg6 extends TimerTask {
    public final byte a;
    public final tg6 b;

    public sg6(tg6 tg6Var, byte b) {
        this.a = b;
        this.b = tg6Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                hl.c3(new z96(this, (byte) 8));
                return;
            default:
                if (this.b.U != null) {
                    hl.c3(new z96(this, (byte) 9));
                    return;
                }
                return;
        }
    }
}
