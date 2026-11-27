package defpackage;
public final class mh9 implements Runnable {
    public final byte a;
    public final pi9 b;
    public final int c;
    public final int d;

    public mh9(pi9 pi9Var, int i, int i2, byte b) {
        this.a = b;
        this.b = pi9Var;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V1(this.c, this.d);
                return;
            default:
                this.b.h4(this.c, this.d);
                return;
        }
    }
}
