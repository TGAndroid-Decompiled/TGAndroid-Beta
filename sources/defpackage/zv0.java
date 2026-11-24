package defpackage;
public final class zv0 implements Runnable {
    public final byte a;
    public final aw0 b;

    public zv0(aw0 aw0Var, byte b) {
        this.a = b;
        this.b = aw0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        aw0 aw0Var = this.b;
        switch (b) {
            case 0:
                mw0 mw0Var = aw0Var.e;
                qw0 qw0Var = mw0Var.R;
                if (qw0Var != null) {
                    mw0Var.h = false;
                    qw0Var.B(false, null);
                    return;
                }
                return;
            case 1:
                mw0 mw0Var2 = aw0Var.e;
                qw0 qw0Var2 = mw0Var2.R;
                if (qw0Var2 != null) {
                    qw0Var2.G(!mw0Var2.canGoBack(), !mw0Var2.canGoForward());
                    return;
                }
                return;
            default:
                l11.u(aw0Var.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
