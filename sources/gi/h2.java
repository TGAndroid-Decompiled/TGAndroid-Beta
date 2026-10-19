package gi;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f11237a;
    public final d3 f11238b;

    public h2(d3 d3Var, int i10) {
        this.f11237a = i10;
        this.f11238b = d3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11237a) {
            case 0:
                org.telegram.ui.web.x0 webView = this.f11238b.f11164x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f11238b.s();
                return;
        }
    }
}
