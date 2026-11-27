package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class vf6 extends cna {
    public final qh6 E;
    public final bf6 a;
    public final TextView b;
    public final TextView c;
    public final tpa d;
    public final e29 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String w;
    public boolean x;
    public final tf6 y;

    public vf6(defpackage.qh6 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf6.<init>(qh6, android.content.Context):void");
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z) {
        this.E.y1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override
    public final void d() {
        this.n = false;
    }

    @Override
    public String getHeaderName() {
        return ob6.M0(2131748480, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i;
        if (this.n) {
            return;
        }
        bf6 bf6Var = this.a;
        bf6Var.e = true;
        for (ok2 ok2Var : bf6Var.f) {
            ok2Var.B(0.0f);
        }
        String code = bf6Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        qh6 qh6Var = this.E;
        qh6Var.B1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i = ((e) qh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_checkRecoveryPassword, new mw3(this, code, (byte) 20), 10);
    }

    @Override
    public final void j() {
        hl.d3(new tf6(this, (byte) 0), qh6.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        bf6 bf6Var = this.a;
        bf6Var.setText("");
        this.f = bundle;
        this.h = bundle.getString("password");
        this.r = this.f.getString("requestPhone");
        this.s = this.f.getString("phoneHash");
        this.w = this.f.getString("phoneCode");
        String string = this.f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.a |= 256;
            obj.b = indexOf;
            int i = lastIndexOf + 1;
            obj.c = i;
            valueOf.setSpan(new smb(obj, 0), indexOf, i, 0);
        }
        this.d.setText(hl.m0(ob6.M0(2131745808, null), valueOf));
        this.E.M1(bf6Var);
        bf6Var.requestFocus();
    }

    public final void n(boolean z) {
        bf6 bf6Var = this.a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            bf6Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            for (ok2 ok2Var : bf6Var.f) {
                ok2Var.setText("");
            }
        }
        for (ok2 ok2Var2 : bf6Var.f) {
            ok2Var2.A(1.0f);
        }
        bf6Var.f[0].requestFocus();
        hl.A3(10.0f, bf6Var, new tf6(this, (byte) 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
    }

    @Override
    public final void updateColors() {
        this.b.setTextColor(aob.w0(null, aob.G6, false));
        this.c.setTextColor(aob.w0(null, aob.D6, false));
        this.d.setTextColor(aob.w0(null, aob.q6, false));
        this.a.invalidate();
    }
}
