package defpackage;

import android.view.View;
public final class rv0 implements View.OnClickListener {
    public final byte a;
    public final ow0 b;

    public rv0(ow0 ow0Var, byte b) {
        this.a = b;
        this.b = ow0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                cv0 webView = ow0Var.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                ow0Var.w();
                return;
        }
    }
}
