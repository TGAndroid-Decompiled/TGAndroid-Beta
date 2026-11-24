package defpackage;

import android.view.View;
public final class ax0 implements View.OnClickListener {
    public final byte a;
    public final wx0 b;

    public ax0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                mw0 webView = wx0Var.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                wx0Var.w();
                return;
        }
    }
}
