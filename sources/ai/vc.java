package ai;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fk;
import org.telegram.ui.ja0;
import org.telegram.ui.qn;
public final class vc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final uc X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final ug.z0 f2332a0;
    public u61 f2333b0;
    public boolean f2334c0;

    public vc(Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.User user, ug.z0 z0Var) {
        super(context, null, false, false, d6Var);
        this.Z = user;
        this.f2332a0 = z0Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        jm0 jm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new wa(this, 1));
        s4.k kVar = new s4.k();
        kVar.f45951m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21078i5, d6Var));
        uc ucVar = new uc(context, 0, d6Var);
        this.X = ucVar;
        ((TextView) ucVar.f2278c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        x90 x90Var = (x90) ucVar.d;
        x90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final vc f2173b;

            {
                this.f2173b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        vc vcVar = this.f2173b;
                        ax0 ax0Var = new ax0(vcVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(vcVar.attachedFragment) && (n2Var = vcVar.attachedFragment) != null) {
                            ax0Var.makeAttached(n2Var);
                        }
                        ax0Var.show();
                        return;
                    default:
                        pf.d.r(this.f2173b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        x90Var.setMaxWidth(ei.x3.a(x90Var.getText(), x90Var.getPaint()) + 1);
        this.e.setTitle(A());
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(user);
        ((org.telegram.ui.Components.w9) ucVar.f2277b).e(user, h9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        x90 x90Var2 = new x90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        x90Var2.setTextSize(1, 12.0f);
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21049gc, d6Var));
        x90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final vc f2173b;

            {
                this.f2173b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        vc vcVar = this.f2173b;
                        ax0 ax0Var = new ax0(vcVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(vcVar.attachedFragment) && (n2Var = vcVar.attachedFragment) != null) {
                            ax0Var.makeAttached(n2Var);
                        }
                        ax0Var.show();
                        return;
                    default:
                        pf.d.r(this.f2173b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        x90Var2.setGravity(17);
        x90Var2.setMaxWidth(ei.x3.a(x90Var2.getText(), x90Var2.getPaint()));
        frameLayout.addView(x90Var2, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21061h5, d6Var));
        this.containerView.addView(new z00(getContext()), w7.z5.c(-1.0f, -1));
        u61 u61Var = this.f2333b0;
        if (u61Var != null) {
            u61Var.N(false);
        }
    }

    public static void Q(vc vcVar, int i10) {
        h61 G;
        u61 u61Var = vcVar.f2333b0;
        if (u61Var != null && (G = u61Var.G(i10 - 1)) != null) {
            u61 u61Var2 = vcVar.f2333b0;
            if (G.d == -1) {
                vcVar.f2334c0 = !vcVar.f2334c0;
                u61Var2.N(true);
                vcVar.d.v0(0, AndroidUtilities.dp(200.0f), bs.f25022g);
            } else if (G.G(xc.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(vcVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.H1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j10 = vcVar.Z.f20423id;
                    ga y3 = ga.y(vcVar.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    tc tcVar = new tc(vcVar, G, j10, 0);
                    int i11 = y3.f1363a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            ga.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            ga.e0(context, null);
                        }
                    } else if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        ?? obj = new Object();
                        obj.f4695b = "inapp";
                        obj.f4694a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new t7(y3, tcVar, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = gi.d3.q(ga.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new j2(y3, tcVar, tL_inputInvoiceStars, 2));
                    }
                }
            }
        }
    }

    public static void R(vc vcVar, h61 h61Var, long j10, Boolean bool, String str) {
        ug.z0 z0Var;
        if (vcVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (z0Var = vcVar.f2332a0) != null) {
                z0Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            ja0 ja0Var = LaunchActivity.H1.f33199x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.qc K = org.telegram.ui.Components.xc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) h61Var.B, UserObject.getForcedFirstName(vcVar.Z))), LocaleController.getString(R.string.ViewInChat), new o4(j10, 1));
                    K.f29530j = 5000;
                    K.k(true);
                    if (ja0Var != null) {
                        ja0Var.c(true);
                    }
                    ga.y(vcVar.currentAccount, false).T(true);
                } else if (str != null) {
                    i2.e.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.xc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    @Override
    public final CharSequence A() {
        uc ucVar = this.X;
        if (ucVar == null) {
            return null;
        }
        return ((TextView) ucVar.f2278c).getText();
    }

    public final void S(ArrayList arrayList, u61 u61Var) {
        int i10;
        String formatCurrency;
        arrayList.add(h61.k(this.X));
        i2.e.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = ga.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f2334c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = xc.f2460a;
                    h61 J = h61.J(xc.class);
                    J.d = i13;
                    J.f26795z = i12;
                    long j10 = tL_starsGiftOption.stars;
                    J.B = j10;
                    J.f26782l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f26783m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f2334c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = qc.f2090a;
                h61 J2 = h61.J(qc.class);
                J2.d = -1;
                J2.f26782l = string;
                J2.f26777f = !this.f2334c0;
                J2.f26787q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(h61.n(31));
            arrayList.add(h61.n(31));
            arrayList.add(h61.n(31));
        }
        arrayList.add(h61.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (u61Var = this.f2333b0) != null) {
            u61Var.N(true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void show() {
        fk fkVar;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof qn) {
            qn qnVar = (qn) R;
            if (qnVar.C9() && (fkVar = qnVar.Y) != null) {
                fkVar.N();
            }
        }
        super.show();
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        u61 u61Var = new u61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 7), this.resourcesProvider);
        this.f2333b0 = u61Var;
        return u61Var;
    }
}
