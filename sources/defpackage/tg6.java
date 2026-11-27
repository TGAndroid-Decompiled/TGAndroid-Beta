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
import org.telegram.ui.ActionBar.e;
public final class tg6 extends cna implements fn7 {
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final e29 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final b29 Q;
    public final b29 R;
    public final b29 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final b29 a;
    public final Object a0;
    public String b;
    public int b0;
    public String c;
    public int c0;
    public String d;
    public double d0;
    public String e;
    public double e0;
    public final bk2 f;
    public boolean f0;
    public boolean g0;
    public final te6 h;
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
    public final e29 s;
    public TLRPC.TL_auth_sentCode s0;
    public boolean t0;
    public final gg6 u0;
    public final qh6 v0;
    public final rg6 w;
    public final cf6 x;
    public final rg6 y;

    public tg6(defpackage.qh6 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg6.<init>(qh6, android.content.Context, int):void");
    }

    public static void p(b29 b29Var) {
        if (b29Var != null) {
            b29Var.L(aob.w0(null, aob.P9, false), "Bubble");
            int i = aob.G6;
            b29Var.L(aob.w0(null, i, false), "Phone");
            b29Var.L(aob.w0(null, i, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z) {
        float f;
        rg6 rg6Var = this.y;
        if (rg6Var != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (rg6Var.getAlpha() != f) {
                rg6Var.animate().cancel();
                rg6Var.animate().alpha(f).setDuration(150L).start();
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
    public final boolean c(boolean z) {
        int i;
        qh6 qh6Var = this.v0;
        if (qh6Var.G != 0) {
            qh6Var.finishFragment();
            return false;
        }
        int i2 = this.k0;
        if (i2 != 0) {
            qh6Var.J1(i2, true, null, true);
            return false;
        } else if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
            String M0 = ob6.M0(2131751228, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = hl.S2(ob6.a0("EditNumberInfo", null, 2131751227, this.b));
            alertDialog$Builder.j(ob6.M0(2131752006, null), null);
            alertDialog$Builder.g(ob6.M0(2131751300, null), new ig6(this, (byte) 0));
            qh6Var.showDialog(idVar);
            return false;
        } else {
            this.g0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.c;
            i = ((e) qh6Var).currentAccount;
            ConnectionsManager.getInstance(i).sendRequest(tL_auth_cancelCode, new xe2((byte) 0), 10);
            t();
            s();
            this.I = null;
            int i3 = jn7.j4;
            byte b = this.i0;
            if (b == 15) {
                jn7.e().n(this, i3);
            } else if (b == 2) {
                hl.y3(false);
                jn7.e().n(this, i3);
            } else if (b == 3) {
                hl.x3(false);
                jn7.e().n(this, jn7.k4);
            }
            this.f0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.g0 = false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.f0) {
            bk2 bk2Var = this.f;
            if (bk2Var.f != null) {
                if (i == jn7.j4) {
                    bk2Var.setText(String.valueOf(objArr[0]));
                    h(null);
                } else if (i == jn7.k4) {
                    String valueOf = String.valueOf(objArr[0]);
                    if (hl.x(this.m0, valueOf)) {
                        if (!this.m0.equals("*")) {
                            this.o0 = valueOf;
                            hl.T();
                        }
                        h(valueOf);
                        int i3 = CallReceiver.a;
                        xea.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void e() {
        int i = jn7.j4;
        byte b = this.i0;
        if (b == 15) {
            jn7.e().n(this, i);
        } else if (b == 2) {
            hl.y3(false);
            jn7.e().n(this, i);
        } else if (b == 3) {
            hl.x3(false);
            jn7.e().n(this, jn7.k4);
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
            return ob6.M0(2131742458, "YourCode");
        }
        return this.b;
    }

    @Override
    public final void h(String str) {
        int i;
        int i2;
        int i3;
        qh6 qh6Var = this.v0;
        int i4 = qh6Var.a;
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
        bk2 bk2Var = this.f;
        if (str == null) {
            str = bk2Var.getCode();
        }
        int i5 = 0;
        if (TextUtils.isEmpty(str)) {
            qh6.E1(bk2Var, false);
            return;
        }
        int i6 = qh6Var.a;
        if (i6 < 1 || i6 > 4 || !bk2Var.e) {
            this.g0 = true;
            int i7 = jn7.j4;
            byte b = this.i0;
            if (b == 15) {
                jn7.e().n(this, i7);
            } else if (b == 2) {
                hl.y3(false);
                jn7.e().n(this, i7);
            } else if (b == 3) {
                jn7.e().n(this, jn7.k4);
            }
            this.f0 = false;
            byte b2 = qh6Var.G;
            if (b2 != 1) {
                if (b2 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.c;
                    tL_auth_signIn.flags |= 1;
                    t();
                    bk2Var.e = true;
                    for (ok2 ok2Var : bk2Var.f) {
                        ok2Var.B(0.0f);
                    }
                    i3 = ((e) qh6Var).currentAccount;
                    z(ConnectionsManager.getInstance(i3).sendRequest(tL_auth_signIn, new hg6(this, tL_auth_signIn, (byte) 0), 10));
                    qh6Var.K1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                t();
                bk2Var.e = true;
                ok2[] ok2VarArr = bk2Var.f;
                int length = ok2VarArr.length;
                while (i5 < length) {
                    ok2VarArr[i5].B(0.0f);
                    i5++;
                }
                i2 = ((e) qh6Var).currentAccount;
                z(ConnectionsManager.getInstance(i2).sendRequest(changephone, new w15(this, (byte) 8), 2));
                qh6Var.K1(true, true);
                return;
            }
            this.d = qh6Var.H;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.c;
            t();
            bk2Var.e = true;
            ok2[] ok2VarArr2 = bk2Var.f;
            int length2 = ok2VarArr2.length;
            while (i5 < length2) {
                ok2VarArr2[i5].B(0.0f);
                i5++;
            }
            i = ((e) qh6Var).currentAccount;
            z(ConnectionsManager.getInstance(i).sendRequest(confirmphone, new mw3(this, confirmphone, (byte) 21), 2));
        }
    }

    @Override
    public final void j() {
        b29 b29Var = this.a;
        if (b29Var != null) {
            b29Var.H(0);
        }
        hl.d3(new gg6(this, (byte) 0), qh6.A0);
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
            bk2 bk2Var = this.f;
            if (bk2Var.f != null) {
                bk2Var.setText(string2);
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
            bundle.putBundle(uh9.k(b, "smsview_params_"), this.I);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg6.m(android.os.Bundle, boolean):void");
    }

    public final void o(Runnable runnable) {
        if (this.i0 == 3) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            bk2 bk2Var = this.f;
            ok2[] ok2VarArr = bk2Var.f;
            if (i < ok2VarArr.length) {
                bk2Var.postDelayed(new lg6(this, i, (byte) 2), i * 75);
                i++;
            } else {
                bk2Var.postDelayed(new z56(this, runnable, (byte) 21), (ok2VarArr.length * 75) + 400);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ok2[] ok2VarArr;
        boolean z;
        super.onConfigurationChanged(configuration);
        bk2 bk2Var = this.f;
        if (bk2Var != null && (ok2VarArr = bk2Var.f) != null) {
            for (ok2 ok2Var : ok2VarArr) {
                if (a() && !hl.A1()) {
                    z = false;
                } else {
                    z = true;
                }
                ok2Var.setShowSoftInputOnFocusCompat(z);
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
        this.V.schedule(new sg6(this, (byte) 0), 0L, 1000L);
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        int i = aob.D6;
        rg6 rg6Var = this.w;
        yob.X(rg6Var, i, null);
        rg6Var.setTag(2131296388, Integer.valueOf(i));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new sg6(this, (byte) 1), 0L, 1000L);
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
            cc4.g(e, true);
        }
    }

    public final void t() {
        rg6 rg6Var = this.w;
        int i = aob.D6;
        yob.X(rg6Var, i, null);
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
            cc4.g(e, true);
        }
    }

    public final void u(android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg6.u(android.content.Context):void");
    }

    @Override
    public final void updateColors() {
        int i;
        if (this.v0.G == 1) {
            i = aob.G6;
        } else {
            i = aob.D6;
        }
        int w0 = aob.w0(null, i, false);
        TextView textView = this.n;
        textView.setTextColor(w0);
        textView.setLinkTextColor(aob.w0(null, aob.P9, false));
        int i2 = aob.G6;
        this.r.setTextColor(aob.w0(null, i2, false));
        byte b = this.i0;
        if (b == 11) {
            int i3 = aob.y6;
            this.K.setTextColor(aob.w0(null, i3, false));
            this.L.setTextColor(aob.w0(null, i3, false));
            int w02 = aob.w0(null, aob.l6, false);
            int i4 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            qh6.m1(this.M, w02, i4, mode);
            this.O = w02;
            int w03 = aob.w0(null, i2, false);
            qh6.m1(this.N, w03, this.P, mode);
            this.P = w03;
            this.J.setTextColor(aob.w0(null, i2, false));
        }
        p(this.a);
        p(this.Q);
        p(this.R);
        p(this.S);
        bk2 bk2Var = this.f;
        if (bk2Var != null) {
            bk2Var.invalidate();
        }
        rg6 rg6Var = this.w;
        Integer num = (Integer) rg6Var.getTag();
        if (num == null) {
            num = Integer.valueOf(aob.D6);
        }
        rg6Var.setTextColor(aob.w0(null, num.intValue(), false));
        if (b != 15) {
            this.y.setTextColor(aob.w0(null, aob.q6, false));
        }
        this.F.setTextColor(aob.w0(null, aob.q7, false));
    }

    public final void v() {
        int i;
        if (!this.g0 && !this.l0) {
            qh6 qh6Var = this.v0;
            if (!qh6Var.r0) {
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
                i = ((e) qh6Var).currentAccount;
                z(ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new kg6(this, bundle, (byte) 1), 10));
            }
        }
    }

    public final void w() {
        float f;
        bk2 bk2Var = this.f;
        try {
            bk2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i = 0;
        while (true) {
            ok2[] ok2VarArr = bk2Var.f;
            if (i >= ok2VarArr.length) {
                break;
            }
            ok2VarArr[i].setText("");
            bk2Var.f[i].A(1.0f);
            i++;
        }
        cf6 cf6Var = this.x;
        if (cf6Var.getCurrentView() != this.F) {
            cf6Var.showNext();
        }
        bk2Var.f[0].requestFocus();
        if (this.i0 == 11) {
            f = 3.5f;
        } else {
            f = 10.0f;
        }
        hl.A3(f, bk2Var, new gg6(this, (byte) 7));
        gg6 gg6Var = this.u0;
        removeCallbacks(gg6Var);
        postDelayed(gg6Var, 5000L);
        this.t0 = true;
    }

    public final void y(boolean z) {
        if (this.Q != null) {
            if (!this.T) {
                return;
            }
            this.T = false;
            this.s.setAutoRepeat(false);
            b29 b29Var = this.R;
            b29Var.F(0);
            b29Var.N(b29Var.e[0] - 1, new gg6(this, (byte) 1));
            return;
        }
        this.v0.y1(z, true);
    }

    public final void z(int i) {
        b29 b29Var = this.Q;
        if (b29Var != null) {
            if (this.T) {
                return;
            }
            this.T = true;
            b29 b29Var2 = this.a;
            if (b29Var2.b0 != b29Var2.e[0] - 1) {
                b29Var2.u0 = new lg6(this, i, (byte) 0);
                return;
            }
            b29Var.u0 = new gg6(this, (byte) 3);
            e29 e29Var = this.s;
            e29Var.setAutoRepeat(false);
            b29Var.I(0, false, false);
            e29Var.setAnimation(b29Var);
            e29Var.d();
            return;
        }
        this.v0.B1(i, true);
    }
}
