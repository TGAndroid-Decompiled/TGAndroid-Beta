package ei;

import ai.q5;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.oo0;
import org.telegram.ui.qy;
import org.telegram.ui.wn;
import yh.s5;
public final class f3 implements org.telegram.ui.web.g0 {
    public boolean f8315a;
    public final Context f8316b;
    public final d6 f8317c;
    public final k3 d;

    public f3(k3 k3Var, Context context, d6 d6Var) {
        this.d = k3Var;
        this.f8316b = context;
        this.f8317c = d6Var;
    }

    @Override
    public final void a() {
        k3 k3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        o0.a aVar = new o0.a(3, (byte) 0);
        aVar.f15482b = new c3(this, 0);
        qc V = new xc(k3Var.f8427p0, k3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
        V.f27578j = 5000;
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
            org.telegram.ui.ActionBar.m3 P = LaunchActivity.G1.P();
            if (P != null) {
                P.e(k3Var.D0);
            }
            k3Var.D0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        k3 k3Var = this.d;
        new xc(k3Var.f8427p0, k3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        k3 k3Var = this.d;
        if (k3Var.J == 0 && !this.f8315a) {
            this.f8315a = true;
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
        new xc(k3Var.f8427p0, k3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        k3 k3Var = this.d;
        boolean z12 = k3Var.f8414d0;
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
        k3Var.f8437w0 = z10;
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
        this.d.f8430r0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.f8423l0;
        ?? obj = new Object();
        obj.f8673a = z10;
        obj.f8674b = z11;
        obj.f8675c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f8676f = j3;
        obj.f8677g = i10;
        obj.h = i11;
        obj.f8678i = str2;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.e.d = obj;
        x.b(g3Var.f8698f[1].f8647l, obj, true);
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.f8700r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.f8700r, 200L);
            } else {
                g3Var.f8700r.run();
            }
        }
        if (k3Var.f8414d0) {
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
        j3 j3Var = k3Var.e;
        org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) k3Var.f8422k0).O().getLastFragment();
        oo0 oo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(j3Var);
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(k3Var.getContext(), 3, null);
            a2Var.q(150L);
            s5.y(k3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e3(a2Var, 0), new ai.g3(12, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k3Var.G).putUsers(paymentForm.users, false);
            oo0Var = new oo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            oo0Var = new oo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (oo0Var != null) {
            a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(j3Var);
            kd0 kd0Var = new kd0(this.f8316b);
            kd0Var.show();
            oo0Var.Z0 = new q5(this, kd0Var, str, 8);
            oo0Var.Y0 = this.f8317c;
            kd0Var.c(oo0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.f8423l0;
        ?? obj = new Object();
        obj.f8673a = z10;
        obj.f8674b = z11;
        obj.f8675c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f8676f = j3;
        obj.f8677g = i10;
        obj.h = i11;
        obj.f8678i = null;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.e.f278c = obj;
        v[] vVarArr = g3Var.f8698f;
        vVarArr[0].f8647l.b();
        if (obj.f8676f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new z5(obj.f8676f, 1.4f, vVarArr[0].f8647l.f26929a.getFontMetricsInt()), 0, 1, 33);
            vVarArr[0].f8647l.q(spannableStringBuilder, true, true);
        } else {
            vVarArr[0].f8647l.q(obj.e, true, true);
        }
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.f8700r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.f8700r, 200L);
            } else {
                g3Var.f8700r.run();
            }
        }
        if (k3Var.f8414d0) {
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
        if (a3Var.f8532c) {
            return;
        }
        a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f8411b0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        k3 k3Var = this.d;
        k3Var.f8434u0 = i10;
        k3Var.t(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        k3 k3Var = this.d;
        if (isEmpty) {
            Activity activity = k3Var.f8422k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof wn) {
                    jk jkVar = ((wn) lastFragment).Y;
                    jkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        qy qyVar = new qy(bundle);
        AndroidUtilities.hideKeyboard(k3Var.e);
        kd0 kd0Var = new kd0(this.f8316b);
        qyVar.C2 = new a1.d(this, user, str, kd0Var, 2);
        kd0Var.show();
        kd0Var.c(qyVar);
    }

    @Override
    public final void w(boolean z10) {
        k3 k3Var = this.d;
        d6 d6Var = k3Var.E;
        FrameLayout frameLayout = k3Var.f8427p0;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        if (z10) {
            o0.a aVar = new o0.a(3, (byte) 0);
            LocaleController.getString(R.string.UndoNoCaps);
            aVar.f15482b = new c3(this, 1);
            qc V = new xc(frameLayout, d6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
            V.f27578j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new c3(this, 2)), true));
        qc P = new xc(frameLayout, d6Var).P(R.raw.error, spannableStringBuilder);
        P.f27578j = 5000;
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
            a1 a1Var = new a1(this.f8316b);
            k3Var.B0 = a1Var;
            a1Var.f8206k = k3Var.f8438x.getWebView();
        }
        return k3Var.B0;
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
