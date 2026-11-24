package defpackage;
public final class sq3 implements Runnable {
    public final byte a;
    public final yq3 b;

    public sq3(yq3 yq3Var, byte b) {
        this.a = b;
        this.b = yq3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                yq3Var.b();
                return;
            case 1:
                yq3Var.e = false;
                vq3 vq3Var = yq3Var.s;
                if (vq3Var != null) {
                    vq3Var.a(true);
                    yq3Var.s = null;
                }
                xq3 xq3Var = yq3Var.n;
                if (xq3Var != null) {
                    xq3Var.a();
                }
                yq3Var.c = false;
                yq3Var.d();
                return;
            default:
                if (yq3Var.c && yq3Var.r != null) {
                    yq3Var.n.b(2131624012, 3500, jb6.N0("VideoConvertFail"));
                    yq3Var.c = false;
                    yq3Var.d();
                    return;
                }
                return;
        }
    }
}
