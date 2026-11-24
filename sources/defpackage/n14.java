package defpackage;
public final class n14 implements Runnable {
    public final byte a;
    public final float b;
    public final int c;
    public final Object d;

    public n14(Object obj, float f, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        float f = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                e34 e34Var = ((o14) obj).G;
                try {
                    w46 w46Var = new w46(e34Var.Q.getContext(), 0, f);
                    w46Var.a = i;
                    e34Var.R.v0(w46Var);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                vz9 vz9Var = (vz9) obj;
                try {
                    w46 w46Var2 = new w46(vz9Var.i0.getContext(), 0, f);
                    w46Var2.a = i;
                    vz9Var.s0.v0(w46Var2);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
