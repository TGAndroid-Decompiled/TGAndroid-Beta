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
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c51;
import org.telegram.ui.o41;
import org.telegram.ui.pn;
public final class z extends org.telegram.ui.ActionBar.f2 implements ls {
    public final org.telegram.ui.wd D;
    public final org.telegram.ui.wd E;
    public final org.telegram.ui.wd F;
    public final org.telegram.ui.wd G;
    public final org.telegram.ui.wd H;
    public final org.telegram.ui.wd I;
    public final SpannableStringBuilder J;
    public cd K;
    public FrameLayout L;
    public FrameLayout M;
    public v61 N;
    public boolean O;
    public int P;
    public t Q;
    public LinearLayout R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.j6 T;
    public org.telegram.ui.Components.j6 U;
    public u V;
    public boolean W;
    public boolean X;
    public long Y;
    public v Z;
    public final int f5108a;
    public w f5109a0;
    public final long f5110b;
    public fi.d f5111b0;
    public final boolean f5112c;
    public final wp[] f5113c0;
    public kn d;
    public t f5114d0;
    public q41 f5115e;
    public RelativeSizeSpan f5116e0;
    public ht0 f5117f;
    public org.telegram.ui.Components.j6 f5118f0;
    public org.telegram.ui.Components.j6 f5119g0;
    public ec h;
    public fi.d f5120h0;
    public double f5121i0;
    public org.telegram.ui.Components.cc f5122j0;
    public SpannableStringBuilder f5123k0;
    public SpannableStringBuilder f5124l0;
    public SpannableStringBuilder m0;
    public int f5125n;
    public boolean f5126n0;
    public o41 f5127o0;
    public o41 f5128p0;
    public DecimalFormat f5129q0;
    public View f5130r;
    public SpannableStringBuilder f5131r0;
    public te.a f5132s;
    public final d f5133s0;
    public final int f5134t0;
    public TLRPC.TL_payments_starsRevenueStats f5135w;
    public TLRPC.TL_starsRevenueStatus f5136x;
    public o41 f5137y;

