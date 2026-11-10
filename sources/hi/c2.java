package hi;

import android.view.View;
public final class c2 implements View.OnClickListener {
    public final int f14584a;
    public final a3 f14585b;

    public c2(a3 a3Var, int i7) {
        this.f14584a = i7;
        this.f14585b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14584a) {
            case 0:
                org.telegram.ui.web.u0 webView = this.f14585b.D.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f14585b.w();
                return;
        }
    }
}
