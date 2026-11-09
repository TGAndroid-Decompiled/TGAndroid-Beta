package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.ea;
import bi.r4;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.jl0;
import org.telegram.ui.sj;
import org.telegram.ui.yw;
public final class v2 implements org.telegram.ui.web.d0 {
    public boolean f15003a;
    public final Context f15004b;
    public final g6 f15005c;
    public final a3 d;

    public v2(a3 a3Var, Context context, g6 g6Var) {
        this.d = a3Var;
        this.f15004b = context;
        this.f15005c = g6Var;
    }

    @Override
    public final v0 A() {
        a3 a3Var = this.d;
        if (a3Var.C0 == null) {
            v0 v0Var = new v0(this.f15004b);
            a3Var.C0 = v0Var;
            v0Var.f14990k = a3Var.D.getWebView();
        }
        return a3Var.C0;
    }

    @Override
    public final void a() {
        a3 a3Var = this.d;
        TLRPC.User a22 = qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I));
        ?? obj = new Object();
        obj.f19611a = new t2(this, 0);
        cc V = new hc(a3Var.f14531q0, a3Var.F).V(Arrays.asList(a22), org.telegram.messenger.g0.X2(id.a0(null, null, 2131753087, t10.p(a22))), null, obj);
        V.f32627j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.o(true);
    }

    @Override
    public final void c() {
        a3 a3Var = this.d;
        if (a3Var.E0 != null) {
            org.telegram.ui.ActionBar.d3 O = LaunchActivity.G1.O();
            if (O != null) {
                O.e(a3Var.E0);
            }
            a3Var.E0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        a3 a3Var = this.d;
        new hc(a3Var.f14531q0, a3Var.F).q(document, id.M0(2131753075, null)).k(true);
    }

    @Override
    public final void e(String str) {
        a3 a3Var = this.d;
        if (!a3Var.q() && a3Var.K == 0 && !this.f15003a) {
            this.f15003a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = qp.s1(a3Var.H).o1(a3Var.I);
            tL_messages_sendWebViewData.random_id = Utilities.f21334b.nextLong();
            tL_messages_sendWebViewData.button_text = a3Var.N;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(a3Var.H).sendRequest(tL_messages_sendWebViewData, new u2(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String G;
        int size = arrayList.size();
        a3 a3Var = this.d;
        if (size == 1) {
            G = id.a0(null, null, 2131752973, qp.s1(a3Var.H).B1(((Long) arrayList.get(0)).longValue(), false));
        } else {
            G = id.G(arrayList.size(), "BotSharedToMany", new Object[0]);
        }
        new hc(a3Var.f14531q0, a3Var.F).Q(2131624028, 36, org.telegram.messenger.g0.X2(G)).k(true);
    }

    @Override
    public final String g(boolean z9, boolean z10) {
        a3 a3Var = this.d;
        boolean z11 = a3Var.f14518e0;
        if (z11 == z9) {
            if (!z11) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        a3Var.C(z9, true, z10);
        return null;
    }

    @Override
    public final boolean h() {
        a3 a3Var = this.d;
        if (!a3Var.q()) {
            if (ui.b0(a3Var.H).j(a3Var.I) || qp.s1(a3Var.H).W6.contains(Long.valueOf(a3Var.I))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z9) {
        int i7;
        a3 a3Var = this.d;
        ImageView backButton = a3Var.X.getBackButton();
        a3Var.f14542x0 = z9;
        if (z9) {
            i7 = 2131231240;
        } else {
            i7 = 2131231269;
        }
        org.telegram.messenger.g0.R3(backButton, i7);
        org.telegram.messenger.h2 h2Var = a3Var.f14528n0;
        if (h2Var != null) {
            h2Var.K = z9;
            h2Var.invalidate();
        }
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z9) {
        this.d.f14535s0 = z9;
    }

    @Override
    public final void l(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12, String str2) {
        a3 a3Var = this.d;
        w2 w2Var = a3Var.m0;
        ?? obj = new Object();
        obj.f14936a = z9;
        obj.f14937b = z10;
        obj.f14938c = z11;
        obj.d = z12;
        obj.f14939e = str;
        obj.f14940f = j3;
        obj.f14941g = i7;
        obj.h = i10;
        obj.f14942i = str2;
        int totalHeight = w2Var.getTotalHeight();
        w2Var.f14951e.d = obj;
        t.b(w2Var.f14952f[1].f14914l, obj, true);
        w2Var.invalidate();
        if (totalHeight != w2Var.getTotalHeight() && w2Var.f14954r != null) {
            if (totalHeight < w2Var.getTotalHeight()) {
                org.telegram.messenger.g0.i3(w2Var.f14954r, 200L);
            } else {
                w2Var.f14954r.run();
            }
        }
        if (a3Var.f14518e0) {
            a3Var.I();
            a3Var.L();
        }
    }

    @Override
    public final void m(int i7) {
        this.d.A(i7, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        a3 a3Var = this.d;
        r2 r2Var = a3Var.f14541x;
        z2 z2Var = a3Var.f14519f;
        org.telegram.ui.ActionBar.f2 lastFragment = ((LaunchActivity) a3Var.f14526l0).M().getLastFragment();
        jl0 jl0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.g0.v1(z2Var);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, a3Var.getContext(), null);
            u1Var.r(150L);
            ea.y(a3Var.H, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new r4(u1Var, 1), new ai.f1(19, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            qp.s1(a3Var.H).Y3(paymentForm.users, false);
            jl0Var = new jl0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            jl0Var = new jl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (jl0Var != null) {
            r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
            org.telegram.messenger.g0.v1(z2Var);
            nb0 nb0Var = new nb0(this.f15004b);
            nb0Var.show();
            jl0Var.Z0 = new a3.h((Object) this, (Object) nb0Var, str, 12);
            jl0Var.Y0 = this.f15005c;
            nb0Var.c(jl0Var);
        }
    }

    @Override
    public final void p(boolean z9) {
        this.d.t(z9);
    }

    @Override
    public final void q(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12) {
        a3 a3Var = this.d;
        w2 w2Var = a3Var.m0;
        ?? obj = new Object();
        obj.f14936a = z9;
        obj.f14937b = z10;
        obj.f14938c = z11;
        obj.d = z12;
        obj.f14939e = str;
        obj.f14940f = j3;
        obj.f14941g = i7;
        obj.h = i10;
        obj.f14942i = null;
        int totalHeight = w2Var.getTotalHeight();
        w2Var.f14951e.f701c = obj;
        r[] rVarArr = w2Var.f14952f;
        rVarArr[0].f14914l.a();
        if (obj.f14940f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.f14939e);
            spannableStringBuilder.setSpan(new r5(obj.f14940f, 1.4f, rVarArr[0].f14914l.f34585a.getFontMetricsInt()), 0, 1, 33);
            rVarArr[0].f14914l.t(spannableStringBuilder, true, true);
        } else {
            rVarArr[0].f14914l.t(obj.f14939e, true, true);
        }
        w2Var.invalidate();
        if (totalHeight != w2Var.getTotalHeight() && w2Var.f14954r != null) {
            if (totalHeight < w2Var.getTotalHeight()) {
                org.telegram.messenger.g0.i3(w2Var.f14954r, 200L);
            } else {
                w2Var.f14954r.run();
            }
        }
        if (a3Var.f14518e0) {
            a3Var.I();
            a3Var.L();
        }
    }

    @Override
    public final void r(int i7) {
        this.d.D(i7, true);
    }

    @Override
    public final void s() {
        r2 r2Var = this.d.f14541x;
        if (r2Var.f14563c) {
            return;
        }
        r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z9) {
        this.d.f14515c0 = z9;
    }

    @Override
    public final void u(int i7, int i10, boolean z9) {
        a3 a3Var = this.d;
        a3Var.f14538v0 = i7;
        a3Var.y(i10, z9, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        a3 a3Var = this.d;
        if (isEmpty) {
            Activity activity = a3Var.f14526l0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.f2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof cn) {
                    sj sjVar = ((cn) lastFragment).Z;
                    sjVar.setFieldText("@" + t10.n(user) + " " + str);
                    a3Var.o(false);
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
        org.telegram.messenger.g0.v1(a3Var.f14519f);
        nb0 nb0Var = new nb0(this.f15004b);
        ywVar.D2 = new a1.d(this, user, str, nb0Var, 5);
        nb0Var.show();
        nb0Var.c(ywVar);
    }

    @Override
    public final void w(boolean z9) {
        a3 a3Var = this.d;
        g6 g6Var = a3Var.F;
        FrameLayout frameLayout = a3Var.f14531q0;
        TLRPC.User a22 = qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I));
        if (z9) {
            ?? obj = new Object();
            id.M0(2131743885, null);
            obj.f19611a = new t2(this, 1);
            cc V = new hc(frameLayout, g6Var).V(Arrays.asList(a22), org.telegram.messenger.g0.X2(id.a0(null, null, 2131753054, t10.p(a22))), null, obj);
            V.f32627j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        k5.q(null, null, 2131753056, new Object[]{t10.p(a22)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(id.M0(2131753055, null), new t2(this, 2)), true));
        cc P = new hc(frameLayout, g6Var).P(2131624011, spannableStringBuilder);
        P.f32627j = 5000;
        P.k(true);
    }

    @Override
    public final void x(int i7) {
        r(i7);
    }

    @Override
    public final void y(boolean z9) {
        r2 r2Var = this.d.f14541x;
        if (r2Var != null) {
            r2Var.setAllowSwipes(z9);
        }
    }

    @Override
    public final void z() {
        this.d.o(false);
    }

    @Override
    public final void o(int i7, boolean z9) {
    }
}
