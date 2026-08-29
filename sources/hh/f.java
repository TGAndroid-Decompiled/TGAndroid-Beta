package hh;

import ag.i0;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import f5.d0;
import j3.h0;
import j3.k0;
import j7.l1;
import java.util.ArrayList;
import jh.h5;
import jh.j1;
import jh.p3;
import nh.h7;
import nh.j3;
import nh.ja;
import nh.t5;
import nh.x3;
import nh.y3;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.z30;
import org.telegram.ui.im;
import org.telegram.ui.ko;
public final class f implements Runnable {
    public final int f8063a;
    public final boolean f8064b;
    public final Object f8065c;

    public f(int i10, Object obj, boolean z10) {
        this.f8063a = i10;
        this.f8065c = obj;
        this.f8064b = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i10;
        int i11;
        int i12 = this.f8063a;
        i iVar = null;
        TLRPC.WallPaper wallPaper = null;
        iVar = null;
        iVar = null;
        long j10 = 0;
        int i13 = 0;
        boolean z11 = this.f8064b;
        Object obj = this.f8065c;
        switch (i12) {
            case 0:
                v vVar = (v) obj;
                ArrayList arrayList = vVar.f8122c;
                boolean isEmpty = TextUtils.isEmpty(vVar.f8137t);
                String str = vVar.f8137t;
                vVar.f8139w = true;
                vVar.A = false;
                if (isEmpty && !arrayList.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) l1.i(1, arrayList);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    iVar = new i(vVar, 1);
                }
                i iVar2 = iVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(iVar2, 300L);
                }
                vVar.v = vVar.f8126i.getImporters(vVar.f8127j, str, tL_chatInviteImporter, vVar.d, new j(vVar, isEmpty, iVar2, str, z10));
                return;
            case 1:
                j1 j1Var = (j1) obj;
                if (!z11) {
                    j1Var.m0.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            case 2:
                h5 h5Var = (h5) obj;
                h5Var.getClass();
                if (z11) {
                    i10 = R.string.Gift2ActionWearDone;
                } else {
                    i10 = R.string.Gift2ActionWearOffDone;
                }
                h5Var.o2(h5Var.Y0, AndroidUtilities.replaceTags(LocaleController.formatString(i10, h5Var.C1())), true);
                return;
            case 3:
                h5 h5Var2 = ((p3) obj).P;
                TL_stars.SavedStarGift H1 = h5Var2.H1(z11);
                if (H1 != null) {
                    h5Var2.X0 = true;
                    h5Var2.j2(H1, h5Var2.f12198z0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = h5Var2.I1(z11);
                    if (I1 != null) {
                        h5Var2.X0 = true;
                        h5Var2.h2(I1.slug, I1, h5Var2.f12198z0);
                    }
                }
                h5Var2.N0 = -1;
                mc mcVar = mc.f30644w;
                if (mcVar != null) {
                    mcVar.c(0L, false);
                    return;
                }
                return;
            case 4:
                kg.o oVar = (kg.o) obj;
                if (z11) {
                    ((kg.s) oVar.f13789x.f2147c).f13862w.setVisibility(4);
                    return;
                } else {
                    oVar.getClass();
                    return;
                }
            case 5:
                l3.o oVar2 = ((l3.n) obj).f14151b;
                int i14 = d0.f6579a;
                k0 k0Var = ((h0) oVar2).f10477a;
                if (k0Var.f10570b0 != z11) {
                    k0Var.f10570b0 = z11;
                    k0Var.f10587l.e(23, new j3.t(1, z11));
                    return;
                }
                return;
            case 6:
                mh.r rVar = (mh.r) obj;
                fr0 fr0Var = rVar.S;
                if (z11) {
                    new mh.u(fr0Var.f17056a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new i0(fr0Var, 28)).show();
                    return;
                } else {
                    fr0Var.b(rVar.f17041a.E);
                    return;
                }
            case 7:
                j3 j3Var = (j3) obj;
                if (!z11) {
                    j3Var.E.setVisibility(8);
                    return;
                } else {
                    j3Var.getClass();
                    return;
                }
            case 8:
                x3 x3Var = ((y3) obj).f18862b;
                if (!z11) {
                    i13 = 8;
                }
                x3Var.setVisibility(i13);
                return;
            case 9:
                t5 t5Var = (t5) obj;
                if (!z11) {
                    t5Var.T0.setVisibility(8);
                    return;
                } else {
                    t5Var.getClass();
                    return;
                }
            case 10:
                h7 h7Var = (h7) obj;
                if (!z11) {
                    h7Var.setVisibility(8);
                    return;
                } else {
                    h7Var.getClass();
                    return;
                }
            case 11:
                ja jaVar = (ja) obj;
                if (!z11) {
                    jaVar.f17975w2.f17756f1.setVisibility(8);
                    return;
                } else {
                    jaVar.getClass();
                    return;
                }
            case 12:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z11);
                return;
            case 13:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z11);
                return;
            case 14:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z11);
                return;
            case 15:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z11);
                return;
            case 16:
                ((UserConfig) obj).lambda$saveConfig$0(z11);
                return;
            case 17:
                ((CameraController) obj).lambda$recordVideo$11(z11);
                return;
            case 18:
                ((VideoCapturerDevice) obj).lambda$new$0(z11);
                return;
            case 19:
                ((VoIPService) obj).lambda$startGroupCall$27(z11);
                return;
            case 20:
                ((AudioManager) obj).setSpeakerphoneOn(z11);
                return;
            case 21:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z11);
                return;
            case 22:
                Context context = (Context) obj;
                if (z11) {
                    i11 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i11 = R.string.MonetizationInfoTONLink;
                }
                ye.d.s(context, LocaleController.getString(i11));
                return;
            case 23:
                fy0 fy0Var = ((im) obj).f39293c.Z0;
                if (fy0Var != null && z11) {
                    fy0Var.setVisibility(8);
                    return;
                }
                return;
            case 24:
                ko koVar = (ko) obj;
                koVar.f39964t0.autotranslation = z11;
                koVar.getMessagesController().putChat(koVar.f39964t0, false);
                return;
            case 25:
                gp gpVar = (gp) obj;
                ep epVar = gpVar.h;
                if (epVar != null && epVar.d != null && !gpVar.isDismissed()) {
                    gpVar.B(z11, true);
                    if (gpVar.I != null) {
                        gpVar.L = true;
                        if (!gpVar.v()) {
                            wallPaper = gpVar.f28939n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        b4 b4Var = gpVar.I.f28512a;
                        if (b4Var.f22762a) {
                            gpVar.f28939n.i(null, wallPaper2, false, Boolean.valueOf(z11), false);
                        } else {
                            gpVar.f28939n.i(b4Var, wallPaper2, false, Boolean.valueOf(z11), false);
                        }
                    }
                    if (epVar.d != null) {
                        while (i13 < epVar.d.size()) {
                            ((fp) epVar.d.get(i13)).f28514c = z11 ? 1 : 0;
                            i13++;
                        }
                        epVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                tv tvVar = (tv) obj;
                if (!z11) {
                    tvVar.A.setVisibility(8);
                    return;
                }
                return;
            case 27:
                y00 y00Var = (y00) obj;
                y00Var.R(y00Var.f34883u0, z11);
                return;
            case 28:
                z30 z30Var = (z30) obj;
                if (!z11) {
                    z30Var.f35195r.setVisibility(8);
                    return;
                } else {
                    z30Var.getClass();
                    return;
                }
            default:
                s50 s50Var = ((r50) obj).D0;
                if (!s50Var.f32498c0) {
                    try {
                        s50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(s50Var.f32497c.getParentActivity());
                    if (z11) {
                        j10 = s50Var.f32496b0;
                    }
                    s50Var.W = j10;
                    s50Var.V = System.currentTimeMillis();
                    s50Var.f32494a0 = true;
                    s50Var.r();
                    s50Var.invalidate();
                    NotificationCenter.getInstance(s50Var.f32493a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(s50Var.M), Boolean.FALSE);
                    return;
                }
                return;
        }
    }
}
