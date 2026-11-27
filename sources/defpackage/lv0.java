package defpackage;

import android.webkit.WebView;
public final class lv0 implements WebView.FindListener {
    public final nv0 a;

    public lv0(nv0 nv0Var) {
        this.a = nv0Var;
    }

    @Override
    public final void onFindResultReceived(int i, int i2, boolean z) {
        nv0 nv0Var = this.a;
        nv0Var.H = i;
        nv0Var.I = i2;
        Runnable runnable = nv0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}
