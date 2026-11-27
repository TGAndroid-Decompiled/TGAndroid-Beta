package defpackage;
public final class jj8 implements Runnable {
    public final byte a;
    public final mj8 b;

    public jj8(mj8 mj8Var, byte b) {
        this.a = b;
        this.b = mj8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mj8 mj8Var = this.b;
        switch (b) {
            case 0:
                mj8Var.a(true);
                return;
            default:
                mj8Var.d();
                return;
        }
    }
}
