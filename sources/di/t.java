package di;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.l41;
import org.telegram.ui.qn;
import org.telegram.ui.ud;
import org.telegram.ui.xd;
import org.telegram.ui.z41;
public final class t extends org.telegram.ui.ActionBar.e2 implements is {
    public final ud E;
    public final ud F;
    public final ud G;
    public final ud H;
    public final ud I;
    public final ud J;
    public final SpannableStringBuilder K;
    public kb L;
    public FrameLayout M;
    public FrameLayout N;
    public w61 O;
    public boolean P;
    public int Q;
    public ai.r2 R;
    public LinearLayout S;
    public RelativeSizeSpan T;
    public org.telegram.ui.Components.h6 U;
    public org.telegram.ui.Components.h6 V;
    public p W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final int f9411a;
    public q f9412a0;
    public final long f9413b;
    public bi.s f9414b0;
    public final boolean f9415c;
    public hi.d f9416c0;
    public sn d;
    public final eq[] f9417d0;
    public u41 f9418e;
    public ai.r2 f9419e0;
    public it0 f9420f;
    public RelativeSizeSpan f9421f0;
    public org.telegram.ui.Components.h6 f9422g0;
    public bi.o2 h;
    public org.telegram.ui.Components.h6 f9423h0;
    public hi.d f9424i0;
    public double f9425j0;
    public org.telegram.ui.Components.xb f9426k0;
    public SpannableStringBuilder f9427l0;
    public SpannableStringBuilder m0;
    public int f9428n;
    public SpannableStringBuilder f9429n0;
    public boolean f9430o0;
    public l41 f9431p0;
    public l41 f9432q0;
    public View f9433r;
    public DecimalFormat f9434r0;
    public te.a f9435s;
    public SpannableStringBuilder f9436s0;
    public final c f9437t0;
    public final int f9438u0;
    public TLRPC.TL_payments_starsRevenueStats f9439w;
    public TLRPC.TL_starsRevenueStatus f9440x;
    public l41 f9441y;

