package defpackage;
public final class hh7 implements Runnable {
    public final byte a;
    public final ih7 b;

    public hh7(ih7 ih7Var, byte b) {
        this.a = b;
        this.b = ih7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ih7 ih7Var = this.b;
        switch (b) {
            case 0:
                ih7Var.x();
                return;
            default:
                ih7Var.m(true);
                return;
        }
    }
}
