package di;

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
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ok;
import org.telegram.ui.wo0;
import org.telegram.ui.wy;
import xh.v5;
public final class i3 implements org.telegram.ui.web.h0 {
    public boolean f6677a;
    public final Context f6678b;
    public final f6 f6679c;
    public final n3 d;

    public i3(n3 n3Var, Context context, f6 f6Var) {
        this.d = n3Var;
        this.f6678b = context;
        this.f6679c = f6Var;
    }

    @Override
    public final void a() {
        n3 n3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(n3Var.G).getUser(Long.valueOf(n3Var.H));
        n7.a1 a1Var = new n7.a1(5, (byte) 0);
        a1Var.f13938b = new f3(this, 0);
        pc V = new wc(n3Var.f6801p0, n3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, a1Var);
        V.f26081j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.k(true);
    }

    @Override
    public final void c() {
        n3 n3Var = this.d;
        if (n3Var.D0 != null) {
            org.telegram.ui.ActionBar.q3 P = LaunchActivity.G1.P();
            if (P != null) {
                P.e(n3Var.D0);
            }
            n3Var.D0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        n3 n3Var = this.d;
        new wc(n3Var.f6801p0, n3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        n3 n3Var = this.d;
        if (n3Var.J == 0 && !this.f6677a) {
            this.f6677a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(n3Var.G).getInputUser(n3Var.H);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = n3Var.M;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(n3Var.G).sendRequest(tL_messages_sendWebViewData, new g3(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String formatPluralString;
        int size = arrayList.size();
        n3 n3Var = this.d;
        if (size == 1) {
            formatPluralString = LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(n3Var.G).getPeerName(((Long) arrayList.get(0)).longValue()));
        } else {
            formatPluralString = LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]);
        }
        new wc(n3Var.f6801p0, n3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        n3 n3Var = this.d;
        boolean z12 = n3Var.f6788d0;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        n3Var.x(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        n3 n3Var = this.d;
        if (!MediaDataController.getInstance(n3Var.G).botInAttachMenu(n3Var.H) && !MessagesController.getInstance(n3Var.G).whitelistedBots.contains(Long.valueOf(n3Var.H))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        n3 n3Var = this.d;
        ImageView backButton = n3Var.W.getBackButton();
        n3Var.f6811w0 = z10;
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
        BotFullscreenButtons botFullscreenButtons = n3Var.m0;
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
        this.d.f6804r0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
        n3 n3Var = this.d;
        j3 j3Var = n3Var.f6797l0;
        ?? obj = new Object();
        obj.f7043a = z10;
        obj.f7044b = z11;
        obj.f7045c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f7046f = j3;
        obj.f7047g = i10;
        obj.h = i11;
        obj.f7048i = str2;
        int totalHeight = j3Var.getTotalHeight();
        j3Var.e.d = obj;
        a0.b(j3Var.f6505f[1].f7017l, obj, true);
        j3Var.invalidate();
        if (totalHeight != j3Var.getTotalHeight() && j3Var.f6507r != null) {
            if (totalHeight < j3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(j3Var.f6507r, 200L);
            } else {
                j3Var.f6507r.run();
            }
        }
        if (n3Var.f6788d0) {
            n3Var.D();
            n3Var.G();
        }
    }

    @Override
    public final void m(int i10) {
        this.d.v(i10, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        n3 n3Var = this.d;
        d3 d3Var = n3Var.v;
        m3 m3Var = n3Var.e;
        org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) n3Var.f6796k0).O().getLastFragment();
        wo0 wo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(m3Var);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(n3Var.getContext(), 3, null);
            d2Var.q(150L);
            v5.y(n3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new h3(d2Var, 0), new bi.y2(11, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(n3Var.G).putUsers(paymentForm.users, false);
            wo0Var = new wo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            wo0Var = new wo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (wo0Var != null) {
            d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(m3Var);
            id0 id0Var = new id0(this.f6678b);
            id0Var.show();
            wo0Var.Z0 = new androidx.car.app.utils.a(this, id0Var, str, 6);
            wo0Var.Y0 = this.f6679c;
            id0Var.c(wo0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        n3 n3Var = this.d;
        j3 j3Var = n3Var.f6797l0;
        ?? obj = new Object();
        obj.f7043a = z10;
        obj.f7044b = z11;
        obj.f7045c = z12;
        obj.d = z13;
        obj.e = str;
        obj.f7046f = j3;
        obj.f7047g = i10;
        obj.h = i11;
        obj.f7048i = null;
        int totalHeight = j3Var.getTotalHeight();
        j3Var.e.f276c = obj;
        y[] yVarArr = j3Var.f6505f;
        yVarArr[0].f7017l.b();
        if (obj.f7046f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.e);
            spannableStringBuilder.setSpan(new y5(obj.f7046f, 1.4f, yVarArr[0].f7017l.f25424a.getFontMetricsInt()), 0, 1, 33);
            yVarArr[0].f7017l.q(spannableStringBuilder, true, true);
        } else {
            yVarArr[0].f7017l.q(obj.e, true, true);
        }
        j3Var.invalidate();
        if (totalHeight != j3Var.getTotalHeight() && j3Var.f6507r != null) {
            if (totalHeight < j3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(j3Var.f6507r, 200L);
            } else {
                j3Var.f6507r.run();
            }
        }
        if (n3Var.f6788d0) {
            n3Var.D();
            n3Var.G();
        }
    }

    @Override
    public final void r(int i10) {
        this.d.y(i10, true);
    }

    @Override
    public final void s() {
        d3 d3Var = this.d.v;
        if (d3Var.f6918c) {
            return;
        }
        d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.f6785b0 = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        n3 n3Var = this.d;
        n3Var.f6808u0 = i10;
        n3Var.t(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        n3 n3Var = this.d;
        if (isEmpty) {
            Activity activity = n3Var.f6796k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof eo) {
                    ok okVar = ((eo) lastFragment).Y;
                    okVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    n3Var.k(false);
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
        wy wyVar = new wy(bundle);
        AndroidUtilities.hideKeyboard(n3Var.e);
        id0 id0Var = new id0(this.f6678b);
        wyVar.C2 = new a1.d(this, user, str, id0Var, 1);
        id0Var.show();
        id0Var.c(wyVar);
    }

    @Override
    public final void w(boolean z10) {
        n3 n3Var = this.d;
        f6 f6Var = n3Var.E;
        FrameLayout frameLayout = n3Var.f6801p0;
        TLRPC.User user = MessagesController.getInstance(n3Var.G).getUser(Long.valueOf(n3Var.H));
        if (z10) {
            n7.a1 a1Var = new n7.a1(5, (byte) 0);
            LocaleController.getString(R.string.UndoNoCaps);
            a1Var.f13938b = new f3(this, 1);
            pc V = new wc(frameLayout, f6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, a1Var);
            V.f26081j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new f3(this, 2)), true));
        pc P = new wc(frameLayout, f6Var).P(R.raw.error, spannableStringBuilder);
        P.f26081j = 5000;
        P.k(true);
    }

    @Override
    public final void x(boolean z10) {
        d3 d3Var = this.d.v;
        if (d3Var != null) {
            d3Var.setAllowSwipes(z10);
        }
    }

    @Override
    public final void y() {
        this.d.k(false);
    }

    @Override
    public final d1 z() {
        n3 n3Var = this.d;
        if (n3Var.B0 == null) {
            d1 d1Var = new d1(this.f6678b);
            n3Var.B0 = d1Var;
            d1Var.f6579k = n3Var.f6812x.getWebView();
        }
        return n3Var.B0;
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
