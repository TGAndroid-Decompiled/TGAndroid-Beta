package bi;

import ai.y1;
import android.content.Context;
import android.media.AudioManager;
import ci.e8;
import ci.i4;
import ci.j4;
import ci.nb;
import ci.q3;
import ci.q6;
import e2.d0;
import ei.b3;
import ei.i3;
import ei.k3;
import fi.t0;
import i2.c0;
import i2.f0;
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
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.sw;
import org.telegram.ui.Components.t60;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qm;
import org.telegram.ui.uo;
public final class f implements Runnable {
    public final int f3899a;
    public final boolean f3900b;
    public final Object f3901c;

    public f(int i10, Object obj, boolean z10) {
        this.f3899a = i10;
        this.f3901c = obj;
        this.f3900b = z10;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        String str;
        int i11 = this.f3899a;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i12 = 0;
        boolean z10 = this.f3900b;
        Object obj = this.f3901c;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                qs0 qs0Var = uVar.W;
                if (z10) {
                    new y(qs0Var.f3940a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(qs0Var, 4)).show();
                    return;
                } else {
                    qs0Var.b(uVar.f3923a.E);
                    return;
                }
            case 1:
                q3 q3Var = (q3) obj;
                if (!z10) {
                    q3Var.I.setVisibility(8);
                    return;
                } else {
                    q3Var.getClass();
                    return;
                }
            case 2:
                i4 i4Var = ((j4) obj).f5232b;
                if (!z10) {
                    i12 = 8;
                }
                i4Var.setVisibility(i12);
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
                    nbVar.A2.f5490j1.setVisibility(8);
                    return;
                } else {
                    nbVar.getClass();
                    return;
                }
            case 6:
                k3 k3Var = (k3) obj;
                i3 i3Var = k3Var.f9185y;
                b3 b3Var = k3Var.f9183x;
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
            case 7:
                ((t0) obj).f(z10, false);
                return;
            case 8:
                String str2 = d0.f8532a;
                f0 f0Var = ((c0) ((k2.j) ((n4.x) obj).f16613c)).f11620a;
                if (f0Var.f11655a0 != z10) {
                    f0Var.f11655a0 = z10;
                    f0Var.f11676m.e(23, new i2.y(1, z10));
                    return;
                }
                return;
            case 9:
                ki.j jVar = (ki.j) obj;
                jVar.M = z10;
                jVar.N = jVar.x();
                jVar.O = 0;
                jVar.P = 0;
                jVar.f14978j.b("torch requested: enabled=" + z10 + ", available=" + jVar.x() + ", cameraId=" + jVar.f14987o + ", facing=" + jVar.D);
                jVar.c();
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
                of.f.s(context, LocaleController.getString(i10));
                return;
            case 21:
                oz0 oz0Var = ((qm) obj).f41148c.f44741d1;
                if (oz0Var != null && z10) {
                    oz0Var.setVisibility(8);
                    return;
                }
                return;
            case 22:
                uo uoVar = (uo) obj;
                uoVar.f42496x0.autotranslation = z10;
                uoVar.getMessagesController().putChat(uoVar.f42496x0, false);
                return;
            case 23:
                cq cqVar = (cq) obj;
                aq aqVar = cqVar.h;
                if (aqVar != null && aqVar.d != null && !cqVar.isDismissed()) {
                    cqVar.D(z10, true);
                    if (cqVar.M != null) {
                        cqVar.P = true;
                        if (!cqVar.x()) {
                            wallPaper = cqVar.f25473n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        c4 c4Var = cqVar.M.f25082a;
                        if (c4Var.f20505a) {
                            cqVar.f25473n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            cqVar.f25473n.i(c4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (aqVar.d != null) {
                        while (i12 < aqVar.d.size()) {
                            ((bq) aqVar.d.get(i12)).f25084c = z10 ? 1 : 0;
                            i12++;
                        }
                        aqVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                sw swVar = (sw) obj;
                if (!z10) {
                    swVar.E.setVisibility(8);
                    return;
                }
                return;
            case 25:
                s10 s10Var = (s10) obj;
                s10Var.S(s10Var.f30593y0, z10);
                return;
            case 26:
                s40 s40Var = (s40) obj;
                if (!z10) {
                    s40Var.f30633r.setVisibility(8);
                    return;
                } else {
                    s40Var.getClass();
                    return;
                }
            case 27:
                t60 t60Var = ((l60) obj).H0;
                if (!t60Var.f31025l0) {
                    try {
                        t60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(t60Var.f31026n.getParentActivity());
                    if (z10) {
                        j3 = t60Var.f31023k0;
                    } else {
                        j3 = 0;
                    }
                    t60Var.f31019i0 = j3;
                    t60Var.f31017h0 = System.currentTimeMillis();
                    t60Var.f31021j0 = true;
                    t60Var.v();
                    t60Var.invalidate();
                    NotificationCenter.getInstance(t60Var.f31012f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(t60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 28:
                db0 db0Var = (db0) obj;
                if (z10) {
                    db0Var.G.setVisibility(8);
                    return;
                } else {
                    db0Var.getClass();
                    return;
                }
            default:
                n2 n2Var = ((bo0) obj).G;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
        }
    }
}
