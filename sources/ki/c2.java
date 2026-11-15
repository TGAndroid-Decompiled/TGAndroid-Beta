package ki;

import android.view.View;
public final class c2 implements View.OnClickListener {
    public final int f18235a;
    public final x2 f18236b;

    public c2(x2 x2Var, int i7) {
        this.f18235a = i7;
        this.f18236b = x2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18235a) {
            case 0:
                org.telegram.ui.web.s0 webView = this.f18236b.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f18236b.w();
                return;
        }
    }
}
