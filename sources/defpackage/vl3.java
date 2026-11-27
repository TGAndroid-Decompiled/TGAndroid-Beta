package defpackage;
public final class vl3 implements Runnable {
    public final byte a;
    public final zl3 b;
    public final int c;

    public vl3(zl3 zl3Var, int i, byte b) {
        this.a = b;
        this.b = zl3Var;
        this.c = i;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                zl3 zl3Var = this.b;
                zl3Var.postOnAnimation(new vl3(zl3Var, this.c, (byte) 1));
                return;
            default:
                zl3 zl3Var2 = this.b;
                int i = this.c;
                if (zl3Var2.e && !zl3Var2.r && i == zl3Var2.F) {
                    zl3Var2.y = true;
                    zl3Var2.requestRender();
                    return;
                }
                return;
        }
    }
}
