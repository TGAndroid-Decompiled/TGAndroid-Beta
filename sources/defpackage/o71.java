package defpackage;
public final class o71 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final su c;
    public final long[] d;
    public final p71 e;

    public o71(boolean[] zArr, su suVar, long[] jArr, p71 p71Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = suVar;
        this.d = jArr;
        this.e = p71Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                gm.c3(new o71(this.b, this.c, this.d, this.e, (byte) 1));
                return;
            default:
                this.b[0] = true;
                this.c.e(1.0f);
                long[] jArr = this.d;
                int i = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                p71 p71Var = this.e;
                if (i > 0) {
                    gm.d3(new yt0(p71Var, (byte) 14), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    p71Var.dismiss();
                    return;
                }
        }
    }
}
