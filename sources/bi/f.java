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
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.yr0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nm;
import org.telegram.ui.ro;
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
                yr0 yr0Var = uVar.W;
                if (z10) {
                    new y(yr0Var.f3599a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(yr0Var, 4)).show();
                    return;
                } else {
                    yr0Var.b(uVar.f3583a.E);
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
                String str2 = d0.f7870a;
                f0 f0Var = ((c0) ((k2.j) ((n4.y) obj).f15223c)).f10616a;
                if (f0Var.f10648a0 != z10) {
                    f0Var.f10648a0 = z10;
                    f0Var.f10668m.e(23, new i2.y(1, z10));
                    return;
                }
                return;
            case 8:
                ki.i iVar = (ki.i) obj;
                iVar.M = z10;
                iVar.N = iVar.q();
                iVar.O = 0;
                iVar.P = 0;
                ki.m mVar = iVar.f13713j;
                mVar.b("torch requested: enabled=" + z10 + ", available=" + iVar.q() + ", cameraId=" + iVar.f13722o + ", facing=" + iVar.D);
                iVar.a();
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
                nf.f.s(context, LocaleController.getString(i10));
                return;
            case 20:
                yy0 yy0Var = ((nm) obj).f35923c.f39447d1;
                if (yy0Var != null && z10) {
                    yy0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                ro roVar = (ro) obj;
                roVar.f37419x0.autotranslation = z10;
                roVar.getMessagesController().putChat(roVar.f37419x0, false);
                return;
            case 22:
                op opVar = (op) obj;
                mp mpVar = opVar.h;
                if (mpVar != null && mpVar.d != null && !opVar.isDismissed()) {
                    opVar.A(z10, true);
                    if (opVar.M != null) {
                        opVar.P = true;
                        if (opVar.v()) {
                            wallPaper = null;
                        } else {
                            wallPaper = opVar.f27078n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        b4 b4Var = opVar.M.f26860a;
                        if (b4Var.f18756a) {
                            opVar.f27078n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            opVar.f27078n.i(b4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (mpVar.d != null) {
                        while (i12 < mpVar.d.size()) {
                            ((np) mpVar.d.get(i12)).f26862c = z10 ? 1 : 0;
                            i12++;
                        }
                        mpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ew ewVar = (ew) obj;
                if (!z10) {
                    ewVar.E.setVisibility(8);
                    return;
                }
                return;
            case 24:
                e10 e10Var = (e10) obj;
                e10Var.R(e10Var.f23829y0, z10);
                return;
            case 25:
                d40 d40Var = (d40) obj;
                if (!z10) {
                    d40Var.f23496r.setVisibility(8);
                    return;
                } else {
                    d40Var.getClass();
                    return;
                }
            case 26:
                d60 d60Var = ((w50) obj).H0;
                if (!d60Var.f23568l0) {
                    try {
                        d60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(d60Var.f23569n.getParentActivity());
                    if (z10) {
                        j3 = d60Var.f23567k0;
                    } else {
                        j3 = 0;
                    }
                    d60Var.f23565i0 = j3;
                    d60Var.f23564h0 = System.currentTimeMillis();
                    d60Var.f23566j0 = true;
                    d60Var.u();
                    d60Var.invalidate();
                    NotificationCenter.getInstance(d60Var.f23559f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(d60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 27:
                oa0 oa0Var = (oa0) obj;
                if (z10) {
                    oa0Var.G.setVisibility(8);
                    return;
                } else {
                    oa0Var.getClass();
                    return;
                }
            case 28:
                m2 m2Var = ((jn0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                m2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                kv0 kv0Var = (kv0) obj;
                if (!z10) {
                    kv0Var.m0.setVisibility(8);
                    return;
                } else {
                    kv0Var.getClass();
                    return;
                }
        }
    }
}
