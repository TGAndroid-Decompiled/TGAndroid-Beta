package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f8490a;
    public final k3 f8491b;

    public n2(k3 k3Var, int i10) {
        this.f8490a = i10;
        this.f8491b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8490a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f8491b.f8440x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f8491b.r();
                return;
        }
    }
}
