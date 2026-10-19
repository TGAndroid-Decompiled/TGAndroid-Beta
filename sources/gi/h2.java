package gi;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f11239a;
    public final d3 f11240b;

    public h2(d3 d3Var, int i10) {
        this.f11239a = i10;
        this.f11240b = d3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11239a) {
            case 0:
                org.telegram.ui.web.x0 webView = this.f11240b.f11166x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f11240b.s();
                return;
        }
    }
}
