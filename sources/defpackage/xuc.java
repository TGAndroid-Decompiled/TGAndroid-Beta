package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.web.a;
public final class xuc implements ValueCallback {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public xuc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
                dvc dvcVar = (dvc) this.b;
                mw0 mw0Var = (mw0) this.c;
                File file = (File) this.d;
                String str = (String) obj;
                mw0Var.saveWebArchive(file.getAbsolutePath(), false, new xuc(dvcVar, mw0Var, file, (a) this.e, (byte) 1));
                return;
            case 1:
                dvc dvcVar2 = (dvc) this.b;
                File file2 = (File) this.d;
                a aVar = (a) this.e;
                String str2 = (String) obj;
                ((mw0) this.c).evaluateJavascript(gm.v2(null, 2131624110).replace("$OPEN$", "false"), new Object());
                try {
                    xvc xvcVar = new xvc(file2);
                    dvcVar2.b = xvcVar;
                    if (!((ArrayList) xvcVar.c).isEmpty()) {
                        aVar.a(((ji6) ((ArrayList) dvcVar2.b.c).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                aVar.a(null);
                return;
            default:
                bwc bwcVar = (bwc) this.b;
                WebView webView = (WebView) this.d;
                yu5 yu5Var = (yu5) this.e;
                String str3 = (String) obj;
                gm.r((gcc) this.c);
                synchronized (bwcVar.a) {
                    if (!bwcVar.u && bwcVar.o == webView && bwcVar.p == yu5Var && !bwcVar.r) {
                        if (!"true".equals(str3)) {
                            fc4.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            bwcVar.q();
                            return;
                        } else if (!bwcVar.j(webView)) {
                            bwcVar.h();
                            return;
                        } else {
                            bwcVar.s = false;
                            bwcVar.r = true;
                            fc4.b("WEB proxy: Base64 bridge ready");
                            bwcVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }
}
