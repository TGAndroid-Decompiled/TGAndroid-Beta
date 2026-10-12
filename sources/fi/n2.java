package fi;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f9425a;
    public final k3 f9426b;

    public n2(k3 k3Var, int i10) {
        this.f9425a = i10;
        this.f9426b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9425a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f9426b.f9381x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f9426b.s();
                return;
        }
    }
}
