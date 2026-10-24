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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gk;
import org.telegram.ui.pa0;
import org.telegram.ui.sn;
public final class wc extends org.telegram.ui.Components.za implements NotificationCenter.NotificationCenterDelegate {
    public final vc X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final ug.y0 f2396a0;
    public a71 f2397b0;
    public boolean f2398c0;

    public wc(Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user, ug.y0 y0Var) {
        super(context, null, false, false, g6Var);
        this.Z = user;
        this.f2396a0 = y0Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        lm0 lm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new xa(this, 1));
        s4.k kVar = new s4.k();
        kVar.f46376m = false;
        kVar.C = false;
        kVar.o(zr.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColorKey(org.telegram.ui.ActionBar.k6.f21272i5);
        vc vcVar = new vc(context, 0, g6Var);
        this.X = vcVar;
        ((TextView) vcVar.f2336c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        w90 w90Var = (w90) vcVar.d;
        w90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final wc f2231b;

            {
                this.f2231b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.o2 o2Var;
                switch (r2) {
                    case 0:
                        wc wcVar = this.f2231b;
                        cx0 cx0Var = new cx0(wcVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(wcVar.attachedFragment) && (o2Var = wcVar.attachedFragment) != null) {
                            cx0Var.makeAttached(o2Var);
                        }
                        cx0Var.show();
                        return;
                    default:
                        pf.d.r(this.f2231b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        w90Var.setMaxWidth(ei.x3.a(w90Var.getText(), w90Var.getPaint()) + 1);
        this.e.setTitle(z());
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        f9Var.r(user);
        ((org.telegram.ui.Components.u9) vcVar.f2335b).e(user, f9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        w90 w90Var2 = new w90(context, g6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        w90Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(w90Var2, org.telegram.ui.ActionBar.k6.B6, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var2, org.telegram.ui.ActionBar.k6.f21243gc, g6Var);
        w90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final wc f2231b;

            {
                this.f2231b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.o2 o2Var;
                switch (r2) {
                    case 0:
                        wc wcVar = this.f2231b;
                        cx0 cx0Var = new cx0(wcVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(wcVar.attachedFragment) && (o2Var = wcVar.attachedFragment) != null) {
                            cx0Var.makeAttached(o2Var);
                        }
                        cx0Var.show();
                        return;
                    default:
                        pf.d.r(this.f2231b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        w90Var2.setGravity(17);
        w90Var2.setMaxWidth(ei.x3.a(w90Var2.getText(), w90Var2.getPaint()));
        frameLayout.addView(w90Var2, w7.z5.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, frameLayout, g6Var);
        this.containerView.addView(new x00(getContext()), w7.z5.c(-1.0f, -1));
        a71 a71Var = this.f2397b0;
        if (a71Var != null) {
            a71Var.N(false);
        }
    }

    public static void P(wc wcVar, int i10) {
        l61 G;
        a71 a71Var = wcVar.f2397b0;
        if (a71Var != null && (G = a71Var.G(i10 - 1)) != null) {
            a71 a71Var2 = wcVar.f2397b0;
            if (G.d == -1) {
                wcVar.f2398c0 = !wcVar.f2398c0;
                a71Var2.N(true);
                wcVar.d.v0(0, AndroidUtilities.dp(200.0f), zr.f33338g);
            } else if (G.G(yc.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(wcVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j10 = wcVar.Z.f20491id;
                    ha y3 = ha.y(wcVar.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    uc ucVar = new uc(wcVar, G, j10, 0);
                    int i11 = y3.f1413a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            ha.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            ha.e0(context, null);
                        }
                    } else if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        ?? obj = new Object();
                        obj.f4700b = "inapp";
                        obj.f4699a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new t7(y3, ucVar, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = gi.d3.q(ha.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new j2(y3, ucVar, tL_inputInvoiceStars, 2));
                    }
                }
            }
        }
    }

    public static void Q(wc wcVar, l61 l61Var, long j10, Boolean bool, String str) {
        ug.y0 y0Var;
        if (wcVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (y0Var = wcVar.f2396a0) != null) {
                y0Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            pa0 pa0Var = LaunchActivity.I1.f33503x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.oc K = org.telegram.ui.Components.vc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) l61Var.B, UserObject.getForcedFirstName(wcVar.Z))), LocaleController.getString(R.string.ViewInChat), new o4(j10, 1));
                    K.f29203j = 5000;
                    K.k(true);
                    if (pa0Var != null) {
                        pa0Var.c(true);
                    }
                    ha.y(wcVar.currentAccount, false).T(true);
                } else if (str != null) {
                    i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.vc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, a71 a71Var) {
        int i10;
        String formatCurrency;
        arrayList.add(l61.k(this.X));
        i2.o1.q(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = ha.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f2398c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = yc.f2523a;
                    l61 J = l61.J(yc.class);
                    J.d = i13;
                    J.f28240z = i12;
                    long j10 = tL_starsGiftOption.stars;
                    J.B = j10;
                    J.f28227l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f28228m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f2398c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = rc.f2138a;
                l61 J2 = l61.J(rc.class);
                J2.d = -1;
                J2.f28227l = string;
                J2.f28222f = !this.f2398c0;
                J2.f28232q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(l61.n(31));
            arrayList.add(l61.n(31));
            arrayList.add(l61.n(31));
        }
        arrayList.add(l61.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (a71Var = this.f2397b0) != null) {
            a71Var.N(true);
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
        gk gkVar;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof sn) {
            sn snVar = (sn) R;
            if (snVar.C9() && (gkVar = snVar.Y) != null) {
                gkVar.M();
            }
        }
        super.show();
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new q(this, 7), this.resourcesProvider);
        this.f2397b0 = a71Var;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        vc vcVar = this.X;
        if (vcVar == null) {
            return null;
        }
        return ((TextView) vcVar.f2336c).getText();
    }
}
