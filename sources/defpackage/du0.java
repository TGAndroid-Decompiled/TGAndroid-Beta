package defpackage;
public final class du0 implements Runnable {
    public final byte a;
    public final hv0 b;
    public final String c;

    public du0(hv0 hv0Var, String str, byte b) {
        this.a = b;
        this.b = hv0Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        hv0 hv0Var = this.b;
        switch (b) {
            case 0:
                cv0 cv0Var = hv0Var.a;
                if (cv0Var != null) {
                    cv0Var.c(str);
                    return;
                }
                return;
            default:
                hv0Var.O = false;
                hv0Var.Q = 0L;
                hv0Var.U = false;
                hv0Var.b = str;
                hv0Var.a();
                cv0 cv0Var2 = hv0Var.a;
                if (cv0Var2 != null) {
                    cv0Var2.onResume();
                    hv0Var.a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
