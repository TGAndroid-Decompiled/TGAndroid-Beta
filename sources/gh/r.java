package gh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.z41;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ce;
import org.telegram.ui.e91;
import org.telegram.ui.fe;
import org.telegram.ui.ho;
import org.telegram.ui.s91;
public final class r extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence A;
    public na B;
    public int C;
    public m D;
    public LinearLayout E;
    public RelativeSizeSpan F;
    public org.telegram.ui.Components.j6 G;
    public org.telegram.ui.Components.j6 H;
    public n I;
    public boolean J;
    public boolean K;
    public long L;
    public o M;
    public p N;
    public kh.d O;
    public final eq[] P;
    public m Q;
    public RelativeSizeSpan R;
    public org.telegram.ui.Components.j6 S;
    public org.telegram.ui.Components.j6 T;
    public kh.d U;
    public double V;
    public gc W;
    public CharSequence X;
    public CharSequence Y;
    public CharSequence Z;
    public final int f8767a;
    public boolean f8768a0;
    public final long f8769b;
    public e91 f8770b0;
    public final boolean f8771c;
    public e91 f8772c0;
    public tn d;
    public boolean f8773d0;
    public i51 f8774e;
    public boolean f8775e0;
    public TLRPC.TL_payments_starsRevenueStats f8776f;
    public final ArrayList f8777f0;
    public String f8778g0;
    public TLRPC.TL_starsRevenueStatus h;
    public DecimalFormat f8779h0;
    public SpannableStringBuilder f8780i0;
    public final c f8781j0;
    public final int f8782k0;
    public e91 f8783n;
    public final ce f8784r;
    public final ce f8785s;
    public final ce v;
    public final ce f8786w;
    public final ce f8787x;
    public final ce f8788y;

    public r(int i9, long j10) {
        super(null);
        boolean z10;
        String string;
        this.f8784r = ce.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.f8785s = ce.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = ce.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.f8786w = ce.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.f8787x = ce.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.f8788y = ce.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        boolean z11 = false;
        this.J = false;
        this.K = true;
        this.P = new eq[1];
        this.f8773d0 = false;
        this.f8775e0 = false;
        this.f8777f0 = new ArrayList();
        this.f8778g0 = "";
        this.f8781j0 = new c(this, 0);
        this.f8782k0 = -1;
        this.f8767a = i9;
        this.f8769b = j10;
        if (j10 == getUserConfig().getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8771c = z10;
        if (i9 == 0) {
            c0.g(this.currentAccount).r(j10);
            if (!z10) {
                c0.g(this.currentAccount).l(j10);
            }
        } else if (i9 == 1) {
            c0 g10 = c0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, (l10 == null || System.currentTimeMillis() - l10.longValue() > 30000) ? true : true);
        }
        if (z10) {
            string = LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin);
        } else {
            string = LocaleController.getString(R.string.BotStarsWithdrawInfo);
        }
        this.A = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new c(this, 4)), true);
    }

    public static void T(r rVar) {
        long j10;
        c cVar = rVar.f8781j0;
        gc.e();
        TLRPC.TL_payments_starsRevenueStats h = c0.g(rVar.currentAccount).h(rVar.f8769b, false);
        if (h == null) {
            j10 = 0;
        } else {
            j10 = h.status.available_balance.amount;
        }
        if (j10 < rVar.getMessagesController().starsRevenueWithdrawalMin) {
            rVar.K = true;
            rVar.L = j10;
        } else {
            rVar.K = false;
            rVar.L = rVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        rVar.J = true;
        rVar.M.setText(Long.toString(rVar.L));
        o oVar = rVar.M;
        oVar.setSelection(oVar.getText().length());
        rVar.J = false;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        cVar.run();
    }

    public static void U(r rVar) {
        rVar.showDialog(fe.d0(rVar.getParentActivity(), rVar.resourceProvider, true));
    }

    public static void V(r rVar, l41 l41Var) {
        if (l41Var.G(ia.class)) {
            oa.h1(rVar.getParentActivity(), true, rVar.f8769b, rVar.currentAccount, (TL_stars.StarsTransaction) l41Var.G, rVar.getResourceProvider());
        } else if (l41Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            fe.h0(rVar.getParentActivity(), rVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) l41Var.G, rVar.f8769b, rVar.resourceProvider);
        } else if (l41Var.d == 2) {
            rVar.presentFragment(new mh.u3(rVar.f8769b));
        }
    }

    public static void W(r rVar, Context context, View view) {
        if (view.isEnabled()) {
            kh.d dVar = rVar.O;
            if (!dVar.J) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(rVar.currentAccount).getInputPeer(rVar.f8769b);
                ConnectionsManager.getInstance(rVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bg.j0(4, rVar, context));
            }
        }
    }

    public static void X(r rVar, ArrayList arrayList) {
        int i9;
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        double d;
        int i11;
        int i12;
        int i13;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        int i14;
        ce ceVar = rVar.f8787x;
        ArrayList arrayList2 = rVar.f8777f0;
        ce ceVar2 = rVar.f8788y;
        ce ceVar3 = rVar.v;
        ce ceVar4 = rVar.f8785s;
        ce ceVar5 = rVar.f8784r;
        long j10 = rVar.f8769b;
        ce ceVar6 = rVar.f8786w;
        boolean z10 = rVar.f8771c;
        int i15 = rVar.f8782k0;
        c0 g10 = c0.g(rVar.currentAccount);
        int i16 = rVar.f8767a;
        if (i16 == 0) {
            arrayList.add(l41.h(2, i15, rVar.f8783n));
            arrayList.add(l41.A(-1, null));
            arrayList.add(l41.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                ceVar5.f37173a = false;
                ceVar5.f37178g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                ceVar5.f37179i = starsAmount;
                ceVar5.h = "XTR";
                ceVar5.f37177f = "USD";
                double d9 = rVar.V;
                ceVar5.f37180j = (long) (starsAmount.amount * d9 * 100.0d);
                ceVar4.f37173a = false;
                ceVar4.f37178g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus2.current_balance;
                ceVar4.f37179i = starsAmount2;
                ceVar4.h = "XTR";
                ceVar4.f37180j = (long) (starsAmount2.amount * d9 * 100.0d);
                ceVar4.f37177f = "USD";
                ceVar3.f37173a = false;
                ceVar3.f37178g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.overall_revenue;
                ceVar3.f37179i = starsAmount3;
                ceVar3.h = "XTR";
                ceVar3.f37180j = (long) (starsAmount3.amount * d9 * 100.0d);
                ceVar3.f37177f = "USD";
                rVar.h0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = rVar.E;
                if (h.status.withdrawal_enabled) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                linearLayout.setVisibility(i14);
            }
            arrayList.add(l41.u(ceVar5));
            arrayList.add(l41.u(ceVar4));
            arrayList.add(l41.u(ceVar3));
            if (z10) {
                i13 = R.string.SelfStarsOverviewInfo;
            } else {
                i13 = R.string.BotStarsOverviewInfo;
            }
            arrayList.add(l41.A(-2, LocaleController.getString(i13)));
            arrayList.add(l41.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(l41.j(1, rVar.D));
            arrayList.add(l41.A(-3, rVar.A));
            if (!z10) {
                if (rVar.getMessagesController().starrefConnectAllowed) {
                    arrayList.add(mh.h.a(2, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.uj, rVar.resourceProvider), R.drawable.filled_earn_stars, ho.c0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                    arrayList.add(l41.A(-4, null));
                }
                arrayList.add(l41.p(rVar.B, 0, false));
            }
        } else if (i16 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z10) {
                if (rVar.X == null) {
                    rVar.X = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new c(rVar, 2), rVar.resourceProvider), true);
                }
                arrayList.add(l41.g(rVar.X));
            }
            if (rVar.f8770b0 == null && j11 != null) {
                e91 e02 = s91.e0(j11.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                rVar.f8770b0 = e02;
                if (e02 != null) {
                    e02.f37880n = true;
                }
            }
            e91 e91Var = rVar.f8770b0;
            if (e91Var != null && !e91Var.f37878l) {
                arrayList.add(l41.h(5, i15, e91Var));
                arrayList.add(l41.A(-1, null));
            }
            if (rVar.f8772c0 == null && j11 != null) {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i9 = 2;
                rVar.f8772c0 = s91.e0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            } else {
                i9 = 2;
            }
            e91 e91Var2 = rVar.f8772c0;
            if (e91Var2 != null && !e91Var2.f37878l) {
                arrayList.add(l41.h(i9, i15, e91Var2));
                arrayList.add(l41.A(-2, null));
            }
            if (!rVar.f8768a0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d10 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                ceVar6.d = j12;
                double d11 = j12 / 1.0E9d;
                long j13 = (long) (d11 * d10 * 100.0d);
                ceVar6.f37176e = j13;
                if (rVar.f8779h0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d10;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    rVar.f8779h0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    rVar.f8779h0.setMaximumFractionDigits(6);
                    rVar.f8779h0.setGroupingUsed(false);
                } else {
                    d = d10;
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = rVar.f8779h0;
                if (d11 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fe.f0("TON " + rVar.f8779h0.format(d11), rVar.S.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(rVar.R, indexOf, spannableStringBuilder.length(), 33);
                }
                rVar.S.setText(spannableStringBuilder);
                org.telegram.ui.Components.j6 j6Var = rVar.T;
                j6Var.setText("≈" + BillingController.getInstance().formatCurrency(j13, "USD"));
                ceVar6.f37177f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                ceVar.d = j14;
                ceVar.f37176e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                ceVar.f37177f = "USD";
                ceVar2.f37173a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                ceVar2.d = j15;
                ceVar2.f37176e = (long) ((j15 / 1.0E9d) * d * 100.0d);
                ceVar2.f37177f = "USD";
                rVar.f8768a0 = true;
                kh.d dVar = rVar.U;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                dVar.setVisibility(i12);
            }
            if (rVar.f8768a0) {
                arrayList.add(l41.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(l41.u(ceVar6));
                arrayList.add(l41.u(ceVar));
                arrayList.add(l41.u(ceVar2));
                if (rVar.Y == null) {
                    rVar.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new bg.c2(rVar, R.string.BotMonetizationProceedsTONInfoLink, 2), rVar.resourceProvider), true);
                }
                arrayList.add(l41.A(-4, rVar.Y));
            }
            arrayList.add(l41.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(l41.k(rVar.Q));
            if (rVar.Z == null) {
                if (MessagesController.getInstance(rVar.currentAccount).channelRevenueWithdrawalEnabled) {
                    i10 = R.string.BotMonetizationBalanceInfo;
                } else {
                    i10 = R.string.BotMonetizationBalanceInfoNotAvailable;
                }
                rVar.Z = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10), -1, 3, new c(rVar, 3)), true);
            }
            arrayList.add(l41.A(-5, rVar.Z));
            if (!rVar.f8775e0 || !arrayList2.isEmpty()) {
                arrayList.add(l41.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj = arrayList2.get(i17);
                    i17++;
                    int i18 = ia.f8310a;
                    l41 J = l41.J(ia.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.f30344q = true;
                    arrayList.add(J);
                }
                if (!rVar.f8775e0) {
                    arrayList.add(l41.o(1, 7));
                    arrayList.add(l41.o(2, 7));
                    arrayList.add(l41.o(3, 7));
                }
            }
            arrayList.add(l41.A(-6, null));
        }
    }

    public static void Y(r rVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i9;
        int i10;
        int dp;
        int i11;
        int i12;
        int dp2;
        int i13;
        int i14;
        if (tL_error != null) {
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(rVar.currentAccount).sendRequest(new TL_account.getPassword(), new h(rVar, twoStepVerificationActivity, z10, j10, 0), 8);
                    return;
                }
                twoStepVerificationActivity.n0();
                twoStepVerificationActivity.finishFragment();
                oc.b0(tL_error);
                return;
            }
            twoStepVerificationActivity.n0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(activity);
            int i15 = org.telegram.ui.ActionBar.f6.f23108j5;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            textView.setGravity(i9 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
            linearLayout.addView(textView, g7.e6.n(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(R.drawable.list_circle);
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(11.0f);
            } else {
                i10 = 0;
            }
            int dp3 = AndroidUtilities.dp(9.0f);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(11.0f);
            }
            imageView.setPadding(i10, dp3, dp, 0);
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, i15, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
            TextView textView2 = new TextView(activity);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, g7.e6.n(-1, -2));
                linearLayout2.addView(imageView, g7.e6.q(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, g7.e6.n(-2, -2));
                linearLayout2.addView(textView2, g7.e6.n(-1, -2));
            }
            LinearLayout f10 = org.telegram.messenger.l0.f(activity, 0);
            linearLayout.addView(f10, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(activity);
            imageView2.setImageResource(R.drawable.list_circle);
            if (LocaleController.isRTL) {
                i12 = AndroidUtilities.dp(11.0f);
            } else {
                i12 = 0;
            }
            int dp4 = AndroidUtilities.dp(9.0f);
            if (LocaleController.isRTL) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(11.0f);
            }
            imageView2.setPadding(i12, dp4, dp2, 0);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i15, false), mode));
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText2, textView3);
            if (LocaleController.isRTL) {
                f10.addView(textView3, g7.e6.n(-1, -2));
                i14 = 5;
                f10.addView(imageView2, g7.e6.q(-2, -2, 5));
            } else {
                i14 = 5;
                f10.addView(imageView2, g7.e6.n(-2, -2));
                f10.addView(textView3, g7.e6.n(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new g(rVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(activity);
                textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                textView4.setTextSize(1, 16.0f);
                if (!LocaleController.isRTL) {
                    i14 = 3;
                }
                textView4.setGravity(i14 | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            twoStepVerificationActivity.showDialog(alertDialog$Builder.f22702a);
            return;
        }
        twoStepVerificationActivity.n0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            ve.e.u(rVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            rVar.K = true;
            ve.e.u(rVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void Z(r rVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(rVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(rVar.currentAccount).putChats(starsStatus.chats, false);
            rVar.f8778g0 = starsStatus.next_offset;
            rVar.f8777f0.addAll(starsStatus.history);
            if (!starsStatus.history.isEmpty() && starsStatus.next_offset != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            rVar.f8775e0 = z10;
        } else if (tL_error != null) {
            oc.b0(tL_error);
            rVar.f8775e0 = true;
        }
        rVar.f8773d0 = false;
        z41 z41Var = rVar.f8774e.U2;
        if (z41Var != null) {
            z41Var.N(true);
        }
    }

    public static void d0(r rVar) {
        int i9;
        if (!rVar.f8773d0 && !rVar.f8775e0 && rVar.f8778g0 != null) {
            rVar.f8773d0 = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(rVar.currentAccount).getInputPeer(rVar.f8769b);
            tL_payments_getStarsTransactions.offset = rVar.f8778g0;
            if (rVar.f8777f0.isEmpty()) {
                i9 = 5;
            } else {
                i9 = 20;
            }
            tL_payments_getStarsTransactions.limit = i9;
            ConnectionsManager.getInstance(rVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new bf.a(rVar, 5));
        }
    }

    public static String i0(int i9) {
        int i10 = i9 / 86400;
        int i11 = i9 - (86400 * i10);
        int i12 = i11 / 3600;
        int i13 = i11 - (i12 * 3600);
        int i14 = i13 / 60;
        int i15 = i13 - (i14 * 60);
        if (i10 == 0) {
            if (i12 == 0) {
                return String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15));
            }
            return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i14), Integer.valueOf(i15));
        }
        int i16 = R.string.PeriodDHM;
        Locale locale = Locale.ENGLISH;
        return LocaleController.formatString(i16, String.format(locale, "%02d", Integer.valueOf(i10)), String.format(locale, "%02d", Integer.valueOf(i12)), String.format(locale, "%02d", Integer.valueOf(i14)));
    }

    @Override
    public final View createView(Context context) {
        float f10;
        int i9;
        int i10;
        q qVar = new q(this, context);
        tn tnVar = new tn(context, null, false, null);
        this.d = tnVar;
        tnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        tn tnVar2 = this.d;
        if (!this.inPreviewMode) {
            f10 = 50.0f;
        } else {
            f10 = 0.0f;
        }
        kVar.addView(tnVar2, 0, g7.e6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f8769b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.f8767a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 1));
        tn tnVar3 = this.d;
        int i11 = org.telegram.ui.ActionBar.f6.Oi;
        tnVar3.i(org.telegram.ui.ActionBar.f6.w0(null, i11, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pi, false));
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i11, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i11, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23388z8, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.f6.f23001d6;
        kVar2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.B = new na(context, this.currentAccount, false, this.f8769b, getClassGuid(), getResourceProvider());
        m mVar = new m(context, 0);
        this.D = mVar;
        mVar.setOrientation(1);
        this.D.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i12, getResourceProvider()));
        this.D.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.G = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.j6 j6Var2 = this.G;
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, getResourceProvider()));
        this.G.setTextSize(AndroidUtilities.dp(32.0f));
        this.G.setGravity(17);
        this.F = new RelativeSizeSpan(0.6770833f);
        this.D.addView(this.G, g7.e6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.H = j6Var3;
        j6Var3.setGravity(17);
        org.telegram.ui.Components.j6 j6Var4 = this.H;
        int i14 = org.telegram.ui.ActionBar.f6.f23369y6;
        j6Var4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, getResourceProvider()));
        this.H.setTextSize(AndroidUtilities.dp(14.0f));
        this.D.addView(this.H, g7.e6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        n nVar = new n(this, context, 0);
        this.I = nVar;
        nVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.I.setLeftPadding(AndroidUtilities.dp(36.0f));
        o oVar = new o(context, 0);
        this.M = oVar;
        oVar.setFocusable(false);
        this.M.setTextColor(getThemedColor(i13));
        this.M.setCursorSize(AndroidUtilities.dp(20.0f));
        this.M.setCursorWidth(1.5f);
        this.M.setBackground(null);
        this.M.setTextSize(1, 18.0f);
        this.M.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.M.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.M.setInputType(2);
        this.M.setTypeface(Typeface.DEFAULT);
        this.M.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23312uf));
        this.M.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23325vf));
        o oVar2 = this.M;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        oVar2.setGravity(i9);
        this.M.setOnFocusChangeListener(new j(this, 0));
        this.M.addTextChangedListener(new bh.f(this, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, g7.e6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.M, g7.e6.o(-1, -2, 1.0f, 119));
        this.I.e(this.M);
        this.I.addView(linearLayout, g7.e6.e(-1, -2, 48));
        this.M.setOnEditorActionListener(new k(this, 0));
        this.D.addView(this.I, g7.e6.t(-1, -2, 1, 18, 14, 18, 2));
        this.I.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(0);
        p pVar = new p(0, context, getResourceProvider(), true);
        pVar.setRoundRadius(24);
        this.N = pVar;
        pVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.N.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        this.N.setOnClickListener(new View.OnClickListener(this) {
            public final r f8455b;

            {
                this.f8455b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f8455b.j0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            r rVar = this.f8455b;
                            if (!rVar.U.J) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                b5.d dVar = new b5.d(21, rVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.V = 1;
                                twoStepVerificationActivity.X = dVar;
                                rVar.U.setLoading(true);
                                twoStepVerificationActivity.r0(new d(rVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        kh.d dVar = new kh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.O = dVar;
        dVar.setEnabled(true);
        this.O.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.O.setOnClickListener(new bg.u1(12, this, context));
        this.E.addView(this.N, g7.e6.o(-1, 48, 1.0f, 119));
        boolean z10 = this.f8771c;
        if (!z10) {
            this.E.addView(new Space(context), g7.e6.o(8, 48, 0.0f, 119));
            this.E.addView(this.O, g7.e6.o(-1, 48, 1.0f, 119));
        }
        this.D.addView(this.E, g7.e6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        m mVar2 = new m(context, 1);
        this.Q = mVar2;
        mVar2.setOrientation(1);
        this.Q.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i12, this.resourceProvider));
        this.Q.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.j6 j6Var5 = new org.telegram.ui.Components.j6(context, false, true, true);
        this.S = j6Var5;
        j6Var5.setTypeface(AndroidUtilities.bold());
        this.S.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourceProvider));
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.R = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.S, g7.e6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var6 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.T = j6Var6;
        j6Var6.setGravity(17);
        this.T.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, this.resourceProvider));
        this.T.setTextSize(AndroidUtilities.dp(14.0f));
        this.Q.addView(this.T, g7.e6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        kh.d dVar2 = new kh.d(context, this.resourceProvider, true);
        this.U = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        kh.d dVar3 = this.U;
        if (z10) {
            i10 = R.string.MonetizationSelfWithdraw;
        } else {
            i10 = R.string.MonetizationWithdraw;
        }
        dVar3.g(LocaleController.getString(i10), false, true);
        this.U.setVisibility(8);
        this.U.setOnClickListener(new View.OnClickListener(this) {
            public final r f8455b;

            {
                this.f8455b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f8455b.j0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            r rVar = this.f8455b;
                            if (!rVar.U.J) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                b5.d dVar4 = new b5.d(21, rVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.V = 1;
                                twoStepVerificationActivity.X = dVar4;
                                rVar.U.setLoading(true);
                                twoStepVerificationActivity.r0(new d(rVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.Q.addView(this.U, g7.e6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        i51 i51Var = new i51(this, new bh.c(this, 13), new g(this), new g(this));
        this.f8774e = i51Var;
        i51Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        this.f8774e.p1();
        qVar.addView(this.f8774e, g7.e6.c(-1.0f, -1));
        this.f8774e.setOnScrollListener(new bg.o2(this, 5));
        this.actionBar.setAdaptiveBackground(this.f8774e);
        this.fragmentView = qVar;
        return qVar;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f8769b) {
            f0();
        }
    }

    public final void f0() {
        rf.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = c0.g(this.currentAccount).h(this.f8769b, false);
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2 = null;
        if (h == this.f8776f) {
            if (h == null) {
                tL_starsRevenueStatus = null;
            } else {
                tL_starsRevenueStatus = h.status;
            }
            if (tL_starsRevenueStatus == this.h) {
                return;
            }
        }
        this.f8776f = h;
        if (h != null) {
            tL_starsRevenueStatus2 = h.status;
        }
        this.h = tL_starsRevenueStatus2;
        if (h != null) {
            this.V = h.usd_rate;
            e91 e02 = s91.e0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.f8783n = e02;
            if (e02 != null && (bVar = e02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f8783n.d.d.get(0) != null) {
                e91 e91Var = this.f8783n;
                e91Var.h = true;
                ((rf.a) e91Var.d.d.get(0)).f47158g = org.telegram.ui.ActionBar.f6.yj;
                this.f8783n.d.h = (float) ((1.0d / this.V) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            h0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            i51 i51Var = this.f8774e;
            if (i51Var != null) {
                i51Var.U2.N(true);
            }
        }
    }

    public final void g0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity != null && currentUser != null) {
            long j11 = this.f8769b;
            if (z10) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = j10;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new e(this, twoStepVerificationActivity, parentActivity, z10, j10));
        }
    }

    public final void h0(TL_stars.StarsAmount starsAmount, int i9) {
        int i10;
        if (this.G != null && this.H != null) {
            long j10 = (long) (this.V * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oa.X0(false, TextUtils.concat("XTR ", oa.I0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.F, indexOf, spannableStringBuilder.length(), 33);
            }
            this.G.setText(spannableStringBuilder);
            org.telegram.ui.Components.j6 j6Var = this.H;
            j6Var.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            n nVar = this.I;
            if (j10 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            nVar.setVisibility(i10);
            if (this.K) {
                this.J = true;
                o oVar = this.M;
                long j11 = starsAmount.amount;
                this.L = j11;
                oVar.setText(Long.toString(j11));
                o oVar2 = this.M;
                oVar2.setSelection(oVar2.getText().length());
                this.J = false;
                p pVar = this.N;
                if (this.L > 0) {
                    z10 = true;
                }
                pVar.setEnabled(z10);
            }
            this.C = i9;
            c cVar = this.f8781j0;
            AndroidUtilities.cancelRunOnUIThread(cVar);
            cVar.run();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0() {
        p pVar = this.N;
        if (pVar.S && !pVar.J) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.C > currentTime) {
                this.W = oc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, i0(this.C - currentTime)))).j();
            } else if (this.L < getMessagesController().starsRevenueWithdrawalMin) {
                oc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new c(this, 1))).j();
            } else {
                long j10 = this.L;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                b9.a aVar = new b9.a(this, j10, twoStepVerificationActivity, 3);
                twoStepVerificationActivity.V = 1;
                twoStepVerificationActivity.X = aVar;
                this.N.setLoading(true);
                twoStepVerificationActivity.r0(new d(this, twoStepVerificationActivity, 1));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        f0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }
}
