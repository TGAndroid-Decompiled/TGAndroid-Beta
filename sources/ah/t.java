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
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.ow;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zp;
import org.telegram.ui.vm;
import org.telegram.ui.zo;
public final class t implements Runnable {
    public final int f861a;
    public final boolean f862b;
    public final Object f863c;

    public t(int i10, Object obj, boolean z10) {
        this.f861a = i10;
        this.f863c = obj;
        this.f862b = z10;
    }

    @Override
    public final void run() {
        int i10;
        long j10;
        int i11 = this.f861a;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i12 = 0;
        boolean z10 = this.f862b;
        Object obj = this.f863c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                if (z10) {
                    ((a0) uVar.f886x.f891c).f642w.setVisibility(4);
                    return;
                } else {
                    uVar.getClass();
                    return;
                }
            case 1:
                ci.t tVar = (ci.t) obj;
                ms0 ms0Var = tVar.W;
                if (z10) {
                    new ci.x(ms0Var.f4796a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new o1(ms0Var, 4)).show();
                    return;
                } else {
                    ms0Var.b(tVar.f4780a.E);
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
                i4 i4Var = ((j4) obj).f7106b;
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
                    mbVar.A2.f7265j1.setVisibility(8);
                    return;
                } else {
                    mbVar.getClass();
                    return;
                }
            case 7:
                k3 k3Var = (k3) obj;
                i3 i3Var = k3Var.f9383y;
                b3 b3Var = k3Var.f9381x;
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
                String str = e2.m0.f8372a;
                i2.h0 h0Var = ((i2.b0) ((k2.u) ((qf.b) obj).f43356c)).f10925a;
                if (h0Var.f10986d0 != z10) {
                    h0Var.f10986d0 = z10;
                    h0Var.f11001m.e(23, new i2.x(1, z10));
                    return;
                }
                return;
            case 10:
                li.l lVar = (li.l) obj;
                lVar.P = z10;
                lVar.Q = lVar.F();
                lVar.R = 0;
                lVar.S = 0;
                lVar.f14851j.b("torch requested: enabled=" + z10 + ", available=" + lVar.F() + ", cameraId=" + lVar.f14864o + ", facing=" + lVar.G);
                lVar.g();
                return;
            case 11:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                return;
            case 12:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                return;
            case 13:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                return;
            case 14:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                return;
            case 15:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                return;
            case 16:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                return;
            case 17:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                return;
            case 18:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                return;
            case 19:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                return;
            case 20:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                return;
            case 21:
                Context context = (Context) obj;
                if (z10) {
                    i10 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i10 = R.string.MonetizationInfoTONLink;
                }
                pf.d.s(context, LocaleController.getString(i10));
                return;
            case 22:
                kz0 kz0Var = ((vm) obj).f41032c.f35912d1;
                if (kz0Var != null && z10) {
                    kz0Var.setVisibility(8);
                    return;
                }
                return;
            case 23:
                zo zoVar = (zo) obj;
                zoVar.f42685x0.autotranslation = z10;
                zoVar.getMessagesController().putChat(zoVar.f42685x0, false);
                return;
            case 24:
                zp zpVar = (zp) obj;
                xp xpVar = zpVar.h;
                if (xpVar != null && xpVar.d != null && !zpVar.isDismissed()) {
                    zpVar.D(z10, true);
                    if (zpVar.M != null) {
                        zpVar.P = true;
                        if (!zpVar.x()) {
                            wallPaper = zpVar.f31951n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        b4 b4Var = zpVar.M.f31668a;
                        if (b4Var.f19642a) {
                            zpVar.f31951n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            zpVar.f31951n.i(b4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (xpVar.d != null) {
                        while (i12 < xpVar.d.size()) {
                            ((yp) xpVar.d.get(i12)).f31670c = z10 ? 1 : 0;
                            i12++;
                        }
                        xpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ow owVar = (ow) obj;
                if (!z10) {
                    owVar.E.setVisibility(8);
                    return;
                }
                return;
            case 26:
                o10 o10Var = (o10) obj;
                o10Var.S(o10Var.f27791y0, z10);
                return;
            case 27:
                o40 o40Var = (o40) obj;
                if (!z10) {
                    o40Var.f27834r.setVisibility(8);
                    return;
                } else {
                    o40Var.getClass();
                    return;
                }
            case 28:
                p60 p60Var = ((i60) obj).H0;
                if (!p60Var.f28181l0) {
                    try {
                        p60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(p60Var.f28182n.getParentActivity());
                    if (z10) {
                        j10 = p60Var.f28179k0;
                    } else {
                        j10 = 0;
                    }
                    p60Var.f28175i0 = j10;
                    p60Var.f28173h0 = System.currentTimeMillis();
                    p60Var.f28177j0 = true;
                    p60Var.v();
                    p60Var.invalidate();
                    NotificationCenter.getInstance(p60Var.f28168f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(p60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            default:
                cb0 cb0Var = (cb0) obj;
                if (z10) {
                    cb0Var.G.setVisibility(8);
                    return;
                } else {
                    cb0Var.getClass();
                    return;
                }
        }
    }
}
