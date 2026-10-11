package ei;

import ai.r5;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ok;
import org.telegram.ui.sy;
import org.telegram.ui.uo0;
import org.telegram.ui.zn;
import yh.n5;
public final class f3 implements org.telegram.ui.web.g0 {
    public boolean f9062a;
    public final Context f9063b;
    public final d6 f9064c;
    public final k3 d;

    public f3(k3 k3Var, Context context, d6 d6Var) {
        this.d = k3Var;
        this.f9063b = context;
        this.f9064c = d6Var;
    }

    @Override
    public final void a() {
        k3 k3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        n6.k kVar = new n6.k(5);
        kVar.f16729b = new c3(this, 0);
        sc V = new ad(k3Var.f9171p0, k3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, kVar);
        V.f30711j = 5000;
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
        new ad(k3Var.f9171p0, k3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        k3 k3Var = this.d;
        if (!k3Var.m() && k3Var.J == 0 && !this.f9062a) {
            this.f9062a = true;
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
        new ad(k3Var.f9171p0, k3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        k3 k3Var = this.d;
        boolean z12 = k3Var.f9157d0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        k3Var.y(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        k3 k3Var = this.d;
        if (!k3Var.m()) {
            if (MediaDataController.getInstance(k3Var.G).botInAttachMenu(k3Var.H) || MessagesController.getInstance(k3Var.G).whitelistedBots.contains(Long.valueOf(k3Var.H))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        k3 k3Var = this.d;
        ImageView backButton = k3Var.W.getBackButton();
        k3Var.f9181w0 = z10;
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
        this.d.f9174r0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.f9167l0;
        ?? obj = new Object();
        obj.f9443a = z10;
        obj.f9444b = z11;
        obj.f9445c = z12;
        obj.d = z13;
        obj.f9446e = str;
        obj.f9447f = j3;
        obj.f9448g = i10;
        obj.h = i11;
        obj.f9449i = str2;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.f9472e.d = obj;
        x.b(g3Var.f9473f[1].f9414l, obj, true);
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.f9475r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.f9475r, 200L);
            } else {
                g3Var.f9475r.run();
            }
        }
        if (k3Var.f9157d0) {
            k3Var.E();
            k3Var.H();
        }
    }

    @Override
    public final void m(int i10) {
        this.d.w(i10, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        k3 k3Var = this.d;
        a3 a3Var = k3Var.v;
        j3 j3Var = k3Var.f9158e;
        org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) k3Var.f9166k0).O().getLastFragment();
        uo0 uo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(j3Var);
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(k3Var.getContext(), 3, null);
            a2Var.q(150L);
            n5.y(k3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e3(a2Var, 0), new ai.h3(12, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k3Var.G).putUsers(paymentForm.users, false);
            uo0Var = new uo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            uo0Var = new uo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (uo0Var != null) {
            a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(j3Var);
            ce0 ce0Var = new ce0(this.f9063b);
            ce0Var.show();
            uo0Var.Z0 = new r5(this, ce0Var, str, 8);
            uo0Var.Y0 = this.f9064c;
            ce0Var.c(uo0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.p(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.f9167l0;
        ?? obj = new Object();
        obj.f9443a = z10;
        obj.f9444b = z11;
        obj.f9445c = z12;
        obj.d = z13;
        obj.f9446e = str;
        obj.f9447f = j3;
        obj.f9448g = i10;
        obj.h = i11;
        obj.f9449i = null;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.f9472e.f300c = obj;
        v[] vVarArr = g3Var.f9473f;
        vVarArr[0].f9414l.a();
        if (obj.f9447f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.f9446e);
            spannableStringBuilder.setSpan(new b6(obj.f9447f, 1.4f, vVarArr[0].f9414l.f30017a.getFontMetricsInt()), 0, 1, 33);
            vVarArr[0].f9414l.t(spannableStringBuilder, true, true);
        } else {
            vVarArr[0].f9414l.t(obj.f9446e, true, true);
        }
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.f9475r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.f9475r, 200L);
            } else {
                g3Var.f9475r.run();
            }
        }
        if (k3Var.f9157d0) {
            k3Var.E();
            k3Var.H();
        }
    }

    @Override
    public final void r(int i10) {
        this.d.z(i10, true);
    }

    @Override
    public final void s() {
        a3 a3Var = this.d.v;
        if (a3Var.f9260c) {
            return;
        }
        a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f9154b0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        k3 k3Var = this.d;
        k3Var.f9178u0 = i10;
        k3Var.u(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        k3 k3Var = this.d;
        if (isEmpty) {
            Activity activity = k3Var.f9166k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof zn) {
                    ok okVar = ((zn) lastFragment).Y;
                    okVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        sy syVar = new sy(bundle);
        AndroidUtilities.hideKeyboard(k3Var.f9158e);
        ce0 ce0Var = new ce0(this.f9063b);
        syVar.C2 = new a1.d(this, user, str, ce0Var, 2);
        ce0Var.show();
        ce0Var.c(syVar);
    }

    @Override
    public final void w(boolean z10) {
        k3 k3Var = this.d;
        d6 d6Var = k3Var.E;
        FrameLayout frameLayout = k3Var.f9171p0;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        if (z10) {
            n6.k kVar = new n6.k(5);
            LocaleController.getString(R.string.UndoNoCaps);
            kVar.f16729b = new c3(this, 1);
            sc V = new ad(frameLayout, d6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, kVar);
            V.f30711j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new c3(this, 2)), true));
        sc P = new ad(frameLayout, d6Var).P(R.raw.error, spannableStringBuilder);
        P.f30711j = 5000;
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
            a1 a1Var = new a1(this.f9063b);
            k3Var.B0 = a1Var;
            a1Var.f8929k = k3Var.f9182x.getWebView();
        }
        return k3Var.B0;
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
