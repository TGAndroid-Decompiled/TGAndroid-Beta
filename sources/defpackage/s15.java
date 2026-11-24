package defpackage;
public final class s15 implements Runnable {
    public final byte a;
    public final x15 b;
    public final String c;

    public s15(x15 x15Var, String str, byte b) {
        this.a = b;
        this.b = x15Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        x15 x15Var = this.b;
        switch (b) {
            case 0:
                x15Var.a(str);
                return;
            default:
                x15Var.a(str);
                return;
        }
    }
}
