package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f8499a;
    public final k3 f8500b;

    public n2(k3 k3Var, int i10) {
        this.f8499a = i10;
        this.f8500b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8499a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f8500b.f8450x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f8500b.r();
                return;
        }
    }
}
