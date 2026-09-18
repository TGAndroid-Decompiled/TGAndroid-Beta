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
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.yr0;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.pm;
import org.telegram.ui.uo;
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
                yr0 yr0Var = uVar.W;
                if (z10) {
                    new y(yr0Var.f3607a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(yr0Var, 4)).show();
                    return;
                } else {
                    yr0Var.b(uVar.f3591a.E);
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
                String str2 = d0.f7887a;
                e0 e0Var = ((b0) ((k2.j) ((n4.y) obj).f15180c)).f10624a;
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
                zy0 zy0Var = ((pm) obj).f36508c.f40240d1;
                if (zy0Var != null && z10) {
                    zy0Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                uo uoVar = (uo) obj;
                uoVar.f38065x0.autotranslation = z10;
                uoVar.getMessagesController().putChat(uoVar.f38065x0, false);
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
                            wallPaper = mpVar.f26485n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        d4 d4Var = mpVar.M.f26230a;
                        if (d4Var.f18774a) {
                            mpVar.f26485n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            mpVar.f26485n.i(d4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (kpVar.d != null) {
                        while (i12 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i12)).f26232c = z10 ? 1 : 0;
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
                c10Var.R(c10Var.f23167y0, z10);
                return;
            case 24:
                b40 b40Var = (b40) obj;
                if (!z10) {
                    b40Var.f22804r.setVisibility(8);
                    return;
                } else {
                    b40Var.getClass();
                    return;
                }
            case 25:
                b60 b60Var = ((u50) obj).H0;
                if (!b60Var.f22843j0) {
                    try {
                        b60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(b60Var.f22838f.getParentActivity());
                    if (z10) {
                        j3 = b60Var.f22842i0;
                    } else {
                        j3 = 0;
                    }
                    b60Var.f22840g0 = j3;
                    b60Var.f22839f0 = System.currentTimeMillis();
                    b60Var.f22841h0 = true;
                    b60Var.v();
                    b60Var.invalidate();
                    NotificationCenter.getInstance(b60Var.d).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(b60Var.T), Boolean.FALSE);
                    return;
                }
                return;
            case 26:
                ka0 ka0Var = (ka0) obj;
                if (z10) {
                    ka0Var.G.setVisibility(8);
                    return;
                } else {
                    ka0Var.getClass();
                    return;
                }
            case 27:
                n2 n2Var = ((jn0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 28:
                kv0 kv0Var = (kv0) obj;
                if (!z10) {
                    kv0Var.m0.setVisibility(8);
                    return;
                } else {
                    kv0Var.getClass();
                    return;
                }
            default:
                zr0 zr0Var = (zr0) obj;
                if (!z10) {
                    zr0Var.U.f25835q0.setVisibility(0);
                    return;
                } else {
                    zr0Var.getClass();
                    return;
                }
        }
    }
}
