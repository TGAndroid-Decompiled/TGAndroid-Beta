package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
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
public final class k6d implements kb1, r76, kw2, nc8, fq7, kt9, g22, kab, jd1, mc2, gk, r17, g94, au9, t43, ma6, rv9 {
    public static k6d c;
    public static final du4 d = new du4((byte) 1);
    public static final ugf e = new ugf((byte) 1);
    public final byte a;
    public final Object b;

    public k6d(byte b) {
        eif eifVar;
        w37 w37Var;
        this.a = b;
        switch (b) {
            case 2:
                try {
                    eifVar = (eif) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    eifVar = e;
                }
                bif bifVar = new bif(ugf.b, eifVar);
                Charset charset = fhf.a;
                this.b = bifVar;
                return;
            case 7:
                this.b = new AtomicInteger(0);
                return;
            case 9:
                this.b = new CopyOnWriteArrayList();
                return;
            case 25:
                this.b = new oo8(iu4.l, (byte) 5);
                return;
            default:
                gv8 gv8Var = gv8.c;
                try {
                    w37Var = (w37) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused2) {
                    w37Var = d;
                }
                w37[] w37VarArr = {du4.b, w37Var};
                ?? obj = new Object();
                obj.a = w37VarArr;
                Charset charset2 = mr5.a;
                this.b = obj;
                return;
        }
    }

    public static synchronized k6d r1(Context context) {
        k6d v1;
        synchronized (k6d.class) {
            v1 = v1(context.getApplicationContext());
        }
        return v1;
    }

    public static synchronized k6d v1(Context context) {
        k6d k6dVar;
        synchronized (k6d.class) {
            k6dVar = c;
            if (k6dVar == null) {
                k6dVar = new k6d(context);
                c = k6dVar;
            }
        }
        return k6dVar;
    }

