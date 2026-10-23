package gi;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f11259a;
    public final d3 f11260b;

    public h2(d3 d3Var, int i10) {
        this.f11259a = i10;
        this.f11260b = d3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11259a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f11260b.f11188y.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f11260b.s();
                return;
        }
    }
}
