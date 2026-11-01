package k2;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y3;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.wu0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gf0;
import org.telegram.ui.hm;
import org.telegram.ui.hw;
import org.telegram.ui.hz;
import org.telegram.ui.oo;
import org.telegram.ui.zx;
public final class v implements Runnable {
    public final int f10778a;
    public final boolean f10779b;
    public final Object f10780c;

    public v(int i10, Object obj, boolean z10) {
        this.f10778a = i10;
        this.f10780c = obj;
        this.f10779b = z10;
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
        int i11 = this.f10778a;
        oh.f fVar = null;
        TLRPC.WallPaper wallPaper = null;
        fVar = null;
        fVar = null;
        boolean z11 = true;
        int i12 = 0;
        boolean z12 = this.f10779b;
        Object obj = this.f10780c;
        switch (i11) {
            case 0:
                String str3 = e2.l0.f6165a;
                i2.i0 i0Var = ((i2.c0) ((w) ((hf.b) obj).f7659c)).f7822a;
                if (i0Var.f7902d0 != z12) {
                    i0Var.f7902d0 = z12;
                    i0Var.f7917m.e(23, new i2.y(1, z12));
                    return;
                }
                return;
            case 1:
                li.l lVar = (li.l) obj;
                lVar.P = z12;
                lVar.Q = lVar.F();
                lVar.R = 0;
                lVar.S = 0;
                lVar.f12130j.b("torch requested: enabled=" + z12 + ", available=" + lVar.F() + ", cameraId=" + lVar.f12143o + ", facing=" + lVar.G);
                lVar.g();
                return;
            case 2:
                oh.q qVar = (oh.q) obj;
                ArrayList arrayList = qVar.f14295c;
                boolean isEmpty = TextUtils.isEmpty(qVar.f14309t);
                String str4 = qVar.f14309t;
                qVar.f14311w = true;
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
                qVar.v = qVar.f14298i.a(qVar.f14299j, str4, tL_chatInviteImporter, qVar.d, new oh.g(qVar, isEmpty, fVar2, str4, z10));
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
                t0Var.f20845q0 = true;
                return;
            case 9:
                Context context = (Context) obj;
                if (z12) {
                    i10 = 2131753038;
                } else {
                    i10 = 2131748407;
                }
                gf.f.r(context, dd.L0(i10, null));
                return;
            case 10:
                tx0 tx0Var = ((hm) obj).f37835b.f42202r1;
                if (tx0Var != null && z12) {
                    tx0Var.setVisibility(8);
                    return;
                }
                return;
            case 11:
                oo ooVar = (oo) obj;
                ooVar.f40232w0.autotranslation = z12;
                ooVar.getMessagesController().N3(ooVar.f40232w0, false);
                return;
            case 12:
                dp dpVar = (dp) obj;
                bp bpVar = dpVar.f25543n1;
                if (bpVar != null && bpVar.d != null && !dpVar.I) {
                    dpVar.U0(z12, true);
                    if (dpVar.C1 != null) {
                        dpVar.F1 = true;
                        if (!dpVar.P0()) {
                            wallPaper = dpVar.f25544o1.f41402g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        y3 y3Var = dpVar.C1.f25197a;
                        if (y3Var.f21559a) {
                            dpVar.f25544o1.r(null, wallPaper2, false, Boolean.valueOf(z12), false);
                        } else {
                            dpVar.f25544o1.r(y3Var, wallPaper2, false, Boolean.valueOf(z12), false);
                        }
                    }
                    if (org.telegram.messenger.i0.Q1() && (J0 = dp.J0(z12)) != null && J0 != t6.I) {
                        if (z12 == dpVar.f25546q1) {
                            z11 = false;
                        }
                        dpVar.Z1 = z11;
                        dpVar.X0(J0);
                    }
                    if (bpVar.d != null) {
                        while (i12 < bpVar.d.size()) {
                            ((cp) bpVar.d.get(i12)).f25199c = z12 ? 1 : 0;
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
                j00Var.e1(j00Var.f27233q2, z12);
                return;
            case 15:
                j30 j30Var = (j30) obj;
                if (!z12) {
                    j30Var.f27260r.setVisibility(8);
                    return;
                } else {
                    j30Var.getClass();
                    return;
                }
            case 16:
                e50 e50Var = ((x40) obj).H0;
                if (!e50Var.f25716k0) {
                    try {
                        e50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.i0.f2(e50Var.h.getParentActivity());
                    if (z12) {
                        j10 = e50Var.f25714j0;
                    } else {
                        j10 = 0;
                    }
                    e50Var.f25710h0 = j10;
                    e50Var.f25708g0 = System.currentTimeMillis();
                    e50Var.f25712i0 = true;
                    e50Var.v();
                    e50Var.invalidate();
                    at.f(e50Var.e).k(155, Integer.valueOf(e50Var.U), Boolean.FALSE);
                    return;
                }
                return;
            case 17:
                hl0 hl0Var = (hl0) obj;
                hl0Var.getClass();
                if (z12) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                hl0Var.q0(str, false);
                return;
            case 18:
                k2 k2Var = ((hm0) obj).G;
                if (z12) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                k2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
            case 19:
                au0 au0Var = (au0) obj;
                if (!z12) {
                    au0Var.f24541o0.setVisibility(8);
                    return;
                } else {
                    au0Var.getClass();
                    return;
                }
            case 20:
                wq0 wq0Var = (wq0) obj;
                if (!z12) {
                    wq0Var.V.f24555s0.setVisibility(0);
                    return;
                } else {
                    wq0Var.getClass();
                    return;
                }
            case 21:
                ar0 ar0Var = (ar0) obj;
                if (!z12) {
                    ar0Var.f24480x.f24555s0.setVisibility(0);
                    return;
                } else {
                    ar0Var.getClass();
                    return;
                }
            case 22:
                vu0 vu0Var = (vu0) obj;
                ArrayList arrayList2 = vu0Var.f31918r;
                uu0 uu0Var = vu0Var.f31917n;
                if (uu0Var != null) {
                    uu0Var.L(vu0Var.f31916f, z12);
                }
                while (i12 < arrayList2.size()) {
                    ((uu0) arrayList2.get(i12)).L(vu0Var.f31916f, z12);
                    i12++;
                }
                return;
            case 23:
                wu0 wu0Var = (wu0) obj;
                ArrayList arrayList3 = wu0Var.f31918r;
                uu0 uu0Var2 = wu0Var.f31917n;
                if (uu0Var2 != null) {
                    uu0Var2.L(wu0Var.f32322h0, z12);
                }
                while (i12 < arrayList3.size()) {
                    ((uu0) arrayList3.get(i12)).L(wu0Var.f32322h0, z12);
                    i12++;
                }
                return;
            case 24:
                ((k20) obj).a(null, Boolean.valueOf(z12));
                return;
            case 25:
                ((q51) obj).Q(z12);
                return;
            case 26:
                zx zxVar = (zx) obj;
                Activity parentActivity = zxVar.getParentActivity();
                if (z12) {
                    j11 = zxVar.getUserConfig().e();
                } else {
                    j11 = -1;
                }
                s4.L(parentActivity, j11, new hw(zxVar), zxVar.getResourceProvider());
                return;
            case 27:
                hz hzVar = (hz) obj;
                hzVar.e0(hzVar.O, z12);
                return;
            case 28:
                gf0 gf0Var = (gf0) obj;
                if (!z12) {
                    gf0Var.W.setVisibility(8);
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
