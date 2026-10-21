package ah;

import ai.a2;
import ai.i5;
import ai.l7;
import android.content.Context;
import android.media.AudioManager;
import ei.c4;
import ei.d4;
import ei.f6;
import ei.m3;
import ei.t7;
import ei.xa;
import gi.b3;
import gi.d3;
import gi.v2;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.wp;
import org.telegram.ui.hm;
import org.telegram.ui.io;
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
        int i11;
        int i12 = this.f865a;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        int i13 = 0;
        boolean z10 = this.f866b;
        Object obj = this.f867c;
        switch (i12) {
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
                a2 a2Var = (a2) obj;
                if (!z10) {
                    a2Var.f940q0.setVisibility(8);
                    return;
                } else {
                    a2Var.getClass();
                    return;
                }
            case 2:
                l7 l7Var = (l7) obj;
                l7Var.getClass();
                if (z10) {
                    i10 = R.string.Gift2ActionWearDone;
                } else {
                    i10 = R.string.Gift2ActionWearOffDone;
                }
                l7Var.S2(l7Var.f1737j1, AndroidUtilities.replaceTags(LocaleController.formatString(i10, l7Var.X1())), true);
                return;
            case 3:
                l7 l7Var2 = ((i5) obj).T;
                TL_stars.SavedStarGift c22 = l7Var2.c2(z10);
                if (c22 != null) {
                    l7Var2.f1727e1 = true;
                    l7Var2.M2(c22, l7Var2.G0);
                } else {
                    TL_stars.TL_starGiftUnique d22 = l7Var2.d2(z10);
                    if (d22 != null) {
                        l7Var2.f1727e1 = true;
                        l7Var2.K2(d22.slug, d22, l7Var2.G0);
                    }
                }
                l7Var2.U0 = -1;
                qc qcVar = qc.f29524w;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    return;
                }
                return;
            case 4:
                di.r rVar = (di.r) obj;
                js0 js0Var = rVar.W;
                if (z10) {
                    new di.u(js0Var.f8068a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ai.r0(js0Var, 10)).show();
                    return;
                } else {
                    js0Var.b(rVar.f8054a.E);
                    return;
                }
            case 5:
                m3 m3Var = (m3) obj;
                if (!z10) {
                    m3Var.I.setVisibility(8);
                    return;
                } else {
                    m3Var.getClass();
                    return;
                }
            case 6:
                c4 c4Var = ((d4) obj).f8884b;
                if (!z10) {
                    i13 = 8;
                }
                c4Var.setVisibility(i13);
                return;
            case 7:
                f6 f6Var = (f6) obj;
                if (!z10) {
                    f6Var.X0.setVisibility(8);
                    return;
                } else {
                    f6Var.getClass();
                    return;
                }
            case 8:
                t7 t7Var = (t7) obj;
                if (!z10) {
                    t7Var.setVisibility(8);
                    return;
                } else {
                    t7Var.getClass();
                    return;
                }
            case 9:
                xa xaVar = (xa) obj;
                if (!z10) {
                    xaVar.A2.f9978j1.setVisibility(8);
                    return;
                } else {
                    xaVar.getClass();
                    return;
                }
            case 10:
                d3 d3Var = (d3) obj;
                b3 b3Var = d3Var.f11166y;
                v2 v2Var = d3Var.f11164x;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().animate().cancel();
                    v2Var.getWebView().animate().alpha(0.0f).start();
                }
                b3Var.setLoadProgress(0.0f);
                b3Var.setAlpha(1.0f);
                b3Var.setVisibility(0);
                if (!z10) {
                    user = MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H));
                }
                v2Var.setBotUser(user);
                if (!z10) {
                    v2Var.s(d3Var.G, d3Var.H);
                }
                NotificationCenter.getInstance(v2Var.M).doOnIdle(new org.telegram.ui.web.t(v2Var, 2));
                return;
            case 11:
                ((hi.s0) obj).f(z10, false);
                return;
            case 12:
                String str = e2.m0.f8252a;
                i2.i0 i0Var = ((i2.c0) ((k2.u) ((qf.b) obj).f44448c)).f12325a;
                if (i0Var.f12387d0 != z10) {
                    i0Var.f12387d0 = z10;
                    i0Var.f12402m.e(23, new i2.y(1, z10));
                    return;
                }
                return;
            case 13:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                return;
            case 14:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                return;
            case 15:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                return;
            case 16:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                return;
            case 17:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                return;
            case 18:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                return;
            case 19:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                return;
            case 20:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                return;
            case 21:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                return;
            case 22:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                return;
            case 23:
                Context context = (Context) obj;
                if (z10) {
                    i11 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i11 = R.string.MonetizationInfoTONLink;
                }
                pf.d.r(context, LocaleController.getString(i11));
                return;
            case 24:
                iz0 iz0Var = ((hm) obj).f37688c.f40653d1;
                if (iz0Var != null && z10) {
                    iz0Var.setVisibility(8);
                    return;
                }
                return;
            case 25:
                io ioVar = (io) obj;
                ioVar.f38064x0.autotranslation = z10;
                ioVar.getMessagesController().putChat(ioVar.f38064x0, false);
                return;
            case 26:
                wp wpVar = (wp) obj;
                up upVar = wpVar.h;
                if (upVar != null && upVar.d != null && !wpVar.isDismissed()) {
                    wpVar.C(z10, true);
                    if (wpVar.M != null) {
                        wpVar.P = true;
                        if (!wpVar.x()) {
                            wallPaper = wpVar.f32215n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        org.telegram.ui.ActionBar.c4 c4Var2 = wpVar.M.f31850a;
                        if (c4Var2.f20723a) {
                            wpVar.f32215n.k(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            wpVar.f32215n.k(c4Var2, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (upVar.d != null) {
                        while (i13 < upVar.d.size()) {
                            ((vp) upVar.d.get(i13)).f31852c = z10 ? 1 : 0;
                            i13++;
                        }
                        upVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                kw kwVar = (kw) obj;
                if (!z10) {
                    kwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 28:
                k10 k10Var = (k10) obj;
                k10Var.S(k10Var.f27718y0, z10);
                return;
            default:
                k40 k40Var = (k40) obj;
                if (!z10) {
                    k40Var.f27743r.setVisibility(8);
                    return;
                } else {
                    k40Var.getClass();
                    return;
                }
        }
    }
}
