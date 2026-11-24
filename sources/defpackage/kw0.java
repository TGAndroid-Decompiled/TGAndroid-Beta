package defpackage;

import android.webkit.WebView;
public final class kw0 implements WebView.FindListener {
    public final mw0 a;

    public kw0(mw0 mw0Var) {
        this.a = mw0Var;
    }

    @Override
    public final void onFindResultReceived(int i, int i2, boolean z) {
        mw0 mw0Var = this.a;
        mw0Var.H = i;
        mw0Var.I = i2;
        Runnable runnable = mw0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}
