package defpackage;
public final class zo9 implements Runnable {
    public final byte a;
    public final pq8 b;
    public final Exception c;

    public zo9(pq8 pq8Var, Exception exc, byte b) {
        this.a = b;
        this.b = pq8Var;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                ((jp9) pq8Var.b).h(exc);
                return;
            default:
                jp9 jp9Var = (jp9) pq8Var.b;
                jp9Var.m.a("recording segment interrupted in state=".concat(uh9.A(jp9Var.a0)), exc);
                int i = jp9Var.a0;
                if (i == 3) {
                    jp9Var.q();
                    return;
                } else if (i == 2) {
                    jp9Var.D = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
