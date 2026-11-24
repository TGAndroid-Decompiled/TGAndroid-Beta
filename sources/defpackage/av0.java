package defpackage;

import android.webkit.WebView;
public final class av0 implements WebView.FindListener {
    public final cv0 a;

    public av0(cv0 cv0Var) {
        this.a = cv0Var;
    }

    @Override
    public final void onFindResultReceived(int i, int i2, boolean z) {
        cv0 cv0Var = this.a;
        cv0Var.H = i;
        cv0Var.I = i2;
        Runnable runnable = cv0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}