    public z(int i7, long j3) {
        super(null);
        boolean z9;
        String M0;
        this.f5125n = -1;
        this.D = org.telegram.ui.wd.a("XTR", org.telegram.messenger.id.M0(2131752961, null));
        this.E = org.telegram.ui.wd.a("XTR", org.telegram.messenger.id.M0(2131752959, null));
        this.F = org.telegram.ui.wd.a("XTR", org.telegram.messenger.id.M0(2131752958, null));
        this.G = org.telegram.ui.wd.a("TON", org.telegram.messenger.id.M0(2131753033, null));
        this.H = org.telegram.ui.wd.a("TON", org.telegram.messenger.id.M0(2131753032, null));
        this.I = org.telegram.ui.wd.a("TON", org.telegram.messenger.id.M0(2131753031, null));
        boolean z10 = false;
        this.W = false;
        this.X = true;
        this.f5113c0 = new wp[1];
        this.f5133s0 = new d(this, 0);
        this.f5134t0 = -1;
        this.f5108a = i7;
        this.f5110b = j3;
        if (j3 == getUserConfig().e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f5112c = z9;
        if (i7 == 0) {
            n0.g(this.currentAccount).r(j3);
            if (!z9) {
                n0.g(this.currentAccount).l(j3);
            }
        } else if (i7 == 1) {
            n0 g10 = n0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, (l10 == null || System.currentTimeMillis() - l10.longValue() > 30000) ? true : z10);
        }
        if (z9) {
            M0 = org.telegram.messenger.id.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().R5);
        } else {
            M0 = org.telegram.messenger.id.M0(2131752957, null);
        }
        this.J = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new d(this, 2)), true);
    }

    public static void Z(z zVar) {
        zVar.showDialog(org.telegram.ui.zd.I(zVar.getParentActivity(), zVar.resourceProvider, true));
    }

    public static void a0(z zVar, x31 x31Var) {
        if (x31Var.H(xc.class)) {
            dd.k1(zVar.getParentActivity(), true, zVar.f5110b, zVar.currentAccount, (TL_stars.StarsTransaction) x31Var.G, zVar.getResourceProvider());
        } else if (x31Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            org.telegram.ui.zd.M(zVar.getParentActivity(), zVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) x31Var.G, zVar.f5110b, zVar.resourceProvider);
        } else if (x31Var.d == 2) {
            zVar.presentFragment(new hi.q3(zVar.f5110b));
        }
    }

    public static void b0(z zVar) {
        long j3;
        d dVar = zVar.f5133s0;
        org.telegram.ui.Components.cc.e();
        TLRPC.TL_payments_starsRevenueStats h = n0.g(zVar.currentAccount).h(zVar.f5110b, false);
        if (h == null) {
            j3 = 0;
        } else {
            j3 = h.status.available_balance.amount;
        }
        if (j3 < zVar.getMessagesController().R5) {
            zVar.X = true;
            zVar.Y = j3;
        } else {
            zVar.X = false;
            zVar.Y = zVar.getMessagesController().R5;
        }
        zVar.W = true;
        zVar.Z.setText(Long.toString(zVar.Y));
        v vVar = zVar.Z;
        vVar.setSelection(vVar.getText().length());
        zVar.W = false;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
    }

    public static void c0(z zVar, Context context, View view) {
        if (view.isEnabled()) {
            fi.d dVar = zVar.f5111b0;
            if (!dVar.Q) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = qp.s1(zVar.currentAccount).j1(zVar.f5110b);
                ConnectionsManager.getInstance(zVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new j(0, zVar, context));
            }
        }
    }

    public static void d0(z zVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9, long j3, TLObject tLObject) {
        int i7;
        int i10;
        int L;
        int i11;
        int i12;
        int L2;
        int i13;
        int i14;
        int i15;
        if (tL_error != null) {
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(zVar.currentAccount).sendRequest(new TL_account.getPassword(), new m(zVar, twoStepVerificationActivity, z9, j3), 8);
                    return;
                }
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                org.telegram.ui.Components.hc.d0(tL_error);
                return;
            }
            twoStepVerificationActivity.t0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String M0 = org.telegram.messenger.id.M0(2131751298, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.k6.f27960j5;
            org.telegram.ui.ActionBar.r6.V(textView, i16, null);
            textView.setTextSize(1, 16.0f);
            if (org.telegram.messenger.id.f23157a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131742867, null)));
            linearLayout.addView(textView, c8.ha.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231623);
            if (org.telegram.messenger.id.f23157a0) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i10 = 0;
            }
            int L3 = org.telegram.messenger.g0.L(9.0f);
            if (org.telegram.messenger.id.f23157a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(11.0f);
            }
            imageView.setPadding(i10, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView, i16, null, mode);
            TextView textView2 = new TextView(activity);
            org.telegram.ui.ActionBar.r6.V(textView2, i16, null);
            textView2.setTextSize(1, 16.0f);
            if (org.telegram.messenger.id.f23157a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751301, null)));
            if (org.telegram.messenger.id.f23157a0) {
                linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, c8.ha.o(-2, -2));
                linearLayout2.addView(textView2, c8.ha.o(-1, -2));
            }
            LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
            linearLayout.addView(e10, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(activity);
            imageView2.setImageResource(2131231623);
            if (org.telegram.messenger.id.f23157a0) {
                i12 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i12 = 0;
            }
            int L4 = org.telegram.messenger.g0.L(9.0f);
            if (org.telegram.messenger.id.f23157a0) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(11.0f);
            }
            imageView2.setPadding(i12, L4, L2, 0);
            org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, mode);
            TextView textView3 = new TextView(activity);
            org.telegram.ui.ActionBar.r6.V(textView3, i16, null);
            textView3.setTextSize(1, 16.0f);
            if (org.telegram.messenger.id.f23157a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751300, null)));
            if (org.telegram.messenger.id.f23157a0) {
                e10.addView(textView3, c8.ha.o(-1, -2));
                i14 = 5;
                e10.addView(imageView2, c8.ha.r(-2, -2, 5));
            } else {
                i14 = 5;
                e10.addView(imageView2, c8.ha.o(-2, -2));
                e10.addView(textView3, c8.ha.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751292, null), new e(zVar));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            } else {
                TextView textView4 = new TextView(activity);
                org.telegram.ui.ActionBar.r6.V(textView4, i16, null);
                textView4.setTextSize(1, 16.0f);
                if (org.telegram.messenger.id.f23157a0) {
                    i15 = i14;
                } else {
                    i15 = 3;
                }
                org.telegram.messenger.k5.m(textView4, i15 | 48, null, 2131751299);
                linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747832, null), null);
            }
            twoStepVerificationActivity.showDialog(u1Var);
            return;
        }
        twoStepVerificationActivity.t0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            vf.c.v(zVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url, false);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            zVar.X = true;
            vf.c.v(zVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url, false);
        }
    }

    public static void e0(z zVar, ArrayList arrayList) {
        int i7;
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        long j3;
        int i11;
        int i12;
        boolean z9;
        int i13;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i14;
        org.telegram.ui.wd wdVar = zVar.I;
        org.telegram.ui.wd wdVar2 = zVar.H;
        org.telegram.ui.wd wdVar3 = zVar.F;
        org.telegram.ui.wd wdVar4 = zVar.E;
        org.telegram.ui.wd wdVar5 = zVar.D;
        long j10 = zVar.f5110b;
        org.telegram.ui.wd wdVar6 = zVar.G;
        boolean z10 = zVar.f5112c;
        int i15 = zVar.f5134t0;
        zVar.f5125n = -1;
        n0 g10 = n0.g(zVar.currentAccount);
        int i16 = zVar.f5108a;
        if (i16 == 0) {
            arrayList.add(x31.h(2, i15, zVar.f5137y));
            arrayList.add(x31.B(-1, null));
            arrayList.add(x31.b(org.telegram.messenger.id.M0(2131752962, null)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                wdVar5.f51064a = false;
                wdVar5.f51069g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                wdVar5.f51070i = starsAmount3;
                wdVar5.h = "XTR";
                wdVar5.f51068f = "USD";
                z9 = z10;
                double d = zVar.f5121i0;
                wdVar5.f51071j = (long) (starsAmount3.amount * d * 100.0d);
                wdVar4.f51064a = false;
                wdVar4.f51069g = true;
                wdVar4.f51070i = tL_starsRevenueStatus2.current_balance;
                wdVar4.h = "XTR";
                wdVar4.f51071j = (long) (starsAmount.amount * d * 100.0d);
                wdVar4.f51068f = "USD";
                wdVar3.f51064a = false;
                wdVar3.f51069g = true;
                wdVar3.f51070i = tL_starsRevenueStatus2.overall_revenue;
                wdVar3.h = "XTR";
                wdVar3.f51071j = (long) (starsAmount2.amount * d * 100.0d);
                wdVar3.f51068f = "USD";
                zVar.v0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = zVar.R;
                if (h.status.withdrawal_enabled) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                linearLayout.setVisibility(i14);
            } else {
                z9 = z10;
            }
            arrayList.add(x31.v(wdVar5));
            arrayList.add(x31.v(wdVar4));
            arrayList.add(x31.v(wdVar3));
            if (z9) {
                i13 = 2131745648;
            } else {
                i13 = 2131752960;
            }
            arrayList.add(x31.B(-2, org.telegram.messenger.id.M0(i13, null)));
            arrayList.add(x31.b(org.telegram.messenger.id.M0(2131752972, null)));
            arrayList.add(x31.j(1, zVar.Q));
            arrayList.add(x31.B(-3, zVar.J));
            if (!z9) {
                if (zVar.getMessagesController().f24792g6) {
                    arrayList.add(hi.f.i(2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, zVar.resourceProvider), pn.i0(org.telegram.messenger.id.M0(2131753145, null)), org.telegram.messenger.id.M0(2131753146, null)));
                    arrayList.add(x31.B(-4, null));
                }
                zVar.f5125n = arrayList.size();
                arrayList.add(x31.n(zVar.h, -2));
            }
        } else if (i16 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z10) {
                if (zVar.f5123k0 == null) {
                    zVar.f5123k0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131753045, 50), -1, 3, new d(zVar, 3), zVar.resourceProvider), true);
                }
                arrayList.add(x31.g(zVar.f5123k0));
            }
            if (zVar.f5127o0 == null && j11 != null) {
                o41 i02 = c51.i0(j11.top_hours_graph, org.telegram.messenger.id.M0(2131753047, null), 0, false);
                zVar.f5127o0 = i02;
                if (i02 != null) {
                    i02.f48264n = true;
                }
            }
            o41 o41Var = zVar.f5127o0;
            if (o41Var != null && !o41Var.f48262l) {
                arrayList.add(x31.h(5, i15, o41Var));
                arrayList.add(x31.B(-1, null));
            }
            if (zVar.f5128p0 == null && j11 != null) {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i7 = 2;
                zVar.f5128p0 = c51.i0(statsGraph, org.telegram.messenger.id.M0(2131753046, null), 2, false);
            } else {
                i7 = 2;
            }
            o41 o41Var2 = zVar.f5128p0;
            if (o41Var2 != null && !o41Var2.f48262l) {
                arrayList.add(x31.h(i7, i15, o41Var2));
                arrayList.add(x31.B(-2, null));
            }
            if (!zVar.f5126n0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d2 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                wdVar6.d = j12;
                double d10 = j12 / 1.0E9d;
                wdVar6.f51067e = (long) (d10 * d2 * 100.0d);
                if (zVar.f5129q0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    zVar.f5129q0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    zVar.f5129q0.setMaximumFractionDigits(6);
                    zVar.f5129q0.setGroupingUsed(false);
                } else {
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = zVar.f5129q0;
                if (d10 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.ui.zd.K("TON " + zVar.f5129q0.format(d10), zVar.f5118f0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(zVar.f5116e0, indexOf, spannableStringBuilder.length(), 33);
                }
                zVar.f5118f0.setText(spannableStringBuilder);
                zVar.f5119g0.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
                wdVar6.f51068f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                wdVar2.d = j13;
                wdVar2.f51067e = (long) ((j13 / 1.0E9d) * d2 * 100.0d);
                wdVar2.f51068f = "USD";
                wdVar.f51064a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                wdVar.d = j14;
                wdVar.f51067e = (long) ((j14 / 1.0E9d) * d2 * 100.0d);
                wdVar.f51068f = "USD";
                zVar.f5126n0 = true;
                fi.d dVar = zVar.f5120h0;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                dVar.setVisibility(i12);
            }
            if (zVar.f5126n0) {
                arrayList.add(x31.b(org.telegram.messenger.id.M0(2131753034, null)));
                arrayList.add(x31.v(wdVar6));
                arrayList.add(x31.v(wdVar2));
                arrayList.add(x31.v(wdVar));
                if (zVar.f5124l0 == null) {
                    zVar.f5124l0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131753030, null), -1, 3, new d(zVar, 4), zVar.resourceProvider), true);
                }
                arrayList.add(x31.B(-4, zVar.f5124l0));
            }
            arrayList.add(x31.b(org.telegram.messenger.id.M0(2131753051, null)));
            arrayList.add(x31.k(zVar.f5114d0));
            if (zVar.m0 == null) {
                if (qp.s1(zVar.currentAccount).I5) {
                    i10 = 2131753050;
                } else {
                    i10 = 2131753048;
                }
                zVar.m0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(i10, null), -1, 3, new d(zVar, 5), null), true);
            }
            arrayList.add(x31.B(-5, zVar.m0));
            zVar.f5125n = arrayList.size();
            arrayList.add(x31.n(zVar.h, -2));
        }
    }

    public static int n0(z zVar) {
        return zVar.currentAccount;
    }

    public static int o0(z zVar) {
        return zVar.currentAccount;
    }

    public static int r0(z zVar) {
        return zVar.currentAccount;
    }

    public static String w0(int i7) {
        int i10 = i7 / 86400;
        int i11 = i7 - (86400 * i10);
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
        Locale locale = Locale.ENGLISH;
        return org.telegram.messenger.id.a0(null, null, 2131747323, String.format(locale, "%02d", Integer.valueOf(i10)), String.format(locale, "%02d", Integer.valueOf(i12)), String.format(locale, "%02d", Integer.valueOf(i14)));
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        cd cdVar;
        int i7;
        int i10;
        boolean z9;
        View view;
        boolean z10;
        View view2;
        boolean z11 = this.f5112c;
        int i11 = this.f5108a;
        if (i11 != 1 && z11) {
            this.f5117f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        } else {
            ht0 ht0Var = new ht0(context);
            this.f5117f = ht0Var;
            ht0Var.setCommonInsetsManagedExternally(true);
            this.f5117f.setGeometry(new aa.n(this, 6));
            ht0 ht0Var2 = this.f5117f;
            ht0Var2.getClass();
            this.h = new ec(25, context, ht0Var2);
            frameLayout = this.f5117f;
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27796a7));
        this.d = new kn(context, null, false, getResourceProvider());
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f5110b));
        this.d.k(a22, true);
        this.simpleActionBar.setTitle(t10.p(a22));
        if (i11 == 0) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.M0(2131752949, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.M0(2131752948, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s(this, 0));
        this.simpleActionBar.setBackground(null);
        if (i11 == 0 && this.f5117f != null) {
            cdVar = new cd(context, this.currentAccount, false, this.f5110b, getClassGuid(), getResourceProvider(), this.f5117f);
        } else {
            cdVar = null;
        }
        this.K = cdVar;
        if (i11 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.L = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.L.setClipToPadding(false);
            rj0 rj0Var = new rj0(context, this.resourceProvider, this.f5117f);
            this.N = rj0Var;
            rj0Var.setAdapter(new x(this, context, rj0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.M = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            this.M.addView(rj0Var.n(-2, true), c8.ha.e(-1, 48, 48));
            this.L.addView(rj0Var, c8.ha.c(-1.0f, -1));
        } else if (cdVar != null) {
            this.N = cdVar.getViewPager();
            this.M = this.K.getTabsContainer();
        }
        t tVar = new t(context, 0);
        this.Q = tVar;
        tVar.setOrientation(1);
        t tVar2 = this.Q;
        int i12 = org.telegram.ui.ActionBar.k6.f27852d6;
        org.telegram.ui.ActionBar.r6.i(i12, tVar2, getResourceProvider());
        this.Q.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.T = j6Var;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.j6 j6Var2 = this.T;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i13, getResourceProvider());
        this.T.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.T, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.U = j6Var3;
        j6Var3.setGravity(17);
        org.telegram.ui.Components.j6 j6Var4 = this.U;
        int i14 = org.telegram.ui.ActionBar.k6.f28244y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var4, i14, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.Q.addView(this.U, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        u uVar = new u(0, context, this);
        this.V = uVar;
        uVar.setText(org.telegram.messenger.id.M0(2131752953, null));
        this.V.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        v vVar = new v(context, 0);
        this.Z = vVar;
        vVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.V(this.Z, i13, getResourceProvider());
        this.Z.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.Z.setCursorWidth(1.5f);
        this.Z.setBackground(null);
        this.Z.setTextSize(1, 18.0f);
        this.Z.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        this.Z.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        this.Z.setInputType(2);
        this.Z.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.D(this.Z, org.telegram.ui.ActionBar.k6.f27952ig, getResourceProvider());
        org.telegram.ui.ActionBar.r6.z(this.Z, org.telegram.ui.ActionBar.k6.f27971jg, getResourceProvider());
        v vVar2 = this.Z;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        vVar2.setGravity(i7);
        this.Z.setOnFocusChangeListener(new n(this, 0));
        this.Z.addTextChangedListener(new ah.j(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232752);
        linearLayout.addView(imageView, c8.ha.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Z, c8.ha.p(-1, -2, 1.0f, 119));
        this.V.e(this.Z);
        this.V.addView(linearLayout, c8.ha.e(-1, -2, 48));
        this.Z.setOnEditorActionListener(new p(this, 0));
        this.Q.addView(this.V, c8.ha.t(-1, -2, 1, 18, 14, 18, 2));
        this.V.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.R = linearLayout2;
        linearLayout2.setOrientation(0);
        w wVar = new w(0, context, getResourceProvider(), true);
        wVar.setRoundRadius(24);
        this.f5109a0 = wVar;
        wVar.setEnabled(qp.s1(this.currentAccount).I5);
        this.f5109a0.i(org.telegram.messenger.id.M0(2131752969, null), false, true);
        this.f5109a0.setOnClickListener(new View.OnClickListener(this) {
            public final z f4549b;

            {
                this.f4549b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f4549b.y0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            z zVar = this.f4549b;
                            if (!zVar.f5120h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ab.g gVar = new ab.g(4, zVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f42055b0 = gVar;
                                zVar.f5120h0.setLoading(true);
                                twoStepVerificationActivity.x0(new h(zVar, twoStepVerificationActivity, 0));
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
        this.f5111b0 = dVar;
        dVar.setEnabled(true);
        this.f5111b0.i(org.telegram.messenger.id.M0(2131748375, null), false, true);
        this.f5111b0.setOnClickListener(new r(0, this, context));
        this.R.addView(this.f5109a0, c8.ha.p(-1, 48, 1.0f, 119));
        if (!z11) {
            this.R.addView(new Space(context), c8.ha.p(8, 48, 0.0f, 119));
            this.R.addView(this.f5111b0, c8.ha.p(-1, 48, 1.0f, 119));
        }
        this.Q.addView(this.R, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        t tVar3 = new t(context, 1);
        this.f5114d0 = tVar3;
        tVar3.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i12, this.f5114d0, this.resourceProvider);
        this.f5114d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.j6 j6Var5 = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f5118f0 = j6Var5;
        j6Var5.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(this.f5118f0, i13, this.resourceProvider);
        this.f5118f0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.f5118f0.setGravity(17);
        this.f5116e0 = new RelativeSizeSpan(0.6770833f);
        this.f5114d0.addView(this.f5118f0, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var6 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f5119g0 = j6Var6;
        j6Var6.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(this.f5119g0, i14, this.resourceProvider);
        this.f5119g0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f5114d0.addView(this.f5119g0, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f5120h0 = dVar2;
        dVar2.setEnabled(qp.s1(this.currentAccount).I5);
        fi.d dVar3 = this.f5120h0;
        if (z11) {
            i10 = 2131748376;
        } else {
            i10 = 2131748352;
        }
        dVar3.i(org.telegram.messenger.id.M0(i10, null), false, true);
        this.f5120h0.setVisibility(8);
        this.f5120h0.setOnClickListener(new View.OnClickListener(this) {
            public final z f4549b;

            {
                this.f4549b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f4549b.y0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            z zVar = this.f4549b;
                            if (!zVar.f5120h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ab.g gVar = new ab.g(4, zVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f42055b0 = gVar;
                                zVar.f5120h0.setLoading(true);
                                twoStepVerificationActivity.x0(new h(zVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f5114d0.addView(this.f5120h0, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        q41 q41Var = new q41(this, new ai.e(this, 1), new e(this), new a3.l(this, 21));
        this.f5115e = q41Var;
        q41Var.r1();
        q41 q41Var2 = this.f5115e;
        q41Var2.f37190f3.f35528r = false;
        q41Var2.setCaptureSectionsDecoratorAllowed(true);
        this.f5115e.setClipToPadding(false);
        this.f5115e.setOverScrollMode(0);
        ht0 ht0Var3 = this.f5117f;
        if (ht0Var3 != null) {
            q41 q41Var3 = this.f5115e;
            getParentActivity();
            jg.i0 i0Var = new jg.i0(5, ht0Var3, false);
            q41Var3.f37189e3 = i0Var;
            q41Var3.setLayoutManager(i0Var);
            this.f5117f.u(this.f5115e, new e(this));
            z9 = true;
            if (i11 == 1) {
                view2 = this.L;
            } else {
                view2 = this.K;
            }
            this.f5117f.x(view2, this.N, new e(this));
            FrameLayout frameLayout5 = this.M;
            this.f5117f.y(frameLayout5);
            frameLayout5.setLayoutParams(c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z9 = true;
            frameLayout2.addView(this.f5115e, c8.ha.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.f5115e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.f5130r = new View(getParentActivity());
        if (this.f5117f != null) {
            view = this.M;
        } else {
            view = this.simpleActionBar;
        }
        frameLayout2.addView(this.f5130r, frameLayout2.indexOfChild(view), c8.ha.e(-1, 0, 48));
        this.f5130r.setBackground(getBaseSimpleGlass().a(this.f5130r));
        te.a aVar = new te.a(0, new e(this), xq.h, 380L, false);
        this.f5132s = aVar;
        ht0 ht0Var4 = this.f5117f;
        if (ht0Var4 != null && ht0Var4.f34347e0) {
            z10 = z9;
        } else {
            z10 = false;
        }
        aVar.a(z10, false);
        if (this.f5117f != null) {
            getBaseSimpleGlass().f21030n = this.f5117f;
            cd cdVar2 = this.K;
            if (cdVar2 != null) {
                cdVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.N);
            }
            getBaseSimpleGlass().f21031o = new g(0, this, new f(0, frameLayout2));
            FrameLayout frameLayout6 = this.M;
            fh.g c10 = getBaseSimpleGlass().f21021c.c(frameLayout6, null, false);
            c10.p(c8.g0.m(this.resourceProvider));
            c10.q(org.telegram.messenger.g0.L(9.66f));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            frameLayout6.setBackground(c10);
        }
        org.telegram.messenger.g0.E2(this.d.f35367e);
        frameLayout2.addView(this.d.f35367e, c8.ha.e(42, 42, 53));
        s0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.C3 && ((Long) objArr[0]).longValue() == this.f5110b) {
            t0();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false)) <= 0.721f) {
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
        v61 v61Var = this.N;
        if (v61Var != null && v61Var.canScrollHorizontally(-1)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.C3);
        t0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.O = true;
        qs.f(this.currentAccount).n(this, qs.C3);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        s0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            kn knVar = this.d;
            if (knVar != null) {
                knVar.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Cj, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dj, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0() {
        if (this.f5115e != null) {
            int i7 = 0;
            org.telegram.messenger.g0.B3(this.d.f35367e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15121b, org.telegram.messenger.g0.L(6.0f), 0);
            q41 q41Var = this.f5115e;
            i0.b bVar = this.mSystemInsets;
            oi.a.e(q41Var, bVar.f15121b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
            if (this.f5117f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5115e.getLayoutParams();
                this.f5117f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                ht0 ht0Var = this.f5117f;
                ht0Var.B();
                ht0Var.requestLayout();
                ht0Var.invalidate();
            }
            if (this.f5130r != null) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15121b;
                if (this.f5117f != null) {
                    i7 = org.telegram.messenger.g0.L(44.0f);
                }
                int i10 = currentActionBarHeight + i7;
                ViewGroup.LayoutParams layoutParams = this.f5130r.getLayoutParams();
                if (layoutParams.height != i10) {
                    layoutParams.height = i10;
                    this.f5130r.setLayoutParams(layoutParams);
                }
                x0();
            }
        }
    }

    public final void t0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z9;
        mg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        boolean z10 = false;
        TLRPC.TL_payments_starsRevenueStats h = n0.g(this.currentAccount).h(this.f5110b, false);
        if (h == this.f5135w) {
            if (h == null) {
                tL_starsRevenueStatus2 = null;
            } else {
                tL_starsRevenueStatus2 = h.status;
            }
            if (tL_starsRevenueStatus2 == this.f5136x) {
                return;
            }
        }
        this.f5135w = h;
        if (h == null) {
            tL_starsRevenueStatus = null;
        } else {
            tL_starsRevenueStatus = h.status;
        }
        this.f5136x = tL_starsRevenueStatus;
        if (h != null) {
            this.f5121i0 = h.usd_rate;
            o41 i02 = c51.i0(h.revenue_graph, org.telegram.messenger.id.M0(2131752963, null), 2, false);
            this.f5137y = i02;
            if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f5137y.d.d.get(0) != null) {
                o41 o41Var = this.f5137y;
                o41Var.h = true;
                ((mg.a) o41Var.d.d.get(0)).f20021g = org.telegram.ui.ActionBar.k6.mk;
                this.f5137y.d.h = (float) ((1.0d / this.f5121i0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            v0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            q41 q41Var = this.f5115e;
            if (q41Var != null) {
                ht0 ht0Var = this.f5117f;
                if (ht0Var != null && ht0Var.f34347e0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                l41 l41Var = q41Var.f37190f3;
                if (ht0Var == null) {
                    z10 = true;
                }
                l41Var.O(z10);
                if (z9) {
                    this.f5117f.a();
                }
            }
        }
    }

    public final void u0(boolean z9, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f10 = p10.i(this.currentAccount).f();
        if (parentActivity != null && f10 != null) {
            long j10 = this.f5110b;
            if (z9) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = qp.s1(this.currentAccount).j1(j10);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = j3;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = qp.s1(this.currentAccount).j1(j10);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new k(this, twoStepVerificationActivity, parentActivity, z9, j3));
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(TL_stars.StarsAmount starsAmount, int i7) {
        int i10;
        if (this.T != null && this.U != null) {
            long j3 = (long) (this.f5121i0 * starsAmount.amount * 100.0d);
            boolean z9 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.a1(false, TextUtils.concat("XTR ", dd.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.S, indexOf, spannableStringBuilder.length(), 33);
            }
            this.T.setText(spannableStringBuilder);
            this.U.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
            u uVar = this.V;
            if (j3 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            uVar.setVisibility(i10);
            if (this.X) {
                this.W = true;
                v vVar = this.Z;
                long j10 = starsAmount.amount;
                this.Y = j10;
                vVar.setText(Long.toString(j10));
                v vVar2 = this.Z;
                vVar2.setSelection(vVar2.getText().length());
                this.W = false;
                w wVar = this.f5109a0;
                if (this.Y > 0) {
                    z9 = true;
                }
                wVar.setEnabled(z9);
            }
            this.P = i7;
            d dVar = this.f5133s0;
            org.telegram.messenger.g0.r(dVar);
            dVar.run();
        }
    }

    public final void x0() {
        float f10;
        View view = this.f5130r;
        if (view == null) {
            return;
        }
        te.a aVar = this.f5132s;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f55487e;
        }
        if (this.f5117f != null) {
            f11 = org.telegram.messenger.g0.L(44.0f) * (-(1.0f - f10));
        }
        view.setTranslationY(f11);
    }

    public final void y0() {
        w wVar = this.f5109a0;
        if (wVar.f11752c0 && !wVar.Q) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.P > currentTime) {
                this.f5122j0 = org.telegram.ui.Components.hc.a0(this).Q(2131624291, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131752952, w0(this.P - currentTime)))).j();
            } else if (this.Y < getMessagesController().R5) {
                org.telegram.ui.Components.hc.a0(this).M(getParentActivity().getResources().getDrawable(2131232752).mutate(), org.telegram.messenger.g0.U2(org.telegram.messenger.id.G((int) getMessagesController().R5, "BotStarsWithdrawMinLimit", new Object[0]), new d(this, 1))).j();
            } else {
                long j3 = this.Y;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                i iVar = new i(this, j3, twoStepVerificationActivity, 0);
                twoStepVerificationActivity.Z = 1;
                twoStepVerificationActivity.f42055b0 = iVar;
                this.f5109a0.setLoading(true);
                twoStepVerificationActivity.x0(new h(this, twoStepVerificationActivity, 1));
            }
        }
    }
}
