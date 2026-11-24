package defpackage;
public final class zn0 implements Runnable {
    public final byte a;
    public final do0 b;

    public zn0(do0 do0Var, byte b) {
        this.a = b;
        this.b = do0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        do0 do0Var = this.b;
        switch (b) {
            case 0:
                do0Var.dismiss();
                return;
            default:
                do0Var.onBackPressed();
                return;
        }
    }
}
