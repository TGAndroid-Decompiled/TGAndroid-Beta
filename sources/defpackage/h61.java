package defpackage;
public final class h61 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final st c;
    public final long[] d;
    public final i61 e;

    public h61(boolean[] zArr, st stVar, long[] jArr, i61 i61Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = stVar;
        this.d = jArr;
        this.e = i61Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                gl.d3(new h61(this.b, this.c, this.d, this.e, (byte) 1));
                return;
            default:
                this.b[0] = true;
                this.c.e(1.0f);
                long[] jArr = this.d;
                int i = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                i61 i61Var = this.e;
                if (i > 0) {
                    gl.e3(new nv0(i61Var, (byte) 11), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    i61Var.dismiss();
                    return;
                }
        }
    }
}
