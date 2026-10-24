package gi;

import ai.ha;
import ai.v4;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.gk;
import org.telegram.ui.ho0;
import org.telegram.ui.sn;
public final class y2 implements org.telegram.ui.web.h0 {
    public boolean f11594a;
    public final Context f11595b;
    public final g6 f11596c;
    public final d3 d;

    public y2(d3 d3Var, Context context, g6 g6Var) {
        this.d = d3Var;
        this.f11595b = context;
        this.f11596c = g6Var;
    }

    @Override
    public final y0 A() {
        d3 d3Var = this.d;
        if (d3Var.C0 == null) {
            y0 y0Var = new y0(this.f11595b);
            d3Var.C0 = y0Var;
            y0Var.f11582k = d3Var.f11188y.getWebView();
        }
        return d3Var.C0;
    }

    @Override
    public final void a() {
        d3 d3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(d3Var.H).getUser(Long.valueOf(d3Var.I));
        mi.q qVar = new mi.q(9, (byte) 0);
        qVar.f17036b = new w2(this, 0);
        oc V = new vc(d3Var.f11176q0, d3Var.F).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, qVar);
        V.f29203j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.k(true);
    }

    @Override
    public final void c() {
        d3 d3Var = this.d;
        if (d3Var.E0 != null) {
            org.telegram.ui.ActionBar.q3 P = LaunchActivity.I1.P();
            if (P != null) {
                P.e(d3Var.E0);
            }
            d3Var.E0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        d3 d3Var = this.d;
        new vc(d3Var.f11176q0, d3Var.F).q(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        d3 d3Var = this.d;
        if (!d3Var.m() && d3Var.K == 0 && !this.f11594a) {
            this.f11594a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(d3Var.H).getInputUser(d3Var.I);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = d3Var.N;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(d3Var.H).sendRequest(tL_messages_sendWebViewData, new x2(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String formatPluralString;
        int size = arrayList.size();
        d3 d3Var = this.d;
        if (size == 1) {
            formatPluralString = LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(d3Var.H).getPeerName(((Long) arrayList.get(0)).longValue()));
        } else {
            formatPluralString = LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]);
        }
        new vc(d3Var.f11176q0, d3Var.F).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        d3 d3Var = this.d;
        boolean z12 = d3Var.f11163e0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        d3Var.y(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        d3 d3Var = this.d;
        if (!d3Var.m()) {
            if (MediaDataController.getInstance(d3Var.H).botInAttachMenu(d3Var.I) || MessagesController.getInstance(d3Var.H).whitelistedBots.contains(Long.valueOf(d3Var.I))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        d3 d3Var = this.d;
        ImageView backButton = d3Var.X.getBackButton();
        d3Var.f11187x0 = z10;
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
        BotFullscreenButtons botFullscreenButtons = d3Var.f11173n0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z10, true);
        }
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.d.f11180s0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        d3 d3Var = this.d;
        z2 z2Var = d3Var.m0;
        ?? obj = new Object();
        obj.f11529a = z10;
        obj.f11530b = z11;
        obj.f11531c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f11532f = j10;
        obj.f11533g = i10;
        obj.h = i11;
        obj.f11534i = str2;
        int totalHeight = z2Var.getTotalHeight();
        z2Var.e.d = obj;
        w.b(z2Var.f11546f[1].f11514l, obj, true);
        z2Var.invalidate();
        if (totalHeight != z2Var.getTotalHeight() && z2Var.f11548r != null) {
            if (totalHeight < z2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(z2Var.f11548r, 200L);
            } else {
                z2Var.f11548r.run();
            }
        }
        if (d3Var.f11163e0) {
            d3Var.E();
            d3Var.H();
        }
    }

    @Override
    public final void m(int i10) {
        this.d.w(i10, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        d3 d3Var = this.d;
        u2 u2Var = d3Var.f11184w;
        c3 c3Var = d3Var.f11164f;
        org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) d3Var.f11171l0).O().getLastFragment();
        ho0 ho0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(c3Var);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(d3Var.getContext(), 3, null);
            c2Var.r(150L);
            ha.y(d3Var.H, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new v4(c2Var, 1), new ai.o2(18, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(d3Var.H).putUsers(paymentForm.users, false);
            ho0Var = new ho0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ho0Var = new ho0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ho0Var != null) {
            u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(c3Var);
            ud0 ud0Var = new ud0(this.f11595b);
            ud0Var.show();
            ho0Var.Z0 = new ai.u2(this, ud0Var, str, 9);
            ho0Var.Y0 = this.f11596c;
            ud0Var.c(ho0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.p(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        d3 d3Var = this.d;
        z2 z2Var = d3Var.m0;
        ?? obj = new Object();
        obj.f11529a = z10;
        obj.f11530b = z11;
        obj.f11531c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f11532f = j10;
        obj.f11533g = i10;
        obj.h = i11;
        obj.f11534i = null;
        int totalHeight = z2Var.getTotalHeight();
        z2Var.e.f282c = obj;
        u[] uVarArr = z2Var.f11546f;
        uVarArr[0].f11514l.a();
        if (obj.f11532f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new y5(obj.f11532f, 1.4f, uVarArr[0].f11514l.f28795a.getFontMetricsInt()), 0, 1, 33);
            uVarArr[0].f11514l.t(spannableStringBuilder, true, true);
        } else {
            uVarArr[0].f11514l.t(obj.e, true, true);
        }
        z2Var.invalidate();
        if (totalHeight != z2Var.getTotalHeight() && z2Var.f11548r != null) {
            if (totalHeight < z2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(z2Var.f11548r, 200L);
            } else {
                z2Var.f11548r.run();
            }
        }
        if (d3Var.f11163e0) {
            d3Var.E();
            d3Var.H();
        }
    }

    @Override
    public final void r(int i10) {
        this.d.z(i10, true);
    }

    @Override
    public final void s() {
        u2 u2Var = this.d.f11184w;
        if (u2Var.f11206c) {
            return;
        }
        u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f11161c0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        d3 d3Var = this.d;
        d3Var.f11183v0 = i10;
        d3Var.u(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        d3 d3Var = this.d;
        if (isEmpty) {
            Activity activity = d3Var.f11171l0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof sn) {
                    gk gkVar = ((sn) lastFragment).Y;
                    gkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    d3Var.k(false);
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
        ey eyVar = new ey(bundle);
        AndroidUtilities.hideKeyboard(d3Var.f11164f);
        ud0 ud0Var = new ud0(this.f11595b);
        eyVar.C2 = new a1.d(this, user, str, ud0Var, 4);
        ud0Var.show();
        ud0Var.c(eyVar);
    }

    @Override
    public final void w(boolean z10) {
        d3 d3Var = this.d;
        g6 g6Var = d3Var.F;
        FrameLayout frameLayout = d3Var.f11176q0;
        TLRPC.User user = MessagesController.getInstance(d3Var.H).getUser(Long.valueOf(d3Var.I));
        if (z10) {
            mi.q qVar = new mi.q(9, (byte) 0);
            LocaleController.getString(R.string.UndoNoCaps);
            qVar.f17036b = new w2(this, 1);
            oc V = new vc(frameLayout, g6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, qVar);
            V.f29203j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new w2(this, 2)), true));
        oc P = new vc(frameLayout, g6Var).P(R.raw.error, spannableStringBuilder);
        P.f29203j = 5000;
        P.k(true);
    }

    @Override
    public final void x(int i10) {
        r(i10);
    }

    @Override
    public final void y(boolean z10) {
        u2 u2Var = this.d.f11184w;
        if (u2Var != null) {
            u2Var.setAllowSwipes(z10);
        }
    }

    @Override
    public final void z() {
        this.d.k(false);
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
