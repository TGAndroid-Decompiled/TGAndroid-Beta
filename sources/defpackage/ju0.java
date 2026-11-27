package defpackage;
public final class ju0 implements Runnable {
    public final byte a;
    public final rv0 b;
    public final String c;

    public ju0(rv0 rv0Var, String str, byte b) {
        this.a = b;
        this.b = rv0Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        rv0 rv0Var = this.b;
        switch (b) {
            case 0:
                nv0 nv0Var = rv0Var.a;
                if (nv0Var != null) {
                    nv0Var.c(str);
                    return;
                }
                return;
            default:
                rv0Var.O = false;
                rv0Var.Q = 0L;
                rv0Var.U = false;
                rv0Var.b = str;
                rv0Var.a();
                nv0 nv0Var2 = rv0Var.a;
                if (nv0Var2 != null) {
                    nv0Var2.onResume();
                    rv0Var.a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
