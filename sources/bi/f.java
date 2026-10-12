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
import org.telegram.messenger.RecordedAudioTranscriptionController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.Components.v10;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.vw;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.um;
import org.telegram.ui.xo;
public final class f implements Runnable {
    public final int f3898a;
    public final boolean f3899b;
    public final Object f3900c;

    public f(int i10, Object obj, boolean z10) {
        this.f3898a = i10;
        this.f3900c = obj;
        this.f3899b = z10;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        String str;
        int i11 = this.f3898a;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i12 = 0;
        boolean z10 = this.f3899b;
        Object obj = this.f3900c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                ws0 ws0Var = uVar.W;
                if (z10) {
                    new y(ws0Var.f3939a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(ws0Var, 4)).show();
                    return;
                } else {
                    ws0Var.b(uVar.f3922a.E);
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
                i4 i4Var = ((j4) obj).f5230b;
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
                    nbVar.A2.f5488j1.setVisibility(8);
                    return;
                } else {
                    nbVar.getClass();
                    return;
                }
            case 6:
                k3 k3Var = (k3) obj;
                i3 i3Var = k3Var.f9182y;
                b3 b3Var = k3Var.f9180x;
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
                String str2 = d0.f8529a;
                f0 f0Var = ((c0) ((k2.j) ((n4.y) obj).f16364c)).f11618a;
                if (f0Var.f11653a0 != z10) {
                    f0Var.f11653a0 = z10;
                    f0Var.f11674m.e(23, new i2.y(1, z10));
                    return;
                }
                return;
            case 9:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                return;
            case 10:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                return;
            case 11:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                return;
            case 12:
                ((RecordedAudioTranscriptionController) obj).lambda$startInternal$1(z10);
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
                uz0 uz0Var = ((um) obj).f42538c.f37234d1;
                if (uz0Var != null && z10) {
                    uz0Var.setVisibility(8);
                    return;
                }
                return;
            case 22:
                xo xoVar = (xo) obj;
                xoVar.f44084x0.autotranslation = z10;
                xoVar.getMessagesController().putChat(xoVar.f44084x0, false);
                return;
            case 23:
                eq eqVar = (eq) obj;
                cq cqVar = eqVar.h;
                if (cqVar != null && cqVar.d != null && !eqVar.isDismissed()) {
                    eqVar.D(z10, true);
                    if (eqVar.M != null) {
                        eqVar.P = true;
                        if (!eqVar.x()) {
                            wallPaper = eqVar.f25756n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        b4 b4Var = eqVar.M.f25449a;
                        if (b4Var.f20240a) {
                            eqVar.f25756n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            eqVar.f25756n.i(b4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (cqVar.d != null) {
                        while (i12 < cqVar.d.size()) {
                            ((dq) cqVar.d.get(i12)).f25451c = z10 ? 1 : 0;
                            i12++;
                        }
                        cqVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                vw vwVar = (vw) obj;
                if (!z10) {
                    vwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 25:
                v10 v10Var = (v10) obj;
                v10Var.S(v10Var.f31347y0, z10);
                return;
            case 26:
                v40 v40Var = (v40) obj;
                if (!z10) {
                    v40Var.f31389r.setVisibility(8);
                    return;
                } else {
                    v40Var.getClass();
                    return;
                }
            case 27:
                w60 w60Var = ((p60) obj).H0;
                if (!w60Var.f32296l0) {
                    try {
                        w60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(w60Var.f32297n.getParentActivity());
                    if (z10) {
                        j3 = w60Var.f32294k0;
                    } else {
                        j3 = 0;
                    }
                    w60Var.f32290i0 = j3;
                    w60Var.f32288h0 = System.currentTimeMillis();
                    w60Var.f32292j0 = true;
                    w60Var.v();
                    w60Var.invalidate();
                    NotificationCenter.getInstance(w60Var.f32283f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(w60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 28:
                hb0 hb0Var = (hb0) obj;
                if (z10) {
                    hb0Var.G.setVisibility(8);
                    return;
                } else {
                    hb0Var.getClass();
                    return;
                }
            default:
                m2 m2Var = ((ho0) obj).G;
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
