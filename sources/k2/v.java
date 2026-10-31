package k2;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y3;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ay;
import org.telegram.ui.hf0;
import org.telegram.ui.hm;
import org.telegram.ui.iw;
import org.telegram.ui.iz;
import org.telegram.ui.oo;
public final class v implements Runnable {
    public final int f10777a;
    public final boolean f10778b;
    public final Object f10779c;

    public v(int i10, Object obj, boolean z10) {
        this.f10777a = i10;
        this.f10779c = obj;
        this.f10778b = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i10;
        s6 J0;
        long j10;
        String str;
        String str2;
        long j11;
        int i11 = this.f10777a;
        oh.f fVar = null;
        TLRPC.WallPaper wallPaper = null;
        fVar = null;
        fVar = null;
        boolean z11 = true;
        int i12 = 0;
        boolean z12 = this.f10778b;
        Object obj = this.f10779c;
        switch (i11) {
            case 0:
                String str3 = e2.l0.f6165a;
                i2.i0 i0Var = ((i2.c0) ((w) ((hf.b) obj).f7658c)).f7821a;
                if (i0Var.f7901d0 != z12) {
                    i0Var.f7901d0 = z12;
                    i0Var.f7916m.e(23, new i2.y(1, z12));
                    return;
                }
                return;
            case 1:
                li.l lVar = (li.l) obj;
                lVar.P = z12;
                lVar.Q = lVar.F();
                lVar.R = 0;
                lVar.S = 0;
                lVar.f12129j.b("torch requested: enabled=" + z12 + ", available=" + lVar.F() + ", cameraId=" + lVar.f12142o + ", facing=" + lVar.G);
                lVar.g();
                return;
            case 2:
                oh.q qVar = (oh.q) obj;
                ArrayList arrayList = qVar.f14294c;
                boolean isEmpty = TextUtils.isEmpty(qVar.f14308t);
                String str4 = qVar.f14308t;
                qVar.f14310w = true;
                qVar.A = false;
                if (isEmpty && !arrayList.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) i0.a.g(1, arrayList);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z12) {
                    fVar = new oh.f(qVar, 1);
                }
                oh.f fVar2 = fVar;
                if (isEmpty) {
                    org.telegram.messenger.i0.h3(fVar2, 300L);
                }
                qVar.v = qVar.f14297i.a(qVar.f14298j, str4, tL_chatInviteImporter, qVar.d, new oh.g(qVar, isEmpty, fVar2, str4, z10));
                return;
            case 3:
                ((CameraController) obj).lambda$recordVideo$11(z12);
                return;
            case 4:
                ((VideoCapturerDevice) obj).lambda$new$0(z12);
                return;
            case 5:
                ((VoIPService) obj).lambda$startGroupCall$27(z12);
                return;
            case 6:
                ((AudioManager) obj).setSpeakerphoneOn(z12);
                return;
            case 7:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z12);
                return;
            case 8:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj;
                t0Var.L = null;
                if (t0Var.getParent() != null) {
                    t0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z12) {
                    t0Var.performHapticFeedback(0);
                }
                t0Var.U(null, null);
                t0Var.f20844q0 = true;
                return;
            case 9:
                Context context = (Context) obj;
                if (z12) {
                    i10 = 2131753038;
                } else {
                    i10 = 2131748407;
                }
                gf.f.r(context, cd.L0(i10, null));
                return;
            case 10:
                sx0 sx0Var = ((hm) obj).f37996b.f42391r1;
                if (sx0Var != null && z12) {
                    sx0Var.setVisibility(8);
                    return;
                }
                return;
            case 11:
                oo ooVar = (oo) obj;
                ooVar.f40343w0.autotranslation = z12;
                ooVar.getMessagesController().N3(ooVar.f40343w0, false);
                return;
            case 12:
                dp dpVar = (dp) obj;
                bp bpVar = dpVar.f25487n1;
                if (bpVar != null && bpVar.d != null && !dpVar.I) {
                    dpVar.U0(z12, true);
                    if (dpVar.C1 != null) {
                        dpVar.F1 = true;
                        if (!dpVar.P0()) {
                            wallPaper = dpVar.f25488o1.f41591g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        y3 y3Var = dpVar.C1.f25123a;
                        if (y3Var.f21558a) {
                            dpVar.f25488o1.r(null, wallPaper2, false, Boolean.valueOf(z12), false);
                        } else {
                            dpVar.f25488o1.r(y3Var, wallPaper2, false, Boolean.valueOf(z12), false);
                        }
                    }
                    if (org.telegram.messenger.i0.Q1() && (J0 = dp.J0(z12)) != null && J0 != t6.I) {
                        if (z12 == dpVar.f25490q1) {
                            z11 = false;
                        }
                        dpVar.Z1 = z11;
                        dpVar.X0(J0);
                    }
                    if (bpVar.d != null) {
                        while (i12 < bpVar.d.size()) {
                            ((cp) bpVar.d.get(i12)).f25125c = z12 ? 1 : 0;
                            i12++;
                        }
                        bpVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                mv mvVar = (mv) obj;
                if (!z12) {
                    mvVar.E.setVisibility(8);
                    return;
                }
                return;
            case 14:
                j00 j00Var = (j00) obj;
                j00Var.e1(j00Var.f27179q2, z12);
                return;
            case 15:
                j30 j30Var = (j30) obj;
                if (!z12) {
                    j30Var.f27214r.setVisibility(8);
                    return;
                } else {
                    j30Var.getClass();
                    return;
                }
            case 16:
                e50 e50Var = ((x40) obj).H0;
                if (!e50Var.f25667k0) {
                    try {
                        e50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.i0.f2(e50Var.h.getParentActivity());
                    if (z12) {
                        j10 = e50Var.f25665j0;
                    } else {
                        j10 = 0;
                    }
                    e50Var.f25661h0 = j10;
                    e50Var.f25659g0 = System.currentTimeMillis();
                    e50Var.f25663i0 = true;
                    e50Var.v();
                    e50Var.invalidate();
                    zs.f(e50Var.e).k(155, Integer.valueOf(e50Var.U), Boolean.FALSE);
                    return;
                }
                return;
            case 17:
                gl0 gl0Var = (gl0) obj;
                gl0Var.getClass();
                if (z12) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                gl0Var.q0(str, false);
                return;
            case 18:
                k2 k2Var = ((gm0) obj).G;
                if (z12) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                k2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
            case 19:
                zt0 zt0Var = (zt0) obj;
                if (!z12) {
                    zt0Var.f33213o0.setVisibility(8);
                    return;
                } else {
                    zt0Var.getClass();
                    return;
                }
            case 20:
                vq0 vq0Var = (vq0) obj;
                if (!z12) {
                    vq0Var.V.f33227s0.setVisibility(0);
                    return;
                } else {
                    vq0Var.getClass();
                    return;
                }
            case 21:
                zq0 zq0Var = (zq0) obj;
                if (!z12) {
                    zq0Var.f33150x.f33227s0.setVisibility(0);
                    return;
                } else {
                    zq0Var.getClass();
                    return;
                }
            case 22:
                uu0 uu0Var = (uu0) obj;
                ArrayList arrayList2 = uu0Var.f31058r;
                tu0 tu0Var = uu0Var.f31057n;
                if (tu0Var != null) {
                    tu0Var.K(uu0Var.f31056f, z12);
                }
                while (i12 < arrayList2.size()) {
                    ((tu0) arrayList2.get(i12)).K(uu0Var.f31056f, z12);
                    i12++;
                }
                return;
            case 23:
                vu0 vu0Var = (vu0) obj;
                ArrayList arrayList3 = vu0Var.f31058r;
                tu0 tu0Var2 = vu0Var.f31057n;
                if (tu0Var2 != null) {
                    tu0Var2.K(vu0Var.f31847h0, z12);
                }
                while (i12 < arrayList3.size()) {
                    ((tu0) arrayList3.get(i12)).K(vu0Var.f31847h0, z12);
                    i12++;
                }
                return;
            case 24:
                ((j20) obj).a(null, Boolean.valueOf(z12));
                return;
            case 25:
                ((p51) obj).Q(z12);
                return;
            case 26:
                ay ayVar = (ay) obj;
                Activity parentActivity = ayVar.getParentActivity();
                if (z12) {
                    j11 = ayVar.getUserConfig().e();
                } else {
                    j11 = -1;
                }
                s4.L(parentActivity, j11, new iw(ayVar), ayVar.getResourceProvider());
                return;
            case 27:
                iz izVar = (iz) obj;
                izVar.d0(izVar.O, z12);
                return;
            case 28:
                hf0 hf0Var = (hf0) obj;
                if (!z12) {
                    hf0Var.W.setVisibility(8);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z12) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                return;
        }
    }
}
