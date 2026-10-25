package bi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.z90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.oa0;
import org.telegram.ui.un;
public final class nc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final mc X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final vg.a1 f5153a0;
    public j71 f5154b0;
    public boolean f5155c0;

    public nc(Context context, org.telegram.ui.ActionBar.u6 u6Var, TLRPC.User user, vg.a1 a1Var) {
        super(context, null, false, false, u6Var);
        this.Z = user;
        this.f5153a0 = a1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.k(this, 2));
        s4.l lVar = new s4.l();
        lVar.f47760m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColorKey(org.telegram.ui.ActionBar.y6.f23445i5);
        mc mcVar = new mc(context, 0, u6Var);
        this.X = mcVar;
        ((TextView) mcVar.f5112c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        z90 z90Var = (z90) mcVar.d;
        z90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final nc f4993b;

            {
                this.f4993b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.r2 r2Var;
                switch (r2) {
                    case 0:
                        nc ncVar = this.f4993b;
                        kx0 kx0Var = new kx0(ncVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(ncVar.attachedFragment) && (r2Var = ncVar.attachedFragment) != null) {
                            kx0Var.makeAttached(r2Var);
                        }
                        kx0Var.show();
                        return;
                    default:
                        qf.d.r(this.f4993b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        z90Var.setMaxWidth(fi.v3.a(z90Var.getText(), z90Var.getPaint()) + 1);
        this.e.setTitle(y());
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.r(user);
        ((org.telegram.ui.Components.y9) mcVar.f5111b).f(user, j9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        z90 z90Var2 = new z90(context, u6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        z90Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var2, org.telegram.ui.ActionBar.y6.B6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var2, org.telegram.ui.ActionBar.y6.gc, u6Var);
        z90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final nc f4993b;

            {
                this.f4993b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.r2 r2Var;
                switch (r2) {
                    case 0:
                        nc ncVar = this.f4993b;
                        kx0 kx0Var = new kx0(ncVar.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(ncVar.attachedFragment) && (r2Var = ncVar.attachedFragment) != null) {
                            kx0Var.makeAttached(r2Var);
                        }
                        kx0Var.show();
                        return;
                    default:
                        qf.d.r(this.f4993b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        z90Var2.setGravity(17);
        z90Var2.setMaxWidth(fi.v3.a(z90Var2.getText(), z90Var2.getPaint()));
        frameLayout.addView(z90Var2, gb1.i(-2, -1, 17));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, frameLayout, u6Var);
        this.containerView.addView(new z00(getContext()), gb1.g(-1.0f, -1));
        j71 j71Var = this.f5154b0;
        if (j71Var != null) {
            j71Var.O(false);
        }
    }

    public static void P(nc ncVar, int i10) {
        t61 G;
        j71 j71Var = ncVar.f5154b0;
        if (j71Var != null && (G = j71Var.G(i10 - 1)) != null) {
            j71 j71Var2 = ncVar.f5154b0;
            if (G.d == -1) {
                ncVar.f5155c0 = !ncVar.f5155c0;
                j71Var2.O(true);
                ncVar.d.w0(0, AndroidUtilities.dp(200.0f), ds.f27585g);
            } else if (G.H(oc.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(ncVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j10 = ncVar.Z.f22174id;
                    ca y3 = ca.y(ncVar.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    lc lcVar = new lc(ncVar, G, j10, 0);
                    int i11 = y3.f4441a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            ca.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            ca.e0(context, null);
                        }
                    } else if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        ?? obj = new Object();
                        obj.f7929b = "inapp";
                        obj.f7928a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new p7(y3, lcVar, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q5 = hi.m3.q(ca.I(), false);
                        if (q5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new h2(y3, lcVar, tL_inputInvoiceStars, 2));
                    }
                }
            }
        }
    }

    public static void Q(nc ncVar, t61 t61Var, long j10, Boolean bool, String str) {
        vg.a1 a1Var;
        if (ncVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (a1Var = ncVar.f5153a0) != null) {
                a1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            oa0 oa0Var = LaunchActivity.I1.f35564x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.qc K = org.telegram.ui.Components.wc.b0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) t61Var.B, UserObject.getForcedFirstName(ncVar.Z))), LocaleController.getString(R.string.ViewInChat), new j4(j10, 1));
                    K.f31887j = 5000;
                    K.k(true);
                    if (oa0Var != null) {
                        oa0Var.c(true);
                    }
                    ca.y(ncVar.currentAccount, false).T(true);
                } else if (str != null) {
                    ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.wc.b0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, j71 j71Var) {
        int i10;
        String formatCurrency;
        arrayList.add(t61.k(this.X));
        ic.a.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = ca.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f5155c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = oc.f5214a;
                    t61 K = t61.K(oc.class);
                    K.d = i13;
                    K.f32885z = i12;
                    long j10 = tL_starsGiftOption.stars;
                    K.B = j10;
                    K.f32872l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    K.f32873m = formatCurrency;
                    K.G = tL_starsGiftOption;
                    arrayList.add(K);
                    i12 = i14;
                }
            }
            boolean z10 = this.f5155c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = ic.f4848a;
                t61 K2 = t61.K(ic.class);
                K2.d = -1;
                K2.f32872l = string;
                K2.f32867f = !this.f5155c0;
                K2.f32877q = true;
                arrayList.add(K2);
            }
        } else {
            arrayList.add(t61.p(31));
            arrayList.add(t61.p(31));
            arrayList.add(t61.p(31));
        }
        arrayList.add(t61.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (j71Var = this.f5154b0) != null) {
            j71Var.O(true);
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
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R instanceof un) {
            un unVar = (un) R;
            if (unVar.F9() && (hkVar = unVar.Y) != null) {
                hkVar.M();
            }
        }
        super.show();
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 10), this.resourcesProvider);
        this.f5154b0 = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        mc mcVar = this.X;
        if (mcVar == null) {
            return null;
        }
        return ((TextView) mcVar.f5112c).getText();
    }
}
