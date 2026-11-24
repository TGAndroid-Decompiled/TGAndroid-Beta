package defpackage;
public final class eq8 implements Runnable {
    public final byte a;
    public final pq8 b;

    public eq8(pq8 pq8Var, byte b) {
        this.a = b;
        this.b = pq8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                pq8Var.b();
                return;
            case 1:
                pq8Var.c();
                return;
            case 2:
                pq8Var.f(false);
                return;
            default:
                pq8Var.d();
                return;
        }
    }
}
