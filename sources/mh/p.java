package mh;

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
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ha1;
import org.telegram.ui.he;
import org.telegram.ui.ke;
import org.telegram.ui.po;
import org.telegram.ui.t91;
import org.telegram.ui.yh;
public final class p extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence B;
    public ia C;
    public int D;
    public eg.s3 E;
    public LinearLayout F;
    public RelativeSizeSpan G;
    public org.telegram.ui.Components.k6 H;
    public org.telegram.ui.Components.k6 I;
    public l J;
    public boolean K;
    public boolean L;
    public long M;
    public m N;
    public n O;
    public qh.d P;
    public final oq[] Q;
    public eg.s3 R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.k6 T;
    public org.telegram.ui.Components.k6 U;
    public qh.d V;
    public double W;
    public ic X;
    public CharSequence Y;
    public CharSequence Z;
    public final int f14552a;
    public CharSequence f14553a0;
    public final long f14554b;
    public boolean f14555b0;
    public final boolean f14556c;
    public t91 f14557c0;
    public bo d;
    public t91 f14558d0;
    public i61 f14559e;
    public boolean f14560e0;
    public TLRPC.TL_payments_starsRevenueStats f14561f;
    public boolean f14562f0;
    public final ArrayList f14563g0;
    public TLRPC.TL_starsRevenueStatus h;
    public String f14564h0;
    public DecimalFormat f14565i0;
    public SpannableStringBuilder f14566j0;
    public final c f14567k0;
    public final int f14568l0;
    public t91 f14569n;
    public final he f14570r;
    public final he f14571s;
    public final he v;
    public final he f14572w;
    public final he f14573x;
    public final he f14574y;

    public p(int i10, long j10) {
        super(null);
        boolean z4;
        String string;
        this.f14570r = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.f14571s = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.f14572w = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.f14573x = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.f14574y = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        boolean z10 = false;
        this.K = false;
        this.L = true;
        this.Q = new oq[1];
        this.f14560e0 = false;
        this.f14562f0 = false;
        this.f14563g0 = new ArrayList();
        this.f14564h0 = "";
        this.f14567k0 = new c(this, 0);
        this.f14568l0 = -1;
        this.f14552a = i10;
        this.f14554b = j10;
        if (j10 == getUserConfig().getClientUserId()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f14556c = z4;
        if (i10 == 0) {
            a0.g(this.currentAccount).r(j10);
            if (!z4) {
                a0.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            a0 g10 = a0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, (l10 == null || System.currentTimeMillis() - l10.longValue() > 30000) ? true : true);
        }
        if (z4) {
            string = LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin);
        } else {
            string = LocaleController.getString(R.string.BotStarsWithdrawInfo);
        }
        this.B = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new c(this, 4)), true);
    }

    public static void U(p pVar) {
        long j10;
        c cVar = pVar.f14567k0;
        ic.e();
        TLRPC.TL_payments_starsRevenueStats h = a0.g(pVar.currentAccount).h(pVar.f14554b, false);
        if (h == null) {
            j10 = 0;
        } else {
            j10 = h.status.available_balance.amount;
        }
        if (j10 < pVar.getMessagesController().starsRevenueWithdrawalMin) {
            pVar.L = true;
            pVar.M = j10;
        } else {
            pVar.L = false;
            pVar.M = pVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        pVar.K = true;
        pVar.N.setText(Long.toString(pVar.M));
        m mVar = pVar.N;
        mVar.setSelection(mVar.getText().length());
        pVar.K = false;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        cVar.run();
    }

    public static void V(p pVar) {
        pVar.showDialog(ke.d0(pVar.getParentActivity(), pVar.resourceProvider, true));
    }

    public static void W(p pVar, j51 j51Var) {
        if (j51Var.G(da.class)) {
            ja.h1(pVar.getParentActivity(), true, pVar.f14554b, pVar.currentAccount, (TL_stars.StarsTransaction) j51Var.G, pVar.getResourceProvider());
        } else if (j51Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            ke.h0(pVar.getParentActivity(), pVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) j51Var.G, pVar.f14554b, pVar.resourceProvider);
        } else if (j51Var.d == 2) {
            pVar.presentFragment(new sh.d3(pVar.f14554b));
        }
    }

    public static void X(p pVar, Context context, View view) {
        if (view.isEnabled()) {
            qh.d dVar = pVar.P;
            if (!dVar.K) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(pVar.currentAccount).getInputPeer(pVar.f14554b);
                ConnectionsManager.getInstance(pVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new eg.b3(5, pVar, context));
            }
        }
    }

    public static void Y(p pVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        double d;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        int i15;
        he heVar = pVar.f14573x;
        ArrayList arrayList2 = pVar.f14563g0;
        he heVar2 = pVar.f14574y;
        he heVar3 = pVar.v;
        he heVar4 = pVar.f14571s;
        he heVar5 = pVar.f14570r;
        long j10 = pVar.f14554b;
        he heVar6 = pVar.f14572w;
        boolean z4 = pVar.f14556c;
        int i16 = pVar.f14568l0;
        a0 g10 = a0.g(pVar.currentAccount);
        int i17 = pVar.f14552a;
        if (i17 == 0) {
            arrayList.add(j51.h(2, i16, pVar.f14569n));
            arrayList.add(j51.A(-1, null));
            arrayList.add(j51.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                heVar5.f37467a = false;
                heVar5.f37472g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                heVar5.f37473i = starsAmount;
                heVar5.h = "XTR";
                heVar5.f37471f = "USD";
                double d10 = pVar.W;
                heVar5.f37474j = (long) (starsAmount.amount * d10 * 100.0d);
                heVar4.f37467a = false;
                heVar4.f37472g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus2.current_balance;
                heVar4.f37473i = starsAmount2;
                heVar4.h = "XTR";
                heVar4.f37474j = (long) (starsAmount2.amount * d10 * 100.0d);
                heVar4.f37471f = "USD";
                heVar3.f37467a = false;
                heVar3.f37472g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.overall_revenue;
                heVar3.f37473i = starsAmount3;
                heVar3.h = "XTR";
                heVar3.f37474j = (long) (starsAmount3.amount * d10 * 100.0d);
                heVar3.f37471f = "USD";
                pVar.i0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = pVar.F;
                if (h.status.withdrawal_enabled) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                linearLayout.setVisibility(i15);
            }
            arrayList.add(j51.u(heVar5));
            arrayList.add(j51.u(heVar4));
            arrayList.add(j51.u(heVar3));
            if (z4) {
                i14 = R.string.SelfStarsOverviewInfo;
            } else {
                i14 = R.string.BotStarsOverviewInfo;
            }
            arrayList.add(j51.A(-2, LocaleController.getString(i14)));
            arrayList.add(j51.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(j51.j(1, pVar.E));
            arrayList.add(j51.A(-3, pVar.B));
            if (!z4) {
                if (pVar.getMessagesController().starrefConnectAllowed) {
                    arrayList.add(sh.f.a(2, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.uj, pVar.resourceProvider), R.drawable.filled_earn_stars, po.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                    arrayList.add(j51.A(-4, null));
                }
                arrayList.add(j51.p(pVar.C, 0, false));
            }
        } else if (i17 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z4) {
                if (pVar.Y == null) {
                    pVar.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new c(pVar, 2), pVar.resourceProvider), true);
                }
                arrayList.add(j51.g(pVar.Y));
            }
            if (pVar.f14557c0 == null && j11 != null) {
                t91 f02 = ha1.f0(j11.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                pVar.f14557c0 = f02;
                if (f02 != null) {
                    f02.f41553n = true;
                }
            }
            t91 t91Var = pVar.f14557c0;
            if (t91Var != null && !t91Var.f41551l) {
                arrayList.add(j51.h(5, i16, t91Var));
                arrayList.add(j51.A(-1, null));
            }
            if (pVar.f14558d0 == null && j11 != null) {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i10 = 2;
                pVar.f14558d0 = ha1.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            } else {
                i10 = 2;
            }
            t91 t91Var2 = pVar.f14558d0;
            if (t91Var2 != null && !t91Var2.f41551l) {
                arrayList.add(j51.h(i10, i16, t91Var2));
                arrayList.add(j51.A(-2, null));
            }
            if (!pVar.f14555b0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d11 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                heVar6.d = j12;
                double d12 = j12 / 1.0E9d;
                long j13 = (long) (d12 * d11 * 100.0d);
                heVar6.f37470e = j13;
                if (pVar.f14565i0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d11;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    pVar.f14565i0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i12 = 6;
                    pVar.f14565i0.setMaximumFractionDigits(6);
                    pVar.f14565i0.setGroupingUsed(false);
                } else {
                    d = d11;
                    i12 = 6;
                }
                DecimalFormat decimalFormat2 = pVar.f14565i0;
                if (d12 > 1.5d) {
                    i12 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i12);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ke.f0("TON " + pVar.f14565i0.format(d12), pVar.T.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(pVar.S, indexOf, spannableStringBuilder.length(), 33);
                }
                pVar.T.setText(spannableStringBuilder);
                org.telegram.ui.Components.k6 k6Var = pVar.U;
                k6Var.setText("≈" + BillingController.getInstance().formatCurrency(j13, "USD"));
                heVar6.f37471f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                heVar.d = j14;
                heVar.f37470e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                heVar.f37471f = "USD";
                heVar2.f37467a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                heVar2.d = j15;
                heVar2.f37470e = (long) ((j15 / 1.0E9d) * d * 100.0d);
                heVar2.f37471f = "USD";
                pVar.f14555b0 = true;
                qh.d dVar = pVar.V;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar.setVisibility(i13);
            }
            if (pVar.f14555b0) {
                arrayList.add(j51.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(j51.u(heVar6));
                arrayList.add(j51.u(heVar));
                arrayList.add(j51.u(heVar2));
                if (pVar.Z == null) {
                    pVar.Z = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new af.b(pVar, R.string.BotMonetizationProceedsTONInfoLink, 8), pVar.resourceProvider), true);
                }
                arrayList.add(j51.A(-4, pVar.Z));
            }
            arrayList.add(j51.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(j51.k(pVar.R));
            if (pVar.f14553a0 == null) {
                if (MessagesController.getInstance(pVar.currentAccount).channelRevenueWithdrawalEnabled) {
                    i11 = R.string.BotMonetizationBalanceInfo;
                } else {
                    i11 = R.string.BotMonetizationBalanceInfoNotAvailable;
                }
                pVar.f14553a0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new c(pVar, 3)), true);
            }
            arrayList.add(j51.A(-5, pVar.f14553a0));
            if (!pVar.f14562f0 || !arrayList2.isEmpty()) {
                arrayList.add(j51.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList2.get(i18);
                    i18++;
                    int i19 = da.f13917a;
                    j51 J = j51.J(da.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.f28019q = true;
                    arrayList.add(J);
                }
                if (!pVar.f14562f0) {
                    arrayList.add(j51.o(1, 7));
                    arrayList.add(j51.o(2, 7));
                    arrayList.add(j51.o(3, 7));
                }
            }
            arrayList.add(j51.A(-6, null));
        }
    }

    public static void Z(p pVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10, TLObject tLObject) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        if (tL_error != null) {
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(pVar.currentAccount).sendRequest(new TL_account.getPassword(), new h(pVar, twoStepVerificationActivity, z4, j10, 0), 8);
                    return;
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                qc.b0(tL_error);
                return;
            }
            twoStepVerificationActivity.o0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.k6.f21766j5;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
            linearLayout.addView(textView, k7.c6.n(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, i16, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
            TextView textView2 = new TextView(activity);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, k7.c6.n(-1, -2));
                linearLayout2.addView(imageView, k7.c6.q(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, k7.c6.n(-2, -2));
                linearLayout2.addView(textView2, k7.c6.n(-1, -2));
            }
            LinearLayout h = l.d.h(activity, 0);
            linearLayout.addView(h, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i16, false), mode));
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
            if (LocaleController.isRTL) {
                h.addView(textView3, k7.c6.n(-1, -2));
                i15 = 5;
                h.addView(imageView2, k7.c6.q(-2, -2, 5));
            } else {
                i15 = 5;
                h.addView(imageView2, k7.c6.n(-2, -2));
                h.addView(textView3, k7.c6.n(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new g(pVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(activity);
                textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                textView4.setTextSize(1, 16.0f);
                if (!LocaleController.isRTL) {
                    i15 = 3;
                }
                textView4.setGravity(i15 | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            twoStepVerificationActivity.showDialog(alertDialog$Builder.f21166a);
            return;
        }
        twoStepVerificationActivity.o0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            af.g.u(pVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            pVar.L = true;
            af.g.u(pVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void a0(p pVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z4;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(pVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(pVar.currentAccount).putChats(starsStatus.chats, false);
            pVar.f14564h0 = starsStatus.next_offset;
            pVar.f14563g0.addAll(starsStatus.history);
            if (!starsStatus.history.isEmpty() && starsStatus.next_offset != null) {
                z4 = false;
            } else {
                z4 = true;
            }
            pVar.f14562f0 = z4;
        } else if (tL_error != null) {
            qc.b0(tL_error);
            pVar.f14562f0 = true;
        }
        pVar.f14560e0 = false;
        x51 x51Var = pVar.f14559e.V2;
        if (x51Var != null) {
            x51Var.N(true);
        }
    }

    public static void e0(p pVar) {
        int i10;
        if (!pVar.f14560e0 && !pVar.f14562f0 && pVar.f14564h0 != null) {
            pVar.f14560e0 = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(pVar.currentAccount).getInputPeer(pVar.f14554b);
            tL_payments_getStarsTransactions.offset = pVar.f14564h0;
            if (pVar.f14563g0.isEmpty()) {
                i10 = 5;
            } else {
                i10 = 20;
            }
            tL_payments_getStarsTransactions.limit = i10;
            ConnectionsManager.getInstance(pVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new gf.a(pVar, 5));
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
        float f10;
        int i10;
        int i11;
        o oVar = new o(this, context);
        bo boVar = new bo(context, null, false, null);
        this.d = boVar;
        boVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        bo boVar2 = this.d;
        if (!this.inPreviewMode) {
            f10 = 50.0f;
        } else {
            f10 = 0.0f;
        }
        kVar.addView(boVar2, 0, k7.c6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f14554b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.f14552a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 2));
        bo boVar3 = this.d;
        int i12 = org.telegram.ui.ActionBar.k6.Oi;
        boVar3.i(org.telegram.ui.ActionBar.k6.w0(null, i12, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pi, false));
        this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i12, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i12, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22055z8, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.k6.f21659d6;
        kVar2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.C = new ia(context, this.currentAccount, false, this.f14554b, getClassGuid(), getResourceProvider());
        eg.s3 s3Var = new eg.s3(context, 1);
        this.E = s3Var;
        s3Var.setOrientation(1);
        this.E.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i13, getResourceProvider()));
        this.E.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.H = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.k6 k6Var2 = this.H;
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, getResourceProvider()));
        this.H.setTextSize(AndroidUtilities.dp(32.0f));
        this.H.setGravity(17);
        this.G = new RelativeSizeSpan(0.6770833f);
        this.E.addView(this.H, k7.c6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.k6 k6Var3 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.I = k6Var3;
        k6Var3.setGravity(17);
        org.telegram.ui.Components.k6 k6Var4 = this.I;
        int i15 = org.telegram.ui.ActionBar.k6.f22036y6;
        k6Var4.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, getResourceProvider()));
        this.I.setTextSize(AndroidUtilities.dp(14.0f));
        this.E.addView(this.I, k7.c6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        l lVar = new l(this, context, 0);
        this.J = lVar;
        lVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.J.setLeftPadding(AndroidUtilities.dp(36.0f));
        m mVar = new m(context, 0);
        this.N = mVar;
        mVar.setFocusable(false);
        this.N.setTextColor(getThemedColor(i14));
        this.N.setCursorSize(AndroidUtilities.dp(20.0f));
        this.N.setCursorWidth(1.5f);
        this.N.setBackground(null);
        this.N.setTextSize(1, 18.0f);
        this.N.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.N.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.N.setInputType(2);
        this.N.setTypeface(Typeface.DEFAULT);
        this.N.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21970uf));
        this.N.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21988vf));
        m mVar2 = this.N;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        mVar2.setGravity(i10);
        this.N.setOnFocusChangeListener(new dg.z(this, 2));
        this.N.addTextChangedListener(new eh.c(this, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, k7.c6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.N, k7.c6.o(-1, -2, 1.0f, 119));
        this.J.e(this.N);
        this.J.addView(linearLayout, k7.c6.e(-1, -2, 48));
        this.N.setOnEditorActionListener(new j(this, 0));
        this.E.addView(this.J, k7.c6.t(-1, -2, 1, 18, 14, 18, 2));
        this.J.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.F = linearLayout2;
        linearLayout2.setOrientation(0);
        n nVar = new n(0, context, getResourceProvider(), true);
        nVar.setRoundRadius(24);
        this.O = nVar;
        nVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.O.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final p f14321b;

            {
                this.f14321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14321b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            p pVar = this.f14321b;
                            if (!pVar.V.K) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                c1.b bVar = new c1.b(27, pVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.W = 1;
                                twoStepVerificationActivity.Y = bVar;
                                pVar.V.setLoading(true);
                                twoStepVerificationActivity.s0(new d(pVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        qh.d dVar = new qh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.setEnabled(true);
        this.P.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.P.setOnClickListener(new dg.n(16, this, context));
        this.F.addView(this.O, k7.c6.o(-1, 48, 1.0f, 119));
        boolean z4 = this.f14556c;
        if (!z4) {
            this.F.addView(new Space(context), k7.c6.o(8, 48, 0.0f, 119));
            this.F.addView(this.P, k7.c6.o(-1, 48, 1.0f, 119));
        }
        this.E.addView(this.F, k7.c6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        eg.s3 s3Var2 = new eg.s3(context, 2);
        this.R = s3Var2;
        s3Var2.setOrientation(1);
        this.R.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i13, this.resourceProvider));
        this.R.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.k6 k6Var5 = new org.telegram.ui.Components.k6(context, false, true, true);
        this.T = k6Var5;
        k6Var5.setTypeface(AndroidUtilities.bold());
        this.T.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, this.resourceProvider));
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.T, k7.c6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.k6 k6Var6 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.U = k6Var6;
        k6Var6.setGravity(17);
        this.U.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, this.resourceProvider));
        this.U.setTextSize(AndroidUtilities.dp(14.0f));
        this.R.addView(this.U, k7.c6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        qh.d dVar2 = new qh.d(context, this.resourceProvider, true);
        this.V = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        qh.d dVar3 = this.V;
        if (z4) {
            i11 = R.string.MonetizationSelfWithdraw;
        } else {
            i11 = R.string.MonetizationWithdraw;
        }
        dVar3.g(LocaleController.getString(i11), false, true);
        this.V.setVisibility(8);
        this.V.setOnClickListener(new View.OnClickListener(this) {
            public final p f14321b;

            {
                this.f14321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14321b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            p pVar = this.f14321b;
                            if (!pVar.V.K) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                c1.b bVar = new c1.b(27, pVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.W = 1;
                                twoStepVerificationActivity.Y = bVar;
                                pVar.V.setLoading(true);
                                twoStepVerificationActivity.s0(new d(pVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.R.addView(this.V, k7.c6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        i61 i61Var = new i61(this, new eg.p1(this, 14), new g(this), new g(this));
        this.f14559e = i61Var;
        i61Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
        this.f14559e.p1();
        oVar.addView(this.f14559e, k7.c6.c(-1.0f, -1));
        this.f14559e.setOnScrollListener(new fg.e2(this, 6));
        this.actionBar.setAdaptiveBackground(this.f14559e);
        this.fragmentView = oVar;
        return oVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f14554b) {
            g0();
        }
    }

    public final void g0() {
        xf.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = a0.g(this.currentAccount).h(this.f14554b, false);
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2 = null;
        if (h == this.f14561f) {
            if (h == null) {
                tL_starsRevenueStatus = null;
            } else {
                tL_starsRevenueStatus = h.status;
            }
            if (tL_starsRevenueStatus == this.h) {
                return;
            }
        }
        this.f14561f = h;
        if (h != null) {
            tL_starsRevenueStatus2 = h.status;
        }
        this.h = tL_starsRevenueStatus2;
        if (h != null) {
            this.W = h.usd_rate;
            t91 f02 = ha1.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.f14569n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f14569n.d.d.get(0) != null) {
                t91 t91Var = this.f14569n;
                t91Var.h = true;
                ((xf.a) t91Var.d.d.get(0)).f50545g = org.telegram.ui.ActionBar.k6.yj;
                this.f14569n.d.h = (float) ((1.0d / this.W) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            i0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            i61 i61Var = this.f14559e;
            if (i61Var != null) {
                i61Var.V2.N(true);
            }
        }
    }

    public final void h0(boolean z4, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity != null && currentUser != null) {
            long j11 = this.f14554b;
            if (z4) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new e(this, twoStepVerificationActivity, parentActivity, z4, j10));
        }
    }

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        int i11;
        if (this.H != null && this.I != null) {
            long j10 = (long) (this.W * starsAmount.amount * 100.0d);
            boolean z4 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ja.X0(false, TextUtils.concat("XTR ", ja.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.G, indexOf, spannableStringBuilder.length(), 33);
            }
            this.H.setText(spannableStringBuilder);
            org.telegram.ui.Components.k6 k6Var = this.I;
            k6Var.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            l lVar = this.J;
            if (j10 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            lVar.setVisibility(i11);
            if (this.L) {
                this.K = true;
                m mVar = this.N;
                long j11 = starsAmount.amount;
                this.M = j11;
                mVar.setText(Long.toString(j11));
                m mVar2 = this.N;
                mVar2.setSelection(mVar2.getText().length());
                this.K = false;
                n nVar = this.O;
                if (this.M > 0) {
                    z4 = true;
                }
                nVar.setEnabled(z4);
            }
            this.D = i10;
            c cVar = this.f14567k0;
            AndroidUtilities.cancelRunOnUIThread(cVar);
            cVar.run();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void k0() {
        n nVar = this.O;
        if (nVar.T && !nVar.K) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.D > currentTime) {
                this.X = qc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.D - currentTime)))).j();
            } else if (this.M < getMessagesController().starsRevenueWithdrawalMin) {
                qc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new c(this, 1))).j();
            } else {
                long j10 = this.M;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                e3.f fVar = new e3.f(this, j10, twoStepVerificationActivity, 3);
                twoStepVerificationActivity.W = 1;
                twoStepVerificationActivity.Y = fVar;
                this.O.setLoading(true);
                twoStepVerificationActivity.s0(new d(this, twoStepVerificationActivity, 1));
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
}
