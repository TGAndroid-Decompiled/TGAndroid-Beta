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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.la0;
import org.telegram.ui.sn;
public final class uc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final tc X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final ug.y0 f2276a0;
    public s61 f2277b0;
    public boolean f2278c0;

    public uc(Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.User user, ug.y0 y0Var) {
        super(context, null, false, false, d6Var);
        this.Z = user;
        this.f2276a0 = y0Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new va(this, 1));
        s4.k kVar = new s4.k();
        kVar.f45972m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21074i5, d6Var));
        tc tcVar = new tc(context, 0, d6Var);
        this.X = tcVar;
        ((TextView) tcVar.f2231c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        x90 x90Var = (x90) tcVar.d;
        x90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final uc f2126b;

            {
                this.f2126b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        uc ucVar = this.f2126b;
                        yw0 yw0Var = new yw0(ucVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(ucVar.attachedFragment) && (n2Var = ucVar.attachedFragment) != null) {
                            yw0Var.makeAttached(n2Var);
                        }
                        yw0Var.show();
                        return;
                    default:
                        pf.d.r(this.f2126b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        x90Var.setMaxWidth(ei.x3.a(x90Var.getText(), x90Var.getPaint()) + 1);
        this.e.setTitle(A());
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(user);
        ((org.telegram.ui.Components.w9) tcVar.f2230b).e(user, h9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        x90 x90Var2 = new x90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        x90Var2.setTextSize(1, 12.0f);
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
        x90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final uc f2126b;

            {
                this.f2126b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        uc ucVar = this.f2126b;
                        yw0 yw0Var = new yw0(ucVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(ucVar.attachedFragment) && (n2Var = ucVar.attachedFragment) != null) {
                            yw0Var.makeAttached(n2Var);
                        }
                        yw0Var.show();
                        return;
                    default:
                        pf.d.r(this.f2126b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        x90Var2.setGravity(17);
        x90Var2.setMaxWidth(ei.x3.a(x90Var2.getText(), x90Var2.getPaint()));
        frameLayout.addView(x90Var2, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, d6Var));
        this.containerView.addView(new z00(getContext()), w7.z5.d(-1.0f, -1));
        s61 s61Var = this.f2277b0;
        if (s61Var != null) {
            s61Var.N(false);
        }
    }

    public static void Q(uc ucVar, int i10) {
        f61 G;
        s61 s61Var = ucVar.f2277b0;
        if (s61Var != null && (G = s61Var.G(i10 - 1)) != null) {
            s61 s61Var2 = ucVar.f2277b0;
            if (G.d == -1) {
                ucVar.f2278c0 = !ucVar.f2278c0;
                s61Var2.N(true);
                ucVar.d.v0(0, AndroidUtilities.dp(200.0f), bs.f25031g);
            } else if (G.G(wc.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(ucVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.H1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j10 = ucVar.Z.f20419id;
                    fa y3 = fa.y(ucVar.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    sc scVar = new sc(ucVar, G, j10, 0);
                    int i11 = y3.f1311a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            fa.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            fa.e0(context, null);
                        }
                    } else if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        ?? obj = new Object();
                        obj.f4698b = "inapp";
                        obj.f4697a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new s7(y3, scVar, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = gi.d3.q(fa.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new p2(y3, scVar, tL_inputInvoiceStars, 2));
                    }
                }
            }
        }
    }

    public static void R(uc ucVar, f61 f61Var, long j10, Boolean bool, String str) {
        ug.y0 y0Var;
        if (ucVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (y0Var = ucVar.f2276a0) != null) {
                y0Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            la0 la0Var = LaunchActivity.H1.f33187x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.qc K = org.telegram.ui.Components.xc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) f61Var.B, UserObject.getForcedFirstName(ucVar.Z))), LocaleController.getString(R.string.ViewInChat), new o4(j10, 1));
                    K.f29639j = 5000;
                    K.k(true);
                    if (la0Var != null) {
                        la0Var.c(true);
                    }
                    fa.y(ucVar.currentAccount, false).T(true);
                } else if (str != null) {
                    i0.a.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.xc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    @Override
    public final CharSequence A() {
        tc tcVar = this.X;
        if (tcVar == null) {
            return null;
        }
        return ((TextView) tcVar.f2231c).getText();
    }

    public final void S(ArrayList arrayList, s61 s61Var) {
        int i10;
        String formatCurrency;
        arrayList.add(f61.k(this.X));
        i0.a.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = fa.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f2278c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = wc.f2387a;
                    f61 J = f61.J(wc.class);
                    J.d = i13;
                    J.f26153z = i12;
                    long j10 = tL_starsGiftOption.stars;
                    J.B = j10;
                    J.f26140l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f26141m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f2278c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = pc.f2037a;
                f61 J2 = f61.J(pc.class);
                J2.d = -1;
                J2.f26140l = string;
                J2.f26135f = !this.f2278c0;
                J2.f26145q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(f61.n(31));
            arrayList.add(f61.n(31));
            arrayList.add(f61.n(31));
        }
        arrayList.add(f61.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (s61Var = this.f2277b0) != null) {
            s61Var.N(true);
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
        hk hkVar;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof sn) {
            sn snVar = (sn) R;
            if (snVar.C9() && (hkVar = snVar.Y) != null) {
                hkVar.N();
            }
        }
        super.show();
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 7), this.resourcesProvider);
        this.f2277b0 = s61Var;
        return s61Var;
    }
}
