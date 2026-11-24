package defpackage;
public final class lz9 implements Runnable {
    public final byte a;
    public final mz9 b;

    public lz9(mz9 mz9Var, byte b) {
        this.a = b;
        this.b = mz9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mz9 mz9Var = this.b;
        switch (b) {
            case 0:
                mz9Var.b();
                return;
            default:
                mz9Var.dismiss();
                return;
        }
    }
}
