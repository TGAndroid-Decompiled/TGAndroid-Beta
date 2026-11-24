package defpackage;
public final class f87 implements Runnable {
    public final byte a;
    public final vs2 b;
    public final int c;

    public f87(vs2 vs2Var, int i, byte b) {
        this.a = b;
        this.b = vs2Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        vs2 vs2Var = this.b;
        switch (b) {
            case 0:
                vs2Var.accept(Integer.valueOf(i));
                return;
            default:
                vs2Var.accept(Integer.valueOf(i));
                return;
        }
    }
}
