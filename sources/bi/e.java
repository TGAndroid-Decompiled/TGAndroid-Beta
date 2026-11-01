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
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.hs;
import org.telegram.messenger.is;
import org.telegram.messenger.tc;
import org.telegram.messenger.tz;
import org.telegram.messenger.uz;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a50;
import org.telegram.ui.oi;
import org.telegram.ui.s61;
import org.telegram.ui.sa0;
import org.telegram.ui.un;
import org.telegram.ui.y6;
import org.telegram.ui.zx;
import rh.h8;
import rh.x7;
import vh.b8;
import vh.f8;
import vh.j8;
import vh.o8;
public final class e implements Runnable {
    public final int f2966a;
    public final long f2967b;
    public final Object f2968c;

    public e(Object obj, long j10, int i10) {
        this.f2966a = i10;
        this.f2968c = obj;
        this.f2967b = j10;
    }

    @Override
    public final void run() {
        int i10;
        Context context;
        int i11 = this.f2966a;
        org.telegram.ui.ActionBar.p6 p6Var = null;
        r13 = 0;
        int i12 = 0;
        long j10 = this.f2967b;
        Object obj = this.f2968c;
        switch (i11) {
            case 0:
                t tVar = (t) obj;
                org.telegram.ui.Components.s4.L(tVar.f30964b.W1.getParentActivity(), j10, new k6.h(tVar, 10), tVar.f30963a);
                return;
            case 1:
                k2 k2Var = (k2) obj;
                org.telegram.ui.Components.s4.L(k2Var.getParentActivity(), j10, new za.c(k2Var, 9), k2Var.getResourceProvider());
                return;
            case 2:
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((k2.w) ((hf.b) obj).f7659c)).f7822a.f7928s;
                j2.a U = gVar.U();
                gVar.V(U, 1010, new j2.e(U, j10));
                return;
            case 3:
                ki.k kVar = (ki.k) ((ki.g) obj).f11406c;
                if (j10 != kVar.f11424o || (i10 = kVar.G) == 9 || i10 == 10 || i10 == 8) {
                    return;
                }
                SystemClock.elapsedRealtime();
                kVar.f11431w = false;
                kVar.s(3);
                kVar.f11418i.removeCallbacks(kVar.D);
                ki.b bVar = kVar.h;
                bVar.b("recording started: retainedDurationMs=" + ki.k.r(kVar.f11425p));
                return;
            case 4:
                mg.v1 v1Var = (mg.v1) obj;
                HashSet hashSet = v1Var.W1;
                hashSet.remove(Long.valueOf(j10));
                v1Var.Q1.b(true, hashSet, new mg.p1(v1Var, 5), null);
                v1Var.n1(true, false);
                return;
            case 5:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                return;
            case 6:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                return;
            case 7:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                return;
            case 8:
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj;
                if (u3Var != null) {
                    u3Var.a(true);
                }
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new un(org.telegram.ui.Cells.f1.k(j10, "user_id")));
                    return;
                }
                return;
            case 9:
                wb Q = cc.a0((y6) obj).Q(2131624050, 36, dd.a0(null, null, 2131752645, org.telegram.messenger.i0.i0(j10, false, false)));
                Q.f32209r = false;
                Q.j();
                return;
            case 10:
                ff ffVar = (ff) obj;
                ffVar.getClass();
                ffVar.presentFragment(un.ma(j10));
                return;
            case 11:
                kk kkVar = (kk) obj;
                bi biVar = kkVar.f30964b;
                if (!kkVar.K && kkVar.L0 && kkVar.isShown()) {
                    ph phVar = biVar.f24786l3;
                    org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                    if ((phVar.Q() <= org.telegram.messenger.i0.L(20.0f) || kkVar.B0 || kkVar.K0) && SystemClock.uptimeMillis() < j10) {
                        kkVar.postDelayed(kkVar.O0, 32L);
                        return;
                    }
                    kkVar.O0 = null;
                    org.telegram.ui.ActionBar.p6 p6Var2 = kkVar.f30963a;
                    if (k2Var2 != null && k2Var2.getParentActivity() != null) {
                        context = k2Var2.getParentActivity();
                    } else {
                        context = kkVar.getContext();
                    }
                    if (context == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var2);
                    String L0 = dd.L0(2131743231, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    ag.a2 a2Var = new ag.a2(kkVar, context);
                    a2Var.setTextSize(1, 18.0f);
                    a7.V(a2Var, org.telegram.ui.ActionBar.t6.f21038j5, p6Var2);
                    a7.E(a2Var, org.telegram.ui.ActionBar.t6.f21223t5, p6Var2);
                    a2Var.setHint(dd.L0(2131743195, null));
                    a2Var.setText(kkVar.f27880s0);
                    a2Var.setSelection(a2Var.length());
                    a2Var.setInputType(147457);
                    a2Var.setMaxLines(5);
                    a2Var.setImeOptions(6);
                    a7.G(a2Var, org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, p6Var2);
                    a2Var.setBackground(null);
                    a2Var.setPadding(0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(10.0f));
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, p6Var2);
                    int i13 = org.telegram.ui.ActionBar.t6.f21021i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var2), 7, org.telegram.messenger.i0.L(12.0f));
                    org.telegram.ui.ActionBar.w6 N = a7.N(i13);
                    c2Var.setBackground(h02);
                    a7.k(c2Var, h02, null, N, p6Var2);
                    c2Var.e(dd.L0(2131743103, null), "", !kkVar.f27881t0 || kkVar.getPublicKey() == null, false, false);
                    c2Var.setMultiline(true);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                    layoutParams.topMargin = 0;
                    layoutParams.gravity = (dd.X ? 5 : 3) | 16;
                    c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                    c2Var.setPadding(dd.X ? org.telegram.messenger.i0.L(4.0f) : 0, org.telegram.messenger.i0.L(12.0f), dd.X ? 0 : org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f));
                    c2Var.setEnabled(kkVar.getPublicKey() != null);
                    c2Var.setOnClickListener(new org.telegram.ui.Components.a1(c2Var, 1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.addView(a2Var, w7.b6.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                    linearLayout.addView(c2Var, w7.b6.t(-1, -2, 83, 8, 0, 8, 0));
                    x1Var.G = 6;
                    alertDialog$Builder.o(linearLayout);
                    x1Var.f21469a = org.telegram.messenger.i0.L(292.0f);
                    alertDialog$Builder.h(dd.L0(2131752589, null), new org.telegram.ui.Components.v1(28));
                    alertDialog$Builder.k(dd.L0(2131754486, null), new androidx.car.app.utils.a(kkVar, a2Var, c2Var, 18));
                    kkVar.T0 = x1Var;
                    x1Var.f21491j0 = false;
                    x1Var.setOnShowListener(new org.telegram.ui.Components.g2(a2Var, 1));
                    x1Var.setOnDismissListener(new org.telegram.ui.Components.r0(kkVar, 5));
                    x1Var.create();
                    Window window = x1Var.getWindow();
                    Rect rect = new Rect();
                    biVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    if (window != null && rect.height() > 0) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        View decorView = window.getDecorView();
                        int i14 = attributes.width;
                        if (i14 <= 0) {
                            i14 = rect.width();
                        }
                        decorView.measure(View.MeasureSpec.makeMeasureSpec(i14, attributes.width > 0 ? 1073741824 : Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(rect.height(), Integer.MIN_VALUE));
                        attributes.gravity = 49;
                        attributes.y = Math.max(0, (rect.height() - decorView.getMeasuredHeight()) / 2);
                        window.setAttributes(attributes);
                    }
                    x1Var.show();
                    View d = x1Var.d(-1);
                    if (!(d instanceof TextView) || TextUtils.isEmpty(kkVar.f27880s0)) {
                        return;
                    }
                    a2Var.addTextChangedListener(new jk(a2Var, (TextView) d));
                    return;
                }
                kkVar.O0 = null;
                return;
            case 12:
                ve0 ve0Var = (ve0) obj;
                ve0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                org.telegram.messenger.i0.h3(new re0(ve0Var, 1), 100L);
                return;
            case 13:
                cg0 cg0Var = (cg0) obj;
                Activity u02 = org.telegram.messenger.i0.u0();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (PhotoViewer.v1().U1() || (T2 != null && T2.hasShownSheet())) {
                    p6Var = new th.b();
                } else if (T2 != null) {
                    p6Var = T2.getResourceProvider();
                }
                new x7(u02, p6Var, this.f2967b, 15, "", new zf0(cg0Var, 0), 0L).show();
                return;
            case 14:
                zx zxVar = (zx) obj;
                zxVar.M4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(hs.a(j10, 0L));
                zxVar.C2.z(zxVar, arrayList, null, false, zxVar.J2, zxVar.K2, zxVar.L2, null);
                return;
            case 15:
                ((a50) obj).o1(j10, false);
                return;
            case 16:
                sa0 sa0Var = (sa0) obj;
                sa0Var.getClass();
                sa0Var.presentFragment(un.ma(j10));
                return;
            case 17:
                un unVar = ((oi) obj).f40166f;
                unVar.M7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == unVar.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 18:
                tz tzVar = (tz) obj;
                tzVar.e = SystemClock.elapsedRealtime();
                tzVar.f18327c = false;
                if (j10 == -1) {
                    tzVar.d = false;
                    tzVar.f18326b = 0L;
                } else {
                    tzVar.f18326b = j10;
                    tzVar.d = true;
                }
                at.e().k(278, tzVar);
                return;
            case 19:
                ((ag.e0) obj).a(Long.valueOf(j10));
                return;
            case 20:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) obj;
                b0Var.getClass();
                b0Var.presentFragment(un.ma(j10));
                return;
            case 21:
                cc.a0((h8) obj).I(2131624224, dd.L0(2131750230, null), dd.H(',', "Gift2Converted", (int) j10)).k(true);
                return;
            case 22:
                cc.a0((s61) obj).I(2131624224, dd.L0(2131750230, null), dd.H(',', "Gift2ConvertedChannel", (int) j10)).k(true);
                return;
            case 23:
                ((th.m) obj).f49232s.h0(j10, false);
                return;
            case 24:
                ((th.u1) obj).f49519a.i0(j10 <= 0);
                return;
            case 25:
                org.telegram.messenger.i0.h3((th.o2) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 26:
                org.telegram.ui.ActionBar.k2 g02 = s61.g0(wp.r1(((th.e5) obj).f48918a).L0(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != 0) {
                    o8 o8Var = o8.F2;
                    if (o8Var != null && o8Var.d) {
                        ?? obj2 = new Object();
                        obj2.f20390a = true;
                        Q2.showAsSheet(g02, obj2);
                        return;
                    }
                    Q2.presentFragment(g02);
                    return;
                }
                return;
            case 27:
                is isVar = ((th.r5) obj).f49426b;
                SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    isVar.o(th2, true);
                    return;
                }
            case 28:
                vh.r6 r6Var = (vh.r6) obj;
                Context context2 = r6Var.getContext();
                vh.w6 w6Var = r6Var.W;
                org.telegram.ui.ActionBar.k2 k2Var3 = w6Var.f21599f1;
                int i15 = vh.w6.U1;
                org.telegram.ui.Components.s4.R(context2, k2Var3, w6Var.I0, new m4.x0(r6Var, j10, 13));
                return;
            default:
                o8 o8Var2 = (o8) obj;
                j8 j8Var = o8Var2.F;
                if (j8Var != null) {
                    j8Var.f(true);
                    o8Var2.F = null;
                }
                f8 f8Var = o8Var2.f51697y;
                j8 c10 = f8Var != null ? f8Var.c(j10) : null;
                o8Var2.F = c10;
                if (c10 != null) {
                    o8Var2.J = c10.f51340a;
                    o8Var2.f51672r.c();
                    b8 b8Var = o8Var2.f51643h0;
                    int i16 = o8Var2.J;
                    if (i16 != 1 && i16 != 0) {
                        i12 = -14737633;
                    }
                    b8Var.setBackgroundColor(i12);
                    o8Var2.H.set(o8Var2.F.f51342c);
                    j8 j8Var2 = o8Var2.F;
                    o8Var2.G = j8Var2.f51341b;
                    j8Var2.e();
                    if (uz.o() > 1) {
                        tc.e(360928);
                    }
                }
                o8Var2.f51697y = null;
                Activity activity = o8Var2.f51622b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f33402z0.post(new vh.y6(o8Var2, 5));
                    return;
                } else {
                    o8Var2.p(true);
                    return;
                }
        }
    }
}
