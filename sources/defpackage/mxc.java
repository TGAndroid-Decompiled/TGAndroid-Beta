package defpackage;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
public final class mxc extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final InputStream c;
    public final rxc d;

    public mxc(rxc rxcVar, InputStream inputStream) {
        this.d = rxcVar;
        this.c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        ni6 ni6Var;
        String str2;
        InputStream a;
        String str3;
        ni6 ni6Var2;
        if (this.a) {
            this.a = false;
            String v2 = hl.v2(null, 2131624069);
            boolean z = f11.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(qd4.y("<script>\n", v2.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        rxc rxcVar = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.b) {
                lyc lycVar = rxcVar.b;
                if (lycVar != null) {
                    ni6Var2 = (ni6) ((ArrayList) lycVar.c).get(0);
                } else {
                    ni6Var2 = null;
                }
                if (ni6Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a = ni6Var2.a();
                } catch (IOException e) {
                    cc4.g(e, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.b = true;
                a = this.c;
            }
        } else {
            lyc lycVar2 = rxcVar.b;
            if (lycVar2 != null) {
                ni6Var = (ni6) ((HashMap) lycVar2.d).get(str);
            } else {
                ni6Var = null;
            }
            if (ni6Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            oi6 oi6Var = (oi6) ni6Var.a.get("content-type");
            if (oi6Var == null) {
                str2 = null;
            } else {
                str2 = oi6Var.a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a = ni6Var.a();
                str3 = str2;
            } catch (IOException e2) {
                cc4.g(e2, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a);
    }
}
