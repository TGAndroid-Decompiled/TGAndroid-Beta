package di;

import android.view.View;
public final class q2 implements View.OnClickListener {
    public final int f6858a;
    public final n3 f6859b;

    public q2(n3 n3Var, int i10) {
        this.f6858a = i10;
        this.f6859b = n3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6858a) {
            case 0:
                org.telegram.ui.web.y0 webView = this.f6859b.f6812x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f6859b.r();
                return;
        }
    }
}
