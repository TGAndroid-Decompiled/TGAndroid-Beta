package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.vq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f91;
import org.telegram.ui.ko;
import org.telegram.ui.t91;
public final class x extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence E;
    public md F;
    public int G;
    public r H;
    public LinearLayout I;
    public RelativeSizeSpan J;
    public org.telegram.ui.Components.o6 K;
    public org.telegram.ui.Components.o6 L;
    public s M;
    public boolean N;
    public boolean O;
    public long P;
    public t Q;
    public v R;
    public ei.d S;
    public final vq[] T;
    public r U;
    public RelativeSizeSpan V;
    public org.telegram.ui.Components.o6 W;
    public org.telegram.ui.Components.o6 X;
    public ei.d Y;
    public double Z;
    public final int f2400a;
    public org.telegram.ui.Components.oc f2401a0;
    public final long f2402b;
    public CharSequence f2403b0;
    public final boolean f2404c;
    public CharSequence f2405c0;
    public mo d;
    public CharSequence f2406d0;
    public i71 e;
    public boolean f2407e0;
    public TLRPC.TL_payments_starsRevenueStats f2408f;
    public f91 f2409f0;
    public f91 f2410g0;
    public TLRPC.TL_starsRevenueStatus h;
    public boolean f2411h0;
    public boolean f2412i0;
    public final ArrayList f2413j0;
    public String f2414k0;
    public DecimalFormat f2415l0;
    public SpannableStringBuilder m0;
    public f91 f2416n;
    public final d f2417n0;
    public final int f2418o0;
    public final org.telegram.ui.fe f2419r;
    public final org.telegram.ui.fe f2420s;
    public final org.telegram.ui.fe v;
    public final org.telegram.ui.fe f2421w;
    public final org.telegram.ui.fe f2422x;
    public final org.telegram.ui.fe f2423y;

    public x(int i10, long j10) {
        super(null);
        boolean z10;
        String string;
        this.f2419r = org.telegram.ui.fe.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.f2420s = org.telegram.ui.fe.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = org.telegram.ui.fe.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.f2421w = org.telegram.ui.fe.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.f2422x = org.telegram.ui.fe.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.f2423y = org.telegram.ui.fe.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        boolean z11 = false;
        this.N = false;
        this.O = true;
        this.T = new vq[1];
        this.f2411h0 = false;
        this.f2412i0 = false;
        this.f2413j0 = new ArrayList();
        this.f2414k0 = "";
        this.f2417n0 = new d(this, 0);
        this.f2418o0 = -1;
        this.f2400a = i10;
        this.f2402b = j10;
        if (j10 == getUserConfig().getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2404c = z10;
        if (i10 == 0) {
            k0.g(this.currentAccount).r(j10);
            if (!z10) {
                k0.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            k0 g10 = k0.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, (l4 == null || System.currentTimeMillis() - l4.longValue() > 30000) ? true : z11);
        }
        if (z10) {
            string = LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin);
        } else {
            string = LocaleController.getString(R.string.BotStarsWithdrawInfo);
        }
        this.E = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new d(this, 4)), true);
    }

    public static void U(x xVar) {
        long j10;
        d dVar = xVar.f2417n0;
        org.telegram.ui.Components.oc.e();
        TLRPC.TL_payments_starsRevenueStats h = k0.g(xVar.currentAccount).h(xVar.f2402b, false);
        if (h == null) {
            j10 = 0;
        } else {
            j10 = h.status.available_balance.amount;
        }
        if (j10 < xVar.getMessagesController().starsRevenueWithdrawalMin) {
            xVar.O = true;
            xVar.P = j10;
        } else {
            xVar.O = false;
            xVar.P = xVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        xVar.N = true;
        xVar.Q.setText(Long.toString(xVar.P));
        t tVar = xVar.Q;
        tVar.setSelection(tVar.getText().length());
        xVar.N = false;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
    }

    public static void V(x xVar) {
        xVar.showDialog(org.telegram.ui.ie.c0(xVar.getParentActivity(), xVar.resourceProvider, true));
    }

    public static void W(x xVar, l61 l61Var) {
        if (l61Var.G(hd.class)) {
            nd.i1(xVar.getParentActivity(), true, xVar.f2402b, xVar.currentAccount, (TL_stars.StarsTransaction) l61Var.G, xVar.getResourceProvider());
        } else if (l61Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            org.telegram.ui.ie.g0(xVar.getParentActivity(), xVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) l61Var.G, xVar.f2402b, xVar.resourceProvider);
        } else if (l61Var.d == 2) {
            xVar.presentFragment(new gi.u3(xVar.f2402b));
        }
    }

    public static void X(x xVar, Context context, View view) {
        if (view.isEnabled()) {
            ei.d dVar = xVar.S;
            if (!dVar.Q) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(xVar.currentAccount).getInputPeer(xVar.f2402b);
                ConnectionsManager.getInstance(xVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new g(0, xVar, context));
            }
        }
    }

    public static void Y(x xVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        long j10;
        double d;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i15;
        org.telegram.ui.fe feVar = xVar.f2422x;
        ArrayList arrayList2 = xVar.f2413j0;
        org.telegram.ui.fe feVar2 = xVar.f2423y;
        org.telegram.ui.fe feVar3 = xVar.v;
        org.telegram.ui.fe feVar4 = xVar.f2420s;
        org.telegram.ui.fe feVar5 = xVar.f2419r;
        long j11 = xVar.f2402b;
        org.telegram.ui.fe feVar6 = xVar.f2421w;
        boolean z10 = xVar.f2404c;
        int i16 = xVar.f2418o0;
        k0 g10 = k0.g(xVar.currentAccount);
        int i17 = xVar.f2400a;
        if (i17 == 0) {
            arrayList.add(l61.h(2, i16, xVar.f2416n));
            arrayList.add(l61.A(-1, null));
            arrayList.add(l61.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j11, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                feVar5.f37310a = false;
                feVar5.f37314g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                feVar5.f37315i = starsAmount3;
                feVar5.h = "XTR";
                feVar5.f37313f = "USD";
                double d10 = xVar.Z;
                feVar5.f37316j = (long) (starsAmount3.amount * d10 * 100.0d);
                feVar4.f37310a = false;
                feVar4.f37314g = true;
                feVar4.f37315i = tL_starsRevenueStatus2.current_balance;
                feVar4.h = "XTR";
                feVar4.f37316j = (long) (starsAmount.amount * d10 * 100.0d);
                feVar4.f37313f = "USD";
                feVar3.f37310a = false;
                feVar3.f37314g = true;
                feVar3.f37315i = tL_starsRevenueStatus2.overall_revenue;
                feVar3.h = "XTR";
                feVar3.f37316j = (long) (starsAmount2.amount * d10 * 100.0d);
                feVar3.f37313f = "USD";
                xVar.i0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = xVar.I;
                if (h.status.withdrawal_enabled) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                linearLayout.setVisibility(i15);
            }
            arrayList.add(l61.u(feVar5));
            arrayList.add(l61.u(feVar4));
            arrayList.add(l61.u(feVar3));
            if (z10) {
                i14 = R.string.SelfStarsOverviewInfo;
            } else {
                i14 = R.string.BotStarsOverviewInfo;
            }
            arrayList.add(l61.A(-2, LocaleController.getString(i14)));
            arrayList.add(l61.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(l61.j(1, xVar.H));
            arrayList.add(l61.A(-3, xVar.E));
            if (!z10) {
                if (xVar.getMessagesController().starrefConnectAllowed) {
                    arrayList.add(gi.h.a(2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, xVar.resourceProvider), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                    arrayList.add(l61.A(-4, null));
                }
                arrayList.add(l61.p(xVar.F, 0, false));
            }
        } else if (i17 == 1) {
            TLRPC.TL_payments_starsRevenueStats j12 = g10.j(j11, true);
            if (!z10) {
                if (xVar.f2403b0 == null) {
                    xVar.f2403b0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new d(xVar, 2), xVar.resourceProvider), true);
                }
                arrayList.add(l61.g(xVar.f2403b0));
            }
            if (xVar.f2409f0 == null && j12 != null) {
                f91 f02 = t91.f0(j12.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                xVar.f2409f0 = f02;
                if (f02 != null) {
                    f02.f37253n = true;
                }
            }
            f91 f91Var = xVar.f2409f0;
            if (f91Var != null && !f91Var.f37251l) {
                arrayList.add(l61.h(5, i16, f91Var));
                arrayList.add(l61.A(-1, null));
            }
            if (xVar.f2410g0 == null && j12 != null) {
                TL_stats.StatsGraph statsGraph = j12.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j12.usd_rate);
                }
                i10 = 2;
                xVar.f2410g0 = t91.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            } else {
                i10 = 2;
            }
            f91 f91Var2 = xVar.f2410g0;
            if (f91Var2 != null && !f91Var2.f37251l) {
                arrayList.add(l61.h(i10, i16, f91Var2));
                arrayList.add(l61.A(-2, null));
            }
            if (!xVar.f2407e0 && j12 != null && (tL_starsRevenueStatus = j12.status) != null) {
                double d11 = j12.usd_rate;
                long j13 = tL_starsRevenueStatus.available_balance.amount;
                feVar6.d = j13;
                double d12 = j13 / 1.0E9d;
                feVar6.e = (long) (d12 * d11 * 100.0d);
                if (xVar.f2415l0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d11;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    xVar.f2415l0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i12 = 6;
                    xVar.f2415l0.setMaximumFractionDigits(6);
                    xVar.f2415l0.setGroupingUsed(false);
                } else {
                    d = d11;
                    i12 = 6;
                }
                DecimalFormat decimalFormat2 = xVar.f2415l0;
                if (d12 > 1.5d) {
                    i12 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i12);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.ui.ie.e0("TON " + xVar.f2415l0.format(d12), xVar.W.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(xVar.V, indexOf, spannableStringBuilder.length(), 33);
                }
                xVar.W.setText(spannableStringBuilder);
                xVar.X.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
                feVar6.f37313f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j12.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                feVar.d = j14;
                feVar.e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                feVar.f37313f = "USD";
                feVar2.f37310a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                feVar2.d = j15;
                feVar2.e = (long) ((j15 / 1.0E9d) * d * 100.0d);
                feVar2.f37313f = "USD";
                xVar.f2407e0 = true;
                ei.d dVar = xVar.Y;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar.setVisibility(i13);
            }
            if (xVar.f2407e0) {
                arrayList.add(l61.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(l61.u(feVar6));
                arrayList.add(l61.u(feVar));
                arrayList.add(l61.u(feVar2));
                if (xVar.f2405c0 == null) {
                    xVar.f2405c0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new ah.g(xVar, R.string.BotMonetizationProceedsTONInfoLink, 1), xVar.resourceProvider), true);
                }
                arrayList.add(l61.A(-4, xVar.f2405c0));
            }
            arrayList.add(l61.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(l61.k(xVar.U));
            if (xVar.f2406d0 == null) {
                if (MessagesController.getInstance(xVar.currentAccount).channelRevenueWithdrawalEnabled) {
                    i11 = R.string.BotMonetizationBalanceInfo;
                } else {
                    i11 = R.string.BotMonetizationBalanceInfoNotAvailable;
                }
                xVar.f2406d0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new d(xVar, 3)), true);
            }
            arrayList.add(l61.A(-5, xVar.f2406d0));
            if (!xVar.f2412i0 || !arrayList2.isEmpty()) {
                arrayList.add(l61.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList2.get(i18);
                    i18++;
                    int i19 = hd.f1441a;
                    l61 J = l61.J(hd.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.f28232q = true;
                    arrayList.add(J);
                }
                if (!xVar.f2412i0) {
                    arrayList.add(l61.o(1, 7));
                    arrayList.add(l61.o(2, 7));
                    arrayList.add(l61.o(3, 7));
                }
            }
            arrayList.add(l61.A(-6, null));
        }
    }

    public static void Z(x xVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        int i16;
        if (tL_error != null) {
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(xVar.currentAccount).sendRequest(new TL_account.getPassword(), new l(xVar, twoStepVerificationActivity, z10, j10, 0), 8);
                    return;
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                org.telegram.ui.Components.vc.d0(tL_error);
                return;
            }
            twoStepVerificationActivity.o0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(activity);
            int i17 = org.telegram.ui.ActionBar.k6.f21290j5;
            org.telegram.ui.ActionBar.r6.W(textView, i17, null);
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
            linearLayout.addView(textView, w7.z5.n(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(R.drawable.list_circle);
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(11.0f);
            } else {
                i11 = 0;
            }
            int dp3 = AndroidUtilities.dp(9.0f);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(11.0f);
            }
            imageView.setPadding(i11, dp3, dp, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView, i17, null, mode);
            TextView textView2 = new TextView(activity);
            org.telegram.ui.ActionBar.r6.W(textView2, i17, null);
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.v0.m(R.string.EditAdminTransferAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                linearLayout2.addView(textView2, w7.z5.n(-1, -2));
            }
            LinearLayout f7 = org.telegram.messenger.v0.f(activity, 0);
            linearLayout.addView(f7, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(activity);
            imageView2.setImageResource(R.drawable.list_circle);
            if (LocaleController.isRTL) {
                i13 = AndroidUtilities.dp(11.0f);
            } else {
                i13 = 0;
            }
            int dp4 = AndroidUtilities.dp(9.0f);
            if (LocaleController.isRTL) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(11.0f);
            }
            imageView2.setPadding(i13, dp4, dp2, 0);
            org.telegram.ui.ActionBar.r6.t(imageView2, i17, null, mode);
            TextView textView3 = new TextView(activity);
            org.telegram.ui.ActionBar.r6.W(textView3, i17, null);
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.v0.m(R.string.EditAdminTransferAlertText2, textView3);
            if (LocaleController.isRTL) {
                f7.addView(textView3, w7.z5.n(-1, -2));
                i15 = 5;
                f7.addView(imageView2, w7.z5.q(-2, -2, 5));
            } else {
                i15 = 5;
                f7.addView(imageView2, w7.z5.n(-2, -2));
                f7.addView(textView3, w7.z5.n(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new k(xVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(activity);
                org.telegram.ui.ActionBar.r6.W(textView4, i17, null);
                textView4.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i16 = i15;
                } else {
                    i16 = 3;
                }
                textView4.setGravity(i16 | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            twoStepVerificationActivity.showDialog(alertDialog$Builder.f20679a);
            return;
        }
        twoStepVerificationActivity.o0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            pf.d.t(xVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            xVar.O = true;
            pf.d.t(xVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void a0(x xVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(xVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(xVar.currentAccount).putChats(starsStatus.chats, false);
            xVar.f2414k0 = starsStatus.next_offset;
            xVar.f2413j0.addAll(starsStatus.history);
            if (!starsStatus.history.isEmpty() && starsStatus.next_offset != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            xVar.f2412i0 = z10;
        } else if (tL_error != null) {
            org.telegram.ui.Components.vc.d0(tL_error);
            xVar.f2412i0 = true;
        }
        xVar.f2411h0 = false;
        a71 a71Var = xVar.e.Z2;
        if (a71Var != null) {
            a71Var.N(true);
        }
    }

    public static void e0(x xVar) {
        int i10;
        if (!xVar.f2411h0 && !xVar.f2412i0 && xVar.f2414k0 != null) {
            xVar.f2411h0 = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(xVar.currentAccount).getInputPeer(xVar.f2402b);
            tL_payments_getStarsTransactions.offset = xVar.f2414k0;
            if (xVar.f2413j0.isEmpty()) {
                i10 = 5;
            } else {
                i10 = 20;
            }
            tL_payments_getStarsTransactions.limit = i10;
            ConnectionsManager.getInstance(xVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new h(xVar, 0));
        }
    }

    public static String j0(int i10) {
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = i12 - (i13 * 3600);
        int i15 = i14 / 60;
        int i16 = i14 - (i15 * 60);
        if (i11 == 0) {
            if (i13 == 0) {
                return String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16));
            }
            return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i15), Integer.valueOf(i16));
        }
        int i17 = R.string.PeriodDHM;
        Locale locale = Locale.ENGLISH;
        return LocaleController.formatString(i17, String.format(locale, "%02d", Integer.valueOf(i11)), String.format(locale, "%02d", Integer.valueOf(i13)), String.format(locale, "%02d", Integer.valueOf(i15)));
    }

    @Override
    public final View createView(Context context) {
        float f7;
        int i10;
        w wVar = new w(this, context);
        mo moVar = new mo(context, null, false, null);
        this.d = moVar;
        moVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        mo moVar2 = this.d;
        if (!this.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar.addView(moVar2, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f2402b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.f2400a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        i2.o1.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 1));
        mo moVar3 = this.d;
        int i11 = org.telegram.ui.ActionBar.k6.Oi;
        moVar3.i(org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pi, false));
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i11, null);
        org.telegram.ui.ActionBar.r6.b(this.actionBar, i11, null, true);
        int i12 = 3;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21591z8, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i13, kVar2, null);
        this.F = new md(context, this.currentAccount, false, this.f2402b, getClassGuid(), getResourceProvider());
        r rVar = new r(context, 0);
        this.H = rVar;
        rVar.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i13, this.H, getResourceProvider());
        this.H.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.K = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.o6 o6Var2 = this.K;
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.a0(o6Var2, i14, getResourceProvider());
        this.K.setTextSize(AndroidUtilities.dp(32.0f));
        this.K.setGravity(17);
        this.J = new RelativeSizeSpan(0.6770833f);
        this.H.addView(this.K, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.L = o6Var3;
        o6Var3.setGravity(17);
        org.telegram.ui.Components.o6 o6Var4 = this.L;
        int i15 = org.telegram.ui.ActionBar.k6.f21572y6;
        org.telegram.ui.ActionBar.r6.a0(o6Var4, i15, getResourceProvider());
        this.L.setTextSize(AndroidUtilities.dp(14.0f));
        this.H.addView(this.L, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        s sVar = new s(this, context, 0);
        this.M = sVar;
        sVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.M.setLeftPadding(AndroidUtilities.dp(36.0f));
        t tVar = new t(context, 0);
        this.Q = tVar;
        tVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.W(this.Q, i14, getResourceProvider());
        this.Q.setCursorSize(AndroidUtilities.dp(20.0f));
        this.Q.setCursorWidth(1.5f);
        this.Q.setBackground(null);
        this.Q.setTextSize(1, 18.0f);
        this.Q.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.Q.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.Q.setInputType(2);
        this.Q.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.E(this.Q, org.telegram.ui.ActionBar.k6.f21508uf, getResourceProvider());
        org.telegram.ui.ActionBar.r6.A(this.Q, org.telegram.ui.ActionBar.k6.f21526vf, getResourceProvider());
        t tVar2 = this.Q;
        if (LocaleController.isRTL) {
            i12 = 5;
        }
        tVar2.setGravity(i12);
        this.Q.setOnFocusChangeListener(new ah.u0(this, 1));
        this.Q.addTextChangedListener(new u(this, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Q, w7.z5.o(-1, -2, 1.0f, 119));
        this.M.e(this.Q);
        this.M.addView(linearLayout, w7.z5.e(-1, -2, 48));
        this.Q.setOnEditorActionListener(new n(this, 0));
        this.H.addView(this.M, w7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        this.M.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.I = linearLayout2;
        linearLayout2.setOrientation(0);
        v vVar = new v(0, context, getResourceProvider(), true);
        vVar.setRoundRadius(24);
        this.R = vVar;
        vVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.R.i(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        this.R.setOnClickListener(new View.OnClickListener(this) {
            public final x f1925b;

            {
                this.f1925b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f1925b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            x xVar = this.f1925b;
                            if (!xVar.Y.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ah.h0 h0Var = new ah.h0(1, xVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f34242b0 = h0Var;
                                xVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new e(xVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.S = dVar;
        dVar.setEnabled(true);
        this.S.i(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.S.setOnClickListener(new p(0, this, context));
        this.I.addView(this.R, w7.z5.o(-1, 48, 1.0f, 119));
        boolean z10 = this.f2404c;
        if (!z10) {
            this.I.addView(new Space(context), w7.z5.o(8, 48, 0.0f, 119));
            this.I.addView(this.S, w7.z5.o(-1, 48, 1.0f, 119));
        }
        this.H.addView(this.I, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        r rVar2 = new r(context, 1);
        this.U = rVar2;
        rVar2.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i13, this.U, this.resourceProvider);
        this.U.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.o6 o6Var5 = new org.telegram.ui.Components.o6(context, false, true, true);
        this.W = o6Var5;
        o6Var5.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.a0(this.W, i14, this.resourceProvider);
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.V = new RelativeSizeSpan(0.6770833f);
        this.U.addView(this.W, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var6 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.X = o6Var6;
        o6Var6.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(this.X, i15, this.resourceProvider);
        this.X.setTextSize(AndroidUtilities.dp(14.0f));
        this.U.addView(this.X, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        ei.d dVar3 = this.Y;
        if (z10) {
            i10 = R.string.MonetizationSelfWithdraw;
        } else {
            i10 = R.string.MonetizationWithdraw;
        }
        dVar3.i(LocaleController.getString(i10), false, true);
        this.Y.setVisibility(8);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final x f1925b;

            {
                this.f1925b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f1925b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            x xVar = this.f1925b;
                            if (!xVar.Y.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ah.h0 h0Var = new ah.h0(1, xVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f34242b0 = h0Var;
                                xVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new e(xVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.U.addView(this.Y, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        i71 i71Var = new i71(this, new q(this, 0), new k(this), new k(this));
        this.e = i71Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, i71Var, getResourceProvider());
        this.e.t1();
        wVar.addView(this.e, w7.z5.c(-1.0f, -1));
        this.e.setOnScrollListener(new ah.d0(this, 1));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = wVar;
        return wVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f2402b) {
            g0();
        }
    }

    public final void g0() {
        kg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = k0.g(this.currentAccount).h(this.f2402b, false);
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2 = null;
        if (h == this.f2408f) {
            if (h == null) {
                tL_starsRevenueStatus = null;
            } else {
                tL_starsRevenueStatus = h.status;
            }
            if (tL_starsRevenueStatus == this.h) {
                return;
            }
        }
        this.f2408f = h;
        if (h != null) {
            tL_starsRevenueStatus2 = h.status;
        }
        this.h = tL_starsRevenueStatus2;
        if (h != null) {
            this.Z = h.usd_rate;
            f91 f02 = t91.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.f2416n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f2416n.d.d.get(0) != null) {
                f91 f91Var = this.f2416n;
                f91Var.h = true;
                ((kg.a) f91Var.d.d.get(0)).f15096g = org.telegram.ui.ActionBar.k6.yj;
                this.f2416n.d.h = (float) ((1.0d / this.Z) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            i0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            i71 i71Var = this.e;
            if (i71Var != null) {
                i71Var.Z2.N(true);
            }
        }
    }

    public final void h0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity != null && currentUser != null) {
            long j11 = this.f2402b;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new i(this, twoStepVerificationActivity, parentActivity, z10, j10));
        }
    }

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        int i11;
        if (this.K != null && this.L != null) {
            long j10 = (long) (this.Z * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nd.Y0(false, TextUtils.concat("XTR ", nd.K0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.J, indexOf, spannableStringBuilder.length(), 33);
            }
            this.K.setText(spannableStringBuilder);
            this.L.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            s sVar = this.M;
            if (j10 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            sVar.setVisibility(i11);
            if (this.O) {
                this.N = true;
                t tVar = this.Q;
                long j11 = starsAmount.amount;
                this.P = j11;
                tVar.setText(Long.toString(j11));
                t tVar2 = this.Q;
                tVar2.setSelection(tVar2.getText().length());
                this.N = false;
                v vVar = this.R;
                if (this.P > 0) {
                    z10 = true;
                }
                vVar.setEnabled(z10);
            }
            this.G = i10;
            d dVar = this.f2417n0;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            dVar.run();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void k0() {
        v vVar = this.R;
        if (vVar.f8862c0 && !vVar.Q) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.G > currentTime) {
                this.f2401a0 = org.telegram.ui.Components.vc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.G - currentTime)))).j();
            } else if (this.P < getMessagesController().starsRevenueWithdrawalMin) {
                org.telegram.ui.Components.vc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new d(this, 1))).j();
            } else {
                long j10 = this.P;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                f fVar = new f(this, j10, twoStepVerificationActivity, 0);
                twoStepVerificationActivity.Z = 1;
                twoStepVerificationActivity.f34242b0 = fVar;
                this.R.setLoading(true);
                twoStepVerificationActivity.s0(new e(this, twoStepVerificationActivity, 1));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        g0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            mo moVar = this.d;
            if (moVar != null) {
                moVar.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oi, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pi, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
