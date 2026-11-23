package ki;

import android.view.View;
public final class x1 implements View.OnClickListener {
    public final int f19074a;
    public final s2 f19075b;

    public x1(s2 s2Var, int i7) {
        this.f19074a = i7;
        this.f19075b = s2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19074a) {
            case 0:
                org.telegram.ui.web.s0 webView = this.f19075b.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f19075b.w();
                return;
        }
    }
}
