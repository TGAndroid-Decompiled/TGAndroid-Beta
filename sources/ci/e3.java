package ci;

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
import b8.mf;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.pr;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l90;
import org.telegram.ui.ph;
import org.telegram.ui.r41;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.x30;
public final class e3 implements Runnable {
    public final int f5003a;
    public final long f5004b;
    public final Object f5005c;

    public e3(Object obj, long j10, int i3) {
        this.f5003a = i3;
        this.f5005c = obj;
        this.f5004b = j10;
    }

    @Override
    public final void run() {
        gi.qa qaVar;
        Context context;
        boolean z10;
        int i3;
        int i10;
        int L;
        boolean z11;
        int i11;
        int i12 = this.f5003a;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        boolean z12 = false;
        r11 = 0;
        int i13 = 0;
        long j10 = this.f5004b;
        Object obj = this.f5005c;
        switch (i12) {
            case 0:
                org.telegram.ui.Components.fc.a0((wb) obj).I(2131624226, bd.M0(2131750229, null), bd.H(',', "Gift2Converted", (int) j10)).k(true);
                return;
            case 1:
                org.telegram.ui.Components.fc.a0((r41) obj).I(2131624226, bd.M0(2131750229, null), bd.H(',', "Gift2ConvertedChannel", (int) j10)).k(true);
                return;
            case 2:
                ((ei.r) obj).f10846s.h0(j10, false);
                return;
            case 3:
                ei.j4 j4Var = ((ei.t2) obj).f11039a;
                if (j10 <= 0) {
                    z12 = true;
                }
                j4Var.i0(z12);
                return;
            case 4:
                org.telegram.messenger.g0.i3((ei.v3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j10)));
                return;
            case 5:
                org.telegram.ui.ActionBar.d2 g02 = r41.g0(hp.s1(((ei.z6) obj).f11274a).M0(Long.valueOf(-j10)), true);
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    gi.va vaVar = gi.va.G2;
                    if (vaVar != null && vaVar.d) {
                        ?? obj2 = new Object();
                        obj2.f27395a = true;
                        Q.showAsSheet(g02, obj2);
                        return;
                    }
                    Q.presentFragment(g02);
                    return;
                }
                return;
            case 6:
                qr qrVar = ((ei.m7) obj).f10644b;
                SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j10).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    qrVar.o(th2, true);
                    return;
                }
            case 7:
                gi.o8 o8Var = (gi.o8) obj;
                Context context2 = o8Var.getContext();
                gi.t8 t8Var = o8Var.f13340a0;
                org.telegram.ui.ActionBar.d2 d2Var = t8Var.f28601g1;
                int i14 = gi.t8.V1;
                org.telegram.ui.Components.t4.R(context2, d2Var, t8Var.J0, new ei.c1(o8Var, j10, 1));
                return;
            case 8:
                gi.va vaVar2 = (gi.va) obj;
                gi.qa qaVar2 = vaVar2.G;
                if (qaVar2 != null) {
                    qaVar2.f(true);
                    vaVar2.G = null;
                }
                gi.ma maVar = vaVar2.f13776y;
                if (maVar != null) {
                    qaVar = maVar.c(j10);
                } else {
                    qaVar = null;
                }
                vaVar2.G = qaVar;
                if (qaVar != null) {
                    vaVar2.K = qaVar.f13452a;
                    vaVar2.f13751r.c();
                    gi.ha haVar = vaVar2.f13726i0;
                    int i15 = vaVar2.K;
                    if (i15 != 1 && i15 != 0) {
                        i13 = -14737633;
                    }
                    haVar.setBackgroundColor(i13);
                    vaVar2.I.set(vaVar2.G.f13454c);
                    gi.qa qaVar3 = vaVar2.G;
                    vaVar2.H = qaVar3.f13453b;
                    qaVar3.e();
                    if (az.o() > 1) {
                        org.telegram.messenger.lc.e(360928);
                    }
                }
                vaVar2.f13776y = null;
                Activity activity = vaVar2.f13702b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).A0.post(new gi.v8(vaVar2, 5));
                    return;
                } else {
                    vaVar2.p(true);
                    return;
                }
            case 9:
                gi.za zaVar = ((gi.fb) obj).f12758a;
                if (zaVar != null) {
                    zaVar.n(j10, false);
                    return;
                }
                return;
            case 10:
                ji.b0 b0Var = (ji.b0) obj;
                hp.s1(b0Var.f28583a).Q2(this.f5004b, b0Var.m1, true, false, new ji.r(b0Var, 1));
                return;
            case 11:
                ji.i0 i0Var = (ji.i0) obj;
                i0Var.f16319i = null;
                i0Var.f16318g.l(j10);
                i0Var.f16322l++;
                i0Var.a();
                ji.h0 h0Var = i0Var.h;
                if (h0Var != null) {
                    h0Var.H0();
                    return;
                }
                return;
            case 12:
                kg.e0 e0Var = (kg.e0) obj;
                e0Var.getClass();
                try {
                    qr.a0(e0Var.f16980t0).f24936b.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 13:
                String str = g2.n0.f11873a;
                l2.f fVar = ((k2.c0) ((m2.u) ((m2.t) obj).f19007c)).f16459a.f16572s;
                l2.a U = fVar.U();
                fVar.V(U, 1010, new l2.d(U, j10));
                return;
            case 14:
                mi.p pVar = (mi.p) obj;
                org.telegram.ui.Components.t4.L(pVar.f38416b.X1.getParentActivity(), j10, new hi.d(pVar, 12), pVar.f38415a);
                return;
            case 15:
                mi.c2 c2Var = (mi.c2) obj;
                org.telegram.ui.Components.t4.L(c2Var.getParentActivity(), j10, new gi.v5(c2Var, 16), c2Var.getResourceProvider());
                return;
            case 16:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j10);
                return;
            case 17:
                ((VideoCapturerDevice) obj).lambda$init$3(j10);
                return;
            case 18:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j10);
                return;
            case 19:
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj;
                if (u3Var != null) {
                    u3Var.a(true);
                }
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new wm(a1.g.j(j10, "user_id")));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.ac Q2 = org.telegram.ui.Components.fc.a0((org.telegram.ui.z6) obj).Q(2131624051, 36, bd.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j10, false, false)));
                Q2.f31800r = false;
                Q2.j();
                return;
            case 21:
                jf jfVar = (jf) obj;
                jfVar.getClass();
                jfVar.presentFragment(wm.ra(j10));
                return;
            case 22:
                hk hkVar = (hk) obj;
                bi biVar = hkVar.f38416b;
                if (!hkVar.L && hkVar.M0 && hkVar.isShown()) {
                    oh ohVar = biVar.f32249m3;
                    org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                    if ((ohVar.Q() <= org.telegram.messenger.g0.L(20.0f) || hkVar.C0 || hkVar.L0) && SystemClock.uptimeMillis() < j10) {
                        hkVar.postDelayed(hkVar.P0, 32L);
                        return;
                    }
                    hkVar.P0 = null;
                    org.telegram.ui.ActionBar.e6 e6Var2 = hkVar.f38415a;
                    if (d2Var2 != null && d2Var2.getParentActivity() != null) {
                        context = d2Var2.getParentActivity();
                    } else {
                        context = hkVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var2);
                        String M0 = bd.M0(2131743215, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        lg.y0 y0Var = new lg.y0(hkVar, context);
                        y0Var.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.r6.V(y0Var, org.telegram.ui.ActionBar.k6.f27988j5, e6Var2);
                        org.telegram.ui.ActionBar.r6.E(y0Var, org.telegram.ui.ActionBar.k6.f28176t5, e6Var2);
                        y0Var.setHint(bd.M0(2131743179, null));
                        y0Var.setText(hkVar.f34425t0);
                        y0Var.setSelection(y0Var.length());
                        y0Var.setInputType(147457);
                        y0Var.setMaxLines(5);
                        y0Var.setImeOptions(6);
                        org.telegram.ui.ActionBar.r6.G(y0Var, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, e6Var2);
                        y0Var.setBackground(null);
                        y0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(1, context, e6Var2);
                        int i16 = org.telegram.ui.ActionBar.k6.f27972i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i16, e6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
                        c2Var2.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(c2Var2, h02, null, N, e6Var2);
                        String M02 = bd.M0(2131743087, null);
                        if (hkVar.f34426u0 && hkVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        c2Var2.e(M02, "", z10, false, false);
                        c2Var2.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var2.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (bd.f21784a0) {
                            i3 = 5;
                        } else {
                            i3 = 3;
                        }
                        layoutParams.gravity = i3 | 16;
                        c2Var2.getCheckBoxView().setLayoutParams(layoutParams);
                        if (bd.f21784a0) {
                            i10 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i10 = 0;
                        }
                        int L2 = org.telegram.messenger.g0.L(12.0f);
                        if (bd.f21784a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        c2Var2.setPadding(i10, L2, L, org.telegram.messenger.g0.L(12.0f));
                        if (hkVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c2Var2.setEnabled(z11);
                        c2Var2.setOnClickListener(new org.telegram.ui.Components.z0(c2Var2, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(y0Var, mf.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(c2Var2, mf.t(-1, -2, 83, 8, 0, 8, 0));
                        s1Var.H = 6;
                        alertDialog$Builder.o(linearLayout);
                        s1Var.f28523a = org.telegram.messenger.g0.L(292.0f);
                        alertDialog$Builder.h(bd.M0(2131752589, null), new org.telegram.ui.Components.a3(11));
                        alertDialog$Builder.k(bd.M0(2131754486, null), new aa.a(hkVar, y0Var, c2Var2, 26));
                        hkVar.U0 = s1Var;
                        s1Var.f28548k0 = false;
                        s1Var.setOnShowListener(new org.telegram.ui.Components.e2(y0Var, 1));
                        s1Var.setOnDismissListener(new org.telegram.ui.Components.p0(hkVar, 5));
                        s1Var.create();
                        Window window = s1Var.getWindow();
                        Rect rect = new Rect();
                        biVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        s1Var.show();
                        View d = s1Var.d(-1);
                        if ((d instanceof TextView) && !TextUtils.isEmpty(hkVar.f34425t0)) {
                            y0Var.addTextChangedListener(new gk(y0Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                hkVar.P0 = null;
                return;
            case 23:
                ud0 ud0Var = (ud0) obj;
                ud0Var.h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
                org.telegram.messenger.g0.i3(new qd0(ud0Var, 1), 100L);
                return;
            case 24:
                bf0 bf0Var = (bf0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (!PhotoViewer.v1().U1() && (T2 == null || !T2.hasShownSheet())) {
                    if (T2 != null) {
                        e6Var = T2.getResourceProvider();
                    }
                } else {
                    e6Var = new ei.b();
                }
                new mb(u02, e6Var, this.f5004b, 15, "", new ye0(bf0Var, 0), 0L).show();
                return;
            case 25:
                uw uwVar = (uw) obj;
                uwVar.M4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(pr.a(j10, 0L));
                uwVar.D2.y(uwVar, arrayList, null, false, uwVar.K2, uwVar.L2, uwVar.M2, null);
                return;
            case 26:
                ((x30) obj).o1(j10, false);
                return;
            case 27:
                l90 l90Var = (l90) obj;
                l90Var.getClass();
                l90Var.presentFragment(wm.ra(j10));
                return;
            case 28:
                wm wmVar = ((ph) obj).f48577f;
                wmVar.O7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10);
                if (j10 == wmVar.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                wmVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                zy zyVar = (zy) obj;
                zyVar.f26996e = SystemClock.elapsedRealtime();
                zyVar.f26995c = false;
                if (j10 == -1) {
                    zyVar.d = false;
                    zyVar.f26994b = 0L;
                } else {
                    zyVar.f26994b = j10;
                    zyVar.d = true;
                }
                hs.e().k(278, zyVar);
                return;
        }
    }
}
