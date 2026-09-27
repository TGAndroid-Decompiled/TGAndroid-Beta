package bi;

import ai.y1;
import android.content.Context;
import android.media.AudioManager;
import ci.d8;
import ci.j4;
import ci.k4;
import ci.mb;
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
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.om;
import org.telegram.ui.so;
public final class f implements Runnable {
    public final int f3563a;
    public final boolean f3564b;
    public final Object f3565c;

    public f(int i10, Object obj, boolean z10) {
        this.f3563a = i10;
        this.f3565c = obj;
        this.f3564b = z10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.WallPaper wallPaper;
        long j3;
        String str;
        int i11 = this.f3563a;
        int i12 = 0;
        boolean z10 = this.f3564b;
        Object obj = this.f3565c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                zr0 zr0Var = uVar.W;
                if (z10) {
                    new y(zr0Var.f3601a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(zr0Var, 4)).show();
                    return;
                } else {
                    zr0Var.b(uVar.f3585a.E);
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
                j4 j4Var = ((k4) obj).f4905b;
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
                d8 d8Var = (d8) obj;
                if (!z10) {
                    d8Var.setVisibility(8);
                    return;
                } else {
                    d8Var.getClass();
                    return;
                }
            case 5:
                mb mbVar = (mb) obj;
                if (!z10) {
                    mbVar.A2.f5013j1.setVisibility(8);
                    return;
                } else {
                    mbVar.getClass();
                    return;
                }
            case 6:
                ((t0) obj).f(z10, false);
                return;
            case 7:
                String str2 = d0.f7872a;
                f0 f0Var = ((c0) ((k2.j) ((n4.y) obj).f15258c)).f10619a;
                if (f0Var.f10651a0 != z10) {
                    f0Var.f10651a0 = z10;
                    f0Var.f10671m.e(23, new i2.y(1, z10));
                    return;
                }
                return;
            case 8:
                ki.i iVar = (ki.i) obj;
                iVar.M = z10;
                iVar.N = iVar.q();
                iVar.O = 0;
                iVar.P = 0;
                ki.m mVar = iVar.f13715j;
                mVar.b("torch requested: enabled=" + z10 + ", available=" + iVar.q() + ", cameraId=" + iVar.f13724o + ", facing=" + iVar.D);
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
                zy0 zy0Var = ((om) obj).f36226c.f39729d1;
                if (zy0Var != null && z10) {
                    zy0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                so soVar = (so) obj;
                soVar.f37534x0.autotranslation = z10;
                soVar.getMessagesController().putChat(soVar.f37534x0, false);
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
                            wallPaper = opVar.f27171n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        d4 d4Var = opVar.M.f26877a;
                        if (d4Var.f18800a) {
                            opVar.f27171n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            opVar.f27171n.i(d4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (mpVar.d != null) {
                        while (i12 < mpVar.d.size()) {
                            ((np) mpVar.d.get(i12)).f26879c = z10 ? 1 : 0;
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
                e10Var.R(e10Var.f23837y0, z10);
                return;
            case 25:
                e40 e40Var = (e40) obj;
                if (!z10) {
                    e40Var.f23870r.setVisibility(8);
                    return;
                } else {
                    e40Var.getClass();
                    return;
                }
            case 26:
                e60 e60Var = ((x50) obj).H0;
                if (!e60Var.f23916l0) {
                    try {
                        e60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(e60Var.f23917n.getParentActivity());
                    if (z10) {
                        j3 = e60Var.f23915k0;
                    } else {
                        j3 = 0;
                    }
                    e60Var.f23913i0 = j3;
                    e60Var.f23912h0 = System.currentTimeMillis();
                    e60Var.f23914j0 = true;
                    e60Var.u();
                    e60Var.invalidate();
                    NotificationCenter.getInstance(e60Var.f23907f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(e60Var.V), Boolean.FALSE);
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
                o2 o2Var = ((kn0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                o2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                lv0 lv0Var = (lv0) obj;
                if (!z10) {
                    lv0Var.m0.setVisibility(8);
                    return;
                } else {
                    lv0Var.getClass();
                    return;
                }
        }
    }
}
