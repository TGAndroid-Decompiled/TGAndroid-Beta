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
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.ls0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.up;
import org.telegram.ui.im;
import org.telegram.ui.ko;
public final class t implements Runnable {
    public final int f866a;
    public final boolean f867b;
    public final Object f868c;

    public t(int i10, Object obj, boolean z10) {
        this.f866a = i10;
        this.f868c = obj;
        this.f867b = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        j6 u10;
        int i12 = this.f866a;
        TLRPC.User user = null;
        TLRPC.WallPaper wallPaper = null;
        boolean z10 = true;
        int i13 = 0;
        boolean z11 = this.f867b;
        Object obj = this.f868c;
        switch (i12) {
            case 0:
                u uVar = (u) obj;
                if (z11) {
                    ((a0) uVar.f891x.f896c).f646w.setVisibility(4);
                    return;
                } else {
                    uVar.getClass();
                    return;
                }
            case 1:
                a2 a2Var = (a2) obj;
                if (!z11) {
                    a2Var.f941q0.setVisibility(8);
                    return;
                } else {
                    a2Var.getClass();
                    return;
                }
            case 2:
                l7 l7Var = (l7) obj;
                l7Var.getClass();
                if (z11) {
                    i10 = R.string.Gift2ActionWearDone;
                } else {
                    i10 = R.string.Gift2ActionWearOffDone;
                }
                l7Var.R2(l7Var.f1729j1, AndroidUtilities.replaceTags(LocaleController.formatString(i10, l7Var.W1())), true);
                return;
            case 3:
                l7 l7Var2 = ((i5) obj).T;
                TL_stars.SavedStarGift b22 = l7Var2.b2(z11);
                if (b22 != null) {
                    l7Var2.f1719e1 = true;
                    l7Var2.L2(b22, l7Var2.G0);
                } else {
                    TL_stars.TL_starGiftUnique c22 = l7Var2.c2(z11);
                    if (c22 != null) {
                        l7Var2.f1719e1 = true;
                        l7Var2.J2(c22.slug, c22, l7Var2.G0);
                    }
                }
                l7Var2.U0 = -1;
                oc ocVar = oc.f29196w;
                if (ocVar != null) {
                    ocVar.c(0L, false);
                    return;
                }
                return;
            case 4:
                di.r rVar = (di.r) obj;
                ls0 ls0Var = rVar.W;
                if (z11) {
                    new di.u(ls0Var.f8075a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ai.r0(ls0Var, 10)).show();
                    return;
                } else {
                    ls0Var.b(rVar.f8061a.E);
                    return;
                }
            case 5:
                m3 m3Var = (m3) obj;
                if (!z11) {
                    m3Var.I.setVisibility(8);
                    return;
                } else {
                    m3Var.getClass();
                    return;
                }
            case 6:
                c4 c4Var = ((d4) obj).f8896b;
                if (!z11) {
                    i13 = 8;
                }
                c4Var.setVisibility(i13);
                return;
            case 7:
                f6 f6Var = (f6) obj;
                if (!z11) {
                    f6Var.X0.setVisibility(8);
                    return;
                } else {
                    f6Var.getClass();
                    return;
                }
            case 8:
                t7 t7Var = (t7) obj;
                if (!z11) {
                    t7Var.setVisibility(8);
                    return;
                } else {
                    t7Var.getClass();
                    return;
                }
            case 9:
                xa xaVar = (xa) obj;
                if (!z11) {
                    xaVar.A2.f9995j1.setVisibility(8);
                    return;
                } else {
                    xaVar.getClass();
                    return;
                }
            case 10:
                d3 d3Var = (d3) obj;
                b3 b3Var = d3Var.E;
                v2 v2Var = d3Var.f11188y;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().animate().cancel();
                    v2Var.getWebView().animate().alpha(0.0f).start();
                }
                b3Var.setLoadProgress(0.0f);
                b3Var.setAlpha(1.0f);
                b3Var.setVisibility(0);
                if (!z11) {
                    user = MessagesController.getInstance(d3Var.H).getUser(Long.valueOf(d3Var.I));
                }
                v2Var.setBotUser(user);
                if (!z11) {
                    v2Var.s(d3Var.H, d3Var.I);
                }
                NotificationCenter.getInstance(v2Var.M).doOnIdle(new org.telegram.ui.web.t(v2Var, 2));
                return;
            case 11:
                ((hi.s0) obj).f(z11, false);
                return;
            case 12:
                String str = e2.m0.f8259a;
                i2.h0 h0Var = ((i2.b0) ((k2.v) ((qf.b) obj).f44864c)).f12353a;
                if (h0Var.f12416d0 != z11) {
                    h0Var.f12416d0 = z11;
                    h0Var.f12431m.e(23, new i2.x(1, z11));
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
                pf.d.r(context, LocaleController.getString(i11));
                return;
            case 24:
                kz0 kz0Var = ((im) obj).f38328c.f41632p1;
                if (kz0Var != null && z11) {
                    kz0Var.setVisibility(8);
                    return;
                }
                return;
            case 25:
                ko koVar = (ko) obj;
                koVar.f38980w0.autotranslation = z11;
                koVar.getMessagesController().putChat(koVar.f38980w0, false);
                return;
            case 26:
                up upVar = (up) obj;
                sp spVar = upVar.h;
                if (spVar != null && spVar.d != null && !upVar.isDismissed()) {
                    upVar.F(z11, true);
                    if (upVar.L != null) {
                        upVar.O = true;
                        if (!upVar.A()) {
                            wallPaper = upVar.f31188n.f40883g;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        f4 f4Var = upVar.L.f30871a;
                        if (f4Var.f20885a) {
                            upVar.f31188n.q(null, wallPaper2, false, Boolean.valueOf(z11), false);
                        } else {
                            upVar.f31188n.q(f4Var, wallPaper2, false, Boolean.valueOf(z11), false);
                        }
                    }
                    if (AndroidUtilities.isTablet() && (u10 = up.u(z11)) != null && u10 != k6.I) {
                        if (z11 == upVar.f31190s) {
                            z10 = false;
                        }
                        upVar.f31185i0 = z10;
                        upVar.J(u10);
                    }
                    if (spVar.d != null) {
                        while (i13 < spVar.d.size()) {
                            ((tp) spVar.d.get(i13)).f30873c = z11 ? 1 : 0;
                            i13++;
                        }
                        spVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                iw iwVar = (iw) obj;
                if (!z11) {
                    iwVar.E.setVisibility(8);
                    return;
                }
                return;
            case 28:
                i10 i10Var = (i10) obj;
                i10Var.S(i10Var.f27245y0, z11);
                return;
            default:
                i40 i40Var = (i40) obj;
                if (!z11) {
                    i40Var.f27285r.setVisibility(8);
                    return;
                } else {
                    i40Var.getClass();
                    return;
                }
        }
    }
}
