package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f9237a;
    public final k3 f9238b;

    public n2(k3 k3Var, int i10) {
        this.f9237a = i10;
        this.f9238b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9237a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f9238b.f9182x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f9238b.s();
                return;
        }
    }
}
