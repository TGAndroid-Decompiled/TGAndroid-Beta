package ki;

import android.view.View;
public final class y1 implements View.OnClickListener {
    public final int f19064a;
    public final t2 f19065b;

    public y1(t2 t2Var, int i7) {
        this.f19064a = i7;
        this.f19065b = t2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19064a) {
            case 0:
                org.telegram.ui.web.s0 webView = this.f19065b.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f19065b.w();
                return;
        }
    }
}
