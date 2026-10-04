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
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.so0;
import org.telegram.ui.uy;
import org.telegram.ui.yn;
import yh.t5;
public final class g3 implements org.telegram.ui.web.h0 {
    public boolean f9063a;
    public final Context f9064b;
    public final d6 f9065c;
    public final l3 d;

    public g3(l3 l3Var, Context context, d6 d6Var) {
        this.d = l3Var;
        this.f9064b = context;
        this.f9065c = d6Var;
    }

    @Override
    public final void a() {
        l3 l3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(l3Var.G).getUser(Long.valueOf(l3Var.H));
        o0.a aVar = new o0.a(3, (byte) 0);
        aVar.f16927b = new d3(this, 0);
        rc V = new yc(l3Var.f9169p0, l3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
        V.f30338j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.k(true);
    }

    @Override
    public final void c() {
        l3 l3Var = this.d;
        if (l3Var.D0 != null) {
            org.telegram.ui.ActionBar.n3 P = LaunchActivity.G1.P();
            if (P != null) {
                P.e(l3Var.D0);
            }
            l3Var.D0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        l3 l3Var = this.d;
        new yc(l3Var.f9169p0, l3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        l3 l3Var = this.d;
        if (l3Var.J == 0 && !this.f9063a) {
            this.f9063a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(l3Var.G).getInputUser(l3Var.H);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = l3Var.M;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(l3Var.G).sendRequest(tL_messages_sendWebViewData, new e3(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String formatPluralString;
        int size = arrayList.size();
        l3 l3Var = this.d;
        if (size == 1) {
            formatPluralString = LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(l3Var.G).getPeerName(((Long) arrayList.get(0)).longValue()));
        } else {
            formatPluralString = LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]);
        }
        new yc(l3Var.f9169p0, l3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        l3 l3Var = this.d;
        boolean z12 = l3Var.f9155d0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        l3Var.x(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        l3 l3Var = this.d;
        if (!MediaDataController.getInstance(l3Var.G).botInAttachMenu(l3Var.H) && !MessagesController.getInstance(l3Var.G).whitelistedBots.contains(Long.valueOf(l3Var.H))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        l3 l3Var = this.d;
        ImageView backButton = l3Var.W.getBackButton();
        l3Var.f9179w0 = z10;
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
        BotFullscreenButtons botFullscreenButtons = l3Var.m0;
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
        this.d.f9172r0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
        l3 l3Var = this.d;
        h3 h3Var = l3Var.f9165l0;
        ?? obj = new Object();
        obj.f9440a = z10;
        obj.f9441b = z11;
        obj.f9442c = z12;
        obj.d = z13;
        obj.f9443e = str;
        obj.f9444f = j3;
        obj.f9445g = i10;
        obj.h = i11;
        obj.f9446i = str2;
        int totalHeight = h3Var.getTotalHeight();
        h3Var.f9469e.d = obj;
        y.b(h3Var.f9470f[1].f9411l, obj, true);
        h3Var.invalidate();
        if (totalHeight != h3Var.getTotalHeight() && h3Var.f9472r != null) {
            if (totalHeight < h3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(h3Var.f9472r, 200L);
            } else {
                h3Var.f9472r.run();
            }
        }
        if (l3Var.f9155d0) {
            l3Var.D();
            l3Var.G();
        }
    }

    @Override
    public final void m(int i10) {
        this.d.v(i10, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        l3 l3Var = this.d;
        b3 b3Var = l3Var.v;
        k3 k3Var = l3Var.f9156e;
        org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) l3Var.f9164k0).O().getLastFragment();
        so0 so0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(k3Var);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(l3Var.getContext(), 3, null);
            b2Var.q(150L);
            t5.y(l3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new f3(b2Var, 0), new ai.g3(12, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(l3Var.G).putUsers(paymentForm.users, false);
            so0Var = new so0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            so0Var = new so0((TLRPC.PaymentReceipt) tLObject);
        }
        if (so0Var != null) {
            b3Var.e(b3Var.getTopActionBarOffsetY() + (-b3Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(k3Var);
            md0 md0Var = new md0(this.f9064b);
            md0Var.show();
            so0Var.Z0 = new q5(this, md0Var, str, 8);
            so0Var.Y0 = this.f9065c;
            md0Var.c(so0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        l3 l3Var = this.d;
        h3 h3Var = l3Var.f9165l0;
        ?? obj = new Object();
        obj.f9440a = z10;
        obj.f9441b = z11;
        obj.f9442c = z12;
        obj.d = z13;
        obj.f9443e = str;
        obj.f9444f = j3;
        obj.f9445g = i10;
        obj.h = i11;
        obj.f9446i = null;
        int totalHeight = h3Var.getTotalHeight();
        h3Var.f9469e.f300c = obj;
        w[] wVarArr = h3Var.f9470f;
        wVarArr[0].f9411l.b();
        if (obj.f9444f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.f9443e);
            spannableStringBuilder.setSpan(new z5(obj.f9444f, 1.4f, wVarArr[0].f9411l.f29238a.getFontMetricsInt()), 0, 1, 33);
            wVarArr[0].f9411l.q(spannableStringBuilder, true, true);
        } else {
            wVarArr[0].f9411l.q(obj.f9443e, true, true);
        }
        h3Var.invalidate();
        if (totalHeight != h3Var.getTotalHeight() && h3Var.f9472r != null) {
            if (totalHeight < h3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(h3Var.f9472r, 200L);
            } else {
                h3Var.f9472r.run();
            }
        }
        if (l3Var.f9155d0) {
            l3Var.D();
            l3Var.G();
        }
    }

    @Override
    public final void r(int i10) {
        this.d.y(i10, true);
    }

    @Override
    public final void s() {
        b3 b3Var = this.d.v;
        if (b3Var.f9284c) {
            return;
        }
        b3Var.e(b3Var.getTopActionBarOffsetY() + (-b3Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f9152b0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        l3 l3Var = this.d;
        l3Var.f9176u0 = i10;
        l3Var.t(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        l3 l3Var = this.d;
        if (isEmpty) {
            Activity activity = l3Var.f9164k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof yn) {
                    jk jkVar = ((yn) lastFragment).W;
                    jkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    l3Var.k(false);
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
        AndroidUtilities.hideKeyboard(l3Var.f9156e);
        md0 md0Var = new md0(this.f9064b);
        uyVar.C2 = new a1.d(this, user, str, md0Var, 2);
        md0Var.show();
        md0Var.c(uyVar);
    }

    @Override
    public final void w(boolean z10) {
        l3 l3Var = this.d;
        d6 d6Var = l3Var.E;
        FrameLayout frameLayout = l3Var.f9169p0;
        TLRPC.User user = MessagesController.getInstance(l3Var.G).getUser(Long.valueOf(l3Var.H));
        if (z10) {
            o0.a aVar = new o0.a(3, (byte) 0);
            LocaleController.getString(R.string.UndoNoCaps);
            aVar.f16927b = new d3(this, 1);
            rc V = new yc(frameLayout, d6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
            V.f30338j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new d3(this, 2)), true));
        rc P = new yc(frameLayout, d6Var).P(R.raw.error, spannableStringBuilder);
        P.f30338j = 5000;
        P.k(true);
    }

    @Override
    public final void x(boolean z10) {
        b3 b3Var = this.d.v;
        if (b3Var != null) {
            b3Var.setAllowSwipes(z10);
        }
    }

    @Override
    public final void y() {
        this.d.k(false);
    }

    @Override
    public final b1 z() {
        l3 l3Var = this.d;
        if (l3Var.B0 == null) {
            b1 b1Var = new b1(this.f9064b);
            l3Var.B0 = b1Var;
            b1Var.f8931k = l3Var.f9180x.getWebView();
        }
        return l3Var.B0;
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
