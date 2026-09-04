package ah;

import android.content.Context;
import android.media.AudioManager;
import bi.o1;
import di.h8;
import di.k4;
import di.l4;
import di.q6;
import di.rb;
import di.s3;
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
import org.telegram.ui.Components.bw;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.sm;
import org.telegram.ui.xo;
public final class u implements Runnable {
    public final int f682a;
    public final boolean f683b;
    public final Object f684c;

    public u(int i10, Object obj, boolean z10) {
        this.f682a = i10;
        this.f684c = obj;
        this.f683b = z10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.WallPaper wallPaper;
        long j3;
        String str;
        int i11 = this.f682a;
        int i12 = 0;
        boolean z10 = this.f683b;
        Object obj = this.f684c;
        switch (i11) {
            case 0:
                v vVar = (v) obj;
                if (z10) {
                    ((b0) vVar.f708x.f713c).f451w.setVisibility(4);
                    return;
                } else {
                    vVar.getClass();
                    return;
                }
            case 1:
                ci.t tVar = (ci.t) obj;
                lr0 lr0Var = tVar.W;
                if (z10) {
                    new ci.x(lr0Var.f4848a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new o1(lr0Var, 4)).show();
                    return;
                } else {
                    lr0Var.b(tVar.f4831a.E);
                    return;
                }
            case 2:
                s3 s3Var = (s3) obj;
                if (!z10) {
                    s3Var.I.setVisibility(8);
                    return;
                } else {
                    s3Var.getClass();
                    return;
                }
            case 3:
                k4 k4Var = ((l4) obj).f7520b;
                if (!z10) {
                    i12 = 8;
                }
                k4Var.setVisibility(i12);
                return;
            case 4:
                q6 q6Var = (q6) obj;
                if (!z10) {
                    q6Var.X0.setVisibility(8);
                    return;
                } else {
                    q6Var.getClass();
                    return;
                }
            case 5:
                h8 h8Var = (h8) obj;
                if (!z10) {
                    h8Var.setVisibility(8);
                    return;
                } else {
                    h8Var.getClass();
                    return;
                }
            case 6:
                rb rbVar = (rb) obj;
                if (!z10) {
                    rbVar.A2.f7873j1.setVisibility(8);
                    return;
                } else {
                    rbVar.getClass();
                    return;
                }
            case 7:
                ((gi.t0) obj).f(z10, false);
                return;
            case 8:
                String str2 = e2.d0.f8737a;
                i2.f0 f0Var = ((i2.c0) ((k2.j) ((n4.y) obj).f16497c)).f11471a;
                if (f0Var.f11505a0 != z10) {
                    f0Var.f11505a0 = z10;
                    f0Var.f11526m.e(23, new i2.y(1, z10));
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
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                return;
            case 13:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                return;
            case 14:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                return;
            case 15:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                return;
            case 16:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                return;
            case 17:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                return;
            case 18:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                return;
            case 19:
                Context context = (Context) obj;
                if (z10) {
                    i10 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i10 = R.string.MonetizationInfoTONLink;
                }
                of.f.s(context, LocaleController.getString(i10));
                return;
            case 20:
                my0 my0Var = ((sm) obj).f40473c.f35225d1;
                if (my0Var != null && z10) {
                    my0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                xo xoVar = (xo) obj;
                xoVar.f42799x0.autotranslation = z10;
                xoVar.getMessagesController().putChat(xoVar.f42799x0, false);
                return;
            case 22:
                lp lpVar = (lp) obj;
                jp jpVar = lpVar.h;
                if (jpVar != null && jpVar.d != null && !lpVar.isDismissed()) {
                    lpVar.B(z10, true);
                    if (lpVar.M != null) {
                        lpVar.P = true;
                        if (lpVar.v()) {
                            wallPaper = null;
                        } else {
                            wallPaper = lpVar.f28267n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        d4 d4Var = lpVar.M.f27882a;
                        if (d4Var.f20361a) {
                            lpVar.f28267n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            lpVar.f28267n.i(d4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (jpVar.d != null) {
                        while (i12 < jpVar.d.size()) {
                            ((kp) jpVar.d.get(i12)).f27884c = z10 ? 1 : 0;
                            i12++;
                        }
                        jpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                bw bwVar = (bw) obj;
                if (!z10) {
                    bwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 24:
                c10 c10Var = (c10) obj;
                c10Var.R(c10Var.f24864y0, z10);
                return;
            case 25:
                b40 b40Var = (b40) obj;
                if (!z10) {
                    b40Var.f24541r.setVisibility(8);
                    return;
                } else {
                    b40Var.getClass();
                    return;
                }
            case 26:
                w50 w50Var = ((v50) obj).H0;
                if (!w50Var.f32137g0) {
                    try {
                        w50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(w50Var.f32130c.getParentActivity());
                    if (z10) {
                        j3 = w50Var.f32136f0;
                    } else {
                        j3 = 0;
                    }
                    w50Var.f32132d0 = j3;
                    w50Var.f32131c0 = System.currentTimeMillis();
                    w50Var.f32134e0 = true;
                    w50Var.r();
                    w50Var.invalidate();
                    NotificationCenter.getInstance(w50Var.f32124a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(w50Var.Q), Boolean.FALSE);
                    return;
                }
                return;
            case 27:
                ca0 ca0Var = (ca0) obj;
                if (z10) {
                    ca0Var.G.setVisibility(8);
                    return;
                } else {
                    ca0Var.getClass();
                    return;
                }
            case 28:
                n2 n2Var = ((vm0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                xu0 xu0Var = (xu0) obj;
                if (!z10) {
                    xu0Var.m0.setVisibility(8);
                    return;
                } else {
                    xu0Var.getClass();
                    return;
                }
        }
    }
}
