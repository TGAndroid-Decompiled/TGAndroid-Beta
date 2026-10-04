package ei;

import android.view.View;
public final class o2 implements View.OnClickListener {
    public final int f9236a;
    public final l3 f9237b;

    public o2(l3 l3Var, int i10) {
        this.f9236a = i10;
        this.f9237b = l3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9236a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f9237b.f9180x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f9237b.r();
                return;
        }
    }
}
