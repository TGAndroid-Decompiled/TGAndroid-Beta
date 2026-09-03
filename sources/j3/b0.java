package j3;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ey;
import org.telegram.ui.dm;
import org.telegram.ui.lm;
import org.telegram.ui.ln;
import org.telegram.ui.my;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.zn;
import ph.f3;
public final class b0 implements Runnable {
    public final int f8408a;
    public final int f8409b;
    public final int f8410c;
    public final Object d;
    public final Object e;

    public b0(int i10, int i11, String str, String str2) {
        this.f8408a = 1;
        this.f8409b = i10;
        this.d = str;
        this.e = str2;
        this.f8410c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        switch (this.f8408a) {
            case 0:
                f0 f0Var = ((c0) this.d).f8423a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                f0Var.Z(surface);
                f0Var.Q = surface;
                f0Var.T(this.f8409b, this.f8410c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f8409b, (String) this.d, (String) this.e, this.f8410c);
                return;
            case 2:
                ((zn) this.d).didReceivedNotification(this.f8409b, this.f8410c, (Object[]) this.e);
                return;
            case 3:
                dm dmVar = (dm) this.d;
                dmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.v0) this.e).getMessageObject();
                lm lmVar = dmVar.f33499a;
                zn znVar = lmVar.N;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == lmVar.N.I6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                znVar.Xa(this.f8409b, id2, true, i10, true, 0, Integer.valueOf(this.f8410c), null, null);
                return;
            case 4:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                zn znVar2 = ((ln) this.d).f35808a;
                if (znVar2.f40801x1 != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationInWindow(iArr);
                    f3 f3Var = znVar2.f40801x1;
                    f3Var.setTranslationY(org.telegram.ui.b.C(520.0f, iArr[1] - f3Var.getTop(), this.f8409b));
                    znVar2.f40801x1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f8410c);
                    znVar2.f40801x1.u();
                    return;
                }
                return;
            default:
                final oy oyVar = (oy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                py pyVar = oyVar.f36901g;
                qy qyVar = oyVar.h;
                ArrayList arrayList = qyVar.O1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    qyVar.T0 = null;
                    pyVar.f37246a.invalidate();
                    int N0 = pyVar.f37248c.N0();
                    if (N0 == this.f8409b - 1) {
                        pyVar.f37248c.m(N0).requestLayout();
                    }
                    boolean z4 = false;
                    if (qyVar.getMessagesController().isPromoDialog(dialog.f19163id, false)) {
                        qyVar.getMessagesController().hidePromoDialog();
                        pyVar.f37254x.D();
                        pyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = qyVar.getMessagesController();
                    long j10 = dialog.f19163id;
                    if (qyVar.S2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i15 = this.f8410c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        pyVar.f37254x.D();
                        pyVar.q(true);
                    }
                    if (qyVar.S2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            pyVar.f37254x.D();
                            if (i15 == 0) {
                                qyVar.A4(true, true);
                                pyVar.q(true);
                                qyVar.o3();
                            } else {
                                pyVar.q(true);
                                if (!SharedConfig.archiveHidden && pyVar.f37248c.L0() == 0) {
                                    qyVar.f37529b2 = true;
                                    my myVar = pyVar.f37246a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f10 = 76.0f;
                                    } else {
                                        f10 = 70.0f;
                                    }
                                    myVar.v0(0, -AndroidUtilities.dp(f10), null);
                                }
                            }
                            i13 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                            qyVar.O1.add(0, (TLRPC.Dialog) qyVar.R3(i13, pyVar.f37252s, qyVar.S2, false).get(0));
                            pyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            oyVar.h.A4(false, true);
                                            return;
                                        default:
                                            oyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            f2.l1 K = pyVar.f37246a.K(0);
                            if (K != null) {
                                View view = K.f5774a;
                                if (view instanceof org.telegram.ui.Cells.q2) {
                                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                                    if (q2Var.X1.f31291n == 2) {
                                        q2Var.Y1 = true;
                                        q2Var.Z1 = 0.0f;
                                        j6.f20177u1.Q(0.0f, true);
                                        j6.f20177u1.start();
                                        q2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            oyVar.h.A4(false, true);
                                            return;
                                        default:
                                            oyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        z4 = (globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden) ? true : true;
                        if (!z4) {
                            globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView Y3 = qyVar.Y3();
                        if (Y3 != null) {
                            long j11 = dialog.f19163id;
                            if (z4) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j11, i12, null, new ey(oyVar, dialog, i14, 24));
                        }
                    }
                    if (qyVar.S2 != 0 && qyVar.O1.isEmpty()) {
                        pyVar.f37246a.setEmptyView(null);
                        pyVar.f37253w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f8408a = i12;
        this.d = obj;
        this.e = obj2;
        this.f8409b = i10;
        this.f8410c = i11;
    }

    public b0(zn znVar, int i10, int i11, Object[] objArr) {
        this.f8408a = 2;
        this.d = znVar;
        this.f8409b = i10;
        this.f8410c = i11;
        this.e = objArr;
    }
}
