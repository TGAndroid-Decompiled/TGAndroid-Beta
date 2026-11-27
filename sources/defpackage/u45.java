package defpackage;
public final class u45 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final w45 c;
    public final sk7 d;

    public u45(boolean[] zArr, w45 w45Var, sk7 sk7Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = w45Var;
        this.d = sk7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sk7 sk7Var = this.d;
        w45 w45Var = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    if (w45Var.m) {
                        hl.d3(this, 1000L);
                        return;
                    } else {
                        sk7Var.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!zArr[0]) {
                    if (w45Var.m) {
                        hl.d3(this, 1000L);
                        return;
                    } else {
                        sk7Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
