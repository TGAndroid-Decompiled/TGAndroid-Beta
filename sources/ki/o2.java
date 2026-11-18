package ki;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import di.x8;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.ml0;
import org.telegram.ui.rj;
public final class o2 implements org.telegram.ui.web.c0 {
    public boolean f18817a;
    public final Context f18818b;
    public final i6 f18819c;
    public final t2 d;

    public o2(t2 t2Var, Context context, i6 i6Var) {
        this.d = t2Var;
        this.f18818b = context;
        this.f18819c = i6Var;
    }

    @Override
    public final w0 A() {
        t2 t2Var = this.d;
        if (t2Var.D0 == null) {
            w0 w0Var = new w0(this.f18818b);
            t2Var.D0 = w0Var;
            w0Var.f19014k = t2Var.E.getWebView();
        }
        return t2Var.D0;
    }

    @Override
    public final void a() {
        t2 t2Var = this.d;
        TLRPC.User c22 = mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
        k8.a aVar = new k8.a(15, false);
        aVar.f18183b = new m2(this, 0);
        gc V = new lc(t2Var.f18944r0, t2Var.G).V(Arrays.asList(c22), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753085, o10.q(c22))), null, aVar);
        V.f35461j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.o(true);
    }

    @Override
    public final void c() {
        t2 t2Var = this.d;
        if (t2Var.F0 != null) {
            org.telegram.ui.ActionBar.g3 N = LaunchActivity.H1.N();
            if (N != null) {
                N.e(t2Var.F0);
            }
            t2Var.F0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        t2 t2Var = this.d;
        new lc(t2Var.f18944r0, t2Var.G).q(document, gd.M0(2131753073, null)).k(true);
    }

    @Override
    public final void e(String str) {
        t2 t2Var = this.d;
        if (!t2Var.q() && t2Var.L == 0 && !this.f18817a) {
            this.f18817a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = mp.u1(t2Var.I).q1(t2Var.J);
            tL_messages_sendWebViewData.random_id = Utilities.f22780b.nextLong();
            tL_messages_sendWebViewData.button_text = t2Var.O;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(t2Var.I).sendRequest(tL_messages_sendWebViewData, new n2(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String G;
        int size = arrayList.size();
        t2 t2Var = this.d;
        if (size == 1) {
            G = gd.a0(null, null, 2131752962, mp.u1(t2Var.I).D1(((Long) arrayList.get(0)).longValue(), false));
        } else {
            G = gd.G(arrayList.size(), "BotSharedToMany", new Object[0]);
        }
        new lc(t2Var.f18944r0, t2Var.G).Q(2131624029, 36, org.telegram.messenger.g0.W2(G)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        t2 t2Var = this.d;
        boolean z12 = t2Var.f18931f0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        t2Var.C(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        t2 t2Var = this.d;
        if (!t2Var.q()) {
            if (ri.d0(t2Var.I).l(t2Var.J) || mp.u1(t2Var.I).Z6.contains(Long.valueOf(t2Var.J))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z10) {
        int i7;
        t2 t2Var = this.d;
        ImageView backButton = t2Var.Y.getBackButton();
        t2Var.f18955y0 = z10;
        if (z10) {
            i7 = 2131231240;
        } else {
            i7 = 2131231269;
        }
        org.telegram.messenger.g0.P3(backButton, i7);
        org.telegram.messenger.h2 h2Var = t2Var.f18940o0;
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
        this.d.f18947t0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13, String str2) {
        t2 t2Var = this.d;
        p2 p2Var = t2Var.f18939n0;
        ?? obj = new Object();
        obj.f18905a = z10;
        obj.f18906b = z11;
        obj.f18907c = z12;
        obj.d = z13;
        obj.f18908e = str;
        obj.f18909f = j3;
        obj.f18910g = i7;
        obj.h = i10;
        obj.f18911i = str2;
        int totalHeight = p2Var.getTotalHeight();
        p2Var.f18967e.d = obj;
        u.b(p2Var.f18968f[1].f18873l, obj, true);
        p2Var.invalidate();
        if (totalHeight != p2Var.getTotalHeight() && p2Var.f18970r != null) {
            if (totalHeight < p2Var.getTotalHeight()) {
                org.telegram.messenger.g0.h3(p2Var.f18970r, 200L);
            } else {
                p2Var.f18970r.run();
            }
        }
        if (t2Var.f18931f0) {
            t2Var.I();
            t2Var.L();
        }
    }

    @Override
    public final void m(int i7) {
        this.d.A(i7, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        t2 t2Var = this.d;
        k2 k2Var = t2Var.f18952x;
        s2 s2Var = t2Var.f18930f;
        org.telegram.ui.ActionBar.h2 lastFragment = ((LaunchActivity) t2Var.m0).M().getLastFragment();
        ml0 ml0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.g0.v1(s2Var);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, t2Var.getContext(), null);
            u1Var.r(150L);
            x8.y(t2Var.I, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new di.u3(u1Var, 1), new ai.v1(29, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            mp.u1(t2Var.I).f4(paymentForm.users, false);
            ml0Var = new ml0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ml0Var = new ml0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ml0Var != null) {
            k2Var.e(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()));
            org.telegram.messenger.g0.v1(s2Var);
            yb0 yb0Var = new yb0(this.f18818b);
            yb0Var.show();
            ml0Var.f49881a1 = new a3.h((Object) this, (Object) yb0Var, str, 14);
            ml0Var.Z0 = this.f18819c;
            yb0Var.d(ml0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.t(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        t2 t2Var = this.d;
        p2 p2Var = t2Var.f18939n0;
        ?? obj = new Object();
        obj.f18905a = z10;
        obj.f18906b = z11;
        obj.f18907c = z12;
        obj.d = z13;
        obj.f18908e = str;
        obj.f18909f = j3;
        obj.f18910g = i7;
        obj.h = i10;
        obj.f18911i = null;
        int totalHeight = p2Var.getTotalHeight();
        p2Var.f18967e.f714c = obj;
        s[] sVarArr = p2Var.f18968f;
        sVarArr[0].f18873l.a();
        if (obj.f18909f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.f18908e);
            spannableStringBuilder.setSpan(new x5(obj.f18909f, 1.4f, sVarArr[0].f18873l.f37375a.getFontMetricsInt()), 0, 1, 33);
            sVarArr[0].f18873l.t(spannableStringBuilder, true, true);
        } else {
            sVarArr[0].f18873l.t(obj.f18908e, true, true);
        }
        p2Var.invalidate();
        if (totalHeight != p2Var.getTotalHeight() && p2Var.f18970r != null) {
            if (totalHeight < p2Var.getTotalHeight()) {
                org.telegram.messenger.g0.h3(p2Var.f18970r, 200L);
            } else {
                p2Var.f18970r.run();
            }
        }
        if (t2Var.f18931f0) {
            t2Var.I();
            t2Var.L();
        }
    }

    @Override
    public final void r(int i7) {
        this.d.D(i7, true);
    }

    @Override
    public final void s() {
        k2 k2Var = this.d.f18952x;
        if (k2Var.f18896c) {
            return;
        }
        k2Var.e(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f18927d0 = z10;
    }

    @Override
    public final void u(int i7, int i10, boolean z10) {
        t2 t2Var = this.d;
        t2Var.f18951w0 = i7;
        t2Var.y(i10, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        t2 t2Var = this.d;
        if (isEmpty) {
            Activity activity = t2Var.m0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.h2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof bn) {
                    rj rjVar = ((bn) lastFragment).f45932a0;
                    rjVar.setFieldText("@" + o10.o(user) + " " + str);
                    t2Var.o(false);
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
        org.telegram.messenger.g0.v1(t2Var.f18930f);
        yb0 yb0Var = new yb0(this.f18818b);
        cxVar.E2 = new a1.d(this, user, str, yb0Var, 5);
        yb0Var.show();
        yb0Var.d(cxVar);
    }

    @Override
    public final void w(boolean z10) {
        t2 t2Var = this.d;
        i6 i6Var = t2Var.G;
        FrameLayout frameLayout = t2Var.f18944r0;
        TLRPC.User c22 = mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
        if (z10) {
            k8.a aVar = new k8.a(15, false);
            gd.M0(2131743648, null);
            aVar.f18183b = new m2(this, 1);
            gc V = new lc(frameLayout, i6Var).V(Arrays.asList(c22), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753043, o10.q(c22))), null, aVar);
            V.f35461j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        org.telegram.messenger.f3.p(null, null, 2131753045, new Object[]{o10.q(c22)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(gd.M0(2131753044, null), new m2(this, 2)), true));
        gc P = new lc(frameLayout, i6Var).P(2131624012, spannableStringBuilder);
        P.f35461j = 5000;
        P.k(true);
    }

    @Override
    public final void x(int i7) {
        r(i7);
    }

    @Override
    public final void y(boolean z10) {
        k2 k2Var = this.d.f18952x;
        if (k2Var != null) {
            k2Var.setAllowSwipes(z10);
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
