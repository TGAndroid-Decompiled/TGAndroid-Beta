package jh;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import cg.h0;
import h5.d0;
import j3.c0;
import j3.f0;
import j3.x;
import java.util.ArrayList;
import kh.a2;
import lh.g5;
import lh.j1;
import lh.o3;
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
import org.telegram.ui.ActionBar.e4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.xv;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nm;
import org.telegram.ui.po;
public final class f implements Runnable {
    public final int f9429a;
    public final boolean f9430b;
    public final Object f9431c;

    public f(int i10, Object obj, boolean z4) {
        this.f9429a = i10;
        this.f9431c = obj;
        this.f9430b = z4;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z4;
        int i10;
        int i11;
        String str;
        int i12 = this.f9429a;
        i iVar = null;
        TLRPC.WallPaper wallPaper = null;
        iVar = null;
        iVar = null;
        long j10 = 0;
        boolean z10 = this.f9430b;
        Object obj = this.f9431c;
        switch (i12) {
            case 0:
                v vVar = (v) obj;
                ArrayList arrayList = vVar.f9481c;
                boolean isEmpty = TextUtils.isEmpty(vVar.f9495t);
                String str2 = vVar.f9495t;
                vVar.f9497w = true;
                vVar.A = false;
                if (isEmpty && !arrayList.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) a2.i(1, arrayList);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (isEmpty && z4 && z10) {
                    iVar = new i(vVar, 1);
                }
                i iVar2 = iVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(iVar2, 300L);
                }
                vVar.v = vVar.f9484i.getImporters(vVar.f9485j, str2, tL_chatInviteImporter, vVar.d, new j(vVar, isEmpty, iVar2, str2, z4));
                return;
            case 1:
                int i13 = d0.f6937a;
                f0 f0Var = ((c0) ((l3.q) ((f7.b) obj).f6013c)).f8441a;
                if (f0Var.Z != z10) {
                    f0Var.Z = z10;
                    f0Var.f8556l.e(23, new x(1, z10));
                    return;
                }
                return;
            case 2:
                j1 j1Var = (j1) obj;
                if (!z10) {
                    j1Var.f12648n0.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            case 3:
                g5 g5Var = (g5) obj;
                g5Var.getClass();
                if (z10) {
                    i10 = R.string.Gift2ActionWearDone;
                } else {
                    i10 = R.string.Gift2ActionWearOffDone;
                }
                g5Var.o2(g5Var.Z0, AndroidUtilities.replaceTags(LocaleController.formatString(i10, g5Var.C1())), true);
                return;
            case 4:
                g5 g5Var2 = ((o3) obj).Q;
                TL_stars.SavedStarGift H1 = g5Var2.H1(z10);
                if (H1 != null) {
                    g5Var2.Y0 = true;
                    g5Var2.j2(H1, g5Var2.A0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = g5Var2.I1(z10);
                    if (I1 != null) {
                        g5Var2.Y0 = true;
                        g5Var2.h2(I1.slug, I1, g5Var2.A0);
                    }
                }
                g5Var2.O0 = -1;
                ic icVar = ic.f25665w;
                if (icVar != null) {
                    icVar.c(0L, false);
                    return;
                }
                return;
            case 5:
                mg.o oVar = (mg.o) obj;
                if (z10) {
                    ((mg.s) oVar.f14072x.f198c).f14142w.setVisibility(4);
                    return;
                } else {
                    oVar.getClass();
                    return;
                }
            case 6:
                oh.r rVar = (oh.r) obj;
                nr0 nr0Var = rVar.T;
                if (z10) {
                    new oh.u(nr0Var.f16615a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new h0(nr0Var, 28)).show();
                    return;
                } else {
                    nr0Var.b(rVar.f16601a.E);
                    return;
                }
            case 7:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                return;
            case 8:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                return;
            case 9:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                return;
            case 10:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                return;
            case 11:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                return;
            case 12:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                return;
            case 13:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                return;
            case 14:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                return;
            case 15:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                return;
            case 16:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                return;
            case 17:
                Context context = (Context) obj;
                if (z10) {
                    i11 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i11 = R.string.MonetizationInfoTONLink;
                }
                af.g.s(context, LocaleController.getString(i11));
                return;
            case 18:
                qy0 qy0Var = ((nm) obj).f36688c.f39946a1;
                if (qy0Var != null && z10) {
                    qy0Var.setVisibility(8);
                    return;
                }
                return;
            case 19:
                po poVar = (po) obj;
                poVar.f37406u0.autotranslation = z10;
                poVar.getMessagesController().putChat(poVar.f37406u0, false);
                return;
            case 20:
                kp kpVar = (kp) obj;
                ip ipVar = kpVar.h;
                if (ipVar != null && ipVar.d != null && !kpVar.isDismissed()) {
                    kpVar.B(z10, true);
                    if (kpVar.J != null) {
                        kpVar.M = true;
                        if (!kpVar.v()) {
                            wallPaper = kpVar.f26344n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        e4 e4Var = kpVar.J.f26015a;
                        if (e4Var.f19663a) {
                            kpVar.f26344n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            kpVar.f26344n.i(e4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (ipVar.d != null) {
                        for (int i14 = 0; i14 < ipVar.d.size(); i14++) {
                            ((jp) ipVar.d.get(i14)).f26017c = z10 ? 1 : 0;
                        }
                        ipVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                xv xvVar = (xv) obj;
                if (!z10) {
                    xvVar.B.setVisibility(8);
                    return;
                }
                return;
            case 22:
                c10 c10Var = (c10) obj;
                c10Var.R(c10Var.f23802v0, z10);
                return;
            case 23:
                d40 d40Var = (d40) obj;
                if (!z10) {
                    d40Var.f24151r.setVisibility(8);
                    return;
                } else {
                    d40Var.getClass();
                    return;
                }
            case 24:
                x50 x50Var = ((w50) obj).E0;
                if (!x50Var.f30552d0) {
                    try {
                        x50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(x50Var.f30550c.getParentActivity());
                    if (z10) {
                        j10 = x50Var.f30551c0;
                    }
                    x50Var.f30547a0 = j10;
                    x50Var.W = System.currentTimeMillis();
                    x50Var.f30549b0 = true;
                    x50Var.r();
                    x50Var.invalidate();
                    NotificationCenter.getInstance(x50Var.f30546a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(x50Var.N), Boolean.FALSE);
                    return;
                }
                return;
            case 25:
                da0 da0Var = (da0) obj;
                if (z10) {
                    da0Var.D.setVisibility(8);
                    return;
                } else {
                    da0Var.getClass();
                    return;
                }
            case 26:
                p2 p2Var = ((dn0) obj).D;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                p2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 27:
                yu0 yu0Var = (yu0) obj;
                if (!z10) {
                    yu0Var.f31124j0.setVisibility(8);
                    return;
                } else {
                    yu0Var.getClass();
                    return;
                }
            case 28:
                or0 or0Var = (or0) obj;
                if (!z10) {
                    or0Var.R.f31131n0.setVisibility(0);
                    return;
                } else {
                    or0Var.getClass();
                    return;
                }
            default:
                sr0 sr0Var = (sr0) obj;
                if (!z10) {
                    sr0Var.E.f31131n0.setVisibility(0);
                    return;
                } else {
                    sr0Var.getClass();
                    return;
                }
        }
    }
}
