package defpackage;
public final class pu0 implements Runnable {
    public final byte a;
    public final qu0 b;

    public pu0(qu0 qu0Var, byte b) {
        this.a = b;
        this.b = qu0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qu0 qu0Var = this.b;
        switch (b) {
            case 0:
                cv0 cv0Var = qu0Var.e;
                hv0 hv0Var = cv0Var.R;
                if (hv0Var != null) {
                    cv0Var.h = false;
                    hv0Var.B(false, null);
                    return;
                }
                return;
            case 1:
                cv0 cv0Var2 = qu0Var.e;
                hv0 hv0Var2 = cv0Var2.R;
                if (hv0Var2 != null) {
                    hv0Var2.G(!cv0Var2.canGoBack(), !cv0Var2.canGoForward());
                    return;
                }
                return;
            default:
                d01.t(qu0Var.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
