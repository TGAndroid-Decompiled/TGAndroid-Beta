package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.fb;
import di.pb;
import hi.cb;
import hi.ea;
import hi.ja;
import hi.na;
import hi.sa;
import hi.wa;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.qc;
import org.telegram.messenger.tr;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.yk;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.cx;
import org.telegram.ui.f40;
import org.telegram.ui.r90;
import org.telegram.ui.th;
public final class c4 implements Runnable {
    public final int f3483a;
    public final long f3484b;
    public final Object f3485c;

    public c4(long j3, aa.r rVar) {
        this.f3483a = 0;
        this.f3484b = j3;
        this.f3485c = rVar;
    }

    @Override
    public final void run() {
        na naVar;
        Context context;
        boolean z10;
        int i7;
        int i10;
        int L;
        boolean z11;
        int i11;
        int i12 = this.f3483a;
        boolean z12 = false;
        r12 = 0;
        int i13 = 0;
        org.telegram.ui.ActionBar.h6 h6Var = null;
        long j3 = this.f3484b;
        Object obj = this.f3485c;
        switch (i12) {
            case 0:
                i4.f3726b.add(Long.valueOf(j3));
                i4.j(j3, 60000L);
                ((aa.r) obj).run();
                gc Q = i4.h().Q(2131623990, 36, hd.N0(2131749546, null));
                Q.f35537t = true;
                Q.j();
                return;
            case 1:
                lc.b0((pb) obj).I(2131624227, hd.N0(2131750204, null), hd.H(',', "Gift2Converted", (int) j3)).k(true);
                return;
            case 2:
                lc.b0((c51) obj).I(2131624227, hd.N0(2131750204, null), hd.H(',', "Gift2ConvertedChannel", (int) j3)).k(true);
                return;
            case 3:
                ((fi.q) obj).f12476s.h0(j3, false);
                return;
            case 4:
                fi.z3 z3Var = ((fi.j2) obj).f12178a;
                if (j3 <= 0) {
                    z12 = true;
                }
                z3Var.i0(z12);
                return;
            case 5:
                org.telegram.messenger.g0.h3((fi.l3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 6:
                org.telegram.ui.ActionBar.g2 g02 = c51.g0(np.u1(((fi.p6) obj).f12425a).O0(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 != 0) {
                    sa saVar = sa.G2;
                    if (saVar != null && saVar.d) {
                        ?? obj2 = new Object();
                        obj2.f28905a = true;
                        Q2.showAsSheet(g02, obj2);
                        return;
                    }
                    Q2.presentFragment(g02);
                    return;
                }
                return;
            case 7:
                ur urVar = ((fi.c7) obj).f11858b;
                SQLiteDatabase sQLiteDatabase = urVar.f27252b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    urVar.o(th2, true);
                    return;
                }
            case 8:
                hi.k8 k8Var = (hi.k8) obj;
                Context context2 = k8Var.getContext();
                hi.p8 p8Var = k8Var.f14930a0;
                org.telegram.ui.ActionBar.g2 g2Var = p8Var.f30197j1;
                int i14 = hi.p8.Y1;
                org.telegram.ui.Components.c5.P(context2, g2Var, p8Var.J0, new ai.d0(k8Var, j3, 2));
                return;
            case 9:
                sa saVar2 = (sa) obj;
                na naVar2 = saVar2.G;
                if (naVar2 != null) {
                    naVar2.f(true);
                    saVar2.G = null;
                }
                ja jaVar = saVar2.f15462y;
                if (jaVar != null) {
                    naVar = jaVar.a(j3);
                } else {
                    naVar = null;
                }
                saVar2.G = naVar;
                if (naVar != null) {
                    saVar2.K = naVar.f15135a;
                    saVar2.f15437r.c();
                    ea eaVar = saVar2.f15412i0;
                    int i15 = saVar2.K;
                    if (i15 != 1 && i15 != 0) {
                        i13 = -14737633;
                    }
                    eaVar.setBackgroundColor(i13);
                    saVar2.I.set(saVar2.G.f15137c);
                    na naVar3 = saVar2.G;
                    saVar2.H = naVar3.f15136b;
                    naVar3.e();
                    if (cz.o() > 1) {
                        qc.e(360928);
                    }
                }
                saVar2.f15462y = null;
                Activity activity = saVar2.f15388b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f43157y0.post(new hi.r8(saVar2, 5));
                    return;
                } else {
                    saVar2.p(true);
                    return;
                }
            case 10:
                wa waVar = ((cb) obj).f14397a;
                if (waVar != null) {
                    waVar.M(j3, false);
                    return;
                }
                return;
            case 11:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                try {
                    ur.a0(h0Var.f17518t0).f27252b.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                li.d0 d0Var = (li.d0) obj;
                np.u1(d0Var.f30173a).W2(this.f3484b, d0Var.f19934p1, true, false, new li.t(d0Var, 1));
                return;
            case 13:
                li.k0 k0Var = (li.k0) obj;
                k0Var.f19985i = null;
                k0Var.f19984g.l(j3);
                k0Var.f19988l++;
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.F();
                    return;
                }
                return;
            case 14:
                String str = h2.l0.f13815a;
                m2.d dVar = ((l2.z) ((n2.s) ((k8.a) obj).f18215c)).f19628a.f19375s;
                m2.a U = dVar.U();
                dVar.V(U, 1010, new m2.c(U, j3));
                return;
            case 15:
                oi.o oVar = (oi.o) obj;
                org.telegram.ui.Components.c5.J(oVar.f37520b.f40368a2.getParentActivity(), j3, new hi.t5(oVar, 18), oVar.f37519a);
                return;
            case 16:
                oi.b2 b2Var = (oi.b2) obj;
                org.telegram.ui.Components.c5.J(b2Var.getParentActivity(), j3, new hi.w4(b2Var, 18), b2Var.getResourceProvider());
                return;
            case 17:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$7(j3);
                return;
            case 18:
                ((VideoCapturerDevice) obj).lambda$init$3(j3);
                return;
            case 19:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j3);
                return;
            case 20:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj;
                if (t3Var != null) {
                    t3Var.a(true);
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new bn(a8.p0.j(j3, "user_id")));
                    return;
                }
                return;
            case 21:
                gc Q3 = lc.b0((org.telegram.ui.x6) obj).Q(2131624052, 36, hd.a0(null, null, 2131752633, org.telegram.messenger.g0.i0(j3, false, false)));
                Q3.f35535r = false;
                Q3.j();
                return;
            case 22:
                eg egVar = (eg) obj;
                egVar.getClass();
                egVar.presentFragment(bn.ua(j3));
                return;
            case 23:
                zk zkVar = (zk) obj;
                ui uiVar = zkVar.f37520b;
                if (!zkVar.L && zkVar.M0 && zkVar.isShown()) {
                    hi hiVar = uiVar.f40414p3;
                    org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40368a2;
                    if ((hiVar.Q() <= org.telegram.messenger.g0.L(20.0f) || zkVar.C0 || zkVar.L0) && SystemClock.uptimeMillis() < j3) {
                        zkVar.postDelayed(zkVar.P0, 32L);
                        return;
                    }
                    zkVar.P0 = null;
                    org.telegram.ui.ActionBar.h6 h6Var2 = zkVar.f37519a;
                    if (g2Var2 != null && g2Var2.getParentActivity() != null) {
                        context = g2Var2.getParentActivity();
                    } else {
                        context = zkVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var2);
                        String N0 = hd.N0(2131742959, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                        t1Var.S = N0;
                        kg.z0 z0Var = new kg.z0(zkVar, context);
                        z0Var.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.t6.U(z0Var, org.telegram.ui.ActionBar.m6.f29489j5, h6Var2);
                        org.telegram.ui.ActionBar.t6.D(z0Var, org.telegram.ui.ActionBar.m6.f29677t5, h6Var2);
                        z0Var.setHint(hd.N0(2131742923, null));
                        z0Var.setText(zkVar.f42924t0);
                        z0Var.setSelection(z0Var.length());
                        z0Var.setInputType(147457);
                        z0Var.setMaxLines(5);
                        z0Var.setImeOptions(6);
                        org.telegram.ui.ActionBar.t6.F(z0Var, org.telegram.ui.ActionBar.m6.f29510k6, org.telegram.ui.ActionBar.m6.f29528l6, org.telegram.ui.ActionBar.m6.f29602p7, h6Var2);
                        z0Var.setBackground(null);
                        z0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context, h6Var2);
                        int i16 = org.telegram.ui.ActionBar.m6.f29473i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i16, h6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
                        d2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.t6.j(d2Var, h02, null, M, h6Var2);
                        String N02 = hd.N0(2131742830, null);
                        if (zkVar.f42925u0 && zkVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        d2Var.e(N02, "", z10, false, false);
                        d2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (hd.f24444a0) {
                            i7 = 5;
                        } else {
                            i7 = 3;
                        }
                        layoutParams.gravity = i7 | 16;
                        d2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (hd.f24444a0) {
                            i10 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i10 = 0;
                        }
                        int L2 = org.telegram.messenger.g0.L(12.0f);
                        if (hd.f24444a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        d2Var.setPadding(i10, L2, L, org.telegram.messenger.g0.L(12.0f));
                        if (zkVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        d2Var.setEnabled(z11);
                        d2Var.setOnClickListener(new org.telegram.ui.Components.j1(d2Var, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(z0Var, ma.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(d2Var, ma.t(-1, -2, 83, 8, 0, 8, 0));
                        t1Var.H = 6;
                        alertDialog$Builder.o(linearLayout);
                        t1Var.f30010a = org.telegram.messenger.g0.L(292.0f);
                        alertDialog$Builder.h(hd.N0(2131752577, null), new org.telegram.ui.Components.l2(19));
                        alertDialog$Builder.k(hd.N0(2131754483, null), new a3.h(zkVar, z0Var, d2Var, 27));
                        zkVar.U0 = t1Var;
                        t1Var.f30035k0 = false;
                        t1Var.setOnShowListener(new org.telegram.ui.Components.p2(z0Var, 1));
                        t1Var.setOnDismissListener(new org.telegram.ui.Components.z0(zkVar, 4));
                        t1Var.create();
                        Window window = t1Var.getWindow();
                        Rect rect = new Rect();
                        uiVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        if (window != null && rect.height() > 0) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            View decorView = window.getDecorView();
                            int i17 = attributes.width;
                            if (i17 <= 0) {
                                i17 = rect.width();
                            }
                            if (attributes.width > 0) {
                                i11 = 1073741824;
                            } else {
                                i11 = Integer.MIN_VALUE;
                            }
                            decorView.measure(View.MeasureSpec.makeMeasureSpec(i17, i11), View.MeasureSpec.makeMeasureSpec(rect.height(), Integer.MIN_VALUE));
                            attributes.gravity = 49;
                            attributes.y = Math.max(0, (rect.height() - decorView.getMeasuredHeight()) / 2);
                            window.setAttributes(attributes);
                        }
                        t1Var.show();
                        View d = t1Var.d(-1);
                        if ((d instanceof TextView) && !TextUtils.isEmpty(zkVar.f42924t0)) {
                            z0Var.addTextChangedListener(new yk(z0Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                zkVar.P0 = null;
                return;
            case 24:
                le0 le0Var = (le0) obj;
                le0Var.getClass();
                le0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                org.telegram.messenger.g0.h3(new he0(le0Var, 1), 100L);
                return;
            case 25:
                of0 of0Var = (of0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (!PhotoViewer.p1().P1() && (T2 == null || !T2.hasShownSheet())) {
                    if (T2 != null) {
                        h6Var = T2.getResourceProvider();
                    }
                } else {
                    h6Var = new fi.b();
                }
                new fb(u02, h6Var, this.f3484b, 15, "", new lf0(of0Var, 0), 0L).show();
                return;
            case 26:
                cx cxVar = (cx) obj;
                cxVar.U4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(tr.a(j3, 0L));
                cxVar.E2.y(cxVar, arrayList, null, false, cxVar.L2, cxVar.M2, cxVar.N2, null);
                return;
            case 27:
                ((f40) obj).q1(j3, false);
                return;
            case 28:
                r90 r90Var = (r90) obj;
                r90Var.getClass();
                r90Var.presentFragment(bn.ua(j3));
                return;
            default:
                bn bnVar = ((th) obj).f52335f;
                bnVar.P7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == bnVar.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public c4(Object obj, long j3, int i7) {
        this.f3483a = i7;
        this.f3485c = obj;
        this.f3484b = j3;
    }
}
