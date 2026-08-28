package eh;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import d5.f0;
import gh.k5;
import gh.l1;
import gh.q3;
import h3.h0;
import h3.k0;
import j3.r0;
import java.util.ArrayList;
import kh.c4;
import kh.d4;
import kh.g6;
import kh.m3;
import kh.t7;
import kh.ya;
import nh.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
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
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.gm;
import org.telegram.ui.ho;
public final class f implements Runnable {
    public final int f5185a;
    public final boolean f5186b;
    public final Object f5187c;

    public f(int i9, Object obj, boolean z10) {
        this.f5185a = i9;
        this.f5187c = obj;
        this.f5186b = z10;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i9;
        int i10;
        int i11 = this.f5185a;
        i iVar = null;
        TLRPC.WallPaper wallPaper = null;
        iVar = null;
        iVar = null;
        int i12 = 0;
        boolean z11 = this.f5186b;
        Object obj = this.f5187c;
        switch (i11) {
            case 0:
                x xVar = (x) obj;
                ArrayList arrayList = xVar.f5248c;
                boolean isEmpty = TextUtils.isEmpty(xVar.f5263t);
                String str = xVar.f5263t;
                xVar.f5265w = true;
                xVar.A = false;
                if (isEmpty && !arrayList.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) r0.j(1, arrayList);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    iVar = new i(xVar, 1);
                }
                i iVar2 = iVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(iVar2, 300L);
                }
                xVar.v = xVar.f5252i.getImporters(xVar.f5253j, str, tL_chatInviteImporter, xVar.d, new k(xVar, isEmpty, iVar2, str, z10));
                return;
            case 1:
                l1 l1Var = (l1) obj;
                if (!z11) {
                    l1Var.m0.setVisibility(8);
                    return;
                } else {
                    l1Var.getClass();
                    return;
                }
            case 2:
                k5 k5Var = (k5) obj;
                k5Var.getClass();
                if (z11) {
                    i9 = R.string.Gift2ActionWearDone;
                } else {
                    i9 = R.string.Gift2ActionWearOffDone;
                }
                k5Var.o2(k5Var.Y0, AndroidUtilities.replaceTags(LocaleController.formatString(i9, k5Var.C1())), true);
                return;
            case 3:
                k5 k5Var2 = ((q3) obj).P;
                TL_stars.SavedStarGift H1 = k5Var2.H1(z11);
                if (H1 != null) {
                    k5Var2.X0 = true;
                    k5Var2.j2(H1, k5Var2.f8432z0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = k5Var2.I1(z11);
                    if (I1 != null) {
                        k5Var2.X0 = true;
                        k5Var2.h2(I1.slug, I1, k5Var2.f8432z0);
                    }
                }
                k5Var2.N0 = -1;
                gc gcVar = gc.f28729w;
                if (gcVar != null) {
                    gcVar.c(0L, false);
                    return;
                }
                return;
            case 4:
                hg.o oVar = (hg.o) obj;
                if (z11) {
                    ((hg.s) oVar.f10679x.f6809b).f10727w.setVisibility(4);
                    return;
                } else {
                    oVar.getClass();
                    return;
                }
            case 5:
                j3.n nVar = ((j3.m) obj).f13292b;
                int i13 = f0.f4349a;
                k0 k0Var = ((h0) nVar).f9440a;
                if (k0Var.f9533b0 != z11) {
                    k0Var.f9533b0 = z11;
                    k0Var.f9550l.e(23, new h3.t(1, z11));
                    return;
                }
                return;
            case 6:
                jh.q qVar = (jh.q) obj;
                uq0 uq0Var = qVar.S;
                if (z11) {
                    new jh.t(uq0Var.f14378a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new bg.i(uq0Var, 21)).show();
                    return;
                } else {
                    uq0Var.b(qVar.f14363a.E);
                    return;
                }
            case 7:
                m3 m3Var = (m3) obj;
                if (!z11) {
                    m3Var.E.setVisibility(8);
                    return;
                } else {
                    m3Var.getClass();
                    return;
                }
            case 8:
                c4 c4Var = ((d4) obj).f15094b;
                if (!z11) {
                    i12 = 8;
                }
                c4Var.setVisibility(i12);
                return;
            case 9:
                g6 g6Var = (g6) obj;
                if (!z11) {
                    g6Var.T0.setVisibility(8);
                    return;
                } else {
                    g6Var.getClass();
                    return;
                }
            case 10:
                t7 t7Var = (t7) obj;
                if (!z11) {
                    t7Var.setVisibility(8);
                    return;
                } else {
                    t7Var.getClass();
                    return;
                }
            case 11:
                ya yaVar = (ya) obj;
                if (!z11) {
                    yaVar.f16412w2.f16266f1.setVisibility(8);
                    return;
                } else {
                    yaVar.getClass();
                    return;
                }
            case 12:
                ((q0) obj).f(z11, false);
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
                    i10 = R.string.BotMonetizationInfoTONLink;
                } else {
                    i10 = R.string.MonetizationInfoTONLink;
                }
                ve.e.s(context, LocaleController.getString(i10));
                return;
            case 24:
                ux0 ux0Var = ((gm) obj).f38568c.Z0;
                if (ux0Var != null && z11) {
                    ux0Var.setVisibility(8);
                    return;
                }
                return;
            case 25:
                ho hoVar = (ho) obj;
                hoVar.f38861t0.autotranslation = z11;
                hoVar.getMessagesController().putChat(hoVar.f38861t0, false);
                return;
            case 26:
                cp cpVar = (cp) obj;
                ap apVar = cpVar.h;
                if (apVar != null && apVar.d != null && !cpVar.isDismissed()) {
                    cpVar.A(z11, true);
                    if (cpVar.I != null) {
                        cpVar.L = true;
                        if (!cpVar.v()) {
                            wallPaper = cpVar.f27528n.h;
                        }
                        TLRPC.WallPaper wallPaper2 = wallPaper;
                        b4 b4Var = cpVar.I.f27261a;
                        if (b4Var.f22748a) {
                            cpVar.f27528n.i(null, wallPaper2, false, Boolean.valueOf(z11), false);
                        } else {
                            cpVar.f27528n.i(b4Var, wallPaper2, false, Boolean.valueOf(z11), false);
                        }
                    }
                    if (apVar.d != null) {
                        while (i12 < apVar.d.size()) {
                            ((bp) apVar.d.get(i12)).f27263c = z11 ? 1 : 0;
                            i12++;
                        }
                        apVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                nv nvVar = (nv) obj;
                if (!z11) {
                    nvVar.A.setVisibility(8);
                    return;
                }
                return;
            case 28:
                n00 n00Var = (n00) obj;
                n00Var.Q(n00Var.f30977u0, z11);
                return;
            default:
                l30 l30Var = (l30) obj;
                if (!z11) {
                    l30Var.f30314r.setVisibility(8);
                    return;
                } else {
                    l30Var.getClass();
                    return;
                }
        }
    }
}
