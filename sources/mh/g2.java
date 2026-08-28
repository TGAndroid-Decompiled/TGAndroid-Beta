package mh;

import android.view.View;
public final class g2 implements View.OnClickListener {
    public final int f17854a;
    public final c3 f17855b;

    public g2(c3 c3Var, int i9) {
        this.f17854a = i9;
        this.f17855b = c3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17854a) {
            case 0:
                org.telegram.ui.web.v0 webView = this.f17855b.f17778x.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            default:
                this.f17855b.r();
                return;
        }
    }
}
