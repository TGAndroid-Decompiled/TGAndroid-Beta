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
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ll;
import org.telegram.ui.pn;
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
        org.telegram.ui.ActionBar.j6 J0;
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
                    w1Var.f4942i2.setVisibility(8);
                    return;
                } else {
                    w1Var.getClass();
                    return;
                }
            case 1:
                k7 k7Var = (k7) obj;
                k7Var.getClass();
                if (z10) {
                    i7 = 2131750423;
                } else {
                    i7 = 2131750420;
                }
                k7Var.p2(k7Var.f4167b3, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i7, k7Var.z1())), true);
                return;
            case 2:
                k7 k7Var2 = ((f5) obj).V;
                TL_stars.SavedStarGift E1 = k7Var2.E1(z10);
                if (E1 != null) {
                    k7Var2.W2 = true;
                    k7Var2.j2(E1, k7Var2.f4204y2);
                } else {
                    TL_stars.TL_starGiftUnique F1 = k7Var2.F1(z10);
                    if (F1 != null) {
                        k7Var2.W2 = true;
                        k7Var2.h2(F1.slug, F1, k7Var2.f4204y2);
                    }
                }
                k7Var2.M2 = -1;
                org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32519w;
                if (ccVar != null) {
                    ccVar.c(0L, false);
                    return;
                }
                return;
            case 3:
                ch.k kVar = (ch.k) obj;
                if (z10) {
                    ((ch.o) kVar.f6281x.f5027c).f6349w.setVisibility(4);
                    return;
                } else {
                    kVar.getClass();
                    return;
                }
            case 4:
                ei.n nVar = (ei.n) obj;
                sp0 sp0Var = nVar.W;
                if (z10) {
                    new ei.q(sp0Var.f10844a, org.telegram.messenger.hd.M0(2131746692, null), new ai.i(sp0Var, 15)).show();
                    return;
                } else {
                    sp0Var.b(nVar.f10829a.E);
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
                fi.r3 r3Var = ((fi.s3) obj).f12778b;
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
                l2.i0 i0Var = ((l2.c0) ((n2.s) ((j2.n) obj).f16454c)).f17771a;
                if (i0Var.f17854d0 != z10) {
                    i0Var.f17854d0 = z10;
                    i0Var.f17870m.e(23, new l2.x(1, z10));
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
                r0Var.f28439q0 = true;
                return;
            case 19:
                Context context = (Context) obj;
                if (z10) {
                    i10 = 2131753038;
                } else {
                    i10 = 2131748391;
                }
                vf.c.t(context, org.telegram.messenger.hd.M0(i10, null));
                return;
            case 20:
                ow0 ow0Var = ((ll) obj).f47558b.f43937r1;
                if (ow0Var != null && z10) {
                    ow0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                pn pnVar = (pn) obj;
                pnVar.f48887w0.autotranslation = z10;
                pnVar.getMessagesController().Q3(pnVar.f48887w0, false);
                return;
            case 22:
                vo voVar = (vo) obj;
                to toVar = voVar.n1;
                if (toVar != null && toVar.d != null && !voVar.I) {
                    voVar.U0(z10, true);
                    if (voVar.C1 != null) {
                        voVar.F1 = true;
                        if (!voVar.P0()) {
                            wallPaper = voVar.f39000o1.f52273g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        org.telegram.ui.ActionBar.r3 r3Var2 = voVar.C1.f38688a;
                        if (r3Var2.f28455a) {
                            voVar.f39000o1.r(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            voVar.f39000o1.r(r3Var2, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (J0 = vo.J0(z10)) != null && J0 != org.telegram.ui.ActionBar.k6.I) {
                        if (z10 == voVar.f39002q1) {
                            z9 = false;
                        }
                        voVar.Z1 = z9;
                        voVar.X0(J0);
                    }
                    if (toVar.d != null) {
                        for (int i13 = 0; i13 < toVar.d.size(); i13++) {
                            ((uo) toVar.d.get(i13)).f38690c = z10 ? 1 : 0;
                        }
                        toVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                av avVar = (av) obj;
                if (!z10) {
                    avVar.E.setVisibility(8);
                    return;
                }
                return;
            case 24:
                vz vzVar = (vz) obj;
                vzVar.e1(vzVar.f39780q2, z10);
                return;
            case 25:
                r20 r20Var = (r20) obj;
                if (!z10) {
                    r20Var.f37512r.setVisibility(8);
                    return;
                } else {
                    r20Var.getClass();
                    return;
                }
            case 26:
                o40 o40Var = ((g40) obj).H0;
                if (!o40Var.f36494k0) {
                    try {
                        o40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(o40Var.h.getParentActivity());
                    if (z10) {
                        j3 = o40Var.f36492j0;
                    }
                    o40Var.f36488h0 = j3;
                    o40Var.f36486g0 = System.currentTimeMillis();
                    o40Var.f36490i0 = true;
                    o40Var.v();
                    o40Var.invalidate();
                    qs.f(o40Var.f36480e).k(155, Integer.valueOf(o40Var.U), Boolean.FALSE);
                    return;
                }
                return;
            case 27:
                ck0 ck0Var = (ck0) obj;
                ck0Var.getClass();
                if (z10) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                ck0Var.q0(str, false);
                return;
            case 28:
                org.telegram.ui.ActionBar.f2 f2Var = ((dl0) obj).G;
                if (z10) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                f2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
            default:
                xs0 xs0Var = (xs0) obj;
                if (!z10) {
                    xs0Var.f40397o0.setVisibility(8);
                    return;
                } else {
                    xs0Var.getClass();
                    return;
                }
        }
    }
}
