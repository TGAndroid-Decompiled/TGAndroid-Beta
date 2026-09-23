package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import ci.e4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ul;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.xm;
import org.telegram.ui.bm;
import org.telegram.ui.jn;
import org.telegram.ui.km;
import org.telegram.ui.ny;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.ry;
import org.telegram.ui.xn;
public final class a0 implements Runnable {
    public final int f10601a;
    public final int f10602b;
    public final int f10603c;
    public final Object d;
    public final Object e;

    public a0(int i10, int i11, String str, String str2) {
        this.f10601a = 1;
        this.f10602b = i10;
        this.d = str;
        this.e = str2;
        this.f10603c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        switch (this.f10601a) {
            case 0:
                f0 f0Var = ((c0) this.d).f10616a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                f0Var.t1(surface);
                f0Var.S = surface;
                f0Var.m1(this.f10602b, this.f10603c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f10602b, (String) this.d, (String) this.e, this.f10603c);
                return;
            case 2:
                ((xn) this.d).didReceivedNotification(this.f10602b, this.f10603c, (Object[]) this.e);
                return;
            case 3:
                bm bmVar = (bm) this.d;
                bmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.e).getMessageObject();
                km kmVar = bmVar.f32143a;
                xn xnVar = kmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == kmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                xnVar.Xa(this.f10602b, id2, true, i10, true, 0, Integer.valueOf(this.f10603c), null, null);
                return;
            case 4:
                t1 t1Var = (t1) this.e;
                xn xnVar2 = ((jn) this.d).f34487a;
                if (xnVar2.A1 != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationInWindow(iArr);
                    e4 e4Var = xnVar2.A1;
                    e4Var.setTranslationY(ul.D(520.0f, iArr[1] - e4Var.getTop(), this.f10602b));
                    xnVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f10603c);
                    xnVar2.A1.u();
                    return;
                }
                return;
            default:
                final py pyVar = (py) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                qy qyVar = pyVar.f36222g;
                ry ryVar = pyVar.h;
                ArrayList arrayList = ryVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    ryVar.W0 = null;
                    qyVar.f36629a.invalidate();
                    int N0 = qyVar.f36631c.N0();
                    if (N0 == this.f10602b - 1) {
                        qyVar.f36631c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (ryVar.getMessagesController().isPromoDialog(dialog.f18087id, false)) {
                        ryVar.getMessagesController().hidePromoDialog();
                        qyVar.f36637x.D();
                        qyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = ryVar.getMessagesController();
                    long j3 = dialog.f18087id;
                    if (ryVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i15 = this.f10603c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        qyVar.f36637x.D();
                        qyVar.q(true);
                    }
                    if (ryVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            qyVar.f36637x.D();
                            if (i15 == 0) {
                                ryVar.A4(true, true);
                                qyVar.q(true);
                                ryVar.o3();
                            } else {
                                qyVar.q(true);
                                if (!SharedConfig.archiveHidden && qyVar.f36631c.L0() == 0) {
                                    ryVar.f36980e2 = true;
                                    ny nyVar = qyVar.f36629a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    nyVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i13 = ((n2) ryVar).currentAccount;
                            ryVar.R1.add(0, (TLRPC.Dialog) ryVar.R3(i13, qyVar.f36635s, ryVar.V2, false).get(0));
                            qyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pyVar.h.A4(false, true);
                                            return;
                                        default:
                                            pyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.c1 K = qyVar.f36629a.K(0);
                            if (K != null) {
                                View view = K.f42627a;
                                if (view instanceof r2) {
                                    r2 r2Var = (r2) view;
                                    if (r2Var.a2.f24588n == 2) {
                                        r2Var.f20639b2 = true;
                                        r2Var.f20644c2 = 0.0f;
                                        h6.f19095u1.T(0.0f, true);
                                        h6.f19095u1.start();
                                        r2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            pyVar.h.A4(false, true);
                                            return;
                                        default:
                                            pyVar.h.A4(false, true);
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
                        UndoView Y3 = ryVar.Y3();
                        if (Y3 != null) {
                            long j10 = dialog.f18087id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j10, i12, null, new xm(pyVar, dialog, i14, 26));
                        }
                    }
                    if (ryVar.V2 != 0 && ryVar.R1.isEmpty()) {
                        qyVar.f36629a.setEmptyView(null);
                        qyVar.f36636w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f10601a = i12;
        this.d = obj;
        this.e = obj2;
        this.f10602b = i10;
        this.f10603c = i11;
    }

    public a0(xn xnVar, int i10, int i11, Object[] objArr) {
        this.f10601a = 2;
        this.d = xnVar;
        this.f10602b = i10;
        this.f10603c = i11;
        this.e = objArr;
    }
}
