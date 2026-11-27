package defpackage;

import android.view.View;
public final class bw0 implements View.OnClickListener {
    public final byte a;
    public final xw0 b;

    public bw0(xw0 xw0Var, byte b) {
        this.a = b;
        this.b = xw0Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                nv0 webView = xw0Var.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                xw0Var.w();
                return;
        }
    }
}
