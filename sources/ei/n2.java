package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f8500a;
    public final k3 f8501b;

    public n2(k3 k3Var, int i10) {
        this.f8500a = i10;
        this.f8501b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8500a) {
            case 0:
                org.telegram.ui.web.z0 webView = this.f8501b.f8451x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f8501b.r();
                return;
        }
    }
}
