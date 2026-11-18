package ki;

import android.view.View;
public final class y1 implements View.OnClickListener {
    public final int f19061a;
    public final t2 f19062b;

    public y1(t2 t2Var, int i7) {
        this.f19061a = i7;
        this.f19062b = t2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19061a) {
            case 0:
                org.telegram.ui.web.s0 webView = this.f19062b.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f19062b.w();
                return;
        }
    }
}
