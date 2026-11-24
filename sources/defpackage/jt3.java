package defpackage;
public final class jt3 implements Runnable {
    public final byte a;
    public final lt3 b;

    public jt3(lt3 lt3Var, byte b) {
        this.a = b;
        this.b = lt3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lt3 lt3Var = this.b;
        switch (b) {
            case 0:
                lt3Var.post(new jt3(lt3Var, (byte) 1));
                return;
            default:
                lt3Var.h();
                lt3Var.d();
                return;
        }
    }
}
