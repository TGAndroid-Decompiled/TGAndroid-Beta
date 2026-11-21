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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c51;
import org.telegram.ui.o41;
import org.telegram.ui.rn;
import org.telegram.ui.ud;
import org.telegram.ui.xd;
public final class t extends org.telegram.ui.ActionBar.g2 implements fs {
    public final ud E;
    public final ud F;
    public final ud G;
    public final ud H;
    public final ud I;
    public final ud J;
    public final SpannableStringBuilder K;
    public ob L;
    public FrameLayout M;
    public FrameLayout N;
    public j71 O;
    public boolean P;
    public int Q;
    public ai.t2 R;
    public LinearLayout S;
    public RelativeSizeSpan T;
    public org.telegram.ui.Components.o6 U;
    public org.telegram.ui.Components.o6 V;
    public p W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final int f9766a;
    public q f9767a0;
    public final long f9768b;
    public bi.s f9769b0;
    public final boolean f9770c;
    public hi.e f9771c0;
    public co d;
    public final nq[] f9772d0;
    public h51 f9773e;
    public ai.t2 f9774e0;
    public tt0 f9775f;
    public RelativeSizeSpan f9776f0;
    public org.telegram.ui.Components.o6 f9777g0;
    public bi.m3 h;
    public org.telegram.ui.Components.o6 f9778h0;
    public hi.e f9779i0;
    public double f9780j0;
    public org.telegram.ui.Components.gc f9781k0;
    public SpannableStringBuilder f9782l0;
    public SpannableStringBuilder m0;
    public int f9783n;
    public SpannableStringBuilder f9784n0;
    public boolean f9785o0;
    public o41 f9786p0;
    public o41 f9787q0;
    public View f9788r;
    public DecimalFormat f9789r0;
    public te.a f9790s;
    public SpannableStringBuilder f9791s0;
    public final c f9792t0;
    public final int f9793u0;
    public TLRPC.TL_payments_starsRevenueStats f9794w;
    public TLRPC.TL_starsRevenueStatus f9795x;
    public o41 f9796y;