    public t(int i7, long j3) {
        super(null);
        boolean z10;
        String M0;
        this.f9428n = -1;
        this.E = ud.a("XTR", hd.M0(2131752961, null));
        this.F = ud.a("XTR", hd.M0(2131752959, null));
        this.G = ud.a("XTR", hd.M0(2131752958, null));
        this.H = ud.a("TON", hd.M0(2131753033, null));
        this.I = ud.a("TON", hd.M0(2131753032, null));
        this.J = ud.a("TON", hd.M0(2131753031, null));
        boolean z11 = false;
        this.X = false;
        this.Y = true;
        this.f9417d0 = new eq[1];
        this.f9437t0 = new c(this, 0);
        this.f9438u0 = -1;
        this.f9411a = i7;
        this.f9413b = j3;
        if (j3 == getUserConfig().e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9415c = z10;
        if (i7 == 0) {
            e0.g(this.currentAccount).r(j3);
            if (!z10) {
                e0.g(this.currentAccount).l(j3);
            }
        } else if (i7 == 1) {
            e0 g10 = e0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, (l10 == null || System.currentTimeMillis() - l10.longValue() > 30000) ? true : z11);
        }
        if (z10) {
            M0 = hd.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().S5);
        } else {
            M0 = hd.M0(2131752957, null);
        }
        this.K = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new c(this, 2)), true);
    }

    public static void Z(t tVar) {
        tVar.showDialog(xd.I(tVar.getParentActivity(), tVar.resourceProvider, true));
    }

    public static void a0(t tVar, b41 b41Var) {
        if (b41Var.H(fb.class)) {
            lb.k1(tVar.getParentActivity(), true, tVar.f9413b, tVar.currentAccount, (TL_stars.StarsTransaction) b41Var.G, tVar.getResourceProvider());
        } else if (b41Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            xd.M(tVar.getParentActivity(), tVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) b41Var.G, tVar.f9413b, tVar.resourceProvider);
        } else if (b41Var.d == 2) {
            tVar.presentFragment(new ki.n3(tVar.f9413b));
        }
    }

    public static void b0(t tVar) {
        long j3;
        c cVar = tVar.f9437t0;
        org.telegram.ui.Components.xb.e();
        TLRPC.TL_payments_starsRevenueStats h = e0.g(tVar.currentAccount).h(tVar.f9413b, false);
        if (h == null) {
            j3 = 0;
        } else {
            j3 = h.status.available_balance.amount;
        }
        if (j3 < tVar.getMessagesController().S5) {
            tVar.Y = true;
            tVar.Z = j3;
        } else {
            tVar.Y = false;
            tVar.Z = tVar.getMessagesController().S5;
        }
        tVar.X = true;
        tVar.f9412a0.setText(Long.toString(tVar.Z));
        q qVar = tVar.f9412a0;
        qVar.setSelection(qVar.getText().length());
        tVar.X = false;
        org.telegram.messenger.g0.r(cVar);
        cVar.run();
    }

    public static void c0(t tVar, Context context, View view) {
        if (view.isEnabled()) {
            hi.d dVar = tVar.f9416c0;
            if (!dVar.R) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = np.s1(tVar.currentAccount).j1(tVar.f9413b);
                ConnectionsManager.getInstance(tVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bi.v2(2, tVar, context));
            }
        }
    }

    public static void d0(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
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
                    ConnectionsManager.getInstance(tVar.currentAccount).sendRequest(new TL_account.getPassword(), new k(tVar, twoStepVerificationActivity, z10, j3), 8);
                    return;
                }
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                org.telegram.ui.Components.cc.d0(tL_error);
                return;
            }
            twoStepVerificationActivity.t0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String M0 = hd.M0(2131751297, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.j6.f28957j5;
            org.telegram.ui.ActionBar.q6.U(textView, i16, null);
            textView.setTextSize(1, 16.0f);
            if (hd.f24104a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131742864, null)));
            linearLayout.addView(textView, c8.ja.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231623);
            if (hd.f24104a0) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i10 = 0;
            }
            int L3 = org.telegram.messenger.g0.L(9.0f);
            if (hd.f24104a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(11.0f);
            }
            imageView.setPadding(i10, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.s(imageView, i16, null, mode);
            TextView textView2 = new TextView(activity);
            org.telegram.ui.ActionBar.q6.U(textView2, i16, null);
            textView2.setTextSize(1, 16.0f);
            if (hd.f24104a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131751300, null)));
            if (hd.f24104a0) {
                linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                linearLayout2.addView(imageView, c8.ja.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, c8.ja.o(-2, -2));
                linearLayout2.addView(textView2, c8.ja.o(-1, -2));
            }
            LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
            linearLayout.addView(e10, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(activity);
            imageView2.setImageResource(2131231623);
            if (hd.f24104a0) {
                i12 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i12 = 0;
            }
            int L4 = org.telegram.messenger.g0.L(9.0f);
            if (hd.f24104a0) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(11.0f);
            }
            imageView2.setPadding(i12, L4, L2, 0);
            org.telegram.ui.ActionBar.q6.s(imageView2, i16, null, mode);
            TextView textView3 = new TextView(activity);
            org.telegram.ui.ActionBar.q6.U(textView3, i16, null);
            textView3.setTextSize(1, 16.0f);
            if (hd.f24104a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            textView3.setText(org.telegram.messenger.g0.X2(hd.M0(2131751299, null)));
            if (hd.f24104a0) {
                e10.addView(textView3, c8.ja.o(-1, -2));
                i14 = 5;
                e10.addView(imageView2, c8.ja.r(-2, -2, 5));
            } else {
                i14 = 5;
                e10.addView(imageView2, c8.ja.o(-2, -2));
                e10.addView(textView3, c8.ja.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(hd.M0(2131751291, null), new d(tVar));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
            } else {
                TextView textView4 = new TextView(activity);
                org.telegram.ui.ActionBar.q6.U(textView4, i16, null);
                textView4.setTextSize(1, 16.0f);
                if (hd.f24104a0) {
                    i15 = i14;
                } else {
                    i15 = 3;
                }
                org.telegram.messenger.k5.l(textView4, i15 | 48, null, 2131751298);
                linearLayout.addView(textView4, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(hd.M0(2131747831, null), null);
            }
            twoStepVerificationActivity.showDialog(t1Var);
            return;
        }
        twoStepVerificationActivity.t0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            vf.c.v(tVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url, false);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            tVar.Y = true;
            vf.c.v(tVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url, false);
        }
    }

    public static void e0(t tVar, ArrayList arrayList) {
        int i7;
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        long j3;
        int i11;
        int i12;
        boolean z10;
        int i13;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i14;
        ud udVar = tVar.J;
        ud udVar2 = tVar.I;
        ud udVar3 = tVar.G;
        ud udVar4 = tVar.F;
        ud udVar5 = tVar.E;
        long j10 = tVar.f9413b;
        ud udVar6 = tVar.H;
        boolean z11 = tVar.f9415c;
        int i15 = tVar.f9438u0;
        tVar.f9428n = -1;
        e0 g10 = e0.g(tVar.currentAccount);
        int i16 = tVar.f9411a;
        if (i16 == 0) {
            arrayList.add(b41.h(2, i15, tVar.f9441y));
            arrayList.add(b41.B(-1, null));
            arrayList.add(b41.b(hd.M0(2131752962, null)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                udVar5.f51909a = false;
                udVar5.f51914g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                udVar5.f51915i = starsAmount3;
                udVar5.h = "XTR";
                udVar5.f51913f = "USD";
                z10 = z11;
                double d = tVar.f9425j0;
                udVar5.f51916j = (long) (starsAmount3.amount * d * 100.0d);
                udVar4.f51909a = false;
                udVar4.f51914g = true;
                udVar4.f51915i = tL_starsRevenueStatus2.current_balance;
                udVar4.h = "XTR";
                udVar4.f51916j = (long) (starsAmount.amount * d * 100.0d);
                udVar4.f51913f = "USD";
                udVar3.f51909a = false;
                udVar3.f51914g = true;
                udVar3.f51915i = tL_starsRevenueStatus2.overall_revenue;
                udVar3.h = "XTR";
                udVar3.f51916j = (long) (starsAmount2.amount * d * 100.0d);
                udVar3.f51913f = "USD";
                tVar.v0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = tVar.S;
                if (h.status.withdrawal_enabled) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                linearLayout.setVisibility(i14);
            } else {
                z10 = z11;
            }
            arrayList.add(b41.v(udVar5));
            arrayList.add(b41.v(udVar4));
            arrayList.add(b41.v(udVar3));
            if (z10) {
                i13 = 2131745645;
            } else {
                i13 = 2131752960;
            }
            arrayList.add(b41.B(-2, hd.M0(i13, null)));
            arrayList.add(b41.b(hd.M0(2131752972, null)));
            arrayList.add(b41.j(1, tVar.R));
            arrayList.add(b41.B(-3, tVar.K));
            if (!z10) {
                if (tVar.getMessagesController().f25300h6) {
                    arrayList.add(ki.g.i(2, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lk, tVar.resourceProvider), qn.i0(hd.M0(2131753145, null)), hd.M0(2131753146, null)));
                    arrayList.add(b41.B(-4, null));
                }
                tVar.f9428n = arrayList.size();
                arrayList.add(b41.n(tVar.h, -2));
            }
        } else if (i16 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z11) {
                if (tVar.f9427l0 == null) {
                    tVar.f9427l0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(hd.a0(null, null, 2131753045, 50), -1, 3, new c(tVar, 3), tVar.resourceProvider), true);
                }
                arrayList.add(b41.g(tVar.f9427l0));
            }
            if (tVar.f9431p0 == null && j11 != null) {
                l41 i02 = z41.i0(j11.top_hours_graph, hd.M0(2131753047, null), 0, false);
                tVar.f9431p0 = i02;
                if (i02 != null) {
                    i02.f48837n = true;
                }
            }
            l41 l41Var = tVar.f9431p0;
            if (l41Var != null && !l41Var.f48835l) {
                arrayList.add(b41.h(5, i15, l41Var));
                arrayList.add(b41.B(-1, null));
            }
            if (tVar.f9432q0 == null && j11 != null) {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i7 = 2;
                tVar.f9432q0 = z41.i0(statsGraph, hd.M0(2131753046, null), 2, false);
            } else {
                i7 = 2;
            }
            l41 l41Var2 = tVar.f9432q0;
            if (l41Var2 != null && !l41Var2.f48835l) {
                arrayList.add(b41.h(i7, i15, l41Var2));
                arrayList.add(b41.B(-2, null));
            }
            if (!tVar.f9430o0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d2 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                udVar6.d = j12;
                double d10 = j12 / 1.0E9d;
                udVar6.f51912e = (long) (d10 * d2 * 100.0d);
                if (tVar.f9434r0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    tVar.f9434r0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    tVar.f9434r0.setMaximumFractionDigits(6);
                    tVar.f9434r0.setGroupingUsed(false);
                } else {
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = tVar.f9434r0;
                if (d10 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xd.K("TON " + tVar.f9434r0.format(d10), tVar.f9422g0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(tVar.f9421f0, indexOf, spannableStringBuilder.length(), 33);
                }
                tVar.f9422g0.setText(spannableStringBuilder);
                tVar.f9423h0.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
                udVar6.f51913f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                udVar2.d = j13;
                udVar2.f51912e = (long) ((j13 / 1.0E9d) * d2 * 100.0d);
                udVar2.f51913f = "USD";
                udVar.f51909a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                udVar.d = j14;
                udVar.f51912e = (long) ((j14 / 1.0E9d) * d2 * 100.0d);
                udVar.f51913f = "USD";
                tVar.f9430o0 = true;
                hi.d dVar = tVar.f9424i0;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                dVar.setVisibility(i12);
            }
            if (tVar.f9430o0) {
                arrayList.add(b41.b(hd.M0(2131753034, null)));
                arrayList.add(b41.v(udVar6));
                arrayList.add(b41.v(udVar2));
                arrayList.add(b41.v(udVar));
                if (tVar.m0 == null) {
                    tVar.m0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(hd.M0(2131753030, null), -1, 3, new c(tVar, 4), tVar.resourceProvider), true);
                }
                arrayList.add(b41.B(-4, tVar.m0));
            }
            arrayList.add(b41.b(hd.M0(2131753051, null)));
            arrayList.add(b41.k(tVar.f9419e0));
            if (tVar.f9429n0 == null) {
                if (np.s1(tVar.currentAccount).J5) {
                    i10 = 2131753050;
                } else {
                    i10 = 2131753048;
                }
                tVar.f9429n0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(hd.M0(i10, null), -1, 3, new c(tVar, 5), null), true);
            }
            arrayList.add(b41.B(-5, tVar.f9429n0));
            tVar.f9428n = arrayList.size();
            arrayList.add(b41.n(tVar.h, -2));
        }
    }

    public static int n0(t tVar) {
        return tVar.currentAccount;
    }

    public static int o0(t tVar) {
        return tVar.currentAccount;
    }

    public static int r0(t tVar) {
        return tVar.currentAccount;
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
        return hd.a0(null, null, 2131747322, String.format(locale, "%02d", Integer.valueOf(i10)), String.format(locale, "%02d", Integer.valueOf(i12)), String.format(locale, "%02d", Integer.valueOf(i14)));
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        boolean z10;
        kb kbVar;
        int i7;
        int i10;
        boolean z11;
        View view;
        View view2;
        boolean z12 = this.f9415c;
        int i11 = this.f9411a;
        if (i11 != 1 && z12) {
            this.f9420f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        } else {
            it0 it0Var = new it0(context);
            this.f9420f = it0Var;
            it0Var.setCommonInsetsManagedExternally(true);
            this.f9420f.setGeometry(new cb.c(this, 17));
            it0 it0Var2 = this.f9420f;
            it0Var2.getClass();
            this.h = new bi.o2(26, context, it0Var2);
            frameLayout = this.f9420f;
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
        this.d = new sn(context, null, false, getResourceProvider());
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f9413b));
        this.d.k(a22, true);
        this.simpleActionBar.setTitle(q10.p(a22));
        if (i11 == 0) {
            this.simpleActionBar.setSubtitle(hd.M0(2131752949, null));
        } else {
            this.simpleActionBar.setSubtitle(hd.M0(2131752948, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 2));
        this.simpleActionBar.setBackground(null);
        if (i11 == 0 && this.f9420f != null) {
            z10 = false;
            kbVar = new kb(context, this.currentAccount, false, this.f9413b, getClassGuid(), getResourceProvider(), this.f9420f);
        } else {
            z10 = false;
            kbVar = null;
        }
        this.L = kbVar;
        if (i11 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.M = frameLayout3;
            frameLayout3.setClipChildren(z10);
            this.M.setClipToPadding(z10);
            wj0 wj0Var = new wj0(context, this.resourceProvider, this.f9420f);
            this.O = wj0Var;
            wj0Var.setAdapter(new r(this, context, wj0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.N = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            this.N.addView(wj0Var.i(-2, true), c8.ja.e(-1, 48, 48));
            this.M.addView(wj0Var, c8.ja.c(-1.0f, -1));
        } else if (kbVar != null) {
            this.O = kbVar.getViewPager();
            this.N = this.L.getTabsContainer();
        }
        ai.r2 r2Var = new ai.r2(context, 1);
        this.R = r2Var;
        r2Var.setOrientation(1);
        ai.r2 r2Var2 = this.R;
        int i12 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.h(i12, r2Var2, getResourceProvider());
        this.R.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.U = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.h6 h6Var2 = this.U;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i13, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.U.setGravity(17);
        this.T = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.U, c8.ja.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.V = h6Var3;
        h6Var3.setGravity(17);
        org.telegram.ui.Components.h6 h6Var4 = this.V;
        int i14 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var4, i14, getResourceProvider());
        this.V.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.R.addView(this.V, c8.ja.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        p pVar = new p(0, context, this);
        this.W = pVar;
        pVar.setText(hd.M0(2131752953, null));
        this.W.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        q qVar = new q(context, 0);
        this.f9412a0 = qVar;
        qVar.setFocusable(false);
        org.telegram.ui.ActionBar.q6.U(this.f9412a0, i13, getResourceProvider());
        this.f9412a0.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f9412a0.setCursorWidth(1.5f);
        this.f9412a0.setBackground(null);
        this.f9412a0.setTextSize(1, 18.0f);
        this.f9412a0.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        this.f9412a0.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        this.f9412a0.setInputType(2);
        this.f9412a0.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.q6.C(this.f9412a0, org.telegram.ui.ActionBar.j6.f29005lg, getResourceProvider());
        org.telegram.ui.ActionBar.q6.y(this.f9412a0, org.telegram.ui.ActionBar.j6.f29022mg, getResourceProvider());
        q qVar2 = this.f9412a0;
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        qVar2.setGravity(i7);
        this.f9412a0.setOnFocusChangeListener(new ch.c0(this, 1));
        this.f9412a0.addTextChangedListener(new ah.j(this, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232753);
        linearLayout.addView(imageView, c8.ja.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.f9412a0, c8.ja.p(-1, -2, 1.0f, 119));
        this.W.e(this.f9412a0);
        this.W.addView(linearLayout, c8.ja.e(-1, -2, 48));
        this.f9412a0.setOnEditorActionListener(new m(this, 0));
        this.R.addView(this.W, c8.ja.t(-1, -2, 1, 18, 14, 18, 2));
        this.W.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.S = linearLayout2;
        linearLayout2.setOrientation(0);
        bi.s sVar = new bi.s(1, context, getResourceProvider(), true);
        sVar.setRoundRadius(24);
        this.f9414b0 = sVar;
        sVar.setEnabled(np.s1(this.currentAccount).J5);
        this.f9414b0.i(hd.M0(2131752969, null), false, true);
        this.f9414b0.setOnClickListener(new View.OnClickListener(this) {
            public final t f9070b;

            {
                this.f9070b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f9070b.y0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            t tVar = this.f9070b;
                            if (!tVar.f9424i0.R) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ab.g gVar = new ab.g(15, tVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.f43426a0 = 1;
                                twoStepVerificationActivity.f43430c0 = gVar;
                                tVar.f9424i0.setLoading(true);
                                twoStepVerificationActivity.x0(new g(tVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f9416c0 = dVar;
        dVar.setEnabled(true);
        this.f9416c0.i(hd.M0(2131748374, null), false, true);
        this.f9416c0.setOnClickListener(new ai.v2(7, this, context));
        this.S.addView(this.f9414b0, c8.ja.p(-1, 48, 1.0f, 119));
        if (!z12) {
            this.S.addView(new Space(context), c8.ja.p(8, 48, 0.0f, 119));
            this.S.addView(this.f9416c0, c8.ja.p(-1, 48, 1.0f, 119));
        }
        this.R.addView(this.S, c8.ja.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ai.r2 r2Var3 = new ai.r2(context, 2);
        this.f9419e0 = r2Var3;
        r2Var3.setOrientation(1);
        org.telegram.ui.ActionBar.q6.h(i12, this.f9419e0, this.resourceProvider);
        this.f9419e0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var5 = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f9422g0 = h6Var5;
        h6Var5.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(this.f9422g0, i13, this.resourceProvider);
        this.f9422g0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.f9422g0.setGravity(17);
        this.f9421f0 = new RelativeSizeSpan(0.6770833f);
        this.f9419e0.addView(this.f9422g0, c8.ja.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var6 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.f9423h0 = h6Var6;
        h6Var6.setGravity(17);
        org.telegram.ui.ActionBar.q6.Y(this.f9423h0, i14, this.resourceProvider);
        this.f9423h0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f9419e0.addView(this.f9423h0, c8.ja.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        hi.d dVar2 = new hi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f9424i0 = dVar2;
        dVar2.setEnabled(np.s1(this.currentAccount).J5);
        hi.d dVar3 = this.f9424i0;
        if (z12) {
            i10 = 2131748375;
        } else {
            i10 = 2131748351;
        }
        dVar3.i(hd.M0(i10, null), false, true);
        this.f9424i0.setVisibility(8);
        this.f9424i0.setOnClickListener(new View.OnClickListener(this) {
            public final t f9070b;

            {
                this.f9070b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f9070b.y0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            t tVar = this.f9070b;
                            if (!tVar.f9424i0.R) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ab.g gVar = new ab.g(15, tVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.f43426a0 = 1;
                                twoStepVerificationActivity.f43430c0 = gVar;
                                tVar.f9424i0.setLoading(true);
                                twoStepVerificationActivity.x0(new g(tVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f9419e0.addView(this.f9424i0, c8.ja.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        u41 u41Var = new u41(this, new bi.b(this, 12), new d(this), new o(this, 0));
        this.f9418e = u41Var;
        u41Var.r1();
        u41 u41Var2 = this.f9418e;
        u41Var2.f39892g3.f38199r = false;
        u41Var2.setCaptureSectionsDecoratorAllowed(true);
        this.f9418e.setClipToPadding(false);
        this.f9418e.setOverScrollMode(0);
        it0 it0Var3 = this.f9420f;
        if (it0Var3 != null) {
            u41 u41Var3 = this.f9418e;
            getParentActivity();
            jg.i0 i0Var = new jg.i0(5, it0Var3, false);
            u41Var3.f39891f3 = i0Var;
            u41Var3.setLayoutManager(i0Var);
            this.f9420f.u(this.f9418e, new d(this));
            z11 = true;
            if (i11 == 1) {
                view2 = this.M;
            } else {
                view2 = this.L;
            }
            this.f9420f.x(view2, this.O, new d(this));
            FrameLayout frameLayout5 = this.N;
            this.f9420f.y(frameLayout5);
            frameLayout5.setLayoutParams(c8.ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z11 = true;
            frameLayout2.addView(this.f9418e, c8.ja.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.f9418e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.f9433r = new View(getParentActivity());
        if (this.f9420f != null) {
            view = this.N;
        } else {
            view = this.simpleActionBar;
        }
        frameLayout2.addView(this.f9433r, frameLayout2.indexOfChild(view), c8.ja.e(-1, 0, 48));
        this.f9433r.setBackground(getBaseSimpleGlass().a(this.f9433r));
        te.a aVar = new te.a(0, new d(this), er.h, 380L, false);
        this.f9435s = aVar;
        it0 it0Var4 = this.f9420f;
        aVar.a((it0Var4 == null || !it0Var4.f35713f0) ? false : false, false);
        if (this.f9420f != null) {
            getBaseSimpleGlass().f56051n = this.f9420f;
            kb kbVar2 = this.L;
            if (kbVar2 != null) {
                kbVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.O);
            }
            getBaseSimpleGlass().f56052o = new f(0, this, new e(0, frameLayout2));
            FrameLayout frameLayout6 = this.N;
            fh.g c10 = getBaseSimpleGlass().f56042c.c(frameLayout6, null, false);
            c10.p(c8.g0.l(this.resourceProvider));
            c10.q(org.telegram.messenger.g0.L(9.66f));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            frameLayout6.setBackground(c10);
        }
        org.telegram.messenger.g0.E2(this.d.f39351e);
        frameLayout2.addView(this.d.f39351e, c8.ja.e(42, 42, 53));
        s0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.C3 && ((Long) objArr[0]).longValue() == this.f9413b) {
            t0();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false)) <= 0.721f) {
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
        w61 w61Var = this.O;
        if (w61Var != null && w61Var.canScrollHorizontally(-1)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.C3);
        t0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.P = true;
        ns.f(this.currentAccount).n(this, ns.C3);
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
            sn snVar = this.d;
            if (snVar != null) {
                snVar.i(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fj, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Gj, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0() {
        if (this.f9418e != null) {
            int i7 = 0;
            org.telegram.messenger.g0.A3(this.d.f39351e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15575b, org.telegram.messenger.g0.L(6.0f), 0);
            u41 u41Var = this.f9418e;
            i0.c cVar = this.mSystemInsets;
            ri.a.e(u41Var, cVar.f15575b, cVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
            if (this.f9420f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9418e.getLayoutParams();
                this.f9420f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                it0 it0Var = this.f9420f;
                it0Var.B();
                it0Var.requestLayout();
                it0Var.invalidate();
            }
            if (this.f9433r != null) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15575b;
                if (this.f9420f != null) {
                    i7 = org.telegram.messenger.g0.L(44.0f);
                }
                int i10 = currentActionBarHeight + i7;
                ViewGroup.LayoutParams layoutParams = this.f9433r.getLayoutParams();
                if (layoutParams.height != i10) {
                    layoutParams.height = i10;
                    this.f9433r.setLayoutParams(layoutParams);
                }
                x0();
            }
        }
    }

    public final void t0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10;
        mg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        boolean z11 = false;
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(this.f9413b, false);
        if (h == this.f9439w) {
            if (h == null) {
                tL_starsRevenueStatus2 = null;
            } else {
                tL_starsRevenueStatus2 = h.status;
            }
            if (tL_starsRevenueStatus2 == this.f9440x) {
                return;
            }
        }
        this.f9439w = h;
        if (h == null) {
            tL_starsRevenueStatus = null;
        } else {
            tL_starsRevenueStatus = h.status;
        }
        this.f9440x = tL_starsRevenueStatus;
        if (h != null) {
            this.f9425j0 = h.usd_rate;
            l41 i02 = z41.i0(h.revenue_graph, hd.M0(2131752963, null), 2, false);
            this.f9441y = i02;
            if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f9441y.d.d.get(0) != null) {
                l41 l41Var = this.f9441y;
                l41Var.h = true;
                ((mg.a) l41Var.d.d.get(0)).f20618g = org.telegram.ui.ActionBar.j6.pk;
                this.f9441y.d.h = (float) ((1.0d / this.f9425j0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            v0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            u41 u41Var = this.f9418e;
            if (u41Var != null) {
                it0 it0Var = this.f9420f;
                if (it0Var != null && it0Var.f35713f0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p41 p41Var = u41Var.f39892g3;
                if (it0Var == null) {
                    z11 = true;
                }
                p41Var.O(z11);
                if (z10) {
                    this.f9420f.a();
                }
            }
        }
    }

    public final void u0(boolean z10, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f10 = m10.i(this.currentAccount).f();
        if (parentActivity != null && f10 != null) {
            long j10 = this.f9413b;
            if (z10) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = np.s1(this.currentAccount).j1(j10);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = j3;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = np.s1(this.currentAccount).j1(j10);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new i(this, twoStepVerificationActivity, parentActivity, z10, j3));
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(TL_stars.StarsAmount starsAmount, int i7) {
        int i10;
        if (this.U != null && this.V != null) {
            long j3 = (long) (this.f9425j0 * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lb.a1(false, TextUtils.concat("XTR ", lb.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.T, indexOf, spannableStringBuilder.length(), 33);
            }
            this.U.setText(spannableStringBuilder);
            this.V.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
            p pVar = this.W;
            if (j3 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            pVar.setVisibility(i10);
            if (this.Y) {
                this.X = true;
                q qVar = this.f9412a0;
                long j10 = starsAmount.amount;
                this.Z = j10;
                qVar.setText(Long.toString(j10));
                q qVar2 = this.f9412a0;
                qVar2.setSelection(qVar2.getText().length());
                this.X = false;
                bi.s sVar = this.f9414b0;
                if (this.Z > 0) {
                    z10 = true;
                }
                sVar.setEnabled(z10);
            }
            this.Q = i7;
            c cVar = this.f9437t0;
            org.telegram.messenger.g0.r(cVar);
            cVar.run();
        }
    }

    public final void x0() {
        float f10;
        View view = this.f9433r;
        if (view == null) {
            return;
        }
        te.a aVar = this.f9435s;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f57085e;
        }
        if (this.f9420f != null) {
            f11 = org.telegram.messenger.g0.L(44.0f) * (-(1.0f - f10));
        }
        view.setTranslationY(f11);
    }

    public final void y0() {
        bi.s sVar = this.f9414b0;
        if (sVar.f14056d0 && !sVar.R) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.Q > currentTime) {
                this.f9426k0 = org.telegram.ui.Components.cc.a0(this).Q(2131624292, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752952, w0(this.Q - currentTime)))).j();
            } else if (this.Z < getMessagesController().S5) {
                org.telegram.ui.Components.cc.a0(this).M(getParentActivity().getResources().getDrawable(2131232753).mutate(), org.telegram.messenger.g0.U2(hd.G((int) getMessagesController().S5, "BotStarsWithdrawMinLimit", new Object[0]), new c(this, 1))).j();
            } else {
                long j3 = this.Z;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                h hVar = new h(this, j3, twoStepVerificationActivity, 0);
                twoStepVerificationActivity.f43426a0 = 1;
                twoStepVerificationActivity.f43430c0 = hVar;
                this.f9414b0.setLoading(true);
                twoStepVerificationActivity.x0(new g(this, twoStepVerificationActivity, 1));
            }
        }
    }
}
