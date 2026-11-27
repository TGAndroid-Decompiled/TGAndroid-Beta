package defpackage;
public final class jd9 implements Runnable {
    public final byte a;
    public final md9 b;

    public jd9(md9 md9Var, byte b) {
        this.a = b;
        this.b = md9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        md9 md9Var = this.b;
        switch (b) {
            case 0:
                md9Var.Z0();
                return;
            default:
                md9Var.d2.O(true);
                hl.d3(new jd9(md9Var, (byte) 0), 150L);
                return;
        }
    }
}
