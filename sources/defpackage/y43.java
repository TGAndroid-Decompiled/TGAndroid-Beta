package defpackage;
public final class y43 implements Runnable {
    public final byte a;
    public final e53 b;

    public y43(e53 e53Var, byte b) {
        this.a = b;
        this.b = e53Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e53 e53Var = this.b;
        switch (b) {
            case 0:
                e53Var.a.invalidate();
                return;
            default:
                tt ttVar = e53Var.c;
                if (ttVar.getParent() != null) {
                    if (e53Var.d) {
                        hl.B2(ttVar);
                    } else {
                        try {
                            e53Var.b.removeView(ttVar);
                        } catch (Exception unused) {
                        }
                    }
                    uk8 uk8Var = e53Var.p;
                    if (uk8Var != null) {
                        uk8Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
