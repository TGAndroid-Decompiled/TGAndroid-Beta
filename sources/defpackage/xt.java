package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class xt implements qac {
    public final byte a;
    public final o b;

    public xt(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                a6 a6Var = oVar.r0;
                float f = -((Integer) obj).intValue();
                oVar.q0 = f;
                a6Var.setTranslationY(((1.0f - oVar.a1) * gm.L(51.0f)) + f);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    oVar.i0.c0.setText(str);
                    vc vcVar = oVar.i0.c0;
                    vcVar.setSelection(vcVar.getText().length());
                    gm.E3(oVar.i0.c0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                if (oVar.M != null && str2 != null) {
                    oVar.i0.k(false);
                    if (l11.g(Uri.parse(str2), false, null)) {
                        sx sxVar = oVar.L;
                        if (sxVar != null) {
                            sxVar.a(true);
                        }
                        l11.m(oVar.M, str2, false, false, null);
                        return;
                    } else if (!l11.n(oVar.M, str2, false)) {
                        m mVar = oVar.v0[0];
                        if (mVar != null && mVar.getWebView() != null) {
                            oVar.v0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            l11.p(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                m11 m11Var = (m11) obj;
                if (oVar.M != null && m11Var != null) {
                    oVar.i0.k(false);
                    m mVar2 = oVar.v0[0];
                    if (mVar2 != null && mVar2.getWebView() != null) {
                        oVar.v0[0].getWebView().d(m11Var.c, m11Var.d);
                        return;
                    } else {
                        l11.p(m11Var.c);
                        return;
                    }
                }
                return;
        }
    }
}
