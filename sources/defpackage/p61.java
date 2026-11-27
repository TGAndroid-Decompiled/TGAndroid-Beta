package defpackage;
public final class p61 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final tt c;
    public final long[] d;
    public final q61 e;

    public p61(boolean[] zArr, tt ttVar, long[] jArr, q61 q61Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = ttVar;
        this.d = jArr;
        this.e = q61Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                hl.c3(new p61(this.b, this.c, this.d, this.e, (byte) 1));
                return;
            default:
                this.b[0] = true;
                this.c.e(1.0f);
                long[] jArr = this.d;
                int i = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                q61 q61Var = this.e;
                if (i > 0) {
                    hl.d3(new fv0(q61Var, (byte) 13), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    q61Var.dismiss();
                    return;
                }
        }
    }
}
