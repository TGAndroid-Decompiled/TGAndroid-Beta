package defpackage;
public final class zp5 implements Runnable {
    public final byte a;
    public final bq5 b;
    public final j18 c;

    public zp5(bq5 bq5Var, j18 j18Var, byte b) {
        this.a = b;
        this.b = bq5Var;
        this.c = j18Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        j18 j18Var = this.c;
        bq5 bq5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new zp5(bq5Var, j18Var, (byte) 1));
                return;
            default:
                bq5Var.i = j18Var.a;
                return;
        }
    }
}
