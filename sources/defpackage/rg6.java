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
public final class rg6 extends kla implements jm7 {
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final s09 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final p09 Q;
    public final p09 R;
    public final p09 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final p09 a;
    public final Object a0;
    public String b;
    public int b0;
    public String c;
    public int c0;
    public String d;
    public double d0;
    public String e;
    public double e0;
    public final tk2 f;
    public boolean f0;
    public boolean g0;
    public final pe6 h;
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
    public final s09 s;
    public TLRPC.TL_auth_sentCode s0;
    public boolean t0;
    public final dg6 u0;
    public final mh6 v0;
    public final ng6 w;
    public final ye6 x;
    public final ng6 y;

    public rg6(defpackage.mh6 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg6.<init>(mh6, android.content.Context, int):void");
    }

    public static void p(p09 p09Var) {
        if (p09Var != null) {
            p09Var.L(cmb.w0(null, cmb.O9, false), "Bubble");
            int i = cmb.F6;
            p09Var.L(cmb.w0(null, i, false), "Phone");
            p09Var.L(cmb.w0(null, i, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z) {
        float f;
        ng6 ng6Var = this.y;
        if (ng6Var != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (ng6Var.getAlpha() != f) {
                ng6Var.animate().cancel();
                ng6Var.animate().alpha(f).setDuration(150L).start();
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
        mh6 mh6Var = this.v0;
        if (mh6Var.G != 0) {
            mh6Var.finishFragment();
            return false;
        }
        int i2 = this.k0;
        if (i2 != 0) {
            mh6Var.J1(i2, true, null, true);
            return false;
        } else if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
            String M0 = jb6.M0(2131751200, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = gm.S2(jb6.a0("EditNumberInfo", null, 2131751199, this.b));
            alertDialog$Builder.j(jb6.M0(2131751978, null), null);
            alertDialog$Builder.g(jb6.M0(2131751272, null), new fg6(this, (byte) 0));
            mh6Var.showDialog(heVar);
            return false;
        } else {
            this.g0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.c;
            i = ((d) mh6Var).currentAccount;
            ConnectionsManager.getInstance(i).sendRequest(tL_auth_cancelCode, new nf2((byte) 0), 10);
            t();
            s();
            this.I = null;
            int i3 = nm7.k4;
            byte b = this.i0;
            if (b == 15) {
                nm7.e().n(this, i3);
            } else if (b == 2) {
                gm.y3(false);
                nm7.e().n(this, i3);
            } else if (b == 3) {
                gm.x3(false);
                nm7.e().n(this, nm7.l4);
            }
            this.f0 = false;
            return true;
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.f0) {
            tk2 tk2Var = this.f;
            if (tk2Var.f != null) {
                if (i == nm7.k4) {
                    tk2Var.setText(String.valueOf(objArr[0]));
                    h(null);
                } else if (i == nm7.l4) {
                    String valueOf = String.valueOf(objArr[0]);
                    if (gm.x(this.m0, valueOf)) {
                        if (!this.m0.equals("*")) {
                            this.o0 = valueOf;
                            gm.T();
                        }
                        h(valueOf);
                        int i3 = CallReceiver.a;
                        gda.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
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
        int i = nm7.k4;
        byte b = this.i0;
        if (b == 15) {
            nm7.e().n(this, i);
        } else if (b == 2) {
            gm.y3(false);
            nm7.e().n(this, i);
        } else if (b == 3) {
            gm.x3(false);
            nm7.e().n(this, nm7.l4);
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
            return jb6.M0(2131742490, "YourCode");
        }
        return this.b;
    }

    @Override
    public final void h(String str) {
        int i;
        int i2;
        int i3;
        mh6 mh6Var = this.v0;
        int i4 = mh6Var.a;
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
        tk2 tk2Var = this.f;
        if (str == null) {
            str = tk2Var.getCode();
        }
        int i5 = 0;
        if (TextUtils.isEmpty(str)) {
            mh6.E1(tk2Var, false);
            return;
        }
        int i6 = mh6Var.a;
        if (i6 < 1 || i6 > 4 || !tk2Var.e) {
            this.g0 = true;
            int i7 = nm7.k4;
            byte b = this.i0;
            if (b == 15) {
                nm7.e().n(this, i7);
            } else if (b == 2) {
                gm.y3(false);
                nm7.e().n(this, i7);
            } else if (b == 3) {
                nm7.e().n(this, nm7.l4);
            }
            this.f0 = false;
            byte b2 = mh6Var.G;
            if (b2 != 1) {
                if (b2 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.c;
                    tL_auth_signIn.flags |= 1;
                    t();
                    tk2Var.e = true;
                    for (gl2 gl2Var : tk2Var.f) {
                        gl2Var.B(0.0f);
                    }
                    i3 = ((d) mh6Var).currentAccount;
                    z(ConnectionsManager.getInstance(i3).sendRequest(tL_auth_signIn, new eg6(this, tL_auth_signIn, (byte) 0), 10));
                    mh6Var.K1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                t();
                tk2Var.e = true;
                gl2[] gl2VarArr = tk2Var.f;
                int length = gl2VarArr.length;
                while (i5 < length) {
                    gl2VarArr[i5].B(0.0f);
                    i5++;
                }
                i2 = ((d) mh6Var).currentAccount;
                z(ConnectionsManager.getInstance(i2).sendRequest(changephone, new r15(this, (byte) 8), 2));
                mh6Var.K1(true, true);
                return;
            }
            this.d = mh6Var.H;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.c;
            t();
            tk2Var.e = true;
            gl2[] gl2VarArr2 = tk2Var.f;
            int length2 = gl2VarArr2.length;
            while (i5 < length2) {
                gl2VarArr2[i5].B(0.0f);
                i5++;
            }
            i = ((d) mh6Var).currentAccount;
            z(ConnectionsManager.getInstance(i).sendRequest(confirmphone, new cx3(this, confirmphone, (byte) 21), 2));
        }
    }

    @Override
    public final void j() {
        p09 p09Var = this.a;
        if (p09Var != null) {
            p09Var.H(0);
        }
        gm.d3(new dg6(this, (byte) 0), mh6.A0);
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
            tk2 tk2Var = this.f;
            if (tk2Var.f != null) {
                tk2Var.setText(string2);
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
            bundle.putBundle(hg9.j(b, "smsview_params_"), this.I);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg6.m(android.os.Bundle, boolean):void");
    }

    public final void o(Runnable runnable) {
        if (this.i0 == 3) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            tk2 tk2Var = this.f;
            gl2[] gl2VarArr = tk2Var.f;
            if (i < gl2VarArr.length) {
                tk2Var.postDelayed(new ig6(this, i, (byte) 2), i * 75);
                i++;
            } else {
                tk2Var.postDelayed(new k16(this, runnable, (byte) 25), (gl2VarArr.length * 75) + 400);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        gl2[] gl2VarArr;
        boolean z;
        super.onConfigurationChanged(configuration);
        tk2 tk2Var = this.f;
        if (tk2Var != null && (gl2VarArr = tk2Var.f) != null) {
            for (gl2 gl2Var : gl2VarArr) {
                if (a() && !gm.A1()) {
                    z = false;
                } else {
                    z = true;
                }
                gl2Var.setShowSoftInputOnFocusCompat(z);
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
        this.V.schedule(new qg6(this, (byte) 0), 0L, 1000L);
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        int i = cmb.C6;
        ng6 ng6Var = this.w;
        anb.X(ng6Var, i, null);
        ng6Var.setTag(2131296388, Integer.valueOf(i));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new qg6(this, (byte) 1), 0L, 1000L);
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
            fc4.g(e, true);
        }
    }

    public final void t() {
        ng6 ng6Var = this.w;
        int i = cmb.C6;
        anb.X(ng6Var, i, null);
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
            fc4.g(e, true);
        }
    }

    public final void u(android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg6.u(android.content.Context):void");
    }

    @Override
    public final void updateColors() {
        int i;
        if (this.v0.G == 1) {
            i = cmb.F6;
        } else {
            i = cmb.C6;
        }
        int w0 = cmb.w0(null, i, false);
        TextView textView = this.n;
        textView.setTextColor(w0);
        textView.setLinkTextColor(cmb.w0(null, cmb.O9, false));
        int i2 = cmb.F6;
        this.r.setTextColor(cmb.w0(null, i2, false));
        byte b = this.i0;
        if (b == 11) {
            int i3 = cmb.x6;
            this.K.setTextColor(cmb.w0(null, i3, false));
            this.L.setTextColor(cmb.w0(null, i3, false));
            int w02 = cmb.w0(null, cmb.k6, false);
            int i4 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mh6.m1(this.M, w02, i4, mode);
            this.O = w02;
            int w03 = cmb.w0(null, i2, false);
            mh6.m1(this.N, w03, this.P, mode);
            this.P = w03;
            this.J.setTextColor(cmb.w0(null, i2, false));
        }
        p(this.a);
        p(this.Q);
        p(this.R);
        p(this.S);
        tk2 tk2Var = this.f;
        if (tk2Var != null) {
            tk2Var.invalidate();
        }
        ng6 ng6Var = this.w;
        Integer num = (Integer) ng6Var.getTag();
        if (num == null) {
            num = Integer.valueOf(cmb.C6);
        }
        ng6Var.setTextColor(cmb.w0(null, num.intValue(), false));
        if (b != 15) {
            this.y.setTextColor(cmb.w0(null, cmb.p6, false));
        }
        this.F.setTextColor(cmb.w0(null, cmb.p7, false));
    }

    public final void v() {
        int i;
        if (!this.g0 && !this.l0) {
            mh6 mh6Var = this.v0;
            if (!mh6Var.r0) {
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
                i = ((d) mh6Var).currentAccount;
                z(ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new hg6(this, bundle, (byte) 1), 10));
            }
        }
    }

    public final void x() {
        float f;
        tk2 tk2Var = this.f;
        try {
            tk2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i = 0;
        while (true) {
            gl2[] gl2VarArr = tk2Var.f;
            if (i >= gl2VarArr.length) {
                break;
            }
            gl2VarArr[i].setText("");
            tk2Var.f[i].A(1.0f);
            i++;
        }
        ye6 ye6Var = this.x;
        if (ye6Var.getCurrentView() != this.F) {
            ye6Var.showNext();
        }
        tk2Var.f[0].requestFocus();
        if (this.i0 == 11) {
            f = 3.5f;
        } else {
            f = 10.0f;
        }
        gm.A3(f, tk2Var, new dg6(this, (byte) 7));
        dg6 dg6Var = this.u0;
        removeCallbacks(dg6Var);
        postDelayed(dg6Var, 5000L);
        this.t0 = true;
    }

    public final void y(boolean z) {
        if (this.Q != null) {
            if (!this.T) {
                return;
            }
            this.T = false;
            this.s.setAutoRepeat(false);
            p09 p09Var = this.R;
            p09Var.F(0);
            p09Var.N(p09Var.e[0] - 1, new dg6(this, (byte) 1));
            return;
        }
        this.v0.y1(z, true);
    }

    public final void z(int i) {
        p09 p09Var = this.Q;
        if (p09Var != null) {
            if (this.T) {
                return;
            }
            this.T = true;
            p09 p09Var2 = this.a;
            if (p09Var2.b0 != p09Var2.e[0] - 1) {
                p09Var2.u0 = new ig6(this, i, (byte) 0);
                return;
            }
            p09Var.u0 = new dg6(this, (byte) 3);
            s09 s09Var = this.s;
            s09Var.setAutoRepeat(false);
            p09Var.I(0, false, false);
            s09Var.setAnimation(p09Var);
            s09Var.d();
            return;
        }
        this.v0.B1(i, true);
    }
}
