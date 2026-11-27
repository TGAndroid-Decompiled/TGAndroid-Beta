package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jv0 extends WebViewClient {
    public final WebView a;
    public final kv0 b;

    public jv0(kv0 kv0Var, WebView webView) {
        this.b = kv0Var;
        this.a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        vnb vnbVar;
        Integer valueOf;
        Boolean valueOf2;
        int i = Build.VERSION.SDK_INT;
        nv0 nv0Var = this.b.e;
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
            nv0Var.b(sb.toString());
        } else {
            nv0Var.b("newWebView.onRenderProcessGone");
        }
        try {
            if (!hl.K1(nv0Var.getContext())) {
                return true;
            }
            Context context = nv0Var.getContext();
            rv0 rv0Var = nv0Var.R;
            if (rv0Var == null) {
                vnbVar = null;
            } else {
                vnbVar = rv0Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
            id idVar = alertDialog$Builder.a;
            idVar.S = ob6.M0(2131752069, null);
            idVar.U = hl.N2(ob6.M0(2131752070, null), -1, 0, new fv0(this, (byte) 1), null);
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            idVar.setOnDismissListener(new o1(this, (byte) 8));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            cc4.g(e, true);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        rv0 rv0Var = this.b.e.R;
        if (rv0Var != null) {
            Uri parse = Uri.parse(str);
            boolean z = rv0.R0;
            rv0Var.E(parse, null, !rv0Var.p0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
