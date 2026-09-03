package kh;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import h5.d0;
import j3.c0;
import j3.f0;
import j3.x;
import java.util.ArrayList;
import mh.g5;
import mh.i1;
import mh.o3;
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
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Components.zv;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nm;
import org.telegram.ui.po;
public final class f implements Runnable {
    public final int f11247a;
    public final boolean f11248b;
    public final Object f11249c;

    public f(int i10, Object obj, boolean z4) {
        this.f11247a = i10;
        this.f11249c = obj;
        this.f11248b = z4;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z4;
        int i10;
        int i11;
        String str;
        int i12 = this.f11247a;
        i iVar = null;
        TLRPC.WallPaper wallPaper = null;
        iVar = null;
        iVar = null;
        long j10 = 0;
        int i13 = 0;
        boolean z10 = this.f11248b;
        Object obj = this.f11249c;
        switch (i12) {
            case 0:
                v vVar = (v) obj;
                ArrayList arrayList = vVar.f11306c;
                boolean isEmpty = TextUtils.isEmpty(vVar.f11321t);
                String str2 = vVar.f11321t;
                vVar.f11323w = true;
                vVar.A = false;
                if (isEmpty && !arrayList.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) l.d.i(1, arrayList);
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
                vVar.v = vVar.f11310i.getImporters(vVar.f11311j, str2, tL_chatInviteImporter, vVar.d, new j(vVar, isEmpty, iVar2, str2, z4));
                return;
            case 1:
                int i14 = d0.f7237a;
                f0 f0Var = ((c0) ((l3.q) ((f7.b) obj).f6121c)).f9000a;
                if (f0Var.Z != z10) {
                    f0Var.Z = z10;
                    f0Var.f9123l.e(23, new x(1, z10));
                    return;
                }
                return;
            case 2:
                i1 i1Var = (i1) obj;
                if (!z10) {
                    i1Var.f14214n0.setVisibility(8);
                    return;
                } else {
                    i1Var.getClass();
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
                ic icVar = ic.f27770w;
                if (icVar != null) {
                    icVar.c(0L, false);
                    return;
                }
                return;
            case 5:
                ng.o oVar = (ng.o) obj;
                if (z10) {
                    ((ng.s) oVar.f16143x.f213c).f16217w.setVisibility(4);
                    return;
                } else {
                    oVar.getClass();
                    return;
                }
            case 6:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                return;
            case 7:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                return;
            case 8:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                return;
            case 9:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                return;
            case 10:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                return;
            case 11:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                return;
            case 12:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                return;
            case 13:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                return;
            case 14:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                return;
            case 15:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                return;
            case 16:
                Context context = (Context) obj;
                if (z10) {
                    i11 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i11 = R.string.MonetizationInfoTONLink;
                }
                af.g.s(context, LocaleController.getString(i11));
                return;
            case 17:
                qy0 qy0Var = ((nm) obj).f39403c.f43092a1;
                if (qy0Var != null && z10) {
                    qy0Var.setVisibility(8);
                    return;
                }
                return;
            case 18:
                po poVar = (po) obj;
                poVar.f40083u0.autotranslation = z10;
                poVar.getMessagesController().putChat(poVar.f40083u0, false);
                return;
            case 19:
                mp mpVar = (mp) obj;
                kp kpVar = mpVar.h;
                if (kpVar != null && kpVar.d != null && !mpVar.isDismissed()) {
                    mpVar.B(z10, true);
                    if (mpVar.J != null) {
                        mpVar.M = true;
                        if (!mpVar.v()) {
                            wallPaper = mpVar.f29218n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        f4 f4Var = mpVar.J.f28819a;
                        if (f4Var.f21360a) {
                            mpVar.f29218n.i(null, wallPaper2, false, Boolean.valueOf(z10), false);
                        } else {
                            mpVar.f29218n.i(f4Var, wallPaper2, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (kpVar.d != null) {
                        while (i13 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i13)).f28821c = z10 ? 1 : 0;
                            i13++;
                        }
                        kpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                zv zvVar = (zv) obj;
                if (!z10) {
                    zvVar.B.setVisibility(8);
                    return;
                }
                return;
            case 21:
                d10 d10Var = (d10) obj;
                d10Var.R(d10Var.f26113v0, z10);
                return;
            case 22:
                f40 f40Var = (f40) obj;
                if (!z10) {
                    f40Var.f26766r.setVisibility(8);
                    return;
                } else {
                    f40Var.getClass();
                    return;
                }
            case 23:
                z50 z50Var = ((y50) obj).E0;
                if (!z50Var.f33776d0) {
                    try {
                        z50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(z50Var.f33774c.getParentActivity());
                    if (z10) {
                        j10 = z50Var.f33775c0;
                    }
                    z50Var.f33771a0 = j10;
                    z50Var.W = System.currentTimeMillis();
                    z50Var.f33773b0 = true;
                    z50Var.r();
                    z50Var.invalidate();
                    NotificationCenter.getInstance(z50Var.f33770a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(z50Var.N), Boolean.FALSE);
                    return;
                }
                return;
            case 24:
                fa0 fa0Var = (fa0) obj;
                if (z10) {
                    fa0Var.D.setVisibility(8);
                    return;
                } else {
                    fa0Var.getClass();
                    return;
                }
            case 25:
                p2 p2Var = ((dn0) obj).D;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                p2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 26:
                yu0 yu0Var = (yu0) obj;
                if (!z10) {
                    yu0Var.f33629j0.setVisibility(8);
                    return;
                } else {
                    yu0Var.getClass();
                    return;
                }
            case 27:
                or0 or0Var = (or0) obj;
                if (!z10) {
                    or0Var.R.f33636n0.setVisibility(0);
                    return;
                } else {
                    or0Var.getClass();
                    return;
                }
            case 28:
                sr0 sr0Var = (sr0) obj;
                if (!z10) {
                    sr0Var.E.f33636n0.setVisibility(0);
                    return;
                } else {
                    sr0Var.getClass();
                    return;
                }
            default:
                pv0 pv0Var = (pv0) obj;
                ArrayList arrayList2 = pv0Var.f30218r;
                ov0 ov0Var = pv0Var.f30213n;
                if (ov0Var != null) {
                    ov0Var.G(pv0Var.f30205f, z10);
                }
                while (i13 < arrayList2.size()) {
                    ((ov0) arrayList2.get(i13)).G(pv0Var.f30205f, z10);
                    i13++;
                }
                return;
        }
    }
}
