package ki;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import di.v8;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.jl0;
import org.telegram.ui.qj;
import org.telegram.ui.yw;
public final class s2 implements org.telegram.ui.web.c0 {
    public boolean f18546a;
    public final Context f18547b;
    public final e6 f18548c;
    public final x2 d;

    public s2(x2 x2Var, Context context, e6 e6Var) {
        this.d = x2Var;
        this.f18547b = context;
        this.f18548c = e6Var;
    }

    @Override
    public final w0 A() {
        x2 x2Var = this.d;
        if (x2Var.D0 == null) {
            w0 w0Var = new w0(this.f18547b);
            x2Var.D0 = w0Var;
            w0Var.f18622k = x2Var.E.getWebView();
        }
        return x2Var.D0;
    }

    @Override
    public final void a() {
        x2 x2Var = this.d;
        TLRPC.User a22 = np.s1(x2Var.I).a2(Long.valueOf(x2Var.J));
        k8.a aVar = new k8.a(15, false);
        aVar.f17788b = new q2(this, 0);
        xb V = new cc(x2Var.f18675r0, x2Var.G).V(Arrays.asList(a22), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753087, q10.p(a22))), null, aVar);
        V.f41643j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.o(true);
    }

    @Override
    public final void c() {
        x2 x2Var = this.d;
        if (x2Var.F0 != null) {
            org.telegram.ui.ActionBar.c3 N = LaunchActivity.H1.N();
            if (N != null) {
                N.e(x2Var.F0);
            }
            x2Var.F0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        x2 x2Var = this.d;
        new cc(x2Var.f18675r0, x2Var.G).q(document, hd.M0(2131753075, null)).k(true);
    }

    @Override
    public final void e(String str) {
        x2 x2Var = this.d;
        if (!x2Var.q() && x2Var.L == 0 && !this.f18546a) {
            this.f18546a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = np.s1(x2Var.I).o1(x2Var.J);
            tL_messages_sendWebViewData.random_id = Utilities.f22414b.nextLong();
            tL_messages_sendWebViewData.button_text = x2Var.O;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(x2Var.I).sendRequest(tL_messages_sendWebViewData, new r2(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String G;
        int size = arrayList.size();
        x2 x2Var = this.d;
        if (size == 1) {
            G = hd.a0(null, null, 2131752973, np.s1(x2Var.I).B1(((Long) arrayList.get(0)).longValue(), false));
        } else {
            G = hd.G(arrayList.size(), "BotSharedToMany", new Object[0]);
        }
        new cc(x2Var.f18675r0, x2Var.G).Q(2131624029, 36, org.telegram.messenger.g0.X2(G)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        x2 x2Var = this.d;
        boolean z12 = x2Var.f18662f0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        x2Var.C(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        x2 x2Var = this.d;
        if (!x2Var.q()) {
            if (si.b0(x2Var.I).j(x2Var.J) || np.s1(x2Var.I).X6.contains(Long.valueOf(x2Var.J))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z10) {
        int i7;
        x2 x2Var = this.d;
        ImageView backButton = x2Var.Y.getBackButton();
        x2Var.f18686y0 = z10;
        if (z10) {
            i7 = 2131231240;
        } else {
            i7 = 2131231269;
        }
        org.telegram.messenger.g0.Q3(backButton, i7);
        org.telegram.messenger.h2 h2Var = x2Var.f18671o0;
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
        this.d.f18678t0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13, String str2) {
        x2 x2Var = this.d;
        t2 t2Var = x2Var.f18670n0;
        ?? obj = new Object();
        obj.f18573a = z10;
        obj.f18574b = z11;
        obj.f18575c = z12;
        obj.d = z13;
        obj.f18576e = str;
        obj.f18577f = j3;
        obj.f18578g = i7;
        obj.h = i10;
        obj.f18579i = str2;
        int totalHeight = t2Var.getTotalHeight();
        t2Var.f18593e.d = obj;
        v.b(t2Var.f18594f[1].f18560l, obj, true);
        t2Var.invalidate();
        if (totalHeight != t2Var.getTotalHeight() && t2Var.f18596r != null) {
            if (totalHeight < t2Var.getTotalHeight()) {
                org.telegram.messenger.g0.i3(t2Var.f18596r, 200L);
            } else {
                t2Var.f18596r.run();
            }
        }
        if (x2Var.f18662f0) {
            x2Var.I();
            x2Var.L();
        }
    }

    @Override
    public final void m(int i7) {
        this.d.A(i7, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        x2 x2Var = this.d;
        o2 o2Var = x2Var.f18683x;
        w2 w2Var = x2Var.f18661f;
        org.telegram.ui.ActionBar.e2 lastFragment = ((LaunchActivity) x2Var.m0).M().getLastFragment();
        jl0 jl0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.g0.v1(w2Var);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, x2Var.getContext(), null);
            t1Var.r(150L);
            v8.y(x2Var.I, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new di.s3(t1Var, 1), new ai.u1(27, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            np.s1(x2Var.I).Y3(paymentForm.users, false);
            jl0Var = new jl0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            jl0Var = new jl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (jl0Var != null) {
            o2Var.e(o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY()));
            org.telegram.messenger.g0.v1(w2Var);
            nb0 nb0Var = new nb0(this.f18547b);
            nb0Var.show();
            jl0Var.f48384a1 = new a3.h((Object) this, (Object) nb0Var, str, 14);
            jl0Var.Z0 = this.f18548c;
            nb0Var.c(jl0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.t(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        x2 x2Var = this.d;
        t2 t2Var = x2Var.f18670n0;
        ?? obj = new Object();
        obj.f18573a = z10;
        obj.f18574b = z11;
        obj.f18575c = z12;
        obj.d = z13;
        obj.f18576e = str;
        obj.f18577f = j3;
        obj.f18578g = i7;
        obj.h = i10;
        obj.f18579i = null;
        int totalHeight = t2Var.getTotalHeight();
        t2Var.f18593e.f714c = obj;
        t[] tVarArr = t2Var.f18594f;
        tVarArr[0].f18560l.a();
        if (obj.f18577f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.f18576e);
            spannableStringBuilder.setSpan(new p5(obj.f18577f, 1.4f, tVarArr[0].f18560l.f34827a.getFontMetricsInt()), 0, 1, 33);
            tVarArr[0].f18560l.t(spannableStringBuilder, true, true);
        } else {
            tVarArr[0].f18560l.t(obj.f18576e, true, true);
        }
        t2Var.invalidate();
        if (totalHeight != t2Var.getTotalHeight() && t2Var.f18596r != null) {
            if (totalHeight < t2Var.getTotalHeight()) {
                org.telegram.messenger.g0.i3(t2Var.f18596r, 200L);
            } else {
                t2Var.f18596r.run();
            }
        }
        if (x2Var.f18662f0) {
            x2Var.I();
            x2Var.L();
        }
    }

    @Override
    public final void r(int i7) {
        this.d.D(i7, true);
    }

    @Override
    public final void s() {
        o2 o2Var = this.d.f18683x;
        if (o2Var.f18693c) {
            return;
        }
        o2Var.e(o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f18658d0 = z10;
    }

    @Override
    public final void u(int i7, int i10, boolean z10) {
        x2 x2Var = this.d;
        x2Var.f18682w0 = i7;
        x2Var.y(i10, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        x2 x2Var = this.d;
        if (isEmpty) {
            Activity activity = x2Var.m0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.e2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof an) {
                    qj qjVar = ((an) lastFragment).f45118a0;
                    qjVar.setFieldText("@" + q10.n(user) + " " + str);
                    x2Var.o(false);
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
        yw ywVar = new yw(bundle);
        org.telegram.messenger.g0.v1(x2Var.f18661f);
        nb0 nb0Var = new nb0(this.f18547b);
        ywVar.E2 = new a1.d(this, user, str, nb0Var, 5);
        nb0Var.show();
        nb0Var.c(ywVar);
    }

    @Override
    public final void w(boolean z10) {
        x2 x2Var = this.d;
        e6 e6Var = x2Var.G;
        FrameLayout frameLayout = x2Var.f18675r0;
        TLRPC.User a22 = np.s1(x2Var.I).a2(Long.valueOf(x2Var.J));
        if (z10) {
            k8.a aVar = new k8.a(15, false);
            hd.M0(2131743885, null);
            aVar.f17788b = new q2(this, 1);
            xb V = new cc(frameLayout, e6Var).V(Arrays.asList(a22), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753054, q10.p(a22))), null, aVar);
            V.f41643j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        k5.p(null, null, 2131753056, new Object[]{q10.p(a22)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(hd.M0(2131753055, null), new q2(this, 2)), true));
        xb P = new cc(frameLayout, e6Var).P(2131624012, spannableStringBuilder);
        P.f41643j = 5000;
        P.k(true);
    }

    @Override
    public final void x(int i7) {
        r(i7);
    }

    @Override
    public final void y(boolean z10) {
        o2 o2Var = this.d.f18683x;
        if (o2Var != null) {
            o2Var.setAllowSwipes(z10);
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
