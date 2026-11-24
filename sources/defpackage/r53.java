package defpackage;
public final class r53 implements Runnable {
    public final byte a;
    public final x53 b;

    public r53(x53 x53Var, byte b) {
        this.a = b;
        this.b = x53Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        x53 x53Var = this.b;
        switch (b) {
            case 0:
                x53Var.a.invalidate();
                return;
            default:
                su suVar = x53Var.c;
                if (suVar.getParent() != null) {
                    if (x53Var.d) {
                        gm.B2(suVar);
                    } else {
                        try {
                            x53Var.b.removeView(suVar);
                        } catch (Exception unused) {
                        }
                    }
                    pp8 pp8Var = x53Var.p;
                    if (pp8Var != null) {
                        pp8Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
