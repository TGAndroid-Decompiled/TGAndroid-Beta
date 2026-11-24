package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.web.a;
public final class wsc implements ValueCallback {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public wsc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                ctc ctcVar = (ctc) this.b;
                cv0 cv0Var = (cv0) this.c;
                File file = (File) this.d;
                String str = (String) obj;
                cv0Var.saveWebArchive(file.getAbsolutePath(), false, new wsc(ctcVar, cv0Var, file, (a) this.e, (byte) 1));
                return;
            case 1:
                ctc ctcVar2 = (ctc) this.b;
                File file2 = (File) this.d;
                a aVar = (a) this.e;
                String str2 = (String) obj;
                ((cv0) this.c).evaluateJavascript(gl.v2(null, 2131624110).replace("$OPEN$", "false"), new Object());
                try {
                    c5a c5aVar = new c5a(file2);
                    ctcVar2.b = c5aVar;
                    if (!((ArrayList) c5aVar.c).isEmpty()) {
                        aVar.a(((jg6) ((ArrayList) ctcVar2.b.c).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                aVar.a(null);
                return;
            default:
                auc aucVar = (auc) this.b;
                WebView webView = (WebView) this.d;
                zs5 zs5Var = (zs5) this.e;
                String str3 = (String) obj;
                gl.r((wbc) this.c);
                synchronized (aucVar.a) {
                    if (!aucVar.u && aucVar.o == webView && aucVar.p == zs5Var && !aucVar.r) {
                        if (!"true".equals(str3)) {
                            fa4.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            aucVar.q();
                            return;
                        } else if (!aucVar.j(webView)) {
                            aucVar.h();
                            return;
                        } else {
                            aucVar.s = false;
                            aucVar.r = true;
                            fa4.b("WEB proxy: Base64 bridge ready");
                            aucVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }
}
