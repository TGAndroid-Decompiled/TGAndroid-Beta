package defpackage;
public final class y35 implements Runnable {
    public final byte a;
    public final v35 b;
    public final String c;

    public y35(v35 v35Var, String str, byte b) {
        this.a = b;
        this.b = v35Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        v35 v35Var = this.b;
        switch (b) {
            case 0:
                v35Var.a(str);
                return;
            default:
                v35Var.a(str);
                return;
        }
    }
}
