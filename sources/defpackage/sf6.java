package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class sf6 extends kla {
    public final mh6 E;
    public final xe6 a;
    public final TextView b;
    public final TextView c;
    public final xna d;
    public final s09 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String w;
    public boolean x;
    public final qf6 y;

    public sf6(defpackage.mh6 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf6.<init>(mh6, android.content.Context):void");
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
    public final boolean d(boolean z) {
        this.E.y1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override
    public final void e() {
        this.n = false;
    }

    @Override
    public String getHeaderName() {
        return jb6.M0(2131748483, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i;
        if (this.n) {
            return;
        }
        xe6 xe6Var = this.a;
        xe6Var.e = true;
        for (gl2 gl2Var : xe6Var.f) {
            gl2Var.B(0.0f);
        }
        String code = xe6Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        mh6 mh6Var = this.E;
        mh6Var.B1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i = ((d) mh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_checkRecoveryPassword, new cx3(this, code, (byte) 20), 10);
    }

    @Override
    public final void j() {
        gm.d3(new qf6(this, (byte) 0), mh6.A0);
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
        xe6 xe6Var = this.a;
        xe6Var.setText("");
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
            valueOf.setSpan(new xkb(obj, 0), indexOf, i, 0);
        }
        this.d.setText(gm.m0(jb6.M0(2131745814, null), valueOf));
        this.E.M1(xe6Var);
        xe6Var.requestFocus();
    }

    public final void n(boolean z) {
        xe6 xe6Var = this.a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            xe6Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            for (gl2 gl2Var : xe6Var.f) {
                gl2Var.setText("");
            }
        }
        for (gl2 gl2Var2 : xe6Var.f) {
            gl2Var2.A(1.0f);
        }
        xe6Var.f[0].requestFocus();
        gm.A3(10.0f, xe6Var, new qf6(this, (byte) 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
    }

    @Override
    public final void updateColors() {
        this.b.setTextColor(cmb.w0(null, cmb.F6, false));
        this.c.setTextColor(cmb.w0(null, cmb.C6, false));
        this.d.setTextColor(cmb.w0(null, cmb.p6, false));
        this.a.invalidate();
    }
}
