package hi;

import android.view.View;
public final class c2 implements View.OnClickListener {
    public final int f14582a;
    public final a3 f14583b;

    public c2(a3 a3Var, int i7) {
        this.f14582a = i7;
        this.f14583b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14582a) {
            case 0:
                org.telegram.ui.web.u0 webView = this.f14583b.D.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f14583b.w();
                return;
        }
    }
}
