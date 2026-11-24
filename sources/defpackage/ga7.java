package defpackage;
public final class ga7 implements Runnable {
    public final byte a;
    public final gu2 b;
    public final int c;

    public ga7(gu2 gu2Var, int i, byte b) {
        this.a = b;
        this.b = gu2Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        gu2 gu2Var = this.b;
        switch (b) {
            case 0:
                gu2Var.accept(Integer.valueOf(i));
                return;
            default:
                gu2Var.accept(Integer.valueOf(i));
                return;
        }
    }
}
