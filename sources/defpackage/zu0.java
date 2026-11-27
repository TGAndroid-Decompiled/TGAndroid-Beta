package defpackage;
public final class zu0 implements Runnable {
    public final byte a;
    public final av0 b;

    public zu0(av0 av0Var, byte b) {
        this.a = b;
        this.b = av0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        av0 av0Var = this.b;
        switch (b) {
            case 0:
                nv0 nv0Var = av0Var.e;
                rv0 rv0Var = nv0Var.R;
                if (rv0Var != null) {
                    nv0Var.h = false;
                    rv0Var.B(false, null);
                    return;
                }
                return;
            case 1:
                nv0 nv0Var2 = av0Var.e;
                rv0 rv0Var2 = nv0Var2.R;
                if (rv0Var2 != null) {
                    rv0Var2.G(!nv0Var2.canGoBack(), !nv0Var2.canGoForward());
                    return;
                }
                return;
            default:
                m01.u(av0Var.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
