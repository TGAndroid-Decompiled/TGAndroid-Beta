package ci;

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
import b8.cd;
import b8.mf;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d41;
import org.telegram.ui.ln;
import org.telegram.ui.r41;
import org.telegram.ui.ud;
import org.telegram.ui.xd;
public final class v extends org.telegram.ui.ActionBar.d2 implements cs {
    public final ud E;
    public final ud F;
    public final ud G;
    public final ud H;
    public final ud I;
    public final ud J;
    public final SpannableStringBuilder K;
    public vb L;
    public FrameLayout M;
    public FrameLayout N;
    public n61 O;
    public boolean P;
    public int Q;
    public q R;
    public LinearLayout S;
    public RelativeSizeSpan T;
    public org.telegram.ui.Components.h6 U;
    public org.telegram.ui.Components.h6 V;
    public r W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final int f6130a;
    public s f6131a0;
    public final long f6132b;
    public ai.x f6133b0;
    public final boolean f6134c;
    public gi.d f6135c0;
    public jn d;
    public final wp[] f6136d0;
    public l41 f6137e;
    public q f6138e0;
    public gt0 f6139f;
    public RelativeSizeSpan f6140f0;
    public org.telegram.ui.Components.h6 f6141g0;
    public ai.x2 h;
    public org.telegram.ui.Components.h6 f6142h0;
    public gi.d f6143i0;
    public double f6144j0;
    public org.telegram.ui.Components.ac f6145k0;
    public SpannableStringBuilder f6146l0;
    public SpannableStringBuilder m0;
    public int f6147n;
    public SpannableStringBuilder f6148n0;
    public boolean f6149o0;
    public d41 f6150p0;
    public d41 f6151q0;
    public View f6152r;
    public DecimalFormat f6153r0;
    public qe.a f6154s;
    public SpannableStringBuilder f6155s0;
    public final d f6156t0;
    public final int f6157u0;
    public TLRPC.TL_payments_starsRevenueStats f6158w;
    public TLRPC.TL_starsRevenueStatus f6159x;
    public d41 f6160y;

