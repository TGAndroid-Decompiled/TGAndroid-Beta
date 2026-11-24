package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class td6 extends jja {
    public final mf6 E;
    public final yc6 a;
    public final TextView b;
    public final TextView c;
    public final wla d;
    public final ry8 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String w;
    public boolean x;
    public final rd6 y;

    public td6(defpackage.mf6 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td6.<init>(mf6, android.content.Context):void");
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
        this.E.x1(true, true);
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
        return k96.M0(2131748534, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        int i;
        if (this.n) {
            return;
        }
        yc6 yc6Var = this.a;
        yc6Var.e = true;
        for (sj2 sj2Var : yc6Var.f) {
            sj2Var.B(0.0f);
        }
        String code = yc6Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        mf6 mf6Var = this.E;
        mf6Var.A1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i = ((d) mf6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_checkRecoveryPassword, new rv3(this, code, (byte) 20), 10);
    }

    @Override
    public final void j() {
        gl.e3(new rd6(this, (byte) 0), mf6.A0);
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
        yc6 yc6Var = this.a;
        yc6Var.setText("");
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
            valueOf.setSpan(new wib(obj, 0), indexOf, i, 0);
        }
        this.d.setText(gl.m0(k96.M0(2131745888, null), valueOf));
        this.E.L1(yc6Var);
        yc6Var.requestFocus();
    }

    public final void n(boolean z) {
        yc6 yc6Var = this.a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            yc6Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            for (sj2 sj2Var : yc6Var.f) {
                sj2Var.setText("");
            }
        }
        for (sj2 sj2Var2 : yc6Var.f) {
            sj2Var2.A(1.0f);
        }
        yc6Var.f[0].requestFocus();
        gl.B3(10.0f, yc6Var, new rd6(this, (byte) 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
    }

    @Override
    public final void updateColors() {
        this.b.setTextColor(bkb.w0(null, bkb.F6, false));
        this.c.setTextColor(bkb.w0(null, bkb.C6, false));
        this.d.setTextColor(bkb.w0(null, bkb.p6, false));
        this.a.invalidate();
    }
}
