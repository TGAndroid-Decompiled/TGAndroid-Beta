package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class z8d implements ka1, v76, uv2, be8, cr7, bv9, l12, hcb, jc1, rb2, hj, y17, s84, rv9, a43, ra6 {
    public static z8d c;
    public static final gu4 d = new gu4((byte) 1);
    public static final jjf e = new jjf((byte) 1);
    public final byte a;
    public Object b;

    public z8d(byte b) {
        tkf tkfVar;
        d47 d47Var;
        this.a = b;
        switch (b) {
            case 2:
                try {
                    tkfVar = (tkf) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    tkfVar = e;
                }
                qkf qkfVar = new qkf(jjf.b, tkfVar);
                Charset charset = ujf.a;
                this.b = qkfVar;
                return;
            case 7:
                this.b = new AtomicInteger(0);
                return;
            case 9:
                this.b = new CopyOnWriteArrayList();
                return;
            case 24:
                return;
            case 26:
                this.b = new k09(lu4.l, (byte) 2);
                return;
            default:
                ow8 ow8Var = ow8.c;
                try {
                    d47Var = (d47) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused2) {
                    d47Var = d;
                }
                d47[] d47VarArr = {gu4.b, d47Var};
                ?? obj = new Object();
                obj.a = d47VarArr;
                Charset charset2 = pr5.a;
                this.b = obj;
                return;
        }
    }

    public static synchronized z8d B1(Context context) {
        z8d z8dVar;
        synchronized (z8d.class) {
            z8dVar = c;
            if (z8dVar == null) {
                z8dVar = new z8d(context);
                c = z8dVar;
            }
        }
        return z8dVar;
    }

    public static synchronized z8d s1(Context context) {
        z8d B1;
        synchronized (z8d.class) {
            B1 = B1(context.getApplicationContext());
        }
        return B1;
    }

    @Override
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override
    public final boolean B(String str, da1 da1Var) {
        return false;
    }

    @Override
    public final boolean B0(int i, View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void C(int i, int i2) {
        ((j79) this.b).p(i, i2);
    }

    @Override
    public final boolean C1(int i) {
        return true;
    }

    @Override
    public final TextureView D() {
        return null;
    }

    @Override
    public final zh6 D0() {
        return null;
    }

    @Override
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final void H0(int i, int i2, CharSequence charSequence, boolean z) {
        n12 n12Var = (n12) this.b;
        if (n12Var.V0() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n12Var.V0().getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                pv3.l(spannableStringBuilder, n12Var.V0().getEditText().getPaint().getFontMetricsInt(), false);
            }
            n12Var.V0().setText(spannableStringBuilder);
            n12Var.V0().setSelection(i + charSequence.length());
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final String I() {
        return null;
    }

    @Override
    public final de8 J1() {
        return null;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean L1(long j) {
        return false;
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final int N() {
        return 0;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        jn7.f(g41.e0((g41) this.b)).d(vq0Var);
    }

    @Override
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public final void R0(ij0 ij0Var, hj0 hj0Var) {
        lq4 lq4Var = (lq4) this.b;
        if (lq4Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (lq4Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            lq4 lq4Var2 = (lq4) this.b;
            bj0 bj0Var = (bj0) lq4Var2.D("androidx.biometric.BiometricFragment");
            if (bj0Var == null) {
                bj0Var = new bj0();
                kd0 kd0Var = new kd0(lq4Var2);
                kd0Var.f(0, bj0Var, "androidx.biometric.BiometricFragment");
                kd0Var.e(true, true);
                lq4Var2.A(true);
                lq4Var2.E();
            }
            jp4 k = bj0Var.k();
            if (k == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            bj0Var.m0.d = ij0Var;
            int a = nrd.a(ij0Var, hj0Var);
            if (Build.VERSION.SDK_INT < 30 && a == 15 && hj0Var == null) {
                bj0Var.m0.e = hfe.a();
            } else {
                bj0Var.m0.e = hj0Var;
            }
            boolean R = bj0Var.R();
            mj0 mj0Var = bj0Var.m0;
            if (R) {
                mj0Var.i = bj0Var.q(2131689577);
            } else {
                mj0Var.i = null;
            }
            if (bj0Var.R() && new fj0(new ej0(k, (byte) 0)).a(255) != 0) {
                bj0Var.m0.l = true;
                bj0Var.T();
            } else if (bj0Var.m0.n) {
                bj0Var.l0.postDelayed(new aj0(bj0Var), 600L);
            } else {
                bj0Var.Y();
            }
        }
    }

    @Override
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override
    public final iv1 S() {
        return null;
    }

    @Override
    public final void S0(Object obj) {
        bj0 bj0Var = (bj0) this.b;
        if (((Boolean) obj).booleanValue()) {
            if (bj0Var.S()) {
                bj0Var.X(bj0Var.q(2131689614));
            }
            mj0 mj0Var = bj0Var.m0;
            if (!mj0Var.l) {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            } else {
                Executor executor = mj0Var.b;
                if (executor == null) {
                    executor = new zi0((byte) 1);
                }
                executor.execute(new si0(bj0Var, (byte) 0));
            }
            mj0 mj0Var2 = bj0Var.m0;
            qj7 qj7Var = mj0Var2.s;
            if (qj7Var == null) {
                qj7Var = new qj7();
                mj0Var2.s = qj7Var;
            }
            mj0.f(qj7Var, Boolean.FALSE);
        }
    }

    @Override
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    public final u53 W0() {
        Context context = (Context) this.b;
        if (context != null) {
            ?? obj = new Object();
            obj.a = qp3.a(aed.a);
            pq5 pq5Var = new pq5(context);
            obj.b = pq5Var;
            obj.c = qp3.a(new um4(pq5Var, new b23(pq5Var, (byte) 0), (byte) 12));
            pq5 pq5Var2 = obj.b;
            obj.d = new pq8(pq5Var2, (byte) 11);
            uw8 a = qp3.a(new ym4(obj.d, qp3.a(new b23(pq5Var2, (byte) 1)), (byte) 21));
            obj.e = a;
            z6f z6fVar = new z6f((byte) 25);
            pq5 pq5Var3 = obj.b;
            ko9 ko9Var = new ko9(pq5Var3, a, z6fVar, (byte) 2);
            uw8 uw8Var = obj.a;
            uw8 uw8Var2 = obj.c;
            am2 am2Var = new am2(uw8Var, uw8Var2, ko9Var, a, a, (byte) 5);
            ?? obj2 = new Object();
            obj2.a = pq5Var3;
            obj2.b = uw8Var2;
            obj2.c = a;
            obj2.d = ko9Var;
            obj2.e = uw8Var;
            obj2.f = a;
            obj2.h = a;
            obj.f = qp3.a(new ko9(am2Var, (Object) obj2, new lyc(uw8Var, a, ko9Var, a, (byte) 19), (byte) 9));
            return obj;
        }
        String canonicalName = Context.class.getCanonicalName();
        throw new IllegalStateException(canonicalName + " must be set");
    }

    @Override
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override
    public final void X(int i, int i2) {
        ((j79) this.b).q(i, i2);
    }

    public final defpackage.v93 X0(defpackage.vh4 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8d.X0(vh4):v93");
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final zh6 Z0() {
        return null;
    }

    @Override
    public final void a(float f) {
        switch (this.a) {
            case 12:
                return;
            default:
                bg3 bg3Var = (bg3) this.b;
                ag3[] ag3VarArr = bg3Var.f;
                int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i != 0 || ag3VarArr[1].getVisibility() == 0) {
                    if (bg3Var.r) {
                        ag3 ag3Var = ag3VarArr[0];
                        ag3Var.setTranslationX((-f) * ag3Var.getMeasuredWidth());
                        ag3VarArr[1].setTranslationX(ag3VarArr[0].getMeasuredWidth() - (f * ag3VarArr[0].getMeasuredWidth()));
                    } else {
                        ag3 ag3Var2 = ag3VarArr[0];
                        ag3Var2.setTranslationX(ag3Var2.getMeasuredWidth() * f);
                        ag3VarArr[1].setTranslationX((f * ag3VarArr[0].getMeasuredWidth()) - ag3VarArr[0].getMeasuredWidth());
                    }
                    if (i == 0) {
                        ag3 ag3Var3 = ag3VarArr[0];
                        ag3VarArr[0] = ag3VarArr[1];
                        ag3VarArr[1] = ag3Var3;
                        ag3Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void b0() {
        ((l33) this.b).d.invalidate();
    }

    @Override
    public final void c(int i, boolean z) {
        boolean z2;
        switch (this.a) {
            case 12:
                lo0 lo0Var = ((eo0) this.b).d;
                lo0Var.e0 = i;
                lo0Var.J0(true);
                return;
            default:
                bg3 bg3Var = (bg3) this.b;
                ag3[] ag3VarArr = bg3Var.f;
                if (ag3VarArr[0].f != i) {
                    if (i == bg3Var.e.getFirstTabId()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bg3Var.x = z2;
                    ag3 ag3Var = ag3VarArr[1];
                    ag3Var.f = i;
                    ag3Var.setVisibility(0);
                    bg3Var.q0(true);
                    bg3Var.r = z;
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void e() {
        byte b = this.a;
    }

    @Override
    public final void g() {
        i63 i63Var = (i63) this.b;
        i63Var.F.g();
        IOException iOException = i63Var.H;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    public final void g1() {
        ((nx0) this.b).p0 = false;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i() {
        a.t();
        boolean z = f11.a;
        a.q();
        m01.u(((tf1) this.b).n.getParentActivity(), f11.g);
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean i2(int i) {
        return false;
    }

    @Override
    public final boolean j(long j, int i, int i2, int i3, icb icbVar) {
        j81 j81Var = (j81) this.b;
        if (j81Var.b != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= j81Var.b.getChildCount()) {
                    break;
                }
                View childAt = j81Var.b.getChildAt(i4);
                if (childAt instanceof g81) {
                    g81 g81Var = (g81) childAt;
                    if (g81Var.n != null) {
                        for (int i5 = 0; i5 < g81Var.n.size(); i5++) {
                            ArrayList arrayList = ((h81) g81Var.n.valueAt(i5)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i2))) {
                                int keyAt = g81Var.n.keyAt(i5);
                                j81Var.i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) g81Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    icbVar.c = imageReceiver;
                                    tg0 tg0Var = j81Var.j0;
                                    if (tg0Var == null) {
                                        tg0Var = new tg0(this, (byte) 24);
                                        j81Var.j0 = tg0Var;
                                    }
                                    icbVar.e = tg0Var;
                                    icbVar.a = g81Var;
                                    icbVar.g = j81Var.fragmentView;
                                    icbVar.h = hl.L(36.0f);
                                    icbVar.i = j81Var.fragmentView.getBottom();
                                    icbVar.b = null;
                                    return true;
                                }
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i4++;
            }
        }
        return false;
    }

    @Override
    public final boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    @Override
    public final void k(r47 r47Var) {
        m mVar = ((o) this.b).v0[0];
        if (mVar != null) {
            mVar.b.K0(true);
        }
    }

    @Override
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override
    public final bmb l2() {
        return null;
    }

    public final void m1(kl1 kl1Var) {
        ((nx0) this.b).I0 = kl1Var;
    }

    @Override
    public final void n(int i, int i2) {
        ((j79) this.b).j(i, i2);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    public final void o1() {
        ((nx0) this.b).show();
    }

    @Override
    public final void p(int i) {
        hl.c3(new vd2(this, (byte) 3));
    }

    public final void p1(int i, Object obj, fu9 fu9Var) {
        xk2 xk2Var = (xk2) this.b;
        xk2Var.A(i, 3);
        fu9Var.g((p3) obj, xk2Var.a);
        xk2Var.A(i, 4);
    }

    @Override
    public final void q(String str) {
        v8 v8Var = (v8) this.b;
        v8Var.finishFragment(false);
        u34 u34Var = v8Var.y;
        LaunchActivity launchActivity = (LaunchActivity) u34Var.b;
        String str2 = LaunchActivity.C1;
        id idVar = new id(3, null, launchActivity);
        idVar.j0 = false;
        idVar.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new mw3(idVar, (v8) u34Var.c, (byte) 13));
    }

    @Override
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        ((t82) this.b).i0(f);
    }

    @Override
    public final String u(long j) {
        return null;
    }

    @Override
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override
    public final void v0(float f, int i) {
        t82 t82Var = (t82) this.b;
        t82Var.c.setLayerType(0, null);
        if (f == 0.0f && !t82Var.P) {
            t82Var.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                t82Var.F.setFocusableInTouchMode(false);
            }
        }
        jn7.e().k(jn7.k1, 512);
    }

    @Override
    public final Paint.FontMetricsInt w() {
        return ((n12) this.b).B2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final void x(long j, int i, x58 x58Var) {
        j81 j81Var = (j81) this.b;
        if (j81Var.b == null) {
            x58Var.run();
        }
        j81Var.b.post(x58Var);
    }

    @Override
    public final void x0(int i, int i2) {
        ((j79) this.b).n(i, i2, null);
    }

    public final synchronized void x1() {
        a5b a5bVar = (a5b) this.b;
        ReentrantLock reentrantLock = a5bVar.a;
        reentrantLock.lock();
        a5bVar.b.edit().clear().apply();
        reentrantLock.unlock();
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ((bw1) this.b).a(Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override
    public final boolean y0(long j) {
        return false;
    }

    private final void d1() {
    }

    private final void e1() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void k2() {
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void z1() {
    }

    private final void b1(float f) {
    }

    @Override
    public final void A(wb2 wb2Var) {
    }

    @Override
    public final void C0(wb2 wb2Var) {
    }

    @Override
    public final void F0(boolean z) {
    }

    @Override
    public final void G(wb2 wb2Var) {
    }

    @Override
    public final void G1(wb2 wb2Var) {
    }

    @Override
    public final void I1(wb2 wb2Var) {
    }

    @Override
    public final void J(r47 r47Var) {
    }

    @Override
    public final void J0(wb2 wb2Var) {
    }

    @Override
    public final void N0(wb2 wb2Var) {
    }

    @Override
    public final void N1(wb2 wb2Var) {
    }

    @Override
    public final void O(wb2 wb2Var) {
    }

    @Override
    public final void Q(wb2 wb2Var) {
    }

    @Override
    public final void T(r47 r47Var) {
    }

    @Override
    public final void T0(String str) {
    }

    @Override
    public final void U0(wb2 wb2Var) {
    }

    @Override
    public final void X1(ArrayList arrayList) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Y0(wb2 wb2Var) {
    }

    @Override
    public final void a1(wb2 wb2Var) {
    }

    @Override
    public final void d0(r47 r47Var) {
    }

    @Override
    public final void e0(Object obj) {
    }

    @Override
    public final void e2(wb2 wb2Var) {
    }

    @Override
    public final void f(boolean z) {
    }

    @Override
    public final void g0(String str) {
    }

    @Override
    public final void h1(wb2 wb2Var) {
    }

    @Override
    public final void i0(TLRPC.User user) {
    }

    @Override
    public final void j0(wb2 wb2Var) {
    }

    @Override
    public final void l(wb2 wb2Var) {
    }

    @Override
    public final void m2(wb2 wb2Var) {
    }

    @Override
    public final void n1(o47 o47Var) {
    }

    @Override
    public final void p0(ei7 ei7Var) {
    }

    @Override
    public final void t0(boolean z) {
    }

    @Override
    public final void v1(wb2 wb2Var) {
    }

    @Override
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(String str, String str2) {
    }

    @Override
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void q1(wb2 wb2Var, int i) {
    }

    @Override
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    @Override
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void K0(wb2 wb2Var, float f, float f2) {
    }

    @Override
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void a2(wb2 wb2Var, float f, float f2) {
    }

    @Override
    public final void f1(wb2 wb2Var, float f, float f2) {
    }

    @Override
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void m0(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void s(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    @Override
    public final void v(wb2 wb2Var, float f, float f2) {
    }

    public z8d(Context context) {
        String e2;
        this.a = (byte) 0;
        a5b a = a5b.a(context);
        this.b = a;
        a.b();
        String e3 = a.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e3) || (e2 = a.e(a5b.f("googleSignInOptions", e3))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e2);
        } catch (JSONException unused) {
        }
    }

    public z8d(xk2 xk2Var) {
        this.a = (byte) 22;
        Charset charset = pr5.a;
        this.b = xk2Var;
        xk2Var.a = this;
    }

    public z8d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public z8d(LaunchActivity launchActivity, Executor executor, rsd rsdVar) {
        this.a = (byte) 11;
        if (launchActivity == null) {
            lq5.j("FragmentActivity must not be null.");
            throw null;
        } else if (executor != null) {
            lq4 u = launchActivity.u();
            mj0 mj0Var = (mj0) new pq8(launchActivity).n(mj0.class);
            this.b = u;
            mj0Var.b = executor;
            mj0Var.c = rsdVar;
        } else {
            lq5.j("Executor must not be null.");
            throw null;
        }
    }

    public z8d(Context context, vnb vnbVar) {
        this.a = (byte) 13;
        nx0 nx0Var = new nx0(1, vnbVar, context, false);
        this.b = nx0Var;
        nx0Var.J();
    }

    @Override
    public final void W(wb2 wb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void q0(wb2 wb2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(wb2 wb2Var, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
