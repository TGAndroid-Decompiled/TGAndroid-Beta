package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.ca;
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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
import org.telegram.ui.hk;
import org.telegram.ui.po0;
import org.telegram.ui.un;
public final class h3 implements org.telegram.ui.web.g0 {
    public boolean f13011a;
    public final Context f13012b;
    public final u6 f13013c;
    public final m3 d;

    public h3(m3 m3Var, Context context, u6 u6Var) {
        this.d = m3Var;
        this.f13012b = context;
        this.f13013c = u6Var;
    }

    @Override
    public final f1 A() {
        m3 m3Var = this.d;
        if (m3Var.C0 == null) {
            f1 f1Var = new f1(this.f13012b);
            m3Var.C0 = f1Var;
            f1Var.f12971k = m3Var.f13133y.getWebView();
        }
        return m3Var.C0;
    }

    @Override
    public final void a() {
        m3 m3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I));
        m4.c cVar = new m4.c(9, false);
        cVar.f18009b = new f3(this, 0);
        qc W = new wc(m3Var.f13121q0, m3Var.F).W(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, cVar);
        W.f31887j = 5000;
        W.k(true);
    }

    @Override
    public final void b() {
        this.d.k(true);
    }

    @Override
    public final void c() {
        m3 m3Var = this.d;
        if (m3Var.E0 != null) {
            org.telegram.ui.ActionBar.s3 P = LaunchActivity.I1.P();
            if (P != null) {
                P.e(m3Var.E0);
            }
            m3Var.E0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        m3 m3Var = this.d;
        new wc(m3Var.f13121q0, m3Var.F).q(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        m3 m3Var = this.d;
        if (!m3Var.m() && m3Var.K == 0 && !this.f13011a) {
            this.f13011a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(m3Var.H).getInputUser(m3Var.I);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = m3Var.N;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(m3Var.H).sendRequest(tL_messages_sendWebViewData, new g3(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String formatPluralString;
        int size = arrayList.size();
        m3 m3Var = this.d;
        if (size == 1) {
            formatPluralString = LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(m3Var.H).getPeerName(((Long) arrayList.get(0)).longValue()));
        } else {
            formatPluralString = LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]);
        }
        new wc(m3Var.f13121q0, m3Var.F).R(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        m3 m3Var = this.d;
        boolean z12 = m3Var.f13108e0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        m3Var.y(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        m3 m3Var = this.d;
        if (!m3Var.m()) {
            if (MediaDataController.getInstance(m3Var.H).botInAttachMenu(m3Var.I) || MessagesController.getInstance(m3Var.H).whitelistedBots.contains(Long.valueOf(m3Var.I))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        m3 m3Var = this.d;
        ImageView backButton = m3Var.X.getBackButton();
        m3Var.f13132x0 = z10;
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
        BotFullscreenButtons botFullscreenButtons = m3Var.f13118n0;
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
        this.d.f13125s0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        m3 m3Var = this.d;
        i3 i3Var = m3Var.m0;
        ?? obj = new Object();
        obj.f12902a = z10;
        obj.f12903b = z11;
        obj.f12904c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f12905f = j10;
        obj.f12906g = i10;
        obj.h = i11;
        obj.f12907i = str2;
        int totalHeight = i3Var.getTotalHeight();
        i3Var.e.d = obj;
        d0.b(i3Var.f12935f[1].f12879l, obj, true);
        i3Var.invalidate();
        if (totalHeight != i3Var.getTotalHeight() && i3Var.f12937r != null) {
            if (totalHeight < i3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(i3Var.f12937r, 200L);
            } else {
                i3Var.f12937r.run();
            }
        }
        if (m3Var.f13108e0) {
            m3Var.E();
            m3Var.H();
        }
    }

    @Override
    public final void m(int i10) {
        this.d.w(i10, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        m3 m3Var = this.d;
        d3 d3Var = m3Var.f13129w;
        l3 l3Var = m3Var.f13109f;
        org.telegram.ui.ActionBar.r2 lastFragment = ((LaunchActivity) m3Var.f13116l0).O().getLastFragment();
        po0 po0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(l3Var);
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(m3Var.getContext(), 3, null);
            e2Var.r(150L);
            ca.y(m3Var.H, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new bi.q4(e2Var, 1), new ai.n1(20, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(m3Var.H).putUsers(paymentForm.users, false);
            po0Var = new po0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            po0Var = new po0((TLRPC.PaymentReceipt) tLObject);
        }
        if (po0Var != null) {
            d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(l3Var);
            sd0 sd0Var = new sd0(this.f13012b);
            sd0Var.show();
            po0Var.Z0 = new androidx.car.app.utils.a(this, sd0Var, str, 9);
            po0Var.Y0 = this.f13013c;
            sd0Var.c(po0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.p(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        m3 m3Var = this.d;
        i3 i3Var = m3Var.m0;
        ?? obj = new Object();
        obj.f12902a = z10;
        obj.f12903b = z11;
        obj.f12904c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f12905f = j10;
        obj.f12906g = i10;
        obj.h = i11;
        obj.f12907i = null;
        int totalHeight = i3Var.getTotalHeight();
        i3Var.e.f640c = obj;
        b0[] b0VarArr = i3Var.f12935f;
        b0VarArr[0].f12879l.a();
        if (obj.f12905f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new c6(obj.f12905f, 1.4f, b0VarArr[0].f12879l.f32117a.getFontMetricsInt()), 0, 1, 33);
            b0VarArr[0].f12879l.t(spannableStringBuilder, true, true);
        } else {
            b0VarArr[0].f12879l.t(obj.e, true, true);
        }
        i3Var.invalidate();
        if (totalHeight != i3Var.getTotalHeight() && i3Var.f12937r != null) {
            if (totalHeight < i3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(i3Var.f12937r, 200L);
            } else {
                i3Var.f12937r.run();
            }
        }
        if (m3Var.f13108e0) {
            m3Var.E();
            m3Var.H();
        }
    }

    @Override
    public final void r(int i10) {
        this.d.z(i10, true);
    }

    @Override
    public final void s() {
        d3 d3Var = this.d.f13129w;
        if (d3Var.f13157c) {
            return;
        }
        d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f13106c0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        m3 m3Var = this.d;
        m3Var.f13128v0 = i10;
        m3Var.u(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        m3 m3Var = this.d;
        if (isEmpty) {
            Activity activity = m3Var.f13116l0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.r2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof un) {
                    hk hkVar = ((un) lastFragment).Y;
                    hkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    m3Var.k(false);
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
        cy cyVar = new cy(bundle);
        AndroidUtilities.hideKeyboard(m3Var.f13109f);
        sd0 sd0Var = new sd0(this.f13012b);
        cyVar.C2 = new a1.d(this, user, str, sd0Var, 4);
        sd0Var.show();
        sd0Var.c(cyVar);
    }

    @Override
    public final void w(boolean z10) {
        m3 m3Var = this.d;
        u6 u6Var = m3Var.F;
        FrameLayout frameLayout = m3Var.f13121q0;
        TLRPC.User user = MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I));
        if (z10) {
            m4.c cVar = new m4.c(9, false);
            LocaleController.getString(R.string.UndoNoCaps);
            cVar.f18009b = new f3(this, 1);
            qc W = new wc(frameLayout, u6Var).W(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, cVar);
            W.f31887j = 5000;
            W.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new f3(this, 2)), true));
        qc Q = new wc(frameLayout, u6Var).Q(R.raw.error, spannableStringBuilder);
        Q.f31887j = 5000;
        Q.k(true);
    }

    @Override
    public final void x(int i10) {
        r(i10);
    }

    @Override
    public final void y(boolean z10) {
        d3 d3Var = this.d.f13129w;
        if (d3Var != null) {
            d3Var.setAllowSwipes(z10);
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
