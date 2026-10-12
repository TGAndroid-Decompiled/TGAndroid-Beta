package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f9235a;
    public final k3 f9236b;

    public n2(k3 k3Var, int i10) {
        this.f9235a = i10;
        this.f9236b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9235a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f9236b.f9180x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f9236b.s();
                return;
        }
    }
}
