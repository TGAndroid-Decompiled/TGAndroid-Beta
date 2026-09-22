package bi;

import ai.y1;
import android.content.Context;
import android.media.AudioManager;
import ci.h8;
import ci.k4;
import ci.l4;
import ci.qb;
import ci.r6;
import ci.s3;
import e2.d0;
import fi.t0;
import i2.b0;
import i2.e0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rm;
import org.telegram.ui.wo;
public final class f implements Runnable {
    public final int f3566a;
    public final boolean f3567b;
    public final Object f3568c;

    public f(int i10, Object obj, boolean z10) {
        this.f3566a = i10;
        this.f3568c = obj;
        this.f3567b = z10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.WallPaper wallPaper;
        long j3;
        String str;
        int i11 = this.f3566a;
        int i12 = 0;
        boolean z10 = this.f3567b;
        Object obj = this.f3568c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                mr0 mr0Var = uVar.W;
                if (z10) {
                    new y(mr0Var.f3604a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(mr0Var, 4)).show();
                    return;
                } else {
                    mr0Var.b(uVar.f3588a.E);
                    return;
                }
            case 1:
                s3 s3Var = (s3) obj;
                if (!z10) {
                    s3Var.I.setVisibility(8);
                    return;
                } else {
                    s3Var.getClass();
                    return;
                }
            case 2:
                k4 k4Var = ((l4) obj).f4924b;
                if (!z10) {
                    i12 = 8;
                }
                k4Var.setVisibility(i12);
                return;
            case 3:
                r6 r6Var = (r6) obj;
                if (!z10) {
                    r6Var.X0.setVisibility(8);
                    return;
                } else {
                    r6Var.getClass();
                    return;
                }
            case 4:
                h8 h8Var = (h8) obj;
                if (!z10) {
                    h8Var.setVisibility(8);
                    return;
                } else {
                    h8Var.getClass();
                    return;
                }
            case 5:
                qb qbVar = (qb) obj;
                if (!z10) {
                    qbVar.A2.f5232j1.setVisibility(8);
                    return;
                } else {
                    qbVar.getClass();
                    return;
                }
            case 6:
                ((t0) obj).f(z10, false);
                return;
            case 7:
                String str2 = d0.f7885a;
                e0 e0Var = ((b0) ((k2.j) ((n4.y) obj).f14993c)).f10623a;
                if (e0Var.f10646a0 != z10) {
                    e0Var.f10646a0 = z10;
                    e0Var.f10666m.e(23, new i2.x(1, z10));
                    return;
                }
                return;
            case 8:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                return;
            case 9:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                return;
            case 10:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                return;
            case 11:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                return;
            case 12:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
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
                Context context = (Context) obj;
                if (z10) {
                    i10 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i10 = R.string.MonetizationInfoTONLink;
                }
                nf.f.s(context, LocaleController.getString(i10));
                return;
            case 19:
                ny0 ny0Var = ((rm) obj).f37167c.f32272d1;
                if (ny0Var != null && z10) {
                    ny0Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                wo woVar = (wo) obj;
                woVar.f39296x0.autotranslation = z10;
                woVar.getMessagesController().putChat(woVar.f39296x0, false);
                return;
            case 21:
                mp mpVar = (mp) obj;
                kp kpVar = mpVar.h;
                if (kpVar != null && kpVar.d != null && !mpVar.isDismissed()) {
                    mpVar.A(z10, true);
                    if (mpVar.M != null) {
                        mpVar.P = true;
                        if (mpVar.v()) {
                            wallPaper = null;
                        } else {
                            wallPaper = mpVar.f26203n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        d4 d4Var = mpVar.M.f25997a;
                        if (d4Var.f18587a) {
                            mpVar.f26203n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            mpVar.f26203n.i(d4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (kpVar.d != null) {
                        while (i12 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i12)).f25999c = z10 ? 1 : 0;
                            i12++;
                        }
                        kpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                cw cwVar = (cw) obj;
                if (!z10) {
                    cwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 23:
                c10 c10Var = (c10) obj;
                c10Var.R(c10Var.f22928y0, z10);
                return;
            case 24:
                b40 b40Var = (b40) obj;
                if (!z10) {
                    b40Var.f22604r.setVisibility(8);
                    return;
                } else {
                    b40Var.getClass();
                    return;
                }
            case 25:
                w50 w50Var = ((v50) obj).H0;
                if (!w50Var.f29583g0) {
                    try {
                        w50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(w50Var.f29577c.getParentActivity());
                    if (z10) {
                        j3 = w50Var.f29582f0;
                    } else {
                        j3 = 0;
                    }
                    w50Var.f29579d0 = j3;
                    w50Var.f29578c0 = System.currentTimeMillis();
                    w50Var.f29580e0 = true;
                    w50Var.r();
                    w50Var.invalidate();
                    NotificationCenter.getInstance(w50Var.f29571a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(w50Var.Q), Boolean.FALSE);
                    return;
                }
                return;
            case 26:
                ba0 ba0Var = (ba0) obj;
                if (z10) {
                    ba0Var.G.setVisibility(8);
                    return;
                } else {
                    ba0Var.getClass();
                    return;
                }
            case 27:
                n2 n2Var = ((vm0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 28:
                yu0 yu0Var = (yu0) obj;
                if (!z10) {
                    yu0Var.m0.setVisibility(8);
                    return;
                } else {
                    yu0Var.getClass();
                    return;
                }
            default:
                nr0 nr0Var = (nr0) obj;
                if (!z10) {
                    nr0Var.U.f30376q0.setVisibility(0);
                    return;
                } else {
                    nr0Var.getClass();
                    return;
                }
        }
    }
}
