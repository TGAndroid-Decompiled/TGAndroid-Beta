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
import c8.na;
import di.fb;
import di.pb;
import hi.db;
import hi.fa;
import hi.ka;
import hi.oa;
import hi.ta;
import hi.xa;
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
import org.telegram.ui.Components.dg;
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
import org.telegram.ui.sh;
public final class e4 implements Runnable {
    public final int f3504a;
    public final long f3505b;
    public final Object f3506c;

    public e4(long j3, aa.r rVar) {
        this.f3504a = 0;
        this.f3505b = j3;
        this.f3506c = rVar;
    }

    @Override
    public final void run() {
        oa oaVar;
        Context context;
        boolean z10;
        int i7;
        int i10;
        int L;
        boolean z11;
        int i11;
        int i12 = this.f3504a;
        boolean z12 = false;
        r12 = 0;
        int i13 = 0;
        org.telegram.ui.ActionBar.h6 h6Var = null;
        long j3 = this.f3505b;
        Object obj = this.f3506c;
        switch (i12) {
            case 0:
                l4.f3802b.add(Long.valueOf(j3));
                l4.j(j3, 60000L);
                ((aa.r) obj).run();
                gc Q = l4.h().Q(2131623990, 36, hd.N0(2131749546, null));
                Q.f35499t = true;
                Q.j();
                return;
            case 1:
                lc.b0((pb) obj).I(2131624227, hd.N0(2131750204, null), hd.H(',', "Gift2Converted", (int) j3)).k(true);
                return;
            case 2:
                lc.b0((c51) obj).I(2131624227, hd.N0(2131750204, null), hd.H(',', "Gift2ConvertedChannel", (int) j3)).k(true);
                return;
            case 3:
                ((fi.q) obj).f12428s.h0(j3, false);
                return;
            case 4:
                fi.z3 z3Var = ((fi.j2) obj).f12138a;
                if (j3 <= 0) {
                    z12 = true;
                }
                z3Var.i0(z12);
                return;
            case 5:
                org.telegram.messenger.g0.h3((fi.l3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 6:
                org.telegram.ui.ActionBar.g2 g02 = c51.g0(np.u1(((fi.p6) obj).f12377a).O0(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 != 0) {
                    ta taVar = ta.G2;
                    if (taVar != null && taVar.d) {
                        ?? obj2 = new Object();
                        obj2.f28871a = true;
                        Q2.showAsSheet(g02, obj2);
                        return;
                    }
                    Q2.presentFragment(g02);
                    return;
                }
                return;
            case 7:
                ur urVar = ((fi.c7) obj).f11810b;
                SQLiteDatabase sQLiteDatabase = urVar.f27216b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    urVar.o(th2, true);
                    return;
                }
            case 8:
                hi.l8 l8Var = (hi.l8) obj;
                Context context2 = l8Var.getContext();
                hi.q8 q8Var = l8Var.f14942a0;
                org.telegram.ui.ActionBar.g2 g2Var = q8Var.f30163j1;
                int i14 = hi.q8.Y1;
                org.telegram.ui.Components.c5.P(context2, g2Var, q8Var.J0, new ai.y(l8Var, j3, 2));
                return;
            case 9:
                ta taVar2 = (ta) obj;
                oa oaVar2 = taVar2.G;
                if (oaVar2 != null) {
                    oaVar2.f(true);
                    taVar2.G = null;
                }
                ka kaVar = taVar2.f15465y;
                if (kaVar != null) {
                    oaVar = kaVar.a(j3);
                } else {
                    oaVar = null;
                }
                taVar2.G = oaVar;
                if (oaVar != null) {
                    taVar2.K = oaVar.f15157a;
                    taVar2.f15440r.c();
                    fa faVar = taVar2.f15415i0;
                    int i15 = taVar2.K;
                    if (i15 != 1 && i15 != 0) {
                        i13 = -14737633;
                    }
                    faVar.setBackgroundColor(i13);
                    taVar2.I.set(taVar2.G.f15159c);
                    oa oaVar3 = taVar2.G;
                    taVar2.H = oaVar3.f15158b;
                    oaVar3.e();
                    if (cz.o() > 1) {
                        qc.e(360928);
                    }
                }
                taVar2.f15465y = null;
                Activity activity = taVar2.f15391b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f43122y0.post(new hi.s8(taVar2, 5));
                    return;
                } else {
                    taVar2.p(true);
                    return;
                }
            case 10:
                xa xaVar = ((db) obj).f14421a;
                if (xaVar != null) {
                    xaVar.M(j3, false);
                    return;
                }
                return;
            case 11:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                try {
                    ur.a0(h0Var.f17484t0).f27216b.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                li.d0 d0Var = (li.d0) obj;
                np.u1(d0Var.f30139a).W2(this.f3505b, d0Var.f19900p1, true, false, new li.t(d0Var, 1));
                return;
            case 13:
                li.k0 k0Var = (li.k0) obj;
                k0Var.f19951i = null;
                k0Var.f19950g.l(j3);
                k0Var.f19954l++;
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.F();
                    return;
                }
                return;
            case 14:
                String str = h2.l0.f13778a;
                m2.d dVar = ((l2.z) ((n2.s) ((k8.a) obj).f18178c)).f19594a.f19341s;
                m2.a U = dVar.U();
                dVar.V(U, 1010, new m2.c(U, j3));
                return;
            case 15:
                oi.o oVar = (oi.o) obj;
                org.telegram.ui.Components.c5.J(oVar.f37477b.f40352a2.getParentActivity(), j3, new hi.u5(oVar, 18), oVar.f37476a);
                return;
            case 16:
                oi.a2 a2Var = (oi.a2) obj;
                org.telegram.ui.Components.c5.J(a2Var.getParentActivity(), j3, new hi.x4(a2Var, 18), a2Var.getResourceProvider());
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
                Q3.f35497r = false;
                Q3.j();
                return;
            case 22:
                dg dgVar = (dg) obj;
                dgVar.getClass();
                dgVar.presentFragment(bn.ua(j3));
                return;
            case 23:
                zk zkVar = (zk) obj;
                ui uiVar = zkVar.f37477b;
                if (!zkVar.L && zkVar.M0 && zkVar.isShown()) {
                    hi hiVar = uiVar.f40398p3;
                    org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40352a2;
                    if ((hiVar.Q() <= org.telegram.messenger.g0.L(20.0f) || zkVar.C0 || zkVar.L0) && SystemClock.uptimeMillis() < j3) {
                        zkVar.postDelayed(zkVar.P0, 32L);
                        return;
                    }
                    zkVar.P0 = null;
                    org.telegram.ui.ActionBar.h6 h6Var2 = zkVar.f37476a;
                    if (g2Var2 != null && g2Var2.getParentActivity() != null) {
                        context = g2Var2.getParentActivity();
                    } else {
                        context = zkVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var2);
                        String N0 = hd.N0(2131742961, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        t1Var.S = N0;
                        kg.a1 a1Var = new kg.a1(zkVar, context);
                        a1Var.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.t6.U(a1Var, org.telegram.ui.ActionBar.m6.f29455j5, h6Var2);
                        org.telegram.ui.ActionBar.t6.D(a1Var, org.telegram.ui.ActionBar.m6.f29643t5, h6Var2);
                        a1Var.setHint(hd.N0(2131742925, null));
                        a1Var.setText(zkVar.f42883t0);
                        a1Var.setSelection(a1Var.length());
                        a1Var.setInputType(147457);
                        a1Var.setMaxLines(5);
                        a1Var.setImeOptions(6);
                        org.telegram.ui.ActionBar.t6.F(a1Var, org.telegram.ui.ActionBar.m6.f29476k6, org.telegram.ui.ActionBar.m6.f29494l6, org.telegram.ui.ActionBar.m6.f29568p7, h6Var2);
                        a1Var.setBackground(null);
                        a1Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context, h6Var2);
                        int i16 = org.telegram.ui.ActionBar.m6.f29439i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i16, h6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
                        d2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.t6.j(d2Var, h02, null, M, h6Var2);
                        String N02 = hd.N0(2131742832, null);
                        if (zkVar.f42884u0 && zkVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        d2Var.e(N02, "", z10, false, false);
                        d2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (hd.f24408a0) {
                            i7 = 5;
                        } else {
                            i7 = 3;
                        }
                        layoutParams.gravity = i7 | 16;
                        d2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (hd.f24408a0) {
                            i10 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i10 = 0;
                        }
                        int L2 = org.telegram.messenger.g0.L(12.0f);
                        if (hd.f24408a0) {
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
                        linearLayout.addView(a1Var, na.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(d2Var, na.t(-1, -2, 83, 8, 0, 8, 0));
                        t1Var.H = 6;
                        alertDialog$Builder.o(linearLayout);
                        t1Var.f29976a = org.telegram.messenger.g0.L(292.0f);
                        alertDialog$Builder.h(hd.N0(2131752577, null), new org.telegram.ui.Components.l2(19));
                        alertDialog$Builder.k(hd.N0(2131754483, null), new a3.h(zkVar, a1Var, d2Var, 27));
                        zkVar.U0 = t1Var;
                        t1Var.f30001k0 = false;
                        t1Var.setOnShowListener(new org.telegram.ui.Components.p2(a1Var, 1));
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
                        if ((d instanceof TextView) && !TextUtils.isEmpty(zkVar.f42883t0)) {
                            a1Var.addTextChangedListener(new yk(a1Var, (TextView) d));
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
                new fb(u02, h6Var, this.f3505b, 15, "", new lf0(of0Var, 0), 0L).show();
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
                bn bnVar = ((sh) obj).f52013f;
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

    public e4(Object obj, long j3, int i7) {
        this.f3504a = i7;
        this.f3506c = obj;
        this.f3505b = j3;
    }
}
