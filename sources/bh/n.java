package bh;

import android.content.Context;
import android.media.AudioManager;
import bi.d5;
import bi.h7;
import bi.x1;
import fi.a4;
import fi.b4;
import fi.e6;
import fi.k3;
import fi.p7;
import fi.ta;
import hi.e3;
import hi.m3;
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
import org.telegram.ui.ActionBar.h4;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yp;
import org.telegram.ui.jm;
import org.telegram.ui.mo;
public final class n implements Runnable {
    public final int f4086a;
    public final boolean f4087b;
    public final Object f4088c;

    public n(int i10, Object obj, boolean z10) {
        this.f4086a = i10;
        this.f4088c = obj;
        this.f4087b = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        x6 t10;
        int i12 = this.f4086a;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        boolean z10 = true;
        int i13 = 0;
        boolean z11 = this.f4087b;
        Object obj = this.f4088c;
        switch (i12) {
            case 0:
                o oVar = (o) obj;
                if (z11) {
                    ((u) oVar.f4097x.f4102c).v.setVisibility(4);
                    return;
                } else {
                    oVar.getClass();
                    return;
                }
            case 1:
                x1 x1Var = (x1) obj;
                if (!z11) {
                    x1Var.f5657q0.setVisibility(8);
                    return;
                } else {
                    x1Var.getClass();
                    return;
                }
            case 2:
                h7 h7Var = (h7) obj;
                h7Var.getClass();
                if (z11) {
                    i10 = R.string.Gift2ActionWearDone;
                } else {
                    i10 = R.string.Gift2ActionWearOffDone;
                }
                h7Var.R2(h7Var.f4746j1, AndroidUtilities.replaceTags(LocaleController.formatString(i10, h7Var.W1())), true);
                return;
            case 3:
                h7 h7Var2 = ((d5) obj).V;
                TL_stars.SavedStarGift b22 = h7Var2.b2(z11);
                if (b22 != null) {
                    h7Var2.f4736e1 = true;
                    h7Var2.L2(b22, h7Var2.G0);
                } else {
                    TL_stars.TL_starGiftUnique c22 = h7Var2.c2(z11);
                    if (c22 != null) {
                        h7Var2.f4736e1 = true;
                        h7Var2.J2(c22.slug, c22, h7Var2.G0);
                    }
                }
                h7Var2.U0 = -1;
                qc qcVar = qc.f31882x;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    return;
                }
                return;
            case 4:
                ei.r rVar = (ei.r) obj;
                us0 us0Var = rVar.W;
                if (z11) {
                    new ei.u(us0Var.f10015a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ai.i(us0Var, 14)).show();
                    return;
                } else {
                    us0Var.b(rVar.f10001a.E);
                    return;
                }
            case 5:
                k3 k3Var = (k3) obj;
                if (!z11) {
                    k3Var.I.setVisibility(8);
                    return;
                } else {
                    k3Var.getClass();
                    return;
                }
            case 6:
                a4 a4Var = ((b4) obj).f10549b;
                if (!z11) {
                    i13 = 8;
                }
                a4Var.setVisibility(i13);
                return;
            case 7:
                e6 e6Var = (e6) obj;
                if (!z11) {
                    e6Var.M0.setVisibility(8);
                    return;
                } else {
                    e6Var.getClass();
                    return;
                }
            case 8:
                p7 p7Var = (p7) obj;
                if (!z11) {
                    p7Var.setVisibility(8);
                    return;
                } else {
                    p7Var.getClass();
                    return;
                }
            case 9:
                ta taVar = (ta) obj;
                if (!z11) {
                    taVar.f11725p2.f11636j1.setVisibility(8);
                    return;
                } else {
                    taVar.getClass();
                    return;
                }
            case 10:
                m3 m3Var = (m3) obj;
                hi.k3 k3Var2 = m3Var.E;
                e3 e3Var = m3Var.f13133y;
                if (e3Var.getWebView() != null) {
                    e3Var.getWebView().animate().cancel();
                    e3Var.getWebView().animate().alpha(0.0f).start();
                }
                k3Var2.setLoadProgress(0.0f);
                k3Var2.setAlpha(1.0f);
                k3Var2.setVisibility(0);
                if (!z11) {
                    user = MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I));
                }
                e3Var.setBotUser(user);
                if (!z11) {
                    e3Var.s(m3Var.H, m3Var.I);
                }
                NotificationCenter.getInstance(e3Var.M).doOnIdle(new org.telegram.ui.web.t(e3Var, 2));
                return;
            case 11:
                ((ii.r0) obj).f(z11, false);
                return;
            case 12:
                String str = e2.n0.f9692a;
                i2.j0 j0Var = ((i2.d0) ((k2.v) ((rf.b) obj).f47336c)).f13509a;
                if (j0Var.f13588d0 != z11) {
                    j0Var.f13588d0 = z11;
                    j0Var.f13603m.e(23, new i2.y(1, z11));
                    return;
                }
                return;
            case 13:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z11);
                return;
            case 14:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z11);
                return;
            case 15:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z11);
                return;
            case 16:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z11);
                return;
            case 17:
                ((UserConfig) obj).lambda$saveConfig$0(z11);
                return;
            case 18:
                ((CameraController) obj).lambda$recordVideo$11(z11);
                return;
            case 19:
                ((VideoCapturerDevice) obj).lambda$new$0(z11);
                return;
            case 20:
                ((VoIPService) obj).lambda$startGroupCall$27(z11);
                return;
            case 21:
                ((AudioManager) obj).setSpeakerphoneOn(z11);
                return;
            case 22:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z11);
                return;
            case 23:
                Context context = (Context) obj;
                if (z11) {
                    i11 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i11 = R.string.MonetizationInfoTONLink;
                }
                qf.d.r(context, LocaleController.getString(i11));
                return;
            case 24:
                tz0 tz0Var = ((jm) obj).f40688c.f44370p1;
                if (tz0Var != null && z11) {
                    tz0Var.setVisibility(8);
                    return;
                }
                return;
            case 25:
                mo moVar = (mo) obj;
                moVar.f41626w0.autotranslation = z11;
                moVar.getMessagesController().putChat(moVar.f41626w0, false);
                return;
            case 26:
                yp ypVar = (yp) obj;
                wp wpVar = ypVar.h;
                if (wpVar != null && wpVar.d != null && !ypVar.isDismissed()) {
                    ypVar.G(z11, true);
                    if (ypVar.L != null) {
                        ypVar.O = true;
                        if (!ypVar.A()) {
                            wallPaper = ypVar.f35106n.f43546g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        h4 h4Var = ypVar.L.f34793a;
                        if (h4Var.f22682a) {
                            ypVar.f35106n.q(null, wallPaper2, false, Boolean.valueOf(z11), false);
                        } else {
                            ypVar.f35106n.q(h4Var, wallPaper2, false, Boolean.valueOf(z11), false);
                        }
                    }
                    if (AndroidUtilities.isTablet() && (t10 = yp.t(z11)) != null && t10 != y6.I) {
                        if (z11 == ypVar.f35108s) {
                            z10 = false;
                        }
                        ypVar.f35103i0 = z10;
                        ypVar.J(t10);
                    }
                    if (wpVar.d != null) {
                        while (i13 < wpVar.d.size()) {
                            ((xp) wpVar.d.get(i13)).f34795c = z11 ? 1 : 0;
                            i13++;
                        }
                        wpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                kw kwVar = (kw) obj;
                if (!z11) {
                    kwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 28:
                n10 n10Var = (n10) obj;
                n10Var.S(n10Var.f30823y0, z11);
                return;
            default:
                m40 m40Var = (m40) obj;
                if (!z11) {
                    m40Var.f30382r.setVisibility(8);
                    return;
                } else {
                    m40Var.getClass();
                    return;
                }
        }
    }
}
