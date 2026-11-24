package defpackage;
public final class q25 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final s25 c;
    public final ki7 d;

    public q25(boolean[] zArr, s25 s25Var, ki7 ki7Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = s25Var;
        this.d = ki7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ki7 ki7Var = this.d;
        s25 s25Var = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    if (s25Var.m) {
                        gl.e3(this, 1000L);
                        return;
                    } else {
                        ki7Var.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!zArr[0]) {
                    if (s25Var.m) {
                        gl.e3(this, 1000L);
                        return;
                    } else {
                        ki7Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
