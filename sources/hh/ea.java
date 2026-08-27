package hh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ck;
import org.telegram.ui.rn;

public final class ea extends org.telegram.ui.Components.qa implements NotificationCenter.NotificationCenterDelegate {
    public final long T;
    public final gg.a U;
    public final FrameLayout V;
    public final f00 W;
    public Runnable X;
    public final TLRPC.InputPeer Y;
    public final boolean Z;

    public b51 f9227a0;

    public boolean f9228b0;

    public ea(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, int i10, String str, Runnable runnable, long j11) {
        String str2;
        super(context, null, false, false, false, 1, c6Var);
        this.v = 0.2f;
        this.X = runnable;
        TLRPC.InputPeer inputPeer = j11 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
        this.Y = inputPeer;
        int i11 = 1;
        boolean zIsReady = (inputPeer == null || !AppGlobalConfig.getInstance(u7.y(this.currentAccount, false).f10151a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.Z = zIsReady;
        fixNavigationBar();
        zk0 zk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i12, 0, i12, 0);
        this.d.setOnItemClickListener(new ag.p0(this, 7));
        this.d.p1();
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23143i5, c6Var));
        this.T = j10;
        gg.a aVar = new gg.a(context, this.currentAccount, c6Var);
        TextView textView = (TextView) aVar.f7076e;
        this.U = aVar;
        ((TextView) aVar.d).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j10 - u7.y(this.currentAccount, false).p().amount), new Object[0]));
        if (i10 == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            String str3 = "StarsNeededTextKeepSubscription";
            if (i10 == 2) {
                str2 = str3;
            } else if (i10 == 7) {
                str2 = "StarsNeededTextKeepBotSubscription";
            } else if (i10 == 8) {
                str2 = "StarsNeededTextKeepBizSubscription";
            } else if (i10 == 3) {
                str2 = str3;
            } else if (i10 == 4) {
                str2 = "StarsNeededTextLink";
                if (str == null) {
                    str3 = "StarsNeededTextLink";
                } else {
                    str3 = "StarsNeededTextLink_" + str.toLowerCase();
                }
                if (LocaleController.nullable(LocaleController.getString(str3)) != null) {
                    str2 = str3;
                }
            } else if (i10 == 5) {
                str2 = "StarsNeededTextReactions";
            } else if (i10 == 6) {
                str2 = "StarsNeededTextGift";
            } else if (i10 == 12) {
                str2 = "StarsNeededTextGiftChannel";
            } else if (i10 == 13) {
                str2 = "StarsNeededTextPrivateMessage";
            } else if (i10 == 10) {
                str2 = "StarsNeededTextGiftUpgrade";
            } else if (i10 == 11) {
                str2 = "StarsNeededTextGiftTransfer";
            } else if (i10 == 9) {
                str2 = "StarsNeededBizText";
            } else if (i10 == 14) {
                str2 = "StarsNeededTextGiftBuyResale";
            } else if (i10 == 15) {
                str2 = "StarsNeededTextSearch";
            } else if (i10 == 16) {
                str2 = "StarsNeededRemoveGiftDescription";
            } else {
                str2 = i10 == 17 ? "StarsNeededLiveComments" : "StarsNeededText";
            }
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText("");
        } else {
            String strNullable = LocaleController.nullable(LocaleController.formatString(str2, LocaleController.getStringResId(str2), str));
            textView.setText(AndroidUtilities.replaceTags(strNullable == null ? LocaleController.getString(str2) : strNullable));
            textView.setMaxWidth(lh.w3.a(textView.getText(), textView.getPaint()));
        }
        this.f31853e.setTitle(z());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        p80 p80Var = new p80(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        p80Var.setTextSize(1, 12.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        if (zIsReady) {
            p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new y9(this, i11)));
        } else {
            org.telegram.ui.Cells.pa.q(R.string.StarsPurchaseUnavailable, p80Var);
        }
        p80Var.setGravity(17);
        p80Var.setMaxWidth(lh.w3.a(p80Var.getText(), p80Var.getPaint()));
        frameLayout.addView(p80Var, h7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        f00 f00Var = new f00(getContext());
        this.W = f00Var;
        this.containerView.addView(f00Var, h7.z5.c(-1.0f, -1));
        b51 b51Var = this.f9227a0;
        if (b51Var != null) {
            b51Var.N(false);
        }
    }

    public static void P(ea eaVar, int i10) {
        n41 n41VarG;
        b51 b51Var = eaVar.f9227a0;
        if (b51Var == null || (n41VarG = b51Var.G(i10 - 1)) == null) {
            return;
        }
        b51 b51Var2 = eaVar.f9227a0;
        if (n41VarG.d == -1) {
            eaVar.f9228b0 = !eaVar.f9228b0;
            b51Var2.N(true);
        } else if (n41VarG.G(aa.class) && (n41VarG.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity activityFindActivity = AndroidUtilities.findActivity(eaVar.getContext());
            if (activityFindActivity == null) {
                activityFindActivity = LaunchActivity.C1;
            }
            if (activityFindActivity == null) {
                return;
            }
            u7.y(eaVar.currentAccount, false).f(activityFindActivity, (TL_stars.TL_starsTopupOption) n41VarG.G, new cg.u0(4, eaVar, n41VarG), eaVar.Y);
        }
    }

    public static void Q(ea eaVar, n41 n41Var, Boolean bool, String str) {
        if (eaVar.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new mc((FrameLayout) eaVar.containerView, eaVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) n41Var.B, new Object[0])), R.raw.stars_topup).j();
            eaVar.W.c(true);
            u7.y(eaVar.currentAccount, false).T(true);
        } else if (str != null) {
            org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{str}, new mc((FrameLayout) eaVar.containerView, eaVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, b51 b51Var) {
        long j10;
        gg.a aVar = this.U;
        arrayList.add(n41.l(aVar));
        boolean z10 = this.Z;
        if (z10) {
            org.telegram.ui.Cells.pa.o(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList arrayListZ = u7.y(this.currentAccount, false).z();
        if (z10) {
            if (arrayListZ == null || arrayListZ.isEmpty()) {
                arrayList.add(n41.n(31));
                arrayList.add(n41.n(31));
                arrayList.add(n41.n(31));
            } else {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z11 = false;
                int i14 = 1;
                while (true) {
                    int size = arrayListZ.size();
                    j10 = this.T;
                    if (i11 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayListZ.get(i11);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.f9228b0 && z11) {
                            i13++;
                        } else {
                            arrayList.add(aa.a(i11, i14, tL_starsTopupOption));
                            i12++;
                            i14++;
                            z11 = true;
                        }
                    }
                    i11++;
                }
                if (i12 < 3) {
                    arrayList.clear();
                    arrayList.add(n41.k(aVar));
                    org.telegram.ui.Cells.pa.o(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < arrayListZ.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayListZ.get(i16);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(aa.a(i16, i14, tL_starsTopupOption2));
                            i15++;
                            i14++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < arrayListZ.size()) {
                            arrayList.add(aa.a(i10, i14, (TL_stars.TL_starsTopupOption) arrayListZ.get(i10)));
                            i10++;
                            i14++;
                        }
                        boolean z12 = this.f9228b0;
                        if (!z12 && i13 > 0) {
                            String string = LocaleController.getString(z12 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z13 = !this.f9228b0;
                            int i17 = s9.f10031a;
                            n41 n41VarJ = n41.J(s9.class);
                            n41VarJ.d = -1;
                            n41VarJ.f30844l = string;
                            n41VarJ.f30839f = z13;
                            n41VarJ.f30849q = true;
                            arrayList.add(n41VarJ);
                        }
                    } else {
                        this.f9228b0 = true;
                    }
                } else if (i12 > 0) {
                    boolean z14 = this.f9228b0;
                    if (!z14 && i13 > 0) {
                        String string2 = LocaleController.getString(z14 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                        boolean z15 = !this.f9228b0;
                        int i18 = s9.f10031a;
                        n41 n41VarJ2 = n41.J(s9.class);
                        n41VarJ2.d = -1;
                        n41VarJ2.f30844l = string2;
                        n41VarJ2.f30839f = z15;
                        n41VarJ2.f30849q = true;
                        arrayList.add(n41VarJ2);
                    }
                } else {
                    while (i10 < arrayListZ.size()) {
                        arrayList.add(aa.a(i10, i14, (TL_stars.TL_starsTopupOption) arrayListZ.get(i10)));
                        i10++;
                        i14++;
                    }
                }
            }
        }
        arrayList.add(n41.k(this.V));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            b51 b51Var = this.f9227a0;
            if (b51Var != null) {
                b51Var.N(true);
            }
            long j10 = u7.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.U.d;
            long j11 = this.T;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.na naVar = this.f31853e;
            if (naVar != null) {
                naVar.setTitle(z());
            }
            if (j10 < j11 || (runnable = this.X) == null) {
                return;
            }
            runnable.run();
            this.X = null;
            dismiss();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        gg.a aVar = this.U;
        if (aVar != null) {
            ((bg.i) aVar.f7074b).setPaused(true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void show() {
        ck ckVar;
        if (!this.Z) {
            org.telegram.messenger.y1.q(R.string.PaymentInvoiceDisabledStarsText, new mc(org.telegram.ui.Components.ab.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (u7.y(this.currentAccount, false).p().amount >= this.T) {
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                this.X = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR instanceof rn) {
            rn rnVar = (rn) n2VarR;
            if (rnVar.x9() && (ckVar = rnVar.U) != null) {
                ckVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, true, new ch.c(this, 20), this.resourcesProvider);
        this.f9227a0 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        gg.a aVar = this.U;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }
}
