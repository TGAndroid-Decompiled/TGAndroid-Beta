package ah;

import android.content.Context;
import android.media.AudioManager;
import bi.o1;
import di.d8;
import di.i4;
import di.j4;
import di.mb;
import di.o6;
import di.q3;
import fi.b3;
import fi.i3;
import fi.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
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
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.ow;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zp;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.vm;
import org.telegram.ui.zo;
public final class t implements Runnable {
    public final int f865a;
    public final boolean f866b;
    public final Object f867c;

    public t(int i10, Object obj, boolean z10) {
        this.f865a = i10;
        this.f867c = obj;
        this.f866b = z10;
    }

    @Override
    public final void run() {
        int i10;
        long j10;
        String str;
        int i11 = this.f865a;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i12 = 0;
        boolean z10 = this.f866b;
        Object obj = this.f867c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                if (z10) {
                    ((a0) uVar.f890x.f895c).f646w.setVisibility(4);
                    return;
                } else {
                    uVar.getClass();
                    return;
                }
            case 1:
                ci.t tVar = (ci.t) obj;
                ms0 ms0Var = tVar.W;
                if (z10) {
                    new ci.x(ms0Var.f4799a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new o1(ms0Var, 4)).show();
                    return;
                } else {
                    ms0Var.b(tVar.f4783a.E);
                    return;
                }
            case 2:
                q3 q3Var = (q3) obj;
                if (!z10) {
                    q3Var.I.setVisibility(8);
                    return;
                } else {
                    q3Var.getClass();
                    return;
                }
            case 3:
                i4 i4Var = ((j4) obj).f7109b;
                if (!z10) {
                    i12 = 8;
                }
                i4Var.setVisibility(i12);
                return;
            case 4:
                o6 o6Var = (o6) obj;
                if (!z10) {
                    o6Var.X0.setVisibility(8);
                    return;
                } else {
                    o6Var.getClass();
                    return;
                }
            case 5:
                d8 d8Var = (d8) obj;
                if (!z10) {
                    d8Var.setVisibility(8);
                    return;
                } else {
                    d8Var.getClass();
                    return;
                }
            case 6:
                mb mbVar = (mb) obj;
                if (!z10) {
                    mbVar.A2.f7268j1.setVisibility(8);
                    return;
                } else {
                    mbVar.getClass();
                    return;
                }
            case 7:
                k3 k3Var = (k3) obj;
                i3 i3Var = k3Var.f9386y;
                b3 b3Var = k3Var.f9384x;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().animate().cancel();
                    b3Var.getWebView().animate().alpha(0.0f).start();
                }
                i3Var.setLoadProgress(0.0f);
                i3Var.setAlpha(1.0f);
                i3Var.setVisibility(0);
                if (!z10) {
                    user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
                }
                b3Var.setBotUser(user);
                if (!z10) {
                    b3Var.s(k3Var.G, k3Var.H);
                }
                NotificationCenter.getInstance(b3Var.M).doOnIdle(new org.telegram.ui.web.s(b3Var, 2));
                return;
            case 8:
                ((gi.t0) obj).f(z10, false);
                return;
            case 9:
                String str2 = e2.m0.f8375a;
                i2.h0 h0Var = ((i2.b0) ((k2.u) ((qf.b) obj).f43098c)).f10929a;
                if (h0Var.f10990d0 != z10) {
                    h0Var.f10990d0 = z10;
                    h0Var.f11005m.e(23, new i2.x(1, z10));
                    return;
                }
                return;
            case 10:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                return;
            case 11:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                return;
            case 12:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                return;
            case 13:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                return;
            case 14:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                return;
            case 15:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                return;
            case 16:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                return;
            case 17:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                return;
            case 18:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                return;
            case 19:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                return;
            case 20:
                Context context = (Context) obj;
                if (z10) {
                    i10 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i10 = R.string.MonetizationInfoTONLink;
                }
                pf.d.r(context, LocaleController.getString(i10));
                return;
            case 21:
                lz0 lz0Var = ((vm) obj).f40731c.f35613d1;
                if (lz0Var != null && z10) {
                    lz0Var.setVisibility(8);
                    return;
                }
                return;
            case 22:
                zo zoVar = (zo) obj;
                zoVar.f42394x0.autotranslation = z10;
                zoVar.getMessagesController().putChat(zoVar.f42394x0, false);
                return;
            case 23:
                zp zpVar = (zp) obj;
                xp xpVar = zpVar.h;
                if (xpVar != null && xpVar.d != null && !zpVar.isDismissed()) {
                    zpVar.D(z10, true);
                    if (zpVar.M != null) {
                        zpVar.P = true;
                        if (!zpVar.x()) {
                            wallPaper = zpVar.f31654n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        b4 b4Var = zpVar.M.f31345a;
                        if (b4Var.f19342a) {
                            zpVar.f31654n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            zpVar.f31654n.i(b4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (xpVar.d != null) {
                        while (i12 < xpVar.d.size()) {
                            ((yp) xpVar.d.get(i12)).f31347c = z10 ? 1 : 0;
                            i12++;
                        }
                        xpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ow owVar = (ow) obj;
                if (!z10) {
                    owVar.E.setVisibility(8);
                    return;
                }
                return;
            case 25:
                o10 o10Var = (o10) obj;
                o10Var.S(o10Var.f27494y0, z10);
                return;
            case 26:
                o40 o40Var = (o40) obj;
                if (!z10) {
                    o40Var.f27533r.setVisibility(8);
                    return;
                } else {
                    o40Var.getClass();
                    return;
                }
            case 27:
                p60 p60Var = ((i60) obj).H0;
                if (!p60Var.f27874l0) {
                    try {
                        p60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(p60Var.f27875n.getParentActivity());
                    if (z10) {
                        j10 = p60Var.f27872k0;
                    } else {
                        j10 = 0;
                    }
                    p60Var.f27868i0 = j10;
                    p60Var.f27866h0 = System.currentTimeMillis();
                    p60Var.f27870j0 = true;
                    p60Var.v();
                    p60Var.invalidate();
                    NotificationCenter.getInstance(p60Var.f27861f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(p60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 28:
                cb0 cb0Var = (cb0) obj;
                if (z10) {
                    cb0Var.G.setVisibility(8);
                    return;
                } else {
                    cb0Var.getClass();
                    return;
                }
            default:
                m2 m2Var = ((xn0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                m2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
        }
    }
}
