package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Locale;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
public final class df6 extends cna {
    public Bundle E;
    public boolean F;
    public GoogleSignInAccount G;
    public int H;
    public int I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public boolean O;
    public int P;
    public final boolean Q;
    public final cf6 R;
    public boolean S;
    public final xe6 T;
    public final xe6 U;
    public final xe6 V;
    public boolean W;
    public final bf6 a;
    public final qh6 a0;
    public final TextView b;
    public final tpa c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final xb n;
    public final xb r;
    public final TextView s;
    public final rh6 w;
    public final e29 x;
    public boolean y;

    public df6(defpackage.qh6 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df6.<init>(qh6, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.I != 0) {
            hl.r(this.V);
        }
    }

    @Override
    public String getHeaderName() {
        return ob6.M0(2131743274, null);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i;
        if (!this.F) {
            hl.r(this.U);
            bf6 bf6Var = this.a;
            bf6Var.e = true;
            ok2[] ok2VarArr = bf6Var.f;
            if (ok2VarArr != null) {
                for (ok2 ok2Var : ok2VarArr) {
                    ok2Var.B(0.0f);
                }
            }
            String code = bf6Var.getCode();
            int length = code.length();
            qh6 qh6Var = this.a0;
            if (length == 0 && this.G == null) {
                if (qh6Var.getParentActivity() == null) {
                    return;
                }
                try {
                    bf6Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (ok2 ok2Var2 : bf6Var.f) {
                    ok2Var2.A(1.0f);
                }
                bf6Var.f[0].requestFocus();
                hl.A3(10.0f, bf6Var, new xe6(this, (byte) 1));
                return;
            }
            this.F = true;
            qh6Var.B1(0, true);
            if (qh6Var.G == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tL_auth_signIn = verifyemail;
            } else if (this.O) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.M;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.N;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tL_auth_signIn = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
                tL_auth_signIn2.phone_number = this.M;
                tL_auth_signIn2.phone_code_hash = this.N;
                if (this.G != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.G.b;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags |= 2;
                tL_auth_signIn = tL_auth_signIn2;
            }
            bf6Var.e = true;
            ok2[] ok2VarArr2 = bf6Var.f;
            if (ok2VarArr2 != null) {
                for (ok2 ok2Var3 : ok2VarArr2) {
                    ok2Var3.B(0.0f);
                }
            }
            i = ((e) qh6Var).currentAccount;
            ConnectionsManager.getInstance(i).sendRequest(tL_auth_signIn, new ue6(this, code, (byte) 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.y) {
            this.y = false;
        } else {
            hl.d3(new xe6(this, (byte) 8), qh6.A0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.E = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.E;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        int i;
        int i2;
        ok2[] ok2VarArr;
        if (bundle != null) {
            this.E = bundle;
            this.M = bundle.getString("phoneFormated");
            this.N = this.E.getString("phoneHash");
            this.J = this.E.getString("phone");
            this.K = this.E.getString("ephone");
            this.O = this.E.getBoolean("setup");
            this.P = this.E.getInt("length");
            this.L = this.E.getString("email");
            this.H = this.E.getInt("resetAvailablePeriod");
            this.I = this.E.getInt("resetPendingDate");
            qh6 qh6Var = this.a0;
            byte b = qh6Var.G;
            int i3 = 8;
            FrameLayout frameLayout = this.h;
            tpa tpaVar = this.c;
            if (b == 3) {
                tpaVar.setText(ob6.a0(null, null, 2131752107, this.L));
                hl.T3(frameLayout, false, 1.0f, true, false);
            } else if (this.Q) {
                tpaVar.setText(ob6.a0(null, null, 2131743273, this.L));
                hl.T3(frameLayout, false, 1.0f, true, false);
            } else {
                hl.T3(frameLayout, true, 1.0f, true, false);
                if (this.I == 0) {
                    i = 0;
                } else {
                    i = 8;
                }
                this.n.setVisibility(i);
                if (this.I != 0) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                this.r.setVisibility(i2);
                if (this.I != 0) {
                    q();
                }
            }
            int i4 = this.P;
            bf6 bf6Var = this.a;
            bf6Var.b(i4, 1);
            for (ok2 ok2Var : bf6Var.f) {
                ok2Var.setShowSoftInputOnFocusCompat(hl.A1());
                ok2Var.addTextChangedListener(new c7(this, (byte) 27));
                ok2Var.setOnFocusChangeListener(new ts0(this, (byte) 6));
            }
            bf6Var.setText("");
            if (!this.O && qh6Var.G != 3) {
                String string = this.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.a |= 256;
                    obj.b = indexOf;
                    int i5 = lastIndexOf + 1;
                    obj.c = i5;
                    spannableStringBuilder.setSpan(new smb(obj, 0), indexOf, i5, 0);
                }
                tpaVar.setText(hl.m0(ob6.M0(2131752109, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && b.b.hasServices()) {
                i3 = 0;
            }
            this.w.setVisibility(i3);
            this.d.setVisibility(i3);
            qh6Var.M1(bf6Var.f[0]);
            bf6Var.requestFocus();
            if (!z && bundle.containsKey("nextType")) {
                hl.d3(this.U, bundle.getInt("timeout"));
            }
            if (this.I != 0) {
                hl.d3(this.V, 1000L);
            }
        }
    }

    public final void n(Runnable runnable) {
        if (this.G != null) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            bf6 bf6Var = this.a;
            ok2[] ok2VarArr = bf6Var.f;
            if (i < ok2VarArr.length) {
                bf6Var.postDelayed(new hl3(this, i, (byte) 19), i * 75);
                i++;
            } else {
                bf6Var.postDelayed(new z56(this, runnable, (byte) 12), (ok2VarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void o() {
        if (this.W) {
            return;
        }
        this.W = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.J);
        bundle.putString("ephone", this.K);
        bundle.putString("phoneFormated", this.M);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.M;
        tL_auth_resetLoginEmail.phone_code_hash = this.N;
        this.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ve6(this, bundle, tL_auth_resetLoginEmail, (byte) 0), 10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        removeCallbacks(this.U);
    }

    public final void p(boolean z) {
        boolean z2;
        float f;
        hl.R3(this.f, z);
        if (!z && this.a0.G != 3 && !this.Q) {
            z2 = true;
        } else {
            z2 = false;
        }
        hl.R3(this.h, z2);
        rh6 rh6Var = this.w;
        if (rh6Var.getVisibility() != 8) {
            if (z) {
                f = 8.0f;
            } else {
                f = 16.0f;
            }
            rh6Var.setLayoutParams(tre.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f));
            rh6Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String a0;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i = this.I;
        xb xbVar = this.r;
        if (i > 0 && currentTimeMillis > 0) {
            int i2 = currentTimeMillis / 86400;
            int i3 = currentTimeMillis % 86400;
            int i4 = i3 / 3600;
            int i5 = i3 % 3600;
            int i6 = i5 / 60;
            int i7 = i5 % 60;
            if (i4 >= 16) {
                i2++;
            }
            if (i2 != 0) {
                a0 = ob6.a0(null, null, 2131748488, ob6.G(i2, "Days", new Object[0]));
            } else {
                if (i4 == 0) {
                    str = "";
                } else {
                    str = String.format(Locale.ROOT, "%02d:", Integer.valueOf(i4));
                }
                StringBuilder sb = new StringBuilder(str);
                Locale locale = Locale.ROOT;
                sb.append(String.format(locale, "%02d:", Integer.valueOf(i6)));
                sb.append(String.format(locale, "%02d", Integer.valueOf(i7)));
                a0 = ob6.a0(null, null, 2131748488, sb.toString());
            }
            String a02 = ob6.a0(null, null, 2131748487, a0);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a02);
            int indexOf = a02.indexOf(42);
            int lastIndexOf = a02.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new ho4(aob.q6, this.a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            xbVar.setText(valueOf);
            hl.d3(this.V, 1000L);
            return;
        }
        xbVar.setVisibility(0);
        xbVar.setText(ob6.M0(2131748485, null));
        hl.d3(new xe6(this, (byte) 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.b.setTextColor(aob.w0(null, aob.G6, false));
        int i = aob.D6;
        this.c.setTextColor(aob.w0(null, i, false));
        int i2 = aob.q6;
        this.d.setTextColor(aob.w0(null, i2, false));
        this.w.updateColors();
        this.f.setTextColor(aob.w0(null, i2, false));
        this.n.setTextColor(aob.w0(null, i2, false));
        this.r.setTextColor(aob.w0(null, i, false));
        this.s.setTextColor(aob.w0(null, aob.q7, false));
        this.a.invalidate();
    }
}
