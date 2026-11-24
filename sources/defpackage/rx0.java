package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p;
public final class rx0 implements uv0 {
    public boolean a;
    public final Context b;
    public final ylb c;
    public final wx0 d;

    public rx0(wx0 wx0Var, Context context, ylb ylbVar) {
        this.d = wx0Var;
        this.b = context;
        this.c = ylbVar;
    }

    @Override
    public final ws0 A() {
        wx0 wx0Var = this.d;
        if (wx0Var.D0 == null) {
            ws0 ws0Var = new ws0(this.b);
            wx0Var.D0 = ws0Var;
            ws0Var.k = wx0Var.E.getWebView();
        }
        return wx0Var.D0;
    }

    @Override
    public final void a() {
        wx0 wx0Var = this.d;
        TLRPC.User W1 = oc7.r1(wx0Var.I).W1(Long.valueOf(wx0Var.J));
        hi2 hi2Var = new hi2((byte) 12, false);
        hi2Var.b = new px0(this, (byte) 0);
        u31 V = new c41(wx0Var.r0, wx0Var.G).V(Arrays.asList(W1), gm.S2(jb6.a0(null, null, 2131753052, m9c.r(W1))), null, hi2Var);
        V.j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.m(true);
    }

    @Override
    public final void c() {
        wx0 wx0Var = this.d;
        if (wx0Var.F0 != null) {
            xy0 O = LaunchActivity.H1.O();
            if (O != null) {
                O.e(wx0Var.F0);
            }
            wx0Var.F0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        wx0 wx0Var = this.d;
        new c41(wx0Var.r0, wx0Var.G).q(document, jb6.M0(2131753040, null)).k(true);
    }

    @Override
    public final void e(String str) {
        wx0 wx0Var = this.d;
        if (!wx0Var.o() && wx0Var.L == 0 && !this.a) {
            this.a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = oc7.r1(wx0Var.I).n1(wx0Var.J);
            tL_messages_sendWebViewData.random_id = Utilities.b.nextLong();
            tL_messages_sendWebViewData.button_text = wx0Var.O;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(wx0Var.I).sendRequest(tL_messages_sendWebViewData, new qx0(this, (byte) 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String G;
        int size = arrayList.size();
        wx0 wx0Var = this.d;
        if (size == 1) {
            G = jb6.a0(null, null, 2131752926, oc7.r1(wx0Var.I).z1(((Long) arrayList.get(0)).longValue(), false));
        } else {
            G = jb6.G(arrayList.size(), "BotSharedToMany", new Object[0]);
        }
        new c41(wx0Var.r0, wx0Var.G).Q(2131624029, 36, gm.S2(G)).k(true);
    }

    @Override
    public final String g(boolean z, boolean z2) {
        wx0 wx0Var = this.d;
        boolean z3 = wx0Var.f0;
        if (z3 == z) {
            if (!z3) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        wx0Var.C(z, true, z2);
        return null;
    }

    @Override
    public final boolean h() {
        wx0 wx0Var = this.d;
        if (!wx0Var.o()) {
            if (hs6.d0(wx0Var.I).l(wx0Var.J) || oc7.r1(wx0Var.I).S3.contains(Long.valueOf(wx0Var.J))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z) {
        int i;
        wx0 wx0Var = this.d;
        ImageView backButton = wx0Var.Y.getBackButton();
        wx0Var.y0 = z;
        if (z) {
            i = 2131231244;
        } else {
            i = 2131231273;
        }
        gm.L3(backButton, i);
        yq0 yq0Var = wx0Var.o0;
        if (yq0Var != null) {
            yq0Var.L = z;
            yq0Var.invalidate();
        }
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z) {
        this.d.t0 = z;
    }

    @Override
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
        wx0 wx0Var = this.d;
        sx0 sx0Var = wx0Var.n0;
        ?? obj = new Object();
        obj.a = z;
        obj.b = z2;
        obj.c = z3;
        obj.d = z4;
        obj.e = str;
        obj.f = j;
        obj.g = i;
        obj.h = i2;
        obj.i = str2;
        int totalHeight = sx0Var.getTotalHeight();
        sx0Var.e.d = obj;
        zp0.b(sx0Var.f[1].l, obj, true);
        sx0Var.invalidate();
        if (totalHeight != sx0Var.getTotalHeight() && sx0Var.r != null) {
            int totalHeight2 = sx0Var.getTotalHeight();
            Runnable runnable = sx0Var.r;
            if (totalHeight < totalHeight2) {
                gm.d3(runnable, 200L);
            } else {
                runnable.run();
            }
        }
        if (wx0Var.f0) {
            wx0Var.I();
            wx0Var.L();
        }
    }

    @Override
    public final void m(int i) {
        this.d.A(i, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        wx0 wx0Var = this.d;
        nx0 nx0Var = wx0Var.x;
        vx0 vx0Var = wx0Var.f;
        d lastFragment = ((LaunchActivity) wx0Var.m0).N().getLastFragment();
        p pVar = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            gm.t1(vx0Var);
            he heVar = new he(3, null, wx0Var.getContext());
            heVar.q(150L);
            jva.v(wx0Var.I, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new td(heVar, (byte) 3), new x0(this, str, (byte) 8));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            oc7.r1(wx0Var.I).d4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            nx0Var.d(nx0Var.getTopActionBarOffsetY() + (-nx0Var.getOffsetY()));
            gm.t1(vx0Var);
            ht7 ht7Var = new ht7(this.b);
            ht7Var.show();
            pVar.a1 = new jf(this, ht7Var, str, (byte) 7);
            pVar.Z0 = this.c;
            ht7Var.c(pVar);
        }
    }

    @Override
    public final void p(boolean z) {
        this.d.t(z);
    }

    @Override
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        wx0 wx0Var = this.d;
        sx0 sx0Var = wx0Var.n0;
        ?? obj = new Object();
        obj.a = z;
        obj.b = z2;
        obj.c = z3;
        obj.d = z4;
        obj.e = str;
        obj.f = j;
        obj.g = i;
        obj.h = i2;
        obj.i = null;
        int totalHeight = sx0Var.getTotalHeight();
        sx0Var.e.c = obj;
        xp0[] xp0VarArr = sx0Var.f;
        xp0VarArr[0].l.a();
        if (obj.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new gn(obj.f, 1.4f, xp0VarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            xp0VarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            xp0VarArr[0].l.t(obj.e, true, true);
        }
        sx0Var.invalidate();
        if (totalHeight != sx0Var.getTotalHeight() && sx0Var.r != null) {
            int totalHeight2 = sx0Var.getTotalHeight();
            Runnable runnable = sx0Var.r;
            if (totalHeight < totalHeight2) {
                gm.d3(runnable, 200L);
            } else {
                runnable.run();
            }
        }
        if (wx0Var.f0) {
            wx0Var.I();
            wx0Var.L();
        }
    }

    @Override
    public final void r(int i) {
        this.d.D(i, true);
    }

    @Override
    public final void s() {
        nx0 nx0Var = this.d.x;
        if (nx0Var.c) {
            return;
        }
        nx0Var.d(nx0Var.getTopActionBarOffsetY() + (-nx0Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z) {
        this.d.d0 = z;
    }

    @Override
    public final void u(int i, int i2, boolean z) {
        wx0 wx0Var = this.d;
        wx0Var.w0 = i;
        wx0Var.y(i2, z, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        wx0 wx0Var = this.d;
        if (isEmpty) {
            Activity activity = wx0Var.m0;
            if (activity instanceof LaunchActivity) {
                d lastFragment = ((LaunchActivity) activity).N().getLastFragment();
                if (lastFragment instanceof yv1) {
                    ms1 ms1Var = ((yv1) lastFragment).a0;
                    ms1Var.setFieldText("@" + m9c.p(user) + " " + str);
                    wx0Var.m(false);
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
        nk3 nk3Var = new nk3(bundle);
        gm.t1(wx0Var.f);
        ht7 ht7Var = new ht7(this.b);
        nk3Var.E2 = new lu((Object) this, (Object) user, (Object) ht7Var, str, (byte) 2);
        ht7Var.show();
        ht7Var.c(nk3Var);
    }

    @Override
    public final void w(boolean z) {
        wx0 wx0Var = this.d;
        ylb ylbVar = wx0Var.G;
        FrameLayout frameLayout = wx0Var.r0;
        TLRPC.User W1 = oc7.r1(wx0Var.I).W1(Long.valueOf(wx0Var.J));
        if (z) {
            hi2 hi2Var = new hi2((byte) 12, false);
            jb6.M0(2131743572, null);
            hi2Var.b = new px0(this, (byte) 1);
            u31 V = new c41(frameLayout, ylbVar).V(Arrays.asList(W1), gm.S2(jb6.a0(null, null, 2131753010, m9c.r(W1))), null, hi2Var);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        kt6.t(null, null, 2131753012, new Object[]{m9c.r(W1)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) gm.D2(gm.i2(jb6.M0(2131753011, null), new px0(this, (byte) 2)), true));
        u31 P = new c41(frameLayout, ylbVar).P(2131624012, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override
    public final void x(int i) {
        r(i);
    }

    @Override
    public final void y(boolean z) {
        nx0 nx0Var = this.d.x;
        if (nx0Var != null) {
            nx0Var.setAllowSwipes(z);
        }
    }

    @Override
    public final void z() {
        this.d.m(false);
    }

    @Override
    public final void o(int i, boolean z) {
    }
}