    public t(int i7, long j3) {
        super(null);
        boolean z10;
        String N0;
        this.f9783n = -1;
        this.E = ud.a("XTR", gd.N0(2131752949, null));
        this.F = ud.a("XTR", gd.N0(2131752947, null));
        this.G = ud.a("XTR", gd.N0(2131752946, null));
        this.H = ud.a("TON", gd.N0(2131753021, null));
        this.I = ud.a("TON", gd.N0(2131753020, null));
        this.J = ud.a("TON", gd.N0(2131753019, null));
        boolean z11 = false;
        this.X = false;
        this.Y = true;
        this.f9772d0 = new nq[1];
        this.f9792t0 = new c(this, 0);
        this.f9793u0 = -1;
        this.f9766a = i7;
        this.f9768b = j3;
        if (j3 == getUserConfig().e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9770c = z10;
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
            N0 = gd.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().U5);
        } else {
            N0 = gd.N0(2131752945, null);
        }
        this.K = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(N0, new c(this, 2)), true);
    }

    public static void Z(t tVar) {
        tVar.showDialog(xd.I(tVar.getParentActivity(), tVar.resourceProvider, true));
    }

    public static void a0(t tVar, org.telegram.ui.Components.o41 o41Var) {
        if (o41Var.H(jb.class)) {
            pb.l1(tVar.getParentActivity(), true, tVar.f9768b, tVar.currentAccount, (TL_stars.StarsTransaction) o41Var.H, tVar.getResourceProvider());
        } else if (o41Var.H instanceof TL_stats.BroadcastRevenueTransaction) {
            xd.M(tVar.getParentActivity(), tVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) o41Var.H, tVar.f9768b, tVar.resourceProvider);
        } else if (o41Var.d == 2) {
            tVar.presentFragment(new ki.h3(tVar.f9768b));
        }
    }

    public static void b0(t tVar) {
        long j3;
        c cVar = tVar.f9792t0;
        org.telegram.ui.Components.gc.e();
        TLRPC.TL_payments_starsRevenueStats h = e0.g(tVar.currentAccount).h(tVar.f9768b, false);
        if (h == null) {
            j3 = 0;
        } else {
            j3 = h.status.available_balance.amount;
        }
        if (j3 < tVar.getMessagesController().U5) {
            tVar.Y = true;
            tVar.Z = j3;
        } else {
            tVar.Y = false;
            tVar.Z = tVar.getMessagesController().U5;
        }
        tVar.X = true;
        tVar.f9767a0.setText(Long.toString(tVar.Z));
        q qVar = tVar.f9767a0;
        qVar.setSelection(qVar.getText().length());
        tVar.X = false;
        org.telegram.messenger.g0.r(cVar);
        cVar.run();
    }

    public static void c0(t tVar, Context context, View view) {
        if (view.isEnabled()) {
            hi.e eVar = tVar.f9771c0;
            if (!eVar.R) {
                eVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = mp.u1(tVar.currentAccount).l1(tVar.f9768b);
                ConnectionsManager.getInstance(tVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bi.o1(3, tVar, context));
            }
        }
    }

    public static void d0(t tVar, ArrayList arrayList) {
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
        long j10 = tVar.f9768b;
        ud udVar6 = tVar.H;
        boolean z11 = tVar.f9770c;
        int i15 = tVar.f9793u0;
        tVar.f9783n = -1;
        e0 g10 = e0.g(tVar.currentAccount);
        int i16 = tVar.f9766a;
        if (i16 == 0) {
            arrayList.add(org.telegram.ui.Components.o41.h(2, i15, tVar.f9796y));
            arrayList.add(org.telegram.ui.Components.o41.B(-1, null));
            arrayList.add(org.telegram.ui.Components.o41.b(gd.N0(2131752950, null)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                udVar5.f52543a = false;
                udVar5.f52548g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                udVar5.f52549i = starsAmount3;
                udVar5.h = "XTR";
                udVar5.f52547f = "USD";
                z10 = z11;
                double d = tVar.f9780j0;
                udVar5.f52550j = (long) (starsAmount3.amount * d * 100.0d);
                udVar4.f52543a = false;
                udVar4.f52548g = true;
                udVar4.f52549i = tL_starsRevenueStatus2.current_balance;
                udVar4.h = "XTR";
                udVar4.f52550j = (long) (starsAmount.amount * d * 100.0d);
                udVar4.f52547f = "USD";
                udVar3.f52543a = false;
                udVar3.f52548g = true;
                udVar3.f52549i = tL_starsRevenueStatus2.overall_revenue;
                udVar3.h = "XTR";
                udVar3.f52550j = (long) (starsAmount2.amount * d * 100.0d);
                udVar3.f52547f = "USD";
                tVar.w0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
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
            arrayList.add(org.telegram.ui.Components.o41.v(udVar5));
            arrayList.add(org.telegram.ui.Components.o41.v(udVar4));
            arrayList.add(org.telegram.ui.Components.o41.v(udVar3));
            if (z10) {
                i13 = 2131745449;
            } else {
                i13 = 2131752948;
            }
            arrayList.add(org.telegram.ui.Components.o41.B(-2, gd.N0(i13, null)));
            arrayList.add(org.telegram.ui.Components.o41.b(gd.N0(2131752960, null)));
            arrayList.add(org.telegram.ui.Components.o41.j(1, tVar.R));
            arrayList.add(org.telegram.ui.Components.o41.B(-3, tVar.K));
            if (!z10) {
                if (tVar.getMessagesController().f25709j6) {
                    arrayList.add(ki.f.i(2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lk, tVar.resourceProvider), rn.i0(gd.N0(2131753142, null)), gd.N0(2131753143, null)));
                    arrayList.add(org.telegram.ui.Components.o41.B(-4, null));
                }
                tVar.f9783n = arrayList.size();
                arrayList.add(org.telegram.ui.Components.o41.n(tVar.h, -2));
            }
        } else if (i16 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z11) {
                if (tVar.f9782l0 == null) {
                    tVar.f9782l0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(gd.a0(null, null, 2131753033, 50), -1, 3, new c(tVar, 3), tVar.resourceProvider), true);
                }
                arrayList.add(org.telegram.ui.Components.o41.g(tVar.f9782l0));
            }
            if (tVar.f9786p0 == null && j11 != null) {
                o41 i02 = c51.i0(j11.top_hours_graph, gd.N0(2131753035, null), 0, false);
                tVar.f9786p0 = i02;
                if (i02 != null) {
                    i02.f50479n = true;
                }
            }
            o41 o41Var = tVar.f9786p0;
            if (o41Var != null && !o41Var.f50477l) {
                arrayList.add(org.telegram.ui.Components.o41.h(5, i15, o41Var));
                arrayList.add(org.telegram.ui.Components.o41.B(-1, null));
            }
            if (tVar.f9787q0 == null && j11 != null) {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i7 = 2;
                tVar.f9787q0 = c51.i0(statsGraph, gd.N0(2131753034, null), 2, false);
            } else {
                i7 = 2;
            }
            o41 o41Var2 = tVar.f9787q0;
            if (o41Var2 != null && !o41Var2.f50477l) {
                arrayList.add(org.telegram.ui.Components.o41.h(i7, i15, o41Var2));
                arrayList.add(org.telegram.ui.Components.o41.B(-2, null));
            }
            if (!tVar.f9785o0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d2 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                udVar6.d = j12;
                double d10 = j12 / 1.0E9d;
                udVar6.f52546e = (long) (d10 * d2 * 100.0d);
                if (tVar.f9789r0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    tVar.f9789r0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    tVar.f9789r0.setMaximumFractionDigits(6);
                    tVar.f9789r0.setGroupingUsed(false);
                } else {
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = tVar.f9789r0;
                if (d10 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xd.K("TON " + tVar.f9789r0.format(d10), tVar.f9777g0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(tVar.f9776f0, indexOf, spannableStringBuilder.length(), 33);
                }
                tVar.f9777g0.setText(spannableStringBuilder);
                tVar.f9778h0.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
                udVar6.f52547f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                udVar2.d = j13;
                udVar2.f52546e = (long) ((j13 / 1.0E9d) * d2 * 100.0d);
                udVar2.f52547f = "USD";
                udVar.f52543a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                udVar.d = j14;
                udVar.f52546e = (long) ((j14 / 1.0E9d) * d2 * 100.0d);
                udVar.f52547f = "USD";
                tVar.f9785o0 = true;
                hi.e eVar = tVar.f9779i0;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                eVar.setVisibility(i12);
            }
            if (tVar.f9785o0) {
                arrayList.add(org.telegram.ui.Components.o41.b(gd.N0(2131753022, null)));
                arrayList.add(org.telegram.ui.Components.o41.v(udVar6));
                arrayList.add(org.telegram.ui.Components.o41.v(udVar2));
                arrayList.add(org.telegram.ui.Components.o41.v(udVar));
                if (tVar.m0 == null) {
                    tVar.m0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(gd.N0(2131753018, null), -1, 3, new c(tVar, 4), tVar.resourceProvider), true);
                }
                arrayList.add(org.telegram.ui.Components.o41.B(-4, tVar.m0));
            }
            arrayList.add(org.telegram.ui.Components.o41.b(gd.N0(2131753039, null)));
            arrayList.add(org.telegram.ui.Components.o41.k(tVar.f9774e0));
            if (tVar.f9784n0 == null) {
                if (mp.u1(tVar.currentAccount).L5) {
                    i10 = 2131753038;
                } else {
                    i10 = 2131753036;
                }
                tVar.f9784n0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(gd.N0(i10, null), -1, 3, new c(tVar, 5), null), true);
            }
            arrayList.add(org.telegram.ui.Components.o41.B(-5, tVar.f9784n0));
            tVar.f9783n = arrayList.size();
            arrayList.add(org.telegram.ui.Components.o41.n(tVar.h, -2));
        }
    }

    public static void e0(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
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
                    ConnectionsManager.getInstance(tVar.currentAccount).sendRequest(new TL_account.getPassword(), new l(tVar, twoStepVerificationActivity, z10, j3), 8);
                    return;
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.t0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.Components.lc.e0(tL_error);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String N0 = gd.N0(2131751285, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
            t1Var.S = N0;
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.m6.f29486j5;
            org.telegram.ui.ActionBar.t6.U(textView, i16, null);
            textView.setTextSize(1, 16.0f);
            if (gd.f24241a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.W2(gd.N0(2131742600, null)));
            linearLayout.addView(textView, c8.ma.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231624);
            if (gd.f24241a0) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i10 = 0;
            }
            int L3 = org.telegram.messenger.g0.L(9.0f);
            if (gd.f24241a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(11.0f);
            }
            imageView.setPadding(i10, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.s(imageView, i16, null, mode);
            TextView textView2 = new TextView(activity);
            org.telegram.ui.ActionBar.t6.U(textView2, i16, null);
            textView2.setTextSize(1, 16.0f);
            if (gd.f24241a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            textView2.setText(org.telegram.messenger.g0.W2(gd.N0(2131751288, null)));
            if (gd.f24241a0) {
                linearLayout2.addView(textView2, c8.ma.o(-1, -2));
                linearLayout2.addView(imageView, c8.ma.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, c8.ma.o(-2, -2));
                linearLayout2.addView(textView2, c8.ma.o(-1, -2));
            }
            LinearLayout f10 = org.telegram.messenger.f3.f(activity, 0);
            linearLayout.addView(f10, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(activity);
            imageView2.setImageResource(2131231624);
            if (gd.f24241a0) {
                i12 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i12 = 0;
            }
            int L4 = org.telegram.messenger.g0.L(9.0f);
            if (gd.f24241a0) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(11.0f);
            }
            imageView2.setPadding(i12, L4, L2, 0);
            org.telegram.ui.ActionBar.t6.s(imageView2, i16, null, mode);
            TextView textView3 = new TextView(activity);
            org.telegram.ui.ActionBar.t6.U(textView3, i16, null);
            textView3.setTextSize(1, 16.0f);
            if (gd.f24241a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            textView3.setText(org.telegram.messenger.g0.W2(gd.N0(2131751287, null)));
            if (gd.f24241a0) {
                f10.addView(textView3, c8.ma.o(-1, -2));
                i14 = 5;
                f10.addView(imageView2, c8.ma.r(-2, -2, 5));
            } else {
                i14 = 5;
                f10.addView(imageView2, c8.ma.o(-2, -2));
                f10.addView(textView3, c8.ma.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(gd.N0(2131751279, null), new d(tVar));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
            } else {
                TextView textView4 = new TextView(activity);
                org.telegram.ui.ActionBar.t6.U(textView4, i16, null);
                textView4.setTextSize(1, 16.0f);
                if (gd.f24241a0) {
                    i15 = i14;
                } else {
                    i15 = 3;
                }
                org.telegram.messenger.f3.k(textView4, i15 | 48, null, 2131751286);
                linearLayout.addView(textView4, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(gd.N0(2131747637, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(t1Var);
                return;
            } else {
                tVar.showDialog(t1Var);
                return;
            }
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

    public static void f0(t tVar, View view) {
        if (view.isEnabled() && !tVar.f9779i0.R) {
            if (tVar.f9770c && ii.n.c(tVar.currentAccount)) {
                ii.n.g(tVar, tVar.H.d, new i(tVar, 0));
                return;
            }
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            ab.g gVar = new ab.g(14, tVar, twoStepVerificationActivity);
            twoStepVerificationActivity.f43913a0 = 1;
            twoStepVerificationActivity.f43917c0 = gVar;
            tVar.f9779i0.setLoading(true);
            twoStepVerificationActivity.x0(new g(tVar, twoStepVerificationActivity, 0));
        }
    }

    public static int o0(t tVar) {
        return tVar.currentAccount;
    }

    public static int p0(t tVar) {
        return tVar.currentAccount;
    }

    public static int s0(t tVar) {
        return tVar.currentAccount;
    }

    public static String x0(int i7) {
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
        return gd.a0(null, null, 2131747128, String.format(locale, "%02d", Integer.valueOf(i10)), String.format(locale, "%02d", Integer.valueOf(i12)), String.format(locale, "%02d", Integer.valueOf(i14)));
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        ob obVar;
        int i7;
        int i10;
        boolean z10;
        View view;
        View view2;
        boolean z11 = this.f9770c;
        int i11 = this.f9766a;
        if (i11 != 1 && z11) {
            this.f9775f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        } else {
            tt0 tt0Var = new tt0(context);
            this.f9775f = tt0Var;
            tt0Var.setCommonInsetsManagedExternally(true);
            this.f9775f.setGeometry(new d6.i(this, 13));
            tt0 tt0Var2 = this.f9775f;
            tt0Var2.getClass();
            this.h = new bi.m3(26, context, tt0Var2);
            frameLayout = this.f9775f;
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f29321a7));
        this.d = new co(context, null, false, getResourceProvider());
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f9768b));
        this.d.k(c22, true);
        this.simpleActionBar.setTitle(o10.q(c22));
        if (i11 == 0) {
            this.simpleActionBar.setSubtitle(gd.N0(2131752937, null));
        } else {
            this.simpleActionBar.setSubtitle(gd.N0(2131752936, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 4));
        this.simpleActionBar.setBackground(null);
        if (i11 == 0 && this.f9775f != null) {
            obVar = new ob(context, this.currentAccount, false, this.f9768b, getClassGuid(), getResourceProvider(), this.f9775f);
        } else {
            obVar = null;
        }
        this.L = obVar;
        if (i11 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.M = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.M.setClipToPadding(false);
            gk0 gk0Var = new gk0(context, this.resourceProvider, this.f9775f);
            this.O = gk0Var;
            gk0Var.setAdapter(new r(this, context, gk0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.N = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            this.N.addView(gk0Var.i(-2, true), c8.ma.e(-1, 48, 48));
            this.M.addView(gk0Var, c8.ma.c(-1.0f, -1));
        } else if (obVar != null) {
            this.O = obVar.getViewPager();
            this.N = this.L.getTabsContainer();
        }
        ai.t2 t2Var = new ai.t2(context, 1);
        this.R = t2Var;
        t2Var.setOrientation(1);
        ai.t2 t2Var2 = this.R;
        int i12 = org.telegram.ui.ActionBar.m6.f29378d6;
        org.telegram.ui.ActionBar.t6.h(i12, t2Var2, getResourceProvider());
        this.R.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.U = o6Var;
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.o6 o6Var2 = this.U;
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i13, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.U.setGravity(17);
        this.T = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.U, c8.ma.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.V = o6Var3;
        o6Var3.setGravity(17);
        org.telegram.ui.Components.o6 o6Var4 = this.V;
        int i14 = org.telegram.ui.ActionBar.m6.f29770y6;
        org.telegram.ui.ActionBar.t6.Y(o6Var4, i14, getResourceProvider());
        this.V.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.R.addView(this.V, c8.ma.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        p pVar = new p(0, context, this);
        this.W = pVar;
        pVar.setText(gd.N0(2131752941, null));
        this.W.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        q qVar = new q(context, 0);
        this.f9767a0 = qVar;
        qVar.setFocusable(false);
        org.telegram.ui.ActionBar.t6.U(this.f9767a0, i13, getResourceProvider());
        this.f9767a0.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f9767a0.setCursorWidth(1.5f);
        this.f9767a0.setBackground(null);
        this.f9767a0.setTextSize(1, 18.0f);
        this.f9767a0.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        this.f9767a0.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        this.f9767a0.setInputType(2);
        this.f9767a0.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.t6.C(this.f9767a0, org.telegram.ui.ActionBar.m6.f29534lg, getResourceProvider());
        org.telegram.ui.ActionBar.t6.y(this.f9767a0, org.telegram.ui.ActionBar.m6.f29551mg, getResourceProvider());
        q qVar2 = this.f9767a0;
        if (gd.f24241a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        qVar2.setGravity(i7);
        this.f9767a0.setOnFocusChangeListener(new ch.c0(this, 1));
        this.f9767a0.addTextChangedListener(new ah.j(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232754);
        linearLayout.addView(imageView, c8.ma.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.f9767a0, c8.ma.p(-1, -2, 1.0f, 119));
        this.W.e(this.f9767a0);
        this.W.addView(linearLayout, c8.ma.e(-1, -2, 48));
        this.f9767a0.setOnEditorActionListener(new n(this, 0));
        this.R.addView(this.W, c8.ma.t(-1, -2, 1, 18, 14, 18, 2));
        this.W.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.S = linearLayout2;
        linearLayout2.setOrientation(0);
        bi.s sVar = new bi.s(1, context, getResourceProvider(), true);
        sVar.setRoundRadius(24);
        this.f9769b0 = sVar;
        sVar.setEnabled(mp.u1(this.currentAccount).L5);
        this.f9769b0.i(gd.N0(2131752957, null), false, true);
        this.f9769b0.setOnClickListener(new View.OnClickListener(this) {
            public final t f9427b;

            {
                this.f9427b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f9427b.z0();
                        return;
                    default:
                        t.f0(this.f9427b, view3);
                        return;
                }
            }
        });
        hi.e eVar = new hi.e(context, getResourceProvider(), true);
        eVar.setRoundRadius(24);
        this.f9771c0 = eVar;
        eVar.setEnabled(true);
        this.f9771c0.i(gd.N0(2131748181, null), false, true);
        this.f9771c0.setOnClickListener(new ai.x2(9, this, context));
        this.S.addView(this.f9769b0, c8.ma.p(-1, 48, 1.0f, 119));
        if (!z11) {
            this.S.addView(new Space(context), c8.ma.p(8, 48, 0.0f, 119));
            this.S.addView(this.f9771c0, c8.ma.p(-1, 48, 1.0f, 119));
        }
        this.R.addView(this.S, c8.ma.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ai.t2 t2Var3 = new ai.t2(context, 2);
        this.f9774e0 = t2Var3;
        t2Var3.setOrientation(1);
        org.telegram.ui.ActionBar.t6.h(i12, this.f9774e0, this.resourceProvider);
        this.f9774e0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.o6 o6Var5 = new org.telegram.ui.Components.o6(context, false, true, true);
        this.f9777g0 = o6Var5;
        o6Var5.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(this.f9777g0, i13, this.resourceProvider);
        this.f9777g0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.f9777g0.setGravity(17);
        this.f9776f0 = new RelativeSizeSpan(0.6770833f);
        this.f9774e0.addView(this.f9777g0, c8.ma.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var6 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f9778h0 = o6Var6;
        o6Var6.setGravity(17);
        org.telegram.ui.ActionBar.t6.Y(this.f9778h0, i14, this.resourceProvider);
        this.f9778h0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f9774e0.addView(this.f9778h0, c8.ma.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        hi.e eVar2 = new hi.e(context, this.resourceProvider, true);
        eVar2.setRoundRadius(24);
        this.f9779i0 = eVar2;
        eVar2.setEnabled(mp.u1(this.currentAccount).L5);
        hi.e eVar3 = this.f9779i0;
        if (z11) {
            i10 = 2131748182;
        } else {
            i10 = 2131748158;
        }
        eVar3.i(gd.N0(i10, null), false, true);
        this.f9779i0.setVisibility(8);
        this.f9779i0.setOnClickListener(new View.OnClickListener(this) {
            public final t f9427b;

            {
                this.f9427b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f9427b.z0();
                        return;
                    default:
                        t.f0(this.f9427b, view3);
                        return;
                }
            }
        });
        this.f9774e0.addView(this.f9779i0, c8.ma.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        h51 h51Var = new h51(this, new i(this, 1), new d(this), new ci.v(this, 1));
        this.f9773e = h51Var;
        h51Var.r1();
        h51 h51Var2 = this.f9773e;
        h51Var2.f35796g3.f34068r = false;
        h51Var2.setCaptureSectionsDecoratorAllowed(true);
        this.f9773e.setClipToPadding(false);
        this.f9773e.setOverScrollMode(0);
        tt0 tt0Var3 = this.f9775f;
        if (tt0Var3 != null) {
            h51 h51Var3 = this.f9773e;
            getParentActivity();
            jg.i0 i0Var = new jg.i0(5, tt0Var3, false);
            h51Var3.f35795f3 = i0Var;
            h51Var3.setLayoutManager(i0Var);
            this.f9775f.u(this.f9773e, new d(this));
            z10 = true;
            if (i11 == 1) {
                view2 = this.M;
            } else {
                view2 = this.L;
            }
            this.f9775f.x(view2, this.O, new d(this));
            FrameLayout frameLayout5 = this.N;
            this.f9775f.y(frameLayout5);
            frameLayout5.setLayoutParams(c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z10 = true;
            frameLayout2.addView(this.f9773e, c8.ma.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.f9773e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.f9788r = new View(getParentActivity());
        if (this.f9775f != null) {
            view = this.N;
        } else {
            view = this.simpleActionBar;
        }
        frameLayout2.addView(this.f9788r, frameLayout2.indexOfChild(view), c8.ma.e(-1, 0, 48));
        this.f9788r.setBackground(getBaseSimpleGlass().a(this.f9788r));
        te.a aVar = new te.a(0, new d(this), nr.h, 380L, false);
        this.f9790s = aVar;
        tt0 tt0Var4 = this.f9775f;
        aVar.a((tt0Var4 == null || !tt0Var4.f40055f0) ? false : false, false);
        if (this.f9775f != null) {
            getBaseSimpleGlass().f56666n = this.f9775f;
            ob obVar2 = this.L;
            if (obVar2 != null) {
                obVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.O);
            }
            getBaseSimpleGlass().f56667o = new f(0, this, new e(0, frameLayout2));
            FrameLayout frameLayout6 = this.N;
            fh.g c10 = getBaseSimpleGlass().f56657c.c(frameLayout6, null, false);
            c10.p(c8.i0.m(this.resourceProvider));
            c10.q(org.telegram.messenger.g0.L(9.66f));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            frameLayout6.setBackground(c10);
        }
        org.telegram.messenger.g0.E2(this.d.f34240e);
        frameLayout2.addView(this.d.f34240e, c8.ma.e(42, 42, 53));
        t0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.E3 && ((Long) objArr[0]).longValue() == this.f9768b) {
            u0();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false)) <= 0.721f) {
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
        j71 j71Var = this.O;
        if (j71Var != null && j71Var.canScrollHorizontally(-1)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.E3);
        u0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.P = true;
        ks.f(this.currentAccount).n(this, ks.E3);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        t0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            co coVar = this.d;
            if (coVar != null) {
                coVar.i(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fj, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gj, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void t0() {
        if (this.f9773e != null) {
            int i7 = 0;
            org.telegram.messenger.g0.z3(this.d.f34240e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15915b, org.telegram.messenger.g0.L(6.0f), 0);
            h51 h51Var = this.f9773e;
            i0.b bVar = this.mSystemInsets;
            ri.a.e(h51Var, bVar.f15915b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
            if (this.f9775f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9773e.getLayoutParams();
                this.f9775f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                tt0 tt0Var = this.f9775f;
                tt0Var.B();
                tt0Var.requestLayout();
                tt0Var.invalidate();
            }
            if (this.f9788r != null) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15915b;
                if (this.f9775f != null) {
                    i7 = org.telegram.messenger.g0.L(44.0f);
                }
                int i10 = currentActionBarHeight + i7;
                ViewGroup.LayoutParams layoutParams = this.f9788r.getLayoutParams();
                if (layoutParams.height != i10) {
                    layoutParams.height = i10;
                    this.f9788r.setLayoutParams(layoutParams);
                }
                y0();
            }
        }
    }

    public final void u0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10;
        mg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        boolean z11 = false;
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(this.f9768b, false);
        if (h == this.f9794w) {
            if (h == null) {
                tL_starsRevenueStatus2 = null;
            } else {
                tL_starsRevenueStatus2 = h.status;
            }
            if (tL_starsRevenueStatus2 == this.f9795x) {
                return;
            }
        }
        this.f9794w = h;
        if (h == null) {
            tL_starsRevenueStatus = null;
        } else {
            tL_starsRevenueStatus = h.status;
        }
        this.f9795x = tL_starsRevenueStatus;
        if (h != null) {
            this.f9780j0 = h.usd_rate;
            o41 i02 = c51.i0(h.revenue_graph, gd.N0(2131752951, null), 2, false);
            this.f9796y = i02;
            if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f9796y.d.d.get(0) != null) {
                o41 o41Var = this.f9796y;
                o41Var.h = true;
                ((mg.a) o41Var.d.d.get(0)).f21007g = org.telegram.ui.ActionBar.m6.pk;
                this.f9796y.d.h = (float) ((1.0d / this.f9780j0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            w0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            h51 h51Var = this.f9773e;
            if (h51Var != null) {
                tt0 tt0Var = this.f9775f;
                if (tt0Var != null && tt0Var.f40055f0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.c51 c51Var = h51Var.f35796g3;
                if (tt0Var == null) {
                    z11 = true;
                }
                c51Var.O(z11);
                if (z10) {
                    this.f9775f.a();
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z10, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f10 = j10.i(this.currentAccount).f();
        if (parentActivity != null && f10 != null) {
            long j10 = this.f9768b;
            if (z10) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = mp.u1(this.currentAccount).l1(j10);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = j3;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = mp.u1(this.currentAccount).l1(j10);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new j(this, twoStepVerificationActivity, parentActivity, z10, j3));
        }
    }

    public final void w0(TL_stars.StarsAmount starsAmount, int i7) {
        int i10;
        if (this.U != null && this.V != null) {
            long j3 = (long) (this.f9780j0 * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pb.b1(false, TextUtils.concat("XTR ", pb.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
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
                q qVar = this.f9767a0;
                long j10 = starsAmount.amount;
                this.Z = j10;
                qVar.setText(Long.toString(j10));
                q qVar2 = this.f9767a0;
                qVar2.setSelection(qVar2.getText().length());
                this.X = false;
                bi.s sVar = this.f9769b0;
                if (this.Z > 0) {
                    z10 = true;
                }
                sVar.setEnabled(z10);
            }
            this.Q = i7;
            c cVar = this.f9792t0;
            org.telegram.messenger.g0.r(cVar);
            cVar.run();
        }
    }

    public final void y0() {
        float f10;
        View view = this.f9788r;
        if (view == null) {
            return;
        }
        te.a aVar = this.f9790s;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f57696e;
        }
        if (this.f9775f != null) {
            f11 = org.telegram.messenger.g0.L(44.0f) * (-(1.0f - f10));
        }
        view.setTranslationY(f11);
    }

    public final void z0() {
        bi.s sVar = this.f9769b0;
        if (sVar.f14564e0 && !sVar.R) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.Q > currentTime) {
                this.f9781k0 = org.telegram.ui.Components.lc.b0(this).Q(2131624292, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752940, x0(this.Q - currentTime)))).j();
            } else if (this.Z < getMessagesController().U5) {
                org.telegram.ui.Components.lc.b0(this).M(getParentActivity().getResources().getDrawable(2131232754).mutate(), org.telegram.messenger.g0.T2(gd.G((int) getMessagesController().U5, "BotStarsWithdrawMinLimit", new Object[0]), new c(this, 1))).j();
            } else {
                long j3 = this.Z;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                h hVar = new h(this, j3, twoStepVerificationActivity, 0);
                twoStepVerificationActivity.f43913a0 = 1;
                twoStepVerificationActivity.f43917c0 = hVar;
                this.f9769b0.setLoading(true);
                twoStepVerificationActivity.x0(new g(this, twoStepVerificationActivity, 1));
            }
        }
    }
}
