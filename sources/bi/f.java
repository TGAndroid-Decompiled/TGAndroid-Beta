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
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.xr0;
import org.telegram.ui.Components.xy0;
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
                xr0 xr0Var = uVar.W;
                if (z10) {
                    new y(xr0Var.f3599a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(xr0Var, 4)).show();
                    return;
                } else {
                    xr0Var.b(uVar.f3583a.E);
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
                xy0 xy0Var = ((nm) obj).f35925c.f39449d1;
                if (xy0Var != null && z10) {
                    xy0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                ro roVar = (ro) obj;
                roVar.f37421x0.autotranslation = z10;
                roVar.getMessagesController().putChat(roVar.f37421x0, false);
                return;
            case 22:
                np npVar = (np) obj;
                lp lpVar = npVar.h;
                if (lpVar != null && lpVar.d != null && !npVar.isDismissed()) {
                    npVar.A(z10, true);
                    if (npVar.M != null) {
                        npVar.P = true;
                        if (npVar.v()) {
                            wallPaper = null;
                        } else {
                            wallPaper = npVar.f26764n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        b4 b4Var = npVar.M.f26565a;
                        if (b4Var.f18757a) {
                            npVar.f26764n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            npVar.f26764n.i(b4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (lpVar.d != null) {
                        while (i12 < lpVar.d.size()) {
                            ((mp) lpVar.d.get(i12)).f26567c = z10 ? 1 : 0;
                            i12++;
                        }
                        lpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                dw dwVar = (dw) obj;
                if (!z10) {
                    dwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 24:
                d10 d10Var = (d10) obj;
                d10Var.R(d10Var.f23454y0, z10);
                return;
            case 25:
                c40 c40Var = (c40) obj;
                if (!z10) {
                    c40Var.f23187r.setVisibility(8);
                    return;
                } else {
                    c40Var.getClass();
                    return;
                }
            case 26:
                c60 c60Var = ((v50) obj).H0;
                if (!c60Var.f23231l0) {
                    try {
                        c60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(c60Var.f23232n.getParentActivity());
                    if (z10) {
                        j3 = c60Var.f23230k0;
                    } else {
                        j3 = 0;
                    }
                    c60Var.f23228i0 = j3;
                    c60Var.f23227h0 = System.currentTimeMillis();
                    c60Var.f23229j0 = true;
                    c60Var.u();
                    c60Var.invalidate();
                    NotificationCenter.getInstance(c60Var.f23222f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(c60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 27:
                na0 na0Var = (na0) obj;
                if (z10) {
                    na0Var.G.setVisibility(8);
                    return;
                } else {
                    na0Var.getClass();
                    return;
                }
            case 28:
                m2 m2Var = ((in0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                m2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                jv0 jv0Var = (jv0) obj;
                if (!z10) {
                    jv0Var.m0.setVisibility(8);
                    return;
                } else {
                    jv0Var.getClass();
                    return;
                }
        }
    }
}
