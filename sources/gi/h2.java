package gi;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f11238a;
    public final d3 f11239b;

    public h2(d3 d3Var, int i10) {
        this.f11238a = i10;
        this.f11239b = d3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11238a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f11239b.f11165x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f11239b.s();
                return;
        }
    }
}
