package lh;

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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yn;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.aa1;
import org.telegram.ui.ai;
import org.telegram.ui.je;
import org.telegram.ui.me;
import org.telegram.ui.oa1;
import org.telegram.ui.ro;
public final class q extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence B;
    public ia C;
    public int D;
    public dg.u3 E;
    public LinearLayout F;
    public RelativeSizeSpan G;
    public org.telegram.ui.Components.k6 H;
    public org.telegram.ui.Components.k6 I;
    public m J;
    public boolean K;
    public boolean L;
    public long M;
    public n N;
    public o O;
    public ph.d P;
    public final lq[] Q;
    public dg.u3 R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.k6 T;
    public org.telegram.ui.Components.k6 U;
    public ph.d V;
    public double W;
    public ic X;
    public CharSequence Y;
    public CharSequence Z;
    public final int f12929a;
    public CharSequence f12930a0;
    public final long f12931b;
    public boolean f12932b0;
    public final boolean f12933c;
    public aa1 f12934c0;
    public yn d;
    public aa1 f12935d0;
    public g61 e;
    public boolean f12936e0;
    public TLRPC.TL_payments_starsRevenueStats f12937f;
    public boolean f12938f0;
    public final ArrayList f12939g0;
    public TLRPC.TL_starsRevenueStatus h;
    public String f12940h0;
    public DecimalFormat f12941i0;
    public SpannableStringBuilder f12942j0;
    public final d f12943k0;
    public final int f12944l0;
    public aa1 f12945n;
    public final je f12946r;
    public final je f12947s;
    public final je v;
    public final je f12948w;
    public final je f12949x;
    public final je f12950y;

    public q(int i10, long j10) {
        super(null);
        boolean z4;
        String string;
        this.f12946r = je.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.f12947s = je.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = je.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.f12948w = je.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.f12949x = je.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.f12950y = je.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        boolean z10 = false;
        this.K = false;
        this.L = true;
        this.Q = new lq[1];
        this.f12936e0 = false;
        this.f12938f0 = false;
        this.f12939g0 = new ArrayList();
        this.f12940h0 = "";
        this.f12943k0 = new d(this, 0);
        this.f12944l0 = -1;
        this.f12929a = i10;
        this.f12931b = j10;
        if (j10 == getUserConfig().getClientUserId()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f12933c = z4;
        if (i10 == 0) {
            b0.g(this.currentAccount).r(j10);
            if (!z4) {
                b0.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            b0 g10 = b0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, (l10 == null || System.currentTimeMillis() - l10.longValue() > 30000) ? true : true);
        }
        if (z4) {
            string = LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin);
        } else {
            string = LocaleController.getString(R.string.BotStarsWithdrawInfo);
        }
        this.B = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new d(this, 4)), true);
    }

    public static void U(q qVar) {
        long j10;
        d dVar = qVar.f12943k0;
        ic.e();
        TLRPC.TL_payments_starsRevenueStats h = b0.g(qVar.currentAccount).h(qVar.f12931b, false);
        if (h == null) {
            j10 = 0;
        } else {
            j10 = h.status.available_balance.amount;
        }
        if (j10 < qVar.getMessagesController().starsRevenueWithdrawalMin) {
            qVar.L = true;
            qVar.M = j10;
        } else {
            qVar.L = false;
            qVar.M = qVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        qVar.K = true;
        qVar.N.setText(Long.toString(qVar.M));
        n nVar = qVar.N;
        nVar.setSelection(nVar.getText().length());
        qVar.K = false;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
    }

    public static void V(q qVar) {
        qVar.showDialog(me.d0(qVar.getParentActivity(), qVar.resourceProvider, true));
    }

    public static void W(q qVar, i51 i51Var) {
        if (i51Var.G(da.class)) {
            ja.h1(qVar.getParentActivity(), true, qVar.f12931b, qVar.currentAccount, (TL_stars.StarsTransaction) i51Var.G, qVar.getResourceProvider());
        } else if (i51Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            me.h0(qVar.getParentActivity(), qVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) i51Var.G, qVar.f12931b, qVar.resourceProvider);
        } else if (i51Var.d == 2) {
            qVar.presentFragment(new rh.d3(qVar.f12931b));
        }
    }

    public static void X(q qVar, Context context, View view) {
        if (view.isEnabled()) {
            ph.d dVar = qVar.P;
            if (!dVar.K) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(qVar.currentAccount).getInputPeer(qVar.f12931b);
                ConnectionsManager.getInstance(qVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new dg.d3(5, qVar, context));
            }
        }
    }

    public static void Y(q qVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        double d;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        int i15;
        je jeVar = qVar.f12949x;
        ArrayList arrayList2 = qVar.f12939g0;
        je jeVar2 = qVar.f12950y;
        je jeVar3 = qVar.v;
        je jeVar4 = qVar.f12947s;
        je jeVar5 = qVar.f12946r;
        long j10 = qVar.f12931b;
        je jeVar6 = qVar.f12948w;
        boolean z4 = qVar.f12933c;
        int i16 = qVar.f12944l0;
        b0 g10 = b0.g(qVar.currentAccount);
        int i17 = qVar.f12929a;
        if (i17 == 0) {
            arrayList.add(i51.h(2, i16, qVar.f12945n));
            arrayList.add(i51.A(-1, null));
            arrayList.add(i51.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                jeVar5.f35245a = false;
                jeVar5.f35249g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                jeVar5.f35250i = starsAmount;
                jeVar5.h = "XTR";
                jeVar5.f35248f = "USD";
                double d10 = qVar.W;
                jeVar5.f35251j = (long) (starsAmount.amount * d10 * 100.0d);
                jeVar4.f35245a = false;
                jeVar4.f35249g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus2.current_balance;
                jeVar4.f35250i = starsAmount2;
                jeVar4.h = "XTR";
                jeVar4.f35251j = (long) (starsAmount2.amount * d10 * 100.0d);
                jeVar4.f35248f = "USD";
                jeVar3.f35245a = false;
                jeVar3.f35249g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.overall_revenue;
                jeVar3.f35250i = starsAmount3;
                jeVar3.h = "XTR";
                jeVar3.f35251j = (long) (starsAmount3.amount * d10 * 100.0d);
                jeVar3.f35248f = "USD";
                qVar.i0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = qVar.F;
                if (h.status.withdrawal_enabled) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                linearLayout.setVisibility(i15);
            }
            arrayList.add(i51.u(jeVar5));
            arrayList.add(i51.u(jeVar4));
            arrayList.add(i51.u(jeVar3));
            if (z4) {
                i14 = R.string.SelfStarsOverviewInfo;
            } else {
                i14 = R.string.BotStarsOverviewInfo;
            }
            arrayList.add(i51.A(-2, LocaleController.getString(i14)));
            arrayList.add(i51.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(i51.j(1, qVar.E));
            arrayList.add(i51.A(-3, qVar.B));
            if (!z4) {
                if (qVar.getMessagesController().starrefConnectAllowed) {
                    arrayList.add(rh.f.a(2, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, qVar.resourceProvider), R.drawable.filled_earn_stars, ro.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                    arrayList.add(i51.A(-4, null));
                }
                arrayList.add(i51.p(qVar.C, 0, false));
            }
        } else if (i17 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z4) {
                if (qVar.Y == null) {
                    qVar.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new d(qVar, 2), qVar.resourceProvider), true);
                }
                arrayList.add(i51.g(qVar.Y));
            }
            if (qVar.f12934c0 == null && j11 != null) {
                aa1 f02 = oa1.f0(j11.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                qVar.f12934c0 = f02;
                if (f02 != null) {
                    f02.f32536n = true;
                }
            }
            aa1 aa1Var = qVar.f12934c0;
            if (aa1Var != null && !aa1Var.f32534l) {
                arrayList.add(i51.h(5, i16, aa1Var));
                arrayList.add(i51.A(-1, null));
            }
            if (qVar.f12935d0 == null && j11 != null) {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i10 = 2;
                qVar.f12935d0 = oa1.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            } else {
                i10 = 2;
            }
            aa1 aa1Var2 = qVar.f12935d0;
            if (aa1Var2 != null && !aa1Var2.f32534l) {
                arrayList.add(i51.h(i10, i16, aa1Var2));
                arrayList.add(i51.A(-2, null));
            }
            if (!qVar.f12932b0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d11 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                jeVar6.d = j12;
                double d12 = j12 / 1.0E9d;
                long j13 = (long) (d12 * d11 * 100.0d);
                jeVar6.e = j13;
                if (qVar.f12941i0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d11;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    qVar.f12941i0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i12 = 6;
                    qVar.f12941i0.setMaximumFractionDigits(6);
                    qVar.f12941i0.setGroupingUsed(false);
                } else {
                    d = d11;
                    i12 = 6;
                }
                DecimalFormat decimalFormat2 = qVar.f12941i0;
                if (d12 > 1.5d) {
                    i12 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i12);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(me.f0("TON " + qVar.f12941i0.format(d12), qVar.T.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(qVar.S, indexOf, spannableStringBuilder.length(), 33);
                }
                qVar.T.setText(spannableStringBuilder);
                org.telegram.ui.Components.k6 k6Var = qVar.U;
                k6Var.setText("≈" + BillingController.getInstance().formatCurrency(j13, "USD"));
                jeVar6.f35248f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                jeVar.d = j14;
                jeVar.e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                jeVar.f35248f = "USD";
                jeVar2.f35245a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                jeVar2.d = j15;
                jeVar2.e = (long) ((j15 / 1.0E9d) * d * 100.0d);
                jeVar2.f35248f = "USD";
                qVar.f12932b0 = true;
                ph.d dVar = qVar.V;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar.setVisibility(i13);
            }
            if (qVar.f12932b0) {
                arrayList.add(i51.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(i51.u(jeVar6));
                arrayList.add(i51.u(jeVar));
                arrayList.add(i51.u(jeVar2));
                if (qVar.Z == null) {
                    qVar.Z = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new ah.b(qVar, R.string.BotMonetizationProceedsTONInfoLink, 7), qVar.resourceProvider), true);
                }
                arrayList.add(i51.A(-4, qVar.Z));
            }
            arrayList.add(i51.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(i51.k(qVar.R));
            if (qVar.f12930a0 == null) {
                if (MessagesController.getInstance(qVar.currentAccount).channelRevenueWithdrawalEnabled) {
                    i11 = R.string.BotMonetizationBalanceInfo;
                } else {
                    i11 = R.string.BotMonetizationBalanceInfoNotAvailable;
                }
                qVar.f12930a0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new d(qVar, 3)), true);
            }
            arrayList.add(i51.A(-5, qVar.f12930a0));
            if (!qVar.f12938f0 || !arrayList2.isEmpty()) {
                arrayList.add(i51.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList2.get(i18);
                    i18++;
                    int i19 = da.f12305a;
                    i51 J = i51.J(da.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.f25590q = true;
                    arrayList.add(J);
                }
                if (!qVar.f12938f0) {
                    arrayList.add(i51.o(1, 7));
                    arrayList.add(i51.o(2, 7));
                    arrayList.add(i51.o(3, 7));
                }
            }
            arrayList.add(i51.A(-6, null));
        }
    }

    public static void Z(q qVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10, TLObject tLObject) {
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
                    ConnectionsManager.getInstance(qVar.currentAccount).sendRequest(new TL_account.getPassword(), new i(qVar, twoStepVerificationActivity, z4, j10, 0), 8);
                    return;
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                qc.b0(tL_error);
                return;
            }
            twoStepVerificationActivity.o0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.j6.f19987j5;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
            linearLayout.addView(textView, k7.b6.n(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
            TextView textView2 = new TextView(activity);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, k7.b6.n(-1, -2));
                linearLayout2.addView(imageView, k7.b6.q(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, k7.b6.n(-2, -2));
                linearLayout2.addView(textView2, k7.b6.n(-1, -2));
            }
            LinearLayout h = kf.k0.h(activity, 0);
            linearLayout.addView(h, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i16, false), mode));
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
            if (LocaleController.isRTL) {
                h.addView(textView3, k7.b6.n(-1, -2));
                i15 = 5;
                h.addView(imageView2, k7.b6.q(-2, -2, 5));
            } else {
                i15 = 5;
                h.addView(imageView2, k7.b6.n(-2, -2));
                h.addView(textView3, k7.b6.n(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new h(qVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(activity);
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView4.setTextSize(1, 16.0f);
                if (!LocaleController.isRTL) {
                    i15 = 3;
                }
                textView4.setGravity(i15 | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            twoStepVerificationActivity.showDialog(alertDialog$Builder.f19478a);
            return;
        }
        twoStepVerificationActivity.o0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            ze.d.u(qVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            qVar.L = true;
            ze.d.u(qVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void a0(q qVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z4;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(qVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(qVar.currentAccount).putChats(starsStatus.chats, false);
            qVar.f12940h0 = starsStatus.next_offset;
            qVar.f12939g0.addAll(starsStatus.history);
            if (!starsStatus.history.isEmpty() && starsStatus.next_offset != null) {
                z4 = false;
            } else {
                z4 = true;
            }
            qVar.f12938f0 = z4;
        } else if (tL_error != null) {
            qc.b0(tL_error);
            qVar.f12938f0 = true;
        }
        qVar.f12936e0 = false;
        w51 w51Var = qVar.e.V2;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    public static void e0(q qVar) {
        int i10;
        if (!qVar.f12936e0 && !qVar.f12938f0 && qVar.f12940h0 != null) {
            qVar.f12936e0 = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(qVar.currentAccount).getInputPeer(qVar.f12931b);
            tL_payments_getStarsTransactions.offset = qVar.f12940h0;
            if (qVar.f12939g0.isEmpty()) {
                i10 = 5;
            } else {
                i10 = 20;
            }
            tL_payments_getStarsTransactions.limit = i10;
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new ff.a(qVar, 5));
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
        p pVar = new p(this, context);
        yn ynVar = new yn(context, null, false, null);
        this.d = ynVar;
        ynVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        yn ynVar2 = this.d;
        if (!this.inPreviewMode) {
            f10 = 50.0f;
        } else {
            f10 = 0.0f;
        }
        kVar.addView(ynVar2, 0, k7.b6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f12931b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.f12929a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        ai.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 2));
        yn ynVar3 = this.d;
        int i12 = org.telegram.ui.ActionBar.j6.Oi;
        ynVar3.i(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20275z8, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.f19881d6;
        kVar2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.C = new ia(context, this.currentAccount, false, this.f12931b, getClassGuid(), getResourceProvider());
        dg.u3 u3Var = new dg.u3(context, 1);
        this.E = u3Var;
        u3Var.setOrientation(1);
        this.E.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i13, getResourceProvider()));
        this.E.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.H = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.k6 k6Var2 = this.H;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        k6Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, getResourceProvider()));
        this.H.setTextSize(AndroidUtilities.dp(32.0f));
        this.H.setGravity(17);
        this.G = new RelativeSizeSpan(0.6770833f);
        this.E.addView(this.H, k7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.k6 k6Var3 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.I = k6Var3;
        k6Var3.setGravity(17);
        org.telegram.ui.Components.k6 k6Var4 = this.I;
        int i15 = org.telegram.ui.ActionBar.j6.f20256y6;
        k6Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, getResourceProvider()));
        this.I.setTextSize(AndroidUtilities.dp(14.0f));
        this.E.addView(this.I, k7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        m mVar = new m(this, context, 0);
        this.J = mVar;
        mVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.J.setLeftPadding(AndroidUtilities.dp(36.0f));
        n nVar = new n(context, 0);
        this.N = nVar;
        nVar.setFocusable(false);
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
        this.N.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20191uf));
        this.N.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20209vf));
        n nVar2 = this.N;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        nVar2.setGravity(i10);
        this.N.setOnFocusChangeListener(new cg.z(this, 2));
        this.N.addTextChangedListener(new dh.c(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, k7.b6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.N, k7.b6.o(-1, -2, 1.0f, 119));
        this.J.e(this.N);
        this.J.addView(linearLayout, k7.b6.e(-1, -2, 48));
        this.N.setOnEditorActionListener(new k(this, 0));
        this.E.addView(this.J, k7.b6.t(-1, -2, 1, 18, 14, 18, 2));
        this.J.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.F = linearLayout2;
        linearLayout2.setOrientation(0);
        o oVar = new o(0, context, getResourceProvider(), true);
        oVar.setRoundRadius(24);
        this.O = oVar;
        oVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.O.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final q f12724b;

            {
                this.f12724b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12724b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            q qVar = this.f12724b;
                            if (!qVar.V.K) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                c1.b bVar = new c1.b(27, qVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.W = 1;
                                twoStepVerificationActivity.Y = bVar;
                                qVar.V.setLoading(true);
                                twoStepVerificationActivity.s0(new e(qVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ph.d dVar = new ph.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.setEnabled(true);
        this.P.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.P.setOnClickListener(new cg.n(16, this, context));
        this.F.addView(this.O, k7.b6.o(-1, 48, 1.0f, 119));
        boolean z4 = this.f12933c;
        if (!z4) {
            this.F.addView(new Space(context), k7.b6.o(8, 48, 0.0f, 119));
            this.F.addView(this.P, k7.b6.o(-1, 48, 1.0f, 119));
        }
        this.E.addView(this.F, k7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        dg.u3 u3Var2 = new dg.u3(context, 2);
        this.R = u3Var2;
        u3Var2.setOrientation(1);
        this.R.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i13, this.resourceProvider));
        this.R.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.k6 k6Var5 = new org.telegram.ui.Components.k6(context, false, true, true);
        this.T = k6Var5;
        k6Var5.setTypeface(AndroidUtilities.bold());
        this.T.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, this.resourceProvider));
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.T, k7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.k6 k6Var6 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.U = k6Var6;
        k6Var6.setGravity(17);
        this.U.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, this.resourceProvider));
        this.U.setTextSize(AndroidUtilities.dp(14.0f));
        this.R.addView(this.U, k7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ph.d dVar2 = new ph.d(context, this.resourceProvider, true);
        this.V = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        ph.d dVar3 = this.V;
        if (z4) {
            i11 = R.string.MonetizationSelfWithdraw;
        } else {
            i11 = R.string.MonetizationWithdraw;
        }
        dVar3.g(LocaleController.getString(i11), false, true);
        this.V.setVisibility(8);
        this.V.setOnClickListener(new View.OnClickListener(this) {
            public final q f12724b;

            {
                this.f12724b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12724b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            q qVar = this.f12724b;
                            if (!qVar.V.K) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                c1.b bVar = new c1.b(27, qVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.W = 1;
                                twoStepVerificationActivity.Y = bVar;
                                qVar.V.setLoading(true);
                                twoStepVerificationActivity.s0(new e(qVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.R.addView(this.V, k7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        g61 g61Var = new g61(this, new dg.r1(this, 14), new h(this), new h(this));
        this.e = g61Var;
        g61Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7));
        this.e.o1();
        pVar.addView(this.e, k7.b6.c(-1.0f, -1));
        this.e.setOnScrollListener(new eg.f2(this, 6));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = pVar;
        return pVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f12931b) {
            g0();
        }
    }

    public final void g0() {
        wf.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(this.f12931b, false);
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2 = null;
        if (h == this.f12937f) {
            if (h == null) {
                tL_starsRevenueStatus = null;
            } else {
                tL_starsRevenueStatus = h.status;
            }
            if (tL_starsRevenueStatus == this.h) {
                return;
            }
        }
        this.f12937f = h;
        if (h != null) {
            tL_starsRevenueStatus2 = h.status;
        }
        this.h = tL_starsRevenueStatus2;
        if (h != null) {
            this.W = h.usd_rate;
            aa1 f02 = oa1.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.f12945n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f12945n.d.d.get(0) != null) {
                aa1 aa1Var = this.f12945n;
                aa1Var.h = true;
                ((wf.a) aa1Var.d.d.get(0)).f46604g = org.telegram.ui.ActionBar.j6.yj;
                this.f12945n.d.h = (float) ((1.0d / this.W) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            i0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            g61 g61Var = this.e;
            if (g61Var != null) {
                g61Var.V2.N(true);
            }
        }
    }

    public final void h0(boolean z4, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity != null && currentUser != null) {
            long j11 = this.f12931b;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new f(this, twoStepVerificationActivity, parentActivity, z4, j10));
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
            m mVar = this.J;
            if (j10 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            mVar.setVisibility(i11);
            if (this.L) {
                this.K = true;
                n nVar = this.N;
                long j11 = starsAmount.amount;
                this.M = j11;
                nVar.setText(Long.toString(j11));
                n nVar2 = this.N;
                nVar2.setSelection(nVar2.getText().length());
                this.K = false;
                o oVar = this.O;
                if (this.M > 0) {
                    z4 = true;
                }
                oVar.setEnabled(z4);
            }
            this.D = i10;
            d dVar = this.f12943k0;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            dVar.run();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void k0() {
        o oVar = this.O;
        if (oVar.T && !oVar.K) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.D > currentTime) {
                this.X = qc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.D - currentTime)))).j();
            } else if (this.M < getMessagesController().starsRevenueWithdrawalMin) {
                qc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new d(this, 1))).j();
            } else {
                long j10 = this.M;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                e3.f fVar = new e3.f(this, j10, twoStepVerificationActivity, 3);
                twoStepVerificationActivity.W = 1;
                twoStepVerificationActivity.Y = fVar;
                this.O.setLoading(true);
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
}
