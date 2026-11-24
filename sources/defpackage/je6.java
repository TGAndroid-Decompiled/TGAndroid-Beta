package defpackage;
public final class je6 implements Runnable {
    public final byte a;
    public final qe6 b;
    public final int c;

    public je6(qe6 qe6Var, int i, byte b) {
        this.a = b;
        this.b = qe6Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        qe6 qe6Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new je6(qe6Var, i, (byte) 1));
                return;
            case 1:
                qe6Var.z(i);
                return;
            default:
                qe6Var.f.f[i].D(1.0f);
                return;
        }
    }
}
