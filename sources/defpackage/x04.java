package defpackage;
public final class x04 implements Runnable {
    public final byte a;
    public final float b;
    public final int c;
    public final Object d;

    public x04(Object obj, float f, int i, byte b) {
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
                o24 o24Var = ((y04) obj).G;
                try {
                    z46 z46Var = new z46(o24Var.Q.getContext(), 0, f);
                    z46Var.a = i;
                    o24Var.R.v0(z46Var);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                n1a n1aVar = (n1a) obj;
                try {
                    z46 z46Var2 = new z46(n1aVar.i0.getContext(), 0, f);
                    z46Var2.a = i;
                    n1aVar.s0.v0(z46Var2);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
