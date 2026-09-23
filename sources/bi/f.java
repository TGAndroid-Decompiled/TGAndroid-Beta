package bi;

import ai.y1;
import android.content.Context;
import android.media.AudioManager;
import ci.e8;
import ci.j4;
import ci.k4;
import ci.nb;
import ci.q6;
import ci.r3;
import e2.d0;
import fi.t0;
import i2.c0;
import i2.f0;
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
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.om;
import org.telegram.ui.so;
public final class f implements Runnable {
    public final int f3561a;
    public final boolean f3562b;
    public final Object f3563c;

    public f(int i10, Object obj, boolean z10) {
        this.f3561a = i10;
        this.f3563c = obj;
        this.f3562b = z10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.WallPaper wallPaper;
        long j3;
        String str;
        int i11 = this.f3561a;
        int i12 = 0;
        boolean z10 = this.f3562b;
        Object obj = this.f3563c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                mr0 mr0Var = uVar.W;
                if (z10) {
                    new y(mr0Var.f3599a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(mr0Var, 4)).show();
                    return;
                } else {
                    mr0Var.b(uVar.f3583a.E);
                    return;
                }
            case 1:
                r3 r3Var = (r3) obj;
                if (!z10) {
                    r3Var.I.setVisibility(8);
                    return;
                } else {
                    r3Var.getClass();
                    return;
                }
            case 2:
                j4 j4Var = ((k4) obj).f4887b;
                if (!z10) {
                    i12 = 8;
                }
                j4Var.setVisibility(i12);
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
                    nbVar.A2.f5057j1.setVisibility(8);
                    return;
                } else {
                    nbVar.getClass();
                    return;
                }
            case 6:
                ((t0) obj).f(z10, false);
                return;
            case 7:
                String str2 = d0.f7871a;
                f0 f0Var = ((c0) ((k2.j) ((n4.y) obj).f14970c)).f10616a;
                if (f0Var.f10648a0 != z10) {
                    f0Var.f10648a0 = z10;
                    f0Var.f10668m.e(23, new i2.y(1, z10));
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
                my0 my0Var = ((om) obj).f35909c.f39349d1;
                if (my0Var != null && z10) {
                    my0Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                so soVar = (so) obj;
                soVar.f37374x0.autotranslation = z10;
                soVar.getMessagesController().putChat(soVar.f37374x0, false);
                return;
            case 21:
                np npVar = (np) obj;
                lp lpVar = npVar.h;
                if (lpVar != null && lpVar.d != null && !npVar.isDismissed()) {
                    npVar.A(z10, true);
                    if (npVar.M != null) {
                        npVar.P = true;
                        if (npVar.v()) {
                            wallPaper = null;
                        } else {
                            wallPaper = npVar.f26470n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        c4 c4Var = npVar.M.f26253a;
                        if (c4Var.f18533a) {
                            npVar.f26470n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            npVar.f26470n.i(c4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (lpVar.d != null) {
                        while (i12 < lpVar.d.size()) {
                            ((mp) lpVar.d.get(i12)).f26255c = z10 ? 1 : 0;
                            i12++;
                        }
                        lpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                dw dwVar = (dw) obj;
                if (!z10) {
                    dwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 23:
                d10 d10Var = (d10) obj;
                d10Var.R(d10Var.f23202y0, z10);
                return;
            case 24:
                c40 c40Var = (c40) obj;
                if (!z10) {
                    c40Var.f22917r.setVisibility(8);
                    return;
                } else {
                    c40Var.getClass();
                    return;
                }
            case 25:
                x50 x50Var = ((w50) obj).H0;
                if (!x50Var.f29900g0) {
                    try {
                        x50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(x50Var.f29894c.getParentActivity());
                    if (z10) {
                        j3 = x50Var.f29899f0;
                    } else {
                        j3 = 0;
                    }
                    x50Var.f29896d0 = j3;
                    x50Var.f29895c0 = System.currentTimeMillis();
                    x50Var.f29897e0 = true;
                    x50Var.r();
                    x50Var.invalidate();
                    NotificationCenter.getInstance(x50Var.f29888a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(x50Var.Q), Boolean.FALSE);
                    return;
                }
                return;
            case 26:
                ca0 ca0Var = (ca0) obj;
                if (z10) {
                    ca0Var.G.setVisibility(8);
                    return;
                } else {
                    ca0Var.getClass();
                    return;
                }
            case 27:
                n2 n2Var = ((wm0) obj).G;
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
                    nr0Var.U.f30437q0.setVisibility(0);
                    return;
                } else {
                    nr0Var.getClass();
                    return;
                }
        }
    }
}
