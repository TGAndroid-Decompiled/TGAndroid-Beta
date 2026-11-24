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
public final class yuc extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final InputStream c;
    public final dvc d;

    public yuc(dvc dvcVar, InputStream inputStream) {
        this.d = dvcVar;
        this.c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        ji6 ji6Var;
        String str2;
        InputStream a;
        String str3;
        ji6 ji6Var2;
        if (this.a) {
            this.a = false;
            String v2 = gm.v2(null, 2131624069);
            boolean z = e21.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(kt6.o("<script>\n", v2.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        dvc dvcVar = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.b) {
                xvc xvcVar = dvcVar.b;
                if (xvcVar != null) {
                    ji6Var2 = (ji6) ((ArrayList) xvcVar.c).get(0);
                } else {
                    ji6Var2 = null;
                }
                if (ji6Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a = ji6Var2.a();
                } catch (IOException e) {
                    fc4.g(e, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.b = true;
                a = this.c;
            }
        } else {
            xvc xvcVar2 = dvcVar.b;
            if (xvcVar2 != null) {
                ji6Var = (ji6) ((HashMap) xvcVar2.d).get(str);
            } else {
                ji6Var = null;
            }
            if (ji6Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            ki6 ki6Var = (ki6) ji6Var.a.get("content-type");
            if (ki6Var == null) {
                str2 = null;
            } else {
                str2 = ki6Var.a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a = ji6Var.a();
                str3 = str2;
            } catch (IOException e2) {
                fc4.g(e2, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a);
    }
}
