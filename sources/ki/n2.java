package ki;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import di.y8;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.ml0;
import org.telegram.ui.rj;
public final class n2 implements org.telegram.ui.web.c0 {
    public boolean f18827a;
    public final Context f18828b;
    public final h6 f18829c;
    public final s2 d;

    public n2(s2 s2Var, Context context, h6 h6Var) {
        this.d = s2Var;
        this.f18828b = context;
        this.f18829c = h6Var;
    }

    @Override
    public final v0 A() {
        s2 s2Var = this.d;
        if (s2Var.D0 == null) {
            v0 v0Var = new v0(this.f18828b);
            s2Var.D0 = v0Var;
            v0Var.f19024k = s2Var.E.getWebView();
        }
        return s2Var.D0;
    }

    @Override
    public final void a() {
        s2 s2Var = this.d;
        TLRPC.User c22 = np.u1(s2Var.I).c2(Long.valueOf(s2Var.J));
        k8.a aVar = new k8.a(15, false);
        aVar.f18214b = new l2(this, 0);
        gc V = new lc(s2Var.f18954r0, s2Var.G).V(Arrays.asList(c22), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753084, p10.q(c22))), null, aVar);
        V.f35527j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.o(true);
    }

    @Override
    public final void c() {
        s2 s2Var = this.d;
        if (s2Var.F0 != null) {
            org.telegram.ui.ActionBar.f3 N = LaunchActivity.H1.N();
            if (N != null) {
                N.e(s2Var.F0);
            }
            s2Var.F0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        s2 s2Var = this.d;
        new lc(s2Var.f18954r0, s2Var.G).q(document, hd.N0(2131753072, null)).k(true);
    }

    @Override
    public final void e(String str) {
        s2 s2Var = this.d;
        if (!s2Var.q() && s2Var.L == 0 && !this.f18827a) {
            this.f18827a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = np.u1(s2Var.I).q1(s2Var.J);
            tL_messages_sendWebViewData.random_id = Utilities.f22808b.nextLong();
            tL_messages_sendWebViewData.button_text = s2Var.O;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(s2Var.I).sendRequest(tL_messages_sendWebViewData, new m2(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String G;
        int size = arrayList.size();
        s2 s2Var = this.d;
        if (size == 1) {
            G = hd.a0(null, null, 2131752961, np.u1(s2Var.I).D1(((Long) arrayList.get(0)).longValue(), false));
        } else {
            G = hd.G(arrayList.size(), "BotSharedToMany", new Object[0]);
        }
        new lc(s2Var.f18954r0, s2Var.G).Q(2131624029, 36, org.telegram.messenger.g0.W2(G)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        s2 s2Var = this.d;
        boolean z12 = s2Var.f18941f0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        s2Var.C(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        s2 s2Var = this.d;
        if (!s2Var.q()) {
            if (si.d0(s2Var.I).l(s2Var.J) || np.u1(s2Var.I).Z6.contains(Long.valueOf(s2Var.J))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z10) {
        int i7;
        s2 s2Var = this.d;
        ImageView backButton = s2Var.Y.getBackButton();
        s2Var.f18965y0 = z10;
        if (z10) {
            i7 = 2131231240;
        } else {
            i7 = 2131231269;
        }
        org.telegram.messenger.g0.P3(backButton, i7);
        org.telegram.messenger.h2 h2Var = s2Var.f18950o0;
        if (h2Var != null) {
            h2Var.L = z10;
            h2Var.invalidate();
        }
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.d.f18957t0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13, String str2) {
        s2 s2Var = this.d;
        o2 o2Var = s2Var.f18949n0;
        ?? obj = new Object();
        obj.f18915a = z10;
        obj.f18916b = z11;
        obj.f18917c = z12;
        obj.d = z13;
        obj.f18918e = str;
        obj.f18919f = j3;
        obj.f18920g = i7;
        obj.h = i10;
        obj.f18921i = str2;
        int totalHeight = o2Var.getTotalHeight();
        o2Var.f18977e.d = obj;
        t.b(o2Var.f18978f[1].f18883l, obj, true);
        o2Var.invalidate();
        if (totalHeight != o2Var.getTotalHeight() && o2Var.f18980r != null) {
            if (totalHeight < o2Var.getTotalHeight()) {
                org.telegram.messenger.g0.h3(o2Var.f18980r, 200L);
            } else {
                o2Var.f18980r.run();
            }
        }
        if (s2Var.f18941f0) {
            s2Var.I();
            s2Var.L();
        }
    }

    @Override
    public final void m(int i7) {
        this.d.A(i7, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        s2 s2Var = this.d;
        j2 j2Var = s2Var.f18962x;
        r2 r2Var = s2Var.f18940f;
        org.telegram.ui.ActionBar.g2 lastFragment = ((LaunchActivity) s2Var.m0).M().getLastFragment();
        ml0 ml0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.g0.v1(r2Var);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, s2Var.getContext(), null);
            t1Var.r(150L);
            y8.y(s2Var.I, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new di.u3(t1Var, 1), new ai.y1(29, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            np.u1(s2Var.I).f4(paymentForm.users, false);
            ml0Var = new ml0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ml0Var = new ml0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ml0Var != null) {
            j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
            org.telegram.messenger.g0.v1(r2Var);
            zb0 zb0Var = new zb0(this.f18828b);
            zb0Var.show();
            ml0Var.f49900a1 = new a3.h((Object) this, (Object) zb0Var, str, 14);
            ml0Var.Z0 = this.f18829c;
            zb0Var.d(ml0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.t(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        s2 s2Var = this.d;
        o2 o2Var = s2Var.f18949n0;
        ?? obj = new Object();
        obj.f18915a = z10;
        obj.f18916b = z11;
        obj.f18917c = z12;
        obj.d = z13;
        obj.f18918e = str;
        obj.f18919f = j3;
        obj.f18920g = i7;
        obj.h = i10;
        obj.f18921i = null;
        int totalHeight = o2Var.getTotalHeight();
        o2Var.f18977e.f714c = obj;
        r[] rVarArr = o2Var.f18978f;
        rVarArr[0].f18883l.a();
        if (obj.f18919f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.f18918e);
            spannableStringBuilder.setSpan(new y5(obj.f18919f, 1.4f, rVarArr[0].f18883l.f37793a.getFontMetricsInt()), 0, 1, 33);
            rVarArr[0].f18883l.t(spannableStringBuilder, true, true);
        } else {
            rVarArr[0].f18883l.t(obj.f18918e, true, true);
        }
        o2Var.invalidate();
        if (totalHeight != o2Var.getTotalHeight() && o2Var.f18980r != null) {
            if (totalHeight < o2Var.getTotalHeight()) {
                org.telegram.messenger.g0.h3(o2Var.f18980r, 200L);
            } else {
                o2Var.f18980r.run();
            }
        }
        if (s2Var.f18941f0) {
            s2Var.I();
            s2Var.L();
        }
    }

    @Override
    public final void r(int i7) {
        this.d.D(i7, true);
    }

    @Override
    public final void s() {
        j2 j2Var = this.d.f18962x;
        if (j2Var.f18906c) {
            return;
        }
        j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f18937d0 = z10;
    }

    @Override
    public final void u(int i7, int i10, boolean z10) {
        s2 s2Var = this.d;
        s2Var.f18961w0 = i7;
        s2Var.y(i10, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        s2 s2Var = this.d;
        if (isEmpty) {
            Activity activity = s2Var.m0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.g2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof bn) {
                    rj rjVar = ((bn) lastFragment).f45950a0;
                    rjVar.setFieldText("@" + p10.o(user) + " " + str);
                    s2Var.o(false);
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        cx cxVar = new cx(bundle);
        org.telegram.messenger.g0.v1(s2Var.f18940f);
        zb0 zb0Var = new zb0(this.f18828b);
        cxVar.E2 = new a1.d(this, user, str, zb0Var, 5);
        zb0Var.show();
        zb0Var.d(cxVar);
    }

    @Override
    public final void w(boolean z10) {
        s2 s2Var = this.d;
        h6 h6Var = s2Var.G;
        FrameLayout frameLayout = s2Var.f18954r0;
        TLRPC.User c22 = np.u1(s2Var.I).c2(Long.valueOf(s2Var.J));
        if (z10) {
            k8.a aVar = new k8.a(15, false);
            hd.N0(2131743640, null);
            aVar.f18214b = new l2(this, 1);
            gc V = new lc(frameLayout, h6Var).V(Arrays.asList(c22), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753042, p10.q(c22))), null, aVar);
            V.f35527j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        org.telegram.messenger.f3.p(null, null, 2131753044, new Object[]{p10.q(c22)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(hd.N0(2131753043, null), new l2(this, 2)), true));
        gc P = new lc(frameLayout, h6Var).P(2131624012, spannableStringBuilder);
        P.f35527j = 5000;
        P.k(true);
    }

    @Override
    public final void x(int i7) {
        r(i7);
    }

    @Override
    public final void y(boolean z10) {
        j2 j2Var = this.d.f18962x;
        if (j2Var != null) {
            j2Var.setAllowSwipes(z10);
        }
    }

    @Override
    public final void z() {
        this.d.o(false);
    }

    @Override
    public final void o(int i7, boolean z10) {
    }
}
