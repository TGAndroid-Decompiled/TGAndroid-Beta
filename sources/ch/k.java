package ch;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import di.f6;
import di.h1;
import di.h4;
import hi.f7;
import hi.i3;
import hi.pa;
import hi.v5;
import hi.y3;
import hi.z3;
import ki.k2;
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
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z40;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ml;
import org.telegram.ui.rn;
public final class k implements Runnable {
    public final int f5381a;
    public final boolean f5382b;
    public final Object f5383c;

    public k(int i7, Object obj, boolean z10) {
        this.f5381a = i7;
        this.f5383c = obj;
        this.f5382b = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        m6 K0;
        String str;
        String str2;
        int i11 = this.f5381a;
        long j3 = 0;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i12 = 8;
        boolean z10 = true;
        boolean z11 = this.f5382b;
        Object obj = this.f5383c;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                if (z11) {
                    ((p) lVar.f5394x.f1215c).f5463w.setVisibility(4);
                    return;
                } else {
                    lVar.getClass();
                    return;
                }
            case 1:
                h1 h1Var = (h1) obj;
                if (!z11) {
                    h1Var.f8898m2.setVisibility(8);
                    return;
                } else {
                    h1Var.getClass();
                    return;
                }
            case 2:
                f6 f6Var = (f6) obj;
                f6Var.getClass();
                if (z11) {
                    i7 = 2131750407;
                } else {
                    i7 = 2131750404;
                }
                f6Var.C2(f6Var.f8772i3, org.telegram.messenger.g0.W2(gd.a0(null, null, i7, f6Var.E1())), true);
                return;
            case 3:
                f6 f6Var2 = ((h4) obj).W;
                TL_stars.SavedStarGift J1 = f6Var2.J1(z11);
                if (J1 != null) {
                    f6Var2.f8757a3 = true;
                    f6Var2.w2(J1, f6Var2.C2);
                } else {
                    TL_stars.TL_starGiftUnique K1 = f6Var2.K1(z11);
                    if (K1 != null) {
                        f6Var2.f8757a3 = true;
                        f6Var2.u2(K1.slug, K1, f6Var2.C2);
                    }
                }
                f6Var2.Q2 = -1;
                fc fcVar = fc.f35083w;
                if (fcVar != null) {
                    fcVar.c(0L, false);
                    return;
                }
                return;
            case 4:
                gi.m mVar = (gi.m) obj;
                eq0 eq0Var = mVar.f13644a0;
                if (z11) {
                    new gi.p(eq0Var.f13659a, gd.N0(2131746497, null), new ai.d0(eq0Var, 20)).show();
                    return;
                } else {
                    eq0Var.b(mVar.f13643a.E);
                    return;
                }
            case 5:
                i3 i3Var = (i3) obj;
                if (!z11) {
                    i3Var.J.setVisibility(8);
                    return;
                } else {
                    i3Var.getClass();
                    return;
                }
            case 6:
                y3 y3Var = ((z3) obj).f15898b;
                if (z11) {
                    i12 = 0;
                }
                y3Var.setVisibility(i12);
                return;
            case 7:
                v5 v5Var = (v5) obj;
                if (!z11) {
                    v5Var.H0.setVisibility(8);
                    return;
                } else {
                    v5Var.getClass();
                    return;
                }
            case 8:
                f7 f7Var = (f7) obj;
                if (!z11) {
                    f7Var.setVisibility(8);
                    return;
                } else {
                    f7Var.getClass();
                    return;
                }
            case 9:
                pa paVar = (pa) obj;
                if (!z11) {
                    paVar.f15198o2.f15089k1.setVisibility(8);
                    return;
                } else {
                    paVar.getClass();
                    return;
                }
            case 10:
                t2 t2Var = (t2) obj;
                r2 r2Var = t2Var.F;
                k2 k2Var = t2Var.E;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().animate().cancel();
                    k2Var.getWebView().animate().alpha(0.0f).start();
                }
                r2Var.setLoadProgress(0.0f);
                r2Var.setAlpha(1.0f);
                r2Var.setVisibility(0);
                if (!z11) {
                    user = mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
                }
                k2Var.setBotUser(user);
                if (!z11) {
                    k2Var.s(t2Var.I, t2Var.J);
                }
                ks.f(k2Var.N).d(new org.telegram.ui.web.q(k2Var, 1));
                return;
            case 11:
                ((li.j0) obj).f(z11, false);
                return;
            case 12:
                String str3 = h2.l0.f13778a;
                l2.g0 g0Var = ((l2.a0) ((n2.s) ((jb.m) obj).f17465c)).f19342a;
                if (g0Var.f19418d0 != z11) {
                    g0Var.f19418d0 = z11;
                    g0Var.f19434m.e(23, new l2.w(1, z11));
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
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                q0Var.M = null;
                if (q0Var.getParent() != null) {
                    q0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z11) {
                    q0Var.performHapticFeedback(0);
                }
                q0Var.V(null, null);
                q0Var.f29980r0 = true;
                return;
            case 19:
                Context context = (Context) obj;
                if (z11) {
                    i10 = 2131753026;
                } else {
                    i10 = 2131748199;
                }
                vf.c.t(context, gd.N0(i10, null));
                return;
            case 20:
                zw0 zw0Var = ((ml) obj).f50076b.f46356s1;
                if (zw0Var != null && z11) {
                    zw0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                rn rnVar = (rn) obj;
                rnVar.f51796x0.autotranslation = z11;
                rnVar.getMessagesController().X3(rnVar.f51796x0, false);
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
                kp kpVar = (kp) obj;
                ip ipVar = kpVar.f36834r1;
                if (ipVar != null && ipVar.d != null && !kpVar.J) {
                    kpVar.V0(z11, true);
                    if (kpVar.G1 != null) {
                        kpVar.J1 = true;
                        if (!kpVar.Q0()) {
                            wallPaper = kpVar.f36835s1.f54654g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        s3 s3Var = kpVar.G1.f36472a;
                        if (s3Var.f30045a) {
                            kpVar.f36835s1.r(null, wallPaper2, false, Boolean.valueOf(z11), false);
                        } else {
                            kpVar.f36835s1.r(s3Var, wallPaper2, false, Boolean.valueOf(z11), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (K0 = kp.K0(z11)) != null && K0 != n6.I) {
                        if (z11 == kpVar.f36837u1) {
                            z10 = false;
                        }
                        kpVar.d2 = z10;
                        kpVar.Y0(K0);
                    }
                    if (ipVar.d != null) {
                        for (int i13 = 0; i13 < ipVar.d.size(); i13++) {
                            ((jp) ipVar.d.get(i13)).f36474c = z11 ? 1 : 0;
                        }
                        ipVar.f();
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
                g00Var.f1(g00Var.f35263u2, z11);
                return;
            case 26:
                c30 c30Var = (c30) obj;
                if (!z11) {
                    c30Var.f33914r.setVisibility(8);
                    return;
                } else {
                    c30Var.getClass();
                    return;
                }
            case 27:
                z40 z40Var = ((r40) obj).I0;
                if (!z40Var.f42681l0) {
                    try {
                        z40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(z40Var.h.getParentActivity());
                    if (z11) {
                        j3 = z40Var.f42679k0;
                    }
                    z40Var.f42675i0 = j3;
                    z40Var.f42673h0 = System.currentTimeMillis();
                    z40Var.f42677j0 = true;
                    z40Var.w();
                    z40Var.invalidate();
                    ks.f(z40Var.f42665e).k(155, Integer.valueOf(z40Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 28:
                rk0 rk0Var = (rk0) obj;
                rk0Var.getClass();
                if (z11) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                rk0Var.q0(str, false);
                return;
            default:
                g2 g2Var = ((sl0) obj).H;
                if (z11) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                g2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
        }
    }
}
