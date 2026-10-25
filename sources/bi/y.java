package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.zq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.he;
import org.telegram.ui.i91;
import org.telegram.ui.ke;
import org.telegram.ui.mo;
import org.telegram.ui.w91;
public final class y extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final he E;
    public final he F;
    public final he G;
    public final he H;
    public final he I;
    public final CharSequence J;
    public cd K;
    public FrameLayout L;
    public FrameLayout M;
    public u91 N;
    public boolean O;
    public int P;
    public r Q;
    public LinearLayout R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.s6 T;
    public org.telegram.ui.Components.s6 U;
    public s V;
    public boolean W;
    public boolean X;
    public long Y;
    public t Z;
    public final int f5714a;
    public v f5715a0;
    public final long f5716b;
    public fi.d f5717b0;
    public final boolean f5718c;
    public final zq[] f5719c0;
    public po d;
    public r f5720d0;
    public r71 e;
    public RelativeSizeSpan f5721e0;
    public lw0 f5722f;
    public org.telegram.ui.Components.s6 f5723f0;
    public org.telegram.ui.Components.s6 f5724g0;
    public cc h;
    public fi.d f5725h0;
    public double f5726i0;
    public org.telegram.ui.Components.qc f5727j0;
    public CharSequence f5728k0;
    public CharSequence f5729l0;
    public CharSequence m0;
    public int f5730n;
    public boolean f5731n0;
    public i91 f5732o0;
    public i91 f5733p0;
    public DecimalFormat f5734q0;
    public View f5735r;
    public SpannableStringBuilder f5736r0;
    public oe.b f5737s;
    public final d f5738s0;
    public final int f5739t0;
    public TLRPC.TL_payments_starsRevenueStats v;
    public TLRPC.TL_starsRevenueStatus f5740w;
    public i91 f5741x;
    public final he f5742y;

    public y(int i10, long j10) {
        super(null);
        boolean z10;
        String string;
        this.f5730n = -1;
        this.f5742y = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.E = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.F = he.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.G = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.H = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.I = he.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        boolean z11 = false;
        this.W = false;
        this.X = true;
        this.f5719c0 = new zq[1];
        this.f5738s0 = new d(this, 0);
        this.f5739t0 = -1;
        this.f5714a = i10;
        this.f5716b = j10;
        if (j10 == getUserConfig().getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5718c = z10;
        if (i10 == 0) {
            m0.g(this.currentAccount).r(j10);
            if (!z10) {
                m0.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            m0 g7 = m0.g(this.currentAccount);
            Long l4 = (Long) g7.d.get(Long.valueOf(j10));
            g7.j(j10, (l4 == null || System.currentTimeMillis() - l4.longValue() > 30000) ? true : z11);
        }
        if (z10) {
            string = LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin);
        } else {
            string = LocaleController.getString(R.string.BotStarsWithdrawInfo);
        }
        this.J = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new d(this, 2)), true);
    }

    public static void V(y yVar) {
        yVar.showDialog(ke.I(yVar.getParentActivity(), yVar.resourceProvider, true));
    }

    public static void W(y yVar, t61 t61Var) {
        if (t61Var.H(xc.class)) {
            dd.g1(yVar.getParentActivity(), true, yVar.f5716b, yVar.currentAccount, (TL_stars.StarsTransaction) t61Var.G, yVar.getResourceProvider());
        } else if (t61Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            ke.M(yVar.getParentActivity(), yVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) t61Var.G, yVar.f5716b, yVar.resourceProvider);
        } else if (t61Var.d == 2) {
            yVar.presentFragment(new hi.d4(yVar.f5716b));
        }
    }

    public static void X(y yVar) {
        long j10;
        d dVar = yVar.f5738s0;
        org.telegram.ui.Components.qc.e();
        TLRPC.TL_payments_starsRevenueStats h = m0.g(yVar.currentAccount).h(yVar.f5716b, false);
        if (h == null) {
            j10 = 0;
        } else {
            j10 = h.status.available_balance.amount;
        }
        if (j10 < yVar.getMessagesController().starsRevenueWithdrawalMin) {
            yVar.X = true;
            yVar.Y = j10;
        } else {
            yVar.X = false;
            yVar.Y = yVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        yVar.W = true;
        yVar.Z.setText(Long.toString(yVar.Y));
        t tVar = yVar.Z;
        tVar.setSelection(tVar.getText().length());
        yVar.W = false;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
    }

    public static void Y(y yVar, Context context, View view) {
        if (view.isEnabled()) {
            fi.d dVar = yVar.f5717b0;
            if (!dVar.Q) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(yVar.currentAccount).getInputPeer(yVar.f5716b);
                ConnectionsManager.getInstance(yVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new j(0, yVar, context));
            }
        }
    }

    public static void Z(y yVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
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
                    ConnectionsManager.getInstance(yVar.currentAccount).sendRequest(new TL_account.getPassword(), new m(yVar, twoStepVerificationActivity, z10, j10, 0), 8);
                    return;
                }
                twoStepVerificationActivity.p0();
                twoStepVerificationActivity.finishFragment();
                org.telegram.ui.Components.wc.e0(tL_error);
                return;
            }
            twoStepVerificationActivity.p0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(activity);
            int i17 = org.telegram.ui.ActionBar.y6.f23462j5;
            org.telegram.ui.ActionBar.f7.V(textView, i17, null);
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
            linearLayout.addView(textView, gb1.r(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            org.telegram.ui.ActionBar.f7.t(imageView, i17, null, mode);
            TextView textView2 = new TextView(activity);
            org.telegram.ui.ActionBar.f7.V(textView2, i17, null);
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, gb1.r(-1, -2));
                linearLayout2.addView(imageView, gb1.u(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, gb1.r(-2, -2));
                linearLayout2.addView(textView2, gb1.r(-1, -2));
            }
            LinearLayout f7 = org.telegram.messenger.t.f(activity, 0);
            linearLayout.addView(f7, gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            org.telegram.ui.ActionBar.f7.t(imageView2, i17, null, mode);
            TextView textView3 = new TextView(activity);
            org.telegram.ui.ActionBar.f7.V(textView3, i17, null);
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText2, textView3);
            if (LocaleController.isRTL) {
                f7.addView(textView3, gb1.r(-1, -2));
                i15 = 5;
                f7.addView(imageView2, gb1.u(-2, -2, 5));
            } else {
                i15 = 5;
                f7.addView(imageView2, gb1.r(-2, -2));
                f7.addView(textView3, gb1.r(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new e(yVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(activity);
                org.telegram.ui.ActionBar.f7.V(textView4, i17, null);
                textView4.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i16 = i15;
                } else {
                    i16 = 3;
                }
                textView4.setGravity(i16 | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            twoStepVerificationActivity.showDialog(alertDialog$Builder.f22366a);
            return;
        }
        twoStepVerificationActivity.p0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            qf.d.t(yVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            yVar.X = true;
            qf.d.t(yVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void a0(y yVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        long j10;
        int i12;
        int i13;
        boolean z10;
        int i14;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i15;
        he heVar = yVar.I;
        he heVar2 = yVar.H;
        he heVar3 = yVar.F;
        he heVar4 = yVar.E;
        he heVar5 = yVar.f5742y;
        long j11 = yVar.f5716b;
        he heVar6 = yVar.G;
        boolean z11 = yVar.f5718c;
        int i16 = yVar.f5739t0;
        yVar.f5730n = -1;
        m0 g7 = m0.g(yVar.currentAccount);
        int i17 = yVar.f5714a;
        if (i17 == 0) {
            arrayList.add(t61.h(2, i16, yVar.f5741x));
            arrayList.add(t61.B(-1, null));
            arrayList.add(t61.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g7.h(j11, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                heVar5.f39985a = false;
                heVar5.f39989g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                heVar5.f39990i = starsAmount3;
                heVar5.h = "XTR";
                heVar5.f39988f = "USD";
                double d = yVar.f5726i0;
                z10 = z11;
                heVar5.f39991j = (long) (starsAmount3.amount * d * 100.0d);
                heVar4.f39985a = false;
                heVar4.f39989g = true;
                heVar4.f39990i = tL_starsRevenueStatus2.current_balance;
                heVar4.h = "XTR";
                heVar4.f39991j = (long) (starsAmount.amount * d * 100.0d);
                heVar4.f39988f = "USD";
                heVar3.f39985a = false;
                heVar3.f39989g = true;
                heVar3.f39990i = tL_starsRevenueStatus2.overall_revenue;
                heVar3.h = "XTR";
                heVar3.f39991j = (long) (starsAmount2.amount * d * 100.0d);
                heVar3.f39988f = "USD";
                yVar.r0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = yVar.R;
                if (h.status.withdrawal_enabled) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                linearLayout.setVisibility(i15);
            } else {
                z10 = z11;
            }
            arrayList.add(t61.v(heVar5));
            arrayList.add(t61.v(heVar4));
            arrayList.add(t61.v(heVar3));
            if (z10) {
                i14 = R.string.SelfStarsOverviewInfo;
            } else {
                i14 = R.string.BotStarsOverviewInfo;
            }
            arrayList.add(t61.B(-2, LocaleController.getString(i14)));
            arrayList.add(t61.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(t61.j(1, yVar.Q));
            arrayList.add(t61.B(-3, yVar.J));
            if (!z10) {
                if (yVar.getMessagesController().starrefConnectAllowed) {
                    arrayList.add(hi.g.a(2, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.uj, yVar.resourceProvider), R.drawable.filled_earn_stars, mo.e0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                    arrayList.add(t61.B(-4, null));
                }
                yVar.f5730n = arrayList.size();
                arrayList.add(t61.n(yVar.h, -2));
            }
        } else if (i17 == 1) {
            TLRPC.TL_payments_starsRevenueStats j12 = g7.j(j11, true);
            if (!z11) {
                if (yVar.f5728k0 == null) {
                    yVar.f5728k0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new d(yVar, 3), yVar.resourceProvider), true);
                }
                arrayList.add(t61.g(yVar.f5728k0));
            }
            if (yVar.f5732o0 == null && j12 != null) {
                i91 e02 = w91.e0(j12.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                yVar.f5732o0 = e02;
                if (e02 != null) {
                    e02.f40193n = true;
                }
            }
            i91 i91Var = yVar.f5732o0;
            if (i91Var != null && !i91Var.f40191l) {
                arrayList.add(t61.h(5, i16, i91Var));
                arrayList.add(t61.B(-1, null));
            }
            if (yVar.f5733p0 == null && j12 != null) {
                TL_stats.StatsGraph statsGraph = j12.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j12.usd_rate);
                }
                i10 = 2;
                yVar.f5733p0 = w91.e0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            } else {
                i10 = 2;
            }
            i91 i91Var2 = yVar.f5733p0;
            if (i91Var2 != null && !i91Var2.f40191l) {
                arrayList.add(t61.h(i10, i16, i91Var2));
                arrayList.add(t61.B(-2, null));
            }
            if (!yVar.f5731n0 && j12 != null && (tL_starsRevenueStatus = j12.status) != null) {
                double d10 = j12.usd_rate;
                long j13 = tL_starsRevenueStatus.available_balance.amount;
                heVar6.d = j13;
                double d11 = j13 / 1.0E9d;
                heVar6.e = (long) (d11 * d10 * 100.0d);
                if (yVar.f5734q0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    yVar.f5734q0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i12 = 6;
                    yVar.f5734q0.setMaximumFractionDigits(6);
                    yVar.f5734q0.setGroupingUsed(false);
                } else {
                    i12 = 6;
                }
                DecimalFormat decimalFormat2 = yVar.f5734q0;
                if (d11 > 1.5d) {
                    i12 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i12);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ke.K("TON " + yVar.f5734q0.format(d11), yVar.f5723f0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(yVar.f5721e0, indexOf, spannableStringBuilder.length(), 33);
                }
                yVar.f5723f0.setText(spannableStringBuilder);
                yVar.f5724g0.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
                heVar6.f39988f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j12.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                heVar2.d = j14;
                heVar2.e = (long) ((j14 / 1.0E9d) * d10 * 100.0d);
                heVar2.f39988f = "USD";
                heVar.f39985a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                heVar.d = j15;
                heVar.e = (long) ((j15 / 1.0E9d) * d10 * 100.0d);
                heVar.f39988f = "USD";
                yVar.f5731n0 = true;
                fi.d dVar = yVar.f5725h0;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar.setVisibility(i13);
            }
            if (yVar.f5731n0) {
                arrayList.add(t61.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(t61.v(heVar6));
                arrayList.add(t61.v(heVar2));
                arrayList.add(t61.v(heVar));
                if (yVar.f5729l0 == null) {
                    yVar.f5729l0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new ag.r0(yVar, R.string.BotMonetizationProceedsTONInfoLink, 2), yVar.resourceProvider), true);
                }
                arrayList.add(t61.B(-4, yVar.f5729l0));
            }
            arrayList.add(t61.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(t61.k(yVar.f5720d0));
            if (yVar.m0 == null) {
                if (MessagesController.getInstance(yVar.currentAccount).channelRevenueWithdrawalEnabled) {
                    i11 = R.string.BotMonetizationBalanceInfo;
                } else {
                    i11 = R.string.BotMonetizationBalanceInfoNotAvailable;
                }
                yVar.m0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new d(yVar, 4)), true);
            }
            arrayList.add(t61.B(-5, yVar.m0));
            yVar.f5730n = arrayList.size();
            arrayList.add(t61.n(yVar.h, -2));
        }
    }

    public static int j0(y yVar) {
        return yVar.currentAccount;
    }

    public static int k0(y yVar) {
        return yVar.currentAccount;
    }

    public static int n0(y yVar) {
        return yVar.currentAccount;
    }

    public static String s0(int i10) {
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
        FrameLayout frameLayout;
        cd cdVar;
        int i10;
        int i11;
        boolean z10;
        View view;
        boolean z11;
        View view2;
        boolean z12 = this.f5718c;
        int i12 = this.f5714a;
        if (i12 != 1 && z12) {
            this.f5722f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        } else {
            lw0 lw0Var = new lw0(context);
            this.f5722f = lw0Var;
            lw0Var.setCommonInsetsManagedExternally(true);
            this.f5722f.setGeometry(new b6.i(this, 7));
            lw0 lw0Var2 = this.f5722f;
            lw0Var2.getClass();
            this.h = new cc(lw0Var2, context, 24);
            frameLayout = this.f5722f;
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7));
        this.d = new po(context, null, false, getResourceProvider());
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f5716b));
        this.d.k(user, true);
        this.simpleActionBar.setTitle(UserObject.getUserName(user));
        if (i12 == 0) {
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 1));
        this.simpleActionBar.setBackground(null);
        if (i12 == 0 && this.f5722f != null) {
            cdVar = new cd(context, this.currentAccount, false, this.f5716b, getClassGuid(), getResourceProvider(), this.f5722f);
        } else {
            cdVar = null;
        }
        this.K = cdVar;
        if (i12 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.L = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.L.setClipToPadding(false);
            om0 om0Var = new om0(context, this.resourceProvider, this.f5722f);
            this.N = om0Var;
            om0Var.setAdapter(new w(this, context, om0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.M = frameLayout4;
            frameLayout4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            this.M.addView(om0Var.n(-2, true), gb1.i(-1, 48, 48));
            this.L.addView(om0Var, gb1.g(-1.0f, -1));
        } else if (cdVar != null) {
            this.N = cdVar.getViewPager();
            this.M = this.K.getTabsContainer();
        }
        r rVar = new r(context, 0);
        this.Q = rVar;
        rVar.setOrientation(1);
        r rVar2 = this.Q;
        int i13 = org.telegram.ui.ActionBar.y6.f23354d6;
        org.telegram.ui.ActionBar.f7.i(i13, rVar2, getResourceProvider());
        this.Q.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true);
        this.T = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.s6 s6Var2 = this.T;
        int i14 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i14, getResourceProvider());
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.T, gb1.x(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.U = s6Var3;
        s6Var3.setGravity(17);
        org.telegram.ui.Components.s6 s6Var4 = this.U;
        int i15 = org.telegram.ui.ActionBar.y6.f23746y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var4, i15, getResourceProvider());
        this.U.setTextSize(AndroidUtilities.dp(14.0f));
        this.Q.addView(this.U, gb1.h(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        s sVar = new s(this, context, 0);
        this.V = sVar;
        sVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.V.setLeftPadding(AndroidUtilities.dp(36.0f));
        t tVar = new t(context, 0);
        this.Z = tVar;
        tVar.setFocusable(false);
        org.telegram.ui.ActionBar.f7.V(this.Z, i14, getResourceProvider());
        this.Z.setCursorSize(AndroidUtilities.dp(20.0f));
        this.Z.setCursorWidth(1.5f);
        this.Z.setBackground(null);
        this.Z.setTextSize(1, 18.0f);
        this.Z.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.Z.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.Z.setInputType(2);
        this.Z.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.f7.D(this.Z, org.telegram.ui.ActionBar.y6.f23680uf, getResourceProvider());
        org.telegram.ui.ActionBar.f7.z(this.Z, org.telegram.ui.ActionBar.y6.f23698vf, getResourceProvider());
        t tVar2 = this.Z;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        tVar2.setGravity(i10);
        this.Z.setOnFocusChangeListener(new bh.j0(this, 1));
        this.Z.addTextChangedListener(new u(this, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, gb1.t(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Z, gb1.s(-1, -2, 1.0f, 119));
        this.V.e(this.Z);
        this.V.addView(linearLayout, gb1.i(-1, -2, 48));
        this.Z.setOnEditorActionListener(new o(this, 0));
        this.Q.addView(this.V, gb1.x(-1, -2, 1, 18, 14, 18, 2));
        this.V.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.R = linearLayout2;
        linearLayout2.setOrientation(0);
        v vVar = new v(0, context, getResourceProvider(), true);
        vVar.setRoundRadius(24);
        this.f5715a0 = vVar;
        vVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.f5715a0.i(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        this.f5715a0.setOnClickListener(new View.OnClickListener(this) {
            public final y f5216b;

            {
                this.f5216b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f5216b.u0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            y yVar = this.f5216b;
                            if (!yVar.f5725h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ai.f0 f0Var = new ai.f0(3, yVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f36302b0 = f0Var;
                                yVar.f5725h0.setLoading(true);
                                twoStepVerificationActivity.t0(new h(yVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f5717b0 = dVar;
        dVar.setEnabled(true);
        this.f5717b0.i(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.f5717b0.setOnClickListener(new q(0, this, context));
        this.R.addView(this.f5715a0, gb1.s(-1, 48, 1.0f, 119));
        if (!z12) {
            this.R.addView(new Space(context), gb1.s(8, 48, 0.0f, 119));
            this.R.addView(this.f5717b0, gb1.s(-1, 48, 1.0f, 119));
        }
        this.Q.addView(this.R, gb1.h(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        r rVar3 = new r(context, 1);
        this.f5720d0 = rVar3;
        rVar3.setOrientation(1);
        org.telegram.ui.ActionBar.f7.i(i13, this.f5720d0, this.resourceProvider);
        this.f5720d0.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var5 = new org.telegram.ui.Components.s6(context, false, true, true);
        this.f5723f0 = s6Var5;
        s6Var5.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Z(this.f5723f0, i14, this.resourceProvider);
        this.f5723f0.setTextSize(AndroidUtilities.dp(32.0f));
        this.f5723f0.setGravity(17);
        this.f5721e0 = new RelativeSizeSpan(0.6770833f);
        this.f5720d0.addView(this.f5723f0, gb1.x(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var6 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.f5724g0 = s6Var6;
        s6Var6.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(this.f5724g0, i15, this.resourceProvider);
        this.f5724g0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f5720d0.addView(this.f5724g0, gb1.h(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f5725h0 = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        fi.d dVar3 = this.f5725h0;
        if (z12) {
            i11 = R.string.MonetizationSelfWithdraw;
        } else {
            i11 = R.string.MonetizationWithdraw;
        }
        dVar3.i(LocaleController.getString(i11), false, true);
        this.f5725h0.setVisibility(8);
        this.f5725h0.setOnClickListener(new View.OnClickListener(this) {
            public final y f5216b;

            {
                this.f5216b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f5216b.u0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            y yVar = this.f5216b;
                            if (!yVar.f5725h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ai.f0 f0Var = new ai.f0(3, yVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f36302b0 = f0Var;
                                yVar.f5725h0.setLoading(true);
                                twoStepVerificationActivity.t0(new h(yVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f5720d0.addView(this.f5725h0, gb1.h(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        r71 r71Var = new r71(this, new ai.e(this, 2), new e(this), new e(this));
        this.e = r71Var;
        r71Var.u1();
        r71 r71Var2 = this.e;
        r71Var2.f32150g3.f29505r = false;
        r71Var2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        lw0 lw0Var3 = this.f5722f;
        if (lw0Var3 != null) {
            r71 r71Var3 = this.e;
            getParentActivity();
            ig.j0 j0Var = new ig.j0(5, lw0Var3, false);
            r71Var3.f32149f3 = j0Var;
            r71Var3.setLayoutManager(j0Var);
            this.f5722f.u(this.e, new e(this));
            z10 = true;
            if (i12 == 1) {
                view2 = this.L;
            } else {
                view2 = this.K;
            }
            this.f5722f.x(view2, this.N, new e(this));
            FrameLayout frameLayout5 = this.M;
            this.f5722f.y(frameLayout5);
            frameLayout5.setLayoutParams(gb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z10 = true;
            frameLayout2.addView(this.e, gb1.g(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().e(frameLayout2, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.f5735r = new View(getParentActivity());
        if (this.f5722f != null) {
            view = this.M;
        } else {
            view = this.simpleActionBar;
        }
        frameLayout2.addView(this.f5735r, frameLayout2.indexOfChild(view), gb1.i(-1, 0, 48));
        this.f5735r.setBackground(getBaseSimpleGlass().a(this.f5735r));
        oe.b bVar = new oe.b(0, new e(this), ds.h, 380L, false);
        this.f5737s = bVar;
        lw0 lw0Var4 = this.f5722f;
        if (lw0Var4 != null && lw0Var4.f30308e0) {
            z11 = z10;
        } else {
            z11 = false;
        }
        bVar.a(z11, false);
        if (this.f5722f != null) {
            getBaseSimpleGlass().h = this.f5722f;
            cd cdVar2 = this.K;
            if (cdVar2 != null) {
                cdVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.N);
            }
            getBaseSimpleGlass().f19424i = new g(0, this, new f(0, frameLayout2));
            FrameLayout frameLayout6 = this.M;
            eh.d c10 = getBaseSimpleGlass().f19421c.c(frameLayout6, null, false);
            c10.v(gh.c.m(this.resourceProvider));
            c10.w(AndroidUtilities.dp(9.66f));
            c10.x(AndroidUtilities.dp(18.0f));
            frameLayout6.setBackground(c10);
        }
        AndroidUtilities.removeFromParent(this.d.e);
        frameLayout2.addView(this.d.e, gb1.i(42, 42, 53));
        o0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f5716b) {
            p0();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        u91 u91Var = this.N;
        if (u91Var != null && u91Var.canScrollHorizontally(-1)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void o0() {
        if (this.e != null) {
            int i10 = 0;
            AndroidUtilities.setViewLayoutMargins(this.d.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.f13451b, AndroidUtilities.dp(6.0f), 0);
            r71 r71Var = this.e;
            i0.b bVar = this.mSystemInsets;
            oi.a.d(r71Var, bVar.f13451b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
            if (this.f5722f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                this.f5722f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                lw0 lw0Var = this.f5722f;
                lw0Var.B();
                lw0Var.requestLayout();
                lw0Var.invalidate();
            }
            if (this.f5735r != null) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f13451b;
                if (this.f5722f != null) {
                    i10 = AndroidUtilities.dp(44.0f);
                }
                int i11 = currentActionBarHeight + i10;
                ViewGroup.LayoutParams layoutParams = this.f5735r.getLayoutParams();
                if (layoutParams.height != i11) {
                    layoutParams.height = i11;
                    this.f5735r.setLayoutParams(layoutParams);
                }
                t0();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        p0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.O = true;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        o0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            po poVar = this.d;
            if (poVar != null) {
                poVar.i(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oi, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pi, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0() {
        boolean z10;
        lg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z11 = false;
        TLRPC.TL_payments_starsRevenueStats h = m0.g(this.currentAccount).h(this.f5716b, false);
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2 = null;
        if (h == this.v) {
            if (h == null) {
                tL_starsRevenueStatus = null;
            } else {
                tL_starsRevenueStatus = h.status;
            }
            if (tL_starsRevenueStatus == this.f5740w) {
                return;
            }
        }
        this.v = h;
        if (h != null) {
            tL_starsRevenueStatus2 = h.status;
        }
        this.f5740w = tL_starsRevenueStatus2;
        if (h != null) {
            this.f5726i0 = h.usd_rate;
            i91 e02 = w91.e0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.f5741x = e02;
            if (e02 != null && (bVar = e02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f5741x.d.d.get(0) != null) {
                i91 i91Var = this.f5741x;
                i91Var.h = true;
                ((lg.a) i91Var.d.d.get(0)).f17009g = org.telegram.ui.ActionBar.y6.yj;
                this.f5741x.d.h = (float) ((1.0d / this.f5726i0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            r0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            r71 r71Var = this.e;
            if (r71Var != null) {
                lw0 lw0Var = this.f5722f;
                if (lw0Var != null && lw0Var.f30308e0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j71 j71Var = r71Var.f32150g3;
                if (lw0Var == null) {
                    z11 = true;
                }
                j71Var.O(z11);
                if (z10) {
                    this.f5722f.a();
                }
            }
        }
    }

    public final void q0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity != null && currentUser != null) {
            long j11 = this.f5716b;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new k(this, twoStepVerificationActivity, parentActivity, z10, j10));
        }
    }

    public final void r0(TL_stars.StarsAmount starsAmount, int i10) {
        int i11;
        if (this.T != null && this.U != null) {
            long j10 = (long) (this.f5726i0 * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.W0(false, TextUtils.concat("XTR ", dd.I0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.S, indexOf, spannableStringBuilder.length(), 33);
            }
            this.T.setText(spannableStringBuilder);
            this.U.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            s sVar = this.V;
            if (j10 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            sVar.setVisibility(i11);
            if (this.X) {
                this.W = true;
                t tVar = this.Z;
                long j11 = starsAmount.amount;
                this.Y = j11;
                tVar.setText(Long.toString(j11));
                t tVar2 = this.Z;
                tVar2.setSelection(tVar2.getText().length());
                this.W = false;
                v vVar = this.f5715a0;
                if (this.Y > 0) {
                    z10 = true;
                }
                vVar.setEnabled(z10);
            }
            this.P = i10;
            d dVar = this.f5738s0;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            dVar.run();
        }
    }

    public final void t0() {
        float f7;
        View view = this.f5735r;
        if (view == null) {
            return;
        }
        oe.b bVar = this.f5737s;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        if (this.f5722f != null) {
            f10 = AndroidUtilities.dp(44.0f) * (-(1.0f - f7));
        }
        view.setTranslationY(f10);
    }

    public final void u0() {
        v vVar = this.f5715a0;
        if (vVar.f10687c0 && !vVar.Q) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.P > currentTime) {
                this.f5727j0 = org.telegram.ui.Components.wc.b0(this).R(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, s0(this.P - currentTime)))).j();
            } else if (this.Y < getMessagesController().starsRevenueWithdrawalMin) {
                org.telegram.ui.Components.wc.b0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new d(this, 1))).j();
            } else {
                long j10 = this.Y;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                i iVar = new i(this, j10, twoStepVerificationActivity, 0);
                twoStepVerificationActivity.Z = 1;
                twoStepVerificationActivity.f36302b0 = iVar;
                this.f5715a0.setLoading(true);
                twoStepVerificationActivity.t0(new h(this, twoStepVerificationActivity, 1));
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
