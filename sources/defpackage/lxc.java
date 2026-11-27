package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.web.a;
public final class lxc implements ValueCallback {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public lxc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
                rxc rxcVar = (rxc) this.b;
                nv0 nv0Var = (nv0) this.c;
                File file = (File) this.d;
                String str = (String) obj;
                nv0Var.saveWebArchive(file.getAbsolutePath(), false, new lxc(rxcVar, nv0Var, file, (a) this.e, (byte) 1));
                return;
            case 1:
                rxc rxcVar2 = (rxc) this.b;
                File file2 = (File) this.d;
                a aVar = (a) this.e;
                String str2 = (String) obj;
                ((nv0) this.c).evaluateJavascript(hl.v2(null, 2131624110).replace("$OPEN$", "false"), new Object());
                try {
                    lyc lycVar = new lyc(file2);
                    rxcVar2.b = lycVar;
                    if (!((ArrayList) lycVar.c).isEmpty()) {
                        aVar.a(((ni6) ((ArrayList) rxcVar2.b.c).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                aVar.a(null);
                return;
            default:
                pyc pycVar = (pyc) this.b;
                WebView webView = (WebView) this.d;
                cv5 cv5Var = (cv5) this.e;
                String str3 = (String) obj;
                hl.r((jwc) this.c);
                synchronized (pycVar.a) {
                    if (!pycVar.u && pycVar.o == webView && pycVar.p == cv5Var && !pycVar.r) {
                        if (!"true".equals(str3)) {
                            cc4.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            pycVar.q();
                            return;
                        } else if (!pycVar.j(webView)) {
                            pycVar.h();
                            return;
                        } else {
                            pycVar.s = false;
                            pycVar.r = true;
                            cc4.b("WEB proxy: Base64 bridge ready");
                            pycVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }
}
