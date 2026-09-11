package fi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.mk;
import org.telegram.ui.uy;
import org.telegram.ui.xo0;
import zh.s5;
public final class f3 implements org.telegram.ui.web.i0 {
    public boolean f9655a;
    public final Context f9656b;
    public final f6 f9657c;
    public final k3 d;

    public f3(k3 k3Var, Context context, f6 f6Var) {
        this.d = k3Var;
        this.f9656b = context;
        this.f9657c = f6Var;
    }

    @Override
    public final void a() {
        k3 k3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        o0.a aVar = new o0.a(3, (byte) 0);
        aVar.f16769b = new c3(this, 0);
        qc V = new yc(k3Var.f9778p0, k3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
        V.f29679j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.k(true);
    }

    @Override
    public final void c() {
        k3 k3Var = this.d;
        if (k3Var.D0 != null) {
            org.telegram.ui.ActionBar.o3 P = LaunchActivity.G1.P();
            if (P != null) {
                P.e(k3Var.D0);
            }
            k3Var.D0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        k3 k3Var = this.d;
        new yc(k3Var.f9778p0, k3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        k3 k3Var = this.d;
        if (k3Var.J == 0 && !this.f9655a) {
            this.f9655a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(k3Var.G).getInputUser(k3Var.H);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = k3Var.M;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(k3Var.G).sendRequest(tL_messages_sendWebViewData, new d3(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String formatPluralString;
        int size = arrayList.size();
        k3 k3Var = this.d;
        if (size == 1) {
            formatPluralString = LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(k3Var.G).getPeerName(((Long) arrayList.get(0)).longValue()));
        } else {
            formatPluralString = LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]);
        }
        new yc(k3Var.f9778p0, k3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        k3 k3Var = this.d;
        boolean z12 = k3Var.f9764d0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        k3Var.x(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        k3 k3Var = this.d;
        if (!MediaDataController.getInstance(k3Var.G).botInAttachMenu(k3Var.H) && !MessagesController.getInstance(k3Var.G).whitelistedBots.contains(Long.valueOf(k3Var.H))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        k3 k3Var = this.d;
        ImageView backButton = k3Var.W.getBackButton();
        k3Var.f9788w0 = z10;
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
        BotFullscreenButtons botFullscreenButtons = k3Var.m0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z10, true);
        }
    }

    @Override
    public final void j() {
        y();
    }

    @Override
    public final void k(boolean z10) {
        this.d.f9781r0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.f9774l0;
        ?? obj = new Object();
        obj.f10044a = z10;
        obj.f10045b = z11;
        obj.f10046c = z12;
        obj.d = z13;
        obj.f10047e = str;
        obj.f10048f = j3;
        obj.f10049g = i10;
        obj.h = i11;
        obj.f10050i = str2;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.f10073e.d = obj;
        x.b(g3Var.f10074f[1].f10015l, obj, true);
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.f10076r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.f10076r, 200L);
            } else {
                g3Var.f10076r.run();
            }
        }
        if (k3Var.f9764d0) {
            k3Var.D();
            k3Var.G();
        }
    }

    @Override
    public final void m(int i10) {
        this.d.v(i10, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        k3 k3Var = this.d;
        a3 a3Var = k3Var.v;
        j3 j3Var = k3Var.f9765e;
        org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) k3Var.f9773k0).O().getLastFragment();
        xo0 xo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(j3Var);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(k3Var.getContext(), 3, null);
            b2Var.q(150L);
            s5.y(k3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e3(b2Var, 0), new di.m2(11, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k3Var.G).putUsers(paymentForm.users, false);
            xo0Var = new xo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            xo0Var = new xo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (xo0Var != null) {
            a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(j3Var);
            ad0 ad0Var = new ad0(this.f9656b);
            ad0Var.show();
            xo0Var.Z0 = new androidx.car.app.utils.a(this, ad0Var, str, 8);
            xo0Var.Y0 = this.f9657c;
            ad0Var.c(xo0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.f9774l0;
        ?? obj = new Object();
        obj.f10044a = z10;
        obj.f10045b = z11;
        obj.f10046c = z12;
        obj.d = z13;
        obj.f10047e = str;
        obj.f10048f = j3;
        obj.f10049g = i10;
        obj.h = i11;
        obj.f10050i = null;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.f10073e.f286c = obj;
        v[] vVarArr = g3Var.f10074f;
        vVarArr[0].f10015l.b();
        if (obj.f10048f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.f10047e);
            spannableStringBuilder.setSpan(new z5(obj.f10048f, 1.4f, vVarArr[0].f10015l.f29284a.getFontMetricsInt()), 0, 1, 33);
            vVarArr[0].f10015l.q(spannableStringBuilder, true, true);
        } else {
            vVarArr[0].f10015l.q(obj.f10047e, true, true);
        }
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.f10076r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.f10076r, 200L);
            } else {
                g3Var.f10076r.run();
            }
        }
        if (k3Var.f9764d0) {
            k3Var.D();
            k3Var.G();
        }
    }

    @Override
    public final void r(int i10) {
        this.d.y(i10, true);
    }

    @Override
    public final void s() {
        a3 a3Var = this.d.v;
        if (a3Var.f9906c) {
            return;
        }
        a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f9761b0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        k3 k3Var = this.d;
        k3Var.f9785u0 = i10;
        k3Var.t(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        k3 k3Var = this.d;
        if (isEmpty) {
            Activity activity = k3Var.f9773k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof co) {
                    mk mkVar = ((co) lastFragment).Y;
                    mkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    k3Var.k(false);
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
        uy uyVar = new uy(bundle);
        AndroidUtilities.hideKeyboard(k3Var.f9765e);
        ad0 ad0Var = new ad0(this.f9656b);
        uyVar.C2 = new a1.d(this, user, str, ad0Var, 2);
        ad0Var.show();
        ad0Var.c(uyVar);
    }

    @Override
    public final void w(boolean z10) {
        k3 k3Var = this.d;
        f6 f6Var = k3Var.E;
        FrameLayout frameLayout = k3Var.f9778p0;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        if (z10) {
            o0.a aVar = new o0.a(3, (byte) 0);
            LocaleController.getString(R.string.UndoNoCaps);
            aVar.f16769b = new c3(this, 1);
            qc V = new yc(frameLayout, f6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
            V.f29679j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new c3(this, 2)), true));
        qc P = new yc(frameLayout, f6Var).P(R.raw.error, spannableStringBuilder);
        P.f29679j = 5000;
        P.k(true);
    }

    @Override
    public final void x(boolean z10) {
        a3 a3Var = this.d.v;
        if (a3Var != null) {
            a3Var.setAllowSwipes(z10);
        }
    }

    @Override
    public final void y() {
        this.d.k(false);
    }

    @Override
    public final a1 z() {
        k3 k3Var = this.d;
        if (k3Var.B0 == null) {
            a1 a1Var = new a1(this.f9656b);
            k3Var.B0 = a1Var;
            a1Var.f9537k = k3Var.f9789x.getWebView();
        }
        return k3Var.B0;
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
