package gi;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f11240a;
    public final d3 f11241b;

    public h2(d3 d3Var, int i10) {
        this.f11240a = i10;
        this.f11241b = d3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11240a) {
            case 0:
                org.telegram.ui.web.x0 webView = this.f11241b.f11167x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f11241b.s();
                return;
        }
    }
}