    public v(int i3, long j10) {
        super(null);
        boolean z10;
        String M0;
        this.f6147n = -1;
        this.E = ud.a("XTR", bd.M0(2131752961, null));
        this.F = ud.a("XTR", bd.M0(2131752959, null));
        this.G = ud.a("XTR", bd.M0(2131752958, null));
        this.H = ud.a("TON", bd.M0(2131753033, null));
        this.I = ud.a("TON", bd.M0(2131753032, null));
        this.J = ud.a("TON", bd.M0(2131753031, null));
        boolean z11 = false;
        this.X = false;
        this.Y = true;
        this.f6136d0 = new wp[1];
        this.f6156t0 = new d(this, 0);
        this.f6157u0 = -1;
        this.f6130a = i3;
        this.f6132b = j10;
        if (j10 == getUserConfig().e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6134c = z10;
        if (i3 == 0) {
            i0.g(this.currentAccount).r(j10);
            if (!z10) {
                i0.g(this.currentAccount).l(j10);
            }
        } else if (i3 == 1) {
            i0 g7 = i0.g(this.currentAccount);
            Long l10 = (Long) g7.d.get(Long.valueOf(j10));
            g7.j(j10, (l10 == null || System.currentTimeMillis() - l10.longValue() > 30000) ? true : z11);
        }
        if (z10) {
            M0 = bd.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().R5);
        } else {
            M0 = bd.M0(2131752957, null);
        }
        this.K = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new d(this, 2)), true);
    }

    public static void Z(v vVar) {
        vVar.showDialog(xd.I(vVar.getParentActivity(), vVar.resourceProvider, true));
    }

    public static void a0(v vVar, r31 r31Var) {
        if (r31Var.H(qb.class)) {
            wb.k1(vVar.getParentActivity(), true, vVar.f6132b, vVar.currentAccount, (TL_stars.StarsTransaction) r31Var.G, vVar.getResourceProvider());
        } else if (r31Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            xd.M(vVar.getParentActivity(), vVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) r31Var.G, vVar.f6132b, vVar.resourceProvider);
        } else if (r31Var.d == 2) {
            vVar.presentFragment(new ii.q3(vVar.f6132b));
        }
    }

    public static void b0(v vVar) {
        long j10;
        d dVar = vVar.f6156t0;
        org.telegram.ui.Components.ac.e();
        TLRPC.TL_payments_starsRevenueStats h = i0.g(vVar.currentAccount).h(vVar.f6132b, false);
        if (h == null) {
            j10 = 0;
        } else {
            j10 = h.status.available_balance.amount;
        }
        if (j10 < vVar.getMessagesController().R5) {
            vVar.Y = true;
            vVar.Z = j10;
        } else {
            vVar.Y = false;
            vVar.Z = vVar.getMessagesController().R5;
        }
        vVar.X = true;
        vVar.f6131a0.setText(Long.toString(vVar.Z));
        s sVar = vVar.f6131a0;
        sVar.setSelection(sVar.getText().length());
        vVar.X = false;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
    }

    public static void c0(v vVar, Context context, View view) {
        if (view.isEnabled()) {
            gi.d dVar = vVar.f6135c0;
            if (!dVar.R) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = hp.s1(vVar.currentAccount).j1(vVar.f6132b);
                ConnectionsManager.getInstance(vVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.f3(2, vVar, context));
            }
        }
    }

    public static void d0(v vVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i3;
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
                    ConnectionsManager.getInstance(vVar.currentAccount).sendRequest(new TL_account.getPassword(), new l(vVar, twoStepVerificationActivity, z10, j10), 8);
                    return;
                }
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                org.telegram.ui.Components.fc.d0(tL_error);
                return;
            }
            twoStepVerificationActivity.t0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String M0 = bd.M0(2131751298, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.k6.f27988j5;
            org.telegram.ui.ActionBar.r6.V(textView, i16, null);
            textView.setTextSize(1, 16.0f);
            if (bd.f21784a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView.setGravity(i3 | 48);
            textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131742874, null)));
            linearLayout.addView(textView, mf.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231623);
            if (bd.f21784a0) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i10 = 0;
            }
            int L3 = org.telegram.messenger.g0.L(9.0f);
            if (bd.f21784a0) {
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
            if (bd.f21784a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            textView2.setText(org.telegram.messenger.g0.X2(bd.M0(2131751301, null)));
            if (bd.f21784a0) {
                linearLayout2.addView(textView2, mf.o(-1, -2));
                linearLayout2.addView(imageView, mf.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, mf.o(-2, -2));
                linearLayout2.addView(textView2, mf.o(-1, -2));
            }
            LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
            linearLayout.addView(e10, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(activity);
            imageView2.setImageResource(2131231623);
            if (bd.f21784a0) {
                i12 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i12 = 0;
            }
            int L4 = org.telegram.messenger.g0.L(9.0f);
            if (bd.f21784a0) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(11.0f);
            }
            imageView2.setPadding(i12, L4, L2, 0);
            org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, mode);
            TextView textView3 = new TextView(activity);
            org.telegram.ui.ActionBar.r6.V(textView3, i16, null);
            textView3.setTextSize(1, 16.0f);
            if (bd.f21784a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            textView3.setText(org.telegram.messenger.g0.X2(bd.M0(2131751300, null)));
            if (bd.f21784a0) {
                e10.addView(textView3, mf.o(-1, -2));
                i14 = 5;
                e10.addView(imageView2, mf.r(-2, -2, 5));
            } else {
                i14 = 5;
                e10.addView(imageView2, mf.o(-2, -2));
                e10.addView(textView3, mf.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(bd.M0(2131751292, null), new e(vVar));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
            } else {
                TextView textView4 = new TextView(activity);
                org.telegram.ui.ActionBar.r6.V(textView4, i16, null);
                textView4.setTextSize(1, 16.0f);
                if (bd.f21784a0) {
                    i15 = i14;
                } else {
                    i15 = 3;
                }
                org.telegram.messenger.k5.m(textView4, i15 | 48, null, 2131751299);
                linearLayout.addView(textView4, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(bd.M0(2131747839, null), null);
            }
            twoStepVerificationActivity.showDialog(s1Var);
            return;
        }
        twoStepVerificationActivity.t0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            sf.c.v(vVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url, false);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            vVar.Y = true;
            sf.c.v(vVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url, false);
        }
    }

    public static void e0(v vVar, ArrayList arrayList) {
        int i3;
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        long j10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i14;
        ud udVar = vVar.J;
        ud udVar2 = vVar.I;
        ud udVar3 = vVar.G;
        ud udVar4 = vVar.F;
        ud udVar5 = vVar.E;
        long j11 = vVar.f6132b;
        ud udVar6 = vVar.H;
        boolean z11 = vVar.f6134c;
        int i15 = vVar.f6157u0;
        vVar.f6147n = -1;
        i0 g7 = i0.g(vVar.currentAccount);
        int i16 = vVar.f6130a;
        if (i16 == 0) {
            arrayList.add(r31.h(2, i15, vVar.f6160y));
            arrayList.add(r31.B(-1, null));
            arrayList.add(r31.b(bd.M0(2131752962, null)));
            TLRPC.TL_payments_starsRevenueStats h = g7.h(j11, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                udVar5.f50051a = false;
                udVar5.f50056g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                udVar5.f50057i = starsAmount3;
                udVar5.h = "XTR";
                udVar5.f50055f = "USD";
                z10 = z11;
                double d = vVar.f6144j0;
                udVar5.f50058j = (long) (starsAmount3.amount * d * 100.0d);
                udVar4.f50051a = false;
                udVar4.f50056g = true;
                udVar4.f50057i = tL_starsRevenueStatus2.current_balance;
                udVar4.h = "XTR";
                udVar4.f50058j = (long) (starsAmount.amount * d * 100.0d);
                udVar4.f50055f = "USD";
                udVar3.f50051a = false;
                udVar3.f50056g = true;
                udVar3.f50057i = tL_starsRevenueStatus2.overall_revenue;
                udVar3.h = "XTR";
                udVar3.f50058j = (long) (starsAmount2.amount * d * 100.0d);
                udVar3.f50055f = "USD";
                vVar.v0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = vVar.S;
                if (h.status.withdrawal_enabled) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                linearLayout.setVisibility(i14);
            } else {
                z10 = z11;
            }
            arrayList.add(r31.v(udVar5));
            arrayList.add(r31.v(udVar4));
            arrayList.add(r31.v(udVar3));
            if (z10) {
                i13 = 2131745655;
            } else {
                i13 = 2131752960;
            }
            arrayList.add(r31.B(-2, bd.M0(i13, null)));
            arrayList.add(r31.b(bd.M0(2131752972, null)));
            arrayList.add(r31.j(1, vVar.R));
            arrayList.add(r31.B(-3, vVar.K));
            if (!z10) {
                if (vVar.getMessagesController().f23017g6) {
                    arrayList.add(ii.g.i(2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, vVar.resourceProvider), ln.i0(bd.M0(2131753145, null)), bd.M0(2131753146, null)));
                    arrayList.add(r31.B(-4, null));
                }
                vVar.f6147n = arrayList.size();
                arrayList.add(r31.n(vVar.h, -2));
            }
        } else if (i16 == 1) {
            TLRPC.TL_payments_starsRevenueStats j12 = g7.j(j11, true);
            if (!z11) {
                if (vVar.f6146l0 == null) {
                    vVar.f6146l0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(bd.a0(null, null, 2131753045, 50), -1, 3, new d(vVar, 3), vVar.resourceProvider), true);
                }
                arrayList.add(r31.g(vVar.f6146l0));
            }
            if (vVar.f6150p0 == null && j12 != null) {
                d41 i02 = r41.i0(j12.top_hours_graph, bd.M0(2131753047, null), 0, false);
                vVar.f6150p0 = i02;
                if (i02 != null) {
                    i02.f44549n = true;
                }
            }
            d41 d41Var = vVar.f6150p0;
            if (d41Var != null && !d41Var.f44547l) {
                arrayList.add(r31.h(5, i15, d41Var));
                arrayList.add(r31.B(-1, null));
            }
            if (vVar.f6151q0 == null && j12 != null) {
                TL_stats.StatsGraph statsGraph = j12.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j12.usd_rate);
                }
                i3 = 2;
                vVar.f6151q0 = r41.i0(statsGraph, bd.M0(2131753046, null), 2, false);
            } else {
                i3 = 2;
            }
            d41 d41Var2 = vVar.f6151q0;
            if (d41Var2 != null && !d41Var2.f44547l) {
                arrayList.add(r31.h(i3, i15, d41Var2));
                arrayList.add(r31.B(-2, null));
            }
            if (!vVar.f6149o0 && j12 != null && (tL_starsRevenueStatus = j12.status) != null) {
                double d10 = j12.usd_rate;
                long j13 = tL_starsRevenueStatus.available_balance.amount;
                udVar6.d = j13;
                double d11 = j13 / 1.0E9d;
                udVar6.f50054e = (long) (d11 * d10 * 100.0d);
                if (vVar.f6153r0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    vVar.f6153r0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    vVar.f6153r0.setMaximumFractionDigits(6);
                    vVar.f6153r0.setGroupingUsed(false);
                } else {
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = vVar.f6153r0;
                if (d11 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xd.K("TON " + vVar.f6153r0.format(d11), vVar.f6141g0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(vVar.f6140f0, indexOf, spannableStringBuilder.length(), 33);
                }
                vVar.f6141g0.setText(spannableStringBuilder);
                vVar.f6142h0.setText("≈" + org.telegram.messenger.r1.i().f(j10, "USD"));
                udVar6.f50055f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j12.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                udVar2.d = j14;
                udVar2.f50054e = (long) ((j14 / 1.0E9d) * d10 * 100.0d);
                udVar2.f50055f = "USD";
                udVar.f50051a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                udVar.d = j15;
                udVar.f50054e = (long) ((j15 / 1.0E9d) * d10 * 100.0d);
                udVar.f50055f = "USD";
                vVar.f6149o0 = true;
                gi.d dVar = vVar.f6143i0;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                dVar.setVisibility(i12);
            }
            if (vVar.f6149o0) {
                arrayList.add(r31.b(bd.M0(2131753034, null)));
                arrayList.add(r31.v(udVar6));
                arrayList.add(r31.v(udVar2));
                arrayList.add(r31.v(udVar));
                if (vVar.m0 == null) {
                    vVar.m0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(bd.M0(2131753030, null), -1, 3, new d(vVar, 4), vVar.resourceProvider), true);
                }
                arrayList.add(r31.B(-4, vVar.m0));
            }
            arrayList.add(r31.b(bd.M0(2131753051, null)));
            arrayList.add(r31.k(vVar.f6138e0));
            if (vVar.f6148n0 == null) {
                if (hp.s1(vVar.currentAccount).I5) {
                    i10 = 2131753050;
                } else {
                    i10 = 2131753048;
                }
                vVar.f6148n0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(bd.M0(i10, null), -1, 3, new d(vVar, 5), null), true);
            }
            arrayList.add(r31.B(-5, vVar.f6148n0));
            vVar.f6147n = arrayList.size();
            arrayList.add(r31.n(vVar.h, -2));
        }
    }

    public static int n0(v vVar) {
        return vVar.currentAccount;
    }

    public static int o0(v vVar) {
        return vVar.currentAccount;
    }

    public static int r0(v vVar) {
        return vVar.currentAccount;
    }

    public static String w0(int i3) {
        int i10 = i3 / 86400;
        int i11 = i3 - (86400 * i10);
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
        return bd.a0(null, null, 2131747330, String.format(locale, "%02d", Integer.valueOf(i10)), String.format(locale, "%02d", Integer.valueOf(i12)), String.format(locale, "%02d", Integer.valueOf(i14)));
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        vb vbVar;
        int i3;
        int i10;
        boolean z10;
        View view;
        View view2;
        boolean z11 = this.f6134c;
        int i11 = this.f6130a;
        if (i11 != 1 && z11) {
            this.f6139f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        } else {
            gt0 gt0Var = new gt0(context);
            this.f6139f = gt0Var;
            gt0Var.setCommonInsetsManagedExternally(true);
            this.f6139f.setGeometry(new bb.c(this, 9));
            gt0 gt0Var2 = this.f6139f;
            gt0Var2.getClass();
            this.h = new ai.x2(26, context, gt0Var2);
            frameLayout = this.f6139f;
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7));
        this.d = new jn(context, null, false, getResourceProvider());
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f6132b));
        this.d.k(a22, true);
        this.simpleActionBar.setTitle(l10.p(a22));
        if (i11 == 0) {
            this.simpleActionBar.setSubtitle(bd.M0(2131752949, null));
        } else {
            this.simpleActionBar.setSubtitle(bd.M0(2131752948, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 1));
        this.simpleActionBar.setBackground(null);
        if (i11 == 0 && this.f6139f != null) {
            vbVar = new vb(context, this.currentAccount, false, this.f6132b, getClassGuid(), getResourceProvider(), this.f6139f);
        } else {
            vbVar = null;
        }
        this.L = vbVar;
        if (i11 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.M = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.M.setClipToPadding(false);
            vj0 vj0Var = new vj0(context, this.resourceProvider, this.f6139f);
            this.O = vj0Var;
            vj0Var.setAdapter(new t(this, context, vj0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.N = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            this.N.addView(vj0Var.j(-2, true), mf.e(-1, 48, 48));
            this.M.addView(vj0Var, mf.c(-1.0f, -1));
        } else if (vbVar != null) {
            this.O = vbVar.getViewPager();
            this.N = this.L.getTabsContainer();
        }
        q qVar = new q(context, 0);
        this.R = qVar;
        qVar.setOrientation(1);
        q qVar2 = this.R;
        int i12 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.i(i12, qVar2, getResourceProvider());
        this.R.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.U = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.h6 h6Var2 = this.U;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i13, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.U.setGravity(17);
        this.T = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.U, mf.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.V = h6Var3;
        h6Var3.setGravity(17);
        org.telegram.ui.Components.h6 h6Var4 = this.V;
        int i14 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var4, i14, getResourceProvider());
        this.V.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.R.addView(this.V, mf.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        r rVar = new r(0, context, this);
        this.W = rVar;
        rVar.setText(bd.M0(2131752953, null));
        this.W.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        s sVar = new s(context, 0);
        this.f6131a0 = sVar;
        sVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.V(this.f6131a0, i13, getResourceProvider());
        this.f6131a0.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f6131a0.setCursorWidth(1.5f);
        this.f6131a0.setBackground(null);
        this.f6131a0.setTextSize(1, 18.0f);
        this.f6131a0.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        this.f6131a0.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        this.f6131a0.setInputType(2);
        this.f6131a0.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.D(this.f6131a0, org.telegram.ui.ActionBar.k6.ig, getResourceProvider());
        org.telegram.ui.ActionBar.r6.z(this.f6131a0, org.telegram.ui.ActionBar.k6.f27998jg, getResourceProvider());
        s sVar2 = this.f6131a0;
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        sVar2.setGravity(i3);
        this.f6131a0.setOnFocusChangeListener(new m(this, 0));
        this.f6131a0.addTextChangedListener(new bh.h(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232750);
        linearLayout.addView(imageView, mf.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.f6131a0, mf.p(-1, -2, 1.0f, 119));
        this.W.e(this.f6131a0);
        this.W.addView(linearLayout, mf.e(-1, -2, 48));
        this.f6131a0.setOnEditorActionListener(new o(this, 0));
        this.R.addView(this.W, mf.t(-1, -2, 1, 18, 14, 18, 2));
        this.W.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.S = linearLayout2;
        linearLayout2.setOrientation(0);
        ai.x xVar = new ai.x(1, context, getResourceProvider(), true);
        xVar.setRoundRadius(24);
        this.f6133b0 = xVar;
        xVar.setEnabled(hp.s1(this.currentAccount).I5);
        this.f6133b0.i(bd.M0(2131752969, null), false, true);
        this.f6133b0.setOnClickListener(new View.OnClickListener(this) {
            public final v f5718b;

            {
                this.f5718b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f5718b.y0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            v vVar = this.f5718b;
                            if (!vVar.f6143i0.R) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ai.n nVar = new ai.n(9, vVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.f42083a0 = 1;
                                twoStepVerificationActivity.f42087c0 = nVar;
                                vVar.f6143i0.setLoading(true);
                                twoStepVerificationActivity.x0(new h(vVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        gi.d dVar = new gi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f6135c0 = dVar;
        dVar.setEnabled(true);
        this.f6135c0.i(bd.M0(2131748382, null), false, true);
        this.f6135c0.setOnClickListener(new ai.d(5, this, context));
        this.S.addView(this.f6133b0, mf.p(-1, 48, 1.0f, 119));
        if (!z11) {
            this.S.addView(new Space(context), mf.p(8, 48, 0.0f, 119));
            this.S.addView(this.f6135c0, mf.p(-1, 48, 1.0f, 119));
        }
        this.R.addView(this.S, mf.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        q qVar3 = new q(context, 1);
        this.f6138e0 = qVar3;
        qVar3.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i12, this.f6138e0, this.resourceProvider);
        this.f6138e0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var5 = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f6141g0 = h6Var5;
        h6Var5.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(this.f6141g0, i13, this.resourceProvider);
        this.f6141g0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.f6141g0.setGravity(17);
        this.f6140f0 = new RelativeSizeSpan(0.6770833f);
        this.f6138e0.addView(this.f6141g0, mf.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var6 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.f6142h0 = h6Var6;
        h6Var6.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(this.f6142h0, i14, this.resourceProvider);
        this.f6142h0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f6138e0.addView(this.f6142h0, mf.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        gi.d dVar2 = new gi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f6143i0 = dVar2;
        dVar2.setEnabled(hp.s1(this.currentAccount).I5);
        gi.d dVar3 = this.f6143i0;
        if (z11) {
            i10 = 2131748383;
        } else {
            i10 = 2131748359;
        }
        dVar3.i(bd.M0(i10, null), false, true);
        this.f6143i0.setVisibility(8);
        this.f6143i0.setOnClickListener(new View.OnClickListener(this) {
            public final v f5718b;

            {
                this.f5718b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f5718b.y0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            v vVar = this.f5718b;
                            if (!vVar.f6143i0.R) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ai.n nVar = new ai.n(9, vVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.f42083a0 = 1;
                                twoStepVerificationActivity.f42087c0 = nVar;
                                vVar.f6143i0.setLoading(true);
                                twoStepVerificationActivity.x0(new h(vVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f6138e0.addView(this.f6143i0, mf.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        l41 l41Var = new l41(this, new ai.c(this, 11), new e(this), new a3.j(this, 17));
        this.f6137e = l41Var;
        l41Var.r1();
        l41 l41Var2 = this.f6137e;
        l41Var2.f35594g3.f33698r = false;
        l41Var2.setCaptureSectionsDecoratorAllowed(true);
        this.f6137e.setClipToPadding(false);
        this.f6137e.setOverScrollMode(0);
        gt0 gt0Var3 = this.f6139f;
        if (gt0Var3 != null) {
            l41 l41Var3 = this.f6137e;
            getParentActivity();
            kg.f0 f0Var = new kg.f0(5, gt0Var3, false);
            l41Var3.f35593f3 = f0Var;
            l41Var3.setLayoutManager(f0Var);
            this.f6139f.u(this.f6137e, new e(this));
            z10 = true;
            if (i11 == 1) {
                view2 = this.M;
            } else {
                view2 = this.L;
            }
            this.f6139f.x(view2, this.O, new e(this));
            FrameLayout frameLayout5 = this.N;
            this.f6139f.y(frameLayout5);
            frameLayout5.setLayoutParams(mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z10 = true;
            frameLayout2.addView(this.f6137e, mf.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.f6137e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.f6152r = new View(getParentActivity());
        if (this.f6139f != null) {
            view = this.N;
        } else {
            view = this.simpleActionBar;
        }
        frameLayout2.addView(this.f6152r, frameLayout2.indexOfChild(view), mf.e(-1, 0, 48));
        this.f6152r.setBackground(getBaseSimpleGlass().a(this.f6152r));
        qe.a aVar = new qe.a(0, new e(this), xq.h, 380L, false);
        this.f6154s = aVar;
        gt0 gt0Var4 = this.f6139f;
        aVar.a((gt0Var4 == null || !gt0Var4.f34196f0) ? false : false, false);
        if (this.f6139f != null) {
            getBaseSimpleGlass().f53533m = this.f6139f;
            vb vbVar2 = this.L;
            if (vbVar2 != null) {
                vbVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.O);
            }
            getBaseSimpleGlass().f53534n = new g(0, this, new f(0, frameLayout2));
            FrameLayout frameLayout6 = this.N;
            gh.g c2 = getBaseSimpleGlass().f53525c.c(frameLayout6, null, false);
            c2.p(cd.m(this.resourceProvider));
            c2.q(org.telegram.messenger.g0.L(9.66f));
            c2.r(org.telegram.messenger.g0.L(18.0f));
            frameLayout6.setBackground(c2);
        }
        org.telegram.messenger.g0.E2(this.d.f35127e);
        frameLayout2.addView(this.d.f35127e, mf.e(42, 42, 53));
        s0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.C3 && ((Long) objArr[0]).longValue() == this.f6132b) {
            t0();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false)) <= 0.721f) {
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
        n61 n61Var = this.O;
        if (n61Var != null && n61Var.canScrollHorizontally(-1)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.C3);
        t0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.P = true;
        hs.f(this.currentAccount).n(this, hs.C3);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        s0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            jn jnVar = this.d;
            if (jnVar != null) {
                jnVar.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Cj, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dj, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0() {
        if (this.f6137e != null) {
            int i3 = 0;
            org.telegram.messenger.g0.B3(this.d.f35127e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f14496b, org.telegram.messenger.g0.L(6.0f), 0);
            l41 l41Var = this.f6137e;
            i0.b bVar = this.mSystemInsets;
            pi.a.e(l41Var, bVar.f14496b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
            if (this.f6139f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6137e.getLayoutParams();
                this.f6139f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                gt0 gt0Var = this.f6139f;
                gt0Var.B();
                gt0Var.requestLayout();
                gt0Var.invalidate();
            }
            if (this.f6152r != null) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f14496b;
                if (this.f6139f != null) {
                    i3 = org.telegram.messenger.g0.L(44.0f);
                }
                int i10 = currentActionBarHeight + i3;
                ViewGroup.LayoutParams layoutParams = this.f6152r.getLayoutParams();
                if (layoutParams.height != i10) {
                    layoutParams.height = i10;
                    this.f6152r.setLayoutParams(layoutParams);
                }
                x0();
            }
        }
    }

    public final void t0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10;
        ng.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        boolean z11 = false;
        TLRPC.TL_payments_starsRevenueStats h = i0.g(this.currentAccount).h(this.f6132b, false);
        if (h == this.f6158w) {
            if (h == null) {
                tL_starsRevenueStatus2 = null;
            } else {
                tL_starsRevenueStatus2 = h.status;
            }
            if (tL_starsRevenueStatus2 == this.f6159x) {
                return;
            }
        }
        this.f6158w = h;
        if (h == null) {
            tL_starsRevenueStatus = null;
        } else {
            tL_starsRevenueStatus = h.status;
        }
        this.f6159x = tL_starsRevenueStatus;
        if (h != null) {
            this.f6144j0 = h.usd_rate;
            d41 i02 = r41.i0(h.revenue_graph, bd.M0(2131752963, null), 2, false);
            this.f6160y = i02;
            if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f6160y.d.d.get(0) != null) {
                d41 d41Var = this.f6160y;
                d41Var.h = true;
                ((ng.a) d41Var.d.d.get(0)).f20371g = org.telegram.ui.ActionBar.k6.mk;
                this.f6160y.d.h = (float) ((1.0d / this.f6144j0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            v0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            l41 l41Var = this.f6137e;
            if (l41Var != null) {
                gt0 gt0Var = this.f6139f;
                if (gt0Var != null && gt0Var.f34196f0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f41 f41Var = l41Var.f35594g3;
                if (gt0Var == null) {
                    z11 = true;
                }
                f41Var.O(z11);
                if (z10) {
                    this.f6139f.a();
                }
            }
        }
    }

    public final void u0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f10 = h10.i(this.currentAccount).f();
        if (parentActivity != null && f10 != null) {
            long j11 = this.f6132b;
            if (z10) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = hp.s1(this.currentAccount).j1(j11);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = j10;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = hp.s1(this.currentAccount).j1(j11);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new j(this, twoStepVerificationActivity, parentActivity, z10, j10));
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(TL_stars.StarsAmount starsAmount, int i3) {
        int i10;
        if (this.U != null && this.V != null) {
            long j10 = (long) (this.f6144j0 * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wb.a1(false, TextUtils.concat("XTR ", wb.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.T, indexOf, spannableStringBuilder.length(), 33);
            }
            this.U.setText(spannableStringBuilder);
            this.V.setText("≈" + org.telegram.messenger.r1.i().f(j10, "USD"));
            r rVar = this.W;
            if (j10 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            rVar.setVisibility(i10);
            if (this.Y) {
                this.X = true;
                s sVar = this.f6131a0;
                long j11 = starsAmount.amount;
                this.Z = j11;
                sVar.setText(Long.toString(j11));
                s sVar2 = this.f6131a0;
                sVar2.setSelection(sVar2.getText().length());
                this.X = false;
                ai.x xVar = this.f6133b0;
                if (this.Z > 0) {
                    z10 = true;
                }
                xVar.setEnabled(z10);
            }
            this.Q = i3;
            d dVar = this.f6156t0;
            org.telegram.messenger.g0.r(dVar);
            dVar.run();
        }
    }

    public final void x0() {
        float f10;
        View view = this.f6152r;
        if (view == null) {
            return;
        }
        qe.a aVar = this.f6154s;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f53840e;
        }
        if (this.f6139f != null) {
            f11 = org.telegram.messenger.g0.L(44.0f) * (-(1.0f - f10));
        }
        view.setTranslationY(f11);
    }

    public final void y0() {
        ai.x xVar = this.f6133b0;
        if (xVar.f12517d0 && !xVar.R) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.Q > currentTime) {
                this.f6145k0 = org.telegram.ui.Components.fc.a0(this).Q(2131624291, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752952, w0(this.Q - currentTime)))).j();
            } else if (this.Z < getMessagesController().R5) {
                org.telegram.ui.Components.fc.a0(this).M(getParentActivity().getResources().getDrawable(2131232750).mutate(), org.telegram.messenger.g0.U2(bd.G((int) getMessagesController().R5, "BotStarsWithdrawMinLimit", new Object[0]), new d(this, 1))).j();
            } else {
                long j10 = this.Z;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                i iVar = new i(this, j10, twoStepVerificationActivity, 0);
                twoStepVerificationActivity.f42083a0 = 1;
                twoStepVerificationActivity.f42087c0 = iVar;
                this.f6133b0.setLoading(true);
                twoStepVerificationActivity.x0(new h(this, twoStepVerificationActivity, 1));
            }
        }
    }
}
