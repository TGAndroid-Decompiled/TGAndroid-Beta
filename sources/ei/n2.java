package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f8504a;
    public final k3 f8505b;

    public n2(k3 k3Var, int i10) {
        this.f8504a = i10;
        this.f8505b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8504a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f8505b.f8455x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f8505b.r();
                return;
        }
    }
}
