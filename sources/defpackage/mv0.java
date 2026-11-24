package defpackage;
public final class mv0 implements Runnable {
    public final byte a;
    public final qw0 b;
    public final String c;

    public mv0(qw0 qw0Var, String str, byte b) {
        this.a = b;
        this.b = qw0Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        qw0 qw0Var = this.b;
        switch (b) {
            case 0:
                mw0 mw0Var = qw0Var.a;
                if (mw0Var != null) {
                    mw0Var.c(str);
                    return;
                }
                return;
            default:
                qw0Var.O = false;
                qw0Var.Q = 0L;
                qw0Var.U = false;
                qw0Var.b = str;
                qw0Var.a();
                mw0 mw0Var2 = qw0Var.a;
                if (mw0Var2 != null) {
                    mw0Var2.onResume();
                    qw0Var.a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
