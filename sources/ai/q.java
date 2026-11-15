package ai;

import android.content.Context;
import android.media.AudioManager;
import di.c6;
import di.e4;
import hi.m5;
import hi.q3;
import hi.r3;
import hi.u9;
import hi.w6;
import hi.z2;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gv;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.zz;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ll;
import org.telegram.ui.qn;
public final class q implements Runnable {
    public final int f1434a;
    public final boolean f1435b;
    public final Object f1436c;

    public q(int i7, Object obj, boolean z10) {
        this.f1434a = i7;
        this.f1436c = obj;
        this.f1435b = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        i6 J0;
        String str;
        String str2;
        long j3 = 0;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i11 = 8;
        boolean z10 = true;
        int i12 = 0;
        switch (this.f1434a) {
            case 0:
                boolean z11 = this.f1435b;
                t tVar = (t) this.f1436c;
                t[] tVarArr = DictationAsr.f42579a;
                if (tVar.d == 0) {
                    z10 = false;
                }
                if (z11 == z10) {
                    ArrayList arrayList = new ArrayList(tVar.f1546j);
                    tVar.f1546j.clear();
                    int size = arrayList.size();
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((u) obj).a(z11);
                    }
                    return;
                }
                return;
            case 1:
                ch.k kVar = (ch.k) this.f1436c;
                if (this.f1435b) {
                    ((ch.o) kVar.f5103x.f1273c).f5181w.setVisibility(4);
                    return;
                } else {
                    kVar.getClass();
                    return;
                }
            case 2:
                di.i1 i1Var = (di.i1) this.f1436c;
                if (!this.f1435b) {
                    i1Var.f8774m2.setVisibility(8);
                    return;
                } else {
                    i1Var.getClass();
                    return;
                }
            case 3:
                c6 c6Var = (c6) this.f1436c;
                boolean z12 = this.f1435b;
                c6Var.getClass();
                if (z12) {
                    i7 = 2131750424;
                } else {
                    i7 = 2131750421;
                }
                c6Var.q2(c6Var.f8318f3, org.telegram.messenger.g0.X2(hd.a0(null, null, i7, c6Var.z1())), true);
                return;
            case 4:
                boolean z13 = this.f1435b;
                c6 c6Var2 = ((e4) this.f1436c).W;
                TL_stars.SavedStarGift E1 = c6Var2.E1(z13);
                if (E1 != null) {
                    c6Var2.f8309a3 = true;
                    c6Var2.k2(E1, c6Var2.C2);
                } else {
                    TL_stars.TL_starGiftUnique F1 = c6Var2.F1(z13);
                    if (F1 != null) {
                        c6Var2.f8309a3 = true;
                        c6Var2.i2(F1.slug, F1, c6Var2.C2);
                    }
                }
                c6Var2.Q2 = -1;
                xb xbVar = xb.f41627w;
                if (xbVar != null) {
                    xbVar.c(0L, false);
                    return;
                }
                return;
            case 5:
                gi.m mVar = (gi.m) this.f1436c;
                boolean z14 = this.f1435b;
                vp0 vp0Var = mVar.f13337a0;
                if (z14) {
                    new gi.p(vp0Var.f13352a, hd.M0(2131746693, null), new g0(vp0Var, 19)).show();
                    return;
                } else {
                    vp0Var.b(mVar.f13336a.E);
                    return;
                }
            case 6:
                z2 z2Var = (z2) this.f1436c;
                if (!this.f1435b) {
                    z2Var.J.setVisibility(8);
                    return;
                } else {
                    z2Var.getClass();
                    return;
                }
            case 7:
                boolean z15 = this.f1435b;
                q3 q3Var = ((r3) this.f1436c).f14973b;
                if (z15) {
                    i11 = 0;
                }
                q3Var.setVisibility(i11);
                return;
            case 8:
                m5 m5Var = (m5) this.f1436c;
                if (!this.f1435b) {
                    m5Var.H0.setVisibility(8);
                    return;
                } else {
                    m5Var.getClass();
                    return;
                }
            case 9:
                w6 w6Var = (w6) this.f1436c;
                if (!this.f1435b) {
                    w6Var.setVisibility(8);
                    return;
                } else {
                    w6Var.getClass();
                    return;
                }
            case 10:
                u9 u9Var = (u9) this.f1436c;
                if (!this.f1435b) {
                    u9Var.f15200k2.f15070k1.setVisibility(8);
                    return;
                } else {
                    u9Var.getClass();
                    return;
                }
            case 11:
                ki.x2 x2Var = (ki.x2) this.f1436c;
                boolean z16 = this.f1435b;
                ki.v2 v2Var = x2Var.F;
                ki.p2 p2Var = x2Var.E;
                if (p2Var.getWebView() != null) {
                    p2Var.getWebView().animate().cancel();
                    p2Var.getWebView().animate().alpha(0.0f).start();
                }
                v2Var.setLoadProgress(0.0f);
                v2Var.setAlpha(1.0f);
                v2Var.setVisibility(0);
                if (!z16) {
                    user = np.s1(x2Var.I).a2(Long.valueOf(x2Var.J));
                }
                p2Var.setBotUser(user);
                if (!z16) {
                    p2Var.s(x2Var.I, x2Var.J);
                }
                ns.f(p2Var.N).d(new org.telegram.ui.web.q(p2Var, 1));
                return;
            case 12:
                ((li.k0) this.f1436c).f(this.f1435b, false);
                return;
            case 13:
                boolean z17 = this.f1435b;
                String str3 = h2.l0.f13471a;
                l2.f0 f0Var = ((l2.z) ((n2.s) ((k8.a) this.f1436c).f17789c)).f19233a;
                if (f0Var.f18953d0 != z17) {
                    f0Var.f18953d0 = z17;
                    f0Var.f18969m.e(23, new l2.v(1, z17));
                    return;
                }
                return;
            case 14:
                ((CameraController) this.f1436c).lambda$recordVideo$11(this.f1435b);
                return;
            case 15:
                ((VideoCapturerDevice) this.f1436c).lambda$new$0(this.f1435b);
                return;
            case 16:
                ((VoIPService) this.f1436c).lambda$startGroupCall$27(this.f1435b);
                return;
            case 17:
                ((AudioManager) this.f1436c).setSpeakerphoneOn(this.f1435b);
                return;
            case 18:
                ((ConnectionsManager) this.f1436c).lambda$setIsUpdating$22(this.f1435b);
                return;
            case 19:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1436c;
                boolean z18 = this.f1435b;
                q0Var.M = null;
                if (q0Var.getParent() != null) {
                    q0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z18) {
                    q0Var.performHapticFeedback(0);
                }
                q0Var.V(null, null);
                q0Var.f29518r0 = true;
                return;
            case 20:
                Context context = (Context) this.f1436c;
                if (this.f1435b) {
                    i10 = 2131753038;
                } else {
                    i10 = 2131748392;
                }
                vf.c.t(context, hd.M0(i10, null));
                return;
            case 21:
                boolean z19 = this.f1435b;
                rw0 rw0Var = ((ll) this.f1436c).f48998b.f45354s1;
                if (rw0Var != null && z19) {
                    rw0Var.setVisibility(8);
                    return;
                }
                return;
            case 22:
                qn qnVar = (qn) this.f1436c;
                qnVar.f50692x0.autotranslation = this.f1435b;
                qnVar.getMessagesController().Q3(qnVar.f50692x0, false);
                return;
            case 23:
                ep epVar = (ep) this.f1436c;
                boolean z20 = this.f1435b;
                cp cpVar = epVar.f34396r1;
                if (cpVar != null && cpVar.d != null && !epVar.J) {
                    epVar.U0(z20, true);
                    if (epVar.G1 != null) {
                        epVar.J1 = true;
                        if (!epVar.P0()) {
                            wallPaper = epVar.f34397s1.f53546g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        p3 p3Var = epVar.G1.f34009a;
                        if (p3Var.f29470a) {
                            epVar.f34397s1.r(null, wallPaper2, false, Boolean.valueOf(z20), false);
                        } else {
                            epVar.f34397s1.r(p3Var, wallPaper2, false, Boolean.valueOf(z20), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (J0 = ep.J0(z20)) != null && J0 != j6.I) {
                        if (z20 == epVar.f34399u1) {
                            z10 = false;
                        }
                        epVar.d2 = z10;
                        epVar.X0(J0);
                    }
                    if (cpVar.d != null) {
                        while (i12 < cpVar.d.size()) {
                            ((dp) cpVar.d.get(i12)).f34011c = z20 ? 1 : 0;
                            i12++;
                        }
                        cpVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                gv gvVar = (gv) this.f1436c;
                if (!this.f1435b) {
                    gvVar.F.setVisibility(8);
                    return;
                }
                return;
            case 25:
                zz zzVar = (zz) this.f1436c;
                zzVar.e1(zzVar.f42516u2, this.f1435b);
                return;
            case 26:
                u20 u20Var = (u20) this.f1436c;
                if (!this.f1435b) {
                    u20Var.f39879r.setVisibility(8);
                    return;
                } else {
                    u20Var.getClass();
                    return;
                }
            case 27:
                boolean z21 = this.f1435b;
                r40 r40Var = ((j40) this.f1436c).I0;
                if (!r40Var.f38860l0) {
                    try {
                        r40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(r40Var.h.getParentActivity());
                    if (z21) {
                        j3 = r40Var.f38858k0;
                    }
                    r40Var.f38854i0 = j3;
                    r40Var.f38852h0 = System.currentTimeMillis();
                    r40Var.f38856j0 = true;
                    r40Var.w();
                    r40Var.invalidate();
                    ns.f(r40Var.f38844e).k(155, Integer.valueOf(r40Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 28:
                hk0 hk0Var = (hk0) this.f1436c;
                boolean z22 = this.f1435b;
                hk0Var.getClass();
                if (z22) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                hk0Var.q0(str, false);
                return;
            default:
                boolean z23 = this.f1435b;
                org.telegram.ui.ActionBar.e2 e2Var = ((il0) this.f1436c).H;
                if (z23) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                e2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
        }
    }

    public q(boolean z10, t tVar) {
        this.f1434a = 0;
        this.f1435b = z10;
        this.f1436c = tVar;
    }
}
