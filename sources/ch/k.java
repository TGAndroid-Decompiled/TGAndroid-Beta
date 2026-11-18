package ch;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import di.f6;
import di.h1;
import di.h4;
import hi.a3;
import hi.l5;
import hi.q3;
import hi.r3;
import hi.v9;
import hi.w6;
import ki.l2;
import ki.r2;
import ki.t2;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t3;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.z40;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ml;
import org.telegram.ui.rn;
public final class k implements Runnable {
    public final int f5389a;
    public final boolean f5390b;
    public final Object f5391c;

    public k(int i7, Object obj, boolean z10) {
        this.f5389a = i7;
        this.f5391c = obj;
        this.f5390b = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        m6 K0;
        String str;
        String str2;
        int i11 = this.f5389a;
        long j3 = 0;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i12 = 8;
        boolean z10 = true;
        boolean z11 = this.f5390b;
        Object obj = this.f5391c;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                if (z11) {
                    ((p) lVar.f5402x.f1264c).f5471w.setVisibility(4);
                    return;
                } else {
                    lVar.getClass();
                    return;
                }
            case 1:
                h1 h1Var = (h1) obj;
                if (!z11) {
                    h1Var.f8908m2.setVisibility(8);
                    return;
                } else {
                    h1Var.getClass();
                    return;
                }
            case 2:
                f6 f6Var = (f6) obj;
                f6Var.getClass();
                if (z11) {
                    i7 = 2131750408;
                } else {
                    i7 = 2131750405;
                }
                f6Var.C2(f6Var.f8787i3, org.telegram.messenger.g0.W2(gd.a0(null, null, i7, f6Var.E1())), true);
                return;
            case 3:
                f6 f6Var2 = ((h4) obj).W;
                TL_stars.SavedStarGift J1 = f6Var2.J1(z11);
                if (J1 != null) {
                    f6Var2.f8772a3 = true;
                    f6Var2.w2(J1, f6Var2.C2);
                } else {
                    TL_stars.TL_starGiftUnique K1 = f6Var2.K1(z11);
                    if (K1 != null) {
                        f6Var2.f8772a3 = true;
                        f6Var2.u2(K1.slug, K1, f6Var2.C2);
                    }
                }
                f6Var2.Q2 = -1;
                gc gcVar = gc.f35453w;
                if (gcVar != null) {
                    gcVar.c(0L, false);
                    return;
                }
                return;
            case 4:
                gi.m mVar = (gi.m) obj;
                dq0 dq0Var = mVar.f13652a0;
                if (z11) {
                    new gi.p(dq0Var.f13667a, gd.M0(2131746498, null), new ai.g0(dq0Var, 20)).show();
                    return;
                } else {
                    dq0Var.b(mVar.f13651a.E);
                    return;
                }
            case 5:
                a3 a3Var = (a3) obj;
                if (!z11) {
                    a3Var.J.setVisibility(8);
                    return;
                } else {
                    a3Var.getClass();
                    return;
                }
            case 6:
                q3 q3Var = ((r3) obj).f15315b;
                if (z11) {
                    i12 = 0;
                }
                q3Var.setVisibility(i12);
                return;
            case 7:
                l5 l5Var = (l5) obj;
                if (!z11) {
                    l5Var.H0.setVisibility(8);
                    return;
                } else {
                    l5Var.getClass();
                    return;
                }
            case 8:
                w6 w6Var = (w6) obj;
                if (!z11) {
                    w6Var.setVisibility(8);
                    return;
                } else {
                    w6Var.getClass();
                    return;
                }
            case 9:
                v9 v9Var = (v9) obj;
                if (!z11) {
                    v9Var.f15617k2.f15458k1.setVisibility(8);
                    return;
                } else {
                    v9Var.getClass();
                    return;
                }
            case 10:
                t2 t2Var = (t2) obj;
                r2 r2Var = t2Var.F;
                l2 l2Var = t2Var.E;
                if (l2Var.getWebView() != null) {
                    l2Var.getWebView().animate().cancel();
                    l2Var.getWebView().animate().alpha(0.0f).start();
                }
                r2Var.setLoadProgress(0.0f);
                r2Var.setAlpha(1.0f);
                r2Var.setVisibility(0);
                if (!z11) {
                    user = mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
                }
                l2Var.setBotUser(user);
                if (!z11) {
                    l2Var.s(t2Var.I, t2Var.J);
                }
                ks.f(l2Var.N).d(new org.telegram.ui.web.q(l2Var, 1));
                return;
            case 11:
                ((li.k0) obj).f(z11, false);
                return;
            case 12:
                String str3 = h2.l0.f13786a;
                l2.f0 f0Var = ((l2.z) ((n2.s) ((k8.a) obj).f18184c)).f19600a;
                if (f0Var.f19320d0 != z11) {
                    f0Var.f19320d0 = z11;
                    f0Var.f19336m.e(23, new l2.v(1, z11));
                    return;
                }
                return;
            case 13:
                ((CameraController) obj).lambda$recordVideo$11(z11);
                return;
            case 14:
                ((VideoCapturerDevice) obj).lambda$new$0(z11);
                return;
            case 15:
                ((VoIPService) obj).lambda$startGroupCall$27(z11);
                return;
            case 16:
                ((AudioManager) obj).setSpeakerphoneOn(z11);
                return;
            case 17:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z11);
                return;
            case 18:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj;
                r0Var.M = null;
                if (r0Var.getParent() != null) {
                    r0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z11) {
                    r0Var.performHapticFeedback(0);
                }
                r0Var.V(null, null);
                r0Var.f29939r0 = true;
                return;
            case 19:
                Context context = (Context) obj;
                if (z11) {
                    i10 = 2131753027;
                } else {
                    i10 = 2131748200;
                }
                vf.c.t(context, gd.M0(i10, null));
                return;
            case 20:
                yw0 yw0Var = ((ml) obj).f49876b.f46170s1;
                if (yw0Var != null && z11) {
                    yw0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                rn rnVar = (rn) obj;
                rnVar.f51707x0.autotranslation = z11;
                rnVar.getMessagesController().X3(rnVar.f51707x0, false);
                return;
            case 22:
                org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) obj;
                m0Var.M2 = null;
                m0Var.K2 = z11;
                if (z11) {
                    m0Var.L2 = SystemClock.uptimeMillis();
                }
                m0Var.C2.setLoading(z11);
                return;
            case 23:
                lp lpVar = (lp) obj;
                jp jpVar = lpVar.f37178r1;
                if (jpVar != null && jpVar.d != null && !lpVar.J) {
                    lpVar.V0(z11, true);
                    if (lpVar.G1 != null) {
                        lpVar.J1 = true;
                        if (!lpVar.Q0()) {
                            wallPaper = lpVar.f37179s1.f54538g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        t3 t3Var = lpVar.G1.f36837a;
                        if (t3Var.f29999a) {
                            lpVar.f37179s1.r(null, wallPaper2, false, Boolean.valueOf(z11), false);
                        } else {
                            lpVar.f37179s1.r(t3Var, wallPaper2, false, Boolean.valueOf(z11), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (K0 = lp.K0(z11)) != null && K0 != n6.I) {
                        if (z11 == lpVar.f37181u1) {
                            z10 = false;
                        }
                        lpVar.d2 = z10;
                        lpVar.Y0(K0);
                    }
                    if (jpVar.d != null) {
                        for (int i13 = 0; i13 < jpVar.d.size(); i13++) {
                            ((kp) jpVar.d.get(i13)).f36839c = z11 ? 1 : 0;
                        }
                        jpVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                lv lvVar = (lv) obj;
                if (!z11) {
                    lvVar.F.setVisibility(8);
                    return;
                }
                return;
            case 25:
                g00 g00Var = (g00) obj;
                g00Var.f1(g00Var.f35268u2, z11);
                return;
            case 26:
                c30 c30Var = (c30) obj;
                if (!z11) {
                    c30Var.f33874r.setVisibility(8);
                    return;
                } else {
                    c30Var.getClass();
                    return;
                }
            case 27:
                z40 z40Var = ((r40) obj).I0;
                if (!z40Var.f42786l0) {
                    try {
                        z40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(z40Var.h.getParentActivity());
                    if (z11) {
                        j3 = z40Var.f42784k0;
                    }
                    z40Var.f42780i0 = j3;
                    z40Var.f42778h0 = System.currentTimeMillis();
                    z40Var.f42782j0 = true;
                    z40Var.w();
                    z40Var.invalidate();
                    ks.f(z40Var.f42770e).k(155, Integer.valueOf(z40Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 28:
                pk0 pk0Var = (pk0) obj;
                pk0Var.getClass();
                if (z11) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                pk0Var.q0(str, false);
                return;
            default:
                h2 h2Var = ((ql0) obj).H;
                if (z11) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                h2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
        }
    }
}
