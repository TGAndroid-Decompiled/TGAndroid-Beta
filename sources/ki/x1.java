package ki;

import android.view.View;
public final class x1 implements View.OnClickListener {
    public final int f19138a;
    public final t2 f19139b;

    public x1(t2 t2Var, int i7) {
        this.f19138a = i7;
        this.f19139b = t2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19138a) {
            case 0:
                org.telegram.ui.web.s0 webView = this.f19139b.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f19139b.w();
                return;
        }
    }
}
