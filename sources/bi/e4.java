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
import hi.eb;
import hi.ib;
import hi.k9;
import hi.m9;
import hi.nb;
import hi.rb;
import hi.xb;
import hi.za;
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
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.xk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b51;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.e40;
import org.telegram.ui.q90;
import org.telegram.ui.th;
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
        ib ibVar;
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
        org.telegram.ui.ActionBar.i6 i6Var = null;
        long j3 = this.f3505b;
        Object obj = this.f3506c;
        switch (i12) {
            case 0:
                l4.f3802b.add(Long.valueOf(j3));
                l4.j(j3, 60000L);
                ((aa.r) obj).run();
                fc Q = l4.h().Q(2131623990, 36, gd.N0(2131749546, null));
                Q.f35101t = true;
                Q.j();
                return;
            case 1:
                kc.b0((pb) obj).I(2131624227, gd.N0(2131750204, null), gd.H(',', "Gift2Converted", (int) j3)).k(true);
                return;
            case 2:
                kc.b0((b51) obj).I(2131624227, gd.N0(2131750204, null), gd.H(',', "Gift2ConvertedChannel", (int) j3)).k(true);
                return;
            case 3:
                ((fi.q) obj).f12438s.h0(j3, false);
                return;
            case 4:
                fi.z3 z3Var = ((fi.j2) obj).f12140a;
                if (j3 <= 0) {
                    z12 = true;
                }
                z3Var.i0(z12);
                return;
            case 5:
                org.telegram.messenger.g0.h3((fi.l3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 6:
                org.telegram.ui.ActionBar.g2 g02 = b51.g0(mp.u1(((fi.p6) obj).f12387a).O0(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 != 0) {
                    nb nbVar = nb.G2;
                    if (nbVar != null && nbVar.d) {
                        ?? obj2 = new Object();
                        obj2.f28948a = true;
                        Q2.showAsSheet(g02, obj2);
                        return;
                    }
                    Q2.presentFragment(g02);
                    return;
                }
                return;
            case 7:
                tr trVar = ((fi.c7) obj).f11820b;
                SQLiteDatabase sQLiteDatabase = trVar.f27151b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    trVar.o(th2, true);
                    return;
                }
            case 8:
                hi.f9 f9Var = (hi.f9) obj;
                Context context2 = f9Var.getContext();
                k9 k9Var = f9Var.f14495a0;
                org.telegram.ui.ActionBar.g2 g2Var = k9Var.f30247j1;
                int i14 = k9.Y1;
                org.telegram.ui.Components.b5.P(context2, g2Var, k9Var.J0, new ai.z(f9Var, j3, 2));
                return;
            case 9:
                nb nbVar2 = (nb) obj;
                ib ibVar2 = nbVar2.G;
                if (ibVar2 != null) {
                    ibVar2.f(true);
                    nbVar2.G = null;
                }
                eb ebVar = nbVar2.f15132y;
                if (ebVar != null) {
                    ibVar = ebVar.a(j3);
                } else {
                    ibVar = null;
                }
                nbVar2.G = ibVar;
                if (ibVar != null) {
                    nbVar2.K = ibVar.f14708a;
                    nbVar2.f15107r.c();
                    za zaVar = nbVar2.f15082i0;
                    int i15 = nbVar2.K;
                    if (i15 != 1 && i15 != 0) {
                        i13 = -14737633;
                    }
                    zaVar.setBackgroundColor(i13);
                    nbVar2.I.set(nbVar2.G.f14710c);
                    ib ibVar3 = nbVar2.G;
                    nbVar2.H = ibVar3.f14709b;
                    ibVar3.e();
                    if (bz.o() > 1) {
                        pc.e(360928);
                    }
                }
                nbVar2.f15132y = null;
                Activity activity = nbVar2.f15058b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f43232y0.post(new m9(nbVar2, 5));
                    return;
                } else {
                    nbVar2.p(true);
                    return;
                }
            case 10:
                rb rbVar = ((xb) obj).f15792a;
                if (rbVar != null) {
                    rbVar.p(j3, false);
                    return;
                }
                return;
            case 11:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                try {
                    tr.a0(h0Var.f17586t0).f27151b.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                li.c0 c0Var = (li.c0) obj;
                mp.u1(c0Var.f30223a).W2(this.f3505b, c0Var.f19997p1, true, false, new li.s(c0Var, 1));
                return;
            case 13:
                li.j0 j0Var = (li.j0) obj;
                j0Var.f20048i = null;
                j0Var.f20047g.l(j3);
                j0Var.f20051l++;
                j0Var.a();
                li.i0 i0Var = j0Var.h;
                if (i0Var != null) {
                    i0Var.o();
                    return;
                }
                return;
            case 14:
                String str = h2.l0.f13778a;
                m2.d dVar = ((l2.a0) ((n2.s) ((jb.m) obj).f17465c)).f19342a.f19445s;
                m2.a U = dVar.U();
                dVar.V(U, 1010, new m2.c(U, j3));
                return;
            case 15:
                oi.p pVar = (oi.p) obj;
                org.telegram.ui.Components.b5.J(pVar.f37135b.f39956a2.getParentActivity(), j3, new hi.u0(pVar, 19), pVar.f37134a);
                return;
            case 16:
                oi.b2 b2Var = (oi.b2) obj;
                org.telegram.ui.Components.b5.J(b2Var.getParentActivity(), j3, new h6.o(b2Var, 20), b2Var.getResourceProvider());
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
                fc Q3 = kc.b0((org.telegram.ui.y6) obj).Q(2131624052, 36, gd.a0(null, null, 2131752633, org.telegram.messenger.g0.i0(j3, false, false)));
                Q3.f35099r = false;
                Q3.j();
                return;
            case 22:
                dg dgVar = (dg) obj;
                dgVar.getClass();
                dgVar.presentFragment(bn.ua(j3));
                return;
            case 23:
                xk xkVar = (xk) obj;
                ti tiVar = xkVar.f37135b;
                if (!xkVar.L && xkVar.M0 && xkVar.isShown()) {
                    gi giVar = tiVar.f40002p3;
                    org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.f39956a2;
                    if ((giVar.Q() <= org.telegram.messenger.g0.L(20.0f) || xkVar.C0 || xkVar.L0) && SystemClock.uptimeMillis() < j3) {
                        xkVar.postDelayed(xkVar.P0, 32L);
                        return;
                    }
                    xkVar.P0 = null;
                    org.telegram.ui.ActionBar.i6 i6Var2 = xkVar.f37134a;
                    if (g2Var2 != null && g2Var2.getParentActivity() != null) {
                        context = g2Var2.getParentActivity();
                    } else {
                        context = xkVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var2);
                        String N0 = gd.N0(2131742954, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N0;
                        kg.z0 z0Var = new kg.z0(xkVar, context);
                        z0Var.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.u6.U(z0Var, org.telegram.ui.ActionBar.n6.f29559j5, i6Var2);
                        org.telegram.ui.ActionBar.u6.D(z0Var, org.telegram.ui.ActionBar.n6.f29747t5, i6Var2);
                        z0Var.setHint(gd.N0(2131742918, null));
                        z0Var.setText(xkVar.f42080t0);
                        z0Var.setSelection(z0Var.length());
                        z0Var.setInputType(147457);
                        z0Var.setMaxLines(5);
                        z0Var.setImeOptions(6);
                        org.telegram.ui.ActionBar.u6.F(z0Var, org.telegram.ui.ActionBar.n6.f29580k6, org.telegram.ui.ActionBar.n6.f29598l6, org.telegram.ui.ActionBar.n6.f29672p7, i6Var2);
                        z0Var.setBackground(null);
                        z0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context, i6Var2);
                        int i16 = org.telegram.ui.ActionBar.n6.f29543i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i16, i6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i16);
                        d2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, i6Var2);
                        String N02 = gd.N0(2131742825, null);
                        if (xkVar.f42081u0 && xkVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        d2Var.e(N02, "", z10, false, false);
                        d2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (gd.f24314a0) {
                            i7 = 5;
                        } else {
                            i7 = 3;
                        }
                        layoutParams.gravity = i7 | 16;
                        d2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (gd.f24314a0) {
                            i10 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i10 = 0;
                        }
                        int L2 = org.telegram.messenger.g0.L(12.0f);
                        if (gd.f24314a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        d2Var.setPadding(i10, L2, L, org.telegram.messenger.g0.L(12.0f));
                        if (xkVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        d2Var.setEnabled(z11);
                        d2Var.setOnClickListener(new org.telegram.ui.Components.i1(d2Var, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(z0Var, na.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(d2Var, na.t(-1, -2, 83, 8, 0, 8, 0));
                        t1Var.H = 6;
                        alertDialog$Builder.o(linearLayout);
                        t1Var.f30068a = org.telegram.messenger.g0.L(292.0f);
                        alertDialog$Builder.h(gd.N0(2131752577, null), new org.telegram.ui.Components.k2(19));
                        alertDialog$Builder.k(gd.N0(2131754483, null), new a3.h(xkVar, z0Var, d2Var, 27));
                        xkVar.U0 = t1Var;
                        t1Var.f30093k0 = false;
                        t1Var.setOnShowListener(new org.telegram.ui.Components.o2(z0Var, 1));
                        t1Var.setOnDismissListener(new org.telegram.ui.Components.y0(xkVar, 4));
                        t1Var.create();
                        Window window = t1Var.getWindow();
                        Rect rect = new Rect();
                        tiVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        if ((d instanceof TextView) && !TextUtils.isEmpty(xkVar.f42080t0)) {
                            z0Var.addTextChangedListener(new wk(z0Var, (TextView) d));
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
                nf0 nf0Var = (nf0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (!PhotoViewer.p1().Q1() && (T2 == null || !T2.hasShownSheet())) {
                    if (T2 != null) {
                        i6Var = T2.getResourceProvider();
                    }
                } else {
                    i6Var = new fi.b();
                }
                new fb(u02, i6Var, this.f3505b, 15, "", new kf0(nf0Var, 0), 0L).show();
                return;
            case 26:
                bx bxVar = (bx) obj;
                bxVar.U4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(sr.a(j3, 0L));
                bxVar.E2.z(bxVar, arrayList, null, false, bxVar.L2, bxVar.M2, bxVar.N2, null);
                return;
            case 27:
                ((e40) obj).q1(j3, false);
                return;
            case 28:
                q90 q90Var = (q90) obj;
                q90Var.getClass();
                q90Var.presentFragment(bn.ua(j3));
                return;
            default:
                bn bnVar = ((th) obj).f52406f;
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
