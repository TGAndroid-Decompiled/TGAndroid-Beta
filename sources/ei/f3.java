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
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.qo0;
import org.telegram.ui.ry;
import org.telegram.ui.xn;
import yh.t5;
public final class f3 implements org.telegram.ui.web.g0 {
    public boolean f8316a;
    public final Context f8317b;
    public final d6 f8318c;
    public final k3 d;

    public f3(k3 k3Var, Context context, d6 d6Var) {
        this.d = k3Var;
        this.f8317b = context;
        this.f8318c = d6Var;
    }

    @Override
    public final void a() {
        k3 k3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        o0.a aVar = new o0.a(3, (byte) 0);
        aVar.f15275b = new c3(this, 0);
        qc V = new xc(k3Var.f8428p0, k3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
        V.f27306j = 5000;
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
            org.telegram.ui.ActionBar.n3 P = LaunchActivity.G1.P();
            if (P != null) {
                P.e(k3Var.D0);
            }
            k3Var.D0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        k3 k3Var = this.d;
        new xc(k3Var.f8428p0, k3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        k3 k3Var = this.d;
        if (k3Var.J == 0 && !this.f8316a) {
            this.f8316a = true;
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
        new xc(k3Var.f8428p0, k3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        k3 k3Var = this.d;
        boolean z12 = k3Var.f8415d0;
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
        k3Var.f8438w0 = z10;
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
        this.d.f8431r0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.f8424l0;
        ?? obj = new Object();
        obj.f8674a = z10;
        obj.f8675b = z11;
        obj.f8676c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f8677f = j3;
        obj.f8678g = i10;
        obj.h = i11;
        obj.f8679i = str2;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.e.d = obj;
        x.b(g3Var.f8699f[1].f8648l, obj, true);
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.f8701r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.f8701r, 200L);
            } else {
                g3Var.f8701r.run();
            }
        }
        if (k3Var.f8415d0) {
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
        org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) k3Var.f8423k0).O().getLastFragment();
        qo0 qo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(j3Var);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(k3Var.getContext(), 3, null);
            b2Var.q(150L);
            t5.y(k3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e3(b2Var, 0), new ai.g3(12, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k3Var.G).putUsers(paymentForm.users, false);
            qo0Var = new qo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            qo0Var = new qo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (qo0Var != null) {
            a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(j3Var);
            zc0 zc0Var = new zc0(this.f8317b);
            zc0Var.show();
            qo0Var.Z0 = new q5(this, zc0Var, str, 8);
            qo0Var.Y0 = this.f8318c;
            zc0Var.c(qo0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.f8424l0;
        ?? obj = new Object();
        obj.f8674a = z10;
        obj.f8675b = z11;
        obj.f8676c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f8677f = j3;
        obj.f8678g = i10;
        obj.h = i11;
        obj.f8679i = null;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.e.f278c = obj;
        v[] vVarArr = g3Var.f8699f;
        vVarArr[0].f8648l.b();
        if (obj.f8677f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new z5(obj.f8677f, 1.4f, vVarArr[0].f8648l.f26613a.getFontMetricsInt()), 0, 1, 33);
            vVarArr[0].f8648l.q(spannableStringBuilder, true, true);
        } else {
            vVarArr[0].f8648l.q(obj.e, true, true);
        }
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.f8701r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.f8701r, 200L);
            } else {
                g3Var.f8701r.run();
            }
        }
        if (k3Var.f8415d0) {
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
        if (a3Var.f8533c) {
            return;
        }
        a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f8412b0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        k3 k3Var = this.d;
        k3Var.f8435u0 = i10;
        k3Var.t(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        k3 k3Var = this.d;
        if (isEmpty) {
            Activity activity = k3Var.f8423k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof xn) {
                    jk jkVar = ((xn) lastFragment).Y;
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
        ry ryVar = new ry(bundle);
        AndroidUtilities.hideKeyboard(k3Var.e);
        zc0 zc0Var = new zc0(this.f8317b);
        ryVar.C2 = new a1.d(this, user, str, zc0Var, 2);
        zc0Var.show();
        zc0Var.c(ryVar);
    }

    @Override
    public final void w(boolean z10) {
        k3 k3Var = this.d;
        d6 d6Var = k3Var.E;
        FrameLayout frameLayout = k3Var.f8428p0;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        if (z10) {
            o0.a aVar = new o0.a(3, (byte) 0);
            LocaleController.getString(R.string.UndoNoCaps);
            aVar.f15275b = new c3(this, 1);
            qc V = new xc(frameLayout, d6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
            V.f27306j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new c3(this, 2)), true));
        qc P = new xc(frameLayout, d6Var).P(R.raw.error, spannableStringBuilder);
        P.f27306j = 5000;
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
            a1 a1Var = new a1(this.f8317b);
            k3Var.B0 = a1Var;
            a1Var.f8207k = k3Var.f8439x.getWebView();
        }
        return k3Var.B0;
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
