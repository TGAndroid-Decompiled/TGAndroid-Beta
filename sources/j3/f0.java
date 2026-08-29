package j3;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import nh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.rm;
import org.telegram.ui.ay;
import org.telegram.ui.dy;
import org.telegram.ui.em;
import org.telegram.ui.ey;
import org.telegram.ui.fn;
import org.telegram.ui.fy;
import org.telegram.ui.tn;
import org.telegram.ui.vl;
public final class f0 implements Runnable {
    public final int f10427a;
    public final int f10428b;
    public final int f10429c;
    public final Object d;
    public final Object f10430e;

    public f0(int i10, int i11, String str, String str2) {
        this.f10427a = 1;
        this.f10428b = i10;
        this.d = str;
        this.f10430e = str2;
        this.f10429c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f9;
        int i13;
        switch (this.f10427a) {
            case 0:
                k0 k0Var = ((h0) this.d).f10477a;
                Surface surface = new Surface((SurfaceTexture) this.f10430e);
                k0Var.g0(surface);
                k0Var.S = surface;
                k0Var.a0(this.f10428b, this.f10429c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f10428b, (String) this.d, (String) this.f10430e, this.f10429c);
                return;
            case 2:
                ((tn) this.d).didReceivedNotification(this.f10428b, this.f10429c, (Object[]) this.f10430e);
                return;
            case 3:
                vl vlVar = (vl) this.d;
                vlVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.v0) this.f10430e).getMessageObject();
                em emVar = vlVar.f43618a;
                tn tnVar = emVar.M;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == emVar.M.H6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                tnVar.Xa(this.f10428b, id2, true, i10, true, 0, Integer.valueOf(this.f10429c), null, null);
                return;
            case 4:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f10430e;
                tn tnVar2 = ((fn) this.d).f38212a;
                if (tnVar2.f43014w1 != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationInWindow(iArr);
                    t3 t3Var = tnVar2.f43014w1;
                    t3Var.setTranslationY(org.telegram.ui.b.C(520.0f, iArr[1] - t3Var.getTop(), this.f10428b));
                    tnVar2.f43014w1.n(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f10429c);
                    tnVar2.f43014w1.v();
                    return;
                }
                return;
            default:
                final dy dyVar = (dy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f10430e;
                ey eyVar = dyVar.f37651g;
                fy fyVar = dyVar.h;
                ArrayList arrayList = fyVar.N1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    fyVar.S0 = null;
                    eyVar.f37921a.invalidate();
                    int N0 = eyVar.f37923c.N0();
                    if (N0 == this.f10428b - 1) {
                        eyVar.f37923c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (fyVar.getMessagesController().isPromoDialog(dialog.f22396id, false)) {
                        fyVar.getMessagesController().hidePromoDialog();
                        eyVar.f37930x.D();
                        eyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = fyVar.getMessagesController();
                    long j10 = dialog.f22396id;
                    if (fyVar.R2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i15 = this.f10429c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        eyVar.f37930x.D();
                        eyVar.q(true);
                    }
                    if (fyVar.R2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            eyVar.f37930x.D();
                            if (i15 == 0) {
                                fyVar.A4(true, true);
                                eyVar.q(true);
                                fyVar.o3();
                            } else {
                                eyVar.q(true);
                                if (!SharedConfig.archiveHidden && eyVar.f37923c.L0() == 0) {
                                    fyVar.a2 = true;
                                    ay ayVar = eyVar.f37921a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f9 = 76.0f;
                                    } else {
                                        f9 = 70.0f;
                                    }
                                    ayVar.v0(0, -AndroidUtilities.dp(f9), null);
                                }
                            }
                            i13 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                            fyVar.N1.add(0, (TLRPC.Dialog) fyVar.R3(i13, eyVar.f37928s, fyVar.R2, false).get(0));
                            eyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            dyVar.h.A4(false, true);
                                            return;
                                        default:
                                            dyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            f2.n1 K = eyVar.f37921a.K(0);
                            if (K != null) {
                                View view = K.f6432a;
                                if (view instanceof org.telegram.ui.Cells.p2) {
                                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                                    if (p2Var.W1.f27962n == 2) {
                                        p2Var.X1 = true;
                                        p2Var.Y1 = 0.0f;
                                        g6.f23360u1.Q(0.0f, true);
                                        g6.f23360u1.start();
                                        p2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            dyVar.h.A4(false, true);
                                            return;
                                        default:
                                            dyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        z10 = (globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden) ? true : true;
                        if (!z10) {
                            globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView Y3 = fyVar.Y3();
                        if (Y3 != null) {
                            long j11 = dialog.f22396id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j11, i12, null, new rm(dyVar, dialog, i14, 26));
                        }
                    }
                    if (fyVar.R2 != 0 && fyVar.N1.isEmpty()) {
                        eyVar.f37921a.setEmptyView(null);
                        eyVar.f37929w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public f0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f10427a = i12;
        this.d = obj;
        this.f10430e = obj2;
        this.f10428b = i10;
        this.f10429c = i11;
    }

    public f0(tn tnVar, int i10, int i11, Object[] objArr) {
        this.f10427a = 2;
        this.d = tnVar;
        this.f10428b = i10;
        this.f10429c = i11;
        this.f10430e = objArr;
    }
}
