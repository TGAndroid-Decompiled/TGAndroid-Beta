package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class iw0 extends WebViewClient {
    public final WebView a;
    public final jw0 b;

    public iw0(jw0 jw0Var, WebView webView) {
        this.b = jw0Var;
        this.a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ylb ylbVar;
        Integer valueOf;
        Boolean valueOf2;
        int i = Build.VERSION.SDK_INT;
        mw0 mw0Var = this.b.e;
        if (i >= 26) {
            StringBuilder sb = new StringBuilder("newWebView.onRenderProcessGone priority=");
            if (renderProcessGoneDetail == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
            }
            sb.append(valueOf);
            sb.append(" didCrash=");
            if (renderProcessGoneDetail == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(renderProcessGoneDetail.didCrash());
            }
            sb.append(valueOf2);
            mw0Var.b(sb.toString());
        } else {
            mw0Var.b("newWebView.onRenderProcessGone");
        }
        try {
            if (!gm.K1(mw0Var.getContext())) {
                return true;
            }
            Context context = mw0Var.getContext();
            qw0 qw0Var = mw0Var.R;
            if (qw0Var == null) {
                ylbVar = null;
            } else {
                ylbVar = qw0Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
            he heVar = alertDialog$Builder.a;
            heVar.S = jb6.M0(2131752041, null);
            heVar.U = gm.N2(jb6.M0(2131752042, null), -1, 0, new yt0(this, (byte) 2), null);
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            heVar.setOnDismissListener(new n1(this, (byte) 8));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            fc4.g(e, true);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        qw0 qw0Var = this.b.e.R;
        if (qw0Var != null) {
            Uri parse = Uri.parse(str);
            boolean z = qw0.R0;
            qw0Var.E(parse, null, !qw0Var.p0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
