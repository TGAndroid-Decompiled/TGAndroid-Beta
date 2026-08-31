package mh;

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
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.xa0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
public final class t9 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final dg.u U;
    public final FrameLayout V;
    public final TLRPC.User W;
    public final hg.g2 X;
    public x51 Y;
    public boolean Z;

    public t9(Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user, hg.g2 g2Var) {
        super(context, null, false, false, false, 1, g6Var);
        this.W = user;
        this.X = g2Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        tl0 tl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ag.h(this, 9));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21749i5, g6Var));
        dg.u uVar = new dg.u(context, 1, g6Var);
        this.U = uVar;
        ((TextView) uVar.f4680c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        g90 g90Var = (g90) uVar.d;
        g90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final t9 f14706b;

            {
                this.f14706b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.p2 p2Var;
                switch (r2) {
                    case 0:
                        t9 t9Var = this.f14706b;
                        gw0 gw0Var = new gw0(t9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(t9Var.attachedFragment) && (p2Var = t9Var.attachedFragment) != null) {
                            gw0Var.makeAttached(p2Var);
                        }
                        gw0Var.show();
                        return;
                    default:
                        af.g.s(this.f14706b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        g90Var.setMaxWidth(qh.f3.a(g90Var.getText(), g90Var.getPaint()) + 1);
        this.f31015e.setTitle(y());
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.r(user);
        ((org.telegram.ui.Components.p9) uVar.f4679b).e(user, z8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        g90 g90Var2 = new g90(context, g6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        g90Var2.setTextSize(1, 12.0f);
        g90Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.B6, g6Var));
        g90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21720gc, g6Var));
        g90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final t9 f14706b;

            {
                this.f14706b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.p2 p2Var;
                switch (r2) {
                    case 0:
                        t9 t9Var = this.f14706b;
                        gw0 gw0Var = new gw0(t9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(t9Var.attachedFragment) && (p2Var = t9Var.attachedFragment) != null) {
                            gw0Var.makeAttached(p2Var);
                        }
                        gw0Var.show();
                        return;
                    default:
                        af.g.s(this.f14706b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        g90Var2.setGravity(17);
        g90Var2.setMaxWidth(qh.f3.a(g90Var2.getText(), g90Var2.getPaint()));
        frameLayout.addView(g90Var2, k7.c6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
        this.containerView.addView(new s00(getContext()), k7.c6.c(-1.0f, -1));
        x51 x51Var = this.Y;
        if (x51Var != null) {
            x51Var.N(false);
        }
    }

    public static void P(t9 t9Var, int i10) {
        j51 G;
        x51 x51Var = t9Var.Y;
        if (x51Var != null && (G = x51Var.G(i10 - 1)) != null) {
            x51 x51Var2 = t9Var.Y;
            if (G.d == -1) {
                t9Var.Z = !t9Var.Z;
                x51Var2.N(true);
                t9Var.d.v0(0, AndroidUtilities.dp(200.0f), pr.f30184g);
            } else if (G.G(v9.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(t9Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.D1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j10 = t9Var.W.f20990id;
                    t7 y10 = t7.y(t9Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    lh.i5 i5Var = new lh.i5(t9Var, G, j10, 1);
                    int i11 = y10.f14828a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            t7.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            t7.e0(context, null);
                        }
                    } else if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        b6.h hVar = new b6.h();
                        hVar.f1729c = "inapp";
                        hVar.f1728b = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(hVar.a()), new f1.a(y10, i5Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p10 = sh.p2.p(t7.I(), false);
                        if (p10 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p10.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new hg.y(y10, i5Var, tL_inputInvoiceStars, 8));
                    }
                }
            }
        }
    }

    public static void Q(t9 t9Var, j51 j51Var, long j10, Boolean bool, String str) {
        hg.g2 g2Var;
        if (t9Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (g2Var = t9Var.X) != null) {
                g2Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            xa0 xa0Var = LaunchActivity.D1.f34174u0;
            if (U != null) {
                if (bool.booleanValue()) {
                    ic K = qc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) j51Var.B, UserObject.getForcedFirstName(t9Var.W))), LocaleController.getString(R.string.ViewInChat), new s9(j10, 0));
                    K.f27745j = 5000;
                    K.k(true);
                    if (xa0Var != null) {
                        xa0Var.c(true);
                    }
                    t7.y(t9Var.currentAccount, false).T(true);
                } else if (str != null) {
                    yh.s(R.string.UnknownErrorCode, new Object[]{str}, qc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, x51 x51Var) {
        int i10;
        String formatCurrency;
        arrayList.add(j51.k(this.U));
        yh.r(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = t7.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.Z && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = v9.f14949a;
                    j51 J = j51.J(v9.class);
                    J.d = i13;
                    J.f28027z = i12;
                    long j10 = tL_starsGiftOption.stars;
                    J.B = j10;
                    J.f28014l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f28015m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z4 = this.Z;
            if (!z4 && i11 > 0) {
                if (z4) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = p9.f14609a;
                j51 J2 = j51.J(p9.class);
                J2.d = -1;
                J2.f28014l = string;
                J2.f28009f = !this.Z;
                J2.f28019q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(j51.n(31));
            arrayList.add(j51.n(31));
            arrayList.add(j51.n(31));
        }
        arrayList.add(j51.k(this.V));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x51 x51Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (x51Var = this.Y) != null) {
            x51Var.N(true);
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
        jk jkVar;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R instanceof xn) {
            xn xnVar = (xn) R;
            if (xnVar.x9() && (jkVar = xnVar.V) != null) {
                jkVar.P();
            }
        }
        super.show();
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new eg.p1(this, 20), this.resourcesProvider);
        this.Y = x51Var;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        dg.u uVar = this.U;
        if (uVar == null) {
            return null;
        }
        return ((TextView) uVar.f4680c).getText();
    }
}
