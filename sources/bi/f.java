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
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.pm;
import org.telegram.ui.uo;
public final class f implements Runnable {
    public final int f3568a;
    public final boolean f3569b;
    public final Object f3570c;

    public f(int i10, Object obj, boolean z10) {
        this.f3568a = i10;
        this.f3570c = obj;
        this.f3569b = z10;
    }

    @Override
    public final void run() {
        String str;
        int i10;
        TLRPC.WallPaper wallPaper;
        long j3;
        String str2;
        int i11 = this.f3568a;
        int i12 = 0;
        boolean z10 = this.f3569b;
        Object obj = this.f3570c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                zr0 zr0Var = uVar.W;
                if (z10) {
                    new y(zr0Var.f3606a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(zr0Var, 4)).show();
                    return;
                } else {
                    zr0Var.b(uVar.f3590a.E);
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
                k4 k4Var = ((l4) obj).f4926b;
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
                    qbVar.A2.f5234j1.setVisibility(8);
                    return;
                } else {
                    qbVar.getClass();
                    return;
                }
            case 6:
                ((t0) obj).f(z10, false);
                return;
            case 7:
                String str3 = d0.f7887a;
                e0 e0Var = ((b0) ((k2.k) ((n4.y) obj).f15231b)).f10625a;
                if (e0Var.f10648a0 != z10) {
                    e0Var.f10648a0 = z10;
                    e0Var.f10668m.e(23, new i2.x(1, z10));
                    return;
                }
                return;
            case 8:
                ki.h hVar = (ki.h) obj;
                hVar.L = z10;
                hVar.M = hVar.q();
                hVar.N = 0;
                hVar.O = 0;
                ki.k kVar = hVar.f13704j;
                StringBuilder sb2 = new StringBuilder("torch requested: enabled=");
                sb2.append(z10);
                sb2.append(", available=");
                sb2.append(hVar.q());
                sb2.append(", cameraId=");
                sb2.append(hVar.f13713o);
                sb2.append(", facing=");
                sb2.append(hVar.C);
                sb2.append(", sessionMode=");
                if (hVar.f13692b0) {
                    str = "CONSTRAINED_HIGH_SPEED";
                } else {
                    str = "REGULAR";
                }
                sb2.append(str);
                kVar.b(sb2.toString());
                hVar.a();
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
                az0 az0Var = ((pm) obj).f36611c.f40303d1;
                if (az0Var != null && z10) {
                    az0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                uo uoVar = (uo) obj;
                uoVar.f38195x0.autotranslation = z10;
                uoVar.getMessagesController().putChat(uoVar.f38195x0, false);
                return;
            case 22:
                mp mpVar = (mp) obj;
                kp kpVar = mpVar.h;
                if (kpVar != null && kpVar.d != null && !mpVar.isDismissed()) {
                    mpVar.A(z10, true);
                    if (mpVar.M != null) {
                        mpVar.P = true;
                        if (mpVar.v()) {
                            wallPaper = null;
                        } else {
                            wallPaper = mpVar.f26506n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        d4 d4Var = mpVar.M.f26155a;
                        if (d4Var.f18822a) {
                            mpVar.f26506n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            mpVar.f26506n.i(d4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (kpVar.d != null) {
                        while (i12 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i12)).f26157c = z10 ? 1 : 0;
                            i12++;
                        }
                        kpVar.l();
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
                c10 c10Var = (c10) obj;
                c10Var.R(c10Var.f23161y0, z10);
                return;
            case 25:
                b40 b40Var = (b40) obj;
                if (!z10) {
                    b40Var.f22844r.setVisibility(8);
                    return;
                } else {
                    b40Var.getClass();
                    return;
                }
            case 26:
                c60 c60Var = ((u50) obj).H0;
                if (!c60Var.f23241l0) {
                    try {
                        c60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(c60Var.f23242n.getParentActivity());
                    if (z10) {
                        j3 = c60Var.f23240k0;
                    } else {
                        j3 = 0;
                    }
                    c60Var.f23238i0 = j3;
                    c60Var.f23237h0 = System.currentTimeMillis();
                    c60Var.f23239j0 = true;
                    c60Var.u();
                    c60Var.invalidate();
                    NotificationCenter.getInstance(c60Var.f23232f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(c60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 27:
                ma0 ma0Var = (ma0) obj;
                if (z10) {
                    ma0Var.G.setVisibility(8);
                    return;
                } else {
                    ma0Var.getClass();
                    return;
                }
            case 28:
                n2 n2Var = ((kn0) obj).G;
                if (z10) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, str2));
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
