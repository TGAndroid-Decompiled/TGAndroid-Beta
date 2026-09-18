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
import org.telegram.ui.ActionBar.e4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rm;
import org.telegram.ui.wo;
public final class f implements Runnable {
    public final int f3569a;
    public final boolean f3570b;
    public final Object f3571c;

    public f(int i10, Object obj, boolean z10) {
        this.f3569a = i10;
        this.f3571c = obj;
        this.f3570b = z10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.WallPaper wallPaper;
        long j3;
        String str;
        int i11 = this.f3569a;
        int i12 = 0;
        boolean z10 = this.f3570b;
        Object obj = this.f3571c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                nr0 nr0Var = uVar.W;
                if (z10) {
                    new y(nr0Var.f3607a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(nr0Var, 4)).show();
                    return;
                } else {
                    nr0Var.b(uVar.f3591a.E);
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
                k4 k4Var = ((l4) obj).f4927b;
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
                    qbVar.A2.f5235j1.setVisibility(8);
                    return;
                } else {
                    qbVar.getClass();
                    return;
                }
            case 6:
                ((t0) obj).f(z10, false);
                return;
            case 7:
                String str2 = d0.f7888a;
                e0 e0Var = ((b0) ((k2.j) ((n4.y) obj).f15005c)).f10624a;
                if (e0Var.f10647a0 != z10) {
                    e0Var.f10647a0 = z10;
                    e0Var.f10667m.e(23, new i2.x(1, z10));
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
                oy0 oy0Var = ((rm) obj).f37265c.f32258d1;
                if (oy0Var != null && z10) {
                    oy0Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                wo woVar = (wo) obj;
                woVar.f39118x0.autotranslation = z10;
                woVar.getMessagesController().putChat(woVar.f39118x0, false);
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
                            wallPaper = mpVar.f26234n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        e4 e4Var = mpVar.M.f25957a;
                        if (e4Var.f18618a) {
                            mpVar.f26234n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            mpVar.f26234n.i(e4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (kpVar.d != null) {
                        while (i12 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i12)).f25959c = z10 ? 1 : 0;
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
                c10Var.R(c10Var.f22895y0, z10);
                return;
            case 24:
                b40 b40Var = (b40) obj;
                if (!z10) {
                    b40Var.f22567r.setVisibility(8);
                    return;
                } else {
                    b40Var.getClass();
                    return;
                }
            case 25:
                w50 w50Var = ((v50) obj).H0;
                if (!w50Var.f29544g0) {
                    try {
                        w50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(w50Var.f29538c.getParentActivity());
                    if (z10) {
                        j3 = w50Var.f29543f0;
                    } else {
                        j3 = 0;
                    }
                    w50Var.f29540d0 = j3;
                    w50Var.f29539c0 = System.currentTimeMillis();
                    w50Var.f29541e0 = true;
                    w50Var.r();
                    w50Var.invalidate();
                    NotificationCenter.getInstance(w50Var.f29532a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(w50Var.Q), Boolean.FALSE);
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
                o2 o2Var = ((wm0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                o2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 28:
                zu0 zu0Var = (zu0) obj;
                if (!z10) {
                    zu0Var.m0.setVisibility(8);
                    return;
                } else {
                    zu0Var.getClass();
                    return;
                }
            default:
                or0 or0Var = (or0) obj;
                if (!z10) {
                    or0Var.U.f30646q0.setVisibility(0);
                    return;
                } else {
                    or0Var.getClass();
                    return;
                }
        }
    }
}
