package ei;

import android.view.View;
public final class o2 implements View.OnClickListener {
    public final int f9237a;
    public final l3 f9238b;

    public o2(l3 l3Var, int i10) {
        this.f9237a = i10;
        this.f9238b = l3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9237a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f9238b.f9181x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f9238b.r();
                return;
        }
    }
}
