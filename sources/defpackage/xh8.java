package defpackage;
public final class xh8 implements Runnable {
    public final byte a;
    public final ai8 b;

    public xh8(ai8 ai8Var, byte b) {
        this.a = b;
        this.b = ai8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ai8 ai8Var = this.b;
        switch (b) {
            case 0:
                ai8Var.a(true);
                return;
            default:
                ai8Var.d();
                return;
        }
    }
}
