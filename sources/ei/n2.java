package ei;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f9238a;
    public final k3 f9239b;

    public n2(k3 k3Var, int i10) {
        this.f9238a = i10;
        this.f9239b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9238a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f9239b.f9183x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f9239b.s();
                return;
        }
    }
}
