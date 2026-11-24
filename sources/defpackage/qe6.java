package defpackage;

import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.CallReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class qe6 extends jja implements gk7 {
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final ry8 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final oy8 Q;
    public final oy8 R;
    public final oy8 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final oy8 a;
    public final Object a0;
    public String b;
    public int b0;
    public String c;
    public int c0;
    public String d;
    public double d0;
    public String e;
    public double e0;
    public final fj2 f;
    public boolean f0;
    public boolean g0;
    public final qc6 h;
    public String h0;
    public final byte i0;
    public int j0;
    public int k0;
    public boolean l0;
    public String m0;
    public final TextView n;
    public String n0;
    public String o0;
    public int p0;
    public String q0;
    public final TextView r;
    public Bundle r0;
    public final ry8 s;
    public TLRPC.TL_auth_sentCode s0;
    public boolean t0;
    public final ee6 u0;
    public final mf6 v0;
    public final oe6 w;
    public final zc6 x;
    public final oe6 y;

    public qe6(defpackage.mf6 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe6.<init>(mf6, android.content.Context, int):void");
    }

    public static void p(oy8 oy8Var) {
        if (oy8Var != null) {
            oy8Var.L(bkb.w0(null, bkb.O9, false), "Bubble");
            int i = bkb.F6;
            oy8Var.L(bkb.w0(null, i, false), "Phone");
            oy8Var.L(bkb.w0(null, i, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z) {
        float f;
        oe6 oe6Var = this.y;
        if (oe6Var != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (oe6Var.getAlpha() != f) {
                oe6Var.animate().cancel();
                oe6Var.animate().alpha(f).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.i0 != 3) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean d(boolean z) {
        int i;
        mf6 mf6Var = this.v0;
        if (mf6Var.G != 0) {
            mf6Var.finishFragment();
            return false;
        }
        int i2 = this.k0;
        if (i2 != 0) {
            mf6Var.I1(i2, true, null, true);
            return false;
        } else if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
            String M0 = k96.M0(2131751251, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = gl.T2(k96.a0("EditNumberInfo", null, 2131751250, this.b));
            alertDialog$Builder.j(k96.M0(2131752029, null), null);
            alertDialog$Builder.g(k96.M0(2131751323, null), new ge6(this, (byte) 0));
            mf6Var.showDialog(hdVar);
            return false;
        } else {
            this.g0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.c;
            i = ((d) mf6Var).currentAccount;
            ConnectionsManager.getInstance(i).sendRequest(tL_auth_cancelCode, new ce2((byte) 0), 10);
            t();
            s();
            this.I = null;
            int i3 = kk7.i4;
            byte b = this.i0;
            if (b == 15) {
                kk7.e().n(this, i3);
            } else if (b == 2) {
                gl.z3(false);
                kk7.e().n(this, i3);
            } else if (b == 3) {
                gl.y3(false);
                kk7.e().n(this, kk7.j4);
            }
            this.f0 = false;
            return true;
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.f0) {
            fj2 fj2Var = this.f;
            if (fj2Var.f != null) {
                if (i == kk7.i4) {
                    fj2Var.setText(String.valueOf(objArr[0]));
                    h(null);
                } else if (i == kk7.j4) {
                    String valueOf = String.valueOf(objArr[0]);
                    if (gl.x(this.m0, valueOf)) {
                        if (!this.m0.equals("*")) {
                            this.o0 = valueOf;
                            gl.T();
                        }
                        h(valueOf);
                        int i3 = CallReceiver.a;
                        gba.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void e() {
        this.g0 = false;
    }

    @Override
    public final void f() {
        int i = kk7.i4;
        byte b = this.i0;
        if (b == 15) {
            kk7.e().n(this, i);
        } else if (b == 2) {
            gl.z3(false);
            kk7.e().n(this, i);
        } else if (b == 3) {
            gl.y3(false);
            kk7.e().n(this, kk7.j4);
        }
        this.f0 = false;
        t();
        s();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.l0 = false;
        this.g0 = false;
        if (this.k0 != 0 && (bundle = this.I) != null) {
            bundle.putInt("timeout", this.b0);
        }
    }

    @Override
    public String getHeaderName() {
        byte b = this.i0;
        if (b != 3 && b != 11) {
            return k96.M0(2131742564, "YourCode");
        }
        return this.b;
    }

    @Override
    public final void h(String str) {
        int i;
        int i2;
        int i3;
        mf6 mf6Var = this.v0;
        int i4 = mf6Var.a;
        boolean z = this.g0;
        if (i4 == 11) {
            if (z) {
                return;
            }
        } else if (!z) {
            if ((i4 < 1 || i4 > 4) && i4 != 15) {
                return;
            }
        } else {
            return;
        }
        fj2 fj2Var = this.f;
        if (str == null) {
            str = fj2Var.getCode();
        }
        int i5 = 0;
        if (TextUtils.isEmpty(str)) {
            mf6.D1(fj2Var, false);
            return;
        }
        int i6 = mf6Var.a;
        if (i6 < 1 || i6 > 4 || !fj2Var.e) {
            this.g0 = true;
            int i7 = kk7.i4;
            byte b = this.i0;
            if (b == 15) {
                kk7.e().n(this, i7);
            } else if (b == 2) {
                gl.z3(false);
                kk7.e().n(this, i7);
            } else if (b == 3) {
                kk7.e().n(this, kk7.j4);
            }
            this.f0 = false;
            byte b2 = mf6Var.G;
            if (b2 != 1) {
                if (b2 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.c;
                    tL_auth_signIn.flags |= 1;
                    t();
                    fj2Var.e = true;
                    for (sj2 sj2Var : fj2Var.f) {
                        sj2Var.B(0.0f);
                    }
                    i3 = ((d) mf6Var).currentAccount;
                    z(ConnectionsManager.getInstance(i3).sendRequest(tL_auth_signIn, new fe6(this, tL_auth_signIn, (byte) 0), 10));
                    mf6Var.J1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                t();
                fj2Var.e = true;
                sj2[] sj2VarArr = fj2Var.f;
                int length = sj2VarArr.length;
                while (i5 < length) {
                    sj2VarArr[i5].B(0.0f);
                    i5++;
                }
                i2 = ((d) mf6Var).currentAccount;
                z(ConnectionsManager.getInstance(i2).sendRequest(changephone, new n35(this, (byte) 7), 2));
                mf6Var.J1(true, true);
                return;
            }
            this.d = mf6Var.H;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.c;
            t();
            fj2Var.e = true;
            sj2[] sj2VarArr2 = fj2Var.f;
            int length2 = sj2VarArr2.length;
            while (i5 < length2) {
                sj2VarArr2[i5].B(0.0f);
                i5++;
            }
            i = ((d) mf6Var).currentAccount;
            z(ConnectionsManager.getInstance(i).sendRequest(confirmphone, new rv3(this, confirmphone, (byte) 21), 2));
        }
    }

    @Override
    public final void j() {
        oy8 oy8Var = this.a;
        if (oy8Var != null) {
            oy8Var.H(0);
        }
        gl.e3(new ee6(this, (byte) 0), mf6.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb = new StringBuilder("smsview_params_");
        byte b = this.i0;
        sb.append((int) b);
        Bundle bundle2 = bundle.getBundle(sb.toString());
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.o0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + ((int) b));
        if (string2 != null) {
            fj2 fj2Var = this.f;
            if (fj2Var.f != null) {
                fj2Var.setText(string2);
            }
        }
        int i = bundle.getInt("time");
        if (i != 0) {
            this.b0 = i;
        }
        int i2 = bundle.getInt("open");
        if (i2 != 0) {
            this.W = i2;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        byte b = this.i0;
        if (length != 0) {
            bundle.putString("smsview_code_" + ((int) b), code);
        }
        String str = this.o0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.I != null) {
            bundle.putBundle(de9.k(b, "smsview_params_"), this.I);
        }
        int i = this.b0;
        if (i != 0) {
            bundle.putInt("time", i);
        }
        int i2 = this.W;
        if (i2 != 0) {
            bundle.putInt("open", i2);
        }
    }

    @Override
    public final void m(android.os.Bundle r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe6.m(android.os.Bundle, boolean):void");
    }

    public final void o(Runnable runnable) {
        if (this.i0 == 3) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            fj2 fj2Var = this.f;
            sj2[] sj2VarArr = fj2Var.f;
            if (i < sj2VarArr.length) {
                fj2Var.postDelayed(new je6(this, i, (byte) 2), i * 75);
                i++;
            } else {
                fj2Var.postDelayed(new kz5(this, runnable, (byte) 24), (sj2VarArr.length * 75) + 400);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        sj2[] sj2VarArr;
        boolean z;
        super.onConfigurationChanged(configuration);
        fj2 fj2Var = this.f;
        if (fj2Var != null && (sj2VarArr = fj2Var.f) != null) {
            for (sj2 sj2Var : sj2VarArr) {
                if (a() && !gl.A1()) {
                    z = false;
                } else {
                    z = true;
                }
                sj2Var.setShowSoftInputOnFocusCompat(z);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.u0);
    }

    public final void q() {
        if (this.V != null) {
            return;
        }
        this.c0 = 15000;
        int i = this.b0;
        if (i > 15000) {
            this.c0 = i;
        }
        this.V = new Timer();
        this.e0 = System.currentTimeMillis();
        this.V.schedule(new pe6(this, (byte) 0), 0L, 1000L);
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        int i = bkb.C6;
        oe6 oe6Var = this.w;
        zkb.X(oe6Var, i, null);
        oe6Var.setTag(2131296388, Integer.valueOf(i));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new pe6(this, (byte) 1), 0L, 1000L);
    }

    public final void s() {
        try {
            synchronized (this.a0) {
                Timer timer = this.V;
                if (timer != null) {
                    timer.cancel();
                    this.V = null;
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void t() {
        oe6 oe6Var = this.w;
        int i = bkb.C6;
        zkb.X(oe6Var, i, null);
        this.w.setTag(2131296388, Integer.valueOf(i));
        try {
            synchronized (this.a0) {
                Timer timer = this.U;
                if (timer != null) {
                    timer.cancel();
                    this.U = null;
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void u(android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe6.u(android.content.Context):void");
    }

    @Override
    public final void updateColors() {
        int i;
        if (this.v0.G == 1) {
            i = bkb.F6;
        } else {
            i = bkb.C6;
        }
        int w0 = bkb.w0(null, i, false);
        TextView textView = this.n;
        textView.setTextColor(w0);
        textView.setLinkTextColor(bkb.w0(null, bkb.O9, false));
        int i2 = bkb.F6;
        this.r.setTextColor(bkb.w0(null, i2, false));
        byte b = this.i0;
        if (b == 11) {
            int i3 = bkb.x6;
            this.K.setTextColor(bkb.w0(null, i3, false));
            this.L.setTextColor(bkb.w0(null, i3, false));
            int w02 = bkb.w0(null, bkb.k6, false);
            int i4 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mf6.l1(this.M, w02, i4, mode);
            this.O = w02;
            int w03 = bkb.w0(null, i2, false);
            mf6.l1(this.N, w03, this.P, mode);
            this.P = w03;
            this.J.setTextColor(bkb.w0(null, i2, false));
        }
        p(this.a);
        p(this.Q);
        p(this.R);
        p(this.S);
        fj2 fj2Var = this.f;
        if (fj2Var != null) {
            fj2Var.invalidate();
        }
        oe6 oe6Var = this.w;
        Integer num = (Integer) oe6Var.getTag();
        if (num == null) {
            num = Integer.valueOf(bkb.C6);
        }
        oe6Var.setTextColor(bkb.w0(null, num.intValue(), false));
        if (b != 15) {
            this.y.setTextColor(bkb.w0(null, bkb.p6, false));
        }
        this.F.setTextColor(bkb.w0(null, bkb.p7, false));
    }

    public final void v() {
        int i;
        if (!this.g0 && !this.l0) {
            mf6 mf6Var = this.v0;
            if (!mf6Var.r0) {
                this.l0 = true;
                this.w.invalidate();
                this.y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.i0);
                this.g0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.c;
                i = ((d) mf6Var).currentAccount;
                z(ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new ie6(this, bundle, (byte) 1), 10));
            }
        }
    }

    public final void w() {
        float f;
        fj2 fj2Var = this.f;
        try {
            fj2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i = 0;
        while (true) {
            sj2[] sj2VarArr = fj2Var.f;
            if (i >= sj2VarArr.length) {
                break;
            }
            sj2VarArr[i].setText("");
            fj2Var.f[i].A(1.0f);
            i++;
        }
        zc6 zc6Var = this.x;
        if (zc6Var.getCurrentView() != this.F) {
            zc6Var.showNext();
        }
        fj2Var.f[0].requestFocus();
        if (this.i0 == 11) {
            f = 3.5f;
        } else {
            f = 10.0f;
        }
        gl.B3(f, fj2Var, new ee6(this, (byte) 7));
        ee6 ee6Var = this.u0;
        removeCallbacks(ee6Var);
        postDelayed(ee6Var, 5000L);
        this.t0 = true;
    }

    public final void y(boolean z) {
        if (this.Q != null) {
            if (!this.T) {
                return;
            }
            this.T = false;
            this.s.setAutoRepeat(false);
            oy8 oy8Var = this.R;
            oy8Var.F(0);
            oy8Var.N(oy8Var.e[0] - 1, new ee6(this, (byte) 1));
            return;
        }
        this.v0.x1(z, true);
    }

    public final void z(int i) {
        oy8 oy8Var = this.Q;
        if (oy8Var != null) {
            if (this.T) {
                return;
            }
            this.T = true;
            oy8 oy8Var2 = this.a;
            if (oy8Var2.b0 != oy8Var2.e[0] - 1) {
                oy8Var2.u0 = new je6(this, i, (byte) 0);
                return;
            }
            oy8Var.u0 = new ee6(this, (byte) 3);
            ry8 ry8Var = this.s;
            ry8Var.setAutoRepeat(false);
            oy8Var.I(0, false, false);
            ry8Var.setAnimation(oy8Var);
            ry8Var.d();
            return;
        }
        this.v0.A1(i, true);
    }
}
