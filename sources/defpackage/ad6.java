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
import org.telegram.ui.ActionBar.d;
public final class ad6 extends jja {
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
    public final zc6 R;
    public boolean S;
    public final uc6 T;
    public final uc6 U;
    public final uc6 V;
    public boolean W;
    public final yc6 a;
    public final mf6 a0;
    public final TextView b;
    public final wla c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final wb n;
    public final wb r;
    public final TextView s;
    public final nf6 w;
    public final ry8 x;
    public boolean y;

    public ad6(defpackage.mf6 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad6.<init>(mf6, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.I != 0) {
            gl.r(this.V);
        }
    }

    @Override
    public String getHeaderName() {
        return k96.M0(2131743380, null);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i;
        if (!this.F) {
            gl.r(this.U);
            yc6 yc6Var = this.a;
            yc6Var.e = true;
            sj2[] sj2VarArr = yc6Var.f;
            if (sj2VarArr != null) {
                for (sj2 sj2Var : sj2VarArr) {
                    sj2Var.B(0.0f);
                }
            }
            String code = yc6Var.getCode();
            int length = code.length();
            mf6 mf6Var = this.a0;
            if (length == 0 && this.G == null) {
                if (mf6Var.getParentActivity() == null) {
                    return;
                }
                try {
                    yc6Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (sj2 sj2Var2 : yc6Var.f) {
                    sj2Var2.A(1.0f);
                }
                yc6Var.f[0].requestFocus();
                gl.B3(10.0f, yc6Var, new uc6(this, (byte) 1));
                return;
            }
            this.F = true;
            mf6Var.A1(0, true);
            if (mf6Var.G == 3) {
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
            yc6Var.e = true;
            sj2[] sj2VarArr2 = yc6Var.f;
            if (sj2VarArr2 != null) {
                for (sj2 sj2Var3 : sj2VarArr2) {
                    sj2Var3.B(0.0f);
                }
            }
            i = ((d) mf6Var).currentAccount;
            ConnectionsManager.getInstance(i).sendRequest(tL_auth_signIn, new rc6(this, code, (byte) 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.y) {
            this.y = false;
        } else {
            gl.e3(new uc6(this, (byte) 8), mf6.A0);
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
        sj2[] sj2VarArr;
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
            mf6 mf6Var = this.a0;
            byte b = mf6Var.G;
            int i3 = 8;
            FrameLayout frameLayout = this.h;
            wla wlaVar = this.c;
            if (b == 3) {
                wlaVar.setText(k96.a0(null, null, 2131752130, this.L));
                gl.U3(frameLayout, false, 1.0f, true, false);
            } else if (this.Q) {
                wlaVar.setText(k96.a0(null, null, 2131743379, this.L));
                gl.U3(frameLayout, false, 1.0f, true, false);
            } else {
                gl.U3(frameLayout, true, 1.0f, true, false);
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
            yc6 yc6Var = this.a;
            yc6Var.b(i4, 1);
            for (sj2 sj2Var : yc6Var.f) {
                sj2Var.setShowSoftInputOnFocusCompat(gl.A1());
                sj2Var.addTextChangedListener(new b7(this, (byte) 27));
                sj2Var.setOnFocusChangeListener(new ls0(this, (byte) 6));
            }
            yc6Var.setText("");
            if (!this.O && mf6Var.G != 3) {
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
                    spannableStringBuilder.setSpan(new wib(obj, 0), indexOf, i5, 0);
                }
                wlaVar.setText(gl.m0(k96.M0(2131752132, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && b.b.hasServices()) {
                i3 = 0;
            }
            this.w.setVisibility(i3);
            this.d.setVisibility(i3);
            mf6Var.L1(yc6Var.f[0]);
            yc6Var.requestFocus();
            if (!z && bundle.containsKey("nextType")) {
                gl.e3(this.U, bundle.getInt("timeout"));
            }
            if (this.I != 0) {
                gl.e3(this.V, 1000L);
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
            yc6 yc6Var = this.a;
            sj2[] sj2VarArr = yc6Var.f;
            if (i < sj2VarArr.length) {
                yc6Var.postDelayed(new sm3(this, i, (byte) 17), i * 75);
                i++;
            } else {
                yc6Var.postDelayed(new kz5(this, runnable, (byte) 15), (sj2VarArr.length * 75) + 400);
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
        this.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new sc6(this, bundle, tL_auth_resetLoginEmail, (byte) 0), 10);
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
        gl.S3(this.f, z);
        if (!z && this.a0.G != 3 && !this.Q) {
            z2 = true;
        } else {
            z2 = false;
        }
        gl.S3(this.h, z2);
        nf6 nf6Var = this.w;
        if (nf6Var.getVisibility() != 8) {
            if (z) {
                f = 8.0f;
            } else {
                f = 16.0f;
            }
            nf6Var.setLayoutParams(nme.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f));
            nf6Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String a0;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i = this.I;
        wb wbVar = this.r;
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
                a0 = k96.a0(null, null, 2131748542, k96.G(i2, "Days", new Object[0]));
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
                a0 = k96.a0(null, null, 2131748542, sb.toString());
            }
            String a02 = k96.a0(null, null, 2131748541, a0);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a02);
            int indexOf = a02.indexOf(42);
            int lastIndexOf = a02.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new cm4(bkb.p6, this.a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            wbVar.setText(valueOf);
            gl.e3(this.V, 1000L);
            return;
        }
        wbVar.setVisibility(0);
        wbVar.setText(k96.M0(2131748539, null));
        gl.e3(new uc6(this, (byte) 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.b.setTextColor(bkb.w0(null, bkb.F6, false));
        int i = bkb.C6;
        this.c.setTextColor(bkb.w0(null, i, false));
        int i2 = bkb.p6;
        this.d.setTextColor(bkb.w0(null, i2, false));
        this.w.updateColors();
        this.f.setTextColor(bkb.w0(null, i2, false));
        this.n.setTextColor(bkb.w0(null, i2, false));
        this.r.setTextColor(bkb.w0(null, i, false));
        this.s.setTextColor(bkb.w0(null, bkb.p7, false));
        this.a.invalidate();
    }
}
