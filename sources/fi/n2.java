package fi;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f9838a;
    public final k3 f9839b;

    public n2(k3 k3Var, int i10) {
        this.f9838a = i10;
        this.f9839b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9838a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f9839b.f9789x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f9839b.r();
                return;
        }
    }
}