    @Override
    public final boolean A0(long j) {
        return false;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final String B0() {
        return null;
    }

    @Override
    public final void C(int i, int i2) {
        ((y59) this.b).p(i, i2);
    }

    @Override
    public final void C0(int i, int i2) {
        ((y59) this.b).q(i, i2);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        ((n92) this.b).j0(f);
    }

    @Override
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean F1(int i) {
        return true;
    }

    @Override
    public final vh6 G0() {
        return null;
    }

    @Override
    public final TextureView J() {
        return null;
    }

    @Override
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean K0() {
        return false;
    }

    @Override
    public final pc8 M1() {
        return null;
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final int O() {
        return 0;
    }

    @Override
    public final void O0(int i, int i2) {
        ((y59) this.b).n(i, i2, null);
    }

    @Override
    public final boolean O1(long j) {
        return false;
    }

    @Override
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override
    public final hw1 S() {
        return null;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override
    public final void V(float f, int i) {
        n92 n92Var = (n92) this.b;
        n92Var.c.setLayerType(0, null);
        if (f == 0.0f && !n92Var.P) {
            n92Var.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                n92Var.F.setFocusableInTouchMode(false);
            }
        }
        nm7.e().k(nm7.k1, 512);
    }

    @Override
    public final boolean X(String str, db1 db1Var) {
        return false;
    }

    @Override
    public final void Y0(int i, int i2, CharSequence charSequence, boolean z) {
        i22 i22Var = (i22) this.b;
        if (i22Var.U0() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i22Var.U0().getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                gw3.l(spannableStringBuilder, i22Var.U0().getEditText().getPaint().getFontMetricsInt(), false);
            }
            i22Var.U0().setText(spannableStringBuilder);
            i22Var.U0().setSelection(i + charSequence.length());
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void a(int i, boolean z) {
        boolean z2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 12:
                lp0 lp0Var = ((ep0) obj).d;
                lp0Var.e0 = i;
                lp0Var.J0(true);
                return;
            default:
                ug3 ug3Var = (ug3) obj;
                tg3[] tg3VarArr = ug3Var.f;
                if (tg3VarArr[0].f != i) {
                    if (i == ug3Var.e.getFirstTabId()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ug3Var.x = z2;
                    tg3 tg3Var = tg3VarArr[1];
                    tg3Var.f = i;
                    tg3Var.setVisibility(0);
                    ug3Var.r0(true);
                    ug3Var.r = z;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        nm7.f(f51.d0((f51) this.b)).d(vr0Var);
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void c0() {
        ((e43) this.b).d.invalidate();
    }

    @Override
    public final void d() {
        c73 c73Var = (c73) this.b;
        c73Var.F.d();
        IOException iOException = c73Var.H;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final vh6 e1() {
        return null;
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f1() {
        ((my0) this.b).p0 = false;
    }

    @Override
    public final void finish() {
        Point point = gm.q;
        if (point.x > point.y) {
            ((nk3) this.b).finishPreviewFragment();
        }
    }

    @Override
    public final void g(float f) {
        switch (this.a) {
            case 12:
                return;
            default:
                ug3 ug3Var = (ug3) this.b;
                tg3[] tg3VarArr = ug3Var.f;
                int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i != 0 || tg3VarArr[1].getVisibility() == 0) {
                    if (ug3Var.r) {
                        tg3 tg3Var = tg3VarArr[0];
                        tg3Var.setTranslationX((-f) * tg3Var.getMeasuredWidth());
                        tg3VarArr[1].setTranslationX(tg3VarArr[0].getMeasuredWidth() - (f * tg3VarArr[0].getMeasuredWidth()));
                    } else {
                        tg3 tg3Var2 = tg3VarArr[0];
                        tg3Var2.setTranslationX(tg3Var2.getMeasuredWidth() * f);
                        tg3VarArr[1].setTranslationX((f * tg3VarArr[0].getMeasuredWidth()) - tg3VarArr[0].getMeasuredWidth());
                    }
                    if (i == 0) {
                        tg3 tg3Var3 = tg3VarArr[0];
                        tg3VarArr[0] = tg3VarArr[1];
                        tg3VarArr[1] = tg3Var3;
                        tg3Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void g1(km1 km1Var) {
        ((my0) this.b).I0 = km1Var;
    }

    @Override
    public final boolean h(long j, int i, int i2, int i3, lab labVar) {
        k91 k91Var = (k91) this.b;
        if (k91Var.b != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= k91Var.b.getChildCount()) {
                    break;
                }
                View childAt = k91Var.b.getChildAt(i4);
                if (childAt instanceof h91) {
                    h91 h91Var = (h91) childAt;
                    if (h91Var.n != null) {
                        for (int i5 = 0; i5 < h91Var.n.size(); i5++) {
                            ArrayList arrayList = ((i91) h91Var.n.valueAt(i5)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i2))) {
                                int keyAt = h91Var.n.keyAt(i5);
                                k91Var.i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) h91Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    labVar.c = imageReceiver;
                                    xg0 xg0Var = k91Var.j0;
                                    if (xg0Var == null) {
                                        xg0Var = new xg0(this, (byte) 26);
                                        k91Var.j0 = xg0Var;
                                    }
                                    labVar.e = xg0Var;
                                    labVar.a = h91Var;
                                    labVar.g = k91Var.fragmentView;
                                    labVar.h = gm.L(36.0f);
                                    labVar.i = k91Var.fragmentView.getBottom();
                                    labVar.b = null;
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

    public final void h1() {
        ((my0) this.b).show();
    }

    @Override
    public final void i() {
        a.t();
        boolean z = e21.a;
        a.q();
        l11.u(((sg1) this.b).n.getParentActivity(), e21.g);
    }

    @Override
    public final void j(float f) {
        Point point = gm.q;
        if (point.x > point.y) {
            ((nk3) this.b).movePreviewFragment(f);
        }
    }

    @Override
    public final void j1(Object obj) {
        ak0 ak0Var = (ak0) this.b;
        if (((Boolean) obj).booleanValue()) {
            if (ak0Var.S()) {
                ak0Var.X(ak0Var.q(2131689614));
            }
            lk0 lk0Var = ak0Var.m0;
            if (!lk0Var.l) {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            } else {
                Executor executor = lk0Var.b;
                if (executor == null) {
                    executor = new yj0((byte) 1);
                }
                executor.execute(new rj0(ak0Var, (byte) 0));
            }
            lk0 lk0Var2 = ak0Var.m0;
            kj7 kj7Var = lk0Var2.s;
            if (kj7Var == null) {
                kj7Var = new kj7();
                lk0Var2.s = kj7Var;
            }
            lk0.f(kj7Var, Boolean.FALSE);
        }
    }

    @Override
    public final void l(int i, int i2) {
        ((y59) this.b).j(i, i2);
    }

    @Override
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override
    public final boolean m2(int i) {
        return false;
    }

    public final void n(hk0 hk0Var, gk0 gk0Var) {
        Object obj = this.b;
        iq4 iq4Var = (iq4) obj;
        if (iq4Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (iq4Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            iq4 iq4Var2 = (iq4) obj;
            ak0 ak0Var = (ak0) iq4Var2.D("androidx.biometric.BiometricFragment");
            if (ak0Var == null) {
                ak0Var = new ak0();
                ie0 ie0Var = new ie0(iq4Var2);
                ie0Var.f(0, ak0Var, "androidx.biometric.BiometricFragment");
                ie0Var.e(true, true);
                iq4Var2.A(true);
                iq4Var2.E();
            }
            gp4 k = ak0Var.k();
            if (k == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            ak0Var.m0.d = hk0Var;
            int a = zod.a(hk0Var, gk0Var);
            if (Build.VERSION.SDK_INT < 30 && a == 15 && gk0Var == null) {
                ak0Var.m0.e = sce.a();
            } else {
                ak0Var.m0.e = gk0Var;
            }
            boolean R = ak0Var.R();
            lk0 lk0Var = ak0Var.m0;
            if (R) {
                lk0Var.i = ak0Var.q(2131689577);
            } else {
                lk0Var.i = null;
            }
            if (ak0Var.R() && new ek0(new dk0(k, (byte) 0)).a(255) != 0) {
                ak0Var.m0.l = true;
                ak0Var.T();
            } else if (ak0Var.m0.n) {
                ak0Var.l0.postDelayed(new zj0(ak0Var), 600L);
            } else {
                ak0Var.Y();
            }
        }
    }

    @Override
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override
    public final void o(int i) {
        gm.c3(new xf2(this, (byte) 2));
    }

    @Override
    public final void p(k47 k47Var) {
        m mVar = ((o) this.b).v0[0];
        if (mVar != null) {
            mVar.b.J0(true);
        }
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    public final void p1(int i, Object obj, os9 os9Var) {
        pl2 pl2Var = (pl2) this.b;
        pl2Var.A(i, 3);
        os9Var.g((o3) obj, pl2Var.a);
        pl2Var.A(i, 4);
    }

    @Override
    public final hkb p2() {
        return null;
    }

    @Override
    public final void q0(long j, int i, j48 j48Var) {
        k91 k91Var = (k91) this.b;
        if (k91Var.b == null) {
            j48Var.run();
        }
        k91Var.b.post(j48Var);
    }

    @Override
    public final void s() {
        byte b = this.a;
    }

    public final synchronized void s1() {
        f3b f3bVar = (f3b) this.b;
        ReentrantLock reentrantLock = f3bVar.a;
        reentrantLock.lock();
        f3bVar.b.edit().clear().apply();
        reentrantLock.unlock();
    }

    @Override
    public final String t(long j) {
        return null;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final Paint.FontMetricsInt u0() {
        return ((i22) this.b).B2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public final void v(String str) {
        u8 u8Var = (u8) this.b;
        u8Var.finishFragment(false);
        nv4 nv4Var = u8Var.y;
        LaunchActivity launchActivity = (LaunchActivity) nv4Var.b;
        String str2 = LaunchActivity.C1;
        he heVar = new he(3, null, launchActivity);
        heVar.j0 = false;
        heVar.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new cx3(heVar, (u8) nv4Var.c, (byte) 14));
    }

    @Override
    public final void w(hg3 hg3Var) {
        ((nk3) this.b).c5(hg3Var);
    }

    public final defpackage.oa3 x(defpackage.yh4 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6d.x(yh4):oa3");
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ((qw1) this.b).a(Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override
    public final boolean y0(int i, View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    private final void d1() {
    }

    private final void j0() {
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s0() {
    }

    private final void g0(float f) {
    }

    @Override
    public final void A(rc2 rc2Var) {
    }

    @Override
    public final void F0(rc2 rc2Var) {
    }

    @Override
    public final void G(rc2 rc2Var) {
    }

    @Override
    public final void H0(boolean z) {
    }

    @Override
    public final void I0(yh7 yh7Var) {
    }

    @Override
    public final void J1(rc2 rc2Var) {
    }

    @Override
    public final void L(k47 k47Var) {
    }

    @Override
    public final void L1(rc2 rc2Var) {
    }

    @Override
    public final void M0(rc2 rc2Var) {
    }

    @Override
    public final void P(rc2 rc2Var) {
    }

    @Override
    public final void Q0(rc2 rc2Var) {
    }

    @Override
    public final void Q1(rc2 rc2Var) {
    }

    @Override
    public final void R(rc2 rc2Var) {
    }

    @Override
    public final void R0(boolean z) {
    }

    @Override
    public final void T(k47 k47Var) {
    }

    @Override
    public final void U0(rc2 rc2Var) {
    }

    @Override
    public final void X0(rc2 rc2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Z0(rc2 rc2Var) {
    }

    @Override
    public final void a2(ArrayList arrayList) {
    }

    @Override
    public final void c1(String str) {
    }

    @Override
    public final void e(boolean z) {
    }

    @Override
    public final void e0(k47 k47Var) {
    }

    @Override
    public final void f0(Object obj) {
    }

    @Override
    public final void h0(String str) {
    }

    @Override
    public final void i2(rc2 rc2Var) {
    }

    @Override
    public final void k(rc2 rc2Var) {
    }

    @Override
    public final void k0(rc2 rc2Var) {
    }

    @Override
    public final void k1(rc2 rc2Var) {
    }

    @Override
    public final void q1(h47 h47Var) {
    }

    @Override
    public final void q2(rc2 rc2Var) {
    }

    @Override
    public final void y1(rc2 rc2Var) {
    }

    @Override
    public final void z0(TLRPC.User user) {
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void N1(String str, String str2) {
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void N0(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void d2(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void i1(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override
    public final void r(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    @Override
    public final void u(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void w0(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    public k6d(Context context) {
        String e2;
        this.a = (byte) 0;
        f3b a = f3b.a(context);
        this.b = a;
        a.b();
        String e3 = a.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e3) || (e2 = a.e(f3b.f("googleSignInOptions", e3))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e2);
        } catch (JSONException unused) {
        }
    }

    public k6d(pl2 pl2Var) {
        this.a = (byte) 22;
        Charset charset = mr5.a;
        this.b = pl2Var;
        pl2Var.a = this;
    }

    public k6d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public k6d(LaunchActivity launchActivity, Executor executor, dqd dqdVar) {
        this.a = (byte) 11;
        if (launchActivity == null) {
            u36.j("FragmentActivity must not be null.");
            throw null;
        } else if (executor != null) {
            iq4 u = launchActivity.u();
            lk0 lk0Var = (lk0) new et8(launchActivity).l(lk0.class);
            this.b = u;
            lk0Var.b = executor;
            lk0Var.c = dqdVar;
        } else {
            u36.j("Executor must not be null.");
            throw null;
        }
    }

    public k6d(Context context, ylb ylbVar) {
        this.a = (byte) 13;
        my0 my0Var = new my0(1, ylbVar, context, false);
        this.b = my0Var;
        my0Var.J();
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void r0(rc2 rc2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
