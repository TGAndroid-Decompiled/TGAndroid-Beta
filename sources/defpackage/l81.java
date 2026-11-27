package defpackage;
public final class l81 implements Runnable {
    public final byte a;
    public final i91 b;

    public l81(i91 i91Var, byte b) {
        this.a = b;
        this.b = i91Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        i91 i91Var = this.b;
        switch (b) {
            case 0:
                i91Var.k0(false);
                return;
            default:
                i91Var.b0();
                return;
        }
    }
}
