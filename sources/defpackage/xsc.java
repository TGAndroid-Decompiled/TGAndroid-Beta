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
public final class xsc extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final InputStream c;
    public final ctc d;

    public xsc(ctc ctcVar, InputStream inputStream) {
        this.d = ctcVar;
        this.c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        jg6 jg6Var;
        String str2;
        InputStream a;
        String str3;
        jg6 jg6Var2;
        if (this.a) {
            this.a = false;
            String v2 = gl.v2(null, 2131624069);
            boolean z = w01.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(tb4.y("<script>\n", v2.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        ctc ctcVar = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.b) {
                c5a c5aVar = ctcVar.b;
                if (c5aVar != null) {
                    jg6Var2 = (jg6) ((ArrayList) c5aVar.c).get(0);
                } else {
                    jg6Var2 = null;
                }
                if (jg6Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a = jg6Var2.a();
                } catch (IOException e) {
                    fa4.g(e, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.b = true;
                a = this.c;
            }
        } else {
            c5a c5aVar2 = ctcVar.b;
            if (c5aVar2 != null) {
                jg6Var = (jg6) ((HashMap) c5aVar2.d).get(str);
            } else {
                jg6Var = null;
            }
            if (jg6Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            kg6 kg6Var = (kg6) jg6Var.a.get("content-type");
            if (kg6Var == null) {
                str2 = null;
            } else {
                str2 = kg6Var.a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a = jg6Var.a();
                str3 = str2;
            } catch (IOException e2) {
                fa4.g(e2, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a);
    }
}
