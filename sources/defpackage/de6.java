package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class de6 extends jja {
    public GoogleSignInAccount E;
    public final mf6 F;
    public final er7 a;
    public final EditTextBoldCursor b;
    public final TextView c;
    public final l46 d;
    public final TextView e;
    public final nf6 f;
    public final ry8 h;
    public Bundle n;
    public boolean r;
    public String s;
    public String w;
    public String x;
    public String y;

    public de6(defpackage.mf6 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de6.<init>(mf6, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.F.i0;
    }

    @Override
    public String getHeaderName() {
        return k96.M0(2131754438, "AddEmailTitle");
    }

    @Override
    public final void h(String str) {
        String obj;
        int i;
        int i2;
        if (this.r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.E;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.c;
        } else {
            obj = this.b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.s);
        bundle.putString("ephone", this.w);
        bundle.putString("phoneFormated", this.x);
        bundle.putString("phoneHash", this.y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.E;
        mf6 mf6Var = this.F;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (mf6Var.G == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.E.b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.E = null;
            i2 = ((d) mf6Var).currentAccount;
            ConnectionsManager.getInstance(i2).sendRequest(verifyemail, new k45(this, bundle, verifyemail, (byte) 8), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.r = true;
            mf6Var.A1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (mf6Var.G == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i = ((d) mf6Var).currentAccount;
            ConnectionsManager.getInstance(i).sendRequest(sendverifyemailcode, new k45(this, bundle, sendverifyemailcode, (byte) 9), 10);
        }
    }

    @Override
    public final void j() {
        gl.d3(new ce6(this, (byte) 0), mf6.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        int i;
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setText("");
        this.n = bundle;
        this.s = bundle.getString("phone");
        this.w = this.n.getString("ephone");
        this.x = this.n.getString("phoneFormated");
        this.y = this.n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && b.b.hasServices()) {
            i = 0;
        } else {
            i = 8;
        }
        this.f.setVisibility(i);
        this.e.setVisibility(i);
        this.F.L1(editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        er7 er7Var = this.a;
        if (this.F.getParentActivity() == null) {
            return;
        }
        try {
            er7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.b.requestFocus();
        mf6.D1(er7Var, true);
        postDelayed(new ce6(this, (byte) 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i = bkb.F6;
        this.c.setTextColor(bkb.w0(null, i, false));
        int w0 = bkb.w0(null, bkb.C6, false);
        l46 l46Var = this.d;
        l46Var.setTextColor(w0);
        l46Var.setLinkTextColor(bkb.w0(null, bkb.Wc, false));
        this.b.setTextColor(bkb.w0(null, i, false));
        this.e.setTextColor(bkb.w0(null, bkb.p6, false));
        this.f.updateColors();
        this.a.invalidate();
    }
}
