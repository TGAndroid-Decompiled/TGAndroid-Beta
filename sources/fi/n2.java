package fi;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f9866a;
    public final k3 f9867b;

    public n2(k3 k3Var, int i10) {
        this.f9866a = i10;
        this.f9867b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9866a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f9867b.f9817x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f9867b.r();
                return;
        }
    }
}
