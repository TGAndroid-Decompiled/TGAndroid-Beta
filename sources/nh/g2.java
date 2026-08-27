package nh;

import android.view.View;

public final class g2 implements View.OnClickListener {

    public final int f18698a;

    public final b3 f18699b;

    public g2(b3 b3Var, int i10) {
        this.f18698a = i10;
        this.f18699b = b3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18698a) {
            case 0:
                org.telegram.ui.web.w0 webView = this.f18699b.f18599x.getWebView();
                if (webView != null) {
                    webView.reload();
                }
                break;
            default:
                this.f18699b.r();
                break;
        }
    }
}
