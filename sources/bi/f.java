package bi;

import ai.y1;
import android.content.Context;
import android.media.AudioManager;
import ci.e8;
import ci.i4;
import ci.j4;
import ci.nb;
import ci.q3;
import ci.q6;
import e2.d0;
import ei.b3;
import ei.i3;
import ei.k3;
import fi.t0;
import i2.c0;
import i2.f0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.t10;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.tw;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qm;
import org.telegram.ui.uo;
public final class f implements Runnable {
    public final int f3899a;
    public final boolean f3900b;
    public final Object f3901c;

    public f(int i10, Object obj, boolean z10) {
        this.f3899a = i10;
        this.f3901c = obj;
        this.f3900b = z10;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        String str;
        int i11 = this.f3899a;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i12 = 0;
        boolean z10 = this.f3900b;
        Object obj = this.f3901c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                rs0 rs0Var = uVar.W;
                if (z10) {
                    new y(rs0Var.f3940a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(rs0Var, 4)).show();
                    return;
                } else {
                    rs0Var.b(uVar.f3923a.E);
                    return;
                }
            case 1:
                q3 q3Var = (q3) obj;
                if (!z10) {
                    q3Var.I.setVisibility(8);
                    return;
                } else {
                    q3Var.getClass();
                    return;
                }
            case 2:
                i4 i4Var = ((j4) obj).f5231b;
                if (!z10) {
                    i12 = 8;
                }
                i4Var.setVisibility(i12);
                return;
            case 3:
                q6 q6Var = (q6) obj;
                if (!z10) {
                    q6Var.X0.setVisibility(8);
                    return;
                } else {
                    q6Var.getClass();
                    return;
                }
            case 4:
                e8 e8Var = (e8) obj;
                if (!z10) {
                    e8Var.setVisibility(8);
                    return;
                } else {
                    e8Var.getClass();
                    return;
                }
            case 5:
                nb nbVar = (nb) obj;
                if (!z10) {
                    nbVar.A2.f5489j1.setVisibility(8);
                    return;
                } else {
                    nbVar.getClass();
                    return;
                }
            case 6:
                k3 k3Var = (k3) obj;
                i3 i3Var = k3Var.f9184y;
                b3 b3Var = k3Var.f9182x;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().animate().cancel();
                    b3Var.getWebView().animate().alpha(0.0f).start();
                }
                i3Var.setLoadProgress(0.0f);
                i3Var.setAlpha(1.0f);
                i3Var.setVisibility(0);
                if (!z10) {
                    user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
                }
                b3Var.setBotUser(user);
                if (!z10) {
                    b3Var.s(k3Var.G, k3Var.H);
                }
                NotificationCenter.getInstance(b3Var.M).doOnIdle(new org.telegram.ui.web.s(b3Var, 2));
                return;
            case 7:
                ((t0) obj).f(z10, false);
                return;
            case 8:
                String str2 = d0.f8531a;
                f0 f0Var = ((c0) ((k2.j) ((n4.x) obj).f16695c)).f11619a;
                if (f0Var.f11654a0 != z10) {
                    f0Var.f11654a0 = z10;
                    f0Var.f11675m.e(23, new i2.y(1, z10));
                    return;
                }
                return;
            case 9:
                ki.k kVar = (ki.k) obj;
                kVar.P = z10;
                kVar.Q = kVar.F();
                kVar.R = 0;
                kVar.S = 0;
                kVar.f14986j.b("torch requested: enabled=" + z10 + ", available=" + kVar.F() + ", cameraId=" + kVar.f14999o + ", facing=" + kVar.G);
                kVar.g();
                return;
            case 10:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                return;
            case 11:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                return;
            case 12:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                return;
            case 13:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                return;
            case 14:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                return;
            case 15:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                return;
            case 16:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                return;
            case 17:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                return;
            case 18:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                return;
            case 19:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                return;
            case 20:
                Context context = (Context) obj;
                if (z10) {
                    i10 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i10 = R.string.MonetizationInfoTONLink;
                }
                of.f.s(context, LocaleController.getString(i10));
                return;
            case 21:
                pz0 pz0Var = ((qm) obj).f41236c.f44774d1;
                if (pz0Var != null && z10) {
                    pz0Var.setVisibility(8);
                    return;
                }
                return;
            case 22:
                uo uoVar = (uo) obj;
                uoVar.f42720x0.autotranslation = z10;
                uoVar.getMessagesController().putChat(uoVar.f42720x0, false);
                return;
            case 23:
                cq cqVar = (cq) obj;
                aq aqVar = cqVar.h;
                if (aqVar != null && aqVar.d != null && !cqVar.isDismissed()) {
                    cqVar.D(z10, true);
                    if (cqVar.M != null) {
                        cqVar.P = true;
                        if (!cqVar.x()) {
                            wallPaper = cqVar.f25434n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        b4 b4Var = cqVar.M.f25058a;
                        if (b4Var.f20503a) {
                            cqVar.f25434n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            cqVar.f25434n.i(b4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (aqVar.d != null) {
                        while (i12 < aqVar.d.size()) {
                            ((bq) aqVar.d.get(i12)).f25060c = z10 ? 1 : 0;
                            i12++;
                        }
                        aqVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                tw twVar = (tw) obj;
                if (!z10) {
                    twVar.E.setVisibility(8);
                    return;
                }
                return;
            case 25:
                t10 t10Var = (t10) obj;
                t10Var.S(t10Var.f31018y0, z10);
                return;
            case 26:
                t40 t40Var = (t40) obj;
                if (!z10) {
                    t40Var.f31059r.setVisibility(8);
                    return;
                } else {
                    t40Var.getClass();
                    return;
                }
            case 27:
                t60 t60Var = ((m60) obj).H0;
                if (!t60Var.f31105l0) {
                    try {
                        t60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(t60Var.f31106n.getParentActivity());
                    if (z10) {
                        j3 = t60Var.f31103k0;
                    } else {
                        j3 = 0;
                    }
                    t60Var.f31099i0 = j3;
                    t60Var.f31097h0 = System.currentTimeMillis();
                    t60Var.f31101j0 = true;
                    t60Var.v();
                    t60Var.invalidate();
                    NotificationCenter.getInstance(t60Var.f31092f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(t60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 28:
                db0 db0Var = (db0) obj;
                if (z10) {
                    db0Var.G.setVisibility(8);
                    return;
                } else {
                    db0Var.getClass();
                    return;
                }
            default:
                m2 m2Var = ((co0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                m2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
        }
    }
}
