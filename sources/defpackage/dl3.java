package defpackage;
public final class dl3 implements Runnable {
    public final byte a;
    public final hl3 b;
    public final int c;

    public dl3(hl3 hl3Var, int i, byte b) {
        this.a = b;
        this.b = hl3Var;
        this.c = i;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                hl3 hl3Var = this.b;
                hl3Var.postOnAnimation(new dl3(hl3Var, this.c, (byte) 1));
                return;
            default:
                hl3 hl3Var2 = this.b;
                int i = this.c;
                if (hl3Var2.e && !hl3Var2.r && i == hl3Var2.F) {
                    hl3Var2.y = true;
                    hl3Var2.requestRender();
                    return;
                }
                return;
        }
    }
}
