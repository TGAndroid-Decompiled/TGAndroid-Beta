package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f8487a;
    public final k3 f8488b;

    public n2(k3 k3Var, int i10) {
        this.f8487a = i10;
        this.f8488b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8487a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f8488b.f8438x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f8488b.r();
                return;
        }
    }
}
