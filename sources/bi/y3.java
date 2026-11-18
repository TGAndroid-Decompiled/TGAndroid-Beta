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
import hi.db;
import hi.fa;
import hi.ka;
import hi.oa;
import hi.ta;
import hi.xa;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.sr;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.xk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.cx;
import org.telegram.ui.f40;
import org.telegram.ui.q90;
import org.telegram.ui.sh;
public final class y3 implements Runnable {
    public final int f4275a;
    public final long f4276b;
    public final Object f4277c;

    public y3(long j3, aa.r rVar) {
        this.f4275a = 0;
        this.f4276b = j3;
        this.f4277c = rVar;
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
        int i12 = this.f4275a;
        boolean z12 = false;
        r12 = 0;
        int i13 = 0;
        org.telegram.ui.ActionBar.i6 i6Var = null;
        long j3 = this.f4276b;
        Object obj = this.f4277c;
        switch (i12) {
            case 0:
                f4.i(j3, 60000L);
                ((aa.r) obj).run();
                gc Q = f4.g().Q(2131623990, 36, gd.M0(2131749547, null));
                Q.f35471t = true;
                Q.j();
                return;
            case 1:
                lc.b0((pb) obj).I(2131624227, gd.M0(2131750205, null), gd.H(',', "Gift2Converted", (int) j3)).k(true);
                return;
            case 2:
                lc.b0((c51) obj).I(2131624227, gd.M0(2131750205, null), gd.H(',', "Gift2ConvertedChannel", (int) j3)).k(true);
                return;
            case 3:
                ((fi.q) obj).f12436s.h0(j3, false);
                return;
            case 4:
                fi.z3 z3Var = ((fi.j2) obj).f12146a;
                if (j3 <= 0) {
                    z12 = true;
                }
                z3Var.i0(z12);
                return;
            case 5:
                org.telegram.messenger.g0.h3((fi.l3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 6:
                org.telegram.ui.ActionBar.h2 g02 = c51.g0(mp.u1(((fi.p6) obj).f12385a).O0(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.h2 Q2 = LaunchActivity.Q();
                if (Q2 != 0) {
                    ta taVar = ta.G2;
                    if (taVar != null && taVar.d) {
                        ?? obj2 = new Object();
                        obj2.f28923a = true;
                        Q2.showAsSheet(g02, obj2);
                        return;
                    }
                    Q2.presentFragment(g02);
                    return;
                }
                return;
            case 7:
                tr trVar = ((fi.c7) obj).f11818b;
                SQLiteDatabase sQLiteDatabase = trVar.f27056b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    trVar.o(th2, true);
                    return;
                }
            case 8:
                hi.l8 l8Var = (hi.l8) obj;
                Context context2 = l8Var.getContext();
                hi.q8 q8Var = l8Var.f14955a0;
                org.telegram.ui.ActionBar.h2 h2Var = q8Var.f30213j1;
                int i14 = hi.q8.Y1;
                org.telegram.ui.Components.b5.P(context2, h2Var, q8Var.J0, new ai.d0(l8Var, j3, 2));
                return;
            case 9:
                ta taVar2 = (ta) obj;
                oa oaVar2 = taVar2.G;
                if (oaVar2 != null) {
                    oaVar2.f(true);
                    taVar2.G = null;
                }
                ka kaVar = taVar2.f15501y;
                if (kaVar != null) {
                    oaVar = kaVar.a(j3);
                } else {
                    oaVar = null;
                }
                taVar2.G = oaVar;
                if (oaVar != null) {
                    taVar2.K = oaVar.f15202a;
                    taVar2.f15476r.c();
                    fa faVar = taVar2.f15451i0;
                    int i15 = taVar2.K;
                    if (i15 != 1 && i15 != 0) {
                        i13 = -14737633;
                    }
                    faVar.setBackgroundColor(i13);
                    taVar2.I.set(taVar2.G.f15204c);
                    oa oaVar3 = taVar2.G;
                    taVar2.H = oaVar3.f15203b;
                    oaVar3.e();
                    if (bz.o() > 1) {
                        pc.e(360928);
                    }
                }
                taVar2.f15501y = null;
                Activity activity = taVar2.f15427b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f43112y0.post(new hi.s8(taVar2, 5));
                    return;
                } else {
                    taVar2.p(true);
                    return;
                }
            case 10:
                xa xaVar = ((db) obj).f14447a;
                if (xaVar != null) {
                    xaVar.M(j3, false);
                    return;
                }
                return;
            case 11:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                try {
                    tr.a0(h0Var.f17493t0).f27056b.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                li.d0 d0Var = (li.d0) obj;
                mp.u1(d0Var.f30189a).W2(this.f4276b, d0Var.f19906p1, true, false, new li.t(d0Var, 1));
                return;
            case 13:
                li.k0 k0Var = (li.k0) obj;
                k0Var.f19957i = null;
                k0Var.f19956g.l(j3);
                k0Var.f19960l++;
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.F();
                    return;
                }
                return;
            case 14:
                String str = h2.l0.f13786a;
                m2.d dVar = ((l2.z) ((n2.s) ((k8.a) obj).f18184c)).f19600a.f19347s;
                m2.a U = dVar.U();
                dVar.V(U, 1010, new m2.c(U, j3));
                return;
            case 15:
                oi.o oVar = (oi.o) obj;
                org.telegram.ui.Components.b5.J(oVar.f36766b.f39659a2.getParentActivity(), j3, new hi.u5(oVar, 18), oVar.f36765a);
                return;
            case 16:
                oi.z1 z1Var = (oi.z1) obj;
                org.telegram.ui.Components.b5.J(z1Var.getParentActivity(), j3, new hi.w4(z1Var, 18), z1Var.getResourceProvider());
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
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new bn(a8.p0.j(j3, "user_id")));
                    return;
                }
                return;
            case 21:
                gc Q3 = lc.b0((org.telegram.ui.x6) obj).Q(2131624052, 36, gd.a0(null, null, 2131752634, org.telegram.messenger.g0.i0(j3, false, false)));
                Q3.f35469r = false;
                Q3.j();
                return;
            case 22:
                bg bgVar = (bg) obj;
                bgVar.getClass();
                bgVar.presentFragment(bn.ua(j3));
                return;
            case 23:
                xk xkVar = (xk) obj;
                si siVar = xkVar.f36766b;
                if (!xkVar.L && xkVar.M0 && xkVar.isShown()) {
                    fi fiVar = siVar.f39705p3;
                    org.telegram.ui.ActionBar.h2 h2Var2 = siVar.f39659a2;
                    if ((fiVar.Q() <= org.telegram.messenger.g0.L(20.0f) || xkVar.C0 || xkVar.L0) && SystemClock.uptimeMillis() < j3) {
                        xkVar.postDelayed(xkVar.P0, 32L);
                        return;
                    }
                    xkVar.P0 = null;
                    org.telegram.ui.ActionBar.i6 i6Var2 = xkVar.f36765a;
                    if (h2Var2 != null && h2Var2.getParentActivity() != null) {
                        context = h2Var2.getParentActivity();
                    } else {
                        context = xkVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var2);
                        String M0 = gd.M0(2131742967, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                        u1Var.S = M0;
                        kg.a1 a1Var = new kg.a1(xkVar, context);
                        a1Var.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.u6.U(a1Var, org.telegram.ui.ActionBar.n6.f29504j5, i6Var2);
                        org.telegram.ui.ActionBar.u6.D(a1Var, org.telegram.ui.ActionBar.n6.f29692t5, i6Var2);
                        a1Var.setHint(gd.M0(2131742931, null));
                        a1Var.setText(xkVar.f42127t0);
                        a1Var.setSelection(a1Var.length());
                        a1Var.setInputType(147457);
                        a1Var.setMaxLines(5);
                        a1Var.setImeOptions(6);
                        org.telegram.ui.ActionBar.u6.F(a1Var, org.telegram.ui.ActionBar.n6.f29525k6, org.telegram.ui.ActionBar.n6.f29543l6, org.telegram.ui.ActionBar.n6.f29617p7, i6Var2);
                        a1Var.setBackground(null);
                        a1Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, i6Var2);
                        int i16 = org.telegram.ui.ActionBar.n6.f29488i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i16, i6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i16);
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(c2Var, h02, null, M, i6Var2);
                        String M02 = gd.M0(2131742838, null);
                        if (xkVar.f42128u0 && xkVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        c2Var.e(M02, "", z10, false, false);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (gd.f24216a0) {
                            i7 = 5;
                        } else {
                            i7 = 3;
                        }
                        layoutParams.gravity = i7 | 16;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (gd.f24216a0) {
                            i10 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i10 = 0;
                        }
                        int L2 = org.telegram.messenger.g0.L(12.0f);
                        if (gd.f24216a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        c2Var.setPadding(i10, L2, L, org.telegram.messenger.g0.L(12.0f));
                        if (xkVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c2Var.setEnabled(z11);
                        c2Var.setOnClickListener(new org.telegram.ui.Components.i1(c2Var, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(a1Var, ma.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(c2Var, ma.t(-1, -2, 83, 8, 0, 8, 0));
                        u1Var.H = 6;
                        alertDialog$Builder.o(linearLayout);
                        u1Var.f30026a = org.telegram.messenger.g0.L(292.0f);
                        alertDialog$Builder.h(gd.M0(2131752578, null), new org.telegram.ui.Components.k2(19));
                        alertDialog$Builder.k(gd.M0(2131754484, null), new a3.h(xkVar, a1Var, c2Var, 27));
                        xkVar.U0 = u1Var;
                        u1Var.f30051k0 = false;
                        u1Var.setOnShowListener(new org.telegram.ui.Components.o2(a1Var, 1));
                        u1Var.setOnDismissListener(new org.telegram.ui.Components.y0(xkVar, 4));
                        u1Var.create();
                        Window window = u1Var.getWindow();
                        Rect rect = new Rect();
                        siVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        u1Var.show();
                        View d = u1Var.d(-1);
                        if ((d instanceof TextView) && !TextUtils.isEmpty(xkVar.f42127t0)) {
                            a1Var.addTextChangedListener(new wk(a1Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                xkVar.P0 = null;
                return;
            case 24:
                ke0 ke0Var = (ke0) obj;
                ke0Var.getClass();
                ke0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                org.telegram.messenger.g0.h3(new ge0(ke0Var, 1), 100L);
                return;
            case 25:
                mf0 mf0Var = (mf0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (!PhotoViewer.p1().P1() && (T2 == null || !T2.hasShownSheet())) {
                    if (T2 != null) {
                        i6Var = T2.getResourceProvider();
                    }
                } else {
                    i6Var = new fi.b();
                }
                new fb(u02, i6Var, this.f4276b, 15, "", new jf0(mf0Var, 0), 0L).show();
                return;
            case 26:
                cx cxVar = (cx) obj;
                cxVar.U4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(sr.a(j3, 0L));
                cxVar.E2.y(cxVar, arrayList, null, false, cxVar.L2, cxVar.M2, cxVar.N2, null);
                return;
            case 27:
                ((f40) obj).q1(j3, false);
                return;
            case 28:
                q90 q90Var = (q90) obj;
                q90Var.getClass();
                q90Var.presentFragment(bn.ua(j3));
                return;
            default:
                bn bnVar = ((sh) obj).f51996f;
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

    public y3(Object obj, long j3, int i7) {
        this.f4275a = i7;
        this.f4277c = obj;
        this.f4276b = j3;
    }
}
