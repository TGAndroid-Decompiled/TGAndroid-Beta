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
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nm;
import org.telegram.ui.to;
public final class f implements Runnable {
    public final int f3850a;
    public final boolean f3851b;
    public final Object f3852c;

    public f(int i10, Object obj, boolean z10) {
        this.f3850a = i10;
        this.f3852c = obj;
        this.f3851b = z10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.WallPaper wallPaper;
        long j3;
        String str;
        int i11 = this.f3850a;
        int i12 = 0;
        boolean z10 = this.f3851b;
        Object obj = this.f3852c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                ds0 ds0Var = uVar.W;
                if (z10) {
                    new y(ds0Var.f3891a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(ds0Var, 4)).show();
                    return;
                } else {
                    ds0Var.b(uVar.f3874a.E);
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
                j4 j4Var = ((k4) obj).f5294b;
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
                    mbVar.A2.f5406j1.setVisibility(8);
                    return;
                } else {
                    mbVar.getClass();
                    return;
                }
            case 6:
                ((t0) obj).f(z10, false);
                return;
            case 7:
                String str2 = d0.f8538a;
                f0 f0Var = ((c0) ((k2.k) ((n4.y) obj).f16645c)).f11570a;
                if (f0Var.f11605a0 != z10) {
                    f0Var.f11605a0 = z10;
                    f0Var.f11626m.e(23, new i2.y(1, z10));
                    return;
                }
                return;
            case 8:
                ki.i iVar = (ki.i) obj;
                iVar.M = z10;
                iVar.N = iVar.q();
                iVar.O = 0;
                iVar.P = 0;
                ki.m mVar = iVar.f14909j;
                mVar.b("torch requested: enabled=" + z10 + ", available=" + iVar.q() + ", cameraId=" + iVar.f14918o + ", facing=" + iVar.D);
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
                iz0 iz0Var = ((nm) obj).f39015c.f43284b1;
                if (iz0Var != null && z10) {
                    iz0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                to toVar = (to) obj;
                toVar.f40920x0.autotranslation = z10;
                toVar.getMessagesController().putChat(toVar.f40920x0, false);
                return;
            case 22:
                pp ppVar = (pp) obj;
                np npVar = ppVar.h;
                if (npVar != null && npVar.d != null && !ppVar.isDismissed()) {
                    ppVar.A(z10, true);
                    if (ppVar.M != null) {
                        ppVar.P = true;
                        if (ppVar.v()) {
                            wallPaper = null;
                        } else {
                            wallPaper = ppVar.f29699n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        c4 c4Var = ppVar.M.f29428a;
                        if (c4Var.f20504a) {
                            ppVar.f29699n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            ppVar.f29699n.i(c4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (npVar.d != null) {
                        while (i12 < npVar.d.size()) {
                            ((op) npVar.d.get(i12)).f29430c = z10 ? 1 : 0;
                            i12++;
                        }
                        npVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                gw gwVar = (gw) obj;
                if (!z10) {
                    gwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 24:
                f10 f10Var = (f10) obj;
                f10Var.P(f10Var.f26232y0, z10);
                return;
            case 25:
                f40 f40Var = (f40) obj;
                if (!z10) {
                    f40Var.f26277r.setVisibility(8);
                    return;
                } else {
                    f40Var.getClass();
                    return;
                }
            case 26:
                f60 f60Var = ((y50) obj).H0;
                if (!f60Var.f26319l0) {
                    try {
                        f60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(f60Var.f26320n.getParentActivity());
                    if (z10) {
                        j3 = f60Var.f26318k0;
                    } else {
                        j3 = 0;
                    }
                    f60Var.f26316i0 = j3;
                    f60Var.f26315h0 = System.currentTimeMillis();
                    f60Var.f26317j0 = true;
                    f60Var.u();
                    f60Var.invalidate();
                    NotificationCenter.getInstance(f60Var.f26310f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(f60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 27:
                pa0 pa0Var = (pa0) obj;
                if (z10) {
                    pa0Var.G.setVisibility(8);
                    return;
                } else {
                    pa0Var.getClass();
                    return;
                }
            case 28:
                n2 n2Var = ((on0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                pv0 pv0Var = (pv0) obj;
                if (!z10) {
                    pv0Var.m0.setVisibility(8);
                    return;
                } else {
                    pv0Var.getClass();
                    return;
                }
        }
    }
}
