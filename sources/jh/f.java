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
import kf.k0;
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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.pm;
import org.telegram.ui.ro;
public final class f implements Runnable {
    public final int f9410a;
    public final boolean f9411b;
    public final Object f9412c;

    public f(int i10, Object obj, boolean z4) {
        this.f9410a = i10;
        this.f9412c = obj;
        this.f9411b = z4;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z4;
        int i10;
        int i11;
        String str;
        int i12 = this.f9410a;
        i iVar = null;
        TLRPC.WallPaper wallPaper = null;
        iVar = null;
        iVar = null;
        long j10 = 0;
        boolean z10 = this.f9411b;
        Object obj = this.f9412c;
        switch (i12) {
            case 0:
                v vVar = (v) obj;
                ArrayList arrayList = vVar.f9462c;
                boolean isEmpty = TextUtils.isEmpty(vVar.f9476t);
                String str2 = vVar.f9476t;
                vVar.f9478w = true;
                vVar.A = false;
                if (isEmpty && !arrayList.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) k0.i(1, arrayList);
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
                vVar.v = vVar.f9465i.getImporters(vVar.f9466j, str2, tL_chatInviteImporter, vVar.d, new j(vVar, isEmpty, iVar2, str2, z4));
                return;
            case 1:
                int i13 = d0.f6924a;
                f0 f0Var = ((c0) ((l3.q) ((f7.b) obj).f6002c)).f8423a;
                if (f0Var.Z != z10) {
                    f0Var.Z = z10;
                    f0Var.f8538l.e(23, new x(1, z10));
                    return;
                }
                return;
            case 2:
                j1 j1Var = (j1) obj;
                if (!z10) {
                    j1Var.f12632n0.setVisibility(8);
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
                ic icVar = ic.f25664w;
                if (icVar != null) {
                    icVar.c(0L, false);
                    return;
                }
                return;
            case 5:
                mg.o oVar = (mg.o) obj;
                if (z10) {
                    ((mg.s) oVar.f14060x.f213c).f14130w.setVisibility(4);
                    return;
                } else {
                    oVar.getClass();
                    return;
                }
            case 6:
                oh.r rVar = (oh.r) obj;
                nr0 nr0Var = rVar.T;
                if (z10) {
                    new oh.u(nr0Var.f16595a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new h0(nr0Var, 28)).show();
                    return;
                } else {
                    nr0Var.b(rVar.f16581a.E);
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
                ze.d.s(context, LocaleController.getString(i11));
                return;
            case 18:
                qy0 qy0Var = ((pm) obj).f37186c.f40512a1;
                if (qy0Var != null && z10) {
                    qy0Var.setVisibility(8);
                    return;
                }
                return;
            case 19:
                ro roVar = (ro) obj;
                roVar.f37926u0.autotranslation = z10;
                roVar.getMessagesController().putChat(roVar.f37926u0, false);
                return;
            case 20:
                jp jpVar = (jp) obj;
                hp hpVar = jpVar.h;
                if (hpVar != null && hpVar.d != null && !jpVar.isDismissed()) {
                    jpVar.B(z10, true);
                    if (jpVar.J != null) {
                        jpVar.M = true;
                        if (!jpVar.v()) {
                            wallPaper = jpVar.f26014n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        e4 e4Var = jpVar.J.f25749a;
                        if (e4Var.f19638a) {
                            jpVar.f26014n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            jpVar.f26014n.i(e4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (hpVar.d != null) {
                        for (int i14 = 0; i14 < hpVar.d.size(); i14++) {
                            ((ip) hpVar.d.get(i14)).f25751c = z10 ? 1 : 0;
                        }
                        hpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                wv wvVar = (wv) obj;
                if (!z10) {
                    wvVar.B.setVisibility(8);
                    return;
                }
                return;
            case 22:
                d10 d10Var = (d10) obj;
                d10Var.R(d10Var.f24100v0, z10);
                return;
            case 23:
                e40 e40Var = (e40) obj;
                if (!z10) {
                    e40Var.f24463r.setVisibility(8);
                    return;
                } else {
                    e40Var.getClass();
                    return;
                }
            case 24:
                y50 y50Var = ((x50) obj).E0;
                if (!y50Var.f30877d0) {
                    try {
                        y50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(y50Var.f30875c.getParentActivity());
                    if (z10) {
                        j10 = y50Var.f30876c0;
                    }
                    y50Var.f30872a0 = j10;
                    y50Var.W = System.currentTimeMillis();
                    y50Var.f30874b0 = true;
                    y50Var.r();
                    y50Var.invalidate();
                    NotificationCenter.getInstance(y50Var.f30871a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(y50Var.N), Boolean.FALSE);
                    return;
                }
                return;
            case 25:
                ea0 ea0Var = (ea0) obj;
                if (z10) {
                    ea0Var.D.setVisibility(8);
                    return;
                } else {
                    ea0Var.getClass();
                    return;
                }
            case 26:
                p2 p2Var = ((cn0) obj).D;
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
                    yu0Var.f31135j0.setVisibility(8);
                    return;
                } else {
                    yu0Var.getClass();
                    return;
                }
            case 28:
                or0 or0Var = (or0) obj;
                if (!z10) {
                    or0Var.R.f31142n0.setVisibility(0);
                    return;
                } else {
                    or0Var.getClass();
                    return;
                }
            default:
                sr0 sr0Var = (sr0) obj;
                if (!z10) {
                    sr0Var.E.f31142n0.setVisibility(0);
                    return;
                } else {
                    sr0Var.getClass();
                    return;
                }
        }
    }
}
