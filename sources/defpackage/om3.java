package defpackage;
public final class om3 implements Runnable {
    public final byte a;
    public final sm3 b;
    public final int c;

    public om3(sm3 sm3Var, int i, byte b) {
        this.a = b;
        this.b = sm3Var;
        this.c = i;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                sm3 sm3Var = this.b;
                sm3Var.postOnAnimation(new om3(sm3Var, this.c, (byte) 1));
                return;
            default:
                sm3 sm3Var2 = this.b;
                int i = this.c;
                if (sm3Var2.e && !sm3Var2.r && i == sm3Var2.F) {
                    sm3Var2.y = true;
                    sm3Var2.requestRender();
                    return;
                }
                return;
        }
    }
}
