package bi;

import android.content.Context;
import android.media.AudioManager;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nl;
import org.telegram.ui.rn;
public final class k1 implements Runnable {
    public final int f4135a;
    public final boolean f4136b;
    public final Object f4137c;

    public k1(int i7, Object obj, boolean z9) {
        this.f4135a = i7;
        this.f4137c = obj;
        this.f4136b = z9;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        org.telegram.ui.ActionBar.k6 J0;
        String str;
        String str2;
        int i11 = this.f4135a;
        long j3 = 0;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        boolean z9 = true;
        int i12 = 8;
        boolean z10 = this.f4136b;
        Object obj = this.f4137c;
        switch (i11) {
            case 0:
                w1 w1Var = (w1) obj;
                if (!z10) {
                    w1Var.f4940i2.setVisibility(8);
                    return;
                } else {
                    w1Var.getClass();
                    return;
                }
            case 1:
                k7 k7Var = (k7) obj;
                k7Var.getClass();
                if (z10) {
                    i7 = 2131750424;
                } else {
                    i7 = 2131750421;
                }
                k7Var.p2(k7Var.f4167b3, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i7, k7Var.y1())), true);
                return;
            case 2:
                k7 k7Var2 = ((f5) obj).V;
                TL_stars.SavedStarGift D1 = k7Var2.D1(z10);
                if (D1 != null) {
                    k7Var2.W2 = true;
                    k7Var2.i2(D1, k7Var2.f4204y2);
                } else {
                    TL_stars.TL_starGiftUnique E1 = k7Var2.E1(z10);
                    if (E1 != null) {
                        k7Var2.W2 = true;
                        k7Var2.g2(E1.slug, E1, k7Var2.f4204y2);
                    }
                }
                k7Var2.M2 = -1;
                org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32619w;
                if (ccVar != null) {
                    ccVar.c(0L, false);
                    return;
                }
                return;
            case 3:
                ch.k kVar = (ch.k) obj;
                if (z10) {
                    ((ch.o) kVar.f6279x.f5025c).f6347w.setVisibility(4);
                    return;
                } else {
                    kVar.getClass();
                    return;
                }
            case 4:
                ei.n nVar = (ei.n) obj;
                tp0 tp0Var = nVar.W;
                if (z10) {
                    new ei.q(tp0Var.f10844a, org.telegram.messenger.id.M0(2131746693, null), new ai.i(tp0Var, 15)).show();
                    return;
                } else {
                    tp0Var.b(nVar.f10829a.E);
                    return;
                }
            case 5:
                fi.b3 b3Var = (fi.b3) obj;
                if (!z10) {
                    b3Var.I.setVisibility(8);
                    return;
                } else {
                    b3Var.getClass();
                    return;
                }
            case 6:
                fi.r3 r3Var = ((fi.s3) obj).f12777b;
                if (z10) {
                    i12 = 0;
                }
                r3Var.setVisibility(i12);
                return;
            case 7:
                fi.o5 o5Var = (fi.o5) obj;
                if (!z10) {
                    o5Var.G0.setVisibility(8);
                    return;
                } else {
                    o5Var.getClass();
                    return;
                }
            case 8:
                fi.x6 x6Var = (fi.x6) obj;
                if (!z10) {
                    x6Var.setVisibility(8);
                    return;
                } else {
                    x6Var.getClass();
                    return;
                }
            case 9:
                fi.x9 x9Var = (fi.x9) obj;
                if (!z10) {
                    x9Var.f13102j2.f12966j1.setVisibility(8);
                    return;
                } else {
                    x9Var.getClass();
                    return;
                }
            case 10:
                hi.a3 a3Var = (hi.a3) obj;
                hi.y2 y2Var = a3Var.E;
                hi.s2 s2Var = a3Var.D;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().animate().cancel();
                    s2Var.getWebView().animate().alpha(0.0f).start();
                }
                y2Var.setLoadProgress(0.0f);
                y2Var.setAlpha(1.0f);
                y2Var.setVisibility(0);
                if (!z10) {
                    user = qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I));
                }
                s2Var.setBotUser(user);
                if (!z10) {
                    s2Var.s(a3Var.H, a3Var.I);
                }
                qs.f(s2Var.M).d(new org.telegram.ui.web.p(s2Var, 1));
                return;
            case 11:
                ((ii.l0) obj).f(z10, false);
                return;
            case 12:
                String str3 = h2.m0.f14112a;
                l2.i0 i0Var = ((l2.c0) ((n2.s) ((j2.n) obj).f16457c)).f17772a;
                if (i0Var.f17855d0 != z10) {
                    i0Var.f17855d0 = z10;
                    i0Var.f17871m.e(23, new l2.w(1, z10));
                    return;
                }
                return;
            case 13:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                return;
            case 14:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                return;
            case 15:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                return;
            case 16:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                return;
            case 17:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                return;
            case 18:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj;
                r0Var.L = null;
                if (r0Var.getParent() != null) {
                    r0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z10) {
                    r0Var.performHapticFeedback(0);
                }
                r0Var.U(null, null);
                r0Var.f28444q0 = true;
                return;
            case 19:
                Context context = (Context) obj;
                if (z10) {
                    i10 = 2131753038;
                } else {
                    i10 = 2131748392;
                }
                vf.c.t(context, org.telegram.messenger.id.M0(i10, null));
                return;
            case 20:
                pw0 pw0Var = ((nl) obj).f48204b.f44599r1;
                if (pw0Var != null && z10) {
                    pw0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                rn rnVar = (rn) obj;
                rnVar.f49539w0.autotranslation = z10;
                rnVar.getMessagesController().Q3(rnVar.f49539w0, false);
                return;
            case 22:
                vo voVar = (vo) obj;
                to toVar = voVar.n1;
                if (toVar != null && toVar.d != null && !voVar.I) {
                    voVar.U0(z10, true);
                    if (voVar.C1 != null) {
                        voVar.F1 = true;
                        if (!voVar.P0()) {
                            wallPaper = voVar.f39147o1.f43730g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        org.telegram.ui.ActionBar.r3 r3Var2 = voVar.C1.f38760a;
                        if (r3Var2.f28460a) {
                            voVar.f39147o1.r(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            voVar.f39147o1.r(r3Var2, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (J0 = vo.J0(z10)) != null && J0 != org.telegram.ui.ActionBar.l6.I) {
                        if (z10 == voVar.f39149q1) {
                            z9 = false;
                        }
                        voVar.Z1 = z9;
                        voVar.X0(J0);
                    }
                    if (toVar.d != null) {
                        for (int i13 = 0; i13 < toVar.d.size(); i13++) {
                            ((uo) toVar.d.get(i13)).f38762c = z10 ? 1 : 0;
                        }
                        toVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                bv bvVar = (bv) obj;
                if (!z10) {
                    bvVar.E.setVisibility(8);
                    return;
                }
                return;
            case 24:
                wz wzVar = (wz) obj;
                wzVar.e1(wzVar.f40255q2, z10);
                return;
            case 25:
                s20 s20Var = (s20) obj;
                if (!z10) {
                    s20Var.f37890r.setVisibility(8);
                    return;
                } else {
                    s20Var.getClass();
                    return;
                }
            case 26:
                p40 p40Var = ((h40) obj).H0;
                if (!p40Var.f36905k0) {
                    try {
                        p40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(p40Var.h.getParentActivity());
                    if (z10) {
                        j3 = p40Var.f36903j0;
                    }
                    p40Var.f36899h0 = j3;
                    p40Var.f36897g0 = System.currentTimeMillis();
                    p40Var.f36901i0 = true;
                    p40Var.w();
                    p40Var.invalidate();
                    qs.f(p40Var.f36891e).k(155, Integer.valueOf(p40Var.U), Boolean.FALSE);
                    return;
                }
                return;
            case 27:
                dk0 dk0Var = (dk0) obj;
                dk0Var.getClass();
                if (z10) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                dk0Var.q0(str, false);
                return;
            case 28:
                org.telegram.ui.ActionBar.f2 f2Var = ((el0) obj).G;
                if (z10) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                f2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
            default:
                zs0 zs0Var = (zs0) obj;
                if (!z10) {
                    zs0Var.f41100o0.setVisibility(8);
                    return;
                } else {
                    zs0Var.getClass();
                    return;
                }
        }
    }
}
