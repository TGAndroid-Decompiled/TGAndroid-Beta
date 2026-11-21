package ch;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import di.f6;
import di.h1;
import di.h4;
import hi.k5;
import hi.p3;
import hi.q3;
import hi.u9;
import hi.v6;
import hi.z2;
import ki.k2;
import ki.q2;
import ki.s2;
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
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ml;
import org.telegram.ui.rn;
public final class k implements Runnable {
    public final int f5415a;
    public final boolean f5416b;
    public final Object f5417c;

    public k(int i7, Object obj, boolean z10) {
        this.f5415a = i7;
        this.f5417c = obj;
        this.f5416b = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        l6 K0;
        String str;
        String str2;
        int i11 = this.f5415a;
        long j3 = 0;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i12 = 8;
        boolean z10 = true;
        boolean z11 = this.f5416b;
        Object obj = this.f5417c;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                if (z11) {
                    ((p) lVar.f5428x.f1275c).f5497w.setVisibility(4);
                    return;
                } else {
                    lVar.getClass();
                    return;
                }
            case 1:
                h1 h1Var = (h1) obj;
                if (!z11) {
                    h1Var.f8934m2.setVisibility(8);
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
                f6Var.C2(f6Var.f8808i3, org.telegram.messenger.g0.W2(gd.a0(null, null, i7, f6Var.E1())), true);
                return;
            case 3:
                f6 f6Var2 = ((h4) obj).W;
                TL_stars.SavedStarGift J1 = f6Var2.J1(z11);
                if (J1 != null) {
                    f6Var2.f8793a3 = true;
                    f6Var2.w2(J1, f6Var2.C2);
                } else {
                    TL_stars.TL_starGiftUnique K1 = f6Var2.K1(z11);
                    if (K1 != null) {
                        f6Var2.f8793a3 = true;
                        f6Var2.u2(K1.slug, K1, f6Var2.C2);
                    }
                }
                f6Var2.Q2 = -1;
                gc gcVar = gc.f35500w;
                if (gcVar != null) {
                    gcVar.c(0L, false);
                    return;
                }
                return;
            case 4:
                gi.m mVar = (gi.m) obj;
                fq0 fq0Var = mVar.f13678a0;
                if (z11) {
                    new gi.p(fq0Var.f13693a, gd.N0(2131746497, null), new ai.h0(fq0Var, 20)).show();
                    return;
                } else {
                    fq0Var.b(mVar.f13677a.E);
                    return;
                }
            case 5:
                z2 z2Var = (z2) obj;
                if (!z11) {
                    z2Var.J.setVisibility(8);
                    return;
                } else {
                    z2Var.getClass();
                    return;
                }
            case 6:
                p3 p3Var = ((q3) obj).f15290b;
                if (z11) {
                    i12 = 0;
                }
                p3Var.setVisibility(i12);
                return;
            case 7:
                k5 k5Var = (k5) obj;
                if (!z11) {
                    k5Var.H0.setVisibility(8);
                    return;
                } else {
                    k5Var.getClass();
                    return;
                }
            case 8:
                v6 v6Var = (v6) obj;
                if (!z11) {
                    v6Var.setVisibility(8);
                    return;
                } else {
                    v6Var.getClass();
                    return;
                }
            case 9:
                u9 u9Var = (u9) obj;
                if (!z11) {
                    u9Var.f15581k2.f15416k1.setVisibility(8);
                    return;
                } else {
                    u9Var.getClass();
                    return;
                }
            case 10:
                s2 s2Var = (s2) obj;
                q2 q2Var = s2Var.F;
                k2 k2Var = s2Var.E;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().animate().cancel();
                    k2Var.getWebView().animate().alpha(0.0f).start();
                }
                q2Var.setLoadProgress(0.0f);
                q2Var.setAlpha(1.0f);
                q2Var.setVisibility(0);
                if (!z11) {
                    user = mp.u1(s2Var.I).c2(Long.valueOf(s2Var.J));
                }
                k2Var.setBotUser(user);
                if (!z11) {
                    k2Var.s(s2Var.I, s2Var.J);
                }
                ks.f(k2Var.N).d(new org.telegram.ui.web.q(k2Var, 1));
                return;
            case 11:
                ((li.k0) obj).f(z11, false);
                return;
            case 12:
                String str3 = h2.l0.f13812a;
                l2.f0 f0Var = ((l2.z) ((n2.s) ((k8.a) obj).f18212c)).f19625a;
                if (f0Var.f19345d0 != z11) {
                    f0Var.f19345d0 = z11;
                    f0Var.f19361m.e(23, new l2.v(1, z11));
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
                q0Var.f29920r0 = true;
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
                ax0 ax0Var = ((ml) obj).f49891b.f46184s1;
                if (ax0Var != null && z11) {
                    ax0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                rn rnVar = (rn) obj;
                rnVar.f51671x0.autotranslation = z11;
                rnVar.getMessagesController().X3(rnVar.f51671x0, false);
                return;
            case 22:
                org.telegram.ui.Components.n0 n0Var = (org.telegram.ui.Components.n0) obj;
                n0Var.M2 = null;
                n0Var.K2 = z11;
                if (z11) {
                    n0Var.L2 = SystemClock.uptimeMillis();
                }
                n0Var.C2.setLoading(z11);
                return;
            case 23:
                np npVar = (np) obj;
                lp lpVar = npVar.f37926r1;
                if (lpVar != null && lpVar.d != null && !npVar.J) {
                    npVar.V0(z11, true);
                    if (npVar.G1 != null) {
                        npVar.J1 = true;
                        if (!npVar.Q0()) {
                            wallPaper = npVar.f37927s1.f54586g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        s3 s3Var = npVar.G1.f37594a;
                        if (s3Var.f29980a) {
                            npVar.f37927s1.r(null, wallPaper2, false, Boolean.valueOf(z11), false);
                        } else {
                            npVar.f37927s1.r(s3Var, wallPaper2, false, Boolean.valueOf(z11), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (K0 = np.K0(z11)) != null && K0 != m6.I) {
                        if (z11 == npVar.f37929u1) {
                            z10 = false;
                        }
                        npVar.d2 = z10;
                        npVar.Y0(K0);
                    }
                    if (lpVar.d != null) {
                        for (int i13 = 0; i13 < lpVar.d.size(); i13++) {
                            ((org.telegram.ui.Components.mp) lpVar.d.get(i13)).f37596c = z11 ? 1 : 0;
                        }
                        lpVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ov ovVar = (ov) obj;
                if (!z11) {
                    ovVar.F.setVisibility(8);
                    return;
                }
                return;
            case 25:
                i00 i00Var = (i00) obj;
                i00Var.f1(i00Var.f36093u2, z11);
                return;
            case 26:
                f30 f30Var = (f30) obj;
                if (!z11) {
                    f30Var.f35074r.setVisibility(8);
                    return;
                } else {
                    f30Var.getClass();
                    return;
                }
            case 27:
                c50 c50Var = ((u40) obj).I0;
                if (!c50Var.f34045l0) {
                    try {
                        c50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(c50Var.h.getParentActivity());
                    if (z11) {
                        j3 = c50Var.f34043k0;
                    }
                    c50Var.f34039i0 = j3;
                    c50Var.f34037h0 = System.currentTimeMillis();
                    c50Var.f34041j0 = true;
                    c50Var.w();
                    c50Var.invalidate();
                    ks.f(c50Var.f34029e).k(155, Integer.valueOf(c50Var.V), Boolean.FALSE);
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
