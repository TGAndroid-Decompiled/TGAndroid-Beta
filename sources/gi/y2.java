package gi;

import ai.ga;
import ai.u4;
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
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.go0;
import org.telegram.ui.hk;
import org.telegram.ui.sn;
public final class y2 implements org.telegram.ui.web.g0 {
    public boolean f11570a;
    public final Context f11571b;
    public final d6 f11572c;
    public final d3 d;

    public y2(d3 d3Var, Context context, d6 d6Var) {
        this.d = d3Var;
        this.f11571b = context;
        this.f11572c = d6Var;
    }

    @Override
    public final void a() {
        d3 d3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H));
        n2.e eVar = new n2.e(7, false);
        eVar.f17042b = new w2(this, 0);
        qc V = new xc(d3Var.f11156p0, d3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, eVar);
        V.f29645j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.k(true);
    }

    @Override
    public final void c() {
        d3 d3Var = this.d;
        if (d3Var.D0 != null) {
            org.telegram.ui.ActionBar.n3 P = LaunchActivity.H1.P();
            if (P != null) {
                P.e(d3Var.D0);
            }
            d3Var.D0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        d3 d3Var = this.d;
        new xc(d3Var.f11156p0, d3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        d3 d3Var = this.d;
        if (!d3Var.m() && d3Var.J == 0 && !this.f11570a) {
            this.f11570a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(d3Var.G).getInputUser(d3Var.H);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = d3Var.M;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(d3Var.G).sendRequest(tL_messages_sendWebViewData, new x2(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String formatPluralString;
        int size = arrayList.size();
        d3 d3Var = this.d;
        if (size == 1) {
            formatPluralString = LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(d3Var.G).getPeerName(((Long) arrayList.get(0)).longValue()));
        } else {
            formatPluralString = LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]);
        }
        new xc(d3Var.f11156p0, d3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        d3 d3Var = this.d;
        boolean z12 = d3Var.f11143d0;
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
            if (MediaDataController.getInstance(d3Var.G).botInAttachMenu(d3Var.H) || MessagesController.getInstance(d3Var.G).whitelistedBots.contains(Long.valueOf(d3Var.H))) {
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
        ImageView backButton = d3Var.W.getBackButton();
        d3Var.f11166w0 = z10;
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
        BotFullscreenButtons botFullscreenButtons = d3Var.m0;
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
        this.d.f11159r0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        d3 d3Var = this.d;
        z2 z2Var = d3Var.f11152l0;
        ?? obj = new Object();
        obj.f11506a = z10;
        obj.f11507b = z11;
        obj.f11508c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f11509f = j10;
        obj.f11510g = i10;
        obj.h = i11;
        obj.f11511i = str2;
        int totalHeight = z2Var.getTotalHeight();
        z2Var.e.d = obj;
        w.b(z2Var.f11522f[1].f11491l, obj, true);
        z2Var.invalidate();
        if (totalHeight != z2Var.getTotalHeight() && z2Var.f11524r != null) {
            if (totalHeight < z2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(z2Var.f11524r, 200L);
            } else {
                z2Var.f11524r.run();
            }
        }
        if (d3Var.f11143d0) {
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
        u2 u2Var = d3Var.v;
        c3 c3Var = d3Var.e;
        org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) d3Var.f11151k0).O().getLastFragment();
        go0 go0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(c3Var);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(d3Var.getContext(), 3, null);
            b2Var.q(150L);
            ga.y(d3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new u4(b2Var, 1), new ai.o2(18, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(d3Var.G).putUsers(paymentForm.users, false);
            go0Var = new go0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            go0Var = new go0((TLRPC.PaymentReceipt) tLObject);
        }
        if (go0Var != null) {
            u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(c3Var);
            td0 td0Var = new td0(this.f11571b);
            td0Var.show();
            go0Var.Z0 = new ai.t2(this, td0Var, str, 9);
            go0Var.Y0 = this.f11572c;
            td0Var.c(go0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.p(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        d3 d3Var = this.d;
        z2 z2Var = d3Var.f11152l0;
        ?? obj = new Object();
        obj.f11506a = z10;
        obj.f11507b = z11;
        obj.f11508c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f11509f = j10;
        obj.f11510g = i10;
        obj.h = i11;
        obj.f11511i = null;
        int totalHeight = z2Var.getTotalHeight();
        z2Var.e.f281c = obj;
        u[] uVarArr = z2Var.f11522f;
        uVarArr[0].f11491l.a();
        if (obj.f11509f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new a6(obj.f11509f, 1.4f, uVarArr[0].f11491l.f29197a.getFontMetricsInt()), 0, 1, 33);
            uVarArr[0].f11491l.t(spannableStringBuilder, true, true);
        } else {
            uVarArr[0].f11491l.t(obj.e, true, true);
        }
        z2Var.invalidate();
        if (totalHeight != z2Var.getTotalHeight() && z2Var.f11524r != null) {
            if (totalHeight < z2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(z2Var.f11524r, 200L);
            } else {
                z2Var.f11524r.run();
            }
        }
        if (d3Var.f11143d0) {
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
        u2 u2Var = this.d.v;
        if (u2Var.f11187c) {
            return;
        }
        u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f11140b0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        d3 d3Var = this.d;
        d3Var.f11163u0 = i10;
        d3Var.u(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        d3 d3Var = this.d;
        if (isEmpty) {
            Activity activity = d3Var.f11151k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof sn) {
                    hk hkVar = ((sn) lastFragment).Y;
                    hkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        AndroidUtilities.hideKeyboard(d3Var.e);
        td0 td0Var = new td0(this.f11571b);
        eyVar.C2 = new a1.d(this, user, str, td0Var, 4);
        td0Var.show();
        td0Var.c(eyVar);
    }

    @Override
    public final void w(boolean z10) {
        d3 d3Var = this.d;
        d6 d6Var = d3Var.E;
        FrameLayout frameLayout = d3Var.f11156p0;
        TLRPC.User user = MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H));
        if (z10) {
            n2.e eVar = new n2.e(7, false);
            LocaleController.getString(R.string.UndoNoCaps);
            eVar.f17042b = new w2(this, 1);
            qc V = new xc(frameLayout, d6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, eVar);
            V.f29645j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new w2(this, 2)), true));
        qc P = new xc(frameLayout, d6Var).P(R.raw.error, spannableStringBuilder);
        P.f29645j = 5000;
        P.k(true);
    }

    @Override
    public final void x(boolean z10) {
        u2 u2Var = this.d.v;
        if (u2Var != null) {
            u2Var.setAllowSwipes(z10);
        }
    }

    @Override
    public final void y() {
        this.d.k(false);
    }

    @Override
    public final y0 z() {
        d3 d3Var = this.d;
        if (d3Var.B0 == null) {
            y0 y0Var = new y0(this.f11571b);
            d3Var.B0 = y0Var;
            y0Var.f11558k = d3Var.f11167x.getWebView();
        }
        return d3Var.B0;
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
