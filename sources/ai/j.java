package ai;

import android.content.Context;
import android.media.AudioManager;
import bi.ad;
import bi.e5;
import bi.f5;
import bi.j4;
import bi.j9;
import bi.r7;
import ei.t0;
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
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.tm;
import org.telegram.ui.yo;
public final class j implements Runnable {
    public final int f455a;
    public final boolean f456b;
    public final Object f457c;

    public j(int i10, Object obj, boolean z10) {
        this.f455a = i10;
        this.f457c = obj;
        this.f456b = z10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.WallPaper wallPaper;
        long j3;
        String str;
        int i11 = this.f455a;
        int i12 = 0;
        boolean z10 = this.f456b;
        Object obj = this.f457c;
        switch (i11) {
            case 0:
                a0 a0Var = (a0) obj;
                vr0 vr0Var = a0Var.W;
                if (z10) {
                    new f0(vr0Var.f442a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new b(vr0Var, 0)).show();
                    return;
                } else {
                    vr0Var.b(a0Var.f411a.E);
                    return;
                }
            case 1:
                j4 j4Var = (j4) obj;
                if (!z10) {
                    j4Var.I.setVisibility(8);
                    return;
                } else {
                    j4Var.getClass();
                    return;
                }
            case 2:
                e5 e5Var = ((f5) obj).f2704b;
                if (!z10) {
                    i12 = 8;
                }
                e5Var.setVisibility(i12);
                return;
            case 3:
                r7 r7Var = (r7) obj;
                if (!z10) {
                    r7Var.X0.setVisibility(8);
                    return;
                } else {
                    r7Var.getClass();
                    return;
                }
            case 4:
                j9 j9Var = (j9) obj;
                if (!z10) {
                    j9Var.setVisibility(8);
                    return;
                } else {
                    j9Var.getClass();
                    return;
                }
            case 5:
                ad adVar = (ad) obj;
                if (!z10) {
                    adVar.A2.f2461j1.setVisibility(8);
                    return;
                } else {
                    adVar.getClass();
                    return;
                }
            case 6:
                ((t0) obj).f(z10, false);
                return;
            case 7:
                String str2 = e2.d0.f7188a;
                i2.e0 e0Var = ((i2.b0) ((k2.j) ((of.b) obj).f14295c)).f10108a;
                if (e0Var.f10130a0 != z10) {
                    e0Var.f10130a0 = z10;
                    e0Var.f10150m.e(23, new i2.x(1, z10));
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
                zy0 zy0Var = ((tm) obj).f36965c.f32295d1;
                if (zy0Var != null && z10) {
                    zy0Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                yo yoVar = (yo) obj;
                yoVar.f39070x0.autotranslation = z10;
                yoVar.getMessagesController().putChat(yoVar.f39070x0, false);
                return;
            case 21:
                sp spVar = (sp) obj;
                qp qpVar = spVar.h;
                if (qpVar != null && qpVar.d != null && !spVar.isDismissed()) {
                    spVar.A(z10, true);
                    if (spVar.M != null) {
                        spVar.P = true;
                        if (spVar.v()) {
                            wallPaper = null;
                        } else {
                            wallPaper = spVar.f27142n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        f4 f4Var = spVar.M.f26733a;
                        if (f4Var.f17714a) {
                            spVar.f27142n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            spVar.f27142n.i(f4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (qpVar.d != null) {
                        while (i12 < qpVar.d.size()) {
                            ((rp) qpVar.d.get(i12)).f26735c = z10 ? 1 : 0;
                            i12++;
                        }
                        qpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                gw gwVar = (gw) obj;
                if (!z10) {
                    gwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 23:
                k10 k10Var = (k10) obj;
                k10Var.R(k10Var.f24559y0, z10);
                return;
            case 24:
                l40 l40Var = (l40) obj;
                if (!z10) {
                    l40Var.f24869r.setVisibility(8);
                    return;
                } else {
                    l40Var.getClass();
                    return;
                }
            case 25:
                f60 f60Var = ((e60) obj).H0;
                if (!f60Var.f22885g0) {
                    try {
                        f60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(f60Var.f22879c.getParentActivity());
                    if (z10) {
                        j3 = f60Var.f22884f0;
                    } else {
                        j3 = 0;
                    }
                    f60Var.f22881d0 = j3;
                    f60Var.f22880c0 = System.currentTimeMillis();
                    f60Var.f22882e0 = true;
                    f60Var.r();
                    f60Var.invalidate();
                    NotificationCenter.getInstance(f60Var.f22873a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(f60Var.Q), Boolean.FALSE);
                    return;
                }
                return;
            case 26:
                la0 la0Var = (la0) obj;
                if (z10) {
                    la0Var.G.setVisibility(8);
                    return;
                } else {
                    la0Var.getClass();
                    return;
                }
            case 27:
                p2 p2Var = ((fn0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                p2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 28:
                iv0 iv0Var = (iv0) obj;
                if (!z10) {
                    iv0Var.m0.setVisibility(8);
                    return;
                } else {
                    iv0Var.getClass();
                    return;
                }
            default:
                wr0 wr0Var = (wr0) obj;
                if (!z10) {
                    wr0Var.U.f24118q0.setVisibility(0);
                    return;
                } else {
                    wr0Var.getClass();
                    return;
                }
        }
    }
}
