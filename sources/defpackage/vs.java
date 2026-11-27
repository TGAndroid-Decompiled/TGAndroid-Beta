package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class vs implements pcc {
    public final byte a;
    public final o b;

    public vs(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                b6 b6Var = oVar.r0;
                float f = -((Integer) obj).intValue();
                oVar.q0 = f;
                b6Var.setTranslationY(((1.0f - oVar.a1) * hl.L(51.0f)) + f);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    oVar.i0.c0.setText(str);
                    xs0 xs0Var = oVar.i0.c0;
                    xs0Var.setSelection(xs0Var.getText().length());
                    hl.E3(oVar.i0.c0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                if (oVar.M != null && str2 != null) {
                    oVar.i0.k(false);
                    if (m01.g(Uri.parse(str2), false, null)) {
                        tw twVar = oVar.L;
                        if (twVar != null) {
                            twVar.a(true);
                        }
                        m01.m(oVar.M, str2, false, false, null);
                        return;
                    } else if (!m01.n(oVar.M, str2, false)) {
                        m mVar = oVar.v0[0];
                        if (mVar != null && mVar.getWebView() != null) {
                            oVar.v0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            m01.p(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                n01 n01Var = (n01) obj;
                if (oVar.M != null && n01Var != null) {
                    oVar.i0.k(false);
                    m mVar2 = oVar.v0[0];
                    if (mVar2 != null && mVar2.getWebView() != null) {
                        oVar.v0[0].getWebView().d(n01Var.c, n01Var.d);
                        return;
                    } else {
                        m01.p(n01Var.c);
                        return;
                    }
                }
                return;
        }
    }
}
