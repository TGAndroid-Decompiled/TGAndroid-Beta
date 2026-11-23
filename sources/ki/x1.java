package ki;

import android.view.View;
public final class x1 implements View.OnClickListener {
    public final int f19040a;
    public final s2 f19041b;

    public x1(s2 s2Var, int i7) {
        this.f19040a = i7;
        this.f19041b = s2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19040a) {
            case 0:
                org.telegram.ui.web.s0 webView = this.f19041b.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f19041b.w();
                return;
        }
    }
}
