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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p;
public final class sw0 implements uu0 {
    public boolean a;
    public final Context b;
    public final vnb c;
    public final xw0 d;

    public sw0(xw0 xw0Var, Context context, vnb vnbVar) {
        this.d = xw0Var;
        this.b = context;
        this.c = vnbVar;
    }

    @Override
    public final wr0 A() {
        xw0 xw0Var = this.d;
        if (xw0Var.D0 == null) {
            wr0 wr0Var = new wr0(this.b);
            xw0Var.D0 = wr0Var;
            wr0Var.k = xw0Var.E.getWebView();
        }
        return xw0Var.D0;
    }

    @Override
    public final void a() {
        xw0 xw0Var = this.d;
        TLRPC.User X1 = uc7.s1(xw0Var.I).X1(Long.valueOf(xw0Var.J));
        qx6 qx6Var = new qx6((byte) 10, false);
        qx6Var.b = new qw0(this, (byte) 0);
        v21 V = new d31(xw0Var.r0, xw0Var.G).V(Arrays.asList(X1), hl.S2(ob6.a0(null, null, 2131753080, lbc.r(X1))), null, qx6Var);
        V.j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.m(true);
    }

    @Override
    public final void c() {
        xw0 xw0Var = this.d;
        if (xw0Var.F0 != null) {
            yx0 O = LaunchActivity.H1.O();
            if (O != null) {
                O.e(xw0Var.F0);
            }
            xw0Var.F0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        xw0 xw0Var = this.d;
        new d31(xw0Var.r0, xw0Var.G).q(document, ob6.M0(2131753068, null)).k(true);
    }

    @Override
    public final void e(String str) {
        xw0 xw0Var = this.d;
        if (!xw0Var.o() && xw0Var.L == 0 && !this.a) {
            this.a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = uc7.s1(xw0Var.I).o1(xw0Var.J);
            tL_messages_sendWebViewData.random_id = Utilities.b.nextLong();
            tL_messages_sendWebViewData.button_text = xw0Var.O;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(xw0Var.I).sendRequest(tL_messages_sendWebViewData, new rw0(this, (byte) 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String G;
        int size = arrayList.size();
        xw0 xw0Var = this.d;
        if (size == 1) {
            G = ob6.a0(null, null, 2131752954, uc7.s1(xw0Var.I).A1(((Long) arrayList.get(0)).longValue(), false));
        } else {
            G = ob6.G(arrayList.size(), "BotSharedToMany", new Object[0]);
        }
        new d31(xw0Var.r0, xw0Var.G).Q(2131624029, 36, hl.S2(G)).k(true);
    }

    @Override
    public final String g(boolean z, boolean z2) {
        xw0 xw0Var = this.d;
        boolean z3 = xw0Var.f0;
        if (z3 == z) {
            if (!z3) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        xw0Var.C(z, true, z2);
        return null;
    }

    @Override
    public final boolean h() {
        xw0 xw0Var = this.d;
        if (!xw0Var.o()) {
            if (ls6.d0(xw0Var.I).l(xw0Var.J) || uc7.s1(xw0Var.I).T3.contains(Long.valueOf(xw0Var.J))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z) {
        int i;
        xw0 xw0Var = this.d;
        ImageView backButton = xw0Var.Y.getBackButton();
        xw0Var.y0 = z;
        if (z) {
            i = 2131231243;
        } else {
            i = 2131231272;
        }
        hl.L3(backButton, i);
        yp0 yp0Var = xw0Var.o0;
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
        xw0 xw0Var = this.d;
        tw0 tw0Var = xw0Var.n0;
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
        int totalHeight = tw0Var.getTotalHeight();
        tw0Var.e.d = obj;
        zo0.b(tw0Var.f[1].l, obj, true);
        tw0Var.invalidate();
        if (totalHeight != tw0Var.getTotalHeight() && tw0Var.r != null) {
            int totalHeight2 = tw0Var.getTotalHeight();
            Runnable runnable = tw0Var.r;
            if (totalHeight < totalHeight2) {
                hl.d3(runnable, 200L);
            } else {
                runnable.run();
            }
        }
        if (xw0Var.f0) {
            xw0Var.I();
            xw0Var.L();
        }
    }

    @Override
    public final void m(int i) {
        this.d.A(i, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        xw0 xw0Var = this.d;
        ow0 ow0Var = xw0Var.x;
        ww0 ww0Var = xw0Var.f;
        e lastFragment = ((LaunchActivity) xw0Var.m0).N().getLastFragment();
        p pVar = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            hl.t1(ww0Var);
            id idVar = new id(3, null, xw0Var.getContext());
            idVar.q(150L);
            jxa.v(xw0Var.I, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new uc(idVar, (byte) 3), new y0(this, str, (byte) 7));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            uc7.s1(xw0Var.I).j4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            ow0Var.d(ow0Var.getTopActionBarOffsetY() + (-ow0Var.getOffsetY()));
            hl.t1(ww0Var);
            mu7 mu7Var = new mu7(this.b);
            mu7Var.show();
            pVar.a1 = new ie(this, mu7Var, str, (byte) 7);
            pVar.Z0 = this.c;
            mu7Var.c(pVar);
        }
    }

    @Override
    public final void p(boolean z) {
        this.d.t(z);
    }

    @Override
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        xw0 xw0Var = this.d;
        tw0 tw0Var = xw0Var.n0;
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
        int totalHeight = tw0Var.getTotalHeight();
        tw0Var.e.c = obj;
        xo0[] xo0VarArr = tw0Var.f;
        xo0VarArr[0].l.a();
        if (obj.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new hm(obj.f, 1.4f, xo0VarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            xo0VarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            xo0VarArr[0].l.t(obj.e, true, true);
        }
        tw0Var.invalidate();
        if (totalHeight != tw0Var.getTotalHeight() && tw0Var.r != null) {
            int totalHeight2 = tw0Var.getTotalHeight();
            Runnable runnable = tw0Var.r;
            if (totalHeight < totalHeight2) {
                hl.d3(runnable, 200L);
            } else {
                runnable.run();
            }
        }
        if (xw0Var.f0) {
            xw0Var.I();
            xw0Var.L();
        }
    }

    @Override
    public final void r(int i) {
        this.d.D(i, true);
    }

    @Override
    public final void s() {
        ow0 ow0Var = this.d.x;
        if (ow0Var.c) {
            return;
        }
        ow0Var.d(ow0Var.getTopActionBarOffsetY() + (-ow0Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z) {
        this.d.d0 = z;
    }

    @Override
    public final void u(int i, int i2, boolean z) {
        xw0 xw0Var = this.d;
        xw0Var.w0 = i;
        xw0Var.y(i2, z, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        xw0 xw0Var = this.d;
        if (isEmpty) {
            Activity activity = xw0Var.m0;
            if (activity instanceof LaunchActivity) {
                e lastFragment = ((LaunchActivity) activity).N().getLastFragment();
                if (lastFragment instanceof zu1) {
                    nr1 nr1Var = ((zu1) lastFragment).a0;
                    nr1Var.setFieldText("@" + lbc.p(user) + " " + str);
                    xw0Var.m(false);
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
        uj3 uj3Var = new uj3(bundle);
        hl.t1(xw0Var.f);
        mu7 mu7Var = new mu7(this.b);
        uj3Var.E2 = new pt((Object) this, (Object) user, (Object) mu7Var, str, (byte) 2);
        mu7Var.show();
        mu7Var.c(uj3Var);
    }

    @Override
    public final void w(boolean z) {
        xw0 xw0Var = this.d;
        vnb vnbVar = xw0Var.G;
        FrameLayout frameLayout = xw0Var.r0;
        TLRPC.User X1 = uc7.s1(xw0Var.I).X1(Long.valueOf(xw0Var.J));
        if (z) {
            qx6 qx6Var = new qx6((byte) 10, false);
            ob6.M0(2131743540, null);
            qx6Var.b = new qw0(this, (byte) 1);
            v21 V = new d31(frameLayout, vnbVar).V(Arrays.asList(X1), hl.S2(ob6.a0(null, null, 2131753038, lbc.r(X1))), null, qx6Var);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        qu6.s(null, null, 2131753040, new Object[]{lbc.r(X1)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) hl.D2(hl.i2(ob6.M0(2131753039, null), new qw0(this, (byte) 2)), true));
        v21 P = new d31(frameLayout, vnbVar).P(2131624012, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override
    public final void x(int i) {
        r(i);
    }

    @Override
    public final void y(boolean z) {
        ow0 ow0Var = this.d.x;
        if (ow0Var != null) {
            ow0Var.setAllowSwipes(z);
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
