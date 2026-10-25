package hi;

import android.view.View;
public final class p2 implements View.OnClickListener {
    public final int f13200a;
    public final m3 f13201b;

    public p2(m3 m3Var, int i10) {
        this.f13200a = i10;
        this.f13201b = m3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13200a) {
            case 0:
                org.telegram.ui.web.x0 webView = this.f13201b.f13133y.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f13201b.s();
                return;
        }
    }
}
