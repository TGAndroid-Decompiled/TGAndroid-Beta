package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f8488a;
    public final k3 f8489b;

    public n2(k3 k3Var, int i10) {
        this.f8488a = i10;
        this.f8489b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8488a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f8489b.f8439x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f8489b.r();
                return;
        }
    }
}
