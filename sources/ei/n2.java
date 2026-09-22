package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f8502a;
    public final k3 f8503b;

    public n2(k3 k3Var, int i10) {
        this.f8502a = i10;
        this.f8503b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8502a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f8503b.f8453x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f8503b.r();
                return;
        }
    }
}
