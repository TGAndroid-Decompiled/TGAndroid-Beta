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
public final class jw0 implements ku0 {
    public boolean a;
    public final Context b;
    public final wjb c;
    public final ow0 d;

    public jw0(ow0 ow0Var, Context context, wjb wjbVar) {
        this.d = ow0Var;
        this.b = context;
        this.c = wjbVar;
    }

    @Override
    public final or0 A() {
        ow0 ow0Var = this.d;
        if (ow0Var.D0 == null) {
            or0 or0Var = new or0(this.b);
            ow0Var.D0 = or0Var;
            or0Var.k = ow0Var.E.getWebView();
        }
        return ow0Var.D0;
    }

    @Override
    public final void a() {
        ow0 ow0Var = this.d;
        TLRPC.User V1 = na7.q1(ow0Var.I).V1(Long.valueOf(ow0Var.J));
        lv6 lv6Var = new lv6((byte) 10, false);
        lv6Var.b = new hw0(this, (byte) 0);
        m21 V = new u21(ow0Var.r0, ow0Var.G).V(Arrays.asList(V1), gl.S2(k96.a0(null, null, 2131753084, l7c.r(V1))), null, lv6Var);
        V.j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.m(true);
    }

    @Override
    public final void c() {
        ow0 ow0Var = this.d;
        if (ow0Var.F0 != null) {
            qx0 O = LaunchActivity.H1.O();
            if (O != null) {
                O.e(ow0Var.F0);
            }
            ow0Var.F0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        ow0 ow0Var = this.d;
        new u21(ow0Var.r0, ow0Var.G).q(document, k96.M0(2131753072, null)).k(true);
    }

    @Override
    public final void e(String str) {
        ow0 ow0Var = this.d;
        if (!ow0Var.o() && ow0Var.L == 0 && !this.a) {
            this.a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = na7.q1(ow0Var.I).m1(ow0Var.J);
            tL_messages_sendWebViewData.random_id = Utilities.b.nextLong();
            tL_messages_sendWebViewData.button_text = ow0Var.O;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(ow0Var.I).sendRequest(tL_messages_sendWebViewData, new iw0(this, (byte) 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String G;
        int size = arrayList.size();
        ow0 ow0Var = this.d;
        if (size == 1) {
            G = k96.a0(null, null, 2131752961, na7.q1(ow0Var.I).y1(((Long) arrayList.get(0)).longValue(), false));
        } else {
            G = k96.G(arrayList.size(), "BotSharedToMany", new Object[0]);
        }
        new u21(ow0Var.r0, ow0Var.G).Q(2131624029, 36, gl.S2(G)).k(true);
    }

    @Override
    public final String g(boolean z, boolean z2) {
        ow0 ow0Var = this.d;
        boolean z3 = ow0Var.f0;
        if (z3 == z) {
            if (!z3) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        ow0Var.C(z, true, z2);
        return null;
    }

    @Override
    public final boolean h() {
        ow0 ow0Var = this.d;
        if (!ow0Var.o()) {
            if (hq6.d0(ow0Var.I).l(ow0Var.J) || na7.q1(ow0Var.I).S3.contains(Long.valueOf(ow0Var.J))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z) {
        int i;
        ow0 ow0Var = this.d;
        ImageView backButton = ow0Var.Y.getBackButton();
        ow0Var.y0 = z;
        if (z) {
            i = 2131231243;
        } else {
            i = 2131231272;
        }
        gl.L3(backButton, i);
        yp0 yp0Var = ow0Var.o0;
        if (yp0Var != null) {
            yp0Var.L = z;
            yp0Var.invalidate();
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
        ow0 ow0Var = this.d;
        kw0 kw0Var = ow0Var.n0;
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
        int totalHeight = kw0Var.getTotalHeight();
        kw0Var.e.d = obj;
        zo0.b(kw0Var.f[1].l, obj, true);
        kw0Var.invalidate();
        if (totalHeight != kw0Var.getTotalHeight() && kw0Var.r != null) {
            int totalHeight2 = kw0Var.getTotalHeight();
            Runnable runnable = kw0Var.r;
            if (totalHeight < totalHeight2) {
                gl.d3(runnable, 200L);
            } else {
                runnable.run();
            }
        }
        if (ow0Var.f0) {
            ow0Var.I();
            ow0Var.L();
        }
    }

    @Override
    public final void m(int i) {
        this.d.A(i, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        ow0 ow0Var = this.d;
        fw0 fw0Var = ow0Var.x;
        nw0 nw0Var = ow0Var.f;
        d lastFragment = ((LaunchActivity) ow0Var.m0).N().getLastFragment();
        p pVar = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            gl.t1(nw0Var);
            hd hdVar = new hd(3, null, ow0Var.getContext());
            hdVar.q(150L);
            gta.v(ow0Var.I, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new tc(hdVar, (byte) 3), new x0(this, str, (byte) 7));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            na7.q1(ow0Var.I).b4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            fw0Var.d(fw0Var.getTopActionBarOffsetY() + (-fw0Var.getOffsetY()));
            gl.t1(nw0Var);
            gr7 gr7Var = new gr7(this.b);
            gr7Var.show();
            pVar.a1 = new ie(this, gr7Var, str, (byte) 7);
            pVar.Z0 = this.c;
            gr7Var.c(pVar);
        }
    }

    @Override
    public final void p(boolean z) {
        this.d.t(z);
    }

    @Override
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        ow0 ow0Var = this.d;
        kw0 kw0Var = ow0Var.n0;
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
        int totalHeight = kw0Var.getTotalHeight();
        kw0Var.e.c = obj;
        xo0[] xo0VarArr = kw0Var.f;
        xo0VarArr[0].l.a();
        if (obj.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new gm(obj.f, 1.4f, xo0VarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            xo0VarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            xo0VarArr[0].l.t(obj.e, true, true);
        }
        kw0Var.invalidate();
        if (totalHeight != kw0Var.getTotalHeight() && kw0Var.r != null) {
            int totalHeight2 = kw0Var.getTotalHeight();
            Runnable runnable = kw0Var.r;
            if (totalHeight < totalHeight2) {
                gl.d3(runnable, 200L);
            } else {
                runnable.run();
            }
        }
        if (ow0Var.f0) {
            ow0Var.I();
            ow0Var.L();
        }
    }

    @Override
    public final void r(int i) {
        this.d.D(i, true);
    }

    @Override
    public final void s() {
        fw0 fw0Var = this.d.x;
        if (fw0Var.c) {
            return;
        }
        fw0Var.d(fw0Var.getTopActionBarOffsetY() + (-fw0Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z) {
        this.d.d0 = z;
    }

    @Override
    public final void u(int i, int i2, boolean z) {
        ow0 ow0Var = this.d;
        ow0Var.w0 = i;
        ow0Var.y(i2, z, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ow0 ow0Var = this.d;
        if (isEmpty) {
            Activity activity = ow0Var.m0;
            if (activity instanceof LaunchActivity) {
                d lastFragment = ((LaunchActivity) activity).N().getLastFragment();
                if (lastFragment instanceof mu1) {
                    ar1 ar1Var = ((mu1) lastFragment).a0;
                    ar1Var.setFieldText("@" + l7c.p(user) + " " + str);
                    ow0Var.m(false);
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
        cj3 cj3Var = new cj3(bundle);
        gl.t1(ow0Var.f);
        gr7 gr7Var = new gr7(this.b);
        cj3Var.E2 = new lt((Object) this, (Object) user, (Object) gr7Var, str, (byte) 2);
        gr7Var.show();
        gr7Var.c(cj3Var);
    }

    @Override
    public final void w(boolean z) {
        ow0 ow0Var = this.d;
        wjb wjbVar = ow0Var.G;
        FrameLayout frameLayout = ow0Var.r0;
        TLRPC.User V1 = na7.q1(ow0Var.I).V1(Long.valueOf(ow0Var.J));
        if (z) {
            lv6 lv6Var = new lv6((byte) 10, false);
            k96.M0(2131743646, null);
            lv6Var.b = new hw0(this, (byte) 1);
            m21 V = new u21(frameLayout, wjbVar).V(Arrays.asList(V1), gl.S2(k96.a0(null, null, 2131753042, l7c.r(V1))), null, lv6Var);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ls6.s(null, null, 2131753044, new Object[]{l7c.r(V1)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) gl.D2(gl.i2(k96.M0(2131753043, null), new hw0(this, (byte) 2)), true));
        m21 P = new u21(frameLayout, wjbVar).P(2131624012, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override
    public final void x(int i) {
        r(i);
    }

    @Override
    public final void y(boolean z) {
        fw0 fw0Var = this.d.x;
        if (fw0Var != null) {
            fw0Var.setAllowSwipes(z);
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
