package fi;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f9428a;
    public final k3 f9429b;

    public n2(k3 k3Var, int i10) {
        this.f9428a = i10;
        this.f9429b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9428a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f9429b.f9384x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f9429b.s();
                return;
        }
    }
}
