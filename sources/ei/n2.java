package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f8505a;
    public final k3 f8506b;

    public n2(k3 k3Var, int i10) {
        this.f8505a = i10;
        this.f8506b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8505a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f8506b.f8456x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f8506b.r();
                return;
        }
    }
}
