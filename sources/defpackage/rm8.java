package defpackage;
public final class rm8 implements Runnable {
    public final byte a;
    public final wm8 b;

    public rm8(wm8 wm8Var, byte b) {
        this.a = b;
        this.b = wm8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wm8 wm8Var = this.b;
        switch (b) {
            case 0:
                dk2 dk2Var = wm8Var.h;
                if (dk2Var != null) {
                    dk2Var.close();
                    return;
                }
                return;
            default:
                wm8Var.a();
                return;
        }
    }
}
