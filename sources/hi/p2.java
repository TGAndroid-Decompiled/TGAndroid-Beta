package hi;

import android.view.View;
public final class p2 implements View.OnClickListener {
    public final int f13199a;
    public final m3 f13200b;

    public p2(m3 m3Var, int i10) {
        this.f13199a = i10;
        this.f13200b = m3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13199a) {
            case 0:
                org.telegram.ui.web.x0 webView = this.f13200b.f13132y.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f13200b.s();
                return;
        }
    }
}
