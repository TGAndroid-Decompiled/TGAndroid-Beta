package di;

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
import org.telegram.messenger.fz;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.p90;
import org.telegram.ui.th;
import org.telegram.ui.yw;
import org.telegram.ui.z41;
public final class x2 implements Runnable {
    public final int f9708a;
    public final long f9709b;
    public final Object f9710c;

    public x2(Object obj, long j3, int i7) {
        this.f9708a = i7;
        this.f9710c = obj;
        this.f9709b = j3;
    }

    @Override
    public final void run() {
        hi.na naVar;
        Context context;
        boolean z10;
        int i7;
        int i10;
        int L;
        boolean z11;
        int i11;
        int i12 = this.f9708a;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        boolean z12 = false;
        r11 = 0;
        int i13 = 0;
        long j3 = this.f9709b;
        Object obj = this.f9710c;
        switch (i12) {
            case 0:
                org.telegram.ui.Components.cc.a0((lb) obj).I(2131624227, hd.M0(2131750221, null), hd.H(',', "Gift2Converted", (int) j3)).k(true);
                return;
            case 1:
                org.telegram.ui.Components.cc.a0((z41) obj).I(2131624227, hd.M0(2131750221, null), hd.H(',', "Gift2ConvertedChannel", (int) j3)).k(true);
                return;
            case 2:
                ((fi.q) obj).f12208s.h0(j3, false);
                return;
            case 3:
                fi.b4 b4Var = ((fi.l2) obj).f11985a;
                if (j3 <= 0) {
                    z12 = true;
                }
                b4Var.i0(z12);
                return;
            case 4:
                org.telegram.messenger.g0.i3((fi.n3) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j3)));
                return;
            case 5:
                org.telegram.ui.ActionBar.e2 g02 = z41.g0(np.s1(((fi.s6) obj).f12319a).M0(Long.valueOf(-j3)), true);
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    hi.sa saVar = hi.sa.G2;
                    if (saVar != null && saVar.d) {
                        ?? obj2 = new Object();
                        obj2.f28476a = true;
                        Q.showAsSheet(g02, obj2);
                        return;
                    }
                    Q.presentFragment(g02);
                    return;
                }
                return;
            case 6:
                vr vrVar = ((fi.f7) obj).f11709b;
                SQLiteDatabase sQLiteDatabase = vrVar.f27221b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    vrVar.o(th2, true);
                    return;
                }
            case 7:
                hi.l8 l8Var = (hi.l8) obj;
                Context context2 = l8Var.getContext();
                hi.q8 q8Var = l8Var.f14600a0;
                org.telegram.ui.ActionBar.e2 e2Var = q8Var.f29703j1;
                int i14 = hi.q8.Y1;
                org.telegram.ui.Components.t4.P(context2, e2Var, q8Var.J0, new ai.d0(l8Var, j3, 2));
                return;
            case 8:
                hi.sa saVar2 = (hi.sa) obj;
                hi.na naVar2 = saVar2.G;
                if (naVar2 != null) {
                    naVar2.f(true);
                    saVar2.G = null;
                }
                hi.ja jaVar = saVar2.f15113y;
                if (jaVar != null) {
                    naVar = jaVar.a(j3);
                } else {
                    naVar = null;
                }
                saVar2.G = naVar;
                if (naVar != null) {
                    saVar2.K = naVar.f14781a;
                    saVar2.f15088r.c();
                    hi.ea eaVar = saVar2.f15063i0;
                    int i15 = saVar2.K;
                    if (i15 != 1 && i15 != 0) {
                        i13 = -14737633;
                    }
                    eaVar.setBackgroundColor(i13);
                    saVar2.I.set(saVar2.G.f14783c);
                    hi.na naVar3 = saVar2.G;
                    saVar2.H = naVar3.f14782b;
                    naVar3.e();
                    if (gz.o() > 1) {
                        qc.e(360928);
                    }
                }
                saVar2.f15113y = null;
                Activity activity = saVar2.f15039b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f42667y0.post(new hi.s8(saVar2, 5));
                    return;
                } else {
                    saVar2.p(true);
                    return;
                }
            case 9:
                hi.wa waVar = ((hi.cb) obj).f13990a;
                if (waVar != null) {
                    waVar.p(j3, false);
                    return;
                }
                return;
            case 10:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                try {
                    vr.a0(h0Var.f17107t0).f27221b.executeFast("DELETE FROM search_recent WHERE did = " + j3).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 11:
                li.d0 d0Var = (li.d0) obj;
                np.s1(d0Var.f29679a).Q2(this.f9709b, d0Var.f19542p1, true, false, new li.s(d0Var, 1));
                return;
            case 12:
                li.k0 k0Var = (li.k0) obj;
                k0Var.f19597i = null;
                k0Var.f19596g.l(j3);
                k0Var.f19600l++;
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.I();
                    return;
                }
                return;
            case 13:
                String str = h2.l0.f13471a;
                m2.e eVar = ((l2.z) ((n2.s) ((k8.a) obj).f17789c)).f19233a.f18980s;
                m2.a U = eVar.U();
                eVar.V(U, 1010, new m2.c(U, j3));
                return;
            case 14:
                oi.o oVar = (oi.o) obj;
                org.telegram.ui.Components.t4.J(oVar.f33609b.f36424a2.getParentActivity(), j3, new ia.d(oVar, 15), oVar.f33608a);
                return;
            case 15:
                oi.z1 z1Var = (oi.z1) obj;
                org.telegram.ui.Components.t4.J(z1Var.getParentActivity(), j3, new gc.b(z1Var, 23), z1Var.getResourceProvider());
                return;
            case 16:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$7(j3);
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
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new an(a8.p0.j(j3, "user_id")));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.xb Q2 = org.telegram.ui.Components.cc.a0((org.telegram.ui.y6) obj).Q(2131624052, 36, hd.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j3, false, false)));
                Q2.f41643r = false;
                Q2.j();
                return;
            case 21:
                rf rfVar = (rf) obj;
                rfVar.getClass();
                rfVar.presentFragment(an.ua(j3));
                return;
            case 22:
                qk qkVar = (qk) obj;
                ki kiVar = qkVar.f33609b;
                if (!qkVar.L && qkVar.M0 && qkVar.isShown()) {
                    xh xhVar = kiVar.f36470p3;
                    org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.f36424a2;
                    if ((xhVar.Q() <= org.telegram.messenger.g0.L(20.0f) || qkVar.C0 || qkVar.L0) && SystemClock.uptimeMillis() < j3) {
                        qkVar.postDelayed(qkVar.P0, 32L);
                        return;
                    }
                    qkVar.P0 = null;
                    org.telegram.ui.ActionBar.e6 e6Var2 = qkVar.f33608a;
                    if (e2Var2 != null && e2Var2.getParentActivity() != null) {
                        context = e2Var2.getParentActivity();
                    } else {
                        context = qkVar.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var2);
                        String M0 = hd.M0(2131743205, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        kg.x0 x0Var = new kg.x0(qkVar, context);
                        x0Var.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.q6.U(x0Var, org.telegram.ui.ActionBar.j6.f28957j5, e6Var2);
                        org.telegram.ui.ActionBar.q6.D(x0Var, org.telegram.ui.ActionBar.j6.f29145t5, e6Var2);
                        x0Var.setHint(hd.M0(2131743169, null));
                        x0Var.setText(qkVar.f38685t0);
                        x0Var.setSelection(x0Var.length());
                        x0Var.setInputType(147457);
                        x0Var.setMaxLines(5);
                        x0Var.setImeOptions(6);
                        org.telegram.ui.ActionBar.q6.F(x0Var, org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, e6Var2);
                        x0Var.setBackground(null);
                        x0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, e6Var2);
                        int i16 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i16, e6Var2), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i16);
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.q6.j(c2Var, h02, null, M, e6Var2);
                        String M02 = hd.M0(2131743077, null);
                        if (qkVar.f38686u0 && qkVar.getPublicKey() != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        c2Var.e(M02, "", z10, false, false);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (hd.f24104a0) {
                            i7 = 5;
                        } else {
                            i7 = 3;
                        }
                        layoutParams.gravity = i7 | 16;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (hd.f24104a0) {
                            i10 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i10 = 0;
                        }
                        int L2 = org.telegram.messenger.g0.L(12.0f);
                        if (hd.f24104a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        c2Var.setPadding(i10, L2, L, org.telegram.messenger.g0.L(12.0f));
                        if (qkVar.getPublicKey() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c2Var.setEnabled(z11);
                        c2Var.setOnClickListener(new org.telegram.ui.Components.x0(c2Var, 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(x0Var, c8.ja.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(c2Var, c8.ja.t(-1, -2, 83, 8, 0, 8, 0));
                        t1Var.H = 6;
                        alertDialog$Builder.o(linearLayout);
                        t1Var.f29614a = org.telegram.messenger.g0.L(292.0f);
                        alertDialog$Builder.h(hd.M0(2131752589, null), new org.telegram.ui.Components.e2(18));
                        alertDialog$Builder.k(hd.M0(2131754486, null), new a3.h(qkVar, x0Var, c2Var, 27));
                        qkVar.U0 = t1Var;
                        t1Var.f29639k0 = false;
                        t1Var.setOnShowListener(new org.telegram.ui.Components.f2(x0Var, 1));
                        t1Var.setOnDismissListener(new org.telegram.ui.Components.m0(qkVar, 4));
                        t1Var.create();
                        Window window = t1Var.getWindow();
                        Rect rect = new Rect();
                        kiVar.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        if ((d instanceof TextView) && !TextUtils.isEmpty(qkVar.f38685t0)) {
                            x0Var.addTextChangedListener(new pk(x0Var, (TextView) d));
                            return;
                        }
                        return;
                    }
                    return;
                }
                qkVar.P0 = null;
                return;
            case 23:
                ae0 ae0Var = (ae0) obj;
                ae0Var.getClass();
                ae0Var.h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
                org.telegram.messenger.g0.i3(new wd0(ae0Var, 1), 100L);
                return;
            case 24:
                cf0 cf0Var = (cf0) obj;
                Activity u02 = org.telegram.messenger.g0.u0();
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (!PhotoViewer.p1().P1() && (T2 == null || !T2.hasShownSheet())) {
                    if (T2 != null) {
                        e6Var = T2.getResourceProvider();
                    }
                } else {
                    e6Var = new fi.b();
                }
                new bb(u02, e6Var, this.f9709b, 15, "", new ze0(cf0Var, 0), 0L).show();
                return;
            case 25:
                yw ywVar = (yw) obj;
                ywVar.M4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(ur.a(j3, 0L));
                ywVar.E2.y(ywVar, arrayList, null, false, ywVar.L2, ywVar.M2, ywVar.N2, null);
                return;
            case 26:
                ((c40) obj).p1(j3, false);
                return;
            case 27:
                p90 p90Var = (p90) obj;
                p90Var.getClass();
                p90Var.presentFragment(an.ua(j3));
                return;
            case 28:
                an anVar = ((th) obj).f51587f;
                anVar.P7(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j3);
                if (j3 == anVar.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                anVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                fz fzVar = (fz) obj;
                fzVar.f23580e = SystemClock.elapsedRealtime();
                fzVar.f23579c = false;
                if (j3 == -1) {
                    fzVar.d = false;
                    fzVar.f23578b = 0L;
                } else {
                    fzVar.f23578b = j3;
                    fzVar.d = true;
                }
                ns.e().k(278, fzVar);
                return;
        }
    }
}
