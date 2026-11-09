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
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.hz;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.xr;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.d51;
import org.telegram.ui.e40;
import org.telegram.ui.q90;
import org.telegram.ui.vh;
import org.telegram.ui.yw;
public final class r3 implements Runnable {
    public final int f4611a;
    public final long f4612b;
    public final Object f4613c;

    public r3(Object obj, long j3, int i7) {
        this.f4611a = i7;
        this.f4613c = obj;
        this.f4612b = j3;
    }

    @Override
    public final void run() {
        fi.qa qaVar;
        Context context;
        boolean z9;
        int i7;
        int i10;
        int L;
        boolean z10;
        int i11;
        int i12 = this.f4611a;
        org.telegram.ui.ActionBar.g6 g6Var = null;
        boolean z11 = false;
        r10 = 0;
        int i13 = 0;
        long j3 = this.f4612b;
        Object obj = this.f4613c;
        switch (i12) {
            case 0:
                org.telegram.ui.Components.hc.a0((dd) obj).I(2131624226, org.telegram.messenger.id.M0(2131750221, null), org.telegram.messenger.id.H(',', "Gift2Converted", (int) j3)).k(true);
                return;
            case 1:
                org.telegram.ui.Components.hc.a0((d51) obj).I(2131624226, org.telegram.messenger.id.M0(2131750221, null), org.telegram.messenger.id.H(',', "Gift2ConvertedChannel", (int) j3)).k(true);
                return;
            case 2:
                ((di.q) obj).f9550s.h0(j3, false);
                return;
            case 3:
                di.j4 j4Var = ((di.p2) obj).f9494a;
                if (j3 <= 0) {
                    z11 = true;
                }
                j4Var.i0(z11);
                return;
            case 4:
                org.telegram.messenger.g0.i3((di.s3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 5:
                org.telegram.ui.ActionBar.f2 g02 = d51.g0(qp.s1(((di.z6) obj).f9992a).M0(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    fi.va vaVar = fi.va.F2;
                    if (vaVar != null && vaVar.d) {
                        ?? obj2 = new Object();
                        obj2.f27408a = true;
                        Q.showAsSheet(g02, obj2);
                        return;
                    }
                    Q.presentFragment(g02);
                    return;
                }
                return;
            case 6:
                yr yrVar = ((di.m7) obj).f9363b;
                SQLiteDatabase sQLiteDatabase = yrVar.f26721b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    yrVar.o(th2, true);
                    return;
                }
            case 7:
                fi.n8 n8Var = (fi.n8) obj;
                Context context2 = n8Var.getContext();
                fi.s8 s8Var = n8Var.W;
                org.telegram.ui.ActionBar.f2 f2Var = s8Var.f28637f1;
                int i14 = fi.s8.U1;
                org.telegram.ui.Components.v4.P(context2, f2Var, s8Var.I0, new di.c1(n8Var, j3, 1));
                return;
            case 8:
                fi.va vaVar2 = (fi.va) obj;
                fi.qa qaVar2 = vaVar2.F;
                if (qaVar2 != null) {
                    qaVar2.f(true);
                    vaVar2.F = null;
                }
                fi.ma maVar = vaVar2.f13012y;
                if (maVar != null) {
                    qaVar = maVar.d(j3);
                } else {
                    qaVar = null;
                }
                vaVar2.F = qaVar;
                if (qaVar != null) {
                    vaVar2.J = qaVar.f12686a;
                    vaVar2.f12987r.c();
                    fi.ha haVar = vaVar2.f12959h0;
                    int i15 = vaVar2.J;
                    if (i15 != 1 && i15 != 0) {
                        i13 = -14737633;
                    }
                    haVar.setBackgroundColor(i13);
                    vaVar2.H.set(vaVar2.F.f12688c);
                    fi.qa qaVar3 = vaVar2.F;
                    vaVar2.G = qaVar3.f12687b;
                    qaVar3.e();
                    if (iz.o() > 1) {
                        org.telegram.messenger.sc.e(360928);
                    }
                }
                vaVar2.f13012y = null;
                Activity activity = vaVar2.f12938b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f41304x0.post(new fi.u8(vaVar2, 5));
                    return;
                } else {
                    vaVar2.p(true);
                    return;
                }
            case 9:
                fi.za zaVar = ((fi.fb) obj).f11993a;
                if (zaVar != null) {
                    zaVar.j(j3, false);
                    return;
                }
                return;
            case 10:
                ii.d0 d0Var = (ii.d0) obj;
                qp.s1(d0Var.f28621a).Q2(this.f4612b, d0Var.l1, true, false, new ii.t(d0Var, 1));
                return;
            case 11:
                ii.l0 l0Var = (ii.l0) obj;
                l0Var.f15567i = null;
                l0Var.f15566g.l(j3);
                l0Var.f15570l++;
                l0Var.a();
                ii.k0 k0Var = l0Var.h;
                if (k0Var != null) {
                    k0Var.u();
                    return;
                }
                return;
            case 12:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                try {
                    yr.a0(h0Var.f16760s0).f26721b.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 13:
                li.p pVar = (li.p) obj;
                org.telegram.ui.Components.v4.J(pVar.f39071b.W1.getParentActivity(), j3, new g6.d0(pVar, 11), pVar.f39070a);
                return;
            case 14:
                li.b2 b2Var = (li.b2) obj;
                org.telegram.ui.Components.v4.J(b2Var.getParentActivity(), j3, new h9.f1(b2Var, 10), b2Var.getResourceProvider());
                return;
            case 15:
                String str = h2.m0.f14112a;
                m2.e eVar = ((l2.c0) ((n2.s) ((j2.n) obj).f16457c)).f17772a.f17882s;
                m2.a U = eVar.U();
                eVar.V(U, 1010, new m2.d(U, j3));
                return;
            case 16:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j3);
                return;
            case 17:
                ((VideoCapturerDevice) obj).lambda$init$3(j3);
                return;
            case 18:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j3);
                return;
            case 19:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj;
                if (t3Var != null) {
                    t3Var.a(true);
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new cn(a8.p0.j(j3, "user_id")));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.cc Q2 = org.telegram.ui.Components.hc.a0((org.telegram.ui.y6) obj).Q(2131624051, 36, org.telegram.messenger.id.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j3, false, false)));
                Q2.f32635r = false;
                Q2.j();
                return;
            case 21:
                lf lfVar = (lf) obj;
                lfVar.getClass();
                lfVar.presentFragment(cn.ta(j3));
                return;
            case 22:
                ik ikVar = (ik) obj;
                di diVar = ikVar.f39071b;
                if (!ikVar.K && ikVar.L0 && ikVar.isShown()) {
                    qh qhVar = diVar.f33022l3;
                    org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                    if ((qhVar.Q() <= org.telegram.messenger.g0.L(20.0f) || ikVar.B0 || ikVar.K0) && SystemClock.uptimeMillis() < j3) {
                        ikVar.postDelayed(ikVar.O0, 32L);
                        return;
                    }
                    ikVar.O0 = null;
                    org.telegram.ui.ActionBar.g6 g6Var2 = ikVar.f39070a;
                    if (f2Var2 != null && f2Var2.getParentActivity() != null) {
                        context = f2Var2.getParentActivity();
                    } else {
                        context = ikVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var2);
                        String M0 = org.telegram.messenger.id.M0(2131743205, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        kg.x0 x0Var = new kg.x0(ikVar, context);
                        x0Var.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.s6.U(x0Var, org.telegram.ui.ActionBar.l6.f27973j5, g6Var2);
                        org.telegram.ui.ActionBar.s6.D(x0Var, org.telegram.ui.ActionBar.l6.f28161t5, g6Var2);
                        x0Var.setHint(org.telegram.messenger.id.M0(2131743169, null));
                        x0Var.setText(ikVar.f34788s0);
                        x0Var.setSelection(x0Var.length());
                        x0Var.setInputType(147457);
                        x0Var.setMaxLines(5);
                        x0Var.setImeOptions(6);
                        org.telegram.ui.ActionBar.s6.F(x0Var, org.telegram.ui.ActionBar.l6.f27994k6, org.telegram.ui.ActionBar.l6.f28012l6, org.telegram.ui.ActionBar.l6.f28086p7, g6Var2);
                        x0Var.setBackground(null);
                        x0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, g6Var2);
                        int i16 = org.telegram.ui.ActionBar.l6.f27957i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i16, g6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i16);
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.s6.j(c2Var, h02, null, M, g6Var2);
                        String M02 = org.telegram.messenger.id.M0(2131743077, null);
                        if (ikVar.f34789t0 && ikVar.getPublicKey() != null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        c2Var.e(M02, "", z9, false, false);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (org.telegram.messenger.id.f23157a0) {
                            i7 = 5;
                        } else {
                            i7 = 3;
                        }
                        layoutParams.gravity = i7 | 16;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (org.telegram.messenger.id.f23157a0) {
                            i10 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i10 = 0;
                        }
                        int L2 = org.telegram.messenger.g0.L(12.0f);
                        if (org.telegram.messenger.id.f23157a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        c2Var.setPadding(i10, L2, L, org.telegram.messenger.g0.L(12.0f));
                        if (ikVar.getPublicKey() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c2Var.setEnabled(z10);
                        c2Var.setOnClickListener(new org.telegram.ui.Components.a1(c2Var, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(x0Var, c8.ha.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(c2Var, c8.ha.t(-1, -2, 83, 8, 0, 8, 0));
                        u1Var.G = 6;
                        alertDialog$Builder.o(linearLayout);
                        u1Var.f28542a = org.telegram.messenger.g0.L(292.0f);
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.k2(14));
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754486, null), new a3.h(ikVar, x0Var, c2Var, 26));
                        ikVar.T0 = u1Var;
                        u1Var.f28565j0 = false;
                        u1Var.setOnShowListener(new org.telegram.ui.Components.g2(x0Var, 1));
                        u1Var.setOnDismissListener(new org.telegram.ui.Components.p0(ikVar, 5));
                        u1Var.create();
                        Window window = u1Var.getWindow();
                        Rect rect = new Rect();
                        diVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        if ((d instanceof TextView) && !TextUtils.isEmpty(ikVar.f34788s0)) {
                            x0Var.addTextChangedListener(new hk(x0Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ikVar.O0 = null;
                return;
            case 23:
                be0 be0Var = (be0) obj;
                be0Var.getClass();
                be0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                org.telegram.messenger.g0.i3(new xd0(be0Var, 1), 100L);
                return;
            case 24:
                af0 af0Var = (af0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (!PhotoViewer.p1().P1() && (T2 == null || !T2.hasShownSheet())) {
                    if (T2 != null) {
                        g6Var = T2.getResourceProvider();
                    }
                } else {
                    g6Var = new di.b();
                }
                new tc(u02, g6Var, this.f4612b, 15, "", new xe0(af0Var, 0), 0L).show();
                return;
            case 25:
                yw ywVar = (yw) obj;
                ywVar.M4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(xr.a(j3, 0L));
                ywVar.D2.y(ywVar, arrayList, null, false, ywVar.K2, ywVar.L2, ywVar.M2, null);
                return;
            case 26:
                ((e40) obj).p1(j3, false);
                return;
            case 27:
                q90 q90Var = (q90) obj;
                q90Var.getClass();
                q90Var.presentFragment(cn.ta(j3));
                return;
            case 28:
                cn cnVar = ((vh) obj).f50688f;
                cnVar.P7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == cnVar.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                hz hzVar = (hz) obj;
                hzVar.f22997e = SystemClock.elapsedRealtime();
                hzVar.f22996c = false;
                if (j3 == -1) {
                    hzVar.d = false;
                    hzVar.f22995b = 0L;
                } else {
                    hzVar.f22995b = j3;
                    hzVar.d = true;
                }
                qs.e().k(278, hzVar);
                return;
        }
    }
}
