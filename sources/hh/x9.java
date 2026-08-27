package hh;

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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ck;
import org.telegram.ui.pa0;
import org.telegram.ui.rn;

public final class x9 extends org.telegram.ui.Components.qa implements NotificationCenter.NotificationCenterDelegate {
    public final w9 T;
    public final FrameLayout U;
    public final TLRPC.User V;
    public final cg.j2 W;
    public b51 X;
    public boolean Y;

    public x9(Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.User user, cg.j2 j2Var) {
        super(context, null, false, false, false, 1, c6Var);
        this.V = user;
        this.W = j2Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        zk0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ag.p0(this, 6));
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23143i5, c6Var));
        w9 w9Var = new w9(context, 0, c6Var);
        this.T = w9Var;
        ((TextView) w9Var.f10306c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        p80 p80Var = (p80) w9Var.d;
        final int i12 = 1;
        p80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {

            public final x9 f10180b;

            {
                this.f10180b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (i11) {
                    case 0:
                        x9 x9Var = this.f10180b;
                        ov0 ov0Var = new ov0(x9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(x9Var.attachedFragment) && (n2Var = x9Var.attachedFragment) != null) {
                            ov0Var.makeAttached(n2Var);
                        }
                        ov0Var.show();
                        break;
                    default:
                        we.e.s(this.f10180b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }), true)));
        p80Var.setMaxWidth(lh.w3.a(p80Var.getText(), p80Var.getPaint()) + 1);
        this.f31853e.setTitle(z());
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.r(user);
        ((org.telegram.ui.Components.n9) w9Var.f10305b).e(user, y8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        p80 p80Var2 = new p80(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        p80Var2.setTextSize(1, 12.0f);
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {

            public final x9 f10180b;

            {
                this.f10180b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (i12) {
                    case 0:
                        x9 x9Var = this.f10180b;
                        ov0 ov0Var = new ov0(x9Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(x9Var.attachedFragment) && (n2Var = x9Var.attachedFragment) != null) {
                            ov0Var.makeAttached(n2Var);
                        }
                        ov0Var.show();
                        break;
                    default:
                        we.e.s(this.f10180b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }));
        p80Var2.setGravity(17);
        p80Var2.setMaxWidth(lh.w3.a(p80Var2.getText(), p80Var2.getPaint()));
        frameLayout.addView(p80Var2, h7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        this.containerView.addView(new f00(getContext()), h7.z5.c(-1.0f, -1));
        b51 b51Var = this.X;
        if (b51Var != null) {
            b51Var.N(false);
        }
    }

    public static void P(x9 x9Var, int i10) {
        n41 n41VarG;
        b51 b51Var = x9Var.X;
        if (b51Var == null || (n41VarG = b51Var.G(i10 - 1)) == null) {
            return;
        }
        b51 b51Var2 = x9Var.X;
        if (n41VarG.d == -1) {
            x9Var.Y = !x9Var.Y;
            b51Var2.N(true);
            x9Var.d.v0(0, AndroidUtilities.dp(200.0f), er.f28123g);
            return;
        }
        if (n41VarG.G(aa.class) && (n41VarG.G instanceof TL_stars.TL_starsGiftOption)) {
            Context contextFindActivity = AndroidUtilities.findActivity(x9Var.getContext());
            if (contextFindActivity == null) {
                contextFindActivity = LaunchActivity.C1;
            }
            Context context = contextFindActivity;
            if (context == null) {
                return;
            }
            long j10 = x9Var.V.f22527id;
            u7 u7VarY = u7.y(x9Var.currentAccount, false);
            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) n41VarG.G;
            gh.p5 p5Var = new gh.p5(x9Var, n41VarG, j10, 1);
            int i11 = u7VarY.f10151a;
            if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR == null || n2VarR.getContext() == null) {
                    u7.e0(context, null);
                    return;
                } else {
                    u7.e0(n2VarR.getContext(), n2VarR.getResourceProvider());
                    return;
                }
            }
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                c9.b bVar = new c9.b();
                bVar.f2567c = "inapp";
                bVar.f2566b = tL_starsGiftOption.store_product;
                BillingController.getInstance().queryProductDetails(Arrays.asList(bVar.a()), new f1.a(u7VarY, p5Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                return;
            }
            TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
            tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
            tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
            tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
            tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j10);
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectP = nh.b3.p(u7.I(), false);
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectP.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new cg.y(u7VarY, p5Var, tL_inputInvoiceStars, 8));
        }
    }

    public static void Q(x9 x9Var, n41 n41Var, long j10, Boolean bool, String str) {
        cg.j2 j2Var;
        if (x9Var.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (j2Var = x9Var.W) != null) {
            j2Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        pa0 pa0Var = LaunchActivity.C1.f35535t0;
        if (n2VarU == null) {
            return;
        }
        int i10 = 0;
        if (!bool.booleanValue()) {
            if (str != null) {
                org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{str}, mc.a0(n2VarU), R.raw.error, 36);
            }
        } else {
            ec ecVarK = mc.a0(n2VarU).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) n41Var.B, UserObject.getForcedFirstName(x9Var.V))), LocaleController.getString(R.string.ViewInChat), new v9(j10, i10));
            ecVarK.f28020j = 5000;
            ecVarK.k(true);
            if (pa0Var != null) {
                pa0Var.c(true);
            }
            u7.y(x9Var.currentAccount, false).T(true);
        }
    }

    public final void R(ArrayList arrayList, b51 b51Var) {
        arrayList.add(n41.k(this.T));
        org.telegram.ui.Cells.pa.o(R.string.TelegramStarsChoose, arrayList);
        ArrayList arrayListU = u7.y(this.currentAccount, false).u();
        if (arrayListU == null || arrayListU.isEmpty()) {
            arrayList.add(n41.n(31));
            arrayList.add(n41.n(31));
            arrayList.add(n41.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < arrayListU.size(); i12++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayListU.get(i12);
                if (this.Y || !tL_starsGiftOption.extended) {
                    int i13 = i11 + 1;
                    int i14 = aa.f8969a;
                    n41 n41VarJ = n41.J(aa.class);
                    n41VarJ.d = i12;
                    n41VarJ.f30857z = i11;
                    long j10 = tL_starsGiftOption.stars;
                    n41VarJ.B = j10;
                    n41VarJ.f30844l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    n41VarJ.f30845m = tL_starsGiftOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    n41VarJ.G = tL_starsGiftOption;
                    arrayList.add(n41VarJ);
                    i11 = i13;
                } else {
                    i10++;
                }
            }
            boolean z10 = this.Y;
            if (!z10 && i10 > 0) {
                String string = LocaleController.getString(z10 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z11 = !this.Y;
                int i15 = s9.f10031a;
                n41 n41VarJ2 = n41.J(s9.class);
                n41VarJ2.d = -1;
                n41VarJ2.f30844l = string;
                n41VarJ2.f30839f = z11;
                n41VarJ2.f30849q = true;
                arrayList.add(n41VarJ2);
            }
        }
        arrayList.add(n41.k(this.U));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b51 b51Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (b51Var = this.X) != null) {
            b51Var.N(true);
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
        ck ckVar;
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR instanceof rn) {
            rn rnVar = (rn) n2VarR;
            if (rnVar.x9() && (ckVar = rnVar.U) != null) {
                ckVar.P();
            }
        }
        super.show();
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, true, new ch.c(this, 19), this.resourcesProvider);
        this.X = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        w9 w9Var = this.T;
        if (w9Var == null) {
            return null;
        }
        return ((TextView) w9Var.f10306c).getText();
    }
}
