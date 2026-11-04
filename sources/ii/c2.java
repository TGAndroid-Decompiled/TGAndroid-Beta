package ii;

import android.view.View;
public final class c2 implements View.OnClickListener {
    public final int f14861a;
    public final a3 f14862b;

    public c2(a3 a3Var, int i3) {
        this.f14861a = i3;
        this.f14862b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14861a) {
            case 0:
                org.telegram.ui.web.t0 webView = this.f14862b.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f14862b.w();
                return;
        }
    }
}
