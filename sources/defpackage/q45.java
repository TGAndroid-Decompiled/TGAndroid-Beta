package defpackage;
public final class q45 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final s45 c;
    public final mk7 d;

    public q45(boolean[] zArr, s45 s45Var, mk7 mk7Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = s45Var;
        this.d = mk7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mk7 mk7Var = this.d;
        s45 s45Var = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    if (s45Var.m) {
                        gm.d3(this, 1000L);
                        return;
                    } else {
                        mk7Var.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!zArr[0]) {
                    if (s45Var.m) {
                        gm.d3(this, 1000L);
                        return;
                    } else {
                        mk7Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
