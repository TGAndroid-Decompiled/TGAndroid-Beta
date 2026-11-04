package ci;

import android.content.Context;
import android.media.AudioManager;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hl;
import org.telegram.ui.ln;
public final class e1 implements Runnable {
    public final int f4998a;
    public final boolean f4999b;
    public final Object f5000c;

    public e1(int i3, Object obj, boolean z10) {
        this.f4998a = i3;
        this.f5000c = obj;
        this.f4999b = z10;
    }

    @Override
    public final void run() {
        int i3;
        int i10;
        org.telegram.ui.ActionBar.j6 J0;
        String str;
        String str2;
        int i11 = this.f4998a;
        long j10 = 0;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        boolean z10 = true;
        int i12 = 8;
        boolean z11 = this.f4999b;
        Object obj = this.f5000c;
        switch (i11) {
            case 0:
                p1 p1Var = (p1) obj;
                if (!z11) {
                    p1Var.f5730j2.setVisibility(8);
                    return;
                } else {
                    p1Var.getClass();
                    return;
                }
            case 1:
                l6 l6Var = (l6) obj;
                l6Var.getClass();
                if (z11) {
                    i3 = 2131750432;
                } else {
                    i3 = 2131750429;
                }
                l6Var.p2(l6Var.f5450c3, org.telegram.messenger.g0.X2(bd.a0(null, null, i3, l6Var.z1())), true);
                return;
            case 2:
                l6 l6Var2 = ((n4) obj).W;
                TL_stars.SavedStarGift E1 = l6Var2.E1(z11);
                if (E1 != null) {
                    l6Var2.X2 = true;
                    l6Var2.j2(E1, l6Var2.f5488z2);
                } else {
                    TL_stars.TL_starGiftUnique F1 = l6Var2.F1(z11);
                    if (F1 != null) {
                        l6Var2.X2 = true;
                        l6Var2.h2(F1.slug, F1, l6Var2.f5488z2);
                    }
                }
                l6Var2.N2 = -1;
                org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
                if (acVar != null) {
                    acVar.c(0L, false);
                    return;
                }
                return;
            case 3:
                dh.k kVar = (dh.k) obj;
                if (z11) {
                    ((dh.o) kVar.f9057x.f537c).f9109w.setVisibility(4);
                    return;
                } else {
                    kVar.getClass();
                    return;
                }
            case 4:
                fi.m mVar = (fi.m) obj;
                tp0 tp0Var = mVar.f11616a0;
                if (z11) {
                    new fi.p(tp0Var.f11631a, bd.M0(2131746701, null), new ai.v2(tp0Var, 18)).show();
                    return;
                } else {
                    tp0Var.b(mVar.f11615a.E);
                    return;
                }
            case 5:
                gi.z2 z2Var = (gi.z2) obj;
                if (!z11) {
                    z2Var.J.setVisibility(8);
                    return;
                } else {
                    z2Var.getClass();
                    return;
                }
            case 6:
                gi.q3 q3Var = ((gi.r3) obj).f13494b;
                if (z11) {
                    i12 = 0;
                }
                q3Var.setVisibility(i12);
                return;
            case 7:
                gi.m5 m5Var = (gi.m5) obj;
                if (!z11) {
                    m5Var.H0.setVisibility(8);
                    return;
                } else {
                    m5Var.getClass();
                    return;
                }
            case 8:
                gi.y6 y6Var = (gi.y6) obj;
                if (!z11) {
                    y6Var.setVisibility(8);
                    return;
                } else {
                    y6Var.getClass();
                    return;
                }
            case 9:
                gi.x9 x9Var = (gi.x9) obj;
                if (!z11) {
                    x9Var.f13872k2.k1.setVisibility(8);
                    return;
                } else {
                    x9Var.getClass();
                    return;
                }
            case 10:
                ii.a3 a3Var = (ii.a3) obj;
                ii.y2 y2Var = a3Var.F;
                ii.s2 s2Var = a3Var.E;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().animate().cancel();
                    s2Var.getWebView().animate().alpha(0.0f).start();
                }
                y2Var.setLoadProgress(0.0f);
                y2Var.setAlpha(1.0f);
                y2Var.setVisibility(0);
                if (!z11) {
                    user = hp.s1(a3Var.I).a2(Long.valueOf(a3Var.J));
                }
                s2Var.setBotUser(user);
                if (!z11) {
                    s2Var.s(a3Var.I, a3Var.J);
                }
                hs.f(s2Var.N).d(new org.telegram.ui.web.r(s2Var, 1));
                return;
            case 11:
                ((ji.i0) obj).f(z11, false);
                return;
            case 12:
                String str3 = g2.n0.f11873a;
                k2.i0 i0Var = ((k2.c0) ((m2.u) ((m2.t) obj).f19007c)).f16459a;
                if (i0Var.f16545d0 != z11) {
                    i0Var.f16545d0 = z11;
                    i0Var.f16561m.e(23, new k2.x(1, z11));
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
                q0Var.U(null, null);
                q0Var.f28461r0 = true;
                return;
            case 19:
                Context context = (Context) obj;
                if (z11) {
                    i10 = 2131753038;
                } else {
                    i10 = 2131748400;
                }
                sf.c.t(context, bd.M0(i10, null));
                return;
            case 20:
                ow0 ow0Var = ((hl) obj).f45933b.f51472s1;
                if (ow0Var != null && z11) {
                    ow0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                ln lnVar = (ln) obj;
                lnVar.f47396x0.autotranslation = z11;
                lnVar.getMessagesController().Q3(lnVar.f47396x0, false);
                return;
            case 22:
                vo voVar = (vo) obj;
                to toVar = voVar.f39187o1;
                if (toVar != null && toVar.d != null && !voVar.J) {
                    voVar.U0(z11, true);
                    if (voVar.D1 != null) {
                        voVar.G1 = true;
                        if (!voVar.P0()) {
                            wallPaper = voVar.f39188p1.f50125g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        org.telegram.ui.ActionBar.p3 p3Var = voVar.D1.f38832a;
                        if (p3Var.f28419a) {
                            voVar.f39188p1.r(null, wallPaper2, false, Boolean.valueOf(z11), false);
                        } else {
                            voVar.f39188p1.r(p3Var, wallPaper2, false, Boolean.valueOf(z11), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (J0 = vo.J0(z11)) != null && J0 != org.telegram.ui.ActionBar.k6.I) {
                        if (z11 == voVar.f39190r1) {
                            z10 = false;
                        }
                        voVar.f39182a2 = z10;
                        voVar.X0(J0);
                    }
                    if (toVar.d != null) {
                        for (int i13 = 0; i13 < toVar.d.size(); i13++) {
                            ((uo) toVar.d.get(i13)).f38834c = z11 ? 1 : 0;
                        }
                        toVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                zu zuVar = (zu) obj;
                if (!z11) {
                    zuVar.F.setVisibility(8);
                    return;
                }
                return;
            case 24:
                rz rzVar = (rz) obj;
                rzVar.e1(rzVar.f37862r2, z11);
                return;
            case 25:
                n20 n20Var = (n20) obj;
                if (!z11) {
                    n20Var.f36343r.setVisibility(8);
                    return;
                } else {
                    n20Var.getClass();
                    return;
                }
            case 26:
                k40 k40Var = ((c40) obj).I0;
                if (!k40Var.f35287l0) {
                    try {
                        k40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(k40Var.h.getParentActivity());
                    if (z11) {
                        j10 = k40Var.f35286k0;
                    }
                    k40Var.f35282i0 = j10;
                    k40Var.f35280h0 = System.currentTimeMillis();
                    k40Var.f35284j0 = true;
                    k40Var.v();
                    k40Var.invalidate();
                    hs.f(k40Var.f35272e).k(155, Integer.valueOf(k40Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 27:
                gk0 gk0Var = (gk0) obj;
                gk0Var.getClass();
                if (z11) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                gk0Var.q0(str, false);
                return;
            case 28:
                org.telegram.ui.ActionBar.d2 d2Var = ((hl0) obj).H;
                if (z11) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                d2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
            default:
                ws0 ws0Var = (ws0) obj;
                if (!z11) {
                    ws0Var.f40114p0.setVisibility(8);
                    return;
                } else {
                    ws0Var.getClass();
                    return;
                }
        }
    }
}
